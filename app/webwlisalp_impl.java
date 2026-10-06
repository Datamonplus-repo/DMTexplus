package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwlisalp_impl extends GXDataArea
{
   public webwlisalp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwlisalp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwlisalp_impl.class ));
   }

   public webwlisalp_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
      nRC_GXsfl_119 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_119"))) ;
      nGXsfl_119_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_119_idx"))) ;
      sGXsfl_119_idx = httpContext.GetPar( "sGXsfl_119_idx") ;
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
      AV89GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
      AV90GuiRemCli_To = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli_To"))) ;
      AV93BarSer = httpContext.GetPar( "BarSer") ;
      AV94BarSer_To = httpContext.GetPar( "BarSer_To") ;
      AV95BarColNom = httpContext.GetPar( "BarColNom") ;
      AV96BarColNom_To = httpContext.GetPar( "BarColNom_To") ;
      AV97BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV98BarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_To"))) ;
      AV87AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV88AlbProFch_To = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch_To")) ;
      AV27TFGuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "TFGuiRemCli"))) ;
      AV28TFGuiRemCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFGuiRemCli_To"))) ;
      AV30TFGuiRemCln = httpContext.GetPar( "TFGuiRemCln") ;
      AV31TFGuiRemCln_Sel = httpContext.GetPar( "TFGuiRemCln_Sel") ;
      AV33TFAlbProCod = GXutil.lval( httpContext.GetPar( "TFAlbProCod")) ;
      AV34TFAlbProCod_To = GXutil.lval( httpContext.GetPar( "TFAlbProCod_To")) ;
      AV36TFAlbProfch = localUtil.parseDateParm( httpContext.GetPar( "TFAlbProfch")) ;
      AV49TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV54TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV55TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV57TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV58TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV60TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV61TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV63TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV64TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV66TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV67TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV69TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV70TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV72TFBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm"), ".") ;
      AV73TFBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm_To"), ".") ;
      AV128TFBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr"), ".") ;
      AV129TFBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr_To"), ".") ;
      AV75TFBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE"), ".") ;
      AV76TFBarAlbKgmE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE_To"), ".") ;
      AV78TFBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE"), ".") ;
      AV79TFBarAlbMtrE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE_To"), ".") ;
      AV81TFBarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie"))) ;
      AV82TFBarAlbPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie_To"))) ;
      AV85TFBarAncAca1 = (short)(GXutil.lval( httpContext.GetPar( "TFBarAncAca1"))) ;
      AV86TFBarAncAca1_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarAncAca1_To"))) ;
      AV101TFTrnCod = (short)(GXutil.lval( httpContext.GetPar( "TFTrnCod"))) ;
      AV102TFTrnCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTrnCod_To"))) ;
      AV178Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A143BarDisNum = httpContext.GetPar( "BarDisNum") ;
      A4812BarEncCli = httpContext.GetPar( "BarEncCli") ;
      A217BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
      A218BarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "BarTipCol"))) ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      A212BarSer = httpContext.GetPar( "BarSer") ;
      A135BarColNom = httpContext.GetPar( "BarColNom") ;
      A136BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV47IntDsc = httpContext.GetPar( "IntDsc") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
      A42AlbPTroCod = (short)(GXutil.lval( httpContext.GetPar( "AlbPTroCod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV89GuiRemCli, AV90GuiRemCli_To, AV93BarSer, AV94BarSer_To, AV95BarColNom, AV96BarColNom_To, AV97BarColNum, AV98BarColNum_To, AV87AlbProFch, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV88AlbProFch_To, AV27TFGuiRemCli, AV28TFGuiRemCli_To, AV30TFGuiRemCln, AV31TFGuiRemCln_Sel, AV33TFAlbProCod, AV34TFAlbProCod_To, AV36TFAlbProfch, AV49TFBarFecCli, AV54TFBarNHdr, AV55TFBarNHdr_Sel, AV57TFBarSer, AV58TFBarSer_Sel, AV60TFBarSerDsc, AV61TFBarSerDsc_Sel, AV63TFBarNomCli, AV64TFBarNomCli_Sel, AV66TFBarColNom, AV67TFBarColNom_Sel, AV69TFBarColNum, AV70TFBarColNum_To, AV72TFBarKgm, AV73TFBarKgm_To, AV128TFBarMtr, AV129TFBarMtr_To, AV75TFBarAlbKgmE, AV76TFBarAlbKgmE_To, AV78TFBarAlbMtrE, AV79TFBarAlbMtrE_To, AV81TFBarAlbPie, AV82TFBarAlbPie_To, AV85TFBarAncAca1, AV86TFBarAncAca1_To, AV101TFTrnCod, AV102TFTrnCod_To, AV178Pgmname, AV12OrderedBy, AV13OrderedDsc, A143BarDisNum, A4812BarEncCli, A217BarTipArt, A218BarTipCol, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, AV47IntDsc, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, A42AlbPTroCod) ;
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
      paMT2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startMT2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwlisalp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV89GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vGUIREMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV90GuiRemCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSER", GXutil.rtrim( AV93BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSER_TO", GXutil.rtrim( AV94BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNOM", GXutil.rtrim( AV95BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNOM_TO", GXutil.rtrim( AV96BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV97BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV98BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROFCH", localUtil.format(AV87AlbProFch, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_119", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_119, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV43GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV44GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH", localUtil.dtoc( AV87AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH_TO", localUtil.dtoc( AV88AlbProFch_To, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV27TFGuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV28TFGuiRemCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLN", GXutil.rtrim( AV30TFGuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLN_SEL", GXutil.rtrim( AV31TFGuiRemCln_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV33TFAlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD_TO", GXutil.ltrim( localUtil.ntoc( AV34TFAlbProCod_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROFCH", localUtil.dtoc( AV36TFAlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECCLI", localUtil.dtoc( AV49TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR", GXutil.rtrim( AV54TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR_SEL", GXutil.rtrim( AV55TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV57TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV58TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC", GXutil.rtrim( AV60TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC_SEL", GXutil.rtrim( AV61TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI", GXutil.rtrim( AV63TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI_SEL", GXutil.rtrim( AV64TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM", GXutil.rtrim( AV66TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM_SEL", GXutil.rtrim( AV67TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV69TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV70TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV72TFBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV73TFBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV128TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV129TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV75TFBarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBKGME_TO", GXutil.ltrim( localUtil.ntoc( AV76TFBarAlbKgmE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV78TFBarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBMTRE_TO", GXutil.ltrim( localUtil.ntoc( AV79TFBarAlbMtrE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV81TFBarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPIE_TO", GXutil.ltrim( localUtil.ntoc( AV82TFBarAlbPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARANCACA1", GXutil.ltrim( localUtil.ntoc( AV85TFBarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARANCACA1_TO", GXutil.ltrim( localUtil.ntoc( AV86TFBarAncAca1_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNCOD", GXutil.ltrim( localUtil.ntoc( AV101TFTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNCOD_TO", GXutil.ltrim( localUtil.ntoc( AV102TFTrnCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV178Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPART", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCOL", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD", GXutil.rtrim( A200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROCOD", GXutil.ltrim( localUtil.ntoc( A42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCLIDES", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER_TO2", GXutil.rtrim( AV116BarSer_to2));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLI_TO2", GXutil.ltrim( localUtil.ntoc( AV115GuiRemCli_To2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM_TO2", GXutil.ltrim( localUtil.ntoc( AV114BarColNum_To2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM_TO2", GXutil.rtrim( AV113BarColNom_To2));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH_TO2", localUtil.dtoc( AV112AlbProFch_To2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      if ( ! ( WebComp_Wcwcentregasresumencliente == null ) )
      {
         WebComp_Wcwcentregasresumencliente.componentjscripts();
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
         weMT2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtMT2( ) ;
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
      return formatLink("app.webwlisalp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWLISALP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Albaranes Produccion", "") ;
   }

   public void wbMT0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofch_rangetext_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofch_rangetext_Internalname, httpContext.getMessage( "Periodo", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofch_rangetext_Internalname, AV121AlbProFch_RangeText, GXutil.rtrim( localUtil.format( AV121AlbProFch_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavAlbprofch_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavAlbprofch_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfiltertextguiremcli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextguiremcli_Internalname, httpContext.getMessage( "Clientes", ""), "", "", lblFiltertextguiremcli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table1_34_MT2( true) ;
      }
      else
      {
         wb_table1_34_MT2( false) ;
      }
      return  ;
   }

   public void wb_table1_34_MT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfiltertextbarser_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextbarser_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblFiltertextbarser_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table2_50_MT2( true) ;
      }
      else
      {
         wb_table2_50_MT2( false) ;
      }
      return  ;
   }

   public void wb_table2_50_MT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfiltertextbarcolnom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextbarcolnom_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblFiltertextbarcolnom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table3_66_MT2( true) ;
      }
      else
      {
         wb_table3_66_MT2( false) ;
      }
      return  ;
   }

   public void wb_table3_66_MT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfiltertextbarcolnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextbarcolnum_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblFiltertextbarcolnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table4_82_MT2( true) ;
      }
      else
      {
         wb_table4_82_MT2( false) ;
      }
      return  ;
   }

   public void wb_table4_82_MT2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 119, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 119, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 119, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table5_108_MT2( true) ;
      }
      else
      {
         wb_table5_108_MT2( false) ;
      }
      return  ;
   }

   public void wb_table5_108_MT2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol119( ) ;
      }
      if ( wbEnd == 119 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_119 = (int)(nGXsfl_119_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV43GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV44GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
         ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
         ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
         ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
         ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
         ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
         ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
         ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
         ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
         ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
         ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 119, 3, 0)+","+"null"+");", httpContext.getMessage( "Ver Informe Resumen Cliente", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Ver Informe Resumen Cliente", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11mt1_client"+"'", TempTags, "", 2, "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 119, 3, 0)+","+"null"+");", httpContext.getMessage( "Salir", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Salir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0166"+"", GXutil.rtrim( WebComp_Wcwcentregasresumencliente_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0166"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_119_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwcentregasresumencliente_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcentregasresumencliente), GXutil.lower( WebComp_Wcwcentregasresumencliente_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0166"+"");
                  }
                  WebComp_Wcwcentregasresumencliente.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcentregasresumencliente), GXutil.lower( WebComp_Wcwcentregasresumencliente_Component)) != 0 )
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
         httpContext.writeText( "</div>") ;
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
         ucAlbprofch_rangepicker.setProperty("Start Date", AV87AlbProFch);
         ucAlbprofch_rangepicker.setProperty("End Date", AV88AlbProFch_To);
         ucAlbprofch_rangepicker.render(context, "wwp.daterangepicker", Albprofch_rangepicker_Internalname, "ALBPROFCH_RANGEPICKERContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albprofchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albprofchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albprofchauxdate_Internalname, localUtil.format(AV38DDO_AlbProfchAuxDate, "99/99/99"), localUtil.format( AV38DDO_AlbProfchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,175);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albprofchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albprofchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWLISALP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV51DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV51DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,177);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWLISALP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 119 )
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

   public void startMT2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informe Albaranes Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupMT0( ) ;
   }

   public void wsMT2( )
   {
      startMT2( ) ;
      evtMT2( ) ;
   }

   public void evtMT2( )
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
                           e12MT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13MT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14MT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ALBPROFCH_RANGEPICKER.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15MT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16MT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17MT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e18MT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e19MT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e20MT2 ();
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
                           nGXsfl_119_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_119_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_119_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1192( ) ;
                           A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
                           A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
                           AV15BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarenccli_Internalname, AV15BarEncCli);
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           AV45TipArtDsc = httpContext.cgiGet( edtavTipartdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTipartdsc_Internalname, AV45TipArtDsc);
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV46TipColDsc = httpContext.cgiGet( edtavTipcoldsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTipcoldsc_Internalname, AV46TipColDsc);
                           AV47IntDsc = httpContext.cgiGet( edtavIntdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavIntdsc_Internalname, AV47IntDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTDSC"+"_"+sGXsfl_119_idx, getSecureSignedToken( sGXsfl_119_idx, GXutil.rtrim( localUtil.format( AV47IntDsc, ""))));
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
                           A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
                           A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A125BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV83Trozos = (short)(localUtil.ctol( httpContext.cgiGet( edtavTrozos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTrozos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83Trozos), 4, 0));
                           A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV99CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV99CliNom);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e21MT2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e22MT2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e23MT2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Guiremcli Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vGUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV89GuiRemCli )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Guiremcli_to Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vGUIREMCLI_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV90GuiRemCli_To )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barser Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSER"), AV93BarSer) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barser_to Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSER_TO"), AV94BarSer_To) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOM"), AV95BarColNom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnom_to Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOM_TO"), AV96BarColNom_To) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnum Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV97BarColNum )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnum_to Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUM_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV98BarColNum_To )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprofch Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPROFCH"), 0), AV87AlbProFch) ) )
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
                     if ( nCmpId == 166 )
                     {
                        OldWcwcentregasresumencliente = httpContext.cgiGet( "W0166") ;
                        if ( ( GXutil.len( OldWcwcentregasresumencliente) == 0 ) || ( GXutil.strcmp(OldWcwcentregasresumencliente, WebComp_Wcwcentregasresumencliente_Component) != 0 ) )
                        {
                           WebComp_Wcwcentregasresumencliente = WebUtils.getWebComponent(getClass(), "app." + OldWcwcentregasresumencliente + "_impl", remoteHandle, context);
                           WebComp_Wcwcentregasresumencliente_Component = OldWcwcentregasresumencliente ;
                        }
                        if ( GXutil.len( WebComp_Wcwcentregasresumencliente_Component) != 0 )
                        {
                           WebComp_Wcwcentregasresumencliente.componentprocess("W0166", "", sEvt);
                        }
                        WebComp_Wcwcentregasresumencliente_Component = OldWcwcentregasresumencliente ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weMT2( )
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

   public void paMT2( )
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
            GX_FocusControl = edtavAlbprofch_rangetext_Internalname ;
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
      subsflControlProps_1192( ) ;
      while ( nGXsfl_119_idx <= nRC_GXsfl_119 )
      {
         sendrow_1192( ) ;
         nGXsfl_119_idx = ((subGrid_Islastpage==1)&&(nGXsfl_119_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_119_idx+1) ;
         sGXsfl_119_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_119_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1192( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV89GuiRemCli ,
                                 int AV90GuiRemCli_To ,
                                 String AV93BarSer ,
                                 String AV94BarSer_To ,
                                 String AV95BarColNom ,
                                 String AV96BarColNom_To ,
                                 int AV97BarColNum ,
                                 int AV98BarColNum_To ,
                                 java.util.Date AV87AlbProFch ,
                                 String A396EmprCod ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 java.util.Date AV88AlbProFch_To ,
                                 int AV27TFGuiRemCli ,
                                 int AV28TFGuiRemCli_To ,
                                 String AV30TFGuiRemCln ,
                                 String AV31TFGuiRemCln_Sel ,
                                 long AV33TFAlbProCod ,
                                 long AV34TFAlbProCod_To ,
                                 java.util.Date AV36TFAlbProfch ,
                                 java.util.Date AV49TFBarFecCli ,
                                 String AV54TFBarNHdr ,
                                 String AV55TFBarNHdr_Sel ,
                                 String AV57TFBarSer ,
                                 String AV58TFBarSer_Sel ,
                                 String AV60TFBarSerDsc ,
                                 String AV61TFBarSerDsc_Sel ,
                                 String AV63TFBarNomCli ,
                                 String AV64TFBarNomCli_Sel ,
                                 String AV66TFBarColNom ,
                                 String AV67TFBarColNom_Sel ,
                                 int AV69TFBarColNum ,
                                 int AV70TFBarColNum_To ,
                                 java.math.BigDecimal AV72TFBarKgm ,
                                 java.math.BigDecimal AV73TFBarKgm_To ,
                                 java.math.BigDecimal AV128TFBarMtr ,
                                 java.math.BigDecimal AV129TFBarMtr_To ,
                                 java.math.BigDecimal AV75TFBarAlbKgmE ,
                                 java.math.BigDecimal AV76TFBarAlbKgmE_To ,
                                 java.math.BigDecimal AV78TFBarAlbMtrE ,
                                 java.math.BigDecimal AV79TFBarAlbMtrE_To ,
                                 int AV81TFBarAlbPie ,
                                 int AV82TFBarAlbPie_To ,
                                 short AV85TFBarAncAca1 ,
                                 short AV86TFBarAncAca1_To ,
                                 short AV101TFTrnCod ,
                                 short AV102TFTrnCod_To ,
                                 String AV178Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String A143BarDisNum ,
                                 String A4812BarEncCli ,
                                 short A217BarTipArt ,
                                 byte A218BarTipCol ,
                                 int A252CliCod ,
                                 String A212BarSer ,
                                 String A135BarColNom ,
                                 int A136BarColNum ,
                                 String AV47IntDsc ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String A200BarPieCod ,
                                 short A42AlbPTroCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e22MT2 ();
      GRID_nCurrentRecord = 0 ;
      rfMT2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47IntDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTDSC", GXutil.rtrim( AV47IntDsc));
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
      rfMT2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV178Pgmname = "WebWLISALP" ;
      Gx_err = (short)(0) ;
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      edtavIntdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntdsc_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      edtavTrozos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrozos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrozos_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_119_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV133Webwlisalpds_1_albprofch = AV87AlbProFch ;
      AV134Webwlisalpds_2_albprofch_to = AV88AlbProFch_To ;
      AV135Webwlisalpds_3_guiremcli = AV89GuiRemCli ;
      AV136Webwlisalpds_4_guiremcli_to = AV90GuiRemCli_To ;
      AV137Webwlisalpds_5_barser = AV93BarSer ;
      AV138Webwlisalpds_6_barser_to = AV94BarSer_To ;
      AV139Webwlisalpds_7_barcolnom = AV95BarColNom ;
      AV140Webwlisalpds_8_barcolnom_to = AV96BarColNom_To ;
      AV141Webwlisalpds_9_barcolnum = AV97BarColNum ;
      AV142Webwlisalpds_10_barcolnum_to = AV98BarColNum_To ;
      AV143Webwlisalpds_11_tfguiremcli = AV27TFGuiRemCli ;
      AV144Webwlisalpds_12_tfguiremcli_to = AV28TFGuiRemCli_To ;
      AV145Webwlisalpds_13_tfguiremcln = AV30TFGuiRemCln ;
      AV146Webwlisalpds_14_tfguiremcln_sel = AV31TFGuiRemCln_Sel ;
      AV147Webwlisalpds_15_tfalbprocod = AV33TFAlbProCod ;
      AV148Webwlisalpds_16_tfalbprocod_to = AV34TFAlbProCod_To ;
      AV149Webwlisalpds_17_tfalbprofch = AV36TFAlbProfch ;
      AV150Webwlisalpds_18_tfbarfeccli = AV49TFBarFecCli ;
      AV151Webwlisalpds_19_tfbarnhdr = AV54TFBarNHdr ;
      AV152Webwlisalpds_20_tfbarnhdr_sel = AV55TFBarNHdr_Sel ;
      AV153Webwlisalpds_21_tfbarser = AV57TFBarSer ;
      AV154Webwlisalpds_22_tfbarser_sel = AV58TFBarSer_Sel ;
      AV155Webwlisalpds_23_tfbarserdsc = AV60TFBarSerDsc ;
      AV156Webwlisalpds_24_tfbarserdsc_sel = AV61TFBarSerDsc_Sel ;
      AV157Webwlisalpds_25_tfbarnomcli = AV63TFBarNomCli ;
      AV158Webwlisalpds_26_tfbarnomcli_sel = AV64TFBarNomCli_Sel ;
      AV159Webwlisalpds_27_tfbarcolnom = AV66TFBarColNom ;
      AV160Webwlisalpds_28_tfbarcolnom_sel = AV67TFBarColNom_Sel ;
      AV161Webwlisalpds_29_tfbarcolnum = AV69TFBarColNum ;
      AV162Webwlisalpds_30_tfbarcolnum_to = AV70TFBarColNum_To ;
      AV163Webwlisalpds_31_tfbarkgm = AV72TFBarKgm ;
      AV164Webwlisalpds_32_tfbarkgm_to = AV73TFBarKgm_To ;
      AV165Webwlisalpds_33_tfbarmtr = AV128TFBarMtr ;
      AV166Webwlisalpds_34_tfbarmtr_to = AV129TFBarMtr_To ;
      AV167Webwlisalpds_35_tfbaralbkgme = AV75TFBarAlbKgmE ;
      AV168Webwlisalpds_36_tfbaralbkgme_to = AV76TFBarAlbKgmE_To ;
      AV169Webwlisalpds_37_tfbaralbmtre = AV78TFBarAlbMtrE ;
      AV170Webwlisalpds_38_tfbaralbmtre_to = AV79TFBarAlbMtrE_To ;
      AV171Webwlisalpds_39_tfbaralbpie = AV81TFBarAlbPie ;
      AV172Webwlisalpds_40_tfbaralbpie_to = AV82TFBarAlbPie_To ;
      AV173Webwlisalpds_41_tfbarancaca1 = AV85TFBarAncAca1 ;
      AV174Webwlisalpds_42_tfbarancaca1_to = AV86TFBarAncAca1_To ;
      AV175Webwlisalpds_43_tftrncod = AV101TFTrnCod ;
      AV176Webwlisalpds_44_tftrncod_to = AV102TFTrnCod_To ;
      GRID_nRecordCount = 0 ;
      GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
      GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV133Webwlisalpds_1_albprofch ,
                                           AV134Webwlisalpds_2_albprofch_to ,
                                           Integer.valueOf(AV135Webwlisalpds_3_guiremcli) ,
                                           Integer.valueOf(AV136Webwlisalpds_4_guiremcli_to) ,
                                           AV137Webwlisalpds_5_barser ,
                                           AV138Webwlisalpds_6_barser_to ,
                                           AV139Webwlisalpds_7_barcolnom ,
                                           AV140Webwlisalpds_8_barcolnom_to ,
                                           Integer.valueOf(AV141Webwlisalpds_9_barcolnum) ,
                                           Integer.valueOf(AV142Webwlisalpds_10_barcolnum_to) ,
                                           Integer.valueOf(AV143Webwlisalpds_11_tfguiremcli) ,
                                           Integer.valueOf(AV144Webwlisalpds_12_tfguiremcli_to) ,
                                           AV146Webwlisalpds_14_tfguiremcln_sel ,
                                           AV145Webwlisalpds_13_tfguiremcln ,
                                           Long.valueOf(AV147Webwlisalpds_15_tfalbprocod) ,
                                           Long.valueOf(AV148Webwlisalpds_16_tfalbprocod_to) ,
                                           AV149Webwlisalpds_17_tfalbprofch ,
                                           AV150Webwlisalpds_18_tfbarfeccli ,
                                           AV152Webwlisalpds_20_tfbarnhdr_sel ,
                                           AV151Webwlisalpds_19_tfbarnhdr ,
                                           AV154Webwlisalpds_22_tfbarser_sel ,
                                           AV153Webwlisalpds_21_tfbarser ,
                                           AV156Webwlisalpds_24_tfbarserdsc_sel ,
                                           AV155Webwlisalpds_23_tfbarserdsc ,
                                           AV158Webwlisalpds_26_tfbarnomcli_sel ,
                                           AV157Webwlisalpds_25_tfbarnomcli ,
                                           AV160Webwlisalpds_28_tfbarcolnom_sel ,
                                           AV159Webwlisalpds_27_tfbarcolnom ,
                                           Integer.valueOf(AV161Webwlisalpds_29_tfbarcolnum) ,
                                           Integer.valueOf(AV162Webwlisalpds_30_tfbarcolnum_to) ,
                                           AV163Webwlisalpds_31_tfbarkgm ,
                                           AV164Webwlisalpds_32_tfbarkgm_to ,
                                           AV165Webwlisalpds_33_tfbarmtr ,
                                           AV166Webwlisalpds_34_tfbarmtr_to ,
                                           AV167Webwlisalpds_35_tfbaralbkgme ,
                                           AV168Webwlisalpds_36_tfbaralbkgme_to ,
                                           AV169Webwlisalpds_37_tfbaralbmtre ,
                                           AV170Webwlisalpds_38_tfbaralbmtre_to ,
                                           Integer.valueOf(AV171Webwlisalpds_39_tfbaralbpie) ,
                                           Integer.valueOf(AV172Webwlisalpds_40_tfbaralbpie_to) ,
                                           Short.valueOf(AV173Webwlisalpds_41_tfbarancaca1) ,
                                           Short.valueOf(AV174Webwlisalpds_42_tfbarancaca1_to) ,
                                           Short.valueOf(AV175Webwlisalpds_43_tftrncod) ,
                                           Short.valueOf(AV176Webwlisalpds_44_tftrncod_to) ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1244GuiRemCln ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A155BarFecCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A125BarAncAca1) ,
                                           Short.valueOf(A840TrnCod) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV145Webwlisalpds_13_tfguiremcln = GXutil.padr( GXutil.rtrim( AV145Webwlisalpds_13_tfguiremcln), 30, "%") ;
      /* Using cursor H00MT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV133Webwlisalpds_1_albprofch, AV134Webwlisalpds_2_albprofch_to, Integer.valueOf(AV135Webwlisalpds_3_guiremcli), Integer.valueOf(AV136Webwlisalpds_4_guiremcli_to), Integer.valueOf(AV143Webwlisalpds_11_tfguiremcli), Integer.valueOf(AV144Webwlisalpds_12_tfguiremcli_to), lV145Webwlisalpds_13_tfguiremcln, AV146Webwlisalpds_14_tfguiremcln_sel, Long.valueOf(AV147Webwlisalpds_15_tfalbprocod), Long.valueOf(AV148Webwlisalpds_16_tfalbprocod_to), AV149Webwlisalpds_17_tfalbprofch, Short.valueOf(AV175Webwlisalpds_43_tftrncod), Short.valueOf(AV176Webwlisalpds_44_tftrncod_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1253EmprGuiRem = H00MT2_A1253EmprGuiRem[0] ;
         A30AlbProCod = H00MT2_A30AlbProCod[0] ;
         A3869AlbCliDes = H00MT2_A3869AlbCliDes[0] ;
         A840TrnCod = H00MT2_A840TrnCod[0] ;
         A34AlbProfch = H00MT2_A34AlbProfch[0] ;
         A1244GuiRemCln = H00MT2_A1244GuiRemCln[0] ;
         A1243GuiRemCli = H00MT2_A1243GuiRemCli[0] ;
         A1244GuiRemCln = H00MT2_A1244GuiRemCln[0] ;
         GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfMT2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(119) ;
      /* Execute user event: Refresh */
      e22MT2 ();
      nGXsfl_119_idx = 1 ;
      sGXsfl_119_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_119_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1192( ) ;
      bGXsfl_119_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcentregasresumencliente_Component) != 0 )
            {
               WebComp_Wcwcentregasresumencliente.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1192( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV133Webwlisalpds_1_albprofch ,
                                              AV134Webwlisalpds_2_albprofch_to ,
                                              Integer.valueOf(AV135Webwlisalpds_3_guiremcli) ,
                                              Integer.valueOf(AV136Webwlisalpds_4_guiremcli_to) ,
                                              AV137Webwlisalpds_5_barser ,
                                              AV138Webwlisalpds_6_barser_to ,
                                              AV139Webwlisalpds_7_barcolnom ,
                                              AV140Webwlisalpds_8_barcolnom_to ,
                                              Integer.valueOf(AV141Webwlisalpds_9_barcolnum) ,
                                              Integer.valueOf(AV142Webwlisalpds_10_barcolnum_to) ,
                                              Integer.valueOf(AV143Webwlisalpds_11_tfguiremcli) ,
                                              Integer.valueOf(AV144Webwlisalpds_12_tfguiremcli_to) ,
                                              AV146Webwlisalpds_14_tfguiremcln_sel ,
                                              AV145Webwlisalpds_13_tfguiremcln ,
                                              Long.valueOf(AV147Webwlisalpds_15_tfalbprocod) ,
                                              Long.valueOf(AV148Webwlisalpds_16_tfalbprocod_to) ,
                                              AV149Webwlisalpds_17_tfalbprofch ,
                                              AV150Webwlisalpds_18_tfbarfeccli ,
                                              AV152Webwlisalpds_20_tfbarnhdr_sel ,
                                              AV151Webwlisalpds_19_tfbarnhdr ,
                                              AV154Webwlisalpds_22_tfbarser_sel ,
                                              AV153Webwlisalpds_21_tfbarser ,
                                              AV156Webwlisalpds_24_tfbarserdsc_sel ,
                                              AV155Webwlisalpds_23_tfbarserdsc ,
                                              AV158Webwlisalpds_26_tfbarnomcli_sel ,
                                              AV157Webwlisalpds_25_tfbarnomcli ,
                                              AV160Webwlisalpds_28_tfbarcolnom_sel ,
                                              AV159Webwlisalpds_27_tfbarcolnom ,
                                              Integer.valueOf(AV161Webwlisalpds_29_tfbarcolnum) ,
                                              Integer.valueOf(AV162Webwlisalpds_30_tfbarcolnum_to) ,
                                              AV163Webwlisalpds_31_tfbarkgm ,
                                              AV164Webwlisalpds_32_tfbarkgm_to ,
                                              AV165Webwlisalpds_33_tfbarmtr ,
                                              AV166Webwlisalpds_34_tfbarmtr_to ,
                                              AV167Webwlisalpds_35_tfbaralbkgme ,
                                              AV168Webwlisalpds_36_tfbaralbkgme_to ,
                                              AV169Webwlisalpds_37_tfbaralbmtre ,
                                              AV170Webwlisalpds_38_tfbaralbmtre_to ,
                                              Integer.valueOf(AV171Webwlisalpds_39_tfbaralbpie) ,
                                              Integer.valueOf(AV172Webwlisalpds_40_tfbaralbpie_to) ,
                                              Short.valueOf(AV173Webwlisalpds_41_tfbarancaca1) ,
                                              Short.valueOf(AV174Webwlisalpds_42_tfbarancaca1_to) ,
                                              Short.valueOf(AV175Webwlisalpds_43_tftrncod) ,
                                              Short.valueOf(AV176Webwlisalpds_44_tftrncod_to) ,
                                              A34AlbProfch ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1244GuiRemCln ,
                                              Long.valueOf(A30AlbProCod) ,
                                              A155BarFecCli ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A1652BarSerDsc ,
                                              A1234BarNomCli ,
                                              A166BarKgm ,
                                              A184BarMtr ,
                                              A1261BarAlbKgmE ,
                                              A1263BarAlbMtrE ,
                                              Integer.valueOf(A1265BarAlbPie) ,
                                              Short.valueOf(A125BarAncAca1) ,
                                              Short.valueOf(A840TrnCod) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.LONG, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV145Webwlisalpds_13_tfguiremcln = GXutil.padr( GXutil.rtrim( AV145Webwlisalpds_13_tfguiremcln), 30, "%") ;
         /* Using cursor H00MT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV133Webwlisalpds_1_albprofch, AV134Webwlisalpds_2_albprofch_to, Integer.valueOf(AV135Webwlisalpds_3_guiremcli), Integer.valueOf(AV136Webwlisalpds_4_guiremcli_to), Integer.valueOf(AV143Webwlisalpds_11_tfguiremcli), Integer.valueOf(AV144Webwlisalpds_12_tfguiremcli_to), lV145Webwlisalpds_13_tfguiremcln, AV146Webwlisalpds_14_tfguiremcln_sel, Long.valueOf(AV147Webwlisalpds_15_tfalbprocod), Long.valueOf(AV148Webwlisalpds_16_tfalbprocod_to), AV149Webwlisalpds_17_tfalbprofch, Short.valueOf(AV175Webwlisalpds_43_tftrncod), Short.valueOf(AV176Webwlisalpds_44_tftrncod_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_119_idx = 1 ;
         sGXsfl_119_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_119_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1192( ) ;
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1253EmprGuiRem = H00MT3_A1253EmprGuiRem[0] ;
            A30AlbProCod = H00MT3_A30AlbProCod[0] ;
            A3869AlbCliDes = H00MT3_A3869AlbCliDes[0] ;
            A840TrnCod = H00MT3_A840TrnCod[0] ;
            A34AlbProfch = H00MT3_A34AlbProfch[0] ;
            A1244GuiRemCln = H00MT3_A1244GuiRemCln[0] ;
            A1243GuiRemCli = H00MT3_A1243GuiRemCli[0] ;
            A1244GuiRemCln = H00MT3_A1244GuiRemCln[0] ;
            e23MT2 ();
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(119) ;
         wbMT0( ) ;
      }
      bGXsfl_119_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesMT2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV178Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTDSC"+"_"+sGXsfl_119_idx, getSecureSignedToken( sGXsfl_119_idx, GXutil.rtrim( localUtil.format( AV47IntDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
      AV133Webwlisalpds_1_albprofch = AV87AlbProFch ;
      AV134Webwlisalpds_2_albprofch_to = AV88AlbProFch_To ;
      AV135Webwlisalpds_3_guiremcli = AV89GuiRemCli ;
      AV136Webwlisalpds_4_guiremcli_to = AV90GuiRemCli_To ;
      AV137Webwlisalpds_5_barser = AV93BarSer ;
      AV138Webwlisalpds_6_barser_to = AV94BarSer_To ;
      AV139Webwlisalpds_7_barcolnom = AV95BarColNom ;
      AV140Webwlisalpds_8_barcolnom_to = AV96BarColNom_To ;
      AV141Webwlisalpds_9_barcolnum = AV97BarColNum ;
      AV142Webwlisalpds_10_barcolnum_to = AV98BarColNum_To ;
      AV143Webwlisalpds_11_tfguiremcli = AV27TFGuiRemCli ;
      AV144Webwlisalpds_12_tfguiremcli_to = AV28TFGuiRemCli_To ;
      AV145Webwlisalpds_13_tfguiremcln = AV30TFGuiRemCln ;
      AV146Webwlisalpds_14_tfguiremcln_sel = AV31TFGuiRemCln_Sel ;
      AV147Webwlisalpds_15_tfalbprocod = AV33TFAlbProCod ;
      AV148Webwlisalpds_16_tfalbprocod_to = AV34TFAlbProCod_To ;
      AV149Webwlisalpds_17_tfalbprofch = AV36TFAlbProfch ;
      AV150Webwlisalpds_18_tfbarfeccli = AV49TFBarFecCli ;
      AV151Webwlisalpds_19_tfbarnhdr = AV54TFBarNHdr ;
      AV152Webwlisalpds_20_tfbarnhdr_sel = AV55TFBarNHdr_Sel ;
      AV153Webwlisalpds_21_tfbarser = AV57TFBarSer ;
      AV154Webwlisalpds_22_tfbarser_sel = AV58TFBarSer_Sel ;
      AV155Webwlisalpds_23_tfbarserdsc = AV60TFBarSerDsc ;
      AV156Webwlisalpds_24_tfbarserdsc_sel = AV61TFBarSerDsc_Sel ;
      AV157Webwlisalpds_25_tfbarnomcli = AV63TFBarNomCli ;
      AV158Webwlisalpds_26_tfbarnomcli_sel = AV64TFBarNomCli_Sel ;
      AV159Webwlisalpds_27_tfbarcolnom = AV66TFBarColNom ;
      AV160Webwlisalpds_28_tfbarcolnom_sel = AV67TFBarColNom_Sel ;
      AV161Webwlisalpds_29_tfbarcolnum = AV69TFBarColNum ;
      AV162Webwlisalpds_30_tfbarcolnum_to = AV70TFBarColNum_To ;
      AV163Webwlisalpds_31_tfbarkgm = AV72TFBarKgm ;
      AV164Webwlisalpds_32_tfbarkgm_to = AV73TFBarKgm_To ;
      AV165Webwlisalpds_33_tfbarmtr = AV128TFBarMtr ;
      AV166Webwlisalpds_34_tfbarmtr_to = AV129TFBarMtr_To ;
      AV167Webwlisalpds_35_tfbaralbkgme = AV75TFBarAlbKgmE ;
      AV168Webwlisalpds_36_tfbaralbkgme_to = AV76TFBarAlbKgmE_To ;
      AV169Webwlisalpds_37_tfbaralbmtre = AV78TFBarAlbMtrE ;
      AV170Webwlisalpds_38_tfbaralbmtre_to = AV79TFBarAlbMtrE_To ;
      AV171Webwlisalpds_39_tfbaralbpie = AV81TFBarAlbPie ;
      AV172Webwlisalpds_40_tfbaralbpie_to = AV82TFBarAlbPie_To ;
      AV173Webwlisalpds_41_tfbarancaca1 = AV85TFBarAncAca1 ;
      AV174Webwlisalpds_42_tfbarancaca1_to = AV86TFBarAncAca1_To ;
      AV175Webwlisalpds_43_tftrncod = AV101TFTrnCod ;
      AV176Webwlisalpds_44_tftrncod_to = AV102TFTrnCod_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV89GuiRemCli, AV90GuiRemCli_To, AV93BarSer, AV94BarSer_To, AV95BarColNom, AV96BarColNom_To, AV97BarColNum, AV98BarColNum_To, AV87AlbProFch, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV88AlbProFch_To, AV27TFGuiRemCli, AV28TFGuiRemCli_To, AV30TFGuiRemCln, AV31TFGuiRemCln_Sel, AV33TFAlbProCod, AV34TFAlbProCod_To, AV36TFAlbProfch, AV49TFBarFecCli, AV54TFBarNHdr, AV55TFBarNHdr_Sel, AV57TFBarSer, AV58TFBarSer_Sel, AV60TFBarSerDsc, AV61TFBarSerDsc_Sel, AV63TFBarNomCli, AV64TFBarNomCli_Sel, AV66TFBarColNom, AV67TFBarColNom_Sel, AV69TFBarColNum, AV70TFBarColNum_To, AV72TFBarKgm, AV73TFBarKgm_To, AV128TFBarMtr, AV129TFBarMtr_To, AV75TFBarAlbKgmE, AV76TFBarAlbKgmE_To, AV78TFBarAlbMtrE, AV79TFBarAlbMtrE_To, AV81TFBarAlbPie, AV82TFBarAlbPie_To, AV85TFBarAncAca1, AV86TFBarAncAca1_To, AV101TFTrnCod, AV102TFTrnCod_To, AV178Pgmname, AV12OrderedBy, AV13OrderedDsc, A143BarDisNum, A4812BarEncCli, A217BarTipArt, A218BarTipCol, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, AV47IntDsc, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, A42AlbPTroCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV133Webwlisalpds_1_albprofch = AV87AlbProFch ;
      AV134Webwlisalpds_2_albprofch_to = AV88AlbProFch_To ;
      AV135Webwlisalpds_3_guiremcli = AV89GuiRemCli ;
      AV136Webwlisalpds_4_guiremcli_to = AV90GuiRemCli_To ;
      AV137Webwlisalpds_5_barser = AV93BarSer ;
      AV138Webwlisalpds_6_barser_to = AV94BarSer_To ;
      AV139Webwlisalpds_7_barcolnom = AV95BarColNom ;
      AV140Webwlisalpds_8_barcolnom_to = AV96BarColNom_To ;
      AV141Webwlisalpds_9_barcolnum = AV97BarColNum ;
      AV142Webwlisalpds_10_barcolnum_to = AV98BarColNum_To ;
      AV143Webwlisalpds_11_tfguiremcli = AV27TFGuiRemCli ;
      AV144Webwlisalpds_12_tfguiremcli_to = AV28TFGuiRemCli_To ;
      AV145Webwlisalpds_13_tfguiremcln = AV30TFGuiRemCln ;
      AV146Webwlisalpds_14_tfguiremcln_sel = AV31TFGuiRemCln_Sel ;
      AV147Webwlisalpds_15_tfalbprocod = AV33TFAlbProCod ;
      AV148Webwlisalpds_16_tfalbprocod_to = AV34TFAlbProCod_To ;
      AV149Webwlisalpds_17_tfalbprofch = AV36TFAlbProfch ;
      AV150Webwlisalpds_18_tfbarfeccli = AV49TFBarFecCli ;
      AV151Webwlisalpds_19_tfbarnhdr = AV54TFBarNHdr ;
      AV152Webwlisalpds_20_tfbarnhdr_sel = AV55TFBarNHdr_Sel ;
      AV153Webwlisalpds_21_tfbarser = AV57TFBarSer ;
      AV154Webwlisalpds_22_tfbarser_sel = AV58TFBarSer_Sel ;
      AV155Webwlisalpds_23_tfbarserdsc = AV60TFBarSerDsc ;
      AV156Webwlisalpds_24_tfbarserdsc_sel = AV61TFBarSerDsc_Sel ;
      AV157Webwlisalpds_25_tfbarnomcli = AV63TFBarNomCli ;
      AV158Webwlisalpds_26_tfbarnomcli_sel = AV64TFBarNomCli_Sel ;
      AV159Webwlisalpds_27_tfbarcolnom = AV66TFBarColNom ;
      AV160Webwlisalpds_28_tfbarcolnom_sel = AV67TFBarColNom_Sel ;
      AV161Webwlisalpds_29_tfbarcolnum = AV69TFBarColNum ;
      AV162Webwlisalpds_30_tfbarcolnum_to = AV70TFBarColNum_To ;
      AV163Webwlisalpds_31_tfbarkgm = AV72TFBarKgm ;
      AV164Webwlisalpds_32_tfbarkgm_to = AV73TFBarKgm_To ;
      AV165Webwlisalpds_33_tfbarmtr = AV128TFBarMtr ;
      AV166Webwlisalpds_34_tfbarmtr_to = AV129TFBarMtr_To ;
      AV167Webwlisalpds_35_tfbaralbkgme = AV75TFBarAlbKgmE ;
      AV168Webwlisalpds_36_tfbaralbkgme_to = AV76TFBarAlbKgmE_To ;
      AV169Webwlisalpds_37_tfbaralbmtre = AV78TFBarAlbMtrE ;
      AV170Webwlisalpds_38_tfbaralbmtre_to = AV79TFBarAlbMtrE_To ;
      AV171Webwlisalpds_39_tfbaralbpie = AV81TFBarAlbPie ;
      AV172Webwlisalpds_40_tfbaralbpie_to = AV82TFBarAlbPie_To ;
      AV173Webwlisalpds_41_tfbarancaca1 = AV85TFBarAncAca1 ;
      AV174Webwlisalpds_42_tfbarancaca1_to = AV86TFBarAncAca1_To ;
      AV175Webwlisalpds_43_tftrncod = AV101TFTrnCod ;
      AV176Webwlisalpds_44_tftrncod_to = AV102TFTrnCod_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV89GuiRemCli, AV90GuiRemCli_To, AV93BarSer, AV94BarSer_To, AV95BarColNom, AV96BarColNom_To, AV97BarColNum, AV98BarColNum_To, AV87AlbProFch, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV88AlbProFch_To, AV27TFGuiRemCli, AV28TFGuiRemCli_To, AV30TFGuiRemCln, AV31TFGuiRemCln_Sel, AV33TFAlbProCod, AV34TFAlbProCod_To, AV36TFAlbProfch, AV49TFBarFecCli, AV54TFBarNHdr, AV55TFBarNHdr_Sel, AV57TFBarSer, AV58TFBarSer_Sel, AV60TFBarSerDsc, AV61TFBarSerDsc_Sel, AV63TFBarNomCli, AV64TFBarNomCli_Sel, AV66TFBarColNom, AV67TFBarColNom_Sel, AV69TFBarColNum, AV70TFBarColNum_To, AV72TFBarKgm, AV73TFBarKgm_To, AV128TFBarMtr, AV129TFBarMtr_To, AV75TFBarAlbKgmE, AV76TFBarAlbKgmE_To, AV78TFBarAlbMtrE, AV79TFBarAlbMtrE_To, AV81TFBarAlbPie, AV82TFBarAlbPie_To, AV85TFBarAncAca1, AV86TFBarAncAca1_To, AV101TFTrnCod, AV102TFTrnCod_To, AV178Pgmname, AV12OrderedBy, AV13OrderedDsc, A143BarDisNum, A4812BarEncCli, A217BarTipArt, A218BarTipCol, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, AV47IntDsc, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, A42AlbPTroCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV133Webwlisalpds_1_albprofch = AV87AlbProFch ;
      AV134Webwlisalpds_2_albprofch_to = AV88AlbProFch_To ;
      AV135Webwlisalpds_3_guiremcli = AV89GuiRemCli ;
      AV136Webwlisalpds_4_guiremcli_to = AV90GuiRemCli_To ;
      AV137Webwlisalpds_5_barser = AV93BarSer ;
      AV138Webwlisalpds_6_barser_to = AV94BarSer_To ;
      AV139Webwlisalpds_7_barcolnom = AV95BarColNom ;
      AV140Webwlisalpds_8_barcolnom_to = AV96BarColNom_To ;
      AV141Webwlisalpds_9_barcolnum = AV97BarColNum ;
      AV142Webwlisalpds_10_barcolnum_to = AV98BarColNum_To ;
      AV143Webwlisalpds_11_tfguiremcli = AV27TFGuiRemCli ;
      AV144Webwlisalpds_12_tfguiremcli_to = AV28TFGuiRemCli_To ;
      AV145Webwlisalpds_13_tfguiremcln = AV30TFGuiRemCln ;
      AV146Webwlisalpds_14_tfguiremcln_sel = AV31TFGuiRemCln_Sel ;
      AV147Webwlisalpds_15_tfalbprocod = AV33TFAlbProCod ;
      AV148Webwlisalpds_16_tfalbprocod_to = AV34TFAlbProCod_To ;
      AV149Webwlisalpds_17_tfalbprofch = AV36TFAlbProfch ;
      AV150Webwlisalpds_18_tfbarfeccli = AV49TFBarFecCli ;
      AV151Webwlisalpds_19_tfbarnhdr = AV54TFBarNHdr ;
      AV152Webwlisalpds_20_tfbarnhdr_sel = AV55TFBarNHdr_Sel ;
      AV153Webwlisalpds_21_tfbarser = AV57TFBarSer ;
      AV154Webwlisalpds_22_tfbarser_sel = AV58TFBarSer_Sel ;
      AV155Webwlisalpds_23_tfbarserdsc = AV60TFBarSerDsc ;
      AV156Webwlisalpds_24_tfbarserdsc_sel = AV61TFBarSerDsc_Sel ;
      AV157Webwlisalpds_25_tfbarnomcli = AV63TFBarNomCli ;
      AV158Webwlisalpds_26_tfbarnomcli_sel = AV64TFBarNomCli_Sel ;
      AV159Webwlisalpds_27_tfbarcolnom = AV66TFBarColNom ;
      AV160Webwlisalpds_28_tfbarcolnom_sel = AV67TFBarColNom_Sel ;
      AV161Webwlisalpds_29_tfbarcolnum = AV69TFBarColNum ;
      AV162Webwlisalpds_30_tfbarcolnum_to = AV70TFBarColNum_To ;
      AV163Webwlisalpds_31_tfbarkgm = AV72TFBarKgm ;
      AV164Webwlisalpds_32_tfbarkgm_to = AV73TFBarKgm_To ;
      AV165Webwlisalpds_33_tfbarmtr = AV128TFBarMtr ;
      AV166Webwlisalpds_34_tfbarmtr_to = AV129TFBarMtr_To ;
      AV167Webwlisalpds_35_tfbaralbkgme = AV75TFBarAlbKgmE ;
      AV168Webwlisalpds_36_tfbaralbkgme_to = AV76TFBarAlbKgmE_To ;
      AV169Webwlisalpds_37_tfbaralbmtre = AV78TFBarAlbMtrE ;
      AV170Webwlisalpds_38_tfbaralbmtre_to = AV79TFBarAlbMtrE_To ;
      AV171Webwlisalpds_39_tfbaralbpie = AV81TFBarAlbPie ;
      AV172Webwlisalpds_40_tfbaralbpie_to = AV82TFBarAlbPie_To ;
      AV173Webwlisalpds_41_tfbarancaca1 = AV85TFBarAncAca1 ;
      AV174Webwlisalpds_42_tfbarancaca1_to = AV86TFBarAncAca1_To ;
      AV175Webwlisalpds_43_tftrncod = AV101TFTrnCod ;
      AV176Webwlisalpds_44_tftrncod_to = AV102TFTrnCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV89GuiRemCli, AV90GuiRemCli_To, AV93BarSer, AV94BarSer_To, AV95BarColNom, AV96BarColNom_To, AV97BarColNum, AV98BarColNum_To, AV87AlbProFch, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV88AlbProFch_To, AV27TFGuiRemCli, AV28TFGuiRemCli_To, AV30TFGuiRemCln, AV31TFGuiRemCln_Sel, AV33TFAlbProCod, AV34TFAlbProCod_To, AV36TFAlbProfch, AV49TFBarFecCli, AV54TFBarNHdr, AV55TFBarNHdr_Sel, AV57TFBarSer, AV58TFBarSer_Sel, AV60TFBarSerDsc, AV61TFBarSerDsc_Sel, AV63TFBarNomCli, AV64TFBarNomCli_Sel, AV66TFBarColNom, AV67TFBarColNom_Sel, AV69TFBarColNum, AV70TFBarColNum_To, AV72TFBarKgm, AV73TFBarKgm_To, AV128TFBarMtr, AV129TFBarMtr_To, AV75TFBarAlbKgmE, AV76TFBarAlbKgmE_To, AV78TFBarAlbMtrE, AV79TFBarAlbMtrE_To, AV81TFBarAlbPie, AV82TFBarAlbPie_To, AV85TFBarAncAca1, AV86TFBarAncAca1_To, AV101TFTrnCod, AV102TFTrnCod_To, AV178Pgmname, AV12OrderedBy, AV13OrderedDsc, A143BarDisNum, A4812BarEncCli, A217BarTipArt, A218BarTipCol, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, AV47IntDsc, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, A42AlbPTroCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV133Webwlisalpds_1_albprofch = AV87AlbProFch ;
      AV134Webwlisalpds_2_albprofch_to = AV88AlbProFch_To ;
      AV135Webwlisalpds_3_guiremcli = AV89GuiRemCli ;
      AV136Webwlisalpds_4_guiremcli_to = AV90GuiRemCli_To ;
      AV137Webwlisalpds_5_barser = AV93BarSer ;
      AV138Webwlisalpds_6_barser_to = AV94BarSer_To ;
      AV139Webwlisalpds_7_barcolnom = AV95BarColNom ;
      AV140Webwlisalpds_8_barcolnom_to = AV96BarColNom_To ;
      AV141Webwlisalpds_9_barcolnum = AV97BarColNum ;
      AV142Webwlisalpds_10_barcolnum_to = AV98BarColNum_To ;
      AV143Webwlisalpds_11_tfguiremcli = AV27TFGuiRemCli ;
      AV144Webwlisalpds_12_tfguiremcli_to = AV28TFGuiRemCli_To ;
      AV145Webwlisalpds_13_tfguiremcln = AV30TFGuiRemCln ;
      AV146Webwlisalpds_14_tfguiremcln_sel = AV31TFGuiRemCln_Sel ;
      AV147Webwlisalpds_15_tfalbprocod = AV33TFAlbProCod ;
      AV148Webwlisalpds_16_tfalbprocod_to = AV34TFAlbProCod_To ;
      AV149Webwlisalpds_17_tfalbprofch = AV36TFAlbProfch ;
      AV150Webwlisalpds_18_tfbarfeccli = AV49TFBarFecCli ;
      AV151Webwlisalpds_19_tfbarnhdr = AV54TFBarNHdr ;
      AV152Webwlisalpds_20_tfbarnhdr_sel = AV55TFBarNHdr_Sel ;
      AV153Webwlisalpds_21_tfbarser = AV57TFBarSer ;
      AV154Webwlisalpds_22_tfbarser_sel = AV58TFBarSer_Sel ;
      AV155Webwlisalpds_23_tfbarserdsc = AV60TFBarSerDsc ;
      AV156Webwlisalpds_24_tfbarserdsc_sel = AV61TFBarSerDsc_Sel ;
      AV157Webwlisalpds_25_tfbarnomcli = AV63TFBarNomCli ;
      AV158Webwlisalpds_26_tfbarnomcli_sel = AV64TFBarNomCli_Sel ;
      AV159Webwlisalpds_27_tfbarcolnom = AV66TFBarColNom ;
      AV160Webwlisalpds_28_tfbarcolnom_sel = AV67TFBarColNom_Sel ;
      AV161Webwlisalpds_29_tfbarcolnum = AV69TFBarColNum ;
      AV162Webwlisalpds_30_tfbarcolnum_to = AV70TFBarColNum_To ;
      AV163Webwlisalpds_31_tfbarkgm = AV72TFBarKgm ;
      AV164Webwlisalpds_32_tfbarkgm_to = AV73TFBarKgm_To ;
      AV165Webwlisalpds_33_tfbarmtr = AV128TFBarMtr ;
      AV166Webwlisalpds_34_tfbarmtr_to = AV129TFBarMtr_To ;
      AV167Webwlisalpds_35_tfbaralbkgme = AV75TFBarAlbKgmE ;
      AV168Webwlisalpds_36_tfbaralbkgme_to = AV76TFBarAlbKgmE_To ;
      AV169Webwlisalpds_37_tfbaralbmtre = AV78TFBarAlbMtrE ;
      AV170Webwlisalpds_38_tfbaralbmtre_to = AV79TFBarAlbMtrE_To ;
      AV171Webwlisalpds_39_tfbaralbpie = AV81TFBarAlbPie ;
      AV172Webwlisalpds_40_tfbaralbpie_to = AV82TFBarAlbPie_To ;
      AV173Webwlisalpds_41_tfbarancaca1 = AV85TFBarAncAca1 ;
      AV174Webwlisalpds_42_tfbarancaca1_to = AV86TFBarAncAca1_To ;
      AV175Webwlisalpds_43_tftrncod = AV101TFTrnCod ;
      AV176Webwlisalpds_44_tftrncod_to = AV102TFTrnCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV89GuiRemCli, AV90GuiRemCli_To, AV93BarSer, AV94BarSer_To, AV95BarColNom, AV96BarColNom_To, AV97BarColNum, AV98BarColNum_To, AV87AlbProFch, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV88AlbProFch_To, AV27TFGuiRemCli, AV28TFGuiRemCli_To, AV30TFGuiRemCln, AV31TFGuiRemCln_Sel, AV33TFAlbProCod, AV34TFAlbProCod_To, AV36TFAlbProfch, AV49TFBarFecCli, AV54TFBarNHdr, AV55TFBarNHdr_Sel, AV57TFBarSer, AV58TFBarSer_Sel, AV60TFBarSerDsc, AV61TFBarSerDsc_Sel, AV63TFBarNomCli, AV64TFBarNomCli_Sel, AV66TFBarColNom, AV67TFBarColNom_Sel, AV69TFBarColNum, AV70TFBarColNum_To, AV72TFBarKgm, AV73TFBarKgm_To, AV128TFBarMtr, AV129TFBarMtr_To, AV75TFBarAlbKgmE, AV76TFBarAlbKgmE_To, AV78TFBarAlbMtrE, AV79TFBarAlbMtrE_To, AV81TFBarAlbPie, AV82TFBarAlbPie_To, AV85TFBarAncAca1, AV86TFBarAncAca1_To, AV101TFTrnCod, AV102TFTrnCod_To, AV178Pgmname, AV12OrderedBy, AV13OrderedDsc, A143BarDisNum, A4812BarEncCli, A217BarTipArt, A218BarTipCol, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, AV47IntDsc, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, A42AlbPTroCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV133Webwlisalpds_1_albprofch = AV87AlbProFch ;
      AV134Webwlisalpds_2_albprofch_to = AV88AlbProFch_To ;
      AV135Webwlisalpds_3_guiremcli = AV89GuiRemCli ;
      AV136Webwlisalpds_4_guiremcli_to = AV90GuiRemCli_To ;
      AV137Webwlisalpds_5_barser = AV93BarSer ;
      AV138Webwlisalpds_6_barser_to = AV94BarSer_To ;
      AV139Webwlisalpds_7_barcolnom = AV95BarColNom ;
      AV140Webwlisalpds_8_barcolnom_to = AV96BarColNom_To ;
      AV141Webwlisalpds_9_barcolnum = AV97BarColNum ;
      AV142Webwlisalpds_10_barcolnum_to = AV98BarColNum_To ;
      AV143Webwlisalpds_11_tfguiremcli = AV27TFGuiRemCli ;
      AV144Webwlisalpds_12_tfguiremcli_to = AV28TFGuiRemCli_To ;
      AV145Webwlisalpds_13_tfguiremcln = AV30TFGuiRemCln ;
      AV146Webwlisalpds_14_tfguiremcln_sel = AV31TFGuiRemCln_Sel ;
      AV147Webwlisalpds_15_tfalbprocod = AV33TFAlbProCod ;
      AV148Webwlisalpds_16_tfalbprocod_to = AV34TFAlbProCod_To ;
      AV149Webwlisalpds_17_tfalbprofch = AV36TFAlbProfch ;
      AV150Webwlisalpds_18_tfbarfeccli = AV49TFBarFecCli ;
      AV151Webwlisalpds_19_tfbarnhdr = AV54TFBarNHdr ;
      AV152Webwlisalpds_20_tfbarnhdr_sel = AV55TFBarNHdr_Sel ;
      AV153Webwlisalpds_21_tfbarser = AV57TFBarSer ;
      AV154Webwlisalpds_22_tfbarser_sel = AV58TFBarSer_Sel ;
      AV155Webwlisalpds_23_tfbarserdsc = AV60TFBarSerDsc ;
      AV156Webwlisalpds_24_tfbarserdsc_sel = AV61TFBarSerDsc_Sel ;
      AV157Webwlisalpds_25_tfbarnomcli = AV63TFBarNomCli ;
      AV158Webwlisalpds_26_tfbarnomcli_sel = AV64TFBarNomCli_Sel ;
      AV159Webwlisalpds_27_tfbarcolnom = AV66TFBarColNom ;
      AV160Webwlisalpds_28_tfbarcolnom_sel = AV67TFBarColNom_Sel ;
      AV161Webwlisalpds_29_tfbarcolnum = AV69TFBarColNum ;
      AV162Webwlisalpds_30_tfbarcolnum_to = AV70TFBarColNum_To ;
      AV163Webwlisalpds_31_tfbarkgm = AV72TFBarKgm ;
      AV164Webwlisalpds_32_tfbarkgm_to = AV73TFBarKgm_To ;
      AV165Webwlisalpds_33_tfbarmtr = AV128TFBarMtr ;
      AV166Webwlisalpds_34_tfbarmtr_to = AV129TFBarMtr_To ;
      AV167Webwlisalpds_35_tfbaralbkgme = AV75TFBarAlbKgmE ;
      AV168Webwlisalpds_36_tfbaralbkgme_to = AV76TFBarAlbKgmE_To ;
      AV169Webwlisalpds_37_tfbaralbmtre = AV78TFBarAlbMtrE ;
      AV170Webwlisalpds_38_tfbaralbmtre_to = AV79TFBarAlbMtrE_To ;
      AV171Webwlisalpds_39_tfbaralbpie = AV81TFBarAlbPie ;
      AV172Webwlisalpds_40_tfbaralbpie_to = AV82TFBarAlbPie_To ;
      AV173Webwlisalpds_41_tfbarancaca1 = AV85TFBarAncAca1 ;
      AV174Webwlisalpds_42_tfbarancaca1_to = AV86TFBarAncAca1_To ;
      AV175Webwlisalpds_43_tftrncod = AV101TFTrnCod ;
      AV176Webwlisalpds_44_tftrncod_to = AV102TFTrnCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV89GuiRemCli, AV90GuiRemCli_To, AV93BarSer, AV94BarSer_To, AV95BarColNom, AV96BarColNom_To, AV97BarColNum, AV98BarColNum_To, AV87AlbProFch, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV88AlbProFch_To, AV27TFGuiRemCli, AV28TFGuiRemCli_To, AV30TFGuiRemCln, AV31TFGuiRemCln_Sel, AV33TFAlbProCod, AV34TFAlbProCod_To, AV36TFAlbProfch, AV49TFBarFecCli, AV54TFBarNHdr, AV55TFBarNHdr_Sel, AV57TFBarSer, AV58TFBarSer_Sel, AV60TFBarSerDsc, AV61TFBarSerDsc_Sel, AV63TFBarNomCli, AV64TFBarNomCli_Sel, AV66TFBarColNom, AV67TFBarColNom_Sel, AV69TFBarColNum, AV70TFBarColNum_To, AV72TFBarKgm, AV73TFBarKgm_To, AV128TFBarMtr, AV129TFBarMtr_To, AV75TFBarAlbKgmE, AV76TFBarAlbKgmE_To, AV78TFBarAlbMtrE, AV79TFBarAlbMtrE_To, AV81TFBarAlbPie, AV82TFBarAlbPie_To, AV85TFBarAncAca1, AV86TFBarAncAca1_To, AV101TFTrnCod, AV102TFTrnCod_To, AV178Pgmname, AV12OrderedBy, AV13OrderedDsc, A143BarDisNum, A4812BarEncCli, A217BarTipArt, A218BarTipCol, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, AV47IntDsc, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, A42AlbPTroCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV178Pgmname = "WebWLISALP" ;
      Gx_err = (short)(0) ;
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      edtavIntdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntdsc_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      edtavTrozos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrozos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrozos_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_119_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupMT0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e21MT2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      /* Using cursor H00MT5 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A166BarKgm = H00MT5_A166BarKgm[0] ;
         A184BarMtr = H00MT5_A184BarMtr[0] ;
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(2);
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV41DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_119 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_119"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV44GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV87AlbProFch = localUtil.ctod( httpContext.cgiGet( "vALBPROFCH"), 0) ;
         AV88AlbProFch_To = localUtil.ctod( httpContext.cgiGet( "vALBPROFCH_TO"), 0) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         AV116BarSer_to2 = httpContext.cgiGet( "vBARSER_TO2") ;
         AV115GuiRemCli_To2 = (int)(localUtil.ctol( httpContext.cgiGet( "vGUIREMCLI_TO2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV114BarColNum_To2 = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOLNUM_TO2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV113BarColNom_To2 = httpContext.cgiGet( "vBARCOLNOM_TO2") ;
         AV112AlbProFch_To2 = localUtil.ctod( httpContext.cgiGet( "vALBPROFCH_TO2"), 0) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
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
         Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
         Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
         Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
         Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
         Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
         Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
         Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
         Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
         Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
         Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
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
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
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
         AV121AlbProFch_RangeText = httpContext.cgiGet( edtavAlbprofch_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV121AlbProFch_RangeText", AV121AlbProFch_RangeText);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGuiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGuiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGUIREMCLI");
            GX_FocusControl = edtavGuiremcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV89GuiRemCli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89GuiRemCli), 6, 0));
         }
         else
         {
            AV89GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtavGuiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89GuiRemCli), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGuiremcli_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGuiremcli_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGUIREMCLI_TO");
            GX_FocusControl = edtavGuiremcli_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90GuiRemCli_To = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90GuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90GuiRemCli_To), 6, 0));
         }
         else
         {
            AV90GuiRemCli_To = (int)(localUtil.ctol( httpContext.cgiGet( edtavGuiremcli_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90GuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90GuiRemCli_To), 6, 0));
         }
         AV93BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93BarSer", AV93BarSer);
         AV94BarSer_To = httpContext.cgiGet( edtavBarser_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94BarSer_To", AV94BarSer_To);
         AV95BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95BarColNom", AV95BarColNom);
         AV96BarColNom_To = httpContext.cgiGet( edtavBarcolnom_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96BarColNom_To", AV96BarColNom_To);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV97BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97BarColNum), 6, 0));
         }
         else
         {
            AV97BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97BarColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM_TO");
            GX_FocusControl = edtavBarcolnum_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV98BarColNum_To = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarColNum_To), 6, 0));
         }
         else
         {
            AV98BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarColNum_To), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albprofchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBPROFCHAUXDATE");
            GX_FocusControl = edtavDdo_albprofchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38DDO_AlbProfchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_AlbProfchAuxDate", localUtil.format(AV38DDO_AlbProfchAuxDate, "99/99/99"));
         }
         else
         {
            AV38DDO_AlbProfchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albprofchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_AlbProfchAuxDate", localUtil.format(AV38DDO_AlbProfchAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_barfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV51DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51DDO_BarFecCliAuxDate", localUtil.format(AV51DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV51DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51DDO_BarFecCliAuxDate", localUtil.format(AV51DDO_BarFecCliAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vGUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV89GuiRemCli )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vGUIREMCLI_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV90GuiRemCli_To )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSER"), AV93BarSer) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSER_TO"), AV94BarSer_To) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOM"), AV95BarColNom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOM_TO"), AV96BarColNom_To) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV97BarColNum )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUM_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV98BarColNum_To )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPROFCH"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV87AlbProFch)) ) )
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
      e21MT2 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e21MT2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV109Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwlisalp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV109Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV110EmprNom ;
      GXv_char4[0] = AV111UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV109Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwlisalp_impl.this.A396EmprCod = GXv_char2[0] ;
      webwlisalp_impl.this.AV110EmprNom = GXv_char3[0] ;
      webwlisalp_impl.this.AV111UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV87AlbProFch = GXutil.dadd(GXutil.today( ),-(7)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87AlbProFch", localUtil.format(AV87AlbProFch, "99/99/99"));
      AV88AlbProFch_To = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProFch_To", localUtil.format(AV88AlbProFch_To, "99/99/99"));
      GXt_char1 = AV109Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwlisalp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV109Station = GXt_char1 ;
      GXv_char4[0] = AV132Emprcod ;
      GXv_char3[0] = AV110EmprNom ;
      GXv_char2[0] = AV111UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV109Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwlisalp_impl.this.AV132Emprcod = GXv_char4[0] ;
      webwlisalp_impl.this.AV110EmprNom = GXv_char3[0] ;
      webwlisalp_impl.this.AV111UsurCod = GXv_char2[0] ;
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
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      this.executeUsercontrolMethod("", false, "ALBPROFCH_RANGEPICKERContainer", "Attach", "", new Object[] {edtavAlbprofch_rangetext_Internalname});
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Informe Albaranes Produccion", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcentregasresumencliente = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcentregasresumencliente_Component), GXutil.lower( "WCEntregasResumenCliente")) != 0 )
      {
         WebComp_Wcwcentregasresumencliente = WebUtils.getWebComponent(getClass(), "app.wcentregasresumencliente_impl", remoteHandle, context);
         WebComp_Wcwcentregasresumencliente_Component = "WCEntregasResumenCliente" ;
      }
      if ( GXutil.len( WebComp_Wcwcentregasresumencliente_Component) != 0 )
      {
         WebComp_Wcwcentregasresumencliente.setjustcreated();
         WebComp_Wcwcentregasresumencliente.componentprepare(new Object[] {"W0166","",A396EmprCod,AV87AlbProFch,AV88AlbProFch_To,AV95BarColNom,AV96BarColNom_To,Integer.valueOf(AV97BarColNum),Integer.valueOf(AV98BarColNum_To),AV93BarSer,AV94BarSer_To,Integer.valueOf(AV89GuiRemCli),Integer.valueOf(AV90GuiRemCli_To)});
         WebComp_Wcwcentregasresumencliente.componentbind(new Object[] {"","","","vBARCOLNOM","vBARCOLNOM_TO","vBARCOLNUM","vBARCOLNUM_TO","vBARSER","vBARSER_TO","vGUIREMCLI","vGUIREMCLI_TO"});
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV41DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV41DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e22MT2( )
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
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      if ( GXutil.strcmp(AV22Session.getValue("WebWLISALPColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("WebWLISALPColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      edtGuiRemCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtGuiRemCln_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtAlbProCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtAlbProfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtavBarenccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtavTipartdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtavTipcoldsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcoldsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtavIntdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntdsc_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarAlbKgmE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarAlbMtrE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarAlbPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtBarAncAca1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtavTrozos_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrozos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrozos_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtTrnCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), !bGXsfl_119_Refreshing);
      edtavClinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Visible), 5, 0), !bGXsfl_119_Refreshing);
      AV43GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridCurrentPage), 10, 0));
      AV44GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridPageCount), 10, 0));
      AV133Webwlisalpds_1_albprofch = AV87AlbProFch ;
      AV134Webwlisalpds_2_albprofch_to = AV88AlbProFch_To ;
      AV135Webwlisalpds_3_guiremcli = AV89GuiRemCli ;
      AV136Webwlisalpds_4_guiremcli_to = AV90GuiRemCli_To ;
      AV137Webwlisalpds_5_barser = AV93BarSer ;
      AV138Webwlisalpds_6_barser_to = AV94BarSer_To ;
      AV139Webwlisalpds_7_barcolnom = AV95BarColNom ;
      AV140Webwlisalpds_8_barcolnom_to = AV96BarColNom_To ;
      AV141Webwlisalpds_9_barcolnum = AV97BarColNum ;
      AV142Webwlisalpds_10_barcolnum_to = AV98BarColNum_To ;
      AV143Webwlisalpds_11_tfguiremcli = AV27TFGuiRemCli ;
      AV144Webwlisalpds_12_tfguiremcli_to = AV28TFGuiRemCli_To ;
      AV145Webwlisalpds_13_tfguiremcln = AV30TFGuiRemCln ;
      AV146Webwlisalpds_14_tfguiremcln_sel = AV31TFGuiRemCln_Sel ;
      AV147Webwlisalpds_15_tfalbprocod = AV33TFAlbProCod ;
      AV148Webwlisalpds_16_tfalbprocod_to = AV34TFAlbProCod_To ;
      AV149Webwlisalpds_17_tfalbprofch = AV36TFAlbProfch ;
      AV150Webwlisalpds_18_tfbarfeccli = AV49TFBarFecCli ;
      AV151Webwlisalpds_19_tfbarnhdr = AV54TFBarNHdr ;
      AV152Webwlisalpds_20_tfbarnhdr_sel = AV55TFBarNHdr_Sel ;
      AV153Webwlisalpds_21_tfbarser = AV57TFBarSer ;
      AV154Webwlisalpds_22_tfbarser_sel = AV58TFBarSer_Sel ;
      AV155Webwlisalpds_23_tfbarserdsc = AV60TFBarSerDsc ;
      AV156Webwlisalpds_24_tfbarserdsc_sel = AV61TFBarSerDsc_Sel ;
      AV157Webwlisalpds_25_tfbarnomcli = AV63TFBarNomCli ;
      AV158Webwlisalpds_26_tfbarnomcli_sel = AV64TFBarNomCli_Sel ;
      AV159Webwlisalpds_27_tfbarcolnom = AV66TFBarColNom ;
      AV160Webwlisalpds_28_tfbarcolnom_sel = AV67TFBarColNom_Sel ;
      AV161Webwlisalpds_29_tfbarcolnum = AV69TFBarColNum ;
      AV162Webwlisalpds_30_tfbarcolnum_to = AV70TFBarColNum_To ;
      AV163Webwlisalpds_31_tfbarkgm = AV72TFBarKgm ;
      AV164Webwlisalpds_32_tfbarkgm_to = AV73TFBarKgm_To ;
      AV165Webwlisalpds_33_tfbarmtr = AV128TFBarMtr ;
      AV166Webwlisalpds_34_tfbarmtr_to = AV129TFBarMtr_To ;
      AV167Webwlisalpds_35_tfbaralbkgme = AV75TFBarAlbKgmE ;
      AV168Webwlisalpds_36_tfbaralbkgme_to = AV76TFBarAlbKgmE_To ;
      AV169Webwlisalpds_37_tfbaralbmtre = AV78TFBarAlbMtrE ;
      AV170Webwlisalpds_38_tfbaralbmtre_to = AV79TFBarAlbMtrE_To ;
      AV171Webwlisalpds_39_tfbaralbpie = AV81TFBarAlbPie ;
      AV172Webwlisalpds_40_tfbaralbpie_to = AV82TFBarAlbPie_To ;
      AV173Webwlisalpds_41_tfbarancaca1 = AV85TFBarAncAca1 ;
      AV174Webwlisalpds_42_tfbarancaca1_to = AV86TFBarAncAca1_To ;
      AV175Webwlisalpds_43_tftrncod = AV101TFTrnCod ;
      AV176Webwlisalpds_44_tftrncod_to = AV102TFTrnCod_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e13MT2( )
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
         AV42PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV42PageToGo) ;
      }
   }

   public void e14MT2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e16MT2( )
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
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiRemCli") == 0 )
         {
            AV27TFGuiRemCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFGuiRemCli), 6, 0));
            AV28TFGuiRemCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFGuiRemCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiRemCln") == 0 )
         {
            AV30TFGuiRemCln = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFGuiRemCln", AV30TFGuiRemCln);
            AV31TFGuiRemCln_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFGuiRemCln_Sel", AV31TFGuiRemCln_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCod") == 0 )
         {
            AV33TFAlbProCod = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFAlbProCod), 10, 0));
            AV34TFAlbProCod_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProfch") == 0 )
         {
            AV36TFAlbProfch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbProfch", localUtil.format(AV36TFAlbProfch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCli") == 0 )
         {
            AV49TFBarFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFBarFecCli", localUtil.format(AV49TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV54TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarNHdr", AV54TFBarNHdr);
            AV55TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarNHdr_Sel", AV55TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV57TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarSer", AV57TFBarSer);
            AV58TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarSer_Sel", AV58TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV60TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarSerDsc", AV60TFBarSerDsc);
            AV61TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarSerDsc_Sel", AV61TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV63TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarNomCli", AV63TFBarNomCli);
            AV64TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFBarNomCli_Sel", AV64TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV66TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFBarColNom", AV66TFBarColNom);
            AV67TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFBarColNom_Sel", AV67TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV69TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarColNum), 6, 0));
            AV70TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgm") == 0 )
         {
            AV72TFBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFBarKgm", GXutil.ltrimstr( AV72TFBarKgm, 9, 2));
            AV73TFBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFBarKgm_To", GXutil.ltrimstr( AV73TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtr") == 0 )
         {
            AV128TFBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128TFBarMtr", GXutil.ltrimstr( AV128TFBarMtr, 9, 2));
            AV129TFBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV129TFBarMtr_To", GXutil.ltrimstr( AV129TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbKgmE") == 0 )
         {
            AV75TFBarAlbKgmE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFBarAlbKgmE", GXutil.ltrimstr( AV75TFBarAlbKgmE, 9, 2));
            AV76TFBarAlbKgmE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFBarAlbKgmE_To", GXutil.ltrimstr( AV76TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbMtrE") == 0 )
         {
            AV78TFBarAlbMtrE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFBarAlbMtrE", GXutil.ltrimstr( AV78TFBarAlbMtrE, 9, 2));
            AV79TFBarAlbMtrE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFBarAlbMtrE_To", GXutil.ltrimstr( AV79TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPie") == 0 )
         {
            AV81TFBarAlbPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFBarAlbPie), 6, 0));
            AV82TFBarAlbPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAncAca1") == 0 )
         {
            AV85TFBarAncAca1 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarAncAca1), 3, 0));
            AV86TFBarAncAca1_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarAncAca1_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarAncAca1_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TrnCod") == 0 )
         {
            AV101TFTrnCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101TFTrnCod), 4, 0));
            AV102TFTrnCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102TFTrnCod_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e23MT2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV15BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavBarenccli_Internalname, AV15BarEncCli);
      GXt_char1 = AV45TipArtDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char4) ;
      webwlisalp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV45TipArtDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavTipartdsc_Internalname, AV45TipArtDsc);
      GXt_char1 = AV46TipColDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A218BarTipCol ;
      GXv_char3[0] = GXt_char1 ;
      new app.pfcoldsc(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
      webwlisalp_impl.this.A396EmprCod = GXv_char4[0] ;
      webwlisalp_impl.this.A218BarTipCol = GXv_int8[0] ;
      webwlisalp_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV46TipColDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavTipcoldsc_Internalname, AV46TipColDsc);
      GXv_char4[0] = AV47IntDsc ;
      GXv_char3[0] = " " ;
      GXv_int9[0] = (short)(0) ;
      GXv_int8[0] = (byte)(0) ;
      GXv_char2[0] = "" ;
      GXv_char10[0] = " " ;
      GXv_int11[0] = 0 ;
      GXv_char12[0] = " " ;
      GXv_char13[0] = " " ;
      GXv_int14[0] = (short)(0) ;
      GXv_char15[0] = " " ;
      GXv_char16[0] = " " ;
      new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char4, GXv_char3, GXv_int9, GXv_int8, GXv_char2, GXv_char10, GXv_int11, GXv_char12, GXv_char13, GXv_int14, GXv_char15, GXv_char16) ;
      webwlisalp_impl.this.AV47IntDsc = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavIntdsc_Internalname, AV47IntDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTDSC"+"_"+sGXsfl_119_idx, getSecureSignedToken( sGXsfl_119_idx, GXutil.rtrim( localUtil.format( AV47IntDsc, ""))));
      AV83Trozos = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavTrozos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83Trozos), 4, 0));
      /* Optimized group. */
      /* Using cursor H00MT6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      cV83Trozos = H00MT6_AV83Trozos[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavTrozos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(cV83Trozos), 4, 0));
      pr_default.close(3);
      AV83Trozos = (short)(AV83Trozos+cV83Trozos*1) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavTrozos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83Trozos), 4, 0));
      /* End optimized group. */
      GXt_char1 = AV99CliNom ;
      GXv_char16[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( A396EmprCod, A3869AlbCliDes, GXv_char16) ;
      webwlisalp_impl.this.GXt_char1 = GXv_char16[0] ;
      AV99CliNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV99CliNom);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(119) ;
      }
      sendrow_1192( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_119_Refreshing )
      {
         httpContext.doAjaxLoad(119, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e17MT2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebWLISALPColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12MT2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWLISALPFilters")),GXutil.URLEncode(GXutil.rtrim(AV178Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWLISALPFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char16[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebWLISALPFilters", Ddo_managefilters_Activeeventkey, GXv_char16) ;
         webwlisalp_impl.this.GXt_char1 = GXv_char16[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV178Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      AV87AlbProFch = GXutil.dadd(GXutil.today( ),-(7)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87AlbProFch", localUtil.format(AV87AlbProFch, "99/99/99"));
      AV88AlbProFch_To = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProFch_To", localUtil.format(AV88AlbProFch_To, "99/99/99"));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e18MT2( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(2);
      returnInSub = true;
      if (true) return;
   }

   public void e19MT2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      GXv_char16[0] = AV16ExcelFilename ;
      GXv_char15[0] = AV17ErrorMessage ;
      new app.webwlisalpexport(remoteHandle, context).execute( GXv_char16, GXv_char15) ;
      webwlisalp_impl.this.AV16ExcelFilename = GXv_char16[0] ;
      webwlisalp_impl.this.AV17ErrorMessage = GXv_char15[0] ;
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

   public void e20MT2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      callWebObject(formatLink("app.webwlisalpexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e15MT2( )
   {
      /* Albprofch_rangepicker_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87AlbProFch", localUtil.format(AV87AlbProFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProFch_To", localUtil.format(AV88AlbProFch_To, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV89GuiRemCli, AV90GuiRemCli_To, AV93BarSer, AV94BarSer_To, AV95BarColNom, AV96BarColNom_To, AV97BarColNum, AV98BarColNum_To, AV87AlbProFch, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV88AlbProFch_To, AV27TFGuiRemCli, AV28TFGuiRemCli_To, AV30TFGuiRemCln, AV31TFGuiRemCln_Sel, AV33TFAlbProCod, AV34TFAlbProCod_To, AV36TFAlbProfch, AV49TFBarFecCli, AV54TFBarNHdr, AV55TFBarNHdr_Sel, AV57TFBarSer, AV58TFBarSer_Sel, AV60TFBarSerDsc, AV61TFBarSerDsc_Sel, AV63TFBarNomCli, AV64TFBarNomCli_Sel, AV66TFBarColNom, AV67TFBarColNom_Sel, AV69TFBarColNum, AV70TFBarColNum_To, AV72TFBarKgm, AV73TFBarKgm_To, AV128TFBarMtr, AV129TFBarMtr_To, AV75TFBarAlbKgmE, AV76TFBarAlbKgmE_To, AV78TFBarAlbMtrE, AV79TFBarAlbMtrE_To, AV81TFBarAlbPie, AV82TFBarAlbPie_To, AV85TFBarAncAca1, AV86TFBarAncAca1_To, AV101TFTrnCod, AV102TFTrnCod_To, AV178Pgmname, AV12OrderedBy, AV13OrderedDsc, A143BarDisNum, A4812BarEncCli, A217BarTipArt, A218BarTipCol, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, AV47IntDsc, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, A42AlbPTroCod) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
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
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "GuiRemCli", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "GuiRemCln", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "AlbProCod", "", "Numero Albaran Produccion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "AlbProfch", "", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&BarEncCli", "", "Ped Cli", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarFecCli", "", "Fecha Disposicion Cliente", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarNHdr", "", "N Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarSer", "", "Serie", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&TipArtDsc", "", "Tipo de Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarColNom", "", "Nombre Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarColNum", "", "Numero del Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&TipColDsc", "", "Tc", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&IntDsc", "", "Intensidad", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarKgm", "", "Kilos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarMtr", "", "Metros", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarAlbKgmE", "", "Kilos Ent", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarAlbMtrE", "", "Metros Ent", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarAlbPie", "", "Piezas Ent", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarAncAca1", "", "Ancho", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&Trozos", "", "N Trozos", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "TrnCod", "", "Transportista", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&CliNom", "", "Cliente Destino", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char16[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWLISALPColumnsSelector", GXv_char16) ;
      webwlisalp_impl.this.GXt_char1 = GXv_char16[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector17[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector18[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, GXv_SdtWWPColumnsSelector18) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector17[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebWLISALPFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV87AlbProFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87AlbProFch", localUtil.format(AV87AlbProFch, "99/99/99"));
      AV88AlbProFch_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProFch_To", localUtil.format(AV88AlbProFch_To, "99/99/99"));
      AV89GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89GuiRemCli), 6, 0));
      AV90GuiRemCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90GuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90GuiRemCli_To), 6, 0));
      AV93BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93BarSer", AV93BarSer);
      AV94BarSer_To = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94BarSer_To", AV94BarSer_To);
      AV95BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95BarColNom", AV95BarColNom);
      AV96BarColNom_To = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96BarColNom_To", AV96BarColNom_To);
      AV97BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97BarColNum), 6, 0));
      AV98BarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarColNum_To), 6, 0));
      AV27TFGuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFGuiRemCli), 6, 0));
      AV28TFGuiRemCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFGuiRemCli_To), 6, 0));
      AV30TFGuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFGuiRemCln", AV30TFGuiRemCln);
      AV31TFGuiRemCln_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFGuiRemCln_Sel", AV31TFGuiRemCln_Sel);
      AV33TFAlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFAlbProCod), 10, 0));
      AV34TFAlbProCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFAlbProCod_To), 10, 0));
      AV36TFAlbProfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbProfch", localUtil.format(AV36TFAlbProfch, "99/99/99"));
      AV49TFBarFecCli = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFBarFecCli", localUtil.format(AV49TFBarFecCli, "99/99/99"));
      AV54TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarNHdr", AV54TFBarNHdr);
      AV55TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarNHdr_Sel", AV55TFBarNHdr_Sel);
      AV57TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarSer", AV57TFBarSer);
      AV58TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarSer_Sel", AV58TFBarSer_Sel);
      AV60TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarSerDsc", AV60TFBarSerDsc);
      AV61TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarSerDsc_Sel", AV61TFBarSerDsc_Sel);
      AV63TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarNomCli", AV63TFBarNomCli);
      AV64TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFBarNomCli_Sel", AV64TFBarNomCli_Sel);
      AV66TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFBarColNom", AV66TFBarColNom);
      AV67TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFBarColNom_Sel", AV67TFBarColNom_Sel);
      AV69TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarColNum), 6, 0));
      AV70TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFBarColNum_To), 6, 0));
      AV72TFBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFBarKgm", GXutil.ltrimstr( AV72TFBarKgm, 9, 2));
      AV73TFBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFBarKgm_To", GXutil.ltrimstr( AV73TFBarKgm_To, 9, 2));
      AV128TFBarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV128TFBarMtr", GXutil.ltrimstr( AV128TFBarMtr, 9, 2));
      AV129TFBarMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129TFBarMtr_To", GXutil.ltrimstr( AV129TFBarMtr_To, 9, 2));
      AV75TFBarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFBarAlbKgmE", GXutil.ltrimstr( AV75TFBarAlbKgmE, 9, 2));
      AV76TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFBarAlbKgmE_To", GXutil.ltrimstr( AV76TFBarAlbKgmE_To, 9, 2));
      AV78TFBarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TFBarAlbMtrE", GXutil.ltrimstr( AV78TFBarAlbMtrE, 9, 2));
      AV79TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFBarAlbMtrE_To", GXutil.ltrimstr( AV79TFBarAlbMtrE_To, 9, 2));
      AV81TFBarAlbPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFBarAlbPie), 6, 0));
      AV82TFBarAlbPie_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFBarAlbPie_To), 6, 0));
      AV85TFBarAncAca1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarAncAca1), 3, 0));
      AV86TFBarAncAca1_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarAncAca1_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarAncAca1_To), 3, 0));
      AV101TFTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101TFTrnCod), 4, 0));
      AV102TFTrnCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102TFTrnCod_To), 4, 0));
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
      if ( GXutil.strcmp(AV22Session.getValue(AV178Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV178Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV178Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
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
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROFCH") == 0 )
         {
            AV87AlbProFch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87AlbProFch", localUtil.format(AV87AlbProFch, "99/99/99"));
            AV88AlbProFch_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProFch_To", localUtil.format(AV88AlbProFch_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "GUIREMCLI") == 0 )
         {
            AV89GuiRemCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89GuiRemCli), 6, 0));
            AV90GuiRemCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90GuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90GuiRemCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSER") == 0 )
         {
            AV93BarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93BarSer", AV93BarSer);
            AV94BarSer_To = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94BarSer_To", AV94BarSer_To);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNOM") == 0 )
         {
            AV95BarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95BarColNom", AV95BarColNom);
            AV96BarColNom_To = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96BarColNom_To", AV96BarColNom_To);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNUM") == 0 )
         {
            AV97BarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97BarColNum), 6, 0));
            AV98BarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV27TFGuiRemCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFGuiRemCli), 6, 0));
            AV28TFGuiRemCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFGuiRemCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV30TFGuiRemCln = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFGuiRemCln", AV30TFGuiRemCln);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV31TFGuiRemCln_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFGuiRemCln_Sel", AV31TFGuiRemCln_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV33TFAlbProCod = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFAlbProCod), 10, 0));
            AV34TFAlbProCod_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV36TFAlbProfch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbProfch", localUtil.format(AV36TFAlbProfch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV49TFBarFecCli = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFBarFecCli", localUtil.format(AV49TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV54TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarNHdr", AV54TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV55TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarNHdr_Sel", AV55TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV57TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarSer", AV57TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV58TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarSer_Sel", AV58TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV60TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarSerDsc", AV60TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV61TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarSerDsc_Sel", AV61TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV63TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarNomCli", AV63TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV64TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFBarNomCli_Sel", AV64TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV66TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFBarColNom", AV66TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV67TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFBarColNom_Sel", AV67TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV69TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarColNum), 6, 0));
            AV70TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV72TFBarKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFBarKgm", GXutil.ltrimstr( AV72TFBarKgm, 9, 2));
            AV73TFBarKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFBarKgm_To", GXutil.ltrimstr( AV73TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV128TFBarMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128TFBarMtr", GXutil.ltrimstr( AV128TFBarMtr, 9, 2));
            AV129TFBarMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV129TFBarMtr_To", GXutil.ltrimstr( AV129TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV75TFBarAlbKgmE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFBarAlbKgmE", GXutil.ltrimstr( AV75TFBarAlbKgmE, 9, 2));
            AV76TFBarAlbKgmE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFBarAlbKgmE_To", GXutil.ltrimstr( AV76TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV78TFBarAlbMtrE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFBarAlbMtrE", GXutil.ltrimstr( AV78TFBarAlbMtrE, 9, 2));
            AV79TFBarAlbMtrE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFBarAlbMtrE_To", GXutil.ltrimstr( AV79TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV81TFBarAlbPie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFBarAlbPie), 6, 0));
            AV82TFBarAlbPie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARANCACA1") == 0 )
         {
            AV85TFBarAncAca1 = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarAncAca1), 3, 0));
            AV86TFBarAncAca1_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarAncAca1_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarAncAca1_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV101TFTrnCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101TFTrnCod), 4, 0));
            AV102TFTrnCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102TFTrnCod_To), 4, 0));
         }
         AV179GXV1 = (int)(AV179GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char16[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFGuiRemCln_Sel)==0), AV31TFGuiRemCln_Sel, GXv_char16) ;
      webwlisalp_impl.this.GXt_char1 = GXv_char16[0] ;
      GXt_char21 = "" ;
      GXv_char15[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFBarNHdr_Sel)==0), AV55TFBarNHdr_Sel, GXv_char15) ;
      webwlisalp_impl.this.GXt_char21 = GXv_char15[0] ;
      GXt_char22 = "" ;
      GXv_char13[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFBarSer_Sel)==0), AV58TFBarSer_Sel, GXv_char13) ;
      webwlisalp_impl.this.GXt_char22 = GXv_char13[0] ;
      GXt_char23 = "" ;
      GXv_char12[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFBarSerDsc_Sel)==0), AV61TFBarSerDsc_Sel, GXv_char12) ;
      webwlisalp_impl.this.GXt_char23 = GXv_char12[0] ;
      GXt_char24 = "" ;
      GXv_char10[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFBarNomCli_Sel)==0), AV64TFBarNomCli_Sel, GXv_char10) ;
      webwlisalp_impl.this.GXt_char24 = GXv_char10[0] ;
      GXt_char25 = "" ;
      GXv_char4[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFBarColNom_Sel)==0), AV67TFBarColNom_Sel, GXv_char4) ;
      webwlisalp_impl.this.GXt_char25 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|||||"+GXt_char21+"|"+GXt_char22+"|"+GXt_char23+"||"+GXt_char24+"|"+GXt_char25+"||||||||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char25 = "" ;
      GXv_char16[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFGuiRemCln)==0), AV30TFGuiRemCln, GXv_char16) ;
      webwlisalp_impl.this.GXt_char25 = GXv_char16[0] ;
      GXt_char24 = "" ;
      GXv_char15[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFBarNHdr)==0), AV54TFBarNHdr, GXv_char15) ;
      webwlisalp_impl.this.GXt_char24 = GXv_char15[0] ;
      GXt_char23 = "" ;
      GXv_char13[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFBarSer)==0), AV57TFBarSer, GXv_char13) ;
      webwlisalp_impl.this.GXt_char23 = GXv_char13[0] ;
      GXt_char22 = "" ;
      GXv_char12[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFBarSerDsc)==0), AV60TFBarSerDsc, GXv_char12) ;
      webwlisalp_impl.this.GXt_char22 = GXv_char12[0] ;
      GXt_char21 = "" ;
      GXv_char10[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFBarNomCli)==0), AV63TFBarNomCli, GXv_char10) ;
      webwlisalp_impl.this.GXt_char21 = GXv_char10[0] ;
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFBarColNom)==0), AV66TFBarColNom, GXv_char4) ;
      webwlisalp_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV27TFGuiRemCli) ? "" : GXutil.str( AV27TFGuiRemCli, 6, 0))+"|"+GXt_char25+"|"+((0==AV33TFAlbProCod) ? "" : GXutil.str( AV33TFAlbProCod, 10, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFAlbProfch)) ? "" : localUtil.dtoc( AV36TFAlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFBarFecCli)) ? "" : localUtil.dtoc( AV49TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char24+"|"+GXt_char23+"|"+GXt_char22+"||"+GXt_char21+"|"+GXt_char1+"|"+((0==AV69TFBarColNum) ? "" : GXutil.str( AV69TFBarColNum, 6, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarKgm)==0) ? "" : GXutil.str( AV72TFBarKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV128TFBarMtr)==0) ? "" : GXutil.str( AV128TFBarMtr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFBarAlbKgmE)==0) ? "" : GXutil.str( AV75TFBarAlbKgmE, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFBarAlbMtrE)==0) ? "" : GXutil.str( AV78TFBarAlbMtrE, 9, 2))+"|"+((0==AV81TFBarAlbPie) ? "" : GXutil.str( AV81TFBarAlbPie, 6, 0))+"|"+((0==AV85TFBarAncAca1) ? "" : GXutil.str( AV85TFBarAncAca1, 3, 0))+"||"+((0==AV101TFTrnCod) ? "" : GXutil.str( AV101TFTrnCod, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV28TFGuiRemCli_To) ? "" : GXutil.str( AV28TFGuiRemCli_To, 6, 0))+"||"+((0==AV34TFAlbProCod_To) ? "" : GXutil.str( AV34TFAlbProCod_To, 10, 0))+"||||||||||"+((0==AV70TFBarColNum_To) ? "" : GXutil.str( AV70TFBarColNum_To, 6, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFBarKgm_To)==0) ? "" : GXutil.str( AV73TFBarKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV129TFBarMtr_To)==0) ? "" : GXutil.str( AV129TFBarMtr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFBarAlbKgmE_To)==0) ? "" : GXutil.str( AV76TFBarAlbKgmE_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFBarAlbMtrE_To)==0) ? "" : GXutil.str( AV79TFBarAlbMtrE_To, 9, 2))+"|"+((0==AV82TFBarAlbPie_To) ? "" : GXutil.str( AV82TFBarAlbPie_To, 6, 0))+"|"+((0==AV86TFBarAncAca1_To) ? "" : GXutil.str( AV86TFBarAncAca1_To, 3, 0))+"||"+((0==AV102TFTrnCod_To) ? "" : GXutil.str( AV102TFTrnCod_To, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV178Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "ALBPROFCH", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87AlbProFch))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88AlbProFch_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV87AlbProFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV88AlbProFch_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "GUIREMCLI", "", !((0==AV89GuiRemCli)&&(0==AV90GuiRemCli_To)), (short)(0), GXutil.trim( GXutil.str( AV89GuiRemCli, 6, 0)), GXutil.trim( GXutil.str( AV90GuiRemCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "BARSER", "", !((GXutil.strcmp("", AV93BarSer)==0)&&(GXutil.strcmp("", AV94BarSer_To)==0)), (short)(0), AV93BarSer, AV94BarSer_To) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "BARCOLNOM", "", !((GXutil.strcmp("", AV95BarColNom)==0)&&(GXutil.strcmp("", AV96BarColNom_To)==0)), (short)(0), AV95BarColNom, AV96BarColNom_To) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "BARCOLNUM", "", !((0==AV97BarColNum)&&(0==AV98BarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV97BarColNum, 6, 0)), GXutil.trim( GXutil.str( AV98BarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFGUIREMCLI", "", !((0==AV27TFGuiRemCli)&&(0==AV28TFGuiRemCli_To)), (short)(0), GXutil.trim( GXutil.str( AV27TFGuiRemCli, 6, 0)), GXutil.trim( GXutil.str( AV28TFGuiRemCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFGUIREMCLN", "", !(GXutil.strcmp("", AV30TFGuiRemCln)==0), (short)(0), AV30TFGuiRemCln, "", !(GXutil.strcmp("", AV31TFGuiRemCln_Sel)==0), AV31TFGuiRemCln_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFALBPROCOD", "", !((0==AV33TFAlbProCod)&&(0==AV34TFAlbProCod_To)), (short)(0), GXutil.trim( GXutil.str( AV33TFAlbProCod, 10, 0)), GXutil.trim( GXutil.str( AV34TFAlbProCod_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFALBPROFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFAlbProfch)), (short)(0), GXutil.trim( localUtil.dtoc( AV36TFAlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFBarFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV49TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARNHDR", "", !(GXutil.strcmp("", AV54TFBarNHdr)==0), (short)(0), AV54TFBarNHdr, "", !(GXutil.strcmp("", AV55TFBarNHdr_Sel)==0), AV55TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARSER", "", !(GXutil.strcmp("", AV57TFBarSer)==0), (short)(0), AV57TFBarSer, "", !(GXutil.strcmp("", AV58TFBarSer_Sel)==0), AV58TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARSERDSC", "", !(GXutil.strcmp("", AV60TFBarSerDsc)==0), (short)(0), AV60TFBarSerDsc, "", !(GXutil.strcmp("", AV61TFBarSerDsc_Sel)==0), AV61TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV63TFBarNomCli)==0), (short)(0), AV63TFBarNomCli, "", !(GXutil.strcmp("", AV64TFBarNomCli_Sel)==0), AV64TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV66TFBarColNom)==0), (short)(0), AV66TFBarColNom, "", !(GXutil.strcmp("", AV67TFBarColNom_Sel)==0), AV67TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARCOLNUM", "", !((0==AV69TFBarColNum)&&(0==AV70TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV69TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV70TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV72TFBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV73TFBarKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV128TFBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV129TFBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV128TFBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV129TFBarMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARALBKGME", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFBarAlbKgmE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFBarAlbKgmE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV75TFBarAlbKgmE, 9, 2)), GXutil.trim( GXutil.str( AV76TFBarAlbKgmE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARALBMTRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFBarAlbMtrE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFBarAlbMtrE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV78TFBarAlbMtrE, 9, 2)), GXutil.trim( GXutil.str( AV79TFBarAlbMtrE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARALBPIE", "", !((0==AV81TFBarAlbPie)&&(0==AV82TFBarAlbPie_To)), (short)(0), GXutil.trim( GXutil.str( AV81TFBarAlbPie, 6, 0)), GXutil.trim( GXutil.str( AV82TFBarAlbPie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFBARANCACA1", "", !((0==AV85TFBarAncAca1)&&(0==AV86TFBarAncAca1_To)), (short)(0), GXutil.trim( GXutil.str( AV85TFBarAncAca1, 3, 0)), GXutil.trim( GXutil.str( AV86TFBarAncAca1_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFTRNCOD", "", !((0==AV101TFTrnCod)&&(0==AV102TFTrnCod_To)), (short)(0), GXutil.trim( GXutil.str( AV101TFTrnCod, 4, 0)), GXutil.trim( GXutil.str( AV102TFTrnCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
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
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn07" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table5_108_MT2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefilters_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_108_MT2e( true) ;
      }
      else
      {
         wb_table5_108_MT2e( false) ;
      }
   }

   public void wb_table4_82_MT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarcolnum_Internalname, tblTablemergedbarcolnum_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Bar Col Num", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV97BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV97BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV97BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarcolnum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBarcolnum_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblBarcolnum_rangemiddletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebWLISALP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_to_Internalname, httpContext.getMessage( "Bar Col Num_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV98BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV98BarColNum_To), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV98BarColNum_To), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarcolnum_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcolnum_to_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_82_MT2e( true) ;
      }
      else
      {
         wb_table4_82_MT2e( false) ;
      }
   }

   public void wb_table3_66_MT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarcolnom_Internalname, tblTablemergedbarcolnom_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Bar Col Nom", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV95BarColNom), GXutil.rtrim( localUtil.format( AV95BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarcolnom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBarcolnom_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblBarcolnom_rangemiddletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebWLISALP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_to_Internalname, httpContext.getMessage( "Bar Col Nom_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_to_Internalname, GXutil.rtrim( AV96BarColNom_To), GXutil.rtrim( localUtil.format( AV96BarColNom_To, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarcolnom_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcolnom_to_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_66_MT2e( true) ;
      }
      else
      {
         wb_table3_66_MT2e( false) ;
      }
   }

   public void wb_table2_50_MT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarser_Internalname, tblTablemergedbarser_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Bar Ser", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV93BarSer), GXutil.rtrim( localUtil.format( AV93BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarser_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBarser_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblBarser_rangemiddletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebWLISALP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_to_Internalname, httpContext.getMessage( "Bar Ser_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_to_Internalname, GXutil.rtrim( AV94BarSer_To), GXutil.rtrim( localUtil.format( AV94BarSer_To, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarser_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarser_to_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_50_MT2e( true) ;
      }
      else
      {
         wb_table2_50_MT2e( false) ;
      }
   }

   public void wb_table1_34_MT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedguiremcli_Internalname, tblTablemergedguiremcli_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcli_Internalname, httpContext.getMessage( "Gui Rem Cli", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV89GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV89GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV89GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavGuiremcli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavGuiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblGuiremcli_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblGuiremcli_rangemiddletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebWLISALP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcli_to_Internalname, httpContext.getMessage( "Gui Rem Cli_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_119_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV90GuiRemCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV90GuiRemCli_To), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV90GuiRemCli_To), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavGuiremcli_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavGuiremcli_to_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWLISALP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_34_MT2e( true) ;
      }
      else
      {
         wb_table1_34_MT2e( false) ;
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
      paMT2( ) ;
      wsMT2( ) ;
      weMT2( ) ;
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
      if ( ! ( WebComp_Wcwcentregasresumencliente == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcentregasresumencliente_Component) != 0 )
         {
            WebComp_Wcwcentregasresumencliente.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116123954", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("webwlisalp.js", "?202682116123955", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_1192( )
   {
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_119_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_119_idx ;
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_119_idx ;
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_119_idx ;
      edtavBarenccli_Internalname = "vBARENCCLI_"+sGXsfl_119_idx ;
      edtBarFecCli_Internalname = "BARFECCLI_"+sGXsfl_119_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_119_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_119_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_119_idx ;
      edtavTipartdsc_Internalname = "vTIPARTDSC_"+sGXsfl_119_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_119_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_119_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_119_idx ;
      edtavTipcoldsc_Internalname = "vTIPCOLDSC_"+sGXsfl_119_idx ;
      edtavIntdsc_Internalname = "vINTDSC_"+sGXsfl_119_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_119_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_119_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_119_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_119_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_119_idx ;
      edtBarAncAca1_Internalname = "BARANCACA1_"+sGXsfl_119_idx ;
      edtavTrozos_Internalname = "vTROZOS_"+sGXsfl_119_idx ;
      edtTrnCod_Internalname = "TRNCOD_"+sGXsfl_119_idx ;
      edtavClinom_Internalname = "vCLINOM_"+sGXsfl_119_idx ;
   }

   public void subsflControlProps_fel_1192( )
   {
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_119_fel_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_119_fel_idx ;
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_119_fel_idx ;
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_119_fel_idx ;
      edtavBarenccli_Internalname = "vBARENCCLI_"+sGXsfl_119_fel_idx ;
      edtBarFecCli_Internalname = "BARFECCLI_"+sGXsfl_119_fel_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_119_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_119_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_119_fel_idx ;
      edtavTipartdsc_Internalname = "vTIPARTDSC_"+sGXsfl_119_fel_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_119_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_119_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_119_fel_idx ;
      edtavTipcoldsc_Internalname = "vTIPCOLDSC_"+sGXsfl_119_fel_idx ;
      edtavIntdsc_Internalname = "vINTDSC_"+sGXsfl_119_fel_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_119_fel_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_119_fel_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_119_fel_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_119_fel_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_119_fel_idx ;
      edtBarAncAca1_Internalname = "BARANCACA1_"+sGXsfl_119_fel_idx ;
      edtavTrozos_Internalname = "vTROZOS_"+sGXsfl_119_fel_idx ;
      edtTrnCod_Internalname = "TRNCOD_"+sGXsfl_119_fel_idx ;
      edtavClinom_Internalname = "vCLINOM_"+sGXsfl_119_fel_idx ;
   }

   public void sendrow_1192( )
   {
      subsflControlProps_1192( ) ;
      wbMT0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_119_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_119_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_119_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGuiRemCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGuiRemCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtGuiRemCln_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCln_Internalname,GXutil.rtrim( A1244GuiRemCln),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGuiRemCln_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCod_Internalname,GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbProCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProfch_Internalname,localUtil.format(A34AlbProfch, "99/99/99"),localUtil.format( A34AlbProfch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbProfch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccli_Internalname,GXutil.rtrim( AV15BarEncCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarenccli_Visible),Integer.valueOf(edtavBarenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavTipartdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipartdsc_Internalname,GXutil.rtrim( AV45TipArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTipartdsc_Visible),Integer.valueOf(edtavTipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavTipcoldsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipcoldsc_Internalname,GXutil.rtrim( AV46TipColDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTipcoldsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTipcoldsc_Visible),Integer.valueOf(edtavTipcoldsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIntdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIntdsc_Internalname,GXutil.rtrim( AV47IntDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIntdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIntdsc_Visible),Integer.valueOf(edtavIntdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbKgmE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbKgmE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbMtrE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbMtrE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAncAca1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAncAca1_Internalname,GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAncAca1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAncAca1_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavTrozos_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrozos_Internalname,GXutil.ltrim( localUtil.ntoc( AV83Trozos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrozos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83Trozos), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV83Trozos), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrozos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTrozos_Visible),Integer.valueOf(edtavTrozos_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTrnCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnCod_Internalname,GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Codigo Transportista", ""),"",edtTrnCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTrnCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClinom_Internalname,GXutil.rtrim( AV99CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavClinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavClinom_Visible),Integer.valueOf(edtavClinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(119),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesMT2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_119_idx = ((subGrid_Islastpage==1)&&(nGXsfl_119_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_119_idx+1) ;
         sGXsfl_119_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_119_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1192( ) ;
      }
      /* End function sendrow_1192 */
   }

   public void startgridcontrol119( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"119\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiRemCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiRemCln_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Albaran Produccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ped Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Disposicion Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTipartdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo de Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero del Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTipcoldsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIntdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbKgmE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbMtrE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAncAca1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTrozos_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Trozos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTrnCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente Destino", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiRemCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1244GuiRemCln));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiRemCln_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A34AlbProfch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV15BarEncCli));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV45TipArtDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTipartdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV46TipColDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipcoldsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTipcoldsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV47IntDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIntdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIntdsc_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAncAca1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV83Trozos, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrozos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTrozos_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTrnCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV99CliNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClinom_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavAlbprofch_rangetext_Internalname = "vALBPROFCH_RANGETEXT" ;
      lblFiltertextguiremcli_Internalname = "FILTERTEXTGUIREMCLI" ;
      edtavGuiremcli_Internalname = "vGUIREMCLI" ;
      lblGuiremcli_rangemiddletext_Internalname = "GUIREMCLI_RANGEMIDDLETEXT" ;
      edtavGuiremcli_to_Internalname = "vGUIREMCLI_TO" ;
      tblTablemergedguiremcli_Internalname = "TABLEMERGEDGUIREMCLI" ;
      divTablesplittedfiltertextguiremcli_Internalname = "TABLESPLITTEDFILTERTEXTGUIREMCLI" ;
      lblFiltertextbarser_Internalname = "FILTERTEXTBARSER" ;
      edtavBarser_Internalname = "vBARSER" ;
      lblBarser_rangemiddletext_Internalname = "BARSER_RANGEMIDDLETEXT" ;
      edtavBarser_to_Internalname = "vBARSER_TO" ;
      tblTablemergedbarser_Internalname = "TABLEMERGEDBARSER" ;
      divTablesplittedfiltertextbarser_Internalname = "TABLESPLITTEDFILTERTEXTBARSER" ;
      lblFiltertextbarcolnom_Internalname = "FILTERTEXTBARCOLNOM" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      lblBarcolnom_rangemiddletext_Internalname = "BARCOLNOM_RANGEMIDDLETEXT" ;
      edtavBarcolnom_to_Internalname = "vBARCOLNOM_TO" ;
      tblTablemergedbarcolnom_Internalname = "TABLEMERGEDBARCOLNOM" ;
      divTablesplittedfiltertextbarcolnom_Internalname = "TABLESPLITTEDFILTERTEXTBARCOLNOM" ;
      lblFiltertextbarcolnum_Internalname = "FILTERTEXTBARCOLNUM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      lblBarcolnum_rangemiddletext_Internalname = "BARCOLNUM_RANGEMIDDLETEXT" ;
      edtavBarcolnum_to_Internalname = "vBARCOLNUM_TO" ;
      tblTablemergedbarcolnum_Internalname = "TABLEMERGEDBARCOLNUM" ;
      divTablesplittedfiltertextbarcolnum_Internalname = "TABLESPLITTEDFILTERTEXTBARCOLNUM" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      divTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtavBarenccli_Internalname = "vBARENCCLI" ;
      edtBarFecCli_Internalname = "BARFECCLI" ;
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtavTipartdsc_Internalname = "vTIPARTDSC" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtavTipcoldsc_Internalname = "vTIPCOLDSC" ;
      edtavIntdsc_Internalname = "vINTDSC" ;
      edtBarKgm_Internalname = "BARKGM" ;
      edtBarMtr_Internalname = "BARMTR" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      edtBarAlbPie_Internalname = "BARALBPIE" ;
      edtBarAncAca1_Internalname = "BARANCACA1" ;
      edtavTrozos_Internalname = "vTROZOS" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Albprofch_rangepicker_Internalname = "ALBPROFCH_RANGEPICKER" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albprofchauxdate_Internalname = "vDDO_ALBPROFCHAUXDATE" ;
      divDdo_albprofchauxdates_Internalname = "DDO_ALBPROFCHAUXDATES" ;
      edtavDdo_barfeccliauxdate_Internalname = "vDDO_BARFECCLIAUXDATE" ;
      divDdo_barfeccliauxdates_Internalname = "DDO_BARFECCLIAUXDATES" ;
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
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtavTrozos_Jsonclick = "" ;
      edtavTrozos_Enabled = 0 ;
      edtBarAncAca1_Jsonclick = "" ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtavIntdsc_Jsonclick = "" ;
      edtavIntdsc_Enabled = 0 ;
      edtavTipcoldsc_Jsonclick = "" ;
      edtavTipcoldsc_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtavTipartdsc_Jsonclick = "" ;
      edtavTipartdsc_Enabled = 0 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 0 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProCod_Jsonclick = "" ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCli_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavGuiremcli_to_Jsonclick = "" ;
      edtavGuiremcli_to_Enabled = 1 ;
      edtavGuiremcli_Jsonclick = "" ;
      edtavGuiremcli_Enabled = 1 ;
      edtavBarser_to_Jsonclick = "" ;
      edtavBarser_to_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavBarcolnom_to_Jsonclick = "" ;
      edtavBarcolnom_to_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarcolnum_to_Jsonclick = "" ;
      edtavBarcolnum_to_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavClinom_Visible = -1 ;
      edtTrnCod_Visible = -1 ;
      edtavTrozos_Visible = -1 ;
      edtBarAncAca1_Visible = -1 ;
      edtBarAlbPie_Visible = -1 ;
      edtBarAlbMtrE_Visible = -1 ;
      edtBarAlbKgmE_Visible = -1 ;
      edtBarMtr_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtavIntdsc_Visible = -1 ;
      edtavTipcoldsc_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtavTipartdsc_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtBarFecCli_Visible = -1 ;
      edtavBarenccli_Visible = -1 ;
      edtAlbProfch_Visible = -1 ;
      edtAlbProCod_Visible = -1 ;
      edtGuiRemCln_Visible = -1 ;
      edtGuiRemCli_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfeccliauxdate_Jsonclick = "" ;
      edtavDdo_albprofchauxdate_Jsonclick = "" ;
      edtavAlbprofch_rangetext_Jsonclick = "" ;
      edtavAlbprofch_rangetext_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WebWLISALPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|||||Dynamic|Dynamic|Dynamic||Dynamic|Dynamic||||||||||||" ;
      Ddo_grid_Includedatalist = "|T|||||T|T|T||T|T||||||||||||" ;
      Ddo_grid_Filterisrange = "T||T||||||||||T|||T|T|T|T|T|T||T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Numeric|Date||Date|Character|Character|Character||Character|Character|Numeric|||Numeric|Numeric|Numeric|Numeric|Numeric|Numeric||Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T||T|T|T|T||T|T|T|||T|T|T|T|T|T||T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T||T|T||T|T|T|||||T|T|T|T||T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|1||5||6|7||8|9|10|||||11|12|13|14||15|" ;
      Ddo_grid_Columnids = "0:GuiRemCli|1:GuiRemCln|2:AlbProCod|3:AlbProfch|4:BarEncCli|5:BarFecCli|6:BarNHdr|7:BarSer|8:BarSerDsc|9:TipArtDsc|10:BarNomCli|11:BarColNom|12:BarColNum|13:TipColDsc|14:IntDsc|15:BarKgm|16:BarMtr|17:BarAlbKgmE|18:BarAlbMtrE|19:BarAlbPie|20:BarAncAca1|21:Trozos|22:TrnCod|23:CliNom" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Informe Resumen Cliente", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = "" ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
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
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informe Albaranes Produccion", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A42AlbPTroCod',fld:'ALBPTROCOD',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtavTipcoldsc_Visible',ctrl:'vTIPCOLDSC',prop:'Visible'},{av:'edtavIntdsc_Visible',ctrl:'vINTDSC',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtBarAncAca1_Visible',ctrl:'BARANCACA1',prop:'Visible'},{av:'edtavTrozos_Visible',ctrl:'vTROZOS',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e13MT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A42AlbPTroCod',fld:'ALBPTROCOD',pic:'ZZZ9'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e14MT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A42AlbPTroCod',fld:'ALBPTROCOD',pic:'ZZZ9'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e16MT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A42AlbPTroCod',fld:'ALBPTROCOD',pic:'ZZZ9'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e23MT2',iparms:[{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A42AlbPTroCod',fld:'ALBPTROCOD',pic:'ZZZ9'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV15BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV45TipArtDsc',fld:'vTIPARTDSC',pic:''},{av:'AV46TipColDsc',fld:'vTIPCOLDSC',pic:''},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV83Trozos',fld:'vTROZOS',pic:'ZZZ9'},{av:'AV99CliNom',fld:'vCLINOM',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e17MT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A42AlbPTroCod',fld:'ALBPTROCOD',pic:'ZZZ9'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtavTipcoldsc_Visible',ctrl:'vTIPCOLDSC',prop:'Visible'},{av:'edtavIntdsc_Visible',ctrl:'vINTDSC',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtBarAncAca1_Visible',ctrl:'BARANCACA1',prop:'Visible'},{av:'edtavTrozos_Visible',ctrl:'vTROZOS',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e12MT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A42AlbPTroCod',fld:'ALBPTROCOD',pic:'ZZZ9'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtavTipcoldsc_Visible',ctrl:'vTIPCOLDSC',prop:'Visible'},{av:'edtavIntdsc_Visible',ctrl:'vINTDSC',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtBarAncAca1_Visible',ctrl:'BARANCACA1',prop:'Visible'},{av:'edtavTrozos_Visible',ctrl:'vTROZOS',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e11MT1',iparms:[{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{ctrl:'WCWCENTREGASRESUMENCLIENTE'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e18MT2',iparms:[]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e19MT2',iparms:[{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A42AlbPTroCod',fld:'ALBPTROCOD',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e20MT2',iparms:[{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A42AlbPTroCod',fld:'ALBPTROCOD',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("ALBPROFCH_RANGEPICKER.DATERANGECHANGED","{handler:'e15MT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV89GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV90GuiRemCli_To',fld:'vGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV93BarSer',fld:'vBARSER',pic:''},{av:'AV94BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV95BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV96BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV97BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV27TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV28TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV31TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV33TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV34TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV36TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV54TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV55TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV57TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV58TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV60TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV61TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV63TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV66TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV67TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV69TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV70TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV73TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV129TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV75TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV76TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV79TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV81TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV82TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85TFBarAncAca1',fld:'vTFBARANCACA1',pic:'ZZ9'},{av:'AV86TFBarAncAca1_To',fld:'vTFBARANCACA1_TO',pic:'ZZ9'},{av:'AV101TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV102TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV47IntDsc',fld:'vINTDSC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A42AlbPTroCod',fld:'ALBPTROCOD',pic:'ZZZ9'}]");
      setEventMetadata("ALBPROFCH_RANGEPICKER.DATERANGECHANGED",",oparms:[{av:'AV87AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV88AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtavTipcoldsc_Visible',ctrl:'vTIPCOLDSC',prop:'Visible'},{av:'edtavIntdsc_Visible',ctrl:'vINTDSC',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarAlbKgmE_Visible',ctrl:'BARALBKGME',prop:'Visible'},{av:'edtBarAlbMtrE_Visible',ctrl:'BARALBMTRE',prop:'Visible'},{av:'edtBarAlbPie_Visible',ctrl:'BARALBPIE',prop:'Visible'},{av:'edtBarAncAca1_Visible',ctrl:'BARANCACA1',prop:'Visible'},{av:'edtavTrozos_Visible',ctrl:'vTROZOS',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Clinom',iparms:[]");
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
      pr_default.close(2);
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
      AV93BarSer = "" ;
      AV94BarSer_To = "" ;
      AV95BarColNom = "" ;
      AV96BarColNom_To = "" ;
      AV87AlbProFch = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV88AlbProFch_To = GXutil.nullDate() ;
      AV30TFGuiRemCln = "" ;
      AV31TFGuiRemCln_Sel = "" ;
      AV36TFAlbProfch = GXutil.nullDate() ;
      AV49TFBarFecCli = GXutil.nullDate() ;
      AV54TFBarNHdr = "" ;
      AV55TFBarNHdr_Sel = "" ;
      AV57TFBarSer = "" ;
      AV58TFBarSer_Sel = "" ;
      AV60TFBarSerDsc = "" ;
      AV61TFBarSerDsc_Sel = "" ;
      AV63TFBarNomCli = "" ;
      AV64TFBarNomCli_Sel = "" ;
      AV66TFBarColNom = "" ;
      AV67TFBarColNom_Sel = "" ;
      AV72TFBarKgm = DecimalUtil.ZERO ;
      AV73TFBarKgm_To = DecimalUtil.ZERO ;
      AV128TFBarMtr = DecimalUtil.ZERO ;
      AV129TFBarMtr_To = DecimalUtil.ZERO ;
      AV75TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV76TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV78TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV79TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV178Pgmname = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV47IntDsc = "" ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV41DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV116BarSer_to2 = "" ;
      AV113BarColNom_To2 = "" ;
      AV112AlbProFch_To2 = GXutil.nullDate() ;
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
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV121AlbProFch_RangeText = "" ;
      lblFiltertextguiremcli_Jsonclick = "" ;
      lblFiltertextbarser_Jsonclick = "" ;
      lblFiltertextbarcolnom_Jsonclick = "" ;
      lblFiltertextbarcolnum_Jsonclick = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcentregasresumencliente_Component = "" ;
      OldWcwcentregasresumencliente = "" ;
      ucAlbprofch_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV38DDO_AlbProfchAuxDate = GXutil.nullDate() ;
      AV51DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV15BarEncCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A1652BarSerDsc = "" ;
      AV45TipArtDsc = "" ;
      A1234BarNomCli = "" ;
      AV46TipColDsc = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV99CliNom = "" ;
      AV133Webwlisalpds_1_albprofch = GXutil.nullDate() ;
      AV134Webwlisalpds_2_albprofch_to = GXutil.nullDate() ;
      AV137Webwlisalpds_5_barser = "" ;
      AV138Webwlisalpds_6_barser_to = "" ;
      AV139Webwlisalpds_7_barcolnom = "" ;
      AV140Webwlisalpds_8_barcolnom_to = "" ;
      AV145Webwlisalpds_13_tfguiremcln = "" ;
      AV146Webwlisalpds_14_tfguiremcln_sel = "" ;
      AV149Webwlisalpds_17_tfalbprofch = GXutil.nullDate() ;
      AV150Webwlisalpds_18_tfbarfeccli = GXutil.nullDate() ;
      AV151Webwlisalpds_19_tfbarnhdr = "" ;
      AV152Webwlisalpds_20_tfbarnhdr_sel = "" ;
      AV153Webwlisalpds_21_tfbarser = "" ;
      AV154Webwlisalpds_22_tfbarser_sel = "" ;
      AV155Webwlisalpds_23_tfbarserdsc = "" ;
      AV156Webwlisalpds_24_tfbarserdsc_sel = "" ;
      AV157Webwlisalpds_25_tfbarnomcli = "" ;
      AV158Webwlisalpds_26_tfbarnomcli_sel = "" ;
      AV159Webwlisalpds_27_tfbarcolnom = "" ;
      AV160Webwlisalpds_28_tfbarcolnom_sel = "" ;
      AV163Webwlisalpds_31_tfbarkgm = DecimalUtil.ZERO ;
      AV164Webwlisalpds_32_tfbarkgm_to = DecimalUtil.ZERO ;
      AV165Webwlisalpds_33_tfbarmtr = DecimalUtil.ZERO ;
      AV166Webwlisalpds_34_tfbarmtr_to = DecimalUtil.ZERO ;
      AV167Webwlisalpds_35_tfbaralbkgme = DecimalUtil.ZERO ;
      AV168Webwlisalpds_36_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV169Webwlisalpds_37_tfbaralbmtre = DecimalUtil.ZERO ;
      AV170Webwlisalpds_38_tfbaralbmtre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV145Webwlisalpds_13_tfguiremcln = "" ;
      H00MT2_A1253EmprGuiRem = new String[] {""} ;
      H00MT2_A396EmprCod = new String[] {""} ;
      H00MT2_A30AlbProCod = new long[1] ;
      H00MT2_A3869AlbCliDes = new int[1] ;
      H00MT2_A840TrnCod = new short[1] ;
      H00MT2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H00MT2_A1244GuiRemCln = new String[] {""} ;
      H00MT2_A1243GuiRemCli = new int[1] ;
      A1253EmprGuiRem = "" ;
      H00MT3_A1253EmprGuiRem = new String[] {""} ;
      H00MT3_A396EmprCod = new String[] {""} ;
      H00MT3_A30AlbProCod = new long[1] ;
      H00MT3_A3869AlbCliDes = new int[1] ;
      H00MT3_A840TrnCod = new short[1] ;
      H00MT3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H00MT3_A1244GuiRemCln = new String[] {""} ;
      H00MT3_A1243GuiRemCli = new int[1] ;
      H00MT5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MT5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV109Station = "" ;
      AV110EmprNom = "" ;
      AV111UsurCod = "" ;
      AV132Emprcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int14 = new short[1] ;
      H00MT6_AV83Trozos = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector17 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector18 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char25 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char12 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char10 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState26 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      lblBarcolnum_rangemiddletext_Jsonclick = "" ;
      lblBarcolnom_rangemiddletext_Jsonclick = "" ;
      lblBarser_rangemiddletext_Jsonclick = "" ;
      lblGuiremcli_rangemiddletext_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwlisalp__default(),
         new Object[] {
             new Object[] {
            H00MT2_A1253EmprGuiRem, H00MT2_A396EmprCod, H00MT2_A30AlbProCod, H00MT2_A3869AlbCliDes, H00MT2_A840TrnCod, H00MT2_A34AlbProfch, H00MT2_A1244GuiRemCln, H00MT2_A1243GuiRemCli
            }
            , new Object[] {
            H00MT3_A1253EmprGuiRem, H00MT3_A396EmprCod, H00MT3_A30AlbProCod, H00MT3_A3869AlbCliDes, H00MT3_A840TrnCod, H00MT3_A34AlbProfch, H00MT3_A1244GuiRemCln, H00MT3_A1243GuiRemCli
            }
            , new Object[] {
            H00MT5_A166BarKgm, H00MT5_A184BarMtr
            }
            , new Object[] {
            H00MT6_AV83Trozos
            }
         }
      );
      AV178Pgmname = "WebWLISALP" ;
      /* GeneXus formulas. */
      AV178Pgmname = "WebWLISALP" ;
      Gx_err = (short)(0) ;
      edtavBarenccli_Enabled = 0 ;
      edtavTipartdsc_Enabled = 0 ;
      edtavTipcoldsc_Enabled = 0 ;
      edtavIntdsc_Enabled = 0 ;
      edtavTrozos_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      WebComp_Wcwcentregasresumencliente = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV85TFBarAncAca1 ;
   private short AV86TFBarAncAca1_To ;
   private short AV101TFTrnCod ;
   private short AV102TFTrnCod_To ;
   private short AV12OrderedBy ;
   private short A217BarTipArt ;
   private short A42AlbPTroCod ;
   private short wbEnd ;
   private short wbStart ;
   private short A125BarAncAca1 ;
   private short AV83Trozos ;
   private short A840TrnCod ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV173Webwlisalpds_41_tfbarancaca1 ;
   private short AV174Webwlisalpds_42_tfbarancaca1_to ;
   private short AV175Webwlisalpds_43_tftrncod ;
   private short AV176Webwlisalpds_44_tftrncod_to ;
   private short GXv_int9[] ;
   private short GXv_int14[] ;
   private short cV83Trozos ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_119 ;
   private int nGXsfl_119_idx=1 ;
   private int AV89GuiRemCli ;
   private int AV90GuiRemCli_To ;
   private int AV97BarColNum ;
   private int AV98BarColNum_To ;
   private int AV27TFGuiRemCli ;
   private int AV28TFGuiRemCli_To ;
   private int AV69TFBarColNum ;
   private int AV70TFBarColNum_To ;
   private int AV81TFBarAlbPie ;
   private int AV82TFBarAlbPie_To ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A3869AlbCliDes ;
   private int AV115GuiRemCli_To2 ;
   private int AV114BarColNum_To2 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprofch_rangetext_Enabled ;
   private int A1243GuiRemCli ;
   private int A1265BarAlbPie ;
   private int subGrid_Islastpage ;
   private int edtavBarenccli_Enabled ;
   private int edtavTipartdsc_Enabled ;
   private int edtavTipcoldsc_Enabled ;
   private int edtavIntdsc_Enabled ;
   private int edtavTrozos_Enabled ;
   private int edtavClinom_Enabled ;
   private int AV135Webwlisalpds_3_guiremcli ;
   private int AV136Webwlisalpds_4_guiremcli_to ;
   private int AV141Webwlisalpds_9_barcolnum ;
   private int AV142Webwlisalpds_10_barcolnum_to ;
   private int AV143Webwlisalpds_11_tfguiremcli ;
   private int AV144Webwlisalpds_12_tfguiremcli_to ;
   private int AV161Webwlisalpds_29_tfbarcolnum ;
   private int AV162Webwlisalpds_30_tfbarcolnum_to ;
   private int AV171Webwlisalpds_39_tfbaralbpie ;
   private int AV172Webwlisalpds_40_tfbaralbpie_to ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtGuiRemCli_Visible ;
   private int edtGuiRemCln_Visible ;
   private int edtAlbProCod_Visible ;
   private int edtAlbProfch_Visible ;
   private int edtavBarenccli_Visible ;
   private int edtBarFecCli_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtavTipartdsc_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtavTipcoldsc_Visible ;
   private int edtavIntdsc_Visible ;
   private int edtBarKgm_Visible ;
   private int edtBarMtr_Visible ;
   private int edtBarAlbKgmE_Visible ;
   private int edtBarAlbMtrE_Visible ;
   private int edtBarAlbPie_Visible ;
   private int edtBarAncAca1_Visible ;
   private int edtavTrozos_Visible ;
   private int edtTrnCod_Visible ;
   private int edtavClinom_Visible ;
   private int AV42PageToGo ;
   private int GXv_int11[] ;
   private int AV179GXV1 ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarcolnum_to_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnom_to_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarser_to_Enabled ;
   private int edtavGuiremcli_Enabled ;
   private int edtavGuiremcli_to_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV33TFAlbProCod ;
   private long AV34TFAlbProCod_To ;
   private long AV43GridCurrentPage ;
   private long AV44GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long AV147Webwlisalpds_15_tfalbprocod ;
   private long AV148Webwlisalpds_16_tfalbprocod_to ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV72TFBarKgm ;
   private java.math.BigDecimal AV73TFBarKgm_To ;
   private java.math.BigDecimal AV128TFBarMtr ;
   private java.math.BigDecimal AV129TFBarMtr_To ;
   private java.math.BigDecimal AV75TFBarAlbKgmE ;
   private java.math.BigDecimal AV76TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV78TFBarAlbMtrE ;
   private java.math.BigDecimal AV79TFBarAlbMtrE_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV163Webwlisalpds_31_tfbarkgm ;
   private java.math.BigDecimal AV164Webwlisalpds_32_tfbarkgm_to ;
   private java.math.BigDecimal AV165Webwlisalpds_33_tfbarmtr ;
   private java.math.BigDecimal AV166Webwlisalpds_34_tfbarmtr_to ;
   private java.math.BigDecimal AV167Webwlisalpds_35_tfbaralbkgme ;
   private java.math.BigDecimal AV168Webwlisalpds_36_tfbaralbkgme_to ;
   private java.math.BigDecimal AV169Webwlisalpds_37_tfbaralbmtre ;
   private java.math.BigDecimal AV170Webwlisalpds_38_tfbaralbmtre_to ;
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
   private String sGXsfl_119_idx="0001" ;
   private String AV93BarSer ;
   private String AV94BarSer_To ;
   private String AV95BarColNom ;
   private String AV96BarColNom_To ;
   private String A396EmprCod ;
   private String AV30TFGuiRemCln ;
   private String AV31TFGuiRemCln_Sel ;
   private String AV54TFBarNHdr ;
   private String AV55TFBarNHdr_Sel ;
   private String AV57TFBarSer ;
   private String AV58TFBarSer_Sel ;
   private String AV60TFBarSerDsc ;
   private String AV61TFBarSerDsc_Sel ;
   private String AV63TFBarNomCli ;
   private String AV64TFBarNomCli_Sel ;
   private String AV66TFBarColNom ;
   private String AV67TFBarColNom_Sel ;
   private String AV178Pgmname ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV47IntDsc ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV116BarSer_to2 ;
   private String AV113BarColNom_To2 ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
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
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavAlbprofch_rangetext_Internalname ;
   private String TempTags ;
   private String edtavAlbprofch_rangetext_Jsonclick ;
   private String divTablesplittedfiltertextguiremcli_Internalname ;
   private String lblFiltertextguiremcli_Internalname ;
   private String lblFiltertextguiremcli_Jsonclick ;
   private String divTablesplittedfiltertextbarser_Internalname ;
   private String lblFiltertextbarser_Internalname ;
   private String lblFiltertextbarser_Jsonclick ;
   private String divTablesplittedfiltertextbarcolnom_Internalname ;
   private String lblFiltertextbarcolnom_Internalname ;
   private String lblFiltertextbarcolnom_Jsonclick ;
   private String divTablesplittedfiltertextbarcolnum_Internalname ;
   private String lblFiltertextbarcolnum_Internalname ;
   private String lblFiltertextbarcolnum_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
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
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wcwcentregasresumencliente_Component ;
   private String OldWcwcentregasresumencliente ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Albprofch_rangepicker_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_albprofchauxdates_Internalname ;
   private String edtavDdo_albprofchauxdate_Internalname ;
   private String edtavDdo_albprofchauxdate_Jsonclick ;
   private String divDdo_barfeccliauxdates_Internalname ;
   private String edtavDdo_barfeccliauxdate_Internalname ;
   private String edtavDdo_barfeccliauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtGuiRemCli_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Internalname ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String AV15BarEncCli ;
   private String edtavBarenccli_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String AV45TipArtDsc ;
   private String edtavTipartdsc_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String AV46TipColDsc ;
   private String edtavTipcoldsc_Internalname ;
   private String edtavIntdsc_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String edtBarAncAca1_Internalname ;
   private String edtavTrozos_Internalname ;
   private String edtTrnCod_Internalname ;
   private String AV99CliNom ;
   private String edtavClinom_Internalname ;
   private String AV137Webwlisalpds_5_barser ;
   private String AV138Webwlisalpds_6_barser_to ;
   private String AV139Webwlisalpds_7_barcolnom ;
   private String AV140Webwlisalpds_8_barcolnom_to ;
   private String AV145Webwlisalpds_13_tfguiremcln ;
   private String AV146Webwlisalpds_14_tfguiremcln_sel ;
   private String AV151Webwlisalpds_19_tfbarnhdr ;
   private String AV152Webwlisalpds_20_tfbarnhdr_sel ;
   private String AV153Webwlisalpds_21_tfbarser ;
   private String AV154Webwlisalpds_22_tfbarser_sel ;
   private String AV155Webwlisalpds_23_tfbarserdsc ;
   private String AV156Webwlisalpds_24_tfbarserdsc_sel ;
   private String AV157Webwlisalpds_25_tfbarnomcli ;
   private String AV158Webwlisalpds_26_tfbarnomcli_sel ;
   private String AV159Webwlisalpds_27_tfbarcolnom ;
   private String AV160Webwlisalpds_28_tfbarcolnom_sel ;
   private String scmdbuf ;
   private String lV145Webwlisalpds_13_tfguiremcln ;
   private String A1253EmprGuiRem ;
   private String edtavGuiremcli_Internalname ;
   private String edtavGuiremcli_to_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_to_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_to_Internalname ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_to_Internalname ;
   private String AV109Station ;
   private String AV110EmprNom ;
   private String AV111UsurCod ;
   private String AV132Emprcod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char25 ;
   private String GXv_char16[] ;
   private String GXt_char24 ;
   private String GXv_char15[] ;
   private String GXt_char23 ;
   private String GXv_char13[] ;
   private String GXt_char22 ;
   private String GXv_char12[] ;
   private String GXt_char21 ;
   private String GXv_char10[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String divTablefilters_Internalname ;
   private String tblTablemergedbarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String lblBarcolnum_rangemiddletext_Internalname ;
   private String lblBarcolnum_rangemiddletext_Jsonclick ;
   private String edtavBarcolnum_to_Jsonclick ;
   private String tblTablemergedbarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String lblBarcolnom_rangemiddletext_Internalname ;
   private String lblBarcolnom_rangemiddletext_Jsonclick ;
   private String edtavBarcolnom_to_Jsonclick ;
   private String tblTablemergedbarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String lblBarser_rangemiddletext_Internalname ;
   private String lblBarser_rangemiddletext_Jsonclick ;
   private String edtavBarser_to_Jsonclick ;
   private String tblTablemergedguiremcli_Internalname ;
   private String edtavGuiremcli_Jsonclick ;
   private String lblGuiremcli_rangemiddletext_Internalname ;
   private String lblGuiremcli_rangemiddletext_Jsonclick ;
   private String edtavGuiremcli_to_Jsonclick ;
   private String sGXsfl_119_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProfch_Jsonclick ;
   private String edtavBarenccli_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtavTipartdsc_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtavTipcoldsc_Jsonclick ;
   private String edtavIntdsc_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String edtBarAncAca1_Jsonclick ;
   private String edtavTrozos_Jsonclick ;
   private String edtTrnCod_Jsonclick ;
   private String edtavClinom_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV87AlbProFch ;
   private java.util.Date AV88AlbProFch_To ;
   private java.util.Date AV36TFAlbProfch ;
   private java.util.Date AV49TFBarFecCli ;
   private java.util.Date AV112AlbProFch_To2 ;
   private java.util.Date AV38DDO_AlbProfchAuxDate ;
   private java.util.Date AV51DDO_BarFecCliAuxDate ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date AV133Webwlisalpds_1_albprofch ;
   private java.util.Date AV134Webwlisalpds_2_albprofch_to ;
   private java.util.Date AV149Webwlisalpds_17_tfalbprofch ;
   private java.util.Date AV150Webwlisalpds_18_tfbarfeccli ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
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
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_119_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcentregasresumencliente ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV121AlbProFch_RangeText ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcentregasresumencliente ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucAlbprofch_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H00MT2_A1253EmprGuiRem ;
   private String[] H00MT2_A396EmprCod ;
   private long[] H00MT2_A30AlbProCod ;
   private int[] H00MT2_A3869AlbCliDes ;
   private short[] H00MT2_A840TrnCod ;
   private java.util.Date[] H00MT2_A34AlbProfch ;
   private String[] H00MT2_A1244GuiRemCln ;
   private int[] H00MT2_A1243GuiRemCli ;
   private String[] H00MT3_A1253EmprGuiRem ;
   private String[] H00MT3_A396EmprCod ;
   private long[] H00MT3_A30AlbProCod ;
   private int[] H00MT3_A3869AlbCliDes ;
   private short[] H00MT3_A840TrnCod ;
   private java.util.Date[] H00MT3_A34AlbProfch ;
   private String[] H00MT3_A1244GuiRemCln ;
   private int[] H00MT3_A1243GuiRemCli ;
   private java.math.BigDecimal[] H00MT5_A166BarKgm ;
   private java.math.BigDecimal[] H00MT5_A184BarMtr ;
   private short[] H00MT6_AV83Trozos ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item19 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item20[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState26[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector18[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV41DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class webwlisalp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00MT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV133Webwlisalpds_1_albprofch ,
                                          java.util.Date AV134Webwlisalpds_2_albprofch_to ,
                                          int AV135Webwlisalpds_3_guiremcli ,
                                          int AV136Webwlisalpds_4_guiremcli_to ,
                                          String AV137Webwlisalpds_5_barser ,
                                          String AV138Webwlisalpds_6_barser_to ,
                                          String AV139Webwlisalpds_7_barcolnom ,
                                          String AV140Webwlisalpds_8_barcolnom_to ,
                                          int AV141Webwlisalpds_9_barcolnum ,
                                          int AV142Webwlisalpds_10_barcolnum_to ,
                                          int AV143Webwlisalpds_11_tfguiremcli ,
                                          int AV144Webwlisalpds_12_tfguiremcli_to ,
                                          String AV146Webwlisalpds_14_tfguiremcln_sel ,
                                          String AV145Webwlisalpds_13_tfguiremcln ,
                                          long AV147Webwlisalpds_15_tfalbprocod ,
                                          long AV148Webwlisalpds_16_tfalbprocod_to ,
                                          java.util.Date AV149Webwlisalpds_17_tfalbprofch ,
                                          java.util.Date AV150Webwlisalpds_18_tfbarfeccli ,
                                          String AV152Webwlisalpds_20_tfbarnhdr_sel ,
                                          String AV151Webwlisalpds_19_tfbarnhdr ,
                                          String AV154Webwlisalpds_22_tfbarser_sel ,
                                          String AV153Webwlisalpds_21_tfbarser ,
                                          String AV156Webwlisalpds_24_tfbarserdsc_sel ,
                                          String AV155Webwlisalpds_23_tfbarserdsc ,
                                          String AV158Webwlisalpds_26_tfbarnomcli_sel ,
                                          String AV157Webwlisalpds_25_tfbarnomcli ,
                                          String AV160Webwlisalpds_28_tfbarcolnom_sel ,
                                          String AV159Webwlisalpds_27_tfbarcolnom ,
                                          int AV161Webwlisalpds_29_tfbarcolnum ,
                                          int AV162Webwlisalpds_30_tfbarcolnum_to ,
                                          java.math.BigDecimal AV163Webwlisalpds_31_tfbarkgm ,
                                          java.math.BigDecimal AV164Webwlisalpds_32_tfbarkgm_to ,
                                          java.math.BigDecimal AV165Webwlisalpds_33_tfbarmtr ,
                                          java.math.BigDecimal AV166Webwlisalpds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV167Webwlisalpds_35_tfbaralbkgme ,
                                          java.math.BigDecimal AV168Webwlisalpds_36_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV169Webwlisalpds_37_tfbaralbmtre ,
                                          java.math.BigDecimal AV170Webwlisalpds_38_tfbaralbmtre_to ,
                                          int AV171Webwlisalpds_39_tfbaralbpie ,
                                          int AV172Webwlisalpds_40_tfbaralbpie_to ,
                                          short AV173Webwlisalpds_41_tfbarancaca1 ,
                                          short AV174Webwlisalpds_42_tfbarancaca1_to ,
                                          short AV175Webwlisalpds_43_tftrncod ,
                                          short AV176Webwlisalpds_44_tftrncod_to ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1244GuiRemCln ,
                                          long A30AlbProCod ,
                                          java.util.Date A155BarFecCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A125BarAncAca1 ,
                                          short A840TrnCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[19];
      Object[] GXv_Object28 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProCod, T1.AlbCliDes, T1.TrnCod, T1.AlbProfch, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli" ;
      sFromString = " FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Webwlisalpds_1_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int27[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Webwlisalpds_2_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int27[2] = (byte)(1) ;
      }
      if ( ! (0==AV135Webwlisalpds_3_guiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int27[3] = (byte)(1) ;
      }
      if ( ! (0==AV136Webwlisalpds_4_guiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
      }
      if ( ! (0==AV143Webwlisalpds_11_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int27[5] = (byte)(1) ;
      }
      if ( ! (0==AV144Webwlisalpds_12_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webwlisalpds_14_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV145Webwlisalpds_13_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webwlisalpds_14_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (0==AV147Webwlisalpds_15_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( ! (0==AV148Webwlisalpds_16_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV149Webwlisalpds_17_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (0==AV175Webwlisalpds_43_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (0==AV176Webwlisalpds_44_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProfch" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProfch DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.GuiRemCli" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.GuiRemCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_H00MT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV133Webwlisalpds_1_albprofch ,
                                          java.util.Date AV134Webwlisalpds_2_albprofch_to ,
                                          int AV135Webwlisalpds_3_guiremcli ,
                                          int AV136Webwlisalpds_4_guiremcli_to ,
                                          String AV137Webwlisalpds_5_barser ,
                                          String AV138Webwlisalpds_6_barser_to ,
                                          String AV139Webwlisalpds_7_barcolnom ,
                                          String AV140Webwlisalpds_8_barcolnom_to ,
                                          int AV141Webwlisalpds_9_barcolnum ,
                                          int AV142Webwlisalpds_10_barcolnum_to ,
                                          int AV143Webwlisalpds_11_tfguiremcli ,
                                          int AV144Webwlisalpds_12_tfguiremcli_to ,
                                          String AV146Webwlisalpds_14_tfguiremcln_sel ,
                                          String AV145Webwlisalpds_13_tfguiremcln ,
                                          long AV147Webwlisalpds_15_tfalbprocod ,
                                          long AV148Webwlisalpds_16_tfalbprocod_to ,
                                          java.util.Date AV149Webwlisalpds_17_tfalbprofch ,
                                          java.util.Date AV150Webwlisalpds_18_tfbarfeccli ,
                                          String AV152Webwlisalpds_20_tfbarnhdr_sel ,
                                          String AV151Webwlisalpds_19_tfbarnhdr ,
                                          String AV154Webwlisalpds_22_tfbarser_sel ,
                                          String AV153Webwlisalpds_21_tfbarser ,
                                          String AV156Webwlisalpds_24_tfbarserdsc_sel ,
                                          String AV155Webwlisalpds_23_tfbarserdsc ,
                                          String AV158Webwlisalpds_26_tfbarnomcli_sel ,
                                          String AV157Webwlisalpds_25_tfbarnomcli ,
                                          String AV160Webwlisalpds_28_tfbarcolnom_sel ,
                                          String AV159Webwlisalpds_27_tfbarcolnom ,
                                          int AV161Webwlisalpds_29_tfbarcolnum ,
                                          int AV162Webwlisalpds_30_tfbarcolnum_to ,
                                          java.math.BigDecimal AV163Webwlisalpds_31_tfbarkgm ,
                                          java.math.BigDecimal AV164Webwlisalpds_32_tfbarkgm_to ,
                                          java.math.BigDecimal AV165Webwlisalpds_33_tfbarmtr ,
                                          java.math.BigDecimal AV166Webwlisalpds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV167Webwlisalpds_35_tfbaralbkgme ,
                                          java.math.BigDecimal AV168Webwlisalpds_36_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV169Webwlisalpds_37_tfbaralbmtre ,
                                          java.math.BigDecimal AV170Webwlisalpds_38_tfbaralbmtre_to ,
                                          int AV171Webwlisalpds_39_tfbaralbpie ,
                                          int AV172Webwlisalpds_40_tfbaralbpie_to ,
                                          short AV173Webwlisalpds_41_tfbarancaca1 ,
                                          short AV174Webwlisalpds_42_tfbarancaca1_to ,
                                          short AV175Webwlisalpds_43_tftrncod ,
                                          short AV176Webwlisalpds_44_tftrncod_to ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1244GuiRemCln ,
                                          long A30AlbProCod ,
                                          java.util.Date A155BarFecCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A125BarAncAca1 ,
                                          short A840TrnCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[19];
      Object[] GXv_Object30 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProCod, T1.AlbCliDes, T1.TrnCod, T1.AlbProfch, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli" ;
      sFromString = " FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Webwlisalpds_1_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int29[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Webwlisalpds_2_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( ! (0==AV135Webwlisalpds_3_guiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( ! (0==AV136Webwlisalpds_4_guiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (0==AV143Webwlisalpds_11_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (0==AV144Webwlisalpds_12_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webwlisalpds_14_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV145Webwlisalpds_13_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webwlisalpds_14_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (0==AV147Webwlisalpds_15_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (0==AV148Webwlisalpds_16_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV149Webwlisalpds_17_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (0==AV175Webwlisalpds_43_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (0==AV176Webwlisalpds_44_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProfch" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProfch DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.GuiRemCli" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.GuiRemCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
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
                  return conditional_H00MT2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).longValue() , (java.util.Date)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).shortValue() , ((Number) dynConstraints[63]).shortValue() , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] );
            case 1 :
                  return conditional_H00MT3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).longValue() , (java.util.Date)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).shortValue() , ((Number) dynConstraints[63]).shortValue() , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00MT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MT5", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtr, 0) AS BarMtr FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MT6", "SELECT COUNT(*) FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

