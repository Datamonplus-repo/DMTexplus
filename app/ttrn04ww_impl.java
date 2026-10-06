package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn04ww_impl extends GXDataArea
{
   public ttrn04ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn04ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn04ww_impl.class ));
   }

   public ttrn04ww_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkHayRec = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV158FilterFullText = httpContext.GetPar( "FilterFullText") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV50ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV45ColumnsSelector);
      AV168Emprcod = httpContext.GetPar( "Emprcod") ;
      AV184Pgmname = httpContext.GetPar( "Pgmname") ;
      AV154UsurCod = httpContext.GetPar( "UsurCod") ;
      AV152Station = httpContext.GetPar( "Station") ;
      AV139TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV140TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV70TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV71TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV160TFBarEncCli = httpContext.GetPar( "TFBarEncCli") ;
      AV161TFBarEncCli_Sel = httpContext.GetPar( "TFBarEncCli_Sel") ;
      AV73TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV74TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV76TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV77TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV162TFBarTipArtDsc = httpContext.GetPar( "TFBarTipArtDsc") ;
      AV163TFBarTipArtDsc_Sel = httpContext.GetPar( "TFBarTipArtDsc_Sel") ;
      AV67TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV68TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV82TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV83TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV85TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV86TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV91TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV96TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV106TFBarFecSal = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecSal")) ;
      AV148TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV149TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV159TFHayRec_Sel = (byte)(GXutil.lval( httpContext.GetPar( "TFHayRec_Sel"))) ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV176Pwdgrl = (short)(GXutil.lval( httpContext.GetPar( "Pwdgrl"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV158FilterFullText, A396EmprCod, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV168Emprcod, AV184Pgmname, AV154UsurCod, AV152Station, AV139TFBarNHdr, AV140TFBarNHdr_Sel, AV70TFCliNom, AV71TFCliNom_Sel, AV160TFBarEncCli, AV161TFBarEncCli_Sel, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV162TFBarTipArtDsc, AV163TFBarTipArtDsc_Sel, AV67TFCliCod, AV68TFCliCod_To, AV82TFBarColNom, AV83TFBarColNom_Sel, AV85TFBarColNum, AV86TFBarColNum_To, AV91TFBarFecGen, AV96TFBarFecCli, AV106TFBarFecSal, AV148TFBarSit, AV149TFBarSit_To, AV159TFHayRec_Sel, AV13OrderedBy, AV14OrderedDsc, Gx_mode, AV176Pwdgrl) ;
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
      paEG2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startEG2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttrn04ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV184Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV154UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV152Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPWDGRL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV176Pwdgrl), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV158FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV48ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV48ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV128GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV129GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV126DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV126DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV45ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV45ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV50ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV168Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV184Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV184Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV154UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV154UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV152Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV152Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR", GXutil.rtrim( AV139TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR_SEL", GXutil.rtrim( AV140TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV70TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV71TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARENCCLI", GXutil.rtrim( AV160TFBarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARENCCLI_SEL", GXutil.rtrim( AV161TFBarEncCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV73TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV74TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC", GXutil.rtrim( AV76TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC_SEL", GXutil.rtrim( AV77TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARTIPARTDSC", GXutil.rtrim( AV162TFBarTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARTIPARTDSC_SEL", GXutil.rtrim( AV163TFBarTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV67TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV68TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM", GXutil.rtrim( AV82TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM_SEL", GXutil.rtrim( AV83TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV85TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV86TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECGEN", localUtil.dtoc( AV91TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECCLI", localUtil.dtoc( AV96TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECSAL", localUtil.dtoc( AV106TFBarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV148TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV149TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHAYREC_SEL", GXutil.ltrim( localUtil.ntoc( AV159TFHayRec_Sel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV176Pwdgrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPWDGRL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV176Pwdgrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV178contval, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV170EmprCod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV171BarCod_Selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV172BarCodReo_Selected, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR_SELECTED", GXutil.rtrim( AV173BarCodPar_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Title", GXutil.rtrim( Dvelop_confirmpanel_delete_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_delete_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_delete_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_delete_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
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
         weEG2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtEG2( ) ;
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
      return formatLink("app.ttrn04ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrn04WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento HDRs ( Eliminar)", "") ;
   }

   public void wbEG0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn04WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn04WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn04WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_EG2( true) ;
      }
      else
      {
         wb_table1_23_EG2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_EG2e( boolean wbgen )
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
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV128GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV129GridPageCount);
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
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV126DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV126DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV45ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_71_EG2( true) ;
      }
      else
      {
         wb_table2_71_EG2( false) ;
      }
      return  ;
   }

   public void wb_table2_71_EG2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV93DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV93DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn04WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV98DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV98DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn04WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecsalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecsalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecsalauxdate_Internalname, localUtil.format(AV108DDO_BarFecSalAuxDate, "99/99/99"), localUtil.format( AV108DDO_BarFecSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecsalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn04WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecsalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn04WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 41 )
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

   public void startEG2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento HDRs ( Eliminar)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupEG0( ) ;
   }

   public void wsEG2( )
   {
      startEG2( ) ;
      evtEG2( ) ;
   }

   public void evtEG2( )
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
                           e11EG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12EG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13EG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14EG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15EG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DELETE.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16EG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17EG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e18EG2 ();
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
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV164GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164GridActions), 4, 0));
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
                           n13711BarTipArtD = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A161BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecSal_Internalname), 0)) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13710HayRec = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkHayRec.getInternalname()), "1")==0) ? 1 : 0)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3594BarPriTin = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPriTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2265BarExt = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19EG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e20EG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21EG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22EG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV158FilterFullText) != 0 )
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

   public void weEG2( )
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

   public void paEG2( )
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
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV158FilterFullText ,
                                 String A396EmprCod ,
                                 byte AV50ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV45ColumnsSelector ,
                                 String AV168Emprcod ,
                                 String AV184Pgmname ,
                                 String AV154UsurCod ,
                                 String AV152Station ,
                                 String AV139TFBarNHdr ,
                                 String AV140TFBarNHdr_Sel ,
                                 String AV70TFCliNom ,
                                 String AV71TFCliNom_Sel ,
                                 String AV160TFBarEncCli ,
                                 String AV161TFBarEncCli_Sel ,
                                 String AV73TFBarSer ,
                                 String AV74TFBarSer_Sel ,
                                 String AV76TFBarSerDsc ,
                                 String AV77TFBarSerDsc_Sel ,
                                 String AV162TFBarTipArtDsc ,
                                 String AV163TFBarTipArtDsc_Sel ,
                                 int AV67TFCliCod ,
                                 int AV68TFCliCod_To ,
                                 String AV82TFBarColNom ,
                                 String AV83TFBarColNom_Sel ,
                                 int AV85TFBarColNum ,
                                 int AV86TFBarColNum_To ,
                                 java.util.Date AV91TFBarFecGen ,
                                 java.util.Date AV96TFBarFecCli ,
                                 java.util.Date AV106TFBarFecSal ,
                                 byte AV148TFBarSit ,
                                 byte AV149TFBarSit_To ,
                                 byte AV159TFHayRec_Sel ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String Gx_mode ,
                                 short AV176Pwdgrl )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20EG2 ();
      GRID_nCurrentRecord = 0 ;
      rfEG2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13696BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNHDR", GXutil.rtrim( A13696BarNHdr));
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
      rfEG2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV184Pgmname = "TTrn04WW" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV185Ttrn04wwds_1_filterfulltext = AV158FilterFullText ;
      AV186Ttrn04wwds_2_tfbarnhdr = AV139TFBarNHdr ;
      AV187Ttrn04wwds_3_tfbarnhdr_sel = AV140TFBarNHdr_Sel ;
      AV188Ttrn04wwds_4_tfclinom = AV70TFCliNom ;
      AV189Ttrn04wwds_5_tfclinom_sel = AV71TFCliNom_Sel ;
      AV190Ttrn04wwds_6_tfbarenccli = AV160TFBarEncCli ;
      AV191Ttrn04wwds_7_tfbarenccli_sel = AV161TFBarEncCli_Sel ;
      AV192Ttrn04wwds_8_tfbarser = AV73TFBarSer ;
      AV193Ttrn04wwds_9_tfbarser_sel = AV74TFBarSer_Sel ;
      AV194Ttrn04wwds_10_tfbarserdsc = AV76TFBarSerDsc ;
      AV195Ttrn04wwds_11_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV196Ttrn04wwds_12_tfbartipartdsc = AV162TFBarTipArtDsc ;
      AV197Ttrn04wwds_13_tfbartipartdsc_sel = AV163TFBarTipArtDsc_Sel ;
      AV198Ttrn04wwds_14_tfclicod = AV67TFCliCod ;
      AV199Ttrn04wwds_15_tfclicod_to = AV68TFCliCod_To ;
      AV200Ttrn04wwds_16_tfbarcolnom = AV82TFBarColNom ;
      AV201Ttrn04wwds_17_tfbarcolnom_sel = AV83TFBarColNom_Sel ;
      AV202Ttrn04wwds_18_tfbarcolnum = AV85TFBarColNum ;
      AV203Ttrn04wwds_19_tfbarcolnum_to = AV86TFBarColNum_To ;
      AV204Ttrn04wwds_20_tfbarfecgen = AV91TFBarFecGen ;
      AV205Ttrn04wwds_21_tfbarfeccli = AV96TFBarFecCli ;
      AV206Ttrn04wwds_22_tfbarfecsal = AV106TFBarFecSal ;
      AV207Ttrn04wwds_23_tfbarsit = AV148TFBarSit ;
      AV208Ttrn04wwds_24_tfbarsit_to = AV149TFBarSit_To ;
      AV209Ttrn04wwds_25_tfhayrec_sel = AV159TFHayRec_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV185Ttrn04wwds_1_filterfulltext ,
                                           AV187Ttrn04wwds_3_tfbarnhdr_sel ,
                                           AV186Ttrn04wwds_2_tfbarnhdr ,
                                           AV189Ttrn04wwds_5_tfclinom_sel ,
                                           AV188Ttrn04wwds_4_tfclinom ,
                                           AV191Ttrn04wwds_7_tfbarenccli_sel ,
                                           AV190Ttrn04wwds_6_tfbarenccli ,
                                           AV193Ttrn04wwds_9_tfbarser_sel ,
                                           AV192Ttrn04wwds_8_tfbarser ,
                                           AV195Ttrn04wwds_11_tfbarserdsc_sel ,
                                           AV194Ttrn04wwds_10_tfbarserdsc ,
                                           AV197Ttrn04wwds_13_tfbartipartdsc_sel ,
                                           AV196Ttrn04wwds_12_tfbartipartdsc ,
                                           Integer.valueOf(AV198Ttrn04wwds_14_tfclicod) ,
                                           Integer.valueOf(AV199Ttrn04wwds_15_tfclicod_to) ,
                                           AV201Ttrn04wwds_17_tfbarcolnom_sel ,
                                           AV200Ttrn04wwds_16_tfbarcolnom ,
                                           Integer.valueOf(AV202Ttrn04wwds_18_tfbarcolnum) ,
                                           Integer.valueOf(AV203Ttrn04wwds_19_tfbarcolnum_to) ,
                                           AV204Ttrn04wwds_20_tfbarfecgen ,
                                           AV205Ttrn04wwds_21_tfbarfeccli ,
                                           AV206Ttrn04wwds_22_tfbarfecsal ,
                                           Byte.valueOf(AV207Ttrn04wwds_23_tfbarsit) ,
                                           Byte.valueOf(AV208Ttrn04wwds_24_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Integer.valueOf(A252CliCod) ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           Byte.valueOf(AV209Ttrn04wwds_25_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV186Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV186Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
      lV188Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV188Ttrn04wwds_4_tfclinom), 30, "%") ;
      lV190Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV190Ttrn04wwds_6_tfbarenccli), 20, "%") ;
      lV192Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV192Ttrn04wwds_8_tfbarser), 16, "%") ;
      lV194Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV194Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
      lV196Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV196Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
      lV200Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV200Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
      /* Using cursor H00EG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV186Ttrn04wwds_2_tfbarnhdr, AV187Ttrn04wwds_3_tfbarnhdr_sel, lV188Ttrn04wwds_4_tfclinom, AV189Ttrn04wwds_5_tfclinom_sel, lV190Ttrn04wwds_6_tfbarenccli, AV191Ttrn04wwds_7_tfbarenccli_sel, lV192Ttrn04wwds_8_tfbarser, AV193Ttrn04wwds_9_tfbarser_sel, lV194Ttrn04wwds_10_tfbarserdsc, AV195Ttrn04wwds_11_tfbarserdsc_sel, lV196Ttrn04wwds_12_tfbartipartdsc, AV197Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV198Ttrn04wwds_14_tfclicod), Integer.valueOf(AV199Ttrn04wwds_15_tfclicod_to), lV200Ttrn04wwds_16_tfbarcolnom, AV201Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV202Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV203Ttrn04wwds_19_tfbarcolnum_to), AV204Ttrn04wwds_20_tfbarfecgen, AV205Ttrn04wwds_21_tfbarfeccli, AV206Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV207Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV208Ttrn04wwds_24_tfbarsit_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = H00EG2_A217BarTipArt[0] ;
         n217BarTipArt = H00EG2_n217BarTipArt[0] ;
         A2265BarExt = H00EG2_A2265BarExt[0] ;
         n2265BarExt = H00EG2_n2265BarExt[0] ;
         A3594BarPriTin = H00EG2_A3594BarPriTin[0] ;
         A361DisCod = H00EG2_A361DisCod[0] ;
         A213BarSit = H00EG2_A213BarSit[0] ;
         A161BarFecSal = H00EG2_A161BarFecSal[0] ;
         A155BarFecCli = H00EG2_A155BarFecCli[0] ;
         A159BarFecGen = H00EG2_A159BarFecGen[0] ;
         A136BarColNum = H00EG2_A136BarColNum[0] ;
         A135BarColNom = H00EG2_A135BarColNom[0] ;
         A252CliCod = H00EG2_A252CliCod[0] ;
         n252CliCod = H00EG2_n252CliCod[0] ;
         A13711BarTipArtD = H00EG2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H00EG2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = H00EG2_A1652BarSerDsc[0] ;
         A212BarSer = H00EG2_A212BarSer[0] ;
         A279CliNom = H00EG2_A279CliNom[0] ;
         A130BarCodPar = H00EG2_A130BarCodPar[0] ;
         A132BarCodReo = H00EG2_A132BarCodReo[0] ;
         A129BarCod = H00EG2_A129BarCod[0] ;
         A143BarDisNum = H00EG2_A143BarDisNum[0] ;
         A4812BarEncCli = H00EG2_A4812BarEncCli[0] ;
         A13711BarTipArtD = H00EG2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H00EG2_n13711BarTipArtD[0] ;
         A279CliNom = H00EG2_A279CliNom[0] ;
         GXt_int1 = A13710HayRec ;
         GXv_int2[0] = GXt_int1 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int2) ;
         ttrn04ww_impl.this.GXt_int1 = GXv_int2[0] ;
         A13710HayRec = GXt_int1 ;
         if ( ( AV209Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
         {
            if ( ( AV209Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
            {
               GXt_char3 = A13878PedidoClie ;
               GXv_char4[0] = A396EmprCod ;
               GXv_char5[0] = A4812BarEncCli ;
               GXv_char6[0] = A143BarDisNum ;
               GXv_char7[0] = GXt_char3 ;
               new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
               ttrn04ww_impl.this.A396EmprCod = GXv_char4[0] ;
               ttrn04ww_impl.this.A4812BarEncCli = GXv_char5[0] ;
               ttrn04ww_impl.this.A143BarDisNum = GXv_char6[0] ;
               ttrn04ww_impl.this.GXt_char3 = GXv_char7[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
               A13878PedidoClie = GXt_char3 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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

   public void rfEG2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e20EG2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_412( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV185Ttrn04wwds_1_filterfulltext ,
                                              AV187Ttrn04wwds_3_tfbarnhdr_sel ,
                                              AV186Ttrn04wwds_2_tfbarnhdr ,
                                              AV189Ttrn04wwds_5_tfclinom_sel ,
                                              AV188Ttrn04wwds_4_tfclinom ,
                                              AV191Ttrn04wwds_7_tfbarenccli_sel ,
                                              AV190Ttrn04wwds_6_tfbarenccli ,
                                              AV193Ttrn04wwds_9_tfbarser_sel ,
                                              AV192Ttrn04wwds_8_tfbarser ,
                                              AV195Ttrn04wwds_11_tfbarserdsc_sel ,
                                              AV194Ttrn04wwds_10_tfbarserdsc ,
                                              AV197Ttrn04wwds_13_tfbartipartdsc_sel ,
                                              AV196Ttrn04wwds_12_tfbartipartdsc ,
                                              Integer.valueOf(AV198Ttrn04wwds_14_tfclicod) ,
                                              Integer.valueOf(AV199Ttrn04wwds_15_tfclicod_to) ,
                                              AV201Ttrn04wwds_17_tfbarcolnom_sel ,
                                              AV200Ttrn04wwds_16_tfbarcolnom ,
                                              Integer.valueOf(AV202Ttrn04wwds_18_tfbarcolnum) ,
                                              Integer.valueOf(AV203Ttrn04wwds_19_tfbarcolnum_to) ,
                                              AV204Ttrn04wwds_20_tfbarfecgen ,
                                              AV205Ttrn04wwds_21_tfbarfeccli ,
                                              AV206Ttrn04wwds_22_tfbarfecsal ,
                                              Byte.valueOf(AV207Ttrn04wwds_23_tfbarsit) ,
                                              Byte.valueOf(AV208Ttrn04wwds_24_tfbarsit_to) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A279CliNom ,
                                              A4812BarEncCli ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A13711BarTipArtD ,
                                              Integer.valueOf(A252CliCod) ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              Byte.valueOf(A213BarSit) ,
                                              A159BarFecGen ,
                                              A155BarFecCli ,
                                              A161BarFecSal ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              Byte.valueOf(AV209Ttrn04wwds_25_tfhayrec_sel) ,
                                              Byte.valueOf(A13710HayRec) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
         lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
         lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
         lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
         lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
         lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
         lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
         lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
         lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
         lV185Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV185Ttrn04wwds_1_filterfulltext), "%", "") ;
         lV186Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV186Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
         lV188Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV188Ttrn04wwds_4_tfclinom), 30, "%") ;
         lV190Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV190Ttrn04wwds_6_tfbarenccli), 20, "%") ;
         lV192Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV192Ttrn04wwds_8_tfbarser), 16, "%") ;
         lV194Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV194Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
         lV196Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV196Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
         lV200Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV200Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
         /* Using cursor H00EG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV185Ttrn04wwds_1_filterfulltext, lV186Ttrn04wwds_2_tfbarnhdr, AV187Ttrn04wwds_3_tfbarnhdr_sel, lV188Ttrn04wwds_4_tfclinom, AV189Ttrn04wwds_5_tfclinom_sel, lV190Ttrn04wwds_6_tfbarenccli, AV191Ttrn04wwds_7_tfbarenccli_sel, lV192Ttrn04wwds_8_tfbarser, AV193Ttrn04wwds_9_tfbarser_sel, lV194Ttrn04wwds_10_tfbarserdsc, AV195Ttrn04wwds_11_tfbarserdsc_sel, lV196Ttrn04wwds_12_tfbartipartdsc, AV197Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV198Ttrn04wwds_14_tfclicod), Integer.valueOf(AV199Ttrn04wwds_15_tfclicod_to), lV200Ttrn04wwds_16_tfbarcolnom, AV201Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV202Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV203Ttrn04wwds_19_tfbarcolnum_to), AV204Ttrn04wwds_20_tfbarfecgen, AV205Ttrn04wwds_21_tfbarfeccli, AV206Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV207Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV208Ttrn04wwds_24_tfbarsit_to)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A217BarTipArt = H00EG3_A217BarTipArt[0] ;
            n217BarTipArt = H00EG3_n217BarTipArt[0] ;
            A2265BarExt = H00EG3_A2265BarExt[0] ;
            n2265BarExt = H00EG3_n2265BarExt[0] ;
            A3594BarPriTin = H00EG3_A3594BarPriTin[0] ;
            A361DisCod = H00EG3_A361DisCod[0] ;
            A213BarSit = H00EG3_A213BarSit[0] ;
            A161BarFecSal = H00EG3_A161BarFecSal[0] ;
            A155BarFecCli = H00EG3_A155BarFecCli[0] ;
            A159BarFecGen = H00EG3_A159BarFecGen[0] ;
            A136BarColNum = H00EG3_A136BarColNum[0] ;
            A135BarColNom = H00EG3_A135BarColNom[0] ;
            A252CliCod = H00EG3_A252CliCod[0] ;
            n252CliCod = H00EG3_n252CliCod[0] ;
            A13711BarTipArtD = H00EG3_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H00EG3_n13711BarTipArtD[0] ;
            A1652BarSerDsc = H00EG3_A1652BarSerDsc[0] ;
            A212BarSer = H00EG3_A212BarSer[0] ;
            A279CliNom = H00EG3_A279CliNom[0] ;
            A130BarCodPar = H00EG3_A130BarCodPar[0] ;
            A132BarCodReo = H00EG3_A132BarCodReo[0] ;
            A129BarCod = H00EG3_A129BarCod[0] ;
            A143BarDisNum = H00EG3_A143BarDisNum[0] ;
            A4812BarEncCli = H00EG3_A4812BarEncCli[0] ;
            A13711BarTipArtD = H00EG3_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H00EG3_n13711BarTipArtD[0] ;
            A279CliNom = H00EG3_A279CliNom[0] ;
            GXt_int1 = A13710HayRec ;
            GXv_int2[0] = GXt_int1 ;
            new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int2) ;
            ttrn04ww_impl.this.GXt_int1 = GXv_int2[0] ;
            A13710HayRec = GXt_int1 ;
            if ( ( AV209Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
            {
               if ( ( AV209Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
               {
                  GXt_char3 = A13878PedidoClie ;
                  GXv_char7[0] = A396EmprCod ;
                  GXv_char6[0] = A4812BarEncCli ;
                  GXv_char5[0] = A143BarDisNum ;
                  GXv_char4[0] = GXt_char3 ;
                  new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char7, GXv_char6, GXv_char5, GXv_char4) ;
                  ttrn04ww_impl.this.A396EmprCod = GXv_char7[0] ;
                  ttrn04ww_impl.this.A4812BarEncCli = GXv_char6[0] ;
                  ttrn04ww_impl.this.A143BarDisNum = GXv_char5[0] ;
                  ttrn04ww_impl.this.GXt_char3 = GXv_char4[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
                  A13878PedidoClie = GXt_char3 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
                  A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                  e21EG2 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(41) ;
         wbEG0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesEG2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARNHDR"+"_"+sGXsfl_41_idx, getSecureSignedToken( sGXsfl_41_idx, GXutil.rtrim( localUtil.format( A13696BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV184Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV184Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV154UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV154UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV152Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV152Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV176Pwdgrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPWDGRL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV176Pwdgrl), "ZZZ9")));
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
      AV185Ttrn04wwds_1_filterfulltext = AV158FilterFullText ;
      AV186Ttrn04wwds_2_tfbarnhdr = AV139TFBarNHdr ;
      AV187Ttrn04wwds_3_tfbarnhdr_sel = AV140TFBarNHdr_Sel ;
      AV188Ttrn04wwds_4_tfclinom = AV70TFCliNom ;
      AV189Ttrn04wwds_5_tfclinom_sel = AV71TFCliNom_Sel ;
      AV190Ttrn04wwds_6_tfbarenccli = AV160TFBarEncCli ;
      AV191Ttrn04wwds_7_tfbarenccli_sel = AV161TFBarEncCli_Sel ;
      AV192Ttrn04wwds_8_tfbarser = AV73TFBarSer ;
      AV193Ttrn04wwds_9_tfbarser_sel = AV74TFBarSer_Sel ;
      AV194Ttrn04wwds_10_tfbarserdsc = AV76TFBarSerDsc ;
      AV195Ttrn04wwds_11_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV196Ttrn04wwds_12_tfbartipartdsc = AV162TFBarTipArtDsc ;
      AV197Ttrn04wwds_13_tfbartipartdsc_sel = AV163TFBarTipArtDsc_Sel ;
      AV198Ttrn04wwds_14_tfclicod = AV67TFCliCod ;
      AV199Ttrn04wwds_15_tfclicod_to = AV68TFCliCod_To ;
      AV200Ttrn04wwds_16_tfbarcolnom = AV82TFBarColNom ;
      AV201Ttrn04wwds_17_tfbarcolnom_sel = AV83TFBarColNom_Sel ;
      AV202Ttrn04wwds_18_tfbarcolnum = AV85TFBarColNum ;
      AV203Ttrn04wwds_19_tfbarcolnum_to = AV86TFBarColNum_To ;
      AV204Ttrn04wwds_20_tfbarfecgen = AV91TFBarFecGen ;
      AV205Ttrn04wwds_21_tfbarfeccli = AV96TFBarFecCli ;
      AV206Ttrn04wwds_22_tfbarfecsal = AV106TFBarFecSal ;
      AV207Ttrn04wwds_23_tfbarsit = AV148TFBarSit ;
      AV208Ttrn04wwds_24_tfbarsit_to = AV149TFBarSit_To ;
      AV209Ttrn04wwds_25_tfhayrec_sel = AV159TFHayRec_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV158FilterFullText, A396EmprCod, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV168Emprcod, AV184Pgmname, AV154UsurCod, AV152Station, AV139TFBarNHdr, AV140TFBarNHdr_Sel, AV70TFCliNom, AV71TFCliNom_Sel, AV160TFBarEncCli, AV161TFBarEncCli_Sel, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV162TFBarTipArtDsc, AV163TFBarTipArtDsc_Sel, AV67TFCliCod, AV68TFCliCod_To, AV82TFBarColNom, AV83TFBarColNom_Sel, AV85TFBarColNum, AV86TFBarColNum_To, AV91TFBarFecGen, AV96TFBarFecCli, AV106TFBarFecSal, AV148TFBarSit, AV149TFBarSit_To, AV159TFHayRec_Sel, AV13OrderedBy, AV14OrderedDsc, Gx_mode, AV176Pwdgrl) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV185Ttrn04wwds_1_filterfulltext = AV158FilterFullText ;
      AV186Ttrn04wwds_2_tfbarnhdr = AV139TFBarNHdr ;
      AV187Ttrn04wwds_3_tfbarnhdr_sel = AV140TFBarNHdr_Sel ;
      AV188Ttrn04wwds_4_tfclinom = AV70TFCliNom ;
      AV189Ttrn04wwds_5_tfclinom_sel = AV71TFCliNom_Sel ;
      AV190Ttrn04wwds_6_tfbarenccli = AV160TFBarEncCli ;
      AV191Ttrn04wwds_7_tfbarenccli_sel = AV161TFBarEncCli_Sel ;
      AV192Ttrn04wwds_8_tfbarser = AV73TFBarSer ;
      AV193Ttrn04wwds_9_tfbarser_sel = AV74TFBarSer_Sel ;
      AV194Ttrn04wwds_10_tfbarserdsc = AV76TFBarSerDsc ;
      AV195Ttrn04wwds_11_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV196Ttrn04wwds_12_tfbartipartdsc = AV162TFBarTipArtDsc ;
      AV197Ttrn04wwds_13_tfbartipartdsc_sel = AV163TFBarTipArtDsc_Sel ;
      AV198Ttrn04wwds_14_tfclicod = AV67TFCliCod ;
      AV199Ttrn04wwds_15_tfclicod_to = AV68TFCliCod_To ;
      AV200Ttrn04wwds_16_tfbarcolnom = AV82TFBarColNom ;
      AV201Ttrn04wwds_17_tfbarcolnom_sel = AV83TFBarColNom_Sel ;
      AV202Ttrn04wwds_18_tfbarcolnum = AV85TFBarColNum ;
      AV203Ttrn04wwds_19_tfbarcolnum_to = AV86TFBarColNum_To ;
      AV204Ttrn04wwds_20_tfbarfecgen = AV91TFBarFecGen ;
      AV205Ttrn04wwds_21_tfbarfeccli = AV96TFBarFecCli ;
      AV206Ttrn04wwds_22_tfbarfecsal = AV106TFBarFecSal ;
      AV207Ttrn04wwds_23_tfbarsit = AV148TFBarSit ;
      AV208Ttrn04wwds_24_tfbarsit_to = AV149TFBarSit_To ;
      AV209Ttrn04wwds_25_tfhayrec_sel = AV159TFHayRec_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV158FilterFullText, A396EmprCod, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV168Emprcod, AV184Pgmname, AV154UsurCod, AV152Station, AV139TFBarNHdr, AV140TFBarNHdr_Sel, AV70TFCliNom, AV71TFCliNom_Sel, AV160TFBarEncCli, AV161TFBarEncCli_Sel, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV162TFBarTipArtDsc, AV163TFBarTipArtDsc_Sel, AV67TFCliCod, AV68TFCliCod_To, AV82TFBarColNom, AV83TFBarColNom_Sel, AV85TFBarColNum, AV86TFBarColNum_To, AV91TFBarFecGen, AV96TFBarFecCli, AV106TFBarFecSal, AV148TFBarSit, AV149TFBarSit_To, AV159TFHayRec_Sel, AV13OrderedBy, AV14OrderedDsc, Gx_mode, AV176Pwdgrl) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV185Ttrn04wwds_1_filterfulltext = AV158FilterFullText ;
      AV186Ttrn04wwds_2_tfbarnhdr = AV139TFBarNHdr ;
      AV187Ttrn04wwds_3_tfbarnhdr_sel = AV140TFBarNHdr_Sel ;
      AV188Ttrn04wwds_4_tfclinom = AV70TFCliNom ;
      AV189Ttrn04wwds_5_tfclinom_sel = AV71TFCliNom_Sel ;
      AV190Ttrn04wwds_6_tfbarenccli = AV160TFBarEncCli ;
      AV191Ttrn04wwds_7_tfbarenccli_sel = AV161TFBarEncCli_Sel ;
      AV192Ttrn04wwds_8_tfbarser = AV73TFBarSer ;
      AV193Ttrn04wwds_9_tfbarser_sel = AV74TFBarSer_Sel ;
      AV194Ttrn04wwds_10_tfbarserdsc = AV76TFBarSerDsc ;
      AV195Ttrn04wwds_11_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV196Ttrn04wwds_12_tfbartipartdsc = AV162TFBarTipArtDsc ;
      AV197Ttrn04wwds_13_tfbartipartdsc_sel = AV163TFBarTipArtDsc_Sel ;
      AV198Ttrn04wwds_14_tfclicod = AV67TFCliCod ;
      AV199Ttrn04wwds_15_tfclicod_to = AV68TFCliCod_To ;
      AV200Ttrn04wwds_16_tfbarcolnom = AV82TFBarColNom ;
      AV201Ttrn04wwds_17_tfbarcolnom_sel = AV83TFBarColNom_Sel ;
      AV202Ttrn04wwds_18_tfbarcolnum = AV85TFBarColNum ;
      AV203Ttrn04wwds_19_tfbarcolnum_to = AV86TFBarColNum_To ;
      AV204Ttrn04wwds_20_tfbarfecgen = AV91TFBarFecGen ;
      AV205Ttrn04wwds_21_tfbarfeccli = AV96TFBarFecCli ;
      AV206Ttrn04wwds_22_tfbarfecsal = AV106TFBarFecSal ;
      AV207Ttrn04wwds_23_tfbarsit = AV148TFBarSit ;
      AV208Ttrn04wwds_24_tfbarsit_to = AV149TFBarSit_To ;
      AV209Ttrn04wwds_25_tfhayrec_sel = AV159TFHayRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV158FilterFullText, A396EmprCod, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV168Emprcod, AV184Pgmname, AV154UsurCod, AV152Station, AV139TFBarNHdr, AV140TFBarNHdr_Sel, AV70TFCliNom, AV71TFCliNom_Sel, AV160TFBarEncCli, AV161TFBarEncCli_Sel, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV162TFBarTipArtDsc, AV163TFBarTipArtDsc_Sel, AV67TFCliCod, AV68TFCliCod_To, AV82TFBarColNom, AV83TFBarColNom_Sel, AV85TFBarColNum, AV86TFBarColNum_To, AV91TFBarFecGen, AV96TFBarFecCli, AV106TFBarFecSal, AV148TFBarSit, AV149TFBarSit_To, AV159TFHayRec_Sel, AV13OrderedBy, AV14OrderedDsc, Gx_mode, AV176Pwdgrl) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV185Ttrn04wwds_1_filterfulltext = AV158FilterFullText ;
      AV186Ttrn04wwds_2_tfbarnhdr = AV139TFBarNHdr ;
      AV187Ttrn04wwds_3_tfbarnhdr_sel = AV140TFBarNHdr_Sel ;
      AV188Ttrn04wwds_4_tfclinom = AV70TFCliNom ;
      AV189Ttrn04wwds_5_tfclinom_sel = AV71TFCliNom_Sel ;
      AV190Ttrn04wwds_6_tfbarenccli = AV160TFBarEncCli ;
      AV191Ttrn04wwds_7_tfbarenccli_sel = AV161TFBarEncCli_Sel ;
      AV192Ttrn04wwds_8_tfbarser = AV73TFBarSer ;
      AV193Ttrn04wwds_9_tfbarser_sel = AV74TFBarSer_Sel ;
      AV194Ttrn04wwds_10_tfbarserdsc = AV76TFBarSerDsc ;
      AV195Ttrn04wwds_11_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV196Ttrn04wwds_12_tfbartipartdsc = AV162TFBarTipArtDsc ;
      AV197Ttrn04wwds_13_tfbartipartdsc_sel = AV163TFBarTipArtDsc_Sel ;
      AV198Ttrn04wwds_14_tfclicod = AV67TFCliCod ;
      AV199Ttrn04wwds_15_tfclicod_to = AV68TFCliCod_To ;
      AV200Ttrn04wwds_16_tfbarcolnom = AV82TFBarColNom ;
      AV201Ttrn04wwds_17_tfbarcolnom_sel = AV83TFBarColNom_Sel ;
      AV202Ttrn04wwds_18_tfbarcolnum = AV85TFBarColNum ;
      AV203Ttrn04wwds_19_tfbarcolnum_to = AV86TFBarColNum_To ;
      AV204Ttrn04wwds_20_tfbarfecgen = AV91TFBarFecGen ;
      AV205Ttrn04wwds_21_tfbarfeccli = AV96TFBarFecCli ;
      AV206Ttrn04wwds_22_tfbarfecsal = AV106TFBarFecSal ;
      AV207Ttrn04wwds_23_tfbarsit = AV148TFBarSit ;
      AV208Ttrn04wwds_24_tfbarsit_to = AV149TFBarSit_To ;
      AV209Ttrn04wwds_25_tfhayrec_sel = AV159TFHayRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV158FilterFullText, A396EmprCod, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV168Emprcod, AV184Pgmname, AV154UsurCod, AV152Station, AV139TFBarNHdr, AV140TFBarNHdr_Sel, AV70TFCliNom, AV71TFCliNom_Sel, AV160TFBarEncCli, AV161TFBarEncCli_Sel, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV162TFBarTipArtDsc, AV163TFBarTipArtDsc_Sel, AV67TFCliCod, AV68TFCliCod_To, AV82TFBarColNom, AV83TFBarColNom_Sel, AV85TFBarColNum, AV86TFBarColNum_To, AV91TFBarFecGen, AV96TFBarFecCli, AV106TFBarFecSal, AV148TFBarSit, AV149TFBarSit_To, AV159TFHayRec_Sel, AV13OrderedBy, AV14OrderedDsc, Gx_mode, AV176Pwdgrl) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV185Ttrn04wwds_1_filterfulltext = AV158FilterFullText ;
      AV186Ttrn04wwds_2_tfbarnhdr = AV139TFBarNHdr ;
      AV187Ttrn04wwds_3_tfbarnhdr_sel = AV140TFBarNHdr_Sel ;
      AV188Ttrn04wwds_4_tfclinom = AV70TFCliNom ;
      AV189Ttrn04wwds_5_tfclinom_sel = AV71TFCliNom_Sel ;
      AV190Ttrn04wwds_6_tfbarenccli = AV160TFBarEncCli ;
      AV191Ttrn04wwds_7_tfbarenccli_sel = AV161TFBarEncCli_Sel ;
      AV192Ttrn04wwds_8_tfbarser = AV73TFBarSer ;
      AV193Ttrn04wwds_9_tfbarser_sel = AV74TFBarSer_Sel ;
      AV194Ttrn04wwds_10_tfbarserdsc = AV76TFBarSerDsc ;
      AV195Ttrn04wwds_11_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV196Ttrn04wwds_12_tfbartipartdsc = AV162TFBarTipArtDsc ;
      AV197Ttrn04wwds_13_tfbartipartdsc_sel = AV163TFBarTipArtDsc_Sel ;
      AV198Ttrn04wwds_14_tfclicod = AV67TFCliCod ;
      AV199Ttrn04wwds_15_tfclicod_to = AV68TFCliCod_To ;
      AV200Ttrn04wwds_16_tfbarcolnom = AV82TFBarColNom ;
      AV201Ttrn04wwds_17_tfbarcolnom_sel = AV83TFBarColNom_Sel ;
      AV202Ttrn04wwds_18_tfbarcolnum = AV85TFBarColNum ;
      AV203Ttrn04wwds_19_tfbarcolnum_to = AV86TFBarColNum_To ;
      AV204Ttrn04wwds_20_tfbarfecgen = AV91TFBarFecGen ;
      AV205Ttrn04wwds_21_tfbarfeccli = AV96TFBarFecCli ;
      AV206Ttrn04wwds_22_tfbarfecsal = AV106TFBarFecSal ;
      AV207Ttrn04wwds_23_tfbarsit = AV148TFBarSit ;
      AV208Ttrn04wwds_24_tfbarsit_to = AV149TFBarSit_To ;
      AV209Ttrn04wwds_25_tfhayrec_sel = AV159TFHayRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV158FilterFullText, A396EmprCod, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV168Emprcod, AV184Pgmname, AV154UsurCod, AV152Station, AV139TFBarNHdr, AV140TFBarNHdr_Sel, AV70TFCliNom, AV71TFCliNom_Sel, AV160TFBarEncCli, AV161TFBarEncCli_Sel, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV162TFBarTipArtDsc, AV163TFBarTipArtDsc_Sel, AV67TFCliCod, AV68TFCliCod_To, AV82TFBarColNom, AV83TFBarColNom_Sel, AV85TFBarColNum, AV86TFBarColNum_To, AV91TFBarFecGen, AV96TFBarFecCli, AV106TFBarFecSal, AV148TFBarSit, AV149TFBarSit_To, AV159TFHayRec_Sel, AV13OrderedBy, AV14OrderedDsc, Gx_mode, AV176Pwdgrl) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV184Pgmname = "TTrn04WW" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupEG0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19EG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV48ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV126DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV45ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV128GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV129GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_delete_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Title") ;
         Dvelop_confirmpanel_delete_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Confirmationtext") ;
         Dvelop_confirmpanel_delete_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Yesbuttoncaption") ;
         Dvelop_confirmpanel_delete_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Nobuttoncaption") ;
         Dvelop_confirmpanel_delete_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_delete_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Yesbuttonposition") ;
         Dvelop_confirmpanel_delete_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Confirmtype") ;
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
         Dvelop_confirmpanel_delete_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Result") ;
         /* Read variables values. */
         AV158FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV158FilterFullText", AV158FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATE");
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV93DDO_BarFecGenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93DDO_BarFecGenAuxDate", localUtil.format(AV93DDO_BarFecGenAuxDate, "99/99/99"));
         }
         else
         {
            AV93DDO_BarFecGenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93DDO_BarFecGenAuxDate", localUtil.format(AV93DDO_BarFecGenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_barfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV98DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98DDO_BarFecCliAuxDate", localUtil.format(AV98DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV98DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98DDO_BarFecCliAuxDate", localUtil.format(AV98DDO_BarFecCliAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECSALAUXDATE");
            GX_FocusControl = edtavDdo_barfecsalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV108DDO_BarFecSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108DDO_BarFecSalAuxDate", localUtil.format(AV108DDO_BarFecSalAuxDate, "99/99/99"));
         }
         else
         {
            AV108DDO_BarFecSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108DDO_BarFecSalAuxDate", localUtil.format(AV108DDO_BarFecSalAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_41_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         if ( nGXsfl_41_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV164GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164GridActions), 4, 0));
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
            n13711BarTipArtD = false ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A159BarFecGen = localUtil.ctod( httpContext.cgiGet( edtBarFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A155BarFecCli = localUtil.ctod( httpContext.cgiGet( edtBarFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A161BarFecSal = localUtil.ctod( httpContext.cgiGet( edtBarFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13710HayRec = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkHayRec.getInternalname()), "1")==0) ? 1 : 0)) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3594BarPriTin = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPriTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2265BarExt = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV158FilterFullText) != 0 )
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
      e19EG2 ();
      if (returnInSub) return;
   }

   public void e19EG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char3 = AV152Station ;
      GXv_char7[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char7) ;
      ttrn04ww_impl.this.GXt_char3 = GXv_char7[0] ;
      AV152Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152Station", AV152Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV152Station, ""))));
      GXv_char7[0] = A396EmprCod ;
      GXv_char6[0] = AV153EmprNom ;
      GXv_char5[0] = AV154UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV152Station, GXv_char7, GXv_char6, GXv_char5) ;
      ttrn04ww_impl.this.A396EmprCod = GXv_char7[0] ;
      ttrn04ww_impl.this.AV153EmprNom = GXv_char6[0] ;
      ttrn04ww_impl.this.AV154UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV154UsurCod", AV154UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV154UsurCod, "@!"))));
      GXt_int1 = (byte)(AV155Varnormas) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STNORM", ""), GXv_int2) ;
      ttrn04ww_impl.this.GXt_int1 = GXv_int2[0] ;
      AV155Varnormas = GXt_int1 ;
      GXt_int1 = (byte)(AV156Carvitin) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int2) ;
      ttrn04ww_impl.this.GXt_int1 = GXv_int2[0] ;
      AV156Carvitin = GXt_int1 ;
      AV183Actdatos = "N" ;
      AV179WebSession.setValue("ActDatos", "");
      AV165BarFecGen = GXutil.dadd(GXutil.today( ),-(7)) ;
      AV166BarFecGen_To = GXutil.resetTime(GXutil.now( )) ;
      GXt_char3 = AV152Station ;
      GXv_char7[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char7) ;
      ttrn04ww_impl.this.GXt_char3 = GXv_char7[0] ;
      AV152Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152Station", AV152Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV152Station, ""))));
      GXv_char7[0] = AV168Emprcod ;
      GXv_char6[0] = AV153EmprNom ;
      GXv_char5[0] = AV154UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV152Station, GXv_char7, GXv_char6, GXv_char5) ;
      ttrn04ww_impl.this.AV168Emprcod = GXv_char7[0] ;
      ttrn04ww_impl.this.AV153EmprNom = GXv_char6[0] ;
      ttrn04ww_impl.this.AV154UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV168Emprcod", AV168Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV154UsurCod", AV154UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV154UsurCod, "@!"))));
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento HDRs ( Eliminar)", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = AV126DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] ;
      AV126DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20EG2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV6WWPContext = GXv_SdtWWPContext10[0] ;
      if ( AV50ManageFiltersExecutionStep == 1 )
      {
         AV50ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50ManageFiltersExecutionStep", GXutil.str( AV50ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV50ManageFiltersExecutionStep == 2 )
      {
         AV50ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50ManageFiltersExecutionStep", GXutil.str( AV50ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV47Session.getValue("TTrn04WWColumnsSelector"), "") != 0 )
      {
         AV43ColumnsSelectorXML = AV47Session.getValue("TTrn04WWColumnsSelector") ;
         AV45ColumnsSelector.fromxml(AV43ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarEncCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArtD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_41_Refreshing);
      chkHayRec.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "Visible", GXutil.ltrimstr( chkHayRec.getVisible(), 5, 0), !bGXsfl_41_Refreshing);
      AV128GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV128GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridCurrentPage), 10, 0));
      AV129GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129GridPageCount), 10, 0));
      AV183Actdatos = httpContext.getMessage( "N", "") ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV179WebSession.getValue("ActDatos"))), httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char7[0] = AV168Emprcod ;
         GXv_int11[0] = A129BarCod ;
         GXv_int2[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_int12[0] = A361DisCod ;
         new app.pbordis(remoteHandle, context).execute( GXv_char7, GXv_int11, GXv_int2, GXv_char6, GXv_int12) ;
         ttrn04ww_impl.this.AV168Emprcod = GXv_char7[0] ;
         ttrn04ww_impl.this.A129BarCod = GXv_int11[0] ;
         ttrn04ww_impl.this.A132BarCodReo = GXv_int2[0] ;
         ttrn04ww_impl.this.A130BarCodPar = GXv_char6[0] ;
         ttrn04ww_impl.this.A361DisCod = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV168Emprcod", AV168Emprcod);
         AV180Inc_obs = httpContext.getMessage( "->Eliminacion Hdr ", "") + A13696BarNHdr + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( AV168Emprcod, GXutil.substring( AV184Pgmname, 1, 10), AV154UsurCod, AV152Station, AV180Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      AV185Ttrn04wwds_1_filterfulltext = AV158FilterFullText ;
      AV186Ttrn04wwds_2_tfbarnhdr = AV139TFBarNHdr ;
      AV187Ttrn04wwds_3_tfbarnhdr_sel = AV140TFBarNHdr_Sel ;
      AV188Ttrn04wwds_4_tfclinom = AV70TFCliNom ;
      AV189Ttrn04wwds_5_tfclinom_sel = AV71TFCliNom_Sel ;
      AV190Ttrn04wwds_6_tfbarenccli = AV160TFBarEncCli ;
      AV191Ttrn04wwds_7_tfbarenccli_sel = AV161TFBarEncCli_Sel ;
      AV192Ttrn04wwds_8_tfbarser = AV73TFBarSer ;
      AV193Ttrn04wwds_9_tfbarser_sel = AV74TFBarSer_Sel ;
      AV194Ttrn04wwds_10_tfbarserdsc = AV76TFBarSerDsc ;
      AV195Ttrn04wwds_11_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV196Ttrn04wwds_12_tfbartipartdsc = AV162TFBarTipArtDsc ;
      AV197Ttrn04wwds_13_tfbartipartdsc_sel = AV163TFBarTipArtDsc_Sel ;
      AV198Ttrn04wwds_14_tfclicod = AV67TFCliCod ;
      AV199Ttrn04wwds_15_tfclicod_to = AV68TFCliCod_To ;
      AV200Ttrn04wwds_16_tfbarcolnom = AV82TFBarColNom ;
      AV201Ttrn04wwds_17_tfbarcolnom_sel = AV83TFBarColNom_Sel ;
      AV202Ttrn04wwds_18_tfbarcolnum = AV85TFBarColNum ;
      AV203Ttrn04wwds_19_tfbarcolnum_to = AV86TFBarColNum_To ;
      AV204Ttrn04wwds_20_tfbarfecgen = AV91TFBarFecGen ;
      AV205Ttrn04wwds_21_tfbarfeccli = AV96TFBarFecCli ;
      AV206Ttrn04wwds_22_tfbarfecsal = AV106TFBarFecSal ;
      AV207Ttrn04wwds_23_tfbarsit = AV148TFBarSit ;
      AV208Ttrn04wwds_24_tfbarsit_to = AV149TFBarSit_To ;
      AV209Ttrn04wwds_25_tfhayrec_sel = AV159TFHayRec_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45ColumnsSelector", AV45ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12EG2( )
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
         AV127PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV127PageToGo) ;
      }
   }

   public void e13EG2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14EG2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV139TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139TFBarNHdr", AV139TFBarNHdr);
            AV140TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV140TFBarNHdr_Sel", AV140TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV70TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFCliNom", AV70TFCliNom);
            AV71TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFCliNom_Sel", AV71TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarEncCli") == 0 )
         {
            AV160TFBarEncCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV160TFBarEncCli", AV160TFBarEncCli);
            AV161TFBarEncCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV161TFBarEncCli_Sel", AV161TFBarEncCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV73TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFBarSer", AV73TFBarSer);
            AV74TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFBarSer_Sel", AV74TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV76TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFBarSerDsc", AV76TFBarSerDsc);
            AV77TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFBarSerDsc_Sel", AV77TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipArtDsc") == 0 )
         {
            AV162TFBarTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV162TFBarTipArtDsc", AV162TFBarTipArtDsc);
            AV163TFBarTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV163TFBarTipArtDsc_Sel", AV163TFBarTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV67TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFCliCod), 6, 0));
            AV68TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV82TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFBarColNom", AV82TFBarColNom);
            AV83TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFBarColNom_Sel", AV83TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV85TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarColNum), 6, 0));
            AV86TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecGen") == 0 )
         {
            AV91TFBarFecGen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarFecGen", localUtil.format(AV91TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCli") == 0 )
         {
            AV96TFBarFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFBarFecCli", localUtil.format(AV96TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecSal") == 0 )
         {
            AV106TFBarFecSal = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarFecSal", localUtil.format(AV106TFBarFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV148TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148TFBarSit), 2, 0));
            AV149TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV149TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HayRec") == 0 )
         {
            AV159TFHayRec_Sel = (byte)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV159TFHayRec_Sel", GXutil.str( AV159TFHayRec_Sel, 1, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21EG2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         if ( A213BarSit < 9 )
         {
            cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( ( A213BarSit == 1 ) || ( A213BarSit == 2 ) )
         {
            cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Piezas", ""), "fa fa-store", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Procesos", ""), "fas fa-industry", "", "", "", "", "", "", ""), (short)(0));
         GXt_int1 = (byte)(0) ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STDNOR", ""), GXv_int2) ;
         ttrn04ww_impl.this.GXt_int1 = GXv_int2[0] ;
         AV169TempBoolean = (boolean)((GXt_int1==1)) ;
         if ( AV169TempBoolean )
         {
            cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Normas Estandares Textil", ""), "fa fa-shapes", "", "", "", "", "", "", ""), (short)(0));
         }
         GXt_int1 = (byte)(0) ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( AV168Emprcod, httpContext.getMessage( "CARVIT", ""), GXv_int2) ;
         ttrn04ww_impl.this.GXt_int1 = GXv_int2[0] ;
         AV169TempBoolean = (boolean)((GXt_int1==1)) ;
         if ( AV169TempBoolean )
         {
            cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Mantenimiento Partida", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Notas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         sendrow_412( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV164GridActions, 4, 0)) );
   }

   public void e15EG2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV43ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV45ColumnsSelector.fromJSonString(AV43ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TTrn04WWColumnsSelector", ((GXutil.strcmp("", AV43ColumnsSelectorXML)==0) ? "" : AV45ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45ColumnsSelector", AV45ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11EG2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TTrn04WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV184Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV50ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50ManageFiltersExecutionStep", GXutil.str( AV50ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TTrn04WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV50ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50ManageFiltersExecutionStep", GXutil.str( AV50ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char3 = AV49ManageFiltersXml ;
         GXv_char7[0] = GXt_char3 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TTrn04WWFilters", Ddo_managefilters_Activeeventkey, GXv_char7) ;
         ttrn04ww_impl.this.GXt_char3 = GXv_char7[0] ;
         AV49ManageFiltersXml = GXt_char3 ;
         if ( (GXutil.strcmp("", AV49ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV184Pgmname+"GridState", AV49ManageFiltersXml) ;
            AV10GridState.fromxml(AV49ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45ColumnsSelector", AV45ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
   }

   public void e22EG2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV164GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV164GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV164GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV164GridActions == 4 )
      {
         /* Execute user subroutine: 'DO PIEZAS' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV164GridActions == 5 )
      {
         /* Execute user subroutine: 'DO PROCESOS' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV164GridActions == 6 )
      {
         /* Execute user subroutine: 'DO NORMAS' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV164GridActions == 7 )
      {
         /* Execute user subroutine: 'DO MANTENIMIENTOPARTIDA' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV164GridActions == 8 )
      {
         /* Execute user subroutine: 'DO NOTAS' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV164GridActions == 9 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S272 ();
         if (returnInSub) return;
      }
      AV164GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV164GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45ColumnsSelector", AV45ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e16EG2( )
   {
      /* Dvelop_confirmpanel_delete_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_delete_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DELETE' */
         S282 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45ColumnsSelector", AV45ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e17EG2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char7[0] = AV41ExcelFilename ;
      GXv_char6[0] = AV42ErrorMessage ;
      new app.ttrn04wwexport(remoteHandle, context).execute( GXv_char7, GXv_char6) ;
      ttrn04ww_impl.this.AV41ExcelFilename = GXv_char7[0] ;
      ttrn04ww_impl.this.AV42ErrorMessage = GXv_char6[0] ;
      if ( GXutil.strcmp(AV41ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV41ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV42ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e18EG2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.ttrn04wwexportcsv", new String[] {}, new String[] {}) );
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
      AV45ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarNHdr", "", "N° Hdr", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "CliNom", "", "Nombre Cliente", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarEncCli", "", "Disposicion Cliente Nueva", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarSer", "", "Serie", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarTipArtDsc", "", "Descripcion Tipo Articulo", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "CliCod", "", "Cliente", false, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarColNom", "", "Nombre Color", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarColNum", "", "Numero del Color", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarFecGen", "", "Fecha Generacion Barcada", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarFecCli", "", "Fecha Disposicion Cliente", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarSit", "", "St", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "HayRec", "", "Receta?", false, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXt_char3 = AV44UserCustomValue ;
      GXv_char7[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTrn04WWColumnsSelector", GXv_char7) ;
      ttrn04ww_impl.this.GXt_char3 = GXv_char7[0] ;
      AV44UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV44UserCustomValue)==0) ) )
      {
         AV46ColumnsSelectorAux.fromxml(AV44UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector13[0] = AV46ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector14[0] = AV45ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, GXv_SdtWWPColumnsSelector14) ;
         AV46ColumnsSelectorAux = GXv_SdtWWPColumnsSelector13[0] ;
         AV45ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = AV48ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TTrn04WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[0] ;
      AV48ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV158FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV158FilterFullText", AV158FilterFullText);
      AV139TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV139TFBarNHdr", AV139TFBarNHdr);
      AV140TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140TFBarNHdr_Sel", AV140TFBarNHdr_Sel);
      AV70TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFCliNom", AV70TFCliNom);
      AV71TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFCliNom_Sel", AV71TFCliNom_Sel);
      AV160TFBarEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV160TFBarEncCli", AV160TFBarEncCli);
      AV161TFBarEncCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV161TFBarEncCli_Sel", AV161TFBarEncCli_Sel);
      AV73TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFBarSer", AV73TFBarSer);
      AV74TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFBarSer_Sel", AV74TFBarSer_Sel);
      AV76TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFBarSerDsc", AV76TFBarSerDsc);
      AV77TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFBarSerDsc_Sel", AV77TFBarSerDsc_Sel);
      AV162TFBarTipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV162TFBarTipArtDsc", AV162TFBarTipArtDsc);
      AV163TFBarTipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV163TFBarTipArtDsc_Sel", AV163TFBarTipArtDsc_Sel);
      AV67TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFCliCod), 6, 0));
      AV68TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFCliCod_To), 6, 0));
      AV82TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFBarColNom", AV82TFBarColNom);
      AV83TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFBarColNom_Sel", AV83TFBarColNom_Sel);
      AV85TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarColNum), 6, 0));
      AV86TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarColNum_To), 6, 0));
      AV91TFBarFecGen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarFecGen", localUtil.format(AV91TFBarFecGen, "99/99/99"));
      AV96TFBarFecCli = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96TFBarFecCli", localUtil.format(AV96TFBarFecCli, "99/99/99"));
      AV106TFBarFecSal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarFecSal", localUtil.format(AV106TFBarFecSal, "99/99/99"));
      AV148TFBarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV148TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148TFBarSit), 2, 0));
      AV149TFBarSit_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV149TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149TFBarSit_To), 2, 0));
      AV159TFHayRec_Sel = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV159TFHayRec_Sel", GXutil.str( AV159TFHayRec_Sel, 1, 0));
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
         httpContext.popup(formatLink("app.ttrn04view", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","TabCode"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      httpContext.popup(formatLink("app.ttrn04", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.ttrn04", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_delete_Confirmationtext = httpContext.getMessage( "¿Desea eliminar la HDR Nº ", "")+A13696BarNHdr+"?" ;
      ucDvelop_confirmpanel_delete.sendProperty(context, "", false, Dvelop_confirmpanel_delete_Internalname, "ConfirmationText", Dvelop_confirmpanel_delete_Confirmationtext);
      AV170EmprCod_Selected = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170EmprCod_Selected", AV170EmprCod_Selected);
      AV171BarCod_Selected = A129BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV171BarCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV171BarCod_Selected), 8, 0));
      AV172BarCodReo_Selected = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV172BarCodReo_Selected", GXutil.str( AV172BarCodReo_Selected, 1, 0));
      AV173BarCodPar_Selected = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV173BarCodPar_Selected", AV173BarCodPar_Selected);
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DELETEContainer", "Confirm", "", new Object[] {});
   }

   public void S282( )
   {
      /* 'DO ACTION DELETE' Routine */
      returnInSub = false ;
      AV174Flag = (byte)(0) ;
      GXv_char7[0] = AV168Emprcod ;
      GXv_int12[0] = A129BarCod ;
      GXv_int2[0] = A132BarCodReo ;
      GXv_char6[0] = A130BarCodPar ;
      GXv_int17[0] = (byte)(AV175Lhipro) ;
      new app.plhipct(remoteHandle, context).execute( GXv_char7, GXv_int12, GXv_int2, GXv_char6, GXv_int17) ;
      ttrn04ww_impl.this.AV168Emprcod = GXv_char7[0] ;
      ttrn04ww_impl.this.A129BarCod = GXv_int12[0] ;
      ttrn04ww_impl.this.A132BarCodReo = GXv_int2[0] ;
      ttrn04ww_impl.this.A130BarCodPar = GXv_char6[0] ;
      ttrn04ww_impl.this.AV175Lhipro = GXv_int17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV168Emprcod", AV168Emprcod);
      if ( AV175Lhipro == 1 )
      {
         /* Using cursor H00EG4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A153BarFasEst = H00EG4_A153BarFasEst[0] ;
            A194BarOrdLin = H00EG4_A194BarOrdLin[0] ;
            A758ProCod = H00EG4_A758ProCod[0] ;
            if ( A153BarFasEst >= 1 )
            {
               AV174Flag = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      if ( AV174Flag == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atención. Hoja de Ruta iniciada en Producción. No se permite su eliminación", ""));
      }
      else
      {
         if ( (0==AV176Pwdgrl) )
         {
            AV179WebSession.setValue("ActDatos", "S");
            httpContext.doAjaxRefresh();
         }
         else
         {
            AV179WebSession.setValue("ActDatos", "");
            httpContext.popup(formatLink("app.confirmacionpassword", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV178contval,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Contval","PwdBo"}) , new Object[] {"AV178contval","AV177PwdBo"});
            httpContext.doAjaxRefresh();
         }
      }
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.ttrn04", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV170EmprCod_Selected)),GXutil.URLEncode(GXutil.ltrimstr(AV171BarCod_Selected,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV172BarCodReo_Selected,1,0)),GXutil.URLEncode(GXutil.rtrim(AV173BarCodPar_Selected))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S222( )
   {
      /* 'DO PIEZAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tbarpin", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO PROCESOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webwbarprotabla", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A3594BarPriTin,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A2265BarExt,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Discod","BarSit","Barext"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A361DisCod","A3594BarPriTin","A2265BarExt"});
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO NORMAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tdisnor", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S252( )
   {
      /* 'DO MANTENIMIENTOPARTIDA' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.mantenimientodelapartida", new String[] {GXutil.URLEncode(GXutil.rtrim(AV168Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie))}, new String[] {"EmprCod","Clicod","BarEnccli"}) , new Object[] {"AV168Emprcod","A252CliCod","A13878PedidoClie"});
      httpContext.doAjaxRefresh();
   }

   public void S262( )
   {
      /* 'DO NOTAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tnotashdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","DisCod","CliCod","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S272( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tdisobs", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue(AV184Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV184Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV47Session.getValue(AV184Pgmname+"GridState"), null, null);
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
      AV212GXV1 = 1 ;
      while ( AV212GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV212GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV158FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV158FilterFullText", AV158FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV139TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139TFBarNHdr", AV139TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV140TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV140TFBarNHdr_Sel", AV140TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV70TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFCliNom", AV70TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV71TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFCliNom_Sel", AV71TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV160TFBarEncCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV160TFBarEncCli", AV160TFBarEncCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV161TFBarEncCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV161TFBarEncCli_Sel", AV161TFBarEncCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV73TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFBarSer", AV73TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV74TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFBarSer_Sel", AV74TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV76TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFBarSerDsc", AV76TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV77TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFBarSerDsc_Sel", AV77TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV162TFBarTipArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV162TFBarTipArtDsc", AV162TFBarTipArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV163TFBarTipArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV163TFBarTipArtDsc_Sel", AV163TFBarTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV67TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFCliCod), 6, 0));
            AV68TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV82TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFBarColNom", AV82TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV83TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFBarColNom_Sel", AV83TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV85TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarColNum), 6, 0));
            AV86TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV91TFBarFecGen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarFecGen", localUtil.format(AV91TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV96TFBarFecCli = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFBarFecCli", localUtil.format(AV96TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV106TFBarFecSal = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarFecSal", localUtil.format(AV106TFBarFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV148TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148TFBarSit), 2, 0));
            AV149TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV149TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHAYREC_SEL") == 0 )
         {
            AV159TFHayRec_Sel = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV159TFHayRec_Sel", GXutil.str( AV159TFHayRec_Sel, 1, 0));
         }
         AV212GXV1 = (int)(AV212GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char7[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV140TFBarNHdr_Sel)==0), AV140TFBarNHdr_Sel, GXv_char7) ;
      ttrn04ww_impl.this.GXt_char3 = GXv_char7[0] ;
      GXt_char18 = "" ;
      GXv_char6[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFCliNom_Sel)==0), AV71TFCliNom_Sel, GXv_char6) ;
      ttrn04ww_impl.this.GXt_char18 = GXv_char6[0] ;
      GXt_char19 = "" ;
      GXv_char5[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV161TFBarEncCli_Sel)==0), AV161TFBarEncCli_Sel, GXv_char5) ;
      ttrn04ww_impl.this.GXt_char19 = GXv_char5[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFBarSer_Sel)==0), AV74TFBarSer_Sel, GXv_char4) ;
      ttrn04ww_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFBarSerDsc_Sel)==0), AV77TFBarSerDsc_Sel, GXv_char22) ;
      ttrn04ww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV163TFBarTipArtDsc_Sel)==0), AV163TFBarTipArtDsc_Sel, GXv_char24) ;
      ttrn04ww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFBarColNom_Sel)==0), AV83TFBarColNom_Sel, GXv_char26) ;
      ttrn04ww_impl.this.GXt_char25 = GXv_char26[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char3+"|"+GXt_char18+"|"+GXt_char19+"|"+GXt_char20+"|"+GXt_char21+"|"+GXt_char23+"||"+GXt_char25+"||||||"+((0==AV159TFHayRec_Sel) ? "" : GXutil.str( AV159TFHayRec_Sel, 1, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV139TFBarNHdr)==0), AV139TFBarNHdr, GXv_char26) ;
      ttrn04ww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFCliNom)==0), AV70TFCliNom, GXv_char24) ;
      ttrn04ww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV160TFBarEncCli)==0), AV160TFBarEncCli, GXv_char22) ;
      ttrn04ww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char20 = "" ;
      GXv_char7[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFBarSer)==0), AV73TFBarSer, GXv_char7) ;
      ttrn04ww_impl.this.GXt_char20 = GXv_char7[0] ;
      GXt_char19 = "" ;
      GXv_char6[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFBarSerDsc)==0), AV76TFBarSerDsc, GXv_char6) ;
      ttrn04ww_impl.this.GXt_char19 = GXv_char6[0] ;
      GXt_char18 = "" ;
      GXv_char5[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV162TFBarTipArtDsc)==0), AV162TFBarTipArtDsc, GXv_char5) ;
      ttrn04ww_impl.this.GXt_char18 = GXv_char5[0] ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFBarColNom)==0), AV82TFBarColNom, GXv_char4) ;
      ttrn04ww_impl.this.GXt_char3 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = GXt_char25+"|"+GXt_char23+"|"+GXt_char21+"|"+GXt_char20+"|"+GXt_char19+"|"+GXt_char18+"|"+((0==AV67TFCliCod) ? "" : GXutil.str( AV67TFCliCod, 6, 0))+"|"+GXt_char3+"|"+((0==AV85TFBarColNum) ? "" : GXutil.str( AV85TFBarColNum, 6, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91TFBarFecGen)) ? "" : localUtil.dtoc( AV91TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96TFBarFecCli)) ? "" : localUtil.dtoc( AV96TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106TFBarFecSal)) ? "" : localUtil.dtoc( AV106TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV148TFBarSit) ? "" : GXutil.str( AV148TFBarSit, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||"+((0==AV68TFCliCod_To) ? "" : GXutil.str( AV68TFCliCod_To, 6, 0))+"||"+((0==AV86TFBarColNum_To) ? "" : GXutil.str( AV86TFBarColNum_To, 6, 0))+"||||"+((0==AV149TFBarSit_To) ? "" : GXutil.str( AV149TFBarSit_To, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV47Session.getValue(AV184Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV158FilterFullText)==0), (short)(0), AV158FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARNHDR", "", !(GXutil.strcmp("", AV139TFBarNHdr)==0), (short)(0), AV139TFBarNHdr, "", !(GXutil.strcmp("", AV140TFBarNHdr_Sel)==0), AV140TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFCLINOM", "", !(GXutil.strcmp("", AV70TFCliNom)==0), (short)(0), AV70TFCliNom, "", !(GXutil.strcmp("", AV71TFCliNom_Sel)==0), AV71TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARENCCLI", "", !(GXutil.strcmp("", AV160TFBarEncCli)==0), (short)(0), AV160TFBarEncCli, "", !(GXutil.strcmp("", AV161TFBarEncCli_Sel)==0), AV161TFBarEncCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARSER", "", !(GXutil.strcmp("", AV73TFBarSer)==0), (short)(0), AV73TFBarSer, "", !(GXutil.strcmp("", AV74TFBarSer_Sel)==0), AV74TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARSERDSC", "", !(GXutil.strcmp("", AV76TFBarSerDsc)==0), (short)(0), AV76TFBarSerDsc, "", !(GXutil.strcmp("", AV77TFBarSerDsc_Sel)==0), AV77TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARTIPARTDSC", "", !(GXutil.strcmp("", AV162TFBarTipArtDsc)==0), (short)(0), AV162TFBarTipArtDsc, "", !(GXutil.strcmp("", AV163TFBarTipArtDsc_Sel)==0), AV163TFBarTipArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFCLICOD", "", !((0==AV67TFCliCod)&&(0==AV68TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV67TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV68TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV82TFBarColNom)==0), (short)(0), AV82TFBarColNom, "", !(GXutil.strcmp("", AV83TFBarColNom_Sel)==0), AV83TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARCOLNUM", "", !((0==AV85TFBarColNum)&&(0==AV86TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV85TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV86TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARFECGEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91TFBarFecGen)), (short)(0), GXutil.trim( localUtil.dtoc( AV91TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96TFBarFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV96TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARFECSAL", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106TFBarFecSal)), (short)(0), GXutil.trim( localUtil.dtoc( AV106TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARSIT", "", !((0==AV148TFBarSit)&&(0==AV149TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV148TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV149TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFHAYREC_SEL", "", !(0==AV159TFHayRec_Sel), (short)(0), GXutil.trim( GXutil.str( AV159TFHayRec_Sel, 1, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV184Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV184Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn04" );
      AV47Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_71_EG2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_delete_Internalname, tblTabledvelop_confirmpanel_delete_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_delete.setProperty("Title", Dvelop_confirmpanel_delete_Title);
         ucDvelop_confirmpanel_delete.setProperty("ConfirmationText", Dvelop_confirmpanel_delete_Confirmationtext);
         ucDvelop_confirmpanel_delete.setProperty("YesButtonCaption", Dvelop_confirmpanel_delete_Yesbuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("NoButtonCaption", Dvelop_confirmpanel_delete_Nobuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("CancelButtonCaption", Dvelop_confirmpanel_delete_Cancelbuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("YesButtonPosition", Dvelop_confirmpanel_delete_Yesbuttonposition);
         ucDvelop_confirmpanel_delete.setProperty("ConfirmType", Dvelop_confirmpanel_delete_Confirmtype);
         ucDvelop_confirmpanel_delete.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_delete_Internalname, "DVELOP_CONFIRMPANEL_DELETEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_DELETEContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_71_EG2e( true) ;
      }
      else
      {
         wb_table2_71_EG2e( false) ;
      }
   }

   public void wb_table1_23_EG2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV48ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefilters_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV158FilterFullText, GXutil.rtrim( localUtil.format( AV158FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TTrn04WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_EG2e( true) ;
      }
      else
      {
         wb_table1_23_EG2e( false) ;
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
      paEG2( ) ;
      wsEG2( ) ;
      weEG2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116115939", true, true);
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
      httpContext.AddJavascriptSource("ttrn04ww.js", "?202682116115939", false, true);
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

   public void subsflControlProps_412( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_41_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_41_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_41_idx ;
      edtBarEncCli_Internalname = "BARENCCLI_"+sGXsfl_41_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_41_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_41_idx ;
      edtBarTipArtD_Internalname = "BARTIPARTD_"+sGXsfl_41_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_41_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_41_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_41_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_41_idx ;
      edtBarFecCli_Internalname = "BARFECCLI_"+sGXsfl_41_idx ;
      edtBarFecSal_Internalname = "BARFECSAL_"+sGXsfl_41_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_41_idx ;
      chkHayRec.setInternalname( "HAYREC_"+sGXsfl_41_idx );
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_41_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_41_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_41_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_41_idx ;
      edtBarPriTin_Internalname = "BARPRITIN_"+sGXsfl_41_idx ;
      edtBarExt_Internalname = "BAREXT_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_41_fel_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_41_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_41_fel_idx ;
      edtBarEncCli_Internalname = "BARENCCLI_"+sGXsfl_41_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_41_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_41_fel_idx ;
      edtBarTipArtD_Internalname = "BARTIPARTD_"+sGXsfl_41_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_41_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_41_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_41_fel_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_41_fel_idx ;
      edtBarFecCli_Internalname = "BARFECCLI_"+sGXsfl_41_fel_idx ;
      edtBarFecSal_Internalname = "BARFECSAL_"+sGXsfl_41_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_41_fel_idx ;
      chkHayRec.setInternalname( "HAYREC_"+sGXsfl_41_fel_idx );
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_41_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_41_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_41_fel_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_41_fel_idx ;
      edtBarPriTin_Internalname = "BARPRITIN_"+sGXsfl_41_fel_idx ;
      edtBarExt_Internalname = "BAREXT_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wbEG0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_41_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV164GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV164GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV164GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_41_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV164GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarEncCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEncCli_Internalname,GXutil.rtrim( A4812BarEncCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEncCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarEncCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArtD_Internalname,GXutil.rtrim( A13711BarTipArtD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecSal_Internalname,localUtil.format(A161BarFecSal, "99/99/99"),localUtil.format( A161BarFecSal, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkHayRec.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "HAYREC_" + sGXsfl_41_idx ;
         chkHayRec.setName( GXCCtl );
         chkHayRec.setWebtags( "" );
         chkHayRec.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "TitleCaption", chkHayRec.getCaption(), !bGXsfl_41_Refreshing);
         chkHayRec.setCheckedValue( "0" );
         A13710HayRec = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkHayRec.getInternalname(),GXutil.str( A13710HayRec, 1, 0),"","",Integer.valueOf(chkHayRec.getVisible()),Integer.valueOf(0),"1","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPriTin_Internalname,GXutil.ltrim( localUtil.ntoc( A3594BarPriTin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPriTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarExt_Internalname,GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesEG2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarEncCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disposicion Cliente Nueva", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero del Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Generacion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Disposicion Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Salida en Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "St", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkHayRec.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Receta?", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV164GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4812BarEncCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarEncCli_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13711BarTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecGen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A161BarFecSal, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecSal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkHayRec.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3594BarPriTin, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
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
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      divTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtBarEncCli_Internalname = "BARENCCLI" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarTipArtD_Internalname = "BARTIPARTD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarFecGen_Internalname = "BARFECGEN" ;
      edtBarFecCli_Internalname = "BARFECCLI" ;
      edtBarFecSal_Internalname = "BARFECSAL" ;
      edtBarSit_Internalname = "BARSIT" ;
      chkHayRec.setInternalname( "HAYREC" );
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtBarPriTin_Internalname = "BARPRITIN" ;
      edtBarExt_Internalname = "BAREXT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_delete_Internalname = "DVELOP_CONFIRMPANEL_DELETE" ;
      tblTabledvelop_confirmpanel_delete_Internalname = "TABLEDVELOP_CONFIRMPANEL_DELETE" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_barfecgenauxdate_Internalname = "vDDO_BARFECGENAUXDATE" ;
      divDdo_barfecgenauxdates_Internalname = "DDO_BARFECGENAUXDATES" ;
      edtavDdo_barfeccliauxdate_Internalname = "vDDO_BARFECCLIAUXDATE" ;
      divDdo_barfeccliauxdates_Internalname = "DDO_BARFECCLIAUXDATES" ;
      edtavDdo_barfecsalauxdate_Internalname = "vDDO_BARFECSALAUXDATE" ;
      divDdo_barfecsalauxdates_Internalname = "DDO_BARFECSALAUXDATES" ;
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
      edtBarExt_Jsonclick = "" ;
      edtBarPriTin_Jsonclick = "" ;
      edtDisCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      chkHayRec.setCaption( "" );
      edtBarSit_Jsonclick = "" ;
      edtBarFecSal_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarTipArtD_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarEncCli_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkHayRec.setVisible( -1 );
      edtBarSit_Visible = -1 ;
      edtBarFecSal_Visible = -1 ;
      edtBarFecCli_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtBarTipArtD_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarEncCli_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfecsalauxdate_Jsonclick = "" ;
      edtavDdo_barfeccliauxdate_Jsonclick = "" ;
      edtavDdo_barfecgenauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_delete_Confirmtype = "1" ;
      Dvelop_confirmpanel_delete_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_delete_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_delete_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_delete_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_delete_Confirmationtext = "¿Desea eliminar la HDR?" ;
      Dvelop_confirmpanel_delete_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "TTrn04WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||1:WWP_TSChecked,2:WWP_TSUnChecked" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||||||FixedValues" ;
      Ddo_grid_Includedatalist = "T|T|T|T|T|T||T||||||T" ;
      Ddo_grid_Filterisrange = "||||||T||T||||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Character|Character|Numeric|Character|Numeric|Date|Date|Date|Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|5|6|7|8|9|1|10|11|12|" ;
      Ddo_grid_Columnids = "1:BarNHdr|2:CliNom|3:BarEncCli|4:BarSer|5:BarSerDsc|6:BarTipArtDsc|7:CliCod|8:BarColNom|9:BarColNum|10:BarFecGen|11:BarFecCli|12:BarFecSal|13:BarSit|14:HayRec" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento HDRs ( Eliminar)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_41_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV164GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV164GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV164GridActions), 4, 0));
      }
      GXCCtl = "HAYREC_" + sGXsfl_41_idx ;
      chkHayRec.setName( GXCCtl );
      chkHayRec.setWebtags( "" );
      chkHayRec.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "TitleCaption", chkHayRec.getCaption(), !bGXsfl_41_Refreshing);
      chkHayRec.setCheckedValue( "0" );
      A13710HayRec = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV154UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV152Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV176Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarEncCli_Visible',ctrl:'BARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV128GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV129GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12EG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV154UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV152Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV176Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13EG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV154UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV152Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV176Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14EG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV154UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV152Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV176Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21EG2',iparms:[{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV164GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15EG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV154UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV152Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV176Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarEncCli_Visible',ctrl:'BARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV128GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV129GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11EG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV154UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV152Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV176Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarEncCli_Visible',ctrl:'BARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV128GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV129GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e22EG2',iparms:[{av:'cmbavGridactions'},{av:'AV164GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV154UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV152Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV176Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV164GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_delete_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_DELETE',prop:'ConfirmationText'},{av:'AV170EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV171BarCod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV172BarCodReo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV173BarCodPar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarEncCli_Visible',ctrl:'BARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV128GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV129GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETE.CLOSE","{handler:'e16EG2',iparms:[{av:'Dvelop_confirmpanel_delete_Result',ctrl:'DVELOP_CONFIRMPANEL_DELETE',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV154UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV152Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV176Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'AV178contval',fld:'vCONTVAL',pic:'ZZZZZZZ9'},{av:'AV170EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV171BarCod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV172BarCodReo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV173BarCodPar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETE.CLOSE",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV178contval',fld:'vCONTVAL',pic:'ZZZZZZZ9'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarEncCli_Visible',ctrl:'BARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV128GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV129GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17EG2',iparms:[{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV154UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV152Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV176Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18EG2',iparms:[{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV158FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV168Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV184Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV154UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV152Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV139TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV140TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV160TFBarEncCli',fld:'vTFBARENCCLI',pic:''},{av:'AV161TFBarEncCli_Sel',fld:'vTFBARENCCLI_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV162TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV163TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV67TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV82TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV83TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV85TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV91TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV96TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV106TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV148TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV149TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV159TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV176Pwdgrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_BARENCCLI","{handler:'valid_Barenccli',iparms:[]");
      setEventMetadata("VALID_BARENCCLI",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_HAYREC","{handler:'valid_Hayrec',iparms:[]");
      setEventMetadata("VALID_HAYREC",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barext',iparms:[]");
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
      Dvelop_confirmpanel_delete_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV158FilterFullText = "" ;
      A396EmprCod = "" ;
      AV45ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV168Emprcod = "" ;
      AV184Pgmname = "" ;
      AV154UsurCod = "" ;
      AV152Station = "" ;
      AV139TFBarNHdr = "" ;
      AV140TFBarNHdr_Sel = "" ;
      AV70TFCliNom = "" ;
      AV71TFCliNom_Sel = "" ;
      AV160TFBarEncCli = "" ;
      AV161TFBarEncCli_Sel = "" ;
      AV73TFBarSer = "" ;
      AV74TFBarSer_Sel = "" ;
      AV76TFBarSerDsc = "" ;
      AV77TFBarSerDsc_Sel = "" ;
      AV162TFBarTipArtDsc = "" ;
      AV163TFBarTipArtDsc_Sel = "" ;
      AV82TFBarColNom = "" ;
      AV83TFBarColNom_Sel = "" ;
      AV91TFBarFecGen = GXutil.nullDate() ;
      AV96TFBarFecCli = GXutil.nullDate() ;
      AV106TFBarFecSal = GXutil.nullDate() ;
      Gx_mode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV48ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV126DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A758ProCod = "" ;
      AV170EmprCod_Selected = "" ;
      AV173BarCodPar_Selected = "" ;
      A143BarDisNum = "" ;
      A13878PedidoClie = "" ;
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
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV93DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV98DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      AV108DDO_BarFecSalAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      AV185Ttrn04wwds_1_filterfulltext = "" ;
      AV186Ttrn04wwds_2_tfbarnhdr = "" ;
      AV187Ttrn04wwds_3_tfbarnhdr_sel = "" ;
      AV188Ttrn04wwds_4_tfclinom = "" ;
      AV189Ttrn04wwds_5_tfclinom_sel = "" ;
      AV190Ttrn04wwds_6_tfbarenccli = "" ;
      AV191Ttrn04wwds_7_tfbarenccli_sel = "" ;
      AV192Ttrn04wwds_8_tfbarser = "" ;
      AV193Ttrn04wwds_9_tfbarser_sel = "" ;
      AV194Ttrn04wwds_10_tfbarserdsc = "" ;
      AV195Ttrn04wwds_11_tfbarserdsc_sel = "" ;
      AV196Ttrn04wwds_12_tfbartipartdsc = "" ;
      AV197Ttrn04wwds_13_tfbartipartdsc_sel = "" ;
      AV200Ttrn04wwds_16_tfbarcolnom = "" ;
      AV201Ttrn04wwds_17_tfbarcolnom_sel = "" ;
      AV204Ttrn04wwds_20_tfbarfecgen = GXutil.nullDate() ;
      AV205Ttrn04wwds_21_tfbarfeccli = GXutil.nullDate() ;
      AV206Ttrn04wwds_22_tfbarfecsal = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV185Ttrn04wwds_1_filterfulltext = "" ;
      lV186Ttrn04wwds_2_tfbarnhdr = "" ;
      lV188Ttrn04wwds_4_tfclinom = "" ;
      lV190Ttrn04wwds_6_tfbarenccli = "" ;
      lV192Ttrn04wwds_8_tfbarser = "" ;
      lV194Ttrn04wwds_10_tfbarserdsc = "" ;
      lV196Ttrn04wwds_12_tfbartipartdsc = "" ;
      lV200Ttrn04wwds_16_tfbarcolnom = "" ;
      H00EG2_A217BarTipArt = new short[1] ;
      H00EG2_n217BarTipArt = new boolean[] {false} ;
      H00EG2_A2265BarExt = new byte[1] ;
      H00EG2_n2265BarExt = new boolean[] {false} ;
      H00EG2_A3594BarPriTin = new byte[1] ;
      H00EG2_A361DisCod = new int[1] ;
      H00EG2_A213BarSit = new byte[1] ;
      H00EG2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00EG2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H00EG2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00EG2_A136BarColNum = new int[1] ;
      H00EG2_A135BarColNom = new String[] {""} ;
      H00EG2_A252CliCod = new int[1] ;
      H00EG2_n252CliCod = new boolean[] {false} ;
      H00EG2_A13711BarTipArtD = new String[] {""} ;
      H00EG2_n13711BarTipArtD = new boolean[] {false} ;
      H00EG2_A1652BarSerDsc = new String[] {""} ;
      H00EG2_A212BarSer = new String[] {""} ;
      H00EG2_A279CliNom = new String[] {""} ;
      H00EG2_A396EmprCod = new String[] {""} ;
      H00EG2_A130BarCodPar = new String[] {""} ;
      H00EG2_A132BarCodReo = new byte[1] ;
      H00EG2_A129BarCod = new int[1] ;
      H00EG2_A143BarDisNum = new String[] {""} ;
      H00EG2_A4812BarEncCli = new String[] {""} ;
      H00EG3_A217BarTipArt = new short[1] ;
      H00EG3_n217BarTipArt = new boolean[] {false} ;
      H00EG3_A2265BarExt = new byte[1] ;
      H00EG3_n2265BarExt = new boolean[] {false} ;
      H00EG3_A3594BarPriTin = new byte[1] ;
      H00EG3_A361DisCod = new int[1] ;
      H00EG3_A213BarSit = new byte[1] ;
      H00EG3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00EG3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H00EG3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00EG3_A136BarColNum = new int[1] ;
      H00EG3_A135BarColNom = new String[] {""} ;
      H00EG3_A252CliCod = new int[1] ;
      H00EG3_n252CliCod = new boolean[] {false} ;
      H00EG3_A13711BarTipArtD = new String[] {""} ;
      H00EG3_n13711BarTipArtD = new boolean[] {false} ;
      H00EG3_A1652BarSerDsc = new String[] {""} ;
      H00EG3_A212BarSer = new String[] {""} ;
      H00EG3_A279CliNom = new String[] {""} ;
      H00EG3_A396EmprCod = new String[] {""} ;
      H00EG3_A130BarCodPar = new String[] {""} ;
      H00EG3_A132BarCodReo = new byte[1] ;
      H00EG3_A129BarCod = new int[1] ;
      H00EG3_A143BarDisNum = new String[] {""} ;
      H00EG3_A4812BarEncCli = new String[] {""} ;
      AV153EmprNom = "" ;
      AV183Actdatos = "" ;
      AV179WebSession = httpContext.getWebSession();
      AV165BarFecGen = GXutil.nullDate() ;
      AV166BarFecGen_To = GXutil.nullDate() ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV43ColumnsSelectorXML = "" ;
      GXv_int11 = new int[1] ;
      AV180Inc_obs = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV49ManageFiltersXml = "" ;
      AV41ExcelFilename = "" ;
      AV42ErrorMessage = "" ;
      AV44UserCustomValue = "" ;
      AV46ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_delete = new com.genexus.webpanels.GXUserControl();
      GXv_int12 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int17 = new byte[1] ;
      H00EG4_A129BarCod = new int[1] ;
      H00EG4_A132BarCodReo = new byte[1] ;
      H00EG4_A130BarCodPar = new String[] {""} ;
      H00EG4_A396EmprCod = new String[] {""} ;
      H00EG4_A153BarFasEst = new byte[1] ;
      H00EG4_A194BarOrdLin = new short[1] ;
      H00EG4_A758ProCod = new String[] {""} ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char7 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState27 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn04ww__default(),
         new Object[] {
             new Object[] {
            H00EG2_A217BarTipArt, H00EG2_n217BarTipArt, H00EG2_A2265BarExt, H00EG2_n2265BarExt, H00EG2_A3594BarPriTin, H00EG2_A361DisCod, H00EG2_A213BarSit, H00EG2_A161BarFecSal, H00EG2_A155BarFecCli, H00EG2_A159BarFecGen,
            H00EG2_A136BarColNum, H00EG2_A135BarColNom, H00EG2_A252CliCod, H00EG2_n252CliCod, H00EG2_A13711BarTipArtD, H00EG2_n13711BarTipArtD, H00EG2_A1652BarSerDsc, H00EG2_A212BarSer, H00EG2_A279CliNom, H00EG2_A396EmprCod,
            H00EG2_A130BarCodPar, H00EG2_A132BarCodReo, H00EG2_A129BarCod, H00EG2_A143BarDisNum, H00EG2_A4812BarEncCli
            }
            , new Object[] {
            H00EG3_A217BarTipArt, H00EG3_n217BarTipArt, H00EG3_A2265BarExt, H00EG3_n2265BarExt, H00EG3_A3594BarPriTin, H00EG3_A361DisCod, H00EG3_A213BarSit, H00EG3_A161BarFecSal, H00EG3_A155BarFecCli, H00EG3_A159BarFecGen,
            H00EG3_A136BarColNum, H00EG3_A135BarColNom, H00EG3_A252CliCod, H00EG3_n252CliCod, H00EG3_A13711BarTipArtD, H00EG3_n13711BarTipArtD, H00EG3_A1652BarSerDsc, H00EG3_A212BarSer, H00EG3_A279CliNom, H00EG3_A396EmprCod,
            H00EG3_A130BarCodPar, H00EG3_A132BarCodReo, H00EG3_A129BarCod, H00EG3_A143BarDisNum, H00EG3_A4812BarEncCli
            }
            , new Object[] {
            H00EG4_A129BarCod, H00EG4_A132BarCodReo, H00EG4_A130BarCodPar, H00EG4_A396EmprCod, H00EG4_A153BarFasEst, H00EG4_A194BarOrdLin, H00EG4_A758ProCod
            }
         }
      );
      AV184Pgmname = "TTrn04WW" ;
      /* GeneXus formulas. */
      AV184Pgmname = "TTrn04WW" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV50ManageFiltersExecutionStep ;
   private byte AV148TFBarSit ;
   private byte AV149TFBarSit_To ;
   private byte AV159TFHayRec_Sel ;
   private byte gxajaxcallmode ;
   private byte A153BarFasEst ;
   private byte AV172BarCodReo_Selected ;
   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte A132BarCodReo ;
   private byte A3594BarPriTin ;
   private byte A2265BarExt ;
   private byte nDonePA ;
   private byte AV207Ttrn04wwds_23_tfbarsit ;
   private byte AV208Ttrn04wwds_24_tfbarsit_to ;
   private byte AV209Ttrn04wwds_25_tfhayrec_sel ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int1 ;
   private byte AV174Flag ;
   private byte GXv_int2[] ;
   private byte GXv_int17[] ;
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
   private short AV176Pwdgrl ;
   private short A194BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV164GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A217BarTipArt ;
   private short AV155Varnormas ;
   private short AV156Carvitin ;
   private short AV175Lhipro ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int AV67TFCliCod ;
   private int AV68TFCliCod_To ;
   private int AV85TFBarColNum ;
   private int AV86TFBarColNum_To ;
   private int AV178contval ;
   private int AV171BarCod_Selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int subGrid_Islastpage ;
   private int AV198Ttrn04wwds_14_tfclicod ;
   private int AV199Ttrn04wwds_15_tfclicod_to ;
   private int AV202Ttrn04wwds_18_tfbarcolnum ;
   private int AV203Ttrn04wwds_19_tfbarcolnum_to ;
   private int edtBarNHdr_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarEncCli_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarTipArtD_Visible ;
   private int edtCliCod_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarFecCli_Visible ;
   private int edtBarFecSal_Visible ;
   private int edtBarSit_Visible ;
   private int GXv_int11[] ;
   private int AV127PageToGo ;
   private int GXv_int12[] ;
   private int AV212GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV128GridCurrentPage ;
   private long AV129GridPageCount ;
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
   private String Dvelop_confirmpanel_delete_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_41_idx="0001" ;
   private String A396EmprCod ;
   private String AV168Emprcod ;
   private String AV184Pgmname ;
   private String AV154UsurCod ;
   private String AV152Station ;
   private String AV139TFBarNHdr ;
   private String AV140TFBarNHdr_Sel ;
   private String AV70TFCliNom ;
   private String AV71TFCliNom_Sel ;
   private String AV160TFBarEncCli ;
   private String AV161TFBarEncCli_Sel ;
   private String AV73TFBarSer ;
   private String AV74TFBarSer_Sel ;
   private String AV76TFBarSerDsc ;
   private String AV77TFBarSerDsc_Sel ;
   private String AV162TFBarTipArtDsc ;
   private String AV163TFBarTipArtDsc_Sel ;
   private String AV82TFBarColNom ;
   private String AV83TFBarColNom_Sel ;
   private String Gx_mode ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A758ProCod ;
   private String AV170EmprCod_Selected ;
   private String AV173BarCodPar_Selected ;
   private String A143BarDisNum ;
   private String A13878PedidoClie ;
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
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_delete_Title ;
   private String Dvelop_confirmpanel_delete_Confirmationtext ;
   private String Dvelop_confirmpanel_delete_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_delete_Nobuttoncaption ;
   private String Dvelop_confirmpanel_delete_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_delete_Yesbuttonposition ;
   private String Dvelop_confirmpanel_delete_Confirmtype ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
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
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfecgenauxdates_Internalname ;
   private String edtavDdo_barfecgenauxdate_Internalname ;
   private String edtavDdo_barfecgenauxdate_Jsonclick ;
   private String divDdo_barfeccliauxdates_Internalname ;
   private String edtavDdo_barfeccliauxdate_Internalname ;
   private String edtavDdo_barfeccliauxdate_Jsonclick ;
   private String divDdo_barfecsalauxdates_Internalname ;
   private String edtavDdo_barfecsalauxdate_Internalname ;
   private String edtavDdo_barfecsalauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A4812BarEncCli ;
   private String edtBarEncCli_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A13711BarTipArtD ;
   private String edtBarTipArtD_Internalname ;
   private String edtCliCod_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String edtBarFecSal_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtDisCod_Internalname ;
   private String edtBarPriTin_Internalname ;
   private String edtBarExt_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV186Ttrn04wwds_2_tfbarnhdr ;
   private String AV187Ttrn04wwds_3_tfbarnhdr_sel ;
   private String AV188Ttrn04wwds_4_tfclinom ;
   private String AV189Ttrn04wwds_5_tfclinom_sel ;
   private String AV190Ttrn04wwds_6_tfbarenccli ;
   private String AV191Ttrn04wwds_7_tfbarenccli_sel ;
   private String AV192Ttrn04wwds_8_tfbarser ;
   private String AV193Ttrn04wwds_9_tfbarser_sel ;
   private String AV194Ttrn04wwds_10_tfbarserdsc ;
   private String AV195Ttrn04wwds_11_tfbarserdsc_sel ;
   private String AV196Ttrn04wwds_12_tfbartipartdsc ;
   private String AV197Ttrn04wwds_13_tfbartipartdsc_sel ;
   private String AV200Ttrn04wwds_16_tfbarcolnom ;
   private String AV201Ttrn04wwds_17_tfbarcolnom_sel ;
   private String scmdbuf ;
   private String lV186Ttrn04wwds_2_tfbarnhdr ;
   private String lV188Ttrn04wwds_4_tfclinom ;
   private String lV190Ttrn04wwds_6_tfbarenccli ;
   private String lV192Ttrn04wwds_8_tfbarser ;
   private String lV194Ttrn04wwds_10_tfbarserdsc ;
   private String lV196Ttrn04wwds_12_tfbartipartdsc ;
   private String lV200Ttrn04wwds_16_tfbarcolnom ;
   private String AV153EmprNom ;
   private String AV183Actdatos ;
   private String Dvelop_confirmpanel_delete_Internalname ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char20 ;
   private String GXv_char7[] ;
   private String GXt_char19 ;
   private String GXv_char6[] ;
   private String GXt_char18 ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_delete_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String divTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarEncCli_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarTipArtD_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtBarFecSal_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtDisCod_Jsonclick ;
   private String edtBarPriTin_Jsonclick ;
   private String edtBarExt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV91TFBarFecGen ;
   private java.util.Date AV96TFBarFecCli ;
   private java.util.Date AV106TFBarFecSal ;
   private java.util.Date AV93DDO_BarFecGenAuxDate ;
   private java.util.Date AV98DDO_BarFecCliAuxDate ;
   private java.util.Date AV108DDO_BarFecSalAuxDate ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV204Ttrn04wwds_20_tfbarfecgen ;
   private java.util.Date AV205Ttrn04wwds_21_tfbarfeccli ;
   private java.util.Date AV206Ttrn04wwds_22_tfbarfecsal ;
   private java.util.Date AV165BarFecGen ;
   private java.util.Date AV166BarFecGen_To ;
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
   private boolean n13711BarTipArtD ;
   private boolean n252CliCod ;
   private boolean n2265BarExt ;
   private boolean n217BarTipArt ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV169TempBoolean ;
   private String AV43ColumnsSelectorXML ;
   private String AV49ManageFiltersXml ;
   private String AV44UserCustomValue ;
   private String AV158FilterFullText ;
   private String AV185Ttrn04wwds_1_filterfulltext ;
   private String lV185Ttrn04wwds_1_filterfulltext ;
   private String AV180Inc_obs ;
   private String AV41ExcelFilename ;
   private String AV42ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_delete ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkHayRec ;
   private IDataStoreProvider pr_default ;
   private short[] H00EG2_A217BarTipArt ;
   private boolean[] H00EG2_n217BarTipArt ;
   private byte[] H00EG2_A2265BarExt ;
   private boolean[] H00EG2_n2265BarExt ;
   private byte[] H00EG2_A3594BarPriTin ;
   private int[] H00EG2_A361DisCod ;
   private byte[] H00EG2_A213BarSit ;
   private java.util.Date[] H00EG2_A161BarFecSal ;
   private java.util.Date[] H00EG2_A155BarFecCli ;
   private java.util.Date[] H00EG2_A159BarFecGen ;
   private int[] H00EG2_A136BarColNum ;
   private String[] H00EG2_A135BarColNom ;
   private int[] H00EG2_A252CliCod ;
   private boolean[] H00EG2_n252CliCod ;
   private String[] H00EG2_A13711BarTipArtD ;
   private boolean[] H00EG2_n13711BarTipArtD ;
   private String[] H00EG2_A1652BarSerDsc ;
   private String[] H00EG2_A212BarSer ;
   private String[] H00EG2_A279CliNom ;
   private String[] H00EG2_A396EmprCod ;
   private String[] H00EG2_A130BarCodPar ;
   private byte[] H00EG2_A132BarCodReo ;
   private int[] H00EG2_A129BarCod ;
   private String[] H00EG2_A143BarDisNum ;
   private String[] H00EG2_A4812BarEncCli ;
   private short[] H00EG3_A217BarTipArt ;
   private boolean[] H00EG3_n217BarTipArt ;
   private byte[] H00EG3_A2265BarExt ;
   private boolean[] H00EG3_n2265BarExt ;
   private byte[] H00EG3_A3594BarPriTin ;
   private int[] H00EG3_A361DisCod ;
   private byte[] H00EG3_A213BarSit ;
   private java.util.Date[] H00EG3_A161BarFecSal ;
   private java.util.Date[] H00EG3_A155BarFecCli ;
   private java.util.Date[] H00EG3_A159BarFecGen ;
   private int[] H00EG3_A136BarColNum ;
   private String[] H00EG3_A135BarColNom ;
   private int[] H00EG3_A252CliCod ;
   private boolean[] H00EG3_n252CliCod ;
   private String[] H00EG3_A13711BarTipArtD ;
   private boolean[] H00EG3_n13711BarTipArtD ;
   private String[] H00EG3_A1652BarSerDsc ;
   private String[] H00EG3_A212BarSer ;
   private String[] H00EG3_A279CliNom ;
   private String[] H00EG3_A396EmprCod ;
   private String[] H00EG3_A130BarCodPar ;
   private byte[] H00EG3_A132BarCodReo ;
   private int[] H00EG3_A129BarCod ;
   private String[] H00EG3_A143BarDisNum ;
   private String[] H00EG3_A4812BarEncCli ;
   private int[] H00EG4_A129BarCod ;
   private byte[] H00EG4_A132BarCodReo ;
   private String[] H00EG4_A130BarCodPar ;
   private String[] H00EG4_A396EmprCod ;
   private byte[] H00EG4_A153BarFasEst ;
   private short[] H00EG4_A194BarOrdLin ;
   private String[] H00EG4_A758ProCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV179WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV48ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState27[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV45ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV46ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV126DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[] ;
}

final  class ttrn04ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00EG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV185Ttrn04wwds_1_filterfulltext ,
                                          String AV187Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV186Ttrn04wwds_2_tfbarnhdr ,
                                          String AV189Ttrn04wwds_5_tfclinom_sel ,
                                          String AV188Ttrn04wwds_4_tfclinom ,
                                          String AV191Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV190Ttrn04wwds_6_tfbarenccli ,
                                          String AV193Ttrn04wwds_9_tfbarser_sel ,
                                          String AV192Ttrn04wwds_8_tfbarser ,
                                          String AV195Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV194Ttrn04wwds_10_tfbarserdsc ,
                                          String AV197Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV196Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV198Ttrn04wwds_14_tfclicod ,
                                          int AV199Ttrn04wwds_15_tfclicod_to ,
                                          String AV201Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV200Ttrn04wwds_16_tfbarcolnom ,
                                          int AV202Ttrn04wwds_18_tfbarcolnum ,
                                          int AV203Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV204Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV205Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV206Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV207Ttrn04wwds_23_tfbarsit ,
                                          byte AV208Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          byte AV209Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[34];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarExt, T1.BarPriTin, T1.DisCod, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.CliCod," ;
      scmdbuf += " T2.TipArtDsc AS BarTipArtD, T1.BarSerDsc, T1.BarSer, T3.CliNom, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli FROM ((TXPBARCAD T1" ;
      scmdbuf += " LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV185Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int28[1] = (byte)(1) ;
         GXv_int28[2] = (byte)(1) ;
         GXv_int28[3] = (byte)(1) ;
         GXv_int28[4] = (byte)(1) ;
         GXv_int28[5] = (byte)(1) ;
         GXv_int28[6] = (byte)(1) ;
         GXv_int28[7] = (byte)(1) ;
         GXv_int28[8] = (byte)(1) ;
         GXv_int28[9] = (byte)(1) ;
         GXv_int28[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV186Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int28[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV189Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV188Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV189Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV191Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV190Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV191Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV193Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV192Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV193Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV195Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV194Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV195Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV197Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV196Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( ! (0==AV198Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( ! (0==AV199Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV200Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( ! (0==AV202Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( ! (0==AV203Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV204Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV206Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      if ( ! (0==AV207Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int28[32] = (byte)(1) ;
      }
      if ( ! (0==AV208Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int28[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarEncCli" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarEncCli DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_H00EG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV185Ttrn04wwds_1_filterfulltext ,
                                          String AV187Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV186Ttrn04wwds_2_tfbarnhdr ,
                                          String AV189Ttrn04wwds_5_tfclinom_sel ,
                                          String AV188Ttrn04wwds_4_tfclinom ,
                                          String AV191Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV190Ttrn04wwds_6_tfbarenccli ,
                                          String AV193Ttrn04wwds_9_tfbarser_sel ,
                                          String AV192Ttrn04wwds_8_tfbarser ,
                                          String AV195Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV194Ttrn04wwds_10_tfbarserdsc ,
                                          String AV197Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV196Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV198Ttrn04wwds_14_tfclicod ,
                                          int AV199Ttrn04wwds_15_tfclicod_to ,
                                          String AV201Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV200Ttrn04wwds_16_tfbarcolnom ,
                                          int AV202Ttrn04wwds_18_tfbarcolnum ,
                                          int AV203Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV204Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV205Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV206Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV207Ttrn04wwds_23_tfbarsit ,
                                          byte AV208Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          byte AV209Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[34];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarExt, T1.BarPriTin, T1.DisCod, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.CliCod," ;
      scmdbuf += " T2.TipArtDsc AS BarTipArtD, T1.BarSerDsc, T1.BarSer, T3.CliNom, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli FROM ((TXPBARCAD T1" ;
      scmdbuf += " LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV185Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int30[1] = (byte)(1) ;
         GXv_int30[2] = (byte)(1) ;
         GXv_int30[3] = (byte)(1) ;
         GXv_int30[4] = (byte)(1) ;
         GXv_int30[5] = (byte)(1) ;
         GXv_int30[6] = (byte)(1) ;
         GXv_int30[7] = (byte)(1) ;
         GXv_int30[8] = (byte)(1) ;
         GXv_int30[9] = (byte)(1) ;
         GXv_int30[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV186Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int30[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV189Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV188Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV189Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int30[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV191Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV190Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV191Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int30[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV193Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV192Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV193Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV195Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV194Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV195Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV197Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV196Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int30[22] = (byte)(1) ;
      }
      if ( ! (0==AV198Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int30[23] = (byte)(1) ;
      }
      if ( ! (0==AV199Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int30[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV200Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( ! (0==AV202Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( ! (0==AV203Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV204Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV206Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      if ( ! (0==AV207Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int30[32] = (byte)(1) ;
      }
      if ( ! (0==AV208Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int30[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarEncCli" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarEncCli DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
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
                  return conditional_H00EG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] );
            case 1 :
                  return conditional_H00EG3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00EG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EG4", "SELECT BarCod, BarCodReo, BarCodPar, EmprCod, BarFasEst, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? ORDER BY ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 26);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((String[]) buf[19])[0] = rslt.getString(16, 3);
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(18);
               ((int[]) buf[22])[0] = rslt.getInt(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((String[]) buf[24])[0] = rslt.getString(21, 20);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 26);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((String[]) buf[19])[0] = rslt.getString(16, 3);
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(18);
               ((int[]) buf[22])[0] = rslt.getInt(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((String[]) buf[24])[0] = rslt.getString(21, 20);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

