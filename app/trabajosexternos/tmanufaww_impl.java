package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmanufaww_impl extends GXDataArea
{
   public tmanufaww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmanufaww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmanufaww_impl.class ));
   }

   public tmanufaww_impl( int remoteHandle ,
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV26TFManCod = (short)(GXutil.lval( httpContext.GetPar( "TFManCod"))) ;
      AV27TFManCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFManCod_To"))) ;
      AV48TFManNif = httpContext.GetPar( "TFManNif") ;
      AV49TFManNif_Sel = httpContext.GetPar( "TFManNif_Sel") ;
      AV28TFManNom = httpContext.GetPar( "TFManNom") ;
      AV29TFManNom_Sel = httpContext.GetPar( "TFManNom_Sel") ;
      AV30TFManDom = httpContext.GetPar( "TFManDom") ;
      AV31TFManDom_Sel = httpContext.GetPar( "TFManDom_Sel") ;
      AV32TFManPob = httpContext.GetPar( "TFManPob") ;
      AV33TFManPob_Sel = httpContext.GetPar( "TFManPob_Sel") ;
      AV34TFManCpo = httpContext.GetPar( "TFManCpo") ;
      AV35TFManCpo_Sel = httpContext.GetPar( "TFManCpo_Sel") ;
      AV36TFManCp2 = httpContext.GetPar( "TFManCp2") ;
      AV37TFManCp2_Sel = httpContext.GetPar( "TFManCp2_Sel") ;
      AV38TFPrvCod = (short)(GXutil.lval( httpContext.GetPar( "TFPrvCod"))) ;
      AV39TFPrvCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFPrvCod_To"))) ;
      AV40TFPrvDsc = httpContext.GetPar( "TFPrvDsc") ;
      AV41TFPrvDsc_Sel = httpContext.GetPar( "TFPrvDsc_Sel") ;
      AV42TFManTel1 = httpContext.GetPar( "TFManTel1") ;
      AV43TFManTel1_Sel = httpContext.GetPar( "TFManTel1_Sel") ;
      AV44TFManTel2 = httpContext.GetPar( "TFManTel2") ;
      AV45TFManTel2_Sel = httpContext.GetPar( "TFManTel2_Sel") ;
      AV46TFManFax = httpContext.GetPar( "TFManFax") ;
      AV47TFManFax_Sel = httpContext.GetPar( "TFManFax_Sel") ;
      AV50TFManDto = CommonUtil.decimalVal( httpContext.GetPar( "TFManDto"), ".") ;
      AV51TFManDto_To = CommonUtil.decimalVal( httpContext.GetPar( "TFManDto_To"), ".") ;
      AV63Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFManCod, AV27TFManCod_To, AV48TFManNif, AV49TFManNif_Sel, AV28TFManNom, AV29TFManNom_Sel, AV30TFManDom, AV31TFManDom_Sel, AV32TFManPob, AV33TFManPob_Sel, AV34TFManCpo, AV35TFManCpo_Sel, AV36TFManCp2, AV37TFManCp2_Sel, AV38TFPrvCod, AV39TFPrvCod_To, AV40TFPrvDsc, AV41TFPrvDsc_Sel, AV42TFManTel1, AV43TFManTel1_Sel, AV44TFManTel2, AV45TFManTel2_Sel, AV46TFManFax, AV47TFManFax_Sel, AV50TFManDto, AV51TFManDto_To, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod) ;
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
      pa17L2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start17L2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.tmanufaww", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMANUFAWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV63Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\tmanufaww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANCOD", GXutil.ltrim( localUtil.ntoc( AV26TFManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANCOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFManCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANNIF", GXutil.rtrim( AV48TFManNif));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANNIF_SEL", GXutil.rtrim( AV49TFManNif_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANNOM", GXutil.rtrim( AV28TFManNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANNOM_SEL", GXutil.rtrim( AV29TFManNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANDOM", GXutil.rtrim( AV30TFManDom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANDOM_SEL", GXutil.rtrim( AV31TFManDom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANPOB", GXutil.rtrim( AV32TFManPob));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANPOB_SEL", GXutil.rtrim( AV33TFManPob_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANCPO", GXutil.rtrim( AV34TFManCpo));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANCPO_SEL", GXutil.rtrim( AV35TFManCpo_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANCP2", GXutil.rtrim( AV36TFManCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANCP2_SEL", GXutil.rtrim( AV37TFManCp2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVCOD", GXutil.ltrim( localUtil.ntoc( AV38TFPrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVCOD_TO", GXutil.ltrim( localUtil.ntoc( AV39TFPrvCod_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDSC", GXutil.rtrim( AV40TFPrvDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDSC_SEL", GXutil.rtrim( AV41TFPrvDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTEL1", GXutil.rtrim( AV42TFManTel1));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTEL1_SEL", GXutil.rtrim( AV43TFManTel1_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTEL2", GXutil.rtrim( AV44TFManTel2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTEL2_SEL", GXutil.rtrim( AV45TFManTel2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANFAX", GXutil.rtrim( AV46TFManFax));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANFAX_SEL", GXutil.rtrim( AV47TFManFax_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANDTO", GXutil.ltrim( localUtil.ntoc( AV50TFManDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANDTO_TO", GXutil.ltrim( localUtil.ntoc( AV51TFManDto_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we17L2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt17L2( ) ;
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
      return formatLink("app.trabajosexternos.tmanufaww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TMANUFAWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Manufacturadores", "") ;
   }

   public void wb17L0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TMANUFAWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TMANUFAWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TMANUFAWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TMANUFAWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_17L2( true) ;
      }
      else
      {
         wb_table1_25_17L2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_17L2e( boolean wbgen )
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
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV63Pgmname), GXutil.rtrim( localUtil.format( AV63Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFAWW.htm");
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
      if ( wbEnd == 43 )
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

   public void start17L2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Manufacturadores", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup17L0( ) ;
   }

   public void ws17L2( )
   {
      start17L2( ) ;
      evt17L2( ) ;
   }

   public void evt17L2( )
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
                           e1117L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1217L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1317L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1417L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1517L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1617L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1717L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e1817L2 ();
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
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV56GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
                           A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3302ManNif = GXutil.upper( httpContext.cgiGet( edtManNif_Internalname)) ;
                           n3302ManNif = false ;
                           A2249ManNom = httpContext.cgiGet( edtManNom_Internalname) ;
                           n2249ManNom = false ;
                           A2250ManDom = httpContext.cgiGet( edtManDom_Internalname) ;
                           n2250ManDom = false ;
                           A2251ManPob = httpContext.cgiGet( edtManPob_Internalname) ;
                           n2251ManPob = false ;
                           A2252ManCpo = httpContext.cgiGet( edtManCpo_Internalname) ;
                           n2252ManCpo = false ;
                           A10743ManCp2 = httpContext.cgiGet( edtManCp2_Internalname) ;
                           n10743ManCp2 = false ;
                           A781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n781PrvCod = false ;
                           A787PrvDsc = GXutil.upper( httpContext.cgiGet( edtPrvDsc_Internalname)) ;
                           n787PrvDsc = false ;
                           A3299ManTel1 = httpContext.cgiGet( edtManTel1_Internalname) ;
                           n3299ManTel1 = false ;
                           A3300ManTel2 = httpContext.cgiGet( edtManTel2_Internalname) ;
                           n3300ManTel2 = false ;
                           A3301ManFax = httpContext.cgiGet( edtManFax_Internalname) ;
                           n3301ManFax = false ;
                           A3409ManDto = localUtil.ctond( httpContext.cgiGet( edtManDto_Internalname)) ;
                           n3409ManDto = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1917L2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2017L2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2117L2 ();
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

   public void we17L2( )
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

   public void pa17L2( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 short AV26TFManCod ,
                                 short AV27TFManCod_To ,
                                 String AV48TFManNif ,
                                 String AV49TFManNif_Sel ,
                                 String AV28TFManNom ,
                                 String AV29TFManNom_Sel ,
                                 String AV30TFManDom ,
                                 String AV31TFManDom_Sel ,
                                 String AV32TFManPob ,
                                 String AV33TFManPob_Sel ,
                                 String AV34TFManCpo ,
                                 String AV35TFManCpo_Sel ,
                                 String AV36TFManCp2 ,
                                 String AV37TFManCp2_Sel ,
                                 short AV38TFPrvCod ,
                                 short AV39TFPrvCod_To ,
                                 String AV40TFPrvDsc ,
                                 String AV41TFPrvDsc_Sel ,
                                 String AV42TFManTel1 ,
                                 String AV43TFManTel1_Sel ,
                                 String AV44TFManTel2 ,
                                 String AV45TFManTel2_Sel ,
                                 String AV46TFManFax ,
                                 String AV47TFManFax_Sel ,
                                 java.math.BigDecimal AV50TFManDto ,
                                 java.math.BigDecimal AV51TFManDto_To ,
                                 String AV63Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2017L2 ();
      GRID_nCurrentRecord = 0 ;
      rf17L2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMANUFAWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV63Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\tmanufaww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MANCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "MANCOD", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")));
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
      rf17L2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV63Pgmname = "TrabajosExternos.TMANUFAWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf17L2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e2017L2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV64Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                              Short.valueOf(AV65Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                              Short.valueOf(AV66Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                              AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                              AV67Trabajosexternos_tmanufawwds_4_tfmannif ,
                                              AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                              AV69Trabajosexternos_tmanufawwds_6_tfmannom ,
                                              AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                              AV71Trabajosexternos_tmanufawwds_8_tfmandom ,
                                              AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                              AV73Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                              AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                              AV75Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                              AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                              AV77Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                              Short.valueOf(AV79Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                              Short.valueOf(AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                              AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                              AV81Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                              AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                              AV83Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                              AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                              AV85Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                              AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                              AV87Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                              AV89Trabajosexternos_tmanufawwds_26_tfmandto ,
                                              AV90Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                              Short.valueOf(A2248ManCod) ,
                                              A3302ManNif ,
                                              A2249ManNom ,
                                              A2250ManDom ,
                                              A2251ManPob ,
                                              A2252ManCpo ,
                                              A10743ManCp2 ,
                                              Short.valueOf(A781PrvCod) ,
                                              A787PrvDsc ,
                                              A3299ManTel1 ,
                                              A3300ManTel2 ,
                                              A3301ManFax ,
                                              A3409ManDto ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
         lV67Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV67Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
         lV69Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV69Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
         lV71Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV71Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
         lV73Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV73Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
         lV75Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV75Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
         lV77Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV77Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
         lV81Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV81Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
         lV83Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV83Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
         lV85Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV85Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
         lV87Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV87Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
         /* Using cursor H017L2 */
         pr_default.execute(0, new Object[] {lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV65Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV66Trabajosexternos_tmanufawwds_3_tfmancod_to), lV67Trabajosexternos_tmanufawwds_4_tfmannif, AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV69Trabajosexternos_tmanufawwds_6_tfmannom, AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV71Trabajosexternos_tmanufawwds_8_tfmandom, AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV73Trabajosexternos_tmanufawwds_10_tfmanpob, AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV75Trabajosexternos_tmanufawwds_12_tfmancpo, AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV77Trabajosexternos_tmanufawwds_14_tfmancp2, AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV79Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV81Trabajosexternos_tmanufawwds_18_tfprvdsc, AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV83Trabajosexternos_tmanufawwds_20_tfmantel1, AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV85Trabajosexternos_tmanufawwds_22_tfmantel2, AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV87Trabajosexternos_tmanufawwds_24_tfmanfax, AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV89Trabajosexternos_tmanufawwds_26_tfmandto, AV90Trabajosexternos_tmanufawwds_27_tfmandto_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H017L2_A396EmprCod[0] ;
            A3409ManDto = H017L2_A3409ManDto[0] ;
            n3409ManDto = H017L2_n3409ManDto[0] ;
            A3301ManFax = H017L2_A3301ManFax[0] ;
            n3301ManFax = H017L2_n3301ManFax[0] ;
            A3300ManTel2 = H017L2_A3300ManTel2[0] ;
            n3300ManTel2 = H017L2_n3300ManTel2[0] ;
            A3299ManTel1 = H017L2_A3299ManTel1[0] ;
            n3299ManTel1 = H017L2_n3299ManTel1[0] ;
            A787PrvDsc = H017L2_A787PrvDsc[0] ;
            n787PrvDsc = H017L2_n787PrvDsc[0] ;
            A781PrvCod = H017L2_A781PrvCod[0] ;
            n781PrvCod = H017L2_n781PrvCod[0] ;
            A10743ManCp2 = H017L2_A10743ManCp2[0] ;
            n10743ManCp2 = H017L2_n10743ManCp2[0] ;
            A2252ManCpo = H017L2_A2252ManCpo[0] ;
            n2252ManCpo = H017L2_n2252ManCpo[0] ;
            A2251ManPob = H017L2_A2251ManPob[0] ;
            n2251ManPob = H017L2_n2251ManPob[0] ;
            A2250ManDom = H017L2_A2250ManDom[0] ;
            n2250ManDom = H017L2_n2250ManDom[0] ;
            A2249ManNom = H017L2_A2249ManNom[0] ;
            n2249ManNom = H017L2_n2249ManNom[0] ;
            A3302ManNif = H017L2_A3302ManNif[0] ;
            n3302ManNif = H017L2_n3302ManNif[0] ;
            A2248ManCod = H017L2_A2248ManCod[0] ;
            A787PrvDsc = H017L2_A787PrvDsc[0] ;
            n787PrvDsc = H017L2_n787PrvDsc[0] ;
            e2117L2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wb17L0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes17L2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MANCOD"+"_"+sGXsfl_43_idx, getSecureSignedToken( sGXsfl_43_idx, localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")));
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
      AV64Trabajosexternos_tmanufawwds_1_filterfulltext = AV15FilterFullText ;
      AV65Trabajosexternos_tmanufawwds_2_tfmancod = AV26TFManCod ;
      AV66Trabajosexternos_tmanufawwds_3_tfmancod_to = AV27TFManCod_To ;
      AV67Trabajosexternos_tmanufawwds_4_tfmannif = AV48TFManNif ;
      AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV49TFManNif_Sel ;
      AV69Trabajosexternos_tmanufawwds_6_tfmannom = AV28TFManNom ;
      AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV29TFManNom_Sel ;
      AV71Trabajosexternos_tmanufawwds_8_tfmandom = AV30TFManDom ;
      AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV31TFManDom_Sel ;
      AV73Trabajosexternos_tmanufawwds_10_tfmanpob = AV32TFManPob ;
      AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV33TFManPob_Sel ;
      AV75Trabajosexternos_tmanufawwds_12_tfmancpo = AV34TFManCpo ;
      AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV35TFManCpo_Sel ;
      AV77Trabajosexternos_tmanufawwds_14_tfmancp2 = AV36TFManCp2 ;
      AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV37TFManCp2_Sel ;
      AV79Trabajosexternos_tmanufawwds_16_tfprvcod = AV38TFPrvCod ;
      AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV39TFPrvCod_To ;
      AV81Trabajosexternos_tmanufawwds_18_tfprvdsc = AV40TFPrvDsc ;
      AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV41TFPrvDsc_Sel ;
      AV83Trabajosexternos_tmanufawwds_20_tfmantel1 = AV42TFManTel1 ;
      AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV43TFManTel1_Sel ;
      AV85Trabajosexternos_tmanufawwds_22_tfmantel2 = AV44TFManTel2 ;
      AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV45TFManTel2_Sel ;
      AV87Trabajosexternos_tmanufawwds_24_tfmanfax = AV46TFManFax ;
      AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV47TFManFax_Sel ;
      AV89Trabajosexternos_tmanufawwds_26_tfmandto = AV50TFManDto ;
      AV90Trabajosexternos_tmanufawwds_27_tfmandto_to = AV51TFManDto_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV64Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                           Short.valueOf(AV65Trabajosexternos_tmanufawwds_2_tfmancod) ,
                                           Short.valueOf(AV66Trabajosexternos_tmanufawwds_3_tfmancod_to) ,
                                           AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                           AV67Trabajosexternos_tmanufawwds_4_tfmannif ,
                                           AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                           AV69Trabajosexternos_tmanufawwds_6_tfmannom ,
                                           AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                           AV71Trabajosexternos_tmanufawwds_8_tfmandom ,
                                           AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                           AV73Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                           AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                           AV75Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                           AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                           AV77Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                           Short.valueOf(AV79Trabajosexternos_tmanufawwds_16_tfprvcod) ,
                                           Short.valueOf(AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to) ,
                                           AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                           AV81Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                           AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                           AV83Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                           AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                           AV85Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                           AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                           AV87Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                           AV89Trabajosexternos_tmanufawwds_26_tfmandto ,
                                           AV90Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                           Short.valueOf(A2248ManCod) ,
                                           A3302ManNif ,
                                           A2249ManNom ,
                                           A2250ManDom ,
                                           A2251ManPob ,
                                           A2252ManCpo ,
                                           A10743ManCp2 ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A3299ManTel1 ,
                                           A3300ManTel2 ,
                                           A3301ManFax ,
                                           A3409ManDto ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Trabajosexternos_tmanufawwds_1_filterfulltext), "%", "") ;
      lV67Trabajosexternos_tmanufawwds_4_tfmannif = GXutil.padr( GXutil.rtrim( AV67Trabajosexternos_tmanufawwds_4_tfmannif), 20, "%") ;
      lV69Trabajosexternos_tmanufawwds_6_tfmannom = GXutil.padr( GXutil.rtrim( AV69Trabajosexternos_tmanufawwds_6_tfmannom), 30, "%") ;
      lV71Trabajosexternos_tmanufawwds_8_tfmandom = GXutil.padr( GXutil.rtrim( AV71Trabajosexternos_tmanufawwds_8_tfmandom), 34, "%") ;
      lV73Trabajosexternos_tmanufawwds_10_tfmanpob = GXutil.padr( GXutil.rtrim( AV73Trabajosexternos_tmanufawwds_10_tfmanpob), 30, "%") ;
      lV75Trabajosexternos_tmanufawwds_12_tfmancpo = GXutil.padr( GXutil.rtrim( AV75Trabajosexternos_tmanufawwds_12_tfmancpo), 6, "%") ;
      lV77Trabajosexternos_tmanufawwds_14_tfmancp2 = GXutil.padr( GXutil.rtrim( AV77Trabajosexternos_tmanufawwds_14_tfmancp2), 6, "%") ;
      lV81Trabajosexternos_tmanufawwds_18_tfprvdsc = GXutil.padr( GXutil.rtrim( AV81Trabajosexternos_tmanufawwds_18_tfprvdsc), 30, "%") ;
      lV83Trabajosexternos_tmanufawwds_20_tfmantel1 = GXutil.padr( GXutil.rtrim( AV83Trabajosexternos_tmanufawwds_20_tfmantel1), 9, "%") ;
      lV85Trabajosexternos_tmanufawwds_22_tfmantel2 = GXutil.padr( GXutil.rtrim( AV85Trabajosexternos_tmanufawwds_22_tfmantel2), 9, "%") ;
      lV87Trabajosexternos_tmanufawwds_24_tfmanfax = GXutil.padr( GXutil.rtrim( AV87Trabajosexternos_tmanufawwds_24_tfmanfax), 10, "%") ;
      /* Using cursor H017L3 */
      pr_default.execute(1, new Object[] {lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, lV64Trabajosexternos_tmanufawwds_1_filterfulltext, Short.valueOf(AV65Trabajosexternos_tmanufawwds_2_tfmancod), Short.valueOf(AV66Trabajosexternos_tmanufawwds_3_tfmancod_to), lV67Trabajosexternos_tmanufawwds_4_tfmannif, AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel, lV69Trabajosexternos_tmanufawwds_6_tfmannom, AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel, lV71Trabajosexternos_tmanufawwds_8_tfmandom, AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel, lV73Trabajosexternos_tmanufawwds_10_tfmanpob, AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel, lV75Trabajosexternos_tmanufawwds_12_tfmancpo, AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel, lV77Trabajosexternos_tmanufawwds_14_tfmancp2, AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel, Short.valueOf(AV79Trabajosexternos_tmanufawwds_16_tfprvcod), Short.valueOf(AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to), lV81Trabajosexternos_tmanufawwds_18_tfprvdsc, AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel, lV83Trabajosexternos_tmanufawwds_20_tfmantel1, AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel, lV85Trabajosexternos_tmanufawwds_22_tfmantel2, AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel, lV87Trabajosexternos_tmanufawwds_24_tfmanfax, AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel, AV89Trabajosexternos_tmanufawwds_26_tfmandto, AV90Trabajosexternos_tmanufawwds_27_tfmandto_to});
      GRID_nRecordCount = H017L3_AGRID_nRecordCount[0] ;
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
      AV64Trabajosexternos_tmanufawwds_1_filterfulltext = AV15FilterFullText ;
      AV65Trabajosexternos_tmanufawwds_2_tfmancod = AV26TFManCod ;
      AV66Trabajosexternos_tmanufawwds_3_tfmancod_to = AV27TFManCod_To ;
      AV67Trabajosexternos_tmanufawwds_4_tfmannif = AV48TFManNif ;
      AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV49TFManNif_Sel ;
      AV69Trabajosexternos_tmanufawwds_6_tfmannom = AV28TFManNom ;
      AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV29TFManNom_Sel ;
      AV71Trabajosexternos_tmanufawwds_8_tfmandom = AV30TFManDom ;
      AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV31TFManDom_Sel ;
      AV73Trabajosexternos_tmanufawwds_10_tfmanpob = AV32TFManPob ;
      AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV33TFManPob_Sel ;
      AV75Trabajosexternos_tmanufawwds_12_tfmancpo = AV34TFManCpo ;
      AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV35TFManCpo_Sel ;
      AV77Trabajosexternos_tmanufawwds_14_tfmancp2 = AV36TFManCp2 ;
      AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV37TFManCp2_Sel ;
      AV79Trabajosexternos_tmanufawwds_16_tfprvcod = AV38TFPrvCod ;
      AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV39TFPrvCod_To ;
      AV81Trabajosexternos_tmanufawwds_18_tfprvdsc = AV40TFPrvDsc ;
      AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV41TFPrvDsc_Sel ;
      AV83Trabajosexternos_tmanufawwds_20_tfmantel1 = AV42TFManTel1 ;
      AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV43TFManTel1_Sel ;
      AV85Trabajosexternos_tmanufawwds_22_tfmantel2 = AV44TFManTel2 ;
      AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV45TFManTel2_Sel ;
      AV87Trabajosexternos_tmanufawwds_24_tfmanfax = AV46TFManFax ;
      AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV47TFManFax_Sel ;
      AV89Trabajosexternos_tmanufawwds_26_tfmandto = AV50TFManDto ;
      AV90Trabajosexternos_tmanufawwds_27_tfmandto_to = AV51TFManDto_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFManCod, AV27TFManCod_To, AV48TFManNif, AV49TFManNif_Sel, AV28TFManNom, AV29TFManNom_Sel, AV30TFManDom, AV31TFManDom_Sel, AV32TFManPob, AV33TFManPob_Sel, AV34TFManCpo, AV35TFManCpo_Sel, AV36TFManCp2, AV37TFManCp2_Sel, AV38TFPrvCod, AV39TFPrvCod_To, AV40TFPrvDsc, AV41TFPrvDsc_Sel, AV42TFManTel1, AV43TFManTel1_Sel, AV44TFManTel2, AV45TFManTel2_Sel, AV46TFManFax, AV47TFManFax_Sel, AV50TFManDto, AV51TFManDto_To, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV64Trabajosexternos_tmanufawwds_1_filterfulltext = AV15FilterFullText ;
      AV65Trabajosexternos_tmanufawwds_2_tfmancod = AV26TFManCod ;
      AV66Trabajosexternos_tmanufawwds_3_tfmancod_to = AV27TFManCod_To ;
      AV67Trabajosexternos_tmanufawwds_4_tfmannif = AV48TFManNif ;
      AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV49TFManNif_Sel ;
      AV69Trabajosexternos_tmanufawwds_6_tfmannom = AV28TFManNom ;
      AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV29TFManNom_Sel ;
      AV71Trabajosexternos_tmanufawwds_8_tfmandom = AV30TFManDom ;
      AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV31TFManDom_Sel ;
      AV73Trabajosexternos_tmanufawwds_10_tfmanpob = AV32TFManPob ;
      AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV33TFManPob_Sel ;
      AV75Trabajosexternos_tmanufawwds_12_tfmancpo = AV34TFManCpo ;
      AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV35TFManCpo_Sel ;
      AV77Trabajosexternos_tmanufawwds_14_tfmancp2 = AV36TFManCp2 ;
      AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV37TFManCp2_Sel ;
      AV79Trabajosexternos_tmanufawwds_16_tfprvcod = AV38TFPrvCod ;
      AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV39TFPrvCod_To ;
      AV81Trabajosexternos_tmanufawwds_18_tfprvdsc = AV40TFPrvDsc ;
      AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV41TFPrvDsc_Sel ;
      AV83Trabajosexternos_tmanufawwds_20_tfmantel1 = AV42TFManTel1 ;
      AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV43TFManTel1_Sel ;
      AV85Trabajosexternos_tmanufawwds_22_tfmantel2 = AV44TFManTel2 ;
      AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV45TFManTel2_Sel ;
      AV87Trabajosexternos_tmanufawwds_24_tfmanfax = AV46TFManFax ;
      AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV47TFManFax_Sel ;
      AV89Trabajosexternos_tmanufawwds_26_tfmandto = AV50TFManDto ;
      AV90Trabajosexternos_tmanufawwds_27_tfmandto_to = AV51TFManDto_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFManCod, AV27TFManCod_To, AV48TFManNif, AV49TFManNif_Sel, AV28TFManNom, AV29TFManNom_Sel, AV30TFManDom, AV31TFManDom_Sel, AV32TFManPob, AV33TFManPob_Sel, AV34TFManCpo, AV35TFManCpo_Sel, AV36TFManCp2, AV37TFManCp2_Sel, AV38TFPrvCod, AV39TFPrvCod_To, AV40TFPrvDsc, AV41TFPrvDsc_Sel, AV42TFManTel1, AV43TFManTel1_Sel, AV44TFManTel2, AV45TFManTel2_Sel, AV46TFManFax, AV47TFManFax_Sel, AV50TFManDto, AV51TFManDto_To, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV64Trabajosexternos_tmanufawwds_1_filterfulltext = AV15FilterFullText ;
      AV65Trabajosexternos_tmanufawwds_2_tfmancod = AV26TFManCod ;
      AV66Trabajosexternos_tmanufawwds_3_tfmancod_to = AV27TFManCod_To ;
      AV67Trabajosexternos_tmanufawwds_4_tfmannif = AV48TFManNif ;
      AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV49TFManNif_Sel ;
      AV69Trabajosexternos_tmanufawwds_6_tfmannom = AV28TFManNom ;
      AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV29TFManNom_Sel ;
      AV71Trabajosexternos_tmanufawwds_8_tfmandom = AV30TFManDom ;
      AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV31TFManDom_Sel ;
      AV73Trabajosexternos_tmanufawwds_10_tfmanpob = AV32TFManPob ;
      AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV33TFManPob_Sel ;
      AV75Trabajosexternos_tmanufawwds_12_tfmancpo = AV34TFManCpo ;
      AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV35TFManCpo_Sel ;
      AV77Trabajosexternos_tmanufawwds_14_tfmancp2 = AV36TFManCp2 ;
      AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV37TFManCp2_Sel ;
      AV79Trabajosexternos_tmanufawwds_16_tfprvcod = AV38TFPrvCod ;
      AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV39TFPrvCod_To ;
      AV81Trabajosexternos_tmanufawwds_18_tfprvdsc = AV40TFPrvDsc ;
      AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV41TFPrvDsc_Sel ;
      AV83Trabajosexternos_tmanufawwds_20_tfmantel1 = AV42TFManTel1 ;
      AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV43TFManTel1_Sel ;
      AV85Trabajosexternos_tmanufawwds_22_tfmantel2 = AV44TFManTel2 ;
      AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV45TFManTel2_Sel ;
      AV87Trabajosexternos_tmanufawwds_24_tfmanfax = AV46TFManFax ;
      AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV47TFManFax_Sel ;
      AV89Trabajosexternos_tmanufawwds_26_tfmandto = AV50TFManDto ;
      AV90Trabajosexternos_tmanufawwds_27_tfmandto_to = AV51TFManDto_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFManCod, AV27TFManCod_To, AV48TFManNif, AV49TFManNif_Sel, AV28TFManNom, AV29TFManNom_Sel, AV30TFManDom, AV31TFManDom_Sel, AV32TFManPob, AV33TFManPob_Sel, AV34TFManCpo, AV35TFManCpo_Sel, AV36TFManCp2, AV37TFManCp2_Sel, AV38TFPrvCod, AV39TFPrvCod_To, AV40TFPrvDsc, AV41TFPrvDsc_Sel, AV42TFManTel1, AV43TFManTel1_Sel, AV44TFManTel2, AV45TFManTel2_Sel, AV46TFManFax, AV47TFManFax_Sel, AV50TFManDto, AV51TFManDto_To, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV64Trabajosexternos_tmanufawwds_1_filterfulltext = AV15FilterFullText ;
      AV65Trabajosexternos_tmanufawwds_2_tfmancod = AV26TFManCod ;
      AV66Trabajosexternos_tmanufawwds_3_tfmancod_to = AV27TFManCod_To ;
      AV67Trabajosexternos_tmanufawwds_4_tfmannif = AV48TFManNif ;
      AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV49TFManNif_Sel ;
      AV69Trabajosexternos_tmanufawwds_6_tfmannom = AV28TFManNom ;
      AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV29TFManNom_Sel ;
      AV71Trabajosexternos_tmanufawwds_8_tfmandom = AV30TFManDom ;
      AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV31TFManDom_Sel ;
      AV73Trabajosexternos_tmanufawwds_10_tfmanpob = AV32TFManPob ;
      AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV33TFManPob_Sel ;
      AV75Trabajosexternos_tmanufawwds_12_tfmancpo = AV34TFManCpo ;
      AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV35TFManCpo_Sel ;
      AV77Trabajosexternos_tmanufawwds_14_tfmancp2 = AV36TFManCp2 ;
      AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV37TFManCp2_Sel ;
      AV79Trabajosexternos_tmanufawwds_16_tfprvcod = AV38TFPrvCod ;
      AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV39TFPrvCod_To ;
      AV81Trabajosexternos_tmanufawwds_18_tfprvdsc = AV40TFPrvDsc ;
      AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV41TFPrvDsc_Sel ;
      AV83Trabajosexternos_tmanufawwds_20_tfmantel1 = AV42TFManTel1 ;
      AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV43TFManTel1_Sel ;
      AV85Trabajosexternos_tmanufawwds_22_tfmantel2 = AV44TFManTel2 ;
      AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV45TFManTel2_Sel ;
      AV87Trabajosexternos_tmanufawwds_24_tfmanfax = AV46TFManFax ;
      AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV47TFManFax_Sel ;
      AV89Trabajosexternos_tmanufawwds_26_tfmandto = AV50TFManDto ;
      AV90Trabajosexternos_tmanufawwds_27_tfmandto_to = AV51TFManDto_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFManCod, AV27TFManCod_To, AV48TFManNif, AV49TFManNif_Sel, AV28TFManNom, AV29TFManNom_Sel, AV30TFManDom, AV31TFManDom_Sel, AV32TFManPob, AV33TFManPob_Sel, AV34TFManCpo, AV35TFManCpo_Sel, AV36TFManCp2, AV37TFManCp2_Sel, AV38TFPrvCod, AV39TFPrvCod_To, AV40TFPrvDsc, AV41TFPrvDsc_Sel, AV42TFManTel1, AV43TFManTel1_Sel, AV44TFManTel2, AV45TFManTel2_Sel, AV46TFManFax, AV47TFManFax_Sel, AV50TFManDto, AV51TFManDto_To, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV64Trabajosexternos_tmanufawwds_1_filterfulltext = AV15FilterFullText ;
      AV65Trabajosexternos_tmanufawwds_2_tfmancod = AV26TFManCod ;
      AV66Trabajosexternos_tmanufawwds_3_tfmancod_to = AV27TFManCod_To ;
      AV67Trabajosexternos_tmanufawwds_4_tfmannif = AV48TFManNif ;
      AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV49TFManNif_Sel ;
      AV69Trabajosexternos_tmanufawwds_6_tfmannom = AV28TFManNom ;
      AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV29TFManNom_Sel ;
      AV71Trabajosexternos_tmanufawwds_8_tfmandom = AV30TFManDom ;
      AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV31TFManDom_Sel ;
      AV73Trabajosexternos_tmanufawwds_10_tfmanpob = AV32TFManPob ;
      AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV33TFManPob_Sel ;
      AV75Trabajosexternos_tmanufawwds_12_tfmancpo = AV34TFManCpo ;
      AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV35TFManCpo_Sel ;
      AV77Trabajosexternos_tmanufawwds_14_tfmancp2 = AV36TFManCp2 ;
      AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV37TFManCp2_Sel ;
      AV79Trabajosexternos_tmanufawwds_16_tfprvcod = AV38TFPrvCod ;
      AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV39TFPrvCod_To ;
      AV81Trabajosexternos_tmanufawwds_18_tfprvdsc = AV40TFPrvDsc ;
      AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV41TFPrvDsc_Sel ;
      AV83Trabajosexternos_tmanufawwds_20_tfmantel1 = AV42TFManTel1 ;
      AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV43TFManTel1_Sel ;
      AV85Trabajosexternos_tmanufawwds_22_tfmantel2 = AV44TFManTel2 ;
      AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV45TFManTel2_Sel ;
      AV87Trabajosexternos_tmanufawwds_24_tfmanfax = AV46TFManFax ;
      AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV47TFManFax_Sel ;
      AV89Trabajosexternos_tmanufawwds_26_tfmandto = AV50TFManDto ;
      AV90Trabajosexternos_tmanufawwds_27_tfmandto_to = AV51TFManDto_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFManCod, AV27TFManCod_To, AV48TFManNif, AV49TFManNif_Sel, AV28TFManNom, AV29TFManNom_Sel, AV30TFManDom, AV31TFManDom_Sel, AV32TFManPob, AV33TFManPob_Sel, AV34TFManCpo, AV35TFManCpo_Sel, AV36TFManCp2, AV37TFManCp2_Sel, AV38TFPrvCod, AV39TFPrvCod_To, AV40TFPrvDsc, AV41TFPrvDsc_Sel, AV42TFManTel1, AV43TFManTel1_Sel, AV44TFManTel2, AV45TFManTel2_Sel, AV46TFManFax, AV47TFManFax_Sel, AV50TFManDto, AV51TFManDto_To, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV63Pgmname = "TrabajosExternos.TMANUFAWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup17L0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1917L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV55GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV63Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TMANUFAWW");
         AV63Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV63Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("trabajosexternos\\tmanufaww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1917L2 ();
      if (returnInSub) return;
   }

   public void e1917L2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV57Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmanufaww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57Station = GXt_char1 ;
      GXv_char2[0] = AV58EmprCod ;
      GXv_char3[0] = AV59EmprNom ;
      GXv_char4[0] = AV60UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV57Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmanufaww_impl.this.AV58EmprCod = GXv_char2[0] ;
      tmanufaww_impl.this.AV59EmprNom = GXv_char3[0] ;
      tmanufaww_impl.this.AV60UsurCod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( "Manufacturadores", "") );
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

   public void e2017L2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("TrabajosExternos.TMANUFAWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("TrabajosExternos.TMANUFAWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtManCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtManNif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManNif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManNif_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtManNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtManDom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManDom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManDom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtManPob_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManPob_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManPob_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtManCpo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCpo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCpo_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtManCp2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCp2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCp2_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtManTel1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManTel1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManTel1_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtManTel2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManTel2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManTel2_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtManFax_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManFax_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManFax_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtManDto_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtManDto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManDto_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV54GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridCurrentPage), 10, 0));
      AV55GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridPageCount), 10, 0));
      AV64Trabajosexternos_tmanufawwds_1_filterfulltext = AV15FilterFullText ;
      AV65Trabajosexternos_tmanufawwds_2_tfmancod = AV26TFManCod ;
      AV66Trabajosexternos_tmanufawwds_3_tfmancod_to = AV27TFManCod_To ;
      AV67Trabajosexternos_tmanufawwds_4_tfmannif = AV48TFManNif ;
      AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel = AV49TFManNif_Sel ;
      AV69Trabajosexternos_tmanufawwds_6_tfmannom = AV28TFManNom ;
      AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel = AV29TFManNom_Sel ;
      AV71Trabajosexternos_tmanufawwds_8_tfmandom = AV30TFManDom ;
      AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel = AV31TFManDom_Sel ;
      AV73Trabajosexternos_tmanufawwds_10_tfmanpob = AV32TFManPob ;
      AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel = AV33TFManPob_Sel ;
      AV75Trabajosexternos_tmanufawwds_12_tfmancpo = AV34TFManCpo ;
      AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel = AV35TFManCpo_Sel ;
      AV77Trabajosexternos_tmanufawwds_14_tfmancp2 = AV36TFManCp2 ;
      AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel = AV37TFManCp2_Sel ;
      AV79Trabajosexternos_tmanufawwds_16_tfprvcod = AV38TFPrvCod ;
      AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to = AV39TFPrvCod_To ;
      AV81Trabajosexternos_tmanufawwds_18_tfprvdsc = AV40TFPrvDsc ;
      AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = AV41TFPrvDsc_Sel ;
      AV83Trabajosexternos_tmanufawwds_20_tfmantel1 = AV42TFManTel1 ;
      AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel = AV43TFManTel1_Sel ;
      AV85Trabajosexternos_tmanufawwds_22_tfmantel2 = AV44TFManTel2 ;
      AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel = AV45TFManTel2_Sel ;
      AV87Trabajosexternos_tmanufawwds_24_tfmanfax = AV46TFManFax ;
      AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel = AV47TFManFax_Sel ;
      AV89Trabajosexternos_tmanufawwds_26_tfmandto = AV50TFManDto ;
      AV90Trabajosexternos_tmanufawwds_27_tfmandto_to = AV51TFManDto_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1217L2( )
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

   public void e1317L2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1417L2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManCod") == 0 )
         {
            AV26TFManCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFManCod), 4, 0));
            AV27TFManCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFManCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFManCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManNif") == 0 )
         {
            AV48TFManNif = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFManNif", AV48TFManNif);
            AV49TFManNif_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFManNif_Sel", AV49TFManNif_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManNom") == 0 )
         {
            AV28TFManNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFManNom", AV28TFManNom);
            AV29TFManNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFManNom_Sel", AV29TFManNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManDom") == 0 )
         {
            AV30TFManDom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFManDom", AV30TFManDom);
            AV31TFManDom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFManDom_Sel", AV31TFManDom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManPob") == 0 )
         {
            AV32TFManPob = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFManPob", AV32TFManPob);
            AV33TFManPob_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFManPob_Sel", AV33TFManPob_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManCpo") == 0 )
         {
            AV34TFManCpo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFManCpo", AV34TFManCpo);
            AV35TFManCpo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFManCpo_Sel", AV35TFManCpo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManCp2") == 0 )
         {
            AV36TFManCp2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFManCp2", AV36TFManCp2);
            AV37TFManCp2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFManCp2_Sel", AV37TFManCp2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvCod") == 0 )
         {
            AV38TFPrvCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFPrvCod), 3, 0));
            AV39TFPrvCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrvCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFPrvCod_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvDsc") == 0 )
         {
            AV40TFPrvDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrvDsc", AV40TFPrvDsc);
            AV41TFPrvDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrvDsc_Sel", AV41TFPrvDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManTel1") == 0 )
         {
            AV42TFManTel1 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFManTel1", AV42TFManTel1);
            AV43TFManTel1_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFManTel1_Sel", AV43TFManTel1_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManTel2") == 0 )
         {
            AV44TFManTel2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFManTel2", AV44TFManTel2);
            AV45TFManTel2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFManTel2_Sel", AV45TFManTel2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManFax") == 0 )
         {
            AV46TFManFax = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFManFax", AV46TFManFax);
            AV47TFManFax_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFManFax_Sel", AV47TFManFax_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ManDto") == 0 )
         {
            AV50TFManDto = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFManDto", GXutil.ltrimstr( AV50TFManDto, 5, 2));
            AV51TFManDto_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFManDto_To", GXutil.ltrimstr( AV51TFManDto_To, 5, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2117L2( )
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
         wbStart = (short)(43) ;
      }
      sendrow_432( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV56GridActions, 4, 0)) );
   }

   public void e1517L2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TrabajosExternos.TMANUFAWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1117L2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TrabajosExternos.TMANUFAWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV63Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TrabajosExternos.TMANUFAWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TrabajosExternos.TMANUFAWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tmanufaww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV63Pgmname+"GridState", AV24ManageFiltersXml) ;
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

   public void e1617L2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.trabajosexternos.tmanufa", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","ManCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e1717L2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.trabajosexternos.tmanufawwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmanufaww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      tmanufaww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e1817L2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.trabajosexternos.tmanufawwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManCod", "", "Manufacturador", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManNif", "", "Nif", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManDom", "", "Domicilio", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManPob", "", "Poblacion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManCpo", "", "C. Postal", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManCp2", "", "C. Postal (cont)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvCod", "", "Provincia", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManTel1", "", "Telefono (1)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManTel2", "", "Telefono (2)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManFax", "", "Fax", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ManDto", "", "Dto.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TrabajosExternos.TMANUFAWWColumnsSelector", GXv_char4) ;
      tmanufaww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TrabajosExternos.TMANUFAWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFManCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFManCod), 4, 0));
      AV27TFManCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFManCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFManCod_To), 4, 0));
      AV48TFManNif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFManNif", AV48TFManNif);
      AV49TFManNif_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFManNif_Sel", AV49TFManNif_Sel);
      AV28TFManNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFManNom", AV28TFManNom);
      AV29TFManNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFManNom_Sel", AV29TFManNom_Sel);
      AV30TFManDom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFManDom", AV30TFManDom);
      AV31TFManDom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFManDom_Sel", AV31TFManDom_Sel);
      AV32TFManPob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFManPob", AV32TFManPob);
      AV33TFManPob_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFManPob_Sel", AV33TFManPob_Sel);
      AV34TFManCpo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFManCpo", AV34TFManCpo);
      AV35TFManCpo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFManCpo_Sel", AV35TFManCpo_Sel);
      AV36TFManCp2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFManCp2", AV36TFManCp2);
      AV37TFManCp2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFManCp2_Sel", AV37TFManCp2_Sel);
      AV38TFPrvCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFPrvCod), 3, 0));
      AV39TFPrvCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrvCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFPrvCod_To), 3, 0));
      AV40TFPrvDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrvDsc", AV40TFPrvDsc);
      AV41TFPrvDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrvDsc_Sel", AV41TFPrvDsc_Sel);
      AV42TFManTel1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFManTel1", AV42TFManTel1);
      AV43TFManTel1_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFManTel1_Sel", AV43TFManTel1_Sel);
      AV44TFManTel2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFManTel2", AV44TFManTel2);
      AV45TFManTel2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFManTel2_Sel", AV45TFManTel2_Sel);
      AV46TFManFax = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFManFax", AV46TFManFax);
      AV47TFManFax_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFManFax_Sel", AV47TFManFax_Sel);
      AV50TFManDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFManDto", GXutil.ltrimstr( AV50TFManDto, 5, 2));
      AV51TFManDto_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFManDto_To", GXutil.ltrimstr( AV51TFManDto_To, 5, 2));
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
      callWebObject(formatLink("app.trabajosexternos.tmanufa", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2248ManCod,4,0))}, new String[] {"Mode","EmprCod","ManCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.trabajosexternos.tmanufa", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2248ManCod,4,0))}, new String[] {"Mode","EmprCod","ManCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.trabajosexternos.tmanufa", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2248ManCod,4,0))}, new String[] {"Mode","EmprCod","ManCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV63Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV63Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV63Pgmname+"GridState"), null, null);
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
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCOD") == 0 )
         {
            AV26TFManCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFManCod), 4, 0));
            AV27TFManCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFManCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFManCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNIF") == 0 )
         {
            AV48TFManNif = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFManNif", AV48TFManNif);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNIF_SEL") == 0 )
         {
            AV49TFManNif_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFManNif_Sel", AV49TFManNif_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM") == 0 )
         {
            AV28TFManNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFManNom", AV28TFManNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM_SEL") == 0 )
         {
            AV29TFManNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFManNom_Sel", AV29TFManNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDOM") == 0 )
         {
            AV30TFManDom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFManDom", AV30TFManDom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDOM_SEL") == 0 )
         {
            AV31TFManDom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFManDom_Sel", AV31TFManDom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANPOB") == 0 )
         {
            AV32TFManPob = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFManPob", AV32TFManPob);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANPOB_SEL") == 0 )
         {
            AV33TFManPob_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFManPob_Sel", AV33TFManPob_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCPO") == 0 )
         {
            AV34TFManCpo = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFManCpo", AV34TFManCpo);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCPO_SEL") == 0 )
         {
            AV35TFManCpo_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFManCpo_Sel", AV35TFManCpo_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCP2") == 0 )
         {
            AV36TFManCp2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFManCp2", AV36TFManCp2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCP2_SEL") == 0 )
         {
            AV37TFManCp2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFManCp2_Sel", AV37TFManCp2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV38TFPrvCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFPrvCod), 3, 0));
            AV39TFPrvCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrvCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFPrvCod_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV40TFPrvDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrvDsc", AV40TFPrvDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV41TFPrvDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrvDsc_Sel", AV41TFPrvDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL1") == 0 )
         {
            AV42TFManTel1 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFManTel1", AV42TFManTel1);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL1_SEL") == 0 )
         {
            AV43TFManTel1_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFManTel1_Sel", AV43TFManTel1_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL2") == 0 )
         {
            AV44TFManTel2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFManTel2", AV44TFManTel2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEL2_SEL") == 0 )
         {
            AV45TFManTel2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFManTel2_Sel", AV45TFManTel2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANFAX") == 0 )
         {
            AV46TFManFax = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFManFax", AV46TFManFax);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANFAX_SEL") == 0 )
         {
            AV47TFManFax_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFManFax_Sel", AV47TFManFax_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANDTO") == 0 )
         {
            AV50TFManDto = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFManDto", GXutil.ltrimstr( AV50TFManDto, 5, 2));
            AV51TFManDto_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFManDto_To", GXutil.ltrimstr( AV51TFManDto_To, 5, 2));
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFManNif_Sel)==0), AV49TFManNif_Sel, GXv_char4) ;
      tmanufaww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFManNom_Sel)==0), AV29TFManNom_Sel, GXv_char3) ;
      tmanufaww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFManDom_Sel)==0), AV31TFManDom_Sel, GXv_char2) ;
      tmanufaww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFManPob_Sel)==0), AV33TFManPob_Sel, GXv_char15) ;
      tmanufaww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFManCpo_Sel)==0), AV35TFManCpo_Sel, GXv_char17) ;
      tmanufaww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFManCp2_Sel)==0), AV37TFManCp2_Sel, GXv_char19) ;
      tmanufaww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFPrvDsc_Sel)==0), AV41TFPrvDsc_Sel, GXv_char21) ;
      tmanufaww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFManTel1_Sel)==0), AV43TFManTel1_Sel, GXv_char23) ;
      tmanufaww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFManTel2_Sel)==0), AV45TFManTel2_Sel, GXv_char25) ;
      tmanufaww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFManFax_Sel)==0), AV47TFManFax_Sel, GXv_char27) ;
      tmanufaww_impl.this.GXt_char26 = GXv_char27[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"||"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFManNif)==0), AV48TFManNif, GXv_char27) ;
      tmanufaww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFManNom)==0), AV28TFManNom, GXv_char25) ;
      tmanufaww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFManDom)==0), AV30TFManDom, GXv_char23) ;
      tmanufaww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFManPob)==0), AV32TFManPob, GXv_char21) ;
      tmanufaww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFManCpo)==0), AV34TFManCpo, GXv_char19) ;
      tmanufaww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFManCp2)==0), AV36TFManCp2, GXv_char17) ;
      tmanufaww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFPrvDsc)==0), AV40TFPrvDsc, GXv_char15) ;
      tmanufaww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFManTel1)==0), AV42TFManTel1, GXv_char4) ;
      tmanufaww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFManTel2)==0), AV44TFManTel2, GXv_char3) ;
      tmanufaww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFManFax)==0), AV46TFManFax, GXv_char2) ;
      tmanufaww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFManCod) ? "" : GXutil.str( AV26TFManCod, 4, 0))+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+((0==AV38TFPrvCod) ? "" : GXutil.str( AV38TFPrvCod, 3, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFManDto)==0) ? "" : GXutil.str( AV50TFManDto, 5, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFManCod_To) ? "" : GXutil.str( AV27TFManCod_To, 4, 0))+"|||||||"+((0==AV39TFPrvCod_To) ? "" : GXutil.str( AV39TFPrvCod_To, 3, 0))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFManDto_To)==0) ? "" : GXutil.str( AV51TFManDto_To, 5, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV63Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANCOD", "", !((0==AV26TFManCod)&&(0==AV27TFManCod_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFManCod, 4, 0)), GXutil.trim( GXutil.str( AV27TFManCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANNIF", "", !(GXutil.strcmp("", AV48TFManNif)==0), (short)(0), AV48TFManNif, "", !(GXutil.strcmp("", AV49TFManNif_Sel)==0), AV49TFManNif_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANNOM", "", !(GXutil.strcmp("", AV28TFManNom)==0), (short)(0), AV28TFManNom, "", !(GXutil.strcmp("", AV29TFManNom_Sel)==0), AV29TFManNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANDOM", "", !(GXutil.strcmp("", AV30TFManDom)==0), (short)(0), AV30TFManDom, "", !(GXutil.strcmp("", AV31TFManDom_Sel)==0), AV31TFManDom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANPOB", "", !(GXutil.strcmp("", AV32TFManPob)==0), (short)(0), AV32TFManPob, "", !(GXutil.strcmp("", AV33TFManPob_Sel)==0), AV33TFManPob_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANCPO", "", !(GXutil.strcmp("", AV34TFManCpo)==0), (short)(0), AV34TFManCpo, "", !(GXutil.strcmp("", AV35TFManCpo_Sel)==0), AV35TFManCpo_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANCP2", "", !(GXutil.strcmp("", AV36TFManCp2)==0), (short)(0), AV36TFManCp2, "", !(GXutil.strcmp("", AV37TFManCp2_Sel)==0), AV37TFManCp2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPRVCOD", "", !((0==AV38TFPrvCod)&&(0==AV39TFPrvCod_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFPrvCod, 3, 0)), GXutil.trim( GXutil.str( AV39TFPrvCod_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPRVDSC", "", !(GXutil.strcmp("", AV40TFPrvDsc)==0), (short)(0), AV40TFPrvDsc, "", !(GXutil.strcmp("", AV41TFPrvDsc_Sel)==0), AV41TFPrvDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANTEL1", "", !(GXutil.strcmp("", AV42TFManTel1)==0), (short)(0), AV42TFManTel1, "", !(GXutil.strcmp("", AV43TFManTel1_Sel)==0), AV43TFManTel1_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANTEL2", "", !(GXutil.strcmp("", AV44TFManTel2)==0), (short)(0), AV44TFManTel2, "", !(GXutil.strcmp("", AV45TFManTel2_Sel)==0), AV45TFManTel2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANFAX", "", !(GXutil.strcmp("", AV46TFManFax)==0), (short)(0), AV46TFManFax, "", !(GXutil.strcmp("", AV47TFManFax_Sel)==0), AV47TFManFax_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFMANDTO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFManDto)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFManDto_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFManDto, 5, 2)), GXutil.trim( GXutil.str( AV51TFManDto_To, 5, 2))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV63Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV63Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TrabajosExternos.TMANUFA" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_17L2( boolean wbgen )
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
         wb_table2_30_17L2( true) ;
      }
      else
      {
         wb_table2_30_17L2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_17L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_17L2e( true) ;
      }
      else
      {
         wb_table1_25_17L2e( false) ;
      }
   }

   public void wb_table2_30_17L2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TrabajosExternos\\TMANUFAWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_17L2e( true) ;
      }
      else
      {
         wb_table2_30_17L2e( false) ;
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
      pa17L2( ) ;
      ws17L2( ) ;
      we17L2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116131867", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/tmanufaww.js", "?202682116131867", false, true);
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

   public void subsflControlProps_432( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_43_idx );
      edtManCod_Internalname = "MANCOD_"+sGXsfl_43_idx ;
      edtManNif_Internalname = "MANNIF_"+sGXsfl_43_idx ;
      edtManNom_Internalname = "MANNOM_"+sGXsfl_43_idx ;
      edtManDom_Internalname = "MANDOM_"+sGXsfl_43_idx ;
      edtManPob_Internalname = "MANPOB_"+sGXsfl_43_idx ;
      edtManCpo_Internalname = "MANCPO_"+sGXsfl_43_idx ;
      edtManCp2_Internalname = "MANCP2_"+sGXsfl_43_idx ;
      edtPrvCod_Internalname = "PRVCOD_"+sGXsfl_43_idx ;
      edtPrvDsc_Internalname = "PRVDSC_"+sGXsfl_43_idx ;
      edtManTel1_Internalname = "MANTEL1_"+sGXsfl_43_idx ;
      edtManTel2_Internalname = "MANTEL2_"+sGXsfl_43_idx ;
      edtManFax_Internalname = "MANFAX_"+sGXsfl_43_idx ;
      edtManDto_Internalname = "MANDTO_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_43_fel_idx );
      edtManCod_Internalname = "MANCOD_"+sGXsfl_43_fel_idx ;
      edtManNif_Internalname = "MANNIF_"+sGXsfl_43_fel_idx ;
      edtManNom_Internalname = "MANNOM_"+sGXsfl_43_fel_idx ;
      edtManDom_Internalname = "MANDOM_"+sGXsfl_43_fel_idx ;
      edtManPob_Internalname = "MANPOB_"+sGXsfl_43_fel_idx ;
      edtManCpo_Internalname = "MANCPO_"+sGXsfl_43_fel_idx ;
      edtManCp2_Internalname = "MANCP2_"+sGXsfl_43_fel_idx ;
      edtPrvCod_Internalname = "PRVCOD_"+sGXsfl_43_fel_idx ;
      edtPrvDsc_Internalname = "PRVDSC_"+sGXsfl_43_fel_idx ;
      edtManTel1_Internalname = "MANTEL1_"+sGXsfl_43_fel_idx ;
      edtManTel2_Internalname = "MANTEL2_"+sGXsfl_43_fel_idx ;
      edtManFax_Internalname = "MANFAX_"+sGXsfl_43_fel_idx ;
      edtManDto_Internalname = "MANDTO_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb17L0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_43_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV56GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV56GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV56GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e2217l2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV56GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtManCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManCod_Internalname,GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtManCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtManNif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManNif_Internalname,GXutil.rtrim( A3302ManNif),GXutil.rtrim( localUtil.format( A3302ManNif, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManNif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtManNif_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtManNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManNom_Internalname,GXutil.rtrim( A2249ManNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtManNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtManDom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManDom_Internalname,GXutil.rtrim( A2250ManDom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManDom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtManDom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtManPob_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManPob_Internalname,GXutil.rtrim( A2251ManPob),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManPob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtManPob_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtManCpo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManCpo_Internalname,GXutil.rtrim( A2252ManCpo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManCpo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtManCpo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtManCp2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManCp2_Internalname,GXutil.rtrim( A10743ManCp2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManCp2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtManCp2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvCod_Internalname,GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrvCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvDsc_Internalname,GXutil.rtrim( A787PrvDsc),GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrvDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtManTel1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManTel1_Internalname,GXutil.rtrim( A3299ManTel1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManTel1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtManTel1_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtManTel2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManTel2_Internalname,GXutil.rtrim( A3300ManTel2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManTel2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtManTel2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtManFax_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManFax_Internalname,GXutil.rtrim( A3301ManFax),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManFax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtManFax_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtManDto_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManDto_Internalname,GXutil.ltrim( localUtil.ntoc( A3409ManDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3409ManDto, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtManDto_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes17L2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Manufacturador", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManNif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManDom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Domicilio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManPob_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Poblacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManCpo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C. Postal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManCp2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C. Postal (cont)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Provincia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManTel1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Telefono (1)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManTel2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Telefono (2)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManFax_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fax", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtManDto_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dto.", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3302ManNif));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManNif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2249ManNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2250ManDom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManDom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2251ManPob));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManPob_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2252ManCpo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManCpo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10743ManCp2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManCp2_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3299ManTel1));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManTel1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3300ManTel2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManTel2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3301ManFax));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManFax_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3409ManDto, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtManDto_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtManCod_Internalname = "MANCOD" ;
      edtManNif_Internalname = "MANNIF" ;
      edtManNom_Internalname = "MANNOM" ;
      edtManDom_Internalname = "MANDOM" ;
      edtManPob_Internalname = "MANPOB" ;
      edtManCpo_Internalname = "MANCPO" ;
      edtManCp2_Internalname = "MANCP2" ;
      edtPrvCod_Internalname = "PRVCOD" ;
      edtPrvDsc_Internalname = "PRVDSC" ;
      edtManTel1_Internalname = "MANTEL1" ;
      edtManTel2_Internalname = "MANTEL2" ;
      edtManFax_Internalname = "MANFAX" ;
      edtManDto_Internalname = "MANDTO" ;
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
      edtManDto_Jsonclick = "" ;
      edtManFax_Jsonclick = "" ;
      edtManTel2_Jsonclick = "" ;
      edtManTel1_Jsonclick = "" ;
      edtPrvDsc_Jsonclick = "" ;
      edtPrvCod_Jsonclick = "" ;
      edtManCp2_Jsonclick = "" ;
      edtManCpo_Jsonclick = "" ;
      edtManPob_Jsonclick = "" ;
      edtManDom_Jsonclick = "" ;
      edtManNom_Jsonclick = "" ;
      edtManNif_Jsonclick = "" ;
      edtManCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtManDto_Visible = -1 ;
      edtManFax_Visible = -1 ;
      edtManTel2_Visible = -1 ;
      edtManTel1_Visible = -1 ;
      edtPrvDsc_Visible = -1 ;
      edtPrvCod_Visible = -1 ;
      edtManCp2_Visible = -1 ;
      edtManCpo_Visible = -1 ;
      edtManPob_Visible = -1 ;
      edtManDom_Visible = -1 ;
      edtManNom_Visible = -1 ;
      edtManNif_Visible = -1 ;
      edtManCod_Visible = -1 ;
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
      Ddo_grid_Datalistproc = "TrabajosExternos.TMANUFAWWGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|T|T||T|T|T|T|" ;
      Ddo_grid_Filterisrange = "T|||||||T|||||T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Character|Character|Numeric|Character|Character|Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14" ;
      Ddo_grid_Columnids = "1:ManCod|2:ManNif|3:ManNom|4:ManDom|5:ManPob|6:ManCpo|7:ManCp2|8:PrvCod|9:PrvDsc|10:ManTel1|11:ManTel2|12:ManFax|13:ManDto" ;
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
      Form.setCaption( httpContext.getMessage( "Manufacturadores", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_43_idx ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtManCod_Visible',ctrl:'MANCOD',prop:'Visible'},{av:'edtManNif_Visible',ctrl:'MANNIF',prop:'Visible'},{av:'edtManNom_Visible',ctrl:'MANNOM',prop:'Visible'},{av:'edtManDom_Visible',ctrl:'MANDOM',prop:'Visible'},{av:'edtManPob_Visible',ctrl:'MANPOB',prop:'Visible'},{av:'edtManCpo_Visible',ctrl:'MANCPO',prop:'Visible'},{av:'edtManCp2_Visible',ctrl:'MANCP2',prop:'Visible'},{av:'edtPrvCod_Visible',ctrl:'PRVCOD',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'edtManTel1_Visible',ctrl:'MANTEL1',prop:'Visible'},{av:'edtManTel2_Visible',ctrl:'MANTEL2',prop:'Visible'},{av:'edtManFax_Visible',ctrl:'MANFAX',prop:'Visible'},{av:'edtManDto_Visible',ctrl:'MANDTO',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1217L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1317L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1417L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2117L2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1517L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtManCod_Visible',ctrl:'MANCOD',prop:'Visible'},{av:'edtManNif_Visible',ctrl:'MANNIF',prop:'Visible'},{av:'edtManNom_Visible',ctrl:'MANNOM',prop:'Visible'},{av:'edtManDom_Visible',ctrl:'MANDOM',prop:'Visible'},{av:'edtManPob_Visible',ctrl:'MANPOB',prop:'Visible'},{av:'edtManCpo_Visible',ctrl:'MANCPO',prop:'Visible'},{av:'edtManCp2_Visible',ctrl:'MANCP2',prop:'Visible'},{av:'edtPrvCod_Visible',ctrl:'PRVCOD',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'edtManTel1_Visible',ctrl:'MANTEL1',prop:'Visible'},{av:'edtManTel2_Visible',ctrl:'MANTEL2',prop:'Visible'},{av:'edtManFax_Visible',ctrl:'MANFAX',prop:'Visible'},{av:'edtManDto_Visible',ctrl:'MANDTO',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1117L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtManCod_Visible',ctrl:'MANCOD',prop:'Visible'},{av:'edtManNif_Visible',ctrl:'MANNIF',prop:'Visible'},{av:'edtManNom_Visible',ctrl:'MANNOM',prop:'Visible'},{av:'edtManDom_Visible',ctrl:'MANDOM',prop:'Visible'},{av:'edtManPob_Visible',ctrl:'MANPOB',prop:'Visible'},{av:'edtManCpo_Visible',ctrl:'MANCPO',prop:'Visible'},{av:'edtManCp2_Visible',ctrl:'MANCP2',prop:'Visible'},{av:'edtPrvCod_Visible',ctrl:'PRVCOD',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'edtManTel1_Visible',ctrl:'MANTEL1',prop:'Visible'},{av:'edtManTel2_Visible',ctrl:'MANTEL2',prop:'Visible'},{av:'edtManFax_Visible',ctrl:'MANFAX',prop:'Visible'},{av:'edtManDto_Visible',ctrl:'MANDTO',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2217L2',iparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1617L2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1717L2',iparms:[{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1817L2',iparms:[{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFManCod',fld:'vTFMANCOD',pic:'ZZZ9'},{av:'AV27TFManCod_To',fld:'vTFMANCOD_TO',pic:'ZZZ9'},{av:'AV48TFManNif',fld:'vTFMANNIF',pic:'@!'},{av:'AV49TFManNif_Sel',fld:'vTFMANNIF_SEL',pic:'@!'},{av:'AV28TFManNom',fld:'vTFMANNOM',pic:''},{av:'AV29TFManNom_Sel',fld:'vTFMANNOM_SEL',pic:''},{av:'AV30TFManDom',fld:'vTFMANDOM',pic:''},{av:'AV31TFManDom_Sel',fld:'vTFMANDOM_SEL',pic:''},{av:'AV32TFManPob',fld:'vTFMANPOB',pic:''},{av:'AV33TFManPob_Sel',fld:'vTFMANPOB_SEL',pic:''},{av:'AV34TFManCpo',fld:'vTFMANCPO',pic:''},{av:'AV35TFManCpo_Sel',fld:'vTFMANCPO_SEL',pic:''},{av:'AV36TFManCp2',fld:'vTFMANCP2',pic:''},{av:'AV37TFManCp2_Sel',fld:'vTFMANCP2_SEL',pic:''},{av:'AV38TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV39TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV40TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV41TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV42TFManTel1',fld:'vTFMANTEL1',pic:''},{av:'AV43TFManTel1_Sel',fld:'vTFMANTEL1_SEL',pic:''},{av:'AV44TFManTel2',fld:'vTFMANTEL2',pic:''},{av:'AV45TFManTel2_Sel',fld:'vTFMANTEL2_SEL',pic:''},{av:'AV46TFManFax',fld:'vTFMANFAX',pic:''},{av:'AV47TFManFax_Sel',fld:'vTFMANFAX_SEL',pic:''},{av:'AV50TFManDto',fld:'vTFMANDTO',pic:'Z9.99'},{av:'AV51TFManDto_To',fld:'vTFMANDTO_TO',pic:'Z9.99'},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_PRVCOD","{handler:'valid_Prvcod',iparms:[]");
      setEventMetadata("VALID_PRVCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mandto',iparms:[]");
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
      AV48TFManNif = "" ;
      AV49TFManNif_Sel = "" ;
      AV28TFManNom = "" ;
      AV29TFManNom_Sel = "" ;
      AV30TFManDom = "" ;
      AV31TFManDom_Sel = "" ;
      AV32TFManPob = "" ;
      AV33TFManPob_Sel = "" ;
      AV34TFManCpo = "" ;
      AV35TFManCpo_Sel = "" ;
      AV36TFManCp2 = "" ;
      AV37TFManCp2_Sel = "" ;
      AV40TFPrvDsc = "" ;
      AV41TFPrvDsc_Sel = "" ;
      AV42TFManTel1 = "" ;
      AV43TFManTel1_Sel = "" ;
      AV44TFManTel2 = "" ;
      AV45TFManTel2_Sel = "" ;
      AV46TFManFax = "" ;
      AV47TFManFax_Sel = "" ;
      AV50TFManDto = DecimalUtil.ZERO ;
      AV51TFManDto_To = DecimalUtil.ZERO ;
      AV63Pgmname = "" ;
      A396EmprCod = "" ;
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
      A3302ManNif = "" ;
      A2249ManNom = "" ;
      A2250ManDom = "" ;
      A2251ManPob = "" ;
      A2252ManCpo = "" ;
      A10743ManCp2 = "" ;
      A787PrvDsc = "" ;
      A3299ManTel1 = "" ;
      A3300ManTel2 = "" ;
      A3301ManFax = "" ;
      A3409ManDto = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV64Trabajosexternos_tmanufawwds_1_filterfulltext = "" ;
      lV67Trabajosexternos_tmanufawwds_4_tfmannif = "" ;
      lV69Trabajosexternos_tmanufawwds_6_tfmannom = "" ;
      lV71Trabajosexternos_tmanufawwds_8_tfmandom = "" ;
      lV73Trabajosexternos_tmanufawwds_10_tfmanpob = "" ;
      lV75Trabajosexternos_tmanufawwds_12_tfmancpo = "" ;
      lV77Trabajosexternos_tmanufawwds_14_tfmancp2 = "" ;
      lV81Trabajosexternos_tmanufawwds_18_tfprvdsc = "" ;
      lV83Trabajosexternos_tmanufawwds_20_tfmantel1 = "" ;
      lV85Trabajosexternos_tmanufawwds_22_tfmantel2 = "" ;
      lV87Trabajosexternos_tmanufawwds_24_tfmanfax = "" ;
      AV64Trabajosexternos_tmanufawwds_1_filterfulltext = "" ;
      AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel = "" ;
      AV67Trabajosexternos_tmanufawwds_4_tfmannif = "" ;
      AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel = "" ;
      AV69Trabajosexternos_tmanufawwds_6_tfmannom = "" ;
      AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel = "" ;
      AV71Trabajosexternos_tmanufawwds_8_tfmandom = "" ;
      AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel = "" ;
      AV73Trabajosexternos_tmanufawwds_10_tfmanpob = "" ;
      AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel = "" ;
      AV75Trabajosexternos_tmanufawwds_12_tfmancpo = "" ;
      AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel = "" ;
      AV77Trabajosexternos_tmanufawwds_14_tfmancp2 = "" ;
      AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel = "" ;
      AV81Trabajosexternos_tmanufawwds_18_tfprvdsc = "" ;
      AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel = "" ;
      AV83Trabajosexternos_tmanufawwds_20_tfmantel1 = "" ;
      AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel = "" ;
      AV85Trabajosexternos_tmanufawwds_22_tfmantel2 = "" ;
      AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel = "" ;
      AV87Trabajosexternos_tmanufawwds_24_tfmanfax = "" ;
      AV89Trabajosexternos_tmanufawwds_26_tfmandto = DecimalUtil.ZERO ;
      AV90Trabajosexternos_tmanufawwds_27_tfmandto_to = DecimalUtil.ZERO ;
      H017L2_A396EmprCod = new String[] {""} ;
      H017L2_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H017L2_n3409ManDto = new boolean[] {false} ;
      H017L2_A3301ManFax = new String[] {""} ;
      H017L2_n3301ManFax = new boolean[] {false} ;
      H017L2_A3300ManTel2 = new String[] {""} ;
      H017L2_n3300ManTel2 = new boolean[] {false} ;
      H017L2_A3299ManTel1 = new String[] {""} ;
      H017L2_n3299ManTel1 = new boolean[] {false} ;
      H017L2_A787PrvDsc = new String[] {""} ;
      H017L2_n787PrvDsc = new boolean[] {false} ;
      H017L2_A781PrvCod = new short[1] ;
      H017L2_n781PrvCod = new boolean[] {false} ;
      H017L2_A10743ManCp2 = new String[] {""} ;
      H017L2_n10743ManCp2 = new boolean[] {false} ;
      H017L2_A2252ManCpo = new String[] {""} ;
      H017L2_n2252ManCpo = new boolean[] {false} ;
      H017L2_A2251ManPob = new String[] {""} ;
      H017L2_n2251ManPob = new boolean[] {false} ;
      H017L2_A2250ManDom = new String[] {""} ;
      H017L2_n2250ManDom = new boolean[] {false} ;
      H017L2_A2249ManNom = new String[] {""} ;
      H017L2_n2249ManNom = new boolean[] {false} ;
      H017L2_A3302ManNif = new String[] {""} ;
      H017L2_n3302ManNif = new boolean[] {false} ;
      H017L2_A2248ManCod = new short[1] ;
      H017L3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV57Station = "" ;
      AV58EmprCod = "" ;
      AV59EmprNom = "" ;
      AV60UsurCod = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.tmanufaww__default(),
         new Object[] {
             new Object[] {
            H017L2_A396EmprCod, H017L2_A3409ManDto, H017L2_n3409ManDto, H017L2_A3301ManFax, H017L2_n3301ManFax, H017L2_A3300ManTel2, H017L2_n3300ManTel2, H017L2_A3299ManTel1, H017L2_n3299ManTel1, H017L2_A787PrvDsc,
            H017L2_n787PrvDsc, H017L2_A781PrvCod, H017L2_n781PrvCod, H017L2_A10743ManCp2, H017L2_n10743ManCp2, H017L2_A2252ManCpo, H017L2_n2252ManCpo, H017L2_A2251ManPob, H017L2_n2251ManPob, H017L2_A2250ManDom,
            H017L2_n2250ManDom, H017L2_A2249ManNom, H017L2_n2249ManNom, H017L2_A3302ManNif, H017L2_n3302ManNif, H017L2_A2248ManCod
            }
            , new Object[] {
            H017L3_AGRID_nRecordCount
            }
         }
      );
      AV63Pgmname = "TrabajosExternos.TMANUFAWW" ;
      /* GeneXus formulas. */
      AV63Pgmname = "TrabajosExternos.TMANUFAWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
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
   private short AV26TFManCod ;
   private short AV27TFManCod_To ;
   private short AV38TFPrvCod ;
   private short AV39TFPrvCod_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV56GridActions ;
   private short A2248ManCod ;
   private short A781PrvCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV65Trabajosexternos_tmanufawwds_2_tfmancod ;
   private short AV66Trabajosexternos_tmanufawwds_3_tfmancod_to ;
   private short AV79Trabajosexternos_tmanufawwds_16_tfprvcod ;
   private short AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtManCod_Visible ;
   private int edtManNif_Visible ;
   private int edtManNom_Visible ;
   private int edtManDom_Visible ;
   private int edtManPob_Visible ;
   private int edtManCpo_Visible ;
   private int edtManCp2_Visible ;
   private int edtPrvCod_Visible ;
   private int edtPrvDsc_Visible ;
   private int edtManTel1_Visible ;
   private int edtManTel2_Visible ;
   private int edtManFax_Visible ;
   private int edtManDto_Visible ;
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
   private java.math.BigDecimal AV50TFManDto ;
   private java.math.BigDecimal AV51TFManDto_To ;
   private java.math.BigDecimal A3409ManDto ;
   private java.math.BigDecimal AV89Trabajosexternos_tmanufawwds_26_tfmandto ;
   private java.math.BigDecimal AV90Trabajosexternos_tmanufawwds_27_tfmandto_to ;
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
   private String sGXsfl_43_idx="0001" ;
   private String AV48TFManNif ;
   private String AV49TFManNif_Sel ;
   private String AV28TFManNom ;
   private String AV29TFManNom_Sel ;
   private String AV30TFManDom ;
   private String AV31TFManDom_Sel ;
   private String AV32TFManPob ;
   private String AV33TFManPob_Sel ;
   private String AV34TFManCpo ;
   private String AV35TFManCpo_Sel ;
   private String AV36TFManCp2 ;
   private String AV37TFManCp2_Sel ;
   private String AV40TFPrvDsc ;
   private String AV41TFPrvDsc_Sel ;
   private String AV42TFManTel1 ;
   private String AV43TFManTel1_Sel ;
   private String AV44TFManTel2 ;
   private String AV45TFManTel2_Sel ;
   private String AV46TFManFax ;
   private String AV47TFManFax_Sel ;
   private String AV63Pgmname ;
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
   private String edtManCod_Internalname ;
   private String A3302ManNif ;
   private String edtManNif_Internalname ;
   private String A2249ManNom ;
   private String edtManNom_Internalname ;
   private String A2250ManDom ;
   private String edtManDom_Internalname ;
   private String A2251ManPob ;
   private String edtManPob_Internalname ;
   private String A2252ManCpo ;
   private String edtManCpo_Internalname ;
   private String A10743ManCp2 ;
   private String edtManCp2_Internalname ;
   private String edtPrvCod_Internalname ;
   private String A787PrvDsc ;
   private String edtPrvDsc_Internalname ;
   private String A3299ManTel1 ;
   private String edtManTel1_Internalname ;
   private String A3300ManTel2 ;
   private String edtManTel2_Internalname ;
   private String A3301ManFax ;
   private String edtManFax_Internalname ;
   private String edtManDto_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV67Trabajosexternos_tmanufawwds_4_tfmannif ;
   private String lV69Trabajosexternos_tmanufawwds_6_tfmannom ;
   private String lV71Trabajosexternos_tmanufawwds_8_tfmandom ;
   private String lV73Trabajosexternos_tmanufawwds_10_tfmanpob ;
   private String lV75Trabajosexternos_tmanufawwds_12_tfmancpo ;
   private String lV77Trabajosexternos_tmanufawwds_14_tfmancp2 ;
   private String lV81Trabajosexternos_tmanufawwds_18_tfprvdsc ;
   private String lV83Trabajosexternos_tmanufawwds_20_tfmantel1 ;
   private String lV85Trabajosexternos_tmanufawwds_22_tfmantel2 ;
   private String lV87Trabajosexternos_tmanufawwds_24_tfmanfax ;
   private String AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel ;
   private String AV67Trabajosexternos_tmanufawwds_4_tfmannif ;
   private String AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel ;
   private String AV69Trabajosexternos_tmanufawwds_6_tfmannom ;
   private String AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel ;
   private String AV71Trabajosexternos_tmanufawwds_8_tfmandom ;
   private String AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel ;
   private String AV73Trabajosexternos_tmanufawwds_10_tfmanpob ;
   private String AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel ;
   private String AV75Trabajosexternos_tmanufawwds_12_tfmancpo ;
   private String AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel ;
   private String AV77Trabajosexternos_tmanufawwds_14_tfmancp2 ;
   private String AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ;
   private String AV81Trabajosexternos_tmanufawwds_18_tfprvdsc ;
   private String AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel ;
   private String AV83Trabajosexternos_tmanufawwds_20_tfmantel1 ;
   private String AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel ;
   private String AV85Trabajosexternos_tmanufawwds_22_tfmantel2 ;
   private String AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel ;
   private String AV87Trabajosexternos_tmanufawwds_24_tfmanfax ;
   private String hsh ;
   private String AV57Station ;
   private String AV58EmprCod ;
   private String AV59EmprNom ;
   private String AV60UsurCod ;
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
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtManCod_Jsonclick ;
   private String edtManNif_Jsonclick ;
   private String edtManNom_Jsonclick ;
   private String edtManDom_Jsonclick ;
   private String edtManPob_Jsonclick ;
   private String edtManCpo_Jsonclick ;
   private String edtManCp2_Jsonclick ;
   private String edtPrvCod_Jsonclick ;
   private String edtPrvDsc_Jsonclick ;
   private String edtManTel1_Jsonclick ;
   private String edtManTel2_Jsonclick ;
   private String edtManFax_Jsonclick ;
   private String edtManDto_Jsonclick ;
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
   private boolean n3302ManNif ;
   private boolean n2249ManNom ;
   private boolean n2250ManDom ;
   private boolean n2251ManPob ;
   private boolean n2252ManCpo ;
   private boolean n10743ManCp2 ;
   private boolean n781PrvCod ;
   private boolean n787PrvDsc ;
   private boolean n3299ManTel1 ;
   private boolean n3300ManTel2 ;
   private boolean n3301ManFax ;
   private boolean n3409ManDto ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV64Trabajosexternos_tmanufawwds_1_filterfulltext ;
   private String AV64Trabajosexternos_tmanufawwds_1_filterfulltext ;
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
   private String[] H017L2_A396EmprCod ;
   private java.math.BigDecimal[] H017L2_A3409ManDto ;
   private boolean[] H017L2_n3409ManDto ;
   private String[] H017L2_A3301ManFax ;
   private boolean[] H017L2_n3301ManFax ;
   private String[] H017L2_A3300ManTel2 ;
   private boolean[] H017L2_n3300ManTel2 ;
   private String[] H017L2_A3299ManTel1 ;
   private boolean[] H017L2_n3299ManTel1 ;
   private String[] H017L2_A787PrvDsc ;
   private boolean[] H017L2_n787PrvDsc ;
   private short[] H017L2_A781PrvCod ;
   private boolean[] H017L2_n781PrvCod ;
   private String[] H017L2_A10743ManCp2 ;
   private boolean[] H017L2_n10743ManCp2 ;
   private String[] H017L2_A2252ManCpo ;
   private boolean[] H017L2_n2252ManCpo ;
   private String[] H017L2_A2251ManPob ;
   private boolean[] H017L2_n2251ManPob ;
   private String[] H017L2_A2250ManDom ;
   private boolean[] H017L2_n2250ManDom ;
   private String[] H017L2_A2249ManNom ;
   private boolean[] H017L2_n2249ManNom ;
   private String[] H017L2_A3302ManNif ;
   private boolean[] H017L2_n3302ManNif ;
   private short[] H017L2_A2248ManCod ;
   private long[] H017L3_AGRID_nRecordCount ;
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
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tmanufaww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H017L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV65Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV66Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV67Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV69Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV71Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV73Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV75Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV77Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV79Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV81Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV83Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV85Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV87Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV89Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV90Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[44];
      Object[] GXv_Object30 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.ManDto, T1.ManFax, T1.ManTel2, T1.ManTel1, T2.PrvDsc, T1.PrvCod, T1.ManCp2, T1.ManCpo, T1.ManPob, T1.ManDom, T1.ManNom, T1.ManNif, T1.ManCod" ;
      sFromString = " FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
         GXv_int29[1] = (byte)(1) ;
         GXv_int29[2] = (byte)(1) ;
         GXv_int29[3] = (byte)(1) ;
         GXv_int29[4] = (byte)(1) ;
         GXv_int29[5] = (byte)(1) ;
         GXv_int29[6] = (byte)(1) ;
         GXv_int29[7] = (byte)(1) ;
         GXv_int29[8] = (byte)(1) ;
         GXv_int29[9] = (byte)(1) ;
         GXv_int29[10] = (byte)(1) ;
         GXv_int29[11] = (byte)(1) ;
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (0==AV79Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (0==AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ManCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManNif" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManNif DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManDom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManDom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManPob" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManPob DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManCpo" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManCpo DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManCp2" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManCp2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrvCod" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrvCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManTel1" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManTel1 DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManTel2" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManTel2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManFax" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManFax DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManDto" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManDto DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ManCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H017L3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Trabajosexternos_tmanufawwds_1_filterfulltext ,
                                          short AV65Trabajosexternos_tmanufawwds_2_tfmancod ,
                                          short AV66Trabajosexternos_tmanufawwds_3_tfmancod_to ,
                                          String AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel ,
                                          String AV67Trabajosexternos_tmanufawwds_4_tfmannif ,
                                          String AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel ,
                                          String AV69Trabajosexternos_tmanufawwds_6_tfmannom ,
                                          String AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel ,
                                          String AV71Trabajosexternos_tmanufawwds_8_tfmandom ,
                                          String AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel ,
                                          String AV73Trabajosexternos_tmanufawwds_10_tfmanpob ,
                                          String AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel ,
                                          String AV75Trabajosexternos_tmanufawwds_12_tfmancpo ,
                                          String AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel ,
                                          String AV77Trabajosexternos_tmanufawwds_14_tfmancp2 ,
                                          short AV79Trabajosexternos_tmanufawwds_16_tfprvcod ,
                                          short AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to ,
                                          String AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel ,
                                          String AV81Trabajosexternos_tmanufawwds_18_tfprvdsc ,
                                          String AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel ,
                                          String AV83Trabajosexternos_tmanufawwds_20_tfmantel1 ,
                                          String AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel ,
                                          String AV85Trabajosexternos_tmanufawwds_22_tfmantel2 ,
                                          String AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel ,
                                          String AV87Trabajosexternos_tmanufawwds_24_tfmanfax ,
                                          java.math.BigDecimal AV89Trabajosexternos_tmanufawwds_26_tfmandto ,
                                          java.math.BigDecimal AV90Trabajosexternos_tmanufawwds_27_tfmandto_to ,
                                          short A2248ManCod ,
                                          String A3302ManNif ,
                                          String A2249ManNom ,
                                          String A2250ManDom ,
                                          String A2251ManPob ,
                                          String A2252ManCpo ,
                                          String A10743ManCp2 ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A3299ManTel1 ,
                                          String A3300ManTel2 ,
                                          String A3301ManFax ,
                                          java.math.BigDecimal A3409ManDto ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[39];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPMANUFA T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV64Trabajosexternos_tmanufawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ManNif) like '%' || UPPER(?)) or ( UPPER(T1.ManNom) like '%' || UPPER(?)) or ( UPPER(T1.ManDom) like '%' || UPPER(?)) or ( UPPER(T1.ManPob) like '%' || UPPER(?)) or ( UPPER(T1.ManCpo) like '%' || UPPER(?)) or ( UPPER(T1.ManCp2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.ManTel1) like '%' || UPPER(?)) or ( UPPER(T1.ManTel2) like '%' || UPPER(?)) or ( UPPER(T1.ManFax) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManDto,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int31[0] = (byte)(1) ;
         GXv_int31[1] = (byte)(1) ;
         GXv_int31[2] = (byte)(1) ;
         GXv_int31[3] = (byte)(1) ;
         GXv_int31[4] = (byte)(1) ;
         GXv_int31[5] = (byte)(1) ;
         GXv_int31[6] = (byte)(1) ;
         GXv_int31[7] = (byte)(1) ;
         GXv_int31[8] = (byte)(1) ;
         GXv_int31[9] = (byte)(1) ;
         GXv_int31[10] = (byte)(1) ;
         GXv_int31[11] = (byte)(1) ;
         GXv_int31[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Trabajosexternos_tmanufawwds_2_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int31[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Trabajosexternos_tmanufawwds_3_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) && ( ! (GXutil.strcmp("", AV67Trabajosexternos_tmanufawwds_4_tfmannif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Trabajosexternos_tmanufawwds_5_tfmannif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNif = ?)");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV69Trabajosexternos_tmanufawwds_6_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Trabajosexternos_tmanufawwds_7_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManNom = ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) && ( ! (GXutil.strcmp("", AV71Trabajosexternos_tmanufawwds_8_tfmandom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Trabajosexternos_tmanufawwds_9_tfmandom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManDom = ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) && ( ! (GXutil.strcmp("", AV73Trabajosexternos_tmanufawwds_10_tfmanpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Trabajosexternos_tmanufawwds_11_tfmanpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManPob = ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajosexternos_tmanufawwds_12_tfmancpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajosexternos_tmanufawwds_13_tfmancpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCpo = ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) && ( ! (GXutil.strcmp("", AV77Trabajosexternos_tmanufawwds_14_tfmancp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Trabajosexternos_tmanufawwds_15_tfmancp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManCp2 = ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( ! (0==AV79Trabajosexternos_tmanufawwds_16_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( ! (0==AV80Trabajosexternos_tmanufawwds_17_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Trabajosexternos_tmanufawwds_18_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Trabajosexternos_tmanufawwds_19_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajosexternos_tmanufawwds_20_tfmantel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajosexternos_tmanufawwds_21_tfmantel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel1 = ?)");
      }
      else
      {
         GXv_int31[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajosexternos_tmanufawwds_22_tfmantel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajosexternos_tmanufawwds_23_tfmantel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManTel2 = ?)");
      }
      else
      {
         GXv_int31[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajosexternos_tmanufawwds_24_tfmanfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ManFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajosexternos_tmanufawwds_25_tfmanfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ManFax = ?)");
      }
      else
      {
         GXv_int31[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Trabajosexternos_tmanufawwds_26_tfmandto)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto >= ?)");
      }
      else
      {
         GXv_int31[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Trabajosexternos_tmanufawwds_27_tfmandto_to)==0) )
      {
         addWhere(sWhereString, "(T1.ManDto <= ?)");
      }
      else
      {
         GXv_int31[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
                  return conditional_H017L2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
            case 1 :
                  return conditional_H017L3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H017L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H017L3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 34);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
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
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
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
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 34);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
      }
   }

}

