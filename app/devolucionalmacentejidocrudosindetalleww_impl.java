package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class devolucionalmacentejidocrudosindetalleww_impl extends GXDataArea
{
   public devolucionalmacentejidocrudosindetalleww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public devolucionalmacentejidocrudosindetalleww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devolucionalmacentejidocrudosindetalleww_impl.class ));
   }

   public devolucionalmacentejidocrudosindetalleww_impl( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbDevCruStt = new HTMLChoice();
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
      AV26TFDevCruId = (int)(GXutil.lval( httpContext.GetPar( "TFDevCruId"))) ;
      AV27TFDevCruId_To = (int)(GXutil.lval( httpContext.GetPar( "TFDevCruId_To"))) ;
      AV28TFDevCruFec = localUtil.parseDateParm( httpContext.GetPar( "TFDevCruFec")) ;
      AV57TFDevCruSal = localUtil.parseDTimeParm( httpContext.GetPar( "TFDevCruSal")) ;
      AV32TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV33TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV34TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV35TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV36TFTrnCod = (short)(GXutil.lval( httpContext.GetPar( "TFTrnCod"))) ;
      AV37TFTrnCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTrnCod_To"))) ;
      AV38TFTrnNom = httpContext.GetPar( "TFTrnNom") ;
      AV39TFTrnNom_Sel = httpContext.GetPar( "TFTrnNom_Sel") ;
      AV40TFDevCruMat = httpContext.GetPar( "TFDevCruMat") ;
      AV41TFDevCruMat_Sel = httpContext.GetPar( "TFDevCruMat_Sel") ;
      AV68TFDevCruAtId = httpContext.GetPar( "TFDevCruAtId") ;
      AV69TFDevCruAtId_Sel = httpContext.GetPar( "TFDevCruAtId_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV52TFDevCruStt_Sels);
      AV42TFDevCruObs = httpContext.GetPar( "TFDevCruObs") ;
      AV43TFDevCruObs_Sel = httpContext.GetPar( "TFDevCruObs_Sel") ;
      AV61TFDevCruHash = httpContext.GetPar( "TFDevCruHash") ;
      AV62TFDevCruHash_Sel = httpContext.GetPar( "TFDevCruHash_Sel") ;
      AV63TFDevCruDesc = httpContext.GetPar( "TFDevCruDesc") ;
      AV64TFDevCruDesc_Sel = httpContext.GetPar( "TFDevCruDesc_Sel") ;
      AV99Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV57TFDevCruSal, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV68TFDevCruAtId, AV69TFDevCruAtId_Sel, AV52TFDevCruStt_Sels, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV61TFDevCruHash, AV62TFDevCruHash_Sel, AV63TFDevCruDesc, AV64TFDevCruDesc_Sel, AV99Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa16E2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start16E2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.devolucionalmacentejidocrudosindetalleww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV99Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV46GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV26TFDevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUID_TO", GXutil.ltrim( localUtil.ntoc( AV27TFDevCruId_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUFEC", localUtil.dtoc( AV28TFDevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUSAL", localUtil.ttoc( AV57TFDevCruSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV32TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV33TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV34TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV35TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNCOD", GXutil.ltrim( localUtil.ntoc( AV36TFTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNCOD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFTrnCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNNOM", GXutil.rtrim( AV38TFTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNNOM_SEL", GXutil.rtrim( AV39TFTrnNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUMAT", GXutil.rtrim( AV40TFDevCruMat));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUMAT_SEL", GXutil.rtrim( AV41TFDevCruMat_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUATID", GXutil.rtrim( AV68TFDevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUATID_SEL", GXutil.rtrim( AV69TFDevCruAtId_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFDEVCRUSTT_SELS", AV52TFDevCruStt_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFDEVCRUSTT_SELS", AV52TFDevCruStt_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUOBS", AV42TFDevCruObs);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUOBS_SEL", AV43TFDevCruObs_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUHASH", GXutil.rtrim( AV61TFDevCruHash));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUHASH_SEL", GXutil.rtrim( AV62TFDevCruHash_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUDESC", GXutil.rtrim( AV63TFDevCruDesc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUDESC_SEL", GXutil.rtrim( AV64TFDevCruDesc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV99Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV99Pgmname, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUSTT_SELSJSON", AV51TFDevCruStt_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV53Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV54Station));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Title", GXutil.rtrim( Dvelop_confirmpanel_activardevolucion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_activardevolucion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_activardevolucion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_activardevolucion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_activardevolucion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_activardevolucion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_activardevolucion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Result", GXutil.rtrim( Dvelop_confirmpanel_activardevolucion_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Result", GXutil.rtrim( Dvelop_confirmpanel_activardevolucion_Result));
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
         we16E2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt16E2( ) ;
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
      return formatLink("app.devolucionalmacentejidocrudosindetalleww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "DevolucionAlmacenTejidoCrudosindetalleWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Devolucion Almacen Tejido Crudo (sin detalle)", "") ;
   }

   public void wb16E0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DevolucionAlmacenTejidoCrudosindetalleWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DevolucionAlmacenTejidoCrudosindetalleWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DevolucionAlmacenTejidoCrudosindetalleWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DevolucionAlmacenTejidoCrudosindetalleWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DevolucionAlmacenTejidoCrudosindetalleWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_16E2( true) ;
      }
      else
      {
         wb_table1_27_16E2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_16E2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV46GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV47GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_76_16E2( true) ;
      }
      else
      {
         wb_table2_76_16E2( false) ;
      }
      return  ;
   }

   public void wb_table2_76_16E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_81_16E2( true) ;
      }
      else
      {
         wb_table3_81_16E2( false) ;
      }
      return  ;
   }

   public void wb_table3_81_16E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_devcrufecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_devcrufecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_devcrufecauxdate_Internalname, localUtil.format(AV30DDO_DevCruFecAuxDate, "99/99/99"), localUtil.format( AV30DDO_DevCruFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_devcrufecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalleWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_devcrufecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalleWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_devcrusalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_devcrusalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_devcrusalauxdate_Internalname, localUtil.format(AV59DDO_DevCruSalAuxDate, "99/99/99"), localUtil.format( AV59DDO_DevCruSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_devcrusalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalleWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_devcrusalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalleWW.htm");
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

   public void start16E2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Devolucion Almacen Tejido Crudo (sin detalle)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup16E0( ) ;
   }

   public void ws16E2( )
   {
      start16E2( ) ;
      evt16E2( ) ;
   }

   public void evt16E2( )
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
                           e1116E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1216E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1316E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1416E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1516E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1616E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1716E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1816E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1916E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e2016E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e2116E2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV48GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A11670DevCruFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDevCruFec_Internalname), 0)) ;
                           A11673DevCruSal = localUtil.ctot( httpContext.cgiGet( edtDevCruSal_Internalname), 0) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n840TrnCod = false ;
                           A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
                           n841TrnNom = false ;
                           A11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevCruEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A11672DevCruMat = httpContext.cgiGet( edtDevCruMat_Internalname) ;
                           A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( edtDevCruDtSy_Internalname), 0) ;
                           A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( edtDevCruGros_Internalname)) ;
                           A11679DevCruEnvA = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevCruEnvA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A11680DevCruAtId = httpContext.cgiGet( edtDevCruAtId_Internalname) ;
                           cmbDevCruStt.setName( cmbDevCruStt.getInternalname() );
                           cmbDevCruStt.setValue( httpContext.cgiGet( cmbDevCruStt.getInternalname()) );
                           A11678DevCruStt = httpContext.cgiGet( cmbDevCruStt.getInternalname()) ;
                           A11681DevCruAT = httpContext.cgiGet( edtDevCruAT_Internalname) ;
                           A11682DevCruObs = httpContext.cgiGet( edtDevCruObs_Internalname) ;
                           A11674DevCruHash = httpContext.cgiGet( edtDevCruHash_Internalname) ;
                           A11675DevCruDesc = httpContext.cgiGet( edtDevCruDesc_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2216E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2316E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2416E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2516E2 ();
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

   public void we16E2( )
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

   public void pa16E2( )
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
                                 int AV26TFDevCruId ,
                                 int AV27TFDevCruId_To ,
                                 java.util.Date AV28TFDevCruFec ,
                                 java.util.Date AV57TFDevCruSal ,
                                 int AV32TFCliCod ,
                                 int AV33TFCliCod_To ,
                                 String AV34TFCliNom ,
                                 String AV35TFCliNom_Sel ,
                                 short AV36TFTrnCod ,
                                 short AV37TFTrnCod_To ,
                                 String AV38TFTrnNom ,
                                 String AV39TFTrnNom_Sel ,
                                 String AV40TFDevCruMat ,
                                 String AV41TFDevCruMat_Sel ,
                                 String AV68TFDevCruAtId ,
                                 String AV69TFDevCruAtId_Sel ,
                                 GXSimpleCollection<String> AV52TFDevCruStt_Sels ,
                                 String AV42TFDevCruObs ,
                                 String AV43TFDevCruObs_Sel ,
                                 String AV61TFDevCruHash ,
                                 String AV62TFDevCruHash_Sel ,
                                 String AV63TFDevCruDesc ,
                                 String AV64TFDevCruDesc_Sel ,
                                 String AV99Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2316E2 ();
      GRID_nCurrentRecord = 0 ;
      rf16E2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUSTT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A11678DevCruStt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUSTT", GXutil.rtrim( A11678DevCruStt));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUATID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A11680DevCruAtId, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUATID", GXutil.rtrim( A11680DevCruAtId));
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
      rf16E2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV99Pgmname = "DevolucionAlmacenTejidoCrudosindetalleWW" ;
      Gx_err = (short)(0) ;
   }

   public void rf16E2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e2316E2 ();
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
                                              A11678DevCruStt ,
                                              AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                              AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                              Integer.valueOf(AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                              Integer.valueOf(AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                              AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                              AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                              Integer.valueOf(AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                              Integer.valueOf(AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                              AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                              AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                              Short.valueOf(AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                              Short.valueOf(AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                              AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                              AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                              AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                              AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                              AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                              AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                              Integer.valueOf(AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                              AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                              AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                              AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                              AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                              AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                              AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                              Integer.valueOf(A11669DevCruId) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              Short.valueOf(A840TrnCod) ,
                                              A841TrnNom ,
                                              A11672DevCruMat ,
                                              A11680DevCruAtId ,
                                              A11682DevCruObs ,
                                              A11674DevCruHash ,
                                              A11675DevCruDesc ,
                                              A11670DevCruFec ,
                                              A11673DevCruSal ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN
                                              }
         });
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
         lV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
         lV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
         lV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
         lV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
         lV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
         lV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
         lV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
         /* Using cursor H016E2 */
         pr_default.execute(0, new Object[] {lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A11675DevCruDesc = H016E2_A11675DevCruDesc[0] ;
            A11674DevCruHash = H016E2_A11674DevCruHash[0] ;
            A11682DevCruObs = H016E2_A11682DevCruObs[0] ;
            A11681DevCruAT = H016E2_A11681DevCruAT[0] ;
            A11678DevCruStt = H016E2_A11678DevCruStt[0] ;
            A11680DevCruAtId = H016E2_A11680DevCruAtId[0] ;
            A11679DevCruEnvA = H016E2_A11679DevCruEnvA[0] ;
            A11677DevCruGros = H016E2_A11677DevCruGros[0] ;
            A11676DevCruDtSy = H016E2_A11676DevCruDtSy[0] ;
            A11672DevCruMat = H016E2_A11672DevCruMat[0] ;
            A11671DevCruEst = H016E2_A11671DevCruEst[0] ;
            A841TrnNom = H016E2_A841TrnNom[0] ;
            n841TrnNom = H016E2_n841TrnNom[0] ;
            A840TrnCod = H016E2_A840TrnCod[0] ;
            n840TrnCod = H016E2_n840TrnCod[0] ;
            A279CliNom = H016E2_A279CliNom[0] ;
            A252CliCod = H016E2_A252CliCod[0] ;
            A11673DevCruSal = H016E2_A11673DevCruSal[0] ;
            A11670DevCruFec = H016E2_A11670DevCruFec[0] ;
            A11669DevCruId = H016E2_A11669DevCruId[0] ;
            A407EmprNom = H016E2_A407EmprNom[0] ;
            n407EmprNom = H016E2_n407EmprNom[0] ;
            A396EmprCod = H016E2_A396EmprCod[0] ;
            A407EmprNom = H016E2_A407EmprNom[0] ;
            n407EmprNom = H016E2_n407EmprNom[0] ;
            A279CliNom = H016E2_A279CliNom[0] ;
            A841TrnNom = H016E2_A841TrnNom[0] ;
            n841TrnNom = H016E2_n841TrnNom[0] ;
            e2416E2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb16E0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes16E2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV99Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV99Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUSTT"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A11678DevCruStt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUATID"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A11680DevCruAtId, ""))));
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
      AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV15FilterFullText ;
      AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV26TFDevCruId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV57TFDevCruSal ;
      AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV32TFCliCod ;
      AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV33TFCliCod_To ;
      AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV34TFCliNom ;
      AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV35TFCliNom_Sel ;
      AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV36TFTrnCod ;
      AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV37TFTrnCod_To ;
      AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV38TFTrnNom ;
      AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV40TFDevCruMat ;
      AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV68TFDevCruAtId ;
      AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV69TFDevCruAtId_Sel ;
      AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV52TFDevCruStt_Sels ;
      AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV42TFDevCruObs ;
      AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
      AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV61TFDevCruHash ;
      AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV62TFDevCruHash_Sel ;
      AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV63TFDevCruDesc ;
      AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV64TFDevCruDesc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                           AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                           Integer.valueOf(AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                           AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                           AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                           Integer.valueOf(AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                           AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                           AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                           Short.valueOf(AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                           Short.valueOf(AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                           AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                           AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                           AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                           AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                           AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                           AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                           AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                           AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                           AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                           AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                           AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                           AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11682DevCruObs ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
      lV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
      lV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
      lV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
      lV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
      lV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
      lV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
      /* Using cursor H016E3 */
      pr_default.execute(1, new Object[] {lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel});
      GRID_nRecordCount = H016E3_AGRID_nRecordCount[0] ;
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
      AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV15FilterFullText ;
      AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV26TFDevCruId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV57TFDevCruSal ;
      AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV32TFCliCod ;
      AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV33TFCliCod_To ;
      AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV34TFCliNom ;
      AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV35TFCliNom_Sel ;
      AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV36TFTrnCod ;
      AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV37TFTrnCod_To ;
      AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV38TFTrnNom ;
      AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV40TFDevCruMat ;
      AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV68TFDevCruAtId ;
      AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV69TFDevCruAtId_Sel ;
      AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV52TFDevCruStt_Sels ;
      AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV42TFDevCruObs ;
      AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
      AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV61TFDevCruHash ;
      AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV62TFDevCruHash_Sel ;
      AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV63TFDevCruDesc ;
      AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV64TFDevCruDesc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV57TFDevCruSal, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV68TFDevCruAtId, AV69TFDevCruAtId_Sel, AV52TFDevCruStt_Sels, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV61TFDevCruHash, AV62TFDevCruHash_Sel, AV63TFDevCruDesc, AV64TFDevCruDesc_Sel, AV99Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV15FilterFullText ;
      AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV26TFDevCruId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV57TFDevCruSal ;
      AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV32TFCliCod ;
      AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV33TFCliCod_To ;
      AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV34TFCliNom ;
      AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV35TFCliNom_Sel ;
      AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV36TFTrnCod ;
      AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV37TFTrnCod_To ;
      AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV38TFTrnNom ;
      AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV40TFDevCruMat ;
      AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV68TFDevCruAtId ;
      AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV69TFDevCruAtId_Sel ;
      AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV52TFDevCruStt_Sels ;
      AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV42TFDevCruObs ;
      AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
      AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV61TFDevCruHash ;
      AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV62TFDevCruHash_Sel ;
      AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV63TFDevCruDesc ;
      AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV64TFDevCruDesc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV57TFDevCruSal, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV68TFDevCruAtId, AV69TFDevCruAtId_Sel, AV52TFDevCruStt_Sels, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV61TFDevCruHash, AV62TFDevCruHash_Sel, AV63TFDevCruDesc, AV64TFDevCruDesc_Sel, AV99Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV15FilterFullText ;
      AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV26TFDevCruId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV57TFDevCruSal ;
      AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV32TFCliCod ;
      AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV33TFCliCod_To ;
      AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV34TFCliNom ;
      AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV35TFCliNom_Sel ;
      AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV36TFTrnCod ;
      AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV37TFTrnCod_To ;
      AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV38TFTrnNom ;
      AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV40TFDevCruMat ;
      AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV68TFDevCruAtId ;
      AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV69TFDevCruAtId_Sel ;
      AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV52TFDevCruStt_Sels ;
      AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV42TFDevCruObs ;
      AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
      AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV61TFDevCruHash ;
      AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV62TFDevCruHash_Sel ;
      AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV63TFDevCruDesc ;
      AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV64TFDevCruDesc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV57TFDevCruSal, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV68TFDevCruAtId, AV69TFDevCruAtId_Sel, AV52TFDevCruStt_Sels, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV61TFDevCruHash, AV62TFDevCruHash_Sel, AV63TFDevCruDesc, AV64TFDevCruDesc_Sel, AV99Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV15FilterFullText ;
      AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV26TFDevCruId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV57TFDevCruSal ;
      AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV32TFCliCod ;
      AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV33TFCliCod_To ;
      AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV34TFCliNom ;
      AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV35TFCliNom_Sel ;
      AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV36TFTrnCod ;
      AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV37TFTrnCod_To ;
      AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV38TFTrnNom ;
      AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV40TFDevCruMat ;
      AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV68TFDevCruAtId ;
      AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV69TFDevCruAtId_Sel ;
      AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV52TFDevCruStt_Sels ;
      AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV42TFDevCruObs ;
      AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
      AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV61TFDevCruHash ;
      AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV62TFDevCruHash_Sel ;
      AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV63TFDevCruDesc ;
      AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV64TFDevCruDesc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV57TFDevCruSal, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV68TFDevCruAtId, AV69TFDevCruAtId_Sel, AV52TFDevCruStt_Sels, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV61TFDevCruHash, AV62TFDevCruHash_Sel, AV63TFDevCruDesc, AV64TFDevCruDesc_Sel, AV99Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV15FilterFullText ;
      AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV26TFDevCruId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV57TFDevCruSal ;
      AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV32TFCliCod ;
      AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV33TFCliCod_To ;
      AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV34TFCliNom ;
      AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV35TFCliNom_Sel ;
      AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV36TFTrnCod ;
      AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV37TFTrnCod_To ;
      AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV38TFTrnNom ;
      AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV40TFDevCruMat ;
      AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV68TFDevCruAtId ;
      AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV69TFDevCruAtId_Sel ;
      AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV52TFDevCruStt_Sels ;
      AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV42TFDevCruObs ;
      AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
      AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV61TFDevCruHash ;
      AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV62TFDevCruHash_Sel ;
      AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV63TFDevCruDesc ;
      AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV64TFDevCruDesc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV57TFDevCruSal, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV68TFDevCruAtId, AV69TFDevCruAtId_Sel, AV52TFDevCruStt_Sels, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV61TFDevCruHash, AV62TFDevCruHash_Sel, AV63TFDevCruDesc, AV64TFDevCruDesc_Sel, AV99Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV99Pgmname = "DevolucionAlmacenTejidoCrudosindetalleWW" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup16E0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2216E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvelop_confirmpanel_activardevolucion_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Title") ;
         Dvelop_confirmpanel_activardevolucion_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Confirmationtext") ;
         Dvelop_confirmpanel_activardevolucion_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_activardevolucion_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Nobuttoncaption") ;
         Dvelop_confirmpanel_activardevolucion_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_activardevolucion_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Yesbuttonposition") ;
         Dvelop_confirmpanel_activardevolucion_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_activardevolucion_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION_Result") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_devcrufecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DEVCRUFECAUXDATE");
            GX_FocusControl = edtavDdo_devcrufecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30DDO_DevCruFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30DDO_DevCruFecAuxDate", localUtil.format(AV30DDO_DevCruFecAuxDate, "99/99/99"));
         }
         else
         {
            AV30DDO_DevCruFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_devcrufecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30DDO_DevCruFecAuxDate", localUtil.format(AV30DDO_DevCruFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_devcrusalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DEVCRUSALAUXDATE");
            GX_FocusControl = edtavDdo_devcrusalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV59DDO_DevCruSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59DDO_DevCruSalAuxDate", localUtil.format(AV59DDO_DevCruSalAuxDate, "99/99/99"));
         }
         else
         {
            AV59DDO_DevCruSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_devcrusalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59DDO_DevCruSalAuxDate", localUtil.format(AV59DDO_DevCruSalAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e2216E2 ();
      if (returnInSub) return;
   }

   public void e2216E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV54Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Station", AV54Station);
      GXv_char2[0] = AV55EmprCod ;
      GXv_char3[0] = AV56EmprNom ;
      GXv_char4[0] = AV53Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char2, GXv_char3, GXv_char4) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV55EmprCod = GXv_char2[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV56EmprNom = GXv_char3[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV53Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Usurcod", AV53Usurcod);
      GXt_char1 = AV70Path ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV55EmprCod, httpContext.getMessage( "CPRPEM", ""), GXv_char4) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV70Path = GXt_char1 ;
      GXt_char1 = AV54Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV54Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Station", AV54Station);
      GXv_char4[0] = AV55EmprCod ;
      GXv_char3[0] = AV56EmprNom ;
      GXv_char2[0] = AV53Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char4, GXv_char3, GXv_char2) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV55EmprCod = GXv_char4[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV56EmprNom = GXv_char3[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV53Usurcod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Usurcod", AV53Usurcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Devolucion Almacen Tejido Crudo (sin detalle)", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2316E2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("DevolucionAlmacenTejidoCrudosindetalleWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("DevolucionAlmacenTejidoCrudosindetalleWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtDevCruId_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevCruFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruFec_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevCruSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruSal_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTrnCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTrnNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevCruMat_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruMat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruMat_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevCruAtId_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAtId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAtId_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbDevCruStt.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruStt.getInternalname(), "Visible", GXutil.ltrimstr( cmbDevCruStt.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtDevCruObs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruObs_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevCruHash_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruHash_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruHash_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevCruDesc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDesc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDesc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV46GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridCurrentPage), 10, 0));
      AV47GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridPageCount), 10, 0));
      AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV15FilterFullText ;
      AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV26TFDevCruId ;
      AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV57TFDevCruSal ;
      AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV32TFCliCod ;
      AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV33TFCliCod_To ;
      AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV34TFCliNom ;
      AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV35TFCliNom_Sel ;
      AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV36TFTrnCod ;
      AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV37TFTrnCod_To ;
      AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV38TFTrnNom ;
      AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV40TFDevCruMat ;
      AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV68TFDevCruAtId ;
      AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV69TFDevCruAtId_Sel ;
      AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV52TFDevCruStt_Sels ;
      AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV42TFDevCruObs ;
      AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
      AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV61TFDevCruHash ;
      AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV62TFDevCruHash_Sel ;
      AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV63TFDevCruDesc ;
      AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV64TFDevCruDesc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1216E2( )
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
         AV45PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV45PageToGo) ;
      }
   }

   public void e1316E2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1416E2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruId") == 0 )
         {
            AV26TFDevCruId = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFDevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFDevCruId), 8, 0));
            AV27TFDevCruId_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFDevCruId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFDevCruId_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruFec") == 0 )
         {
            AV28TFDevCruFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFDevCruFec", localUtil.format(AV28TFDevCruFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruSal") == 0 )
         {
            AV57TFDevCruSal = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFDevCruSal", localUtil.ttoc( AV57TFDevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV32TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod), 6, 0));
            AV33TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV34TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom", AV34TFCliNom);
            AV35TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TrnCod") == 0 )
         {
            AV36TFTrnCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFTrnCod), 4, 0));
            AV37TFTrnCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFTrnCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TrnNom") == 0 )
         {
            AV38TFTrnNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFTrnNom", AV38TFTrnNom);
            AV39TFTrnNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFTrnNom_Sel", AV39TFTrnNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruMat") == 0 )
         {
            AV40TFDevCruMat = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFDevCruMat", AV40TFDevCruMat);
            AV41TFDevCruMat_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFDevCruMat_Sel", AV41TFDevCruMat_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruAtId") == 0 )
         {
            AV68TFDevCruAtId = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFDevCruAtId", AV68TFDevCruAtId);
            AV69TFDevCruAtId_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFDevCruAtId_Sel", AV69TFDevCruAtId_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruStt") == 0 )
         {
            AV51TFDevCruStt_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDevCruStt_SelsJson", AV51TFDevCruStt_SelsJson);
            AV52TFDevCruStt_Sels.fromJSonString(AV51TFDevCruStt_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruObs") == 0 )
         {
            AV42TFDevCruObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFDevCruObs", AV42TFDevCruObs);
            AV43TFDevCruObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFDevCruObs_Sel", AV43TFDevCruObs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruHash") == 0 )
         {
            AV61TFDevCruHash = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFDevCruHash", AV61TFDevCruHash);
            AV62TFDevCruHash_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFDevCruHash_Sel", AV62TFDevCruHash_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruDesc") == 0 )
         {
            AV63TFDevCruDesc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFDevCruDesc", AV63TFDevCruDesc);
            AV64TFDevCruDesc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFDevCruDesc_Sel", AV64TFDevCruDesc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV52TFDevCruStt_Sels", AV52TFDevCruStt_Sels);
   }

   private void e2416E2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("5", httpContext.getMessage( "Activar Documento Anulado", ""), (short)(0));
      cmbavGridactions.addItem("6", httpContext.getMessage( "Crear Hash", ""), (short)(0));
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
   }

   public void e1516E2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "DevolucionAlmacenTejidoCrudosindetalleWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1116E2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("DevolucionAlmacenTejidoCrudosindetalleWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV99Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("DevolucionAlmacenTejidoCrudosindetalleWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "DevolucionAlmacenTejidoCrudosindetalleWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV99Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV52TFDevCruStt_Sels", AV52TFDevCruStt_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e2516E2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV48GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 3 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 4 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 5 )
      {
         /* Execute user subroutine: 'DO ACTIVARDEVOLUCION' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 6 )
      {
         /* Execute user subroutine: 'DO CREARHASH' */
         S242 ();
         if (returnInSub) return;
      }
      AV48GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1616E2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11678DevCruStt, "A") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento Anulado", ""));
      }
      else
      {
         if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
         {
            /* Execute user subroutine: 'DO ACTION ELIMINAR' */
            S252 ();
            if (returnInSub) return;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1716E2( )
   {
      /* Dvelop_confirmpanel_activardevolucion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_activardevolucion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ACTIVARDEVOLUCION' */
         S262 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1816E2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.devolucionalmacentejidocrudosindetalle", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","DevCruId"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e1916E2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.devolucionalmacentejidocrudosindetallewwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV52TFDevCruStt_Sels", AV52TFDevCruStt_Sels);
   }

   public void e2016E2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.devolucionalmacentejidocrudosindetallewwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV52TFDevCruStt_Sels", AV52TFDevCruStt_Sels);
   }

   public void e2116E2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.devolucionalmacentejidocrudosindetallewwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV52TFDevCruStt_Sels", AV52TFDevCruStt_Sels);
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruId", "", "Devolucion Id", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruFec", "", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruSal", "Salida", "Fecha-Hora", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TrnCod", "", "Cod Transp", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TrnNom", "", "Transportista", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruMat", "", "Matricula", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruAtId", "", "ATDocCodeID", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruStt", "", "Status", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruObs", "", "Observaciones", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruHash", "Hash", "Codigo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruDesc", "Hash", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "DevolucionAlmacenTejidoCrudosindetalleWWColumnsSelector", GXv_char4) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "DevolucionAlmacenTejidoCrudosindetalleWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFDevCruId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFDevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFDevCruId), 8, 0));
      AV27TFDevCruId_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFDevCruId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFDevCruId_To), 8, 0));
      AV28TFDevCruFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFDevCruFec", localUtil.format(AV28TFDevCruFec, "99/99/99"));
      AV57TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFDevCruSal", localUtil.ttoc( AV57TFDevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV32TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod), 6, 0));
      AV33TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFCliCod_To), 6, 0));
      AV34TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom", AV34TFCliNom);
      AV35TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
      AV36TFTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFTrnCod), 4, 0));
      AV37TFTrnCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFTrnCod_To), 4, 0));
      AV38TFTrnNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFTrnNom", AV38TFTrnNom);
      AV39TFTrnNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFTrnNom_Sel", AV39TFTrnNom_Sel);
      AV40TFDevCruMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFDevCruMat", AV40TFDevCruMat);
      AV41TFDevCruMat_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFDevCruMat_Sel", AV41TFDevCruMat_Sel);
      AV68TFDevCruAtId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFDevCruAtId", AV68TFDevCruAtId);
      AV69TFDevCruAtId_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFDevCruAtId_Sel", AV69TFDevCruAtId_Sel);
      AV52TFDevCruStt_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42TFDevCruObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFDevCruObs", AV42TFDevCruObs);
      AV43TFDevCruObs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFDevCruObs_Sel", AV43TFDevCruObs_Sel);
      AV61TFDevCruHash = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFDevCruHash", AV61TFDevCruHash);
      AV62TFDevCruHash_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFDevCruHash_Sel", AV62TFDevCruHash_Sel);
      AV63TFDevCruDesc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFDevCruDesc", AV63TFDevCruDesc);
      AV64TFDevCruDesc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFDevCruDesc_Sel", AV64TFDevCruDesc_Sel);
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
         callWebObject(formatLink("app.devolucionalmacentejidocrudosindetalle", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0))}, new String[] {"Mode","EmprCod","DevCruId"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      callWebObject(formatLink("app.devolucionalmacentejidocrudosindetalle", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0))}, new String[] {"Mode","EmprCod","DevCruId"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11678DevCruStt, httpContext.getMessage( "A", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento ANULADO", ""));
      }
      else
      {
         if ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""));
         }
         else
         {
            callWebObject(formatLink("app.devolucionalmacentejidocrudosindetalle", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0))}, new String[] {"Mode","EmprCod","DevCruId"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
   }

   public void S212( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11678DevCruStt, httpContext.getMessage( "A", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento ANULADO", ""));
      }
      else
      {
         if ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""));
         }
         else
         {
            Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Desea eliminar el registro ", "")+GXutil.trim( GXutil.str( A11669DevCruId, 8, 0))+"?" ;
            ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
            AV100Emprcod_selected = A396EmprCod ;
            AV101Devcruid_selected = A11669DevCruId ;
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
         }
      }
   }

   public void S252( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.pdeldevcru(remoteHandle, context).execute( A396EmprCod, A11669DevCruId) ;
      httpContext.doAjaxRefresh();
   }

   public void S222( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.almacensindetalle.imprimirdevolucion", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0))}, new String[] {"Emprcod","DevCruId"}) , new Object[] {"A396EmprCod","A11669DevCruId"});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO ACTIVARDEVOLUCION' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11678DevCruStt, httpContext.getMessage( "A", "")) == 0 )
      {
         Dvelop_confirmpanel_activardevolucion_Confirmationtext = httpContext.getMessage( "Deseas activar la Devolucion ", "")+GXutil.trim( GXutil.str( A11669DevCruId, 8, 0))+"?" ;
         ucDvelop_confirmpanel_activardevolucion.sendProperty(context, "", false, Dvelop_confirmpanel_activardevolucion_Internalname, "ConfirmationText", Dvelop_confirmpanel_activardevolucion_Confirmationtext);
         AV100Emprcod_selected = A396EmprCod ;
         AV101Devcruid_selected = A11669DevCruId ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCIONContainer", "Confirm", "", new Object[] {});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "El Documento no esta como ANULADO", ""));
      }
   }

   public void S262( )
   {
      /* 'DO ACTION ACTIVARDEVOLUCION' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A11669DevCruId ;
      GXv_char3[0] = AV53Usurcod ;
      GXv_char2[0] = AV54Station ;
      new app.devolucionalmacentejidoactivar(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.A396EmprCod = GXv_char4[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.A11669DevCruId = GXv_int12[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV53Usurcod = GXv_char3[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV54Station = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Usurcod", AV53Usurcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV54Station", AV54Station);
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO CREARHASH' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A11669DevCruId ;
      GXv_date13[0] = A11670DevCruFec ;
      GXv_dtime14[0] = A11676DevCruDtSy ;
      GXv_int15[0] = (byte)(3) ;
      GXv_int16[0] = (byte)(1) ;
      GXv_char3[0] = AV65Cadena ;
      new app.almacensindetalle.obtengocadenaparahashdevolucionalmacen(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_date13, GXv_dtime14, GXv_int15, GXv_int16, GXv_char3) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.A396EmprCod = GXv_char4[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.A11669DevCruId = GXv_int12[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.A11670DevCruFec = GXv_date13[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.A11676DevCruDtSy = GXv_dtime14[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV65Cadena = GXv_char3[0] ;
      GXv_char4[0] = AV67Hash ;
      GXv_objcol_SdtMessages_Message17[0] = AV71Messages ;
      GXv_boolean18[0] = AV72OK ;
      new app.hash_obtener(remoteHandle, context).execute( AV65Cadena, GXv_char4, GXv_objcol_SdtMessages_Message17, GXv_boolean18) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV67Hash = GXv_char4[0] ;
      AV71Messages = GXv_objcol_SdtMessages_Message17[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV72OK = GXv_boolean18[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A11669DevCruId ;
      GXv_char3[0] = AV65Cadena ;
      GXv_char2[0] = AV67Hash ;
      new app.almacensindetalle.actualizohashdevolucionalmacen(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.A396EmprCod = GXv_char4[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.A11669DevCruId = GXv_int12[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV65Cadena = GXv_char3[0] ;
      devolucionalmacentejidocrudosindetalleww_impl.this.AV67Hash = GXv_char2[0] ;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV99Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV99Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV99Pgmname+"GridState"), null, null);
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
      AV102GXV1 = 1 ;
      while ( AV102GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV102GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUID") == 0 )
         {
            AV26TFDevCruId = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFDevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFDevCruId), 8, 0));
            AV27TFDevCruId_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFDevCruId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFDevCruId_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUFEC") == 0 )
         {
            AV28TFDevCruFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFDevCruFec", localUtil.format(AV28TFDevCruFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSAL") == 0 )
         {
            AV57TFDevCruSal = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFDevCruSal", localUtil.ttoc( AV57TFDevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV59DDO_DevCruSalAuxDate = GXutil.resetTime(AV57TFDevCruSal) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59DDO_DevCruSalAuxDate", localUtil.format(AV59DDO_DevCruSalAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV32TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod), 6, 0));
            AV33TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV34TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom", AV34TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV35TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV36TFTrnCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFTrnCod), 4, 0));
            AV37TFTrnCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFTrnCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV38TFTrnNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFTrnNom", AV38TFTrnNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV39TFTrnNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFTrnNom_Sel", AV39TFTrnNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV40TFDevCruMat = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFDevCruMat", AV40TFDevCruMat);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV41TFDevCruMat_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFDevCruMat_Sel", AV41TFDevCruMat_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID") == 0 )
         {
            AV68TFDevCruAtId = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFDevCruAtId", AV68TFDevCruAtId);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID_SEL") == 0 )
         {
            AV69TFDevCruAtId_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFDevCruAtId_Sel", AV69TFDevCruAtId_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSTT_SEL") == 0 )
         {
            AV51TFDevCruStt_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDevCruStt_SelsJson", AV51TFDevCruStt_SelsJson);
            AV52TFDevCruStt_Sels.fromJSonString(AV51TFDevCruStt_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV42TFDevCruObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFDevCruObs", AV42TFDevCruObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV43TFDevCruObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFDevCruObs_Sel", AV43TFDevCruObs_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH") == 0 )
         {
            AV61TFDevCruHash = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFDevCruHash", AV61TFDevCruHash);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH_SEL") == 0 )
         {
            AV62TFDevCruHash_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFDevCruHash_Sel", AV62TFDevCruHash_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC") == 0 )
         {
            AV63TFDevCruDesc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFDevCruDesc", AV63TFDevCruDesc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC_SEL") == 0 )
         {
            AV64TFDevCruDesc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFDevCruDesc_Sel", AV64TFDevCruDesc_Sel);
         }
         AV102GXV1 = (int)(AV102GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFCliNom_Sel)==0), AV35TFCliNom_Sel, GXv_char4) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFTrnNom_Sel)==0), AV39TFTrnNom_Sel, GXv_char3) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char20 = "" ;
      GXv_char2[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFDevCruMat_Sel)==0), AV41TFDevCruMat_Sel, GXv_char2) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char20 = GXv_char2[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFDevCruAtId_Sel)==0), AV69TFDevCruAtId_Sel, GXv_char22) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV52TFDevCruStt_Sels.size()==0), AV51TFDevCruStt_SelsJson, GXv_char24) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFDevCruObs_Sel)==0), AV43TFDevCruObs_Sel, GXv_char26) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFDevCruHash_Sel)==0), AV62TFDevCruHash_Sel, GXv_char28) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFDevCruDesc_Sel)==0), AV64TFDevCruDesc_Sel, GXv_char30) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char29 = GXv_char30[0] ;
      Ddo_grid_Selectedvalue_set = "||||"+GXt_char1+"||"+GXt_char19+"|"+GXt_char20+"|"+GXt_char21+"|"+GXt_char23+"|"+GXt_char25+"|"+GXt_char27+"|"+GXt_char29 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFCliNom)==0), AV34TFCliNom, GXv_char30) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFTrnNom)==0), AV38TFTrnNom, GXv_char28) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFDevCruMat)==0), AV40TFDevCruMat, GXv_char26) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFDevCruAtId)==0), AV68TFDevCruAtId, GXv_char24) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFDevCruObs)==0), AV42TFDevCruObs, GXv_char22) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFDevCruHash)==0), AV61TFDevCruHash, GXv_char4) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFDevCruDesc)==0), AV63TFDevCruDesc, GXv_char3) ;
      devolucionalmacentejidocrudosindetalleww_impl.this.GXt_char19 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFDevCruId) ? "" : GXutil.str( AV26TFDevCruId, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFDevCruFec)) ? "" : localUtil.dtoc( AV28TFDevCruFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV57TFDevCruSal) ? "" : localUtil.dtoc( AV59DDO_DevCruSalAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV32TFCliCod) ? "" : GXutil.str( AV32TFCliCod, 6, 0))+"|"+GXt_char29+"|"+((0==AV36TFTrnCod) ? "" : GXutil.str( AV36TFTrnCod, 4, 0))+"|"+GXt_char27+"|"+GXt_char25+"|"+GXt_char23+"||"+GXt_char21+"|"+GXt_char20+"|"+GXt_char19 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFDevCruId_To) ? "" : GXutil.str( AV27TFDevCruId_To, 8, 0))+"|||"+((0==AV33TFCliCod_To) ? "" : GXutil.str( AV33TFCliCod_To, 6, 0))+"||"+((0==AV37TFTrnCod_To) ? "" : GXutil.str( AV37TFTrnCod_To, 4, 0))+"|||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV99Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDEVCRUID", "", !((0==AV26TFDevCruId)&&(0==AV27TFDevCruId_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFDevCruId, 8, 0)), GXutil.trim( GXutil.str( AV27TFDevCruId_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDEVCRUFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFDevCruFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV28TFDevCruFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDEVCRUSAL", "", !GXutil.dateCompare(GXutil.nullDate(), AV57TFDevCruSal), (short)(0), GXutil.trim( localUtil.ttoc( AV57TFDevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFCLICOD", "", !((0==AV32TFCliCod)&&(0==AV33TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV33TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFCLINOM", "", !(GXutil.strcmp("", AV34TFCliNom)==0), (short)(0), AV34TFCliNom, "", !(GXutil.strcmp("", AV35TFCliNom_Sel)==0), AV35TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFTRNCOD", "", !((0==AV36TFTrnCod)&&(0==AV37TFTrnCod_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFTrnCod, 4, 0)), GXutil.trim( GXutil.str( AV37TFTrnCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFTRNNOM", "", !(GXutil.strcmp("", AV38TFTrnNom)==0), (short)(0), AV38TFTrnNom, "", !(GXutil.strcmp("", AV39TFTrnNom_Sel)==0), AV39TFTrnNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDEVCRUMAT", "", !(GXutil.strcmp("", AV40TFDevCruMat)==0), (short)(0), AV40TFDevCruMat, "", !(GXutil.strcmp("", AV41TFDevCruMat_Sel)==0), AV41TFDevCruMat_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDEVCRUATID", "", !(GXutil.strcmp("", AV68TFDevCruAtId)==0), (short)(0), AV68TFDevCruAtId, "", !(GXutil.strcmp("", AV69TFDevCruAtId_Sel)==0), AV69TFDevCruAtId_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDEVCRUSTT_SEL", "", !(AV52TFDevCruStt_Sels.size()==0), (short)(0), AV52TFDevCruStt_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDEVCRUOBS", "", !(GXutil.strcmp("", AV42TFDevCruObs)==0), (short)(0), AV42TFDevCruObs, "", !(GXutil.strcmp("", AV43TFDevCruObs_Sel)==0), AV43TFDevCruObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDEVCRUHASH", "", !(GXutil.strcmp("", AV61TFDevCruHash)==0), (short)(0), AV61TFDevCruHash, "", !(GXutil.strcmp("", AV62TFDevCruHash_Sel)==0), AV62TFDevCruHash_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDEVCRUDESC", "", !(GXutil.strcmp("", AV63TFDevCruDesc)==0), (short)(0), AV63TFDevCruDesc, "", !(GXutil.strcmp("", AV64TFDevCruDesc_Sel)==0), AV64TFDevCruDesc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV99Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV99Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DevolucionAlmacenTejidoCrudosindetalle" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table3_81_16E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_activardevolucion_Internalname, tblTabledvelop_confirmpanel_activardevolucion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_activardevolucion.setProperty("Title", Dvelop_confirmpanel_activardevolucion_Title);
         ucDvelop_confirmpanel_activardevolucion.setProperty("ConfirmationText", Dvelop_confirmpanel_activardevolucion_Confirmationtext);
         ucDvelop_confirmpanel_activardevolucion.setProperty("YesButtonCaption", Dvelop_confirmpanel_activardevolucion_Yesbuttoncaption);
         ucDvelop_confirmpanel_activardevolucion.setProperty("NoButtonCaption", Dvelop_confirmpanel_activardevolucion_Nobuttoncaption);
         ucDvelop_confirmpanel_activardevolucion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_activardevolucion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_activardevolucion.setProperty("YesButtonPosition", Dvelop_confirmpanel_activardevolucion_Yesbuttonposition);
         ucDvelop_confirmpanel_activardevolucion.setProperty("ConfirmType", Dvelop_confirmpanel_activardevolucion_Confirmtype);
         ucDvelop_confirmpanel_activardevolucion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_activardevolucion_Internalname, "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_81_16E2e( true) ;
      }
      else
      {
         wb_table3_81_16E2e( false) ;
      }
   }

   public void wb_table2_76_16E2( boolean wbgen )
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
         wb_table2_76_16E2e( true) ;
      }
      else
      {
         wb_table2_76_16E2e( false) ;
      }
   }

   public void wb_table1_27_16E2( boolean wbgen )
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
         wb_table4_32_16E2( true) ;
      }
      else
      {
         wb_table4_32_16E2( false) ;
      }
      return  ;
   }

   public void wb_table4_32_16E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_16E2e( true) ;
      }
      else
      {
         wb_table1_27_16E2e( false) ;
      }
   }

   public void wb_table4_32_16E2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_DevolucionAlmacenTejidoCrudosindetalleWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_32_16E2e( true) ;
      }
      else
      {
         wb_table4_32_16E2e( false) ;
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
      pa16E2( ) ;
      ws16E2( ) ;
      we16E2( ) ;
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
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116132362", true, true);
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
      httpContext.AddJavascriptSource("devolucionalmacentejidocrudosindetalleww.js", "?202682116132362", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_idx ;
      edtDevCruId_Internalname = "DEVCRUID_"+sGXsfl_45_idx ;
      edtDevCruFec_Internalname = "DEVCRUFEC_"+sGXsfl_45_idx ;
      edtDevCruSal_Internalname = "DEVCRUSAL_"+sGXsfl_45_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_idx ;
      edtTrnCod_Internalname = "TRNCOD_"+sGXsfl_45_idx ;
      edtTrnNom_Internalname = "TRNNOM_"+sGXsfl_45_idx ;
      edtDevCruEst_Internalname = "DEVCRUEST_"+sGXsfl_45_idx ;
      edtDevCruMat_Internalname = "DEVCRUMAT_"+sGXsfl_45_idx ;
      edtDevCruDtSy_Internalname = "DEVCRUDTSY_"+sGXsfl_45_idx ;
      edtDevCruGros_Internalname = "DEVCRUGROS_"+sGXsfl_45_idx ;
      edtDevCruEnvA_Internalname = "DEVCRUENVA_"+sGXsfl_45_idx ;
      edtDevCruAtId_Internalname = "DEVCRUATID_"+sGXsfl_45_idx ;
      cmbDevCruStt.setInternalname( "DEVCRUSTT_"+sGXsfl_45_idx );
      edtDevCruAT_Internalname = "DEVCRUAT_"+sGXsfl_45_idx ;
      edtDevCruObs_Internalname = "DEVCRUOBS_"+sGXsfl_45_idx ;
      edtDevCruHash_Internalname = "DEVCRUHASH_"+sGXsfl_45_idx ;
      edtDevCruDesc_Internalname = "DEVCRUDESC_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_fel_idx ;
      edtDevCruId_Internalname = "DEVCRUID_"+sGXsfl_45_fel_idx ;
      edtDevCruFec_Internalname = "DEVCRUFEC_"+sGXsfl_45_fel_idx ;
      edtDevCruSal_Internalname = "DEVCRUSAL_"+sGXsfl_45_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_fel_idx ;
      edtTrnCod_Internalname = "TRNCOD_"+sGXsfl_45_fel_idx ;
      edtTrnNom_Internalname = "TRNNOM_"+sGXsfl_45_fel_idx ;
      edtDevCruEst_Internalname = "DEVCRUEST_"+sGXsfl_45_fel_idx ;
      edtDevCruMat_Internalname = "DEVCRUMAT_"+sGXsfl_45_fel_idx ;
      edtDevCruDtSy_Internalname = "DEVCRUDTSY_"+sGXsfl_45_fel_idx ;
      edtDevCruGros_Internalname = "DEVCRUGROS_"+sGXsfl_45_fel_idx ;
      edtDevCruEnvA_Internalname = "DEVCRUENVA_"+sGXsfl_45_fel_idx ;
      edtDevCruAtId_Internalname = "DEVCRUATID_"+sGXsfl_45_fel_idx ;
      cmbDevCruStt.setInternalname( "DEVCRUSTT_"+sGXsfl_45_fel_idx );
      edtDevCruAT_Internalname = "DEVCRUAT_"+sGXsfl_45_fel_idx ;
      edtDevCruObs_Internalname = "DEVCRUOBS_"+sGXsfl_45_fel_idx ;
      edtDevCruHash_Internalname = "DEVCRUHASH_"+sGXsfl_45_fel_idx ;
      edtDevCruDesc_Internalname = "DEVCRUDESC_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb16E0( ) ;
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
               AV48GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV48GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV48GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_45_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevCruId_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruId_Internalname,GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevCruId_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevCruFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruFec_Internalname,localUtil.format(A11670DevCruFec, "99/99/99"),localUtil.format( A11670DevCruFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDevCruFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevCruSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruSal_Internalname,localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11673DevCruSal, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevCruSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnNom_Internalname,GXutil.rtrim( A841TrnNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrnNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTrnNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruEst_Internalname,GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDevCruMat_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruMat_Internalname,GXutil.rtrim( A11672DevCruMat),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruMat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevCruMat_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruDtSy_Internalname,localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruDtSy_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruGros_Internalname,GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruGros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruEnvA_Internalname,GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruEnvA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDevCruAtId_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruAtId_Internalname,GXutil.rtrim( A11680DevCruAtId),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruAtId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevCruAtId_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbDevCruStt.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbDevCruStt.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DEVCRUSTT_" + sGXsfl_45_idx ;
            cmbDevCruStt.setName( GXCCtl );
            cmbDevCruStt.setWebtags( "" );
            cmbDevCruStt.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
            cmbDevCruStt.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
            if ( cmbDevCruStt.getItemCount() > 0 )
            {
               A11678DevCruStt = cmbDevCruStt.getValidValue(A11678DevCruStt) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDevCruStt,cmbDevCruStt.getInternalname(),GXutil.rtrim( A11678DevCruStt),Integer.valueOf(1),cmbDevCruStt.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbDevCruStt.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbDevCruStt.setValue( GXutil.rtrim( A11678DevCruStt) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDevCruStt.getInternalname(), "Values", cmbDevCruStt.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruAT_Internalname,GXutil.rtrim( A11681DevCruAT),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruAT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDevCruObs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruObs_Internalname,A11682DevCruObs,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevCruObs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDevCruHash_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruHash_Internalname,GXutil.rtrim( A11674DevCruHash),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruHash_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevCruHash_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDevCruDesc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruDesc_Internalname,GXutil.rtrim( A11675DevCruDesc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruDesc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevCruDesc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes16E2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruId_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Devolucion Id", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruSal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTrnCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod Transp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTrnNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruMat_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Matricula", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruAtId_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ATDocCodeID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbDevCruStt.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Status", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruObs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruHash_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruDesc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV48GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruId_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A11670DevCruFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruSal_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTrnCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A841TrnNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTrnNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11672DevCruMat));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruMat_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11680DevCruAtId));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruAtId_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11678DevCruStt));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbDevCruStt.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11681DevCruAT));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A11682DevCruObs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruObs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11674DevCruHash));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruHash_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11675DevCruDesc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruDesc_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtDevCruId_Internalname = "DEVCRUID" ;
      edtDevCruFec_Internalname = "DEVCRUFEC" ;
      edtDevCruSal_Internalname = "DEVCRUSAL" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      edtDevCruEst_Internalname = "DEVCRUEST" ;
      edtDevCruMat_Internalname = "DEVCRUMAT" ;
      edtDevCruDtSy_Internalname = "DEVCRUDTSY" ;
      edtDevCruGros_Internalname = "DEVCRUGROS" ;
      edtDevCruEnvA_Internalname = "DEVCRUENVA" ;
      edtDevCruAtId_Internalname = "DEVCRUATID" ;
      cmbDevCruStt.setInternalname( "DEVCRUSTT" );
      edtDevCruAT_Internalname = "DEVCRUAT" ;
      edtDevCruObs_Internalname = "DEVCRUOBS" ;
      edtDevCruHash_Internalname = "DEVCRUHASH" ;
      edtDevCruDesc_Internalname = "DEVCRUDESC" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_activardevolucion_Internalname = "DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION" ;
      tblTabledvelop_confirmpanel_activardevolucion_Internalname = "TABLEDVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_devcrufecauxdate_Internalname = "vDDO_DEVCRUFECAUXDATE" ;
      divDdo_devcrufecauxdates_Internalname = "DDO_DEVCRUFECAUXDATES" ;
      edtavDdo_devcrusalauxdate_Internalname = "vDDO_DEVCRUSALAUXDATE" ;
      divDdo_devcrusalauxdates_Internalname = "DDO_DEVCRUSALAUXDATES" ;
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
      edtDevCruDesc_Jsonclick = "" ;
      edtDevCruHash_Jsonclick = "" ;
      edtDevCruObs_Jsonclick = "" ;
      edtDevCruAT_Jsonclick = "" ;
      cmbDevCruStt.setJsonclick( "" );
      edtDevCruAtId_Jsonclick = "" ;
      edtDevCruEnvA_Jsonclick = "" ;
      edtDevCruGros_Jsonclick = "" ;
      edtDevCruDtSy_Jsonclick = "" ;
      edtDevCruMat_Jsonclick = "" ;
      edtDevCruEst_Jsonclick = "" ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtDevCruSal_Jsonclick = "" ;
      edtDevCruFec_Jsonclick = "" ;
      edtDevCruId_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtDevCruDesc_Visible = -1 ;
      edtDevCruHash_Visible = -1 ;
      edtDevCruObs_Visible = -1 ;
      cmbDevCruStt.setVisible( -1 );
      edtDevCruAtId_Visible = -1 ;
      edtDevCruMat_Visible = -1 ;
      edtTrnNom_Visible = -1 ;
      edtTrnCod_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtDevCruSal_Visible = -1 ;
      edtDevCruFec_Visible = -1 ;
      edtDevCruId_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_devcrusalauxdate_Jsonclick = "" ;
      edtavDdo_devcrufecauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;Salida;;;;;;;;;;;;;;Hash;Hash" ;
      Dvelop_confirmpanel_activardevolucion_Confirmtype = "1" ;
      Dvelop_confirmpanel_activardevolucion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_activardevolucion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_activardevolucion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_activardevolucion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_activardevolucion_Confirmationtext = "¿Deseas activar la Devolucion?" ;
      Dvelop_confirmpanel_activardevolucion_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Deseas eliminar el registro seleccionado?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "DevolucionAlmacenTejidoCrudosindetalleWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||:Activo,A:Anulado|||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||T|||" ;
      Ddo_grid_Datalisttype = "||||Dynamic||Dynamic|Dynamic|Dynamic|FixedValues|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "||||T||T|T|T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "T|||T||T|||||||" ;
      Ddo_grid_Filtertype = "Numeric|Date|Date|Numeric|Character|Numeric|Character|Character|Character||Character|Character|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T||T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|13" ;
      Ddo_grid_Columnids = "3:DevCruId|4:DevCruFec|5:DevCruSal|6:CliCod|7:CliNom|8:TrnCod|9:TrnNom|11:DevCruMat|15:DevCruAtId|16:DevCruStt|18:DevCruObs|19:DevCruHash|20:DevCruDesc" ;
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
      Form.setCaption( httpContext.getMessage( " Devolucion Almacen Tejido Crudo (sin detalle)", "") );
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
         AV48GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV48GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
      }
      GXCCtl = "DEVCRUSTT_" + sGXsfl_45_idx ;
      cmbDevCruStt.setName( GXCCtl );
      cmbDevCruStt.setWebtags( "" );
      cmbDevCruStt.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbDevCruStt.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbDevCruStt.getItemCount() > 0 )
      {
         A11678DevCruStt = cmbDevCruStt.getValidValue(A11678DevCruStt) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDevCruId_Visible',ctrl:'DEVCRUID',prop:'Visible'},{av:'edtDevCruFec_Visible',ctrl:'DEVCRUFEC',prop:'Visible'},{av:'edtDevCruSal_Visible',ctrl:'DEVCRUSAL',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtDevCruMat_Visible',ctrl:'DEVCRUMAT',prop:'Visible'},{av:'edtDevCruAtId_Visible',ctrl:'DEVCRUATID',prop:'Visible'},{av:'cmbDevCruStt'},{av:'edtDevCruObs_Visible',ctrl:'DEVCRUOBS',prop:'Visible'},{av:'edtDevCruHash_Visible',ctrl:'DEVCRUHASH',prop:'Visible'},{av:'edtDevCruDesc_Visible',ctrl:'DEVCRUDESC',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1216E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1316E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1416E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV51TFDevCruStt_SelsJson',fld:'vTFDEVCRUSTT_SELSJSON',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2416E2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1516E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtDevCruId_Visible',ctrl:'DEVCRUID',prop:'Visible'},{av:'edtDevCruFec_Visible',ctrl:'DEVCRUFEC',prop:'Visible'},{av:'edtDevCruSal_Visible',ctrl:'DEVCRUSAL',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtDevCruMat_Visible',ctrl:'DEVCRUMAT',prop:'Visible'},{av:'edtDevCruAtId_Visible',ctrl:'DEVCRUATID',prop:'Visible'},{av:'cmbDevCruStt'},{av:'edtDevCruObs_Visible',ctrl:'DEVCRUOBS',prop:'Visible'},{av:'edtDevCruHash_Visible',ctrl:'DEVCRUHASH',prop:'Visible'},{av:'edtDevCruDesc_Visible',ctrl:'DEVCRUDESC',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1116E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV51TFDevCruStt_SelsJson',fld:'vTFDEVCRUSTT_SELSJSON',pic:''},{av:'AV59DDO_DevCruSalAuxDate',fld:'vDDO_DEVCRUSALAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV51TFDevCruStt_SelsJson',fld:'vTFDEVCRUSTT_SELSJSON',pic:''},{av:'AV59DDO_DevCruSalAuxDate',fld:'vDDO_DEVCRUSALAUXDATE',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDevCruId_Visible',ctrl:'DEVCRUID',prop:'Visible'},{av:'edtDevCruFec_Visible',ctrl:'DEVCRUFEC',prop:'Visible'},{av:'edtDevCruSal_Visible',ctrl:'DEVCRUSAL',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtDevCruMat_Visible',ctrl:'DEVCRUMAT',prop:'Visible'},{av:'edtDevCruAtId_Visible',ctrl:'DEVCRUATID',prop:'Visible'},{av:'cmbDevCruStt'},{av:'edtDevCruObs_Visible',ctrl:'DEVCRUOBS',prop:'Visible'},{av:'edtDevCruHash_Visible',ctrl:'DEVCRUHASH',prop:'Visible'},{av:'edtDevCruDesc_Visible',ctrl:'DEVCRUDESC',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2516E2',iparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbDevCruStt'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:'',hsh:true},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:'',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_activardevolucion_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION',prop:'ConfirmationText'},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDevCruId_Visible',ctrl:'DEVCRUID',prop:'Visible'},{av:'edtDevCruFec_Visible',ctrl:'DEVCRUFEC',prop:'Visible'},{av:'edtDevCruSal_Visible',ctrl:'DEVCRUSAL',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtDevCruMat_Visible',ctrl:'DEVCRUMAT',prop:'Visible'},{av:'edtDevCruAtId_Visible',ctrl:'DEVCRUATID',prop:'Visible'},{av:'cmbDevCruStt'},{av:'edtDevCruObs_Visible',ctrl:'DEVCRUOBS',prop:'Visible'},{av:'edtDevCruHash_Visible',ctrl:'DEVCRUHASH',prop:'Visible'},{av:'edtDevCruDesc_Visible',ctrl:'DEVCRUDESC',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e1616E2',iparms:[{av:'cmbDevCruStt'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:'',hsh:true},{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDevCruId_Visible',ctrl:'DEVCRUID',prop:'Visible'},{av:'edtDevCruFec_Visible',ctrl:'DEVCRUFEC',prop:'Visible'},{av:'edtDevCruSal_Visible',ctrl:'DEVCRUSAL',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtDevCruMat_Visible',ctrl:'DEVCRUMAT',prop:'Visible'},{av:'edtDevCruAtId_Visible',ctrl:'DEVCRUATID',prop:'Visible'},{av:'cmbDevCruStt'},{av:'edtDevCruObs_Visible',ctrl:'DEVCRUOBS',prop:'Visible'},{av:'edtDevCruHash_Visible',ctrl:'DEVCRUHASH',prop:'Visible'},{av:'edtDevCruDesc_Visible',ctrl:'DEVCRUDESC',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION.CLOSE","{handler:'e1716E2',iparms:[{av:'Dvelop_confirmpanel_activardevolucion_Result',ctrl:'DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'AV53Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV54Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ACTIVARDEVOLUCION.CLOSE",",oparms:[{av:'AV54Station',fld:'vSTATION',pic:''},{av:'AV53Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDevCruId_Visible',ctrl:'DEVCRUID',prop:'Visible'},{av:'edtDevCruFec_Visible',ctrl:'DEVCRUFEC',prop:'Visible'},{av:'edtDevCruSal_Visible',ctrl:'DEVCRUSAL',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtDevCruMat_Visible',ctrl:'DEVCRUMAT',prop:'Visible'},{av:'edtDevCruAtId_Visible',ctrl:'DEVCRUATID',prop:'Visible'},{av:'cmbDevCruStt'},{av:'edtDevCruObs_Visible',ctrl:'DEVCRUOBS',prop:'Visible'},{av:'edtDevCruHash_Visible',ctrl:'DEVCRUHASH',prop:'Visible'},{av:'edtDevCruDesc_Visible',ctrl:'DEVCRUDESC',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1816E2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1916E2',iparms:[{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV51TFDevCruStt_SelsJson',fld:'vTFDEVCRUSTT_SELSJSON',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV59DDO_DevCruSalAuxDate',fld:'vDDO_DEVCRUSALAUXDATE',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV51TFDevCruStt_SelsJson',fld:'vTFDEVCRUSTT_SELSJSON',pic:''},{av:'AV59DDO_DevCruSalAuxDate',fld:'vDDO_DEVCRUSALAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e2016E2',iparms:[{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV51TFDevCruStt_SelsJson',fld:'vTFDEVCRUSTT_SELSJSON',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV59DDO_DevCruSalAuxDate',fld:'vDDO_DEVCRUSALAUXDATE',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV51TFDevCruStt_SelsJson',fld:'vTFDEVCRUSTT_SELSJSON',pic:''},{av:'AV59DDO_DevCruSalAuxDate',fld:'vDDO_DEVCRUSALAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2116E2',iparms:[{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV51TFDevCruStt_SelsJson',fld:'vTFDEVCRUSTT_SELSJSON',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV59DDO_DevCruSalAuxDate',fld:'vDDO_DEVCRUSALAUXDATE',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV57TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV68TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV69TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV52TFDevCruStt_Sels',fld:'vTFDEVCRUSTT_SELS',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV61TFDevCruHash',fld:'vTFDEVCRUHASH',pic:''},{av:'AV62TFDevCruHash_Sel',fld:'vTFDEVCRUHASH_SEL',pic:''},{av:'AV63TFDevCruDesc',fld:'vTFDEVCRUDESC',pic:''},{av:'AV64TFDevCruDesc_Sel',fld:'vTFDEVCRUDESC_SEL',pic:''},{av:'AV99Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV51TFDevCruStt_SelsJson',fld:'vTFDEVCRUSTT_SELSJSON',pic:''},{av:'AV59DDO_DevCruSalAuxDate',fld:'vDDO_DEVCRUSALAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Devcrudesc',iparms:[]");
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
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_activardevolucion_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFDevCruFec = GXutil.nullDate() ;
      AV57TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV34TFCliNom = "" ;
      AV35TFCliNom_Sel = "" ;
      AV38TFTrnNom = "" ;
      AV39TFTrnNom_Sel = "" ;
      AV40TFDevCruMat = "" ;
      AV41TFDevCruMat_Sel = "" ;
      AV68TFDevCruAtId = "" ;
      AV69TFDevCruAtId_Sel = "" ;
      AV52TFDevCruStt_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42TFDevCruObs = "" ;
      AV43TFDevCruObs_Sel = "" ;
      AV61TFDevCruHash = "" ;
      AV62TFDevCruHash_Sel = "" ;
      AV63TFDevCruDesc = "" ;
      AV64TFDevCruDesc_Sel = "" ;
      AV99Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV51TFDevCruStt_SelsJson = "" ;
      AV53Usurcod = "" ;
      AV54Station = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
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
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV30DDO_DevCruFecAuxDate = GXutil.nullDate() ;
      AV59DDO_DevCruSalAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A11677DevCruGros = DecimalUtil.ZERO ;
      A11680DevCruAtId = "" ;
      A11678DevCruStt = "" ;
      A11681DevCruAT = "" ;
      A11682DevCruObs = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = "" ;
      lV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = "" ;
      lV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = "" ;
      lV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = "" ;
      lV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = "" ;
      lV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = "" ;
      lV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = "" ;
      lV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = "" ;
      AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = "" ;
      AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = GXutil.nullDate() ;
      AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = "" ;
      AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = "" ;
      AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = "" ;
      AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = "" ;
      AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = "" ;
      AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = "" ;
      AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = "" ;
      AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = "" ;
      AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = "" ;
      AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = "" ;
      AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = "" ;
      AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = "" ;
      AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = "" ;
      AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = "" ;
      H016E2_A11675DevCruDesc = new String[] {""} ;
      H016E2_A11674DevCruHash = new String[] {""} ;
      H016E2_A11682DevCruObs = new String[] {""} ;
      H016E2_A11681DevCruAT = new String[] {""} ;
      H016E2_A11678DevCruStt = new String[] {""} ;
      H016E2_A11680DevCruAtId = new String[] {""} ;
      H016E2_A11679DevCruEnvA = new byte[1] ;
      H016E2_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H016E2_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      H016E2_A11672DevCruMat = new String[] {""} ;
      H016E2_A11671DevCruEst = new byte[1] ;
      H016E2_A841TrnNom = new String[] {""} ;
      H016E2_n841TrnNom = new boolean[] {false} ;
      H016E2_A840TrnCod = new short[1] ;
      H016E2_n840TrnCod = new boolean[] {false} ;
      H016E2_A279CliNom = new String[] {""} ;
      H016E2_A252CliCod = new int[1] ;
      H016E2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      H016E2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      H016E2_A11669DevCruId = new int[1] ;
      H016E2_A407EmprNom = new String[] {""} ;
      H016E2_n407EmprNom = new boolean[] {false} ;
      H016E2_A396EmprCod = new String[] {""} ;
      H016E3_AGRID_nRecordCount = new long[1] ;
      AV55EmprCod = "" ;
      AV56EmprNom = "" ;
      AV70Path = "" ;
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
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      AV100Emprcod_selected = "" ;
      ucDvelop_confirmpanel_activardevolucion = new com.genexus.webpanels.GXUserControl();
      GXv_date13 = new java.util.Date[1] ;
      GXv_dtime14 = new java.util.Date[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int16 = new byte[1] ;
      AV65Cadena = "" ;
      AV67Hash = "" ;
      AV71Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message17 = new GXBaseCollection[1] ;
      GXv_boolean18 = new boolean[1] ;
      GXv_int12 = new int[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState31 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.devolucionalmacentejidocrudosindetalleww__default(),
         new Object[] {
             new Object[] {
            H016E2_A11675DevCruDesc, H016E2_A11674DevCruHash, H016E2_A11682DevCruObs, H016E2_A11681DevCruAT, H016E2_A11678DevCruStt, H016E2_A11680DevCruAtId, H016E2_A11679DevCruEnvA, H016E2_A11677DevCruGros, H016E2_A11676DevCruDtSy, H016E2_A11672DevCruMat,
            H016E2_A11671DevCruEst, H016E2_A841TrnNom, H016E2_n841TrnNom, H016E2_A840TrnCod, H016E2_n840TrnCod, H016E2_A279CliNom, H016E2_A252CliCod, H016E2_A11673DevCruSal, H016E2_A11670DevCruFec, H016E2_A11669DevCruId,
            H016E2_A407EmprNom, H016E2_n407EmprNom, H016E2_A396EmprCod
            }
            , new Object[] {
            H016E3_AGRID_nRecordCount
            }
         }
      );
      AV99Pgmname = "DevolucionAlmacenTejidoCrudosindetalleWW" ;
      /* GeneXus formulas. */
      AV99Pgmname = "DevolucionAlmacenTejidoCrudosindetalleWW" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A11671DevCruEst ;
   private byte A11679DevCruEnvA ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int15[] ;
   private byte GXv_int16[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV36TFTrnCod ;
   private short AV37TFTrnCod_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV48GridActions ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ;
   private short AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV26TFDevCruId ;
   private int AV27TFDevCruId_To ;
   private int AV32TFCliCod ;
   private int AV33TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ;
   private int AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ;
   private int AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ;
   private int AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ;
   private int AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ;
   private int edtDevCruId_Visible ;
   private int edtDevCruFec_Visible ;
   private int edtDevCruSal_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtTrnCod_Visible ;
   private int edtTrnNom_Visible ;
   private int edtDevCruMat_Visible ;
   private int edtDevCruAtId_Visible ;
   private int edtDevCruObs_Visible ;
   private int edtDevCruHash_Visible ;
   private int edtDevCruDesc_Visible ;
   private int AV45PageToGo ;
   private int AV101Devcruid_selected ;
   private int GXv_int12[] ;
   private int AV102GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV46GridCurrentPage ;
   private long AV47GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A11677DevCruGros ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_activardevolucion_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_45_idx="0001" ;
   private String AV34TFCliNom ;
   private String AV35TFCliNom_Sel ;
   private String AV38TFTrnNom ;
   private String AV39TFTrnNom_Sel ;
   private String AV40TFDevCruMat ;
   private String AV41TFDevCruMat_Sel ;
   private String AV68TFDevCruAtId ;
   private String AV69TFDevCruAtId_Sel ;
   private String AV61TFDevCruHash ;
   private String AV62TFDevCruHash_Sel ;
   private String AV63TFDevCruDesc ;
   private String AV64TFDevCruDesc_Sel ;
   private String AV99Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV53Usurcod ;
   private String AV54Station ;
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
   private String Dvelop_confirmpanel_activardevolucion_Title ;
   private String Dvelop_confirmpanel_activardevolucion_Confirmationtext ;
   private String Dvelop_confirmpanel_activardevolucion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_activardevolucion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_activardevolucion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_activardevolucion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_activardevolucion_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_devcrufecauxdates_Internalname ;
   private String edtavDdo_devcrufecauxdate_Internalname ;
   private String edtavDdo_devcrufecauxdate_Jsonclick ;
   private String divDdo_devcrusalauxdates_Internalname ;
   private String edtavDdo_devcrusalauxdate_Internalname ;
   private String edtavDdo_devcrusalauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtDevCruId_Internalname ;
   private String edtDevCruFec_Internalname ;
   private String edtDevCruSal_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String edtTrnCod_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Internalname ;
   private String edtDevCruEst_Internalname ;
   private String A11672DevCruMat ;
   private String edtDevCruMat_Internalname ;
   private String edtDevCruDtSy_Internalname ;
   private String edtDevCruGros_Internalname ;
   private String edtDevCruEnvA_Internalname ;
   private String A11680DevCruAtId ;
   private String edtDevCruAtId_Internalname ;
   private String A11678DevCruStt ;
   private String A11681DevCruAT ;
   private String edtDevCruAT_Internalname ;
   private String edtDevCruObs_Internalname ;
   private String A11674DevCruHash ;
   private String edtDevCruHash_Internalname ;
   private String A11675DevCruDesc ;
   private String edtDevCruDesc_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ;
   private String lV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ;
   private String lV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ;
   private String lV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ;
   private String lV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ;
   private String lV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ;
   private String AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ;
   private String AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ;
   private String AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ;
   private String AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ;
   private String AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ;
   private String AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ;
   private String AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ;
   private String AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ;
   private String AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ;
   private String AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ;
   private String AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ;
   private String AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ;
   private String AV55EmprCod ;
   private String AV56EmprNom ;
   private String AV70Path ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String AV100Emprcod_selected ;
   private String Dvelop_confirmpanel_activardevolucion_Internalname ;
   private String AV67Hash ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char20 ;
   private String GXv_char4[] ;
   private String GXt_char19 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_activardevolucion_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
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
   private String edtDevCruId_Jsonclick ;
   private String edtDevCruFec_Jsonclick ;
   private String edtDevCruSal_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtTrnCod_Jsonclick ;
   private String edtTrnNom_Jsonclick ;
   private String edtDevCruEst_Jsonclick ;
   private String edtDevCruMat_Jsonclick ;
   private String edtDevCruDtSy_Jsonclick ;
   private String edtDevCruGros_Jsonclick ;
   private String edtDevCruEnvA_Jsonclick ;
   private String edtDevCruAtId_Jsonclick ;
   private String edtDevCruAT_Jsonclick ;
   private String edtDevCruObs_Jsonclick ;
   private String edtDevCruHash_Jsonclick ;
   private String edtDevCruDesc_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV57TFDevCruSal ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ;
   private java.util.Date GXv_dtime14[] ;
   private java.util.Date AV28TFDevCruFec ;
   private java.util.Date AV30DDO_DevCruFecAuxDate ;
   private java.util.Date AV59DDO_DevCruSalAuxDate ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ;
   private java.util.Date GXv_date13[] ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV72OK ;
   private boolean GXv_boolean18[] ;
   private String AV51TFDevCruStt_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV42TFDevCruObs ;
   private String AV43TFDevCruObs_Sel ;
   private String A11682DevCruObs ;
   private String lV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ;
   private String lV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ;
   private String AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ;
   private String AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ;
   private String AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private String AV65Cadena ;
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
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_activardevolucion ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private GXSimpleCollection<String> AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbDevCruStt ;
   private IDataStoreProvider pr_default ;
   private String[] H016E2_A11675DevCruDesc ;
   private String[] H016E2_A11674DevCruHash ;
   private String[] H016E2_A11682DevCruObs ;
   private String[] H016E2_A11681DevCruAT ;
   private String[] H016E2_A11678DevCruStt ;
   private String[] H016E2_A11680DevCruAtId ;
   private byte[] H016E2_A11679DevCruEnvA ;
   private java.math.BigDecimal[] H016E2_A11677DevCruGros ;
   private java.util.Date[] H016E2_A11676DevCruDtSy ;
   private String[] H016E2_A11672DevCruMat ;
   private byte[] H016E2_A11671DevCruEst ;
   private String[] H016E2_A841TrnNom ;
   private boolean[] H016E2_n841TrnNom ;
   private short[] H016E2_A840TrnCod ;
   private boolean[] H016E2_n840TrnCod ;
   private String[] H016E2_A279CliNom ;
   private int[] H016E2_A252CliCod ;
   private java.util.Date[] H016E2_A11673DevCruSal ;
   private java.util.Date[] H016E2_A11670DevCruFec ;
   private int[] H016E2_A11669DevCruId ;
   private String[] H016E2_A407EmprNom ;
   private boolean[] H016E2_n407EmprNom ;
   private String[] H016E2_A396EmprCod ;
   private long[] H016E3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV52TFDevCruStt_Sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV71Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message17[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState31[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class devolucionalmacentejidocrudosindetalleww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H016E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[38];
      Object[] GXv_Object33 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.DevCruDesc, T1.DevCruHash, T1.DevCruObs, T1.DevCruAT, T1.DevCruStt, T1.DevCruAtId, T1.DevCruEnvA, T1.DevCruGros, T1.DevCruDtSy, T1.DevCruMat, T1.DevCruEst, T4.TrnNom," ;
      sSelectString += " T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal, T1.DevCruFec, T1.DevCruId, T2.EmprNom, T1.EmprCod" ;
      sFromString = " FROM (((TXPDEVCRU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN" ;
      sFromString += " TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T4.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int32[0] = (byte)(1) ;
         GXv_int32[1] = (byte)(1) ;
         GXv_int32[2] = (byte)(1) ;
         GXv_int32[3] = (byte)(1) ;
         GXv_int32[4] = (byte)(1) ;
         GXv_int32[5] = (byte)(1) ;
         GXv_int32[6] = (byte)(1) ;
         GXv_int32[7] = (byte)(1) ;
         GXv_int32[8] = (byte)(1) ;
         GXv_int32[9] = (byte)(1) ;
         GXv_int32[10] = (byte)(1) ;
      }
      if ( ! (0==AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int32[11] = (byte)(1) ;
      }
      if ( ! (0==AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int32[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int32[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( ! (0==AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( ! (0==AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( ! (0==AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( ! (0==AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int32[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int32[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int32[26] = (byte)(1) ;
      }
      if ( AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int32[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int32[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int32[32] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruId" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruId DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruFec" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruSal" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T4.TrnNom" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.TrnNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruMat" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruMat DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruAtId" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruAtId DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruStt" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruStt DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruObs" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruObs DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruHash" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruHash DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruDesc" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruDesc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DevCruId" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
   }

   protected Object[] conditional_H016E3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[33];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPDEVCRU T1 INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod)" ;
      if ( ! (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T4.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV76Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int35[11] = (byte)(1) ;
      }
      if ( ! (0==AV77Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int35[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int35[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int35[14] = (byte)(1) ;
      }
      if ( ! (0==AV80Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int35[15] = (byte)(1) ;
      }
      if ( ! (0==AV81Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int35[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int35[18] = (byte)(1) ;
      }
      if ( ! (0==AV84Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int35[19] = (byte)(1) ;
      }
      if ( ! (0==AV85Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int35[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int35[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV88Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int35[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV90Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int35[26] = (byte)(1) ;
      }
      if ( AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV93Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV95Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV97Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
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
                  return conditional_H016E2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() );
            case 1 :
                  return conditional_H016E3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H016E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H016E3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 300);
               ((String[]) buf[1])[0] = rslt.getString(2, 200);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 30);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(17);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[52], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 300);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 300);
               }
               return;
      }
   }

}

