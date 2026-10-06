package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwcnsprod_impl extends GXDataArea
{
   public webwcnsprod_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwcnsprod_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwcnsprod_impl.class ));
   }

   public webwcnsprod_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkBarAccesor = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_71 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_71"))) ;
      nGXsfl_71_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_71_idx"))) ;
      sGXsfl_71_idx = httpContext.GetPar( "sGXsfl_71_idx") ;
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
      AV157BarNHdr = httpContext.GetPar( "BarNHdr") ;
      AV118CliNom = httpContext.GetPar( "CliNom") ;
      AV57BarEncCli = httpContext.GetPar( "BarEncCli") ;
      AV152BarSer = httpContext.GetPar( "BarSer") ;
      AV154BarColNom = httpContext.GetPar( "BarColNom") ;
      AV115BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      AV116BarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "BarSit_To"))) ;
      AV113BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      AV45ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV40ColumnsSelector);
      AV114BarFecGen_To = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_To")) ;
      AV59TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV60TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV62TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV63TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV47TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV48TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV65TFBarAgrEst = httpContext.GetPar( "TFBarAgrEst") ;
      AV66TFBarAgrEst_Sel = httpContext.GetPar( "TFBarAgrEst_Sel") ;
      AV68TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV69TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV71TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV72TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV74TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV79TFBarFecEnt = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecEnt")) ;
      AV84TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV85TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV87TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV88TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV90TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV91TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV93TFBarNumCli = (int)(GXutil.lval( httpContext.GetPar( "TFBarNumCli"))) ;
      AV94TFBarNumCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarNumCli_To"))) ;
      AV96TFBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm"), ".") ;
      AV97TFBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm_To"), ".") ;
      AV99TFBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr"), ".") ;
      AV100TFBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr_To"), ".") ;
      AV102TFBarPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarPie"))) ;
      AV103TFBarPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarPie_To"))) ;
      AV105TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV106TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV125TFBarFasCod = httpContext.GetPar( "TFBarFasCod") ;
      AV126TFBarFasCod_Sel = httpContext.GetPar( "TFBarFasCod_Sel") ;
      AV128TFBarFasSig = httpContext.GetPar( "TFBarFasSig") ;
      AV129TFBarFasSig_Sel = httpContext.GetPar( "TFBarFasSig_Sel") ;
      AV145TFBarPart = (short)(GXutil.lval( httpContext.GetPar( "TFBarPart"))) ;
      AV146TFBarPart_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarPart_To"))) ;
      AV148TFBarItem3 = httpContext.GetPar( "TFBarItem3") ;
      AV149TFBarItem3_Sel = httpContext.GetPar( "TFBarItem3_Sel") ;
      AV166TFBarRdto4 = (short)(GXutil.lval( httpContext.GetPar( "TFBarRdto4"))) ;
      AV167TFBarRdto4_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarRdto4_To"))) ;
      AV170TFBarGots = httpContext.GetPar( "TFBarGots") ;
      AV171TFBarGots_Sel = httpContext.GetPar( "TFBarGots_Sel") ;
      AV172TFBarGrs = httpContext.GetPar( "TFBarGrs") ;
      AV173TFBarGrs_Sel = httpContext.GetPar( "TFBarGrs_Sel") ;
      AV174TFBarOcs = httpContext.GetPar( "TFBarOcs") ;
      AV175TFBarOcs_Sel = httpContext.GetPar( "TFBarOcs_Sel") ;
      AV176TFBarRcs = httpContext.GetPar( "TFBarRcs") ;
      AV177TFBarRcs_Sel = httpContext.GetPar( "TFBarRcs_Sel") ;
      AV178TFBarOeko = httpContext.GetPar( "TFBarOeko") ;
      AV179TFBarOeko_Sel = httpContext.GetPar( "TFBarOeko_Sel") ;
      AV180TFBarAccesorios_Sel = httpContext.GetPar( "TFBarAccesorios_Sel") ;
      AV181TFBarMarca = httpContext.GetPar( "TFBarMarca") ;
      AV182TFBarMarca_Sel = httpContext.GetPar( "TFBarMarca_Sel") ;
      AV183TFBar_MacCod = (int)(GXutil.lval( httpContext.GetPar( "TFBar_MacCod"))) ;
      AV184TFBar_MacCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBar_MacCod_To"))) ;
      AV185TFBarFasCod2 = httpContext.GetPar( "TFBarFasCod2") ;
      AV186TFBarFasCod2_Sel = httpContext.GetPar( "TFBarFasCod2_Sel") ;
      AV187TFBarFasDsc2 = httpContext.GetPar( "TFBarFasDsc2") ;
      AV188TFBarFasDsc2_Sel = httpContext.GetPar( "TFBarFasDsc2_Sel") ;
      AV262Pgmname = httpContext.GetPar( "Pgmname") ;
      AV54OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV55OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A376DisObsLin = (byte)(GXutil.lval( httpContext.GetPar( "DisObsLin"))) ;
      A377DisObsTxt = httpContext.GetPar( "DisObsTxt") ;
      A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
      A34AlbProfch = localUtil.parseDateParm( httpContext.GetPar( "AlbProfch")) ;
      AV134BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
      AV135BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
      A1263BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
      AV136BarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "BarAlbPie"))) ;
      A1265BarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "BarAlbPie"))) ;
      AV140Tb1_dscfb = httpContext.GetPar( "Tb1_dscfb") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV157BarNHdr, AV118CliNom, AV57BarEncCli, AV152BarSer, AV154BarColNom, AV115BarSit, AV116BarSit_To, AV113BarFecGen, AV45ManageFiltersExecutionStep, AV40ColumnsSelector, AV114BarFecGen_To, AV59TFCliCod, AV60TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV47TFBarNHdr, AV48TFBarNHdr_Sel, AV65TFBarAgrEst, AV66TFBarAgrEst_Sel, AV68TFBarSer, AV69TFBarSer_Sel, AV71TFBarSerDsc, AV72TFBarSerDsc_Sel, AV74TFBarFecGen, AV79TFBarFecEnt, AV84TFBarColNom, AV85TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV90TFBarNomCli, AV91TFBarNomCli_Sel, AV93TFBarNumCli, AV94TFBarNumCli_To, AV96TFBarKgm, AV97TFBarKgm_To, AV99TFBarMtr, AV100TFBarMtr_To, AV102TFBarPie, AV103TFBarPie_To, AV105TFBarSit, AV106TFBarSit_To, AV125TFBarFasCod, AV126TFBarFasCod_Sel, AV128TFBarFasSig, AV129TFBarFasSig_Sel, AV145TFBarPart, AV146TFBarPart_To, AV148TFBarItem3, AV149TFBarItem3_Sel, AV166TFBarRdto4, AV167TFBarRdto4_To, AV170TFBarGots, AV171TFBarGots_Sel, AV172TFBarGrs, AV173TFBarGrs_Sel, AV174TFBarOcs, AV175TFBarOcs_Sel, AV176TFBarRcs, AV177TFBarRcs_Sel, AV178TFBarOeko, AV179TFBarOeko_Sel, AV180TFBarAccesorios_Sel, AV181TFBarMarca, AV182TFBarMarca_Sel, AV183TFBar_MacCod, AV184TFBar_MacCod_To, AV185TFBarFasCod2, AV186TFBarFasCod2_Sel, AV187TFBarFasDsc2, AV188TFBarFasDsc2_Sel, AV262Pgmname, AV54OrderedBy, AV55OrderedDsc, A376DisObsLin, A377DisObsTxt, A30AlbProCod, A1261BarAlbKgmE, A34AlbProfch, AV134BarAlbKgmE, AV135BarAlbMtrE, A1263BarAlbMtrE, AV136BarAlbPie, A1265BarAlbPie, AV140Tb1_dscfb, A396EmprCod) ;
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
      paIU2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startIU2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwcnsprod", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV262Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTB1_DSCFB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV140Tb1_dscfb, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNHDR", GXutil.rtrim( AV157BarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLINOM", GXutil.rtrim( AV118CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARENCCLI", GXutil.rtrim( AV57BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSER", GXutil.rtrim( AV152BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNOM", GXutil.rtrim( AV154BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSIT", GXutil.ltrim( localUtil.ntoc( AV115BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV116BarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGEN", localUtil.format(AV113BarFecGen, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_71", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_71, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV43ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV43ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV52GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV53GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECGEN", localUtil.dtoc( AV113BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECGEN_TO", localUtil.dtoc( AV114BarFecGen_To, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV40ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV40ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV45ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV59TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV60TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV62TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV63TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR", GXutil.rtrim( AV47TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR_SEL", GXutil.rtrim( AV48TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGREST", GXutil.rtrim( AV65TFBarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGREST_SEL", GXutil.rtrim( AV66TFBarAgrEst_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV68TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV69TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC", GXutil.rtrim( AV71TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC_SEL", GXutil.rtrim( AV72TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECGEN", localUtil.dtoc( AV74TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECENT", localUtil.dtoc( AV79TFBarFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM", GXutil.rtrim( AV84TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM_SEL", GXutil.rtrim( AV85TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV87TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV88TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI", GXutil.rtrim( AV90TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI_SEL", GXutil.rtrim( AV91TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNUMCLI", GXutil.ltrim( localUtil.ntoc( AV93TFBarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNUMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV94TFBarNumCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV96TFBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV97TFBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV99TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV100TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIE", GXutil.ltrim( localUtil.ntoc( AV102TFBarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIE_TO", GXutil.ltrim( localUtil.ntoc( AV103TFBarPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV105TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV106TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASCOD", GXutil.rtrim( AV125TFBarFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASCOD_SEL", GXutil.rtrim( AV126TFBarFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASSIG", GXutil.rtrim( AV128TFBarFasSig));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASSIG_SEL", GXutil.rtrim( AV129TFBarFasSig_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPART", GXutil.ltrim( localUtil.ntoc( AV145TFBarPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPART_TO", GXutil.ltrim( localUtil.ntoc( AV146TFBarPart_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARITEM3", GXutil.rtrim( AV148TFBarItem3));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARITEM3_SEL", GXutil.rtrim( AV149TFBarItem3_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARRDTO4", GXutil.ltrim( localUtil.ntoc( AV166TFBarRdto4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARRDTO4_TO", GXutil.ltrim( localUtil.ntoc( AV167TFBarRdto4_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARGOTS", GXutil.rtrim( AV170TFBarGots));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARGOTS_SEL", GXutil.rtrim( AV171TFBarGots_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARGRS", GXutil.rtrim( AV172TFBarGrs));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARGRS_SEL", GXutil.rtrim( AV173TFBarGrs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBAROCS", GXutil.rtrim( AV174TFBarOcs));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBAROCS_SEL", GXutil.rtrim( AV175TFBarOcs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARRCS", GXutil.rtrim( AV176TFBarRcs));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARRCS_SEL", GXutil.rtrim( AV177TFBarRcs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBAROEKO", GXutil.rtrim( AV178TFBarOeko));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBAROEKO_SEL", GXutil.rtrim( AV179TFBarOeko_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARACCESORIOS_SEL", GXutil.rtrim( AV180TFBarAccesorios_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMARCA", GXutil.rtrim( AV181TFBarMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMARCA_SEL", GXutil.rtrim( AV182TFBarMarca_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBAR_MACCOD", GXutil.ltrim( localUtil.ntoc( AV183TFBar_MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBAR_MACCOD_TO", GXutil.ltrim( localUtil.ntoc( AV184TFBar_MacCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASCOD2", GXutil.rtrim( AV185TFBarFasCod2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASCOD2_SEL", GXutil.rtrim( AV186TFBarFasCod2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASDSC2", GXutil.rtrim( AV187TFBarFasDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASDSC2_SEL", GXutil.rtrim( AV188TFBarFasDsc2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV262Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV262Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV54OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV55OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "BARNPED", GXutil.rtrim( A3746BarNPed));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSLIN", GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSTXT", GXutil.rtrim( A377DisObsTxt));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROFCH", localUtil.dtoc( A34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBMTRE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPIE", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "NXT_ARTCL2", GXutil.rtrim( A11852Nxt_ArtCl2));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACAANH", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTB1_DSCFB", GXutil.rtrim( AV140Tb1_dscfb));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTB1_DSCFB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV140Tb1_dscfb, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCOL", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV14GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
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
         weIU2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtIU2( ) ;
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
      return formatLink("app.webwcnsprod", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWCnsProd" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Produccion", "") ;
   }

   public void wbIU0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", divTablemain_Class, "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "Bar NHdr", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV157BarNHdr), GXutil.rtrim( localUtil.format( AV157BarNHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarnhdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Cli Nom", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV118CliNom), GXutil.rtrim( localUtil.format( AV118CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavClinom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgen_rangetext_Internalname, httpContext.getMessage( "Bar Fec Gen_Range Text", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgen_rangetext_Internalname, AV169BarFecGen_RangeText, GXutil.rtrim( localUtil.format( AV169BarFecGen_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarfecgen_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarfecgen_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarenccli_Internalname, httpContext.getMessage( "Bar Enc Cli", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarenccli_Internalname, GXutil.rtrim( AV57BarEncCli), GXutil.rtrim( localUtil.format( AV57BarEncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarenccli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarenccli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Bar Ser", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV152BarSer), GXutil.rtrim( localUtil.format( AV152BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarser_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Bar Col Nom", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV154BarColNom), GXutil.rtrim( localUtil.format( AV154BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarcolnom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         wb_table1_54_IU2( true) ;
      }
      else
      {
         wb_table1_54_IU2( false) ;
      }
      return  ;
   }

   public void wb_table1_54_IU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV43ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ActionsContainerVisible HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol71( ) ;
      }
      if ( wbEnd == 71 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_71 = (int)(nGXsfl_71_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV52GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV53GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0126"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0126"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_71_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0126"+"");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarfecgen_rangepicker.setProperty("Start Date", AV113BarFecGen);
         ucBarfecgen_rangepicker.setProperty("End Date", AV114BarFecGen_To);
         ucBarfecgen_rangepicker.render(context, "wwp.daterangepicker", Barfecgen_rangepicker_Internalname, "BARFECGEN_RANGEPICKERContainer");
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
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV40ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV76DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV76DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWCnsProd.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecentauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecentauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecentauxdate_Internalname, localUtil.format(AV81DDO_BarFecEntAuxDate, "99/99/99"), localUtil.format( AV81DDO_BarFecEntAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecentauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecentauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWCnsProd.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 71 )
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

   public void startIU2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupIU0( ) ;
   }

   public void wsIU2( )
   {
      startIU2( ) ;
      evtIU2( ) ;
   }

   public void evtIU2( )
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
                           e11IU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12IU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13IU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "BARFECGEN_RANGEPICKER.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14IU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15IU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16IU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17IU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e18IU2 ();
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
                           nGXsfl_71_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_712( ) ;
                           AV165DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV165DetailWebComponent);
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarmaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarmaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMACCOD");
                              GX_FocusControl = edtavBarmaccod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV143BarMacCod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarmaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143BarMacCod), 10, 0));
                           }
                           else
                           {
                              AV143BarMacCod = localUtil.ctol( httpContext.cgiGet( edtavBarmaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarmaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143BarMacCod), 10, 0));
                           }
                           AV138Accesorios = httpContext.cgiGet( edtavAccesorios_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAccesorios_Internalname, AV138Accesorios);
                           A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
                           AV155BarEncCliGrid = httpContext.cgiGet( edtavBarenccligrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarenccligrid_Internalname, AV155BarEncCliGrid);
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A157BarFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecEnt_Internalname), 0)) ;
                           AV139ObsEnc = httpContext.cgiGet( edtavObsenc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavObsenc_Internalname, AV139ObsEnc);
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
                           n151BarFasCod = false ;
                           AV130FasDscUlt = httpContext.cgiGet( edtavFasdscult_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFasdscult_Internalname, AV130FasDscUlt);
                           A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
                           n1955BarFasSig = false ;
                           AV131FasDscSig = httpContext.cgiGet( edtavFasdscsig_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFasdscsig_Internalname, AV131FasDscSig);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCOD");
                              GX_FocusControl = edtavAlbprocod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV132AlbProcod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAlbprocod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132AlbProcod), 10, 0));
                           }
                           else
                           {
                              AV132AlbProcod = localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAlbprocod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132AlbProcod), 10, 0));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavAlbprofec_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFEC");
                              GX_FocusControl = edtavAlbprofec_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV133AlbProFec = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAlbprofec_Internalname, localUtil.format(AV133AlbProFec, "99/99/99"));
                           }
                           else
                           {
                              AV133AlbProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAlbprofec_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAlbprofec_Internalname, localUtil.format(AV133AlbProFec, "99/99/99"));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBKGME");
                              GX_FocusControl = edtavBaralbkgme_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV134BarAlbKgmE = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV134BarAlbKgmE, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBKGME"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV134BarAlbKgmE, "ZZZZZ9.99")));
                           }
                           else
                           {
                              AV134BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV134BarAlbKgmE, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBKGME"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV134BarAlbKgmE, "ZZZZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBMTRE");
                              GX_FocusControl = edtavBaralbmtre_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV135BarAlbMtrE = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV135BarAlbMtrE, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBMTRE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV135BarAlbMtrE, "ZZZZZ9.99")));
                           }
                           else
                           {
                              AV135BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV135BarAlbMtrE, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBMTRE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV135BarAlbMtrE, "ZZZZZ9.99")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBPIE");
                              GX_FocusControl = edtavBaralbpie_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV136BarAlbPie = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBaralbpie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136BarAlbPie), 6, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBPIE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( DecimalUtil.doubleToDec(AV136BarAlbPie), "ZZZZZ9")));
                           }
                           else
                           {
                              AV136BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBaralbpie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136BarAlbPie), 6, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBPIE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( DecimalUtil.doubleToDec(AV136BarAlbPie), "ZZZZZ9")));
                           }
                           AV141Exportacion = httpContext.cgiGet( edtavExportacion_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavExportacion_Internalname, AV141Exportacion);
                           AV142Marca = httpContext.cgiGet( edtavMarca_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMarca_Internalname, AV142Marca);
                           A1503BarPart = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9777BarItem3 = httpContext.cgiGet( edtBarItem3_Internalname) ;
                           A13769BarRdto4 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarRdto4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13769BarRdto4 = false ;
                           A13855BarGots = httpContext.cgiGet( edtBarGots_Internalname) ;
                           A13856BarGrs = httpContext.cgiGet( edtBarGrs_Internalname) ;
                           A13857BarOcs = httpContext.cgiGet( edtBarOcs_Internalname) ;
                           A13858BarRcs = httpContext.cgiGet( edtBarRcs_Internalname) ;
                           A13859BarOeko = httpContext.cgiGet( edtBarOeko_Internalname) ;
                           A13860BarAccesor = ((GXutil.strcmp(httpContext.cgiGet( chkBarAccesor.getInternalname()), "S")==0) ? "S" : "N") ;
                           n13860BarAccesor = false ;
                           A13861BarMarca = httpContext.cgiGet( edtBarMarca_Internalname) ;
                           n13861BarMarca = false ;
                           A13862Bar_MacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBar_MacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13862Bar_MacCod = false ;
                           A13863BarFasCod2 = httpContext.cgiGet( edtBarFasCod2_Internalname) ;
                           n13863BarFasCod2 = false ;
                           A13864BarFasDsc2 = httpContext.cgiGet( edtBarFasDsc2_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORRGB");
                              GX_FocusControl = edtavForrgb_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV164ForRGB = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164ForRGB), 10, 0));
                           }
                           else
                           {
                              AV164ForRGB = localUtil.ctol( httpContext.cgiGet( edtavForrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164ForRGB), 10, 0));
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19IU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e20IU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21IU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Barnhdr Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNHDR"), AV157BarNHdr) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clinom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLINOM"), AV118CliNom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barenccli Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARENCCLI"), AV57BarEncCli) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barser Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSER"), AV152BarSer) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOM"), AV154BarColNom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsit Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV115BarSit )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsit_to Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV116BarSit_To )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgen Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGEN"), 0), AV113BarFecGen) ) )
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 126 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0126") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0126", "", sEvt);
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

   public void weIU2( )
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

   public void paIU2( )
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
            GX_FocusControl = edtavBarnhdr_Internalname ;
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
      subsflControlProps_712( ) ;
      while ( nGXsfl_71_idx <= nRC_GXsfl_71 )
      {
         sendrow_712( ) ;
         nGXsfl_71_idx = ((subGrid_Islastpage==1)&&(nGXsfl_71_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_71_idx+1) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV157BarNHdr ,
                                 String AV118CliNom ,
                                 String AV57BarEncCli ,
                                 String AV152BarSer ,
                                 String AV154BarColNom ,
                                 byte AV115BarSit ,
                                 byte AV116BarSit_To ,
                                 java.util.Date AV113BarFecGen ,
                                 byte AV45ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelector ,
                                 java.util.Date AV114BarFecGen_To ,
                                 int AV59TFCliCod ,
                                 int AV60TFCliCod_To ,
                                 String AV62TFCliNom ,
                                 String AV63TFCliNom_Sel ,
                                 String AV47TFBarNHdr ,
                                 String AV48TFBarNHdr_Sel ,
                                 String AV65TFBarAgrEst ,
                                 String AV66TFBarAgrEst_Sel ,
                                 String AV68TFBarSer ,
                                 String AV69TFBarSer_Sel ,
                                 String AV71TFBarSerDsc ,
                                 String AV72TFBarSerDsc_Sel ,
                                 java.util.Date AV74TFBarFecGen ,
                                 java.util.Date AV79TFBarFecEnt ,
                                 String AV84TFBarColNom ,
                                 String AV85TFBarColNom_Sel ,
                                 int AV87TFBarColNum ,
                                 int AV88TFBarColNum_To ,
                                 String AV90TFBarNomCli ,
                                 String AV91TFBarNomCli_Sel ,
                                 int AV93TFBarNumCli ,
                                 int AV94TFBarNumCli_To ,
                                 java.math.BigDecimal AV96TFBarKgm ,
                                 java.math.BigDecimal AV97TFBarKgm_To ,
                                 java.math.BigDecimal AV99TFBarMtr ,
                                 java.math.BigDecimal AV100TFBarMtr_To ,
                                 int AV102TFBarPie ,
                                 int AV103TFBarPie_To ,
                                 byte AV105TFBarSit ,
                                 byte AV106TFBarSit_To ,
                                 String AV125TFBarFasCod ,
                                 String AV126TFBarFasCod_Sel ,
                                 String AV128TFBarFasSig ,
                                 String AV129TFBarFasSig_Sel ,
                                 short AV145TFBarPart ,
                                 short AV146TFBarPart_To ,
                                 String AV148TFBarItem3 ,
                                 String AV149TFBarItem3_Sel ,
                                 short AV166TFBarRdto4 ,
                                 short AV167TFBarRdto4_To ,
                                 String AV170TFBarGots ,
                                 String AV171TFBarGots_Sel ,
                                 String AV172TFBarGrs ,
                                 String AV173TFBarGrs_Sel ,
                                 String AV174TFBarOcs ,
                                 String AV175TFBarOcs_Sel ,
                                 String AV176TFBarRcs ,
                                 String AV177TFBarRcs_Sel ,
                                 String AV178TFBarOeko ,
                                 String AV179TFBarOeko_Sel ,
                                 String AV180TFBarAccesorios_Sel ,
                                 String AV181TFBarMarca ,
                                 String AV182TFBarMarca_Sel ,
                                 int AV183TFBar_MacCod ,
                                 int AV184TFBar_MacCod_To ,
                                 String AV185TFBarFasCod2 ,
                                 String AV186TFBarFasCod2_Sel ,
                                 String AV187TFBarFasDsc2 ,
                                 String AV188TFBarFasDsc2_Sel ,
                                 String AV262Pgmname ,
                                 short AV54OrderedBy ,
                                 boolean AV55OrderedDsc ,
                                 byte A376DisObsLin ,
                                 String A377DisObsTxt ,
                                 long A30AlbProCod ,
                                 java.math.BigDecimal A1261BarAlbKgmE ,
                                 java.util.Date A34AlbProfch ,
                                 java.math.BigDecimal AV134BarAlbKgmE ,
                                 java.math.BigDecimal AV135BarAlbMtrE ,
                                 java.math.BigDecimal A1263BarAlbMtrE ,
                                 int AV136BarAlbPie ,
                                 int A1265BarAlbPie ,
                                 String AV140Tb1_dscfb ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20IU2 ();
      GRID_nCurrentRecord = 0 ;
      rfIU2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBKGME", getSecureSignedToken( "", localUtil.format( AV134BarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV134BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBMTRE", getSecureSignedToken( "", localUtil.format( AV135BarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV135BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV136BarAlbPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV136BarAlbPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
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
      rfIU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV262Pgmname = "WebWCnsProd" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavBarmaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmaccod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavAccesorios_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAccesorios_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAccesorios_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavBarenccligrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccligrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccligrid_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavObsenc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObsenc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObsenc_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavFasdscult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdscult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscult_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavFasdscsig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdscsig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscsig_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavAlbprofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprofec_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavBaralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgme_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavBaralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmtre_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavBaralbpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbpie_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavExportacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExportacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExportacion_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavForrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForrgb_Enabled), 5, 0), !bGXsfl_71_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV191Webwcnsprodds_1_barnhdr = AV157BarNHdr ;
      AV192Webwcnsprodds_2_clinom = AV118CliNom ;
      AV193Webwcnsprodds_3_barfecgen = AV113BarFecGen ;
      AV194Webwcnsprodds_4_barfecgen_to = AV114BarFecGen_To ;
      AV195Webwcnsprodds_5_barenccli = AV57BarEncCli ;
      AV196Webwcnsprodds_6_barser = AV152BarSer ;
      AV197Webwcnsprodds_7_barcolnom = AV154BarColNom ;
      AV198Webwcnsprodds_8_barsit = AV115BarSit ;
      AV199Webwcnsprodds_9_barsit_to = AV116BarSit_To ;
      AV200Webwcnsprodds_10_tfclicod = AV59TFCliCod ;
      AV201Webwcnsprodds_11_tfclicod_to = AV60TFCliCod_To ;
      AV202Webwcnsprodds_12_tfclinom = AV62TFCliNom ;
      AV203Webwcnsprodds_13_tfclinom_sel = AV63TFCliNom_Sel ;
      AV204Webwcnsprodds_14_tfbarnhdr = AV47TFBarNHdr ;
      AV205Webwcnsprodds_15_tfbarnhdr_sel = AV48TFBarNHdr_Sel ;
      AV206Webwcnsprodds_16_tfbaragrest = AV65TFBarAgrEst ;
      AV207Webwcnsprodds_17_tfbaragrest_sel = AV66TFBarAgrEst_Sel ;
      AV208Webwcnsprodds_18_tfbarser = AV68TFBarSer ;
      AV209Webwcnsprodds_19_tfbarser_sel = AV69TFBarSer_Sel ;
      AV210Webwcnsprodds_20_tfbarserdsc = AV71TFBarSerDsc ;
      AV211Webwcnsprodds_21_tfbarserdsc_sel = AV72TFBarSerDsc_Sel ;
      AV212Webwcnsprodds_22_tfbarfecgen = AV74TFBarFecGen ;
      AV213Webwcnsprodds_23_tfbarfecent = AV79TFBarFecEnt ;
      AV214Webwcnsprodds_24_tfbarcolnom = AV84TFBarColNom ;
      AV215Webwcnsprodds_25_tfbarcolnom_sel = AV85TFBarColNom_Sel ;
      AV216Webwcnsprodds_26_tfbarcolnum = AV87TFBarColNum ;
      AV217Webwcnsprodds_27_tfbarcolnum_to = AV88TFBarColNum_To ;
      AV218Webwcnsprodds_28_tfbarnomcli = AV90TFBarNomCli ;
      AV219Webwcnsprodds_29_tfbarnomcli_sel = AV91TFBarNomCli_Sel ;
      AV220Webwcnsprodds_30_tfbarnumcli = AV93TFBarNumCli ;
      AV221Webwcnsprodds_31_tfbarnumcli_to = AV94TFBarNumCli_To ;
      AV222Webwcnsprodds_32_tfbarkgm = AV96TFBarKgm ;
      AV223Webwcnsprodds_33_tfbarkgm_to = AV97TFBarKgm_To ;
      AV224Webwcnsprodds_34_tfbarmtr = AV99TFBarMtr ;
      AV225Webwcnsprodds_35_tfbarmtr_to = AV100TFBarMtr_To ;
      AV226Webwcnsprodds_36_tfbarpie = AV102TFBarPie ;
      AV227Webwcnsprodds_37_tfbarpie_to = AV103TFBarPie_To ;
      AV228Webwcnsprodds_38_tfbarsit = AV105TFBarSit ;
      AV229Webwcnsprodds_39_tfbarsit_to = AV106TFBarSit_To ;
      AV230Webwcnsprodds_40_tfbarfascod = AV125TFBarFasCod ;
      AV231Webwcnsprodds_41_tfbarfascod_sel = AV126TFBarFasCod_Sel ;
      AV232Webwcnsprodds_42_tfbarfassig = AV128TFBarFasSig ;
      AV233Webwcnsprodds_43_tfbarfassig_sel = AV129TFBarFasSig_Sel ;
      AV234Webwcnsprodds_44_tfbarpart = AV145TFBarPart ;
      AV235Webwcnsprodds_45_tfbarpart_to = AV146TFBarPart_To ;
      AV236Webwcnsprodds_46_tfbaritem3 = AV148TFBarItem3 ;
      AV237Webwcnsprodds_47_tfbaritem3_sel = AV149TFBarItem3_Sel ;
      AV238Webwcnsprodds_48_tfbarrdto4 = AV166TFBarRdto4 ;
      AV239Webwcnsprodds_49_tfbarrdto4_to = AV167TFBarRdto4_To ;
      AV240Webwcnsprodds_50_tfbargots = AV170TFBarGots ;
      AV241Webwcnsprodds_51_tfbargots_sel = AV171TFBarGots_Sel ;
      AV242Webwcnsprodds_52_tfbargrs = AV172TFBarGrs ;
      AV243Webwcnsprodds_53_tfbargrs_sel = AV173TFBarGrs_Sel ;
      AV244Webwcnsprodds_54_tfbarocs = AV174TFBarOcs ;
      AV245Webwcnsprodds_55_tfbarocs_sel = AV175TFBarOcs_Sel ;
      AV246Webwcnsprodds_56_tfbarrcs = AV176TFBarRcs ;
      AV247Webwcnsprodds_57_tfbarrcs_sel = AV177TFBarRcs_Sel ;
      AV248Webwcnsprodds_58_tfbaroeko = AV178TFBarOeko ;
      AV249Webwcnsprodds_59_tfbaroeko_sel = AV179TFBarOeko_Sel ;
      AV250Webwcnsprodds_60_tfbaraccesorios_sel = AV180TFBarAccesorios_Sel ;
      AV251Webwcnsprodds_61_tfbarmarca = AV181TFBarMarca ;
      AV252Webwcnsprodds_62_tfbarmarca_sel = AV182TFBarMarca_Sel ;
      AV253Webwcnsprodds_63_tfbar_maccod = AV183TFBar_MacCod ;
      AV254Webwcnsprodds_64_tfbar_maccod_to = AV184TFBar_MacCod_To ;
      AV255Webwcnsprodds_65_tfbarfascod2 = AV185TFBarFasCod2 ;
      AV256Webwcnsprodds_66_tfbarfascod2_sel = AV186TFBarFasCod2_Sel ;
      AV257Webwcnsprodds_67_tfbarfasdsc2 = AV187TFBarFasDsc2 ;
      AV258Webwcnsprodds_68_tfbarfasdsc2_sel = AV188TFBarFasDsc2_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV191Webwcnsprodds_1_barnhdr ,
                                           AV192Webwcnsprodds_2_clinom ,
                                           AV193Webwcnsprodds_3_barfecgen ,
                                           AV194Webwcnsprodds_4_barfecgen_to ,
                                           AV195Webwcnsprodds_5_barenccli ,
                                           AV196Webwcnsprodds_6_barser ,
                                           AV197Webwcnsprodds_7_barcolnom ,
                                           Byte.valueOf(AV198Webwcnsprodds_8_barsit) ,
                                           Byte.valueOf(AV199Webwcnsprodds_9_barsit_to) ,
                                           Integer.valueOf(AV200Webwcnsprodds_10_tfclicod) ,
                                           Integer.valueOf(AV201Webwcnsprodds_11_tfclicod_to) ,
                                           AV203Webwcnsprodds_13_tfclinom_sel ,
                                           AV202Webwcnsprodds_12_tfclinom ,
                                           AV205Webwcnsprodds_15_tfbarnhdr_sel ,
                                           AV204Webwcnsprodds_14_tfbarnhdr ,
                                           AV207Webwcnsprodds_17_tfbaragrest_sel ,
                                           AV206Webwcnsprodds_16_tfbaragrest ,
                                           AV209Webwcnsprodds_19_tfbarser_sel ,
                                           AV208Webwcnsprodds_18_tfbarser ,
                                           AV211Webwcnsprodds_21_tfbarserdsc_sel ,
                                           AV210Webwcnsprodds_20_tfbarserdsc ,
                                           AV212Webwcnsprodds_22_tfbarfecgen ,
                                           AV213Webwcnsprodds_23_tfbarfecent ,
                                           AV215Webwcnsprodds_25_tfbarcolnom_sel ,
                                           AV214Webwcnsprodds_24_tfbarcolnom ,
                                           Integer.valueOf(AV216Webwcnsprodds_26_tfbarcolnum) ,
                                           Integer.valueOf(AV217Webwcnsprodds_27_tfbarcolnum_to) ,
                                           AV219Webwcnsprodds_29_tfbarnomcli_sel ,
                                           AV218Webwcnsprodds_28_tfbarnomcli ,
                                           Integer.valueOf(AV220Webwcnsprodds_30_tfbarnumcli) ,
                                           Integer.valueOf(AV221Webwcnsprodds_31_tfbarnumcli_to) ,
                                           AV222Webwcnsprodds_32_tfbarkgm ,
                                           AV223Webwcnsprodds_33_tfbarkgm_to ,
                                           AV224Webwcnsprodds_34_tfbarmtr ,
                                           AV225Webwcnsprodds_35_tfbarmtr_to ,
                                           Byte.valueOf(AV228Webwcnsprodds_38_tfbarsit) ,
                                           Byte.valueOf(AV229Webwcnsprodds_39_tfbarsit_to) ,
                                           Short.valueOf(AV234Webwcnsprodds_44_tfbarpart) ,
                                           Short.valueOf(AV235Webwcnsprodds_45_tfbarpart_to) ,
                                           AV237Webwcnsprodds_47_tfbaritem3_sel ,
                                           AV236Webwcnsprodds_46_tfbaritem3 ,
                                           Short.valueOf(AV238Webwcnsprodds_48_tfbarrdto4) ,
                                           Short.valueOf(AV239Webwcnsprodds_49_tfbarrdto4_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A120BarAgrEst ,
                                           A1652BarSerDsc ,
                                           A157BarFecEnt ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A1503BarPart) ,
                                           A9777BarItem3 ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           Short.valueOf(AV54OrderedBy) ,
                                           Boolean.valueOf(AV55OrderedDsc) ,
                                           Integer.valueOf(AV226Webwcnsprodds_36_tfbarpie) ,
                                           Integer.valueOf(A198BarPie) ,
                                           Integer.valueOf(AV227Webwcnsprodds_37_tfbarpie_to) ,
                                           AV231Webwcnsprodds_41_tfbarfascod_sel ,
                                           AV230Webwcnsprodds_40_tfbarfascod ,
                                           A151BarFasCod ,
                                           AV233Webwcnsprodds_43_tfbarfassig_sel ,
                                           AV232Webwcnsprodds_42_tfbarfassig ,
                                           A1955BarFasSig ,
                                           AV241Webwcnsprodds_51_tfbargots_sel ,
                                           AV240Webwcnsprodds_50_tfbargots ,
                                           A13855BarGots ,
                                           AV243Webwcnsprodds_53_tfbargrs_sel ,
                                           AV242Webwcnsprodds_52_tfbargrs ,
                                           A13856BarGrs ,
                                           AV245Webwcnsprodds_55_tfbarocs_sel ,
                                           AV244Webwcnsprodds_54_tfbarocs ,
                                           A13857BarOcs ,
                                           AV247Webwcnsprodds_57_tfbarrcs_sel ,
                                           AV246Webwcnsprodds_56_tfbarrcs ,
                                           A13858BarRcs ,
                                           AV249Webwcnsprodds_59_tfbaroeko_sel ,
                                           AV248Webwcnsprodds_58_tfbaroeko ,
                                           A13859BarOeko ,
                                           AV250Webwcnsprodds_60_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV252Webwcnsprodds_62_tfbarmarca_sel ,
                                           AV251Webwcnsprodds_61_tfbarmarca ,
                                           A13861BarMarca ,
                                           Integer.valueOf(AV253Webwcnsprodds_63_tfbar_maccod) ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           Integer.valueOf(AV254Webwcnsprodds_64_tfbar_maccod_to) ,
                                           AV256Webwcnsprodds_66_tfbarfascod2_sel ,
                                           AV255Webwcnsprodds_65_tfbarfascod2 ,
                                           A13863BarFasCod2 ,
                                           AV258Webwcnsprodds_68_tfbarfasdsc2_sel ,
                                           AV257Webwcnsprodds_67_tfbarfasdsc2 ,
                                           A13864BarFasDsc2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV230Webwcnsprodds_40_tfbarfascod = GXutil.padr( GXutil.rtrim( AV230Webwcnsprodds_40_tfbarfascod), 8, "%") ;
      lV232Webwcnsprodds_42_tfbarfassig = GXutil.padr( GXutil.rtrim( AV232Webwcnsprodds_42_tfbarfassig), 8, "%") ;
      lV251Webwcnsprodds_61_tfbarmarca = GXutil.padr( GXutil.rtrim( AV251Webwcnsprodds_61_tfbarmarca), 30, "%") ;
      lV255Webwcnsprodds_65_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV255Webwcnsprodds_65_tfbarfascod2), 8, "%") ;
      lV191Webwcnsprodds_1_barnhdr = GXutil.padr( GXutil.rtrim( AV191Webwcnsprodds_1_barnhdr), 11, "%") ;
      lV192Webwcnsprodds_2_clinom = GXutil.padr( GXutil.rtrim( AV192Webwcnsprodds_2_clinom), 30, "%") ;
      lV195Webwcnsprodds_5_barenccli = GXutil.padr( GXutil.rtrim( AV195Webwcnsprodds_5_barenccli), 20, "%") ;
      lV196Webwcnsprodds_6_barser = GXutil.padr( GXutil.rtrim( AV196Webwcnsprodds_6_barser), 16, "%") ;
      lV197Webwcnsprodds_7_barcolnom = GXutil.padr( GXutil.rtrim( AV197Webwcnsprodds_7_barcolnom), 13, "%") ;
      lV202Webwcnsprodds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV202Webwcnsprodds_12_tfclinom), 30, "%") ;
      lV204Webwcnsprodds_14_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV204Webwcnsprodds_14_tfbarnhdr), 11, "%") ;
      lV206Webwcnsprodds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV206Webwcnsprodds_16_tfbaragrest), 1, "%") ;
      lV208Webwcnsprodds_18_tfbarser = GXutil.padr( GXutil.rtrim( AV208Webwcnsprodds_18_tfbarser), 16, "%") ;
      lV210Webwcnsprodds_20_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV210Webwcnsprodds_20_tfbarserdsc), 26, "%") ;
      lV214Webwcnsprodds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV214Webwcnsprodds_24_tfbarcolnom), 13, "%") ;
      lV218Webwcnsprodds_28_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV218Webwcnsprodds_28_tfbarnomcli), 13, "%") ;
      lV236Webwcnsprodds_46_tfbaritem3 = GXutil.padr( GXutil.rtrim( AV236Webwcnsprodds_46_tfbaritem3), 20, "%") ;
      /* Using cursor H00IU14 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, AV231Webwcnsprodds_41_tfbarfascod_sel, AV230Webwcnsprodds_40_tfbarfascod, lV230Webwcnsprodds_40_tfbarfascod, AV231Webwcnsprodds_41_tfbarfascod_sel, AV231Webwcnsprodds_41_tfbarfascod_sel, AV233Webwcnsprodds_43_tfbarfassig_sel, AV232Webwcnsprodds_42_tfbarfassig, lV232Webwcnsprodds_42_tfbarfassig, AV233Webwcnsprodds_43_tfbarfassig_sel, AV233Webwcnsprodds_43_tfbarfassig_sel, AV250Webwcnsprodds_60_tfbaraccesorios_sel, AV250Webwcnsprodds_60_tfbaraccesorios_sel, AV252Webwcnsprodds_62_tfbarmarca_sel, AV251Webwcnsprodds_61_tfbarmarca, lV251Webwcnsprodds_61_tfbarmarca, AV252Webwcnsprodds_62_tfbarmarca_sel, AV252Webwcnsprodds_62_tfbarmarca_sel, Integer.valueOf(AV253Webwcnsprodds_63_tfbar_maccod), Integer.valueOf(AV253Webwcnsprodds_63_tfbar_maccod), Integer.valueOf(AV254Webwcnsprodds_64_tfbar_maccod_to), Integer.valueOf(AV254Webwcnsprodds_64_tfbar_maccod_to), AV256Webwcnsprodds_66_tfbarfascod2_sel, AV255Webwcnsprodds_65_tfbarfascod2, lV255Webwcnsprodds_65_tfbarfascod2, AV256Webwcnsprodds_66_tfbarfascod2_sel, AV256Webwcnsprodds_66_tfbarfascod2_sel, lV191Webwcnsprodds_1_barnhdr, lV192Webwcnsprodds_2_clinom, AV193Webwcnsprodds_3_barfecgen, AV194Webwcnsprodds_4_barfecgen_to, lV195Webwcnsprodds_5_barenccli, lV196Webwcnsprodds_6_barser, lV197Webwcnsprodds_7_barcolnom, Byte.valueOf(AV198Webwcnsprodds_8_barsit), Byte.valueOf(AV199Webwcnsprodds_9_barsit_to), Integer.valueOf(AV200Webwcnsprodds_10_tfclicod), Integer.valueOf(AV201Webwcnsprodds_11_tfclicod_to), lV202Webwcnsprodds_12_tfclinom, AV203Webwcnsprodds_13_tfclinom_sel, lV204Webwcnsprodds_14_tfbarnhdr, AV205Webwcnsprodds_15_tfbarnhdr_sel, lV206Webwcnsprodds_16_tfbaragrest, AV207Webwcnsprodds_17_tfbaragrest_sel, lV208Webwcnsprodds_18_tfbarser, AV209Webwcnsprodds_19_tfbarser_sel, lV210Webwcnsprodds_20_tfbarserdsc, AV211Webwcnsprodds_21_tfbarserdsc_sel, AV212Webwcnsprodds_22_tfbarfecgen, AV213Webwcnsprodds_23_tfbarfecent, lV214Webwcnsprodds_24_tfbarcolnom, AV215Webwcnsprodds_25_tfbarcolnom_sel, Integer.valueOf(AV216Webwcnsprodds_26_tfbarcolnum), Integer.valueOf(AV217Webwcnsprodds_27_tfbarcolnum_to), lV218Webwcnsprodds_28_tfbarnomcli, AV219Webwcnsprodds_29_tfbarnomcli_sel, Integer.valueOf(AV220Webwcnsprodds_30_tfbarnumcli), Integer.valueOf(AV221Webwcnsprodds_31_tfbarnumcli_to), AV222Webwcnsprodds_32_tfbarkgm, AV223Webwcnsprodds_33_tfbarkgm_to, AV224Webwcnsprodds_34_tfbarmtr, AV225Webwcnsprodds_35_tfbarmtr_to, Byte.valueOf(AV228Webwcnsprodds_38_tfbarsit), Byte.valueOf(AV229Webwcnsprodds_39_tfbarsit_to), Short.valueOf(AV234Webwcnsprodds_44_tfbarpart), Short.valueOf(AV235Webwcnsprodds_45_tfbarpart_to), lV236Webwcnsprodds_46_tfbaritem3, AV237Webwcnsprodds_47_tfbaritem3_sel, Short.valueOf(AV238Webwcnsprodds_48_tfbarrdto4), Short.valueOf(AV239Webwcnsprodds_49_tfbarrdto4_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3746BarNPed = H00IU14_A3746BarNPed[0] ;
         A4812BarEncCli = H00IU14_A4812BarEncCli[0] ;
         A143BarDisNum = H00IU14_A143BarDisNum[0] ;
         A11852Nxt_ArtCl2 = H00IU14_A11852Nxt_ArtCl2[0] ;
         A4466BarAcaAnh = H00IU14_A4466BarAcaAnh[0] ;
         A218BarTipCol = H00IU14_A218BarTipCol[0] ;
         A13769BarRdto4 = H00IU14_A13769BarRdto4[0] ;
         n13769BarRdto4 = H00IU14_n13769BarRdto4[0] ;
         A9777BarItem3 = H00IU14_A9777BarItem3[0] ;
         A1503BarPart = H00IU14_A1503BarPart[0] ;
         A213BarSit = H00IU14_A213BarSit[0] ;
         A1235BarNumCli = H00IU14_A1235BarNumCli[0] ;
         A1234BarNomCli = H00IU14_A1234BarNomCli[0] ;
         A136BarColNum = H00IU14_A136BarColNum[0] ;
         A135BarColNom = H00IU14_A135BarColNom[0] ;
         A157BarFecEnt = H00IU14_A157BarFecEnt[0] ;
         A159BarFecGen = H00IU14_A159BarFecGen[0] ;
         A1652BarSerDsc = H00IU14_A1652BarSerDsc[0] ;
         A212BarSer = H00IU14_A212BarSer[0] ;
         A120BarAgrEst = H00IU14_A120BarAgrEst[0] ;
         A279CliNom = H00IU14_A279CliNom[0] ;
         A252CliCod = H00IU14_A252CliCod[0] ;
         n252CliCod = H00IU14_n252CliCod[0] ;
         A13862Bar_MacCod = H00IU14_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = H00IU14_n13862Bar_MacCod[0] ;
         A13861BarMarca = H00IU14_A13861BarMarca[0] ;
         n13861BarMarca = H00IU14_n13861BarMarca[0] ;
         A13860BarAccesor = H00IU14_A13860BarAccesor[0] ;
         n13860BarAccesor = H00IU14_n13860BarAccesor[0] ;
         A1955BarFasSig = H00IU14_A1955BarFasSig[0] ;
         n1955BarFasSig = H00IU14_n1955BarFasSig[0] ;
         A151BarFasCod = H00IU14_A151BarFasCod[0] ;
         n151BarFasCod = H00IU14_n151BarFasCod[0] ;
         A184BarMtr = H00IU14_A184BarMtr[0] ;
         A166BarKgm = H00IU14_A166BarKgm[0] ;
         A130BarCodPar = H00IU14_A130BarCodPar[0] ;
         A132BarCodReo = H00IU14_A132BarCodReo[0] ;
         A129BarCod = H00IU14_A129BarCod[0] ;
         A199BarPie1 = H00IU14_A199BarPie1[0] ;
         A365DisDes = H00IU14_A365DisDes[0] ;
         A898BarPieNDes = H00IU14_A898BarPieNDes[0] ;
         A361DisCod = H00IU14_A361DisCod[0] ;
         A13863BarFasCod2 = H00IU14_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = H00IU14_n13863BarFasCod2[0] ;
         A396EmprCod = H00IU14_A396EmprCod[0] ;
         A13862Bar_MacCod = H00IU14_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = H00IU14_n13862Bar_MacCod[0] ;
         A279CliNom = H00IU14_A279CliNom[0] ;
         A13863BarFasCod2 = H00IU14_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = H00IU14_n13863BarFasCod2[0] ;
         A13861BarMarca = H00IU14_A13861BarMarca[0] ;
         n13861BarMarca = H00IU14_n13861BarMarca[0] ;
         A13860BarAccesor = H00IU14_A13860BarAccesor[0] ;
         n13860BarAccesor = H00IU14_n13860BarAccesor[0] ;
         A1955BarFasSig = H00IU14_A1955BarFasSig[0] ;
         n1955BarFasSig = H00IU14_n1955BarFasSig[0] ;
         A151BarFasCod = H00IU14_A151BarFasCod[0] ;
         n151BarFasCod = H00IU14_n151BarFasCod[0] ;
         A184BarMtr = H00IU14_A184BarMtr[0] ;
         A166BarKgm = H00IU14_A166BarKgm[0] ;
         A199BarPie1 = H00IU14_A199BarPie1[0] ;
         A898BarPieNDes = H00IU14_A898BarPieNDes[0] ;
         GXt_char1 = A13855BarGots ;
         GXv_char2[0] = GXt_char1 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
         webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
         A13855BarGots = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV241Webwcnsprodds_51_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV240Webwcnsprodds_50_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV240Webwcnsprodds_50_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV241Webwcnsprodds_51_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV241Webwcnsprodds_51_tfbargots_sel) == 0 ) ) )
            {
               GXt_char1 = A13856BarGrs ;
               GXv_char2[0] = GXt_char1 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
               webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
               A13856BarGrs = GXt_char1 ;
               if ( ! ( (GXutil.strcmp("", AV243Webwcnsprodds_53_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV242Webwcnsprodds_52_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV242Webwcnsprodds_52_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV243Webwcnsprodds_53_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV243Webwcnsprodds_53_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char1 = A13857BarOcs ;
                     GXv_char2[0] = GXt_char1 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                     webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
                     A13857BarOcs = GXt_char1 ;
                     if ( ! ( (GXutil.strcmp("", AV245Webwcnsprodds_55_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV244Webwcnsprodds_54_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV244Webwcnsprodds_54_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV245Webwcnsprodds_55_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV245Webwcnsprodds_55_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char1 = A13858BarRcs ;
                           GXv_char2[0] = GXt_char1 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                           webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
                           A13858BarRcs = GXt_char1 ;
                           if ( ! ( (GXutil.strcmp("", AV247Webwcnsprodds_57_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV246Webwcnsprodds_56_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV246Webwcnsprodds_56_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV247Webwcnsprodds_57_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV247Webwcnsprodds_57_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char1 = A13859BarOeko ;
                                 GXv_char2[0] = GXt_char1 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                                 webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
                                 A13859BarOeko = GXt_char1 ;
                                 if ( ! ( (GXutil.strcmp("", AV249Webwcnsprodds_59_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV248Webwcnsprodds_58_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV248Webwcnsprodds_58_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV249Webwcnsprodds_59_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV249Webwcnsprodds_59_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char1 = A13864BarFasDsc2 ;
                                       GXv_char2[0] = GXt_char1 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char2) ;
                                       webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
                                       A13864BarFasDsc2 = GXt_char1 ;
                                       if ( ! ( (GXutil.strcmp("", AV258Webwcnsprodds_68_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV257Webwcnsprodds_67_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV257Webwcnsprodds_67_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                       {
                                          if ( (GXutil.strcmp("", AV258Webwcnsprodds_68_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV258Webwcnsprodds_68_tfbarfasdsc2_sel) == 0 ) ) )
                                          {
                                             if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                             {
                                                A198BarPie = A898BarPieNDes ;
                                             }
                                             else
                                             {
                                                A198BarPie = A199BarPie1 ;
                                             }
                                             if ( (0==AV226Webwcnsprodds_36_tfbarpie) || ( ( A198BarPie >= AV226Webwcnsprodds_36_tfbarpie ) ) )
                                             {
                                                if ( (0==AV227Webwcnsprodds_37_tfbarpie_to) || ( ( A198BarPie <= AV227Webwcnsprodds_37_tfbarpie_to ) ) )
                                                {
                                                   A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                                   GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfIU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(71) ;
      /* Execute user event: Refresh */
      e20IU2 ();
      nGXsfl_71_idx = 1 ;
      sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_712( ) ;
      bGXsfl_71_Refreshing = true ;
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
         subsflControlProps_712( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV191Webwcnsprodds_1_barnhdr ,
                                              AV192Webwcnsprodds_2_clinom ,
                                              AV193Webwcnsprodds_3_barfecgen ,
                                              AV194Webwcnsprodds_4_barfecgen_to ,
                                              AV195Webwcnsprodds_5_barenccli ,
                                              AV196Webwcnsprodds_6_barser ,
                                              AV197Webwcnsprodds_7_barcolnom ,
                                              Byte.valueOf(AV198Webwcnsprodds_8_barsit) ,
                                              Byte.valueOf(AV199Webwcnsprodds_9_barsit_to) ,
                                              Integer.valueOf(AV200Webwcnsprodds_10_tfclicod) ,
                                              Integer.valueOf(AV201Webwcnsprodds_11_tfclicod_to) ,
                                              AV203Webwcnsprodds_13_tfclinom_sel ,
                                              AV202Webwcnsprodds_12_tfclinom ,
                                              AV205Webwcnsprodds_15_tfbarnhdr_sel ,
                                              AV204Webwcnsprodds_14_tfbarnhdr ,
                                              AV207Webwcnsprodds_17_tfbaragrest_sel ,
                                              AV206Webwcnsprodds_16_tfbaragrest ,
                                              AV209Webwcnsprodds_19_tfbarser_sel ,
                                              AV208Webwcnsprodds_18_tfbarser ,
                                              AV211Webwcnsprodds_21_tfbarserdsc_sel ,
                                              AV210Webwcnsprodds_20_tfbarserdsc ,
                                              AV212Webwcnsprodds_22_tfbarfecgen ,
                                              AV213Webwcnsprodds_23_tfbarfecent ,
                                              AV215Webwcnsprodds_25_tfbarcolnom_sel ,
                                              AV214Webwcnsprodds_24_tfbarcolnom ,
                                              Integer.valueOf(AV216Webwcnsprodds_26_tfbarcolnum) ,
                                              Integer.valueOf(AV217Webwcnsprodds_27_tfbarcolnum_to) ,
                                              AV219Webwcnsprodds_29_tfbarnomcli_sel ,
                                              AV218Webwcnsprodds_28_tfbarnomcli ,
                                              Integer.valueOf(AV220Webwcnsprodds_30_tfbarnumcli) ,
                                              Integer.valueOf(AV221Webwcnsprodds_31_tfbarnumcli_to) ,
                                              AV222Webwcnsprodds_32_tfbarkgm ,
                                              AV223Webwcnsprodds_33_tfbarkgm_to ,
                                              AV224Webwcnsprodds_34_tfbarmtr ,
                                              AV225Webwcnsprodds_35_tfbarmtr_to ,
                                              Byte.valueOf(AV228Webwcnsprodds_38_tfbarsit) ,
                                              Byte.valueOf(AV229Webwcnsprodds_39_tfbarsit_to) ,
                                              Short.valueOf(AV234Webwcnsprodds_44_tfbarpart) ,
                                              Short.valueOf(AV235Webwcnsprodds_45_tfbarpart_to) ,
                                              AV237Webwcnsprodds_47_tfbaritem3_sel ,
                                              AV236Webwcnsprodds_46_tfbaritem3 ,
                                              Short.valueOf(AV238Webwcnsprodds_48_tfbarrdto4) ,
                                              Short.valueOf(AV239Webwcnsprodds_49_tfbarrdto4_to) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A279CliNom ,
                                              A159BarFecGen ,
                                              A4812BarEncCli ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              Byte.valueOf(A213BarSit) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A120BarAgrEst ,
                                              A1652BarSerDsc ,
                                              A157BarFecEnt ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              Integer.valueOf(A1235BarNumCli) ,
                                              A166BarKgm ,
                                              A184BarMtr ,
                                              Short.valueOf(A1503BarPart) ,
                                              A9777BarItem3 ,
                                              Short.valueOf(A13769BarRdto4) ,
                                              Short.valueOf(AV54OrderedBy) ,
                                              Boolean.valueOf(AV55OrderedDsc) ,
                                              Integer.valueOf(AV226Webwcnsprodds_36_tfbarpie) ,
                                              Integer.valueOf(A198BarPie) ,
                                              Integer.valueOf(AV227Webwcnsprodds_37_tfbarpie_to) ,
                                              AV231Webwcnsprodds_41_tfbarfascod_sel ,
                                              AV230Webwcnsprodds_40_tfbarfascod ,
                                              A151BarFasCod ,
                                              AV233Webwcnsprodds_43_tfbarfassig_sel ,
                                              AV232Webwcnsprodds_42_tfbarfassig ,
                                              A1955BarFasSig ,
                                              AV241Webwcnsprodds_51_tfbargots_sel ,
                                              AV240Webwcnsprodds_50_tfbargots ,
                                              A13855BarGots ,
                                              AV243Webwcnsprodds_53_tfbargrs_sel ,
                                              AV242Webwcnsprodds_52_tfbargrs ,
                                              A13856BarGrs ,
                                              AV245Webwcnsprodds_55_tfbarocs_sel ,
                                              AV244Webwcnsprodds_54_tfbarocs ,
                                              A13857BarOcs ,
                                              AV247Webwcnsprodds_57_tfbarrcs_sel ,
                                              AV246Webwcnsprodds_56_tfbarrcs ,
                                              A13858BarRcs ,
                                              AV249Webwcnsprodds_59_tfbaroeko_sel ,
                                              AV248Webwcnsprodds_58_tfbaroeko ,
                                              A13859BarOeko ,
                                              AV250Webwcnsprodds_60_tfbaraccesorios_sel ,
                                              A13860BarAccesor ,
                                              AV252Webwcnsprodds_62_tfbarmarca_sel ,
                                              AV251Webwcnsprodds_61_tfbarmarca ,
                                              A13861BarMarca ,
                                              Integer.valueOf(AV253Webwcnsprodds_63_tfbar_maccod) ,
                                              Integer.valueOf(A13862Bar_MacCod) ,
                                              Integer.valueOf(AV254Webwcnsprodds_64_tfbar_maccod_to) ,
                                              AV256Webwcnsprodds_66_tfbarfascod2_sel ,
                                              AV255Webwcnsprodds_65_tfbarfascod2 ,
                                              A13863BarFasCod2 ,
                                              AV258Webwcnsprodds_68_tfbarfasdsc2_sel ,
                                              AV257Webwcnsprodds_67_tfbarfasdsc2 ,
                                              A13864BarFasDsc2 } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV230Webwcnsprodds_40_tfbarfascod = GXutil.padr( GXutil.rtrim( AV230Webwcnsprodds_40_tfbarfascod), 8, "%") ;
         lV232Webwcnsprodds_42_tfbarfassig = GXutil.padr( GXutil.rtrim( AV232Webwcnsprodds_42_tfbarfassig), 8, "%") ;
         lV251Webwcnsprodds_61_tfbarmarca = GXutil.padr( GXutil.rtrim( AV251Webwcnsprodds_61_tfbarmarca), 30, "%") ;
         lV255Webwcnsprodds_65_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV255Webwcnsprodds_65_tfbarfascod2), 8, "%") ;
         lV191Webwcnsprodds_1_barnhdr = GXutil.padr( GXutil.rtrim( AV191Webwcnsprodds_1_barnhdr), 11, "%") ;
         lV192Webwcnsprodds_2_clinom = GXutil.padr( GXutil.rtrim( AV192Webwcnsprodds_2_clinom), 30, "%") ;
         lV195Webwcnsprodds_5_barenccli = GXutil.padr( GXutil.rtrim( AV195Webwcnsprodds_5_barenccli), 20, "%") ;
         lV196Webwcnsprodds_6_barser = GXutil.padr( GXutil.rtrim( AV196Webwcnsprodds_6_barser), 16, "%") ;
         lV197Webwcnsprodds_7_barcolnom = GXutil.padr( GXutil.rtrim( AV197Webwcnsprodds_7_barcolnom), 13, "%") ;
         lV202Webwcnsprodds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV202Webwcnsprodds_12_tfclinom), 30, "%") ;
         lV204Webwcnsprodds_14_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV204Webwcnsprodds_14_tfbarnhdr), 11, "%") ;
         lV206Webwcnsprodds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV206Webwcnsprodds_16_tfbaragrest), 1, "%") ;
         lV208Webwcnsprodds_18_tfbarser = GXutil.padr( GXutil.rtrim( AV208Webwcnsprodds_18_tfbarser), 16, "%") ;
         lV210Webwcnsprodds_20_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV210Webwcnsprodds_20_tfbarserdsc), 26, "%") ;
         lV214Webwcnsprodds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV214Webwcnsprodds_24_tfbarcolnom), 13, "%") ;
         lV218Webwcnsprodds_28_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV218Webwcnsprodds_28_tfbarnomcli), 13, "%") ;
         lV236Webwcnsprodds_46_tfbaritem3 = GXutil.padr( GXutil.rtrim( AV236Webwcnsprodds_46_tfbaritem3), 20, "%") ;
         /* Using cursor H00IU27 */
         pr_default.execute(1, new Object[] {A396EmprCod, A396EmprCod, AV231Webwcnsprodds_41_tfbarfascod_sel, AV230Webwcnsprodds_40_tfbarfascod, lV230Webwcnsprodds_40_tfbarfascod, AV231Webwcnsprodds_41_tfbarfascod_sel, AV231Webwcnsprodds_41_tfbarfascod_sel, AV233Webwcnsprodds_43_tfbarfassig_sel, AV232Webwcnsprodds_42_tfbarfassig, lV232Webwcnsprodds_42_tfbarfassig, AV233Webwcnsprodds_43_tfbarfassig_sel, AV233Webwcnsprodds_43_tfbarfassig_sel, AV250Webwcnsprodds_60_tfbaraccesorios_sel, AV250Webwcnsprodds_60_tfbaraccesorios_sel, AV252Webwcnsprodds_62_tfbarmarca_sel, AV251Webwcnsprodds_61_tfbarmarca, lV251Webwcnsprodds_61_tfbarmarca, AV252Webwcnsprodds_62_tfbarmarca_sel, AV252Webwcnsprodds_62_tfbarmarca_sel, Integer.valueOf(AV253Webwcnsprodds_63_tfbar_maccod), Integer.valueOf(AV253Webwcnsprodds_63_tfbar_maccod), Integer.valueOf(AV254Webwcnsprodds_64_tfbar_maccod_to), Integer.valueOf(AV254Webwcnsprodds_64_tfbar_maccod_to), AV256Webwcnsprodds_66_tfbarfascod2_sel, AV255Webwcnsprodds_65_tfbarfascod2, lV255Webwcnsprodds_65_tfbarfascod2, AV256Webwcnsprodds_66_tfbarfascod2_sel, AV256Webwcnsprodds_66_tfbarfascod2_sel, lV191Webwcnsprodds_1_barnhdr, lV192Webwcnsprodds_2_clinom, AV193Webwcnsprodds_3_barfecgen, AV194Webwcnsprodds_4_barfecgen_to, lV195Webwcnsprodds_5_barenccli, lV196Webwcnsprodds_6_barser, lV197Webwcnsprodds_7_barcolnom, Byte.valueOf(AV198Webwcnsprodds_8_barsit), Byte.valueOf(AV199Webwcnsprodds_9_barsit_to), Integer.valueOf(AV200Webwcnsprodds_10_tfclicod), Integer.valueOf(AV201Webwcnsprodds_11_tfclicod_to), lV202Webwcnsprodds_12_tfclinom, AV203Webwcnsprodds_13_tfclinom_sel, lV204Webwcnsprodds_14_tfbarnhdr, AV205Webwcnsprodds_15_tfbarnhdr_sel, lV206Webwcnsprodds_16_tfbaragrest, AV207Webwcnsprodds_17_tfbaragrest_sel, lV208Webwcnsprodds_18_tfbarser, AV209Webwcnsprodds_19_tfbarser_sel, lV210Webwcnsprodds_20_tfbarserdsc, AV211Webwcnsprodds_21_tfbarserdsc_sel, AV212Webwcnsprodds_22_tfbarfecgen, AV213Webwcnsprodds_23_tfbarfecent, lV214Webwcnsprodds_24_tfbarcolnom, AV215Webwcnsprodds_25_tfbarcolnom_sel, Integer.valueOf(AV216Webwcnsprodds_26_tfbarcolnum), Integer.valueOf(AV217Webwcnsprodds_27_tfbarcolnum_to), lV218Webwcnsprodds_28_tfbarnomcli, AV219Webwcnsprodds_29_tfbarnomcli_sel, Integer.valueOf(AV220Webwcnsprodds_30_tfbarnumcli), Integer.valueOf(AV221Webwcnsprodds_31_tfbarnumcli_to), AV222Webwcnsprodds_32_tfbarkgm, AV223Webwcnsprodds_33_tfbarkgm_to, AV224Webwcnsprodds_34_tfbarmtr, AV225Webwcnsprodds_35_tfbarmtr_to, Byte.valueOf(AV228Webwcnsprodds_38_tfbarsit), Byte.valueOf(AV229Webwcnsprodds_39_tfbarsit_to), Short.valueOf(AV234Webwcnsprodds_44_tfbarpart), Short.valueOf(AV235Webwcnsprodds_45_tfbarpart_to), lV236Webwcnsprodds_46_tfbaritem3, AV237Webwcnsprodds_47_tfbaritem3_sel, Short.valueOf(AV238Webwcnsprodds_48_tfbarrdto4), Short.valueOf(AV239Webwcnsprodds_49_tfbarrdto4_to)});
         nGXsfl_71_idx = 1 ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3746BarNPed = H00IU27_A3746BarNPed[0] ;
            A4812BarEncCli = H00IU27_A4812BarEncCli[0] ;
            A143BarDisNum = H00IU27_A143BarDisNum[0] ;
            A11852Nxt_ArtCl2 = H00IU27_A11852Nxt_ArtCl2[0] ;
            A4466BarAcaAnh = H00IU27_A4466BarAcaAnh[0] ;
            A218BarTipCol = H00IU27_A218BarTipCol[0] ;
            A13769BarRdto4 = H00IU27_A13769BarRdto4[0] ;
            n13769BarRdto4 = H00IU27_n13769BarRdto4[0] ;
            A9777BarItem3 = H00IU27_A9777BarItem3[0] ;
            A1503BarPart = H00IU27_A1503BarPart[0] ;
            A213BarSit = H00IU27_A213BarSit[0] ;
            A1235BarNumCli = H00IU27_A1235BarNumCli[0] ;
            A1234BarNomCli = H00IU27_A1234BarNomCli[0] ;
            A136BarColNum = H00IU27_A136BarColNum[0] ;
            A135BarColNom = H00IU27_A135BarColNom[0] ;
            A157BarFecEnt = H00IU27_A157BarFecEnt[0] ;
            A159BarFecGen = H00IU27_A159BarFecGen[0] ;
            A1652BarSerDsc = H00IU27_A1652BarSerDsc[0] ;
            A212BarSer = H00IU27_A212BarSer[0] ;
            A120BarAgrEst = H00IU27_A120BarAgrEst[0] ;
            A279CliNom = H00IU27_A279CliNom[0] ;
            A252CliCod = H00IU27_A252CliCod[0] ;
            n252CliCod = H00IU27_n252CliCod[0] ;
            A13862Bar_MacCod = H00IU27_A13862Bar_MacCod[0] ;
            n13862Bar_MacCod = H00IU27_n13862Bar_MacCod[0] ;
            A13861BarMarca = H00IU27_A13861BarMarca[0] ;
            n13861BarMarca = H00IU27_n13861BarMarca[0] ;
            A13860BarAccesor = H00IU27_A13860BarAccesor[0] ;
            n13860BarAccesor = H00IU27_n13860BarAccesor[0] ;
            A1955BarFasSig = H00IU27_A1955BarFasSig[0] ;
            n1955BarFasSig = H00IU27_n1955BarFasSig[0] ;
            A151BarFasCod = H00IU27_A151BarFasCod[0] ;
            n151BarFasCod = H00IU27_n151BarFasCod[0] ;
            A184BarMtr = H00IU27_A184BarMtr[0] ;
            A166BarKgm = H00IU27_A166BarKgm[0] ;
            A130BarCodPar = H00IU27_A130BarCodPar[0] ;
            A132BarCodReo = H00IU27_A132BarCodReo[0] ;
            A129BarCod = H00IU27_A129BarCod[0] ;
            A199BarPie1 = H00IU27_A199BarPie1[0] ;
            A365DisDes = H00IU27_A365DisDes[0] ;
            A898BarPieNDes = H00IU27_A898BarPieNDes[0] ;
            A361DisCod = H00IU27_A361DisCod[0] ;
            A13863BarFasCod2 = H00IU27_A13863BarFasCod2[0] ;
            n13863BarFasCod2 = H00IU27_n13863BarFasCod2[0] ;
            A396EmprCod = H00IU27_A396EmprCod[0] ;
            A13862Bar_MacCod = H00IU27_A13862Bar_MacCod[0] ;
            n13862Bar_MacCod = H00IU27_n13862Bar_MacCod[0] ;
            A279CliNom = H00IU27_A279CliNom[0] ;
            A13863BarFasCod2 = H00IU27_A13863BarFasCod2[0] ;
            n13863BarFasCod2 = H00IU27_n13863BarFasCod2[0] ;
            A13861BarMarca = H00IU27_A13861BarMarca[0] ;
            n13861BarMarca = H00IU27_n13861BarMarca[0] ;
            A13860BarAccesor = H00IU27_A13860BarAccesor[0] ;
            n13860BarAccesor = H00IU27_n13860BarAccesor[0] ;
            A1955BarFasSig = H00IU27_A1955BarFasSig[0] ;
            n1955BarFasSig = H00IU27_n1955BarFasSig[0] ;
            A151BarFasCod = H00IU27_A151BarFasCod[0] ;
            n151BarFasCod = H00IU27_n151BarFasCod[0] ;
            A184BarMtr = H00IU27_A184BarMtr[0] ;
            A166BarKgm = H00IU27_A166BarKgm[0] ;
            A199BarPie1 = H00IU27_A199BarPie1[0] ;
            A898BarPieNDes = H00IU27_A898BarPieNDes[0] ;
            GXt_char1 = A13855BarGots ;
            GXv_char2[0] = GXt_char1 ;
            new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
            webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
            A13855BarGots = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV241Webwcnsprodds_51_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV240Webwcnsprodds_50_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV240Webwcnsprodds_50_tfbargots) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV241Webwcnsprodds_51_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV241Webwcnsprodds_51_tfbargots_sel) == 0 ) ) )
               {
                  GXt_char1 = A13856BarGrs ;
                  GXv_char2[0] = GXt_char1 ;
                  new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                  webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
                  A13856BarGrs = GXt_char1 ;
                  if ( ! ( (GXutil.strcmp("", AV243Webwcnsprodds_53_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV242Webwcnsprodds_52_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV242Webwcnsprodds_52_tfbargrs) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV243Webwcnsprodds_53_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV243Webwcnsprodds_53_tfbargrs_sel) == 0 ) ) )
                     {
                        GXt_char1 = A13857BarOcs ;
                        GXv_char2[0] = GXt_char1 ;
                        new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                        webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
                        A13857BarOcs = GXt_char1 ;
                        if ( ! ( (GXutil.strcmp("", AV245Webwcnsprodds_55_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV244Webwcnsprodds_54_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV244Webwcnsprodds_54_tfbarocs) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV245Webwcnsprodds_55_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV245Webwcnsprodds_55_tfbarocs_sel) == 0 ) ) )
                           {
                              GXt_char1 = A13858BarRcs ;
                              GXv_char2[0] = GXt_char1 ;
                              new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                              webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
                              A13858BarRcs = GXt_char1 ;
                              if ( ! ( (GXutil.strcmp("", AV247Webwcnsprodds_57_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV246Webwcnsprodds_56_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV246Webwcnsprodds_56_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                              {
                                 if ( (GXutil.strcmp("", AV247Webwcnsprodds_57_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV247Webwcnsprodds_57_tfbarrcs_sel) == 0 ) ) )
                                 {
                                    GXt_char1 = A13859BarOeko ;
                                    GXv_char2[0] = GXt_char1 ;
                                    new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                                    webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
                                    A13859BarOeko = GXt_char1 ;
                                    if ( ! ( (GXutil.strcmp("", AV249Webwcnsprodds_59_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV248Webwcnsprodds_58_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV248Webwcnsprodds_58_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                    {
                                       if ( (GXutil.strcmp("", AV249Webwcnsprodds_59_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV249Webwcnsprodds_59_tfbaroeko_sel) == 0 ) ) )
                                       {
                                          GXt_char1 = A13864BarFasDsc2 ;
                                          GXv_char2[0] = GXt_char1 ;
                                          new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char2) ;
                                          webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
                                          A13864BarFasDsc2 = GXt_char1 ;
                                          if ( ! ( (GXutil.strcmp("", AV258Webwcnsprodds_68_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV257Webwcnsprodds_67_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV257Webwcnsprodds_67_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV258Webwcnsprodds_68_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV258Webwcnsprodds_68_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                                {
                                                   A198BarPie = A898BarPieNDes ;
                                                }
                                                else
                                                {
                                                   A198BarPie = A199BarPie1 ;
                                                }
                                                if ( (0==AV226Webwcnsprodds_36_tfbarpie) || ( ( A198BarPie >= AV226Webwcnsprodds_36_tfbarpie ) ) )
                                                {
                                                   if ( (0==AV227Webwcnsprodds_37_tfbarpie_to) || ( ( A198BarPie <= AV227Webwcnsprodds_37_tfbarpie_to ) ) )
                                                   {
                                                      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                                      e21IU2 ();
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(71) ;
         wbIU0( ) ;
      }
      bGXsfl_71_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesIU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV262Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV262Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBKGME"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV134BarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBMTRE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV135BarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBPIE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( DecimalUtil.doubleToDec(AV136BarAlbPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTB1_DSCFB", GXutil.rtrim( AV140Tb1_dscfb));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTB1_DSCFB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV140Tb1_dscfb, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
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
      AV191Webwcnsprodds_1_barnhdr = AV157BarNHdr ;
      AV192Webwcnsprodds_2_clinom = AV118CliNom ;
      AV193Webwcnsprodds_3_barfecgen = AV113BarFecGen ;
      AV194Webwcnsprodds_4_barfecgen_to = AV114BarFecGen_To ;
      AV195Webwcnsprodds_5_barenccli = AV57BarEncCli ;
      AV196Webwcnsprodds_6_barser = AV152BarSer ;
      AV197Webwcnsprodds_7_barcolnom = AV154BarColNom ;
      AV198Webwcnsprodds_8_barsit = AV115BarSit ;
      AV199Webwcnsprodds_9_barsit_to = AV116BarSit_To ;
      AV200Webwcnsprodds_10_tfclicod = AV59TFCliCod ;
      AV201Webwcnsprodds_11_tfclicod_to = AV60TFCliCod_To ;
      AV202Webwcnsprodds_12_tfclinom = AV62TFCliNom ;
      AV203Webwcnsprodds_13_tfclinom_sel = AV63TFCliNom_Sel ;
      AV204Webwcnsprodds_14_tfbarnhdr = AV47TFBarNHdr ;
      AV205Webwcnsprodds_15_tfbarnhdr_sel = AV48TFBarNHdr_Sel ;
      AV206Webwcnsprodds_16_tfbaragrest = AV65TFBarAgrEst ;
      AV207Webwcnsprodds_17_tfbaragrest_sel = AV66TFBarAgrEst_Sel ;
      AV208Webwcnsprodds_18_tfbarser = AV68TFBarSer ;
      AV209Webwcnsprodds_19_tfbarser_sel = AV69TFBarSer_Sel ;
      AV210Webwcnsprodds_20_tfbarserdsc = AV71TFBarSerDsc ;
      AV211Webwcnsprodds_21_tfbarserdsc_sel = AV72TFBarSerDsc_Sel ;
      AV212Webwcnsprodds_22_tfbarfecgen = AV74TFBarFecGen ;
      AV213Webwcnsprodds_23_tfbarfecent = AV79TFBarFecEnt ;
      AV214Webwcnsprodds_24_tfbarcolnom = AV84TFBarColNom ;
      AV215Webwcnsprodds_25_tfbarcolnom_sel = AV85TFBarColNom_Sel ;
      AV216Webwcnsprodds_26_tfbarcolnum = AV87TFBarColNum ;
      AV217Webwcnsprodds_27_tfbarcolnum_to = AV88TFBarColNum_To ;
      AV218Webwcnsprodds_28_tfbarnomcli = AV90TFBarNomCli ;
      AV219Webwcnsprodds_29_tfbarnomcli_sel = AV91TFBarNomCli_Sel ;
      AV220Webwcnsprodds_30_tfbarnumcli = AV93TFBarNumCli ;
      AV221Webwcnsprodds_31_tfbarnumcli_to = AV94TFBarNumCli_To ;
      AV222Webwcnsprodds_32_tfbarkgm = AV96TFBarKgm ;
      AV223Webwcnsprodds_33_tfbarkgm_to = AV97TFBarKgm_To ;
      AV224Webwcnsprodds_34_tfbarmtr = AV99TFBarMtr ;
      AV225Webwcnsprodds_35_tfbarmtr_to = AV100TFBarMtr_To ;
      AV226Webwcnsprodds_36_tfbarpie = AV102TFBarPie ;
      AV227Webwcnsprodds_37_tfbarpie_to = AV103TFBarPie_To ;
      AV228Webwcnsprodds_38_tfbarsit = AV105TFBarSit ;
      AV229Webwcnsprodds_39_tfbarsit_to = AV106TFBarSit_To ;
      AV230Webwcnsprodds_40_tfbarfascod = AV125TFBarFasCod ;
      AV231Webwcnsprodds_41_tfbarfascod_sel = AV126TFBarFasCod_Sel ;
      AV232Webwcnsprodds_42_tfbarfassig = AV128TFBarFasSig ;
      AV233Webwcnsprodds_43_tfbarfassig_sel = AV129TFBarFasSig_Sel ;
      AV234Webwcnsprodds_44_tfbarpart = AV145TFBarPart ;
      AV235Webwcnsprodds_45_tfbarpart_to = AV146TFBarPart_To ;
      AV236Webwcnsprodds_46_tfbaritem3 = AV148TFBarItem3 ;
      AV237Webwcnsprodds_47_tfbaritem3_sel = AV149TFBarItem3_Sel ;
      AV238Webwcnsprodds_48_tfbarrdto4 = AV166TFBarRdto4 ;
      AV239Webwcnsprodds_49_tfbarrdto4_to = AV167TFBarRdto4_To ;
      AV240Webwcnsprodds_50_tfbargots = AV170TFBarGots ;
      AV241Webwcnsprodds_51_tfbargots_sel = AV171TFBarGots_Sel ;
      AV242Webwcnsprodds_52_tfbargrs = AV172TFBarGrs ;
      AV243Webwcnsprodds_53_tfbargrs_sel = AV173TFBarGrs_Sel ;
      AV244Webwcnsprodds_54_tfbarocs = AV174TFBarOcs ;
      AV245Webwcnsprodds_55_tfbarocs_sel = AV175TFBarOcs_Sel ;
      AV246Webwcnsprodds_56_tfbarrcs = AV176TFBarRcs ;
      AV247Webwcnsprodds_57_tfbarrcs_sel = AV177TFBarRcs_Sel ;
      AV248Webwcnsprodds_58_tfbaroeko = AV178TFBarOeko ;
      AV249Webwcnsprodds_59_tfbaroeko_sel = AV179TFBarOeko_Sel ;
      AV250Webwcnsprodds_60_tfbaraccesorios_sel = AV180TFBarAccesorios_Sel ;
      AV251Webwcnsprodds_61_tfbarmarca = AV181TFBarMarca ;
      AV252Webwcnsprodds_62_tfbarmarca_sel = AV182TFBarMarca_Sel ;
      AV253Webwcnsprodds_63_tfbar_maccod = AV183TFBar_MacCod ;
      AV254Webwcnsprodds_64_tfbar_maccod_to = AV184TFBar_MacCod_To ;
      AV255Webwcnsprodds_65_tfbarfascod2 = AV185TFBarFasCod2 ;
      AV256Webwcnsprodds_66_tfbarfascod2_sel = AV186TFBarFasCod2_Sel ;
      AV257Webwcnsprodds_67_tfbarfasdsc2 = AV187TFBarFasDsc2 ;
      AV258Webwcnsprodds_68_tfbarfasdsc2_sel = AV188TFBarFasDsc2_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV157BarNHdr, AV118CliNom, AV57BarEncCli, AV152BarSer, AV154BarColNom, AV115BarSit, AV116BarSit_To, AV113BarFecGen, AV45ManageFiltersExecutionStep, AV40ColumnsSelector, AV114BarFecGen_To, AV59TFCliCod, AV60TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV47TFBarNHdr, AV48TFBarNHdr_Sel, AV65TFBarAgrEst, AV66TFBarAgrEst_Sel, AV68TFBarSer, AV69TFBarSer_Sel, AV71TFBarSerDsc, AV72TFBarSerDsc_Sel, AV74TFBarFecGen, AV79TFBarFecEnt, AV84TFBarColNom, AV85TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV90TFBarNomCli, AV91TFBarNomCli_Sel, AV93TFBarNumCli, AV94TFBarNumCli_To, AV96TFBarKgm, AV97TFBarKgm_To, AV99TFBarMtr, AV100TFBarMtr_To, AV102TFBarPie, AV103TFBarPie_To, AV105TFBarSit, AV106TFBarSit_To, AV125TFBarFasCod, AV126TFBarFasCod_Sel, AV128TFBarFasSig, AV129TFBarFasSig_Sel, AV145TFBarPart, AV146TFBarPart_To, AV148TFBarItem3, AV149TFBarItem3_Sel, AV166TFBarRdto4, AV167TFBarRdto4_To, AV170TFBarGots, AV171TFBarGots_Sel, AV172TFBarGrs, AV173TFBarGrs_Sel, AV174TFBarOcs, AV175TFBarOcs_Sel, AV176TFBarRcs, AV177TFBarRcs_Sel, AV178TFBarOeko, AV179TFBarOeko_Sel, AV180TFBarAccesorios_Sel, AV181TFBarMarca, AV182TFBarMarca_Sel, AV183TFBar_MacCod, AV184TFBar_MacCod_To, AV185TFBarFasCod2, AV186TFBarFasCod2_Sel, AV187TFBarFasDsc2, AV188TFBarFasDsc2_Sel, AV262Pgmname, AV54OrderedBy, AV55OrderedDsc, A376DisObsLin, A377DisObsTxt, A30AlbProCod, A1261BarAlbKgmE, A34AlbProfch, AV134BarAlbKgmE, AV135BarAlbMtrE, A1263BarAlbMtrE, AV136BarAlbPie, A1265BarAlbPie, AV140Tb1_dscfb, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV191Webwcnsprodds_1_barnhdr = AV157BarNHdr ;
      AV192Webwcnsprodds_2_clinom = AV118CliNom ;
      AV193Webwcnsprodds_3_barfecgen = AV113BarFecGen ;
      AV194Webwcnsprodds_4_barfecgen_to = AV114BarFecGen_To ;
      AV195Webwcnsprodds_5_barenccli = AV57BarEncCli ;
      AV196Webwcnsprodds_6_barser = AV152BarSer ;
      AV197Webwcnsprodds_7_barcolnom = AV154BarColNom ;
      AV198Webwcnsprodds_8_barsit = AV115BarSit ;
      AV199Webwcnsprodds_9_barsit_to = AV116BarSit_To ;
      AV200Webwcnsprodds_10_tfclicod = AV59TFCliCod ;
      AV201Webwcnsprodds_11_tfclicod_to = AV60TFCliCod_To ;
      AV202Webwcnsprodds_12_tfclinom = AV62TFCliNom ;
      AV203Webwcnsprodds_13_tfclinom_sel = AV63TFCliNom_Sel ;
      AV204Webwcnsprodds_14_tfbarnhdr = AV47TFBarNHdr ;
      AV205Webwcnsprodds_15_tfbarnhdr_sel = AV48TFBarNHdr_Sel ;
      AV206Webwcnsprodds_16_tfbaragrest = AV65TFBarAgrEst ;
      AV207Webwcnsprodds_17_tfbaragrest_sel = AV66TFBarAgrEst_Sel ;
      AV208Webwcnsprodds_18_tfbarser = AV68TFBarSer ;
      AV209Webwcnsprodds_19_tfbarser_sel = AV69TFBarSer_Sel ;
      AV210Webwcnsprodds_20_tfbarserdsc = AV71TFBarSerDsc ;
      AV211Webwcnsprodds_21_tfbarserdsc_sel = AV72TFBarSerDsc_Sel ;
      AV212Webwcnsprodds_22_tfbarfecgen = AV74TFBarFecGen ;
      AV213Webwcnsprodds_23_tfbarfecent = AV79TFBarFecEnt ;
      AV214Webwcnsprodds_24_tfbarcolnom = AV84TFBarColNom ;
      AV215Webwcnsprodds_25_tfbarcolnom_sel = AV85TFBarColNom_Sel ;
      AV216Webwcnsprodds_26_tfbarcolnum = AV87TFBarColNum ;
      AV217Webwcnsprodds_27_tfbarcolnum_to = AV88TFBarColNum_To ;
      AV218Webwcnsprodds_28_tfbarnomcli = AV90TFBarNomCli ;
      AV219Webwcnsprodds_29_tfbarnomcli_sel = AV91TFBarNomCli_Sel ;
      AV220Webwcnsprodds_30_tfbarnumcli = AV93TFBarNumCli ;
      AV221Webwcnsprodds_31_tfbarnumcli_to = AV94TFBarNumCli_To ;
      AV222Webwcnsprodds_32_tfbarkgm = AV96TFBarKgm ;
      AV223Webwcnsprodds_33_tfbarkgm_to = AV97TFBarKgm_To ;
      AV224Webwcnsprodds_34_tfbarmtr = AV99TFBarMtr ;
      AV225Webwcnsprodds_35_tfbarmtr_to = AV100TFBarMtr_To ;
      AV226Webwcnsprodds_36_tfbarpie = AV102TFBarPie ;
      AV227Webwcnsprodds_37_tfbarpie_to = AV103TFBarPie_To ;
      AV228Webwcnsprodds_38_tfbarsit = AV105TFBarSit ;
      AV229Webwcnsprodds_39_tfbarsit_to = AV106TFBarSit_To ;
      AV230Webwcnsprodds_40_tfbarfascod = AV125TFBarFasCod ;
      AV231Webwcnsprodds_41_tfbarfascod_sel = AV126TFBarFasCod_Sel ;
      AV232Webwcnsprodds_42_tfbarfassig = AV128TFBarFasSig ;
      AV233Webwcnsprodds_43_tfbarfassig_sel = AV129TFBarFasSig_Sel ;
      AV234Webwcnsprodds_44_tfbarpart = AV145TFBarPart ;
      AV235Webwcnsprodds_45_tfbarpart_to = AV146TFBarPart_To ;
      AV236Webwcnsprodds_46_tfbaritem3 = AV148TFBarItem3 ;
      AV237Webwcnsprodds_47_tfbaritem3_sel = AV149TFBarItem3_Sel ;
      AV238Webwcnsprodds_48_tfbarrdto4 = AV166TFBarRdto4 ;
      AV239Webwcnsprodds_49_tfbarrdto4_to = AV167TFBarRdto4_To ;
      AV240Webwcnsprodds_50_tfbargots = AV170TFBarGots ;
      AV241Webwcnsprodds_51_tfbargots_sel = AV171TFBarGots_Sel ;
      AV242Webwcnsprodds_52_tfbargrs = AV172TFBarGrs ;
      AV243Webwcnsprodds_53_tfbargrs_sel = AV173TFBarGrs_Sel ;
      AV244Webwcnsprodds_54_tfbarocs = AV174TFBarOcs ;
      AV245Webwcnsprodds_55_tfbarocs_sel = AV175TFBarOcs_Sel ;
      AV246Webwcnsprodds_56_tfbarrcs = AV176TFBarRcs ;
      AV247Webwcnsprodds_57_tfbarrcs_sel = AV177TFBarRcs_Sel ;
      AV248Webwcnsprodds_58_tfbaroeko = AV178TFBarOeko ;
      AV249Webwcnsprodds_59_tfbaroeko_sel = AV179TFBarOeko_Sel ;
      AV250Webwcnsprodds_60_tfbaraccesorios_sel = AV180TFBarAccesorios_Sel ;
      AV251Webwcnsprodds_61_tfbarmarca = AV181TFBarMarca ;
      AV252Webwcnsprodds_62_tfbarmarca_sel = AV182TFBarMarca_Sel ;
      AV253Webwcnsprodds_63_tfbar_maccod = AV183TFBar_MacCod ;
      AV254Webwcnsprodds_64_tfbar_maccod_to = AV184TFBar_MacCod_To ;
      AV255Webwcnsprodds_65_tfbarfascod2 = AV185TFBarFasCod2 ;
      AV256Webwcnsprodds_66_tfbarfascod2_sel = AV186TFBarFasCod2_Sel ;
      AV257Webwcnsprodds_67_tfbarfasdsc2 = AV187TFBarFasDsc2 ;
      AV258Webwcnsprodds_68_tfbarfasdsc2_sel = AV188TFBarFasDsc2_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV157BarNHdr, AV118CliNom, AV57BarEncCli, AV152BarSer, AV154BarColNom, AV115BarSit, AV116BarSit_To, AV113BarFecGen, AV45ManageFiltersExecutionStep, AV40ColumnsSelector, AV114BarFecGen_To, AV59TFCliCod, AV60TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV47TFBarNHdr, AV48TFBarNHdr_Sel, AV65TFBarAgrEst, AV66TFBarAgrEst_Sel, AV68TFBarSer, AV69TFBarSer_Sel, AV71TFBarSerDsc, AV72TFBarSerDsc_Sel, AV74TFBarFecGen, AV79TFBarFecEnt, AV84TFBarColNom, AV85TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV90TFBarNomCli, AV91TFBarNomCli_Sel, AV93TFBarNumCli, AV94TFBarNumCli_To, AV96TFBarKgm, AV97TFBarKgm_To, AV99TFBarMtr, AV100TFBarMtr_To, AV102TFBarPie, AV103TFBarPie_To, AV105TFBarSit, AV106TFBarSit_To, AV125TFBarFasCod, AV126TFBarFasCod_Sel, AV128TFBarFasSig, AV129TFBarFasSig_Sel, AV145TFBarPart, AV146TFBarPart_To, AV148TFBarItem3, AV149TFBarItem3_Sel, AV166TFBarRdto4, AV167TFBarRdto4_To, AV170TFBarGots, AV171TFBarGots_Sel, AV172TFBarGrs, AV173TFBarGrs_Sel, AV174TFBarOcs, AV175TFBarOcs_Sel, AV176TFBarRcs, AV177TFBarRcs_Sel, AV178TFBarOeko, AV179TFBarOeko_Sel, AV180TFBarAccesorios_Sel, AV181TFBarMarca, AV182TFBarMarca_Sel, AV183TFBar_MacCod, AV184TFBar_MacCod_To, AV185TFBarFasCod2, AV186TFBarFasCod2_Sel, AV187TFBarFasDsc2, AV188TFBarFasDsc2_Sel, AV262Pgmname, AV54OrderedBy, AV55OrderedDsc, A376DisObsLin, A377DisObsTxt, A30AlbProCod, A1261BarAlbKgmE, A34AlbProfch, AV134BarAlbKgmE, AV135BarAlbMtrE, A1263BarAlbMtrE, AV136BarAlbPie, A1265BarAlbPie, AV140Tb1_dscfb, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV191Webwcnsprodds_1_barnhdr = AV157BarNHdr ;
      AV192Webwcnsprodds_2_clinom = AV118CliNom ;
      AV193Webwcnsprodds_3_barfecgen = AV113BarFecGen ;
      AV194Webwcnsprodds_4_barfecgen_to = AV114BarFecGen_To ;
      AV195Webwcnsprodds_5_barenccli = AV57BarEncCli ;
      AV196Webwcnsprodds_6_barser = AV152BarSer ;
      AV197Webwcnsprodds_7_barcolnom = AV154BarColNom ;
      AV198Webwcnsprodds_8_barsit = AV115BarSit ;
      AV199Webwcnsprodds_9_barsit_to = AV116BarSit_To ;
      AV200Webwcnsprodds_10_tfclicod = AV59TFCliCod ;
      AV201Webwcnsprodds_11_tfclicod_to = AV60TFCliCod_To ;
      AV202Webwcnsprodds_12_tfclinom = AV62TFCliNom ;
      AV203Webwcnsprodds_13_tfclinom_sel = AV63TFCliNom_Sel ;
      AV204Webwcnsprodds_14_tfbarnhdr = AV47TFBarNHdr ;
      AV205Webwcnsprodds_15_tfbarnhdr_sel = AV48TFBarNHdr_Sel ;
      AV206Webwcnsprodds_16_tfbaragrest = AV65TFBarAgrEst ;
      AV207Webwcnsprodds_17_tfbaragrest_sel = AV66TFBarAgrEst_Sel ;
      AV208Webwcnsprodds_18_tfbarser = AV68TFBarSer ;
      AV209Webwcnsprodds_19_tfbarser_sel = AV69TFBarSer_Sel ;
      AV210Webwcnsprodds_20_tfbarserdsc = AV71TFBarSerDsc ;
      AV211Webwcnsprodds_21_tfbarserdsc_sel = AV72TFBarSerDsc_Sel ;
      AV212Webwcnsprodds_22_tfbarfecgen = AV74TFBarFecGen ;
      AV213Webwcnsprodds_23_tfbarfecent = AV79TFBarFecEnt ;
      AV214Webwcnsprodds_24_tfbarcolnom = AV84TFBarColNom ;
      AV215Webwcnsprodds_25_tfbarcolnom_sel = AV85TFBarColNom_Sel ;
      AV216Webwcnsprodds_26_tfbarcolnum = AV87TFBarColNum ;
      AV217Webwcnsprodds_27_tfbarcolnum_to = AV88TFBarColNum_To ;
      AV218Webwcnsprodds_28_tfbarnomcli = AV90TFBarNomCli ;
      AV219Webwcnsprodds_29_tfbarnomcli_sel = AV91TFBarNomCli_Sel ;
      AV220Webwcnsprodds_30_tfbarnumcli = AV93TFBarNumCli ;
      AV221Webwcnsprodds_31_tfbarnumcli_to = AV94TFBarNumCli_To ;
      AV222Webwcnsprodds_32_tfbarkgm = AV96TFBarKgm ;
      AV223Webwcnsprodds_33_tfbarkgm_to = AV97TFBarKgm_To ;
      AV224Webwcnsprodds_34_tfbarmtr = AV99TFBarMtr ;
      AV225Webwcnsprodds_35_tfbarmtr_to = AV100TFBarMtr_To ;
      AV226Webwcnsprodds_36_tfbarpie = AV102TFBarPie ;
      AV227Webwcnsprodds_37_tfbarpie_to = AV103TFBarPie_To ;
      AV228Webwcnsprodds_38_tfbarsit = AV105TFBarSit ;
      AV229Webwcnsprodds_39_tfbarsit_to = AV106TFBarSit_To ;
      AV230Webwcnsprodds_40_tfbarfascod = AV125TFBarFasCod ;
      AV231Webwcnsprodds_41_tfbarfascod_sel = AV126TFBarFasCod_Sel ;
      AV232Webwcnsprodds_42_tfbarfassig = AV128TFBarFasSig ;
      AV233Webwcnsprodds_43_tfbarfassig_sel = AV129TFBarFasSig_Sel ;
      AV234Webwcnsprodds_44_tfbarpart = AV145TFBarPart ;
      AV235Webwcnsprodds_45_tfbarpart_to = AV146TFBarPart_To ;
      AV236Webwcnsprodds_46_tfbaritem3 = AV148TFBarItem3 ;
      AV237Webwcnsprodds_47_tfbaritem3_sel = AV149TFBarItem3_Sel ;
      AV238Webwcnsprodds_48_tfbarrdto4 = AV166TFBarRdto4 ;
      AV239Webwcnsprodds_49_tfbarrdto4_to = AV167TFBarRdto4_To ;
      AV240Webwcnsprodds_50_tfbargots = AV170TFBarGots ;
      AV241Webwcnsprodds_51_tfbargots_sel = AV171TFBarGots_Sel ;
      AV242Webwcnsprodds_52_tfbargrs = AV172TFBarGrs ;
      AV243Webwcnsprodds_53_tfbargrs_sel = AV173TFBarGrs_Sel ;
      AV244Webwcnsprodds_54_tfbarocs = AV174TFBarOcs ;
      AV245Webwcnsprodds_55_tfbarocs_sel = AV175TFBarOcs_Sel ;
      AV246Webwcnsprodds_56_tfbarrcs = AV176TFBarRcs ;
      AV247Webwcnsprodds_57_tfbarrcs_sel = AV177TFBarRcs_Sel ;
      AV248Webwcnsprodds_58_tfbaroeko = AV178TFBarOeko ;
      AV249Webwcnsprodds_59_tfbaroeko_sel = AV179TFBarOeko_Sel ;
      AV250Webwcnsprodds_60_tfbaraccesorios_sel = AV180TFBarAccesorios_Sel ;
      AV251Webwcnsprodds_61_tfbarmarca = AV181TFBarMarca ;
      AV252Webwcnsprodds_62_tfbarmarca_sel = AV182TFBarMarca_Sel ;
      AV253Webwcnsprodds_63_tfbar_maccod = AV183TFBar_MacCod ;
      AV254Webwcnsprodds_64_tfbar_maccod_to = AV184TFBar_MacCod_To ;
      AV255Webwcnsprodds_65_tfbarfascod2 = AV185TFBarFasCod2 ;
      AV256Webwcnsprodds_66_tfbarfascod2_sel = AV186TFBarFasCod2_Sel ;
      AV257Webwcnsprodds_67_tfbarfasdsc2 = AV187TFBarFasDsc2 ;
      AV258Webwcnsprodds_68_tfbarfasdsc2_sel = AV188TFBarFasDsc2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV157BarNHdr, AV118CliNom, AV57BarEncCli, AV152BarSer, AV154BarColNom, AV115BarSit, AV116BarSit_To, AV113BarFecGen, AV45ManageFiltersExecutionStep, AV40ColumnsSelector, AV114BarFecGen_To, AV59TFCliCod, AV60TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV47TFBarNHdr, AV48TFBarNHdr_Sel, AV65TFBarAgrEst, AV66TFBarAgrEst_Sel, AV68TFBarSer, AV69TFBarSer_Sel, AV71TFBarSerDsc, AV72TFBarSerDsc_Sel, AV74TFBarFecGen, AV79TFBarFecEnt, AV84TFBarColNom, AV85TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV90TFBarNomCli, AV91TFBarNomCli_Sel, AV93TFBarNumCli, AV94TFBarNumCli_To, AV96TFBarKgm, AV97TFBarKgm_To, AV99TFBarMtr, AV100TFBarMtr_To, AV102TFBarPie, AV103TFBarPie_To, AV105TFBarSit, AV106TFBarSit_To, AV125TFBarFasCod, AV126TFBarFasCod_Sel, AV128TFBarFasSig, AV129TFBarFasSig_Sel, AV145TFBarPart, AV146TFBarPart_To, AV148TFBarItem3, AV149TFBarItem3_Sel, AV166TFBarRdto4, AV167TFBarRdto4_To, AV170TFBarGots, AV171TFBarGots_Sel, AV172TFBarGrs, AV173TFBarGrs_Sel, AV174TFBarOcs, AV175TFBarOcs_Sel, AV176TFBarRcs, AV177TFBarRcs_Sel, AV178TFBarOeko, AV179TFBarOeko_Sel, AV180TFBarAccesorios_Sel, AV181TFBarMarca, AV182TFBarMarca_Sel, AV183TFBar_MacCod, AV184TFBar_MacCod_To, AV185TFBarFasCod2, AV186TFBarFasCod2_Sel, AV187TFBarFasDsc2, AV188TFBarFasDsc2_Sel, AV262Pgmname, AV54OrderedBy, AV55OrderedDsc, A376DisObsLin, A377DisObsTxt, A30AlbProCod, A1261BarAlbKgmE, A34AlbProfch, AV134BarAlbKgmE, AV135BarAlbMtrE, A1263BarAlbMtrE, AV136BarAlbPie, A1265BarAlbPie, AV140Tb1_dscfb, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV191Webwcnsprodds_1_barnhdr = AV157BarNHdr ;
      AV192Webwcnsprodds_2_clinom = AV118CliNom ;
      AV193Webwcnsprodds_3_barfecgen = AV113BarFecGen ;
      AV194Webwcnsprodds_4_barfecgen_to = AV114BarFecGen_To ;
      AV195Webwcnsprodds_5_barenccli = AV57BarEncCli ;
      AV196Webwcnsprodds_6_barser = AV152BarSer ;
      AV197Webwcnsprodds_7_barcolnom = AV154BarColNom ;
      AV198Webwcnsprodds_8_barsit = AV115BarSit ;
      AV199Webwcnsprodds_9_barsit_to = AV116BarSit_To ;
      AV200Webwcnsprodds_10_tfclicod = AV59TFCliCod ;
      AV201Webwcnsprodds_11_tfclicod_to = AV60TFCliCod_To ;
      AV202Webwcnsprodds_12_tfclinom = AV62TFCliNom ;
      AV203Webwcnsprodds_13_tfclinom_sel = AV63TFCliNom_Sel ;
      AV204Webwcnsprodds_14_tfbarnhdr = AV47TFBarNHdr ;
      AV205Webwcnsprodds_15_tfbarnhdr_sel = AV48TFBarNHdr_Sel ;
      AV206Webwcnsprodds_16_tfbaragrest = AV65TFBarAgrEst ;
      AV207Webwcnsprodds_17_tfbaragrest_sel = AV66TFBarAgrEst_Sel ;
      AV208Webwcnsprodds_18_tfbarser = AV68TFBarSer ;
      AV209Webwcnsprodds_19_tfbarser_sel = AV69TFBarSer_Sel ;
      AV210Webwcnsprodds_20_tfbarserdsc = AV71TFBarSerDsc ;
      AV211Webwcnsprodds_21_tfbarserdsc_sel = AV72TFBarSerDsc_Sel ;
      AV212Webwcnsprodds_22_tfbarfecgen = AV74TFBarFecGen ;
      AV213Webwcnsprodds_23_tfbarfecent = AV79TFBarFecEnt ;
      AV214Webwcnsprodds_24_tfbarcolnom = AV84TFBarColNom ;
      AV215Webwcnsprodds_25_tfbarcolnom_sel = AV85TFBarColNom_Sel ;
      AV216Webwcnsprodds_26_tfbarcolnum = AV87TFBarColNum ;
      AV217Webwcnsprodds_27_tfbarcolnum_to = AV88TFBarColNum_To ;
      AV218Webwcnsprodds_28_tfbarnomcli = AV90TFBarNomCli ;
      AV219Webwcnsprodds_29_tfbarnomcli_sel = AV91TFBarNomCli_Sel ;
      AV220Webwcnsprodds_30_tfbarnumcli = AV93TFBarNumCli ;
      AV221Webwcnsprodds_31_tfbarnumcli_to = AV94TFBarNumCli_To ;
      AV222Webwcnsprodds_32_tfbarkgm = AV96TFBarKgm ;
      AV223Webwcnsprodds_33_tfbarkgm_to = AV97TFBarKgm_To ;
      AV224Webwcnsprodds_34_tfbarmtr = AV99TFBarMtr ;
      AV225Webwcnsprodds_35_tfbarmtr_to = AV100TFBarMtr_To ;
      AV226Webwcnsprodds_36_tfbarpie = AV102TFBarPie ;
      AV227Webwcnsprodds_37_tfbarpie_to = AV103TFBarPie_To ;
      AV228Webwcnsprodds_38_tfbarsit = AV105TFBarSit ;
      AV229Webwcnsprodds_39_tfbarsit_to = AV106TFBarSit_To ;
      AV230Webwcnsprodds_40_tfbarfascod = AV125TFBarFasCod ;
      AV231Webwcnsprodds_41_tfbarfascod_sel = AV126TFBarFasCod_Sel ;
      AV232Webwcnsprodds_42_tfbarfassig = AV128TFBarFasSig ;
      AV233Webwcnsprodds_43_tfbarfassig_sel = AV129TFBarFasSig_Sel ;
      AV234Webwcnsprodds_44_tfbarpart = AV145TFBarPart ;
      AV235Webwcnsprodds_45_tfbarpart_to = AV146TFBarPart_To ;
      AV236Webwcnsprodds_46_tfbaritem3 = AV148TFBarItem3 ;
      AV237Webwcnsprodds_47_tfbaritem3_sel = AV149TFBarItem3_Sel ;
      AV238Webwcnsprodds_48_tfbarrdto4 = AV166TFBarRdto4 ;
      AV239Webwcnsprodds_49_tfbarrdto4_to = AV167TFBarRdto4_To ;
      AV240Webwcnsprodds_50_tfbargots = AV170TFBarGots ;
      AV241Webwcnsprodds_51_tfbargots_sel = AV171TFBarGots_Sel ;
      AV242Webwcnsprodds_52_tfbargrs = AV172TFBarGrs ;
      AV243Webwcnsprodds_53_tfbargrs_sel = AV173TFBarGrs_Sel ;
      AV244Webwcnsprodds_54_tfbarocs = AV174TFBarOcs ;
      AV245Webwcnsprodds_55_tfbarocs_sel = AV175TFBarOcs_Sel ;
      AV246Webwcnsprodds_56_tfbarrcs = AV176TFBarRcs ;
      AV247Webwcnsprodds_57_tfbarrcs_sel = AV177TFBarRcs_Sel ;
      AV248Webwcnsprodds_58_tfbaroeko = AV178TFBarOeko ;
      AV249Webwcnsprodds_59_tfbaroeko_sel = AV179TFBarOeko_Sel ;
      AV250Webwcnsprodds_60_tfbaraccesorios_sel = AV180TFBarAccesorios_Sel ;
      AV251Webwcnsprodds_61_tfbarmarca = AV181TFBarMarca ;
      AV252Webwcnsprodds_62_tfbarmarca_sel = AV182TFBarMarca_Sel ;
      AV253Webwcnsprodds_63_tfbar_maccod = AV183TFBar_MacCod ;
      AV254Webwcnsprodds_64_tfbar_maccod_to = AV184TFBar_MacCod_To ;
      AV255Webwcnsprodds_65_tfbarfascod2 = AV185TFBarFasCod2 ;
      AV256Webwcnsprodds_66_tfbarfascod2_sel = AV186TFBarFasCod2_Sel ;
      AV257Webwcnsprodds_67_tfbarfasdsc2 = AV187TFBarFasDsc2 ;
      AV258Webwcnsprodds_68_tfbarfasdsc2_sel = AV188TFBarFasDsc2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV157BarNHdr, AV118CliNom, AV57BarEncCli, AV152BarSer, AV154BarColNom, AV115BarSit, AV116BarSit_To, AV113BarFecGen, AV45ManageFiltersExecutionStep, AV40ColumnsSelector, AV114BarFecGen_To, AV59TFCliCod, AV60TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV47TFBarNHdr, AV48TFBarNHdr_Sel, AV65TFBarAgrEst, AV66TFBarAgrEst_Sel, AV68TFBarSer, AV69TFBarSer_Sel, AV71TFBarSerDsc, AV72TFBarSerDsc_Sel, AV74TFBarFecGen, AV79TFBarFecEnt, AV84TFBarColNom, AV85TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV90TFBarNomCli, AV91TFBarNomCli_Sel, AV93TFBarNumCli, AV94TFBarNumCli_To, AV96TFBarKgm, AV97TFBarKgm_To, AV99TFBarMtr, AV100TFBarMtr_To, AV102TFBarPie, AV103TFBarPie_To, AV105TFBarSit, AV106TFBarSit_To, AV125TFBarFasCod, AV126TFBarFasCod_Sel, AV128TFBarFasSig, AV129TFBarFasSig_Sel, AV145TFBarPart, AV146TFBarPart_To, AV148TFBarItem3, AV149TFBarItem3_Sel, AV166TFBarRdto4, AV167TFBarRdto4_To, AV170TFBarGots, AV171TFBarGots_Sel, AV172TFBarGrs, AV173TFBarGrs_Sel, AV174TFBarOcs, AV175TFBarOcs_Sel, AV176TFBarRcs, AV177TFBarRcs_Sel, AV178TFBarOeko, AV179TFBarOeko_Sel, AV180TFBarAccesorios_Sel, AV181TFBarMarca, AV182TFBarMarca_Sel, AV183TFBar_MacCod, AV184TFBar_MacCod_To, AV185TFBarFasCod2, AV186TFBarFasCod2_Sel, AV187TFBarFasDsc2, AV188TFBarFasDsc2_Sel, AV262Pgmname, AV54OrderedBy, AV55OrderedDsc, A376DisObsLin, A377DisObsTxt, A30AlbProCod, A1261BarAlbKgmE, A34AlbProfch, AV134BarAlbKgmE, AV135BarAlbMtrE, A1263BarAlbMtrE, AV136BarAlbPie, A1265BarAlbPie, AV140Tb1_dscfb, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV191Webwcnsprodds_1_barnhdr = AV157BarNHdr ;
      AV192Webwcnsprodds_2_clinom = AV118CliNom ;
      AV193Webwcnsprodds_3_barfecgen = AV113BarFecGen ;
      AV194Webwcnsprodds_4_barfecgen_to = AV114BarFecGen_To ;
      AV195Webwcnsprodds_5_barenccli = AV57BarEncCli ;
      AV196Webwcnsprodds_6_barser = AV152BarSer ;
      AV197Webwcnsprodds_7_barcolnom = AV154BarColNom ;
      AV198Webwcnsprodds_8_barsit = AV115BarSit ;
      AV199Webwcnsprodds_9_barsit_to = AV116BarSit_To ;
      AV200Webwcnsprodds_10_tfclicod = AV59TFCliCod ;
      AV201Webwcnsprodds_11_tfclicod_to = AV60TFCliCod_To ;
      AV202Webwcnsprodds_12_tfclinom = AV62TFCliNom ;
      AV203Webwcnsprodds_13_tfclinom_sel = AV63TFCliNom_Sel ;
      AV204Webwcnsprodds_14_tfbarnhdr = AV47TFBarNHdr ;
      AV205Webwcnsprodds_15_tfbarnhdr_sel = AV48TFBarNHdr_Sel ;
      AV206Webwcnsprodds_16_tfbaragrest = AV65TFBarAgrEst ;
      AV207Webwcnsprodds_17_tfbaragrest_sel = AV66TFBarAgrEst_Sel ;
      AV208Webwcnsprodds_18_tfbarser = AV68TFBarSer ;
      AV209Webwcnsprodds_19_tfbarser_sel = AV69TFBarSer_Sel ;
      AV210Webwcnsprodds_20_tfbarserdsc = AV71TFBarSerDsc ;
      AV211Webwcnsprodds_21_tfbarserdsc_sel = AV72TFBarSerDsc_Sel ;
      AV212Webwcnsprodds_22_tfbarfecgen = AV74TFBarFecGen ;
      AV213Webwcnsprodds_23_tfbarfecent = AV79TFBarFecEnt ;
      AV214Webwcnsprodds_24_tfbarcolnom = AV84TFBarColNom ;
      AV215Webwcnsprodds_25_tfbarcolnom_sel = AV85TFBarColNom_Sel ;
      AV216Webwcnsprodds_26_tfbarcolnum = AV87TFBarColNum ;
      AV217Webwcnsprodds_27_tfbarcolnum_to = AV88TFBarColNum_To ;
      AV218Webwcnsprodds_28_tfbarnomcli = AV90TFBarNomCli ;
      AV219Webwcnsprodds_29_tfbarnomcli_sel = AV91TFBarNomCli_Sel ;
      AV220Webwcnsprodds_30_tfbarnumcli = AV93TFBarNumCli ;
      AV221Webwcnsprodds_31_tfbarnumcli_to = AV94TFBarNumCli_To ;
      AV222Webwcnsprodds_32_tfbarkgm = AV96TFBarKgm ;
      AV223Webwcnsprodds_33_tfbarkgm_to = AV97TFBarKgm_To ;
      AV224Webwcnsprodds_34_tfbarmtr = AV99TFBarMtr ;
      AV225Webwcnsprodds_35_tfbarmtr_to = AV100TFBarMtr_To ;
      AV226Webwcnsprodds_36_tfbarpie = AV102TFBarPie ;
      AV227Webwcnsprodds_37_tfbarpie_to = AV103TFBarPie_To ;
      AV228Webwcnsprodds_38_tfbarsit = AV105TFBarSit ;
      AV229Webwcnsprodds_39_tfbarsit_to = AV106TFBarSit_To ;
      AV230Webwcnsprodds_40_tfbarfascod = AV125TFBarFasCod ;
      AV231Webwcnsprodds_41_tfbarfascod_sel = AV126TFBarFasCod_Sel ;
      AV232Webwcnsprodds_42_tfbarfassig = AV128TFBarFasSig ;
      AV233Webwcnsprodds_43_tfbarfassig_sel = AV129TFBarFasSig_Sel ;
      AV234Webwcnsprodds_44_tfbarpart = AV145TFBarPart ;
      AV235Webwcnsprodds_45_tfbarpart_to = AV146TFBarPart_To ;
      AV236Webwcnsprodds_46_tfbaritem3 = AV148TFBarItem3 ;
      AV237Webwcnsprodds_47_tfbaritem3_sel = AV149TFBarItem3_Sel ;
      AV238Webwcnsprodds_48_tfbarrdto4 = AV166TFBarRdto4 ;
      AV239Webwcnsprodds_49_tfbarrdto4_to = AV167TFBarRdto4_To ;
      AV240Webwcnsprodds_50_tfbargots = AV170TFBarGots ;
      AV241Webwcnsprodds_51_tfbargots_sel = AV171TFBarGots_Sel ;
      AV242Webwcnsprodds_52_tfbargrs = AV172TFBarGrs ;
      AV243Webwcnsprodds_53_tfbargrs_sel = AV173TFBarGrs_Sel ;
      AV244Webwcnsprodds_54_tfbarocs = AV174TFBarOcs ;
      AV245Webwcnsprodds_55_tfbarocs_sel = AV175TFBarOcs_Sel ;
      AV246Webwcnsprodds_56_tfbarrcs = AV176TFBarRcs ;
      AV247Webwcnsprodds_57_tfbarrcs_sel = AV177TFBarRcs_Sel ;
      AV248Webwcnsprodds_58_tfbaroeko = AV178TFBarOeko ;
      AV249Webwcnsprodds_59_tfbaroeko_sel = AV179TFBarOeko_Sel ;
      AV250Webwcnsprodds_60_tfbaraccesorios_sel = AV180TFBarAccesorios_Sel ;
      AV251Webwcnsprodds_61_tfbarmarca = AV181TFBarMarca ;
      AV252Webwcnsprodds_62_tfbarmarca_sel = AV182TFBarMarca_Sel ;
      AV253Webwcnsprodds_63_tfbar_maccod = AV183TFBar_MacCod ;
      AV254Webwcnsprodds_64_tfbar_maccod_to = AV184TFBar_MacCod_To ;
      AV255Webwcnsprodds_65_tfbarfascod2 = AV185TFBarFasCod2 ;
      AV256Webwcnsprodds_66_tfbarfascod2_sel = AV186TFBarFasCod2_Sel ;
      AV257Webwcnsprodds_67_tfbarfasdsc2 = AV187TFBarFasDsc2 ;
      AV258Webwcnsprodds_68_tfbarfasdsc2_sel = AV188TFBarFasDsc2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV157BarNHdr, AV118CliNom, AV57BarEncCli, AV152BarSer, AV154BarColNom, AV115BarSit, AV116BarSit_To, AV113BarFecGen, AV45ManageFiltersExecutionStep, AV40ColumnsSelector, AV114BarFecGen_To, AV59TFCliCod, AV60TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV47TFBarNHdr, AV48TFBarNHdr_Sel, AV65TFBarAgrEst, AV66TFBarAgrEst_Sel, AV68TFBarSer, AV69TFBarSer_Sel, AV71TFBarSerDsc, AV72TFBarSerDsc_Sel, AV74TFBarFecGen, AV79TFBarFecEnt, AV84TFBarColNom, AV85TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV90TFBarNomCli, AV91TFBarNomCli_Sel, AV93TFBarNumCli, AV94TFBarNumCli_To, AV96TFBarKgm, AV97TFBarKgm_To, AV99TFBarMtr, AV100TFBarMtr_To, AV102TFBarPie, AV103TFBarPie_To, AV105TFBarSit, AV106TFBarSit_To, AV125TFBarFasCod, AV126TFBarFasCod_Sel, AV128TFBarFasSig, AV129TFBarFasSig_Sel, AV145TFBarPart, AV146TFBarPart_To, AV148TFBarItem3, AV149TFBarItem3_Sel, AV166TFBarRdto4, AV167TFBarRdto4_To, AV170TFBarGots, AV171TFBarGots_Sel, AV172TFBarGrs, AV173TFBarGrs_Sel, AV174TFBarOcs, AV175TFBarOcs_Sel, AV176TFBarRcs, AV177TFBarRcs_Sel, AV178TFBarOeko, AV179TFBarOeko_Sel, AV180TFBarAccesorios_Sel, AV181TFBarMarca, AV182TFBarMarca_Sel, AV183TFBar_MacCod, AV184TFBar_MacCod_To, AV185TFBarFasCod2, AV186TFBarFasCod2_Sel, AV187TFBarFasDsc2, AV188TFBarFasDsc2_Sel, AV262Pgmname, AV54OrderedBy, AV55OrderedDsc, A376DisObsLin, A377DisObsTxt, A30AlbProCod, A1261BarAlbKgmE, A34AlbProfch, AV134BarAlbKgmE, AV135BarAlbMtrE, A1263BarAlbMtrE, AV136BarAlbPie, A1265BarAlbPie, AV140Tb1_dscfb, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV262Pgmname = "WebWCnsProd" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavBarmaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmaccod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavAccesorios_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAccesorios_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAccesorios_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavBarenccligrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccligrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccligrid_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavObsenc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObsenc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObsenc_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavFasdscult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdscult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscult_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavFasdscsig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdscsig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscsig_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavAlbprofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprofec_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavBaralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgme_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavBaralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmtre_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavBaralbpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbpie_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavExportacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExportacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExportacion_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavForrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForrgb_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupIU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19IU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV43ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV40ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_71 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_71"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV113BarFecGen = localUtil.ctod( httpContext.cgiGet( "vBARFECGEN"), 0) ;
         AV114BarFecGen_To = localUtil.ctod( httpContext.cgiGet( "vBARFECGEN_TO"), 0) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_managefilters_Icontype = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( "DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( "DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
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
         AV157BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV157BarNHdr", AV157BarNHdr);
         AV118CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV118CliNom", AV118CliNom);
         AV169BarFecGen_RangeText = httpContext.cgiGet( edtavBarfecgen_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV169BarFecGen_RangeText", AV169BarFecGen_RangeText);
         AV57BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57BarEncCli", AV57BarEncCli);
         AV152BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV152BarSer", AV152BarSer);
         AV154BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV154BarColNom", AV154BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT");
            GX_FocusControl = edtavBarsit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV115BarSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115BarSit), 2, 0));
         }
         else
         {
            AV115BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115BarSit), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT_TO");
            GX_FocusControl = edtavBarsit_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV116BarSit_To = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116BarSit_To), 2, 0));
         }
         else
         {
            AV116BarSit_To = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116BarSit_To), 2, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATE");
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76DDO_BarFecGenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DDO_BarFecGenAuxDate", localUtil.format(AV76DDO_BarFecGenAuxDate, "99/99/99"));
         }
         else
         {
            AV76DDO_BarFecGenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DDO_BarFecGenAuxDate", localUtil.format(AV76DDO_BarFecGenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecentauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECENTAUXDATE");
            GX_FocusControl = edtavDdo_barfecentauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81DDO_BarFecEntAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81DDO_BarFecEntAuxDate", localUtil.format(AV81DDO_BarFecEntAuxDate, "99/99/99"));
         }
         else
         {
            AV81DDO_BarFecEntAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecentauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81DDO_BarFecEntAuxDate", localUtil.format(AV81DDO_BarFecEntAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_71_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
         if ( nGXsfl_71_idx > 0 )
         {
            AV165DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV165DetailWebComponent);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarmaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarmaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMACCOD");
               GX_FocusControl = edtavBarmaccod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV143BarMacCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarmaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143BarMacCod), 10, 0));
            }
            else
            {
               AV143BarMacCod = localUtil.ctol( httpContext.cgiGet( edtavBarmaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarmaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143BarMacCod), 10, 0));
            }
            AV138Accesorios = httpContext.cgiGet( edtavAccesorios_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAccesorios_Internalname, AV138Accesorios);
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            AV155BarEncCliGrid = httpContext.cgiGet( edtavBarenccligrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarenccligrid_Internalname, AV155BarEncCliGrid);
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A159BarFecGen = localUtil.ctod( httpContext.cgiGet( edtBarFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A157BarFecEnt = localUtil.ctod( httpContext.cgiGet( edtBarFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV139ObsEnc = httpContext.cgiGet( edtavObsenc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavObsenc_Internalname, AV139ObsEnc);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
            A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
            n151BarFasCod = false ;
            AV130FasDscUlt = httpContext.cgiGet( edtavFasdscult_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavFasdscult_Internalname, AV130FasDscUlt);
            A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
            n1955BarFasSig = false ;
            AV131FasDscSig = httpContext.cgiGet( edtavFasdscsig_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavFasdscsig_Internalname, AV131FasDscSig);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCOD");
               GX_FocusControl = edtavAlbprocod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV132AlbProcod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavAlbprocod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132AlbProcod), 10, 0));
            }
            else
            {
               AV132AlbProcod = localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavAlbprocod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132AlbProcod), 10, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFEC");
               GX_FocusControl = edtavAlbprofec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV133AlbProFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, edtavAlbprofec_Internalname, localUtil.format(AV133AlbProFec, "99/99/99"));
            }
            else
            {
               AV133AlbProFec = localUtil.ctod( httpContext.cgiGet( edtavAlbprofec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavAlbprofec_Internalname, localUtil.format(AV133AlbProFec, "99/99/99"));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBKGME");
               GX_FocusControl = edtavBaralbkgme_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV134BarAlbKgmE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV134BarAlbKgmE, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBKGME"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV134BarAlbKgmE, "ZZZZZ9.99")));
            }
            else
            {
               AV134BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV134BarAlbKgmE, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBKGME"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV134BarAlbKgmE, "ZZZZZ9.99")));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBMTRE");
               GX_FocusControl = edtavBaralbmtre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV135BarAlbMtrE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV135BarAlbMtrE, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBMTRE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV135BarAlbMtrE, "ZZZZZ9.99")));
            }
            else
            {
               AV135BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV135BarAlbMtrE, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBMTRE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV135BarAlbMtrE, "ZZZZZ9.99")));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBPIE");
               GX_FocusControl = edtavBaralbpie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV136BarAlbPie = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBaralbpie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136BarAlbPie), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBPIE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( DecimalUtil.doubleToDec(AV136BarAlbPie), "ZZZZZ9")));
            }
            else
            {
               AV136BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBaralbpie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136BarAlbPie), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBPIE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( DecimalUtil.doubleToDec(AV136BarAlbPie), "ZZZZZ9")));
            }
            AV141Exportacion = httpContext.cgiGet( edtavExportacion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavExportacion_Internalname, AV141Exportacion);
            AV142Marca = httpContext.cgiGet( edtavMarca_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMarca_Internalname, AV142Marca);
            A1503BarPart = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9777BarItem3 = httpContext.cgiGet( edtBarItem3_Internalname) ;
            A13769BarRdto4 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarRdto4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13769BarRdto4 = false ;
            A13855BarGots = httpContext.cgiGet( edtBarGots_Internalname) ;
            A13856BarGrs = httpContext.cgiGet( edtBarGrs_Internalname) ;
            A13857BarOcs = httpContext.cgiGet( edtBarOcs_Internalname) ;
            A13858BarRcs = httpContext.cgiGet( edtBarRcs_Internalname) ;
            A13859BarOeko = httpContext.cgiGet( edtBarOeko_Internalname) ;
            A13860BarAccesor = ((GXutil.strcmp(httpContext.cgiGet( chkBarAccesor.getInternalname()), "S")==0) ? "S" : "N") ;
            n13860BarAccesor = false ;
            A13861BarMarca = httpContext.cgiGet( edtBarMarca_Internalname) ;
            n13861BarMarca = false ;
            A13862Bar_MacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBar_MacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13862Bar_MacCod = false ;
            A13863BarFasCod2 = httpContext.cgiGet( edtBarFasCod2_Internalname) ;
            n13863BarFasCod2 = false ;
            A13864BarFasDsc2 = httpContext.cgiGet( edtBarFasDsc2_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORRGB");
               GX_FocusControl = edtavForrgb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV164ForRGB = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164ForRGB), 10, 0));
            }
            else
            {
               AV164ForRGB = localUtil.ctol( httpContext.cgiGet( edtavForrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164ForRGB), 10, 0));
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNHDR"), AV157BarNHdr) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLINOM"), AV118CliNom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARENCCLI"), AV57BarEncCli) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSER"), AV152BarSer) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOM"), AV154BarColNom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV115BarSit )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV116BarSit_To )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGEN"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV113BarFecGen)) ) )
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
      e19IU2 ();
      if (returnInSub) return;
   }

   public void e19IU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      divTablemain_Class = "TableContent" ;
      httpContext.ajax_rsp_assign_prop("", false, divTablemain_Internalname, "Class", divTablemain_Class, true);
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwcnsprod_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwcnsprod_impl.this.AV6EmprCod = GXv_char2[0] ;
      webwcnsprod_impl.this.AV7EmprNom = GXv_char3[0] ;
      webwcnsprod_impl.this.AV8UsurCod = GXv_char4[0] ;
      AV115BarSit = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115BarSit), 2, 0));
      AV116BarSit_To = (byte)(6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116BarSit_To), 2, 0));
      AV113BarFecGen = GXutil.dadd(GXutil.today( ),-(7)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113BarFecGen", localUtil.format(AV113BarFecGen, "99/99/99"));
      AV114BarFecGen_To = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114BarFecGen_To", localUtil.format(AV114BarFecGen_To, "99/99/99"));
      GXt_char1 = AV5Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwcnsprod_impl.this.GXt_char1 = GXv_char4[0] ;
      AV5Station = GXt_char1 ;
      GXv_char4[0] = AV6EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwcnsprod_impl.this.AV6EmprCod = GXv_char4[0] ;
      webwcnsprod_impl.this.AV7EmprNom = GXv_char3[0] ;
      webwcnsprod_impl.this.AV8UsurCod = GXv_char2[0] ;
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV11HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      this.executeUsercontrolMethod("", false, "BARFECGEN_RANGEPICKERContainer", "Attach", "", new Object[] {edtavBarfecgen_rangetext_Internalname});
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Consulta Produccion", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV54OrderedBy < 1 )
      {
         AV54OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20IU2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV10WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV45ManageFiltersExecutionStep == 1 )
      {
         AV45ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ManageFiltersExecutionStep", GXutil.str( AV45ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV45ManageFiltersExecutionStep == 2 )
      {
         AV45ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ManageFiltersExecutionStep", GXutil.str( AV45ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV42Session.getValue("WebWCnsProdColumnsSelector"), "") != 0 )
      {
         AV38ColumnsSelectorXML = AV42Session.getValue("WebWCnsProdColumnsSelector") ;
         AV40ColumnsSelector.fromxml(AV38ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavBarmaccod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmaccod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmaccod_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavAccesorios_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAccesorios_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAccesorios_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarAgrEst_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavBarenccligrid_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccligrid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccligrid_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarFecEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecEnt_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavObsenc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObsenc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObsenc_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarNumCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCod_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavFasdscult_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdscult_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscult_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarFasSig_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasSig_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasSig_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavFasdscsig_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdscsig_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscsig_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavAlbprocod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavAlbprofec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprofec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprofec_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavBaralbkgme_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbkgme_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgme_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavBaralbmtre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbmtre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmtre_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavBaralbpie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbpie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbpie_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavExportacion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExportacion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExportacion_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavMarca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarPart_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPart_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarItem3_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarItem3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarItem3_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarRdto4_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarRdto4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRdto4_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarGots_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+35)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGots_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarGrs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+36)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGrs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGrs_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarOcs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+37)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOcs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOcs_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarRcs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+38)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarRcs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRcs_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarOeko_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+39)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOeko_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOeko_Visible), 5, 0), !bGXsfl_71_Refreshing);
      chkBarAccesor.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+40)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAccesor.getInternalname(), "Visible", GXutil.ltrimstr( chkBarAccesor.getVisible(), 5, 0), !bGXsfl_71_Refreshing);
      edtBarMarca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+41)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMarca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMarca_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBar_MacCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+42)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBar_MacCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBar_MacCod_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarFasCod2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+43)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCod2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCod2_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtBarFasDsc2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+44)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasDsc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDsc2_Visible), 5, 0), !bGXsfl_71_Refreshing);
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      AV191Webwcnsprodds_1_barnhdr = AV157BarNHdr ;
      AV192Webwcnsprodds_2_clinom = AV118CliNom ;
      AV193Webwcnsprodds_3_barfecgen = AV113BarFecGen ;
      AV194Webwcnsprodds_4_barfecgen_to = AV114BarFecGen_To ;
      AV195Webwcnsprodds_5_barenccli = AV57BarEncCli ;
      AV196Webwcnsprodds_6_barser = AV152BarSer ;
      AV197Webwcnsprodds_7_barcolnom = AV154BarColNom ;
      AV198Webwcnsprodds_8_barsit = AV115BarSit ;
      AV199Webwcnsprodds_9_barsit_to = AV116BarSit_To ;
      AV200Webwcnsprodds_10_tfclicod = AV59TFCliCod ;
      AV201Webwcnsprodds_11_tfclicod_to = AV60TFCliCod_To ;
      AV202Webwcnsprodds_12_tfclinom = AV62TFCliNom ;
      AV203Webwcnsprodds_13_tfclinom_sel = AV63TFCliNom_Sel ;
      AV204Webwcnsprodds_14_tfbarnhdr = AV47TFBarNHdr ;
      AV205Webwcnsprodds_15_tfbarnhdr_sel = AV48TFBarNHdr_Sel ;
      AV206Webwcnsprodds_16_tfbaragrest = AV65TFBarAgrEst ;
      AV207Webwcnsprodds_17_tfbaragrest_sel = AV66TFBarAgrEst_Sel ;
      AV208Webwcnsprodds_18_tfbarser = AV68TFBarSer ;
      AV209Webwcnsprodds_19_tfbarser_sel = AV69TFBarSer_Sel ;
      AV210Webwcnsprodds_20_tfbarserdsc = AV71TFBarSerDsc ;
      AV211Webwcnsprodds_21_tfbarserdsc_sel = AV72TFBarSerDsc_Sel ;
      AV212Webwcnsprodds_22_tfbarfecgen = AV74TFBarFecGen ;
      AV213Webwcnsprodds_23_tfbarfecent = AV79TFBarFecEnt ;
      AV214Webwcnsprodds_24_tfbarcolnom = AV84TFBarColNom ;
      AV215Webwcnsprodds_25_tfbarcolnom_sel = AV85TFBarColNom_Sel ;
      AV216Webwcnsprodds_26_tfbarcolnum = AV87TFBarColNum ;
      AV217Webwcnsprodds_27_tfbarcolnum_to = AV88TFBarColNum_To ;
      AV218Webwcnsprodds_28_tfbarnomcli = AV90TFBarNomCli ;
      AV219Webwcnsprodds_29_tfbarnomcli_sel = AV91TFBarNomCli_Sel ;
      AV220Webwcnsprodds_30_tfbarnumcli = AV93TFBarNumCli ;
      AV221Webwcnsprodds_31_tfbarnumcli_to = AV94TFBarNumCli_To ;
      AV222Webwcnsprodds_32_tfbarkgm = AV96TFBarKgm ;
      AV223Webwcnsprodds_33_tfbarkgm_to = AV97TFBarKgm_To ;
      AV224Webwcnsprodds_34_tfbarmtr = AV99TFBarMtr ;
      AV225Webwcnsprodds_35_tfbarmtr_to = AV100TFBarMtr_To ;
      AV226Webwcnsprodds_36_tfbarpie = AV102TFBarPie ;
      AV227Webwcnsprodds_37_tfbarpie_to = AV103TFBarPie_To ;
      AV228Webwcnsprodds_38_tfbarsit = AV105TFBarSit ;
      AV229Webwcnsprodds_39_tfbarsit_to = AV106TFBarSit_To ;
      AV230Webwcnsprodds_40_tfbarfascod = AV125TFBarFasCod ;
      AV231Webwcnsprodds_41_tfbarfascod_sel = AV126TFBarFasCod_Sel ;
      AV232Webwcnsprodds_42_tfbarfassig = AV128TFBarFasSig ;
      AV233Webwcnsprodds_43_tfbarfassig_sel = AV129TFBarFasSig_Sel ;
      AV234Webwcnsprodds_44_tfbarpart = AV145TFBarPart ;
      AV235Webwcnsprodds_45_tfbarpart_to = AV146TFBarPart_To ;
      AV236Webwcnsprodds_46_tfbaritem3 = AV148TFBarItem3 ;
      AV237Webwcnsprodds_47_tfbaritem3_sel = AV149TFBarItem3_Sel ;
      AV238Webwcnsprodds_48_tfbarrdto4 = AV166TFBarRdto4 ;
      AV239Webwcnsprodds_49_tfbarrdto4_to = AV167TFBarRdto4_To ;
      AV240Webwcnsprodds_50_tfbargots = AV170TFBarGots ;
      AV241Webwcnsprodds_51_tfbargots_sel = AV171TFBarGots_Sel ;
      AV242Webwcnsprodds_52_tfbargrs = AV172TFBarGrs ;
      AV243Webwcnsprodds_53_tfbargrs_sel = AV173TFBarGrs_Sel ;
      AV244Webwcnsprodds_54_tfbarocs = AV174TFBarOcs ;
      AV245Webwcnsprodds_55_tfbarocs_sel = AV175TFBarOcs_Sel ;
      AV246Webwcnsprodds_56_tfbarrcs = AV176TFBarRcs ;
      AV247Webwcnsprodds_57_tfbarrcs_sel = AV177TFBarRcs_Sel ;
      AV248Webwcnsprodds_58_tfbaroeko = AV178TFBarOeko ;
      AV249Webwcnsprodds_59_tfbaroeko_sel = AV179TFBarOeko_Sel ;
      AV250Webwcnsprodds_60_tfbaraccesorios_sel = AV180TFBarAccesorios_Sel ;
      AV251Webwcnsprodds_61_tfbarmarca = AV181TFBarMarca ;
      AV252Webwcnsprodds_62_tfbarmarca_sel = AV182TFBarMarca_Sel ;
      AV253Webwcnsprodds_63_tfbar_maccod = AV183TFBar_MacCod ;
      AV254Webwcnsprodds_64_tfbar_maccod_to = AV184TFBar_MacCod_To ;
      AV255Webwcnsprodds_65_tfbarfascod2 = AV185TFBarFasCod2 ;
      AV256Webwcnsprodds_66_tfbarfascod2_sel = AV186TFBarFasCod2_Sel ;
      AV257Webwcnsprodds_67_tfbarfasdsc2 = AV187TFBarFasDsc2 ;
      AV258Webwcnsprodds_68_tfbarfasdsc2_sel = AV188TFBarFasDsc2_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ColumnsSelector", AV40ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43ManageFiltersData", AV43ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e12IU2( )
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
         AV51PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV51PageToGo) ;
      }
   }

   public void e13IU2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15IU2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV54OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54OrderedBy), 4, 0));
         AV55OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55OrderedDsc", AV55OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV59TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod), 6, 0));
            AV60TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV62TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFCliNom", AV62TFCliNom);
            AV63TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFCliNom_Sel", AV63TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV47TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFBarNHdr", AV47TFBarNHdr);
            AV48TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFBarNHdr_Sel", AV48TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrEst") == 0 )
         {
            AV65TFBarAgrEst = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFBarAgrEst", AV65TFBarAgrEst);
            AV66TFBarAgrEst_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFBarAgrEst_Sel", AV66TFBarAgrEst_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV68TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFBarSer", AV68TFBarSer);
            AV69TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFBarSer_Sel", AV69TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV71TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFBarSerDsc", AV71TFBarSerDsc);
            AV72TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFBarSerDsc_Sel", AV72TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecGen") == 0 )
         {
            AV74TFBarFecGen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFBarFecGen", localUtil.format(AV74TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecEnt") == 0 )
         {
            AV79TFBarFecEnt = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFBarFecEnt", localUtil.format(AV79TFBarFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV84TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFBarColNom", AV84TFBarColNom);
            AV85TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarColNom_Sel", AV85TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV87TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFBarColNum), 6, 0));
            AV88TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV90TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFBarNomCli", AV90TFBarNomCli);
            AV91TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarNomCli_Sel", AV91TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNumCli") == 0 )
         {
            AV93TFBarNumCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFBarNumCli), 6, 0));
            AV94TFBarNumCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFBarNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgm") == 0 )
         {
            AV96TFBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFBarKgm", GXutil.ltrimstr( AV96TFBarKgm, 9, 2));
            AV97TFBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFBarKgm_To", GXutil.ltrimstr( AV97TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtr") == 0 )
         {
            AV99TFBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFBarMtr", GXutil.ltrimstr( AV99TFBarMtr, 9, 2));
            AV100TFBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFBarMtr_To", GXutil.ltrimstr( AV100TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPie") == 0 )
         {
            AV102TFBarPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102TFBarPie), 6, 0));
            AV103TFBarPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103TFBarPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV105TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFBarSit), 2, 0));
            AV106TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasCod") == 0 )
         {
            AV125TFBarFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125TFBarFasCod", AV125TFBarFasCod);
            AV126TFBarFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFBarFasCod_Sel", AV126TFBarFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasSig") == 0 )
         {
            AV128TFBarFasSig = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128TFBarFasSig", AV128TFBarFasSig);
            AV129TFBarFasSig_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV129TFBarFasSig_Sel", AV129TFBarFasSig_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPart") == 0 )
         {
            AV145TFBarPart = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145TFBarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145TFBarPart), 4, 0));
            AV146TFBarPart_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146TFBarPart_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146TFBarPart_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarItem3") == 0 )
         {
            AV148TFBarItem3 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148TFBarItem3", AV148TFBarItem3);
            AV149TFBarItem3_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV149TFBarItem3_Sel", AV149TFBarItem3_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarRdto4") == 0 )
         {
            AV166TFBarRdto4 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV166TFBarRdto4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV166TFBarRdto4), 4, 0));
            AV167TFBarRdto4_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV167TFBarRdto4_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV167TFBarRdto4_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarGots") == 0 )
         {
            AV170TFBarGots = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV170TFBarGots", AV170TFBarGots);
            AV171TFBarGots_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV171TFBarGots_Sel", AV171TFBarGots_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarGrs") == 0 )
         {
            AV172TFBarGrs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV172TFBarGrs", AV172TFBarGrs);
            AV173TFBarGrs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV173TFBarGrs_Sel", AV173TFBarGrs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOcs") == 0 )
         {
            AV174TFBarOcs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV174TFBarOcs", AV174TFBarOcs);
            AV175TFBarOcs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV175TFBarOcs_Sel", AV175TFBarOcs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarRcs") == 0 )
         {
            AV176TFBarRcs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV176TFBarRcs", AV176TFBarRcs);
            AV177TFBarRcs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV177TFBarRcs_Sel", AV177TFBarRcs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOeko") == 0 )
         {
            AV178TFBarOeko = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV178TFBarOeko", AV178TFBarOeko);
            AV179TFBarOeko_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV179TFBarOeko_Sel", AV179TFBarOeko_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAccesorios") == 0 )
         {
            AV180TFBarAccesorios_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV180TFBarAccesorios_Sel", AV180TFBarAccesorios_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMarca") == 0 )
         {
            AV181TFBarMarca = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV181TFBarMarca", AV181TFBarMarca);
            AV182TFBarMarca_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV182TFBarMarca_Sel", AV182TFBarMarca_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Bar_MacCod") == 0 )
         {
            AV183TFBar_MacCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV183TFBar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV183TFBar_MacCod), 8, 0));
            AV184TFBar_MacCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV184TFBar_MacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV184TFBar_MacCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasCod2") == 0 )
         {
            AV185TFBarFasCod2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV185TFBarFasCod2", AV185TFBarFasCod2);
            AV186TFBarFasCod2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV186TFBarFasCod2_Sel", AV186TFBarFasCod2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasDsc2") == 0 )
         {
            AV187TFBarFasDsc2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV187TFBarFasDsc2", AV187TFBarFasDsc2);
            AV188TFBarFasDsc2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV188TFBarFasDsc2_Sel", AV188TFBarFasDsc2_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21IU2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV165DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV165DetailWebComponent);
         AV143BarMacCod = GXutil.lval( A3746BarNPed) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarmaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143BarMacCod), 10, 0));
         GXv_int8[0] = AV137Maccod ;
         new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
         webwcnsprod_impl.this.AV137Maccod = GXv_int8[0] ;
         AV138Accesorios = ((AV137Maccod>0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAccesorios_Internalname, AV138Accesorios);
         AV155BarEncCliGrid = ((GXutil.strcmp("", A143BarDisNum)==0) ? A4812BarEncCli : A143BarDisNum) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarenccligrid_Internalname, AV155BarEncCliGrid);
         AV139ObsEnc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavObsenc_Internalname, AV139ObsEnc);
         /* Using cursor H00IU28 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A377DisObsTxt = H00IU28_A377DisObsTxt[0] ;
            A376DisObsLin = H00IU28_A376DisObsLin[0] ;
            if ( GXutil.strcmp(AV139ObsEnc, " ") == 0 )
            {
               AV139ObsEnc = GXutil.trim( A377DisObsTxt) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavObsenc_Internalname, AV139ObsEnc);
            }
            else
            {
               AV139ObsEnc += " " + GXutil.trim( A377DisObsTxt) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavObsenc_Internalname, AV139ObsEnc);
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         GXt_char1 = AV130FasDscUlt ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A151BarFasCod, GXv_char4) ;
         webwcnsprod_impl.this.GXt_char1 = GXv_char4[0] ;
         AV130FasDscUlt = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFasdscult_Internalname, AV130FasDscUlt);
         GXt_char1 = AV131FasDscSig ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1955BarFasSig, GXv_char4) ;
         webwcnsprod_impl.this.GXt_char1 = GXv_char4[0] ;
         AV131FasDscSig = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFasdscsig_Internalname, AV131FasDscSig);
         /* Using cursor H00IU29 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A34AlbProfch = H00IU29_A34AlbProfch[0] ;
            A1261BarAlbKgmE = H00IU29_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = H00IU29_A1263BarAlbMtrE[0] ;
            A1265BarAlbPie = H00IU29_A1265BarAlbPie[0] ;
            A30AlbProCod = H00IU29_A30AlbProCod[0] ;
            A34AlbProfch = H00IU29_A34AlbProfch[0] ;
            AV132AlbProcod = A30AlbProCod ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAlbprocod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132AlbProcod), 10, 0));
            AV133AlbProFec = A34AlbProfch ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAlbprofec_Internalname, localUtil.format(AV133AlbProFec, "99/99/99"));
            AV134BarAlbKgmE = AV134BarAlbKgmE.add(A1261BarAlbKgmE) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBaralbkgme_Internalname, GXutil.ltrimstr( AV134BarAlbKgmE, 9, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBKGME"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV134BarAlbKgmE, "ZZZZZ9.99")));
            AV135BarAlbMtrE = AV135BarAlbMtrE.add(A1263BarAlbMtrE) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBaralbmtre_Internalname, GXutil.ltrimstr( AV135BarAlbMtrE, 9, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBMTRE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( AV135BarAlbMtrE, "ZZZZZ9.99")));
            AV136BarAlbPie = (int)(AV136BarAlbPie+A1265BarAlbPie) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBaralbpie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136BarAlbPie), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBPIE"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( DecimalUtil.doubleToDec(AV136BarAlbPie), "ZZZZZ9")));
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor H00IU30 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1261BarAlbKgmE = H00IU30_A1261BarAlbKgmE[0] ;
            A34AlbProfch = H00IU30_A34AlbProfch[0] ;
            A30AlbProCod = H00IU30_A30AlbProCod[0] ;
            A34AlbProfch = H00IU30_A34AlbProfch[0] ;
            AV133AlbProFec = A34AlbProfch ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAlbprofec_Internalname, localUtil.format(AV133AlbProFec, "99/99/99"));
            pr_default.readNext(4);
         }
         pr_default.close(4);
         AV141Exportacion = ((GXutil.strcmp(GXutil.trim( A11852Nxt_ArtCl2), httpContext.getMessage( "Sem Definir", ""))==0) ? " " : A11852Nxt_ArtCl2) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavExportacion_Internalname, AV141Exportacion);
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int9[0] = A4466BarAcaAnh ;
         GXv_char3[0] = AV140Tb1_dscfb ;
         new app.pptable2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3) ;
         webwcnsprod_impl.this.A396EmprCod = GXv_char4[0] ;
         webwcnsprod_impl.this.A252CliCod = GXv_int8[0] ;
         webwcnsprod_impl.this.A4466BarAcaAnh = GXv_int9[0] ;
         webwcnsprod_impl.this.AV140Tb1_dscfb = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV140Tb1_dscfb", AV140Tb1_dscfb);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTB1_DSCFB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV140Tb1_dscfb, ""))));
         AV142Marca = GXutil.substring( AV140Tb1_dscfb, 1, 20) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMarca_Internalname, AV142Marca);
         GXt_int10 = AV164ForRGB ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_char2[0] = A135BarColNom ;
         GXv_int11[0] = A136BarColNum ;
         GXv_int12[0] = A218BarTipCol ;
         GXv_int13[0] = GXt_int10 ;
         new app.pbusrgb(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_int11, GXv_int12, GXv_int13) ;
         webwcnsprod_impl.this.A396EmprCod = GXv_char4[0] ;
         webwcnsprod_impl.this.A252CliCod = GXv_int8[0] ;
         webwcnsprod_impl.this.A212BarSer = GXv_char3[0] ;
         webwcnsprod_impl.this.A135BarColNom = GXv_char2[0] ;
         webwcnsprod_impl.this.A136BarColNum = GXv_int11[0] ;
         webwcnsprod_impl.this.A218BarTipCol = GXv_int12[0] ;
         webwcnsprod_impl.this.GXt_int10 = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         AV164ForRGB = GXt_int10 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164ForRGB), 10, 0));
         GXv_int9[0] = AV162R ;
         GXv_int14[0] = AV160G ;
         GXv_int15[0] = AV158B ;
         GXv_int16[0] = AV163R2 ;
         GXv_int17[0] = AV161G2 ;
         GXv_int18[0] = AV159B2 ;
         new app.backcolorforecolor(remoteHandle, context).execute( AV164ForRGB, GXv_int9, GXv_int14, GXv_int15, GXv_int16, GXv_int17, GXv_int18) ;
         webwcnsprod_impl.this.AV162R = GXv_int9[0] ;
         webwcnsprod_impl.this.AV160G = GXv_int14[0] ;
         webwcnsprod_impl.this.AV158B = GXv_int15[0] ;
         webwcnsprod_impl.this.AV163R2 = GXv_int16[0] ;
         webwcnsprod_impl.this.AV161G2 = GXv_int17[0] ;
         webwcnsprod_impl.this.AV159B2 = GXv_int18[0] ;
         edtBarNomCli_Backcolor = GXutil.getColor( AV162R, AV160G, AV158B) ;
         edtBarNomCli_Forecolor = GXutil.getColor( AV163R2, AV161G2, AV159B2) ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(71) ;
         }
         sendrow_712( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_71_Refreshing )
      {
         httpContext.doAjaxLoad(71, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e16IU2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV38ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV40ColumnsSelector.fromJSonString(AV38ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebWCnsProdColumnsSelector", ((GXutil.strcmp("", AV38ColumnsSelectorXML)==0) ? "" : AV40ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ColumnsSelector", AV40ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43ManageFiltersData", AV43ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e11IU2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWCnsProdFilters")),GXutil.URLEncode(GXutil.rtrim(AV262Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV45ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ManageFiltersExecutionStep", GXutil.str( AV45ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWCnsProdFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV45ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ManageFiltersExecutionStep", GXutil.str( AV45ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV44ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebWCnsProdFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webwcnsprod_impl.this.GXt_char1 = GXv_char4[0] ;
         AV44ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV44ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV262Pgmname+"GridState", AV44ManageFiltersXml) ;
            AV14GridState.fromxml(AV44ManageFiltersXml, null, null);
            AV54OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54OrderedBy), 4, 0));
            AV55OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55OrderedDsc", AV55OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ColumnsSelector", AV40ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43ManageFiltersData", AV43ManageFiltersData);
   }

   public void e17IU2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV36ExcelFilename ;
      GXv_char3[0] = AV37ErrorMessage ;
      new app.webwcnsprodexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      webwcnsprod_impl.this.AV36ExcelFilename = GXv_char4[0] ;
      webwcnsprod_impl.this.AV37ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV36ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV36ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV37ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e18IU2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webwcnsprodexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e14IU2( )
   {
      /* Barfecgen_rangepicker_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113BarFecGen", localUtil.format(AV113BarFecGen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV114BarFecGen_To", localUtil.format(AV114BarFecGen_To, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV157BarNHdr, AV118CliNom, AV57BarEncCli, AV152BarSer, AV154BarColNom, AV115BarSit, AV116BarSit_To, AV113BarFecGen, AV45ManageFiltersExecutionStep, AV40ColumnsSelector, AV114BarFecGen_To, AV59TFCliCod, AV60TFCliCod_To, AV62TFCliNom, AV63TFCliNom_Sel, AV47TFBarNHdr, AV48TFBarNHdr_Sel, AV65TFBarAgrEst, AV66TFBarAgrEst_Sel, AV68TFBarSer, AV69TFBarSer_Sel, AV71TFBarSerDsc, AV72TFBarSerDsc_Sel, AV74TFBarFecGen, AV79TFBarFecEnt, AV84TFBarColNom, AV85TFBarColNom_Sel, AV87TFBarColNum, AV88TFBarColNum_To, AV90TFBarNomCli, AV91TFBarNomCli_Sel, AV93TFBarNumCli, AV94TFBarNumCli_To, AV96TFBarKgm, AV97TFBarKgm_To, AV99TFBarMtr, AV100TFBarMtr_To, AV102TFBarPie, AV103TFBarPie_To, AV105TFBarSit, AV106TFBarSit_To, AV125TFBarFasCod, AV126TFBarFasCod_Sel, AV128TFBarFasSig, AV129TFBarFasSig_Sel, AV145TFBarPart, AV146TFBarPart_To, AV148TFBarItem3, AV149TFBarItem3_Sel, AV166TFBarRdto4, AV167TFBarRdto4_To, AV170TFBarGots, AV171TFBarGots_Sel, AV172TFBarGrs, AV173TFBarGrs_Sel, AV174TFBarOcs, AV175TFBarOcs_Sel, AV176TFBarRcs, AV177TFBarRcs_Sel, AV178TFBarOeko, AV179TFBarOeko_Sel, AV180TFBarAccesorios_Sel, AV181TFBarMarca, AV182TFBarMarca_Sel, AV183TFBar_MacCod, AV184TFBar_MacCod_To, AV185TFBarFasCod2, AV186TFBarFasCod2_Sel, AV187TFBarFasDsc2, AV188TFBarFasDsc2_Sel, AV262Pgmname, AV54OrderedBy, AV55OrderedDsc, A376DisObsLin, A377DisObsTxt, A30AlbProCod, A1261BarAlbKgmE, A34AlbProfch, AV134BarAlbKgmE, AV135BarAlbMtrE, A1263BarAlbMtrE, AV136BarAlbPie, A1265BarAlbPie, AV140Tb1_dscfb, A396EmprCod) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ColumnsSelector", AV40ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43ManageFiltersData", AV43ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV54OrderedBy, 4, 0))+":"+(AV55OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV40ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "CliCod", "", "Cliente", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "CliNom", "", "Nombre Cliente", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarNHdr", "", "N° Hdr", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&BarMacCod", "", "Nº Lote", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&Accesorios", "", "Acc?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarAgrEst", "", "S=Bar.Agrupada N=No Agrupada", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&BarEncCliGrid", "", "Disp Cliente", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarSer", "", "Serie", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarFecGen", "", "Fecha Hdr", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarFecEnt", "", "Fecha Prev Ent", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&ObsEnc", "", "Obs", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarColNom", "", "Nombre Color", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarColNum", "", "Numero del Color", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarNumCli", "", "Numero ", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarKgm", "", "Kilos", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarMtr", "", "Metros", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarPie", "", "Piezas", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarSit", "", "St", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarFasCod", "", "Ult fase", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&FasDscUlt", "", "Descripcion ", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarFasSig", "", "Sig Fase", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&FasDscSig", "", "Descripcion ", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&AlbProcod", "", "Nº Doc", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&AlbProFec", "", "Fecha", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&BarAlbKgmE", "", "Kilos Sal", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&BarAlbMtrE", "", "Metros Sal", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&BarAlbPie", "", "Piezas Sal", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&Exportacion", "", "Exportacion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&Marca", "", "Marca", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarPart", "", "Nº Partida", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarItem3", "", "N Enc Cli", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarRdto4", "", "4 decimales", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarGots", "", "Gots", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarGrs", "", "Grs", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarOcs", "", "Ocs", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarRcs", "", "Rcs", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarOeko", "", "Oeko", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarAccesorios", "", "Acc?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarMarca", "", "Marca", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "Bar_MacCod", "", "Macro", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarFasCod2", "", "Fase Ult", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarFasDsc2", "", "Desc Fase", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXt_char1 = AV39UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWCnsProdColumnsSelector", GXv_char4) ;
      webwcnsprod_impl.this.GXt_char1 = GXv_char4[0] ;
      AV39UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV39UserCustomValue)==0) ) )
      {
         AV41ColumnsSelectorAux.fromxml(AV39UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector19[0] = AV41ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector20[0] = AV40ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, GXv_SdtWWPColumnsSelector20) ;
         AV41ColumnsSelectorAux = GXv_SdtWWPColumnsSelector19[0] ;
         AV40ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 = AV43ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item22[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebWCnsProdFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item22) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item22[0] ;
      AV43ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV157BarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV157BarNHdr", AV157BarNHdr);
      AV118CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118CliNom", AV118CliNom);
      AV113BarFecGen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113BarFecGen", localUtil.format(AV113BarFecGen, "99/99/99"));
      AV114BarFecGen_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114BarFecGen_To", localUtil.format(AV114BarFecGen_To, "99/99/99"));
      AV57BarEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57BarEncCli", AV57BarEncCli);
      AV152BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152BarSer", AV152BarSer);
      AV154BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV154BarColNom", AV154BarColNom);
      AV115BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115BarSit), 2, 0));
      AV116BarSit_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116BarSit_To), 2, 0));
      AV59TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod), 6, 0));
      AV60TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFCliCod_To), 6, 0));
      AV62TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFCliNom", AV62TFCliNom);
      AV63TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFCliNom_Sel", AV63TFCliNom_Sel);
      AV47TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFBarNHdr", AV47TFBarNHdr);
      AV48TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFBarNHdr_Sel", AV48TFBarNHdr_Sel);
      AV65TFBarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFBarAgrEst", AV65TFBarAgrEst);
      AV66TFBarAgrEst_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFBarAgrEst_Sel", AV66TFBarAgrEst_Sel);
      AV68TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFBarSer", AV68TFBarSer);
      AV69TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFBarSer_Sel", AV69TFBarSer_Sel);
      AV71TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFBarSerDsc", AV71TFBarSerDsc);
      AV72TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFBarSerDsc_Sel", AV72TFBarSerDsc_Sel);
      AV74TFBarFecGen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFBarFecGen", localUtil.format(AV74TFBarFecGen, "99/99/99"));
      AV79TFBarFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFBarFecEnt", localUtil.format(AV79TFBarFecEnt, "99/99/99"));
      AV84TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84TFBarColNom", AV84TFBarColNom);
      AV85TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarColNom_Sel", AV85TFBarColNom_Sel);
      AV87TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFBarColNum), 6, 0));
      AV88TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFBarColNum_To), 6, 0));
      AV90TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFBarNomCli", AV90TFBarNomCli);
      AV91TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarNomCli_Sel", AV91TFBarNomCli_Sel);
      AV93TFBarNumCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFBarNumCli), 6, 0));
      AV94TFBarNumCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFBarNumCli_To), 6, 0));
      AV96TFBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96TFBarKgm", GXutil.ltrimstr( AV96TFBarKgm, 9, 2));
      AV97TFBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97TFBarKgm_To", GXutil.ltrimstr( AV97TFBarKgm_To, 9, 2));
      AV99TFBarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99TFBarMtr", GXutil.ltrimstr( AV99TFBarMtr, 9, 2));
      AV100TFBarMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TFBarMtr_To", GXutil.ltrimstr( AV100TFBarMtr_To, 9, 2));
      AV102TFBarPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102TFBarPie), 6, 0));
      AV103TFBarPie_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103TFBarPie_To), 6, 0));
      AV105TFBarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFBarSit), 2, 0));
      AV106TFBarSit_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106TFBarSit_To), 2, 0));
      AV125TFBarFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125TFBarFasCod", AV125TFBarFasCod);
      AV126TFBarFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126TFBarFasCod_Sel", AV126TFBarFasCod_Sel);
      AV128TFBarFasSig = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV128TFBarFasSig", AV128TFBarFasSig);
      AV129TFBarFasSig_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129TFBarFasSig_Sel", AV129TFBarFasSig_Sel);
      AV145TFBarPart = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV145TFBarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145TFBarPart), 4, 0));
      AV146TFBarPart_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV146TFBarPart_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146TFBarPart_To), 4, 0));
      AV148TFBarItem3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV148TFBarItem3", AV148TFBarItem3);
      AV149TFBarItem3_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV149TFBarItem3_Sel", AV149TFBarItem3_Sel);
      AV166TFBarRdto4 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV166TFBarRdto4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV166TFBarRdto4), 4, 0));
      AV167TFBarRdto4_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV167TFBarRdto4_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV167TFBarRdto4_To), 4, 0));
      AV170TFBarGots = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170TFBarGots", AV170TFBarGots);
      AV171TFBarGots_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV171TFBarGots_Sel", AV171TFBarGots_Sel);
      AV172TFBarGrs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV172TFBarGrs", AV172TFBarGrs);
      AV173TFBarGrs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV173TFBarGrs_Sel", AV173TFBarGrs_Sel);
      AV174TFBarOcs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV174TFBarOcs", AV174TFBarOcs);
      AV175TFBarOcs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV175TFBarOcs_Sel", AV175TFBarOcs_Sel);
      AV176TFBarRcs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV176TFBarRcs", AV176TFBarRcs);
      AV177TFBarRcs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV177TFBarRcs_Sel", AV177TFBarRcs_Sel);
      AV178TFBarOeko = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV178TFBarOeko", AV178TFBarOeko);
      AV179TFBarOeko_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV179TFBarOeko_Sel", AV179TFBarOeko_Sel);
      AV180TFBarAccesorios_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV180TFBarAccesorios_Sel", AV180TFBarAccesorios_Sel);
      AV181TFBarMarca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV181TFBarMarca", AV181TFBarMarca);
      AV182TFBarMarca_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV182TFBarMarca_Sel", AV182TFBarMarca_Sel);
      AV183TFBar_MacCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV183TFBar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV183TFBar_MacCod), 8, 0));
      AV184TFBar_MacCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV184TFBar_MacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV184TFBar_MacCod_To), 8, 0));
      AV185TFBarFasCod2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV185TFBarFasCod2", AV185TFBarFasCod2);
      AV186TFBarFasCod2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV186TFBarFasCod2_Sel", AV186TFBarFasCod2_Sel);
      AV187TFBarFasDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV187TFBarFasDsc2", AV187TFBarFasDsc2);
      AV188TFBarFasDsc2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV188TFBarFasDsc2_Sel", AV188TFBarFasDsc2_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV42Session.getValue(AV262Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV262Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV42Session.getValue(AV262Pgmname+"GridState"), null, null);
      }
      AV54OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54OrderedBy), 4, 0));
      AV55OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55OrderedDsc", AV55OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV263GXV1 = 1 ;
      while ( AV263GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV263GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARNHDR") == 0 )
         {
            AV157BarNHdr = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV157BarNHdr", AV157BarNHdr);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLINOM") == 0 )
         {
            AV118CliNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118CliNom", AV118CliNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARFECGEN") == 0 )
         {
            AV113BarFecGen = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113BarFecGen", localUtil.format(AV113BarFecGen, "99/99/99"));
            AV114BarFecGen_To = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114BarFecGen_To", localUtil.format(AV114BarFecGen_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARENCCLI") == 0 )
         {
            AV57BarEncCli = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57BarEncCli", AV57BarEncCli);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSER") == 0 )
         {
            AV152BarSer = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV152BarSer", AV152BarSer);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNOM") == 0 )
         {
            AV154BarColNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV154BarColNom", AV154BarColNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSIT") == 0 )
         {
            AV115BarSit = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115BarSit), 2, 0));
            AV116BarSit_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116BarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV59TFCliCod = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod), 6, 0));
            AV60TFCliCod_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV62TFCliNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFCliNom", AV62TFCliNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV63TFCliNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFCliNom_Sel", AV63TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV47TFBarNHdr = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFBarNHdr", AV47TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV48TFBarNHdr_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFBarNHdr_Sel", AV48TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV65TFBarAgrEst = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFBarAgrEst", AV65TFBarAgrEst);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV66TFBarAgrEst_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFBarAgrEst_Sel", AV66TFBarAgrEst_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV68TFBarSer = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFBarSer", AV68TFBarSer);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV69TFBarSer_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFBarSer_Sel", AV69TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV71TFBarSerDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFBarSerDsc", AV71TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV72TFBarSerDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFBarSerDsc_Sel", AV72TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV74TFBarFecGen = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFBarFecGen", localUtil.format(AV74TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECENT") == 0 )
         {
            AV79TFBarFecEnt = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFBarFecEnt", localUtil.format(AV79TFBarFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV84TFBarColNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFBarColNom", AV84TFBarColNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV85TFBarColNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarColNom_Sel", AV85TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV87TFBarColNum = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFBarColNum), 6, 0));
            AV88TFBarColNum_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV90TFBarNomCli = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFBarNomCli", AV90TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV91TFBarNomCli_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarNomCli_Sel", AV91TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV93TFBarNumCli = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFBarNumCli), 6, 0));
            AV94TFBarNumCli_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFBarNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV96TFBarKgm = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFBarKgm", GXutil.ltrimstr( AV96TFBarKgm, 9, 2));
            AV97TFBarKgm_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFBarKgm_To", GXutil.ltrimstr( AV97TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV99TFBarMtr = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFBarMtr", GXutil.ltrimstr( AV99TFBarMtr, 9, 2));
            AV100TFBarMtr_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFBarMtr_To", GXutil.ltrimstr( AV100TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV102TFBarPie = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102TFBarPie), 6, 0));
            AV103TFBarPie_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103TFBarPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV105TFBarSit = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFBarSit), 2, 0));
            AV106TFBarSit_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV125TFBarFasCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125TFBarFasCod", AV125TFBarFasCod);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV126TFBarFasCod_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFBarFasCod_Sel", AV126TFBarFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV128TFBarFasSig = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128TFBarFasSig", AV128TFBarFasSig);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV129TFBarFasSig_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV129TFBarFasSig_Sel", AV129TFBarFasSig_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPART") == 0 )
         {
            AV145TFBarPart = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145TFBarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145TFBarPart), 4, 0));
            AV146TFBarPart_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146TFBarPart_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146TFBarPart_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARITEM3") == 0 )
         {
            AV148TFBarItem3 = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148TFBarItem3", AV148TFBarItem3);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARITEM3_SEL") == 0 )
         {
            AV149TFBarItem3_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV149TFBarItem3_Sel", AV149TFBarItem3_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRDTO4") == 0 )
         {
            AV166TFBarRdto4 = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV166TFBarRdto4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV166TFBarRdto4), 4, 0));
            AV167TFBarRdto4_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV167TFBarRdto4_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV167TFBarRdto4_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS") == 0 )
         {
            AV170TFBarGots = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV170TFBarGots", AV170TFBarGots);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS_SEL") == 0 )
         {
            AV171TFBarGots_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV171TFBarGots_Sel", AV171TFBarGots_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS") == 0 )
         {
            AV172TFBarGrs = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV172TFBarGrs", AV172TFBarGrs);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS_SEL") == 0 )
         {
            AV173TFBarGrs_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV173TFBarGrs_Sel", AV173TFBarGrs_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS") == 0 )
         {
            AV174TFBarOcs = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV174TFBarOcs", AV174TFBarOcs);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS_SEL") == 0 )
         {
            AV175TFBarOcs_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV175TFBarOcs_Sel", AV175TFBarOcs_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS") == 0 )
         {
            AV176TFBarRcs = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV176TFBarRcs", AV176TFBarRcs);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS_SEL") == 0 )
         {
            AV177TFBarRcs_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV177TFBarRcs_Sel", AV177TFBarRcs_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO") == 0 )
         {
            AV178TFBarOeko = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV178TFBarOeko", AV178TFBarOeko);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO_SEL") == 0 )
         {
            AV179TFBarOeko_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV179TFBarOeko_Sel", AV179TFBarOeko_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACCESORIOS_SEL") == 0 )
         {
            AV180TFBarAccesorios_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV180TFBarAccesorios_Sel", AV180TFBarAccesorios_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA") == 0 )
         {
            AV181TFBarMarca = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV181TFBarMarca", AV181TFBarMarca);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA_SEL") == 0 )
         {
            AV182TFBarMarca_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV182TFBarMarca_Sel", AV182TFBarMarca_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAR_MACCOD") == 0 )
         {
            AV183TFBar_MacCod = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV183TFBar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV183TFBar_MacCod), 8, 0));
            AV184TFBar_MacCod_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV184TFBar_MacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV184TFBar_MacCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2") == 0 )
         {
            AV185TFBarFasCod2 = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV185TFBarFasCod2", AV185TFBarFasCod2);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2_SEL") == 0 )
         {
            AV186TFBarFasCod2_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV186TFBarFasCod2_Sel", AV186TFBarFasCod2_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2") == 0 )
         {
            AV187TFBarFasDsc2 = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV187TFBarFasDsc2", AV187TFBarFasDsc2);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2_SEL") == 0 )
         {
            AV188TFBarFasDsc2_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV188TFBarFasDsc2_Sel", AV188TFBarFasDsc2_Sel);
         }
         AV263GXV1 = (int)(AV263GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFCliNom_Sel)==0), AV63TFCliNom_Sel, GXv_char4) ;
      webwcnsprod_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char23 = "" ;
      GXv_char3[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFBarNHdr_Sel)==0), AV48TFBarNHdr_Sel, GXv_char3) ;
      webwcnsprod_impl.this.GXt_char23 = GXv_char3[0] ;
      GXt_char24 = "" ;
      GXv_char2[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFBarAgrEst_Sel)==0), AV66TFBarAgrEst_Sel, GXv_char2) ;
      webwcnsprod_impl.this.GXt_char24 = GXv_char2[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFBarSer_Sel)==0), AV69TFBarSer_Sel, GXv_char26) ;
      webwcnsprod_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFBarSerDsc_Sel)==0), AV72TFBarSerDsc_Sel, GXv_char28) ;
      webwcnsprod_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV85TFBarColNom_Sel)==0), AV85TFBarColNom_Sel, GXv_char30) ;
      webwcnsprod_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV91TFBarNomCli_Sel)==0), AV91TFBarNomCli_Sel, GXv_char32) ;
      webwcnsprod_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV126TFBarFasCod_Sel)==0), AV126TFBarFasCod_Sel, GXv_char34) ;
      webwcnsprod_impl.this.GXt_char33 = GXv_char34[0] ;
      GXt_char35 = "" ;
      GXv_char36[0] = GXt_char35 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV129TFBarFasSig_Sel)==0), AV129TFBarFasSig_Sel, GXv_char36) ;
      webwcnsprod_impl.this.GXt_char35 = GXv_char36[0] ;
      GXt_char37 = "" ;
      GXv_char38[0] = GXt_char37 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV149TFBarItem3_Sel)==0), AV149TFBarItem3_Sel, GXv_char38) ;
      webwcnsprod_impl.this.GXt_char37 = GXv_char38[0] ;
      GXt_char39 = "" ;
      GXv_char40[0] = GXt_char39 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV171TFBarGots_Sel)==0), AV171TFBarGots_Sel, GXv_char40) ;
      webwcnsprod_impl.this.GXt_char39 = GXv_char40[0] ;
      GXt_char41 = "" ;
      GXv_char42[0] = GXt_char41 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV173TFBarGrs_Sel)==0), AV173TFBarGrs_Sel, GXv_char42) ;
      webwcnsprod_impl.this.GXt_char41 = GXv_char42[0] ;
      GXt_char43 = "" ;
      GXv_char44[0] = GXt_char43 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV175TFBarOcs_Sel)==0), AV175TFBarOcs_Sel, GXv_char44) ;
      webwcnsprod_impl.this.GXt_char43 = GXv_char44[0] ;
      GXt_char45 = "" ;
      GXv_char46[0] = GXt_char45 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV177TFBarRcs_Sel)==0), AV177TFBarRcs_Sel, GXv_char46) ;
      webwcnsprod_impl.this.GXt_char45 = GXv_char46[0] ;
      GXt_char47 = "" ;
      GXv_char48[0] = GXt_char47 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV179TFBarOeko_Sel)==0), AV179TFBarOeko_Sel, GXv_char48) ;
      webwcnsprod_impl.this.GXt_char47 = GXv_char48[0] ;
      GXt_char49 = "" ;
      GXv_char50[0] = GXt_char49 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV180TFBarAccesorios_Sel)==0), AV180TFBarAccesorios_Sel, GXv_char50) ;
      webwcnsprod_impl.this.GXt_char49 = GXv_char50[0] ;
      GXt_char51 = "" ;
      GXv_char52[0] = GXt_char51 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV182TFBarMarca_Sel)==0), AV182TFBarMarca_Sel, GXv_char52) ;
      webwcnsprod_impl.this.GXt_char51 = GXv_char52[0] ;
      GXt_char53 = "" ;
      GXv_char54[0] = GXt_char53 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV186TFBarFasCod2_Sel)==0), AV186TFBarFasCod2_Sel, GXv_char54) ;
      webwcnsprod_impl.this.GXt_char53 = GXv_char54[0] ;
      GXt_char55 = "" ;
      GXv_char56[0] = GXt_char55 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV188TFBarFasDsc2_Sel)==0), AV188TFBarFasDsc2_Sel, GXv_char56) ;
      webwcnsprod_impl.this.GXt_char55 = GXv_char56[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char23+"|||"+GXt_char24+"||"+GXt_char25+"|"+GXt_char27+"||||"+GXt_char29+"||"+GXt_char31+"||||||"+GXt_char33+"||"+GXt_char35+"||||||||||"+GXt_char37+"||"+GXt_char39+"|"+GXt_char41+"|"+GXt_char43+"|"+GXt_char45+"|"+GXt_char47+"|"+GXt_char49+"|"+GXt_char51+"||"+GXt_char53+"|"+GXt_char55 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char55 = "" ;
      GXv_char56[0] = GXt_char55 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFCliNom)==0), AV62TFCliNom, GXv_char56) ;
      webwcnsprod_impl.this.GXt_char55 = GXv_char56[0] ;
      GXt_char53 = "" ;
      GXv_char54[0] = GXt_char53 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFBarNHdr)==0), AV47TFBarNHdr, GXv_char54) ;
      webwcnsprod_impl.this.GXt_char53 = GXv_char54[0] ;
      GXt_char51 = "" ;
      GXv_char52[0] = GXt_char51 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFBarAgrEst)==0), AV65TFBarAgrEst, GXv_char52) ;
      webwcnsprod_impl.this.GXt_char51 = GXv_char52[0] ;
      GXt_char49 = "" ;
      GXv_char50[0] = GXt_char49 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFBarSer)==0), AV68TFBarSer, GXv_char50) ;
      webwcnsprod_impl.this.GXt_char49 = GXv_char50[0] ;
      GXt_char47 = "" ;
      GXv_char48[0] = GXt_char47 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFBarSerDsc)==0), AV71TFBarSerDsc, GXv_char48) ;
      webwcnsprod_impl.this.GXt_char47 = GXv_char48[0] ;
      GXt_char45 = "" ;
      GXv_char46[0] = GXt_char45 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFBarColNom)==0), AV84TFBarColNom, GXv_char46) ;
      webwcnsprod_impl.this.GXt_char45 = GXv_char46[0] ;
      GXt_char43 = "" ;
      GXv_char44[0] = GXt_char43 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFBarNomCli)==0), AV90TFBarNomCli, GXv_char44) ;
      webwcnsprod_impl.this.GXt_char43 = GXv_char44[0] ;
      GXt_char41 = "" ;
      GXv_char42[0] = GXt_char41 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV125TFBarFasCod)==0), AV125TFBarFasCod, GXv_char42) ;
      webwcnsprod_impl.this.GXt_char41 = GXv_char42[0] ;
      GXt_char39 = "" ;
      GXv_char40[0] = GXt_char39 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV128TFBarFasSig)==0), AV128TFBarFasSig, GXv_char40) ;
      webwcnsprod_impl.this.GXt_char39 = GXv_char40[0] ;
      GXt_char37 = "" ;
      GXv_char38[0] = GXt_char37 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV148TFBarItem3)==0), AV148TFBarItem3, GXv_char38) ;
      webwcnsprod_impl.this.GXt_char37 = GXv_char38[0] ;
      GXt_char35 = "" ;
      GXv_char36[0] = GXt_char35 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV170TFBarGots)==0), AV170TFBarGots, GXv_char36) ;
      webwcnsprod_impl.this.GXt_char35 = GXv_char36[0] ;
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV172TFBarGrs)==0), AV172TFBarGrs, GXv_char34) ;
      webwcnsprod_impl.this.GXt_char33 = GXv_char34[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV174TFBarOcs)==0), AV174TFBarOcs, GXv_char32) ;
      webwcnsprod_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV176TFBarRcs)==0), AV176TFBarRcs, GXv_char30) ;
      webwcnsprod_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV178TFBarOeko)==0), AV178TFBarOeko, GXv_char28) ;
      webwcnsprod_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV181TFBarMarca)==0), AV181TFBarMarca, GXv_char26) ;
      webwcnsprod_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char24 = "" ;
      GXv_char4[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV185TFBarFasCod2)==0), AV185TFBarFasCod2, GXv_char4) ;
      webwcnsprod_impl.this.GXt_char24 = GXv_char4[0] ;
      GXt_char23 = "" ;
      GXv_char3[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV187TFBarFasDsc2)==0), AV187TFBarFasDsc2, GXv_char3) ;
      webwcnsprod_impl.this.GXt_char23 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV59TFCliCod) ? "" : GXutil.str( AV59TFCliCod, 6, 0))+"|"+GXt_char55+"|"+GXt_char53+"|||"+GXt_char51+"||"+GXt_char49+"|"+GXt_char47+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74TFBarFecGen)) ? "" : localUtil.dtoc( AV74TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79TFBarFecEnt)) ? "" : localUtil.dtoc( AV79TFBarFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+GXt_char45+"|"+((0==AV87TFBarColNum) ? "" : GXutil.str( AV87TFBarColNum, 6, 0))+"|"+GXt_char43+"|"+((0==AV93TFBarNumCli) ? "" : GXutil.str( AV93TFBarNumCli, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV96TFBarKgm)==0) ? "" : GXutil.str( AV96TFBarKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFBarMtr)==0) ? "" : GXutil.str( AV99TFBarMtr, 9, 2))+"|"+((0==AV102TFBarPie) ? "" : GXutil.str( AV102TFBarPie, 6, 0))+"|"+((0==AV105TFBarSit) ? "" : GXutil.str( AV105TFBarSit, 2, 0))+"|"+GXt_char41+"||"+GXt_char39+"|||||||||"+((0==AV145TFBarPart) ? "" : GXutil.str( AV145TFBarPart, 4, 0))+"|"+GXt_char37+"|"+((0==AV166TFBarRdto4) ? "" : GXutil.str( AV166TFBarRdto4, 4, 0))+"|"+GXt_char35+"|"+GXt_char33+"|"+GXt_char31+"|"+GXt_char29+"|"+GXt_char27+"||"+GXt_char25+"|"+((0==AV183TFBar_MacCod) ? "" : GXutil.str( AV183TFBar_MacCod, 8, 0))+"|"+GXt_char24+"|"+GXt_char23 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV60TFCliCod_To) ? "" : GXutil.str( AV60TFCliCod_To, 6, 0))+"|||||||||||||"+((0==AV88TFBarColNum_To) ? "" : GXutil.str( AV88TFBarColNum_To, 6, 0))+"||"+((0==AV94TFBarNumCli_To) ? "" : GXutil.str( AV94TFBarNumCli_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFBarKgm_To)==0) ? "" : GXutil.str( AV97TFBarKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV100TFBarMtr_To)==0) ? "" : GXutil.str( AV100TFBarMtr_To, 9, 2))+"|"+((0==AV103TFBarPie_To) ? "" : GXutil.str( AV103TFBarPie_To, 6, 0))+"|"+((0==AV106TFBarSit_To) ? "" : GXutil.str( AV106TFBarSit_To, 2, 0))+"||||||||||||"+((0==AV146TFBarPart_To) ? "" : GXutil.str( AV146TFBarPart_To, 4, 0))+"||"+((0==AV167TFBarRdto4_To) ? "" : GXutil.str( AV167TFBarRdto4_To, 4, 0))+"||||||||"+((0==AV184TFBar_MacCod_To) ? "" : GXutil.str( AV184TFBar_MacCod_To, 8, 0))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV42Session.getValue(AV262Pgmname+"GridState"), null, null);
      AV14GridState.setgxTv_SdtWWPGridState_Orderedby( AV54OrderedBy );
      AV14GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV55OrderedDsc );
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "BARNHDR", "", !(GXutil.strcmp("", AV157BarNHdr)==0), (short)(0), AV157BarNHdr, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "CLINOM", "", !(GXutil.strcmp("", AV118CliNom)==0), (short)(0), AV118CliNom, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "BARFECGEN", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113BarFecGen))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114BarFecGen_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV113BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV114BarFecGen_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "BARENCCLI", "", !(GXutil.strcmp("", AV57BarEncCli)==0), (short)(0), AV57BarEncCli, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "BARSER", "", !(GXutil.strcmp("", AV152BarSer)==0), (short)(0), AV152BarSer, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "BARCOLNOM", "", !(GXutil.strcmp("", AV154BarColNom)==0), (short)(0), AV154BarColNom, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "BARSIT", "", !((0==AV115BarSit)&&(0==AV116BarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV115BarSit, 2, 0)), GXutil.trim( GXutil.str( AV116BarSit_To, 2, 0))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFCLICOD", "", !((0==AV59TFCliCod)&&(0==AV60TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV59TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV60TFCliCod_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFCLINOM", "", !(GXutil.strcmp("", AV62TFCliNom)==0), (short)(0), AV62TFCliNom, "", !(GXutil.strcmp("", AV63TFCliNom_Sel)==0), AV63TFCliNom_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARNHDR", "", !(GXutil.strcmp("", AV47TFBarNHdr)==0), (short)(0), AV47TFBarNHdr, "", !(GXutil.strcmp("", AV48TFBarNHdr_Sel)==0), AV48TFBarNHdr_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARAGREST", "", !(GXutil.strcmp("", AV65TFBarAgrEst)==0), (short)(0), AV65TFBarAgrEst, "", !(GXutil.strcmp("", AV66TFBarAgrEst_Sel)==0), AV66TFBarAgrEst_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARSER", "", !(GXutil.strcmp("", AV68TFBarSer)==0), (short)(0), AV68TFBarSer, "", !(GXutil.strcmp("", AV69TFBarSer_Sel)==0), AV69TFBarSer_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARSERDSC", "", !(GXutil.strcmp("", AV71TFBarSerDsc)==0), (short)(0), AV71TFBarSerDsc, "", !(GXutil.strcmp("", AV72TFBarSerDsc_Sel)==0), AV72TFBarSerDsc_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARFECGEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74TFBarFecGen)), (short)(0), GXutil.trim( localUtil.dtoc( AV74TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARFECENT", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79TFBarFecEnt)), (short)(0), GXutil.trim( localUtil.dtoc( AV79TFBarFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV84TFBarColNom)==0), (short)(0), AV84TFBarColNom, "", !(GXutil.strcmp("", AV85TFBarColNom_Sel)==0), AV85TFBarColNom_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARCOLNUM", "", !((0==AV87TFBarColNum)&&(0==AV88TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV87TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV88TFBarColNum_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV90TFBarNomCli)==0), (short)(0), AV90TFBarNomCli, "", !(GXutil.strcmp("", AV91TFBarNomCli_Sel)==0), AV91TFBarNomCli_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARNUMCLI", "", !((0==AV93TFBarNumCli)&&(0==AV94TFBarNumCli_To)), (short)(0), GXutil.trim( GXutil.str( AV93TFBarNumCli, 6, 0)), GXutil.trim( GXutil.str( AV94TFBarNumCli_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV96TFBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV96TFBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV97TFBarKgm_To, 9, 2))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV100TFBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV99TFBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV100TFBarMtr_To, 9, 2))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARPIE", "", !((0==AV102TFBarPie)&&(0==AV103TFBarPie_To)), (short)(0), GXutil.trim( GXutil.str( AV102TFBarPie, 6, 0)), GXutil.trim( GXutil.str( AV103TFBarPie_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARSIT", "", !((0==AV105TFBarSit)&&(0==AV106TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV105TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV106TFBarSit_To, 2, 0))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARFASCOD", "", !(GXutil.strcmp("", AV125TFBarFasCod)==0), (short)(0), AV125TFBarFasCod, "", !(GXutil.strcmp("", AV126TFBarFasCod_Sel)==0), AV126TFBarFasCod_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARFASSIG", "", !(GXutil.strcmp("", AV128TFBarFasSig)==0), (short)(0), AV128TFBarFasSig, "", !(GXutil.strcmp("", AV129TFBarFasSig_Sel)==0), AV129TFBarFasSig_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARPART", "", !((0==AV145TFBarPart)&&(0==AV146TFBarPart_To)), (short)(0), GXutil.trim( GXutil.str( AV145TFBarPart, 4, 0)), GXutil.trim( GXutil.str( AV146TFBarPart_To, 4, 0))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARITEM3", "", !(GXutil.strcmp("", AV148TFBarItem3)==0), (short)(0), AV148TFBarItem3, "", !(GXutil.strcmp("", AV149TFBarItem3_Sel)==0), AV149TFBarItem3_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARRDTO4", "", !((0==AV166TFBarRdto4)&&(0==AV167TFBarRdto4_To)), (short)(0), GXutil.trim( GXutil.str( AV166TFBarRdto4, 4, 0)), GXutil.trim( GXutil.str( AV167TFBarRdto4_To, 4, 0))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARGOTS", "", !(GXutil.strcmp("", AV170TFBarGots)==0), (short)(0), AV170TFBarGots, "", !(GXutil.strcmp("", AV171TFBarGots_Sel)==0), AV171TFBarGots_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARGRS", "", !(GXutil.strcmp("", AV172TFBarGrs)==0), (short)(0), AV172TFBarGrs, "", !(GXutil.strcmp("", AV173TFBarGrs_Sel)==0), AV173TFBarGrs_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBAROCS", "", !(GXutil.strcmp("", AV174TFBarOcs)==0), (short)(0), AV174TFBarOcs, "", !(GXutil.strcmp("", AV175TFBarOcs_Sel)==0), AV175TFBarOcs_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARRCS", "", !(GXutil.strcmp("", AV176TFBarRcs)==0), (short)(0), AV176TFBarRcs, "", !(GXutil.strcmp("", AV177TFBarRcs_Sel)==0), AV177TFBarRcs_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBAROEKO", "", !(GXutil.strcmp("", AV178TFBarOeko)==0), (short)(0), AV178TFBarOeko, "", !(GXutil.strcmp("", AV179TFBarOeko_Sel)==0), AV179TFBarOeko_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARACCESORIOS_SEL", "", !(GXutil.strcmp("", AV180TFBarAccesorios_Sel)==0), (short)(0), AV180TFBarAccesorios_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARMARCA", "", !(GXutil.strcmp("", AV181TFBarMarca)==0), (short)(0), AV181TFBarMarca, "", !(GXutil.strcmp("", AV182TFBarMarca_Sel)==0), AV182TFBarMarca_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBAR_MACCOD", "", !((0==AV183TFBar_MacCod)&&(0==AV184TFBar_MacCod_To)), (short)(0), GXutil.trim( GXutil.str( AV183TFBar_MacCod, 8, 0)), GXutil.trim( GXutil.str( AV184TFBar_MacCod_To, 8, 0))) ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARFASCOD2", "", !(GXutil.strcmp("", AV185TFBarFasCod2)==0), (short)(0), AV185TFBarFasCod2, "", !(GXutil.strcmp("", AV186TFBarFasCod2_Sel)==0), AV186TFBarFasCod2_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      GXv_SdtWWPGridState57[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState57, "TFBARFASDSC2", "", !(GXutil.strcmp("", AV187TFBarFasDsc2)==0), (short)(0), AV187TFBarFasDsc2, "", !(GXutil.strcmp("", AV188TFBarFasDsc2_Sel)==0), AV188TFBarFasDsc2_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState57[0] ;
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV262Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV12TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV262Pgmname );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn04" );
      AV42Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_54_IU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarsit_Internalname, tblTablemergedbarsit_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsit_Internalname, httpContext.getMessage( "Bar Sit", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsit_Internalname, GXutil.ltrim( localUtil.ntoc( AV115BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV115BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV115BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarsit_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarsit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBarsit_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblBarsit_rangemiddletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCnsProd.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsit_to_Internalname, httpContext.getMessage( "Bar Sit_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsit_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV116BarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsit_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV116BarSit_To), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV116BarSit_To), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarsit_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarsit_to_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCnsProd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_54_IU2e( true) ;
      }
      else
      {
         wb_table1_54_IU2e( false) ;
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
      paIU2( ) ;
      wsIU2( ) ;
      weIU2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Shared/daterangepicker/daterangepicker.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211613192", true, true);
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
      httpContext.AddJavascriptSource("webwcnsprod.js", "?20268211613193", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_712( )
   {
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_71_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_71_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_71_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_71_idx ;
      edtavBarmaccod_Internalname = "vBARMACCOD_"+sGXsfl_71_idx ;
      edtavAccesorios_Internalname = "vACCESORIOS_"+sGXsfl_71_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_71_idx ;
      edtavBarenccligrid_Internalname = "vBARENCCLIGRID_"+sGXsfl_71_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_71_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_71_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_71_idx ;
      edtBarFecEnt_Internalname = "BARFECENT_"+sGXsfl_71_idx ;
      edtavObsenc_Internalname = "vOBSENC_"+sGXsfl_71_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_71_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_71_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_71_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_71_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_71_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_71_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_71_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_71_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_71_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_71_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_71_idx ;
      edtBarFasCod_Internalname = "BARFASCOD_"+sGXsfl_71_idx ;
      edtavFasdscult_Internalname = "vFASDSCULT_"+sGXsfl_71_idx ;
      edtBarFasSig_Internalname = "BARFASSIG_"+sGXsfl_71_idx ;
      edtavFasdscsig_Internalname = "vFASDSCSIG_"+sGXsfl_71_idx ;
      edtavAlbprocod_Internalname = "vALBPROCOD_"+sGXsfl_71_idx ;
      edtavAlbprofec_Internalname = "vALBPROFEC_"+sGXsfl_71_idx ;
      edtavBaralbkgme_Internalname = "vBARALBKGME_"+sGXsfl_71_idx ;
      edtavBaralbmtre_Internalname = "vBARALBMTRE_"+sGXsfl_71_idx ;
      edtavBaralbpie_Internalname = "vBARALBPIE_"+sGXsfl_71_idx ;
      edtavExportacion_Internalname = "vEXPORTACION_"+sGXsfl_71_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_71_idx ;
      edtBarPart_Internalname = "BARPART_"+sGXsfl_71_idx ;
      edtBarItem3_Internalname = "BARITEM3_"+sGXsfl_71_idx ;
      edtBarRdto4_Internalname = "BARRDTO4_"+sGXsfl_71_idx ;
      edtBarGots_Internalname = "BARGOTS_"+sGXsfl_71_idx ;
      edtBarGrs_Internalname = "BARGRS_"+sGXsfl_71_idx ;
      edtBarOcs_Internalname = "BAROCS_"+sGXsfl_71_idx ;
      edtBarRcs_Internalname = "BARRCS_"+sGXsfl_71_idx ;
      edtBarOeko_Internalname = "BAROEKO_"+sGXsfl_71_idx ;
      chkBarAccesor.setInternalname( "BARACCESOR_"+sGXsfl_71_idx );
      edtBarMarca_Internalname = "BARMARCA_"+sGXsfl_71_idx ;
      edtBar_MacCod_Internalname = "BAR_MACCOD_"+sGXsfl_71_idx ;
      edtBarFasCod2_Internalname = "BARFASCOD2_"+sGXsfl_71_idx ;
      edtBarFasDsc2_Internalname = "BARFASDSC2_"+sGXsfl_71_idx ;
      edtavForrgb_Internalname = "vFORRGB_"+sGXsfl_71_idx ;
   }

   public void subsflControlProps_fel_712( )
   {
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_71_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_71_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_71_fel_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_71_fel_idx ;
      edtavBarmaccod_Internalname = "vBARMACCOD_"+sGXsfl_71_fel_idx ;
      edtavAccesorios_Internalname = "vACCESORIOS_"+sGXsfl_71_fel_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_71_fel_idx ;
      edtavBarenccligrid_Internalname = "vBARENCCLIGRID_"+sGXsfl_71_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_71_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_71_fel_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_71_fel_idx ;
      edtBarFecEnt_Internalname = "BARFECENT_"+sGXsfl_71_fel_idx ;
      edtavObsenc_Internalname = "vOBSENC_"+sGXsfl_71_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_71_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_71_fel_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_71_fel_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_71_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_71_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_71_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_71_fel_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_71_fel_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_71_fel_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_71_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_71_fel_idx ;
      edtBarFasCod_Internalname = "BARFASCOD_"+sGXsfl_71_fel_idx ;
      edtavFasdscult_Internalname = "vFASDSCULT_"+sGXsfl_71_fel_idx ;
      edtBarFasSig_Internalname = "BARFASSIG_"+sGXsfl_71_fel_idx ;
      edtavFasdscsig_Internalname = "vFASDSCSIG_"+sGXsfl_71_fel_idx ;
      edtavAlbprocod_Internalname = "vALBPROCOD_"+sGXsfl_71_fel_idx ;
      edtavAlbprofec_Internalname = "vALBPROFEC_"+sGXsfl_71_fel_idx ;
      edtavBaralbkgme_Internalname = "vBARALBKGME_"+sGXsfl_71_fel_idx ;
      edtavBaralbmtre_Internalname = "vBARALBMTRE_"+sGXsfl_71_fel_idx ;
      edtavBaralbpie_Internalname = "vBARALBPIE_"+sGXsfl_71_fel_idx ;
      edtavExportacion_Internalname = "vEXPORTACION_"+sGXsfl_71_fel_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_71_fel_idx ;
      edtBarPart_Internalname = "BARPART_"+sGXsfl_71_fel_idx ;
      edtBarItem3_Internalname = "BARITEM3_"+sGXsfl_71_fel_idx ;
      edtBarRdto4_Internalname = "BARRDTO4_"+sGXsfl_71_fel_idx ;
      edtBarGots_Internalname = "BARGOTS_"+sGXsfl_71_fel_idx ;
      edtBarGrs_Internalname = "BARGRS_"+sGXsfl_71_fel_idx ;
      edtBarOcs_Internalname = "BAROCS_"+sGXsfl_71_fel_idx ;
      edtBarRcs_Internalname = "BARRCS_"+sGXsfl_71_fel_idx ;
      edtBarOeko_Internalname = "BAROEKO_"+sGXsfl_71_fel_idx ;
      chkBarAccesor.setInternalname( "BARACCESOR_"+sGXsfl_71_fel_idx );
      edtBarMarca_Internalname = "BARMARCA_"+sGXsfl_71_fel_idx ;
      edtBar_MacCod_Internalname = "BAR_MACCOD_"+sGXsfl_71_fel_idx ;
      edtBarFasCod2_Internalname = "BARFASCOD2_"+sGXsfl_71_fel_idx ;
      edtBarFasDsc2_Internalname = "BARFASDSC2_"+sGXsfl_71_fel_idx ;
      edtavForrgb_Internalname = "vFORRGB_"+sGXsfl_71_fel_idx ;
   }

   public void sendrow_712( )
   {
      subsflControlProps_712( ) ;
      wbIU0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_71_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_71_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_71_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV165DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,72);\"" : " "),"'"+""+"'"+",false,"+"'"+"e22iu2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarmaccod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarmaccod_Enabled!=0)&&(edtavBarmaccod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 76,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarmaccod_Internalname,GXutil.ltrim( localUtil.ntoc( AV143BarMacCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarmaccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV143BarMacCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV143BarMacCod), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarmaccod_Enabled!=0)&&(edtavBarmaccod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarmaccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarmaccod_Visible),Integer.valueOf(edtavBarmaccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAccesorios_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAccesorios_Enabled!=0)&&(edtavAccesorios_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 77,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAccesorios_Internalname,GXutil.rtrim( AV138Accesorios),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAccesorios_Enabled!=0)&&(edtavAccesorios_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,77);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAccesorios_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAccesorios_Visible),Integer.valueOf(edtavAccesorios_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrEst_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrEst_Internalname,GXutil.rtrim( A120BarAgrEst),GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrEst_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarenccligrid_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarenccligrid_Enabled!=0)&&(edtavBarenccligrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 79,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccligrid_Internalname,GXutil.rtrim( AV155BarEncCliGrid),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarenccligrid_Enabled!=0)&&(edtavBarenccligrid_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,79);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccligrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarenccligrid_Visible),Integer.valueOf(edtavBarenccligrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecEnt_Internalname,localUtil.format(A157BarFecEnt, "99/99/99"),localUtil.format( A157BarFecEnt, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavObsenc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavObsenc_Enabled!=0)&&(edtavObsenc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 84,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObsenc_Internalname,AV139ObsEnc,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavObsenc_Enabled!=0)&&(edtavObsenc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,84);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavObsenc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavObsenc_Visible),Integer.valueOf(edtavObsenc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtBarNomCli_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtBarNomCli_Forecolor)+";"+((edtBarNomCli_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtBarNomCli_Backcolor)+";"),ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarNumCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNumCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod_Internalname,GXutil.rtrim( A151BarFasCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavFasdscult_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFasdscult_Enabled!=0)&&(edtavFasdscult_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 97,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdscult_Internalname,GXutil.rtrim( AV130FasDscUlt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFasdscult_Enabled!=0)&&(edtavFasdscult_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,97);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFasdscult_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFasdscult_Visible),Integer.valueOf(edtavFasdscult_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasSig_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasSig_Internalname,GXutil.rtrim( A1955BarFasSig),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasSig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFasSig_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavFasdscsig_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFasdscsig_Enabled!=0)&&(edtavFasdscsig_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 99,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdscsig_Internalname,GXutil.rtrim( AV131FasDscSig),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFasdscsig_Enabled!=0)&&(edtavFasdscsig_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,99);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFasdscsig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFasdscsig_Visible),Integer.valueOf(edtavFasdscsig_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlbprocod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAlbprocod_Enabled!=0)&&(edtavAlbprocod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbprocod_Internalname,GXutil.ltrim( localUtil.ntoc( AV132AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV132AlbProcod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV132AlbProcod), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavAlbprocod_Enabled!=0)&&(edtavAlbprocod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlbprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlbprocod_Visible),Integer.valueOf(edtavAlbprocod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlbprofec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAlbprofec_Enabled!=0)&&(edtavAlbprofec_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 101,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbprofec_Internalname,localUtil.format(AV133AlbProFec, "99/99/99"),localUtil.format( AV133AlbProFec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavAlbprofec_Enabled!=0)&&(edtavAlbprofec_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlbprofec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlbprofec_Visible),Integer.valueOf(edtavAlbprofec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbkgme_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaralbkgme_Enabled!=0)&&(edtavBaralbkgme_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 102,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbkgme_Internalname,GXutil.ltrim( localUtil.ntoc( AV134BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbkgme_Enabled!=0) ? localUtil.format( AV134BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( AV134BarAlbKgmE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavBaralbkgme_Enabled!=0)&&(edtavBaralbkgme_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,102);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbkgme_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbkgme_Visible),Integer.valueOf(edtavBaralbkgme_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbmtre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaralbmtre_Enabled!=0)&&(edtavBaralbmtre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 103,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbmtre_Internalname,GXutil.ltrim( localUtil.ntoc( AV135BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbmtre_Enabled!=0) ? localUtil.format( AV135BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( AV135BarAlbMtrE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavBaralbmtre_Enabled!=0)&&(edtavBaralbmtre_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,103);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbmtre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbmtre_Visible),Integer.valueOf(edtavBaralbmtre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbpie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaralbpie_Enabled!=0)&&(edtavBaralbpie_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 104,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbpie_Internalname,GXutil.ltrim( localUtil.ntoc( AV136BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV136BarAlbPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV136BarAlbPie), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBaralbpie_Enabled!=0)&&(edtavBaralbpie_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbpie_Visible),Integer.valueOf(edtavBaralbpie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavExportacion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExportacion_Enabled!=0)&&(edtavExportacion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExportacion_Internalname,GXutil.rtrim( AV141Exportacion),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavExportacion_Enabled!=0)&&(edtavExportacion_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,105);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavExportacion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavExportacion_Visible),Integer.valueOf(edtavExportacion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavMarca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMarca_Enabled!=0)&&(edtavMarca_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 106,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMarca_Internalname,GXutil.rtrim( AV142Marca),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMarca_Enabled!=0)&&(edtavMarca_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,106);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMarca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMarca_Visible),Integer.valueOf(edtavMarca_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPart_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPart_Internalname,GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarPart_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarItem3_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarItem3_Internalname,GXutil.rtrim( A9777BarItem3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarItem3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarItem3_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarRdto4_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarRdto4_Internalname,GXutil.ltrim( localUtil.ntoc( A13769BarRdto4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13769BarRdto4), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarRdto4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarRdto4_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarGots_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGots_Internalname,GXutil.rtrim( A13855BarGots),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarGots_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarGots_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarGrs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGrs_Internalname,GXutil.rtrim( A13856BarGrs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarGrs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarGrs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarOcs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOcs_Internalname,GXutil.rtrim( A13857BarOcs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOcs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarOcs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarRcs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarRcs_Internalname,GXutil.rtrim( A13858BarRcs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarRcs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarRcs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarOeko_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOeko_Internalname,GXutil.rtrim( A13859BarOeko),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOeko_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarOeko_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkBarAccesor.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARACCESOR_" + sGXsfl_71_idx ;
         chkBarAccesor.setName( GXCCtl );
         chkBarAccesor.setWebtags( "" );
         chkBarAccesor.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkBarAccesor.getInternalname(), "TitleCaption", chkBarAccesor.getCaption(), !bGXsfl_71_Refreshing);
         chkBarAccesor.setCheckedValue( "N" );
         A13860BarAccesor = ((GXutil.strcmp(GXutil.rtrim( A13860BarAccesor), "S")==0) ? "S" : "N") ;
         n13860BarAccesor = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarAccesor.getInternalname(),A13860BarAccesor,"","",Integer.valueOf(chkBarAccesor.getVisible()),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarMarca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMarca_Internalname,GXutil.rtrim( A13861BarMarca),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMarca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMarca_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBar_MacCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBar_MacCod_Internalname,GXutil.ltrim( localUtil.ntoc( A13862Bar_MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13862Bar_MacCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBar_MacCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBar_MacCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasCod2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod2_Internalname,GXutil.rtrim( A13863BarFasCod2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFasCod2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasDsc2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDsc2_Internalname,GXutil.rtrim( A13864BarFasDsc2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDsc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFasDsc2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavForrgb_Enabled!=0)&&(edtavForrgb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 120,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavForrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV164ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavForrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV164ForRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV164ForRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavForrgb_Enabled!=0)&&(edtavForrgb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,120);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavForrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavForrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesIU2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_71_idx = ((subGrid_Islastpage==1)&&(nGXsfl_71_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_71_idx+1) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
      }
      /* End function sendrow_712 */
   }

   public void startgridcontrol71( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"71\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarmaccod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAccesorios_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acc?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrEst_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "S=Bar.Agrupada N=No Agrupada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarenccligrid_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Prev Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavObsenc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero del Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNumCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero ", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "St", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ult fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFasdscult_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasSig_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sig Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFasdscsig_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlbprocod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Doc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlbprofec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaralbkgme_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Sal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaralbmtre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Sal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaralbpie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Sal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavExportacion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exportacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMarca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Marca", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPart_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Partida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarItem3_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Enc Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarRdto4_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "4 decimales", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarGots_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gots", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarGrs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOcs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ocs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarRcs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rcs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOeko_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Oeko", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkBarAccesor.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acc?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMarca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Marca", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBar_MacCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Macro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasCod2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase Ult", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasDsc2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desc Fase", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV165DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV143BarMacCod, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarmaccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarmaccod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV138Accesorios));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAccesorios_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAccesorios_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A120BarAgrEst));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrEst_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV155BarEncCliGrid));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccligrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarenccligrid_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecGen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A157BarFecEnt, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV139ObsEnc);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObsenc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavObsenc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNumCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A151BarFasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV130FasDscUlt));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdscult_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFasdscult_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1955BarFasSig));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasSig_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV131FasDscSig));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdscsig_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFasdscsig_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV132AlbProcod, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlbprocod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV133AlbProFec, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbprofec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlbprofec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV134BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbkgme_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaralbkgme_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV135BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbmtre_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaralbmtre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV136BarAlbPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbpie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaralbpie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV141Exportacion));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExportacion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavExportacion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV142Marca));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMarca_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMarca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPart_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9777BarItem3));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarItem3_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13769BarRdto4, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarRdto4_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13855BarGots));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarGots_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13856BarGrs));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarGrs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13857BarOcs));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOcs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13858BarRcs));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarRcs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13859BarOeko));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOeko_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13860BarAccesor));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkBarAccesor.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13861BarMarca));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMarca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13862Bar_MacCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBar_MacCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13863BarFasCod2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasCod2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13864BarFasDsc2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasDsc2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV164ForRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavForrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavBarfecgen_rangetext_Internalname = "vBARFECGEN_RANGETEXT" ;
      edtavBarenccli_Internalname = "vBARENCCLI" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarsit_Internalname = "vBARSIT" ;
      lblBarsit_rangemiddletext_Internalname = "BARSIT_RANGEMIDDLETEXT" ;
      edtavBarsit_to_Internalname = "vBARSIT_TO" ;
      tblTablemergedbarsit_Internalname = "TABLEMERGEDBARSIT" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtavBarmaccod_Internalname = "vBARMACCOD" ;
      edtavAccesorios_Internalname = "vACCESORIOS" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      edtavBarenccligrid_Internalname = "vBARENCCLIGRID" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarFecGen_Internalname = "BARFECGEN" ;
      edtBarFecEnt_Internalname = "BARFECENT" ;
      edtavObsenc_Internalname = "vOBSENC" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarKgm_Internalname = "BARKGM" ;
      edtBarMtr_Internalname = "BARMTR" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtBarFasCod_Internalname = "BARFASCOD" ;
      edtavFasdscult_Internalname = "vFASDSCULT" ;
      edtBarFasSig_Internalname = "BARFASSIG" ;
      edtavFasdscsig_Internalname = "vFASDSCSIG" ;
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      edtavAlbprofec_Internalname = "vALBPROFEC" ;
      edtavBaralbkgme_Internalname = "vBARALBKGME" ;
      edtavBaralbmtre_Internalname = "vBARALBMTRE" ;
      edtavBaralbpie_Internalname = "vBARALBPIE" ;
      edtavExportacion_Internalname = "vEXPORTACION" ;
      edtavMarca_Internalname = "vMARCA" ;
      edtBarPart_Internalname = "BARPART" ;
      edtBarItem3_Internalname = "BARITEM3" ;
      edtBarRdto4_Internalname = "BARRDTO4" ;
      edtBarGots_Internalname = "BARGOTS" ;
      edtBarGrs_Internalname = "BARGRS" ;
      edtBarOcs_Internalname = "BAROCS" ;
      edtBarRcs_Internalname = "BARRCS" ;
      edtBarOeko_Internalname = "BAROEKO" ;
      chkBarAccesor.setInternalname( "BARACCESOR" );
      edtBarMarca_Internalname = "BARMARCA" ;
      edtBar_MacCod_Internalname = "BAR_MACCOD" ;
      edtBarFasCod2_Internalname = "BARFASCOD2" ;
      edtBarFasDsc2_Internalname = "BARFASDSC2" ;
      edtavForrgb_Internalname = "vFORRGB" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Barfecgen_rangepicker_Internalname = "BARFECGEN_RANGEPICKER" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_barfecgenauxdate_Internalname = "vDDO_BARFECGENAUXDATE" ;
      divDdo_barfecgenauxdates_Internalname = "DDO_BARFECGENAUXDATES" ;
      edtavDdo_barfecentauxdate_Internalname = "vDDO_BARFECENTAUXDATE" ;
      divDdo_barfecentauxdates_Internalname = "DDO_BARFECENTAUXDATES" ;
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
      edtavForrgb_Jsonclick = "" ;
      edtavForrgb_Visible = 0 ;
      edtavForrgb_Enabled = 1 ;
      edtBarFasDsc2_Jsonclick = "" ;
      edtBarFasCod2_Jsonclick = "" ;
      edtBar_MacCod_Jsonclick = "" ;
      edtBarMarca_Jsonclick = "" ;
      chkBarAccesor.setCaption( "" );
      edtBarOeko_Jsonclick = "" ;
      edtBarRcs_Jsonclick = "" ;
      edtBarOcs_Jsonclick = "" ;
      edtBarGrs_Jsonclick = "" ;
      edtBarGots_Jsonclick = "" ;
      edtBarRdto4_Jsonclick = "" ;
      edtBarItem3_Jsonclick = "" ;
      edtBarPart_Jsonclick = "" ;
      edtavMarca_Jsonclick = "" ;
      edtavMarca_Enabled = 1 ;
      edtavExportacion_Jsonclick = "" ;
      edtavExportacion_Enabled = 1 ;
      edtavBaralbpie_Jsonclick = "" ;
      edtavBaralbpie_Enabled = 1 ;
      edtavBaralbmtre_Jsonclick = "" ;
      edtavBaralbmtre_Enabled = 1 ;
      edtavBaralbkgme_Jsonclick = "" ;
      edtavBaralbkgme_Enabled = 1 ;
      edtavAlbprofec_Jsonclick = "" ;
      edtavAlbprofec_Enabled = 1 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 1 ;
      edtavFasdscsig_Jsonclick = "" ;
      edtavFasdscsig_Enabled = 1 ;
      edtBarFasSig_Jsonclick = "" ;
      edtavFasdscult_Jsonclick = "" ;
      edtavFasdscult_Enabled = 1 ;
      edtBarFasCod_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarPie_Jsonclick = "" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Forecolor = (int)(0x000000) ;
      edtBarNomCli_Backcolor = -1 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtavObsenc_Jsonclick = "" ;
      edtavObsenc_Enabled = 1 ;
      edtBarFecEnt_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtavBarenccligrid_Jsonclick = "" ;
      edtavBarenccligrid_Enabled = 1 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtavAccesorios_Jsonclick = "" ;
      edtavAccesorios_Enabled = 1 ;
      edtavBarmaccod_Jsonclick = "" ;
      edtavBarmaccod_Enabled = 1 ;
      edtBarNHdr_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavBarsit_to_Jsonclick = "" ;
      edtavBarsit_to_Enabled = 1 ;
      edtavBarsit_Jsonclick = "" ;
      edtavBarsit_Enabled = 1 ;
      edtBarFasDsc2_Visible = -1 ;
      edtBarFasCod2_Visible = -1 ;
      edtBar_MacCod_Visible = -1 ;
      edtBarMarca_Visible = -1 ;
      chkBarAccesor.setVisible( -1 );
      edtBarOeko_Visible = -1 ;
      edtBarRcs_Visible = -1 ;
      edtBarOcs_Visible = -1 ;
      edtBarGrs_Visible = -1 ;
      edtBarGots_Visible = -1 ;
      edtBarRdto4_Visible = -1 ;
      edtBarItem3_Visible = -1 ;
      edtBarPart_Visible = -1 ;
      edtavMarca_Visible = -1 ;
      edtavExportacion_Visible = -1 ;
      edtavBaralbpie_Visible = -1 ;
      edtavBaralbmtre_Visible = -1 ;
      edtavBaralbkgme_Visible = -1 ;
      edtavAlbprofec_Visible = -1 ;
      edtavAlbprocod_Visible = -1 ;
      edtavFasdscsig_Visible = -1 ;
      edtBarFasSig_Visible = -1 ;
      edtavFasdscult_Visible = -1 ;
      edtBarFasCod_Visible = -1 ;
      edtBarSit_Visible = -1 ;
      edtBarPie_Visible = -1 ;
      edtBarMtr_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtBarNumCli_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtavObsenc_Visible = -1 ;
      edtBarFecEnt_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtavBarenccligrid_Visible = -1 ;
      edtBarAgrEst_Visible = -1 ;
      edtavAccesorios_Visible = -1 ;
      edtavBarmaccod_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfecentauxdate_Jsonclick = "" ;
      edtavDdo_barfecgenauxdate_Jsonclick = "" ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 1 ;
      edtavBarfecgen_rangetext_Jsonclick = "" ;
      edtavBarfecgen_rangetext_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 1 ;
      divTablemain_Class = "TableMain" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WebWCnsProdGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||||||||||||||||||||||||||||S:WWP_TSChecked,N:WWP_TSUnChecked||||" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|||Dynamic||Dynamic|Dynamic||||Dynamic||Dynamic||||||Dynamic||Dynamic||||||||||Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|FixedValues|Dynamic||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|||T||T|T||||T||T||||||T||T||||||||||T||T|T|T|T|T|T|T||T|T" ;
      Ddo_grid_Filterisrange = "T|||||||||||||T||T|T|T|T|T||||||||||||T||T||||||||T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|||Character||Character|Character|Date|Date||Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character||Character|||||||||Numeric|Character|Numeric|Character|Character|Character|Character|Character||Character|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T|T|T|||T||T|T|T|T||T|T|T|T|T|T|T|T|T||T|||||||||T|T|T|T|T|T|T|T||T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||||T||T|T|T|T||T|T|T|T||||T||||||||||||T|T|T||||||||||" ;
      Ddo_grid_Columnssortvalues = "1|2||||3||4|5|6|7||8|9|10|11||||12||||||||||||13|14|15||||||||||" ;
      Ddo_grid_Columnids = "1:CliCod|2:CliNom|3:BarNHdr|4:BarMacCod|5:Accesorios|6:BarAgrEst|7:BarEncCliGrid|8:BarSer|9:BarSerDsc|10:BarFecGen|11:BarFecEnt|12:ObsEnc|13:BarColNom|14:BarColNum|15:BarNomCli|16:BarNumCli|20:BarKgm|21:BarMtr|22:BarPie|23:BarSit|24:BarFasCod|25:FasDscUlt|26:BarFasSig|27:FasDscSig|28:AlbProcod|29:AlbProFec|30:BarAlbKgmE|31:BarAlbMtrE|32:BarAlbPie|33:Exportacion|34:Marca|35:BarPart|36:BarItem3|37:BarRdto4|38:BarGots|39:BarGrs|40:BarOcs|41:BarRcs|42:BarOeko|43:BarAccesorios|44:BarMarca|45:Bar_MacCod|46:BarFasCod2|47:BarFasDsc2" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consulta Produccion", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "BARACCESOR_" + sGXsfl_71_idx ;
      chkBarAccesor.setName( GXCCtl );
      chkBarAccesor.setWebtags( "" );
      chkBarAccesor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAccesor.getInternalname(), "TitleCaption", chkBarAccesor.getCaption(), !bGXsfl_71_Refreshing);
      chkBarAccesor.setCheckedValue( "N" );
      A13860BarAccesor = ((GXutil.strcmp(GXutil.rtrim( A13860BarAccesor), "S")==0) ? "S" : "N") ;
      n13860BarAccesor = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV157BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV118CliNom',fld:'vCLINOM',pic:''},{av:'AV57BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV152BarSer',fld:'vBARSER',pic:''},{av:'AV154BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV115BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV116BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBarmaccod_Visible',ctrl:'vBARMACCOD',prop:'Visible'},{av:'edtavAccesorios_Visible',ctrl:'vACCESORIOS',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtavBarenccligrid_Visible',ctrl:'vBARENCCLIGRID',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecEnt_Visible',ctrl:'BARFECENT',prop:'Visible'},{av:'edtavObsenc_Visible',ctrl:'vOBSENC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtavFasdscult_Visible',ctrl:'vFASDSCULT',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtavFasdscsig_Visible',ctrl:'vFASDSCSIG',prop:'Visible'},{av:'edtavAlbprocod_Visible',ctrl:'vALBPROCOD',prop:'Visible'},{av:'edtavAlbprofec_Visible',ctrl:'vALBPROFEC',prop:'Visible'},{av:'edtavBaralbkgme_Visible',ctrl:'vBARALBKGME',prop:'Visible'},{av:'edtavBaralbmtre_Visible',ctrl:'vBARALBMTRE',prop:'Visible'},{av:'edtavBaralbpie_Visible',ctrl:'vBARALBPIE',prop:'Visible'},{av:'edtavExportacion_Visible',ctrl:'vEXPORTACION',prop:'Visible'},{av:'edtavMarca_Visible',ctrl:'vMARCA',prop:'Visible'},{av:'edtBarPart_Visible',ctrl:'BARPART',prop:'Visible'},{av:'edtBarItem3_Visible',ctrl:'BARITEM3',prop:'Visible'},{av:'edtBarRdto4_Visible',ctrl:'BARRDTO4',prop:'Visible'},{av:'edtBarGots_Visible',ctrl:'BARGOTS',prop:'Visible'},{av:'edtBarGrs_Visible',ctrl:'BARGRS',prop:'Visible'},{av:'edtBarOcs_Visible',ctrl:'BAROCS',prop:'Visible'},{av:'edtBarRcs_Visible',ctrl:'BARRCS',prop:'Visible'},{av:'edtBarOeko_Visible',ctrl:'BAROEKO',prop:'Visible'},{av:'chkBarAccesor.getVisible()',ctrl:'BARACCESOR',prop:'Visible'},{av:'edtBarMarca_Visible',ctrl:'BARMARCA',prop:'Visible'},{av:'edtBar_MacCod_Visible',ctrl:'BAR_MACCOD',prop:'Visible'},{av:'edtBarFasCod2_Visible',ctrl:'BARFASCOD2',prop:'Visible'},{av:'edtBarFasDsc2_Visible',ctrl:'BARFASDSC2',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV43ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12IU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV157BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV118CliNom',fld:'vCLINOM',pic:''},{av:'AV57BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV152BarSer',fld:'vBARSER',pic:''},{av:'AV154BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV115BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV116BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13IU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV157BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV118CliNom',fld:'vCLINOM',pic:''},{av:'AV57BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV152BarSer',fld:'vBARSER',pic:''},{av:'AV154BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV115BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV116BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15IU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV157BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV118CliNom',fld:'vCLINOM',pic:''},{av:'AV57BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV152BarSer',fld:'vBARSER',pic:''},{av:'AV154BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV115BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV116BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21IU2',iparms:[{av:'A3746BarNPed',fld:'BARNPED',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'A151BarFasCod',fld:'BARFASCOD',pic:''},{av:'A1955BarFasSig',fld:'BARFASSIG',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'A11852Nxt_ArtCl2',fld:'NXT_ARTCL2',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV165DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV143BarMacCod',fld:'vBARMACCOD',pic:'ZZZZZZZZZ9'},{av:'AV138Accesorios',fld:'vACCESORIOS',pic:''},{av:'AV155BarEncCliGrid',fld:'vBARENCCLIGRID',pic:''},{av:'AV139ObsEnc',fld:'vOBSENC',pic:''},{av:'AV130FasDscUlt',fld:'vFASDSCULT',pic:''},{av:'AV131FasDscSig',fld:'vFASDSCSIG',pic:''},{av:'AV132AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV133AlbProFec',fld:'vALBPROFEC',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV141Exportacion',fld:'vEXPORTACION',pic:''},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV142Marca',fld:'vMARCA',pic:''},{av:'AV164ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9'},{av:'edtBarNomCli_Backcolor',ctrl:'BARNOMCLI',prop:'Backcolor'},{av:'edtBarNomCli_Forecolor',ctrl:'BARNOMCLI',prop:'Forecolor'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16IU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV157BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV118CliNom',fld:'vCLINOM',pic:''},{av:'AV57BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV152BarSer',fld:'vBARSER',pic:''},{av:'AV154BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV115BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV116BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBarmaccod_Visible',ctrl:'vBARMACCOD',prop:'Visible'},{av:'edtavAccesorios_Visible',ctrl:'vACCESORIOS',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtavBarenccligrid_Visible',ctrl:'vBARENCCLIGRID',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecEnt_Visible',ctrl:'BARFECENT',prop:'Visible'},{av:'edtavObsenc_Visible',ctrl:'vOBSENC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtavFasdscult_Visible',ctrl:'vFASDSCULT',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtavFasdscsig_Visible',ctrl:'vFASDSCSIG',prop:'Visible'},{av:'edtavAlbprocod_Visible',ctrl:'vALBPROCOD',prop:'Visible'},{av:'edtavAlbprofec_Visible',ctrl:'vALBPROFEC',prop:'Visible'},{av:'edtavBaralbkgme_Visible',ctrl:'vBARALBKGME',prop:'Visible'},{av:'edtavBaralbmtre_Visible',ctrl:'vBARALBMTRE',prop:'Visible'},{av:'edtavBaralbpie_Visible',ctrl:'vBARALBPIE',prop:'Visible'},{av:'edtavExportacion_Visible',ctrl:'vEXPORTACION',prop:'Visible'},{av:'edtavMarca_Visible',ctrl:'vMARCA',prop:'Visible'},{av:'edtBarPart_Visible',ctrl:'BARPART',prop:'Visible'},{av:'edtBarItem3_Visible',ctrl:'BARITEM3',prop:'Visible'},{av:'edtBarRdto4_Visible',ctrl:'BARRDTO4',prop:'Visible'},{av:'edtBarGots_Visible',ctrl:'BARGOTS',prop:'Visible'},{av:'edtBarGrs_Visible',ctrl:'BARGRS',prop:'Visible'},{av:'edtBarOcs_Visible',ctrl:'BAROCS',prop:'Visible'},{av:'edtBarRcs_Visible',ctrl:'BARRCS',prop:'Visible'},{av:'edtBarOeko_Visible',ctrl:'BAROEKO',prop:'Visible'},{av:'chkBarAccesor.getVisible()',ctrl:'BARACCESOR',prop:'Visible'},{av:'edtBarMarca_Visible',ctrl:'BARMARCA',prop:'Visible'},{av:'edtBar_MacCod_Visible',ctrl:'BAR_MACCOD',prop:'Visible'},{av:'edtBarFasCod2_Visible',ctrl:'BARFASCOD2',prop:'Visible'},{av:'edtBarFasDsc2_Visible',ctrl:'BARFASDSC2',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV43ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11IU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV157BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV118CliNom',fld:'vCLINOM',pic:''},{av:'AV57BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV152BarSer',fld:'vBARSER',pic:''},{av:'AV154BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV115BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV116BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV157BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV118CliNom',fld:'vCLINOM',pic:''},{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV57BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV152BarSer',fld:'vBARSER',pic:''},{av:'AV154BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV115BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV116BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBarmaccod_Visible',ctrl:'vBARMACCOD',prop:'Visible'},{av:'edtavAccesorios_Visible',ctrl:'vACCESORIOS',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtavBarenccligrid_Visible',ctrl:'vBARENCCLIGRID',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecEnt_Visible',ctrl:'BARFECENT',prop:'Visible'},{av:'edtavObsenc_Visible',ctrl:'vOBSENC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtavFasdscult_Visible',ctrl:'vFASDSCULT',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtavFasdscsig_Visible',ctrl:'vFASDSCSIG',prop:'Visible'},{av:'edtavAlbprocod_Visible',ctrl:'vALBPROCOD',prop:'Visible'},{av:'edtavAlbprofec_Visible',ctrl:'vALBPROFEC',prop:'Visible'},{av:'edtavBaralbkgme_Visible',ctrl:'vBARALBKGME',prop:'Visible'},{av:'edtavBaralbmtre_Visible',ctrl:'vBARALBMTRE',prop:'Visible'},{av:'edtavBaralbpie_Visible',ctrl:'vBARALBPIE',prop:'Visible'},{av:'edtavExportacion_Visible',ctrl:'vEXPORTACION',prop:'Visible'},{av:'edtavMarca_Visible',ctrl:'vMARCA',prop:'Visible'},{av:'edtBarPart_Visible',ctrl:'BARPART',prop:'Visible'},{av:'edtBarItem3_Visible',ctrl:'BARITEM3',prop:'Visible'},{av:'edtBarRdto4_Visible',ctrl:'BARRDTO4',prop:'Visible'},{av:'edtBarGots_Visible',ctrl:'BARGOTS',prop:'Visible'},{av:'edtBarGrs_Visible',ctrl:'BARGRS',prop:'Visible'},{av:'edtBarOcs_Visible',ctrl:'BAROCS',prop:'Visible'},{av:'edtBarRcs_Visible',ctrl:'BARRCS',prop:'Visible'},{av:'edtBarOeko_Visible',ctrl:'BAROEKO',prop:'Visible'},{av:'chkBarAccesor.getVisible()',ctrl:'BARACCESOR',prop:'Visible'},{av:'edtBarMarca_Visible',ctrl:'BARMARCA',prop:'Visible'},{av:'edtBar_MacCod_Visible',ctrl:'BAR_MACCOD',prop:'Visible'},{av:'edtBarFasCod2_Visible',ctrl:'BARFASCOD2',prop:'Visible'},{av:'edtBarFasDsc2_Visible',ctrl:'BARFASDSC2',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV43ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17IU2',iparms:[{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV157BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV118CliNom',fld:'vCLINOM',pic:''},{av:'AV57BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV152BarSer',fld:'vBARSER',pic:''},{av:'AV154BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV115BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV116BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18IU2',iparms:[{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV157BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV118CliNom',fld:'vCLINOM',pic:''},{av:'AV57BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV152BarSer',fld:'vBARSER',pic:''},{av:'AV154BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV115BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV116BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("BARFECGEN_RANGEPICKER.DATERANGECHANGED","{handler:'e14IU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV157BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV118CliNom',fld:'vCLINOM',pic:''},{av:'AV57BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV152BarSer',fld:'vBARSER',pic:''},{av:'AV154BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV115BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV116BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV59TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV63TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV48TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV65TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV66TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV68TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV69TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV71TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV72TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV74TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV79TFBarFecEnt',fld:'vTFBARFECENT',pic:''},{av:'AV84TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV87TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV91TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV93TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV96TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV97TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV99TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV100TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV102TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV103TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV105TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV106TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV125TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV126TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV128TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV129TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV145TFBarPart',fld:'vTFBARPART',pic:'ZZZ9'},{av:'AV146TFBarPart_To',fld:'vTFBARPART_TO',pic:'ZZZ9'},{av:'AV148TFBarItem3',fld:'vTFBARITEM3',pic:''},{av:'AV149TFBarItem3_Sel',fld:'vTFBARITEM3_SEL',pic:''},{av:'AV166TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV167TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV170TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV171TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV172TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV173TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV174TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV175TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV176TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV177TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV178TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV179TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV180TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV181TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV182TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV183TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV184TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV185TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV186TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV187TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV188TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV262Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV54OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV55OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV134BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV135BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV136BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV140Tb1_dscfb',fld:'vTB1_DSCFB',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("BARFECGEN_RANGEPICKER.DATERANGECHANGED",",oparms:[{av:'AV113BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV114BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV45ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV40ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBarmaccod_Visible',ctrl:'vBARMACCOD',prop:'Visible'},{av:'edtavAccesorios_Visible',ctrl:'vACCESORIOS',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtavBarenccligrid_Visible',ctrl:'vBARENCCLIGRID',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecEnt_Visible',ctrl:'BARFECENT',prop:'Visible'},{av:'edtavObsenc_Visible',ctrl:'vOBSENC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtavFasdscult_Visible',ctrl:'vFASDSCULT',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtavFasdscsig_Visible',ctrl:'vFASDSCSIG',prop:'Visible'},{av:'edtavAlbprocod_Visible',ctrl:'vALBPROCOD',prop:'Visible'},{av:'edtavAlbprofec_Visible',ctrl:'vALBPROFEC',prop:'Visible'},{av:'edtavBaralbkgme_Visible',ctrl:'vBARALBKGME',prop:'Visible'},{av:'edtavBaralbmtre_Visible',ctrl:'vBARALBMTRE',prop:'Visible'},{av:'edtavBaralbpie_Visible',ctrl:'vBARALBPIE',prop:'Visible'},{av:'edtavExportacion_Visible',ctrl:'vEXPORTACION',prop:'Visible'},{av:'edtavMarca_Visible',ctrl:'vMARCA',prop:'Visible'},{av:'edtBarPart_Visible',ctrl:'BARPART',prop:'Visible'},{av:'edtBarItem3_Visible',ctrl:'BARITEM3',prop:'Visible'},{av:'edtBarRdto4_Visible',ctrl:'BARRDTO4',prop:'Visible'},{av:'edtBarGots_Visible',ctrl:'BARGOTS',prop:'Visible'},{av:'edtBarGrs_Visible',ctrl:'BARGRS',prop:'Visible'},{av:'edtBarOcs_Visible',ctrl:'BAROCS',prop:'Visible'},{av:'edtBarRcs_Visible',ctrl:'BARRCS',prop:'Visible'},{av:'edtBarOeko_Visible',ctrl:'BAROEKO',prop:'Visible'},{av:'chkBarAccesor.getVisible()',ctrl:'BARACCESOR',prop:'Visible'},{av:'edtBarMarca_Visible',ctrl:'BARMARCA',prop:'Visible'},{av:'edtBar_MacCod_Visible',ctrl:'BAR_MACCOD',prop:'Visible'},{av:'edtBarFasCod2_Visible',ctrl:'BARFASCOD2',prop:'Visible'},{av:'edtBarFasDsc2_Visible',ctrl:'BARFASDSC2',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV43ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e22IU2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPIE","{handler:'valid_Barpie',iparms:[]");
      setEventMetadata("VALID_BARPIE",",oparms:[]}");
      setEventMetadata("VALID_BARGOTS","{handler:'valid_Bargots',iparms:[]");
      setEventMetadata("VALID_BARGOTS",",oparms:[]}");
      setEventMetadata("VALID_BARGRS","{handler:'valid_Bargrs',iparms:[]");
      setEventMetadata("VALID_BARGRS",",oparms:[]}");
      setEventMetadata("VALID_BAROCS","{handler:'valid_Barocs',iparms:[]");
      setEventMetadata("VALID_BAROCS",",oparms:[]}");
      setEventMetadata("VALID_BARRCS","{handler:'valid_Barrcs',iparms:[]");
      setEventMetadata("VALID_BARRCS",",oparms:[]}");
      setEventMetadata("VALID_BAROEKO","{handler:'valid_Baroeko',iparms:[]");
      setEventMetadata("VALID_BAROEKO",",oparms:[]}");
      setEventMetadata("VALID_BARFASCOD2","{handler:'valid_Barfascod2',iparms:[]");
      setEventMetadata("VALID_BARFASCOD2",",oparms:[]}");
      setEventMetadata("VALID_BARFASDSC2","{handler:'valid_Barfasdsc2',iparms:[]");
      setEventMetadata("VALID_BARFASDSC2",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Forrgb',iparms:[]");
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
      AV157BarNHdr = "" ;
      AV118CliNom = "" ;
      AV57BarEncCli = "" ;
      AV152BarSer = "" ;
      AV154BarColNom = "" ;
      AV113BarFecGen = GXutil.nullDate() ;
      AV40ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV114BarFecGen_To = GXutil.nullDate() ;
      AV62TFCliNom = "" ;
      AV63TFCliNom_Sel = "" ;
      AV47TFBarNHdr = "" ;
      AV48TFBarNHdr_Sel = "" ;
      AV65TFBarAgrEst = "" ;
      AV66TFBarAgrEst_Sel = "" ;
      AV68TFBarSer = "" ;
      AV69TFBarSer_Sel = "" ;
      AV71TFBarSerDsc = "" ;
      AV72TFBarSerDsc_Sel = "" ;
      AV74TFBarFecGen = GXutil.nullDate() ;
      AV79TFBarFecEnt = GXutil.nullDate() ;
      AV84TFBarColNom = "" ;
      AV85TFBarColNom_Sel = "" ;
      AV90TFBarNomCli = "" ;
      AV91TFBarNomCli_Sel = "" ;
      AV96TFBarKgm = DecimalUtil.ZERO ;
      AV97TFBarKgm_To = DecimalUtil.ZERO ;
      AV99TFBarMtr = DecimalUtil.ZERO ;
      AV100TFBarMtr_To = DecimalUtil.ZERO ;
      AV125TFBarFasCod = "" ;
      AV126TFBarFasCod_Sel = "" ;
      AV128TFBarFasSig = "" ;
      AV129TFBarFasSig_Sel = "" ;
      AV148TFBarItem3 = "" ;
      AV149TFBarItem3_Sel = "" ;
      AV170TFBarGots = "" ;
      AV171TFBarGots_Sel = "" ;
      AV172TFBarGrs = "" ;
      AV173TFBarGrs_Sel = "" ;
      AV174TFBarOcs = "" ;
      AV175TFBarOcs_Sel = "" ;
      AV176TFBarRcs = "" ;
      AV177TFBarRcs_Sel = "" ;
      AV178TFBarOeko = "" ;
      AV179TFBarOeko_Sel = "" ;
      AV180TFBarAccesorios_Sel = "" ;
      AV181TFBarMarca = "" ;
      AV182TFBarMarca_Sel = "" ;
      AV185TFBarFasCod2 = "" ;
      AV186TFBarFasCod2_Sel = "" ;
      AV187TFBarFasDsc2 = "" ;
      AV188TFBarFasDsc2_Sel = "" ;
      AV262Pgmname = "" ;
      A377DisObsTxt = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A34AlbProfch = GXutil.nullDate() ;
      AV134BarAlbKgmE = DecimalUtil.ZERO ;
      AV135BarAlbMtrE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV140Tb1_dscfb = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV43ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A3746BarNPed = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A11852Nxt_ArtCl2 = "" ;
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A365DisDes = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV169BarFecGen_RangeText = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucBarfecgen_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV76DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV81DDO_BarFecEntAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV165DetailWebComponent = "" ;
      A279CliNom = "" ;
      A13696BarNHdr = "" ;
      AV138Accesorios = "" ;
      A120BarAgrEst = "" ;
      AV155BarEncCliGrid = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A157BarFecEnt = GXutil.nullDate() ;
      AV139ObsEnc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      AV130FasDscUlt = "" ;
      A1955BarFasSig = "" ;
      AV131FasDscSig = "" ;
      AV133AlbProFec = GXutil.nullDate() ;
      AV141Exportacion = "" ;
      AV142Marca = "" ;
      A9777BarItem3 = "" ;
      A13855BarGots = "" ;
      A13856BarGrs = "" ;
      A13857BarOcs = "" ;
      A13858BarRcs = "" ;
      A13859BarOeko = "" ;
      A13860BarAccesor = "" ;
      A13861BarMarca = "" ;
      A13863BarFasCod2 = "" ;
      A13864BarFasDsc2 = "" ;
      AV191Webwcnsprodds_1_barnhdr = "" ;
      AV192Webwcnsprodds_2_clinom = "" ;
      AV193Webwcnsprodds_3_barfecgen = GXutil.nullDate() ;
      AV194Webwcnsprodds_4_barfecgen_to = GXutil.nullDate() ;
      AV195Webwcnsprodds_5_barenccli = "" ;
      AV196Webwcnsprodds_6_barser = "" ;
      AV197Webwcnsprodds_7_barcolnom = "" ;
      AV202Webwcnsprodds_12_tfclinom = "" ;
      AV203Webwcnsprodds_13_tfclinom_sel = "" ;
      AV204Webwcnsprodds_14_tfbarnhdr = "" ;
      AV205Webwcnsprodds_15_tfbarnhdr_sel = "" ;
      AV206Webwcnsprodds_16_tfbaragrest = "" ;
      AV207Webwcnsprodds_17_tfbaragrest_sel = "" ;
      AV208Webwcnsprodds_18_tfbarser = "" ;
      AV209Webwcnsprodds_19_tfbarser_sel = "" ;
      AV210Webwcnsprodds_20_tfbarserdsc = "" ;
      AV211Webwcnsprodds_21_tfbarserdsc_sel = "" ;
      AV212Webwcnsprodds_22_tfbarfecgen = GXutil.nullDate() ;
      AV213Webwcnsprodds_23_tfbarfecent = GXutil.nullDate() ;
      AV214Webwcnsprodds_24_tfbarcolnom = "" ;
      AV215Webwcnsprodds_25_tfbarcolnom_sel = "" ;
      AV218Webwcnsprodds_28_tfbarnomcli = "" ;
      AV219Webwcnsprodds_29_tfbarnomcli_sel = "" ;
      AV222Webwcnsprodds_32_tfbarkgm = DecimalUtil.ZERO ;
      AV223Webwcnsprodds_33_tfbarkgm_to = DecimalUtil.ZERO ;
      AV224Webwcnsprodds_34_tfbarmtr = DecimalUtil.ZERO ;
      AV225Webwcnsprodds_35_tfbarmtr_to = DecimalUtil.ZERO ;
      AV230Webwcnsprodds_40_tfbarfascod = "" ;
      AV231Webwcnsprodds_41_tfbarfascod_sel = "" ;
      AV232Webwcnsprodds_42_tfbarfassig = "" ;
      AV233Webwcnsprodds_43_tfbarfassig_sel = "" ;
      AV236Webwcnsprodds_46_tfbaritem3 = "" ;
      AV237Webwcnsprodds_47_tfbaritem3_sel = "" ;
      AV240Webwcnsprodds_50_tfbargots = "" ;
      AV241Webwcnsprodds_51_tfbargots_sel = "" ;
      AV242Webwcnsprodds_52_tfbargrs = "" ;
      AV243Webwcnsprodds_53_tfbargrs_sel = "" ;
      AV244Webwcnsprodds_54_tfbarocs = "" ;
      AV245Webwcnsprodds_55_tfbarocs_sel = "" ;
      AV246Webwcnsprodds_56_tfbarrcs = "" ;
      AV247Webwcnsprodds_57_tfbarrcs_sel = "" ;
      AV248Webwcnsprodds_58_tfbaroeko = "" ;
      AV249Webwcnsprodds_59_tfbaroeko_sel = "" ;
      AV250Webwcnsprodds_60_tfbaraccesorios_sel = "" ;
      AV251Webwcnsprodds_61_tfbarmarca = "" ;
      AV252Webwcnsprodds_62_tfbarmarca_sel = "" ;
      AV255Webwcnsprodds_65_tfbarfascod2 = "" ;
      AV256Webwcnsprodds_66_tfbarfascod2_sel = "" ;
      AV257Webwcnsprodds_67_tfbarfasdsc2 = "" ;
      AV258Webwcnsprodds_68_tfbarfasdsc2_sel = "" ;
      scmdbuf = "" ;
      lV230Webwcnsprodds_40_tfbarfascod = "" ;
      lV232Webwcnsprodds_42_tfbarfassig = "" ;
      lV251Webwcnsprodds_61_tfbarmarca = "" ;
      lV255Webwcnsprodds_65_tfbarfascod2 = "" ;
      lV191Webwcnsprodds_1_barnhdr = "" ;
      lV192Webwcnsprodds_2_clinom = "" ;
      lV195Webwcnsprodds_5_barenccli = "" ;
      lV196Webwcnsprodds_6_barser = "" ;
      lV197Webwcnsprodds_7_barcolnom = "" ;
      lV202Webwcnsprodds_12_tfclinom = "" ;
      lV204Webwcnsprodds_14_tfbarnhdr = "" ;
      lV206Webwcnsprodds_16_tfbaragrest = "" ;
      lV208Webwcnsprodds_18_tfbarser = "" ;
      lV210Webwcnsprodds_20_tfbarserdsc = "" ;
      lV214Webwcnsprodds_24_tfbarcolnom = "" ;
      lV218Webwcnsprodds_28_tfbarnomcli = "" ;
      lV236Webwcnsprodds_46_tfbaritem3 = "" ;
      H00IU14_A9713Tb1_Cod = new short[1] ;
      H00IU14_A3746BarNPed = new String[] {""} ;
      H00IU14_A4812BarEncCli = new String[] {""} ;
      H00IU14_A143BarDisNum = new String[] {""} ;
      H00IU14_A11852Nxt_ArtCl2 = new String[] {""} ;
      H00IU14_A4466BarAcaAnh = new short[1] ;
      H00IU14_A218BarTipCol = new byte[1] ;
      H00IU14_A13769BarRdto4 = new short[1] ;
      H00IU14_n13769BarRdto4 = new boolean[] {false} ;
      H00IU14_A9777BarItem3 = new String[] {""} ;
      H00IU14_A1503BarPart = new short[1] ;
      H00IU14_A213BarSit = new byte[1] ;
      H00IU14_A1235BarNumCli = new int[1] ;
      H00IU14_A1234BarNomCli = new String[] {""} ;
      H00IU14_A136BarColNum = new int[1] ;
      H00IU14_A135BarColNom = new String[] {""} ;
      H00IU14_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00IU14_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00IU14_A1652BarSerDsc = new String[] {""} ;
      H00IU14_A212BarSer = new String[] {""} ;
      H00IU14_A120BarAgrEst = new String[] {""} ;
      H00IU14_A279CliNom = new String[] {""} ;
      H00IU14_A252CliCod = new int[1] ;
      H00IU14_n252CliCod = new boolean[] {false} ;
      H00IU14_A13862Bar_MacCod = new int[1] ;
      H00IU14_n13862Bar_MacCod = new boolean[] {false} ;
      H00IU14_A13861BarMarca = new String[] {""} ;
      H00IU14_n13861BarMarca = new boolean[] {false} ;
      H00IU14_A13860BarAccesor = new String[] {""} ;
      H00IU14_n13860BarAccesor = new boolean[] {false} ;
      H00IU14_A1955BarFasSig = new String[] {""} ;
      H00IU14_n1955BarFasSig = new boolean[] {false} ;
      H00IU14_A151BarFasCod = new String[] {""} ;
      H00IU14_n151BarFasCod = new boolean[] {false} ;
      H00IU14_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IU14_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IU14_A130BarCodPar = new String[] {""} ;
      H00IU14_A132BarCodReo = new byte[1] ;
      H00IU14_A129BarCod = new int[1] ;
      H00IU14_A199BarPie1 = new short[1] ;
      H00IU14_A365DisDes = new String[] {""} ;
      H00IU14_A898BarPieNDes = new int[1] ;
      H00IU14_A361DisCod = new int[1] ;
      H00IU14_A13863BarFasCod2 = new String[] {""} ;
      H00IU14_n13863BarFasCod2 = new boolean[] {false} ;
      H00IU14_A396EmprCod = new String[] {""} ;
      H00IU27_A9713Tb1_Cod = new short[1] ;
      H00IU27_A3746BarNPed = new String[] {""} ;
      H00IU27_A4812BarEncCli = new String[] {""} ;
      H00IU27_A143BarDisNum = new String[] {""} ;
      H00IU27_A11852Nxt_ArtCl2 = new String[] {""} ;
      H00IU27_A4466BarAcaAnh = new short[1] ;
      H00IU27_A218BarTipCol = new byte[1] ;
      H00IU27_A13769BarRdto4 = new short[1] ;
      H00IU27_n13769BarRdto4 = new boolean[] {false} ;
      H00IU27_A9777BarItem3 = new String[] {""} ;
      H00IU27_A1503BarPart = new short[1] ;
      H00IU27_A213BarSit = new byte[1] ;
      H00IU27_A1235BarNumCli = new int[1] ;
      H00IU27_A1234BarNomCli = new String[] {""} ;
      H00IU27_A136BarColNum = new int[1] ;
      H00IU27_A135BarColNom = new String[] {""} ;
      H00IU27_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00IU27_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00IU27_A1652BarSerDsc = new String[] {""} ;
      H00IU27_A212BarSer = new String[] {""} ;
      H00IU27_A120BarAgrEst = new String[] {""} ;
      H00IU27_A279CliNom = new String[] {""} ;
      H00IU27_A252CliCod = new int[1] ;
      H00IU27_n252CliCod = new boolean[] {false} ;
      H00IU27_A13862Bar_MacCod = new int[1] ;
      H00IU27_n13862Bar_MacCod = new boolean[] {false} ;
      H00IU27_A13861BarMarca = new String[] {""} ;
      H00IU27_n13861BarMarca = new boolean[] {false} ;
      H00IU27_A13860BarAccesor = new String[] {""} ;
      H00IU27_n13860BarAccesor = new boolean[] {false} ;
      H00IU27_A1955BarFasSig = new String[] {""} ;
      H00IU27_n1955BarFasSig = new boolean[] {false} ;
      H00IU27_A151BarFasCod = new String[] {""} ;
      H00IU27_n151BarFasCod = new boolean[] {false} ;
      H00IU27_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IU27_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IU27_A130BarCodPar = new String[] {""} ;
      H00IU27_A132BarCodReo = new byte[1] ;
      H00IU27_A129BarCod = new int[1] ;
      H00IU27_A199BarPie1 = new short[1] ;
      H00IU27_A365DisDes = new String[] {""} ;
      H00IU27_A898BarPieNDes = new int[1] ;
      H00IU27_A361DisCod = new int[1] ;
      H00IU27_A13863BarFasCod2 = new String[] {""} ;
      H00IU27_n13863BarFasCod2 = new boolean[] {false} ;
      H00IU27_A396EmprCod = new String[] {""} ;
      AV5Station = "" ;
      AV6EmprCod = "" ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      AV11HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV42Session = httpContext.getWebSession();
      AV38ColumnsSelectorXML = "" ;
      H00IU28_A396EmprCod = new String[] {""} ;
      H00IU28_A361DisCod = new int[1] ;
      H00IU28_A377DisObsTxt = new String[] {""} ;
      H00IU28_A376DisObsLin = new byte[1] ;
      H00IU29_A396EmprCod = new String[] {""} ;
      H00IU29_A129BarCod = new int[1] ;
      H00IU29_A132BarCodReo = new byte[1] ;
      H00IU29_A130BarCodPar = new String[] {""} ;
      H00IU29_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H00IU29_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IU29_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IU29_A1265BarAlbPie = new int[1] ;
      H00IU29_A30AlbProCod = new long[1] ;
      H00IU30_A396EmprCod = new String[] {""} ;
      H00IU30_A129BarCod = new int[1] ;
      H00IU30_A132BarCodReo = new byte[1] ;
      H00IU30_A130BarCodPar = new String[] {""} ;
      H00IU30_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IU30_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H00IU30_A30AlbProCod = new long[1] ;
      GXv_int8 = new int[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int13 = new long[1] ;
      GXv_int9 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new short[1] ;
      GXv_int16 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV44ManageFiltersXml = "" ;
      AV36ExcelFilename = "" ;
      AV37ErrorMessage = "" ;
      AV39UserCustomValue = "" ;
      AV41ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector19 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector20 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = new GXBaseCollection[1] ;
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char55 = "" ;
      GXv_char56 = new String[1] ;
      GXt_char53 = "" ;
      GXv_char54 = new String[1] ;
      GXt_char51 = "" ;
      GXv_char52 = new String[1] ;
      GXt_char49 = "" ;
      GXv_char50 = new String[1] ;
      GXt_char47 = "" ;
      GXv_char48 = new String[1] ;
      GXt_char45 = "" ;
      GXv_char46 = new String[1] ;
      GXt_char43 = "" ;
      GXv_char44 = new String[1] ;
      GXt_char41 = "" ;
      GXv_char42 = new String[1] ;
      GXt_char39 = "" ;
      GXv_char40 = new String[1] ;
      GXt_char37 = "" ;
      GXv_char38 = new String[1] ;
      GXt_char35 = "" ;
      GXv_char36 = new String[1] ;
      GXt_char33 = "" ;
      GXv_char34 = new String[1] ;
      GXt_char31 = "" ;
      GXv_char32 = new String[1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState57 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      lblBarsit_rangemiddletext_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwcnsprod__default(),
         new Object[] {
             new Object[] {
            H00IU14_A9713Tb1_Cod, H00IU14_A3746BarNPed, H00IU14_A4812BarEncCli, H00IU14_A143BarDisNum, H00IU14_A11852Nxt_ArtCl2, H00IU14_A4466BarAcaAnh, H00IU14_A218BarTipCol, H00IU14_A13769BarRdto4, H00IU14_n13769BarRdto4, H00IU14_A9777BarItem3,
            H00IU14_A1503BarPart, H00IU14_A213BarSit, H00IU14_A1235BarNumCli, H00IU14_A1234BarNomCli, H00IU14_A136BarColNum, H00IU14_A135BarColNom, H00IU14_A157BarFecEnt, H00IU14_A159BarFecGen, H00IU14_A1652BarSerDsc, H00IU14_A212BarSer,
            H00IU14_A120BarAgrEst, H00IU14_A279CliNom, H00IU14_A252CliCod, H00IU14_n252CliCod, H00IU14_A13862Bar_MacCod, H00IU14_n13862Bar_MacCod, H00IU14_A13861BarMarca, H00IU14_n13861BarMarca, H00IU14_A13860BarAccesor, H00IU14_n13860BarAccesor,
            H00IU14_A1955BarFasSig, H00IU14_n1955BarFasSig, H00IU14_A151BarFasCod, H00IU14_n151BarFasCod, H00IU14_A184BarMtr, H00IU14_A166BarKgm, H00IU14_A130BarCodPar, H00IU14_A132BarCodReo, H00IU14_A129BarCod, H00IU14_A199BarPie1,
            H00IU14_A365DisDes, H00IU14_A898BarPieNDes, H00IU14_A361DisCod, H00IU14_A13863BarFasCod2, H00IU14_n13863BarFasCod2, H00IU14_A396EmprCod
            }
            , new Object[] {
            H00IU27_A9713Tb1_Cod, H00IU27_A3746BarNPed, H00IU27_A4812BarEncCli, H00IU27_A143BarDisNum, H00IU27_A11852Nxt_ArtCl2, H00IU27_A4466BarAcaAnh, H00IU27_A218BarTipCol, H00IU27_A13769BarRdto4, H00IU27_n13769BarRdto4, H00IU27_A9777BarItem3,
            H00IU27_A1503BarPart, H00IU27_A213BarSit, H00IU27_A1235BarNumCli, H00IU27_A1234BarNomCli, H00IU27_A136BarColNum, H00IU27_A135BarColNom, H00IU27_A157BarFecEnt, H00IU27_A159BarFecGen, H00IU27_A1652BarSerDsc, H00IU27_A212BarSer,
            H00IU27_A120BarAgrEst, H00IU27_A279CliNom, H00IU27_A252CliCod, H00IU27_n252CliCod, H00IU27_A13862Bar_MacCod, H00IU27_n13862Bar_MacCod, H00IU27_A13861BarMarca, H00IU27_n13861BarMarca, H00IU27_A13860BarAccesor, H00IU27_n13860BarAccesor,
            H00IU27_A1955BarFasSig, H00IU27_n1955BarFasSig, H00IU27_A151BarFasCod, H00IU27_n151BarFasCod, H00IU27_A184BarMtr, H00IU27_A166BarKgm, H00IU27_A130BarCodPar, H00IU27_A132BarCodReo, H00IU27_A129BarCod, H00IU27_A199BarPie1,
            H00IU27_A365DisDes, H00IU27_A898BarPieNDes, H00IU27_A361DisCod, H00IU27_A13863BarFasCod2, H00IU27_n13863BarFasCod2, H00IU27_A396EmprCod
            }
            , new Object[] {
            H00IU28_A396EmprCod, H00IU28_A361DisCod, H00IU28_A377DisObsTxt, H00IU28_A376DisObsLin
            }
            , new Object[] {
            H00IU29_A396EmprCod, H00IU29_A129BarCod, H00IU29_A132BarCodReo, H00IU29_A130BarCodPar, H00IU29_A34AlbProfch, H00IU29_A1261BarAlbKgmE, H00IU29_A1263BarAlbMtrE, H00IU29_A1265BarAlbPie, H00IU29_A30AlbProCod
            }
            , new Object[] {
            H00IU30_A396EmprCod, H00IU30_A129BarCod, H00IU30_A132BarCodReo, H00IU30_A130BarCodPar, H00IU30_A1261BarAlbKgmE, H00IU30_A34AlbProfch, H00IU30_A30AlbProCod
            }
         }
      );
      AV262Pgmname = "WebWCnsProd" ;
      /* GeneXus formulas. */
      AV262Pgmname = "WebWCnsProd" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavBarmaccod_Enabled = 0 ;
      edtavAccesorios_Enabled = 0 ;
      edtavBarenccligrid_Enabled = 0 ;
      edtavObsenc_Enabled = 0 ;
      edtavFasdscult_Enabled = 0 ;
      edtavFasdscsig_Enabled = 0 ;
      edtavAlbprocod_Enabled = 0 ;
      edtavAlbprofec_Enabled = 0 ;
      edtavBaralbkgme_Enabled = 0 ;
      edtavBaralbmtre_Enabled = 0 ;
      edtavBaralbpie_Enabled = 0 ;
      edtavExportacion_Enabled = 0 ;
      edtavMarca_Enabled = 0 ;
      edtavForrgb_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV115BarSit ;
   private byte AV116BarSit_To ;
   private byte AV45ManageFiltersExecutionStep ;
   private byte AV105TFBarSit ;
   private byte AV106TFBarSit_To ;
   private byte A376DisObsLin ;
   private byte gxajaxcallmode ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte nDonePA ;
   private byte AV198Webwcnsprodds_8_barsit ;
   private byte AV199Webwcnsprodds_9_barsit_to ;
   private byte AV228Webwcnsprodds_38_tfbarsit ;
   private byte AV229Webwcnsprodds_39_tfbarsit_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int12[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV145TFBarPart ;
   private short AV146TFBarPart_To ;
   private short AV166TFBarRdto4 ;
   private short AV167TFBarRdto4_To ;
   private short AV54OrderedBy ;
   private short A4466BarAcaAnh ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A1503BarPart ;
   private short A13769BarRdto4 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV234Webwcnsprodds_44_tfbarpart ;
   private short AV235Webwcnsprodds_45_tfbarpart_to ;
   private short AV238Webwcnsprodds_48_tfbarrdto4 ;
   private short AV239Webwcnsprodds_49_tfbarrdto4_to ;
   private short AV162R ;
   private short GXv_int9[] ;
   private short AV160G ;
   private short GXv_int14[] ;
   private short AV158B ;
   private short GXv_int15[] ;
   private short AV163R2 ;
   private short GXv_int16[] ;
   private short AV161G2 ;
   private short GXv_int17[] ;
   private short AV159B2 ;
   private short GXv_int18[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_71 ;
   private int nGXsfl_71_idx=1 ;
   private int AV59TFCliCod ;
   private int AV60TFCliCod_To ;
   private int AV87TFBarColNum ;
   private int AV88TFBarColNum_To ;
   private int AV93TFBarNumCli ;
   private int AV94TFBarNumCli_To ;
   private int AV102TFBarPie ;
   private int AV103TFBarPie_To ;
   private int AV183TFBar_MacCod ;
   private int AV184TFBar_MacCod_To ;
   private int AV136BarAlbPie ;
   private int A1265BarAlbPie ;
   private int A898BarPieNDes ;
   private int A361DisCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarnhdr_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarfecgen_rangetext_Enabled ;
   private int edtavBarenccli_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A129BarCod ;
   private int A198BarPie ;
   private int A13862Bar_MacCod ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavBarmaccod_Enabled ;
   private int edtavAccesorios_Enabled ;
   private int edtavBarenccligrid_Enabled ;
   private int edtavObsenc_Enabled ;
   private int edtavFasdscult_Enabled ;
   private int edtavFasdscsig_Enabled ;
   private int edtavAlbprocod_Enabled ;
   private int edtavAlbprofec_Enabled ;
   private int edtavBaralbkgme_Enabled ;
   private int edtavBaralbmtre_Enabled ;
   private int edtavBaralbpie_Enabled ;
   private int edtavExportacion_Enabled ;
   private int edtavMarca_Enabled ;
   private int edtavForrgb_Enabled ;
   private int AV200Webwcnsprodds_10_tfclicod ;
   private int AV201Webwcnsprodds_11_tfclicod_to ;
   private int AV216Webwcnsprodds_26_tfbarcolnum ;
   private int AV217Webwcnsprodds_27_tfbarcolnum_to ;
   private int AV220Webwcnsprodds_30_tfbarnumcli ;
   private int AV221Webwcnsprodds_31_tfbarnumcli_to ;
   private int AV226Webwcnsprodds_36_tfbarpie ;
   private int AV227Webwcnsprodds_37_tfbarpie_to ;
   private int AV253Webwcnsprodds_63_tfbar_maccod ;
   private int AV254Webwcnsprodds_64_tfbar_maccod_to ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtavBarmaccod_Visible ;
   private int edtavAccesorios_Visible ;
   private int edtBarAgrEst_Visible ;
   private int edtavBarenccligrid_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarFecEnt_Visible ;
   private int edtavObsenc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarNumCli_Visible ;
   private int edtBarKgm_Visible ;
   private int edtBarMtr_Visible ;
   private int edtBarPie_Visible ;
   private int edtBarSit_Visible ;
   private int edtBarFasCod_Visible ;
   private int edtavFasdscult_Visible ;
   private int edtBarFasSig_Visible ;
   private int edtavFasdscsig_Visible ;
   private int edtavAlbprocod_Visible ;
   private int edtavAlbprofec_Visible ;
   private int edtavBaralbkgme_Visible ;
   private int edtavBaralbmtre_Visible ;
   private int edtavBaralbpie_Visible ;
   private int edtavExportacion_Visible ;
   private int edtavMarca_Visible ;
   private int edtBarPart_Visible ;
   private int edtBarItem3_Visible ;
   private int edtBarRdto4_Visible ;
   private int edtBarGots_Visible ;
   private int edtBarGrs_Visible ;
   private int edtBarOcs_Visible ;
   private int edtBarRcs_Visible ;
   private int edtBarOeko_Visible ;
   private int edtBarMarca_Visible ;
   private int edtBar_MacCod_Visible ;
   private int edtBarFasCod2_Visible ;
   private int edtBarFasDsc2_Visible ;
   private int AV51PageToGo ;
   private int AV137Maccod ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int edtBarNomCli_Backcolor ;
   private int edtBarNomCli_Forecolor ;
   private int AV263GXV1 ;
   private int edtavBarsit_Enabled ;
   private int edtavBarsit_to_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavForrgb_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A30AlbProCod ;
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
   private long AV143BarMacCod ;
   private long AV132AlbProcod ;
   private long AV164ForRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXt_int10 ;
   private long GXv_int13[] ;
   private java.math.BigDecimal AV96TFBarKgm ;
   private java.math.BigDecimal AV97TFBarKgm_To ;
   private java.math.BigDecimal AV99TFBarMtr ;
   private java.math.BigDecimal AV100TFBarMtr_To ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV134BarAlbKgmE ;
   private java.math.BigDecimal AV135BarAlbMtrE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV222Webwcnsprodds_32_tfbarkgm ;
   private java.math.BigDecimal AV223Webwcnsprodds_33_tfbarkgm_to ;
   private java.math.BigDecimal AV224Webwcnsprodds_34_tfbarmtr ;
   private java.math.BigDecimal AV225Webwcnsprodds_35_tfbarmtr_to ;
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
   private String sGXsfl_71_idx="0001" ;
   private String AV157BarNHdr ;
   private String AV118CliNom ;
   private String AV57BarEncCli ;
   private String AV152BarSer ;
   private String AV154BarColNom ;
   private String AV62TFCliNom ;
   private String AV63TFCliNom_Sel ;
   private String AV47TFBarNHdr ;
   private String AV48TFBarNHdr_Sel ;
   private String AV65TFBarAgrEst ;
   private String AV66TFBarAgrEst_Sel ;
   private String AV68TFBarSer ;
   private String AV69TFBarSer_Sel ;
   private String AV71TFBarSerDsc ;
   private String AV72TFBarSerDsc_Sel ;
   private String AV84TFBarColNom ;
   private String AV85TFBarColNom_Sel ;
   private String AV90TFBarNomCli ;
   private String AV91TFBarNomCli_Sel ;
   private String AV125TFBarFasCod ;
   private String AV126TFBarFasCod_Sel ;
   private String AV128TFBarFasSig ;
   private String AV129TFBarFasSig_Sel ;
   private String AV148TFBarItem3 ;
   private String AV149TFBarItem3_Sel ;
   private String AV170TFBarGots ;
   private String AV171TFBarGots_Sel ;
   private String AV172TFBarGrs ;
   private String AV173TFBarGrs_Sel ;
   private String AV174TFBarOcs ;
   private String AV175TFBarOcs_Sel ;
   private String AV176TFBarRcs ;
   private String AV177TFBarRcs_Sel ;
   private String AV178TFBarOeko ;
   private String AV179TFBarOeko_Sel ;
   private String AV180TFBarAccesorios_Sel ;
   private String AV181TFBarMarca ;
   private String AV182TFBarMarca_Sel ;
   private String AV185TFBarFasCod2 ;
   private String AV186TFBarFasCod2_Sel ;
   private String AV187TFBarFasDsc2 ;
   private String AV188TFBarFasDsc2_Sel ;
   private String AV262Pgmname ;
   private String A377DisObsTxt ;
   private String AV140Tb1_dscfb ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A3746BarNPed ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A11852Nxt_ArtCl2 ;
   private String A365DisDes ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablemain_Class ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarfecgen_rangetext_Internalname ;
   private String edtavBarfecgen_rangetext_Jsonclick ;
   private String edtavBarenccli_Internalname ;
   private String edtavBarenccli_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Barfecgen_rangepicker_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfecgenauxdates_Internalname ;
   private String edtavDdo_barfecgenauxdate_Internalname ;
   private String edtavDdo_barfecgenauxdate_Jsonclick ;
   private String divDdo_barfecentauxdates_Internalname ;
   private String edtavDdo_barfecentauxdate_Internalname ;
   private String edtavDdo_barfecentauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV165DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtavBarmaccod_Internalname ;
   private String AV138Accesorios ;
   private String edtavAccesorios_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Internalname ;
   private String AV155BarEncCliGrid ;
   private String edtavBarenccligrid_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecEnt_Internalname ;
   private String edtavObsenc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarNumCli_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarSit_Internalname ;
   private String A151BarFasCod ;
   private String edtBarFasCod_Internalname ;
   private String AV130FasDscUlt ;
   private String edtavFasdscult_Internalname ;
   private String A1955BarFasSig ;
   private String edtBarFasSig_Internalname ;
   private String AV131FasDscSig ;
   private String edtavFasdscsig_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprofec_Internalname ;
   private String edtavBaralbkgme_Internalname ;
   private String edtavBaralbmtre_Internalname ;
   private String edtavBaralbpie_Internalname ;
   private String AV141Exportacion ;
   private String edtavExportacion_Internalname ;
   private String AV142Marca ;
   private String edtavMarca_Internalname ;
   private String edtBarPart_Internalname ;
   private String A9777BarItem3 ;
   private String edtBarItem3_Internalname ;
   private String edtBarRdto4_Internalname ;
   private String A13855BarGots ;
   private String edtBarGots_Internalname ;
   private String A13856BarGrs ;
   private String edtBarGrs_Internalname ;
   private String A13857BarOcs ;
   private String edtBarOcs_Internalname ;
   private String A13858BarRcs ;
   private String edtBarRcs_Internalname ;
   private String A13859BarOeko ;
   private String edtBarOeko_Internalname ;
   private String A13860BarAccesor ;
   private String A13861BarMarca ;
   private String edtBarMarca_Internalname ;
   private String edtBar_MacCod_Internalname ;
   private String A13863BarFasCod2 ;
   private String edtBarFasCod2_Internalname ;
   private String A13864BarFasDsc2 ;
   private String edtBarFasDsc2_Internalname ;
   private String edtavForrgb_Internalname ;
   private String AV191Webwcnsprodds_1_barnhdr ;
   private String AV192Webwcnsprodds_2_clinom ;
   private String AV195Webwcnsprodds_5_barenccli ;
   private String AV196Webwcnsprodds_6_barser ;
   private String AV197Webwcnsprodds_7_barcolnom ;
   private String AV202Webwcnsprodds_12_tfclinom ;
   private String AV203Webwcnsprodds_13_tfclinom_sel ;
   private String AV204Webwcnsprodds_14_tfbarnhdr ;
   private String AV205Webwcnsprodds_15_tfbarnhdr_sel ;
   private String AV206Webwcnsprodds_16_tfbaragrest ;
   private String AV207Webwcnsprodds_17_tfbaragrest_sel ;
   private String AV208Webwcnsprodds_18_tfbarser ;
   private String AV209Webwcnsprodds_19_tfbarser_sel ;
   private String AV210Webwcnsprodds_20_tfbarserdsc ;
   private String AV211Webwcnsprodds_21_tfbarserdsc_sel ;
   private String AV214Webwcnsprodds_24_tfbarcolnom ;
   private String AV215Webwcnsprodds_25_tfbarcolnom_sel ;
   private String AV218Webwcnsprodds_28_tfbarnomcli ;
   private String AV219Webwcnsprodds_29_tfbarnomcli_sel ;
   private String AV230Webwcnsprodds_40_tfbarfascod ;
   private String AV231Webwcnsprodds_41_tfbarfascod_sel ;
   private String AV232Webwcnsprodds_42_tfbarfassig ;
   private String AV233Webwcnsprodds_43_tfbarfassig_sel ;
   private String AV236Webwcnsprodds_46_tfbaritem3 ;
   private String AV237Webwcnsprodds_47_tfbaritem3_sel ;
   private String AV240Webwcnsprodds_50_tfbargots ;
   private String AV241Webwcnsprodds_51_tfbargots_sel ;
   private String AV242Webwcnsprodds_52_tfbargrs ;
   private String AV243Webwcnsprodds_53_tfbargrs_sel ;
   private String AV244Webwcnsprodds_54_tfbarocs ;
   private String AV245Webwcnsprodds_55_tfbarocs_sel ;
   private String AV246Webwcnsprodds_56_tfbarrcs ;
   private String AV247Webwcnsprodds_57_tfbarrcs_sel ;
   private String AV248Webwcnsprodds_58_tfbaroeko ;
   private String AV249Webwcnsprodds_59_tfbaroeko_sel ;
   private String AV250Webwcnsprodds_60_tfbaraccesorios_sel ;
   private String AV251Webwcnsprodds_61_tfbarmarca ;
   private String AV252Webwcnsprodds_62_tfbarmarca_sel ;
   private String AV255Webwcnsprodds_65_tfbarfascod2 ;
   private String AV256Webwcnsprodds_66_tfbarfascod2_sel ;
   private String AV257Webwcnsprodds_67_tfbarfasdsc2 ;
   private String AV258Webwcnsprodds_68_tfbarfasdsc2_sel ;
   private String scmdbuf ;
   private String lV230Webwcnsprodds_40_tfbarfascod ;
   private String lV232Webwcnsprodds_42_tfbarfassig ;
   private String lV251Webwcnsprodds_61_tfbarmarca ;
   private String lV255Webwcnsprodds_65_tfbarfascod2 ;
   private String lV191Webwcnsprodds_1_barnhdr ;
   private String lV192Webwcnsprodds_2_clinom ;
   private String lV195Webwcnsprodds_5_barenccli ;
   private String lV196Webwcnsprodds_6_barser ;
   private String lV197Webwcnsprodds_7_barcolnom ;
   private String lV202Webwcnsprodds_12_tfclinom ;
   private String lV204Webwcnsprodds_14_tfbarnhdr ;
   private String lV206Webwcnsprodds_16_tfbaragrest ;
   private String lV208Webwcnsprodds_18_tfbarser ;
   private String lV210Webwcnsprodds_20_tfbarserdsc ;
   private String lV214Webwcnsprodds_24_tfbarcolnom ;
   private String lV218Webwcnsprodds_28_tfbarnomcli ;
   private String lV236Webwcnsprodds_46_tfbaritem3 ;
   private String edtavBarsit_Internalname ;
   private String edtavBarsit_to_Internalname ;
   private String AV5Station ;
   private String AV6EmprCod ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char55 ;
   private String GXv_char56[] ;
   private String GXt_char53 ;
   private String GXv_char54[] ;
   private String GXt_char51 ;
   private String GXv_char52[] ;
   private String GXt_char49 ;
   private String GXv_char50[] ;
   private String GXt_char47 ;
   private String GXv_char48[] ;
   private String GXt_char45 ;
   private String GXv_char46[] ;
   private String GXt_char43 ;
   private String GXv_char44[] ;
   private String GXt_char41 ;
   private String GXv_char42[] ;
   private String GXt_char39 ;
   private String GXv_char40[] ;
   private String GXt_char37 ;
   private String GXv_char38[] ;
   private String GXt_char35 ;
   private String GXv_char36[] ;
   private String GXt_char33 ;
   private String GXv_char34[] ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char24 ;
   private String GXv_char4[] ;
   private String GXt_char23 ;
   private String GXv_char3[] ;
   private String tblTablemergedbarsit_Internalname ;
   private String edtavBarsit_Jsonclick ;
   private String lblBarsit_rangemiddletext_Internalname ;
   private String lblBarsit_rangemiddletext_Jsonclick ;
   private String edtavBarsit_to_Jsonclick ;
   private String sGXsfl_71_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtavBarmaccod_Jsonclick ;
   private String edtavAccesorios_Jsonclick ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtavBarenccligrid_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarFecEnt_Jsonclick ;
   private String edtavObsenc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarNumCli_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarFasCod_Jsonclick ;
   private String edtavFasdscult_Jsonclick ;
   private String edtBarFasSig_Jsonclick ;
   private String edtavFasdscsig_Jsonclick ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavAlbprofec_Jsonclick ;
   private String edtavBaralbkgme_Jsonclick ;
   private String edtavBaralbmtre_Jsonclick ;
   private String edtavBaralbpie_Jsonclick ;
   private String edtavExportacion_Jsonclick ;
   private String edtavMarca_Jsonclick ;
   private String edtBarPart_Jsonclick ;
   private String edtBarItem3_Jsonclick ;
   private String edtBarRdto4_Jsonclick ;
   private String edtBarGots_Jsonclick ;
   private String edtBarGrs_Jsonclick ;
   private String edtBarOcs_Jsonclick ;
   private String edtBarRcs_Jsonclick ;
   private String edtBarOeko_Jsonclick ;
   private String GXCCtl ;
   private String edtBarMarca_Jsonclick ;
   private String edtBar_MacCod_Jsonclick ;
   private String edtBarFasCod2_Jsonclick ;
   private String edtBarFasDsc2_Jsonclick ;
   private String edtavForrgb_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV113BarFecGen ;
   private java.util.Date AV114BarFecGen_To ;
   private java.util.Date AV74TFBarFecGen ;
   private java.util.Date AV79TFBarFecEnt ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV76DDO_BarFecGenAuxDate ;
   private java.util.Date AV81DDO_BarFecEntAuxDate ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A157BarFecEnt ;
   private java.util.Date AV133AlbProFec ;
   private java.util.Date AV193Webwcnsprodds_3_barfecgen ;
   private java.util.Date AV194Webwcnsprodds_4_barfecgen_to ;
   private java.util.Date AV212Webwcnsprodds_22_tfbarfecgen ;
   private java.util.Date AV213Webwcnsprodds_23_tfbarfecent ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV55OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_71_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean n151BarFasCod ;
   private boolean n1955BarFasSig ;
   private boolean n13769BarRdto4 ;
   private boolean n13860BarAccesor ;
   private boolean n13861BarMarca ;
   private boolean n13862Bar_MacCod ;
   private boolean n13863BarFasCod2 ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV38ColumnsSelectorXML ;
   private String AV44ManageFiltersXml ;
   private String AV39UserCustomValue ;
   private String AV169BarFecGen_RangeText ;
   private String AV139ObsEnc ;
   private String AV36ExcelFilename ;
   private String AV37ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private com.genexus.webpanels.WebSession AV42Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucBarfecgen_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private ICheckbox chkBarAccesor ;
   private IDataStoreProvider pr_default ;
   private short[] H00IU14_A9713Tb1_Cod ;
   private String[] H00IU14_A3746BarNPed ;
   private String[] H00IU14_A4812BarEncCli ;
   private String[] H00IU14_A143BarDisNum ;
   private String[] H00IU14_A11852Nxt_ArtCl2 ;
   private short[] H00IU14_A4466BarAcaAnh ;
   private byte[] H00IU14_A218BarTipCol ;
   private short[] H00IU14_A13769BarRdto4 ;
   private boolean[] H00IU14_n13769BarRdto4 ;
   private String[] H00IU14_A9777BarItem3 ;
   private short[] H00IU14_A1503BarPart ;
   private byte[] H00IU14_A213BarSit ;
   private int[] H00IU14_A1235BarNumCli ;
   private String[] H00IU14_A1234BarNomCli ;
   private int[] H00IU14_A136BarColNum ;
   private String[] H00IU14_A135BarColNom ;
   private java.util.Date[] H00IU14_A157BarFecEnt ;
   private java.util.Date[] H00IU14_A159BarFecGen ;
   private String[] H00IU14_A1652BarSerDsc ;
   private String[] H00IU14_A212BarSer ;
   private String[] H00IU14_A120BarAgrEst ;
   private String[] H00IU14_A279CliNom ;
   private int[] H00IU14_A252CliCod ;
   private boolean[] H00IU14_n252CliCod ;
   private int[] H00IU14_A13862Bar_MacCod ;
   private boolean[] H00IU14_n13862Bar_MacCod ;
   private String[] H00IU14_A13861BarMarca ;
   private boolean[] H00IU14_n13861BarMarca ;
   private String[] H00IU14_A13860BarAccesor ;
   private boolean[] H00IU14_n13860BarAccesor ;
   private String[] H00IU14_A1955BarFasSig ;
   private boolean[] H00IU14_n1955BarFasSig ;
   private String[] H00IU14_A151BarFasCod ;
   private boolean[] H00IU14_n151BarFasCod ;
   private java.math.BigDecimal[] H00IU14_A184BarMtr ;
   private java.math.BigDecimal[] H00IU14_A166BarKgm ;
   private String[] H00IU14_A130BarCodPar ;
   private byte[] H00IU14_A132BarCodReo ;
   private int[] H00IU14_A129BarCod ;
   private short[] H00IU14_A199BarPie1 ;
   private String[] H00IU14_A365DisDes ;
   private int[] H00IU14_A898BarPieNDes ;
   private int[] H00IU14_A361DisCod ;
   private String[] H00IU14_A13863BarFasCod2 ;
   private boolean[] H00IU14_n13863BarFasCod2 ;
   private String[] H00IU14_A396EmprCod ;
   private short[] H00IU27_A9713Tb1_Cod ;
   private String[] H00IU27_A3746BarNPed ;
   private String[] H00IU27_A4812BarEncCli ;
   private String[] H00IU27_A143BarDisNum ;
   private String[] H00IU27_A11852Nxt_ArtCl2 ;
   private short[] H00IU27_A4466BarAcaAnh ;
   private byte[] H00IU27_A218BarTipCol ;
   private short[] H00IU27_A13769BarRdto4 ;
   private boolean[] H00IU27_n13769BarRdto4 ;
   private String[] H00IU27_A9777BarItem3 ;
   private short[] H00IU27_A1503BarPart ;
   private byte[] H00IU27_A213BarSit ;
   private int[] H00IU27_A1235BarNumCli ;
   private String[] H00IU27_A1234BarNomCli ;
   private int[] H00IU27_A136BarColNum ;
   private String[] H00IU27_A135BarColNom ;
   private java.util.Date[] H00IU27_A157BarFecEnt ;
   private java.util.Date[] H00IU27_A159BarFecGen ;
   private String[] H00IU27_A1652BarSerDsc ;
   private String[] H00IU27_A212BarSer ;
   private String[] H00IU27_A120BarAgrEst ;
   private String[] H00IU27_A279CliNom ;
   private int[] H00IU27_A252CliCod ;
   private boolean[] H00IU27_n252CliCod ;
   private int[] H00IU27_A13862Bar_MacCod ;
   private boolean[] H00IU27_n13862Bar_MacCod ;
   private String[] H00IU27_A13861BarMarca ;
   private boolean[] H00IU27_n13861BarMarca ;
   private String[] H00IU27_A13860BarAccesor ;
   private boolean[] H00IU27_n13860BarAccesor ;
   private String[] H00IU27_A1955BarFasSig ;
   private boolean[] H00IU27_n1955BarFasSig ;
   private String[] H00IU27_A151BarFasCod ;
   private boolean[] H00IU27_n151BarFasCod ;
   private java.math.BigDecimal[] H00IU27_A184BarMtr ;
   private java.math.BigDecimal[] H00IU27_A166BarKgm ;
   private String[] H00IU27_A130BarCodPar ;
   private byte[] H00IU27_A132BarCodReo ;
   private int[] H00IU27_A129BarCod ;
   private short[] H00IU27_A199BarPie1 ;
   private String[] H00IU27_A365DisDes ;
   private int[] H00IU27_A898BarPieNDes ;
   private int[] H00IU27_A361DisCod ;
   private String[] H00IU27_A13863BarFasCod2 ;
   private boolean[] H00IU27_n13863BarFasCod2 ;
   private String[] H00IU27_A396EmprCod ;
   private String[] H00IU28_A396EmprCod ;
   private int[] H00IU28_A361DisCod ;
   private String[] H00IU28_A377DisObsTxt ;
   private byte[] H00IU28_A376DisObsLin ;
   private String[] H00IU29_A396EmprCod ;
   private int[] H00IU29_A129BarCod ;
   private byte[] H00IU29_A132BarCodReo ;
   private String[] H00IU29_A130BarCodPar ;
   private java.util.Date[] H00IU29_A34AlbProfch ;
   private java.math.BigDecimal[] H00IU29_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] H00IU29_A1263BarAlbMtrE ;
   private int[] H00IU29_A1265BarAlbPie ;
   private long[] H00IU29_A30AlbProCod ;
   private String[] H00IU30_A396EmprCod ;
   private int[] H00IU30_A129BarCod ;
   private byte[] H00IU30_A132BarCodReo ;
   private String[] H00IU30_A130BarCodPar ;
   private java.math.BigDecimal[] H00IU30_A1261BarAlbKgmE ;
   private java.util.Date[] H00IU30_A34AlbProfch ;
   private long[] H00IU30_A30AlbProCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV43ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item22[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV41ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector19[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector20[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState57[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class webwcnsprod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00IU14( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV191Webwcnsprodds_1_barnhdr ,
                                           String AV192Webwcnsprodds_2_clinom ,
                                           java.util.Date AV193Webwcnsprodds_3_barfecgen ,
                                           java.util.Date AV194Webwcnsprodds_4_barfecgen_to ,
                                           String AV195Webwcnsprodds_5_barenccli ,
                                           String AV196Webwcnsprodds_6_barser ,
                                           String AV197Webwcnsprodds_7_barcolnom ,
                                           byte AV198Webwcnsprodds_8_barsit ,
                                           byte AV199Webwcnsprodds_9_barsit_to ,
                                           int AV200Webwcnsprodds_10_tfclicod ,
                                           int AV201Webwcnsprodds_11_tfclicod_to ,
                                           String AV203Webwcnsprodds_13_tfclinom_sel ,
                                           String AV202Webwcnsprodds_12_tfclinom ,
                                           String AV205Webwcnsprodds_15_tfbarnhdr_sel ,
                                           String AV204Webwcnsprodds_14_tfbarnhdr ,
                                           String AV207Webwcnsprodds_17_tfbaragrest_sel ,
                                           String AV206Webwcnsprodds_16_tfbaragrest ,
                                           String AV209Webwcnsprodds_19_tfbarser_sel ,
                                           String AV208Webwcnsprodds_18_tfbarser ,
                                           String AV211Webwcnsprodds_21_tfbarserdsc_sel ,
                                           String AV210Webwcnsprodds_20_tfbarserdsc ,
                                           java.util.Date AV212Webwcnsprodds_22_tfbarfecgen ,
                                           java.util.Date AV213Webwcnsprodds_23_tfbarfecent ,
                                           String AV215Webwcnsprodds_25_tfbarcolnom_sel ,
                                           String AV214Webwcnsprodds_24_tfbarcolnom ,
                                           int AV216Webwcnsprodds_26_tfbarcolnum ,
                                           int AV217Webwcnsprodds_27_tfbarcolnum_to ,
                                           String AV219Webwcnsprodds_29_tfbarnomcli_sel ,
                                           String AV218Webwcnsprodds_28_tfbarnomcli ,
                                           int AV220Webwcnsprodds_30_tfbarnumcli ,
                                           int AV221Webwcnsprodds_31_tfbarnumcli_to ,
                                           java.math.BigDecimal AV222Webwcnsprodds_32_tfbarkgm ,
                                           java.math.BigDecimal AV223Webwcnsprodds_33_tfbarkgm_to ,
                                           java.math.BigDecimal AV224Webwcnsprodds_34_tfbarmtr ,
                                           java.math.BigDecimal AV225Webwcnsprodds_35_tfbarmtr_to ,
                                           byte AV228Webwcnsprodds_38_tfbarsit ,
                                           byte AV229Webwcnsprodds_39_tfbarsit_to ,
                                           short AV234Webwcnsprodds_44_tfbarpart ,
                                           short AV235Webwcnsprodds_45_tfbarpart_to ,
                                           String AV237Webwcnsprodds_47_tfbaritem3_sel ,
                                           String AV236Webwcnsprodds_46_tfbaritem3 ,
                                           short AV238Webwcnsprodds_48_tfbarrdto4 ,
                                           short AV239Webwcnsprodds_49_tfbarrdto4_to ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A279CliNom ,
                                           java.util.Date A159BarFecGen ,
                                           String A4812BarEncCli ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           byte A213BarSit ,
                                           int A252CliCod ,
                                           String A120BarAgrEst ,
                                           String A1652BarSerDsc ,
                                           java.util.Date A157BarFecEnt ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A1503BarPart ,
                                           String A9777BarItem3 ,
                                           short A13769BarRdto4 ,
                                           short AV54OrderedBy ,
                                           boolean AV55OrderedDsc ,
                                           int AV226Webwcnsprodds_36_tfbarpie ,
                                           int A198BarPie ,
                                           int AV227Webwcnsprodds_37_tfbarpie_to ,
                                           String AV231Webwcnsprodds_41_tfbarfascod_sel ,
                                           String AV230Webwcnsprodds_40_tfbarfascod ,
                                           String A151BarFasCod ,
                                           String AV233Webwcnsprodds_43_tfbarfassig_sel ,
                                           String AV232Webwcnsprodds_42_tfbarfassig ,
                                           String A1955BarFasSig ,
                                           String AV241Webwcnsprodds_51_tfbargots_sel ,
                                           String AV240Webwcnsprodds_50_tfbargots ,
                                           String A13855BarGots ,
                                           String AV243Webwcnsprodds_53_tfbargrs_sel ,
                                           String AV242Webwcnsprodds_52_tfbargrs ,
                                           String A13856BarGrs ,
                                           String AV245Webwcnsprodds_55_tfbarocs_sel ,
                                           String AV244Webwcnsprodds_54_tfbarocs ,
                                           String A13857BarOcs ,
                                           String AV247Webwcnsprodds_57_tfbarrcs_sel ,
                                           String AV246Webwcnsprodds_56_tfbarrcs ,
                                           String A13858BarRcs ,
                                           String AV249Webwcnsprodds_59_tfbaroeko_sel ,
                                           String AV248Webwcnsprodds_58_tfbaroeko ,
                                           String A13859BarOeko ,
                                           String AV250Webwcnsprodds_60_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV252Webwcnsprodds_62_tfbarmarca_sel ,
                                           String AV251Webwcnsprodds_61_tfbarmarca ,
                                           String A13861BarMarca ,
                                           int AV253Webwcnsprodds_63_tfbar_maccod ,
                                           int A13862Bar_MacCod ,
                                           int AV254Webwcnsprodds_64_tfbar_maccod_to ,
                                           String AV256Webwcnsprodds_66_tfbarfascod2_sel ,
                                           String AV255Webwcnsprodds_65_tfbarfascod2 ,
                                           String A13863BarFasCod2 ,
                                           String AV258Webwcnsprodds_68_tfbarfasdsc2_sel ,
                                           String AV257Webwcnsprodds_67_tfbarfasdsc2 ,
                                           String A13864BarFasDsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int58 = new byte[71];
      Object[] GXv_Object59 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarNPed, T1.BarEncCli, T1.BarDisNum, T1.Nxt_ArtCl2, T1.BarAcaAnh, T1.BarTipCol, T1.BarRdto4, T1.BarItem3, T1.BarPart, T1.BarSit, T1.BarNumCli," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarFecEnt, T1.BarFecGen, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T3.CliNom, T1.CliCod, COALESCE( T2.Bar_MacCod, 0) AS" ;
      scmdbuf += " Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarFasCod2, ' ') AS BarFasSig, COALESCE( T8.BarFasCod2," ;
      scmdbuf += " ' ') AS BarFasCod, COALESCE( T9.BarMtr, 0) AS BarMtr, COALESCE( T9.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T9.BarPie1, 0) AS BarPie1," ;
      scmdbuf += " T1.DisDes, COALESCE( T9.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((((TXPBARCAD T1 LEFT JOIN (SELECT" ;
      scmdbuf += " MIN(T10.MacCod) AS Bar_MacCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod" ;
      scmdbuf += " = ? and T10.MacBarCod = T11.BarCod and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T2 ON" ;
      scmdbuf += " T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM (TXPBARFAS T10 INNER JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod" ;
      scmdbuf += " AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin = T11.GXC1) AND (T10.BarFasEst = 2) GROUP" ;
      scmdbuf += " BY T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT COALESCE( T11.GXC2, 'N') AS BarAccesor, T10.EmprCod," ;
      scmdbuf += " T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM (TXPBARCAD T10 LEFT JOIN (SELECT MIN('S') AS GXC2, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPLMACRO T12 INNER" ;
      scmdbuf += " JOIN TXPBARCAD T13 ON T13.EmprCod = T12.EmprCod) WHERE T12.EmprCod = ? and T12.MacBarCod = T13.BarCod and T12.MacBarReo = T13.BarCodReo and T12.MacBarPar = T13.BarCodPar" ;
      scmdbuf += " GROUP BY T13.BarCod, T13.BarCodReo, T13.BarCodPar ) T11 ON T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) ) T6 ON" ;
      scmdbuf += " T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2," ;
      scmdbuf += " COALESCE( T11.BarFasLin, 0) AS BarFasLin, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM ((TXPBARFAS T10 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND" ;
      scmdbuf += " T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) INNER JOIN (SELECT MIN(T13.BarOrdLin) AS GXC4, COALESCE( T14.BarFasLin," ;
      scmdbuf += " 0) AS BarFasLin, T13.EmprCod, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPBARFAS T13 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T14 ON T14.EmprCod = T13.EmprCod AND T14.BarCod = T13.BarCod AND" ;
      scmdbuf += " T14.BarCodReo = T13.BarCodReo AND T14.BarCodPar = T13.BarCodPar) WHERE (T13.BarOrdLin >= 0) AND (T13.BarOrdLin > COALESCE( T14.BarFasLin, 0)) AND (T13.BarFasEst" ;
      scmdbuf += " = 0) GROUP BY T14.BarFasLin, T13.EmprCod, T13.BarCod, T13.BarCodReo, T13.BarCodPar ) T12 ON T12.EmprCod = T10.EmprCod AND T12.BarCod = T10.BarCod AND T12.BarCodReo" ;
      scmdbuf += " = T10.BarCodReo AND T12.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin = T12.GXC4) AND (T10.BarOrdLin >= 0) AND (T10.BarOrdLin > COALESCE( T11.BarFasLin, 0)) AND" ;
      scmdbuf += " (T10.BarFasEst = 0) GROUP BY T11.BarFasLin, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T10 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC5, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin" ;
      scmdbuf += " = T11.GXC5) AND (T10.BarFasEst <> 0) GROUP BY T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod = T1.BarCod AND" ;
      scmdbuf += " T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS" ;
      scmdbuf += " BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T1.EmprCod AND T9.BarCod" ;
      scmdbuf += " = T1.BarCod AND T9.BarCodReo = T1.BarCodReo AND T9.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T8.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T8.BarFasCod2, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.BarFasCod2, ' ') = ?))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! (GXutil.strcmp("", AV191Webwcnsprodds_1_barnhdr)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like ?)");
      }
      else
      {
         GXv_int58[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Webwcnsprodds_2_clinom)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom like ?)");
      }
      else
      {
         GXv_int58[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV193Webwcnsprodds_3_barfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int58[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV194Webwcnsprodds_4_barfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int58[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV195Webwcnsprodds_5_barenccli)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli like ?)");
      }
      else
      {
         GXv_int58[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV196Webwcnsprodds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer like ?)");
      }
      else
      {
         GXv_int58[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Webwcnsprodds_7_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom like ?)");
      }
      else
      {
         GXv_int58[34] = (byte)(1) ;
      }
      if ( ! (0==AV198Webwcnsprodds_8_barsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int58[35] = (byte)(1) ;
      }
      if ( ! (0==AV199Webwcnsprodds_9_barsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int58[36] = (byte)(1) ;
      }
      if ( ! (0==AV200Webwcnsprodds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int58[37] = (byte)(1) ;
      }
      if ( ! (0==AV201Webwcnsprodds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int58[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV203Webwcnsprodds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV202Webwcnsprodds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int58[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV203Webwcnsprodds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int58[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV205Webwcnsprodds_15_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV204Webwcnsprodds_14_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int58[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV205Webwcnsprodds_15_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int58[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV207Webwcnsprodds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV206Webwcnsprodds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int58[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV207Webwcnsprodds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int58[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV209Webwcnsprodds_19_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV208Webwcnsprodds_18_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int58[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV209Webwcnsprodds_19_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int58[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV211Webwcnsprodds_21_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV210Webwcnsprodds_20_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int58[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV211Webwcnsprodds_21_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int58[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV212Webwcnsprodds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int58[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV213Webwcnsprodds_23_tfbarfecent)) )
      {
         addWhere(sWhereString, "(T1.BarFecEnt >= ?)");
      }
      else
      {
         GXv_int58[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV215Webwcnsprodds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV214Webwcnsprodds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int58[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV215Webwcnsprodds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int58[52] = (byte)(1) ;
      }
      if ( ! (0==AV216Webwcnsprodds_26_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int58[53] = (byte)(1) ;
      }
      if ( ! (0==AV217Webwcnsprodds_27_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int58[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV219Webwcnsprodds_29_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV218Webwcnsprodds_28_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int58[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV219Webwcnsprodds_29_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int58[56] = (byte)(1) ;
      }
      if ( ! (0==AV220Webwcnsprodds_30_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int58[57] = (byte)(1) ;
      }
      if ( ! (0==AV221Webwcnsprodds_31_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int58[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV222Webwcnsprodds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int58[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV223Webwcnsprodds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int58[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV224Webwcnsprodds_34_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int58[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV225Webwcnsprodds_35_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int58[62] = (byte)(1) ;
      }
      if ( ! (0==AV228Webwcnsprodds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int58[63] = (byte)(1) ;
      }
      if ( ! (0==AV229Webwcnsprodds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int58[64] = (byte)(1) ;
      }
      if ( ! (0==AV234Webwcnsprodds_44_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int58[65] = (byte)(1) ;
      }
      if ( ! (0==AV235Webwcnsprodds_45_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int58[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV237Webwcnsprodds_47_tfbaritem3_sel)==0) && ( ! (GXutil.strcmp("", AV236Webwcnsprodds_46_tfbaritem3)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarItem3) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int58[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Webwcnsprodds_47_tfbaritem3_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarItem3 = ?)");
      }
      else
      {
         GXv_int58[68] = (byte)(1) ;
      }
      if ( ! (0==AV238Webwcnsprodds_48_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int58[69] = (byte)(1) ;
      }
      if ( ! (0==AV239Webwcnsprodds_49_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int58[70] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV54OrderedBy == 1 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV54OrderedBy == 1 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV54OrderedBy == 2 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV54OrderedBy == 2 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV54OrderedBy == 3 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV54OrderedBy == 3 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      else if ( ( AV54OrderedBy == 4 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV54OrderedBy == 4 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV54OrderedBy == 5 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV54OrderedBy == 5 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV54OrderedBy == 6 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV54OrderedBy == 6 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV54OrderedBy == 7 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecEnt" ;
      }
      else if ( ( AV54OrderedBy == 7 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecEnt DESC" ;
      }
      else if ( ( AV54OrderedBy == 8 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV54OrderedBy == 8 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV54OrderedBy == 9 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV54OrderedBy == 9 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV54OrderedBy == 10 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV54OrderedBy == 10 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV54OrderedBy == 11 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumCli" ;
      }
      else if ( ( AV54OrderedBy == 11 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumCli DESC" ;
      }
      else if ( ( AV54OrderedBy == 12 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV54OrderedBy == 12 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV54OrderedBy == 13 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPart" ;
      }
      else if ( ( AV54OrderedBy == 13 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPart DESC" ;
      }
      else if ( ( AV54OrderedBy == 14 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarItem3" ;
      }
      else if ( ( AV54OrderedBy == 14 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarItem3 DESC" ;
      }
      else if ( ( AV54OrderedBy == 15 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarRdto4" ;
      }
      else if ( ( AV54OrderedBy == 15 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarRdto4 DESC" ;
      }
      GXv_Object59[0] = scmdbuf ;
      GXv_Object59[1] = GXv_int58 ;
      return GXv_Object59 ;
   }

   protected Object[] conditional_H00IU27( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV191Webwcnsprodds_1_barnhdr ,
                                           String AV192Webwcnsprodds_2_clinom ,
                                           java.util.Date AV193Webwcnsprodds_3_barfecgen ,
                                           java.util.Date AV194Webwcnsprodds_4_barfecgen_to ,
                                           String AV195Webwcnsprodds_5_barenccli ,
                                           String AV196Webwcnsprodds_6_barser ,
                                           String AV197Webwcnsprodds_7_barcolnom ,
                                           byte AV198Webwcnsprodds_8_barsit ,
                                           byte AV199Webwcnsprodds_9_barsit_to ,
                                           int AV200Webwcnsprodds_10_tfclicod ,
                                           int AV201Webwcnsprodds_11_tfclicod_to ,
                                           String AV203Webwcnsprodds_13_tfclinom_sel ,
                                           String AV202Webwcnsprodds_12_tfclinom ,
                                           String AV205Webwcnsprodds_15_tfbarnhdr_sel ,
                                           String AV204Webwcnsprodds_14_tfbarnhdr ,
                                           String AV207Webwcnsprodds_17_tfbaragrest_sel ,
                                           String AV206Webwcnsprodds_16_tfbaragrest ,
                                           String AV209Webwcnsprodds_19_tfbarser_sel ,
                                           String AV208Webwcnsprodds_18_tfbarser ,
                                           String AV211Webwcnsprodds_21_tfbarserdsc_sel ,
                                           String AV210Webwcnsprodds_20_tfbarserdsc ,
                                           java.util.Date AV212Webwcnsprodds_22_tfbarfecgen ,
                                           java.util.Date AV213Webwcnsprodds_23_tfbarfecent ,
                                           String AV215Webwcnsprodds_25_tfbarcolnom_sel ,
                                           String AV214Webwcnsprodds_24_tfbarcolnom ,
                                           int AV216Webwcnsprodds_26_tfbarcolnum ,
                                           int AV217Webwcnsprodds_27_tfbarcolnum_to ,
                                           String AV219Webwcnsprodds_29_tfbarnomcli_sel ,
                                           String AV218Webwcnsprodds_28_tfbarnomcli ,
                                           int AV220Webwcnsprodds_30_tfbarnumcli ,
                                           int AV221Webwcnsprodds_31_tfbarnumcli_to ,
                                           java.math.BigDecimal AV222Webwcnsprodds_32_tfbarkgm ,
                                           java.math.BigDecimal AV223Webwcnsprodds_33_tfbarkgm_to ,
                                           java.math.BigDecimal AV224Webwcnsprodds_34_tfbarmtr ,
                                           java.math.BigDecimal AV225Webwcnsprodds_35_tfbarmtr_to ,
                                           byte AV228Webwcnsprodds_38_tfbarsit ,
                                           byte AV229Webwcnsprodds_39_tfbarsit_to ,
                                           short AV234Webwcnsprodds_44_tfbarpart ,
                                           short AV235Webwcnsprodds_45_tfbarpart_to ,
                                           String AV237Webwcnsprodds_47_tfbaritem3_sel ,
                                           String AV236Webwcnsprodds_46_tfbaritem3 ,
                                           short AV238Webwcnsprodds_48_tfbarrdto4 ,
                                           short AV239Webwcnsprodds_49_tfbarrdto4_to ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A279CliNom ,
                                           java.util.Date A159BarFecGen ,
                                           String A4812BarEncCli ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           byte A213BarSit ,
                                           int A252CliCod ,
                                           String A120BarAgrEst ,
                                           String A1652BarSerDsc ,
                                           java.util.Date A157BarFecEnt ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A1503BarPart ,
                                           String A9777BarItem3 ,
                                           short A13769BarRdto4 ,
                                           short AV54OrderedBy ,
                                           boolean AV55OrderedDsc ,
                                           int AV226Webwcnsprodds_36_tfbarpie ,
                                           int A198BarPie ,
                                           int AV227Webwcnsprodds_37_tfbarpie_to ,
                                           String AV231Webwcnsprodds_41_tfbarfascod_sel ,
                                           String AV230Webwcnsprodds_40_tfbarfascod ,
                                           String A151BarFasCod ,
                                           String AV233Webwcnsprodds_43_tfbarfassig_sel ,
                                           String AV232Webwcnsprodds_42_tfbarfassig ,
                                           String A1955BarFasSig ,
                                           String AV241Webwcnsprodds_51_tfbargots_sel ,
                                           String AV240Webwcnsprodds_50_tfbargots ,
                                           String A13855BarGots ,
                                           String AV243Webwcnsprodds_53_tfbargrs_sel ,
                                           String AV242Webwcnsprodds_52_tfbargrs ,
                                           String A13856BarGrs ,
                                           String AV245Webwcnsprodds_55_tfbarocs_sel ,
                                           String AV244Webwcnsprodds_54_tfbarocs ,
                                           String A13857BarOcs ,
                                           String AV247Webwcnsprodds_57_tfbarrcs_sel ,
                                           String AV246Webwcnsprodds_56_tfbarrcs ,
                                           String A13858BarRcs ,
                                           String AV249Webwcnsprodds_59_tfbaroeko_sel ,
                                           String AV248Webwcnsprodds_58_tfbaroeko ,
                                           String A13859BarOeko ,
                                           String AV250Webwcnsprodds_60_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV252Webwcnsprodds_62_tfbarmarca_sel ,
                                           String AV251Webwcnsprodds_61_tfbarmarca ,
                                           String A13861BarMarca ,
                                           int AV253Webwcnsprodds_63_tfbar_maccod ,
                                           int A13862Bar_MacCod ,
                                           int AV254Webwcnsprodds_64_tfbar_maccod_to ,
                                           String AV256Webwcnsprodds_66_tfbarfascod2_sel ,
                                           String AV255Webwcnsprodds_65_tfbarfascod2 ,
                                           String A13863BarFasCod2 ,
                                           String AV258Webwcnsprodds_68_tfbarfasdsc2_sel ,
                                           String AV257Webwcnsprodds_67_tfbarfasdsc2 ,
                                           String A13864BarFasDsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int60 = new byte[71];
      Object[] GXv_Object61 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarNPed, T1.BarEncCli, T1.BarDisNum, T1.Nxt_ArtCl2, T1.BarAcaAnh, T1.BarTipCol, T1.BarRdto4, T1.BarItem3, T1.BarPart, T1.BarSit, T1.BarNumCli," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarFecEnt, T1.BarFecGen, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T3.CliNom, T1.CliCod, COALESCE( T2.Bar_MacCod, 0) AS" ;
      scmdbuf += " Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarFasCod2, ' ') AS BarFasSig, COALESCE( T8.BarFasCod2," ;
      scmdbuf += " ' ') AS BarFasCod, COALESCE( T9.BarMtr, 0) AS BarMtr, COALESCE( T9.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T9.BarPie1, 0) AS BarPie1," ;
      scmdbuf += " T1.DisDes, COALESCE( T9.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((((TXPBARCAD T1 LEFT JOIN (SELECT" ;
      scmdbuf += " MIN(T10.MacCod) AS Bar_MacCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod" ;
      scmdbuf += " = ? and T10.MacBarCod = T11.BarCod and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T2 ON" ;
      scmdbuf += " T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM (TXPBARFAS T10 INNER JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod" ;
      scmdbuf += " AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin = T11.GXC1) AND (T10.BarFasEst = 2) GROUP" ;
      scmdbuf += " BY T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT COALESCE( T11.GXC2, 'N') AS BarAccesor, T10.EmprCod," ;
      scmdbuf += " T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM (TXPBARCAD T10 LEFT JOIN (SELECT MIN('S') AS GXC2, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPLMACRO T12 INNER" ;
      scmdbuf += " JOIN TXPBARCAD T13 ON T13.EmprCod = T12.EmprCod) WHERE T12.EmprCod = ? and T12.MacBarCod = T13.BarCod and T12.MacBarReo = T13.BarCodReo and T12.MacBarPar = T13.BarCodPar" ;
      scmdbuf += " GROUP BY T13.BarCod, T13.BarCodReo, T13.BarCodPar ) T11 ON T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) ) T6 ON" ;
      scmdbuf += " T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2," ;
      scmdbuf += " COALESCE( T11.BarFasLin, 0) AS BarFasLin, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM ((TXPBARFAS T10 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND" ;
      scmdbuf += " T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) INNER JOIN (SELECT MIN(T13.BarOrdLin) AS GXC4, COALESCE( T14.BarFasLin," ;
      scmdbuf += " 0) AS BarFasLin, T13.EmprCod, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPBARFAS T13 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T14 ON T14.EmprCod = T13.EmprCod AND T14.BarCod = T13.BarCod AND" ;
      scmdbuf += " T14.BarCodReo = T13.BarCodReo AND T14.BarCodPar = T13.BarCodPar) WHERE (T13.BarOrdLin >= 0) AND (T13.BarOrdLin > COALESCE( T14.BarFasLin, 0)) AND (T13.BarFasEst" ;
      scmdbuf += " = 0) GROUP BY T14.BarFasLin, T13.EmprCod, T13.BarCod, T13.BarCodReo, T13.BarCodPar ) T12 ON T12.EmprCod = T10.EmprCod AND T12.BarCod = T10.BarCod AND T12.BarCodReo" ;
      scmdbuf += " = T10.BarCodReo AND T12.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin = T12.GXC4) AND (T10.BarOrdLin >= 0) AND (T10.BarOrdLin > COALESCE( T11.BarFasLin, 0)) AND" ;
      scmdbuf += " (T10.BarFasEst = 0) GROUP BY T11.BarFasLin, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T10 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC5, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin" ;
      scmdbuf += " = T11.GXC5) AND (T10.BarFasEst <> 0) GROUP BY T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod = T1.BarCod AND" ;
      scmdbuf += " T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS" ;
      scmdbuf += " BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T1.EmprCod AND T9.BarCod" ;
      scmdbuf += " = T1.BarCod AND T9.BarCodReo = T1.BarCodReo AND T9.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T8.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T8.BarFasCod2, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.BarFasCod2, ' ') = ?))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! (GXutil.strcmp("", AV191Webwcnsprodds_1_barnhdr)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like ?)");
      }
      else
      {
         GXv_int60[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Webwcnsprodds_2_clinom)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom like ?)");
      }
      else
      {
         GXv_int60[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV193Webwcnsprodds_3_barfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int60[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV194Webwcnsprodds_4_barfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int60[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV195Webwcnsprodds_5_barenccli)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli like ?)");
      }
      else
      {
         GXv_int60[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV196Webwcnsprodds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer like ?)");
      }
      else
      {
         GXv_int60[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Webwcnsprodds_7_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom like ?)");
      }
      else
      {
         GXv_int60[34] = (byte)(1) ;
      }
      if ( ! (0==AV198Webwcnsprodds_8_barsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int60[35] = (byte)(1) ;
      }
      if ( ! (0==AV199Webwcnsprodds_9_barsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int60[36] = (byte)(1) ;
      }
      if ( ! (0==AV200Webwcnsprodds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int60[37] = (byte)(1) ;
      }
      if ( ! (0==AV201Webwcnsprodds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int60[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV203Webwcnsprodds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV202Webwcnsprodds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int60[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV203Webwcnsprodds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int60[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV205Webwcnsprodds_15_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV204Webwcnsprodds_14_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int60[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV205Webwcnsprodds_15_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int60[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV207Webwcnsprodds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV206Webwcnsprodds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int60[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV207Webwcnsprodds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int60[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV209Webwcnsprodds_19_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV208Webwcnsprodds_18_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int60[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV209Webwcnsprodds_19_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int60[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV211Webwcnsprodds_21_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV210Webwcnsprodds_20_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int60[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV211Webwcnsprodds_21_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int60[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV212Webwcnsprodds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int60[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV213Webwcnsprodds_23_tfbarfecent)) )
      {
         addWhere(sWhereString, "(T1.BarFecEnt >= ?)");
      }
      else
      {
         GXv_int60[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV215Webwcnsprodds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV214Webwcnsprodds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int60[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV215Webwcnsprodds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int60[52] = (byte)(1) ;
      }
      if ( ! (0==AV216Webwcnsprodds_26_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int60[53] = (byte)(1) ;
      }
      if ( ! (0==AV217Webwcnsprodds_27_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int60[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV219Webwcnsprodds_29_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV218Webwcnsprodds_28_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int60[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV219Webwcnsprodds_29_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int60[56] = (byte)(1) ;
      }
      if ( ! (0==AV220Webwcnsprodds_30_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int60[57] = (byte)(1) ;
      }
      if ( ! (0==AV221Webwcnsprodds_31_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int60[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV222Webwcnsprodds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int60[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV223Webwcnsprodds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int60[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV224Webwcnsprodds_34_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int60[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV225Webwcnsprodds_35_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int60[62] = (byte)(1) ;
      }
      if ( ! (0==AV228Webwcnsprodds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int60[63] = (byte)(1) ;
      }
      if ( ! (0==AV229Webwcnsprodds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int60[64] = (byte)(1) ;
      }
      if ( ! (0==AV234Webwcnsprodds_44_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int60[65] = (byte)(1) ;
      }
      if ( ! (0==AV235Webwcnsprodds_45_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int60[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV237Webwcnsprodds_47_tfbaritem3_sel)==0) && ( ! (GXutil.strcmp("", AV236Webwcnsprodds_46_tfbaritem3)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarItem3) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int60[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Webwcnsprodds_47_tfbaritem3_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarItem3 = ?)");
      }
      else
      {
         GXv_int60[68] = (byte)(1) ;
      }
      if ( ! (0==AV238Webwcnsprodds_48_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int60[69] = (byte)(1) ;
      }
      if ( ! (0==AV239Webwcnsprodds_49_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int60[70] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV54OrderedBy == 1 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV54OrderedBy == 1 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV54OrderedBy == 2 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV54OrderedBy == 2 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV54OrderedBy == 3 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV54OrderedBy == 3 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      else if ( ( AV54OrderedBy == 4 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV54OrderedBy == 4 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV54OrderedBy == 5 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV54OrderedBy == 5 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV54OrderedBy == 6 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV54OrderedBy == 6 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV54OrderedBy == 7 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecEnt" ;
      }
      else if ( ( AV54OrderedBy == 7 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecEnt DESC" ;
      }
      else if ( ( AV54OrderedBy == 8 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV54OrderedBy == 8 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV54OrderedBy == 9 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV54OrderedBy == 9 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV54OrderedBy == 10 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV54OrderedBy == 10 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV54OrderedBy == 11 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumCli" ;
      }
      else if ( ( AV54OrderedBy == 11 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumCli DESC" ;
      }
      else if ( ( AV54OrderedBy == 12 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV54OrderedBy == 12 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV54OrderedBy == 13 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPart" ;
      }
      else if ( ( AV54OrderedBy == 13 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPart DESC" ;
      }
      else if ( ( AV54OrderedBy == 14 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarItem3" ;
      }
      else if ( ( AV54OrderedBy == 14 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarItem3 DESC" ;
      }
      else if ( ( AV54OrderedBy == 15 ) && ! AV55OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarRdto4" ;
      }
      else if ( ( AV54OrderedBy == 15 ) && ( AV55OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarRdto4 DESC" ;
      }
      GXv_Object61[0] = scmdbuf ;
      GXv_Object61[1] = GXv_int60 ;
      return GXv_Object61 ;
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
                  return conditional_H00IU14(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).intValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (java.util.Date)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , (String)dynConstraints[85] , (String)dynConstraints[86] , (String)dynConstraints[87] , (String)dynConstraints[88] , (String)dynConstraints[89] , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , ((Number) dynConstraints[95]).intValue() , ((Number) dynConstraints[96]).intValue() , ((Number) dynConstraints[97]).intValue() , (String)dynConstraints[98] , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] );
            case 1 :
                  return conditional_H00IU27(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).intValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (java.util.Date)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , (String)dynConstraints[85] , (String)dynConstraints[86] , (String)dynConstraints[87] , (String)dynConstraints[88] , (String)dynConstraints[89] , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , ((Number) dynConstraints[95]).intValue() , ((Number) dynConstraints[96]).intValue() , ((Number) dynConstraints[97]).intValue() , (String)dynConstraints[98] , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00IU14", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IU27", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IU28", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IU29", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbProfch, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie, T1.AlbProCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IU30", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbKgmE, T2.AlbProfch, T1.AlbProCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 26);
               ((String[]) buf[19])[0] = rslt.getString(19, 16);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(27, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(29,2);
               ((String[]) buf[36])[0] = rslt.getString(30, 1);
               ((byte[]) buf[37])[0] = rslt.getByte(31);
               ((int[]) buf[38])[0] = rslt.getInt(32);
               ((short[]) buf[39])[0] = rslt.getShort(33);
               ((String[]) buf[40])[0] = rslt.getString(34, 1);
               ((int[]) buf[41])[0] = rslt.getInt(35);
               ((int[]) buf[42])[0] = rslt.getInt(36);
               ((String[]) buf[43])[0] = rslt.getString(37, 8);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(38, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 26);
               ((String[]) buf[19])[0] = rslt.getString(19, 16);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(27, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(29,2);
               ((String[]) buf[36])[0] = rslt.getString(30, 1);
               ((byte[]) buf[37])[0] = rslt.getByte(31);
               ((int[]) buf[38])[0] = rslt.getInt(32);
               ((short[]) buf[39])[0] = rslt.getShort(33);
               ((String[]) buf[40])[0] = rslt.getString(34, 1);
               ((int[]) buf[41])[0] = rslt.getInt(35);
               ((int[]) buf[42])[0] = rslt.getInt(36);
               ((String[]) buf[43])[0] = rslt.getString(37, 8);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(38, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 20);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[107]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 11);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 11);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 16);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 26);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[120]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[124]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[125]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 13);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[136]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[137]).shortValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 20);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 20);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[141]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 20);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[107]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 11);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 11);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 16);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 26);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[120]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[124]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[125]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 13);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[136]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[137]).shortValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 20);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 20);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[141]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

