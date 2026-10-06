package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwnwdp02_impl extends GXDataArea
{
   public webwnwdp02_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwnwdp02_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwnwdp02_impl.class ));
   }

   public webwnwdp02_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbDisEst = new HTMLChoice();
      chkDisArtEnc = UIFactory.getCheckbox(this);
      chkDisArtCor = UIFactory.getCheckbox(this);
      chkDisAcc = UIFactory.getCheckbox(this);
      chkPriCod = UIFactory.getCheckbox(this);
      chkDisFac = UIFactory.getCheckbox(this);
      chkDisDes = UIFactory.getCheckbox(this);
      chkDisEstTip = UIFactory.getCheckbox(this);
      chkDisTin = UIFactory.getCheckbox(this);
      chkCliCtrl = UIFactory.getCheckbox(this);
      chkDisAcaBak = UIFactory.getCheckbox(this);
      chkDisExp = UIFactory.getCheckbox(this);
      chkDisPla = UIFactory.getCheckbox(this);
      chkDisOrdSep = UIFactory.getCheckbox(this);
      chkDisOrdGra = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"DISARTACA") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            A764ProForCod = httpContext.GetPar( "ProForCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgadisartacaK50( A396EmprCod, A764ProForCod) ;
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
      nRC_GXsfl_54 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_54"))) ;
      nGXsfl_54_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_54_idx"))) ;
      sGXsfl_54_idx = httpContext.GetPar( "sGXsfl_54_idx") ;
      edtDibCli_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDibInt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Visible), 5, 0), !bGXsfl_54_Refreshing);
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
      AV7DisFec = localUtil.parseDateParm( httpContext.GetPar( "DisFec")) ;
      AV6EmprCod = httpContext.GetPar( "EmprCod") ;
      AV8pricod = httpContext.GetPar( "pricod") ;
      AV5DisUsrcod = httpContext.GetPar( "DisUsrcod") ;
      AV29ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24ColumnsSelector);
      AV19FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV34TFDisCod = (int)(GXutil.lval( httpContext.GetPar( "TFDisCod"))) ;
      AV35TFDisCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisCod_To"))) ;
      AV36TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV37TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV38TFDisFec = localUtil.parseDateParm( httpContext.GetPar( "TFDisFec")) ;
      AV42TFDisArtCod = httpContext.GetPar( "TFDisArtCod") ;
      AV43TFDisArtCod_Sel = httpContext.GetPar( "TFDisArtCod_Sel") ;
      AV44TFDisArtDsc = httpContext.GetPar( "TFDisArtDsc") ;
      AV45TFDisArtDsc_Sel = httpContext.GetPar( "TFDisArtDsc_Sel") ;
      AV46TFDisColNom = httpContext.GetPar( "TFDisColNom") ;
      AV47TFDisColNom_Sel = httpContext.GetPar( "TFDisColNom_Sel") ;
      AV48TFDisNomCli = httpContext.GetPar( "TFDisNomCli") ;
      AV49TFDisNomCli_Sel = httpContext.GetPar( "TFDisNomCli_Sel") ;
      AV50TFDisColNum = (int)(GXutil.lval( httpContext.GetPar( "TFDisColNum"))) ;
      AV51TFDisColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisColNum_To"))) ;
      AV52TFDibCli = httpContext.GetPar( "TFDibCli") ;
      AV53TFDibCli_Sel = httpContext.GetPar( "TFDibCli_Sel") ;
      AV54TFDibInt = (int)(GXutil.lval( httpContext.GetPar( "TFDibInt"))) ;
      AV55TFDibInt_To = (int)(GXutil.lval( httpContext.GetPar( "TFDibInt_To"))) ;
      AV112TFDisMaxObsLin = (short)(GXutil.lval( httpContext.GetPar( "TFDisMaxObsLin"))) ;
      AV113TFDisMaxObsLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFDisMaxObsLin_To"))) ;
      AV114TFDisCanRec = (short)(GXutil.lval( httpContext.GetPar( "TFDisCanRec"))) ;
      AV115TFDisCanRec_To = (short)(GXutil.lval( httpContext.GetPar( "TFDisCanRec_To"))) ;
      AV145Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV17OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      edtDibCli_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDibInt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Visible), 5, 0), !bGXsfl_54_Refreshing);
      AV67barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
      AV68Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV69barcodpar = httpContext.GetPar( "barcodpar") ;
      AV66DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV111ModeloSDT = GXutil.strtobool( httpContext.GetPar( "ModeloSDT")) ;
      AV83Detpie = (short)(GXutil.lval( httpContext.GetPar( "Detpie"))) ;
      AV88Tnwdp04 = (short)(GXutil.lval( httpContext.GetPar( "Tnwdp04"))) ;
      AV63UsurCod = httpContext.GetPar( "UsurCod") ;
      AV80Station = httpContext.GetPar( "Station") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV7DisFec, AV6EmprCod, AV8pricod, AV5DisUsrcod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV34TFDisCod, AV35TFDisCod_To, AV36TFCliCod, AV37TFCliCod_To, AV38TFDisFec, AV42TFDisArtCod, AV43TFDisArtCod_Sel, AV44TFDisArtDsc, AV45TFDisArtDsc_Sel, AV46TFDisColNom, AV47TFDisColNom_Sel, AV48TFDisNomCli, AV49TFDisNomCli_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDibCli, AV53TFDibCli_Sel, AV54TFDibInt, AV55TFDibInt_To, AV112TFDisMaxObsLin, AV113TFDisMaxObsLin_To, AV114TFDisCanRec, AV115TFDisCanRec_To, AV145Pgmname, AV16OrderedBy, AV17OrderedDsc, AV67barcod, AV68Barcodreo, AV69barcodpar, AV66DisCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV111ModeloSDT, AV83Detpie, AV88Tnwdp04, AV63UsurCod, AV80Station) ;
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
      paK52( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startK52( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwnwdp02", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV145Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODELOSDT", getSecureSignedToken( "", AV111ModeloSDT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDETPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV83Detpie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTNWDP04", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV88Tnwdp04), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV63UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDISFEC", localUtil.format(AV7DisFec, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_54, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV58GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV59GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV56DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV56DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV29ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOD", GXutil.ltrim( localUtil.ntoc( AV34TFDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOD_TO", GXutil.ltrim( localUtil.ntoc( AV35TFDisCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV36TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISFEC", localUtil.dtoc( AV38TFDisFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTCOD", GXutil.rtrim( AV42TFDisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTCOD_SEL", GXutil.rtrim( AV43TFDisArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTDSC", GXutil.rtrim( AV44TFDisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTDSC_SEL", GXutil.rtrim( AV45TFDisArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNOM", GXutil.rtrim( AV46TFDisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNOM_SEL", GXutil.rtrim( AV47TFDisColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNOMCLI", GXutil.rtrim( AV48TFDisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNOMCLI_SEL", GXutil.rtrim( AV49TFDisNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNUM", GXutil.ltrim( localUtil.ntoc( AV50TFDisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV51TFDisColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDIBCLI", GXutil.rtrim( AV52TFDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDIBCLI_SEL", GXutil.rtrim( AV53TFDibCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDIBINT", GXutil.ltrim( localUtil.ntoc( AV54TFDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDIBINT_TO", GXutil.ltrim( localUtil.ntoc( AV55TFDibInt_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISMAXOBSLIN", GXutil.ltrim( localUtil.ntoc( AV112TFDisMaxObsLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISMAXOBSLIN_TO", GXutil.ltrim( localUtil.ntoc( AV113TFDisMaxObsLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCANREC", GXutil.ltrim( localUtil.ntoc( AV114TFDisCanRec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCANREC_TO", GXutil.ltrim( localUtil.ntoc( AV115TFDisCanRec_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV145Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV145Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV16OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV17OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV67barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV68Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV69barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV66DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV14GridState);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMODELOSDT", AV111ModeloSDT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODELOSDT", getSecureSignedToken( "", AV111ModeloSDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vDETPIE", GXutil.ltrim( localUtil.ntoc( AV83Detpie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDETPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV83Detpie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTNWDP04", GXutil.ltrim( localUtil.ntoc( AV88Tnwdp04, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTNWDP04", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV88Tnwdp04), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV63UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV63UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", AV80Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRICOD", GXutil.rtrim( AV8pricod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISUSRCOD", GXutil.rtrim( AV5DisUsrcod));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DIBCLI_Visible", GXutil.ltrim( localUtil.ntoc( edtDibCli_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBINT_Visible", GXutil.ltrim( localUtil.ntoc( edtDibInt_Visible, (byte)(5), (byte)(0), ".", "")));
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
         weK52( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtK52( ) ;
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
      return formatLink("app.webwnwdp02", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWNwDP02" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Entrada Pedido Cliente", "") ;
   }

   public void wbK50( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWNwDP02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWNwDP02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWNwDP02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWNwDP02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWNwDP02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDatoclicod_Internalname, httpContext.getMessage( "Dato Cli Cod", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDatoclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV110DatoCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDatoclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV110DatoCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV110DatoCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDatoclicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDatoclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWNwDP02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_30_K52( true) ;
      }
      else
      {
         wb_table1_30_K52( false) ;
      }
      return  ;
   }

   public void wb_table1_30_K52e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFiltros_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisfec_Internalname, httpContext.getMessage( "Fecha Disposicion", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDisfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisfec_Internalname, localUtil.format(AV7DisFec, "99/99/99"), localUtil.format( AV7DisFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWNwDP02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDisfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDisfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWNwDP02.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol54( ) ;
      }
      if ( wbEnd == 54 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_54 = (int)(nGXsfl_54_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV58GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV59GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV56DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV56DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV24ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_disfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_disfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_disfecauxdate_Internalname, localUtil.format(AV40DDO_DisFecAuxDate, "99/99/99"), localUtil.format( AV40DDO_DisFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,228);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_disfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWNwDP02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_disfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWNwDP02.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 54 )
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

   public void startK52( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Entrada Pedido Cliente", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupK50( ) ;
   }

   public void wsK52( )
   {
      startK52( ) ;
      evtK52( ) ;
   }

   public void evtK52( )
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
                           e11K52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12K52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13K52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14K52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15K52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16K52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17K52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18K52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19K52 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "'ALTA'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "'BAJA'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_54_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_542( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV116GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A4348DisUsrCod = httpContext.cgiGet( edtDisUsrCod_Internalname) ;
                           cmbDisEst.setName( cmbDisEst.getInternalname() );
                           cmbDisEst.setValue( httpContext.cgiGet( cmbDisEst.getInternalname()) );
                           A367DisEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbDisEst.getInternalname()))) ;
                           A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A369DisFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDisFec_Internalname), 0)) ;
                           A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
                           A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
                           A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
                           n362DisColNom = false ;
                           A1195DisNomCli = httpContext.cgiGet( edtDisNomCli_Internalname) ;
                           A363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n363DisColNum = false ;
                           A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
                           n1013DibCli = false ;
                           A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1014DibInt = false ;
                           A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n390DisTipCol = false ;
                           A12116DisTipCD = httpContext.cgiGet( edtDisTipCD_Internalname) ;
                           A1196DisNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A352DisArtTip = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A12115DisArtTipD = httpContext.cgiGet( edtDisArtTipD_Internalname) ;
                           A346DisArtPt3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A355DisArtTr3 = httpContext.cgiGet( edtDisArtTr3_Internalname) ;
                           A345DisArtPt2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A354DisArtTr2 = httpContext.cgiGet( edtDisArtTr2_Internalname) ;
                           A344DisArtPt1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A353DisArtTr1 = httpContext.cgiGet( edtDisArtTr1_Internalname) ;
                           A349DisArtPu3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n349DisArtPu3 = false ;
                           A358DisArtUr3 = httpContext.cgiGet( edtDisArtUr3_Internalname) ;
                           A348DisArtPu2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A357DisArtUr2 = httpContext.cgiGet( edtDisArtUr2_Internalname) ;
                           A347DisArtPu1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A356DisArtUr1 = httpContext.cgiGet( edtDisArtUr1_Internalname) ;
                           A340DisArtMat = httpContext.cgiGet( edtDisArtMat_Internalname) ;
                           A343DisArtPle = httpContext.cgiGet( edtDisArtPle_Internalname) ;
                           A2835DisPle2 = httpContext.cgiGet( edtDisPle2_Internalname) ;
                           A339DisArtLar = httpContext.cgiGet( edtDisArtLar_Internalname) ;
                           A351DisArtSua = httpContext.cgiGet( edtDisArtSua_Internalname) ;
                           A333DisArtAca = httpContext.cgiGet( edtDisArtAca_Internalname) ;
                           A338DisArtEnc = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtEnc.getInternalname()), "S")==0) ? "S" : "N") ;
                           A336DisArtCor = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtCor.getInternalname()), "S")==0) ? "S" : "N") ;
                           A342DisArtPes = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A350DisArtRdt = localUtil.ctond( httpContext.cgiGet( edtDisArtRdt_Internalname)) ;
                           A359DisArtUrg = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1225DisGraCru = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1231DisArtAn1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAn1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1232DisArtAcb = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1233DisArtAc2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1197DisEncCom = localUtil.ctond( httpContext.cgiGet( edtDisEncCom_Internalname)) ;
                           A1198DisEncAnh = localUtil.ctond( httpContext.cgiGet( edtDisEncAnh_Internalname)) ;
                           A3127DisNumCor = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3128DisAncSal1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3129DisAncSal2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3130DisAncSal3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3131DisGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3132DisGraCru2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraCru2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1906DisGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1908DisRdoA = localUtil.ctond( httpContext.cgiGet( edtDisRdoA_Internalname)) ;
                           A1907DisRdoN = localUtil.ctond( httpContext.cgiGet( edtDisRdoN_Internalname)) ;
                           A5349DisObsGrm = httpContext.cgiGet( edtDisObsGrm_Internalname) ;
                           A5350DisObsAnc = httpContext.cgiGet( edtDisObsAnc_Internalname) ;
                           A9786DisItem5 = httpContext.cgiGet( edtDisItem5_Internalname) ;
                           A2009DisTipDis = GXutil.upper( httpContext.cgiGet( edtDisTipDis_Internalname)) ;
                           n2009DisTipDis = false ;
                           A2310DisCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A11734DisCnoEncO = httpContext.cgiGet( edtDisCnoEncO_Internalname) ;
                           A1052DisObs = httpContext.cgiGet( edtDisObs_Internalname) ;
                           A4478DisAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9717Tb1_Dscf = httpContext.cgiGet( edtTb1_Dscf_Internalname) ;
                           A475FindCol = httpContext.cgiGet( edtFindCol_Internalname) ;
                           A1430DisLoc = httpContext.cgiGet( edtDisLoc_Internalname) ;
                           A341DisArtOpe = GXutil.upper( httpContext.cgiGet( edtDisArtOpe_Internalname)) ;
                           A5252DisAcc = ((GXutil.strcmp(httpContext.cgiGet( chkDisAcc.getInternalname()), "S")==0) ? "S" : "N") ;
                           A5405DisAntpT = httpContext.cgiGet( edtDisAntpT_Internalname) ;
                           A375DisNumUni = localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)) ;
                           A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1122MaqCodDis = httpContext.cgiGet( edtMaqCodDis_Internalname) ;
                           n1122MaqCodDis = false ;
                           A371DisFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDisFecEnt_Internalname), 0)) ;
                           A370DisFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDisFecCli_Internalname), 0)) ;
                           A4813DisEncCli = httpContext.cgiGet( edtDisEncCli_Internalname) ;
                           A360DisCliNum = httpContext.cgiGet( edtDisCliNum_Internalname) ;
                           A757PriCod = ((GXutil.strcmp(httpContext.cgiGet( chkPriCod.getInternalname()), "1")==0) ? "1" : "0") ;
                           A387DisPiePie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n387DisPiePie = false ;
                           A385DisPieMtr = localUtil.ctond( httpContext.cgiGet( edtDisPieMtr_Internalname)) ;
                           A381DisPieKgm = localUtil.ctond( httpContext.cgiGet( edtDisPieKgm_Internalname)) ;
                           A388DisPreKgm = localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)) ;
                           A389DisPreMtr = localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)) ;
                           A383DisPieLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPieLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A372DisKgmLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisKgmLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A373DisMtrLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisMtrLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A399EmprCodDis = GXutil.upper( httpContext.cgiGet( edtEmprCodDis_Internalname)) ;
                           A253CliCodDis = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A379DisPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n379DisPie = false ;
                           A391DisUni = localUtil.ctond( httpContext.cgiGet( edtDisUni_Internalname)) ;
                           A386DisPieNor = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPieNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1502DisPart = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2831DisNumLot = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2832DisKgsLot = localUtil.ctond( httpContext.cgiGet( edtDisKgsLot_Internalname)) ;
                           A2833DisMtrLot = localUtil.ctond( httpContext.cgiGet( edtDisMtrLot_Internalname)) ;
                           A3306DisFac = ((GXutil.strcmp(httpContext.cgiGet( chkDisFac.getInternalname()), "S")==0) ? "S" : "N") ;
                           A3307DisManCod1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3308DisManCod2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3309DisNumTon = httpContext.cgiGet( edtDisNumTon_Internalname) ;
                           A4720DisDishCod = httpContext.cgiGet( edtDisDishCod_Internalname) ;
                           A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
                           A5024DisTipEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5025DisGraCob = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisGraCob_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5031DisCom = httpContext.cgiGet( edtDisCom_Internalname) ;
                           n5031DisCom = false ;
                           A5032DisEstTip = ((GXutil.strcmp(httpContext.cgiGet( chkDisEstTip.getInternalname()), "S")==0) ? "S" : "*") ;
                           A5290DisTipCor = httpContext.cgiGet( edtDisTipCor_Internalname) ;
                           A5366DisAntp = httpContext.cgiGet( edtDisAntp_Internalname) ;
                           A4614DisMdlCod = httpContext.cgiGet( edtDisMdlCod_Internalname) ;
                           A4615DisTam = httpContext.cgiGet( edtDisTam_Internalname) ;
                           A2402DisManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A998DisNMtr = httpContext.cgiGet( edtDisNMtr_Internalname) ;
                           A4468DisPelAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPelAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4474DisLotKgs = localUtil.ctond( httpContext.cgiGet( edtDisLotKgs_Internalname)) ;
                           A3841DisArtMer = localUtil.ctond( httpContext.cgiGet( edtDisArtMer_Internalname)) ;
                           A4470DisCruKgs = localUtil.ctond( httpContext.cgiGet( edtDisCruKgs_Internalname)) ;
                           A6547DisVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtDisVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6548DisRbMaq = localUtil.ctond( httpContext.cgiGet( edtDisRbMaq_Internalname)) ;
                           A4014DisTin = ((GXutil.strcmp(httpContext.cgiGet( chkDisTin.getInternalname()), "S")==0) ? "S" : "N") ;
                           A4785DisNroCor = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNroCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1901CliCtrl = ((GXutil.strcmp(httpContext.cgiGet( chkCliCtrl.getInternalname()), "S")==0) ? "S" : "N") ;
                           A4477DisAcaBak = ((GXutil.strcmp(httpContext.cgiGet( chkDisAcaBak.getInternalname()), "S")==0) ? "S" : "N") ;
                           A2743DisNumTex1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisNumTex1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4471DisCruEnr = httpContext.cgiGet( edtDisCruEnr_Internalname) ;
                           A9771DisItem1 = httpContext.cgiGet( edtDisItem1_Internalname) ;
                           A9772DisItem2 = httpContext.cgiGet( edtDisItem2_Internalname) ;
                           A9773DisItem3 = httpContext.cgiGet( edtDisItem3_Internalname) ;
                           A9774DisItem4 = httpContext.cgiGet( edtDisItem4_Internalname) ;
                           A9787DisItem6 = httpContext.cgiGet( edtDisItem6_Internalname) ;
                           A366DisEnt = httpContext.cgiGet( edtDisEnt_Internalname) ;
                           A4479DisAcaMar = httpContext.cgiGet( edtDisAcaMar_Internalname) ;
                           A999DisNMez = httpContext.cgiGet( edtDisNMez_Internalname) ;
                           A4473DisLotMts = localUtil.ctond( httpContext.cgiGet( edtDisLotMts_Internalname)) ;
                           A4469DisCruMts = localUtil.ctond( httpContext.cgiGet( edtDisCruMts_Internalname)) ;
                           A10887Cod_Idtx = httpContext.cgiGet( edtCod_Idtx_Internalname) ;
                           n10887Cod_Idtx = false ;
                           A7523DisRec = httpContext.cgiGet( edtDisRec_Internalname) ;
                           A8886DisDest = httpContext.cgiGet( edtDisDest_Internalname) ;
                           A11657DisMemo1 = httpContext.cgiGet( edtDisMemo1_Internalname) ;
                           A11658DisMemo2 = httpContext.cgiGet( edtDisMemo2_Internalname) ;
                           A11659MarcaId = GXutil.upper( httpContext.cgiGet( edtMarcaId_Internalname)) ;
                           n11659MarcaId = false ;
                           A11660MarcaDsc = httpContext.cgiGet( edtMarcaDsc_Internalname) ;
                           n11660MarcaDsc = false ;
                           A11661DisOrdComp = httpContext.cgiGet( edtDisOrdComp_Internalname) ;
                           A7739DisExp = ((GXutil.strcmp(httpContext.cgiGet( chkDisExp.getInternalname()), "E")==0) ? "E" : "N") ;
                           A11859Nxt_modelo = httpContext.cgiGet( edtNxt_modelo_Internalname) ;
                           A11860CpteId = (short)(localUtil.ctol( httpContext.cgiGet( edtCpteId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n11860CpteId = false ;
                           A11865CpteDsc = httpContext.cgiGet( edtCpteDsc_Internalname) ;
                           n11865CpteDsc = false ;
                           A11861Nxt_statio = httpContext.cgiGet( edtNxt_statio_Internalname) ;
                           A11862DesaID = (short)(localUtil.ctol( httpContext.cgiGet( edtDesaID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n11862DesaID = false ;
                           A11866DesaDsc = httpContext.cgiGet( edtDesaDsc_Internalname) ;
                           n11866DesaDsc = false ;
                           A11863DptoID = (short)(localUtil.ctol( httpContext.cgiGet( edtDptoID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n11863DptoID = false ;
                           A11867DptoDsc = httpContext.cgiGet( edtDptoDsc_Internalname) ;
                           n11867DptoDsc = false ;
                           A11864Nxt_artcli = httpContext.cgiGet( edtNxt_artcli_Internalname) ;
                           A2926DisPla = ((GXutil.strcmp(httpContext.cgiGet( chkDisPla.getInternalname()), "S")==0) ? "S" : "N") ;
                           A7738DisMaqEst = httpContext.cgiGet( edtDisMaqEst_Internalname) ;
                           A7513DisOrdSep = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisOrdSep.getInternalname()), "1")==0) ? 1 : 0)) ;
                           A7514DisOrdGra = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisOrdGra.getInternalname()), "1")==0) ? 1 : 0)) ;
                           A13737DisMaxObsL = (short)(localUtil.ctol( httpContext.cgiGet( edtDisMaxObsL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13737DisMaxObsL = false ;
                           A13732DisCanRec = (short)(localUtil.ctol( httpContext.cgiGet( edtDisCanRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13732DisCanRec = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20K52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21K52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22K52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ALTA'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Alta' */
                                 e23K52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'BAJA'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Baja' */
                                 e24K52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Disfec Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vDISFEC"), 0), AV7DisFec) ) )
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

   public void weK52( )
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

   public void paK52( )
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
            GX_FocusControl = edtavDatoclicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgadisartacaK50( String A396EmprCod ,
                                  String A764ProForCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgadisartaca_dataK50( A396EmprCod, A764ProForCod) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgadisartaca_dataK50( String A396EmprCod ,
                                          String A764ProForCod )
   {
      l764ProForCod = GXutil.padr( GXutil.rtrim( A764ProForCod), 6, "%") ;
      /* Using cursor H00K52 */
      pr_default.execute(0, new Object[] {A396EmprCod, l764ProForCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00K52_A764ProForCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00K52_A764ProForCod[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_542( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         sendrow_542( ) ;
         nGXsfl_54_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.Date AV7DisFec ,
                                 String AV6EmprCod ,
                                 String AV8pricod ,
                                 String AV5DisUsrcod ,
                                 byte AV29ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ,
                                 String AV19FilterFullText ,
                                 int AV34TFDisCod ,
                                 int AV35TFDisCod_To ,
                                 int AV36TFCliCod ,
                                 int AV37TFCliCod_To ,
                                 java.util.Date AV38TFDisFec ,
                                 String AV42TFDisArtCod ,
                                 String AV43TFDisArtCod_Sel ,
                                 String AV44TFDisArtDsc ,
                                 String AV45TFDisArtDsc_Sel ,
                                 String AV46TFDisColNom ,
                                 String AV47TFDisColNom_Sel ,
                                 String AV48TFDisNomCli ,
                                 String AV49TFDisNomCli_Sel ,
                                 int AV50TFDisColNum ,
                                 int AV51TFDisColNum_To ,
                                 String AV52TFDibCli ,
                                 String AV53TFDibCli_Sel ,
                                 int AV54TFDibInt ,
                                 int AV55TFDibInt_To ,
                                 short AV112TFDisMaxObsLin ,
                                 short AV113TFDisMaxObsLin_To ,
                                 short AV114TFDisCanRec ,
                                 short AV115TFDisCanRec_To ,
                                 String AV145Pgmname ,
                                 short AV16OrderedBy ,
                                 boolean AV17OrderedDsc ,
                                 int AV67barcod ,
                                 byte AV68Barcodreo ,
                                 String AV69barcodpar ,
                                 int AV66DisCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 boolean AV111ModeloSDT ,
                                 short AV83Detpie ,
                                 short AV88Tnwdp04 ,
                                 String AV63UsurCod ,
                                 String AV80Station )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21K52 ();
      GRID_nCurrentRecord = 0 ;
      rfK52( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A367DisEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISEST", GXutil.ltrim( localUtil.ntoc( A367DisEst, (byte)(1), (byte)(0), ".", "")));
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
      rfK52( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV145Pgmname = "WebWNwDP02" ;
      Gx_err = (short)(0) ;
   }

   public void rfK52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(54) ;
      /* Execute user event: Refresh */
      e21K52 ();
      nGXsfl_54_idx = 1 ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      bGXsfl_54_Refreshing = true ;
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
         subsflControlProps_542( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV122Webwnwdp02ds_2_tfdiscod) ,
                                              Integer.valueOf(AV123Webwnwdp02ds_3_tfdiscod_to) ,
                                              Integer.valueOf(AV124Webwnwdp02ds_4_tfclicod) ,
                                              Integer.valueOf(AV125Webwnwdp02ds_5_tfclicod_to) ,
                                              AV126Webwnwdp02ds_6_tfdisfec ,
                                              AV128Webwnwdp02ds_8_tfdisartcod_sel ,
                                              AV127Webwnwdp02ds_7_tfdisartcod ,
                                              AV130Webwnwdp02ds_10_tfdisartdsc_sel ,
                                              AV129Webwnwdp02ds_9_tfdisartdsc ,
                                              AV132Webwnwdp02ds_12_tfdiscolnom_sel ,
                                              AV131Webwnwdp02ds_11_tfdiscolnom ,
                                              AV134Webwnwdp02ds_14_tfdisnomcli_sel ,
                                              AV133Webwnwdp02ds_13_tfdisnomcli ,
                                              Integer.valueOf(AV135Webwnwdp02ds_15_tfdiscolnum) ,
                                              Integer.valueOf(AV136Webwnwdp02ds_16_tfdiscolnum_to) ,
                                              AV138Webwnwdp02ds_18_tfdibcli_sel ,
                                              AV137Webwnwdp02ds_17_tfdibcli ,
                                              Integer.valueOf(AV139Webwnwdp02ds_19_tfdibint) ,
                                              Integer.valueOf(AV140Webwnwdp02ds_20_tfdibint_to) ,
                                              Integer.valueOf(AV77discodp) ,
                                              Integer.valueOf(AV104CliCod) ,
                                              AV105DisCliNum ,
                                              AV106DisArtCod ,
                                              AV107Disartdsc ,
                                              AV108DisColNom ,
                                              AV109Disnomcli ,
                                              AV5DisUsrcod ,
                                              Integer.valueOf(A361DisCod) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A369DisFec ,
                                              A335DisArtCod ,
                                              A337DisArtDsc ,
                                              A362DisColNom ,
                                              A1195DisNomCli ,
                                              Integer.valueOf(A363DisColNum) ,
                                              A1013DibCli ,
                                              Integer.valueOf(A1014DibInt) ,
                                              A360DisCliNum ,
                                              A4348DisUsrCod ,
                                              Short.valueOf(AV16OrderedBy) ,
                                              Boolean.valueOf(AV17OrderedDsc) ,
                                              AV121Webwnwdp02ds_1_filterfulltext ,
                                              Short.valueOf(A13737DisMaxObsL) ,
                                              Short.valueOf(A13732DisCanRec) ,
                                              Short.valueOf(AV141Webwnwdp02ds_21_tfdismaxobslin) ,
                                              Short.valueOf(AV142Webwnwdp02ds_22_tfdismaxobslin_to) ,
                                              Short.valueOf(AV143Webwnwdp02ds_23_tfdiscanrec) ,
                                              Short.valueOf(AV144Webwnwdp02ds_24_tfdiscanrec_to) ,
                                              A757PriCod ,
                                              AV8pricod ,
                                              AV6EmprCod ,
                                              AV7DisFec ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                              }
         });
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
         lV127Webwnwdp02ds_7_tfdisartcod = GXutil.padr( GXutil.rtrim( AV127Webwnwdp02ds_7_tfdisartcod), 16, "%") ;
         lV129Webwnwdp02ds_9_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV129Webwnwdp02ds_9_tfdisartdsc), 26, "%") ;
         lV131Webwnwdp02ds_11_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV131Webwnwdp02ds_11_tfdiscolnom), 13, "%") ;
         lV133Webwnwdp02ds_13_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV133Webwnwdp02ds_13_tfdisnomcli), 13, "%") ;
         lV137Webwnwdp02ds_17_tfdibcli = GXutil.padr( GXutil.rtrim( AV137Webwnwdp02ds_17_tfdibcli), 16, "%") ;
         lV105DisCliNum = GXutil.padr( GXutil.rtrim( AV105DisCliNum), 8, "%") ;
         lV106DisArtCod = GXutil.padr( GXutil.rtrim( AV106DisArtCod), 16, "%") ;
         lV107Disartdsc = GXutil.padr( GXutil.rtrim( AV107Disartdsc), 26, "%") ;
         lV108DisColNom = GXutil.padr( GXutil.rtrim( AV108DisColNom), 13, "%") ;
         lV109Disnomcli = GXutil.padr( GXutil.rtrim( AV109Disnomcli), 13, "%") ;
         /* Using cursor H00K57 */
         pr_default.execute(1, new Object[] {AV6EmprCod, AV7DisFec, AV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, Short.valueOf(AV141Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV141Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV142Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV142Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV143Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV143Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV144Webwnwdp02ds_24_tfdiscanrec_to), Short.valueOf(AV144Webwnwdp02ds_24_tfdiscanrec_to), AV8pricod, AV8pricod, AV7DisFec, Integer.valueOf(AV122Webwnwdp02ds_2_tfdiscod), Integer.valueOf(AV123Webwnwdp02ds_3_tfdiscod_to), Integer.valueOf(AV124Webwnwdp02ds_4_tfclicod), Integer.valueOf(AV125Webwnwdp02ds_5_tfclicod_to), AV126Webwnwdp02ds_6_tfdisfec, lV127Webwnwdp02ds_7_tfdisartcod, AV128Webwnwdp02ds_8_tfdisartcod_sel, lV129Webwnwdp02ds_9_tfdisartdsc, AV130Webwnwdp02ds_10_tfdisartdsc_sel, lV131Webwnwdp02ds_11_tfdiscolnom, AV132Webwnwdp02ds_12_tfdiscolnom_sel, lV133Webwnwdp02ds_13_tfdisnomcli, AV134Webwnwdp02ds_14_tfdisnomcli_sel, Integer.valueOf(AV135Webwnwdp02ds_15_tfdiscolnum), Integer.valueOf(AV136Webwnwdp02ds_16_tfdiscolnum_to), lV137Webwnwdp02ds_17_tfdibcli, AV138Webwnwdp02ds_18_tfdibcli_sel, Integer.valueOf(AV139Webwnwdp02ds_19_tfdibint), Integer.valueOf(AV140Webwnwdp02ds_20_tfdibint_to), Integer.valueOf(AV77discodp), Integer.valueOf(AV104CliCod), lV105DisCliNum, lV106DisArtCod, lV107Disartdsc, lV108DisColNom, lV109Disnomcli, AV5DisUsrcod, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_54_idx = 1 ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1232DisArtAcb = H00K57_A1232DisArtAcb[0] ;
            A1231DisArtAn1 = H00K57_A1231DisArtAn1[0] ;
            A334DisArtAnh = H00K57_A334DisArtAnh[0] ;
            A1225DisGraCru = H00K57_A1225DisGraCru[0] ;
            A359DisArtUrg = H00K57_A359DisArtUrg[0] ;
            A350DisArtRdt = H00K57_A350DisArtRdt[0] ;
            A342DisArtPes = H00K57_A342DisArtPes[0] ;
            A336DisArtCor = H00K57_A336DisArtCor[0] ;
            A338DisArtEnc = H00K57_A338DisArtEnc[0] ;
            A333DisArtAca = H00K57_A333DisArtAca[0] ;
            A351DisArtSua = H00K57_A351DisArtSua[0] ;
            A339DisArtLar = H00K57_A339DisArtLar[0] ;
            A2835DisPle2 = H00K57_A2835DisPle2[0] ;
            A343DisArtPle = H00K57_A343DisArtPle[0] ;
            A340DisArtMat = H00K57_A340DisArtMat[0] ;
            A356DisArtUr1 = H00K57_A356DisArtUr1[0] ;
            A347DisArtPu1 = H00K57_A347DisArtPu1[0] ;
            A357DisArtUr2 = H00K57_A357DisArtUr2[0] ;
            A348DisArtPu2 = H00K57_A348DisArtPu2[0] ;
            A358DisArtUr3 = H00K57_A358DisArtUr3[0] ;
            A349DisArtPu3 = H00K57_A349DisArtPu3[0] ;
            n349DisArtPu3 = H00K57_n349DisArtPu3[0] ;
            A353DisArtTr1 = H00K57_A353DisArtTr1[0] ;
            A344DisArtPt1 = H00K57_A344DisArtPt1[0] ;
            A354DisArtTr2 = H00K57_A354DisArtTr2[0] ;
            A345DisArtPt2 = H00K57_A345DisArtPt2[0] ;
            A355DisArtTr3 = H00K57_A355DisArtTr3[0] ;
            A346DisArtPt3 = H00K57_A346DisArtPt3[0] ;
            A1196DisNumCli = H00K57_A1196DisNumCli[0] ;
            A407EmprNom = H00K57_A407EmprNom[0] ;
            n407EmprNom = H00K57_n407EmprNom[0] ;
            A1014DibInt = H00K57_A1014DibInt[0] ;
            n1014DibInt = H00K57_n1014DibInt[0] ;
            A1013DibCli = H00K57_A1013DibCli[0] ;
            n1013DibCli = H00K57_n1013DibCli[0] ;
            A1195DisNomCli = H00K57_A1195DisNomCli[0] ;
            A337DisArtDsc = H00K57_A337DisArtDsc[0] ;
            A279CliNom = H00K57_A279CliNom[0] ;
            A361DisCod = H00K57_A361DisCod[0] ;
            A367DisEst = H00K57_A367DisEst[0] ;
            A4348DisUsrCod = H00K57_A4348DisUsrCod[0] ;
            A13732DisCanRec = H00K57_A13732DisCanRec[0] ;
            n13732DisCanRec = H00K57_n13732DisCanRec[0] ;
            A13737DisMaxObsL = H00K57_A13737DisMaxObsL[0] ;
            n13737DisMaxObsL = H00K57_n13737DisMaxObsL[0] ;
            A379DisPie = H00K57_A379DisPie[0] ;
            n379DisPie = H00K57_n379DisPie[0] ;
            A387DisPiePie = H00K57_A387DisPiePie[0] ;
            n387DisPiePie = H00K57_n387DisPiePie[0] ;
            A352DisArtTip = H00K57_A352DisArtTip[0] ;
            A4478DisAcaAnh = H00K57_A4478DisAcaAnh[0] ;
            A390DisTipCol = H00K57_A390DisTipCol[0] ;
            n390DisTipCol = H00K57_n390DisTipCol[0] ;
            A363DisColNum = H00K57_A363DisColNum[0] ;
            n363DisColNum = H00K57_n363DisColNum[0] ;
            A362DisColNom = H00K57_A362DisColNom[0] ;
            n362DisColNom = H00K57_n362DisColNom[0] ;
            A335DisArtCod = H00K57_A335DisArtCod[0] ;
            A396EmprCod = H00K57_A396EmprCod[0] ;
            A252CliCod = H00K57_A252CliCod[0] ;
            A392DisUniMed = H00K57_A392DisUniMed[0] ;
            A365DisDes = H00K57_A365DisDes[0] ;
            A369DisFec = H00K57_A369DisFec[0] ;
            A7514DisOrdGra = H00K57_A7514DisOrdGra[0] ;
            A7513DisOrdSep = H00K57_A7513DisOrdSep[0] ;
            A7738DisMaqEst = H00K57_A7738DisMaqEst[0] ;
            A2926DisPla = H00K57_A2926DisPla[0] ;
            A11864Nxt_artcli = H00K57_A11864Nxt_artcli[0] ;
            A11867DptoDsc = H00K57_A11867DptoDsc[0] ;
            n11867DptoDsc = H00K57_n11867DptoDsc[0] ;
            A11863DptoID = H00K57_A11863DptoID[0] ;
            n11863DptoID = H00K57_n11863DptoID[0] ;
            A11866DesaDsc = H00K57_A11866DesaDsc[0] ;
            n11866DesaDsc = H00K57_n11866DesaDsc[0] ;
            A11862DesaID = H00K57_A11862DesaID[0] ;
            n11862DesaID = H00K57_n11862DesaID[0] ;
            A11861Nxt_statio = H00K57_A11861Nxt_statio[0] ;
            A11865CpteDsc = H00K57_A11865CpteDsc[0] ;
            n11865CpteDsc = H00K57_n11865CpteDsc[0] ;
            A11860CpteId = H00K57_A11860CpteId[0] ;
            n11860CpteId = H00K57_n11860CpteId[0] ;
            A11859Nxt_modelo = H00K57_A11859Nxt_modelo[0] ;
            A7739DisExp = H00K57_A7739DisExp[0] ;
            A11661DisOrdComp = H00K57_A11661DisOrdComp[0] ;
            A11660MarcaDsc = H00K57_A11660MarcaDsc[0] ;
            n11660MarcaDsc = H00K57_n11660MarcaDsc[0] ;
            A11659MarcaId = H00K57_A11659MarcaId[0] ;
            n11659MarcaId = H00K57_n11659MarcaId[0] ;
            A11658DisMemo2 = H00K57_A11658DisMemo2[0] ;
            A11657DisMemo1 = H00K57_A11657DisMemo1[0] ;
            A8886DisDest = H00K57_A8886DisDest[0] ;
            A7523DisRec = H00K57_A7523DisRec[0] ;
            A10887Cod_Idtx = H00K57_A10887Cod_Idtx[0] ;
            n10887Cod_Idtx = H00K57_n10887Cod_Idtx[0] ;
            A4469DisCruMts = H00K57_A4469DisCruMts[0] ;
            A4473DisLotMts = H00K57_A4473DisLotMts[0] ;
            A999DisNMez = H00K57_A999DisNMez[0] ;
            A4479DisAcaMar = H00K57_A4479DisAcaMar[0] ;
            A366DisEnt = H00K57_A366DisEnt[0] ;
            A9787DisItem6 = H00K57_A9787DisItem6[0] ;
            A9774DisItem4 = H00K57_A9774DisItem4[0] ;
            A9773DisItem3 = H00K57_A9773DisItem3[0] ;
            A9772DisItem2 = H00K57_A9772DisItem2[0] ;
            A9771DisItem1 = H00K57_A9771DisItem1[0] ;
            A4471DisCruEnr = H00K57_A4471DisCruEnr[0] ;
            A2743DisNumTex1 = H00K57_A2743DisNumTex1[0] ;
            A4477DisAcaBak = H00K57_A4477DisAcaBak[0] ;
            A1901CliCtrl = H00K57_A1901CliCtrl[0] ;
            A4785DisNroCor = H00K57_A4785DisNroCor[0] ;
            A4014DisTin = H00K57_A4014DisTin[0] ;
            A6548DisRbMaq = H00K57_A6548DisRbMaq[0] ;
            A6547DisVolMaq = H00K57_A6547DisVolMaq[0] ;
            A4470DisCruKgs = H00K57_A4470DisCruKgs[0] ;
            A3841DisArtMer = H00K57_A3841DisArtMer[0] ;
            A4474DisLotKgs = H00K57_A4474DisLotKgs[0] ;
            A4468DisPelAnh = H00K57_A4468DisPelAnh[0] ;
            A998DisNMtr = H00K57_A998DisNMtr[0] ;
            A2402DisManCod = H00K57_A2402DisManCod[0] ;
            A4615DisTam = H00K57_A4615DisTam[0] ;
            A4614DisMdlCod = H00K57_A4614DisMdlCod[0] ;
            A5366DisAntp = H00K57_A5366DisAntp[0] ;
            A5290DisTipCor = H00K57_A5290DisTipCor[0] ;
            A5032DisEstTip = H00K57_A5032DisEstTip[0] ;
            A5031DisCom = H00K57_A5031DisCom[0] ;
            n5031DisCom = H00K57_n5031DisCom[0] ;
            A5025DisGraCob = H00K57_A5025DisGraCob[0] ;
            A5024DisTipEst = H00K57_A5024DisTipEst[0] ;
            A4720DisDishCod = H00K57_A4720DisDishCod[0] ;
            A3309DisNumTon = H00K57_A3309DisNumTon[0] ;
            A3308DisManCod2 = H00K57_A3308DisManCod2[0] ;
            A3307DisManCod1 = H00K57_A3307DisManCod1[0] ;
            A3306DisFac = H00K57_A3306DisFac[0] ;
            A2833DisMtrLot = H00K57_A2833DisMtrLot[0] ;
            A2832DisKgsLot = H00K57_A2832DisKgsLot[0] ;
            A2831DisNumLot = H00K57_A2831DisNumLot[0] ;
            A1502DisPart = H00K57_A1502DisPart[0] ;
            A373DisMtrLan = H00K57_A373DisMtrLan[0] ;
            A372DisKgmLan = H00K57_A372DisKgmLan[0] ;
            A383DisPieLan = H00K57_A383DisPieLan[0] ;
            A389DisPreMtr = H00K57_A389DisPreMtr[0] ;
            A388DisPreKgm = H00K57_A388DisPreKgm[0] ;
            A757PriCod = H00K57_A757PriCod[0] ;
            A360DisCliNum = H00K57_A360DisCliNum[0] ;
            A4813DisEncCli = H00K57_A4813DisEncCli[0] ;
            A370DisFecCli = H00K57_A370DisFecCli[0] ;
            A371DisFecEnt = H00K57_A371DisFecEnt[0] ;
            A1122MaqCodDis = H00K57_A1122MaqCodDis[0] ;
            n1122MaqCodDis = H00K57_n1122MaqCodDis[0] ;
            A374DisNumPie = H00K57_A374DisNumPie[0] ;
            A375DisNumUni = H00K57_A375DisNumUni[0] ;
            A5405DisAntpT = H00K57_A5405DisAntpT[0] ;
            A5252DisAcc = H00K57_A5252DisAcc[0] ;
            A341DisArtOpe = H00K57_A341DisArtOpe[0] ;
            A1430DisLoc = H00K57_A1430DisLoc[0] ;
            A1052DisObs = H00K57_A1052DisObs[0] ;
            A11734DisCnoEncO = H00K57_A11734DisCnoEncO[0] ;
            A2310DisCliDes = H00K57_A2310DisCliDes[0] ;
            A2009DisTipDis = H00K57_A2009DisTipDis[0] ;
            n2009DisTipDis = H00K57_n2009DisTipDis[0] ;
            A9786DisItem5 = H00K57_A9786DisItem5[0] ;
            A5350DisObsAnc = H00K57_A5350DisObsAnc[0] ;
            A5349DisObsGrm = H00K57_A5349DisObsGrm[0] ;
            A1907DisRdoN = H00K57_A1907DisRdoN[0] ;
            A1908DisRdoA = H00K57_A1908DisRdoA[0] ;
            A1906DisGraAca = H00K57_A1906DisGraAca[0] ;
            A3132DisGraCru2 = H00K57_A3132DisGraCru2[0] ;
            A3131DisGraAca2 = H00K57_A3131DisGraAca2[0] ;
            A3130DisAncSal3 = H00K57_A3130DisAncSal3[0] ;
            A3129DisAncSal2 = H00K57_A3129DisAncSal2[0] ;
            A3128DisAncSal1 = H00K57_A3128DisAncSal1[0] ;
            A3127DisNumCor = H00K57_A3127DisNumCor[0] ;
            A1198DisEncAnh = H00K57_A1198DisEncAnh[0] ;
            A1197DisEncCom = H00K57_A1197DisEncCom[0] ;
            A1233DisArtAc2 = H00K57_A1233DisArtAc2[0] ;
            A407EmprNom = H00K57_A407EmprNom[0] ;
            n407EmprNom = H00K57_n407EmprNom[0] ;
            A11660MarcaDsc = H00K57_A11660MarcaDsc[0] ;
            n11660MarcaDsc = H00K57_n11660MarcaDsc[0] ;
            A11867DptoDsc = H00K57_A11867DptoDsc[0] ;
            n11867DptoDsc = H00K57_n11867DptoDsc[0] ;
            A11865CpteDsc = H00K57_A11865CpteDsc[0] ;
            n11865CpteDsc = H00K57_n11865CpteDsc[0] ;
            A11866DesaDsc = H00K57_A11866DesaDsc[0] ;
            n11866DesaDsc = H00K57_n11866DesaDsc[0] ;
            A13732DisCanRec = H00K57_A13732DisCanRec[0] ;
            n13732DisCanRec = H00K57_n13732DisCanRec[0] ;
            A13737DisMaxObsL = H00K57_A13737DisMaxObsL[0] ;
            n13737DisMaxObsL = H00K57_n13737DisMaxObsL[0] ;
            A379DisPie = H00K57_A379DisPie[0] ;
            n379DisPie = H00K57_n379DisPie[0] ;
            A387DisPiePie = H00K57_A387DisPiePie[0] ;
            n387DisPiePie = H00K57_n387DisPiePie[0] ;
            A279CliNom = H00K57_A279CliNom[0] ;
            A1901CliCtrl = H00K57_A1901CliCtrl[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
            }
            else
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
               }
            }
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
            }
            else
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
               }
            }
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
            }
            else
            {
               A386DisPieNor = (short)(0) ;
            }
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A391DisUni = getDisUni0( A396EmprCod, A361DisCod) ;
            }
            else
            {
               if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
               {
                  A391DisUni = getDisUni1( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  A391DisUni = DecimalUtil.doubleToDec(0) ;
               }
            }
            GXt_char1 = A475FindCol ;
            GXv_char2[0] = GXt_char1 ;
            new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char2) ;
            webwnwdp02_impl.this.GXt_char1 = GXv_char2[0] ;
            A475FindCol = GXt_char1 ;
            A253CliCodDis = A252CliCod ;
            GXt_char1 = A12116DisTipCD ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A390DisTipCol ;
            GXv_char4[0] = GXt_char1 ;
            new app.pfcoldsc(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
            webwnwdp02_impl.this.A396EmprCod = GXv_char2[0] ;
            webwnwdp02_impl.this.A390DisTipCol = GXv_int3[0] ;
            webwnwdp02_impl.this.GXt_char1 = GXv_char4[0] ;
            A12116DisTipCD = GXt_char1 ;
            GXt_char1 = A12115DisArtTipD ;
            GXv_char4[0] = GXt_char1 ;
            new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char4) ;
            webwnwdp02_impl.this.GXt_char1 = GXv_char4[0] ;
            A12115DisArtTipD = GXt_char1 ;
            GXt_char1 = A9717Tb1_Dscf ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = A4478DisAcaAnh ;
            GXv_char2[0] = GXt_char1 ;
            new app.pptable1(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char2) ;
            webwnwdp02_impl.this.A396EmprCod = GXv_char4[0] ;
            webwnwdp02_impl.this.A4478DisAcaAnh = GXv_int5[0] ;
            webwnwdp02_impl.this.GXt_char1 = GXv_char2[0] ;
            A9717Tb1_Dscf = GXt_char1 ;
            A399EmprCodDis = A396EmprCod ;
            e22K52 ();
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(54) ;
         wbK50( ) ;
      }
      bGXsfl_54_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesK52( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV145Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV145Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV67barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV68Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV69barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV66DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMODELOSDT", AV111ModeloSDT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODELOSDT", getSecureSignedToken( "", AV111ModeloSDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vDETPIE", GXutil.ltrim( localUtil.ntoc( AV83Detpie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDETPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV83Detpie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTNWDP04", GXutil.ltrim( localUtil.ntoc( AV88Tnwdp04, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTNWDP04", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV88Tnwdp04), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISEST"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, localUtil.format( DecimalUtil.doubleToDec(A367DisEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV63UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV63UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", AV80Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80Station, ""))));
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
      AV121Webwnwdp02ds_1_filterfulltext = AV19FilterFullText ;
      AV122Webwnwdp02ds_2_tfdiscod = AV34TFDisCod ;
      AV123Webwnwdp02ds_3_tfdiscod_to = AV35TFDisCod_To ;
      AV124Webwnwdp02ds_4_tfclicod = AV36TFCliCod ;
      AV125Webwnwdp02ds_5_tfclicod_to = AV37TFCliCod_To ;
      AV126Webwnwdp02ds_6_tfdisfec = AV38TFDisFec ;
      AV127Webwnwdp02ds_7_tfdisartcod = AV42TFDisArtCod ;
      AV128Webwnwdp02ds_8_tfdisartcod_sel = AV43TFDisArtCod_Sel ;
      AV129Webwnwdp02ds_9_tfdisartdsc = AV44TFDisArtDsc ;
      AV130Webwnwdp02ds_10_tfdisartdsc_sel = AV45TFDisArtDsc_Sel ;
      AV131Webwnwdp02ds_11_tfdiscolnom = AV46TFDisColNom ;
      AV132Webwnwdp02ds_12_tfdiscolnom_sel = AV47TFDisColNom_Sel ;
      AV133Webwnwdp02ds_13_tfdisnomcli = AV48TFDisNomCli ;
      AV134Webwnwdp02ds_14_tfdisnomcli_sel = AV49TFDisNomCli_Sel ;
      AV135Webwnwdp02ds_15_tfdiscolnum = AV50TFDisColNum ;
      AV136Webwnwdp02ds_16_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV137Webwnwdp02ds_17_tfdibcli = AV52TFDibCli ;
      AV138Webwnwdp02ds_18_tfdibcli_sel = AV53TFDibCli_Sel ;
      AV139Webwnwdp02ds_19_tfdibint = AV54TFDibInt ;
      AV140Webwnwdp02ds_20_tfdibint_to = AV55TFDibInt_To ;
      AV141Webwnwdp02ds_21_tfdismaxobslin = AV112TFDisMaxObsLin ;
      AV142Webwnwdp02ds_22_tfdismaxobslin_to = AV113TFDisMaxObsLin_To ;
      AV143Webwnwdp02ds_23_tfdiscanrec = AV114TFDisCanRec ;
      AV144Webwnwdp02ds_24_tfdiscanrec_to = AV115TFDisCanRec_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV122Webwnwdp02ds_2_tfdiscod) ,
                                           Integer.valueOf(AV123Webwnwdp02ds_3_tfdiscod_to) ,
                                           Integer.valueOf(AV124Webwnwdp02ds_4_tfclicod) ,
                                           Integer.valueOf(AV125Webwnwdp02ds_5_tfclicod_to) ,
                                           AV126Webwnwdp02ds_6_tfdisfec ,
                                           AV128Webwnwdp02ds_8_tfdisartcod_sel ,
                                           AV127Webwnwdp02ds_7_tfdisartcod ,
                                           AV130Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           AV129Webwnwdp02ds_9_tfdisartdsc ,
                                           AV132Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           AV131Webwnwdp02ds_11_tfdiscolnom ,
                                           AV134Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           AV133Webwnwdp02ds_13_tfdisnomcli ,
                                           Integer.valueOf(AV135Webwnwdp02ds_15_tfdiscolnum) ,
                                           Integer.valueOf(AV136Webwnwdp02ds_16_tfdiscolnum_to) ,
                                           AV138Webwnwdp02ds_18_tfdibcli_sel ,
                                           AV137Webwnwdp02ds_17_tfdibcli ,
                                           Integer.valueOf(AV139Webwnwdp02ds_19_tfdibint) ,
                                           Integer.valueOf(AV140Webwnwdp02ds_20_tfdibint_to) ,
                                           Integer.valueOf(AV77discodp) ,
                                           Integer.valueOf(AV104CliCod) ,
                                           AV105DisCliNum ,
                                           AV106DisArtCod ,
                                           AV107Disartdsc ,
                                           AV108DisColNom ,
                                           AV109Disnomcli ,
                                           AV5DisUsrcod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A369DisFec ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A363DisColNum) ,
                                           A1013DibCli ,
                                           Integer.valueOf(A1014DibInt) ,
                                           A360DisCliNum ,
                                           A4348DisUsrCod ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV121Webwnwdp02ds_1_filterfulltext ,
                                           Short.valueOf(A13737DisMaxObsL) ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV141Webwnwdp02ds_21_tfdismaxobslin) ,
                                           Short.valueOf(AV142Webwnwdp02ds_22_tfdismaxobslin_to) ,
                                           Short.valueOf(AV143Webwnwdp02ds_23_tfdiscanrec) ,
                                           Short.valueOf(AV144Webwnwdp02ds_24_tfdiscanrec_to) ,
                                           A757PriCod ,
                                           AV8pricod ,
                                           AV6EmprCod ,
                                           AV7DisFec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV121Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV127Webwnwdp02ds_7_tfdisartcod = GXutil.padr( GXutil.rtrim( AV127Webwnwdp02ds_7_tfdisartcod), 16, "%") ;
      lV129Webwnwdp02ds_9_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV129Webwnwdp02ds_9_tfdisartdsc), 26, "%") ;
      lV131Webwnwdp02ds_11_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV131Webwnwdp02ds_11_tfdiscolnom), 13, "%") ;
      lV133Webwnwdp02ds_13_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV133Webwnwdp02ds_13_tfdisnomcli), 13, "%") ;
      lV137Webwnwdp02ds_17_tfdibcli = GXutil.padr( GXutil.rtrim( AV137Webwnwdp02ds_17_tfdibcli), 16, "%") ;
      lV105DisCliNum = GXutil.padr( GXutil.rtrim( AV105DisCliNum), 8, "%") ;
      lV106DisArtCod = GXutil.padr( GXutil.rtrim( AV106DisArtCod), 16, "%") ;
      lV107Disartdsc = GXutil.padr( GXutil.rtrim( AV107Disartdsc), 26, "%") ;
      lV108DisColNom = GXutil.padr( GXutil.rtrim( AV108DisColNom), 13, "%") ;
      lV109Disnomcli = GXutil.padr( GXutil.rtrim( AV109Disnomcli), 13, "%") ;
      /* Using cursor H00K512 */
      pr_default.execute(2, new Object[] {AV6EmprCod, AV7DisFec, AV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, lV121Webwnwdp02ds_1_filterfulltext, Short.valueOf(AV141Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV141Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV142Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV142Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV143Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV143Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV144Webwnwdp02ds_24_tfdiscanrec_to), Short.valueOf(AV144Webwnwdp02ds_24_tfdiscanrec_to), AV8pricod, AV8pricod, AV7DisFec, Integer.valueOf(AV122Webwnwdp02ds_2_tfdiscod), Integer.valueOf(AV123Webwnwdp02ds_3_tfdiscod_to), Integer.valueOf(AV124Webwnwdp02ds_4_tfclicod), Integer.valueOf(AV125Webwnwdp02ds_5_tfclicod_to), AV126Webwnwdp02ds_6_tfdisfec, lV127Webwnwdp02ds_7_tfdisartcod, AV128Webwnwdp02ds_8_tfdisartcod_sel, lV129Webwnwdp02ds_9_tfdisartdsc, AV130Webwnwdp02ds_10_tfdisartdsc_sel, lV131Webwnwdp02ds_11_tfdiscolnom, AV132Webwnwdp02ds_12_tfdiscolnom_sel, lV133Webwnwdp02ds_13_tfdisnomcli, AV134Webwnwdp02ds_14_tfdisnomcli_sel, Integer.valueOf(AV135Webwnwdp02ds_15_tfdiscolnum), Integer.valueOf(AV136Webwnwdp02ds_16_tfdiscolnum_to), lV137Webwnwdp02ds_17_tfdibcli, AV138Webwnwdp02ds_18_tfdibcli_sel, Integer.valueOf(AV139Webwnwdp02ds_19_tfdibint), Integer.valueOf(AV140Webwnwdp02ds_20_tfdibint_to), Integer.valueOf(AV77discodp), Integer.valueOf(AV104CliCod), lV105DisCliNum, lV106DisArtCod, lV107Disartdsc, lV108DisColNom, lV109Disnomcli, AV5DisUsrcod});
      GRID_nRecordCount = H00K512_AGRID_nRecordCount[0] ;
      pr_default.close(2);
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
      AV121Webwnwdp02ds_1_filterfulltext = AV19FilterFullText ;
      AV122Webwnwdp02ds_2_tfdiscod = AV34TFDisCod ;
      AV123Webwnwdp02ds_3_tfdiscod_to = AV35TFDisCod_To ;
      AV124Webwnwdp02ds_4_tfclicod = AV36TFCliCod ;
      AV125Webwnwdp02ds_5_tfclicod_to = AV37TFCliCod_To ;
      AV126Webwnwdp02ds_6_tfdisfec = AV38TFDisFec ;
      AV127Webwnwdp02ds_7_tfdisartcod = AV42TFDisArtCod ;
      AV128Webwnwdp02ds_8_tfdisartcod_sel = AV43TFDisArtCod_Sel ;
      AV129Webwnwdp02ds_9_tfdisartdsc = AV44TFDisArtDsc ;
      AV130Webwnwdp02ds_10_tfdisartdsc_sel = AV45TFDisArtDsc_Sel ;
      AV131Webwnwdp02ds_11_tfdiscolnom = AV46TFDisColNom ;
      AV132Webwnwdp02ds_12_tfdiscolnom_sel = AV47TFDisColNom_Sel ;
      AV133Webwnwdp02ds_13_tfdisnomcli = AV48TFDisNomCli ;
      AV134Webwnwdp02ds_14_tfdisnomcli_sel = AV49TFDisNomCli_Sel ;
      AV135Webwnwdp02ds_15_tfdiscolnum = AV50TFDisColNum ;
      AV136Webwnwdp02ds_16_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV137Webwnwdp02ds_17_tfdibcli = AV52TFDibCli ;
      AV138Webwnwdp02ds_18_tfdibcli_sel = AV53TFDibCli_Sel ;
      AV139Webwnwdp02ds_19_tfdibint = AV54TFDibInt ;
      AV140Webwnwdp02ds_20_tfdibint_to = AV55TFDibInt_To ;
      AV141Webwnwdp02ds_21_tfdismaxobslin = AV112TFDisMaxObsLin ;
      AV142Webwnwdp02ds_22_tfdismaxobslin_to = AV113TFDisMaxObsLin_To ;
      AV143Webwnwdp02ds_23_tfdiscanrec = AV114TFDisCanRec ;
      AV144Webwnwdp02ds_24_tfdiscanrec_to = AV115TFDisCanRec_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7DisFec, AV6EmprCod, AV8pricod, AV5DisUsrcod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV34TFDisCod, AV35TFDisCod_To, AV36TFCliCod, AV37TFCliCod_To, AV38TFDisFec, AV42TFDisArtCod, AV43TFDisArtCod_Sel, AV44TFDisArtDsc, AV45TFDisArtDsc_Sel, AV46TFDisColNom, AV47TFDisColNom_Sel, AV48TFDisNomCli, AV49TFDisNomCli_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDibCli, AV53TFDibCli_Sel, AV54TFDibInt, AV55TFDibInt_To, AV112TFDisMaxObsLin, AV113TFDisMaxObsLin_To, AV114TFDisCanRec, AV115TFDisCanRec_To, AV145Pgmname, AV16OrderedBy, AV17OrderedDsc, AV67barcod, AV68Barcodreo, AV69barcodpar, AV66DisCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV111ModeloSDT, AV83Detpie, AV88Tnwdp04, AV63UsurCod, AV80Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV121Webwnwdp02ds_1_filterfulltext = AV19FilterFullText ;
      AV122Webwnwdp02ds_2_tfdiscod = AV34TFDisCod ;
      AV123Webwnwdp02ds_3_tfdiscod_to = AV35TFDisCod_To ;
      AV124Webwnwdp02ds_4_tfclicod = AV36TFCliCod ;
      AV125Webwnwdp02ds_5_tfclicod_to = AV37TFCliCod_To ;
      AV126Webwnwdp02ds_6_tfdisfec = AV38TFDisFec ;
      AV127Webwnwdp02ds_7_tfdisartcod = AV42TFDisArtCod ;
      AV128Webwnwdp02ds_8_tfdisartcod_sel = AV43TFDisArtCod_Sel ;
      AV129Webwnwdp02ds_9_tfdisartdsc = AV44TFDisArtDsc ;
      AV130Webwnwdp02ds_10_tfdisartdsc_sel = AV45TFDisArtDsc_Sel ;
      AV131Webwnwdp02ds_11_tfdiscolnom = AV46TFDisColNom ;
      AV132Webwnwdp02ds_12_tfdiscolnom_sel = AV47TFDisColNom_Sel ;
      AV133Webwnwdp02ds_13_tfdisnomcli = AV48TFDisNomCli ;
      AV134Webwnwdp02ds_14_tfdisnomcli_sel = AV49TFDisNomCli_Sel ;
      AV135Webwnwdp02ds_15_tfdiscolnum = AV50TFDisColNum ;
      AV136Webwnwdp02ds_16_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV137Webwnwdp02ds_17_tfdibcli = AV52TFDibCli ;
      AV138Webwnwdp02ds_18_tfdibcli_sel = AV53TFDibCli_Sel ;
      AV139Webwnwdp02ds_19_tfdibint = AV54TFDibInt ;
      AV140Webwnwdp02ds_20_tfdibint_to = AV55TFDibInt_To ;
      AV141Webwnwdp02ds_21_tfdismaxobslin = AV112TFDisMaxObsLin ;
      AV142Webwnwdp02ds_22_tfdismaxobslin_to = AV113TFDisMaxObsLin_To ;
      AV143Webwnwdp02ds_23_tfdiscanrec = AV114TFDisCanRec ;
      AV144Webwnwdp02ds_24_tfdiscanrec_to = AV115TFDisCanRec_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7DisFec, AV6EmprCod, AV8pricod, AV5DisUsrcod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV34TFDisCod, AV35TFDisCod_To, AV36TFCliCod, AV37TFCliCod_To, AV38TFDisFec, AV42TFDisArtCod, AV43TFDisArtCod_Sel, AV44TFDisArtDsc, AV45TFDisArtDsc_Sel, AV46TFDisColNom, AV47TFDisColNom_Sel, AV48TFDisNomCli, AV49TFDisNomCli_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDibCli, AV53TFDibCli_Sel, AV54TFDibInt, AV55TFDibInt_To, AV112TFDisMaxObsLin, AV113TFDisMaxObsLin_To, AV114TFDisCanRec, AV115TFDisCanRec_To, AV145Pgmname, AV16OrderedBy, AV17OrderedDsc, AV67barcod, AV68Barcodreo, AV69barcodpar, AV66DisCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV111ModeloSDT, AV83Detpie, AV88Tnwdp04, AV63UsurCod, AV80Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV121Webwnwdp02ds_1_filterfulltext = AV19FilterFullText ;
      AV122Webwnwdp02ds_2_tfdiscod = AV34TFDisCod ;
      AV123Webwnwdp02ds_3_tfdiscod_to = AV35TFDisCod_To ;
      AV124Webwnwdp02ds_4_tfclicod = AV36TFCliCod ;
      AV125Webwnwdp02ds_5_tfclicod_to = AV37TFCliCod_To ;
      AV126Webwnwdp02ds_6_tfdisfec = AV38TFDisFec ;
      AV127Webwnwdp02ds_7_tfdisartcod = AV42TFDisArtCod ;
      AV128Webwnwdp02ds_8_tfdisartcod_sel = AV43TFDisArtCod_Sel ;
      AV129Webwnwdp02ds_9_tfdisartdsc = AV44TFDisArtDsc ;
      AV130Webwnwdp02ds_10_tfdisartdsc_sel = AV45TFDisArtDsc_Sel ;
      AV131Webwnwdp02ds_11_tfdiscolnom = AV46TFDisColNom ;
      AV132Webwnwdp02ds_12_tfdiscolnom_sel = AV47TFDisColNom_Sel ;
      AV133Webwnwdp02ds_13_tfdisnomcli = AV48TFDisNomCli ;
      AV134Webwnwdp02ds_14_tfdisnomcli_sel = AV49TFDisNomCli_Sel ;
      AV135Webwnwdp02ds_15_tfdiscolnum = AV50TFDisColNum ;
      AV136Webwnwdp02ds_16_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV137Webwnwdp02ds_17_tfdibcli = AV52TFDibCli ;
      AV138Webwnwdp02ds_18_tfdibcli_sel = AV53TFDibCli_Sel ;
      AV139Webwnwdp02ds_19_tfdibint = AV54TFDibInt ;
      AV140Webwnwdp02ds_20_tfdibint_to = AV55TFDibInt_To ;
      AV141Webwnwdp02ds_21_tfdismaxobslin = AV112TFDisMaxObsLin ;
      AV142Webwnwdp02ds_22_tfdismaxobslin_to = AV113TFDisMaxObsLin_To ;
      AV143Webwnwdp02ds_23_tfdiscanrec = AV114TFDisCanRec ;
      AV144Webwnwdp02ds_24_tfdiscanrec_to = AV115TFDisCanRec_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7DisFec, AV6EmprCod, AV8pricod, AV5DisUsrcod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV34TFDisCod, AV35TFDisCod_To, AV36TFCliCod, AV37TFCliCod_To, AV38TFDisFec, AV42TFDisArtCod, AV43TFDisArtCod_Sel, AV44TFDisArtDsc, AV45TFDisArtDsc_Sel, AV46TFDisColNom, AV47TFDisColNom_Sel, AV48TFDisNomCli, AV49TFDisNomCli_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDibCli, AV53TFDibCli_Sel, AV54TFDibInt, AV55TFDibInt_To, AV112TFDisMaxObsLin, AV113TFDisMaxObsLin_To, AV114TFDisCanRec, AV115TFDisCanRec_To, AV145Pgmname, AV16OrderedBy, AV17OrderedDsc, AV67barcod, AV68Barcodreo, AV69barcodpar, AV66DisCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV111ModeloSDT, AV83Detpie, AV88Tnwdp04, AV63UsurCod, AV80Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV121Webwnwdp02ds_1_filterfulltext = AV19FilterFullText ;
      AV122Webwnwdp02ds_2_tfdiscod = AV34TFDisCod ;
      AV123Webwnwdp02ds_3_tfdiscod_to = AV35TFDisCod_To ;
      AV124Webwnwdp02ds_4_tfclicod = AV36TFCliCod ;
      AV125Webwnwdp02ds_5_tfclicod_to = AV37TFCliCod_To ;
      AV126Webwnwdp02ds_6_tfdisfec = AV38TFDisFec ;
      AV127Webwnwdp02ds_7_tfdisartcod = AV42TFDisArtCod ;
      AV128Webwnwdp02ds_8_tfdisartcod_sel = AV43TFDisArtCod_Sel ;
      AV129Webwnwdp02ds_9_tfdisartdsc = AV44TFDisArtDsc ;
      AV130Webwnwdp02ds_10_tfdisartdsc_sel = AV45TFDisArtDsc_Sel ;
      AV131Webwnwdp02ds_11_tfdiscolnom = AV46TFDisColNom ;
      AV132Webwnwdp02ds_12_tfdiscolnom_sel = AV47TFDisColNom_Sel ;
      AV133Webwnwdp02ds_13_tfdisnomcli = AV48TFDisNomCli ;
      AV134Webwnwdp02ds_14_tfdisnomcli_sel = AV49TFDisNomCli_Sel ;
      AV135Webwnwdp02ds_15_tfdiscolnum = AV50TFDisColNum ;
      AV136Webwnwdp02ds_16_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV137Webwnwdp02ds_17_tfdibcli = AV52TFDibCli ;
      AV138Webwnwdp02ds_18_tfdibcli_sel = AV53TFDibCli_Sel ;
      AV139Webwnwdp02ds_19_tfdibint = AV54TFDibInt ;
      AV140Webwnwdp02ds_20_tfdibint_to = AV55TFDibInt_To ;
      AV141Webwnwdp02ds_21_tfdismaxobslin = AV112TFDisMaxObsLin ;
      AV142Webwnwdp02ds_22_tfdismaxobslin_to = AV113TFDisMaxObsLin_To ;
      AV143Webwnwdp02ds_23_tfdiscanrec = AV114TFDisCanRec ;
      AV144Webwnwdp02ds_24_tfdiscanrec_to = AV115TFDisCanRec_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7DisFec, AV6EmprCod, AV8pricod, AV5DisUsrcod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV34TFDisCod, AV35TFDisCod_To, AV36TFCliCod, AV37TFCliCod_To, AV38TFDisFec, AV42TFDisArtCod, AV43TFDisArtCod_Sel, AV44TFDisArtDsc, AV45TFDisArtDsc_Sel, AV46TFDisColNom, AV47TFDisColNom_Sel, AV48TFDisNomCli, AV49TFDisNomCli_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDibCli, AV53TFDibCli_Sel, AV54TFDibInt, AV55TFDibInt_To, AV112TFDisMaxObsLin, AV113TFDisMaxObsLin_To, AV114TFDisCanRec, AV115TFDisCanRec_To, AV145Pgmname, AV16OrderedBy, AV17OrderedDsc, AV67barcod, AV68Barcodreo, AV69barcodpar, AV66DisCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV111ModeloSDT, AV83Detpie, AV88Tnwdp04, AV63UsurCod, AV80Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV121Webwnwdp02ds_1_filterfulltext = AV19FilterFullText ;
      AV122Webwnwdp02ds_2_tfdiscod = AV34TFDisCod ;
      AV123Webwnwdp02ds_3_tfdiscod_to = AV35TFDisCod_To ;
      AV124Webwnwdp02ds_4_tfclicod = AV36TFCliCod ;
      AV125Webwnwdp02ds_5_tfclicod_to = AV37TFCliCod_To ;
      AV126Webwnwdp02ds_6_tfdisfec = AV38TFDisFec ;
      AV127Webwnwdp02ds_7_tfdisartcod = AV42TFDisArtCod ;
      AV128Webwnwdp02ds_8_tfdisartcod_sel = AV43TFDisArtCod_Sel ;
      AV129Webwnwdp02ds_9_tfdisartdsc = AV44TFDisArtDsc ;
      AV130Webwnwdp02ds_10_tfdisartdsc_sel = AV45TFDisArtDsc_Sel ;
      AV131Webwnwdp02ds_11_tfdiscolnom = AV46TFDisColNom ;
      AV132Webwnwdp02ds_12_tfdiscolnom_sel = AV47TFDisColNom_Sel ;
      AV133Webwnwdp02ds_13_tfdisnomcli = AV48TFDisNomCli ;
      AV134Webwnwdp02ds_14_tfdisnomcli_sel = AV49TFDisNomCli_Sel ;
      AV135Webwnwdp02ds_15_tfdiscolnum = AV50TFDisColNum ;
      AV136Webwnwdp02ds_16_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV137Webwnwdp02ds_17_tfdibcli = AV52TFDibCli ;
      AV138Webwnwdp02ds_18_tfdibcli_sel = AV53TFDibCli_Sel ;
      AV139Webwnwdp02ds_19_tfdibint = AV54TFDibInt ;
      AV140Webwnwdp02ds_20_tfdibint_to = AV55TFDibInt_To ;
      AV141Webwnwdp02ds_21_tfdismaxobslin = AV112TFDisMaxObsLin ;
      AV142Webwnwdp02ds_22_tfdismaxobslin_to = AV113TFDisMaxObsLin_To ;
      AV143Webwnwdp02ds_23_tfdiscanrec = AV114TFDisCanRec ;
      AV144Webwnwdp02ds_24_tfdiscanrec_to = AV115TFDisCanRec_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7DisFec, AV6EmprCod, AV8pricod, AV5DisUsrcod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV34TFDisCod, AV35TFDisCod_To, AV36TFCliCod, AV37TFCliCod_To, AV38TFDisFec, AV42TFDisArtCod, AV43TFDisArtCod_Sel, AV44TFDisArtDsc, AV45TFDisArtDsc_Sel, AV46TFDisColNom, AV47TFDisColNom_Sel, AV48TFDisNomCli, AV49TFDisNomCli_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDibCli, AV53TFDibCli_Sel, AV54TFDibInt, AV55TFDibInt_To, AV112TFDisMaxObsLin, AV113TFDisMaxObsLin_To, AV114TFDisCanRec, AV115TFDisCanRec_To, AV145Pgmname, AV16OrderedBy, AV17OrderedDsc, AV67barcod, AV68Barcodreo, AV69barcodpar, AV66DisCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV111ModeloSDT, AV83Detpie, AV88Tnwdp04, AV63UsurCod, AV80Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV145Pgmname = "WebWNwDP02" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupK50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20K52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV27ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV56DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV24ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_54 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_54"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV58GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV59GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDatoclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDatoclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDATOCLICOD");
            GX_FocusControl = edtavDatoclicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV110DatoCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110DatoCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110DatoCliCod), 6, 0));
         }
         else
         {
            AV110DatoCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavDatoclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110DatoCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110DatoCliCod), 6, 0));
         }
         AV19FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDisfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDISFEC");
            GX_FocusControl = edtavDisfec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7DisFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7DisFec", localUtil.format(AV7DisFec, "99/99/99"));
         }
         else
         {
            AV7DisFec = localUtil.ctod( httpContext.cgiGet( edtavDisfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7DisFec", localUtil.format(AV7DisFec, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_disfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DISFECAUXDATE");
            GX_FocusControl = edtavDdo_disfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40DDO_DisFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40DDO_DisFecAuxDate", localUtil.format(AV40DDO_DisFecAuxDate, "99/99/99"));
         }
         else
         {
            AV40DDO_DisFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_disfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40DDO_DisFecAuxDate", localUtil.format(AV40DDO_DisFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_54_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
         if ( nGXsfl_54_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV116GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActions), 4, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A4348DisUsrCod = httpContext.cgiGet( edtDisUsrCod_Internalname) ;
            cmbDisEst.setName( cmbDisEst.getInternalname() );
            cmbDisEst.setValue( httpContext.cgiGet( cmbDisEst.getInternalname()) );
            A367DisEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbDisEst.getInternalname()))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
            A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
            A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
            n362DisColNom = false ;
            A1195DisNomCli = httpContext.cgiGet( edtDisNomCli_Internalname) ;
            A363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n363DisColNum = false ;
            A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
            n1013DibCli = false ;
            A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1014DibInt = false ;
            A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            A390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n390DisTipCol = false ;
            A12116DisTipCD = httpContext.cgiGet( edtDisTipCD_Internalname) ;
            A1196DisNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A352DisArtTip = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12115DisArtTipD = httpContext.cgiGet( edtDisArtTipD_Internalname) ;
            A346DisArtPt3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A355DisArtTr3 = httpContext.cgiGet( edtDisArtTr3_Internalname) ;
            A345DisArtPt2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A354DisArtTr2 = httpContext.cgiGet( edtDisArtTr2_Internalname) ;
            A344DisArtPt1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A353DisArtTr1 = httpContext.cgiGet( edtDisArtTr1_Internalname) ;
            A349DisArtPu3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n349DisArtPu3 = false ;
            A358DisArtUr3 = httpContext.cgiGet( edtDisArtUr3_Internalname) ;
            A348DisArtPu2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A357DisArtUr2 = httpContext.cgiGet( edtDisArtUr2_Internalname) ;
            A347DisArtPu1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A356DisArtUr1 = httpContext.cgiGet( edtDisArtUr1_Internalname) ;
            A340DisArtMat = httpContext.cgiGet( edtDisArtMat_Internalname) ;
            A343DisArtPle = httpContext.cgiGet( edtDisArtPle_Internalname) ;
            A2835DisPle2 = httpContext.cgiGet( edtDisPle2_Internalname) ;
            A339DisArtLar = httpContext.cgiGet( edtDisArtLar_Internalname) ;
            A351DisArtSua = httpContext.cgiGet( edtDisArtSua_Internalname) ;
            A333DisArtAca = httpContext.cgiGet( edtDisArtAca_Internalname) ;
            A338DisArtEnc = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtEnc.getInternalname()), "S")==0) ? "S" : "N") ;
            A336DisArtCor = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtCor.getInternalname()), "S")==0) ? "S" : "N") ;
            A342DisArtPes = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A350DisArtRdt = localUtil.ctond( httpContext.cgiGet( edtDisArtRdt_Internalname)) ;
            A359DisArtUrg = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1225DisGraCru = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1231DisArtAn1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAn1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1232DisArtAcb = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1233DisArtAc2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1197DisEncCom = localUtil.ctond( httpContext.cgiGet( edtDisEncCom_Internalname)) ;
            A1198DisEncAnh = localUtil.ctond( httpContext.cgiGet( edtDisEncAnh_Internalname)) ;
            A3127DisNumCor = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3128DisAncSal1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3129DisAncSal2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3130DisAncSal3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3131DisGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3132DisGraCru2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraCru2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1906DisGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1908DisRdoA = localUtil.ctond( httpContext.cgiGet( edtDisRdoA_Internalname)) ;
            A1907DisRdoN = localUtil.ctond( httpContext.cgiGet( edtDisRdoN_Internalname)) ;
            A5349DisObsGrm = httpContext.cgiGet( edtDisObsGrm_Internalname) ;
            A5350DisObsAnc = httpContext.cgiGet( edtDisObsAnc_Internalname) ;
            A9786DisItem5 = httpContext.cgiGet( edtDisItem5_Internalname) ;
            A2009DisTipDis = GXutil.upper( httpContext.cgiGet( edtDisTipDis_Internalname)) ;
            n2009DisTipDis = false ;
            A2310DisCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11734DisCnoEncO = httpContext.cgiGet( edtDisCnoEncO_Internalname) ;
            A1052DisObs = httpContext.cgiGet( edtDisObs_Internalname) ;
            A4478DisAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9717Tb1_Dscf = httpContext.cgiGet( edtTb1_Dscf_Internalname) ;
            A475FindCol = httpContext.cgiGet( edtFindCol_Internalname) ;
            A1430DisLoc = httpContext.cgiGet( edtDisLoc_Internalname) ;
            A341DisArtOpe = GXutil.upper( httpContext.cgiGet( edtDisArtOpe_Internalname)) ;
            A5252DisAcc = ((GXutil.strcmp(httpContext.cgiGet( chkDisAcc.getInternalname()), "S")==0) ? "S" : "N") ;
            A5405DisAntpT = httpContext.cgiGet( edtDisAntpT_Internalname) ;
            A375DisNumUni = localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)) ;
            A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1122MaqCodDis = httpContext.cgiGet( edtMaqCodDis_Internalname) ;
            n1122MaqCodDis = false ;
            A371DisFecEnt = localUtil.ctod( httpContext.cgiGet( edtDisFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A370DisFecCli = localUtil.ctod( httpContext.cgiGet( edtDisFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A4813DisEncCli = httpContext.cgiGet( edtDisEncCli_Internalname) ;
            A360DisCliNum = httpContext.cgiGet( edtDisCliNum_Internalname) ;
            A757PriCod = ((GXutil.strcmp(httpContext.cgiGet( chkPriCod.getInternalname()), "1")==0) ? "1" : "0") ;
            A387DisPiePie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n387DisPiePie = false ;
            A385DisPieMtr = localUtil.ctond( httpContext.cgiGet( edtDisPieMtr_Internalname)) ;
            A381DisPieKgm = localUtil.ctond( httpContext.cgiGet( edtDisPieKgm_Internalname)) ;
            A388DisPreKgm = localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)) ;
            A389DisPreMtr = localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)) ;
            A383DisPieLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPieLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A372DisKgmLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisKgmLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A373DisMtrLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisMtrLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A399EmprCodDis = GXutil.upper( httpContext.cgiGet( edtEmprCodDis_Internalname)) ;
            A253CliCodDis = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A379DisPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n379DisPie = false ;
            A391DisUni = localUtil.ctond( httpContext.cgiGet( edtDisUni_Internalname)) ;
            A386DisPieNor = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPieNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1502DisPart = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2831DisNumLot = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2832DisKgsLot = localUtil.ctond( httpContext.cgiGet( edtDisKgsLot_Internalname)) ;
            A2833DisMtrLot = localUtil.ctond( httpContext.cgiGet( edtDisMtrLot_Internalname)) ;
            A3306DisFac = ((GXutil.strcmp(httpContext.cgiGet( chkDisFac.getInternalname()), "S")==0) ? "S" : "N") ;
            A3307DisManCod1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3308DisManCod2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3309DisNumTon = httpContext.cgiGet( edtDisNumTon_Internalname) ;
            A4720DisDishCod = httpContext.cgiGet( edtDisDishCod_Internalname) ;
            A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
            A5024DisTipEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5025DisGraCob = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisGraCob_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5031DisCom = httpContext.cgiGet( edtDisCom_Internalname) ;
            n5031DisCom = false ;
            A5032DisEstTip = ((GXutil.strcmp(httpContext.cgiGet( chkDisEstTip.getInternalname()), "S")==0) ? "S" : "*") ;
            A5290DisTipCor = httpContext.cgiGet( edtDisTipCor_Internalname) ;
            A5366DisAntp = httpContext.cgiGet( edtDisAntp_Internalname) ;
            A4614DisMdlCod = httpContext.cgiGet( edtDisMdlCod_Internalname) ;
            A4615DisTam = httpContext.cgiGet( edtDisTam_Internalname) ;
            A2402DisManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A998DisNMtr = httpContext.cgiGet( edtDisNMtr_Internalname) ;
            A4468DisPelAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPelAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4474DisLotKgs = localUtil.ctond( httpContext.cgiGet( edtDisLotKgs_Internalname)) ;
            A3841DisArtMer = localUtil.ctond( httpContext.cgiGet( edtDisArtMer_Internalname)) ;
            A4470DisCruKgs = localUtil.ctond( httpContext.cgiGet( edtDisCruKgs_Internalname)) ;
            A6547DisVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtDisVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6548DisRbMaq = localUtil.ctond( httpContext.cgiGet( edtDisRbMaq_Internalname)) ;
            A4014DisTin = ((GXutil.strcmp(httpContext.cgiGet( chkDisTin.getInternalname()), "S")==0) ? "S" : "N") ;
            A4785DisNroCor = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNroCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1901CliCtrl = ((GXutil.strcmp(httpContext.cgiGet( chkCliCtrl.getInternalname()), "S")==0) ? "S" : "N") ;
            A4477DisAcaBak = ((GXutil.strcmp(httpContext.cgiGet( chkDisAcaBak.getInternalname()), "S")==0) ? "S" : "N") ;
            A2743DisNumTex1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisNumTex1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4471DisCruEnr = httpContext.cgiGet( edtDisCruEnr_Internalname) ;
            A9771DisItem1 = httpContext.cgiGet( edtDisItem1_Internalname) ;
            A9772DisItem2 = httpContext.cgiGet( edtDisItem2_Internalname) ;
            A9773DisItem3 = httpContext.cgiGet( edtDisItem3_Internalname) ;
            A9774DisItem4 = httpContext.cgiGet( edtDisItem4_Internalname) ;
            A9787DisItem6 = httpContext.cgiGet( edtDisItem6_Internalname) ;
            A366DisEnt = httpContext.cgiGet( edtDisEnt_Internalname) ;
            A4479DisAcaMar = httpContext.cgiGet( edtDisAcaMar_Internalname) ;
            A999DisNMez = httpContext.cgiGet( edtDisNMez_Internalname) ;
            A4473DisLotMts = localUtil.ctond( httpContext.cgiGet( edtDisLotMts_Internalname)) ;
            A4469DisCruMts = localUtil.ctond( httpContext.cgiGet( edtDisCruMts_Internalname)) ;
            A10887Cod_Idtx = httpContext.cgiGet( edtCod_Idtx_Internalname) ;
            n10887Cod_Idtx = false ;
            A7523DisRec = httpContext.cgiGet( edtDisRec_Internalname) ;
            A8886DisDest = httpContext.cgiGet( edtDisDest_Internalname) ;
            A11657DisMemo1 = httpContext.cgiGet( edtDisMemo1_Internalname) ;
            A11658DisMemo2 = httpContext.cgiGet( edtDisMemo2_Internalname) ;
            A11659MarcaId = GXutil.upper( httpContext.cgiGet( edtMarcaId_Internalname)) ;
            n11659MarcaId = false ;
            A11660MarcaDsc = httpContext.cgiGet( edtMarcaDsc_Internalname) ;
            n11660MarcaDsc = false ;
            A11661DisOrdComp = httpContext.cgiGet( edtDisOrdComp_Internalname) ;
            A7739DisExp = ((GXutil.strcmp(httpContext.cgiGet( chkDisExp.getInternalname()), "E")==0) ? "E" : "N") ;
            A11859Nxt_modelo = httpContext.cgiGet( edtNxt_modelo_Internalname) ;
            A11860CpteId = (short)(localUtil.ctol( httpContext.cgiGet( edtCpteId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11860CpteId = false ;
            A11865CpteDsc = httpContext.cgiGet( edtCpteDsc_Internalname) ;
            n11865CpteDsc = false ;
            A11861Nxt_statio = httpContext.cgiGet( edtNxt_statio_Internalname) ;
            A11862DesaID = (short)(localUtil.ctol( httpContext.cgiGet( edtDesaID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11862DesaID = false ;
            A11866DesaDsc = httpContext.cgiGet( edtDesaDsc_Internalname) ;
            n11866DesaDsc = false ;
            A11863DptoID = (short)(localUtil.ctol( httpContext.cgiGet( edtDptoID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11863DptoID = false ;
            A11867DptoDsc = httpContext.cgiGet( edtDptoDsc_Internalname) ;
            n11867DptoDsc = false ;
            A11864Nxt_artcli = httpContext.cgiGet( edtNxt_artcli_Internalname) ;
            A2926DisPla = ((GXutil.strcmp(httpContext.cgiGet( chkDisPla.getInternalname()), "S")==0) ? "S" : "N") ;
            A7738DisMaqEst = httpContext.cgiGet( edtDisMaqEst_Internalname) ;
            A7513DisOrdSep = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisOrdSep.getInternalname()), "1")==0) ? 1 : 0)) ;
            A7514DisOrdGra = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisOrdGra.getInternalname()), "1")==0) ? 1 : 0)) ;
            A13737DisMaxObsL = (short)(localUtil.ctol( httpContext.cgiGet( edtDisMaxObsL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13737DisMaxObsL = false ;
            A13732DisCanRec = (short)(localUtil.ctol( httpContext.cgiGet( edtDisCanRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13732DisCanRec = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vDISFEC"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV7DisFec)) ) )
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
      e20K52 ();
      if (returnInSub) return;
   }

   public void e20K52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV80Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwnwdp02_impl.this.GXt_char1 = GXv_char4[0] ;
      AV80Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Station", AV80Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80Station, ""))));
      GXv_char4[0] = AV6EmprCod ;
      GXv_char2[0] = AV62EmprNom ;
      GXv_char6[0] = AV63UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV80Station, GXv_char4, GXv_char2, GXv_char6) ;
      webwnwdp02_impl.this.AV6EmprCod = GXv_char4[0] ;
      webwnwdp02_impl.this.AV62EmprNom = GXv_char2[0] ;
      webwnwdp02_impl.this.AV63UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV63UsurCod", AV63UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV63UsurCod, "@!"))));
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
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Entrada Pedido Cliente", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV16OrderedBy < 1 )
      {
         AV16OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV56DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV56DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV80Station ;
      GXv_char6[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      webwnwdp02_impl.this.GXt_char1 = GXv_char6[0] ;
      AV80Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Station", AV80Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80Station, ""))));
      GXv_char6[0] = AV6EmprCod ;
      GXv_char4[0] = AV62EmprNom ;
      GXv_char2[0] = AV63UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV80Station, GXv_char6, GXv_char4, GXv_char2) ;
      webwnwdp02_impl.this.AV6EmprCod = GXv_char6[0] ;
      webwnwdp02_impl.this.AV62EmprNom = GXv_char4[0] ;
      webwnwdp02_impl.this.AV63UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV63UsurCod", AV63UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV63UsurCod, "@!"))));
      GXt_int9 = (byte)(AV81Genhdm) ;
      GXv_int3[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "GENOFM", ""), GXv_int3) ;
      webwnwdp02_impl.this.GXt_int9 = GXv_int3[0] ;
      AV81Genhdm = GXt_int9 ;
      GXt_int9 = (byte)(AV82Genacc) ;
      GXv_int3[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "GENACC", ""), GXv_int3) ;
      webwnwdp02_impl.this.GXt_int9 = GXv_int3[0] ;
      AV82Genacc = GXt_int9 ;
      GXt_int9 = (byte)(AV83Detpie) ;
      GXv_int3[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "DETPIE", ""), GXv_int3) ;
      webwnwdp02_impl.this.GXt_int9 = GXv_int3[0] ;
      AV83Detpie = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83Detpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83Detpie), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDETPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV83Detpie), "ZZZ9")));
      GXt_int9 = (byte)(AV84Vertex) ;
      GXv_int3[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int3) ;
      webwnwdp02_impl.this.GXt_int9 = GXv_int3[0] ;
      AV84Vertex = GXt_int9 ;
      GXt_int9 = (byte)(AV85Tintest) ;
      GXv_int3[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int3) ;
      webwnwdp02_impl.this.GXt_int9 = GXv_int3[0] ;
      AV85Tintest = GXt_int9 ;
      GXt_int9 = (byte)(AV86Endutex) ;
      GXv_int3[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int3) ;
      webwnwdp02_impl.this.GXt_int9 = GXv_int3[0] ;
      AV86Endutex = GXt_int9 ;
      GXt_int9 = (byte)(AV87Usuariofiltro) ;
      GXv_int3[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "FTOUSU", ""), GXv_int3) ;
      webwnwdp02_impl.this.GXt_int9 = GXv_int3[0] ;
      AV87Usuariofiltro = GXt_int9 ;
      GXt_int9 = (byte)(AV88Tnwdp04) ;
      GXv_int3[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "NWDP04", ""), GXv_int3) ;
      webwnwdp02_impl.this.GXt_int9 = GXv_int3[0] ;
      AV88Tnwdp04 = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Tnwdp04", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88Tnwdp04), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTNWDP04", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV88Tnwdp04), "ZZZ9")));
      AV8pricod = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8pricod", AV8pricod);
      AV119GXLvl76 = (byte)(0) ;
      /* Using cursor H00K513 */
      pr_default.execute(3, new Object[] {AV6EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H00K513_A396EmprCod[0] ;
         A369DisFec = H00K513_A369DisFec[0] ;
         A361DisCod = H00K513_A361DisCod[0] ;
         AV119GXLvl76 = (byte)(1) ;
         AV7DisFec = A369DisFec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7DisFec", localUtil.format(AV7DisFec, "99/99/99"));
         httpContext.GX_msglist.addItem("Revisar DisCod "+GXutil.str( A361DisCod, 8, 0));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV119GXLvl76 == 0 )
      {
         /* Using cursor H00K514 */
         pr_default.execute(4, new Object[] {AV6EmprCod});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A396EmprCod = H00K514_A396EmprCod[0] ;
            A369DisFec = H00K514_A369DisFec[0] ;
            AV7DisFec = A369DisFec ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7DisFec", localUtil.format(AV7DisFec, "99/99/99"));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      AV5DisUsrcod = ((AV87Usuariofiltro==0) ? "" : AV63UsurCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5DisUsrcod", AV5DisUsrcod);
      edtDibCli_Visible = AV90Tinest ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDibInt_Visible = AV90Tinest ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Visible), 5, 0), !bGXsfl_54_Refreshing);
   }

   public void e21K52( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV10WWPContext = GXv_SdtWWPContext10[0] ;
      if ( AV29ManageFiltersExecutionStep == 1 )
      {
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV29ManageFiltersExecutionStep == 2 )
      {
         AV29ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV26Session.getValue("WebWNwDP02ColumnsSelector"), "") != 0 )
      {
         AV22ColumnsSelectorXML = AV26Session.getValue("WebWNwDP02ColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV22ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtDisCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDisFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFec_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDisArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDisArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDisColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDisNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNomCli_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDisColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNum_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDibCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDibInt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDisMaxObsL_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisMaxObsL_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisMaxObsL_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtDisCanRec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCanRec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCanRec_Visible), 5, 0), !bGXsfl_54_Refreshing);
      AV58GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridCurrentPage), 10, 0));
      AV59GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59GridPageCount), 10, 0));
      AV121Webwnwdp02ds_1_filterfulltext = AV19FilterFullText ;
      AV122Webwnwdp02ds_2_tfdiscod = AV34TFDisCod ;
      AV123Webwnwdp02ds_3_tfdiscod_to = AV35TFDisCod_To ;
      AV124Webwnwdp02ds_4_tfclicod = AV36TFCliCod ;
      AV125Webwnwdp02ds_5_tfclicod_to = AV37TFCliCod_To ;
      AV126Webwnwdp02ds_6_tfdisfec = AV38TFDisFec ;
      AV127Webwnwdp02ds_7_tfdisartcod = AV42TFDisArtCod ;
      AV128Webwnwdp02ds_8_tfdisartcod_sel = AV43TFDisArtCod_Sel ;
      AV129Webwnwdp02ds_9_tfdisartdsc = AV44TFDisArtDsc ;
      AV130Webwnwdp02ds_10_tfdisartdsc_sel = AV45TFDisArtDsc_Sel ;
      AV131Webwnwdp02ds_11_tfdiscolnom = AV46TFDisColNom ;
      AV132Webwnwdp02ds_12_tfdiscolnom_sel = AV47TFDisColNom_Sel ;
      AV133Webwnwdp02ds_13_tfdisnomcli = AV48TFDisNomCli ;
      AV134Webwnwdp02ds_14_tfdisnomcli_sel = AV49TFDisNomCli_Sel ;
      AV135Webwnwdp02ds_15_tfdiscolnum = AV50TFDisColNum ;
      AV136Webwnwdp02ds_16_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV137Webwnwdp02ds_17_tfdibcli = AV52TFDibCli ;
      AV138Webwnwdp02ds_18_tfdibcli_sel = AV53TFDibCli_Sel ;
      AV139Webwnwdp02ds_19_tfdibint = AV54TFDibInt ;
      AV140Webwnwdp02ds_20_tfdibint_to = AV55TFDibInt_To ;
      AV141Webwnwdp02ds_21_tfdismaxobslin = AV112TFDisMaxObsLin ;
      AV142Webwnwdp02ds_22_tfdismaxobslin_to = AV113TFDisMaxObsLin_To ;
      AV143Webwnwdp02ds_23_tfdiscanrec = AV114TFDisCanRec ;
      AV144Webwnwdp02ds_24_tfdiscanrec_to = AV115TFDisCanRec_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e12K52( )
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
         AV57PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV57PageToGo) ;
      }
   }

   public void e13K52( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14K52( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV16OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         AV17OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisCod") == 0 )
         {
            AV34TFDisCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFDisCod), 8, 0));
            AV35TFDisCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFDisCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
            AV37TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisFec") == 0 )
         {
            AV38TFDisFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFDisFec", localUtil.format(AV38TFDisFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtCod") == 0 )
         {
            AV42TFDisArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFDisArtCod", AV42TFDisArtCod);
            AV43TFDisArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFDisArtCod_Sel", AV43TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtDsc") == 0 )
         {
            AV44TFDisArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFDisArtDsc", AV44TFDisArtDsc);
            AV45TFDisArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFDisArtDsc_Sel", AV45TFDisArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisColNom") == 0 )
         {
            AV46TFDisColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFDisColNom", AV46TFDisColNom);
            AV47TFDisColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisColNom_Sel", AV47TFDisColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNomCli") == 0 )
         {
            AV48TFDisNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisNomCli", AV48TFDisNomCli);
            AV49TFDisNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFDisNomCli_Sel", AV49TFDisNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisColNum") == 0 )
         {
            AV50TFDisColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDisColNum), 6, 0));
            AV51TFDisColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFDisColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DibCli") == 0 )
         {
            AV52TFDibCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFDibCli", AV52TFDibCli);
            AV53TFDibCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFDibCli_Sel", AV53TFDibCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DibInt") == 0 )
         {
            AV54TFDibInt = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDibInt), 8, 0));
            AV55TFDibInt_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFDibInt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFDibInt_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisMaxObsLin") == 0 )
         {
            AV112TFDisMaxObsLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TFDisMaxObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFDisMaxObsLin), 4, 0));
            AV113TFDisMaxObsLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TFDisMaxObsLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFDisMaxObsLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisCanRec") == 0 )
         {
            AV114TFDisCanRec = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TFDisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFDisCanRec), 4, 0));
            AV115TFDisCanRec_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115TFDisCanRec_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115TFDisCanRec_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e22K52( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXv_char6[0] = AV64TipDsc ;
      GXv_int3[0] = (byte)(AV89FlagTipDis) ;
      new app.pbustdi(remoteHandle, context).execute( A396EmprCod, A2009DisTipDis, GXv_char6, GXv_int3) ;
      webwnwdp02_impl.this.AV64TipDsc = GXv_char6[0] ;
      webwnwdp02_impl.this.AV89FlagTipDis = GXv_int3[0] ;
      AV65DisEnccli = ((GXutil.strcmp(A4813DisEncCli, "")!=0) ? A4813DisEncCli : A360DisCliNum) ;
      AV66DisCod = A361DisCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66DisCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66DisCod), "ZZZZZZZ9")));
      /* Execute user subroutine: 'BARCAD' */
      S172 ();
      if (returnInSub) return;
      AV79hdr = ((AV67barcod>0) ? GXutil.str( AV67barcod, 8, 0)+"-"+GXutil.str( AV68Barcodreo, 1, 0)+AV69barcodpar : " ") ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      if ( A367DisEst >= 3 )
      {
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('link(',1),t(o(0,'EntradaPedidoCliente'),28),t(',',7),t([ 68,'Display' ],44),t(',',7),t(396,2),t(',',7),t(361,2),t(')',4) ]
            Target    : [ t('Update',23),t('Link',3) ]
            ForType   : 29
            Type      : []
         */
         /* * Property Enabled not supported in */
         /* * Property Enabled not supported in */
         /* * Property Enabled not supported in */
         /* * Property Enabled not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('0',3) ]
            Target    : [ t('Delete',23),t('Enabled',3) ]
            ForType   : 29
            Type      : []
         */
      }
      else
      {
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('link(',1),t(o(0,'EntradaPedidoCliente'),28),t(',',7),t([ 68,'Update' ],44),t(',',7),t(396,2),t(',',7),t(361,2),t(')',4) ]
            Target    : [ t('Update',23),t('Link',3) ]
            ForType   : 29
            Type      : []
         */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('link(',1),t(o(0,'EntradaPedidoCliente'),28),t(',',7),t([ 68,'Delete' ],44),t(',',7),t(396,2),t(',',7),t(361,2),t(')',4) ]
            Target    : [ t('Delete',23),t('Link',3) ]
            ForType   : 29
            Type      : []
         */
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(54) ;
      }
      sendrow_542( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_54_Refreshing )
      {
         httpContext.doAjaxLoad(54, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV116GridActions, 4, 0)) );
   }

   public void e15K52( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV22ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV24ColumnsSelector.fromJSonString(AV22ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebWNwDP02ColumnsSelector", ((GXutil.strcmp("", AV22ColumnsSelectorXML)==0) ? "" : AV24ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e11K52( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWNwDP02Filters")),GXutil.URLEncode(GXutil.rtrim(AV145Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWNwDP02Filters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV28ManageFiltersXml ;
         GXv_char6[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebWNwDP02Filters", Ddo_managefilters_Activeeventkey, GXv_char6) ;
         webwnwdp02_impl.this.GXt_char1 = GXv_char6[0] ;
         AV28ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV28ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV145Pgmname+"GridState", AV28ManageFiltersXml) ;
            AV14GridState.fromxml(AV28ManageFiltersXml, null, null);
            AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
            AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e16K52( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      if ( false )
      {
         callWebObject(formatLink("app.entradapedidocliente", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      if ( AV111ModeloSDT )
      {
         callWebObject(formatLink("app.webdatospedido", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         callWebObject(formatLink("app.entradapedidocliente", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e17K52( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char6[0] = AV20ExcelFilename ;
      GXv_char4[0] = AV21ErrorMessage ;
      new app.webwnwdp02export(remoteHandle, context).execute( GXv_char6, GXv_char4) ;
      webwnwdp02_impl.this.AV20ExcelFilename = GXv_char6[0] ;
      webwnwdp02_impl.this.AV21ErrorMessage = GXv_char4[0] ;
      if ( GXutil.strcmp(AV20ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV20ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e18K52( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.ejemploqrcode", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      if ( false )
      {
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         Innewwindow1_Target = formatLink("app.webwnwdp02exportreport", new String[] {}, new String[] {})  ;
         ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
         Innewwindow1_Height = "600" ;
         ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
         Innewwindow1_Width = "800" ;
         ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
         this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e19K52( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webwnwdp02exportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV16OrderedBy, 4, 0))+":"+(AV17OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DisCod", "", "Codigo Disposicion", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "CliCod", "", "Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DisFec", "", "Fecha Pedido", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DisArtCod", "", "Código Artículo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DisArtDsc", "", "Artículo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DisColNom", "", "Nombre Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DisNomCli", "", "Nombre Color Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DisColNum", "", "Numero Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DibCli", "", "Dibujo del Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DibInt", "", "Dibujo Interno", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DisMaxObsLin", "", "Máxima Observación", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "DisCanRec", "", "Reclamaciones", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXt_char1 = AV23UserCustomValue ;
      GXv_char6[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWNwDP02ColumnsSelector", GXv_char6) ;
      webwnwdp02_impl.this.GXt_char1 = GXv_char6[0] ;
      AV23UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV23UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV23UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector11[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector12[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, GXv_SdtWWPColumnsSelector12) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector11[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = AV27ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebWNwDP02Filters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[0] ;
      AV27ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV19FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
      AV34TFDisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFDisCod), 8, 0));
      AV35TFDisCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFDisCod_To), 8, 0));
      AV36TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
      AV37TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
      AV38TFDisFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFDisFec", localUtil.format(AV38TFDisFec, "99/99/99"));
      AV42TFDisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFDisArtCod", AV42TFDisArtCod);
      AV43TFDisArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFDisArtCod_Sel", AV43TFDisArtCod_Sel);
      AV44TFDisArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFDisArtDsc", AV44TFDisArtDsc);
      AV45TFDisArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFDisArtDsc_Sel", AV45TFDisArtDsc_Sel);
      AV46TFDisColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFDisColNom", AV46TFDisColNom);
      AV47TFDisColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisColNom_Sel", AV47TFDisColNom_Sel);
      AV48TFDisNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisNomCli", AV48TFDisNomCli);
      AV49TFDisNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFDisNomCli_Sel", AV49TFDisNomCli_Sel);
      AV50TFDisColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDisColNum), 6, 0));
      AV51TFDisColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFDisColNum_To), 6, 0));
      AV52TFDibCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFDibCli", AV52TFDibCli);
      AV53TFDibCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFDibCli_Sel", AV53TFDibCli_Sel);
      AV54TFDibInt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDibInt), 8, 0));
      AV55TFDibInt_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFDibInt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFDibInt_To), 8, 0));
      AV112TFDisMaxObsLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112TFDisMaxObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFDisMaxObsLin), 4, 0));
      AV113TFDisMaxObsLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113TFDisMaxObsLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFDisMaxObsLin_To), 4, 0));
      AV114TFDisCanRec = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114TFDisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFDisCanRec), 4, 0));
      AV115TFDisCanRec_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115TFDisCanRec_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115TFDisCanRec_To), 4, 0));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.entradapedidocliente", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.entradapedidocliente", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue(AV145Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV145Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV26Session.getValue(AV145Pgmname+"GridState"), null, null);
      }
      AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
      AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV146GXV1 = 1 ;
      while ( AV146GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV146GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV19FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV34TFDisCod = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFDisCod), 8, 0));
            AV35TFDisCod_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFDisCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
            AV37TFCliCod_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV38TFDisFec = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFDisFec", localUtil.format(AV38TFDisFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV42TFDisArtCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFDisArtCod", AV42TFDisArtCod);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV43TFDisArtCod_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFDisArtCod_Sel", AV43TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV44TFDisArtDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFDisArtDsc", AV44TFDisArtDsc);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV45TFDisArtDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFDisArtDsc_Sel", AV45TFDisArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV46TFDisColNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFDisColNom", AV46TFDisColNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV47TFDisColNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisColNom_Sel", AV47TFDisColNom_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV48TFDisNomCli = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisNomCli", AV48TFDisNomCli);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV49TFDisNomCli_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFDisNomCli_Sel", AV49TFDisNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV50TFDisColNum = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDisColNum), 6, 0));
            AV51TFDisColNum_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFDisColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBCLI") == 0 )
         {
            AV52TFDibCli = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFDibCli", AV52TFDibCli);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBCLI_SEL") == 0 )
         {
            AV53TFDibCli_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFDibCli_Sel", AV53TFDibCli_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBINT") == 0 )
         {
            AV54TFDibInt = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDibInt), 8, 0));
            AV55TFDibInt_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFDibInt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFDibInt_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISMAXOBSLIN") == 0 )
         {
            AV112TFDisMaxObsLin = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TFDisMaxObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFDisMaxObsLin), 4, 0));
            AV113TFDisMaxObsLin_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TFDisMaxObsLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFDisMaxObsLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCANREC") == 0 )
         {
            AV114TFDisCanRec = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TFDisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFDisCanRec), 4, 0));
            AV115TFDisCanRec_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115TFDisCanRec_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115TFDisCanRec_To), 4, 0));
         }
         AV146GXV1 = (int)(AV146GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char6[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFDisArtCod_Sel)==0), AV43TFDisArtCod_Sel, GXv_char6) ;
      webwnwdp02_impl.this.GXt_char1 = GXv_char6[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFDisArtDsc_Sel)==0), AV45TFDisArtDsc_Sel, GXv_char4) ;
      webwnwdp02_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char2[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFDisColNom_Sel)==0), AV47TFDisColNom_Sel, GXv_char2) ;
      webwnwdp02_impl.this.GXt_char16 = GXv_char2[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFDisNomCli_Sel)==0), AV49TFDisNomCli_Sel, GXv_char18) ;
      webwnwdp02_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFDibCli_Sel)==0), AV53TFDibCli_Sel, GXv_char20) ;
      webwnwdp02_impl.this.GXt_char19 = GXv_char20[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char15+"|"+GXt_char16+"|"+GXt_char17+"||"+GXt_char19+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFDisArtCod)==0), AV42TFDisArtCod, GXv_char20) ;
      webwnwdp02_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFDisArtDsc)==0), AV44TFDisArtDsc, GXv_char18) ;
      webwnwdp02_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char16 = "" ;
      GXv_char6[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFDisColNom)==0), AV46TFDisColNom, GXv_char6) ;
      webwnwdp02_impl.this.GXt_char16 = GXv_char6[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFDisNomCli)==0), AV48TFDisNomCli, GXv_char4) ;
      webwnwdp02_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFDibCli)==0), AV52TFDibCli, GXv_char2) ;
      webwnwdp02_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV34TFDisCod) ? "" : GXutil.str( AV34TFDisCod, 8, 0))+"|"+((0==AV36TFCliCod) ? "" : GXutil.str( AV36TFCliCod, 6, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFDisFec)) ? "" : localUtil.dtoc( AV38TFDisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char19+"|"+GXt_char17+"|"+GXt_char16+"|"+GXt_char15+"|"+((0==AV50TFDisColNum) ? "" : GXutil.str( AV50TFDisColNum, 6, 0))+"|"+GXt_char1+"|"+((0==AV54TFDibInt) ? "" : GXutil.str( AV54TFDibInt, 8, 0))+"|"+((0==AV112TFDisMaxObsLin) ? "" : GXutil.str( AV112TFDisMaxObsLin, 4, 0))+"|"+((0==AV114TFDisCanRec) ? "" : GXutil.str( AV114TFDisCanRec, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV35TFDisCod_To) ? "" : GXutil.str( AV35TFDisCod_To, 8, 0))+"|"+((0==AV37TFCliCod_To) ? "" : GXutil.str( AV37TFCliCod_To, 6, 0))+"||||||"+((0==AV51TFDisColNum_To) ? "" : GXutil.str( AV51TFDisColNum_To, 6, 0))+"||"+((0==AV55TFDibInt_To) ? "" : GXutil.str( AV55TFDibInt_To, 8, 0))+"|"+((0==AV113TFDisMaxObsLin_To) ? "" : GXutil.str( AV113TFDisMaxObsLin_To, 4, 0))+"|"+((0==AV115TFDisCanRec_To) ? "" : GXutil.str( AV115TFDisCanRec_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV26Session.getValue(AV145Pgmname+"GridState"), null, null);
      AV14GridState.setgxTv_SdtWWPGridState_Orderedby( AV16OrderedBy );
      AV14GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV17OrderedDsc );
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV19FilterFullText)==0), (short)(0), AV19FilterFullText, "") ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDISCOD", "", !((0==AV34TFDisCod)&&(0==AV35TFDisCod_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFDisCod, 8, 0)), GXutil.trim( GXutil.str( AV35TFDisCod_To, 8, 0))) ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFCLICOD", "", !((0==AV36TFCliCod)&&(0==AV37TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV37TFCliCod_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDISFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFDisFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV38TFDisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDISARTCOD", "", !(GXutil.strcmp("", AV42TFDisArtCod)==0), (short)(0), AV42TFDisArtCod, "", !(GXutil.strcmp("", AV43TFDisArtCod_Sel)==0), AV43TFDisArtCod_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDISARTDSC", "", !(GXutil.strcmp("", AV44TFDisArtDsc)==0), (short)(0), AV44TFDisArtDsc, "", !(GXutil.strcmp("", AV45TFDisArtDsc_Sel)==0), AV45TFDisArtDsc_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDISCOLNOM", "", !(GXutil.strcmp("", AV46TFDisColNom)==0), (short)(0), AV46TFDisColNom, "", !(GXutil.strcmp("", AV47TFDisColNom_Sel)==0), AV47TFDisColNom_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDISNOMCLI", "", !(GXutil.strcmp("", AV48TFDisNomCli)==0), (short)(0), AV48TFDisNomCli, "", !(GXutil.strcmp("", AV49TFDisNomCli_Sel)==0), AV49TFDisNomCli_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDISCOLNUM", "", !((0==AV50TFDisColNum)&&(0==AV51TFDisColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV50TFDisColNum, 6, 0)), GXutil.trim( GXutil.str( AV51TFDisColNum_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDIBCLI", "", !(GXutil.strcmp("", AV52TFDibCli)==0), (short)(0), AV52TFDibCli, "", !(GXutil.strcmp("", AV53TFDibCli_Sel)==0), AV53TFDibCli_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDIBINT", "", !((0==AV54TFDibInt)&&(0==AV55TFDibInt_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFDibInt, 8, 0)), GXutil.trim( GXutil.str( AV55TFDibInt_To, 8, 0))) ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDISMAXOBSLIN", "", !((0==AV112TFDisMaxObsLin)&&(0==AV113TFDisMaxObsLin_To)), (short)(0), GXutil.trim( GXutil.str( AV112TFDisMaxObsLin, 4, 0)), GXutil.trim( GXutil.str( AV113TFDisMaxObsLin_To, 4, 0))) ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDISCANREC", "", !((0==AV114TFDisCanRec)&&(0==AV115TFDisCanRec_To)), (short)(0), GXutil.trim( GXutil.str( AV114TFDisCanRec, 4, 0)), GXutil.trim( GXutil.str( AV115TFDisCanRec_To, 4, 0))) ;
      AV14GridState = GXv_SdtWWPGridState21[0] ;
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV145Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV12TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV145Pgmname );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "EntradaPedidoCliente" );
      AV26Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e23K52( )
   {
      /* 'Alta' Routine */
      returnInSub = false ;
      if ( AV83Detpie == 0 )
      {
         if ( AV88Tnwdp04 == 0 )
         {
            callWebObject(formatLink("app.tnwdp00", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "INS", "")))}, new String[] {"EmprCod","Discod","Mode"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            callWebObject(formatLink("app.tnwdp04", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "INS", "")))}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
      else
      {
         callWebObject(formatLink("app.entradapedidocliente", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e24K52( )
   {
      /* 'Baja' Routine */
      returnInSub = false ;
      if ( A367DisEst == 1 )
      {
         GXutil.Confirmed = true;
         if ( GXutil.Confirmed )
         {
            GXv_char20[0] = A396EmprCod ;
            GXv_int22[0] = A361DisCod ;
            new app.pelidis(remoteHandle, context).execute( GXv_char20, GXv_int22) ;
            webwnwdp02_impl.this.A396EmprCod = GXv_char20[0] ;
            webwnwdp02_impl.this.A361DisCod = GXv_int22[0] ;
            AV70Inc_obs = httpContext.getMessage( "Eliminacion Nº Disposicion= ", "") + GXutil.str( A361DisCod, 8, 0) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV145Pgmname, AV63UsurCod, AV80Station, AV70Inc_obs, A361DisCod, (byte)(0), " ") ;
            httpContext.doAjaxRefresh();
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pedido en Produccion", ""));
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void S172( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV67barcod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67barcod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67barcod), "ZZZZZZZ9")));
      AV68Barcodreo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Barcodreo", GXutil.str( AV68Barcodreo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Barcodreo), "9")));
      AV69barcodpar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69barcodpar", AV69barcodpar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69barcodpar, ""))));
      /* Using cursor H00K515 */
      pr_default.execute(5, new Object[] {AV6EmprCod, Integer.valueOf(AV66DisCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A361DisCod = H00K515_A361DisCod[0] ;
         A396EmprCod = H00K515_A396EmprCod[0] ;
         A129BarCod = H00K515_A129BarCod[0] ;
         A132BarCodReo = H00K515_A132BarCodReo[0] ;
         A130BarCodPar = H00K515_A130BarCodPar[0] ;
         AV67barcod = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67barcod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67barcod), "ZZZZZZZ9")));
         AV68Barcodreo = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68Barcodreo", GXutil.str( AV68Barcodreo, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Barcodreo), "9")));
         AV69barcodpar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69barcodpar", AV69barcodpar);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69barcodpar, ""))));
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void wb_table1_30_K52( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV27ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_35_K52( true) ;
      }
      else
      {
         wb_table2_35_K52( false) ;
      }
      return  ;
   }

   public void wb_table2_35_K52e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_30_K52e( true) ;
      }
      else
      {
         wb_table1_30_K52e( false) ;
      }
   }

   public void wb_table2_35_K52( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV19FilterFullText, GXutil.rtrim( localUtil.format( AV19FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebWNwDP02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_35_K52e( true) ;
      }
      else
      {
         wb_table2_35_K52e( false) ;
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
      paK52( ) ;
      wsK52( ) ;
      weK52( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415132427", true, true);
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
      httpContext.AddJavascriptSource("webwnwdp02.js", "?202682415132427", false, true);
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

   public void subsflControlProps_542( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_54_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_54_idx ;
      edtDisUsrCod_Internalname = "DISUSRCOD_"+sGXsfl_54_idx ;
      cmbDisEst.setInternalname( "DISEST_"+sGXsfl_54_idx );
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_54_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_54_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_54_idx ;
      edtDisFec_Internalname = "DISFEC_"+sGXsfl_54_idx ;
      edtDisArtCod_Internalname = "DISARTCOD_"+sGXsfl_54_idx ;
      edtDisArtDsc_Internalname = "DISARTDSC_"+sGXsfl_54_idx ;
      edtDisColNom_Internalname = "DISCOLNOM_"+sGXsfl_54_idx ;
      edtDisNomCli_Internalname = "DISNOMCLI_"+sGXsfl_54_idx ;
      edtDisColNum_Internalname = "DISCOLNUM_"+sGXsfl_54_idx ;
      edtDibCli_Internalname = "DIBCLI_"+sGXsfl_54_idx ;
      edtDibInt_Internalname = "DIBINT_"+sGXsfl_54_idx ;
      edtDisUniMed_Internalname = "DISUNIMED_"+sGXsfl_54_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_54_idx ;
      edtDisTipCol_Internalname = "DISTIPCOL_"+sGXsfl_54_idx ;
      edtDisTipCD_Internalname = "DISTIPCD_"+sGXsfl_54_idx ;
      edtDisNumCli_Internalname = "DISNUMCLI_"+sGXsfl_54_idx ;
      edtDisArtTip_Internalname = "DISARTTIP_"+sGXsfl_54_idx ;
      edtDisArtTipD_Internalname = "DISARTTIPD_"+sGXsfl_54_idx ;
      edtDisArtPt3_Internalname = "DISARTPT3_"+sGXsfl_54_idx ;
      edtDisArtTr3_Internalname = "DISARTTR3_"+sGXsfl_54_idx ;
      edtDisArtPt2_Internalname = "DISARTPT2_"+sGXsfl_54_idx ;
      edtDisArtTr2_Internalname = "DISARTTR2_"+sGXsfl_54_idx ;
      edtDisArtPt1_Internalname = "DISARTPT1_"+sGXsfl_54_idx ;
      edtDisArtTr1_Internalname = "DISARTTR1_"+sGXsfl_54_idx ;
      edtDisArtPu3_Internalname = "DISARTPU3_"+sGXsfl_54_idx ;
      edtDisArtUr3_Internalname = "DISARTUR3_"+sGXsfl_54_idx ;
      edtDisArtPu2_Internalname = "DISARTPU2_"+sGXsfl_54_idx ;
      edtDisArtUr2_Internalname = "DISARTUR2_"+sGXsfl_54_idx ;
      edtDisArtPu1_Internalname = "DISARTPU1_"+sGXsfl_54_idx ;
      edtDisArtUr1_Internalname = "DISARTUR1_"+sGXsfl_54_idx ;
      edtDisArtMat_Internalname = "DISARTMAT_"+sGXsfl_54_idx ;
      edtDisArtPle_Internalname = "DISARTPLE_"+sGXsfl_54_idx ;
      edtDisPle2_Internalname = "DISPLE2_"+sGXsfl_54_idx ;
      edtDisArtLar_Internalname = "DISARTLAR_"+sGXsfl_54_idx ;
      edtDisArtSua_Internalname = "DISARTSUA_"+sGXsfl_54_idx ;
      edtDisArtAca_Internalname = "DISARTACA_"+sGXsfl_54_idx ;
      chkDisArtEnc.setInternalname( "DISARTENC_"+sGXsfl_54_idx );
      chkDisArtCor.setInternalname( "DISARTCOR_"+sGXsfl_54_idx );
      edtDisArtPes_Internalname = "DISARTPES_"+sGXsfl_54_idx ;
      edtDisArtRdt_Internalname = "DISARTRDT_"+sGXsfl_54_idx ;
      edtDisArtUrg_Internalname = "DISARTURG_"+sGXsfl_54_idx ;
      edtDisGraCru_Internalname = "DISGRACRU_"+sGXsfl_54_idx ;
      edtDisArtAnh_Internalname = "DISARTANH_"+sGXsfl_54_idx ;
      edtDisArtAn1_Internalname = "DISARTAN1_"+sGXsfl_54_idx ;
      edtDisArtAcb_Internalname = "DISARTACB_"+sGXsfl_54_idx ;
      edtDisArtAc2_Internalname = "DISARTAC2_"+sGXsfl_54_idx ;
      edtDisEncCom_Internalname = "DISENCCOM_"+sGXsfl_54_idx ;
      edtDisEncAnh_Internalname = "DISENCANH_"+sGXsfl_54_idx ;
      edtDisNumCor_Internalname = "DISNUMCOR_"+sGXsfl_54_idx ;
      edtDisAncSal1_Internalname = "DISANCSAL1_"+sGXsfl_54_idx ;
      edtDisAncSal2_Internalname = "DISANCSAL2_"+sGXsfl_54_idx ;
      edtDisAncSal3_Internalname = "DISANCSAL3_"+sGXsfl_54_idx ;
      edtDisGraAca2_Internalname = "DISGRAACA2_"+sGXsfl_54_idx ;
      edtDisGraCru2_Internalname = "DISGRACRU2_"+sGXsfl_54_idx ;
      edtDisGraAca_Internalname = "DISGRAACA_"+sGXsfl_54_idx ;
      edtDisRdoA_Internalname = "DISRDOA_"+sGXsfl_54_idx ;
      edtDisRdoN_Internalname = "DISRDON_"+sGXsfl_54_idx ;
      edtDisObsGrm_Internalname = "DISOBSGRM_"+sGXsfl_54_idx ;
      edtDisObsAnc_Internalname = "DISOBSANC_"+sGXsfl_54_idx ;
      edtDisItem5_Internalname = "DISITEM5_"+sGXsfl_54_idx ;
      edtDisTipDis_Internalname = "DISTIPDIS_"+sGXsfl_54_idx ;
      edtDisCliDes_Internalname = "DISCLIDES_"+sGXsfl_54_idx ;
      edtDisCnoEncO_Internalname = "DISCNOENCO_"+sGXsfl_54_idx ;
      edtDisObs_Internalname = "DISOBS_"+sGXsfl_54_idx ;
      edtDisAcaAnh_Internalname = "DISACAANH_"+sGXsfl_54_idx ;
      edtTb1_Dscf_Internalname = "TB1_DSCF_"+sGXsfl_54_idx ;
      edtFindCol_Internalname = "FINDCOL_"+sGXsfl_54_idx ;
      edtDisLoc_Internalname = "DISLOC_"+sGXsfl_54_idx ;
      edtDisArtOpe_Internalname = "DISARTOPE_"+sGXsfl_54_idx ;
      chkDisAcc.setInternalname( "DISACC_"+sGXsfl_54_idx );
      edtDisAntpT_Internalname = "DISANTPT_"+sGXsfl_54_idx ;
      edtDisNumUni_Internalname = "DISNUMUNI_"+sGXsfl_54_idx ;
      edtDisNumPie_Internalname = "DISNUMPIE_"+sGXsfl_54_idx ;
      edtMaqCodDis_Internalname = "MAQCODDIS_"+sGXsfl_54_idx ;
      edtDisFecEnt_Internalname = "DISFECENT_"+sGXsfl_54_idx ;
      edtDisFecCli_Internalname = "DISFECCLI_"+sGXsfl_54_idx ;
      edtDisEncCli_Internalname = "DISENCCLI_"+sGXsfl_54_idx ;
      edtDisCliNum_Internalname = "DISCLINUM_"+sGXsfl_54_idx ;
      chkPriCod.setInternalname( "PRICOD_"+sGXsfl_54_idx );
      edtDisPiePie_Internalname = "DISPIEPIE_"+sGXsfl_54_idx ;
      edtDisPieMtr_Internalname = "DISPIEMTR_"+sGXsfl_54_idx ;
      edtDisPieKgm_Internalname = "DISPIEKGM_"+sGXsfl_54_idx ;
      edtDisPreKgm_Internalname = "DISPREKGM_"+sGXsfl_54_idx ;
      edtDisPreMtr_Internalname = "DISPREMTR_"+sGXsfl_54_idx ;
      edtDisPieLan_Internalname = "DISPIELAN_"+sGXsfl_54_idx ;
      edtDisKgmLan_Internalname = "DISKGMLAN_"+sGXsfl_54_idx ;
      edtDisMtrLan_Internalname = "DISMTRLAN_"+sGXsfl_54_idx ;
      edtEmprCodDis_Internalname = "EMPRCODDIS_"+sGXsfl_54_idx ;
      edtCliCodDis_Internalname = "CLICODDIS_"+sGXsfl_54_idx ;
      edtDisPie_Internalname = "DISPIE_"+sGXsfl_54_idx ;
      edtDisUni_Internalname = "DISUNI_"+sGXsfl_54_idx ;
      edtDisPieNor_Internalname = "DISPIENOR_"+sGXsfl_54_idx ;
      edtDisPart_Internalname = "DISPART_"+sGXsfl_54_idx ;
      edtDisNumLot_Internalname = "DISNUMLOT_"+sGXsfl_54_idx ;
      edtDisKgsLot_Internalname = "DISKGSLOT_"+sGXsfl_54_idx ;
      edtDisMtrLot_Internalname = "DISMTRLOT_"+sGXsfl_54_idx ;
      chkDisFac.setInternalname( "DISFAC_"+sGXsfl_54_idx );
      edtDisManCod1_Internalname = "DISMANCOD1_"+sGXsfl_54_idx ;
      edtDisManCod2_Internalname = "DISMANCOD2_"+sGXsfl_54_idx ;
      edtDisNumTon_Internalname = "DISNUMTON_"+sGXsfl_54_idx ;
      edtDisDishCod_Internalname = "DISDISHCOD_"+sGXsfl_54_idx ;
      chkDisDes.setInternalname( "DISDES_"+sGXsfl_54_idx );
      edtDisTipEst_Internalname = "DISTIPEST_"+sGXsfl_54_idx ;
      edtDisGraCob_Internalname = "DISGRACOB_"+sGXsfl_54_idx ;
      edtDisCom_Internalname = "DISCOM_"+sGXsfl_54_idx ;
      chkDisEstTip.setInternalname( "DISESTTIP_"+sGXsfl_54_idx );
      edtDisTipCor_Internalname = "DISTIPCOR_"+sGXsfl_54_idx ;
      edtDisAntp_Internalname = "DISANTP_"+sGXsfl_54_idx ;
      edtDisMdlCod_Internalname = "DISMDLCOD_"+sGXsfl_54_idx ;
      edtDisTam_Internalname = "DISTAM_"+sGXsfl_54_idx ;
      edtDisManCod_Internalname = "DISMANCOD_"+sGXsfl_54_idx ;
      edtDisNMtr_Internalname = "DISNMTR_"+sGXsfl_54_idx ;
      edtDisPelAnh_Internalname = "DISPELANH_"+sGXsfl_54_idx ;
      edtDisLotKgs_Internalname = "DISLOTKGS_"+sGXsfl_54_idx ;
      edtDisArtMer_Internalname = "DISARTMER_"+sGXsfl_54_idx ;
      edtDisCruKgs_Internalname = "DISCRUKGS_"+sGXsfl_54_idx ;
      edtDisVolMaq_Internalname = "DISVOLMAQ_"+sGXsfl_54_idx ;
      edtDisRbMaq_Internalname = "DISRBMAQ_"+sGXsfl_54_idx ;
      chkDisTin.setInternalname( "DISTIN_"+sGXsfl_54_idx );
      edtDisNroCor_Internalname = "DISNROCOR_"+sGXsfl_54_idx ;
      chkCliCtrl.setInternalname( "CLICTRL_"+sGXsfl_54_idx );
      chkDisAcaBak.setInternalname( "DISACABAK_"+sGXsfl_54_idx );
      edtDisNumTex1_Internalname = "DISNUMTEX1_"+sGXsfl_54_idx ;
      edtDisCruEnr_Internalname = "DISCRUENR_"+sGXsfl_54_idx ;
      edtDisItem1_Internalname = "DISITEM1_"+sGXsfl_54_idx ;
      edtDisItem2_Internalname = "DISITEM2_"+sGXsfl_54_idx ;
      edtDisItem3_Internalname = "DISITEM3_"+sGXsfl_54_idx ;
      edtDisItem4_Internalname = "DISITEM4_"+sGXsfl_54_idx ;
      edtDisItem6_Internalname = "DISITEM6_"+sGXsfl_54_idx ;
      edtDisEnt_Internalname = "DISENT_"+sGXsfl_54_idx ;
      edtDisAcaMar_Internalname = "DISACAMAR_"+sGXsfl_54_idx ;
      edtDisNMez_Internalname = "DISNMEZ_"+sGXsfl_54_idx ;
      edtDisLotMts_Internalname = "DISLOTMTS_"+sGXsfl_54_idx ;
      edtDisCruMts_Internalname = "DISCRUMTS_"+sGXsfl_54_idx ;
      edtCod_Idtx_Internalname = "COD_IDTX_"+sGXsfl_54_idx ;
      edtDisRec_Internalname = "DISREC_"+sGXsfl_54_idx ;
      edtDisDest_Internalname = "DISDEST_"+sGXsfl_54_idx ;
      edtDisMemo1_Internalname = "DISMEMO1_"+sGXsfl_54_idx ;
      edtDisMemo2_Internalname = "DISMEMO2_"+sGXsfl_54_idx ;
      edtMarcaId_Internalname = "MARCAID_"+sGXsfl_54_idx ;
      edtMarcaDsc_Internalname = "MARCADSC_"+sGXsfl_54_idx ;
      edtDisOrdComp_Internalname = "DISORDCOMP_"+sGXsfl_54_idx ;
      chkDisExp.setInternalname( "DISEXP_"+sGXsfl_54_idx );
      edtNxt_modelo_Internalname = "NXT_MODELO_"+sGXsfl_54_idx ;
      edtCpteId_Internalname = "CPTEID_"+sGXsfl_54_idx ;
      edtCpteDsc_Internalname = "CPTEDSC_"+sGXsfl_54_idx ;
      edtNxt_statio_Internalname = "NXT_STATIO_"+sGXsfl_54_idx ;
      edtDesaID_Internalname = "DESAID_"+sGXsfl_54_idx ;
      edtDesaDsc_Internalname = "DESADSC_"+sGXsfl_54_idx ;
      edtDptoID_Internalname = "DPTOID_"+sGXsfl_54_idx ;
      edtDptoDsc_Internalname = "DPTODSC_"+sGXsfl_54_idx ;
      edtNxt_artcli_Internalname = "NXT_ARTCLI_"+sGXsfl_54_idx ;
      chkDisPla.setInternalname( "DISPLA_"+sGXsfl_54_idx );
      edtDisMaqEst_Internalname = "DISMAQEST_"+sGXsfl_54_idx ;
      chkDisOrdSep.setInternalname( "DISORDSEP_"+sGXsfl_54_idx );
      chkDisOrdGra.setInternalname( "DISORDGRA_"+sGXsfl_54_idx );
      edtDisMaxObsL_Internalname = "DISMAXOBSL_"+sGXsfl_54_idx ;
      edtDisCanRec_Internalname = "DISCANREC_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_542( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_54_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_54_fel_idx ;
      edtDisUsrCod_Internalname = "DISUSRCOD_"+sGXsfl_54_fel_idx ;
      cmbDisEst.setInternalname( "DISEST_"+sGXsfl_54_fel_idx );
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_54_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_54_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_54_fel_idx ;
      edtDisFec_Internalname = "DISFEC_"+sGXsfl_54_fel_idx ;
      edtDisArtCod_Internalname = "DISARTCOD_"+sGXsfl_54_fel_idx ;
      edtDisArtDsc_Internalname = "DISARTDSC_"+sGXsfl_54_fel_idx ;
      edtDisColNom_Internalname = "DISCOLNOM_"+sGXsfl_54_fel_idx ;
      edtDisNomCli_Internalname = "DISNOMCLI_"+sGXsfl_54_fel_idx ;
      edtDisColNum_Internalname = "DISCOLNUM_"+sGXsfl_54_fel_idx ;
      edtDibCli_Internalname = "DIBCLI_"+sGXsfl_54_fel_idx ;
      edtDibInt_Internalname = "DIBINT_"+sGXsfl_54_fel_idx ;
      edtDisUniMed_Internalname = "DISUNIMED_"+sGXsfl_54_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_54_fel_idx ;
      edtDisTipCol_Internalname = "DISTIPCOL_"+sGXsfl_54_fel_idx ;
      edtDisTipCD_Internalname = "DISTIPCD_"+sGXsfl_54_fel_idx ;
      edtDisNumCli_Internalname = "DISNUMCLI_"+sGXsfl_54_fel_idx ;
      edtDisArtTip_Internalname = "DISARTTIP_"+sGXsfl_54_fel_idx ;
      edtDisArtTipD_Internalname = "DISARTTIPD_"+sGXsfl_54_fel_idx ;
      edtDisArtPt3_Internalname = "DISARTPT3_"+sGXsfl_54_fel_idx ;
      edtDisArtTr3_Internalname = "DISARTTR3_"+sGXsfl_54_fel_idx ;
      edtDisArtPt2_Internalname = "DISARTPT2_"+sGXsfl_54_fel_idx ;
      edtDisArtTr2_Internalname = "DISARTTR2_"+sGXsfl_54_fel_idx ;
      edtDisArtPt1_Internalname = "DISARTPT1_"+sGXsfl_54_fel_idx ;
      edtDisArtTr1_Internalname = "DISARTTR1_"+sGXsfl_54_fel_idx ;
      edtDisArtPu3_Internalname = "DISARTPU3_"+sGXsfl_54_fel_idx ;
      edtDisArtUr3_Internalname = "DISARTUR3_"+sGXsfl_54_fel_idx ;
      edtDisArtPu2_Internalname = "DISARTPU2_"+sGXsfl_54_fel_idx ;
      edtDisArtUr2_Internalname = "DISARTUR2_"+sGXsfl_54_fel_idx ;
      edtDisArtPu1_Internalname = "DISARTPU1_"+sGXsfl_54_fel_idx ;
      edtDisArtUr1_Internalname = "DISARTUR1_"+sGXsfl_54_fel_idx ;
      edtDisArtMat_Internalname = "DISARTMAT_"+sGXsfl_54_fel_idx ;
      edtDisArtPle_Internalname = "DISARTPLE_"+sGXsfl_54_fel_idx ;
      edtDisPle2_Internalname = "DISPLE2_"+sGXsfl_54_fel_idx ;
      edtDisArtLar_Internalname = "DISARTLAR_"+sGXsfl_54_fel_idx ;
      edtDisArtSua_Internalname = "DISARTSUA_"+sGXsfl_54_fel_idx ;
      edtDisArtAca_Internalname = "DISARTACA_"+sGXsfl_54_fel_idx ;
      chkDisArtEnc.setInternalname( "DISARTENC_"+sGXsfl_54_fel_idx );
      chkDisArtCor.setInternalname( "DISARTCOR_"+sGXsfl_54_fel_idx );
      edtDisArtPes_Internalname = "DISARTPES_"+sGXsfl_54_fel_idx ;
      edtDisArtRdt_Internalname = "DISARTRDT_"+sGXsfl_54_fel_idx ;
      edtDisArtUrg_Internalname = "DISARTURG_"+sGXsfl_54_fel_idx ;
      edtDisGraCru_Internalname = "DISGRACRU_"+sGXsfl_54_fel_idx ;
      edtDisArtAnh_Internalname = "DISARTANH_"+sGXsfl_54_fel_idx ;
      edtDisArtAn1_Internalname = "DISARTAN1_"+sGXsfl_54_fel_idx ;
      edtDisArtAcb_Internalname = "DISARTACB_"+sGXsfl_54_fel_idx ;
      edtDisArtAc2_Internalname = "DISARTAC2_"+sGXsfl_54_fel_idx ;
      edtDisEncCom_Internalname = "DISENCCOM_"+sGXsfl_54_fel_idx ;
      edtDisEncAnh_Internalname = "DISENCANH_"+sGXsfl_54_fel_idx ;
      edtDisNumCor_Internalname = "DISNUMCOR_"+sGXsfl_54_fel_idx ;
      edtDisAncSal1_Internalname = "DISANCSAL1_"+sGXsfl_54_fel_idx ;
      edtDisAncSal2_Internalname = "DISANCSAL2_"+sGXsfl_54_fel_idx ;
      edtDisAncSal3_Internalname = "DISANCSAL3_"+sGXsfl_54_fel_idx ;
      edtDisGraAca2_Internalname = "DISGRAACA2_"+sGXsfl_54_fel_idx ;
      edtDisGraCru2_Internalname = "DISGRACRU2_"+sGXsfl_54_fel_idx ;
      edtDisGraAca_Internalname = "DISGRAACA_"+sGXsfl_54_fel_idx ;
      edtDisRdoA_Internalname = "DISRDOA_"+sGXsfl_54_fel_idx ;
      edtDisRdoN_Internalname = "DISRDON_"+sGXsfl_54_fel_idx ;
      edtDisObsGrm_Internalname = "DISOBSGRM_"+sGXsfl_54_fel_idx ;
      edtDisObsAnc_Internalname = "DISOBSANC_"+sGXsfl_54_fel_idx ;
      edtDisItem5_Internalname = "DISITEM5_"+sGXsfl_54_fel_idx ;
      edtDisTipDis_Internalname = "DISTIPDIS_"+sGXsfl_54_fel_idx ;
      edtDisCliDes_Internalname = "DISCLIDES_"+sGXsfl_54_fel_idx ;
      edtDisCnoEncO_Internalname = "DISCNOENCO_"+sGXsfl_54_fel_idx ;
      edtDisObs_Internalname = "DISOBS_"+sGXsfl_54_fel_idx ;
      edtDisAcaAnh_Internalname = "DISACAANH_"+sGXsfl_54_fel_idx ;
      edtTb1_Dscf_Internalname = "TB1_DSCF_"+sGXsfl_54_fel_idx ;
      edtFindCol_Internalname = "FINDCOL_"+sGXsfl_54_fel_idx ;
      edtDisLoc_Internalname = "DISLOC_"+sGXsfl_54_fel_idx ;
      edtDisArtOpe_Internalname = "DISARTOPE_"+sGXsfl_54_fel_idx ;
      chkDisAcc.setInternalname( "DISACC_"+sGXsfl_54_fel_idx );
      edtDisAntpT_Internalname = "DISANTPT_"+sGXsfl_54_fel_idx ;
      edtDisNumUni_Internalname = "DISNUMUNI_"+sGXsfl_54_fel_idx ;
      edtDisNumPie_Internalname = "DISNUMPIE_"+sGXsfl_54_fel_idx ;
      edtMaqCodDis_Internalname = "MAQCODDIS_"+sGXsfl_54_fel_idx ;
      edtDisFecEnt_Internalname = "DISFECENT_"+sGXsfl_54_fel_idx ;
      edtDisFecCli_Internalname = "DISFECCLI_"+sGXsfl_54_fel_idx ;
      edtDisEncCli_Internalname = "DISENCCLI_"+sGXsfl_54_fel_idx ;
      edtDisCliNum_Internalname = "DISCLINUM_"+sGXsfl_54_fel_idx ;
      chkPriCod.setInternalname( "PRICOD_"+sGXsfl_54_fel_idx );
      edtDisPiePie_Internalname = "DISPIEPIE_"+sGXsfl_54_fel_idx ;
      edtDisPieMtr_Internalname = "DISPIEMTR_"+sGXsfl_54_fel_idx ;
      edtDisPieKgm_Internalname = "DISPIEKGM_"+sGXsfl_54_fel_idx ;
      edtDisPreKgm_Internalname = "DISPREKGM_"+sGXsfl_54_fel_idx ;
      edtDisPreMtr_Internalname = "DISPREMTR_"+sGXsfl_54_fel_idx ;
      edtDisPieLan_Internalname = "DISPIELAN_"+sGXsfl_54_fel_idx ;
      edtDisKgmLan_Internalname = "DISKGMLAN_"+sGXsfl_54_fel_idx ;
      edtDisMtrLan_Internalname = "DISMTRLAN_"+sGXsfl_54_fel_idx ;
      edtEmprCodDis_Internalname = "EMPRCODDIS_"+sGXsfl_54_fel_idx ;
      edtCliCodDis_Internalname = "CLICODDIS_"+sGXsfl_54_fel_idx ;
      edtDisPie_Internalname = "DISPIE_"+sGXsfl_54_fel_idx ;
      edtDisUni_Internalname = "DISUNI_"+sGXsfl_54_fel_idx ;
      edtDisPieNor_Internalname = "DISPIENOR_"+sGXsfl_54_fel_idx ;
      edtDisPart_Internalname = "DISPART_"+sGXsfl_54_fel_idx ;
      edtDisNumLot_Internalname = "DISNUMLOT_"+sGXsfl_54_fel_idx ;
      edtDisKgsLot_Internalname = "DISKGSLOT_"+sGXsfl_54_fel_idx ;
      edtDisMtrLot_Internalname = "DISMTRLOT_"+sGXsfl_54_fel_idx ;
      chkDisFac.setInternalname( "DISFAC_"+sGXsfl_54_fel_idx );
      edtDisManCod1_Internalname = "DISMANCOD1_"+sGXsfl_54_fel_idx ;
      edtDisManCod2_Internalname = "DISMANCOD2_"+sGXsfl_54_fel_idx ;
      edtDisNumTon_Internalname = "DISNUMTON_"+sGXsfl_54_fel_idx ;
      edtDisDishCod_Internalname = "DISDISHCOD_"+sGXsfl_54_fel_idx ;
      chkDisDes.setInternalname( "DISDES_"+sGXsfl_54_fel_idx );
      edtDisTipEst_Internalname = "DISTIPEST_"+sGXsfl_54_fel_idx ;
      edtDisGraCob_Internalname = "DISGRACOB_"+sGXsfl_54_fel_idx ;
      edtDisCom_Internalname = "DISCOM_"+sGXsfl_54_fel_idx ;
      chkDisEstTip.setInternalname( "DISESTTIP_"+sGXsfl_54_fel_idx );
      edtDisTipCor_Internalname = "DISTIPCOR_"+sGXsfl_54_fel_idx ;
      edtDisAntp_Internalname = "DISANTP_"+sGXsfl_54_fel_idx ;
      edtDisMdlCod_Internalname = "DISMDLCOD_"+sGXsfl_54_fel_idx ;
      edtDisTam_Internalname = "DISTAM_"+sGXsfl_54_fel_idx ;
      edtDisManCod_Internalname = "DISMANCOD_"+sGXsfl_54_fel_idx ;
      edtDisNMtr_Internalname = "DISNMTR_"+sGXsfl_54_fel_idx ;
      edtDisPelAnh_Internalname = "DISPELANH_"+sGXsfl_54_fel_idx ;
      edtDisLotKgs_Internalname = "DISLOTKGS_"+sGXsfl_54_fel_idx ;
      edtDisArtMer_Internalname = "DISARTMER_"+sGXsfl_54_fel_idx ;
      edtDisCruKgs_Internalname = "DISCRUKGS_"+sGXsfl_54_fel_idx ;
      edtDisVolMaq_Internalname = "DISVOLMAQ_"+sGXsfl_54_fel_idx ;
      edtDisRbMaq_Internalname = "DISRBMAQ_"+sGXsfl_54_fel_idx ;
      chkDisTin.setInternalname( "DISTIN_"+sGXsfl_54_fel_idx );
      edtDisNroCor_Internalname = "DISNROCOR_"+sGXsfl_54_fel_idx ;
      chkCliCtrl.setInternalname( "CLICTRL_"+sGXsfl_54_fel_idx );
      chkDisAcaBak.setInternalname( "DISACABAK_"+sGXsfl_54_fel_idx );
      edtDisNumTex1_Internalname = "DISNUMTEX1_"+sGXsfl_54_fel_idx ;
      edtDisCruEnr_Internalname = "DISCRUENR_"+sGXsfl_54_fel_idx ;
      edtDisItem1_Internalname = "DISITEM1_"+sGXsfl_54_fel_idx ;
      edtDisItem2_Internalname = "DISITEM2_"+sGXsfl_54_fel_idx ;
      edtDisItem3_Internalname = "DISITEM3_"+sGXsfl_54_fel_idx ;
      edtDisItem4_Internalname = "DISITEM4_"+sGXsfl_54_fel_idx ;
      edtDisItem6_Internalname = "DISITEM6_"+sGXsfl_54_fel_idx ;
      edtDisEnt_Internalname = "DISENT_"+sGXsfl_54_fel_idx ;
      edtDisAcaMar_Internalname = "DISACAMAR_"+sGXsfl_54_fel_idx ;
      edtDisNMez_Internalname = "DISNMEZ_"+sGXsfl_54_fel_idx ;
      edtDisLotMts_Internalname = "DISLOTMTS_"+sGXsfl_54_fel_idx ;
      edtDisCruMts_Internalname = "DISCRUMTS_"+sGXsfl_54_fel_idx ;
      edtCod_Idtx_Internalname = "COD_IDTX_"+sGXsfl_54_fel_idx ;
      edtDisRec_Internalname = "DISREC_"+sGXsfl_54_fel_idx ;
      edtDisDest_Internalname = "DISDEST_"+sGXsfl_54_fel_idx ;
      edtDisMemo1_Internalname = "DISMEMO1_"+sGXsfl_54_fel_idx ;
      edtDisMemo2_Internalname = "DISMEMO2_"+sGXsfl_54_fel_idx ;
      edtMarcaId_Internalname = "MARCAID_"+sGXsfl_54_fel_idx ;
      edtMarcaDsc_Internalname = "MARCADSC_"+sGXsfl_54_fel_idx ;
      edtDisOrdComp_Internalname = "DISORDCOMP_"+sGXsfl_54_fel_idx ;
      chkDisExp.setInternalname( "DISEXP_"+sGXsfl_54_fel_idx );
      edtNxt_modelo_Internalname = "NXT_MODELO_"+sGXsfl_54_fel_idx ;
      edtCpteId_Internalname = "CPTEID_"+sGXsfl_54_fel_idx ;
      edtCpteDsc_Internalname = "CPTEDSC_"+sGXsfl_54_fel_idx ;
      edtNxt_statio_Internalname = "NXT_STATIO_"+sGXsfl_54_fel_idx ;
      edtDesaID_Internalname = "DESAID_"+sGXsfl_54_fel_idx ;
      edtDesaDsc_Internalname = "DESADSC_"+sGXsfl_54_fel_idx ;
      edtDptoID_Internalname = "DPTOID_"+sGXsfl_54_fel_idx ;
      edtDptoDsc_Internalname = "DPTODSC_"+sGXsfl_54_fel_idx ;
      edtNxt_artcli_Internalname = "NXT_ARTCLI_"+sGXsfl_54_fel_idx ;
      chkDisPla.setInternalname( "DISPLA_"+sGXsfl_54_fel_idx );
      edtDisMaqEst_Internalname = "DISMAQEST_"+sGXsfl_54_fel_idx ;
      chkDisOrdSep.setInternalname( "DISORDSEP_"+sGXsfl_54_fel_idx );
      chkDisOrdGra.setInternalname( "DISORDGRA_"+sGXsfl_54_fel_idx );
      edtDisMaxObsL_Internalname = "DISMAXOBSL_"+sGXsfl_54_fel_idx ;
      edtDisCanRec_Internalname = "DISCANREC_"+sGXsfl_54_fel_idx ;
   }

   public void sendrow_542( )
   {
      subsflControlProps_542( ) ;
      wbK50( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_54_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_54_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'',false,'"+sGXsfl_54_idx+"',54)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_54_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV116GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV116GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV116GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e25k52_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,55);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV116GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_54_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUsrCod_Internalname,GXutil.rtrim( A4348DisUsrCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisUsrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbDisEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DISEST_" + sGXsfl_54_idx ;
            cmbDisEst.setName( GXCCtl );
            cmbDisEst.setWebtags( "" );
            cmbDisEst.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
            cmbDisEst.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
            if ( cmbDisEst.getItemCount() > 0 )
            {
               A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDisEst,cmbDisEst.getInternalname(),GXutil.trim( GXutil.str( A367DisEst, 1, 0)),Integer.valueOf(1),cmbDisEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), !bGXsfl_54_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFec_Internalname,localUtil.format(A369DisFec, "99/99/99"),localUtil.format( A369DisFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtCod_Internalname,GXutil.rtrim( A335DisArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtDsc_Internalname,GXutil.rtrim( A337DisArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisColNom_Internalname,GXutil.rtrim( A362DisColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNomCli_Internalname,GXutil.rtrim( A1195DisNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDibCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibCli_Internalname,GXutil.rtrim( A1013DibCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDibCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDibInt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibInt_Internalname,GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibInt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDibInt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUniMed_Internalname,GXutil.rtrim( A392DisUniMed),GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTipCD_Internalname,GXutil.rtrim( A12116DisTipCD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisTipCD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1196DisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtTip_Internalname,GXutil.ltrim( localUtil.ntoc( A352DisArtTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtTipD_Internalname,GXutil.rtrim( A12115DisArtTipD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtTipD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtPt3_Internalname,GXutil.ltrim( localUtil.ntoc( A346DisArtPt3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtPt3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtTr3_Internalname,GXutil.rtrim( A355DisArtTr3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtTr3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtPt2_Internalname,GXutil.ltrim( localUtil.ntoc( A345DisArtPt2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtPt2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtTr2_Internalname,GXutil.rtrim( A354DisArtTr2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtTr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtPt1_Internalname,GXutil.ltrim( localUtil.ntoc( A344DisArtPt1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtPt1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtTr1_Internalname,GXutil.rtrim( A353DisArtTr1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtTr1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtPu3_Internalname,GXutil.ltrim( localUtil.ntoc( A349DisArtPu3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A349DisArtPu3), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtPu3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtUr3_Internalname,GXutil.rtrim( A358DisArtUr3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtUr3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtPu2_Internalname,GXutil.ltrim( localUtil.ntoc( A348DisArtPu2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A348DisArtPu2), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtPu2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtUr2_Internalname,GXutil.rtrim( A357DisArtUr2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtUr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtPu1_Internalname,GXutil.ltrim( localUtil.ntoc( A347DisArtPu1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A347DisArtPu1), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtPu1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtUr1_Internalname,GXutil.rtrim( A356DisArtUr1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtUr1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtMat_Internalname,GXutil.rtrim( A340DisArtMat),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtMat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtPle_Internalname,GXutil.rtrim( A343DisArtPle),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtPle_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPle2_Internalname,GXutil.rtrim( A2835DisPle2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPle2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtLar_Internalname,GXutil.rtrim( A339DisArtLar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtLar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtSua_Internalname,GXutil.rtrim( A351DisArtSua),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtSua_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtAca_Internalname,GXutil.rtrim( A333DisArtAca),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISARTENC_" + sGXsfl_54_idx ;
         chkDisArtEnc.setName( GXCCtl );
         chkDisArtEnc.setWebtags( "" );
         chkDisArtEnc.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkDisArtEnc.getInternalname(), "TitleCaption", chkDisArtEnc.getCaption(), !bGXsfl_54_Refreshing);
         chkDisArtEnc.setCheckedValue( "N" );
         A338DisArtEnc = ((GXutil.strcmp(GXutil.rtrim( A338DisArtEnc), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisArtEnc.getInternalname(),A338DisArtEnc,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISARTCOR_" + sGXsfl_54_idx ;
         chkDisArtCor.setName( GXCCtl );
         chkDisArtCor.setWebtags( "" );
         chkDisArtCor.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkDisArtCor.getInternalname(), "TitleCaption", chkDisArtCor.getCaption(), !bGXsfl_54_Refreshing);
         chkDisArtCor.setCheckedValue( "N" );
         A336DisArtCor = ((GXutil.strcmp(GXutil.rtrim( A336DisArtCor), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisArtCor.getInternalname(),A336DisArtCor,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtPes_Internalname,GXutil.ltrim( localUtil.ntoc( A342DisArtPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A342DisArtPes), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtPes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtRdt_Internalname,GXutil.ltrim( localUtil.ntoc( A350DisArtRdt, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A350DisArtRdt, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtRdt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtUrg_Internalname,GXutil.ltrim( localUtil.ntoc( A359DisArtUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A359DisArtUrg), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtUrg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisGraCru_Internalname,GXutil.ltrim( localUtil.ntoc( A1225DisGraCru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1225DisGraCru), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisGraCru_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A334DisArtAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtAn1_Internalname,GXutil.ltrim( localUtil.ntoc( A1231DisArtAn1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1231DisArtAn1), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtAn1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtAcb_Internalname,GXutil.ltrim( localUtil.ntoc( A1232DisArtAcb, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtAcb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtAc2_Internalname,GXutil.ltrim( localUtil.ntoc( A1233DisArtAc2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1233DisArtAc2), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtAc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisEncCom_Internalname,GXutil.ltrim( localUtil.ntoc( A1197DisEncCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1197DisEncCom, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisEncCom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisEncAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A1198DisEncAnh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1198DisEncAnh, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisEncAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumCor_Internalname,GXutil.ltrim( localUtil.ntoc( A3127DisNumCor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3127DisNumCor), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumCor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisAncSal1_Internalname,GXutil.ltrim( localUtil.ntoc( A3128DisAncSal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3128DisAncSal1), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisAncSal1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisAncSal2_Internalname,GXutil.ltrim( localUtil.ntoc( A3129DisAncSal2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3129DisAncSal2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisAncSal2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisAncSal3_Internalname,GXutil.ltrim( localUtil.ntoc( A3130DisAncSal3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3130DisAncSal3), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisAncSal3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisGraAca2_Internalname,GXutil.ltrim( localUtil.ntoc( A3131DisGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3131DisGraAca2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisGraAca2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisGraCru2_Internalname,GXutil.ltrim( localUtil.ntoc( A3132DisGraCru2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3132DisGraCru2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisGraCru2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisGraAca_Internalname,GXutil.ltrim( localUtil.ntoc( A1906DisGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1906DisGraAca), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisGraAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisRdoA_Internalname,GXutil.ltrim( localUtil.ntoc( A1908DisRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1908DisRdoA, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisRdoA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisRdoN_Internalname,GXutil.ltrim( localUtil.ntoc( A1907DisRdoN, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1907DisRdoN, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisRdoN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsGrm_Internalname,GXutil.rtrim( A5349DisObsGrm),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsGrm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsAnc_Internalname,GXutil.rtrim( A5350DisObsAnc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisItem5_Internalname,GXutil.rtrim( A9786DisItem5),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisItem5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTipDis_Internalname,GXutil.rtrim( A2009DisTipDis),GXutil.rtrim( localUtil.format( A2009DisTipDis, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisTipDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCliDes_Internalname,GXutil.ltrim( localUtil.ntoc( A2310DisCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2310DisCliDes), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Código Cliente Destino", ""),"",edtDisCliDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCnoEncO_Internalname,A11734DisCnoEncO,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCnoEncO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(600),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObs_Internalname,GXutil.rtrim( A1052DisObs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisAcaAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A4478DisAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4478DisAcaAnh), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisAcaAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTb1_Dscf_Internalname,GXutil.rtrim( A9717Tb1_Dscf),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTb1_Dscf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFindCol_Internalname,GXutil.rtrim( A475FindCol),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFindCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisLoc_Internalname,GXutil.rtrim( A1430DisLoc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtOpe_Internalname,GXutil.rtrim( A341DisArtOpe),GXutil.rtrim( localUtil.format( A341DisArtOpe, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtOpe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISACC_" + sGXsfl_54_idx ;
         chkDisAcc.setName( GXCCtl );
         chkDisAcc.setWebtags( "" );
         chkDisAcc.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkDisAcc.getInternalname(), "TitleCaption", chkDisAcc.getCaption(), !bGXsfl_54_Refreshing);
         chkDisAcc.setCheckedValue( "N" );
         A5252DisAcc = ((GXutil.strcmp(GXutil.rtrim( A5252DisAcc), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisAcc.getInternalname(),A5252DisAcc,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisAntpT_Internalname,GXutil.rtrim( A5405DisAntpT),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisAntpT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumUni_Internalname,GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A375DisNumUni, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumPie_Internalname,GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodDis_Internalname,GXutil.rtrim( A1122MaqCodDis),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFecEnt_Internalname,localUtil.format(A371DisFecEnt, "99/99/99"),localUtil.format( A371DisFecEnt, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFecCli_Internalname,localUtil.format(A370DisFecCli, "99/99/99"),localUtil.format( A370DisFecCli, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisEncCli_Internalname,GXutil.rtrim( A4813DisEncCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisEncCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCliNum_Internalname,GXutil.rtrim( A360DisCliNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCliNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PRICOD_" + sGXsfl_54_idx ;
         chkPriCod.setName( GXCCtl );
         chkPriCod.setWebtags( "" );
         chkPriCod.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "TitleCaption", chkPriCod.getCaption(), !bGXsfl_54_Refreshing);
         chkPriCod.setCheckedValue( "0" );
         A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPriCod.getInternalname(),A757PriCod,"","",Integer.valueOf(0),Integer.valueOf(0),"1","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPiePie_Internalname,GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPiePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A385DisPieMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPieMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A381DisPieKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPieKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A388DisPreKgm, "ZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A389DisPreMtr, "ZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieLan_Internalname,GXutil.ltrim( localUtil.ntoc( A383DisPieLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A383DisPieLan), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPieLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisKgmLan_Internalname,GXutil.ltrim( localUtil.ntoc( A372DisKgmLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A372DisKgmLan), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisKgmLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisMtrLan_Internalname,GXutil.ltrim( localUtil.ntoc( A373DisMtrLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A373DisMtrLan), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisMtrLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCodDis_Internalname,GXutil.rtrim( A399EmprCodDis),GXutil.rtrim( localUtil.format( A399EmprCodDis, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCodDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCodDis_Internalname,GXutil.ltrim( localUtil.ntoc( A253CliCodDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A253CliCodDis), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCodDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPie_Internalname,GXutil.ltrim( localUtil.ntoc( A379DisPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A379DisPie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUni_Internalname,GXutil.ltrim( localUtil.ntoc( A391DisUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A391DisUni, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieNor_Internalname,GXutil.ltrim( localUtil.ntoc( A386DisPieNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A386DisPieNor), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPieNor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPart_Internalname,GXutil.ltrim( localUtil.ntoc( A1502DisPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1502DisPart), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumLot_Internalname,GXutil.ltrim( localUtil.ntoc( A2831DisNumLot, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2831DisNumLot), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisKgsLot_Internalname,GXutil.ltrim( localUtil.ntoc( A2832DisKgsLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2832DisKgsLot, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisKgsLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisMtrLot_Internalname,GXutil.ltrim( localUtil.ntoc( A2833DisMtrLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2833DisMtrLot, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisMtrLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISFAC_" + sGXsfl_54_idx ;
         chkDisFac.setName( GXCCtl );
         chkDisFac.setWebtags( "" );
         chkDisFac.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkDisFac.getInternalname(), "TitleCaption", chkDisFac.getCaption(), !bGXsfl_54_Refreshing);
         chkDisFac.setCheckedValue( "N" );
         A3306DisFac = ((GXutil.strcmp(GXutil.rtrim( A3306DisFac), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisFac.getInternalname(),A3306DisFac,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisManCod1_Internalname,GXutil.ltrim( localUtil.ntoc( A3307DisManCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3307DisManCod1), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisManCod1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisManCod2_Internalname,GXutil.ltrim( localUtil.ntoc( A3308DisManCod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3308DisManCod2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisManCod2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumTon_Internalname,GXutil.rtrim( A3309DisNumTon),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumTon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDishCod_Internalname,GXutil.rtrim( A4720DisDishCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDishCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISDES_" + sGXsfl_54_idx ;
         chkDisDes.setName( GXCCtl );
         chkDisDes.setWebtags( "" );
         chkDisDes.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), !bGXsfl_54_Refreshing);
         chkDisDes.setCheckedValue( "N" );
         A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisDes.getInternalname(),A365DisDes,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTipEst_Internalname,GXutil.ltrim( localUtil.ntoc( A5024DisTipEst, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5024DisTipEst), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisTipEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisGraCob_Internalname,GXutil.ltrim( localUtil.ntoc( A5025DisGraCob, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5025DisGraCob), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisGraCob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCom_Internalname,GXutil.rtrim( A5031DisCom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISESTTIP_" + sGXsfl_54_idx ;
         chkDisEstTip.setName( GXCCtl );
         chkDisEstTip.setWebtags( "" );
         chkDisEstTip.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkDisEstTip.getInternalname(), "TitleCaption", chkDisEstTip.getCaption(), !bGXsfl_54_Refreshing);
         chkDisEstTip.setCheckedValue( "*" );
         A5032DisEstTip = ((GXutil.strcmp(GXutil.rtrim( A5032DisEstTip), "S")==0) ? "S" : "*") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisEstTip.getInternalname(),A5032DisEstTip,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTipCor_Internalname,GXutil.rtrim( A5290DisTipCor),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisTipCor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisAntp_Internalname,GXutil.rtrim( A5366DisAntp),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisAntp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisMdlCod_Internalname,GXutil.rtrim( A4614DisMdlCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisMdlCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTam_Internalname,GXutil.rtrim( A4615DisTam),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisTam_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisManCod_Internalname,GXutil.ltrim( localUtil.ntoc( A2402DisManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2402DisManCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisManCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNMtr_Internalname,GXutil.rtrim( A998DisNMtr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPelAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A4468DisPelAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4468DisPelAnh), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisPelAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisLotKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A4474DisLotKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4474DisLotKgs, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisLotKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtMer_Internalname,GXutil.ltrim( localUtil.ntoc( A3841DisArtMer, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3841DisArtMer, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtMer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCruKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A4470DisCruKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4470DisCruKgs, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCruKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisVolMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A6547DisVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6547DisVolMaq), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisVolMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisRbMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A6548DisRbMaq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6548DisRbMaq, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisRbMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISTIN_" + sGXsfl_54_idx ;
         chkDisTin.setName( GXCCtl );
         chkDisTin.setWebtags( "" );
         chkDisTin.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkDisTin.getInternalname(), "TitleCaption", chkDisTin.getCaption(), !bGXsfl_54_Refreshing);
         chkDisTin.setCheckedValue( "N" );
         A4014DisTin = ((GXutil.strcmp(GXutil.rtrim( A4014DisTin), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisTin.getInternalname(),A4014DisTin,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNroCor_Internalname,GXutil.ltrim( localUtil.ntoc( A4785DisNroCor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4785DisNroCor), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNroCor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "CLICTRL_" + sGXsfl_54_idx ;
         chkCliCtrl.setName( GXCCtl );
         chkCliCtrl.setWebtags( "" );
         chkCliCtrl.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkCliCtrl.getInternalname(), "TitleCaption", chkCliCtrl.getCaption(), !bGXsfl_54_Refreshing);
         chkCliCtrl.setCheckedValue( "N" );
         A1901CliCtrl = ((GXutil.strcmp(GXutil.rtrim( A1901CliCtrl), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkCliCtrl.getInternalname(),A1901CliCtrl,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISACABAK_" + sGXsfl_54_idx ;
         chkDisAcaBak.setName( GXCCtl );
         chkDisAcaBak.setWebtags( "" );
         chkDisAcaBak.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkDisAcaBak.getInternalname(), "TitleCaption", chkDisAcaBak.getCaption(), !bGXsfl_54_Refreshing);
         chkDisAcaBak.setCheckedValue( "N" );
         A4477DisAcaBak = ((GXutil.strcmp(GXutil.rtrim( A4477DisAcaBak), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisAcaBak.getInternalname(),A4477DisAcaBak,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumTex1_Internalname,GXutil.ltrim( localUtil.ntoc( A2743DisNumTex1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2743DisNumTex1), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumTex1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCruEnr_Internalname,GXutil.rtrim( A4471DisCruEnr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCruEnr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisItem1_Internalname,GXutil.rtrim( A9771DisItem1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisItem1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisItem2_Internalname,GXutil.rtrim( A9772DisItem2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisItem2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisItem3_Internalname,GXutil.rtrim( A9773DisItem3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisItem3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisItem4_Internalname,GXutil.rtrim( A9774DisItem4),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisItem4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisItem6_Internalname,GXutil.rtrim( A9787DisItem6),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisItem6_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisEnt_Internalname,GXutil.rtrim( A366DisEnt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisAcaMar_Internalname,GXutil.rtrim( A4479DisAcaMar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisAcaMar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNMez_Internalname,GXutil.rtrim( A999DisNMez),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNMez_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisLotMts_Internalname,GXutil.ltrim( localUtil.ntoc( A4473DisLotMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4473DisLotMts, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisLotMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCruMts_Internalname,GXutil.ltrim( localUtil.ntoc( A4469DisCruMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4469DisCruMts, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCruMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCod_Idtx_Internalname,GXutil.rtrim( A10887Cod_Idtx),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCod_Idtx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisRec_Internalname,GXutil.rtrim( A7523DisRec),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisDest_Internalname,GXutil.rtrim( A8886DisDest),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisDest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisMemo1_Internalname,A11657DisMemo1,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisMemo1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisMemo2_Internalname,A11658DisMemo2,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisMemo2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMarcaId_Internalname,GXutil.rtrim( A11659MarcaId),GXutil.rtrim( localUtil.format( A11659MarcaId, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMarcaId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMarcaDsc_Internalname,GXutil.rtrim( A11660MarcaDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMarcaDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisOrdComp_Internalname,A11661DisOrdComp,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisOrdComp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(570),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISEXP_" + sGXsfl_54_idx ;
         chkDisExp.setName( GXCCtl );
         chkDisExp.setWebtags( "" );
         chkDisExp.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkDisExp.getInternalname(), "TitleCaption", chkDisExp.getCaption(), !bGXsfl_54_Refreshing);
         chkDisExp.setCheckedValue( "N" );
         A7739DisExp = ((GXutil.strcmp(GXutil.rtrim( A7739DisExp), "E")==0) ? "E" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisExp.getInternalname(),A7739DisExp,"","",Integer.valueOf(0),Integer.valueOf(0),"E","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNxt_modelo_Internalname,GXutil.rtrim( A11859Nxt_modelo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNxt_modelo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCpteId_Internalname,GXutil.ltrim( localUtil.ntoc( A11860CpteId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11860CpteId), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCpteId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCpteDsc_Internalname,GXutil.rtrim( A11865CpteDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCpteDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNxt_statio_Internalname,GXutil.rtrim( A11861Nxt_statio),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNxt_statio_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDesaID_Internalname,GXutil.ltrim( localUtil.ntoc( A11862DesaID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11862DesaID), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDesaID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDesaDsc_Internalname,GXutil.rtrim( A11866DesaDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDesaDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDptoID_Internalname,GXutil.ltrim( localUtil.ntoc( A11863DptoID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11863DptoID), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDptoID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDptoDsc_Internalname,GXutil.rtrim( A11867DptoDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDptoDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNxt_artcli_Internalname,GXutil.rtrim( A11864Nxt_artcli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNxt_artcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISPLA_" + sGXsfl_54_idx ;
         chkDisPla.setName( GXCCtl );
         chkDisPla.setWebtags( "" );
         chkDisPla.setCaption( httpContext.getMessage( "¿Muestras?", "") );
         httpContext.ajax_rsp_assign_prop("", false, chkDisPla.getInternalname(), "TitleCaption", chkDisPla.getCaption(), !bGXsfl_54_Refreshing);
         chkDisPla.setCheckedValue( "N" );
         A2926DisPla = ((GXutil.strcmp(GXutil.rtrim( A2926DisPla), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisPla.getInternalname(),A2926DisPla,"","",Integer.valueOf(0),Integer.valueOf(0),"S",httpContext.getMessage( "¿Muestras?", ""),StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisMaqEst_Internalname,GXutil.rtrim( A7738DisMaqEst),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisMaqEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISORDSEP_" + sGXsfl_54_idx ;
         chkDisOrdSep.setName( GXCCtl );
         chkDisOrdSep.setWebtags( "" );
         chkDisOrdSep.setCaption( httpContext.getMessage( "Ord Sep?", "") );
         httpContext.ajax_rsp_assign_prop("", false, chkDisOrdSep.getInternalname(), "TitleCaption", chkDisOrdSep.getCaption(), !bGXsfl_54_Refreshing);
         chkDisOrdSep.setCheckedValue( "0" );
         A7513DisOrdSep = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7513DisOrdSep, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisOrdSep.getInternalname(),GXutil.str( A7513DisOrdSep, 1, 0),"","",Integer.valueOf(0),Integer.valueOf(0),"1",httpContext.getMessage( "Ord Sep?", ""),StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISORDGRA_" + sGXsfl_54_idx ;
         chkDisOrdGra.setName( GXCCtl );
         chkDisOrdGra.setWebtags( "" );
         chkDisOrdGra.setCaption( httpContext.getMessage( "Ord Gra?", "") );
         httpContext.ajax_rsp_assign_prop("", false, chkDisOrdGra.getInternalname(), "TitleCaption", chkDisOrdGra.getCaption(), !bGXsfl_54_Refreshing);
         chkDisOrdGra.setCheckedValue( "0" );
         A7514DisOrdGra = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7514DisOrdGra, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisOrdGra.getInternalname(),GXutil.str( A7514DisOrdGra, 1, 0),"","",Integer.valueOf(0),Integer.valueOf(0),"1",httpContext.getMessage( "Ord Gra?", ""),StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisMaxObsL_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisMaxObsL_Internalname,GXutil.ltrim( localUtil.ntoc( A13737DisMaxObsL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13737DisMaxObsL), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisMaxObsL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisMaxObsL_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisCanRec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCanRec_Internalname,GXutil.ltrim( localUtil.ntoc( A13732DisCanRec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13732DisCanRec), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCanRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisCanRec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesK52( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_54_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      /* End function sendrow_542 */
   }

   public void startgridcontrol54( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"54\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Disposicion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDibCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dibujo del Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDibInt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dibujo Interno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrimstr( DecimalUtil.doubleToDec(570), 4, 0)+"px"+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisMaxObsL_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máxima Observación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisCanRec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reclamaciones", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV116GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4348DisUsrCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A367DisEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A369DisFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A335DisArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A337DisArtDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisArtDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A362DisColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1195DisNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1013DibCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDibCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDibInt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A392DisUniMed));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12116DisTipCD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1196DisNumCli, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A352DisArtTip, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12115DisArtTipD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A346DisArtPt3, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A355DisArtTr3));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A345DisArtPt2, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A354DisArtTr2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A344DisArtPt1, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A353DisArtTr1));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A349DisArtPu3, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A358DisArtUr3));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A348DisArtPu2, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A357DisArtUr2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A347DisArtPu1, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A356DisArtUr1));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A340DisArtMat));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A343DisArtPle));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2835DisPle2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A339DisArtLar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A351DisArtSua));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A333DisArtAca));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A338DisArtEnc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A336DisArtCor));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A342DisArtPes, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A350DisArtRdt, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A359DisArtUrg, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1225DisGraCru, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A334DisArtAnh, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1231DisArtAn1, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1232DisArtAcb, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1233DisArtAc2, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1197DisEncCom, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1198DisEncAnh, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3127DisNumCor, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3128DisAncSal1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3129DisAncSal2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3130DisAncSal3, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3131DisGraAca2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3132DisGraCru2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1906DisGraAca, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1908DisRdoA, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1907DisRdoN, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5349DisObsGrm));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5350DisObsAnc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9786DisItem5));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2009DisTipDis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2310DisCliDes, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A11734DisCnoEncO);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1052DisObs));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4478DisAcaAnh, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9717Tb1_Dscf));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A475FindCol));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1430DisLoc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A341DisArtOpe));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5252DisAcc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5405DisAntpT));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1122MaqCodDis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A371DisFecEnt, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A370DisFecCli, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4813DisEncCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A360DisCliNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A757PriCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A383DisPieLan, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A372DisKgmLan, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A373DisMtrLan, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A399EmprCodDis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A253CliCodDis, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A379DisPie, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A391DisUni, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A386DisPieNor, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1502DisPart, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2831DisNumLot, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2832DisKgsLot, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2833DisMtrLot, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3306DisFac));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3307DisManCod1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3308DisManCod2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3309DisNumTon));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4720DisDishCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A365DisDes));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5024DisTipEst, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5025DisGraCob, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5031DisCom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5032DisEstTip));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5290DisTipCor));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5366DisAntp));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4614DisMdlCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4615DisTam));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2402DisManCod, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A998DisNMtr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4468DisPelAnh, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4474DisLotKgs, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3841DisArtMer, (byte)(5), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4470DisCruKgs, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6547DisVolMaq, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6548DisRbMaq, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4014DisTin));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4785DisNroCor, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1901CliCtrl));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4477DisAcaBak));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2743DisNumTex1, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4471DisCruEnr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9771DisItem1));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9772DisItem2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9773DisItem3));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9774DisItem4));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9787DisItem6));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A366DisEnt));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4479DisAcaMar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A999DisNMez));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4473DisLotMts, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4469DisCruMts, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10887Cod_Idtx));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7523DisRec));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8886DisDest));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A11657DisMemo1);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A11658DisMemo2);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11659MarcaId));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11660MarcaDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A11661DisOrdComp);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7739DisExp));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11859Nxt_modelo));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11860CpteId, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11865CpteDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11861Nxt_statio));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11862DesaID, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11866DesaDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11863DptoID, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11867DptoDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11864Nxt_artcli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2926DisPla));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7738DisMaqEst));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7513DisOrdSep, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7514DisOrdGra, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13737DisMaxObsL, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisMaxObsL_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13732DisCanRec, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisCanRec_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavDatoclicod_Internalname = "vDATOCLICOD" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      edtavDisfec_Internalname = "vDISFEC" ;
      divFiltros_Internalname = "FILTROS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtDisUsrCod_Internalname = "DISUSRCOD" ;
      cmbDisEst.setInternalname( "DISEST" );
      edtDisCod_Internalname = "DISCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtDisFec_Internalname = "DISFEC" ;
      edtDisArtCod_Internalname = "DISARTCOD" ;
      edtDisArtDsc_Internalname = "DISARTDSC" ;
      edtDisColNom_Internalname = "DISCOLNOM" ;
      edtDisNomCli_Internalname = "DISNOMCLI" ;
      edtDisColNum_Internalname = "DISCOLNUM" ;
      edtDibCli_Internalname = "DIBCLI" ;
      edtDibInt_Internalname = "DIBINT" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtDisTipCol_Internalname = "DISTIPCOL" ;
      edtDisTipCD_Internalname = "DISTIPCD" ;
      edtDisNumCli_Internalname = "DISNUMCLI" ;
      edtDisArtTip_Internalname = "DISARTTIP" ;
      edtDisArtTipD_Internalname = "DISARTTIPD" ;
      edtDisArtPt3_Internalname = "DISARTPT3" ;
      edtDisArtTr3_Internalname = "DISARTTR3" ;
      edtDisArtPt2_Internalname = "DISARTPT2" ;
      edtDisArtTr2_Internalname = "DISARTTR2" ;
      edtDisArtPt1_Internalname = "DISARTPT1" ;
      edtDisArtTr1_Internalname = "DISARTTR1" ;
      edtDisArtPu3_Internalname = "DISARTPU3" ;
      edtDisArtUr3_Internalname = "DISARTUR3" ;
      edtDisArtPu2_Internalname = "DISARTPU2" ;
      edtDisArtUr2_Internalname = "DISARTUR2" ;
      edtDisArtPu1_Internalname = "DISARTPU1" ;
      edtDisArtUr1_Internalname = "DISARTUR1" ;
      edtDisArtMat_Internalname = "DISARTMAT" ;
      edtDisArtPle_Internalname = "DISARTPLE" ;
      edtDisPle2_Internalname = "DISPLE2" ;
      edtDisArtLar_Internalname = "DISARTLAR" ;
      edtDisArtSua_Internalname = "DISARTSUA" ;
      edtDisArtAca_Internalname = "DISARTACA" ;
      chkDisArtEnc.setInternalname( "DISARTENC" );
      chkDisArtCor.setInternalname( "DISARTCOR" );
      edtDisArtPes_Internalname = "DISARTPES" ;
      edtDisArtRdt_Internalname = "DISARTRDT" ;
      edtDisArtUrg_Internalname = "DISARTURG" ;
      edtDisGraCru_Internalname = "DISGRACRU" ;
      edtDisArtAnh_Internalname = "DISARTANH" ;
      edtDisArtAn1_Internalname = "DISARTAN1" ;
      edtDisArtAcb_Internalname = "DISARTACB" ;
      edtDisArtAc2_Internalname = "DISARTAC2" ;
      edtDisEncCom_Internalname = "DISENCCOM" ;
      edtDisEncAnh_Internalname = "DISENCANH" ;
      edtDisNumCor_Internalname = "DISNUMCOR" ;
      edtDisAncSal1_Internalname = "DISANCSAL1" ;
      edtDisAncSal2_Internalname = "DISANCSAL2" ;
      edtDisAncSal3_Internalname = "DISANCSAL3" ;
      edtDisGraAca2_Internalname = "DISGRAACA2" ;
      edtDisGraCru2_Internalname = "DISGRACRU2" ;
      edtDisGraAca_Internalname = "DISGRAACA" ;
      edtDisRdoA_Internalname = "DISRDOA" ;
      edtDisRdoN_Internalname = "DISRDON" ;
      edtDisObsGrm_Internalname = "DISOBSGRM" ;
      edtDisObsAnc_Internalname = "DISOBSANC" ;
      edtDisItem5_Internalname = "DISITEM5" ;
      edtDisTipDis_Internalname = "DISTIPDIS" ;
      edtDisCliDes_Internalname = "DISCLIDES" ;
      edtDisCnoEncO_Internalname = "DISCNOENCO" ;
      edtDisObs_Internalname = "DISOBS" ;
      edtDisAcaAnh_Internalname = "DISACAANH" ;
      edtTb1_Dscf_Internalname = "TB1_DSCF" ;
      edtFindCol_Internalname = "FINDCOL" ;
      edtDisLoc_Internalname = "DISLOC" ;
      edtDisArtOpe_Internalname = "DISARTOPE" ;
      chkDisAcc.setInternalname( "DISACC" );
      edtDisAntpT_Internalname = "DISANTPT" ;
      edtDisNumUni_Internalname = "DISNUMUNI" ;
      edtDisNumPie_Internalname = "DISNUMPIE" ;
      edtMaqCodDis_Internalname = "MAQCODDIS" ;
      edtDisFecEnt_Internalname = "DISFECENT" ;
      edtDisFecCli_Internalname = "DISFECCLI" ;
      edtDisEncCli_Internalname = "DISENCCLI" ;
      edtDisCliNum_Internalname = "DISCLINUM" ;
      chkPriCod.setInternalname( "PRICOD" );
      edtDisPiePie_Internalname = "DISPIEPIE" ;
      edtDisPieMtr_Internalname = "DISPIEMTR" ;
      edtDisPieKgm_Internalname = "DISPIEKGM" ;
      edtDisPreKgm_Internalname = "DISPREKGM" ;
      edtDisPreMtr_Internalname = "DISPREMTR" ;
      edtDisPieLan_Internalname = "DISPIELAN" ;
      edtDisKgmLan_Internalname = "DISKGMLAN" ;
      edtDisMtrLan_Internalname = "DISMTRLAN" ;
      edtEmprCodDis_Internalname = "EMPRCODDIS" ;
      edtCliCodDis_Internalname = "CLICODDIS" ;
      edtDisPie_Internalname = "DISPIE" ;
      edtDisUni_Internalname = "DISUNI" ;
      edtDisPieNor_Internalname = "DISPIENOR" ;
      edtDisPart_Internalname = "DISPART" ;
      edtDisNumLot_Internalname = "DISNUMLOT" ;
      edtDisKgsLot_Internalname = "DISKGSLOT" ;
      edtDisMtrLot_Internalname = "DISMTRLOT" ;
      chkDisFac.setInternalname( "DISFAC" );
      edtDisManCod1_Internalname = "DISMANCOD1" ;
      edtDisManCod2_Internalname = "DISMANCOD2" ;
      edtDisNumTon_Internalname = "DISNUMTON" ;
      edtDisDishCod_Internalname = "DISDISHCOD" ;
      chkDisDes.setInternalname( "DISDES" );
      edtDisTipEst_Internalname = "DISTIPEST" ;
      edtDisGraCob_Internalname = "DISGRACOB" ;
      edtDisCom_Internalname = "DISCOM" ;
      chkDisEstTip.setInternalname( "DISESTTIP" );
      edtDisTipCor_Internalname = "DISTIPCOR" ;
      edtDisAntp_Internalname = "DISANTP" ;
      edtDisMdlCod_Internalname = "DISMDLCOD" ;
      edtDisTam_Internalname = "DISTAM" ;
      edtDisManCod_Internalname = "DISMANCOD" ;
      edtDisNMtr_Internalname = "DISNMTR" ;
      edtDisPelAnh_Internalname = "DISPELANH" ;
      edtDisLotKgs_Internalname = "DISLOTKGS" ;
      edtDisArtMer_Internalname = "DISARTMER" ;
      edtDisCruKgs_Internalname = "DISCRUKGS" ;
      edtDisVolMaq_Internalname = "DISVOLMAQ" ;
      edtDisRbMaq_Internalname = "DISRBMAQ" ;
      chkDisTin.setInternalname( "DISTIN" );
      edtDisNroCor_Internalname = "DISNROCOR" ;
      chkCliCtrl.setInternalname( "CLICTRL" );
      chkDisAcaBak.setInternalname( "DISACABAK" );
      edtDisNumTex1_Internalname = "DISNUMTEX1" ;
      edtDisCruEnr_Internalname = "DISCRUENR" ;
      edtDisItem1_Internalname = "DISITEM1" ;
      edtDisItem2_Internalname = "DISITEM2" ;
      edtDisItem3_Internalname = "DISITEM3" ;
      edtDisItem4_Internalname = "DISITEM4" ;
      edtDisItem6_Internalname = "DISITEM6" ;
      edtDisEnt_Internalname = "DISENT" ;
      edtDisAcaMar_Internalname = "DISACAMAR" ;
      edtDisNMez_Internalname = "DISNMEZ" ;
      edtDisLotMts_Internalname = "DISLOTMTS" ;
      edtDisCruMts_Internalname = "DISCRUMTS" ;
      edtCod_Idtx_Internalname = "COD_IDTX" ;
      edtDisRec_Internalname = "DISREC" ;
      edtDisDest_Internalname = "DISDEST" ;
      edtDisMemo1_Internalname = "DISMEMO1" ;
      edtDisMemo2_Internalname = "DISMEMO2" ;
      edtMarcaId_Internalname = "MARCAID" ;
      edtMarcaDsc_Internalname = "MARCADSC" ;
      edtDisOrdComp_Internalname = "DISORDCOMP" ;
      chkDisExp.setInternalname( "DISEXP" );
      edtNxt_modelo_Internalname = "NXT_MODELO" ;
      edtCpteId_Internalname = "CPTEID" ;
      edtCpteDsc_Internalname = "CPTEDSC" ;
      edtNxt_statio_Internalname = "NXT_STATIO" ;
      edtDesaID_Internalname = "DESAID" ;
      edtDesaDsc_Internalname = "DESADSC" ;
      edtDptoID_Internalname = "DPTOID" ;
      edtDptoDsc_Internalname = "DPTODSC" ;
      edtNxt_artcli_Internalname = "NXT_ARTCLI" ;
      chkDisPla.setInternalname( "DISPLA" );
      edtDisMaqEst_Internalname = "DISMAQEST" ;
      chkDisOrdSep.setInternalname( "DISORDSEP" );
      chkDisOrdGra.setInternalname( "DISORDGRA" );
      edtDisMaxObsL_Internalname = "DISMAXOBSL" ;
      edtDisCanRec_Internalname = "DISCANREC" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_disfecauxdate_Internalname = "vDDO_DISFECAUXDATE" ;
      divDdo_disfecauxdates_Internalname = "DDO_DISFECAUXDATES" ;
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
      edtDisCanRec_Jsonclick = "" ;
      edtDisMaxObsL_Jsonclick = "" ;
      chkDisOrdGra.setCaption( "" );
      chkDisOrdSep.setCaption( "" );
      edtDisMaqEst_Jsonclick = "" ;
      chkDisPla.setCaption( "" );
      edtNxt_artcli_Jsonclick = "" ;
      edtDptoDsc_Jsonclick = "" ;
      edtDptoID_Jsonclick = "" ;
      edtDesaDsc_Jsonclick = "" ;
      edtDesaID_Jsonclick = "" ;
      edtNxt_statio_Jsonclick = "" ;
      edtCpteDsc_Jsonclick = "" ;
      edtCpteId_Jsonclick = "" ;
      edtNxt_modelo_Jsonclick = "" ;
      chkDisExp.setCaption( "" );
      edtDisOrdComp_Jsonclick = "" ;
      edtMarcaDsc_Jsonclick = "" ;
      edtMarcaId_Jsonclick = "" ;
      edtDisMemo2_Jsonclick = "" ;
      edtDisMemo1_Jsonclick = "" ;
      edtDisDest_Jsonclick = "" ;
      edtDisRec_Jsonclick = "" ;
      edtCod_Idtx_Jsonclick = "" ;
      edtDisCruMts_Jsonclick = "" ;
      edtDisLotMts_Jsonclick = "" ;
      edtDisNMez_Jsonclick = "" ;
      edtDisAcaMar_Jsonclick = "" ;
      edtDisEnt_Jsonclick = "" ;
      edtDisItem6_Jsonclick = "" ;
      edtDisItem4_Jsonclick = "" ;
      edtDisItem3_Jsonclick = "" ;
      edtDisItem2_Jsonclick = "" ;
      edtDisItem1_Jsonclick = "" ;
      edtDisCruEnr_Jsonclick = "" ;
      edtDisNumTex1_Jsonclick = "" ;
      chkDisAcaBak.setCaption( "" );
      chkCliCtrl.setCaption( "" );
      edtDisNroCor_Jsonclick = "" ;
      chkDisTin.setCaption( "" );
      edtDisRbMaq_Jsonclick = "" ;
      edtDisVolMaq_Jsonclick = "" ;
      edtDisCruKgs_Jsonclick = "" ;
      edtDisArtMer_Jsonclick = "" ;
      edtDisLotKgs_Jsonclick = "" ;
      edtDisPelAnh_Jsonclick = "" ;
      edtDisNMtr_Jsonclick = "" ;
      edtDisManCod_Jsonclick = "" ;
      edtDisTam_Jsonclick = "" ;
      edtDisMdlCod_Jsonclick = "" ;
      edtDisAntp_Jsonclick = "" ;
      edtDisTipCor_Jsonclick = "" ;
      chkDisEstTip.setCaption( "" );
      edtDisCom_Jsonclick = "" ;
      edtDisGraCob_Jsonclick = "" ;
      edtDisTipEst_Jsonclick = "" ;
      chkDisDes.setCaption( "" );
      edtDisDishCod_Jsonclick = "" ;
      edtDisNumTon_Jsonclick = "" ;
      edtDisManCod2_Jsonclick = "" ;
      edtDisManCod1_Jsonclick = "" ;
      chkDisFac.setCaption( "" );
      edtDisMtrLot_Jsonclick = "" ;
      edtDisKgsLot_Jsonclick = "" ;
      edtDisNumLot_Jsonclick = "" ;
      edtDisPart_Jsonclick = "" ;
      edtDisPieNor_Jsonclick = "" ;
      edtDisUni_Jsonclick = "" ;
      edtDisPie_Jsonclick = "" ;
      edtCliCodDis_Jsonclick = "" ;
      edtEmprCodDis_Jsonclick = "" ;
      edtDisMtrLan_Jsonclick = "" ;
      edtDisKgmLan_Jsonclick = "" ;
      edtDisPieLan_Jsonclick = "" ;
      edtDisPreMtr_Jsonclick = "" ;
      edtDisPreKgm_Jsonclick = "" ;
      edtDisPieKgm_Jsonclick = "" ;
      edtDisPieMtr_Jsonclick = "" ;
      edtDisPiePie_Jsonclick = "" ;
      chkPriCod.setCaption( "" );
      edtDisCliNum_Jsonclick = "" ;
      edtDisEncCli_Jsonclick = "" ;
      edtDisFecCli_Jsonclick = "" ;
      edtDisFecEnt_Jsonclick = "" ;
      edtMaqCodDis_Jsonclick = "" ;
      edtDisNumPie_Jsonclick = "" ;
      edtDisNumUni_Jsonclick = "" ;
      edtDisAntpT_Jsonclick = "" ;
      chkDisAcc.setCaption( "" );
      edtDisArtOpe_Jsonclick = "" ;
      edtDisLoc_Jsonclick = "" ;
      edtFindCol_Jsonclick = "" ;
      edtTb1_Dscf_Jsonclick = "" ;
      edtDisAcaAnh_Jsonclick = "" ;
      edtDisObs_Jsonclick = "" ;
      edtDisCnoEncO_Jsonclick = "" ;
      edtDisCliDes_Jsonclick = "" ;
      edtDisTipDis_Jsonclick = "" ;
      edtDisItem5_Jsonclick = "" ;
      edtDisObsAnc_Jsonclick = "" ;
      edtDisObsGrm_Jsonclick = "" ;
      edtDisRdoN_Jsonclick = "" ;
      edtDisRdoA_Jsonclick = "" ;
      edtDisGraAca_Jsonclick = "" ;
      edtDisGraCru2_Jsonclick = "" ;
      edtDisGraAca2_Jsonclick = "" ;
      edtDisAncSal3_Jsonclick = "" ;
      edtDisAncSal2_Jsonclick = "" ;
      edtDisAncSal1_Jsonclick = "" ;
      edtDisNumCor_Jsonclick = "" ;
      edtDisEncAnh_Jsonclick = "" ;
      edtDisEncCom_Jsonclick = "" ;
      edtDisArtAc2_Jsonclick = "" ;
      edtDisArtAcb_Jsonclick = "" ;
      edtDisArtAn1_Jsonclick = "" ;
      edtDisArtAnh_Jsonclick = "" ;
      edtDisGraCru_Jsonclick = "" ;
      edtDisArtUrg_Jsonclick = "" ;
      edtDisArtRdt_Jsonclick = "" ;
      edtDisArtPes_Jsonclick = "" ;
      chkDisArtCor.setCaption( "" );
      chkDisArtEnc.setCaption( "" );
      edtDisArtAca_Jsonclick = "" ;
      edtDisArtSua_Jsonclick = "" ;
      edtDisArtLar_Jsonclick = "" ;
      edtDisPle2_Jsonclick = "" ;
      edtDisArtPle_Jsonclick = "" ;
      edtDisArtMat_Jsonclick = "" ;
      edtDisArtUr1_Jsonclick = "" ;
      edtDisArtPu1_Jsonclick = "" ;
      edtDisArtUr2_Jsonclick = "" ;
      edtDisArtPu2_Jsonclick = "" ;
      edtDisArtUr3_Jsonclick = "" ;
      edtDisArtPu3_Jsonclick = "" ;
      edtDisArtTr1_Jsonclick = "" ;
      edtDisArtPt1_Jsonclick = "" ;
      edtDisArtTr2_Jsonclick = "" ;
      edtDisArtPt2_Jsonclick = "" ;
      edtDisArtTr3_Jsonclick = "" ;
      edtDisArtPt3_Jsonclick = "" ;
      edtDisArtTipD_Jsonclick = "" ;
      edtDisArtTip_Jsonclick = "" ;
      edtDisNumCli_Jsonclick = "" ;
      edtDisTipCD_Jsonclick = "" ;
      edtDisTipCol_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtDisUniMed_Jsonclick = "" ;
      edtDibInt_Jsonclick = "" ;
      edtDibCli_Jsonclick = "" ;
      edtDisColNum_Jsonclick = "" ;
      edtDisNomCli_Jsonclick = "" ;
      edtDisColNom_Jsonclick = "" ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisFec_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtDisCod_Jsonclick = "" ;
      cmbDisEst.setJsonclick( "" );
      edtDisUsrCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtDisCanRec_Visible = -1 ;
      edtDisMaxObsL_Visible = -1 ;
      edtDisColNum_Visible = -1 ;
      edtDisNomCli_Visible = -1 ;
      edtDisColNom_Visible = -1 ;
      edtDisArtDsc_Visible = -1 ;
      edtDisArtCod_Visible = -1 ;
      edtDisFec_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtDisCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_disfecauxdate_Jsonclick = "" ;
      edtavDisfec_Jsonclick = "" ;
      edtavDisfec_Enabled = 1 ;
      edtavDatoclicod_Jsonclick = "" ;
      edtavDatoclicod_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "WebWNwDP02GetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|||" ;
      Ddo_grid_Includedatalist = "|||T|T|T|T||T|||" ;
      Ddo_grid_Filterisrange = "T|T||||||T||T|T|T" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Date|Character|Character|Character|Character|Numeric|Character|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11||" ;
      Ddo_grid_Columnids = "4:DisCod|5:CliCod|7:DisFec|8:DisArtCod|9:DisArtDsc|10:DisColNom|11:DisNomCli|12:DisColNum|13:DibCli|14:DibInt|160:DisMaxObsLin|161:DisCanRec" ;
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
      Form.setCaption( httpContext.getMessage( " Entrada Pedido Cliente", "") );
      edtDibInt_Visible = -1 ;
      edtDibCli_Visible = -1 ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_54_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV116GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV116GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActions), 4, 0));
      }
      GXCCtl = "DISEST_" + sGXsfl_54_idx ;
      cmbDisEst.setName( GXCCtl );
      cmbDisEst.setWebtags( "" );
      cmbDisEst.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
      cmbDisEst.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
      if ( cmbDisEst.getItemCount() > 0 )
      {
         A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
      }
      GXCCtl = "DISARTENC_" + sGXsfl_54_idx ;
      chkDisArtEnc.setName( GXCCtl );
      chkDisArtEnc.setWebtags( "" );
      chkDisArtEnc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisArtEnc.getInternalname(), "TitleCaption", chkDisArtEnc.getCaption(), !bGXsfl_54_Refreshing);
      chkDisArtEnc.setCheckedValue( "N" );
      A338DisArtEnc = ((GXutil.strcmp(GXutil.rtrim( A338DisArtEnc), "S")==0) ? "S" : "N") ;
      GXCCtl = "DISARTCOR_" + sGXsfl_54_idx ;
      chkDisArtCor.setName( GXCCtl );
      chkDisArtCor.setWebtags( "" );
      chkDisArtCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisArtCor.getInternalname(), "TitleCaption", chkDisArtCor.getCaption(), !bGXsfl_54_Refreshing);
      chkDisArtCor.setCheckedValue( "N" );
      A336DisArtCor = ((GXutil.strcmp(GXutil.rtrim( A336DisArtCor), "S")==0) ? "S" : "N") ;
      GXCCtl = "DISACC_" + sGXsfl_54_idx ;
      chkDisAcc.setName( GXCCtl );
      chkDisAcc.setWebtags( "" );
      chkDisAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisAcc.getInternalname(), "TitleCaption", chkDisAcc.getCaption(), !bGXsfl_54_Refreshing);
      chkDisAcc.setCheckedValue( "N" );
      A5252DisAcc = ((GXutil.strcmp(GXutil.rtrim( A5252DisAcc), "S")==0) ? "S" : "N") ;
      GXCCtl = "PRICOD_" + sGXsfl_54_idx ;
      chkPriCod.setName( GXCCtl );
      chkPriCod.setWebtags( "" );
      chkPriCod.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "TitleCaption", chkPriCod.getCaption(), !bGXsfl_54_Refreshing);
      chkPriCod.setCheckedValue( "0" );
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      GXCCtl = "DISFAC_" + sGXsfl_54_idx ;
      chkDisFac.setName( GXCCtl );
      chkDisFac.setWebtags( "" );
      chkDisFac.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFac.getInternalname(), "TitleCaption", chkDisFac.getCaption(), !bGXsfl_54_Refreshing);
      chkDisFac.setCheckedValue( "N" );
      A3306DisFac = ((GXutil.strcmp(GXutil.rtrim( A3306DisFac), "S")==0) ? "S" : "N") ;
      GXCCtl = "DISDES_" + sGXsfl_54_idx ;
      chkDisDes.setName( GXCCtl );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), !bGXsfl_54_Refreshing);
      chkDisDes.setCheckedValue( "N" );
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      GXCCtl = "DISESTTIP_" + sGXsfl_54_idx ;
      chkDisEstTip.setName( GXCCtl );
      chkDisEstTip.setWebtags( "" );
      chkDisEstTip.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisEstTip.getInternalname(), "TitleCaption", chkDisEstTip.getCaption(), !bGXsfl_54_Refreshing);
      chkDisEstTip.setCheckedValue( "*" );
      A5032DisEstTip = ((GXutil.strcmp(GXutil.rtrim( A5032DisEstTip), "S")==0) ? "S" : "*") ;
      GXCCtl = "DISTIN_" + sGXsfl_54_idx ;
      chkDisTin.setName( GXCCtl );
      chkDisTin.setWebtags( "" );
      chkDisTin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisTin.getInternalname(), "TitleCaption", chkDisTin.getCaption(), !bGXsfl_54_Refreshing);
      chkDisTin.setCheckedValue( "N" );
      A4014DisTin = ((GXutil.strcmp(GXutil.rtrim( A4014DisTin), "S")==0) ? "S" : "N") ;
      GXCCtl = "CLICTRL_" + sGXsfl_54_idx ;
      chkCliCtrl.setName( GXCCtl );
      chkCliCtrl.setWebtags( "" );
      chkCliCtrl.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliCtrl.getInternalname(), "TitleCaption", chkCliCtrl.getCaption(), !bGXsfl_54_Refreshing);
      chkCliCtrl.setCheckedValue( "N" );
      A1901CliCtrl = ((GXutil.strcmp(GXutil.rtrim( A1901CliCtrl), "S")==0) ? "S" : "N") ;
      GXCCtl = "DISACABAK_" + sGXsfl_54_idx ;
      chkDisAcaBak.setName( GXCCtl );
      chkDisAcaBak.setWebtags( "" );
      chkDisAcaBak.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisAcaBak.getInternalname(), "TitleCaption", chkDisAcaBak.getCaption(), !bGXsfl_54_Refreshing);
      chkDisAcaBak.setCheckedValue( "N" );
      A4477DisAcaBak = ((GXutil.strcmp(GXutil.rtrim( A4477DisAcaBak), "S")==0) ? "S" : "N") ;
      GXCCtl = "DISEXP_" + sGXsfl_54_idx ;
      chkDisExp.setName( GXCCtl );
      chkDisExp.setWebtags( "" );
      chkDisExp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisExp.getInternalname(), "TitleCaption", chkDisExp.getCaption(), !bGXsfl_54_Refreshing);
      chkDisExp.setCheckedValue( "N" );
      A7739DisExp = ((GXutil.strcmp(GXutil.rtrim( A7739DisExp), "E")==0) ? "E" : "N") ;
      GXCCtl = "DISPLA_" + sGXsfl_54_idx ;
      chkDisPla.setName( GXCCtl );
      chkDisPla.setWebtags( "" );
      chkDisPla.setCaption( httpContext.getMessage( "¿Muestras?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisPla.getInternalname(), "TitleCaption", chkDisPla.getCaption(), !bGXsfl_54_Refreshing);
      chkDisPla.setCheckedValue( "N" );
      A2926DisPla = ((GXutil.strcmp(GXutil.rtrim( A2926DisPla), "S")==0) ? "S" : "N") ;
      GXCCtl = "DISORDSEP_" + sGXsfl_54_idx ;
      chkDisOrdSep.setName( GXCCtl );
      chkDisOrdSep.setWebtags( "" );
      chkDisOrdSep.setCaption( httpContext.getMessage( "Ord Sep?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisOrdSep.getInternalname(), "TitleCaption", chkDisOrdSep.getCaption(), !bGXsfl_54_Refreshing);
      chkDisOrdSep.setCheckedValue( "0" );
      A7513DisOrdSep = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7513DisOrdSep, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      GXCCtl = "DISORDGRA_" + sGXsfl_54_idx ;
      chkDisOrdGra.setName( GXCCtl );
      chkDisOrdGra.setWebtags( "" );
      chkDisOrdGra.setCaption( httpContext.getMessage( "Ord Gra?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisOrdGra.getInternalname(), "TitleCaption", chkDisOrdGra.getCaption(), !bGXsfl_54_Refreshing);
      chkDisOrdGra.setCheckedValue( "0" );
      A7514DisOrdGra = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7514DisOrdGra, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'edtDisMaxObsL_Visible',ctrl:'DISMAXOBSL',prop:'Visible'},{av:'edtDisCanRec_Visible',ctrl:'DISCANREC',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12K52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13K52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14K52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      /* * Property Enabled not supported in */
      /* * Property Enabled not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      setEventMetadata("GRID.LOAD","{handler:'e22K52',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2009DisTipDis',fld:'DISTIPDIS',pic:'@!'},{av:'A4813DisEncCli',fld:'DISENCCLI',pic:''},{av:'A360DisCliNum',fld:'DISCLINUM',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9',hsh:true},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavGridactions'},{av:'AV116GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{ctrl:'vDELETE',prop:'Enabled'},{ctrl:'vDELETE',prop:'Link'},{ctrl:'vUPDATE',prop:'Link'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15K52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'edtDisMaxObsL_Visible',ctrl:'DISMAXOBSL',prop:'Visible'},{av:'edtDisCanRec_Visible',ctrl:'DISCANREC',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11K52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'edtDisMaxObsL_Visible',ctrl:'DISMAXOBSL',prop:'Visible'},{av:'edtDisCanRec_Visible',ctrl:'DISCANREC',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e25K52',iparms:[{av:'cmbavGridactions'},{av:'AV116GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV116GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16K52',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17K52',iparms:[{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18K52',iparms:[{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19K52',iparms:[{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'ALTA'","{handler:'e23K52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("'ALTA'",",oparms:[{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'edtDisMaxObsL_Visible',ctrl:'DISMAXOBSL',prop:'Visible'},{av:'edtDisCanRec_Visible',ctrl:'DISCANREC',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'BAJA'","{handler:'e24K52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7DisFec',fld:'vDISFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8pricod',fld:'vPRICOD',pic:'9'},{av:'AV5DisUsrcod',fld:'vDISUSRCOD',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV42TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV43TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV45TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV47TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV49TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDibCli',fld:'vTFDIBCLI',pic:''},{av:'AV53TFDibCli_Sel',fld:'vTFDIBCLI_SEL',pic:''},{av:'AV54TFDibInt',fld:'vTFDIBINT',pic:'ZZZZZZZ9'},{av:'AV55TFDibInt_To',fld:'vTFDIBINT_TO',pic:'ZZZZZZZ9'},{av:'AV112TFDisMaxObsLin',fld:'vTFDISMAXOBSLIN',pic:'ZZZ9'},{av:'AV113TFDisMaxObsLin_To',fld:'vTFDISMAXOBSLIN_TO',pic:'ZZZ9'},{av:'AV114TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV115TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'AV67barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV69barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV66DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV111ModeloSDT',fld:'vMODELOSDT',pic:'',hsh:true},{av:'AV83Detpie',fld:'vDETPIE',pic:'ZZZ9',hsh:true},{av:'AV88Tnwdp04',fld:'vTNWDP04',pic:'ZZZ9',hsh:true},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV80Station',fld:'vSTATION',pic:'',hsh:true},{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'BAJA'",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDibCli_Visible',ctrl:'DIBCLI',prop:'Visible'},{av:'edtDibInt_Visible',ctrl:'DIBINT',prop:'Visible'},{av:'edtDisMaxObsL_Visible',ctrl:'DISMAXOBSL',prop:'Visible'},{av:'edtDisCanRec_Visible',ctrl:'DISCANREC',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DISARTCOD","{handler:'valid_Disartcod',iparms:[]");
      setEventMetadata("VALID_DISARTCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOLNOM","{handler:'valid_Discolnom',iparms:[]");
      setEventMetadata("VALID_DISCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_DISCOLNUM","{handler:'valid_Discolnum',iparms:[]");
      setEventMetadata("VALID_DISCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_DISUNIMED","{handler:'valid_Disunimed',iparms:[]");
      setEventMetadata("VALID_DISUNIMED",",oparms:[]}");
      setEventMetadata("VALID_DISTIPCOL","{handler:'valid_Distipcol',iparms:[]");
      setEventMetadata("VALID_DISTIPCOL",",oparms:[]}");
      setEventMetadata("VALID_DISARTTIP","{handler:'valid_Disarttip',iparms:[]");
      setEventMetadata("VALID_DISARTTIP",",oparms:[]}");
      setEventMetadata("VALID_DISACAANH","{handler:'valid_Disacaanh',iparms:[]");
      setEventMetadata("VALID_DISACAANH",",oparms:[]}");
      setEventMetadata("VALID_DISDES","{handler:'valid_Disdes',iparms:[]");
      setEventMetadata("VALID_DISDES",",oparms:[]}");
      setEventMetadata("VALID_MARCAID","{handler:'valid_Marcaid',iparms:[]");
      setEventMetadata("VALID_MARCAID",",oparms:[]}");
      setEventMetadata("VALID_CPTEID","{handler:'valid_Cpteid',iparms:[]");
      setEventMetadata("VALID_CPTEID",",oparms:[]}");
      setEventMetadata("VALID_DESAID","{handler:'valid_Desaid',iparms:[]");
      setEventMetadata("VALID_DESAID",",oparms:[]}");
      setEventMetadata("VALID_DPTOID","{handler:'valid_Dptoid',iparms:[]");
      setEventMetadata("VALID_DPTOID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Discanrec',iparms:[]");
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
   public int getDisPieNor0( String E396EmprCod ,
                             int E361DisCod )
   {
      X673Piezas = 0 ;
      /* Using cursor H00K516 */
      pr_default.execute(6);
      if ( (pr_default.getStatus(6) != 101) )
      {
         X673Piezas = H00K516_A673Piezas[0] ;
      }
      pr_default.close(6);
      return X673Piezas ;
   }

   public java.math.BigDecimal getDisUni1( String E396EmprCod ,
                                           int E361DisCod )
   {
      X631Metros = DecimalUtil.ZERO ;
      /* Using cursor H00K517 */
      pr_default.execute(7);
      if ( (pr_default.getStatus(7) != 101) )
      {
         X631Metros = H00K517_A631Metros[0] ;
      }
      pr_default.close(7);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisUni0( String E396EmprCod ,
                                           int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor H00K518 */
      pr_default.execute(8);
      if ( (pr_default.getStatus(8) != 101) )
      {
         X595Kilos = H00K518_A595Kilos[0] ;
      }
      pr_default.close(8);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor H00K519 */
      pr_default.execute(9);
      if ( (pr_default.getStatus(9) != 101) )
      {
         X595Kilos = H00K519_A595Kilos[0] ;
      }
      pr_default.close(9);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor H00K520 */
      pr_default.execute(10);
      if ( (pr_default.getStatus(10) != 101) )
      {
         X382DisPieKil = H00K520_A382DisPieKil[0] ;
      }
      pr_default.close(10);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H00K521 */
      pr_default.execute(11);
      if ( (pr_default.getStatus(11) != 101) )
      {
         X631Metros = H00K521_A631Metros[0] ;
      }
      pr_default.close(11);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H00K522 */
      pr_default.execute(12);
      if ( (pr_default.getStatus(12) != 101) )
      {
         X384DisPieMet = H00K522_A384DisPieMet[0] ;
      }
      pr_default.close(12);
      return X384DisPieMet ;
   }

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
      A764ProForCod = "" ;
      AV7DisFec = GXutil.nullDate() ;
      AV6EmprCod = "" ;
      AV8pricod = "" ;
      AV5DisUsrcod = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV19FilterFullText = "" ;
      AV38TFDisFec = GXutil.nullDate() ;
      AV42TFDisArtCod = "" ;
      AV43TFDisArtCod_Sel = "" ;
      AV44TFDisArtDsc = "" ;
      AV45TFDisArtDsc_Sel = "" ;
      AV46TFDisColNom = "" ;
      AV47TFDisColNom_Sel = "" ;
      AV48TFDisNomCli = "" ;
      AV49TFDisNomCli_Sel = "" ;
      AV52TFDibCli = "" ;
      AV53TFDibCli_Sel = "" ;
      AV145Pgmname = "" ;
      AV69barcodpar = "" ;
      A130BarCodPar = "" ;
      AV63UsurCod = "" ;
      AV80Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV27ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV56DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      AV40DDO_DisFecAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A4348DisUsrCod = "" ;
      A279CliNom = "" ;
      A369DisFec = GXutil.nullDate() ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1013DibCli = "" ;
      A392DisUniMed = "" ;
      A407EmprNom = "" ;
      A12116DisTipCD = "" ;
      A12115DisArtTipD = "" ;
      A355DisArtTr3 = "" ;
      A354DisArtTr2 = "" ;
      A353DisArtTr1 = "" ;
      A358DisArtUr3 = "" ;
      A357DisArtUr2 = "" ;
      A356DisArtUr1 = "" ;
      A340DisArtMat = "" ;
      A343DisArtPle = "" ;
      A2835DisPle2 = "" ;
      A339DisArtLar = "" ;
      A351DisArtSua = "" ;
      A333DisArtAca = "" ;
      A338DisArtEnc = "" ;
      A336DisArtCor = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      A5349DisObsGrm = "" ;
      A5350DisObsAnc = "" ;
      A9786DisItem5 = "" ;
      A2009DisTipDis = "" ;
      A11734DisCnoEncO = "" ;
      A1052DisObs = "" ;
      A9717Tb1_Dscf = "" ;
      A475FindCol = "" ;
      A1430DisLoc = "" ;
      A341DisArtOpe = "" ;
      A5252DisAcc = "" ;
      A5405DisAntpT = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A1122MaqCodDis = "" ;
      A371DisFecEnt = GXutil.nullDate() ;
      A370DisFecCli = GXutil.nullDate() ;
      A4813DisEncCli = "" ;
      A360DisCliNum = "" ;
      A757PriCod = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      A399EmprCodDis = "" ;
      A391DisUni = DecimalUtil.ZERO ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      A2833DisMtrLot = DecimalUtil.ZERO ;
      A3306DisFac = "" ;
      A3309DisNumTon = "" ;
      A4720DisDishCod = "" ;
      A365DisDes = "" ;
      A5031DisCom = "" ;
      A5032DisEstTip = "" ;
      A5290DisTipCor = "" ;
      A5366DisAntp = "" ;
      A4614DisMdlCod = "" ;
      A4615DisTam = "" ;
      A998DisNMtr = "" ;
      A4474DisLotKgs = DecimalUtil.ZERO ;
      A3841DisArtMer = DecimalUtil.ZERO ;
      A4470DisCruKgs = DecimalUtil.ZERO ;
      A6548DisRbMaq = DecimalUtil.ZERO ;
      A4014DisTin = "" ;
      A1901CliCtrl = "" ;
      A4477DisAcaBak = "" ;
      A4471DisCruEnr = "" ;
      A9771DisItem1 = "" ;
      A9772DisItem2 = "" ;
      A9773DisItem3 = "" ;
      A9774DisItem4 = "" ;
      A9787DisItem6 = "" ;
      A366DisEnt = "" ;
      A4479DisAcaMar = "" ;
      A999DisNMez = "" ;
      A4473DisLotMts = DecimalUtil.ZERO ;
      A4469DisCruMts = DecimalUtil.ZERO ;
      A10887Cod_Idtx = "" ;
      A7523DisRec = "" ;
      A8886DisDest = "" ;
      A11657DisMemo1 = "" ;
      A11658DisMemo2 = "" ;
      A11659MarcaId = "" ;
      A11660MarcaDsc = "" ;
      A11661DisOrdComp = "" ;
      A7739DisExp = "" ;
      A11859Nxt_modelo = "" ;
      A11865CpteDsc = "" ;
      A11861Nxt_statio = "" ;
      A11866DesaDsc = "" ;
      A11867DptoDsc = "" ;
      A11864Nxt_artcli = "" ;
      A2926DisPla = "" ;
      A7738DisMaqEst = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l764ProForCod = "" ;
      H00K52_A396EmprCod = new String[] {""} ;
      H00K52_A764ProForCod = new String[] {""} ;
      lV121Webwnwdp02ds_1_filterfulltext = "" ;
      lV127Webwnwdp02ds_7_tfdisartcod = "" ;
      lV129Webwnwdp02ds_9_tfdisartdsc = "" ;
      lV131Webwnwdp02ds_11_tfdiscolnom = "" ;
      lV133Webwnwdp02ds_13_tfdisnomcli = "" ;
      lV137Webwnwdp02ds_17_tfdibcli = "" ;
      lV105DisCliNum = "" ;
      lV106DisArtCod = "" ;
      lV107Disartdsc = "" ;
      lV108DisColNom = "" ;
      lV109Disnomcli = "" ;
      AV126Webwnwdp02ds_6_tfdisfec = GXutil.nullDate() ;
      AV128Webwnwdp02ds_8_tfdisartcod_sel = "" ;
      AV127Webwnwdp02ds_7_tfdisartcod = "" ;
      AV130Webwnwdp02ds_10_tfdisartdsc_sel = "" ;
      AV129Webwnwdp02ds_9_tfdisartdsc = "" ;
      AV132Webwnwdp02ds_12_tfdiscolnom_sel = "" ;
      AV131Webwnwdp02ds_11_tfdiscolnom = "" ;
      AV134Webwnwdp02ds_14_tfdisnomcli_sel = "" ;
      AV133Webwnwdp02ds_13_tfdisnomcli = "" ;
      AV138Webwnwdp02ds_18_tfdibcli_sel = "" ;
      AV137Webwnwdp02ds_17_tfdibcli = "" ;
      AV105DisCliNum = "" ;
      AV106DisArtCod = "" ;
      AV107Disartdsc = "" ;
      AV108DisColNom = "" ;
      AV109Disnomcli = "" ;
      AV121Webwnwdp02ds_1_filterfulltext = "" ;
      H00K57_A1232DisArtAcb = new short[1] ;
      H00K57_A1231DisArtAn1 = new short[1] ;
      H00K57_A334DisArtAnh = new short[1] ;
      H00K57_A1225DisGraCru = new short[1] ;
      H00K57_A359DisArtUrg = new byte[1] ;
      H00K57_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A342DisArtPes = new short[1] ;
      H00K57_A336DisArtCor = new String[] {""} ;
      H00K57_A338DisArtEnc = new String[] {""} ;
      H00K57_A333DisArtAca = new String[] {""} ;
      H00K57_A351DisArtSua = new String[] {""} ;
      H00K57_A339DisArtLar = new String[] {""} ;
      H00K57_A2835DisPle2 = new String[] {""} ;
      H00K57_A343DisArtPle = new String[] {""} ;
      H00K57_A340DisArtMat = new String[] {""} ;
      H00K57_A356DisArtUr1 = new String[] {""} ;
      H00K57_A347DisArtPu1 = new short[1] ;
      H00K57_A357DisArtUr2 = new String[] {""} ;
      H00K57_A348DisArtPu2 = new short[1] ;
      H00K57_A358DisArtUr3 = new String[] {""} ;
      H00K57_A349DisArtPu3 = new short[1] ;
      H00K57_n349DisArtPu3 = new boolean[] {false} ;
      H00K57_A353DisArtTr1 = new String[] {""} ;
      H00K57_A344DisArtPt1 = new short[1] ;
      H00K57_A354DisArtTr2 = new String[] {""} ;
      H00K57_A345DisArtPt2 = new short[1] ;
      H00K57_A355DisArtTr3 = new String[] {""} ;
      H00K57_A346DisArtPt3 = new short[1] ;
      H00K57_A1196DisNumCli = new int[1] ;
      H00K57_A407EmprNom = new String[] {""} ;
      H00K57_n407EmprNom = new boolean[] {false} ;
      H00K57_A1014DibInt = new int[1] ;
      H00K57_n1014DibInt = new boolean[] {false} ;
      H00K57_A1013DibCli = new String[] {""} ;
      H00K57_n1013DibCli = new boolean[] {false} ;
      H00K57_A1195DisNomCli = new String[] {""} ;
      H00K57_A337DisArtDsc = new String[] {""} ;
      H00K57_A279CliNom = new String[] {""} ;
      H00K57_A361DisCod = new int[1] ;
      H00K57_A367DisEst = new byte[1] ;
      H00K57_A4348DisUsrCod = new String[] {""} ;
      H00K57_A13732DisCanRec = new short[1] ;
      H00K57_n13732DisCanRec = new boolean[] {false} ;
      H00K57_A13737DisMaxObsL = new short[1] ;
      H00K57_n13737DisMaxObsL = new boolean[] {false} ;
      H00K57_A379DisPie = new short[1] ;
      H00K57_n379DisPie = new boolean[] {false} ;
      H00K57_A387DisPiePie = new short[1] ;
      H00K57_n387DisPiePie = new boolean[] {false} ;
      H00K57_A352DisArtTip = new short[1] ;
      H00K57_A4478DisAcaAnh = new short[1] ;
      H00K57_A390DisTipCol = new byte[1] ;
      H00K57_n390DisTipCol = new boolean[] {false} ;
      H00K57_A363DisColNum = new int[1] ;
      H00K57_n363DisColNum = new boolean[] {false} ;
      H00K57_A362DisColNom = new String[] {""} ;
      H00K57_n362DisColNom = new boolean[] {false} ;
      H00K57_A335DisArtCod = new String[] {""} ;
      H00K57_A396EmprCod = new String[] {""} ;
      H00K57_A252CliCod = new int[1] ;
      H00K57_A392DisUniMed = new String[] {""} ;
      H00K57_A365DisDes = new String[] {""} ;
      H00K57_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00K57_A7514DisOrdGra = new byte[1] ;
      H00K57_A7513DisOrdSep = new byte[1] ;
      H00K57_A7738DisMaqEst = new String[] {""} ;
      H00K57_A2926DisPla = new String[] {""} ;
      H00K57_A11864Nxt_artcli = new String[] {""} ;
      H00K57_A11867DptoDsc = new String[] {""} ;
      H00K57_n11867DptoDsc = new boolean[] {false} ;
      H00K57_A11863DptoID = new short[1] ;
      H00K57_n11863DptoID = new boolean[] {false} ;
      H00K57_A11866DesaDsc = new String[] {""} ;
      H00K57_n11866DesaDsc = new boolean[] {false} ;
      H00K57_A11862DesaID = new short[1] ;
      H00K57_n11862DesaID = new boolean[] {false} ;
      H00K57_A11861Nxt_statio = new String[] {""} ;
      H00K57_A11865CpteDsc = new String[] {""} ;
      H00K57_n11865CpteDsc = new boolean[] {false} ;
      H00K57_A11860CpteId = new short[1] ;
      H00K57_n11860CpteId = new boolean[] {false} ;
      H00K57_A11859Nxt_modelo = new String[] {""} ;
      H00K57_A7739DisExp = new String[] {""} ;
      H00K57_A11661DisOrdComp = new String[] {""} ;
      H00K57_A11660MarcaDsc = new String[] {""} ;
      H00K57_n11660MarcaDsc = new boolean[] {false} ;
      H00K57_A11659MarcaId = new String[] {""} ;
      H00K57_n11659MarcaId = new boolean[] {false} ;
      H00K57_A11658DisMemo2 = new String[] {""} ;
      H00K57_A11657DisMemo1 = new String[] {""} ;
      H00K57_A8886DisDest = new String[] {""} ;
      H00K57_A7523DisRec = new String[] {""} ;
      H00K57_A10887Cod_Idtx = new String[] {""} ;
      H00K57_n10887Cod_Idtx = new boolean[] {false} ;
      H00K57_A4469DisCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A4473DisLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A999DisNMez = new String[] {""} ;
      H00K57_A4479DisAcaMar = new String[] {""} ;
      H00K57_A366DisEnt = new String[] {""} ;
      H00K57_A9787DisItem6 = new String[] {""} ;
      H00K57_A9774DisItem4 = new String[] {""} ;
      H00K57_A9773DisItem3 = new String[] {""} ;
      H00K57_A9772DisItem2 = new String[] {""} ;
      H00K57_A9771DisItem1 = new String[] {""} ;
      H00K57_A4471DisCruEnr = new String[] {""} ;
      H00K57_A2743DisNumTex1 = new byte[1] ;
      H00K57_A4477DisAcaBak = new String[] {""} ;
      H00K57_A1901CliCtrl = new String[] {""} ;
      H00K57_A4785DisNroCor = new int[1] ;
      H00K57_A4014DisTin = new String[] {""} ;
      H00K57_A6548DisRbMaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A6547DisVolMaq = new int[1] ;
      H00K57_A4470DisCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A3841DisArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A4474DisLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A4468DisPelAnh = new short[1] ;
      H00K57_A998DisNMtr = new String[] {""} ;
      H00K57_A2402DisManCod = new short[1] ;
      H00K57_A4615DisTam = new String[] {""} ;
      H00K57_A4614DisMdlCod = new String[] {""} ;
      H00K57_A5366DisAntp = new String[] {""} ;
      H00K57_A5290DisTipCor = new String[] {""} ;
      H00K57_A5032DisEstTip = new String[] {""} ;
      H00K57_A5031DisCom = new String[] {""} ;
      H00K57_n5031DisCom = new boolean[] {false} ;
      H00K57_A5025DisGraCob = new byte[1] ;
      H00K57_A5024DisTipEst = new byte[1] ;
      H00K57_A4720DisDishCod = new String[] {""} ;
      H00K57_A3309DisNumTon = new String[] {""} ;
      H00K57_A3308DisManCod2 = new short[1] ;
      H00K57_A3307DisManCod1 = new short[1] ;
      H00K57_A3306DisFac = new String[] {""} ;
      H00K57_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A2831DisNumLot = new int[1] ;
      H00K57_A1502DisPart = new short[1] ;
      H00K57_A373DisMtrLan = new short[1] ;
      H00K57_A372DisKgmLan = new short[1] ;
      H00K57_A383DisPieLan = new short[1] ;
      H00K57_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A757PriCod = new String[] {""} ;
      H00K57_A360DisCliNum = new String[] {""} ;
      H00K57_A4813DisEncCli = new String[] {""} ;
      H00K57_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H00K57_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00K57_A1122MaqCodDis = new String[] {""} ;
      H00K57_n1122MaqCodDis = new boolean[] {false} ;
      H00K57_A374DisNumPie = new short[1] ;
      H00K57_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A5405DisAntpT = new String[] {""} ;
      H00K57_A5252DisAcc = new String[] {""} ;
      H00K57_A341DisArtOpe = new String[] {""} ;
      H00K57_A1430DisLoc = new String[] {""} ;
      H00K57_A1052DisObs = new String[] {""} ;
      H00K57_A11734DisCnoEncO = new String[] {""} ;
      H00K57_A2310DisCliDes = new int[1] ;
      H00K57_A2009DisTipDis = new String[] {""} ;
      H00K57_n2009DisTipDis = new boolean[] {false} ;
      H00K57_A9786DisItem5 = new String[] {""} ;
      H00K57_A5350DisObsAnc = new String[] {""} ;
      H00K57_A5349DisObsGrm = new String[] {""} ;
      H00K57_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A1906DisGraAca = new short[1] ;
      H00K57_A3132DisGraCru2 = new short[1] ;
      H00K57_A3131DisGraAca2 = new short[1] ;
      H00K57_A3130DisAncSal3 = new short[1] ;
      H00K57_A3129DisAncSal2 = new short[1] ;
      H00K57_A3128DisAncSal1 = new short[1] ;
      H00K57_A3127DisNumCor = new short[1] ;
      H00K57_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K57_A1233DisArtAc2 = new short[1] ;
      GXv_int5 = new short[1] ;
      H00K512_AGRID_nRecordCount = new long[1] ;
      AV62EmprNom = "" ;
      AV11HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      H00K513_A396EmprCod = new String[] {""} ;
      H00K513_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00K513_A361DisCod = new int[1] ;
      H00K514_A361DisCod = new int[1] ;
      H00K514_A396EmprCod = new String[] {""} ;
      H00K514_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26Session = httpContext.getWebSession();
      AV22ColumnsSelectorXML = "" ;
      AV64TipDsc = "" ;
      GXv_int3 = new byte[1] ;
      AV65DisEnccli = "" ;
      AV79hdr = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV28ManageFiltersXml = "" ;
      AV20ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV23UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection[1] ;
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char19 = "" ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState21 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      GXv_char20 = new String[1] ;
      GXv_int22 = new int[1] ;
      AV70Inc_obs = "" ;
      H00K515_A361DisCod = new int[1] ;
      H00K515_A396EmprCod = new String[] {""} ;
      H00K515_A129BarCod = new int[1] ;
      H00K515_A132BarCodReo = new byte[1] ;
      H00K515_A130BarCodPar = new String[] {""} ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      H00K516_A673Piezas = new int[1] ;
      X631Metros = DecimalUtil.ZERO ;
      H00K517_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      H00K518_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K519_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      H00K520_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K521_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      H00K522_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwnwdp02__default(),
         new Object[] {
             new Object[] {
            H00K52_A396EmprCod, H00K52_A764ProForCod
            }
            , new Object[] {
            H00K57_A1232DisArtAcb, H00K57_A1231DisArtAn1, H00K57_A334DisArtAnh, H00K57_A1225DisGraCru, H00K57_A359DisArtUrg, H00K57_A350DisArtRdt, H00K57_A342DisArtPes, H00K57_A336DisArtCor, H00K57_A338DisArtEnc, H00K57_A333DisArtAca,
            H00K57_A351DisArtSua, H00K57_A339DisArtLar, H00K57_A2835DisPle2, H00K57_A343DisArtPle, H00K57_A340DisArtMat, H00K57_A356DisArtUr1, H00K57_A347DisArtPu1, H00K57_A357DisArtUr2, H00K57_A348DisArtPu2, H00K57_A358DisArtUr3,
            H00K57_A349DisArtPu3, H00K57_n349DisArtPu3, H00K57_A353DisArtTr1, H00K57_A344DisArtPt1, H00K57_A354DisArtTr2, H00K57_A345DisArtPt2, H00K57_A355DisArtTr3, H00K57_A346DisArtPt3, H00K57_A1196DisNumCli, H00K57_A407EmprNom,
            H00K57_n407EmprNom, H00K57_A1014DibInt, H00K57_n1014DibInt, H00K57_A1013DibCli, H00K57_n1013DibCli, H00K57_A1195DisNomCli, H00K57_A337DisArtDsc, H00K57_A279CliNom, H00K57_A361DisCod, H00K57_A367DisEst,
            H00K57_A4348DisUsrCod, H00K57_A13732DisCanRec, H00K57_n13732DisCanRec, H00K57_A13737DisMaxObsL, H00K57_n13737DisMaxObsL, H00K57_A379DisPie, H00K57_n379DisPie, H00K57_A387DisPiePie, H00K57_n387DisPiePie, H00K57_A352DisArtTip,
            H00K57_A4478DisAcaAnh, H00K57_A390DisTipCol, H00K57_n390DisTipCol, H00K57_A363DisColNum, H00K57_n363DisColNum, H00K57_A362DisColNom, H00K57_n362DisColNom, H00K57_A335DisArtCod, H00K57_A396EmprCod, H00K57_A252CliCod,
            H00K57_A392DisUniMed, H00K57_A365DisDes, H00K57_A369DisFec, H00K57_A7514DisOrdGra, H00K57_A7513DisOrdSep, H00K57_A7738DisMaqEst, H00K57_A2926DisPla, H00K57_A11864Nxt_artcli, H00K57_A11867DptoDsc, H00K57_n11867DptoDsc,
            H00K57_A11863DptoID, H00K57_n11863DptoID, H00K57_A11866DesaDsc, H00K57_n11866DesaDsc, H00K57_A11862DesaID, H00K57_n11862DesaID, H00K57_A11861Nxt_statio, H00K57_A11865CpteDsc, H00K57_n11865CpteDsc, H00K57_A11860CpteId,
            H00K57_n11860CpteId, H00K57_A11859Nxt_modelo, H00K57_A7739DisExp, H00K57_A11661DisOrdComp, H00K57_A11660MarcaDsc, H00K57_n11660MarcaDsc, H00K57_A11659MarcaId, H00K57_n11659MarcaId, H00K57_A11658DisMemo2, H00K57_A11657DisMemo1,
            H00K57_A8886DisDest, H00K57_A7523DisRec, H00K57_A10887Cod_Idtx, H00K57_n10887Cod_Idtx, H00K57_A4469DisCruMts, H00K57_A4473DisLotMts, H00K57_A999DisNMez, H00K57_A4479DisAcaMar, H00K57_A366DisEnt, H00K57_A9787DisItem6,
            H00K57_A9774DisItem4, H00K57_A9773DisItem3, H00K57_A9772DisItem2, H00K57_A9771DisItem1, H00K57_A4471DisCruEnr, H00K57_A2743DisNumTex1, H00K57_A4477DisAcaBak, H00K57_A1901CliCtrl, H00K57_A4785DisNroCor, H00K57_A4014DisTin,
            H00K57_A6548DisRbMaq, H00K57_A6547DisVolMaq, H00K57_A4470DisCruKgs, H00K57_A3841DisArtMer, H00K57_A4474DisLotKgs, H00K57_A4468DisPelAnh, H00K57_A998DisNMtr, H00K57_A2402DisManCod, H00K57_A4615DisTam, H00K57_A4614DisMdlCod,
            H00K57_A5366DisAntp, H00K57_A5290DisTipCor, H00K57_A5032DisEstTip, H00K57_A5031DisCom, H00K57_n5031DisCom, H00K57_A5025DisGraCob, H00K57_A5024DisTipEst, H00K57_A4720DisDishCod, H00K57_A3309DisNumTon, H00K57_A3308DisManCod2,
            H00K57_A3307DisManCod1, H00K57_A3306DisFac, H00K57_A2833DisMtrLot, H00K57_A2832DisKgsLot, H00K57_A2831DisNumLot, H00K57_A1502DisPart, H00K57_A373DisMtrLan, H00K57_A372DisKgmLan, H00K57_A383DisPieLan, H00K57_A389DisPreMtr,
            H00K57_A388DisPreKgm, H00K57_A757PriCod, H00K57_A360DisCliNum, H00K57_A4813DisEncCli, H00K57_A370DisFecCli, H00K57_A371DisFecEnt, H00K57_A1122MaqCodDis, H00K57_n1122MaqCodDis, H00K57_A374DisNumPie, H00K57_A375DisNumUni,
            H00K57_A5405DisAntpT, H00K57_A5252DisAcc, H00K57_A341DisArtOpe, H00K57_A1430DisLoc, H00K57_A1052DisObs, H00K57_A11734DisCnoEncO, H00K57_A2310DisCliDes, H00K57_A2009DisTipDis, H00K57_n2009DisTipDis, H00K57_A9786DisItem5,
            H00K57_A5350DisObsAnc, H00K57_A5349DisObsGrm, H00K57_A1907DisRdoN, H00K57_A1908DisRdoA, H00K57_A1906DisGraAca, H00K57_A3132DisGraCru2, H00K57_A3131DisGraAca2, H00K57_A3130DisAncSal3, H00K57_A3129DisAncSal2, H00K57_A3128DisAncSal1,
            H00K57_A3127DisNumCor, H00K57_A1198DisEncAnh, H00K57_A1197DisEncCom, H00K57_A1233DisArtAc2
            }
            , new Object[] {
            H00K512_AGRID_nRecordCount
            }
            , new Object[] {
            H00K513_A396EmprCod, H00K513_A369DisFec, H00K513_A361DisCod
            }
            , new Object[] {
            H00K514_A361DisCod, H00K514_A396EmprCod, H00K514_A369DisFec
            }
            , new Object[] {
            H00K515_A361DisCod, H00K515_A396EmprCod, H00K515_A129BarCod, H00K515_A132BarCodReo, H00K515_A130BarCodPar
            }
            , new Object[] {
            H00K516_A673Piezas
            }
            , new Object[] {
            H00K517_A631Metros
            }
            , new Object[] {
            H00K518_A595Kilos
            }
            , new Object[] {
            H00K519_A595Kilos
            }
            , new Object[] {
            H00K520_A382DisPieKil
            }
            , new Object[] {
            H00K521_A631Metros
            }
            , new Object[] {
            H00K522_A384DisPieMet
            }
         }
      );
      AV145Pgmname = "WebWNwDP02" ;
      /* GeneXus formulas. */
      AV145Pgmname = "WebWNwDP02" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV29ManageFiltersExecutionStep ;
   private byte AV68Barcodreo ;
   private byte A132BarCodReo ;
   private byte gxajaxcallmode ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte A359DisArtUrg ;
   private byte A5024DisTipEst ;
   private byte A5025DisGraCob ;
   private byte A2743DisNumTex1 ;
   private byte A7513DisOrdSep ;
   private byte A7514DisOrdGra ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int9 ;
   private byte AV119GXLvl76 ;
   private byte GXv_int3[] ;
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
   private short AV112TFDisMaxObsLin ;
   private short AV113TFDisMaxObsLin_To ;
   private short AV114TFDisCanRec ;
   private short AV115TFDisCanRec_To ;
   private short AV16OrderedBy ;
   private short AV83Detpie ;
   private short AV88Tnwdp04 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV116GridActions ;
   private short A352DisArtTip ;
   private short A346DisArtPt3 ;
   private short A345DisArtPt2 ;
   private short A344DisArtPt1 ;
   private short A349DisArtPu3 ;
   private short A348DisArtPu2 ;
   private short A347DisArtPu1 ;
   private short A342DisArtPes ;
   private short A1225DisGraCru ;
   private short A334DisArtAnh ;
   private short A1231DisArtAn1 ;
   private short A1232DisArtAcb ;
   private short A1233DisArtAc2 ;
   private short A3127DisNumCor ;
   private short A3128DisAncSal1 ;
   private short A3129DisAncSal2 ;
   private short A3130DisAncSal3 ;
   private short A3131DisGraAca2 ;
   private short A3132DisGraCru2 ;
   private short A1906DisGraAca ;
   private short A4478DisAcaAnh ;
   private short A374DisNumPie ;
   private short A387DisPiePie ;
   private short A383DisPieLan ;
   private short A372DisKgmLan ;
   private short A373DisMtrLan ;
   private short A379DisPie ;
   private short A386DisPieNor ;
   private short A1502DisPart ;
   private short A3307DisManCod1 ;
   private short A3308DisManCod2 ;
   private short A2402DisManCod ;
   private short A4468DisPelAnh ;
   private short A11860CpteId ;
   private short A11862DesaID ;
   private short A11863DptoID ;
   private short A13737DisMaxObsL ;
   private short A13732DisCanRec ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV141Webwnwdp02ds_21_tfdismaxobslin ;
   private short AV142Webwnwdp02ds_22_tfdismaxobslin_to ;
   private short AV143Webwnwdp02ds_23_tfdiscanrec ;
   private short AV144Webwnwdp02ds_24_tfdiscanrec_to ;
   private short GXv_int5[] ;
   private short AV81Genhdm ;
   private short AV82Genacc ;
   private short AV84Vertex ;
   private short AV85Tintest ;
   private short AV86Endutex ;
   private short AV87Usuariofiltro ;
   private short AV90Tinest ;
   private short AV89FlagTipDis ;
   private int edtDibCli_Visible ;
   private int edtDibInt_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_54 ;
   private int nGXsfl_54_idx=1 ;
   private int AV34TFDisCod ;
   private int AV35TFDisCod_To ;
   private int AV36TFCliCod ;
   private int AV37TFCliCod_To ;
   private int AV50TFDisColNum ;
   private int AV51TFDisColNum_To ;
   private int AV54TFDibInt ;
   private int AV55TFDibInt_To ;
   private int AV67barcod ;
   private int AV66DisCod ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV110DatoCliCod ;
   private int edtavDatoclicod_Enabled ;
   private int edtavDisfec_Enabled ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1014DibInt ;
   private int A1196DisNumCli ;
   private int A2310DisCliDes ;
   private int A253CliCodDis ;
   private int A2831DisNumLot ;
   private int A6547DisVolMaq ;
   private int A4785DisNroCor ;
   private int gxdynajaxindex ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV122Webwnwdp02ds_2_tfdiscod ;
   private int AV123Webwnwdp02ds_3_tfdiscod_to ;
   private int AV124Webwnwdp02ds_4_tfclicod ;
   private int AV125Webwnwdp02ds_5_tfclicod_to ;
   private int AV135Webwnwdp02ds_15_tfdiscolnum ;
   private int AV136Webwnwdp02ds_16_tfdiscolnum_to ;
   private int AV139Webwnwdp02ds_19_tfdibint ;
   private int AV140Webwnwdp02ds_20_tfdibint_to ;
   private int AV77discodp ;
   private int AV104CliCod ;
   private int edtDisCod_Visible ;
   private int edtCliCod_Visible ;
   private int edtDisFec_Visible ;
   private int edtDisArtCod_Visible ;
   private int edtDisArtDsc_Visible ;
   private int edtDisColNom_Visible ;
   private int edtDisNomCli_Visible ;
   private int edtDisColNum_Visible ;
   private int edtDisMaxObsL_Visible ;
   private int edtDisCanRec_Visible ;
   private int AV57PageToGo ;
   private int AV146GXV1 ;
   private int GXv_int22[] ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int X673Piezas ;
   private long GRID_nFirstRecordOnPage ;
   private long AV58GridCurrentPage ;
   private long AV59GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A391DisUni ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private java.math.BigDecimal A4474DisLotKgs ;
   private java.math.BigDecimal A3841DisArtMer ;
   private java.math.BigDecimal A4470DisCruKgs ;
   private java.math.BigDecimal A6548DisRbMaq ;
   private java.math.BigDecimal A4473DisLotMts ;
   private java.math.BigDecimal A4469DisCruMts ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private java.math.BigDecimal X384DisPieMet ;
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
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String sGXsfl_54_idx="0001" ;
   private String edtDibCli_Internalname ;
   private String edtDibInt_Internalname ;
   private String AV6EmprCod ;
   private String AV8pricod ;
   private String AV5DisUsrcod ;
   private String AV42TFDisArtCod ;
   private String AV43TFDisArtCod_Sel ;
   private String AV44TFDisArtDsc ;
   private String AV45TFDisArtDsc_Sel ;
   private String AV46TFDisColNom ;
   private String AV47TFDisColNom_Sel ;
   private String AV48TFDisNomCli ;
   private String AV49TFDisNomCli_Sel ;
   private String AV52TFDibCli ;
   private String AV53TFDibCli_Sel ;
   private String AV145Pgmname ;
   private String AV69barcodpar ;
   private String A130BarCodPar ;
   private String AV63UsurCod ;
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
   private String edtavDatoclicod_Internalname ;
   private String edtavDatoclicod_Jsonclick ;
   private String divFiltros_Internalname ;
   private String edtavDisfec_Internalname ;
   private String edtavDisfec_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_disfecauxdates_Internalname ;
   private String edtavDdo_disfecauxdate_Internalname ;
   private String edtavDdo_disfecauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtEmprCod_Internalname ;
   private String A4348DisUsrCod ;
   private String edtDisUsrCod_Internalname ;
   private String edtDisCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String edtDisFec_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Internalname ;
   private String A362DisColNom ;
   private String edtDisColNom_Internalname ;
   private String A1195DisNomCli ;
   private String edtDisNomCli_Internalname ;
   private String edtDisColNum_Internalname ;
   private String A1013DibCli ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtDisTipCol_Internalname ;
   private String A12116DisTipCD ;
   private String edtDisTipCD_Internalname ;
   private String edtDisNumCli_Internalname ;
   private String edtDisArtTip_Internalname ;
   private String A12115DisArtTipD ;
   private String edtDisArtTipD_Internalname ;
   private String edtDisArtPt3_Internalname ;
   private String A355DisArtTr3 ;
   private String edtDisArtTr3_Internalname ;
   private String edtDisArtPt2_Internalname ;
   private String A354DisArtTr2 ;
   private String edtDisArtTr2_Internalname ;
   private String edtDisArtPt1_Internalname ;
   private String A353DisArtTr1 ;
   private String edtDisArtTr1_Internalname ;
   private String edtDisArtPu3_Internalname ;
   private String A358DisArtUr3 ;
   private String edtDisArtUr3_Internalname ;
   private String edtDisArtPu2_Internalname ;
   private String A357DisArtUr2 ;
   private String edtDisArtUr2_Internalname ;
   private String edtDisArtPu1_Internalname ;
   private String A356DisArtUr1 ;
   private String edtDisArtUr1_Internalname ;
   private String A340DisArtMat ;
   private String edtDisArtMat_Internalname ;
   private String A343DisArtPle ;
   private String edtDisArtPle_Internalname ;
   private String A2835DisPle2 ;
   private String edtDisPle2_Internalname ;
   private String A339DisArtLar ;
   private String edtDisArtLar_Internalname ;
   private String A351DisArtSua ;
   private String edtDisArtSua_Internalname ;
   private String A333DisArtAca ;
   private String edtDisArtAca_Internalname ;
   private String A338DisArtEnc ;
   private String A336DisArtCor ;
   private String edtDisArtPes_Internalname ;
   private String edtDisArtRdt_Internalname ;
   private String edtDisArtUrg_Internalname ;
   private String edtDisGraCru_Internalname ;
   private String edtDisArtAnh_Internalname ;
   private String edtDisArtAn1_Internalname ;
   private String edtDisArtAcb_Internalname ;
   private String edtDisArtAc2_Internalname ;
   private String edtDisEncCom_Internalname ;
   private String edtDisEncAnh_Internalname ;
   private String edtDisNumCor_Internalname ;
   private String edtDisAncSal1_Internalname ;
   private String edtDisAncSal2_Internalname ;
   private String edtDisAncSal3_Internalname ;
   private String edtDisGraAca2_Internalname ;
   private String edtDisGraCru2_Internalname ;
   private String edtDisGraAca_Internalname ;
   private String edtDisRdoA_Internalname ;
   private String edtDisRdoN_Internalname ;
   private String A5349DisObsGrm ;
   private String edtDisObsGrm_Internalname ;
   private String A5350DisObsAnc ;
   private String edtDisObsAnc_Internalname ;
   private String A9786DisItem5 ;
   private String edtDisItem5_Internalname ;
   private String A2009DisTipDis ;
   private String edtDisTipDis_Internalname ;
   private String edtDisCliDes_Internalname ;
   private String edtDisCnoEncO_Internalname ;
   private String A1052DisObs ;
   private String edtDisObs_Internalname ;
   private String edtDisAcaAnh_Internalname ;
   private String A9717Tb1_Dscf ;
   private String edtTb1_Dscf_Internalname ;
   private String A475FindCol ;
   private String edtFindCol_Internalname ;
   private String A1430DisLoc ;
   private String edtDisLoc_Internalname ;
   private String A341DisArtOpe ;
   private String edtDisArtOpe_Internalname ;
   private String A5252DisAcc ;
   private String A5405DisAntpT ;
   private String edtDisAntpT_Internalname ;
   private String edtDisNumUni_Internalname ;
   private String edtDisNumPie_Internalname ;
   private String A1122MaqCodDis ;
   private String edtMaqCodDis_Internalname ;
   private String edtDisFecEnt_Internalname ;
   private String edtDisFecCli_Internalname ;
   private String A4813DisEncCli ;
   private String edtDisEncCli_Internalname ;
   private String A360DisCliNum ;
   private String edtDisCliNum_Internalname ;
   private String A757PriCod ;
   private String edtDisPiePie_Internalname ;
   private String edtDisPieMtr_Internalname ;
   private String edtDisPieKgm_Internalname ;
   private String edtDisPreKgm_Internalname ;
   private String edtDisPreMtr_Internalname ;
   private String edtDisPieLan_Internalname ;
   private String edtDisKgmLan_Internalname ;
   private String edtDisMtrLan_Internalname ;
   private String A399EmprCodDis ;
   private String edtEmprCodDis_Internalname ;
   private String edtCliCodDis_Internalname ;
   private String edtDisPie_Internalname ;
   private String edtDisUni_Internalname ;
   private String edtDisPieNor_Internalname ;
   private String edtDisPart_Internalname ;
   private String edtDisNumLot_Internalname ;
   private String edtDisKgsLot_Internalname ;
   private String edtDisMtrLot_Internalname ;
   private String A3306DisFac ;
   private String edtDisManCod1_Internalname ;
   private String edtDisManCod2_Internalname ;
   private String A3309DisNumTon ;
   private String edtDisNumTon_Internalname ;
   private String A4720DisDishCod ;
   private String edtDisDishCod_Internalname ;
   private String A365DisDes ;
   private String edtDisTipEst_Internalname ;
   private String edtDisGraCob_Internalname ;
   private String A5031DisCom ;
   private String edtDisCom_Internalname ;
   private String A5032DisEstTip ;
   private String A5290DisTipCor ;
   private String edtDisTipCor_Internalname ;
   private String A5366DisAntp ;
   private String edtDisAntp_Internalname ;
   private String A4614DisMdlCod ;
   private String edtDisMdlCod_Internalname ;
   private String A4615DisTam ;
   private String edtDisTam_Internalname ;
   private String edtDisManCod_Internalname ;
   private String A998DisNMtr ;
   private String edtDisNMtr_Internalname ;
   private String edtDisPelAnh_Internalname ;
   private String edtDisLotKgs_Internalname ;
   private String edtDisArtMer_Internalname ;
   private String edtDisCruKgs_Internalname ;
   private String edtDisVolMaq_Internalname ;
   private String edtDisRbMaq_Internalname ;
   private String A4014DisTin ;
   private String edtDisNroCor_Internalname ;
   private String A1901CliCtrl ;
   private String A4477DisAcaBak ;
   private String edtDisNumTex1_Internalname ;
   private String A4471DisCruEnr ;
   private String edtDisCruEnr_Internalname ;
   private String A9771DisItem1 ;
   private String edtDisItem1_Internalname ;
   private String A9772DisItem2 ;
   private String edtDisItem2_Internalname ;
   private String A9773DisItem3 ;
   private String edtDisItem3_Internalname ;
   private String A9774DisItem4 ;
   private String edtDisItem4_Internalname ;
   private String A9787DisItem6 ;
   private String edtDisItem6_Internalname ;
   private String A366DisEnt ;
   private String edtDisEnt_Internalname ;
   private String A4479DisAcaMar ;
   private String edtDisAcaMar_Internalname ;
   private String A999DisNMez ;
   private String edtDisNMez_Internalname ;
   private String edtDisLotMts_Internalname ;
   private String edtDisCruMts_Internalname ;
   private String A10887Cod_Idtx ;
   private String edtCod_Idtx_Internalname ;
   private String A7523DisRec ;
   private String edtDisRec_Internalname ;
   private String A8886DisDest ;
   private String edtDisDest_Internalname ;
   private String edtDisMemo1_Internalname ;
   private String edtDisMemo2_Internalname ;
   private String A11659MarcaId ;
   private String edtMarcaId_Internalname ;
   private String A11660MarcaDsc ;
   private String edtMarcaDsc_Internalname ;
   private String edtDisOrdComp_Internalname ;
   private String A7739DisExp ;
   private String A11859Nxt_modelo ;
   private String edtNxt_modelo_Internalname ;
   private String edtCpteId_Internalname ;
   private String A11865CpteDsc ;
   private String edtCpteDsc_Internalname ;
   private String A11861Nxt_statio ;
   private String edtNxt_statio_Internalname ;
   private String edtDesaID_Internalname ;
   private String A11866DesaDsc ;
   private String edtDesaDsc_Internalname ;
   private String edtDptoID_Internalname ;
   private String A11867DptoDsc ;
   private String edtDptoDsc_Internalname ;
   private String A11864Nxt_artcli ;
   private String edtNxt_artcli_Internalname ;
   private String A2926DisPla ;
   private String A7738DisMaqEst ;
   private String edtDisMaqEst_Internalname ;
   private String edtDisMaxObsL_Internalname ;
   private String edtDisCanRec_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l764ProForCod ;
   private String lV127Webwnwdp02ds_7_tfdisartcod ;
   private String lV129Webwnwdp02ds_9_tfdisartdsc ;
   private String lV131Webwnwdp02ds_11_tfdiscolnom ;
   private String lV133Webwnwdp02ds_13_tfdisnomcli ;
   private String lV137Webwnwdp02ds_17_tfdibcli ;
   private String lV105DisCliNum ;
   private String lV106DisArtCod ;
   private String lV107Disartdsc ;
   private String lV108DisColNom ;
   private String lV109Disnomcli ;
   private String AV128Webwnwdp02ds_8_tfdisartcod_sel ;
   private String AV127Webwnwdp02ds_7_tfdisartcod ;
   private String AV130Webwnwdp02ds_10_tfdisartdsc_sel ;
   private String AV129Webwnwdp02ds_9_tfdisartdsc ;
   private String AV132Webwnwdp02ds_12_tfdiscolnom_sel ;
   private String AV131Webwnwdp02ds_11_tfdiscolnom ;
   private String AV134Webwnwdp02ds_14_tfdisnomcli_sel ;
   private String AV133Webwnwdp02ds_13_tfdisnomcli ;
   private String AV138Webwnwdp02ds_18_tfdibcli_sel ;
   private String AV137Webwnwdp02ds_17_tfdibcli ;
   private String AV105DisCliNum ;
   private String AV106DisArtCod ;
   private String AV107Disartdsc ;
   private String AV108DisColNom ;
   private String AV109Disnomcli ;
   private String edtavFilterfulltext_Internalname ;
   private String AV62EmprNom ;
   private String AV64TipDsc ;
   private String AV65DisEnccli ;
   private String GXt_char19 ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char16 ;
   private String GXv_char6[] ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char20[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtDisUsrCod_Jsonclick ;
   private String edtDisCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtDisFec_Jsonclick ;
   private String edtDisArtCod_Jsonclick ;
   private String edtDisArtDsc_Jsonclick ;
   private String edtDisColNom_Jsonclick ;
   private String edtDisNomCli_Jsonclick ;
   private String edtDisColNum_Jsonclick ;
   private String edtDibCli_Jsonclick ;
   private String edtDibInt_Jsonclick ;
   private String edtDisUniMed_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtDisTipCol_Jsonclick ;
   private String edtDisTipCD_Jsonclick ;
   private String edtDisNumCli_Jsonclick ;
   private String edtDisArtTip_Jsonclick ;
   private String edtDisArtTipD_Jsonclick ;
   private String edtDisArtPt3_Jsonclick ;
   private String edtDisArtTr3_Jsonclick ;
   private String edtDisArtPt2_Jsonclick ;
   private String edtDisArtTr2_Jsonclick ;
   private String edtDisArtPt1_Jsonclick ;
   private String edtDisArtTr1_Jsonclick ;
   private String edtDisArtPu3_Jsonclick ;
   private String edtDisArtUr3_Jsonclick ;
   private String edtDisArtPu2_Jsonclick ;
   private String edtDisArtUr2_Jsonclick ;
   private String edtDisArtPu1_Jsonclick ;
   private String edtDisArtUr1_Jsonclick ;
   private String edtDisArtMat_Jsonclick ;
   private String edtDisArtPle_Jsonclick ;
   private String edtDisPle2_Jsonclick ;
   private String edtDisArtLar_Jsonclick ;
   private String edtDisArtSua_Jsonclick ;
   private String edtDisArtAca_Jsonclick ;
   private String edtDisArtPes_Jsonclick ;
   private String edtDisArtRdt_Jsonclick ;
   private String edtDisArtUrg_Jsonclick ;
   private String edtDisGraCru_Jsonclick ;
   private String edtDisArtAnh_Jsonclick ;
   private String edtDisArtAn1_Jsonclick ;
   private String edtDisArtAcb_Jsonclick ;
   private String edtDisArtAc2_Jsonclick ;
   private String edtDisEncCom_Jsonclick ;
   private String edtDisEncAnh_Jsonclick ;
   private String edtDisNumCor_Jsonclick ;
   private String edtDisAncSal1_Jsonclick ;
   private String edtDisAncSal2_Jsonclick ;
   private String edtDisAncSal3_Jsonclick ;
   private String edtDisGraAca2_Jsonclick ;
   private String edtDisGraCru2_Jsonclick ;
   private String edtDisGraAca_Jsonclick ;
   private String edtDisRdoA_Jsonclick ;
   private String edtDisRdoN_Jsonclick ;
   private String edtDisObsGrm_Jsonclick ;
   private String edtDisObsAnc_Jsonclick ;
   private String edtDisItem5_Jsonclick ;
   private String edtDisTipDis_Jsonclick ;
   private String edtDisCliDes_Jsonclick ;
   private String edtDisCnoEncO_Jsonclick ;
   private String edtDisObs_Jsonclick ;
   private String edtDisAcaAnh_Jsonclick ;
   private String edtTb1_Dscf_Jsonclick ;
   private String edtFindCol_Jsonclick ;
   private String edtDisLoc_Jsonclick ;
   private String edtDisArtOpe_Jsonclick ;
   private String edtDisAntpT_Jsonclick ;
   private String edtDisNumUni_Jsonclick ;
   private String edtDisNumPie_Jsonclick ;
   private String edtMaqCodDis_Jsonclick ;
   private String edtDisFecEnt_Jsonclick ;
   private String edtDisFecCli_Jsonclick ;
   private String edtDisEncCli_Jsonclick ;
   private String edtDisCliNum_Jsonclick ;
   private String edtDisPiePie_Jsonclick ;
   private String edtDisPieMtr_Jsonclick ;
   private String edtDisPieKgm_Jsonclick ;
   private String edtDisPreKgm_Jsonclick ;
   private String edtDisPreMtr_Jsonclick ;
   private String edtDisPieLan_Jsonclick ;
   private String edtDisKgmLan_Jsonclick ;
   private String edtDisMtrLan_Jsonclick ;
   private String edtEmprCodDis_Jsonclick ;
   private String edtCliCodDis_Jsonclick ;
   private String edtDisPie_Jsonclick ;
   private String edtDisUni_Jsonclick ;
   private String edtDisPieNor_Jsonclick ;
   private String edtDisPart_Jsonclick ;
   private String edtDisNumLot_Jsonclick ;
   private String edtDisKgsLot_Jsonclick ;
   private String edtDisMtrLot_Jsonclick ;
   private String edtDisManCod1_Jsonclick ;
   private String edtDisManCod2_Jsonclick ;
   private String edtDisNumTon_Jsonclick ;
   private String edtDisDishCod_Jsonclick ;
   private String edtDisTipEst_Jsonclick ;
   private String edtDisGraCob_Jsonclick ;
   private String edtDisCom_Jsonclick ;
   private String edtDisTipCor_Jsonclick ;
   private String edtDisAntp_Jsonclick ;
   private String edtDisMdlCod_Jsonclick ;
   private String edtDisTam_Jsonclick ;
   private String edtDisManCod_Jsonclick ;
   private String edtDisNMtr_Jsonclick ;
   private String edtDisPelAnh_Jsonclick ;
   private String edtDisLotKgs_Jsonclick ;
   private String edtDisArtMer_Jsonclick ;
   private String edtDisCruKgs_Jsonclick ;
   private String edtDisVolMaq_Jsonclick ;
   private String edtDisRbMaq_Jsonclick ;
   private String edtDisNroCor_Jsonclick ;
   private String edtDisNumTex1_Jsonclick ;
   private String edtDisCruEnr_Jsonclick ;
   private String edtDisItem1_Jsonclick ;
   private String edtDisItem2_Jsonclick ;
   private String edtDisItem3_Jsonclick ;
   private String edtDisItem4_Jsonclick ;
   private String edtDisItem6_Jsonclick ;
   private String edtDisEnt_Jsonclick ;
   private String edtDisAcaMar_Jsonclick ;
   private String edtDisNMez_Jsonclick ;
   private String edtDisLotMts_Jsonclick ;
   private String edtDisCruMts_Jsonclick ;
   private String edtCod_Idtx_Jsonclick ;
   private String edtDisRec_Jsonclick ;
   private String edtDisDest_Jsonclick ;
   private String edtDisMemo1_Jsonclick ;
   private String edtDisMemo2_Jsonclick ;
   private String edtMarcaId_Jsonclick ;
   private String edtMarcaDsc_Jsonclick ;
   private String edtDisOrdComp_Jsonclick ;
   private String edtNxt_modelo_Jsonclick ;
   private String edtCpteId_Jsonclick ;
   private String edtCpteDsc_Jsonclick ;
   private String edtNxt_statio_Jsonclick ;
   private String edtDesaID_Jsonclick ;
   private String edtDesaDsc_Jsonclick ;
   private String edtDptoID_Jsonclick ;
   private String edtDptoDsc_Jsonclick ;
   private String edtNxt_artcli_Jsonclick ;
   private String edtDisMaqEst_Jsonclick ;
   private String edtDisMaxObsL_Jsonclick ;
   private String edtDisCanRec_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV7DisFec ;
   private java.util.Date AV38TFDisFec ;
   private java.util.Date AV40DDO_DisFecAuxDate ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date AV126Webwnwdp02ds_6_tfdisfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_54_Refreshing=false ;
   private boolean AV17OrderedDsc ;
   private boolean AV111ModeloSDT ;
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
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean n407EmprNom ;
   private boolean n390DisTipCol ;
   private boolean n349DisArtPu3 ;
   private boolean n2009DisTipDis ;
   private boolean n1122MaqCodDis ;
   private boolean n387DisPiePie ;
   private boolean n379DisPie ;
   private boolean n5031DisCom ;
   private boolean n10887Cod_Idtx ;
   private boolean n11659MarcaId ;
   private boolean n11660MarcaDsc ;
   private boolean n11860CpteId ;
   private boolean n11865CpteDsc ;
   private boolean n11862DesaID ;
   private boolean n11866DesaDsc ;
   private boolean n11863DptoID ;
   private boolean n11867DptoDsc ;
   private boolean n13737DisMaxObsL ;
   private boolean n13732DisCanRec ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV22ColumnsSelectorXML ;
   private String AV28ManageFiltersXml ;
   private String AV23UserCustomValue ;
   private String AV19FilterFullText ;
   private String AV80Station ;
   private String A11734DisCnoEncO ;
   private String A11657DisMemo1 ;
   private String A11658DisMemo2 ;
   private String A11661DisOrdComp ;
   private String lV121Webwnwdp02ds_1_filterfulltext ;
   private String AV121Webwnwdp02ds_1_filterfulltext ;
   private String AV79hdr ;
   private String AV20ExcelFilename ;
   private String AV21ErrorMessage ;
   private String AV70Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbDisEst ;
   private ICheckbox chkDisArtEnc ;
   private ICheckbox chkDisArtCor ;
   private ICheckbox chkDisAcc ;
   private ICheckbox chkPriCod ;
   private ICheckbox chkDisFac ;
   private ICheckbox chkDisDes ;
   private ICheckbox chkDisEstTip ;
   private ICheckbox chkDisTin ;
   private ICheckbox chkCliCtrl ;
   private ICheckbox chkDisAcaBak ;
   private ICheckbox chkDisExp ;
   private ICheckbox chkDisPla ;
   private ICheckbox chkDisOrdSep ;
   private ICheckbox chkDisOrdGra ;
   private IDataStoreProvider pr_default ;
   private String[] H00K52_A396EmprCod ;
   private String[] H00K52_A764ProForCod ;
   private short[] H00K57_A1232DisArtAcb ;
   private short[] H00K57_A1231DisArtAn1 ;
   private short[] H00K57_A334DisArtAnh ;
   private short[] H00K57_A1225DisGraCru ;
   private byte[] H00K57_A359DisArtUrg ;
   private java.math.BigDecimal[] H00K57_A350DisArtRdt ;
   private short[] H00K57_A342DisArtPes ;
   private String[] H00K57_A336DisArtCor ;
   private String[] H00K57_A338DisArtEnc ;
   private String[] H00K57_A333DisArtAca ;
   private String[] H00K57_A351DisArtSua ;
   private String[] H00K57_A339DisArtLar ;
   private String[] H00K57_A2835DisPle2 ;
   private String[] H00K57_A343DisArtPle ;
   private String[] H00K57_A340DisArtMat ;
   private String[] H00K57_A356DisArtUr1 ;
   private short[] H00K57_A347DisArtPu1 ;
   private String[] H00K57_A357DisArtUr2 ;
   private short[] H00K57_A348DisArtPu2 ;
   private String[] H00K57_A358DisArtUr3 ;
   private short[] H00K57_A349DisArtPu3 ;
   private boolean[] H00K57_n349DisArtPu3 ;
   private String[] H00K57_A353DisArtTr1 ;
   private short[] H00K57_A344DisArtPt1 ;
   private String[] H00K57_A354DisArtTr2 ;
   private short[] H00K57_A345DisArtPt2 ;
   private String[] H00K57_A355DisArtTr3 ;
   private short[] H00K57_A346DisArtPt3 ;
   private int[] H00K57_A1196DisNumCli ;
   private String[] H00K57_A407EmprNom ;
   private boolean[] H00K57_n407EmprNom ;
   private int[] H00K57_A1014DibInt ;
   private boolean[] H00K57_n1014DibInt ;
   private String[] H00K57_A1013DibCli ;
   private boolean[] H00K57_n1013DibCli ;
   private String[] H00K57_A1195DisNomCli ;
   private String[] H00K57_A337DisArtDsc ;
   private String[] H00K57_A279CliNom ;
   private int[] H00K57_A361DisCod ;
   private byte[] H00K57_A367DisEst ;
   private String[] H00K57_A4348DisUsrCod ;
   private short[] H00K57_A13732DisCanRec ;
   private boolean[] H00K57_n13732DisCanRec ;
   private short[] H00K57_A13737DisMaxObsL ;
   private boolean[] H00K57_n13737DisMaxObsL ;
   private short[] H00K57_A379DisPie ;
   private boolean[] H00K57_n379DisPie ;
   private short[] H00K57_A387DisPiePie ;
   private boolean[] H00K57_n387DisPiePie ;
   private short[] H00K57_A352DisArtTip ;
   private short[] H00K57_A4478DisAcaAnh ;
   private byte[] H00K57_A390DisTipCol ;
   private boolean[] H00K57_n390DisTipCol ;
   private int[] H00K57_A363DisColNum ;
   private boolean[] H00K57_n363DisColNum ;
   private String[] H00K57_A362DisColNom ;
   private boolean[] H00K57_n362DisColNom ;
   private String[] H00K57_A335DisArtCod ;
   private String[] H00K57_A396EmprCod ;
   private int[] H00K57_A252CliCod ;
   private String[] H00K57_A392DisUniMed ;
   private String[] H00K57_A365DisDes ;
   private java.util.Date[] H00K57_A369DisFec ;
   private byte[] H00K57_A7514DisOrdGra ;
   private byte[] H00K57_A7513DisOrdSep ;
   private String[] H00K57_A7738DisMaqEst ;
   private String[] H00K57_A2926DisPla ;
   private String[] H00K57_A11864Nxt_artcli ;
   private String[] H00K57_A11867DptoDsc ;
   private boolean[] H00K57_n11867DptoDsc ;
   private short[] H00K57_A11863DptoID ;
   private boolean[] H00K57_n11863DptoID ;
   private String[] H00K57_A11866DesaDsc ;
   private boolean[] H00K57_n11866DesaDsc ;
   private short[] H00K57_A11862DesaID ;
   private boolean[] H00K57_n11862DesaID ;
   private String[] H00K57_A11861Nxt_statio ;
   private String[] H00K57_A11865CpteDsc ;
   private boolean[] H00K57_n11865CpteDsc ;
   private short[] H00K57_A11860CpteId ;
   private boolean[] H00K57_n11860CpteId ;
   private String[] H00K57_A11859Nxt_modelo ;
   private String[] H00K57_A7739DisExp ;
   private String[] H00K57_A11661DisOrdComp ;
   private String[] H00K57_A11660MarcaDsc ;
   private boolean[] H00K57_n11660MarcaDsc ;
   private String[] H00K57_A11659MarcaId ;
   private boolean[] H00K57_n11659MarcaId ;
   private String[] H00K57_A11658DisMemo2 ;
   private String[] H00K57_A11657DisMemo1 ;
   private String[] H00K57_A8886DisDest ;
   private String[] H00K57_A7523DisRec ;
   private String[] H00K57_A10887Cod_Idtx ;
   private boolean[] H00K57_n10887Cod_Idtx ;
   private java.math.BigDecimal[] H00K57_A4469DisCruMts ;
   private java.math.BigDecimal[] H00K57_A4473DisLotMts ;
   private String[] H00K57_A999DisNMez ;
   private String[] H00K57_A4479DisAcaMar ;
   private String[] H00K57_A366DisEnt ;
   private String[] H00K57_A9787DisItem6 ;
   private String[] H00K57_A9774DisItem4 ;
   private String[] H00K57_A9773DisItem3 ;
   private String[] H00K57_A9772DisItem2 ;
   private String[] H00K57_A9771DisItem1 ;
   private String[] H00K57_A4471DisCruEnr ;
   private byte[] H00K57_A2743DisNumTex1 ;
   private String[] H00K57_A4477DisAcaBak ;
   private String[] H00K57_A1901CliCtrl ;
   private int[] H00K57_A4785DisNroCor ;
   private String[] H00K57_A4014DisTin ;
   private java.math.BigDecimal[] H00K57_A6548DisRbMaq ;
   private int[] H00K57_A6547DisVolMaq ;
   private java.math.BigDecimal[] H00K57_A4470DisCruKgs ;
   private java.math.BigDecimal[] H00K57_A3841DisArtMer ;
   private java.math.BigDecimal[] H00K57_A4474DisLotKgs ;
   private short[] H00K57_A4468DisPelAnh ;
   private String[] H00K57_A998DisNMtr ;
   private short[] H00K57_A2402DisManCod ;
   private String[] H00K57_A4615DisTam ;
   private String[] H00K57_A4614DisMdlCod ;
   private String[] H00K57_A5366DisAntp ;
   private String[] H00K57_A5290DisTipCor ;
   private String[] H00K57_A5032DisEstTip ;
   private String[] H00K57_A5031DisCom ;
   private boolean[] H00K57_n5031DisCom ;
   private byte[] H00K57_A5025DisGraCob ;
   private byte[] H00K57_A5024DisTipEst ;
   private String[] H00K57_A4720DisDishCod ;
   private String[] H00K57_A3309DisNumTon ;
   private short[] H00K57_A3308DisManCod2 ;
   private short[] H00K57_A3307DisManCod1 ;
   private String[] H00K57_A3306DisFac ;
   private java.math.BigDecimal[] H00K57_A2833DisMtrLot ;
   private java.math.BigDecimal[] H00K57_A2832DisKgsLot ;
   private int[] H00K57_A2831DisNumLot ;
   private short[] H00K57_A1502DisPart ;
   private short[] H00K57_A373DisMtrLan ;
   private short[] H00K57_A372DisKgmLan ;
   private short[] H00K57_A383DisPieLan ;
   private java.math.BigDecimal[] H00K57_A389DisPreMtr ;
   private java.math.BigDecimal[] H00K57_A388DisPreKgm ;
   private String[] H00K57_A757PriCod ;
   private String[] H00K57_A360DisCliNum ;
   private String[] H00K57_A4813DisEncCli ;
   private java.util.Date[] H00K57_A370DisFecCli ;
   private java.util.Date[] H00K57_A371DisFecEnt ;
   private String[] H00K57_A1122MaqCodDis ;
   private boolean[] H00K57_n1122MaqCodDis ;
   private short[] H00K57_A374DisNumPie ;
   private java.math.BigDecimal[] H00K57_A375DisNumUni ;
   private String[] H00K57_A5405DisAntpT ;
   private String[] H00K57_A5252DisAcc ;
   private String[] H00K57_A341DisArtOpe ;
   private String[] H00K57_A1430DisLoc ;
   private String[] H00K57_A1052DisObs ;
   private String[] H00K57_A11734DisCnoEncO ;
   private int[] H00K57_A2310DisCliDes ;
   private String[] H00K57_A2009DisTipDis ;
   private boolean[] H00K57_n2009DisTipDis ;
   private String[] H00K57_A9786DisItem5 ;
   private String[] H00K57_A5350DisObsAnc ;
   private String[] H00K57_A5349DisObsGrm ;
   private java.math.BigDecimal[] H00K57_A1907DisRdoN ;
   private java.math.BigDecimal[] H00K57_A1908DisRdoA ;
   private short[] H00K57_A1906DisGraAca ;
   private short[] H00K57_A3132DisGraCru2 ;
   private short[] H00K57_A3131DisGraAca2 ;
   private short[] H00K57_A3130DisAncSal3 ;
   private short[] H00K57_A3129DisAncSal2 ;
   private short[] H00K57_A3128DisAncSal1 ;
   private short[] H00K57_A3127DisNumCor ;
   private java.math.BigDecimal[] H00K57_A1198DisEncAnh ;
   private java.math.BigDecimal[] H00K57_A1197DisEncCom ;
   private short[] H00K57_A1233DisArtAc2 ;
   private long[] H00K512_AGRID_nRecordCount ;
   private String[] H00K513_A396EmprCod ;
   private java.util.Date[] H00K513_A369DisFec ;
   private int[] H00K513_A361DisCod ;
   private int[] H00K514_A361DisCod ;
   private String[] H00K514_A396EmprCod ;
   private java.util.Date[] H00K514_A369DisFec ;
   private int[] H00K515_A361DisCod ;
   private String[] H00K515_A396EmprCod ;
   private int[] H00K515_A129BarCod ;
   private byte[] H00K515_A132BarCodReo ;
   private String[] H00K515_A130BarCodPar ;
   private int[] H00K516_A673Piezas ;
   private java.math.BigDecimal[] H00K517_A631Metros ;
   private java.math.BigDecimal[] H00K518_A595Kilos ;
   private java.math.BigDecimal[] H00K519_A595Kilos ;
   private java.math.BigDecimal[] H00K520_A382DisPieKil ;
   private java.math.BigDecimal[] H00K521_A631Metros ;
   private java.math.BigDecimal[] H00K522_A384DisPieMet ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV27ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState21[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV56DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class webwnwdp02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00K57( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV122Webwnwdp02ds_2_tfdiscod ,
                                          int AV123Webwnwdp02ds_3_tfdiscod_to ,
                                          int AV124Webwnwdp02ds_4_tfclicod ,
                                          int AV125Webwnwdp02ds_5_tfclicod_to ,
                                          java.util.Date AV126Webwnwdp02ds_6_tfdisfec ,
                                          String AV128Webwnwdp02ds_8_tfdisartcod_sel ,
                                          String AV127Webwnwdp02ds_7_tfdisartcod ,
                                          String AV130Webwnwdp02ds_10_tfdisartdsc_sel ,
                                          String AV129Webwnwdp02ds_9_tfdisartdsc ,
                                          String AV132Webwnwdp02ds_12_tfdiscolnom_sel ,
                                          String AV131Webwnwdp02ds_11_tfdiscolnom ,
                                          String AV134Webwnwdp02ds_14_tfdisnomcli_sel ,
                                          String AV133Webwnwdp02ds_13_tfdisnomcli ,
                                          int AV135Webwnwdp02ds_15_tfdiscolnum ,
                                          int AV136Webwnwdp02ds_16_tfdiscolnum_to ,
                                          String AV138Webwnwdp02ds_18_tfdibcli_sel ,
                                          String AV137Webwnwdp02ds_17_tfdibcli ,
                                          int AV139Webwnwdp02ds_19_tfdibint ,
                                          int AV140Webwnwdp02ds_20_tfdibint_to ,
                                          int AV77discodp ,
                                          int AV104CliCod ,
                                          String AV105DisCliNum ,
                                          String AV106DisArtCod ,
                                          String AV107Disartdsc ,
                                          String AV108DisColNom ,
                                          String AV109Disnomcli ,
                                          String AV5DisUsrcod ,
                                          int A361DisCod ,
                                          int A252CliCod ,
                                          java.util.Date A369DisFec ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          String A1195DisNomCli ,
                                          int A363DisColNum ,
                                          String A1013DibCli ,
                                          int A1014DibInt ,
                                          String A360DisCliNum ,
                                          String A4348DisUsrCod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV121Webwnwdp02ds_1_filterfulltext ,
                                          short A13737DisMaxObsL ,
                                          short A13732DisCanRec ,
                                          short AV141Webwnwdp02ds_21_tfdismaxobslin ,
                                          short AV142Webwnwdp02ds_22_tfdismaxobslin_to ,
                                          short AV143Webwnwdp02ds_23_tfdiscanrec ,
                                          short AV144Webwnwdp02ds_24_tfdiscanrec_to ,
                                          String A757PriCod ,
                                          String AV8pricod ,
                                          String AV6EmprCod ,
                                          java.util.Date AV7DisFec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[57];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.DisArtAcb, T1.DisArtAn1, T1.DisArtAnh, T1.DisGraCru, T1.DisArtUrg, T1.DisArtRdt, T1.DisArtPes, T1.DisArtCor, T1.DisArtEnc, T1.DisArtAca, T1.DisArtSua, T1.DisArtLar," ;
      sSelectString += " T1.DisPle2, T1.DisArtPle, T1.DisArtMat, T1.DisArtUr1, T1.DisArtPu1, T1.DisArtUr2, T1.DisArtPu2, T1.DisArtUr3, T1.DisArtPu3, T1.DisArtTr1, T1.DisArtPt1, T1.DisArtTr2," ;
      sSelectString += " T1.DisArtPt2, T1.DisArtTr3, T1.DisArtPt3, T1.DisNumCli, T2.EmprNom, T1.DibInt, T1.DibCli, T1.DisNomCli, T1.DisArtDsc, T11.CliNom, T1.DisCod, T1.DisEst, T1.DisUsrCod," ;
      sSelectString += " COALESCE( T7.DisCanRec, 0) AS DisCanRec, COALESCE( T8.DisMaxObsL, 0) AS DisMaxObsL, COALESCE( T9.GXC1, 0) AS DisPie, COALESCE( T10.DisPiePie, 0) AS DisPiePie, T1.DisArtTip," ;
      sSelectString += " T1.DisAcaAnh, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T1.EmprCod, T1.CliCod, T1.DisUniMed, T1.DisDes, T1.DisFec, T1.DisOrdGra, T1.DisOrdSep, T1.DisMaqEst," ;
      sSelectString += " T1.DisPla, T1.Nxt_artcli, T4.DptoDsc, T1.DptoID, T6.DesaDsc, T1.DesaID, T1.Nxt_statio, T5.CpteDsc, T1.CpteId, T1.Nxt_modelo, T1.DisExp, T1.DisOrdComp, T3.MarcaDsc," ;
      sSelectString += " T1.MarcaId, T1.DisMemo2, T1.DisMemo1, T1.DisDest, T1.DisRec, T1.Cod_Idtx, T1.DisCruMts, T1.DisLotMts, T1.DisNMez, T1.DisAcaMar, T1.DisEnt, T1.DisItem6, T1.DisItem4," ;
      sSelectString += " T1.DisItem3, T1.DisItem2, T1.DisItem1, T1.DisCruEnr, T1.DisNumTex1, T1.DisAcaBak, T11.CliCtrl, T1.DisNroCor, T1.DisTin, T1.DisRbMaq, T1.DisVolMaq, T1.DisCruKgs," ;
      sSelectString += " T1.DisArtMer, T1.DisLotKgs, T1.DisPelAnh, T1.DisNMtr, T1.DisManCod, T1.DisTam, T1.DisMdlCod, T1.DisAntp, T1.DisTipCor, T1.DisEstTip, T1.DisCom, T1.DisGraCob, T1.DisTipEst," ;
      sSelectString += " T1.DisDishCod, T1.DisNumTon, T1.DisManCod2, T1.DisManCod1, T1.DisFac, T1.DisMtrLot, T1.DisKgsLot, T1.DisNumLot, T1.DisPart, T1.DisMtrLan, T1.DisKgmLan, T1.DisPieLan," ;
      sSelectString += " T1.DisPreMtr, T1.DisPreKgm, T1.PriCod, T1.DisCliNum, T1.DisEncCli, T1.DisFecCli, T1.DisFecEnt, T1.MaqCodDis, T1.DisNumPie, T1.DisNumUni, T1.DisAntpT, T1.DisAcc," ;
      sSelectString += " T1.DisArtOpe, T1.DisLoc, T1.DisObs, T1.DisCnoEncO, T1.DisCliDes, T1.DisTipDis, T1.DisItem5, T1.DisObsAnc, T1.DisObsGrm, T1.DisRdoN, T1.DisRdoA, T1.DisGraAca, T1.DisGraCru2," ;
      sSelectString += " T1.DisGraAca2, T1.DisAncSal3, T1.DisAncSal2, T1.DisAncSal1, T1.DisNumCor, T1.DisEncAnh, T1.DisEncCom, T1.DisArtAc2" ;
      sFromString = " FROM ((((((((((TXPDISPOS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPMARCAS T3 ON T3.EmprCod = T1.EmprCod AND T3.MarcaId = T1.MarcaId) LEFT" ;
      sFromString += " JOIN TXPNXT002 T4 ON T4.EmprCod = T1.EmprCod AND T4.DptoID = T1.DptoID) LEFT JOIN TXPNXT000 T5 ON T5.EmprCod = T1.EmprCod AND T5.CpteId = T1.CpteId) LEFT JOIN TXPNXT001" ;
      sFromString += " T6 ON T6.EmprCod = T1.EmprCod AND T6.DesaID = T1.DesaID) LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T12.EmprCod, T12.DisCod FROM (TXPDISALB T12 INNER JOIN TXPALBREC" ;
      sFromString += " T13 ON T13.EmprCod = T12.EmprCod AND T13.AlbRecCod = T12.AlbRecCod) WHERE T13.AlbRReo = 'SI' GROUP BY T12.EmprCod, T12.DisCod ) T7 ON T7.EmprCod = T1.EmprCod AND" ;
      sFromString += " T7.DisCod = T1.DisCod) LEFT JOIN (SELECT MAX(DisObsLin) AS DisMaxObsL, EmprCod, DisCod FROM TXPOBSERV GROUP BY EmprCod, DisCod ) T8 ON T8.EmprCod = T1.EmprCod AND" ;
      sFromString += " T8.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(Piezas) AS GXC1, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T9 ON T9.EmprCod = T1.EmprCod AND T9.DisCod" ;
      sFromString += " = T1.DisCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T10 ON T10.EmprCod = T1.EmprCod AND T10.DisCod =" ;
      sFromString += " T1.DisCod) INNER JOIN TXPCLIENT T11 ON T11.EmprCod = T1.EmprCod AND T11.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisFec = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.DisArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.DisColNom) like '%' || UPPER(?)) or ( UPPER(T1.DisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.DibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DibInt,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T8.DisMaxObsL, 0),'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T8.DisMaxObsL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T8.DisMaxObsL, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T7.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T7.DisCanRec, 0) <= ?))");
      addWhere(sWhereString, "(T1.PriCod = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.DisFec = ?)");
      if ( ! (0==AV122Webwnwdp02ds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwnwdp02ds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwnwdp02ds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (0==AV125Webwnwdp02ds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Webwnwdp02ds_6_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Webwnwdp02ds_8_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwnwdp02ds_7_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Webwnwdp02ds_8_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Webwnwdp02ds_10_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwnwdp02ds_9_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webwnwdp02ds_10_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Webwnwdp02ds_12_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwnwdp02ds_11_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Webwnwdp02ds_12_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Webwnwdp02ds_14_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwnwdp02ds_13_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Webwnwdp02ds_14_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (0==AV135Webwnwdp02ds_15_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! (0==AV136Webwnwdp02ds_16_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Webwnwdp02ds_18_tfdibcli_sel)==0) && ( ! (GXutil.strcmp("", AV137Webwnwdp02ds_17_tfdibcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Webwnwdp02ds_18_tfdibcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DibCli = ?)");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( ! (0==AV139Webwnwdp02ds_19_tfdibint) )
      {
         addWhere(sWhereString, "(T1.DibInt >= ?)");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( ! (0==AV140Webwnwdp02ds_20_tfdibint_to) )
      {
         addWhere(sWhereString, "(T1.DibInt <= ?)");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( ! (0==AV77discodp) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( ! (0==AV104CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105DisCliNum)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum like ?)");
      }
      else
      {
         GXv_int23[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106DisArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod like ?)");
      }
      else
      {
         GXv_int23[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Disartdsc)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc like ?)");
      }
      else
      {
         GXv_int23[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108DisColNom)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom like ?)");
      }
      else
      {
         GXv_int23[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Disnomcli)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli like ?)");
      }
      else
      {
         GXv_int23[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV5DisUsrcod)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int23[51] = (byte)(1) ;
      }
      if ( AV16OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DibCli" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DibCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DibInt" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DibInt DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DisCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H00K512( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV122Webwnwdp02ds_2_tfdiscod ,
                                           int AV123Webwnwdp02ds_3_tfdiscod_to ,
                                           int AV124Webwnwdp02ds_4_tfclicod ,
                                           int AV125Webwnwdp02ds_5_tfclicod_to ,
                                           java.util.Date AV126Webwnwdp02ds_6_tfdisfec ,
                                           String AV128Webwnwdp02ds_8_tfdisartcod_sel ,
                                           String AV127Webwnwdp02ds_7_tfdisartcod ,
                                           String AV130Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           String AV129Webwnwdp02ds_9_tfdisartdsc ,
                                           String AV132Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           String AV131Webwnwdp02ds_11_tfdiscolnom ,
                                           String AV134Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           String AV133Webwnwdp02ds_13_tfdisnomcli ,
                                           int AV135Webwnwdp02ds_15_tfdiscolnum ,
                                           int AV136Webwnwdp02ds_16_tfdiscolnum_to ,
                                           String AV138Webwnwdp02ds_18_tfdibcli_sel ,
                                           String AV137Webwnwdp02ds_17_tfdibcli ,
                                           int AV139Webwnwdp02ds_19_tfdibint ,
                                           int AV140Webwnwdp02ds_20_tfdibint_to ,
                                           int AV77discodp ,
                                           int AV104CliCod ,
                                           String AV105DisCliNum ,
                                           String AV106DisArtCod ,
                                           String AV107Disartdsc ,
                                           String AV108DisColNom ,
                                           String AV109Disnomcli ,
                                           String AV5DisUsrcod ,
                                           int A361DisCod ,
                                           int A252CliCod ,
                                           java.util.Date A369DisFec ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           String A1195DisNomCli ,
                                           int A363DisColNum ,
                                           String A1013DibCli ,
                                           int A1014DibInt ,
                                           String A360DisCliNum ,
                                           String A4348DisUsrCod ,
                                           short AV16OrderedBy ,
                                           boolean AV17OrderedDsc ,
                                           String AV121Webwnwdp02ds_1_filterfulltext ,
                                           short A13737DisMaxObsL ,
                                           short A13732DisCanRec ,
                                           short AV141Webwnwdp02ds_21_tfdismaxobslin ,
                                           short AV142Webwnwdp02ds_22_tfdismaxobslin_to ,
                                           short AV143Webwnwdp02ds_23_tfdiscanrec ,
                                           short AV144Webwnwdp02ds_24_tfdiscanrec_to ,
                                           String A757PriCod ,
                                           String AV8pricod ,
                                           String AV6EmprCod ,
                                           java.util.Date AV7DisFec ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[52];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((((((((TXPDISPOS T1 INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPMARCAS T4 ON T4.EmprCod = T1.EmprCod AND T4.MarcaId" ;
      scmdbuf += " = T1.MarcaId) LEFT JOIN TXPNXT002 T5 ON T5.EmprCod = T1.EmprCod AND T5.DptoID = T1.DptoID) LEFT JOIN TXPNXT000 T6 ON T6.EmprCod = T1.EmprCod AND T6.CpteId = T1.CpteId)" ;
      scmdbuf += " LEFT JOIN TXPNXT001 T7 ON T7.EmprCod = T1.EmprCod AND T7.DesaID = T1.DesaID) LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T12.EmprCod, T12.DisCod FROM (TXPDISALB T12" ;
      scmdbuf += " INNER JOIN TXPALBREC T13 ON T13.EmprCod = T12.EmprCod AND T13.AlbRecCod = T12.AlbRecCod) WHERE T13.AlbRReo = 'SI' GROUP BY T12.EmprCod, T12.DisCod ) T8 ON T8.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T8.DisCod = T1.DisCod) LEFT JOIN (SELECT MAX(DisObsLin) AS DisMaxObsL, EmprCod, DisCod FROM TXPOBSERV GROUP BY EmprCod, DisCod ) T9 ON T9.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T9.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(Piezas) AS GXC1, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T10 ON T10.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T10.DisCod = T1.DisCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T11 ON T11.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T11.DisCod = T1.DisCod) INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisFec = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.DisArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.DisColNom) like '%' || UPPER(?)) or ( UPPER(T1.DisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.DibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DibInt,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T9.DisMaxObsL, 0),'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T8.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T9.DisMaxObsL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T9.DisMaxObsL, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T8.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T8.DisCanRec, 0) <= ?))");
      addWhere(sWhereString, "(T1.PriCod = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.DisFec = ?)");
      if ( ! (0==AV122Webwnwdp02ds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (0==AV123Webwnwdp02ds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (0==AV124Webwnwdp02ds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (0==AV125Webwnwdp02ds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Webwnwdp02ds_6_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Webwnwdp02ds_8_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwnwdp02ds_7_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Webwnwdp02ds_8_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Webwnwdp02ds_10_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwnwdp02ds_9_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webwnwdp02ds_10_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Webwnwdp02ds_12_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV131Webwnwdp02ds_11_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Webwnwdp02ds_12_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Webwnwdp02ds_14_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV133Webwnwdp02ds_13_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Webwnwdp02ds_14_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( ! (0==AV135Webwnwdp02ds_15_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( ! (0==AV136Webwnwdp02ds_16_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Webwnwdp02ds_18_tfdibcli_sel)==0) && ( ! (GXutil.strcmp("", AV137Webwnwdp02ds_17_tfdibcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Webwnwdp02ds_18_tfdibcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DibCli = ?)");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      if ( ! (0==AV139Webwnwdp02ds_19_tfdibint) )
      {
         addWhere(sWhereString, "(T1.DibInt >= ?)");
      }
      else
      {
         GXv_int25[42] = (byte)(1) ;
      }
      if ( ! (0==AV140Webwnwdp02ds_20_tfdibint_to) )
      {
         addWhere(sWhereString, "(T1.DibInt <= ?)");
      }
      else
      {
         GXv_int25[43] = (byte)(1) ;
      }
      if ( ! (0==AV77discodp) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int25[44] = (byte)(1) ;
      }
      if ( ! (0==AV104CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int25[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105DisCliNum)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum like ?)");
      }
      else
      {
         GXv_int25[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106DisArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod like ?)");
      }
      else
      {
         GXv_int25[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Disartdsc)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc like ?)");
      }
      else
      {
         GXv_int25[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108DisColNom)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom like ?)");
      }
      else
      {
         GXv_int25[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Disnomcli)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli like ?)");
      }
      else
      {
         GXv_int25[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV5DisUsrcod)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int25[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_H00K57(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] );
            case 2 :
                  return conditional_H00K512(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00K52", "SELECT * FROM (SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE (EmprCod = ?) AND (UPPER(ProForCod) like '%' || UPPER(?)) ORDER BY ProForCod) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K57", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K512", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K513", "SELECT * FROM (SELECT EmprCod, DisFec, DisCod FROM TXPDISPOS WHERE EmprCod = ? ORDER BY EmprCod, DisFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00K514", "SELECT * FROM (SELECT DisCod, EmprCod, DisFec FROM TXPDISPOS WHERE EmprCod = ? ORDER BY EmprCod, DisFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00K515", "SELECT DisCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K516", "SELECT SUM(Piezas) AS GXC1 FROM TXPDISALB ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K517", "SELECT SUM(Metros) AS GXC4 FROM TXPDISALB ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K518", "SELECT SUM(Kilos) AS GXC3 FROM TXPDISALB ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K519", "SELECT SUM(Kilos) AS GXC3 FROM TXPDISALB ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K520", "SELECT SUM(DisPieKil) AS GXC6 FROM TXPDISALD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K521", "SELECT SUM(Metros) AS GXC4 FROM TXPDISALB ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K522", "SELECT SUM(DisPieMet) AS GXC8 FROM TXPDISALD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((String[]) buf[11])[0] = rslt.getString(12, 10);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getString(16, 4);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 4);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 4);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(22, 4);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(31, 16);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(32, 13);
               ((String[]) buf[36])[0] = rslt.getString(33, 26);
               ((String[]) buf[37])[0] = rslt.getString(34, 30);
               ((int[]) buf[38])[0] = rslt.getInt(35);
               ((byte[]) buf[39])[0] = rslt.getByte(36);
               ((String[]) buf[40])[0] = rslt.getString(37, 8);
               ((short[]) buf[41])[0] = rslt.getShort(38);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(39);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(40);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(41);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(42);
               ((short[]) buf[50])[0] = rslt.getShort(43);
               ((byte[]) buf[51])[0] = rslt.getByte(44);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(45);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(46, 13);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(47, 16);
               ((String[]) buf[58])[0] = rslt.getString(48, 3);
               ((int[]) buf[59])[0] = rslt.getInt(49);
               ((String[]) buf[60])[0] = rslt.getString(50, 1);
               ((String[]) buf[61])[0] = rslt.getString(51, 1);
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDate(52);
               ((byte[]) buf[63])[0] = rslt.getByte(53);
               ((byte[]) buf[64])[0] = rslt.getByte(54);
               ((String[]) buf[65])[0] = rslt.getString(55, 6);
               ((String[]) buf[66])[0] = rslt.getString(56, 1);
               ((String[]) buf[67])[0] = rslt.getString(57, 30);
               ((String[]) buf[68])[0] = rslt.getString(58, 30);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(59);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(60, 30);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(61);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(62, 4);
               ((String[]) buf[77])[0] = rslt.getString(63, 30);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((short[]) buf[79])[0] = rslt.getShort(64);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(65, 30);
               ((String[]) buf[82])[0] = rslt.getString(66, 1);
               ((String[]) buf[83])[0] = rslt.getVarchar(67);
               ((String[]) buf[84])[0] = rslt.getString(68, 60);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(69, 6);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(70);
               ((String[]) buf[89])[0] = rslt.getVarchar(71);
               ((String[]) buf[90])[0] = rslt.getString(72, 30);
               ((String[]) buf[91])[0] = rslt.getString(73, 30);
               ((String[]) buf[92])[0] = rslt.getString(74, 4);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[94])[0] = rslt.getBigDecimal(75,2);
               ((java.math.BigDecimal[]) buf[95])[0] = rslt.getBigDecimal(76,2);
               ((String[]) buf[96])[0] = rslt.getString(77, 10);
               ((String[]) buf[97])[0] = rslt.getString(78, 1);
               ((String[]) buf[98])[0] = rslt.getString(79, 40);
               ((String[]) buf[99])[0] = rslt.getString(80, 20);
               ((String[]) buf[100])[0] = rslt.getString(81, 20);
               ((String[]) buf[101])[0] = rslt.getString(82, 20);
               ((String[]) buf[102])[0] = rslt.getString(83, 20);
               ((String[]) buf[103])[0] = rslt.getString(84, 20);
               ((String[]) buf[104])[0] = rslt.getString(85, 1);
               ((byte[]) buf[105])[0] = rslt.getByte(86);
               ((String[]) buf[106])[0] = rslt.getString(87, 1);
               ((String[]) buf[107])[0] = rslt.getString(88, 1);
               ((int[]) buf[108])[0] = rslt.getInt(89);
               ((String[]) buf[109])[0] = rslt.getString(90, 1);
               ((java.math.BigDecimal[]) buf[110])[0] = rslt.getBigDecimal(91,2);
               ((int[]) buf[111])[0] = rslt.getInt(92);
               ((java.math.BigDecimal[]) buf[112])[0] = rslt.getBigDecimal(93,2);
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(94,2);
               ((java.math.BigDecimal[]) buf[114])[0] = rslt.getBigDecimal(95,2);
               ((short[]) buf[115])[0] = rslt.getShort(96);
               ((String[]) buf[116])[0] = rslt.getString(97, 10);
               ((short[]) buf[117])[0] = rslt.getShort(98);
               ((String[]) buf[118])[0] = rslt.getString(99, 4);
               ((String[]) buf[119])[0] = rslt.getString(100, 13);
               ((String[]) buf[120])[0] = rslt.getString(101, 1);
               ((String[]) buf[121])[0] = rslt.getString(102, 2);
               ((String[]) buf[122])[0] = rslt.getString(103, 1);
               ((String[]) buf[123])[0] = rslt.getString(104, 12);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((byte[]) buf[125])[0] = rslt.getByte(105);
               ((byte[]) buf[126])[0] = rslt.getByte(106);
               ((String[]) buf[127])[0] = rslt.getString(107, 12);
               ((String[]) buf[128])[0] = rslt.getString(108, 10);
               ((short[]) buf[129])[0] = rslt.getShort(109);
               ((short[]) buf[130])[0] = rslt.getShort(110);
               ((String[]) buf[131])[0] = rslt.getString(111, 1);
               ((java.math.BigDecimal[]) buf[132])[0] = rslt.getBigDecimal(112,2);
               ((java.math.BigDecimal[]) buf[133])[0] = rslt.getBigDecimal(113,2);
               ((int[]) buf[134])[0] = rslt.getInt(114);
               ((short[]) buf[135])[0] = rslt.getShort(115);
               ((short[]) buf[136])[0] = rslt.getShort(116);
               ((short[]) buf[137])[0] = rslt.getShort(117);
               ((short[]) buf[138])[0] = rslt.getShort(118);
               ((java.math.BigDecimal[]) buf[139])[0] = rslt.getBigDecimal(119,2);
               ((java.math.BigDecimal[]) buf[140])[0] = rslt.getBigDecimal(120,2);
               ((String[]) buf[141])[0] = rslt.getString(121, 1);
               ((String[]) buf[142])[0] = rslt.getString(122, 8);
               ((String[]) buf[143])[0] = rslt.getString(123, 20);
               ((java.util.Date[]) buf[144])[0] = rslt.getGXDate(124);
               ((java.util.Date[]) buf[145])[0] = rslt.getGXDate(125);
               ((String[]) buf[146])[0] = rslt.getString(126, 6);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((short[]) buf[148])[0] = rslt.getShort(127);
               ((java.math.BigDecimal[]) buf[149])[0] = rslt.getBigDecimal(128,2);
               ((String[]) buf[150])[0] = rslt.getString(129, 1);
               ((String[]) buf[151])[0] = rslt.getString(130, 1);
               ((String[]) buf[152])[0] = rslt.getString(131, 2);
               ((String[]) buf[153])[0] = rslt.getString(132, 10);
               ((String[]) buf[154])[0] = rslt.getString(133, 30);
               ((String[]) buf[155])[0] = rslt.getVarchar(134);
               ((int[]) buf[156])[0] = rslt.getInt(135);
               ((String[]) buf[157])[0] = rslt.getString(136, 1);
               ((boolean[]) buf[158])[0] = rslt.wasNull();
               ((String[]) buf[159])[0] = rslt.getString(137, 20);
               ((String[]) buf[160])[0] = rslt.getString(138, 20);
               ((String[]) buf[161])[0] = rslt.getString(139, 20);
               ((java.math.BigDecimal[]) buf[162])[0] = rslt.getBigDecimal(140,2);
               ((java.math.BigDecimal[]) buf[163])[0] = rslt.getBigDecimal(141,2);
               ((short[]) buf[164])[0] = rslt.getShort(142);
               ((short[]) buf[165])[0] = rslt.getShort(143);
               ((short[]) buf[166])[0] = rslt.getShort(144);
               ((short[]) buf[167])[0] = rslt.getShort(145);
               ((short[]) buf[168])[0] = rslt.getShort(146);
               ((short[]) buf[169])[0] = rslt.getShort(147);
               ((short[]) buf[170])[0] = rslt.getShort(148);
               ((java.math.BigDecimal[]) buf[171])[0] = rslt.getBigDecimal(149,2);
               ((java.math.BigDecimal[]) buf[172])[0] = rslt.getBigDecimal(150,2);
               ((short[]) buf[173])[0] = rslt.getShort(151);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 16);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 26);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 8);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[110]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 26);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 16);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 26);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 13);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 13);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

