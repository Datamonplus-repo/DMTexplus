package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprvgenww_impl extends GXDataArea
{
   public tprvgenww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprvgenww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprvgenww_impl.class ));
   }

   public tprvgenww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkPrvPri = UIFactory.getCheckbox(this);
      cmbPrvTip = new HTMLChoice();
      cmbPrvMetTra = new HTMLChoice();
      cmbPrvDivCod = new HTMLChoice();
      chkPrvAct = UIFactory.getCheckbox(this);
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV28TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV29TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV30TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV31TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV34TFPrvDir = httpContext.GetPar( "TFPrvDir") ;
      AV35TFPrvDir_Sel = httpContext.GetPar( "TFPrvDir_Sel") ;
      AV36TFPrvCpo = httpContext.GetPar( "TFPrvCpo") ;
      AV37TFPrvCpo_Sel = httpContext.GetPar( "TFPrvCpo_Sel") ;
      AV38TFPrvPob = httpContext.GetPar( "TFPrvPob") ;
      AV39TFPrvPob_Sel = httpContext.GetPar( "TFPrvPob_Sel") ;
      AV40TFPrvNif = httpContext.GetPar( "TFPrvNif") ;
      AV41TFPrvNif_Sel = httpContext.GetPar( "TFPrvNif_Sel") ;
      AV42TFPrvTlf = httpContext.GetPar( "TFPrvTlf") ;
      AV43TFPrvTlf_Sel = httpContext.GetPar( "TFPrvTlf_Sel") ;
      AV111TFPrvPri_Sel = (byte)(GXutil.lval( httpContext.GetPar( "TFPrvPri_Sel"))) ;
      AV46TFPrvTlx = httpContext.GetPar( "TFPrvTlx") ;
      AV47TFPrvTlx_Sel = httpContext.GetPar( "TFPrvTlx_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV113TFPrvTip_Sels);
      AV50TFFpgCod = httpContext.GetPar( "TFFpgCod") ;
      AV51TFFpgCod_Sel = httpContext.GetPar( "TFFpgCod_Sel") ;
      AV54TFPrvVto = (byte)(GXutil.lval( httpContext.GetPar( "TFPrvVto"))) ;
      AV55TFPrvVto_To = (byte)(GXutil.lval( httpContext.GetPar( "TFPrvVto_To"))) ;
      AV56TFPrvDiaPag = (int)(GXutil.lval( httpContext.GetPar( "TFPrvDiaPag"))) ;
      AV57TFPrvDiaPag_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvDiaPag_To"))) ;
      AV58TFPrvPer = (int)(GXutil.lval( httpContext.GetPar( "TFPrvPer"))) ;
      AV59TFPrvPer_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvPer_To"))) ;
      AV60TFPrvBan = (int)(GXutil.lval( httpContext.GetPar( "TFPrvBan"))) ;
      AV61TFPrvBan_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvBan_To"))) ;
      AV62TFPrvRep = httpContext.GetPar( "TFPrvRep") ;
      AV63TFPrvRep_Sel = httpContext.GetPar( "TFPrvRep_Sel") ;
      AV64TFPrvPlaEnt = (short)(GXutil.lval( httpContext.GetPar( "TFPrvPlaEnt"))) ;
      AV65TFPrvPlaEnt_To = (short)(GXutil.lval( httpContext.GetPar( "TFPrvPlaEnt_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV115TFPrvMetTra_Sels);
      AV68TFPrvCta = httpContext.GetPar( "TFPrvCta") ;
      AV69TFPrvCta_Sel = httpContext.GetPar( "TFPrvCta_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV71TFPrvDivCod_Sels);
      AV72TFPrvDivCo = (byte)(GXutil.lval( httpContext.GetPar( "TFPrvDivCo"))) ;
      AV73TFPrvDivCo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFPrvDivCo_To"))) ;
      AV144TFPrvAct_Sel = httpContext.GetPar( "TFPrvAct_Sel") ;
      AV147Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFPrvNum, AV29TFPrvNum_To, AV30TFPrvNom, AV31TFPrvNom_Sel, AV34TFPrvDir, AV35TFPrvDir_Sel, AV36TFPrvCpo, AV37TFPrvCpo_Sel, AV38TFPrvPob, AV39TFPrvPob_Sel, AV40TFPrvNif, AV41TFPrvNif_Sel, AV42TFPrvTlf, AV43TFPrvTlf_Sel, AV111TFPrvPri_Sel, AV46TFPrvTlx, AV47TFPrvTlx_Sel, AV113TFPrvTip_Sels, AV50TFFpgCod, AV51TFFpgCod_Sel, AV54TFPrvVto, AV55TFPrvVto_To, AV56TFPrvDiaPag, AV57TFPrvDiaPag_To, AV58TFPrvPer, AV59TFPrvPer_To, AV60TFPrvBan, AV61TFPrvBan_To, AV62TFPrvRep, AV63TFPrvRep_Sel, AV64TFPrvPlaEnt, AV65TFPrvPlaEnt_To, AV115TFPrvMetTra_Sels, AV68TFPrvCta, AV69TFPrvCta_Sel, AV71TFPrvDivCod_Sels, AV72TFPrvDivCo, AV73TFPrvDivCo_To, AV144TFPrvAct_Sel, AV147Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      paGP2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startGP2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tprvgenww", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPRVGENWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV147Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tprvgenww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV78GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV79GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV76DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV76DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV28TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV29TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNOM", GXutil.rtrim( AV30TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNOM_SEL", GXutil.rtrim( AV31TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDIR", GXutil.rtrim( AV34TFPrvDir));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDIR_SEL", GXutil.rtrim( AV35TFPrvDir_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVCPO", GXutil.rtrim( AV36TFPrvCpo));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVCPO_SEL", GXutil.rtrim( AV37TFPrvCpo_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVPOB", GXutil.rtrim( AV38TFPrvPob));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVPOB_SEL", GXutil.rtrim( AV39TFPrvPob_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNIF", GXutil.rtrim( AV40TFPrvNif));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNIF_SEL", GXutil.rtrim( AV41TFPrvNif_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVTLF", GXutil.rtrim( AV42TFPrvTlf));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVTLF_SEL", GXutil.rtrim( AV43TFPrvTlf_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVPRI_SEL", GXutil.ltrim( localUtil.ntoc( AV111TFPrvPri_Sel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVTLX", GXutil.rtrim( AV46TFPrvTlx));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVTLX_SEL", GXutil.rtrim( AV47TFPrvTlx_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRVTIP_SELS", AV113TFPrvTip_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRVTIP_SELS", AV113TFPrvTip_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFPGCOD", GXutil.rtrim( AV50TFFpgCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFPGCOD_SEL", GXutil.rtrim( AV51TFFpgCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVVTO", GXutil.ltrim( localUtil.ntoc( AV54TFPrvVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVVTO_TO", GXutil.ltrim( localUtil.ntoc( AV55TFPrvVto_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDIAPAG", GXutil.ltrim( localUtil.ntoc( AV56TFPrvDiaPag, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDIAPAG_TO", GXutil.ltrim( localUtil.ntoc( AV57TFPrvDiaPag_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVPER", GXutil.ltrim( localUtil.ntoc( AV58TFPrvPer, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVPER_TO", GXutil.ltrim( localUtil.ntoc( AV59TFPrvPer_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVBAN", GXutil.ltrim( localUtil.ntoc( AV60TFPrvBan, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVBAN_TO", GXutil.ltrim( localUtil.ntoc( AV61TFPrvBan_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVREP", GXutil.rtrim( AV62TFPrvRep));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVREP_SEL", GXutil.rtrim( AV63TFPrvRep_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVPLAENT", GXutil.ltrim( localUtil.ntoc( AV64TFPrvPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVPLAENT_TO", GXutil.ltrim( localUtil.ntoc( AV65TFPrvPlaEnt_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRVMETTRA_SELS", AV115TFPrvMetTra_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRVMETTRA_SELS", AV115TFPrvMetTra_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVCTA", GXutil.rtrim( AV68TFPrvCta));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVCTA_SEL", GXutil.rtrim( AV69TFPrvCta_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRVDIVCOD_SELS", AV71TFPrvDivCod_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRVDIVCOD_SELS", AV71TFPrvDivCod_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDIVCO", GXutil.ltrim( localUtil.ntoc( AV72TFPrvDivCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDIVCO_TO", GXutil.ltrim( localUtil.ntoc( AV73TFPrvDivCo_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVACT_SEL", GXutil.rtrim( AV144TFPrvAct_Sel));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVTIP_SELSJSON", AV112TFPrvTip_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVMETTRA_SELSJSON", AV114TFPrvMetTra_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDIVCOD_SELSJSON", AV70TFPrvDivCod_SelsJson);
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
         weGP2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtGP2( ) ;
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
      return formatLink("app.tprvgenww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPRVGENWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Proveedores", "") ;
   }

   public void wbGP0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRVGENWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRVGENWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRVGENWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRVGENWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRVGENWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_GP2( true) ;
      }
      else
      {
         wb_table1_27_GP2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_GP2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV78GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV79GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV147Pgmname), GXutil.rtrim( localUtil.format( AV147Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV76DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV76DDO_TitleSettingsIcons);
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

   public void startGP2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Proveedores", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupGP0( ) ;
   }

   public void wsGP2( )
   {
      startGP2( ) ;
      evtGP2( ) ;
   }

   public void evtGP2( )
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
                           e11GP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12GP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13GP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14GP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15GP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16GP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17GP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18GP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19GP2 ();
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
                           AV143GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143GridActions), 4, 0));
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
                           A786PrvDir = httpContext.cgiGet( edtPrvDir_Internalname) ;
                           n786PrvDir = false ;
                           A782PrvCpo = httpContext.cgiGet( edtPrvCpo_Internalname) ;
                           n782PrvCpo = false ;
                           A799PrvPob = httpContext.cgiGet( edtPrvPob_Internalname) ;
                           n799PrvPob = false ;
                           A793PrvNif = httpContext.cgiGet( edtPrvNif_Internalname) ;
                           n793PrvNif = false ;
                           A803PrvTlf = httpContext.cgiGet( edtPrvTlf_Internalname) ;
                           n803PrvTlf = false ;
                           A800PrvPri = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPrvPri.getInternalname()), "1")==0) ? 1 : 0)) ;
                           n800PrvPri = false ;
                           A804PrvTlx = httpContext.cgiGet( edtPrvTlx_Internalname) ;
                           n804PrvTlx = false ;
                           cmbPrvTip.setName( cmbPrvTip.getInternalname() );
                           cmbPrvTip.setValue( httpContext.cgiGet( cmbPrvTip.getInternalname()) );
                           A802PrvTip = httpContext.cgiGet( cmbPrvTip.getInternalname()) ;
                           n802PrvTip = false ;
                           A497FpgCod = GXutil.upper( httpContext.cgiGet( edtFpgCod_Internalname)) ;
                           n497FpgCod = false ;
                           A805PrvVto = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrvVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n805PrvVto = false ;
                           A785PrvDiaPag = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvDiaPag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n785PrvDiaPag = false ;
                           A797PrvPer = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvPer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n797PrvPer = false ;
                           A780PrvBan = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n780PrvBan = false ;
                           A801PrvRep = httpContext.cgiGet( edtPrvRep_Internalname) ;
                           n801PrvRep = false ;
                           A798PrvPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n798PrvPlaEnt = false ;
                           cmbPrvMetTra.setName( cmbPrvMetTra.getInternalname() );
                           cmbPrvMetTra.setValue( httpContext.cgiGet( cmbPrvMetTra.getInternalname()) );
                           A792PrvMetTra = httpContext.cgiGet( cmbPrvMetTra.getInternalname()) ;
                           n792PrvMetTra = false ;
                           A783PrvCta = httpContext.cgiGet( edtPrvCta_Internalname) ;
                           n783PrvCta = false ;
                           cmbPrvDivCod.setName( cmbPrvDivCod.getInternalname() );
                           cmbPrvDivCod.setValue( httpContext.cgiGet( cmbPrvDivCod.getInternalname()) );
                           A3092PrvDivCod = httpContext.cgiGet( cmbPrvDivCod.getInternalname()) ;
                           n3092PrvDivCod = false ;
                           A3143PrvDivCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrvDivCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14216PrvAct = ((GXutil.strcmp(httpContext.cgiGet( chkPrvAct.getInternalname()), "S")==0) ? "S" : "N") ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20GP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21GP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22GP2 ();
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

   public void weGP2( )
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

   public void paGP2( )
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
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 int AV28TFPrvNum ,
                                 int AV29TFPrvNum_To ,
                                 String AV30TFPrvNom ,
                                 String AV31TFPrvNom_Sel ,
                                 String AV34TFPrvDir ,
                                 String AV35TFPrvDir_Sel ,
                                 String AV36TFPrvCpo ,
                                 String AV37TFPrvCpo_Sel ,
                                 String AV38TFPrvPob ,
                                 String AV39TFPrvPob_Sel ,
                                 String AV40TFPrvNif ,
                                 String AV41TFPrvNif_Sel ,
                                 String AV42TFPrvTlf ,
                                 String AV43TFPrvTlf_Sel ,
                                 byte AV111TFPrvPri_Sel ,
                                 String AV46TFPrvTlx ,
                                 String AV47TFPrvTlx_Sel ,
                                 GXSimpleCollection<String> AV113TFPrvTip_Sels ,
                                 String AV50TFFpgCod ,
                                 String AV51TFFpgCod_Sel ,
                                 byte AV54TFPrvVto ,
                                 byte AV55TFPrvVto_To ,
                                 int AV56TFPrvDiaPag ,
                                 int AV57TFPrvDiaPag_To ,
                                 int AV58TFPrvPer ,
                                 int AV59TFPrvPer_To ,
                                 int AV60TFPrvBan ,
                                 int AV61TFPrvBan_To ,
                                 String AV62TFPrvRep ,
                                 String AV63TFPrvRep_Sel ,
                                 short AV64TFPrvPlaEnt ,
                                 short AV65TFPrvPlaEnt_To ,
                                 GXSimpleCollection<String> AV115TFPrvMetTra_Sels ,
                                 String AV68TFPrvCta ,
                                 String AV69TFPrvCta_Sel ,
                                 GXSimpleCollection<String> AV71TFPrvDivCod_Sels ,
                                 byte AV72TFPrvDivCo ,
                                 byte AV73TFPrvDivCo_To ,
                                 String AV144TFPrvAct_Sel ,
                                 String AV147Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21GP2 ();
      GRID_nCurrentRecord = 0 ;
      rfGP2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TPRVGENWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV147Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tprvgenww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
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
      rfGP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV147Pgmname = "TPRVGENWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV147Pgmname", AV147Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV148Tprvgenwwds_1_filterfulltext = AV15FilterFullText ;
      AV149Tprvgenwwds_2_tfprvnum = AV28TFPrvNum ;
      AV150Tprvgenwwds_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV151Tprvgenwwds_4_tfprvnom = AV30TFPrvNom ;
      AV152Tprvgenwwds_5_tfprvnom_sel = AV31TFPrvNom_Sel ;
      AV153Tprvgenwwds_6_tfprvdir = AV34TFPrvDir ;
      AV154Tprvgenwwds_7_tfprvdir_sel = AV35TFPrvDir_Sel ;
      AV155Tprvgenwwds_8_tfprvcpo = AV36TFPrvCpo ;
      AV156Tprvgenwwds_9_tfprvcpo_sel = AV37TFPrvCpo_Sel ;
      AV157Tprvgenwwds_10_tfprvpob = AV38TFPrvPob ;
      AV158Tprvgenwwds_11_tfprvpob_sel = AV39TFPrvPob_Sel ;
      AV159Tprvgenwwds_12_tfprvnif = AV40TFPrvNif ;
      AV160Tprvgenwwds_13_tfprvnif_sel = AV41TFPrvNif_Sel ;
      AV161Tprvgenwwds_14_tfprvtlf = AV42TFPrvTlf ;
      AV162Tprvgenwwds_15_tfprvtlf_sel = AV43TFPrvTlf_Sel ;
      AV163Tprvgenwwds_16_tfprvpri_sel = AV111TFPrvPri_Sel ;
      AV164Tprvgenwwds_17_tfprvtlx = AV46TFPrvTlx ;
      AV165Tprvgenwwds_18_tfprvtlx_sel = AV47TFPrvTlx_Sel ;
      AV166Tprvgenwwds_19_tfprvtip_sels = AV113TFPrvTip_Sels ;
      AV167Tprvgenwwds_20_tffpgcod = AV50TFFpgCod ;
      AV168Tprvgenwwds_21_tffpgcod_sel = AV51TFFpgCod_Sel ;
      AV169Tprvgenwwds_22_tfprvvto = AV54TFPrvVto ;
      AV170Tprvgenwwds_23_tfprvvto_to = AV55TFPrvVto_To ;
      AV171Tprvgenwwds_24_tfprvdiapag = AV56TFPrvDiaPag ;
      AV172Tprvgenwwds_25_tfprvdiapag_to = AV57TFPrvDiaPag_To ;
      AV173Tprvgenwwds_26_tfprvper = AV58TFPrvPer ;
      AV174Tprvgenwwds_27_tfprvper_to = AV59TFPrvPer_To ;
      AV175Tprvgenwwds_28_tfprvban = AV60TFPrvBan ;
      AV176Tprvgenwwds_29_tfprvban_to = AV61TFPrvBan_To ;
      AV177Tprvgenwwds_30_tfprvrep = AV62TFPrvRep ;
      AV178Tprvgenwwds_31_tfprvrep_sel = AV63TFPrvRep_Sel ;
      AV179Tprvgenwwds_32_tfprvplaent = AV64TFPrvPlaEnt ;
      AV180Tprvgenwwds_33_tfprvplaent_to = AV65TFPrvPlaEnt_To ;
      AV181Tprvgenwwds_34_tfprvmettra_sels = AV115TFPrvMetTra_Sels ;
      AV182Tprvgenwwds_35_tfprvcta = AV68TFPrvCta ;
      AV183Tprvgenwwds_36_tfprvcta_sel = AV69TFPrvCta_Sel ;
      AV184Tprvgenwwds_37_tfprvdivcod_sels = AV71TFPrvDivCod_Sels ;
      AV185Tprvgenwwds_38_tfprvdivco = AV72TFPrvDivCo ;
      AV186Tprvgenwwds_39_tfprvdivco_to = AV73TFPrvDivCo_To ;
      AV187Tprvgenwwds_40_tfprvact_sel = AV144TFPrvAct_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV166Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV181Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV184Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV149Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV150Tprvgenwwds_3_tfprvnum_to) ,
                                           AV152Tprvgenwwds_5_tfprvnom_sel ,
                                           AV151Tprvgenwwds_4_tfprvnom ,
                                           AV154Tprvgenwwds_7_tfprvdir_sel ,
                                           AV153Tprvgenwwds_6_tfprvdir ,
                                           AV156Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV155Tprvgenwwds_8_tfprvcpo ,
                                           AV158Tprvgenwwds_11_tfprvpob_sel ,
                                           AV157Tprvgenwwds_10_tfprvpob ,
                                           AV160Tprvgenwwds_13_tfprvnif_sel ,
                                           AV159Tprvgenwwds_12_tfprvnif ,
                                           AV162Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV161Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV163Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV165Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV164Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV166Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV168Tprvgenwwds_21_tffpgcod_sel ,
                                           AV167Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV169Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV170Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV171Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV172Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV173Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV174Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV175Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV176Tprvgenwwds_29_tfprvban_to) ,
                                           AV178Tprvgenwwds_31_tfprvrep_sel ,
                                           AV177Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV179Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV180Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV181Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV183Tprvgenwwds_36_tfprvcta_sel ,
                                           AV182Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV184Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV185Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV186Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV187Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV148Tprvgenwwds_1_filterfulltext ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV151Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV151Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV153Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV153Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV155Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV155Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV157Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV157Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV159Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV159Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV161Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV161Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV164Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV164Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV167Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV167Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV177Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV177Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV182Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV182Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor H00GP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV149Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV150Tprvgenwwds_3_tfprvnum_to), lV151Tprvgenwwds_4_tfprvnom, AV152Tprvgenwwds_5_tfprvnom_sel, lV153Tprvgenwwds_6_tfprvdir, AV154Tprvgenwwds_7_tfprvdir_sel, lV155Tprvgenwwds_8_tfprvcpo, AV156Tprvgenwwds_9_tfprvcpo_sel, lV157Tprvgenwwds_10_tfprvpob, AV158Tprvgenwwds_11_tfprvpob_sel, lV159Tprvgenwwds_12_tfprvnif, AV160Tprvgenwwds_13_tfprvnif_sel, lV161Tprvgenwwds_14_tfprvtlf, AV162Tprvgenwwds_15_tfprvtlf_sel, lV164Tprvgenwwds_17_tfprvtlx, AV165Tprvgenwwds_18_tfprvtlx_sel, lV167Tprvgenwwds_20_tffpgcod, AV168Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV169Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV170Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV171Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV172Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV173Tprvgenwwds_26_tfprvper), Integer.valueOf(AV174Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV175Tprvgenwwds_28_tfprvban), Integer.valueOf(AV176Tprvgenwwds_29_tfprvban_to), lV177Tprvgenwwds_30_tfprvrep, AV178Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV179Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV180Tprvgenwwds_33_tfprvplaent_to), lV182Tprvgenwwds_35_tfprvcta, AV183Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV185Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV186Tprvgenwwds_39_tfprvdivco_to), AV187Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14216PrvAct = H00GP2_A14216PrvAct[0] ;
         A3143PrvDivCo = H00GP2_A3143PrvDivCo[0] ;
         A3092PrvDivCod = H00GP2_A3092PrvDivCod[0] ;
         n3092PrvDivCod = H00GP2_n3092PrvDivCod[0] ;
         A783PrvCta = H00GP2_A783PrvCta[0] ;
         n783PrvCta = H00GP2_n783PrvCta[0] ;
         A792PrvMetTra = H00GP2_A792PrvMetTra[0] ;
         n792PrvMetTra = H00GP2_n792PrvMetTra[0] ;
         A798PrvPlaEnt = H00GP2_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = H00GP2_n798PrvPlaEnt[0] ;
         A801PrvRep = H00GP2_A801PrvRep[0] ;
         n801PrvRep = H00GP2_n801PrvRep[0] ;
         A780PrvBan = H00GP2_A780PrvBan[0] ;
         n780PrvBan = H00GP2_n780PrvBan[0] ;
         A797PrvPer = H00GP2_A797PrvPer[0] ;
         n797PrvPer = H00GP2_n797PrvPer[0] ;
         A785PrvDiaPag = H00GP2_A785PrvDiaPag[0] ;
         n785PrvDiaPag = H00GP2_n785PrvDiaPag[0] ;
         A805PrvVto = H00GP2_A805PrvVto[0] ;
         n805PrvVto = H00GP2_n805PrvVto[0] ;
         A497FpgCod = H00GP2_A497FpgCod[0] ;
         n497FpgCod = H00GP2_n497FpgCod[0] ;
         A802PrvTip = H00GP2_A802PrvTip[0] ;
         n802PrvTip = H00GP2_n802PrvTip[0] ;
         A804PrvTlx = H00GP2_A804PrvTlx[0] ;
         n804PrvTlx = H00GP2_n804PrvTlx[0] ;
         A800PrvPri = H00GP2_A800PrvPri[0] ;
         n800PrvPri = H00GP2_n800PrvPri[0] ;
         A803PrvTlf = H00GP2_A803PrvTlf[0] ;
         n803PrvTlf = H00GP2_n803PrvTlf[0] ;
         A793PrvNif = H00GP2_A793PrvNif[0] ;
         n793PrvNif = H00GP2_n793PrvNif[0] ;
         A799PrvPob = H00GP2_A799PrvPob[0] ;
         n799PrvPob = H00GP2_n799PrvPob[0] ;
         A782PrvCpo = H00GP2_A782PrvCpo[0] ;
         n782PrvCpo = H00GP2_n782PrvCpo[0] ;
         A786PrvDir = H00GP2_A786PrvDir[0] ;
         n786PrvDir = H00GP2_n786PrvDir[0] ;
         A794PrvNom = H00GP2_A794PrvNom[0] ;
         n794PrvNom = H00GP2_n794PrvNom[0] ;
         A795PrvNum = H00GP2_A795PrvNum[0] ;
         if ( (GXutil.strcmp("", AV148Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "p", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "a", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "su transporte", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nuestro", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "agencia", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "euro", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "peseta", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, "P") == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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

   public void rfGP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e21GP2 ();
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
                                              A802PrvTip ,
                                              AV166Tprvgenwwds_19_tfprvtip_sels ,
                                              A792PrvMetTra ,
                                              AV181Tprvgenwwds_34_tfprvmettra_sels ,
                                              A3092PrvDivCod ,
                                              AV184Tprvgenwwds_37_tfprvdivcod_sels ,
                                              Integer.valueOf(AV149Tprvgenwwds_2_tfprvnum) ,
                                              Integer.valueOf(AV150Tprvgenwwds_3_tfprvnum_to) ,
                                              AV152Tprvgenwwds_5_tfprvnom_sel ,
                                              AV151Tprvgenwwds_4_tfprvnom ,
                                              AV154Tprvgenwwds_7_tfprvdir_sel ,
                                              AV153Tprvgenwwds_6_tfprvdir ,
                                              AV156Tprvgenwwds_9_tfprvcpo_sel ,
                                              AV155Tprvgenwwds_8_tfprvcpo ,
                                              AV158Tprvgenwwds_11_tfprvpob_sel ,
                                              AV157Tprvgenwwds_10_tfprvpob ,
                                              AV160Tprvgenwwds_13_tfprvnif_sel ,
                                              AV159Tprvgenwwds_12_tfprvnif ,
                                              AV162Tprvgenwwds_15_tfprvtlf_sel ,
                                              AV161Tprvgenwwds_14_tfprvtlf ,
                                              Byte.valueOf(AV163Tprvgenwwds_16_tfprvpri_sel) ,
                                              AV165Tprvgenwwds_18_tfprvtlx_sel ,
                                              AV164Tprvgenwwds_17_tfprvtlx ,
                                              Integer.valueOf(AV166Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                              AV168Tprvgenwwds_21_tffpgcod_sel ,
                                              AV167Tprvgenwwds_20_tffpgcod ,
                                              Byte.valueOf(AV169Tprvgenwwds_22_tfprvvto) ,
                                              Byte.valueOf(AV170Tprvgenwwds_23_tfprvvto_to) ,
                                              Integer.valueOf(AV171Tprvgenwwds_24_tfprvdiapag) ,
                                              Integer.valueOf(AV172Tprvgenwwds_25_tfprvdiapag_to) ,
                                              Integer.valueOf(AV173Tprvgenwwds_26_tfprvper) ,
                                              Integer.valueOf(AV174Tprvgenwwds_27_tfprvper_to) ,
                                              Integer.valueOf(AV175Tprvgenwwds_28_tfprvban) ,
                                              Integer.valueOf(AV176Tprvgenwwds_29_tfprvban_to) ,
                                              AV178Tprvgenwwds_31_tfprvrep_sel ,
                                              AV177Tprvgenwwds_30_tfprvrep ,
                                              Short.valueOf(AV179Tprvgenwwds_32_tfprvplaent) ,
                                              Short.valueOf(AV180Tprvgenwwds_33_tfprvplaent_to) ,
                                              Integer.valueOf(AV181Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                              AV183Tprvgenwwds_36_tfprvcta_sel ,
                                              AV182Tprvgenwwds_35_tfprvcta ,
                                              Integer.valueOf(AV184Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                              Byte.valueOf(AV185Tprvgenwwds_38_tfprvdivco) ,
                                              Byte.valueOf(AV186Tprvgenwwds_39_tfprvdivco_to) ,
                                              AV187Tprvgenwwds_40_tfprvact_sel ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              A786PrvDir ,
                                              A782PrvCpo ,
                                              A799PrvPob ,
                                              A793PrvNif ,
                                              A803PrvTlf ,
                                              Byte.valueOf(A800PrvPri) ,
                                              A804PrvTlx ,
                                              A497FpgCod ,
                                              Byte.valueOf(A805PrvVto) ,
                                              Integer.valueOf(A785PrvDiaPag) ,
                                              Integer.valueOf(A797PrvPer) ,
                                              Integer.valueOf(A780PrvBan) ,
                                              A801PrvRep ,
                                              Short.valueOf(A798PrvPlaEnt) ,
                                              A783PrvCta ,
                                              Byte.valueOf(A3143PrvDivCo) ,
                                              A14216PrvAct ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV148Tprvgenwwds_1_filterfulltext ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV151Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV151Tprvgenwwds_4_tfprvnom), 30, "%") ;
         lV153Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV153Tprvgenwwds_6_tfprvdir), 30, "%") ;
         lV155Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV155Tprvgenwwds_8_tfprvcpo), 6, "%") ;
         lV157Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV157Tprvgenwwds_10_tfprvpob), 30, "%") ;
         lV159Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV159Tprvgenwwds_12_tfprvnif), 20, "%") ;
         lV161Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV161Tprvgenwwds_14_tfprvtlf), 18, "%") ;
         lV164Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV164Tprvgenwwds_17_tfprvtlx), 14, "%") ;
         lV167Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV167Tprvgenwwds_20_tffpgcod), 2, "%") ;
         lV177Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV177Tprvgenwwds_30_tfprvrep), 20, "%") ;
         lV182Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV182Tprvgenwwds_35_tfprvcta), 12, "%") ;
         /* Using cursor H00GP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV149Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV150Tprvgenwwds_3_tfprvnum_to), lV151Tprvgenwwds_4_tfprvnom, AV152Tprvgenwwds_5_tfprvnom_sel, lV153Tprvgenwwds_6_tfprvdir, AV154Tprvgenwwds_7_tfprvdir_sel, lV155Tprvgenwwds_8_tfprvcpo, AV156Tprvgenwwds_9_tfprvcpo_sel, lV157Tprvgenwwds_10_tfprvpob, AV158Tprvgenwwds_11_tfprvpob_sel, lV159Tprvgenwwds_12_tfprvnif, AV160Tprvgenwwds_13_tfprvnif_sel, lV161Tprvgenwwds_14_tfprvtlf, AV162Tprvgenwwds_15_tfprvtlf_sel, lV164Tprvgenwwds_17_tfprvtlx, AV165Tprvgenwwds_18_tfprvtlx_sel, lV167Tprvgenwwds_20_tffpgcod, AV168Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV169Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV170Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV171Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV172Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV173Tprvgenwwds_26_tfprvper), Integer.valueOf(AV174Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV175Tprvgenwwds_28_tfprvban), Integer.valueOf(AV176Tprvgenwwds_29_tfprvban_to), lV177Tprvgenwwds_30_tfprvrep, AV178Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV179Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV180Tprvgenwwds_33_tfprvplaent_to), lV182Tprvgenwwds_35_tfprvcta, AV183Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV185Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV186Tprvgenwwds_39_tfprvdivco_to), AV187Tprvgenwwds_40_tfprvact_sel});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14216PrvAct = H00GP3_A14216PrvAct[0] ;
            A3143PrvDivCo = H00GP3_A3143PrvDivCo[0] ;
            A3092PrvDivCod = H00GP3_A3092PrvDivCod[0] ;
            n3092PrvDivCod = H00GP3_n3092PrvDivCod[0] ;
            A783PrvCta = H00GP3_A783PrvCta[0] ;
            n783PrvCta = H00GP3_n783PrvCta[0] ;
            A792PrvMetTra = H00GP3_A792PrvMetTra[0] ;
            n792PrvMetTra = H00GP3_n792PrvMetTra[0] ;
            A798PrvPlaEnt = H00GP3_A798PrvPlaEnt[0] ;
            n798PrvPlaEnt = H00GP3_n798PrvPlaEnt[0] ;
            A801PrvRep = H00GP3_A801PrvRep[0] ;
            n801PrvRep = H00GP3_n801PrvRep[0] ;
            A780PrvBan = H00GP3_A780PrvBan[0] ;
            n780PrvBan = H00GP3_n780PrvBan[0] ;
            A797PrvPer = H00GP3_A797PrvPer[0] ;
            n797PrvPer = H00GP3_n797PrvPer[0] ;
            A785PrvDiaPag = H00GP3_A785PrvDiaPag[0] ;
            n785PrvDiaPag = H00GP3_n785PrvDiaPag[0] ;
            A805PrvVto = H00GP3_A805PrvVto[0] ;
            n805PrvVto = H00GP3_n805PrvVto[0] ;
            A497FpgCod = H00GP3_A497FpgCod[0] ;
            n497FpgCod = H00GP3_n497FpgCod[0] ;
            A802PrvTip = H00GP3_A802PrvTip[0] ;
            n802PrvTip = H00GP3_n802PrvTip[0] ;
            A804PrvTlx = H00GP3_A804PrvTlx[0] ;
            n804PrvTlx = H00GP3_n804PrvTlx[0] ;
            A800PrvPri = H00GP3_A800PrvPri[0] ;
            n800PrvPri = H00GP3_n800PrvPri[0] ;
            A803PrvTlf = H00GP3_A803PrvTlf[0] ;
            n803PrvTlf = H00GP3_n803PrvTlf[0] ;
            A793PrvNif = H00GP3_A793PrvNif[0] ;
            n793PrvNif = H00GP3_n793PrvNif[0] ;
            A799PrvPob = H00GP3_A799PrvPob[0] ;
            n799PrvPob = H00GP3_n799PrvPob[0] ;
            A782PrvCpo = H00GP3_A782PrvCpo[0] ;
            n782PrvCpo = H00GP3_n782PrvCpo[0] ;
            A786PrvDir = H00GP3_A786PrvDir[0] ;
            n786PrvDir = H00GP3_n786PrvDir[0] ;
            A794PrvNom = H00GP3_A794PrvNom[0] ;
            n794PrvNom = H00GP3_n794PrvNom[0] ;
            A795PrvNum = H00GP3_A795PrvNum[0] ;
            if ( (GXutil.strcmp("", AV148Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "p", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "a", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "su transporte", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nuestro", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "agencia", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "euro", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "peseta", "") , GXutil.padr( "%" + GXutil.lower( AV148Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, "P") == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV148Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
            {
               e22GP2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wbGP0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesGP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRVNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")));
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
      AV148Tprvgenwwds_1_filterfulltext = AV15FilterFullText ;
      AV149Tprvgenwwds_2_tfprvnum = AV28TFPrvNum ;
      AV150Tprvgenwwds_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV151Tprvgenwwds_4_tfprvnom = AV30TFPrvNom ;
      AV152Tprvgenwwds_5_tfprvnom_sel = AV31TFPrvNom_Sel ;
      AV153Tprvgenwwds_6_tfprvdir = AV34TFPrvDir ;
      AV154Tprvgenwwds_7_tfprvdir_sel = AV35TFPrvDir_Sel ;
      AV155Tprvgenwwds_8_tfprvcpo = AV36TFPrvCpo ;
      AV156Tprvgenwwds_9_tfprvcpo_sel = AV37TFPrvCpo_Sel ;
      AV157Tprvgenwwds_10_tfprvpob = AV38TFPrvPob ;
      AV158Tprvgenwwds_11_tfprvpob_sel = AV39TFPrvPob_Sel ;
      AV159Tprvgenwwds_12_tfprvnif = AV40TFPrvNif ;
      AV160Tprvgenwwds_13_tfprvnif_sel = AV41TFPrvNif_Sel ;
      AV161Tprvgenwwds_14_tfprvtlf = AV42TFPrvTlf ;
      AV162Tprvgenwwds_15_tfprvtlf_sel = AV43TFPrvTlf_Sel ;
      AV163Tprvgenwwds_16_tfprvpri_sel = AV111TFPrvPri_Sel ;
      AV164Tprvgenwwds_17_tfprvtlx = AV46TFPrvTlx ;
      AV165Tprvgenwwds_18_tfprvtlx_sel = AV47TFPrvTlx_Sel ;
      AV166Tprvgenwwds_19_tfprvtip_sels = AV113TFPrvTip_Sels ;
      AV167Tprvgenwwds_20_tffpgcod = AV50TFFpgCod ;
      AV168Tprvgenwwds_21_tffpgcod_sel = AV51TFFpgCod_Sel ;
      AV169Tprvgenwwds_22_tfprvvto = AV54TFPrvVto ;
      AV170Tprvgenwwds_23_tfprvvto_to = AV55TFPrvVto_To ;
      AV171Tprvgenwwds_24_tfprvdiapag = AV56TFPrvDiaPag ;
      AV172Tprvgenwwds_25_tfprvdiapag_to = AV57TFPrvDiaPag_To ;
      AV173Tprvgenwwds_26_tfprvper = AV58TFPrvPer ;
      AV174Tprvgenwwds_27_tfprvper_to = AV59TFPrvPer_To ;
      AV175Tprvgenwwds_28_tfprvban = AV60TFPrvBan ;
      AV176Tprvgenwwds_29_tfprvban_to = AV61TFPrvBan_To ;
      AV177Tprvgenwwds_30_tfprvrep = AV62TFPrvRep ;
      AV178Tprvgenwwds_31_tfprvrep_sel = AV63TFPrvRep_Sel ;
      AV179Tprvgenwwds_32_tfprvplaent = AV64TFPrvPlaEnt ;
      AV180Tprvgenwwds_33_tfprvplaent_to = AV65TFPrvPlaEnt_To ;
      AV181Tprvgenwwds_34_tfprvmettra_sels = AV115TFPrvMetTra_Sels ;
      AV182Tprvgenwwds_35_tfprvcta = AV68TFPrvCta ;
      AV183Tprvgenwwds_36_tfprvcta_sel = AV69TFPrvCta_Sel ;
      AV184Tprvgenwwds_37_tfprvdivcod_sels = AV71TFPrvDivCod_Sels ;
      AV185Tprvgenwwds_38_tfprvdivco = AV72TFPrvDivCo ;
      AV186Tprvgenwwds_39_tfprvdivco_to = AV73TFPrvDivCo_To ;
      AV187Tprvgenwwds_40_tfprvact_sel = AV144TFPrvAct_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFPrvNum, AV29TFPrvNum_To, AV30TFPrvNom, AV31TFPrvNom_Sel, AV34TFPrvDir, AV35TFPrvDir_Sel, AV36TFPrvCpo, AV37TFPrvCpo_Sel, AV38TFPrvPob, AV39TFPrvPob_Sel, AV40TFPrvNif, AV41TFPrvNif_Sel, AV42TFPrvTlf, AV43TFPrvTlf_Sel, AV111TFPrvPri_Sel, AV46TFPrvTlx, AV47TFPrvTlx_Sel, AV113TFPrvTip_Sels, AV50TFFpgCod, AV51TFFpgCod_Sel, AV54TFPrvVto, AV55TFPrvVto_To, AV56TFPrvDiaPag, AV57TFPrvDiaPag_To, AV58TFPrvPer, AV59TFPrvPer_To, AV60TFPrvBan, AV61TFPrvBan_To, AV62TFPrvRep, AV63TFPrvRep_Sel, AV64TFPrvPlaEnt, AV65TFPrvPlaEnt_To, AV115TFPrvMetTra_Sels, AV68TFPrvCta, AV69TFPrvCta_Sel, AV71TFPrvDivCod_Sels, AV72TFPrvDivCo, AV73TFPrvDivCo_To, AV144TFPrvAct_Sel, AV147Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV148Tprvgenwwds_1_filterfulltext = AV15FilterFullText ;
      AV149Tprvgenwwds_2_tfprvnum = AV28TFPrvNum ;
      AV150Tprvgenwwds_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV151Tprvgenwwds_4_tfprvnom = AV30TFPrvNom ;
      AV152Tprvgenwwds_5_tfprvnom_sel = AV31TFPrvNom_Sel ;
      AV153Tprvgenwwds_6_tfprvdir = AV34TFPrvDir ;
      AV154Tprvgenwwds_7_tfprvdir_sel = AV35TFPrvDir_Sel ;
      AV155Tprvgenwwds_8_tfprvcpo = AV36TFPrvCpo ;
      AV156Tprvgenwwds_9_tfprvcpo_sel = AV37TFPrvCpo_Sel ;
      AV157Tprvgenwwds_10_tfprvpob = AV38TFPrvPob ;
      AV158Tprvgenwwds_11_tfprvpob_sel = AV39TFPrvPob_Sel ;
      AV159Tprvgenwwds_12_tfprvnif = AV40TFPrvNif ;
      AV160Tprvgenwwds_13_tfprvnif_sel = AV41TFPrvNif_Sel ;
      AV161Tprvgenwwds_14_tfprvtlf = AV42TFPrvTlf ;
      AV162Tprvgenwwds_15_tfprvtlf_sel = AV43TFPrvTlf_Sel ;
      AV163Tprvgenwwds_16_tfprvpri_sel = AV111TFPrvPri_Sel ;
      AV164Tprvgenwwds_17_tfprvtlx = AV46TFPrvTlx ;
      AV165Tprvgenwwds_18_tfprvtlx_sel = AV47TFPrvTlx_Sel ;
      AV166Tprvgenwwds_19_tfprvtip_sels = AV113TFPrvTip_Sels ;
      AV167Tprvgenwwds_20_tffpgcod = AV50TFFpgCod ;
      AV168Tprvgenwwds_21_tffpgcod_sel = AV51TFFpgCod_Sel ;
      AV169Tprvgenwwds_22_tfprvvto = AV54TFPrvVto ;
      AV170Tprvgenwwds_23_tfprvvto_to = AV55TFPrvVto_To ;
      AV171Tprvgenwwds_24_tfprvdiapag = AV56TFPrvDiaPag ;
      AV172Tprvgenwwds_25_tfprvdiapag_to = AV57TFPrvDiaPag_To ;
      AV173Tprvgenwwds_26_tfprvper = AV58TFPrvPer ;
      AV174Tprvgenwwds_27_tfprvper_to = AV59TFPrvPer_To ;
      AV175Tprvgenwwds_28_tfprvban = AV60TFPrvBan ;
      AV176Tprvgenwwds_29_tfprvban_to = AV61TFPrvBan_To ;
      AV177Tprvgenwwds_30_tfprvrep = AV62TFPrvRep ;
      AV178Tprvgenwwds_31_tfprvrep_sel = AV63TFPrvRep_Sel ;
      AV179Tprvgenwwds_32_tfprvplaent = AV64TFPrvPlaEnt ;
      AV180Tprvgenwwds_33_tfprvplaent_to = AV65TFPrvPlaEnt_To ;
      AV181Tprvgenwwds_34_tfprvmettra_sels = AV115TFPrvMetTra_Sels ;
      AV182Tprvgenwwds_35_tfprvcta = AV68TFPrvCta ;
      AV183Tprvgenwwds_36_tfprvcta_sel = AV69TFPrvCta_Sel ;
      AV184Tprvgenwwds_37_tfprvdivcod_sels = AV71TFPrvDivCod_Sels ;
      AV185Tprvgenwwds_38_tfprvdivco = AV72TFPrvDivCo ;
      AV186Tprvgenwwds_39_tfprvdivco_to = AV73TFPrvDivCo_To ;
      AV187Tprvgenwwds_40_tfprvact_sel = AV144TFPrvAct_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFPrvNum, AV29TFPrvNum_To, AV30TFPrvNom, AV31TFPrvNom_Sel, AV34TFPrvDir, AV35TFPrvDir_Sel, AV36TFPrvCpo, AV37TFPrvCpo_Sel, AV38TFPrvPob, AV39TFPrvPob_Sel, AV40TFPrvNif, AV41TFPrvNif_Sel, AV42TFPrvTlf, AV43TFPrvTlf_Sel, AV111TFPrvPri_Sel, AV46TFPrvTlx, AV47TFPrvTlx_Sel, AV113TFPrvTip_Sels, AV50TFFpgCod, AV51TFFpgCod_Sel, AV54TFPrvVto, AV55TFPrvVto_To, AV56TFPrvDiaPag, AV57TFPrvDiaPag_To, AV58TFPrvPer, AV59TFPrvPer_To, AV60TFPrvBan, AV61TFPrvBan_To, AV62TFPrvRep, AV63TFPrvRep_Sel, AV64TFPrvPlaEnt, AV65TFPrvPlaEnt_To, AV115TFPrvMetTra_Sels, AV68TFPrvCta, AV69TFPrvCta_Sel, AV71TFPrvDivCod_Sels, AV72TFPrvDivCo, AV73TFPrvDivCo_To, AV144TFPrvAct_Sel, AV147Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV148Tprvgenwwds_1_filterfulltext = AV15FilterFullText ;
      AV149Tprvgenwwds_2_tfprvnum = AV28TFPrvNum ;
      AV150Tprvgenwwds_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV151Tprvgenwwds_4_tfprvnom = AV30TFPrvNom ;
      AV152Tprvgenwwds_5_tfprvnom_sel = AV31TFPrvNom_Sel ;
      AV153Tprvgenwwds_6_tfprvdir = AV34TFPrvDir ;
      AV154Tprvgenwwds_7_tfprvdir_sel = AV35TFPrvDir_Sel ;
      AV155Tprvgenwwds_8_tfprvcpo = AV36TFPrvCpo ;
      AV156Tprvgenwwds_9_tfprvcpo_sel = AV37TFPrvCpo_Sel ;
      AV157Tprvgenwwds_10_tfprvpob = AV38TFPrvPob ;
      AV158Tprvgenwwds_11_tfprvpob_sel = AV39TFPrvPob_Sel ;
      AV159Tprvgenwwds_12_tfprvnif = AV40TFPrvNif ;
      AV160Tprvgenwwds_13_tfprvnif_sel = AV41TFPrvNif_Sel ;
      AV161Tprvgenwwds_14_tfprvtlf = AV42TFPrvTlf ;
      AV162Tprvgenwwds_15_tfprvtlf_sel = AV43TFPrvTlf_Sel ;
      AV163Tprvgenwwds_16_tfprvpri_sel = AV111TFPrvPri_Sel ;
      AV164Tprvgenwwds_17_tfprvtlx = AV46TFPrvTlx ;
      AV165Tprvgenwwds_18_tfprvtlx_sel = AV47TFPrvTlx_Sel ;
      AV166Tprvgenwwds_19_tfprvtip_sels = AV113TFPrvTip_Sels ;
      AV167Tprvgenwwds_20_tffpgcod = AV50TFFpgCod ;
      AV168Tprvgenwwds_21_tffpgcod_sel = AV51TFFpgCod_Sel ;
      AV169Tprvgenwwds_22_tfprvvto = AV54TFPrvVto ;
      AV170Tprvgenwwds_23_tfprvvto_to = AV55TFPrvVto_To ;
      AV171Tprvgenwwds_24_tfprvdiapag = AV56TFPrvDiaPag ;
      AV172Tprvgenwwds_25_tfprvdiapag_to = AV57TFPrvDiaPag_To ;
      AV173Tprvgenwwds_26_tfprvper = AV58TFPrvPer ;
      AV174Tprvgenwwds_27_tfprvper_to = AV59TFPrvPer_To ;
      AV175Tprvgenwwds_28_tfprvban = AV60TFPrvBan ;
      AV176Tprvgenwwds_29_tfprvban_to = AV61TFPrvBan_To ;
      AV177Tprvgenwwds_30_tfprvrep = AV62TFPrvRep ;
      AV178Tprvgenwwds_31_tfprvrep_sel = AV63TFPrvRep_Sel ;
      AV179Tprvgenwwds_32_tfprvplaent = AV64TFPrvPlaEnt ;
      AV180Tprvgenwwds_33_tfprvplaent_to = AV65TFPrvPlaEnt_To ;
      AV181Tprvgenwwds_34_tfprvmettra_sels = AV115TFPrvMetTra_Sels ;
      AV182Tprvgenwwds_35_tfprvcta = AV68TFPrvCta ;
      AV183Tprvgenwwds_36_tfprvcta_sel = AV69TFPrvCta_Sel ;
      AV184Tprvgenwwds_37_tfprvdivcod_sels = AV71TFPrvDivCod_Sels ;
      AV185Tprvgenwwds_38_tfprvdivco = AV72TFPrvDivCo ;
      AV186Tprvgenwwds_39_tfprvdivco_to = AV73TFPrvDivCo_To ;
      AV187Tprvgenwwds_40_tfprvact_sel = AV144TFPrvAct_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFPrvNum, AV29TFPrvNum_To, AV30TFPrvNom, AV31TFPrvNom_Sel, AV34TFPrvDir, AV35TFPrvDir_Sel, AV36TFPrvCpo, AV37TFPrvCpo_Sel, AV38TFPrvPob, AV39TFPrvPob_Sel, AV40TFPrvNif, AV41TFPrvNif_Sel, AV42TFPrvTlf, AV43TFPrvTlf_Sel, AV111TFPrvPri_Sel, AV46TFPrvTlx, AV47TFPrvTlx_Sel, AV113TFPrvTip_Sels, AV50TFFpgCod, AV51TFFpgCod_Sel, AV54TFPrvVto, AV55TFPrvVto_To, AV56TFPrvDiaPag, AV57TFPrvDiaPag_To, AV58TFPrvPer, AV59TFPrvPer_To, AV60TFPrvBan, AV61TFPrvBan_To, AV62TFPrvRep, AV63TFPrvRep_Sel, AV64TFPrvPlaEnt, AV65TFPrvPlaEnt_To, AV115TFPrvMetTra_Sels, AV68TFPrvCta, AV69TFPrvCta_Sel, AV71TFPrvDivCod_Sels, AV72TFPrvDivCo, AV73TFPrvDivCo_To, AV144TFPrvAct_Sel, AV147Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV148Tprvgenwwds_1_filterfulltext = AV15FilterFullText ;
      AV149Tprvgenwwds_2_tfprvnum = AV28TFPrvNum ;
      AV150Tprvgenwwds_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV151Tprvgenwwds_4_tfprvnom = AV30TFPrvNom ;
      AV152Tprvgenwwds_5_tfprvnom_sel = AV31TFPrvNom_Sel ;
      AV153Tprvgenwwds_6_tfprvdir = AV34TFPrvDir ;
      AV154Tprvgenwwds_7_tfprvdir_sel = AV35TFPrvDir_Sel ;
      AV155Tprvgenwwds_8_tfprvcpo = AV36TFPrvCpo ;
      AV156Tprvgenwwds_9_tfprvcpo_sel = AV37TFPrvCpo_Sel ;
      AV157Tprvgenwwds_10_tfprvpob = AV38TFPrvPob ;
      AV158Tprvgenwwds_11_tfprvpob_sel = AV39TFPrvPob_Sel ;
      AV159Tprvgenwwds_12_tfprvnif = AV40TFPrvNif ;
      AV160Tprvgenwwds_13_tfprvnif_sel = AV41TFPrvNif_Sel ;
      AV161Tprvgenwwds_14_tfprvtlf = AV42TFPrvTlf ;
      AV162Tprvgenwwds_15_tfprvtlf_sel = AV43TFPrvTlf_Sel ;
      AV163Tprvgenwwds_16_tfprvpri_sel = AV111TFPrvPri_Sel ;
      AV164Tprvgenwwds_17_tfprvtlx = AV46TFPrvTlx ;
      AV165Tprvgenwwds_18_tfprvtlx_sel = AV47TFPrvTlx_Sel ;
      AV166Tprvgenwwds_19_tfprvtip_sels = AV113TFPrvTip_Sels ;
      AV167Tprvgenwwds_20_tffpgcod = AV50TFFpgCod ;
      AV168Tprvgenwwds_21_tffpgcod_sel = AV51TFFpgCod_Sel ;
      AV169Tprvgenwwds_22_tfprvvto = AV54TFPrvVto ;
      AV170Tprvgenwwds_23_tfprvvto_to = AV55TFPrvVto_To ;
      AV171Tprvgenwwds_24_tfprvdiapag = AV56TFPrvDiaPag ;
      AV172Tprvgenwwds_25_tfprvdiapag_to = AV57TFPrvDiaPag_To ;
      AV173Tprvgenwwds_26_tfprvper = AV58TFPrvPer ;
      AV174Tprvgenwwds_27_tfprvper_to = AV59TFPrvPer_To ;
      AV175Tprvgenwwds_28_tfprvban = AV60TFPrvBan ;
      AV176Tprvgenwwds_29_tfprvban_to = AV61TFPrvBan_To ;
      AV177Tprvgenwwds_30_tfprvrep = AV62TFPrvRep ;
      AV178Tprvgenwwds_31_tfprvrep_sel = AV63TFPrvRep_Sel ;
      AV179Tprvgenwwds_32_tfprvplaent = AV64TFPrvPlaEnt ;
      AV180Tprvgenwwds_33_tfprvplaent_to = AV65TFPrvPlaEnt_To ;
      AV181Tprvgenwwds_34_tfprvmettra_sels = AV115TFPrvMetTra_Sels ;
      AV182Tprvgenwwds_35_tfprvcta = AV68TFPrvCta ;
      AV183Tprvgenwwds_36_tfprvcta_sel = AV69TFPrvCta_Sel ;
      AV184Tprvgenwwds_37_tfprvdivcod_sels = AV71TFPrvDivCod_Sels ;
      AV185Tprvgenwwds_38_tfprvdivco = AV72TFPrvDivCo ;
      AV186Tprvgenwwds_39_tfprvdivco_to = AV73TFPrvDivCo_To ;
      AV187Tprvgenwwds_40_tfprvact_sel = AV144TFPrvAct_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFPrvNum, AV29TFPrvNum_To, AV30TFPrvNom, AV31TFPrvNom_Sel, AV34TFPrvDir, AV35TFPrvDir_Sel, AV36TFPrvCpo, AV37TFPrvCpo_Sel, AV38TFPrvPob, AV39TFPrvPob_Sel, AV40TFPrvNif, AV41TFPrvNif_Sel, AV42TFPrvTlf, AV43TFPrvTlf_Sel, AV111TFPrvPri_Sel, AV46TFPrvTlx, AV47TFPrvTlx_Sel, AV113TFPrvTip_Sels, AV50TFFpgCod, AV51TFFpgCod_Sel, AV54TFPrvVto, AV55TFPrvVto_To, AV56TFPrvDiaPag, AV57TFPrvDiaPag_To, AV58TFPrvPer, AV59TFPrvPer_To, AV60TFPrvBan, AV61TFPrvBan_To, AV62TFPrvRep, AV63TFPrvRep_Sel, AV64TFPrvPlaEnt, AV65TFPrvPlaEnt_To, AV115TFPrvMetTra_Sels, AV68TFPrvCta, AV69TFPrvCta_Sel, AV71TFPrvDivCod_Sels, AV72TFPrvDivCo, AV73TFPrvDivCo_To, AV144TFPrvAct_Sel, AV147Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV148Tprvgenwwds_1_filterfulltext = AV15FilterFullText ;
      AV149Tprvgenwwds_2_tfprvnum = AV28TFPrvNum ;
      AV150Tprvgenwwds_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV151Tprvgenwwds_4_tfprvnom = AV30TFPrvNom ;
      AV152Tprvgenwwds_5_tfprvnom_sel = AV31TFPrvNom_Sel ;
      AV153Tprvgenwwds_6_tfprvdir = AV34TFPrvDir ;
      AV154Tprvgenwwds_7_tfprvdir_sel = AV35TFPrvDir_Sel ;
      AV155Tprvgenwwds_8_tfprvcpo = AV36TFPrvCpo ;
      AV156Tprvgenwwds_9_tfprvcpo_sel = AV37TFPrvCpo_Sel ;
      AV157Tprvgenwwds_10_tfprvpob = AV38TFPrvPob ;
      AV158Tprvgenwwds_11_tfprvpob_sel = AV39TFPrvPob_Sel ;
      AV159Tprvgenwwds_12_tfprvnif = AV40TFPrvNif ;
      AV160Tprvgenwwds_13_tfprvnif_sel = AV41TFPrvNif_Sel ;
      AV161Tprvgenwwds_14_tfprvtlf = AV42TFPrvTlf ;
      AV162Tprvgenwwds_15_tfprvtlf_sel = AV43TFPrvTlf_Sel ;
      AV163Tprvgenwwds_16_tfprvpri_sel = AV111TFPrvPri_Sel ;
      AV164Tprvgenwwds_17_tfprvtlx = AV46TFPrvTlx ;
      AV165Tprvgenwwds_18_tfprvtlx_sel = AV47TFPrvTlx_Sel ;
      AV166Tprvgenwwds_19_tfprvtip_sels = AV113TFPrvTip_Sels ;
      AV167Tprvgenwwds_20_tffpgcod = AV50TFFpgCod ;
      AV168Tprvgenwwds_21_tffpgcod_sel = AV51TFFpgCod_Sel ;
      AV169Tprvgenwwds_22_tfprvvto = AV54TFPrvVto ;
      AV170Tprvgenwwds_23_tfprvvto_to = AV55TFPrvVto_To ;
      AV171Tprvgenwwds_24_tfprvdiapag = AV56TFPrvDiaPag ;
      AV172Tprvgenwwds_25_tfprvdiapag_to = AV57TFPrvDiaPag_To ;
      AV173Tprvgenwwds_26_tfprvper = AV58TFPrvPer ;
      AV174Tprvgenwwds_27_tfprvper_to = AV59TFPrvPer_To ;
      AV175Tprvgenwwds_28_tfprvban = AV60TFPrvBan ;
      AV176Tprvgenwwds_29_tfprvban_to = AV61TFPrvBan_To ;
      AV177Tprvgenwwds_30_tfprvrep = AV62TFPrvRep ;
      AV178Tprvgenwwds_31_tfprvrep_sel = AV63TFPrvRep_Sel ;
      AV179Tprvgenwwds_32_tfprvplaent = AV64TFPrvPlaEnt ;
      AV180Tprvgenwwds_33_tfprvplaent_to = AV65TFPrvPlaEnt_To ;
      AV181Tprvgenwwds_34_tfprvmettra_sels = AV115TFPrvMetTra_Sels ;
      AV182Tprvgenwwds_35_tfprvcta = AV68TFPrvCta ;
      AV183Tprvgenwwds_36_tfprvcta_sel = AV69TFPrvCta_Sel ;
      AV184Tprvgenwwds_37_tfprvdivcod_sels = AV71TFPrvDivCod_Sels ;
      AV185Tprvgenwwds_38_tfprvdivco = AV72TFPrvDivCo ;
      AV186Tprvgenwwds_39_tfprvdivco_to = AV73TFPrvDivCo_To ;
      AV187Tprvgenwwds_40_tfprvact_sel = AV144TFPrvAct_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFPrvNum, AV29TFPrvNum_To, AV30TFPrvNom, AV31TFPrvNom_Sel, AV34TFPrvDir, AV35TFPrvDir_Sel, AV36TFPrvCpo, AV37TFPrvCpo_Sel, AV38TFPrvPob, AV39TFPrvPob_Sel, AV40TFPrvNif, AV41TFPrvNif_Sel, AV42TFPrvTlf, AV43TFPrvTlf_Sel, AV111TFPrvPri_Sel, AV46TFPrvTlx, AV47TFPrvTlx_Sel, AV113TFPrvTip_Sels, AV50TFFpgCod, AV51TFFpgCod_Sel, AV54TFPrvVto, AV55TFPrvVto_To, AV56TFPrvDiaPag, AV57TFPrvDiaPag_To, AV58TFPrvPer, AV59TFPrvPer_To, AV60TFPrvBan, AV61TFPrvBan_To, AV62TFPrvRep, AV63TFPrvRep_Sel, AV64TFPrvPlaEnt, AV65TFPrvPlaEnt_To, AV115TFPrvMetTra_Sels, AV68TFPrvCta, AV69TFPrvCta_Sel, AV71TFPrvDivCod_Sels, AV72TFPrvDivCo, AV73TFPrvDivCo_To, AV144TFPrvAct_Sel, AV147Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV147Pgmname = "TPRVGENWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV147Pgmname", AV147Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupGP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20GP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV76DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV78GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV79GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV147Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV147Pgmname", AV147Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TPRVGENWW");
         AV147Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV147Pgmname", AV147Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV147Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tprvgenww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e20GP2 ();
      if (returnInSub) return;
   }

   public void e20GP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV82Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tprvgenww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV82Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV84EmprNom ;
      GXv_char4[0] = AV85UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV82Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprvgenww_impl.this.A396EmprCod = GXv_char2[0] ;
      tprvgenww_impl.this.AV84EmprNom = GXv_char3[0] ;
      tprvgenww_impl.this.AV85UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXt_char1 = AV82Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tprvgenww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV82Station = GXt_char1 ;
      GXv_char4[0] = AV83EmprCod ;
      GXv_char3[0] = AV84EmprNom ;
      GXv_char2[0] = AV85UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV82Station, GXv_char4, GXv_char3, GXv_char2) ;
      tprvgenww_impl.this.AV83EmprCod = GXv_char4[0] ;
      tprvgenww_impl.this.AV84EmprNom = GXv_char3[0] ;
      tprvgenww_impl.this.AV85UsurCod = GXv_char2[0] ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Proveedores", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV76DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV76DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV82Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tprvgenww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV82Station = GXt_char1 ;
      GXv_char4[0] = AV83EmprCod ;
      GXv_char3[0] = AV84EmprNom ;
      GXv_char2[0] = AV85UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV82Station, GXv_char4, GXv_char3, GXv_char2) ;
      tprvgenww_impl.this.AV83EmprCod = GXv_char4[0] ;
      tprvgenww_impl.this.AV84EmprNom = GXv_char3[0] ;
      tprvgenww_impl.this.AV85UsurCod = GXv_char2[0] ;
   }

   public void e21GP2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("TPRVGENWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("TPRVGENWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvDir_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDir_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDir_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvCpo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCpo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCpo_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvPob_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvPob_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPob_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvNif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNif_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvTlf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvTlf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvTlf_Visible), 5, 0), !bGXsfl_45_Refreshing);
      chkPrvPri.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvPri.getInternalname(), "Visible", GXutil.ltrimstr( chkPrvPri.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvTlx_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvTlx_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvTlx_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbPrvTip.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvTip.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrvTip.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtFpgCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvVto_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvVto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvVto_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvDiaPag_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDiaPag_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDiaPag_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvPer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvPer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPer_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvBan_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvBan_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvBan_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvRep_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvRep_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvRep_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvPlaEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvPlaEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPlaEnt_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbPrvMetTra.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvMetTra.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrvMetTra.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvCta_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCta_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbPrvDivCod.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvDivCod.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrvDivCod.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvDivCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDivCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDivCo_Visible), 5, 0), !bGXsfl_45_Refreshing);
      chkPrvAct.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvAct.getInternalname(), "Visible", GXutil.ltrimstr( chkPrvAct.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      AV78GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78GridCurrentPage), 10, 0));
      AV79GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GridPageCount), 10, 0));
      AV148Tprvgenwwds_1_filterfulltext = AV15FilterFullText ;
      AV149Tprvgenwwds_2_tfprvnum = AV28TFPrvNum ;
      AV150Tprvgenwwds_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV151Tprvgenwwds_4_tfprvnom = AV30TFPrvNom ;
      AV152Tprvgenwwds_5_tfprvnom_sel = AV31TFPrvNom_Sel ;
      AV153Tprvgenwwds_6_tfprvdir = AV34TFPrvDir ;
      AV154Tprvgenwwds_7_tfprvdir_sel = AV35TFPrvDir_Sel ;
      AV155Tprvgenwwds_8_tfprvcpo = AV36TFPrvCpo ;
      AV156Tprvgenwwds_9_tfprvcpo_sel = AV37TFPrvCpo_Sel ;
      AV157Tprvgenwwds_10_tfprvpob = AV38TFPrvPob ;
      AV158Tprvgenwwds_11_tfprvpob_sel = AV39TFPrvPob_Sel ;
      AV159Tprvgenwwds_12_tfprvnif = AV40TFPrvNif ;
      AV160Tprvgenwwds_13_tfprvnif_sel = AV41TFPrvNif_Sel ;
      AV161Tprvgenwwds_14_tfprvtlf = AV42TFPrvTlf ;
      AV162Tprvgenwwds_15_tfprvtlf_sel = AV43TFPrvTlf_Sel ;
      AV163Tprvgenwwds_16_tfprvpri_sel = AV111TFPrvPri_Sel ;
      AV164Tprvgenwwds_17_tfprvtlx = AV46TFPrvTlx ;
      AV165Tprvgenwwds_18_tfprvtlx_sel = AV47TFPrvTlx_Sel ;
      AV166Tprvgenwwds_19_tfprvtip_sels = AV113TFPrvTip_Sels ;
      AV167Tprvgenwwds_20_tffpgcod = AV50TFFpgCod ;
      AV168Tprvgenwwds_21_tffpgcod_sel = AV51TFFpgCod_Sel ;
      AV169Tprvgenwwds_22_tfprvvto = AV54TFPrvVto ;
      AV170Tprvgenwwds_23_tfprvvto_to = AV55TFPrvVto_To ;
      AV171Tprvgenwwds_24_tfprvdiapag = AV56TFPrvDiaPag ;
      AV172Tprvgenwwds_25_tfprvdiapag_to = AV57TFPrvDiaPag_To ;
      AV173Tprvgenwwds_26_tfprvper = AV58TFPrvPer ;
      AV174Tprvgenwwds_27_tfprvper_to = AV59TFPrvPer_To ;
      AV175Tprvgenwwds_28_tfprvban = AV60TFPrvBan ;
      AV176Tprvgenwwds_29_tfprvban_to = AV61TFPrvBan_To ;
      AV177Tprvgenwwds_30_tfprvrep = AV62TFPrvRep ;
      AV178Tprvgenwwds_31_tfprvrep_sel = AV63TFPrvRep_Sel ;
      AV179Tprvgenwwds_32_tfprvplaent = AV64TFPrvPlaEnt ;
      AV180Tprvgenwwds_33_tfprvplaent_to = AV65TFPrvPlaEnt_To ;
      AV181Tprvgenwwds_34_tfprvmettra_sels = AV115TFPrvMetTra_Sels ;
      AV182Tprvgenwwds_35_tfprvcta = AV68TFPrvCta ;
      AV183Tprvgenwwds_36_tfprvcta_sel = AV69TFPrvCta_Sel ;
      AV184Tprvgenwwds_37_tfprvdivcod_sels = AV71TFPrvDivCod_Sels ;
      AV185Tprvgenwwds_38_tfprvdivco = AV72TFPrvDivCo ;
      AV186Tprvgenwwds_39_tfprvdivco_to = AV73TFPrvDivCo_To ;
      AV187Tprvgenwwds_40_tfprvact_sel = AV144TFPrvAct_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12GP2( )
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
         AV77PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV77PageToGo) ;
      }
   }

   public void e13GP2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14GP2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNum") == 0 )
         {
            AV28TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFPrvNum), 6, 0));
            AV29TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV30TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrvNom", AV30TFPrvNom);
            AV31TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrvNom_Sel", AV31TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvDir") == 0 )
         {
            AV34TFPrvDir = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrvDir", AV34TFPrvDir);
            AV35TFPrvDir_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrvDir_Sel", AV35TFPrvDir_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvCpo") == 0 )
         {
            AV36TFPrvCpo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrvCpo", AV36TFPrvCpo);
            AV37TFPrvCpo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrvCpo_Sel", AV37TFPrvCpo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvPob") == 0 )
         {
            AV38TFPrvPob = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrvPob", AV38TFPrvPob);
            AV39TFPrvPob_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrvPob_Sel", AV39TFPrvPob_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNif") == 0 )
         {
            AV40TFPrvNif = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrvNif", AV40TFPrvNif);
            AV41TFPrvNif_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrvNif_Sel", AV41TFPrvNif_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvTlf") == 0 )
         {
            AV42TFPrvTlf = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFPrvTlf", AV42TFPrvTlf);
            AV43TFPrvTlf_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrvTlf_Sel", AV43TFPrvTlf_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvPri") == 0 )
         {
            AV111TFPrvPri_Sel = (byte)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFPrvPri_Sel", GXutil.str( AV111TFPrvPri_Sel, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvTlx") == 0 )
         {
            AV46TFPrvTlx = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrvTlx", AV46TFPrvTlx);
            AV47TFPrvTlx_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrvTlx_Sel", AV47TFPrvTlx_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvTip") == 0 )
         {
            AV112TFPrvTip_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TFPrvTip_SelsJson", AV112TFPrvTip_SelsJson);
            AV113TFPrvTip_Sels.fromJSonString(AV112TFPrvTip_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FpgCod") == 0 )
         {
            AV50TFFpgCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFFpgCod", AV50TFFpgCod);
            AV51TFFpgCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFFpgCod_Sel", AV51TFFpgCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvVto") == 0 )
         {
            AV54TFPrvVto = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPrvVto), 2, 0));
            AV55TFPrvVto_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrvVto_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPrvVto_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvDiaPag") == 0 )
         {
            AV56TFPrvDiaPag = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFPrvDiaPag), 6, 0));
            AV57TFPrvDiaPag_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFPrvDiaPag_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFPrvDiaPag_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvPer") == 0 )
         {
            AV58TFPrvPer = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFPrvPer), 6, 0));
            AV59TFPrvPer_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrvPer_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFPrvPer_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvBan") == 0 )
         {
            AV60TFPrvBan = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFPrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFPrvBan), 6, 0));
            AV61TFPrvBan_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrvBan_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFPrvBan_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvRep") == 0 )
         {
            AV62TFPrvRep = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrvRep", AV62TFPrvRep);
            AV63TFPrvRep_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFPrvRep_Sel", AV63TFPrvRep_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvPlaEnt") == 0 )
         {
            AV64TFPrvPlaEnt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFPrvPlaEnt), 3, 0));
            AV65TFPrvPlaEnt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrvPlaEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFPrvPlaEnt_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvMetTra") == 0 )
         {
            AV114TFPrvMetTra_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TFPrvMetTra_SelsJson", AV114TFPrvMetTra_SelsJson);
            AV115TFPrvMetTra_Sels.fromJSonString(AV114TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvCta") == 0 )
         {
            AV68TFPrvCta = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrvCta", AV68TFPrvCta);
            AV69TFPrvCta_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrvCta_Sel", AV69TFPrvCta_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvDivCod") == 0 )
         {
            AV70TFPrvDivCod_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFPrvDivCod_SelsJson", AV70TFPrvDivCod_SelsJson);
            AV71TFPrvDivCod_Sels.fromJSonString(AV70TFPrvDivCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvDivCo") == 0 )
         {
            AV72TFPrvDivCo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFPrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFPrvDivCo), 2, 0));
            AV73TFPrvDivCo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFPrvDivCo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFPrvDivCo_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvAct") == 0 )
         {
            AV144TFPrvAct_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144TFPrvAct_Sel", AV144TFPrvAct_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV71TFPrvDivCod_Sels", AV71TFPrvDivCod_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV115TFPrvMetTra_Sels", AV115TFPrvMetTra_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113TFPrvTip_Sels", AV113TFPrvTip_Sels);
   }

   private void e22GP2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV143GridActions, 4, 0)) );
   }

   public void e15GP2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TPRVGENWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11GP2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TPRVGENWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV147Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TPRVGENWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TPRVGENWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tprvgenww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV147Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113TFPrvTip_Sels", AV113TFPrvTip_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV115TFPrvMetTra_Sels", AV115TFPrvMetTra_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV71TFPrvDivCod_Sels", AV71TFPrvDivCod_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e16GP2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tprvgen", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","PrvNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 0 > 1 )
      {
         callWebObject(formatLink("app.tprvgen", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","PrvNum"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e17GP2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.tprvgenwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tprvgenww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      tprvgenww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV71TFPrvDivCod_Sels", AV71TFPrvDivCod_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV115TFPrvMetTra_Sels", AV115TFPrvMetTra_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113TFPrvTip_Sels", AV113TFPrvTip_Sels);
   }

   public void e18GP2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tprvgenwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV71TFPrvDivCod_Sels", AV71TFPrvDivCod_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV115TFPrvMetTra_Sels", AV115TFPrvMetTra_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113TFPrvTip_Sels", AV113TFPrvTip_Sels);
   }

   public void e19GP2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tprvgenwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV71TFPrvDivCod_Sels", AV71TFPrvDivCod_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV115TFPrvMetTra_Sels", AV115TFPrvMetTra_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113TFPrvTip_Sels", AV113TFPrvTip_Sels);
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNum", "", "Codigo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNom", "", "Proveedor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvDir", "", "Direccion", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvCpo", "", "Codigo Postal", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvPob", "", "Poblacion", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNif", "", "N.I.F.", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvTlf", "", "Telefonos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvPri", "", "Prioridad", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvTlx", "", "Telex", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvTip", "", "Proveedor o Acreador", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FpgCod", "", "Forma de Pago", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvVto", "", "No.Vencimientos", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvDiaPag", "", "Dias de Pago", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvPer", "", "Periodicidad", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvBan", "", "Codigo Banco", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvRep", "", "Representante", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvPlaEnt", "", "Dias Plazo Entrega", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvMetTra", "", "Metodo Transporte", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvCta", "", "Cuenta Contable", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvDivCod", "", "Divisa Traspaso Contable", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvDivCo", "", "Divisa", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvAct", "", "Activo?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPRVGENWWColumnsSelector", GXv_char4) ;
      tprvgenww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TPRVGENWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV28TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFPrvNum), 6, 0));
      AV29TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFPrvNum_To), 6, 0));
      AV30TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrvNom", AV30TFPrvNom);
      AV31TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrvNom_Sel", AV31TFPrvNom_Sel);
      AV34TFPrvDir = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrvDir", AV34TFPrvDir);
      AV35TFPrvDir_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrvDir_Sel", AV35TFPrvDir_Sel);
      AV36TFPrvCpo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrvCpo", AV36TFPrvCpo);
      AV37TFPrvCpo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrvCpo_Sel", AV37TFPrvCpo_Sel);
      AV38TFPrvPob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrvPob", AV38TFPrvPob);
      AV39TFPrvPob_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrvPob_Sel", AV39TFPrvPob_Sel);
      AV40TFPrvNif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrvNif", AV40TFPrvNif);
      AV41TFPrvNif_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrvNif_Sel", AV41TFPrvNif_Sel);
      AV42TFPrvTlf = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFPrvTlf", AV42TFPrvTlf);
      AV43TFPrvTlf_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrvTlf_Sel", AV43TFPrvTlf_Sel);
      AV111TFPrvPri_Sel = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111TFPrvPri_Sel", GXutil.str( AV111TFPrvPri_Sel, 1, 0));
      AV46TFPrvTlx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrvTlx", AV46TFPrvTlx);
      AV47TFPrvTlx_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrvTlx_Sel", AV47TFPrvTlx_Sel);
      AV113TFPrvTip_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV50TFFpgCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFFpgCod", AV50TFFpgCod);
      AV51TFFpgCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFFpgCod_Sel", AV51TFFpgCod_Sel);
      AV54TFPrvVto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPrvVto), 2, 0));
      AV55TFPrvVto_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrvVto_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPrvVto_To), 2, 0));
      AV56TFPrvDiaPag = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFPrvDiaPag), 6, 0));
      AV57TFPrvDiaPag_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFPrvDiaPag_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFPrvDiaPag_To), 6, 0));
      AV58TFPrvPer = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFPrvPer), 6, 0));
      AV59TFPrvPer_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrvPer_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFPrvPer_To), 6, 0));
      AV60TFPrvBan = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFPrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFPrvBan), 6, 0));
      AV61TFPrvBan_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrvBan_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFPrvBan_To), 6, 0));
      AV62TFPrvRep = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrvRep", AV62TFPrvRep);
      AV63TFPrvRep_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFPrvRep_Sel", AV63TFPrvRep_Sel);
      AV64TFPrvPlaEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFPrvPlaEnt), 3, 0));
      AV65TFPrvPlaEnt_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrvPlaEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFPrvPlaEnt_To), 3, 0));
      AV115TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV68TFPrvCta = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrvCta", AV68TFPrvCta);
      AV69TFPrvCta_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrvCta_Sel", AV69TFPrvCta_Sel);
      AV71TFPrvDivCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV72TFPrvDivCo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFPrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFPrvDivCo), 2, 0));
      AV73TFPrvDivCo_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFPrvDivCo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFPrvDivCo_To), 2, 0));
      AV144TFPrvAct_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV144TFPrvAct_Sel", AV144TFPrvAct_Sel);
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
         callWebObject(formatLink("app.tprvgen", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A795PrvNum,6,0))}, new String[] {"Mode","EmprCod","PrvNum"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      callWebObject(formatLink("app.tprvgen", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A795PrvNum,6,0))}, new String[] {"Mode","EmprCod","PrvNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tprvgen", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A795PrvNum,6,0))}, new String[] {"Mode","EmprCod","PrvNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tprvgen", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A795PrvNum,6,0))}, new String[] {"Mode","EmprCod","PrvNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV147Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV147Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV147Pgmname+"GridState"), null, null);
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
      AV188GXV1 = 1 ;
      while ( AV188GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV188GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV28TFPrvNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFPrvNum), 6, 0));
            AV29TFPrvNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV30TFPrvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrvNom", AV30TFPrvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV31TFPrvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrvNom_Sel", AV31TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR") == 0 )
         {
            AV34TFPrvDir = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrvDir", AV34TFPrvDir);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR_SEL") == 0 )
         {
            AV35TFPrvDir_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrvDir_Sel", AV35TFPrvDir_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO") == 0 )
         {
            AV36TFPrvCpo = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrvCpo", AV36TFPrvCpo);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO_SEL") == 0 )
         {
            AV37TFPrvCpo_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrvCpo_Sel", AV37TFPrvCpo_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB") == 0 )
         {
            AV38TFPrvPob = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrvPob", AV38TFPrvPob);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB_SEL") == 0 )
         {
            AV39TFPrvPob_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrvPob_Sel", AV39TFPrvPob_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV40TFPrvNif = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrvNif", AV40TFPrvNif);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV41TFPrvNif_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrvNif_Sel", AV41TFPrvNif_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF") == 0 )
         {
            AV42TFPrvTlf = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFPrvTlf", AV42TFPrvTlf);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF_SEL") == 0 )
         {
            AV43TFPrvTlf_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrvTlf_Sel", AV43TFPrvTlf_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPRI_SEL") == 0 )
         {
            AV111TFPrvPri_Sel = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFPrvPri_Sel", GXutil.str( AV111TFPrvPri_Sel, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX") == 0 )
         {
            AV46TFPrvTlx = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrvTlx", AV46TFPrvTlx);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX_SEL") == 0 )
         {
            AV47TFPrvTlx_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrvTlx_Sel", AV47TFPrvTlx_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTIP_SEL") == 0 )
         {
            AV112TFPrvTip_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TFPrvTip_SelsJson", AV112TFPrvTip_SelsJson);
            AV113TFPrvTip_Sels.fromJSonString(AV112TFPrvTip_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV50TFFpgCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFFpgCod", AV50TFFpgCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV51TFFpgCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFFpgCod_Sel", AV51TFFpgCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVVTO") == 0 )
         {
            AV54TFPrvVto = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPrvVto), 2, 0));
            AV55TFPrvVto_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrvVto_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPrvVto_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIAPAG") == 0 )
         {
            AV56TFPrvDiaPag = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFPrvDiaPag), 6, 0));
            AV57TFPrvDiaPag_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFPrvDiaPag_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFPrvDiaPag_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPER") == 0 )
         {
            AV58TFPrvPer = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFPrvPer), 6, 0));
            AV59TFPrvPer_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrvPer_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFPrvPer_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVBAN") == 0 )
         {
            AV60TFPrvBan = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFPrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFPrvBan), 6, 0));
            AV61TFPrvBan_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrvBan_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFPrvBan_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP") == 0 )
         {
            AV62TFPrvRep = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrvRep", AV62TFPrvRep);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP_SEL") == 0 )
         {
            AV63TFPrvRep_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFPrvRep_Sel", AV63TFPrvRep_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPLAENT") == 0 )
         {
            AV64TFPrvPlaEnt = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFPrvPlaEnt), 3, 0));
            AV65TFPrvPlaEnt_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrvPlaEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFPrvPlaEnt_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMETTRA_SEL") == 0 )
         {
            AV114TFPrvMetTra_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TFPrvMetTra_SelsJson", AV114TFPrvMetTra_SelsJson);
            AV115TFPrvMetTra_Sels.fromJSonString(AV114TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA") == 0 )
         {
            AV68TFPrvCta = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrvCta", AV68TFPrvCta);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA_SEL") == 0 )
         {
            AV69TFPrvCta_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrvCta_Sel", AV69TFPrvCta_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIVCOD_SEL") == 0 )
         {
            AV70TFPrvDivCod_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFPrvDivCod_SelsJson", AV70TFPrvDivCod_SelsJson);
            AV71TFPrvDivCod_Sels.fromJSonString(AV70TFPrvDivCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIVCO") == 0 )
         {
            AV72TFPrvDivCo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFPrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFPrvDivCo), 2, 0));
            AV73TFPrvDivCo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFPrvDivCo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFPrvDivCo_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVACT_SEL") == 0 )
         {
            AV144TFPrvAct_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144TFPrvAct_Sel", AV144TFPrvAct_Sel);
         }
         AV188GXV1 = (int)(AV188GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFPrvNom_Sel)==0), AV31TFPrvNom_Sel, GXv_char4) ;
      tprvgenww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFPrvDir_Sel)==0), AV35TFPrvDir_Sel, GXv_char3) ;
      tprvgenww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFPrvCpo_Sel)==0), AV37TFPrvCpo_Sel, GXv_char2) ;
      tprvgenww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFPrvPob_Sel)==0), AV39TFPrvPob_Sel, GXv_char15) ;
      tprvgenww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFPrvNif_Sel)==0), AV41TFPrvNif_Sel, GXv_char17) ;
      tprvgenww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFPrvTlf_Sel)==0), AV43TFPrvTlf_Sel, GXv_char19) ;
      tprvgenww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFPrvTlx_Sel)==0), AV47TFPrvTlx_Sel, GXv_char21) ;
      tprvgenww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV113TFPrvTip_Sels.size()==0), AV112TFPrvTip_SelsJson, GXv_char23) ;
      tprvgenww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFFpgCod_Sel)==0), AV51TFFpgCod_Sel, GXv_char25) ;
      tprvgenww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFPrvRep_Sel)==0), AV63TFPrvRep_Sel, GXv_char27) ;
      tprvgenww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV115TFPrvMetTra_Sels.size()==0), AV114TFPrvMetTra_SelsJson, GXv_char29) ;
      tprvgenww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFPrvCta_Sel)==0), AV69TFPrvCta_Sel, GXv_char31) ;
      tprvgenww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV71TFPrvDivCod_Sels.size()==0), AV70TFPrvDivCod_SelsJson, GXv_char33) ;
      tprvgenww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV144TFPrvAct_Sel)==0), AV144TFPrvAct_Sel, GXv_char35) ;
      tprvgenww_impl.this.GXt_char34 = GXv_char35[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|"+((0==AV111TFPrvPri_Sel) ? "" : GXutil.str( AV111TFPrvPri_Sel, 1, 0))+"|"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|||||"+GXt_char26+"||"+GXt_char28+"|"+GXt_char30+"|"+GXt_char32+"||"+GXt_char34 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFPrvNom)==0), AV30TFPrvNom, GXv_char35) ;
      tprvgenww_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFPrvDir)==0), AV34TFPrvDir, GXv_char33) ;
      tprvgenww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFPrvCpo)==0), AV36TFPrvCpo, GXv_char31) ;
      tprvgenww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFPrvPob)==0), AV38TFPrvPob, GXv_char29) ;
      tprvgenww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFPrvNif)==0), AV40TFPrvNif, GXv_char27) ;
      tprvgenww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFPrvTlf)==0), AV42TFPrvTlf, GXv_char25) ;
      tprvgenww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFPrvTlx)==0), AV46TFPrvTlx, GXv_char23) ;
      tprvgenww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFFpgCod)==0), AV50TFFpgCod, GXv_char21) ;
      tprvgenww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFPrvRep)==0), AV62TFPrvRep, GXv_char19) ;
      tprvgenww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFPrvCta)==0), AV68TFPrvCta, GXv_char17) ;
      tprvgenww_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV28TFPrvNum) ? "" : GXutil.str( AV28TFPrvNum, 6, 0))+"|"+GXt_char34+"|"+GXt_char32+"|"+GXt_char30+"|"+GXt_char28+"|"+GXt_char26+"|"+GXt_char24+"||"+GXt_char22+"||"+GXt_char20+"|"+((0==AV54TFPrvVto) ? "" : GXutil.str( AV54TFPrvVto, 2, 0))+"|"+((0==AV56TFPrvDiaPag) ? "" : GXutil.str( AV56TFPrvDiaPag, 6, 0))+"|"+((0==AV58TFPrvPer) ? "" : GXutil.str( AV58TFPrvPer, 6, 0))+"|"+((0==AV60TFPrvBan) ? "" : GXutil.str( AV60TFPrvBan, 6, 0))+"|"+GXt_char18+"|"+((0==AV64TFPrvPlaEnt) ? "" : GXutil.str( AV64TFPrvPlaEnt, 3, 0))+"||"+GXt_char16+"||"+((0==AV72TFPrvDivCo) ? "" : GXutil.str( AV72TFPrvDivCo, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV29TFPrvNum_To) ? "" : GXutil.str( AV29TFPrvNum_To, 6, 0))+"|||||||||||"+((0==AV55TFPrvVto_To) ? "" : GXutil.str( AV55TFPrvVto_To, 2, 0))+"|"+((0==AV57TFPrvDiaPag_To) ? "" : GXutil.str( AV57TFPrvDiaPag_To, 6, 0))+"|"+((0==AV59TFPrvPer_To) ? "" : GXutil.str( AV59TFPrvPer_To, 6, 0))+"|"+((0==AV61TFPrvBan_To) ? "" : GXutil.str( AV61TFPrvBan_To, 6, 0))+"||"+((0==AV65TFPrvPlaEnt_To) ? "" : GXutil.str( AV65TFPrvPlaEnt_To, 3, 0))+"||||"+((0==AV73TFPrvDivCo_To) ? "" : GXutil.str( AV73TFPrvDivCo_To, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV147Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVNUM", "", !((0==AV28TFPrvNum)&&(0==AV29TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV29TFPrvNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVNOM", "", !(GXutil.strcmp("", AV30TFPrvNom)==0), (short)(0), AV30TFPrvNom, "", !(GXutil.strcmp("", AV31TFPrvNom_Sel)==0), AV31TFPrvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVDIR", "", !(GXutil.strcmp("", AV34TFPrvDir)==0), (short)(0), AV34TFPrvDir, "", !(GXutil.strcmp("", AV35TFPrvDir_Sel)==0), AV35TFPrvDir_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVCPO", "", !(GXutil.strcmp("", AV36TFPrvCpo)==0), (short)(0), AV36TFPrvCpo, "", !(GXutil.strcmp("", AV37TFPrvCpo_Sel)==0), AV37TFPrvCpo_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVPOB", "", !(GXutil.strcmp("", AV38TFPrvPob)==0), (short)(0), AV38TFPrvPob, "", !(GXutil.strcmp("", AV39TFPrvPob_Sel)==0), AV39TFPrvPob_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVNIF", "", !(GXutil.strcmp("", AV40TFPrvNif)==0), (short)(0), AV40TFPrvNif, "", !(GXutil.strcmp("", AV41TFPrvNif_Sel)==0), AV41TFPrvNif_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVTLF", "", !(GXutil.strcmp("", AV42TFPrvTlf)==0), (short)(0), AV42TFPrvTlf, "", !(GXutil.strcmp("", AV43TFPrvTlf_Sel)==0), AV43TFPrvTlf_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVPRI_SEL", "", !(0==AV111TFPrvPri_Sel), (short)(0), GXutil.trim( GXutil.str( AV111TFPrvPri_Sel, 1, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVTLX", "", !(GXutil.strcmp("", AV46TFPrvTlx)==0), (short)(0), AV46TFPrvTlx, "", !(GXutil.strcmp("", AV47TFPrvTlx_Sel)==0), AV47TFPrvTlx_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVTIP_SEL", "", !(AV113TFPrvTip_Sels.size()==0), (short)(0), AV113TFPrvTip_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFFPGCOD", "", !(GXutil.strcmp("", AV50TFFpgCod)==0), (short)(0), AV50TFFpgCod, "", !(GXutil.strcmp("", AV51TFFpgCod_Sel)==0), AV51TFFpgCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVVTO", "", !((0==AV54TFPrvVto)&&(0==AV55TFPrvVto_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFPrvVto, 2, 0)), GXutil.trim( GXutil.str( AV55TFPrvVto_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVDIAPAG", "", !((0==AV56TFPrvDiaPag)&&(0==AV57TFPrvDiaPag_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFPrvDiaPag, 6, 0)), GXutil.trim( GXutil.str( AV57TFPrvDiaPag_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVPER", "", !((0==AV58TFPrvPer)&&(0==AV59TFPrvPer_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFPrvPer, 6, 0)), GXutil.trim( GXutil.str( AV59TFPrvPer_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVBAN", "", !((0==AV60TFPrvBan)&&(0==AV61TFPrvBan_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFPrvBan, 6, 0)), GXutil.trim( GXutil.str( AV61TFPrvBan_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVREP", "", !(GXutil.strcmp("", AV62TFPrvRep)==0), (short)(0), AV62TFPrvRep, "", !(GXutil.strcmp("", AV63TFPrvRep_Sel)==0), AV63TFPrvRep_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVPLAENT", "", !((0==AV64TFPrvPlaEnt)&&(0==AV65TFPrvPlaEnt_To)), (short)(0), GXutil.trim( GXutil.str( AV64TFPrvPlaEnt, 3, 0)), GXutil.trim( GXutil.str( AV65TFPrvPlaEnt_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVMETTRA_SEL", "", !(AV115TFPrvMetTra_Sels.size()==0), (short)(0), AV115TFPrvMetTra_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVCTA", "", !(GXutil.strcmp("", AV68TFPrvCta)==0), (short)(0), AV68TFPrvCta, "", !(GXutil.strcmp("", AV69TFPrvCta_Sel)==0), AV69TFPrvCta_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVDIVCOD_SEL", "", !(AV71TFPrvDivCod_Sels.size()==0), (short)(0), AV71TFPrvDivCod_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVDIVCO", "", !((0==AV72TFPrvDivCo)&&(0==AV73TFPrvDivCo_To)), (short)(0), GXutil.trim( GXutil.str( AV72TFPrvDivCo, 2, 0)), GXutil.trim( GXutil.str( AV73TFPrvDivCo_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRVACT_SEL", "", !(GXutil.strcmp("", AV144TFPrvAct_Sel)==0), (short)(0), AV144TFPrvAct_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV147Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV147Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPRVGEN" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_GP2( boolean wbgen )
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
         wb_table2_32_GP2( true) ;
      }
      else
      {
         wb_table2_32_GP2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_GP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_GP2e( true) ;
      }
      else
      {
         wb_table1_27_GP2e( false) ;
      }
   }

   public void wb_table2_32_GP2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TPRVGENWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_GP2e( true) ;
      }
      else
      {
         wb_table2_32_GP2e( false) ;
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
      paGP2( ) ;
      wsGP2( ) ;
      weGP2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211612211", true, true);
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
      httpContext.AddJavascriptSource("tprvgenww.js", "?20268211612211", false, true);
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
      edtPrvNum_Internalname = "PRVNUM_"+sGXsfl_45_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_45_idx ;
      edtPrvDir_Internalname = "PRVDIR_"+sGXsfl_45_idx ;
      edtPrvCpo_Internalname = "PRVCPO_"+sGXsfl_45_idx ;
      edtPrvPob_Internalname = "PRVPOB_"+sGXsfl_45_idx ;
      edtPrvNif_Internalname = "PRVNIF_"+sGXsfl_45_idx ;
      edtPrvTlf_Internalname = "PRVTLF_"+sGXsfl_45_idx ;
      chkPrvPri.setInternalname( "PRVPRI_"+sGXsfl_45_idx );
      edtPrvTlx_Internalname = "PRVTLX_"+sGXsfl_45_idx ;
      cmbPrvTip.setInternalname( "PRVTIP_"+sGXsfl_45_idx );
      edtFpgCod_Internalname = "FPGCOD_"+sGXsfl_45_idx ;
      edtPrvVto_Internalname = "PRVVTO_"+sGXsfl_45_idx ;
      edtPrvDiaPag_Internalname = "PRVDIAPAG_"+sGXsfl_45_idx ;
      edtPrvPer_Internalname = "PRVPER_"+sGXsfl_45_idx ;
      edtPrvBan_Internalname = "PRVBAN_"+sGXsfl_45_idx ;
      edtPrvRep_Internalname = "PRVREP_"+sGXsfl_45_idx ;
      edtPrvPlaEnt_Internalname = "PRVPLAENT_"+sGXsfl_45_idx ;
      cmbPrvMetTra.setInternalname( "PRVMETTRA_"+sGXsfl_45_idx );
      edtPrvCta_Internalname = "PRVCTA_"+sGXsfl_45_idx ;
      cmbPrvDivCod.setInternalname( "PRVDIVCOD_"+sGXsfl_45_idx );
      edtPrvDivCo_Internalname = "PRVDIVCO_"+sGXsfl_45_idx ;
      chkPrvAct.setInternalname( "PRVACT_"+sGXsfl_45_idx );
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtPrvNum_Internalname = "PRVNUM_"+sGXsfl_45_fel_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_45_fel_idx ;
      edtPrvDir_Internalname = "PRVDIR_"+sGXsfl_45_fel_idx ;
      edtPrvCpo_Internalname = "PRVCPO_"+sGXsfl_45_fel_idx ;
      edtPrvPob_Internalname = "PRVPOB_"+sGXsfl_45_fel_idx ;
      edtPrvNif_Internalname = "PRVNIF_"+sGXsfl_45_fel_idx ;
      edtPrvTlf_Internalname = "PRVTLF_"+sGXsfl_45_fel_idx ;
      chkPrvPri.setInternalname( "PRVPRI_"+sGXsfl_45_fel_idx );
      edtPrvTlx_Internalname = "PRVTLX_"+sGXsfl_45_fel_idx ;
      cmbPrvTip.setInternalname( "PRVTIP_"+sGXsfl_45_fel_idx );
      edtFpgCod_Internalname = "FPGCOD_"+sGXsfl_45_fel_idx ;
      edtPrvVto_Internalname = "PRVVTO_"+sGXsfl_45_fel_idx ;
      edtPrvDiaPag_Internalname = "PRVDIAPAG_"+sGXsfl_45_fel_idx ;
      edtPrvPer_Internalname = "PRVPER_"+sGXsfl_45_fel_idx ;
      edtPrvBan_Internalname = "PRVBAN_"+sGXsfl_45_fel_idx ;
      edtPrvRep_Internalname = "PRVREP_"+sGXsfl_45_fel_idx ;
      edtPrvPlaEnt_Internalname = "PRVPLAENT_"+sGXsfl_45_fel_idx ;
      cmbPrvMetTra.setInternalname( "PRVMETTRA_"+sGXsfl_45_fel_idx );
      edtPrvCta_Internalname = "PRVCTA_"+sGXsfl_45_fel_idx ;
      cmbPrvDivCod.setInternalname( "PRVDIVCOD_"+sGXsfl_45_fel_idx );
      edtPrvDivCo_Internalname = "PRVDIVCO_"+sGXsfl_45_fel_idx ;
      chkPrvAct.setInternalname( "PRVACT_"+sGXsfl_45_fel_idx );
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wbGP0( ) ;
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
               AV143GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV143GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV143GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e23gp2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV143GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvDir_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvDir_Internalname,GXutil.rtrim( A786PrvDir),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvDir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvDir_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvCpo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvCpo_Internalname,GXutil.rtrim( A782PrvCpo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvCpo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvCpo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvPob_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvPob_Internalname,GXutil.rtrim( A799PrvPob),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvPob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvPob_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNif_Internalname,GXutil.rtrim( A793PrvNif),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNif_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvTlf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvTlf_Internalname,GXutil.rtrim( A803PrvTlf),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvTlf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvTlf_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkPrvPri.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PRVPRI_" + sGXsfl_45_idx ;
         chkPrvPri.setName( GXCCtl );
         chkPrvPri.setWebtags( "" );
         chkPrvPri.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkPrvPri.getInternalname(), "TitleCaption", chkPrvPri.getCaption(), !bGXsfl_45_Refreshing);
         chkPrvPri.setCheckedValue( "0" );
         A800PrvPri = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
         n800PrvPri = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPrvPri.getInternalname(),GXutil.str( A800PrvPri, 1, 0),"","",Integer.valueOf(chkPrvPri.getVisible()),Integer.valueOf(0),"1","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvTlx_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvTlx_Internalname,GXutil.rtrim( A804PrvTlx),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvTlx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvTlx_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrvTip.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrvTip.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRVTIP_" + sGXsfl_45_idx ;
            cmbPrvTip.setName( GXCCtl );
            cmbPrvTip.setWebtags( "" );
            cmbPrvTip.addItem("P", httpContext.getMessage( "P", ""), (short)(0));
            cmbPrvTip.addItem("A", httpContext.getMessage( "A", ""), (short)(0));
            if ( cmbPrvTip.getItemCount() > 0 )
            {
               A802PrvTip = cmbPrvTip.getValidValue(A802PrvTip) ;
               n802PrvTip = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrvTip,cmbPrvTip.getInternalname(),GXutil.rtrim( A802PrvTip),Integer.valueOf(1),cmbPrvTip.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrvTip.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrvTip.setValue( GXutil.rtrim( A802PrvTip) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrvTip.getInternalname(), "Values", cmbPrvTip.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFpgCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFpgCod_Internalname,GXutil.rtrim( A497FpgCod),GXutil.rtrim( localUtil.format( A497FpgCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFpgCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFpgCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvVto_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvVto_Internalname,GXutil.ltrim( localUtil.ntoc( A805PrvVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvVto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvVto_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvDiaPag_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvDiaPag_Internalname,GXutil.ltrim( localUtil.ntoc( A785PrvDiaPag, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvDiaPag_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvDiaPag_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvPer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvPer_Internalname,GXutil.ltrim( localUtil.ntoc( A797PrvPer, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvPer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvPer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvBan_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvBan_Internalname,GXutil.ltrim( localUtil.ntoc( A780PrvBan, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A780PrvBan), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvBan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvBan_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvRep_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvRep_Internalname,GXutil.rtrim( A801PrvRep),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvRep_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvRep_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvPlaEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvPlaEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A798PrvPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvPlaEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvPlaEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrvMetTra.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrvMetTra.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRVMETTRA_" + sGXsfl_45_idx ;
            cmbPrvMetTra.setName( GXCCtl );
            cmbPrvMetTra.setWebtags( "" );
            cmbPrvMetTra.addItem("S", httpContext.getMessage( "Su Transporte", ""), (short)(0));
            cmbPrvMetTra.addItem("N", httpContext.getMessage( "Nuestro", ""), (short)(0));
            cmbPrvMetTra.addItem("A", httpContext.getMessage( "Agencia", ""), (short)(0));
            if ( cmbPrvMetTra.getItemCount() > 0 )
            {
               A792PrvMetTra = cmbPrvMetTra.getValidValue(A792PrvMetTra) ;
               n792PrvMetTra = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrvMetTra,cmbPrvMetTra.getInternalname(),GXutil.rtrim( A792PrvMetTra),Integer.valueOf(1),cmbPrvMetTra.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrvMetTra.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrvMetTra.setValue( GXutil.rtrim( A792PrvMetTra) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrvMetTra.getInternalname(), "Values", cmbPrvMetTra.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvCta_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvCta_Internalname,GXutil.rtrim( A783PrvCta),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvCta_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvCta_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrvDivCod.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrvDivCod.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRVDIVCOD_" + sGXsfl_45_idx ;
            cmbPrvDivCod.setName( GXCCtl );
            cmbPrvDivCod.setWebtags( "" );
            cmbPrvDivCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
            cmbPrvDivCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
            if ( cmbPrvDivCod.getItemCount() > 0 )
            {
               A3092PrvDivCod = cmbPrvDivCod.getValidValue(A3092PrvDivCod) ;
               n3092PrvDivCod = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrvDivCod,cmbPrvDivCod.getInternalname(),GXutil.rtrim( A3092PrvDivCod),Integer.valueOf(1),cmbPrvDivCod.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrvDivCod.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrvDivCod.setValue( GXutil.rtrim( A3092PrvDivCod) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrvDivCod.getInternalname(), "Values", cmbPrvDivCod.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvDivCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvDivCo_Internalname,GXutil.ltrim( localUtil.ntoc( A3143PrvDivCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3143PrvDivCo), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvDivCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvDivCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkPrvAct.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PRVACT_" + sGXsfl_45_idx ;
         chkPrvAct.setName( GXCCtl );
         chkPrvAct.setWebtags( "" );
         chkPrvAct.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkPrvAct.getInternalname(), "TitleCaption", chkPrvAct.getCaption(), !bGXsfl_45_Refreshing);
         chkPrvAct.setCheckedValue( "N" );
         A14216PrvAct = ((GXutil.strcmp(GXutil.rtrim( A14216PrvAct), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPrvAct.getInternalname(),A14216PrvAct,"","",Integer.valueOf(chkPrvAct.getVisible()),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         send_integrity_lvl_hashesGP2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvDir_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Direccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvCpo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Postal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvPob_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Poblacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N.I.F.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvTlf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Telefonos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkPrvPri.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prioridad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvTlx_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Telex", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrvTip.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor o Acreador", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFpgCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Forma de Pago", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvVto_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "No.Vencimientos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvDiaPag_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dias de Pago", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvPer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Periodicidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvBan_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Banco", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvRep_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Representante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvPlaEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dias Plazo Entrega", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrvMetTra.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metodo Transporte", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvCta_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cuenta Contable", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrvDivCod.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Divisa Traspaso Contable", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvDivCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Divisa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkPrvAct.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Activo?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV143GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A794PrvNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A786PrvDir));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvDir_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A782PrvCpo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvCpo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A799PrvPob));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvPob_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A793PrvNif));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A803PrvTlf));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvTlf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkPrvPri.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A804PrvTlx));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvTlx_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A802PrvTip));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrvTip.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A497FpgCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFpgCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A805PrvVto, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvVto_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A785PrvDiaPag, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvDiaPag_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A797PrvPer, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvPer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A780PrvBan, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvBan_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A801PrvRep));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvRep_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A798PrvPlaEnt, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvPlaEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A792PrvMetTra));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrvMetTra.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A783PrvCta));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvCta_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3092PrvDivCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrvDivCod.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3143PrvDivCo, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvDivCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14216PrvAct));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkPrvAct.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      edtPrvNum_Internalname = "PRVNUM" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      edtPrvDir_Internalname = "PRVDIR" ;
      edtPrvCpo_Internalname = "PRVCPO" ;
      edtPrvPob_Internalname = "PRVPOB" ;
      edtPrvNif_Internalname = "PRVNIF" ;
      edtPrvTlf_Internalname = "PRVTLF" ;
      chkPrvPri.setInternalname( "PRVPRI" );
      edtPrvTlx_Internalname = "PRVTLX" ;
      cmbPrvTip.setInternalname( "PRVTIP" );
      edtFpgCod_Internalname = "FPGCOD" ;
      edtPrvVto_Internalname = "PRVVTO" ;
      edtPrvDiaPag_Internalname = "PRVDIAPAG" ;
      edtPrvPer_Internalname = "PRVPER" ;
      edtPrvBan_Internalname = "PRVBAN" ;
      edtPrvRep_Internalname = "PRVREP" ;
      edtPrvPlaEnt_Internalname = "PRVPLAENT" ;
      cmbPrvMetTra.setInternalname( "PRVMETTRA" );
      edtPrvCta_Internalname = "PRVCTA" ;
      cmbPrvDivCod.setInternalname( "PRVDIVCOD" );
      edtPrvDivCo_Internalname = "PRVDIVCO" ;
      chkPrvAct.setInternalname( "PRVACT" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      chkPrvAct.setCaption( "" );
      edtPrvDivCo_Jsonclick = "" ;
      cmbPrvDivCod.setJsonclick( "" );
      edtPrvCta_Jsonclick = "" ;
      cmbPrvMetTra.setJsonclick( "" );
      edtPrvPlaEnt_Jsonclick = "" ;
      edtPrvRep_Jsonclick = "" ;
      edtPrvBan_Jsonclick = "" ;
      edtPrvPer_Jsonclick = "" ;
      edtPrvDiaPag_Jsonclick = "" ;
      edtPrvVto_Jsonclick = "" ;
      edtFpgCod_Jsonclick = "" ;
      cmbPrvTip.setJsonclick( "" );
      edtPrvTlx_Jsonclick = "" ;
      chkPrvPri.setCaption( "" );
      edtPrvTlf_Jsonclick = "" ;
      edtPrvNif_Jsonclick = "" ;
      edtPrvPob_Jsonclick = "" ;
      edtPrvCpo_Jsonclick = "" ;
      edtPrvDir_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkPrvAct.setVisible( -1 );
      edtPrvDivCo_Visible = -1 ;
      cmbPrvDivCod.setVisible( -1 );
      edtPrvCta_Visible = -1 ;
      cmbPrvMetTra.setVisible( -1 );
      edtPrvPlaEnt_Visible = -1 ;
      edtPrvRep_Visible = -1 ;
      edtPrvBan_Visible = -1 ;
      edtPrvPer_Visible = -1 ;
      edtPrvDiaPag_Visible = -1 ;
      edtPrvVto_Visible = -1 ;
      edtFpgCod_Visible = -1 ;
      cmbPrvTip.setVisible( -1 );
      edtPrvTlx_Visible = -1 ;
      chkPrvPri.setVisible( -1 );
      edtPrvTlf_Visible = -1 ;
      edtPrvNif_Visible = -1 ;
      edtPrvPob_Visible = -1 ;
      edtPrvCpo_Visible = -1 ;
      edtPrvDir_Visible = -1 ;
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TPRVGENWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||1:WWP_TSChecked,2:WWP_TSUnChecked||P:P,A:A||||||||S:Su Transporte,N:Nuestro,A:Agencia||E:EURO,P:PESETA||S:WWP_TSChecked,N:WWP_TSUnChecked" ;
      Ddo_grid_Allowmultipleselection = "|||||||||T||||||||T||T||" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|FixedValues|Dynamic|FixedValues|Dynamic|||||Dynamic||FixedValues|Dynamic|FixedValues||FixedValues" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|T|T|T|T|T|T|||||T||T|T|T||T" ;
      Ddo_grid_Filterisrange = "T|||||||||||T|T|T|T||T||||T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Character|Character||Character||Character|Numeric|Numeric|Numeric|Numeric|Character|Numeric||Character||Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T||T||T|T|T|T|T|T|T||T||T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22" ;
      Ddo_grid_Columnids = "1:PrvNum|2:PrvNom|3:PrvDir|4:PrvCpo|5:PrvPob|6:PrvNif|7:PrvTlf|8:PrvPri|9:PrvTlx|10:PrvTip|11:FpgCod|12:PrvVto|13:PrvDiaPag|14:PrvPer|15:PrvBan|16:PrvRep|17:PrvPlaEnt|18:PrvMetTra|19:PrvCta|20:PrvDivCod|21:PrvDivCo|22:PrvAct" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Proveedores", "") );
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
         AV143GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV143GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143GridActions), 4, 0));
      }
      GXCCtl = "PRVPRI_" + sGXsfl_45_idx ;
      chkPrvPri.setName( GXCCtl );
      chkPrvPri.setWebtags( "" );
      chkPrvPri.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvPri.getInternalname(), "TitleCaption", chkPrvPri.getCaption(), !bGXsfl_45_Refreshing);
      chkPrvPri.setCheckedValue( "0" );
      A800PrvPri = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n800PrvPri = false ;
      GXCCtl = "PRVTIP_" + sGXsfl_45_idx ;
      cmbPrvTip.setName( GXCCtl );
      cmbPrvTip.setWebtags( "" );
      cmbPrvTip.addItem("P", httpContext.getMessage( "P", ""), (short)(0));
      cmbPrvTip.addItem("A", httpContext.getMessage( "A", ""), (short)(0));
      if ( cmbPrvTip.getItemCount() > 0 )
      {
         A802PrvTip = cmbPrvTip.getValidValue(A802PrvTip) ;
         n802PrvTip = false ;
      }
      GXCCtl = "PRVMETTRA_" + sGXsfl_45_idx ;
      cmbPrvMetTra.setName( GXCCtl );
      cmbPrvMetTra.setWebtags( "" );
      cmbPrvMetTra.addItem("S", httpContext.getMessage( "Su Transporte", ""), (short)(0));
      cmbPrvMetTra.addItem("N", httpContext.getMessage( "Nuestro", ""), (short)(0));
      cmbPrvMetTra.addItem("A", httpContext.getMessage( "Agencia", ""), (short)(0));
      if ( cmbPrvMetTra.getItemCount() > 0 )
      {
         A792PrvMetTra = cmbPrvMetTra.getValidValue(A792PrvMetTra) ;
         n792PrvMetTra = false ;
      }
      GXCCtl = "PRVDIVCOD_" + sGXsfl_45_idx ;
      cmbPrvDivCod.setName( GXCCtl );
      cmbPrvDivCod.setWebtags( "" );
      cmbPrvDivCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      cmbPrvDivCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      if ( cmbPrvDivCod.getItemCount() > 0 )
      {
         A3092PrvDivCod = cmbPrvDivCod.getValidValue(A3092PrvDivCod) ;
         n3092PrvDivCod = false ;
      }
      GXCCtl = "PRVACT_" + sGXsfl_45_idx ;
      chkPrvAct.setName( GXCCtl );
      chkPrvAct.setWebtags( "" );
      chkPrvAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvAct.getInternalname(), "TitleCaption", chkPrvAct.getCaption(), !bGXsfl_45_Refreshing);
      chkPrvAct.setCheckedValue( "N" );
      A14216PrvAct = ((GXutil.strcmp(GXutil.rtrim( A14216PrvAct), "S")==0) ? "S" : "N") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrvDir_Visible',ctrl:'PRVDIR',prop:'Visible'},{av:'edtPrvCpo_Visible',ctrl:'PRVCPO',prop:'Visible'},{av:'edtPrvPob_Visible',ctrl:'PRVPOB',prop:'Visible'},{av:'edtPrvNif_Visible',ctrl:'PRVNIF',prop:'Visible'},{av:'edtPrvTlf_Visible',ctrl:'PRVTLF',prop:'Visible'},{av:'chkPrvPri.getVisible()',ctrl:'PRVPRI',prop:'Visible'},{av:'edtPrvTlx_Visible',ctrl:'PRVTLX',prop:'Visible'},{av:'cmbPrvTip'},{av:'edtFpgCod_Visible',ctrl:'FPGCOD',prop:'Visible'},{av:'edtPrvVto_Visible',ctrl:'PRVVTO',prop:'Visible'},{av:'edtPrvDiaPag_Visible',ctrl:'PRVDIAPAG',prop:'Visible'},{av:'edtPrvPer_Visible',ctrl:'PRVPER',prop:'Visible'},{av:'edtPrvBan_Visible',ctrl:'PRVBAN',prop:'Visible'},{av:'edtPrvRep_Visible',ctrl:'PRVREP',prop:'Visible'},{av:'edtPrvPlaEnt_Visible',ctrl:'PRVPLAENT',prop:'Visible'},{av:'cmbPrvMetTra'},{av:'edtPrvCta_Visible',ctrl:'PRVCTA',prop:'Visible'},{av:'cmbPrvDivCod'},{av:'edtPrvDivCo_Visible',ctrl:'PRVDIVCO',prop:'Visible'},{av:'chkPrvAct.getVisible()',ctrl:'PRVACT',prop:'Visible'},{av:'AV78GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV79GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12GP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13GP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14GP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV70TFPrvDivCod_SelsJson',fld:'vTFPRVDIVCOD_SELSJSON',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV114TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV112TFPrvTip_SelsJson',fld:'vTFPRVTIP_SELSJSON',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22GP2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV143GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15GP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrvDir_Visible',ctrl:'PRVDIR',prop:'Visible'},{av:'edtPrvCpo_Visible',ctrl:'PRVCPO',prop:'Visible'},{av:'edtPrvPob_Visible',ctrl:'PRVPOB',prop:'Visible'},{av:'edtPrvNif_Visible',ctrl:'PRVNIF',prop:'Visible'},{av:'edtPrvTlf_Visible',ctrl:'PRVTLF',prop:'Visible'},{av:'chkPrvPri.getVisible()',ctrl:'PRVPRI',prop:'Visible'},{av:'edtPrvTlx_Visible',ctrl:'PRVTLX',prop:'Visible'},{av:'cmbPrvTip'},{av:'edtFpgCod_Visible',ctrl:'FPGCOD',prop:'Visible'},{av:'edtPrvVto_Visible',ctrl:'PRVVTO',prop:'Visible'},{av:'edtPrvDiaPag_Visible',ctrl:'PRVDIAPAG',prop:'Visible'},{av:'edtPrvPer_Visible',ctrl:'PRVPER',prop:'Visible'},{av:'edtPrvBan_Visible',ctrl:'PRVBAN',prop:'Visible'},{av:'edtPrvRep_Visible',ctrl:'PRVREP',prop:'Visible'},{av:'edtPrvPlaEnt_Visible',ctrl:'PRVPLAENT',prop:'Visible'},{av:'cmbPrvMetTra'},{av:'edtPrvCta_Visible',ctrl:'PRVCTA',prop:'Visible'},{av:'cmbPrvDivCod'},{av:'edtPrvDivCo_Visible',ctrl:'PRVDIVCO',prop:'Visible'},{av:'chkPrvAct.getVisible()',ctrl:'PRVACT',prop:'Visible'},{av:'AV78GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV79GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11GP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV112TFPrvTip_SelsJson',fld:'vTFPRVTIP_SELSJSON',pic:''},{av:'AV114TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV70TFPrvDivCod_SelsJson',fld:'vTFPRVDIVCOD_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV70TFPrvDivCod_SelsJson',fld:'vTFPRVDIVCOD_SELSJSON',pic:''},{av:'AV114TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV112TFPrvTip_SelsJson',fld:'vTFPRVTIP_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrvDir_Visible',ctrl:'PRVDIR',prop:'Visible'},{av:'edtPrvCpo_Visible',ctrl:'PRVCPO',prop:'Visible'},{av:'edtPrvPob_Visible',ctrl:'PRVPOB',prop:'Visible'},{av:'edtPrvNif_Visible',ctrl:'PRVNIF',prop:'Visible'},{av:'edtPrvTlf_Visible',ctrl:'PRVTLF',prop:'Visible'},{av:'chkPrvPri.getVisible()',ctrl:'PRVPRI',prop:'Visible'},{av:'edtPrvTlx_Visible',ctrl:'PRVTLX',prop:'Visible'},{av:'cmbPrvTip'},{av:'edtFpgCod_Visible',ctrl:'FPGCOD',prop:'Visible'},{av:'edtPrvVto_Visible',ctrl:'PRVVTO',prop:'Visible'},{av:'edtPrvDiaPag_Visible',ctrl:'PRVDIAPAG',prop:'Visible'},{av:'edtPrvPer_Visible',ctrl:'PRVPER',prop:'Visible'},{av:'edtPrvBan_Visible',ctrl:'PRVBAN',prop:'Visible'},{av:'edtPrvRep_Visible',ctrl:'PRVREP',prop:'Visible'},{av:'edtPrvPlaEnt_Visible',ctrl:'PRVPLAENT',prop:'Visible'},{av:'cmbPrvMetTra'},{av:'edtPrvCta_Visible',ctrl:'PRVCTA',prop:'Visible'},{av:'cmbPrvDivCod'},{av:'edtPrvDivCo_Visible',ctrl:'PRVDIVCO',prop:'Visible'},{av:'chkPrvAct.getVisible()',ctrl:'PRVACT',prop:'Visible'},{av:'AV78GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV79GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23GP2',iparms:[{av:'cmbavGridactions'},{av:'AV143GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV143GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16GP2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17GP2',iparms:[{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV112TFPrvTip_SelsJson',fld:'vTFPRVTIP_SELSJSON',pic:''},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV114TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV70TFPrvDivCod_SelsJson',fld:'vTFPRVDIVCOD_SELSJSON',pic:''},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV70TFPrvDivCod_SelsJson',fld:'vTFPRVDIVCOD_SELSJSON',pic:''},{av:'AV114TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV112TFPrvTip_SelsJson',fld:'vTFPRVTIP_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18GP2',iparms:[{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV112TFPrvTip_SelsJson',fld:'vTFPRVTIP_SELSJSON',pic:''},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV114TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV70TFPrvDivCod_SelsJson',fld:'vTFPRVDIVCOD_SELSJSON',pic:''},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV70TFPrvDivCod_SelsJson',fld:'vTFPRVDIVCOD_SELSJSON',pic:''},{av:'AV114TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV112TFPrvTip_SelsJson',fld:'vTFPRVTIP_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19GP2',iparms:[{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV112TFPrvTip_SelsJson',fld:'vTFPRVTIP_SELSJSON',pic:''},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV114TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV70TFPrvDivCod_SelsJson',fld:'vTFPRVDIVCOD_SELSJSON',pic:''},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV30TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV35TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV36TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV37TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV38TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV39TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV40TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV41TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV42TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV43TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV111TFPrvPri_Sel',fld:'vTFPRVPRI_SEL',pic:'9'},{av:'AV46TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV47TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV113TFPrvTip_Sels',fld:'vTFPRVTIP_SELS',pic:''},{av:'AV50TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV51TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV54TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV55TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV56TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV57TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV59TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV60TFPrvBan',fld:'vTFPRVBAN',pic:'ZZZZZ9'},{av:'AV61TFPrvBan_To',fld:'vTFPRVBAN_TO',pic:'ZZZZZ9'},{av:'AV62TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV63TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV64TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV65TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV115TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV68TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV69TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV71TFPrvDivCod_Sels',fld:'vTFPRVDIVCOD_SELS',pic:''},{av:'AV72TFPrvDivCo',fld:'vTFPRVDIVCO',pic:'Z9'},{av:'AV73TFPrvDivCo_To',fld:'vTFPRVDIVCO_TO',pic:'Z9'},{av:'AV144TFPrvAct_Sel',fld:'vTFPRVACT_SEL',pic:''},{av:'AV147Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV70TFPrvDivCod_SelsJson',fld:'vTFPRVDIVCOD_SELSJSON',pic:''},{av:'AV114TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV112TFPrvTip_SelsJson',fld:'vTFPRVTIP_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PRVNOM","{handler:'valid_Prvnom',iparms:[]");
      setEventMetadata("VALID_PRVNOM",",oparms:[]}");
      setEventMetadata("VALID_PRVDIR","{handler:'valid_Prvdir',iparms:[]");
      setEventMetadata("VALID_PRVDIR",",oparms:[]}");
      setEventMetadata("VALID_PRVCPO","{handler:'valid_Prvcpo',iparms:[]");
      setEventMetadata("VALID_PRVCPO",",oparms:[]}");
      setEventMetadata("VALID_PRVPOB","{handler:'valid_Prvpob',iparms:[]");
      setEventMetadata("VALID_PRVPOB",",oparms:[]}");
      setEventMetadata("VALID_PRVNIF","{handler:'valid_Prvnif',iparms:[]");
      setEventMetadata("VALID_PRVNIF",",oparms:[]}");
      setEventMetadata("VALID_PRVTLF","{handler:'valid_Prvtlf',iparms:[]");
      setEventMetadata("VALID_PRVTLF",",oparms:[]}");
      setEventMetadata("VALID_PRVTLX","{handler:'valid_Prvtlx',iparms:[]");
      setEventMetadata("VALID_PRVTLX",",oparms:[]}");
      setEventMetadata("VALID_PRVTIP","{handler:'valid_Prvtip',iparms:[]");
      setEventMetadata("VALID_PRVTIP",",oparms:[]}");
      setEventMetadata("VALID_FPGCOD","{handler:'valid_Fpgcod',iparms:[]");
      setEventMetadata("VALID_FPGCOD",",oparms:[]}");
      setEventMetadata("VALID_PRVVTO","{handler:'valid_Prvvto',iparms:[]");
      setEventMetadata("VALID_PRVVTO",",oparms:[]}");
      setEventMetadata("VALID_PRVDIAPAG","{handler:'valid_Prvdiapag',iparms:[]");
      setEventMetadata("VALID_PRVDIAPAG",",oparms:[]}");
      setEventMetadata("VALID_PRVPER","{handler:'valid_Prvper',iparms:[]");
      setEventMetadata("VALID_PRVPER",",oparms:[]}");
      setEventMetadata("VALID_PRVBAN","{handler:'valid_Prvban',iparms:[]");
      setEventMetadata("VALID_PRVBAN",",oparms:[]}");
      setEventMetadata("VALID_PRVREP","{handler:'valid_Prvrep',iparms:[]");
      setEventMetadata("VALID_PRVREP",",oparms:[]}");
      setEventMetadata("VALID_PRVPLAENT","{handler:'valid_Prvplaent',iparms:[]");
      setEventMetadata("VALID_PRVPLAENT",",oparms:[]}");
      setEventMetadata("VALID_PRVMETTRA","{handler:'valid_Prvmettra',iparms:[]");
      setEventMetadata("VALID_PRVMETTRA",",oparms:[]}");
      setEventMetadata("VALID_PRVCTA","{handler:'valid_Prvcta',iparms:[]");
      setEventMetadata("VALID_PRVCTA",",oparms:[]}");
      setEventMetadata("VALID_PRVDIVCOD","{handler:'valid_Prvdivcod',iparms:[]");
      setEventMetadata("VALID_PRVDIVCOD",",oparms:[]}");
      setEventMetadata("VALID_PRVDIVCO","{handler:'valid_Prvdivco',iparms:[]");
      setEventMetadata("VALID_PRVDIVCO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Prvact',iparms:[]");
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
      A396EmprCod = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV30TFPrvNom = "" ;
      AV31TFPrvNom_Sel = "" ;
      AV34TFPrvDir = "" ;
      AV35TFPrvDir_Sel = "" ;
      AV36TFPrvCpo = "" ;
      AV37TFPrvCpo_Sel = "" ;
      AV38TFPrvPob = "" ;
      AV39TFPrvPob_Sel = "" ;
      AV40TFPrvNif = "" ;
      AV41TFPrvNif_Sel = "" ;
      AV42TFPrvTlf = "" ;
      AV43TFPrvTlf_Sel = "" ;
      AV46TFPrvTlx = "" ;
      AV47TFPrvTlx_Sel = "" ;
      AV113TFPrvTip_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50TFFpgCod = "" ;
      AV51TFFpgCod_Sel = "" ;
      AV62TFPrvRep = "" ;
      AV63TFPrvRep_Sel = "" ;
      AV115TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV68TFPrvCta = "" ;
      AV69TFPrvCta_Sel = "" ;
      AV71TFPrvDivCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV144TFPrvAct_Sel = "" ;
      AV147Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV76DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV112TFPrvTip_SelsJson = "" ;
      AV114TFPrvMetTra_SelsJson = "" ;
      AV70TFPrvDivCod_SelsJson = "" ;
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
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A802PrvTip = "" ;
      A497FpgCod = "" ;
      A801PrvRep = "" ;
      A792PrvMetTra = "" ;
      A783PrvCta = "" ;
      A3092PrvDivCod = "" ;
      A14216PrvAct = "" ;
      AV148Tprvgenwwds_1_filterfulltext = "" ;
      AV151Tprvgenwwds_4_tfprvnom = "" ;
      AV152Tprvgenwwds_5_tfprvnom_sel = "" ;
      AV153Tprvgenwwds_6_tfprvdir = "" ;
      AV154Tprvgenwwds_7_tfprvdir_sel = "" ;
      AV155Tprvgenwwds_8_tfprvcpo = "" ;
      AV156Tprvgenwwds_9_tfprvcpo_sel = "" ;
      AV157Tprvgenwwds_10_tfprvpob = "" ;
      AV158Tprvgenwwds_11_tfprvpob_sel = "" ;
      AV159Tprvgenwwds_12_tfprvnif = "" ;
      AV160Tprvgenwwds_13_tfprvnif_sel = "" ;
      AV161Tprvgenwwds_14_tfprvtlf = "" ;
      AV162Tprvgenwwds_15_tfprvtlf_sel = "" ;
      AV164Tprvgenwwds_17_tfprvtlx = "" ;
      AV165Tprvgenwwds_18_tfprvtlx_sel = "" ;
      AV166Tprvgenwwds_19_tfprvtip_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV167Tprvgenwwds_20_tffpgcod = "" ;
      AV168Tprvgenwwds_21_tffpgcod_sel = "" ;
      AV177Tprvgenwwds_30_tfprvrep = "" ;
      AV178Tprvgenwwds_31_tfprvrep_sel = "" ;
      AV181Tprvgenwwds_34_tfprvmettra_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV182Tprvgenwwds_35_tfprvcta = "" ;
      AV183Tprvgenwwds_36_tfprvcta_sel = "" ;
      AV184Tprvgenwwds_37_tfprvdivcod_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV187Tprvgenwwds_40_tfprvact_sel = "" ;
      scmdbuf = "" ;
      lV148Tprvgenwwds_1_filterfulltext = "" ;
      lV151Tprvgenwwds_4_tfprvnom = "" ;
      lV153Tprvgenwwds_6_tfprvdir = "" ;
      lV155Tprvgenwwds_8_tfprvcpo = "" ;
      lV157Tprvgenwwds_10_tfprvpob = "" ;
      lV159Tprvgenwwds_12_tfprvnif = "" ;
      lV161Tprvgenwwds_14_tfprvtlf = "" ;
      lV164Tprvgenwwds_17_tfprvtlx = "" ;
      lV167Tprvgenwwds_20_tffpgcod = "" ;
      lV177Tprvgenwwds_30_tfprvrep = "" ;
      lV182Tprvgenwwds_35_tfprvcta = "" ;
      H00GP2_A396EmprCod = new String[] {""} ;
      H00GP2_A14216PrvAct = new String[] {""} ;
      H00GP2_A3143PrvDivCo = new byte[1] ;
      H00GP2_A3092PrvDivCod = new String[] {""} ;
      H00GP2_n3092PrvDivCod = new boolean[] {false} ;
      H00GP2_A783PrvCta = new String[] {""} ;
      H00GP2_n783PrvCta = new boolean[] {false} ;
      H00GP2_A792PrvMetTra = new String[] {""} ;
      H00GP2_n792PrvMetTra = new boolean[] {false} ;
      H00GP2_A798PrvPlaEnt = new short[1] ;
      H00GP2_n798PrvPlaEnt = new boolean[] {false} ;
      H00GP2_A801PrvRep = new String[] {""} ;
      H00GP2_n801PrvRep = new boolean[] {false} ;
      H00GP2_A780PrvBan = new int[1] ;
      H00GP2_n780PrvBan = new boolean[] {false} ;
      H00GP2_A797PrvPer = new int[1] ;
      H00GP2_n797PrvPer = new boolean[] {false} ;
      H00GP2_A785PrvDiaPag = new int[1] ;
      H00GP2_n785PrvDiaPag = new boolean[] {false} ;
      H00GP2_A805PrvVto = new byte[1] ;
      H00GP2_n805PrvVto = new boolean[] {false} ;
      H00GP2_A497FpgCod = new String[] {""} ;
      H00GP2_n497FpgCod = new boolean[] {false} ;
      H00GP2_A802PrvTip = new String[] {""} ;
      H00GP2_n802PrvTip = new boolean[] {false} ;
      H00GP2_A804PrvTlx = new String[] {""} ;
      H00GP2_n804PrvTlx = new boolean[] {false} ;
      H00GP2_A800PrvPri = new byte[1] ;
      H00GP2_n800PrvPri = new boolean[] {false} ;
      H00GP2_A803PrvTlf = new String[] {""} ;
      H00GP2_n803PrvTlf = new boolean[] {false} ;
      H00GP2_A793PrvNif = new String[] {""} ;
      H00GP2_n793PrvNif = new boolean[] {false} ;
      H00GP2_A799PrvPob = new String[] {""} ;
      H00GP2_n799PrvPob = new boolean[] {false} ;
      H00GP2_A782PrvCpo = new String[] {""} ;
      H00GP2_n782PrvCpo = new boolean[] {false} ;
      H00GP2_A786PrvDir = new String[] {""} ;
      H00GP2_n786PrvDir = new boolean[] {false} ;
      H00GP2_A794PrvNom = new String[] {""} ;
      H00GP2_n794PrvNom = new boolean[] {false} ;
      H00GP2_A795PrvNum = new int[1] ;
      H00GP3_A396EmprCod = new String[] {""} ;
      H00GP3_A14216PrvAct = new String[] {""} ;
      H00GP3_A3143PrvDivCo = new byte[1] ;
      H00GP3_A3092PrvDivCod = new String[] {""} ;
      H00GP3_n3092PrvDivCod = new boolean[] {false} ;
      H00GP3_A783PrvCta = new String[] {""} ;
      H00GP3_n783PrvCta = new boolean[] {false} ;
      H00GP3_A792PrvMetTra = new String[] {""} ;
      H00GP3_n792PrvMetTra = new boolean[] {false} ;
      H00GP3_A798PrvPlaEnt = new short[1] ;
      H00GP3_n798PrvPlaEnt = new boolean[] {false} ;
      H00GP3_A801PrvRep = new String[] {""} ;
      H00GP3_n801PrvRep = new boolean[] {false} ;
      H00GP3_A780PrvBan = new int[1] ;
      H00GP3_n780PrvBan = new boolean[] {false} ;
      H00GP3_A797PrvPer = new int[1] ;
      H00GP3_n797PrvPer = new boolean[] {false} ;
      H00GP3_A785PrvDiaPag = new int[1] ;
      H00GP3_n785PrvDiaPag = new boolean[] {false} ;
      H00GP3_A805PrvVto = new byte[1] ;
      H00GP3_n805PrvVto = new boolean[] {false} ;
      H00GP3_A497FpgCod = new String[] {""} ;
      H00GP3_n497FpgCod = new boolean[] {false} ;
      H00GP3_A802PrvTip = new String[] {""} ;
      H00GP3_n802PrvTip = new boolean[] {false} ;
      H00GP3_A804PrvTlx = new String[] {""} ;
      H00GP3_n804PrvTlx = new boolean[] {false} ;
      H00GP3_A800PrvPri = new byte[1] ;
      H00GP3_n800PrvPri = new boolean[] {false} ;
      H00GP3_A803PrvTlf = new String[] {""} ;
      H00GP3_n803PrvTlf = new boolean[] {false} ;
      H00GP3_A793PrvNif = new String[] {""} ;
      H00GP3_n793PrvNif = new boolean[] {false} ;
      H00GP3_A799PrvPob = new String[] {""} ;
      H00GP3_n799PrvPob = new boolean[] {false} ;
      H00GP3_A782PrvCpo = new String[] {""} ;
      H00GP3_n782PrvCpo = new boolean[] {false} ;
      H00GP3_A786PrvDir = new String[] {""} ;
      H00GP3_n786PrvDir = new boolean[] {false} ;
      H00GP3_A794PrvNom = new String[] {""} ;
      H00GP3_n794PrvNom = new boolean[] {false} ;
      H00GP3_A795PrvNum = new int[1] ;
      hsh = "" ;
      AV82Station = "" ;
      AV84EmprNom = "" ;
      AV85UsurCod = "" ;
      AV83EmprCod = "" ;
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
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char34 = "" ;
      GXv_char35 = new String[1] ;
      GXt_char32 = "" ;
      GXv_char33 = new String[1] ;
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
      GXv_SdtWWPGridState36 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprvgenww__default(),
         new Object[] {
             new Object[] {
            H00GP2_A396EmprCod, H00GP2_A14216PrvAct, H00GP2_A3143PrvDivCo, H00GP2_A3092PrvDivCod, H00GP2_n3092PrvDivCod, H00GP2_A783PrvCta, H00GP2_n783PrvCta, H00GP2_A792PrvMetTra, H00GP2_n792PrvMetTra, H00GP2_A798PrvPlaEnt,
            H00GP2_n798PrvPlaEnt, H00GP2_A801PrvRep, H00GP2_n801PrvRep, H00GP2_A780PrvBan, H00GP2_n780PrvBan, H00GP2_A797PrvPer, H00GP2_n797PrvPer, H00GP2_A785PrvDiaPag, H00GP2_n785PrvDiaPag, H00GP2_A805PrvVto,
            H00GP2_n805PrvVto, H00GP2_A497FpgCod, H00GP2_n497FpgCod, H00GP2_A802PrvTip, H00GP2_n802PrvTip, H00GP2_A804PrvTlx, H00GP2_n804PrvTlx, H00GP2_A800PrvPri, H00GP2_n800PrvPri, H00GP2_A803PrvTlf,
            H00GP2_n803PrvTlf, H00GP2_A793PrvNif, H00GP2_n793PrvNif, H00GP2_A799PrvPob, H00GP2_n799PrvPob, H00GP2_A782PrvCpo, H00GP2_n782PrvCpo, H00GP2_A786PrvDir, H00GP2_n786PrvDir, H00GP2_A794PrvNom,
            H00GP2_n794PrvNom, H00GP2_A795PrvNum
            }
            , new Object[] {
            H00GP3_A396EmprCod, H00GP3_A14216PrvAct, H00GP3_A3143PrvDivCo, H00GP3_A3092PrvDivCod, H00GP3_n3092PrvDivCod, H00GP3_A783PrvCta, H00GP3_n783PrvCta, H00GP3_A792PrvMetTra, H00GP3_n792PrvMetTra, H00GP3_A798PrvPlaEnt,
            H00GP3_n798PrvPlaEnt, H00GP3_A801PrvRep, H00GP3_n801PrvRep, H00GP3_A780PrvBan, H00GP3_n780PrvBan, H00GP3_A797PrvPer, H00GP3_n797PrvPer, H00GP3_A785PrvDiaPag, H00GP3_n785PrvDiaPag, H00GP3_A805PrvVto,
            H00GP3_n805PrvVto, H00GP3_A497FpgCod, H00GP3_n497FpgCod, H00GP3_A802PrvTip, H00GP3_n802PrvTip, H00GP3_A804PrvTlx, H00GP3_n804PrvTlx, H00GP3_A800PrvPri, H00GP3_n800PrvPri, H00GP3_A803PrvTlf,
            H00GP3_n803PrvTlf, H00GP3_A793PrvNif, H00GP3_n793PrvNif, H00GP3_A799PrvPob, H00GP3_n799PrvPob, H00GP3_A782PrvCpo, H00GP3_n782PrvCpo, H00GP3_A786PrvDir, H00GP3_n786PrvDir, H00GP3_A794PrvNom,
            H00GP3_n794PrvNom, H00GP3_A795PrvNum
            }
         }
      );
      AV147Pgmname = "TPRVGENWW" ;
      /* GeneXus formulas. */
      AV147Pgmname = "TPRVGENWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GRID_nEOF ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV111TFPrvPri_Sel ;
   private byte AV54TFPrvVto ;
   private byte AV55TFPrvVto_To ;
   private byte AV72TFPrvDivCo ;
   private byte AV73TFPrvDivCo_To ;
   private byte gxajaxcallmode ;
   private byte A800PrvPri ;
   private byte A805PrvVto ;
   private byte A3143PrvDivCo ;
   private byte nDonePA ;
   private byte AV163Tprvgenwwds_16_tfprvpri_sel ;
   private byte AV169Tprvgenwwds_22_tfprvvto ;
   private byte AV170Tprvgenwwds_23_tfprvvto_to ;
   private byte AV185Tprvgenwwds_38_tfprvdivco ;
   private byte AV186Tprvgenwwds_39_tfprvdivco_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV64TFPrvPlaEnt ;
   private short AV65TFPrvPlaEnt_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV143GridActions ;
   private short A798PrvPlaEnt ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV179Tprvgenwwds_32_tfprvplaent ;
   private short AV180Tprvgenwwds_33_tfprvplaent_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV28TFPrvNum ;
   private int AV29TFPrvNum_To ;
   private int AV56TFPrvDiaPag ;
   private int AV57TFPrvDiaPag_To ;
   private int AV58TFPrvPer ;
   private int AV59TFPrvPer_To ;
   private int AV60TFPrvBan ;
   private int AV61TFPrvBan_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A795PrvNum ;
   private int A785PrvDiaPag ;
   private int A797PrvPer ;
   private int A780PrvBan ;
   private int subGrid_Islastpage ;
   private int AV149Tprvgenwwds_2_tfprvnum ;
   private int AV150Tprvgenwwds_3_tfprvnum_to ;
   private int AV171Tprvgenwwds_24_tfprvdiapag ;
   private int AV172Tprvgenwwds_25_tfprvdiapag_to ;
   private int AV173Tprvgenwwds_26_tfprvper ;
   private int AV174Tprvgenwwds_27_tfprvper_to ;
   private int AV175Tprvgenwwds_28_tfprvban ;
   private int AV176Tprvgenwwds_29_tfprvban_to ;
   private int AV166Tprvgenwwds_19_tfprvtip_sels_size ;
   private int AV181Tprvgenwwds_34_tfprvmettra_sels_size ;
   private int AV184Tprvgenwwds_37_tfprvdivcod_sels_size ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int edtPrvDir_Visible ;
   private int edtPrvCpo_Visible ;
   private int edtPrvPob_Visible ;
   private int edtPrvNif_Visible ;
   private int edtPrvTlf_Visible ;
   private int edtPrvTlx_Visible ;
   private int edtFpgCod_Visible ;
   private int edtPrvVto_Visible ;
   private int edtPrvDiaPag_Visible ;
   private int edtPrvPer_Visible ;
   private int edtPrvBan_Visible ;
   private int edtPrvRep_Visible ;
   private int edtPrvPlaEnt_Visible ;
   private int edtPrvCta_Visible ;
   private int edtPrvDivCo_Visible ;
   private int AV77PageToGo ;
   private int AV188GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV78GridCurrentPage ;
   private long AV79GridPageCount ;
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
   private String A396EmprCod ;
   private String AV30TFPrvNom ;
   private String AV31TFPrvNom_Sel ;
   private String AV34TFPrvDir ;
   private String AV35TFPrvDir_Sel ;
   private String AV36TFPrvCpo ;
   private String AV37TFPrvCpo_Sel ;
   private String AV38TFPrvPob ;
   private String AV39TFPrvPob_Sel ;
   private String AV40TFPrvNif ;
   private String AV41TFPrvNif_Sel ;
   private String AV42TFPrvTlf ;
   private String AV43TFPrvTlf_Sel ;
   private String AV46TFPrvTlx ;
   private String AV47TFPrvTlx_Sel ;
   private String AV50TFFpgCod ;
   private String AV51TFFpgCod_Sel ;
   private String AV62TFPrvRep ;
   private String AV63TFPrvRep_Sel ;
   private String AV68TFPrvCta ;
   private String AV69TFPrvCta_Sel ;
   private String AV144TFPrvAct_Sel ;
   private String AV147Pgmname ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String A786PrvDir ;
   private String edtPrvDir_Internalname ;
   private String A782PrvCpo ;
   private String edtPrvCpo_Internalname ;
   private String A799PrvPob ;
   private String edtPrvPob_Internalname ;
   private String A793PrvNif ;
   private String edtPrvNif_Internalname ;
   private String A803PrvTlf ;
   private String edtPrvTlf_Internalname ;
   private String A804PrvTlx ;
   private String edtPrvTlx_Internalname ;
   private String A802PrvTip ;
   private String A497FpgCod ;
   private String edtFpgCod_Internalname ;
   private String edtPrvVto_Internalname ;
   private String edtPrvDiaPag_Internalname ;
   private String edtPrvPer_Internalname ;
   private String edtPrvBan_Internalname ;
   private String A801PrvRep ;
   private String edtPrvRep_Internalname ;
   private String edtPrvPlaEnt_Internalname ;
   private String A792PrvMetTra ;
   private String A783PrvCta ;
   private String edtPrvCta_Internalname ;
   private String A3092PrvDivCod ;
   private String edtPrvDivCo_Internalname ;
   private String A14216PrvAct ;
   private String edtavFilterfulltext_Internalname ;
   private String AV151Tprvgenwwds_4_tfprvnom ;
   private String AV152Tprvgenwwds_5_tfprvnom_sel ;
   private String AV153Tprvgenwwds_6_tfprvdir ;
   private String AV154Tprvgenwwds_7_tfprvdir_sel ;
   private String AV155Tprvgenwwds_8_tfprvcpo ;
   private String AV156Tprvgenwwds_9_tfprvcpo_sel ;
   private String AV157Tprvgenwwds_10_tfprvpob ;
   private String AV158Tprvgenwwds_11_tfprvpob_sel ;
   private String AV159Tprvgenwwds_12_tfprvnif ;
   private String AV160Tprvgenwwds_13_tfprvnif_sel ;
   private String AV161Tprvgenwwds_14_tfprvtlf ;
   private String AV162Tprvgenwwds_15_tfprvtlf_sel ;
   private String AV164Tprvgenwwds_17_tfprvtlx ;
   private String AV165Tprvgenwwds_18_tfprvtlx_sel ;
   private String AV167Tprvgenwwds_20_tffpgcod ;
   private String AV168Tprvgenwwds_21_tffpgcod_sel ;
   private String AV177Tprvgenwwds_30_tfprvrep ;
   private String AV178Tprvgenwwds_31_tfprvrep_sel ;
   private String AV182Tprvgenwwds_35_tfprvcta ;
   private String AV183Tprvgenwwds_36_tfprvcta_sel ;
   private String AV187Tprvgenwwds_40_tfprvact_sel ;
   private String scmdbuf ;
   private String lV151Tprvgenwwds_4_tfprvnom ;
   private String lV153Tprvgenwwds_6_tfprvdir ;
   private String lV155Tprvgenwwds_8_tfprvcpo ;
   private String lV157Tprvgenwwds_10_tfprvpob ;
   private String lV159Tprvgenwwds_12_tfprvnif ;
   private String lV161Tprvgenwwds_14_tfprvtlf ;
   private String lV164Tprvgenwwds_17_tfprvtlx ;
   private String lV167Tprvgenwwds_20_tffpgcod ;
   private String lV177Tprvgenwwds_30_tfprvrep ;
   private String lV182Tprvgenwwds_35_tfprvcta ;
   private String hsh ;
   private String AV82Station ;
   private String AV84EmprNom ;
   private String AV85UsurCod ;
   private String AV83EmprCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char13 ;
   private String GXv_char2[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char34 ;
   private String GXv_char35[] ;
   private String GXt_char32 ;
   private String GXv_char33[] ;
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
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrvDir_Jsonclick ;
   private String edtPrvCpo_Jsonclick ;
   private String edtPrvPob_Jsonclick ;
   private String edtPrvNif_Jsonclick ;
   private String edtPrvTlf_Jsonclick ;
   private String edtPrvTlx_Jsonclick ;
   private String edtFpgCod_Jsonclick ;
   private String edtPrvVto_Jsonclick ;
   private String edtPrvDiaPag_Jsonclick ;
   private String edtPrvPer_Jsonclick ;
   private String edtPrvBan_Jsonclick ;
   private String edtPrvRep_Jsonclick ;
   private String edtPrvPlaEnt_Jsonclick ;
   private String edtPrvCta_Jsonclick ;
   private String edtPrvDivCo_Jsonclick ;
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
   private boolean n794PrvNom ;
   private boolean n786PrvDir ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n793PrvNif ;
   private boolean n803PrvTlf ;
   private boolean n800PrvPri ;
   private boolean n804PrvTlx ;
   private boolean n802PrvTip ;
   private boolean n497FpgCod ;
   private boolean n805PrvVto ;
   private boolean n785PrvDiaPag ;
   private boolean n797PrvPer ;
   private boolean n780PrvBan ;
   private boolean n801PrvRep ;
   private boolean n798PrvPlaEnt ;
   private boolean n792PrvMetTra ;
   private boolean n783PrvCta ;
   private boolean n3092PrvDivCod ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV112TFPrvTip_SelsJson ;
   private String AV114TFPrvMetTra_SelsJson ;
   private String AV70TFPrvDivCod_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV148Tprvgenwwds_1_filterfulltext ;
   private String lV148Tprvgenwwds_1_filterfulltext ;
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
   private ICheckbox chkPrvPri ;
   private HTMLChoice cmbPrvTip ;
   private HTMLChoice cmbPrvMetTra ;
   private HTMLChoice cmbPrvDivCod ;
   private ICheckbox chkPrvAct ;
   private IDataStoreProvider pr_default ;
   private String[] H00GP2_A396EmprCod ;
   private String[] H00GP2_A14216PrvAct ;
   private byte[] H00GP2_A3143PrvDivCo ;
   private String[] H00GP2_A3092PrvDivCod ;
   private boolean[] H00GP2_n3092PrvDivCod ;
   private String[] H00GP2_A783PrvCta ;
   private boolean[] H00GP2_n783PrvCta ;
   private String[] H00GP2_A792PrvMetTra ;
   private boolean[] H00GP2_n792PrvMetTra ;
   private short[] H00GP2_A798PrvPlaEnt ;
   private boolean[] H00GP2_n798PrvPlaEnt ;
   private String[] H00GP2_A801PrvRep ;
   private boolean[] H00GP2_n801PrvRep ;
   private int[] H00GP2_A780PrvBan ;
   private boolean[] H00GP2_n780PrvBan ;
   private int[] H00GP2_A797PrvPer ;
   private boolean[] H00GP2_n797PrvPer ;
   private int[] H00GP2_A785PrvDiaPag ;
   private boolean[] H00GP2_n785PrvDiaPag ;
   private byte[] H00GP2_A805PrvVto ;
   private boolean[] H00GP2_n805PrvVto ;
   private String[] H00GP2_A497FpgCod ;
   private boolean[] H00GP2_n497FpgCod ;
   private String[] H00GP2_A802PrvTip ;
   private boolean[] H00GP2_n802PrvTip ;
   private String[] H00GP2_A804PrvTlx ;
   private boolean[] H00GP2_n804PrvTlx ;
   private byte[] H00GP2_A800PrvPri ;
   private boolean[] H00GP2_n800PrvPri ;
   private String[] H00GP2_A803PrvTlf ;
   private boolean[] H00GP2_n803PrvTlf ;
   private String[] H00GP2_A793PrvNif ;
   private boolean[] H00GP2_n793PrvNif ;
   private String[] H00GP2_A799PrvPob ;
   private boolean[] H00GP2_n799PrvPob ;
   private String[] H00GP2_A782PrvCpo ;
   private boolean[] H00GP2_n782PrvCpo ;
   private String[] H00GP2_A786PrvDir ;
   private boolean[] H00GP2_n786PrvDir ;
   private String[] H00GP2_A794PrvNom ;
   private boolean[] H00GP2_n794PrvNom ;
   private int[] H00GP2_A795PrvNum ;
   private String[] H00GP3_A396EmprCod ;
   private String[] H00GP3_A14216PrvAct ;
   private byte[] H00GP3_A3143PrvDivCo ;
   private String[] H00GP3_A3092PrvDivCod ;
   private boolean[] H00GP3_n3092PrvDivCod ;
   private String[] H00GP3_A783PrvCta ;
   private boolean[] H00GP3_n783PrvCta ;
   private String[] H00GP3_A792PrvMetTra ;
   private boolean[] H00GP3_n792PrvMetTra ;
   private short[] H00GP3_A798PrvPlaEnt ;
   private boolean[] H00GP3_n798PrvPlaEnt ;
   private String[] H00GP3_A801PrvRep ;
   private boolean[] H00GP3_n801PrvRep ;
   private int[] H00GP3_A780PrvBan ;
   private boolean[] H00GP3_n780PrvBan ;
   private int[] H00GP3_A797PrvPer ;
   private boolean[] H00GP3_n797PrvPer ;
   private int[] H00GP3_A785PrvDiaPag ;
   private boolean[] H00GP3_n785PrvDiaPag ;
   private byte[] H00GP3_A805PrvVto ;
   private boolean[] H00GP3_n805PrvVto ;
   private String[] H00GP3_A497FpgCod ;
   private boolean[] H00GP3_n497FpgCod ;
   private String[] H00GP3_A802PrvTip ;
   private boolean[] H00GP3_n802PrvTip ;
   private String[] H00GP3_A804PrvTlx ;
   private boolean[] H00GP3_n804PrvTlx ;
   private byte[] H00GP3_A800PrvPri ;
   private boolean[] H00GP3_n800PrvPri ;
   private String[] H00GP3_A803PrvTlf ;
   private boolean[] H00GP3_n803PrvTlf ;
   private String[] H00GP3_A793PrvNif ;
   private boolean[] H00GP3_n793PrvNif ;
   private String[] H00GP3_A799PrvPob ;
   private boolean[] H00GP3_n799PrvPob ;
   private String[] H00GP3_A782PrvCpo ;
   private boolean[] H00GP3_n782PrvCpo ;
   private String[] H00GP3_A786PrvDir ;
   private boolean[] H00GP3_n786PrvDir ;
   private String[] H00GP3_A794PrvNom ;
   private boolean[] H00GP3_n794PrvNom ;
   private int[] H00GP3_A795PrvNum ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV113TFPrvTip_Sels ;
   private GXSimpleCollection<String> AV115TFPrvMetTra_Sels ;
   private GXSimpleCollection<String> AV71TFPrvDivCod_Sels ;
   private GXSimpleCollection<String> AV166Tprvgenwwds_19_tfprvtip_sels ;
   private GXSimpleCollection<String> AV181Tprvgenwwds_34_tfprvmettra_sels ;
   private GXSimpleCollection<String> AV184Tprvgenwwds_37_tfprvdivcod_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState36[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV76DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tprvgenww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00GP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV166Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV181Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV184Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV149Tprvgenwwds_2_tfprvnum ,
                                          int AV150Tprvgenwwds_3_tfprvnum_to ,
                                          String AV152Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV151Tprvgenwwds_4_tfprvnom ,
                                          String AV154Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV153Tprvgenwwds_6_tfprvdir ,
                                          String AV156Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV155Tprvgenwwds_8_tfprvcpo ,
                                          String AV158Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV157Tprvgenwwds_10_tfprvpob ,
                                          String AV160Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV159Tprvgenwwds_12_tfprvnif ,
                                          String AV162Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV161Tprvgenwwds_14_tfprvtlf ,
                                          byte AV163Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV165Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV164Tprvgenwwds_17_tfprvtlx ,
                                          int AV166Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV168Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV167Tprvgenwwds_20_tffpgcod ,
                                          byte AV169Tprvgenwwds_22_tfprvvto ,
                                          byte AV170Tprvgenwwds_23_tfprvvto_to ,
                                          int AV171Tprvgenwwds_24_tfprvdiapag ,
                                          int AV172Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV173Tprvgenwwds_26_tfprvper ,
                                          int AV174Tprvgenwwds_27_tfprvper_to ,
                                          int AV175Tprvgenwwds_28_tfprvban ,
                                          int AV176Tprvgenwwds_29_tfprvban_to ,
                                          String AV178Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV177Tprvgenwwds_30_tfprvrep ,
                                          short AV179Tprvgenwwds_32_tfprvplaent ,
                                          short AV180Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV181Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV183Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV182Tprvgenwwds_35_tfprvcta ,
                                          int AV184Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV185Tprvgenwwds_38_tfprvdivco ,
                                          byte AV186Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV187Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV148Tprvgenwwds_1_filterfulltext ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int37 = new byte[36];
      Object[] GXv_Object38 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrvAct, PrvDivCo, PrvDivCod, PrvCta, PrvMetTra, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTip, PrvTlx, PrvPri, PrvTlf, PrvNif," ;
      scmdbuf += " PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum FROM TXPPRVGEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (0==AV149Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int37[1] = (byte)(1) ;
      }
      if ( ! (0==AV150Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int37[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV151Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int37[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV153Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int37[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV155Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int37[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV157Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int37[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV159Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int37[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV161Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int37[14] = (byte)(1) ;
      }
      if ( AV163Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV163Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV165Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV164Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int37[16] = (byte)(1) ;
      }
      if ( AV166Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV166Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV168Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV167Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int37[18] = (byte)(1) ;
      }
      if ( ! (0==AV169Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int37[19] = (byte)(1) ;
      }
      if ( ! (0==AV170Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int37[20] = (byte)(1) ;
      }
      if ( ! (0==AV171Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int37[21] = (byte)(1) ;
      }
      if ( ! (0==AV172Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int37[22] = (byte)(1) ;
      }
      if ( ! (0==AV173Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int37[23] = (byte)(1) ;
      }
      if ( ! (0==AV174Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int37[24] = (byte)(1) ;
      }
      if ( ! (0==AV175Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int37[25] = (byte)(1) ;
      }
      if ( ! (0==AV176Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int37[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV177Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int37[28] = (byte)(1) ;
      }
      if ( ! (0==AV179Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int37[29] = (byte)(1) ;
      }
      if ( ! (0==AV180Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int37[30] = (byte)(1) ;
      }
      if ( AV181Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV181Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV183Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV182Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV183Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int37[32] = (byte)(1) ;
      }
      if ( AV184Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV184Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV185Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int37[33] = (byte)(1) ;
      }
      if ( ! (0==AV186Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int37[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int37[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDir" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDir DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvCpo" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvCpo DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPob" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPob DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNif" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNif DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTlf" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTlf DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPri" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPri DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTlx" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTlx DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTip" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTip DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY FpgCod" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY FpgCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvVto" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvVto DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDiaPag" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDiaPag DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPer" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPer DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvBan" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvBan DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvRep" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvRep DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPlaEnt" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPlaEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvMetTra" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvMetTra DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvCta" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvCta DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDivCod" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDivCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDivCo" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDivCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvAct" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvAct DESC" ;
      }
      GXv_Object38[0] = scmdbuf ;
      GXv_Object38[1] = GXv_int37 ;
      return GXv_Object38 ;
   }

   protected Object[] conditional_H00GP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV166Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV181Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV184Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV149Tprvgenwwds_2_tfprvnum ,
                                          int AV150Tprvgenwwds_3_tfprvnum_to ,
                                          String AV152Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV151Tprvgenwwds_4_tfprvnom ,
                                          String AV154Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV153Tprvgenwwds_6_tfprvdir ,
                                          String AV156Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV155Tprvgenwwds_8_tfprvcpo ,
                                          String AV158Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV157Tprvgenwwds_10_tfprvpob ,
                                          String AV160Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV159Tprvgenwwds_12_tfprvnif ,
                                          String AV162Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV161Tprvgenwwds_14_tfprvtlf ,
                                          byte AV163Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV165Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV164Tprvgenwwds_17_tfprvtlx ,
                                          int AV166Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV168Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV167Tprvgenwwds_20_tffpgcod ,
                                          byte AV169Tprvgenwwds_22_tfprvvto ,
                                          byte AV170Tprvgenwwds_23_tfprvvto_to ,
                                          int AV171Tprvgenwwds_24_tfprvdiapag ,
                                          int AV172Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV173Tprvgenwwds_26_tfprvper ,
                                          int AV174Tprvgenwwds_27_tfprvper_to ,
                                          int AV175Tprvgenwwds_28_tfprvban ,
                                          int AV176Tprvgenwwds_29_tfprvban_to ,
                                          String AV178Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV177Tprvgenwwds_30_tfprvrep ,
                                          short AV179Tprvgenwwds_32_tfprvplaent ,
                                          short AV180Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV181Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV183Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV182Tprvgenwwds_35_tfprvcta ,
                                          int AV184Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV185Tprvgenwwds_38_tfprvdivco ,
                                          byte AV186Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV187Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV148Tprvgenwwds_1_filterfulltext ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int40 = new byte[36];
      Object[] GXv_Object41 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrvAct, PrvDivCo, PrvDivCod, PrvCta, PrvMetTra, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTip, PrvTlx, PrvPri, PrvTlf, PrvNif," ;
      scmdbuf += " PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum FROM TXPPRVGEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (0==AV149Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int40[1] = (byte)(1) ;
      }
      if ( ! (0==AV150Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int40[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV151Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int40[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV153Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int40[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV155Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int40[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV157Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int40[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV159Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int40[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV161Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int40[14] = (byte)(1) ;
      }
      if ( AV163Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV163Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV165Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV164Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int40[16] = (byte)(1) ;
      }
      if ( AV166Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV166Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV168Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV167Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int40[18] = (byte)(1) ;
      }
      if ( ! (0==AV169Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int40[19] = (byte)(1) ;
      }
      if ( ! (0==AV170Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int40[20] = (byte)(1) ;
      }
      if ( ! (0==AV171Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int40[21] = (byte)(1) ;
      }
      if ( ! (0==AV172Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int40[22] = (byte)(1) ;
      }
      if ( ! (0==AV173Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int40[23] = (byte)(1) ;
      }
      if ( ! (0==AV174Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int40[24] = (byte)(1) ;
      }
      if ( ! (0==AV175Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int40[25] = (byte)(1) ;
      }
      if ( ! (0==AV176Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int40[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV177Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int40[28] = (byte)(1) ;
      }
      if ( ! (0==AV179Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int40[29] = (byte)(1) ;
      }
      if ( ! (0==AV180Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int40[30] = (byte)(1) ;
      }
      if ( AV181Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV181Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV183Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV182Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV183Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int40[32] = (byte)(1) ;
      }
      if ( AV184Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV184Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV185Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int40[33] = (byte)(1) ;
      }
      if ( ! (0==AV186Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int40[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int40[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDir" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDir DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvCpo" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvCpo DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPob" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPob DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNif" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNif DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTlf" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTlf DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPri" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPri DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTlx" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTlx DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTip" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTip DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY FpgCod" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY FpgCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvVto" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvVto DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDiaPag" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDiaPag DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPer" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPer DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvBan" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvBan DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvRep" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvRep DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPlaEnt" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPlaEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvMetTra" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvMetTra DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvCta" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvCta DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDivCod" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDivCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDivCo" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDivCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvAct" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvAct DESC" ;
      }
      GXv_Object41[0] = scmdbuf ;
      GXv_Object41[1] = GXv_int40 ;
      return GXv_Object41 ;
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
                  return conditional_H00GP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] , (String)dynConstraints[67] );
            case 1 :
                  return conditional_H00GP3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] , (String)dynConstraints[67] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00GP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00GP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23);
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
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 18);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 14);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 18);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 14);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
      }
   }

}

