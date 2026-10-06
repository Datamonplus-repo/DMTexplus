package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetasdetinte_agrupacion_ww_impl extends GXDataArea
{
   public recetasdetinte_agrupacion_ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetasdetinte_agrupacion_ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdetinte_agrupacion_ww_impl.class ));
   }

   public recetasdetinte_agrupacion_ww_impl( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavFlagrec = UIFactory.getCheckbox(this);
      cmbavGrupodeacciones = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV8Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Emprcod", AV8Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
               AV6BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
               AV7BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
               AV80BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV80BarMaqCod", AV80BarMaqCod);
               AV79BarVolMaq = (int)(GXutil.lval( httpContext.GetPar( "BarVolMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV79BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79BarVolMaq), 5, 0));
               AV81CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV81CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81CliCod), 6, 0));
               AV82CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV82CliNom", AV82CliNom);
               AV83BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV83BarSer", AV83BarSer);
               AV84BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV84BarColNom", AV84BarColNom);
               AV85BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV85BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85BarColNum), 6, 0));
               AV70FlagRec = (byte)(GXutil.lval( httpContext.GetPar( "FlagRec"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70FlagRec", GXutil.str( AV70FlagRec, 1, 0));
            }
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
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
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
      AV8Emprcod = httpContext.GetPar( "Emprcod") ;
      AV5BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV6BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV7BarCodPar = httpContext.GetPar( "BarCodPar") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV22ColumnsSelector);
      AV28TFBarAgrNhdr = httpContext.GetPar( "TFBarAgrNhdr") ;
      AV29TFBarAgrNhdr_Sel = httpContext.GetPar( "TFBarAgrNhdr_Sel") ;
      AV30TFCliCodAgr = (int)(GXutil.lval( httpContext.GetPar( "TFCliCodAgr"))) ;
      AV31TFCliCodAgr_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCodAgr_To"))) ;
      AV32TFBarAgrSer = httpContext.GetPar( "TFBarAgrSer") ;
      AV33TFBarAgrSer_Sel = httpContext.GetPar( "TFBarAgrSer_Sel") ;
      AV34TFBarAgrDsc = httpContext.GetPar( "TFBarAgrDsc") ;
      AV35TFBarAgrDsc_Sel = httpContext.GetPar( "TFBarAgrDsc_Sel") ;
      AV36TFColNomAgr = httpContext.GetPar( "TFColNomAgr") ;
      AV37TFColNomAgr_Sel = httpContext.GetPar( "TFColNomAgr_Sel") ;
      AV38TFColNumAgr = (int)(GXutil.lval( httpContext.GetPar( "TFColNumAgr"))) ;
      AV39TFColNumAgr_To = (int)(GXutil.lval( httpContext.GetPar( "TFColNumAgr_To"))) ;
      AV40TFKgmAgr = CommonUtil.decimalVal( httpContext.GetPar( "TFKgmAgr"), ".") ;
      AV41TFKgmAgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFKgmAgr_To"), ".") ;
      AV42TFMtrAgr = CommonUtil.decimalVal( httpContext.GetPar( "TFMtrAgr"), ".") ;
      AV43TFMtrAgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMtrAgr_To"), ".") ;
      AV44TFPieAgr = (short)(GXutil.lval( httpContext.GetPar( "TFPieAgr"))) ;
      AV45TFPieAgr_To = (short)(GXutil.lval( httpContext.GetPar( "TFPieAgr_To"))) ;
      AV115Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV17OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV73TotKgmAgr = CommonUtil.decimalVal( httpContext.GetPar( "TotKgmAgr"), ".") ;
      AV75TotMtrAgr = CommonUtil.decimalVal( httpContext.GetPar( "TotMtrAgr"), ".") ;
      AV77TotPieAgr = GXutil.lval( httpContext.GetPar( "TotPieAgr")) ;
      AV70FlagRec = (byte)(GXutil.lval( httpContext.GetPar( "FlagRec"))) ;
      AV64UsurCod = httpContext.GetPar( "UsurCod") ;
      AV61Station = httpContext.GetPar( "Station") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV8Emprcod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV22ColumnsSelector, AV28TFBarAgrNhdr, AV29TFBarAgrNhdr_Sel, AV30TFCliCodAgr, AV31TFCliCodAgr_To, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFBarAgrDsc, AV35TFBarAgrDsc_Sel, AV36TFColNomAgr, AV37TFColNomAgr_Sel, AV38TFColNumAgr, AV39TFColNumAgr_To, AV40TFKgmAgr, AV41TFKgmAgr_To, AV42TFMtrAgr, AV43TFMtrAgr_To, AV44TFPieAgr, AV45TFPieAgr_To, AV115Pgmname, AV16OrderedBy, AV17OrderedDsc, AV73TotKgmAgr, AV75TotMtrAgr, AV77TotPieAgr, AV70FlagRec, AV64UsurCod, AV61Station) ;
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
      pa1IH2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1IH2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdetinte_agrupacion_ww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV80BarMaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV79BarVolMaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV81CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV82CliNom)),GXutil.URLEncode(GXutil.rtrim(AV83BarSer)),GXutil.URLEncode(GXutil.rtrim(AV84BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV85BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV70FlagRec,1,0))}, new String[] {"Emprcod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarVolMaq","CliCod","CliNom","BarSer","BarColNom","BarColNum","FlagRec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGMAGR", getSecureSignedToken( "", localUtil.format( AV73TotKgmAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMTRAGR", getSecureSignedToken( "", localUtil.format( AV75TotMtrAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEAGR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77TotPieAgr), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_70, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV48GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV49GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV22ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV22ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRNHDR", GXutil.rtrim( AV28TFBarAgrNhdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRNHDR_SEL", GXutil.rtrim( AV29TFBarAgrNhdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICODAGR", GXutil.ltrim( localUtil.ntoc( AV30TFCliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICODAGR_TO", GXutil.ltrim( localUtil.ntoc( AV31TFCliCodAgr_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRSER", GXutil.rtrim( AV32TFBarAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRSER_SEL", GXutil.rtrim( AV33TFBarAgrSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRDSC", GXutil.rtrim( AV34TFBarAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRDSC_SEL", GXutil.rtrim( AV35TFBarAgrDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNOMAGR", GXutil.rtrim( AV36TFColNomAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNOMAGR_SEL", GXutil.rtrim( AV37TFColNomAgr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNUMAGR", GXutil.ltrim( localUtil.ntoc( AV38TFColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNUMAGR_TO", GXutil.ltrim( localUtil.ntoc( AV39TFColNumAgr_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFKGMAGR", GXutil.ltrim( localUtil.ntoc( AV40TFKgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFKGMAGR_TO", GXutil.ltrim( localUtil.ntoc( AV41TFKgmAgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMTRAGR", GXutil.ltrim( localUtil.ntoc( AV42TFMtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMTRAGR_TO", GXutil.ltrim( localUtil.ntoc( AV43TFMtrAgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPIEAGR", GXutil.ltrim( localUtil.ntoc( AV44TFPieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPIEAGR_TO", GXutil.ltrim( localUtil.ntoc( AV45TFPieAgr_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV115Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV16OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV17OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV8Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV6BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV7BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKGMAGR", GXutil.ltrim( localUtil.ntoc( AV73TotKgmAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGMAGR", getSecureSignedToken( "", localUtil.format( AV73TotKgmAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMTRAGR", GXutil.ltrim( localUtil.ntoc( AV75TotMtrAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMTRAGR", getSecureSignedToken( "", localUtil.format( AV75TotMtrAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTPIEAGR", GXutil.ltrim( localUtil.ntoc( AV77TotPieAgr, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEAGR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77TotPieAgr), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV82CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV64UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV61Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Result));
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
         we1IH2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1IH2( ) ;
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
      return formatLink("app.recetasdetinte_agrupacion_ww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV80BarMaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV79BarVolMaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV81CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV82CliNom)),GXutil.URLEncode(GXutil.rtrim(AV83BarSer)),GXutil.URLEncode(GXutil.rtrim(AV84BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV85BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV70FlagRec,1,0))}, new String[] {"Emprcod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarVolMaq","CliCod","CliNom","BarSer","BarColNom","BarColNum","FlagRec"})  ;
   }

   public String getPgmname( )
   {
      return "RecetasdeTinte_Agrupacion_WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Recetas de Tinte (Agrupacion_Registro)", "") ;
   }

   public void wb1IH0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnadd_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "Agregar", ""), bttBtnadd_Jsonclick, 5, httpContext.getMessage( "Agregar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOADD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaragrupacion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Agrupacion", ""), bttBtneliminaragrupacion_Jsonclick, 5, httpContext.getMessage( "Eliminar Agrupacion", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOELIMINARAGRUPACION\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellMarginTop", "left", "top", "", "flex-grow:1;", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV72BarNHdr), GXutil.rtrim( localUtil.format( AV72BarNHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmaqcod_Internalname, GXutil.rtrim( AV80BarMaqCod), GXutil.rtrim( localUtil.format( AV80BarMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarvolmaq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarvolmaq_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarvolmaq_Internalname, GXutil.ltrim( localUtil.ntoc( AV79BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarvolmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV79BarVolMaq), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV79BarVolMaq), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarvolmaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarvolmaq_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV81CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV81CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV83BarSer), GXutil.rtrim( localUtil.format( AV83BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV84BarColNom), GXutil.rtrim( localUtil.format( AV84BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV85BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV85BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV85BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavFlagrec.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavFlagrec.getInternalname(), httpContext.getMessage( "Rct?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavFlagrec.getInternalname(), GXutil.str( AV70FlagRec, 1, 0), "", httpContext.getMessage( "Rct?", ""), 1, chkavFlagrec.getEnabled(), "1", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         startgridcontrol70( ) ;
      }
      if ( wbEnd == 70 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_70 = (int)(nGXsfl_70_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_86_1IH2( true) ;
      }
      else
      {
         wb_table1_86_1IH2( false) ;
      }
      return  ;
   }

   public void wb_table1_86_1IH2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV48GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV49GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV22ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_125_1IH2( true) ;
      }
      else
      {
         wb_table2_125_1IH2( false) ;
      }
      return  ;
   }

   public void wb_table2_125_1IH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_130_1IH2( true) ;
      }
      else
      {
         wb_table3_130_1IH2( false) ;
      }
      return  ;
   }

   public void wb_table3_130_1IH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 70 )
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

   public void start1IH2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Recetas de Tinte (Agrupacion_Registro)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1IH0( ) ;
   }

   public void ws1IH2( )
   {
      start1IH2( ) ;
      evt1IH2( ) ;
   }

   public void evt1IH2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111IH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121IH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131IH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141IH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151IH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161IH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e171IH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOADD'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoAdd' */
                           e181IH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOELIMINARAGRUPACION'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEliminarAgrupacion' */
                           e191IH2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) )
                        {
                           nGXsfl_70_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_702( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV53GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GrupodeAcciones), 4, 0));
                           A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
                           A1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
                           A1507BarAgrDsc = httpContext.cgiGet( edtBarAgrDsc_Internalname) ;
                           A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
                           A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A590KgmAgr = localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)) ;
                           A869MtrAgr = localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)) ;
                           A671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A122BarAgrPar = httpContext.cgiGet( edtBarAgrPar_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e201IH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e211IH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221IH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e231IH2 ();
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

   public void we1IH2( )
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

   public void pa1IH2( )
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
      subsflControlProps_702( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         sendrow_702( ) ;
         nGXsfl_70_idx = ((subGrid_Islastpage==1)&&(nGXsfl_70_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV8Emprcod ,
                                 int AV5BarCod ,
                                 byte AV6BarCodReo ,
                                 String AV7BarCodPar ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ,
                                 String AV28TFBarAgrNhdr ,
                                 String AV29TFBarAgrNhdr_Sel ,
                                 int AV30TFCliCodAgr ,
                                 int AV31TFCliCodAgr_To ,
                                 String AV32TFBarAgrSer ,
                                 String AV33TFBarAgrSer_Sel ,
                                 String AV34TFBarAgrDsc ,
                                 String AV35TFBarAgrDsc_Sel ,
                                 String AV36TFColNomAgr ,
                                 String AV37TFColNomAgr_Sel ,
                                 int AV38TFColNumAgr ,
                                 int AV39TFColNumAgr_To ,
                                 java.math.BigDecimal AV40TFKgmAgr ,
                                 java.math.BigDecimal AV41TFKgmAgr_To ,
                                 java.math.BigDecimal AV42TFMtrAgr ,
                                 java.math.BigDecimal AV43TFMtrAgr_To ,
                                 short AV44TFPieAgr ,
                                 short AV45TFPieAgr_To ,
                                 String AV115Pgmname ,
                                 short AV16OrderedBy ,
                                 boolean AV17OrderedDsc ,
                                 java.math.BigDecimal AV73TotKgmAgr ,
                                 java.math.BigDecimal AV75TotMtrAgr ,
                                 long AV77TotPieAgr ,
                                 byte AV70FlagRec ,
                                 String AV64UsurCod ,
                                 String AV61Station )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211IH2 ();
      GRID_nCurrentRecord = 0 ;
      rf1IH2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      AV70FlagRec = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV70FlagRec, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70FlagRec", GXutil.str( AV70FlagRec, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1IH2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV115Pgmname = "RecetasdeTinte_Agrupacion_WW" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavBarmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmaqcod_Enabled), 5, 0), true);
      edtavBarvolmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarvolmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarvolmaq_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      chkavFlagrec.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavFlagrec.getInternalname(), "Enabled", GXutil.ltrimstr( chkavFlagrec.getEnabled(), 5, 0), true);
      edtavTotvaluekgmagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluekgmagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekgmagr_Enabled), 5, 0), true);
      edtavTotvaluemtragr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemtragr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemtragr_Enabled), 5, 0), true);
      edtavTotvaluepieagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluepieagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluepieagr_Enabled), 5, 0), true);
   }

   public void rf1IH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(70) ;
      /* Execute user event: Refresh */
      e211IH2 ();
      nGXsfl_70_idx = 1 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_702( ) ;
      bGXsfl_70_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_702( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                              AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                              Integer.valueOf(AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr) ,
                                              Integer.valueOf(AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) ,
                                              AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                              AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                              AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                              AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                              AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                              AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                              Integer.valueOf(AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) ,
                                              Integer.valueOf(AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) ,
                                              AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                              AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                              AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                              AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                              Short.valueOf(AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr) ,
                                              Short.valueOf(AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) ,
                                              Integer.valueOf(A119BarAgrCod) ,
                                              Byte.valueOf(A124BarAgrReo) ,
                                              A122BarAgrPar ,
                                              Integer.valueOf(A1508CliCodAgr) ,
                                              A1245BarAgrSer ,
                                              A1507BarAgrDsc ,
                                              A1510ColNomAgr ,
                                              Integer.valueOf(A1512ColNumAgr) ,
                                              A590KgmAgr ,
                                              A869MtrAgr ,
                                              Short.valueOf(A671PieAgr) ,
                                              Short.valueOf(AV16OrderedBy) ,
                                              Boolean.valueOf(AV17OrderedDsc) ,
                                              AV8Emprcod ,
                                              Integer.valueOf(AV5BarCod) ,
                                              Byte.valueOf(AV6BarCodReo) ,
                                              AV7BarCodPar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr), 11, "%") ;
         lV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = GXutil.padr( GXutil.rtrim( AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser), 16, "%") ;
         lV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc), 26, "%") ;
         lV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr), 13, "%") ;
         /* Using cursor H01IH2 */
         pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar, lV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr, AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel, Integer.valueOf(AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr), Integer.valueOf(AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to), lV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser, AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel, lV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc, AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel, lV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr, AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel, Integer.valueOf(AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr), Integer.valueOf(AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to), AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr, AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to, AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr, AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to, Short.valueOf(AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr), Short.valueOf(AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_70_idx = 1 ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01IH2_A396EmprCod[0] ;
            A129BarCod = H01IH2_A129BarCod[0] ;
            A132BarCodReo = H01IH2_A132BarCodReo[0] ;
            A130BarCodPar = H01IH2_A130BarCodPar[0] ;
            A671PieAgr = H01IH2_A671PieAgr[0] ;
            A869MtrAgr = H01IH2_A869MtrAgr[0] ;
            A590KgmAgr = H01IH2_A590KgmAgr[0] ;
            A1512ColNumAgr = H01IH2_A1512ColNumAgr[0] ;
            A1510ColNomAgr = H01IH2_A1510ColNomAgr[0] ;
            A1507BarAgrDsc = H01IH2_A1507BarAgrDsc[0] ;
            A1245BarAgrSer = H01IH2_A1245BarAgrSer[0] ;
            A1508CliCodAgr = H01IH2_A1508CliCodAgr[0] ;
            A122BarAgrPar = H01IH2_A122BarAgrPar[0] ;
            A124BarAgrReo = H01IH2_A124BarAgrReo[0] ;
            A119BarAgrCod = H01IH2_A119BarAgrCod[0] ;
            A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
            e221IH2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(70) ;
         wb1IH0( ) ;
      }
      bGXsfl_70_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1IH2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV115Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKGMAGR", GXutil.ltrim( localUtil.ntoc( AV73TotKgmAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGMAGR", getSecureSignedToken( "", localUtil.format( AV73TotKgmAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMTRAGR", GXutil.ltrim( localUtil.ntoc( AV75TotMtrAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMTRAGR", getSecureSignedToken( "", localUtil.format( AV75TotMtrAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTPIEAGR", GXutil.ltrim( localUtil.ntoc( AV77TotPieAgr, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEAGR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77TotPieAgr), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV64UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV61Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61Station, ""))));
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
      AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV28TFBarAgrNhdr ;
      AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV29TFBarAgrNhdr_Sel ;
      AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV30TFCliCodAgr ;
      AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV31TFCliCodAgr_To ;
      AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV32TFBarAgrSer ;
      AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV34TFBarAgrDsc ;
      AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV35TFBarAgrDsc_Sel ;
      AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV36TFColNomAgr ;
      AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV37TFColNomAgr_Sel ;
      AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV38TFColNumAgr ;
      AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV39TFColNumAgr_To ;
      AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV40TFKgmAgr ;
      AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV41TFKgmAgr_To ;
      AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV42TFMtrAgr ;
      AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV43TFMtrAgr_To ;
      AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV44TFPieAgr ;
      AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV45TFPieAgr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                           AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                           Integer.valueOf(AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr) ,
                                           Integer.valueOf(AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) ,
                                           AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                           AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                           AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                           AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                           AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                           AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                           Integer.valueOf(AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) ,
                                           Integer.valueOf(AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) ,
                                           AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                           AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                           AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                           AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                           Short.valueOf(AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr) ,
                                           Short.valueOf(AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV8Emprcod ,
                                           Integer.valueOf(AV5BarCod) ,
                                           Byte.valueOf(AV6BarCodReo) ,
                                           AV7BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr), 11, "%") ;
      lV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = GXutil.padr( GXutil.rtrim( AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser), 16, "%") ;
      lV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc), 26, "%") ;
      lV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr), 13, "%") ;
      /* Using cursor H01IH3 */
      pr_default.execute(1, new Object[] {AV8Emprcod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar, lV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr, AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel, Integer.valueOf(AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr), Integer.valueOf(AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to), lV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser, AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel, lV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc, AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel, lV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr, AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel, Integer.valueOf(AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr), Integer.valueOf(AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to), AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr, AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to, AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr, AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to, Short.valueOf(AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr), Short.valueOf(AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to)});
      GRID_nRecordCount = H01IH3_AGRID_nRecordCount[0] ;
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
      AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV28TFBarAgrNhdr ;
      AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV29TFBarAgrNhdr_Sel ;
      AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV30TFCliCodAgr ;
      AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV31TFCliCodAgr_To ;
      AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV32TFBarAgrSer ;
      AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV34TFBarAgrDsc ;
      AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV35TFBarAgrDsc_Sel ;
      AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV36TFColNomAgr ;
      AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV37TFColNomAgr_Sel ;
      AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV38TFColNumAgr ;
      AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV39TFColNumAgr_To ;
      AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV40TFKgmAgr ;
      AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV41TFKgmAgr_To ;
      AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV42TFMtrAgr ;
      AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV43TFMtrAgr_To ;
      AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV44TFPieAgr ;
      AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV45TFPieAgr_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV8Emprcod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV22ColumnsSelector, AV28TFBarAgrNhdr, AV29TFBarAgrNhdr_Sel, AV30TFCliCodAgr, AV31TFCliCodAgr_To, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFBarAgrDsc, AV35TFBarAgrDsc_Sel, AV36TFColNomAgr, AV37TFColNomAgr_Sel, AV38TFColNumAgr, AV39TFColNumAgr_To, AV40TFKgmAgr, AV41TFKgmAgr_To, AV42TFMtrAgr, AV43TFMtrAgr_To, AV44TFPieAgr, AV45TFPieAgr_To, AV115Pgmname, AV16OrderedBy, AV17OrderedDsc, AV73TotKgmAgr, AV75TotMtrAgr, AV77TotPieAgr, AV70FlagRec, AV64UsurCod, AV61Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV28TFBarAgrNhdr ;
      AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV29TFBarAgrNhdr_Sel ;
      AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV30TFCliCodAgr ;
      AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV31TFCliCodAgr_To ;
      AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV32TFBarAgrSer ;
      AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV34TFBarAgrDsc ;
      AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV35TFBarAgrDsc_Sel ;
      AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV36TFColNomAgr ;
      AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV37TFColNomAgr_Sel ;
      AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV38TFColNumAgr ;
      AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV39TFColNumAgr_To ;
      AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV40TFKgmAgr ;
      AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV41TFKgmAgr_To ;
      AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV42TFMtrAgr ;
      AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV43TFMtrAgr_To ;
      AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV44TFPieAgr ;
      AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV45TFPieAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV8Emprcod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV22ColumnsSelector, AV28TFBarAgrNhdr, AV29TFBarAgrNhdr_Sel, AV30TFCliCodAgr, AV31TFCliCodAgr_To, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFBarAgrDsc, AV35TFBarAgrDsc_Sel, AV36TFColNomAgr, AV37TFColNomAgr_Sel, AV38TFColNumAgr, AV39TFColNumAgr_To, AV40TFKgmAgr, AV41TFKgmAgr_To, AV42TFMtrAgr, AV43TFMtrAgr_To, AV44TFPieAgr, AV45TFPieAgr_To, AV115Pgmname, AV16OrderedBy, AV17OrderedDsc, AV73TotKgmAgr, AV75TotMtrAgr, AV77TotPieAgr, AV70FlagRec, AV64UsurCod, AV61Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV28TFBarAgrNhdr ;
      AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV29TFBarAgrNhdr_Sel ;
      AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV30TFCliCodAgr ;
      AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV31TFCliCodAgr_To ;
      AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV32TFBarAgrSer ;
      AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV34TFBarAgrDsc ;
      AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV35TFBarAgrDsc_Sel ;
      AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV36TFColNomAgr ;
      AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV37TFColNomAgr_Sel ;
      AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV38TFColNumAgr ;
      AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV39TFColNumAgr_To ;
      AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV40TFKgmAgr ;
      AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV41TFKgmAgr_To ;
      AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV42TFMtrAgr ;
      AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV43TFMtrAgr_To ;
      AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV44TFPieAgr ;
      AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV45TFPieAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV8Emprcod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV22ColumnsSelector, AV28TFBarAgrNhdr, AV29TFBarAgrNhdr_Sel, AV30TFCliCodAgr, AV31TFCliCodAgr_To, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFBarAgrDsc, AV35TFBarAgrDsc_Sel, AV36TFColNomAgr, AV37TFColNomAgr_Sel, AV38TFColNumAgr, AV39TFColNumAgr_To, AV40TFKgmAgr, AV41TFKgmAgr_To, AV42TFMtrAgr, AV43TFMtrAgr_To, AV44TFPieAgr, AV45TFPieAgr_To, AV115Pgmname, AV16OrderedBy, AV17OrderedDsc, AV73TotKgmAgr, AV75TotMtrAgr, AV77TotPieAgr, AV70FlagRec, AV64UsurCod, AV61Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV28TFBarAgrNhdr ;
      AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV29TFBarAgrNhdr_Sel ;
      AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV30TFCliCodAgr ;
      AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV31TFCliCodAgr_To ;
      AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV32TFBarAgrSer ;
      AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV34TFBarAgrDsc ;
      AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV35TFBarAgrDsc_Sel ;
      AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV36TFColNomAgr ;
      AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV37TFColNomAgr_Sel ;
      AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV38TFColNumAgr ;
      AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV39TFColNumAgr_To ;
      AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV40TFKgmAgr ;
      AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV41TFKgmAgr_To ;
      AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV42TFMtrAgr ;
      AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV43TFMtrAgr_To ;
      AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV44TFPieAgr ;
      AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV45TFPieAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV8Emprcod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV22ColumnsSelector, AV28TFBarAgrNhdr, AV29TFBarAgrNhdr_Sel, AV30TFCliCodAgr, AV31TFCliCodAgr_To, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFBarAgrDsc, AV35TFBarAgrDsc_Sel, AV36TFColNomAgr, AV37TFColNomAgr_Sel, AV38TFColNumAgr, AV39TFColNumAgr_To, AV40TFKgmAgr, AV41TFKgmAgr_To, AV42TFMtrAgr, AV43TFMtrAgr_To, AV44TFPieAgr, AV45TFPieAgr_To, AV115Pgmname, AV16OrderedBy, AV17OrderedDsc, AV73TotKgmAgr, AV75TotMtrAgr, AV77TotPieAgr, AV70FlagRec, AV64UsurCod, AV61Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV28TFBarAgrNhdr ;
      AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV29TFBarAgrNhdr_Sel ;
      AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV30TFCliCodAgr ;
      AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV31TFCliCodAgr_To ;
      AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV32TFBarAgrSer ;
      AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV34TFBarAgrDsc ;
      AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV35TFBarAgrDsc_Sel ;
      AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV36TFColNomAgr ;
      AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV37TFColNomAgr_Sel ;
      AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV38TFColNumAgr ;
      AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV39TFColNumAgr_To ;
      AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV40TFKgmAgr ;
      AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV41TFKgmAgr_To ;
      AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV42TFMtrAgr ;
      AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV43TFMtrAgr_To ;
      AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV44TFPieAgr ;
      AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV45TFPieAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV8Emprcod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV22ColumnsSelector, AV28TFBarAgrNhdr, AV29TFBarAgrNhdr_Sel, AV30TFCliCodAgr, AV31TFCliCodAgr_To, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFBarAgrDsc, AV35TFBarAgrDsc_Sel, AV36TFColNomAgr, AV37TFColNomAgr_Sel, AV38TFColNumAgr, AV39TFColNumAgr_To, AV40TFKgmAgr, AV41TFKgmAgr_To, AV42TFMtrAgr, AV43TFMtrAgr_To, AV44TFPieAgr, AV45TFPieAgr_To, AV115Pgmname, AV16OrderedBy, AV17OrderedDsc, AV73TotKgmAgr, AV75TotMtrAgr, AV77TotPieAgr, AV70FlagRec, AV64UsurCod, AV61Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV115Pgmname = "RecetasdeTinte_Agrupacion_WW" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavBarmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmaqcod_Enabled), 5, 0), true);
      edtavBarvolmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarvolmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarvolmaq_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      chkavFlagrec.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavFlagrec.getInternalname(), "Enabled", GXutil.ltrimstr( chkavFlagrec.getEnabled(), 5, 0), true);
      edtavTotvaluekgmagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluekgmagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekgmagr_Enabled), 5, 0), true);
      edtavTotvaluemtragr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemtragr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemtragr_Enabled), 5, 0), true);
      edtavTotvaluepieagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluepieagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluepieagr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1IH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201IH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV46DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV22ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV48GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV49GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_eliminaragrupacion_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Title") ;
         Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmationtext") ;
         Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminaragrupacion_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmtype") ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_eliminaragrupacion_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Result") ;
         /* Read variables values. */
         AV72BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72BarNHdr", AV72BarNHdr);
         AV74TotValueKgmAgr = httpContext.cgiGet( edtavTotvaluekgmagr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74TotValueKgmAgr", AV74TotValueKgmAgr);
         AV76TotValueMtrAgr = httpContext.cgiGet( edtavTotvaluemtragr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76TotValueMtrAgr", AV76TotValueMtrAgr);
         AV78TotValuePieAgr = httpContext.cgiGet( edtavTotvaluepieagr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78TotValuePieAgr", AV78TotValuePieAgr);
         /* Read subfile selected row values. */
         nGXsfl_70_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
         if ( nGXsfl_70_idx > 0 )
         {
            cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
            cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
            AV53GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GrupodeAcciones), 4, 0));
            A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
            A1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
            A1507BarAgrDsc = httpContext.cgiGet( edtBarAgrDsc_Internalname) ;
            A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
            A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A590KgmAgr = localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)) ;
            A869MtrAgr = localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)) ;
            A671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A122BarAgrPar = httpContext.cgiGet( edtBarAgrPar_Internalname) ;
         }
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
      e201IH2 ();
      if (returnInSub) return;
   }

   public void e201IH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV61Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV61Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Station", AV61Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61Station, ""))));
      GXv_char2[0] = AV62BuscarEmprCod ;
      GXv_char3[0] = AV63EmprNom ;
      GXv_char4[0] = AV64UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV61Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.AV62BuscarEmprCod = GXv_char2[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV63EmprNom = GXv_char3[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV64UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64UsurCod", AV64UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64UsurCod, "@!"))));
      GXt_char1 = AV55msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG245_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV55msg0 = GXt_char1 ;
      GXt_char1 = AV56msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG232_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV56msg1 = GXt_char1 ;
      GXt_char1 = AV57msg2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG229_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV57msg2 = GXt_char1 ;
      GXt_char1 = AV58msg3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG088_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV58msg3 = GXt_char1 ;
      GXt_char1 = AV59msg4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG245_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV59msg4 = GXt_char1 ;
      GXt_char1 = AV60msg5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR304_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV60msg5 = GXt_char1 ;
      AV72BarNHdr = GXutil.trim( GXutil.str( AV5BarCod, 8, 0)) + "-" + GXutil.str( AV6BarCodReo, 1, 0) + AV7BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72BarNHdr", AV72BarNHdr);
      GXt_char1 = AV61Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV61Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Station", AV61Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61Station, ""))));
      GXv_char4[0] = AV8Emprcod ;
      GXv_char3[0] = AV63EmprNom ;
      GXv_char2[0] = AV64UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV61Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetasdetinte_agrupacion_ww_impl.this.AV8Emprcod = GXv_char4[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV63EmprNom = GXv_char3[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV64UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Emprcod", AV8Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV64UsurCod", AV64UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64UsurCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Recetas de Tinte (Agrupacion_Registro)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV16OrderedBy < 1 )
      {
         AV16OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV46DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV46DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e211IH2( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV24Session.getValue("RecetasdeTinte_Agrupacion_WWColumnsSelector"), "") != 0 )
      {
         AV20ColumnsSelectorXML = AV24Session.getValue("RecetasdeTinte_Agrupacion_WWColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV20ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtBarAgrNhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtCliCodAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtBarAgrSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtBarAgrDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtColNomAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtColNumAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtKgmAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtMtrAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtPieAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Visible), 5, 0), !bGXsfl_70_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV48GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridCurrentPage), 10, 0));
      AV49GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV28TFBarAgrNhdr ;
      AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV29TFBarAgrNhdr_Sel ;
      AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV30TFCliCodAgr ;
      AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV31TFCliCodAgr_To ;
      AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV32TFBarAgrSer ;
      AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV34TFBarAgrDsc ;
      AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV35TFBarAgrDsc_Sel ;
      AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV36TFColNomAgr ;
      AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV37TFColNomAgr_Sel ;
      AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV38TFColNumAgr ;
      AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV39TFColNumAgr_To ;
      AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV40TFKgmAgr ;
      AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV41TFKgmAgr_To ;
      AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV42TFMtrAgr ;
      AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV43TFMtrAgr_To ;
      AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV44TFPieAgr ;
      AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV45TFPieAgr_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
   }

   public void e111IH2( )
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
         AV47PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV47PageToGo) ;
      }
   }

   public void e121IH2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131IH2( )
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
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrNhdr") == 0 )
         {
            AV28TFBarAgrNhdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarAgrNhdr", AV28TFBarAgrNhdr);
            AV29TFBarAgrNhdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFBarAgrNhdr_Sel", AV29TFBarAgrNhdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCodAgr") == 0 )
         {
            AV30TFCliCodAgr = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCodAgr), 6, 0));
            AV31TFCliCodAgr_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCodAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCodAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrSer") == 0 )
         {
            AV32TFBarAgrSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarAgrSer", AV32TFBarAgrSer);
            AV33TFBarAgrSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarAgrSer_Sel", AV33TFBarAgrSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrDsc") == 0 )
         {
            AV34TFBarAgrDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarAgrDsc", AV34TFBarAgrDsc);
            AV35TFBarAgrDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarAgrDsc_Sel", AV35TFBarAgrDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNomAgr") == 0 )
         {
            AV36TFColNomAgr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFColNomAgr", AV36TFColNomAgr);
            AV37TFColNomAgr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFColNomAgr_Sel", AV37TFColNomAgr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNumAgr") == 0 )
         {
            AV38TFColNumAgr = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFColNumAgr), 6, 0));
            AV39TFColNumAgr_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFColNumAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFColNumAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "KgmAgr") == 0 )
         {
            AV40TFKgmAgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFKgmAgr", GXutil.ltrimstr( AV40TFKgmAgr, 9, 2));
            AV41TFKgmAgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFKgmAgr_To", GXutil.ltrimstr( AV41TFKgmAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MtrAgr") == 0 )
         {
            AV42TFMtrAgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMtrAgr", GXutil.ltrimstr( AV42TFMtrAgr, 9, 2));
            AV43TFMtrAgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMtrAgr_To", GXutil.ltrimstr( AV43TFMtrAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PieAgr") == 0 )
         {
            AV44TFPieAgr = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPieAgr), 4, 0));
            AV45TFPieAgr_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPieAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFPieAgr_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e221IH2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeacciones.addItem("1", httpContext.getMessage( "Eliminar", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(70) ;
      }
      sendrow_702( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_70_Refreshing )
      {
         httpContext.doAjaxLoad(70, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV53GrupodeAcciones, 4, 0)) );
   }

   public void e141IH2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV20ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV22ColumnsSelector.fromJSonString(AV20ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "RecetasdeTinte_Agrupacion_WWColumnsSelector", ((GXutil.strcmp("", AV20ColumnsSelectorXML)==0) ? "" : AV22ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
   }

   public void e171IH2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV8Emprcod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV6BarCodReo),AV7BarCodPar,AV80BarMaqCod,Integer.valueOf(AV79BarVolMaq),Integer.valueOf(AV81CliCod),AV82CliNom,AV83BarSer,AV84BarColNom,Integer.valueOf(AV85BarColNum),Byte.valueOf(AV70FlagRec)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV8Emprcod","AV5BarCod","AV6BarCodReo","AV7BarCodPar","AV80BarMaqCod","AV79BarVolMaq","AV81CliCod","AV82CliNom","AV83BarSer","AV84BarColNom","AV85BarColNum","AV70FlagRec"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e231IH2( )
   {
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV53GrupodeAcciones == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      AV53GrupodeAcciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GrupodeAcciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV53GrupodeAcciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
   }

   public void e151IH2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
   }

   public void e181IH2( )
   {
      /* 'DoAdd' Routine */
      returnInSub = false ;
      if ( AV70FlagRec == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hay Receta de Tinte ¡", ""));
      }
      else
      {
         AV50BarAgrCod = 0 ;
         AV52BarAgrPar = "" ;
         AV51BarAgrReo = (byte)(0) ;
         httpContext.popup(formatLink("app.recetasdetinte_agrupacion_registro", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV8Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","BarAgrCod","BarAgrReo","BarAgrPar"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
   }

   public void e191IH2( )
   {
      /* 'DoEliminarAgrupacion' Routine */
      returnInSub = false ;
      GXt_int8 = AV87hayrecetatinte ;
      GXv_int9[0] = GXt_int8 ;
      new app.phayrec(remoteHandle, context).execute( AV8Emprcod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, GXv_int9) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_int8 = GXv_int9[0] ;
      AV87hayrecetatinte = GXt_int8 ;
      if ( ( AV70FlagRec == 1 ) || ( AV87hayrecetatinte == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hay Receta de Tinte ¡", ""));
      }
      else
      {
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACIONContainer", "Confirm", "", new Object[] {});
      }
   }

   public void e161IH2( )
   {
      /* Dvelop_confirmpanel_eliminaragrupacion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminaragrupacion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARAGRUPACION' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV16OrderedBy, 4, 0))+":"+(AV17OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAgrNhdr", "", "N° Hdr Agrupada", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCodAgr", "", "Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAgrSer", "", "Articulo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAgrDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ColNomAgr", "", "Color", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ColNumAgr", "", "N° Color", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "KgmAgr", "", "Kilos", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MtrAgr", "", "Metros", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PieAgr", "", "Piezas", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV21UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "RecetasdeTinte_Agrupacion_WWColumnsSelector", GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV21UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV21UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S182( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      GXt_int8 = AV87hayrecetatinte ;
      GXv_int9[0] = GXt_int8 ;
      new app.phayrec(remoteHandle, context).execute( AV8Emprcod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_int9) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_int8 = GXv_int9[0] ;
      AV87hayrecetatinte = GXt_int8 ;
      if ( ( AV70FlagRec == 1 ) || ( AV87hayrecetatinte == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hay Receta de tinte ¡", ""));
      }
      else
      {
         AV108Emprcod_selected = A396EmprCod ;
         AV109Barcod_selected = A129BarCod ;
         AV110Barcodreo_selected = A132BarCodReo ;
         AV111Barcodpar_selected = A130BarCodPar ;
         AV112Baragrcod_selected = A119BarAgrCod ;
         AV113Baragrreo_selected = A124BarAgrReo ;
         AV114Baragrpar_selected = A122BarAgrPar ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S192( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV8Emprcod ;
      GXv_int12[0] = AV5BarCod ;
      GXv_int9[0] = AV6BarCodReo ;
      GXv_char3[0] = AV7BarCodPar ;
      GXv_int13[0] = A119BarAgrCod ;
      GXv_int14[0] = A124BarAgrReo ;
      GXv_char2[0] = A122BarAgrPar ;
      GXv_char15[0] = AV68inc_obs ;
      GXv_char16[0] = AV69inc_obs2 ;
      new app.pelibar(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int9, GXv_char3, GXv_int13, GXv_int14, GXv_char2, GXv_char15, GXv_char16) ;
      recetasdetinte_agrupacion_ww_impl.this.AV8Emprcod = GXv_char4[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV5BarCod = GXv_int12[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV6BarCodReo = GXv_int9[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV7BarCodPar = GXv_char3[0] ;
      recetasdetinte_agrupacion_ww_impl.this.A119BarAgrCod = GXv_int13[0] ;
      recetasdetinte_agrupacion_ww_impl.this.A124BarAgrReo = GXv_int14[0] ;
      recetasdetinte_agrupacion_ww_impl.this.A122BarAgrPar = GXv_char2[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV68inc_obs = GXv_char15[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV69inc_obs2 = GXv_char16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Emprcod", AV8Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
      if ( ! (GXutil.strcmp("", AV68inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( AV8Emprcod, AV115Pgmname, AV64UsurCod, AV61Station, AV68inc_obs, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
      }
      if ( ! (GXutil.strcmp("", AV69inc_obs2)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( AV8Emprcod, AV115Pgmname, AV64UsurCod, AV61Station, AV69inc_obs2, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
      }
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO ACTION ELIMINARAGRUPACION' Routine */
      returnInSub = false ;
      GXv_char16[0] = AV8Emprcod ;
      GXv_int13[0] = AV5BarCod ;
      GXv_int14[0] = AV6BarCodReo ;
      GXv_char15[0] = AV7BarCodPar ;
      new app.peliagr(remoteHandle, context).execute( GXv_char16, GXv_int13, GXv_int14, GXv_char15) ;
      recetasdetinte_agrupacion_ww_impl.this.AV8Emprcod = GXv_char16[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV5BarCod = GXv_int13[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV6BarCodReo = GXv_int14[0] ;
      recetasdetinte_agrupacion_ww_impl.this.AV7BarCodPar = GXv_char15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Emprcod", AV8Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
      httpContext.setWebReturnParms(new Object[] {AV8Emprcod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV6BarCodReo),AV7BarCodPar,AV80BarMaqCod,Integer.valueOf(AV79BarVolMaq),Integer.valueOf(AV81CliCod),AV82CliNom,AV83BarSer,AV84BarColNom,Integer.valueOf(AV85BarColNum),Byte.valueOf(AV70FlagRec)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV8Emprcod","AV5BarCod","AV6BarCodReo","AV7BarCodPar","AV80BarMaqCod","AV79BarVolMaq","AV81CliCod","AV82CliNom","AV83BarSer","AV84BarColNom","AV85BarColNum","AV70FlagRec"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue(AV115Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV115Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV24Session.getValue(AV115Pgmname+"GridState"), null, null);
      }
      AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
      AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV116GXV1 = 1 ;
      while ( AV116GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV116GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR") == 0 )
         {
            AV28TFBarAgrNhdr = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarAgrNhdr", AV28TFBarAgrNhdr);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR_SEL") == 0 )
         {
            AV29TFBarAgrNhdr_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFBarAgrNhdr_Sel", AV29TFBarAgrNhdr_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICODAGR") == 0 )
         {
            AV30TFCliCodAgr = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCodAgr), 6, 0));
            AV31TFCliCodAgr_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCodAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCodAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER") == 0 )
         {
            AV32TFBarAgrSer = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarAgrSer", AV32TFBarAgrSer);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER_SEL") == 0 )
         {
            AV33TFBarAgrSer_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarAgrSer_Sel", AV33TFBarAgrSer_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC") == 0 )
         {
            AV34TFBarAgrDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarAgrDsc", AV34TFBarAgrDsc);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC_SEL") == 0 )
         {
            AV35TFBarAgrDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarAgrDsc_Sel", AV35TFBarAgrDsc_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR") == 0 )
         {
            AV36TFColNomAgr = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFColNomAgr", AV36TFColNomAgr);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR_SEL") == 0 )
         {
            AV37TFColNomAgr_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFColNomAgr_Sel", AV37TFColNomAgr_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUMAGR") == 0 )
         {
            AV38TFColNumAgr = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFColNumAgr), 6, 0));
            AV39TFColNumAgr_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFColNumAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFColNumAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKGMAGR") == 0 )
         {
            AV40TFKgmAgr = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFKgmAgr", GXutil.ltrimstr( AV40TFKgmAgr, 9, 2));
            AV41TFKgmAgr_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFKgmAgr_To", GXutil.ltrimstr( AV41TFKgmAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTRAGR") == 0 )
         {
            AV42TFMtrAgr = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMtrAgr", GXutil.ltrimstr( AV42TFMtrAgr, 9, 2));
            AV43TFMtrAgr_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMtrAgr_To", GXutil.ltrimstr( AV43TFMtrAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEAGR") == 0 )
         {
            AV44TFPieAgr = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPieAgr), 4, 0));
            AV45TFPieAgr_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPieAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFPieAgr_To), 4, 0));
         }
         AV116GXV1 = (int)(AV116GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char16[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFBarAgrNhdr_Sel)==0), AV29TFBarAgrNhdr_Sel, GXv_char16) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char15[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarAgrSer_Sel)==0), AV33TFBarAgrSer_Sel, GXv_char15) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char17 = GXv_char15[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarAgrDsc_Sel)==0), AV35TFBarAgrDsc_Sel, GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFColNomAgr_Sel)==0), AV37TFColNomAgr_Sel, GXv_char3) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char19 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char17+"|"+GXt_char18+"|"+GXt_char19+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char19 = "" ;
      GXv_char16[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFBarAgrNhdr)==0), AV28TFBarAgrNhdr, GXv_char16) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char19 = GXv_char16[0] ;
      GXt_char18 = "" ;
      GXv_char15[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarAgrSer)==0), AV32TFBarAgrSer, GXv_char15) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char18 = GXv_char15[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarAgrDsc)==0), AV34TFBarAgrDsc, GXv_char4) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFColNomAgr)==0), AV36TFColNomAgr, GXv_char3) ;
      recetasdetinte_agrupacion_ww_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char19+"|"+((0==AV30TFCliCodAgr) ? "" : GXutil.str( AV30TFCliCodAgr, 6, 0))+"|"+GXt_char18+"|"+GXt_char17+"|"+GXt_char1+"|"+((0==AV38TFColNumAgr) ? "" : GXutil.str( AV38TFColNumAgr, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFKgmAgr)==0) ? "" : GXutil.str( AV40TFKgmAgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMtrAgr)==0) ? "" : GXutil.str( AV42TFMtrAgr, 9, 2))+"|"+((0==AV44TFPieAgr) ? "" : GXutil.str( AV44TFPieAgr, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV31TFCliCodAgr_To) ? "" : GXutil.str( AV31TFCliCodAgr_To, 6, 0))+"||||"+((0==AV39TFColNumAgr_To) ? "" : GXutil.str( AV39TFColNumAgr_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFKgmAgr_To)==0) ? "" : GXutil.str( AV41TFKgmAgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMtrAgr_To)==0) ? "" : GXutil.str( AV43TFMtrAgr_To, 9, 2))+"|"+((0==AV45TFPieAgr_To) ? "" : GXutil.str( AV45TFPieAgr_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV24Session.getValue(AV115Pgmname+"GridState"), null, null);
      AV14GridState.setgxTv_SdtWWPGridState_Orderedby( AV16OrderedBy );
      AV14GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV17OrderedDsc );
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFBARAGRNHDR", "", !(GXutil.strcmp("", AV28TFBarAgrNhdr)==0), (short)(0), AV28TFBarAgrNhdr, "", !(GXutil.strcmp("", AV29TFBarAgrNhdr_Sel)==0), AV29TFBarAgrNhdr_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCLICODAGR", "", !((0==AV30TFCliCodAgr)&&(0==AV31TFCliCodAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFCliCodAgr, 6, 0)), GXutil.trim( GXutil.str( AV31TFCliCodAgr_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFBARAGRSER", "", !(GXutil.strcmp("", AV32TFBarAgrSer)==0), (short)(0), AV32TFBarAgrSer, "", !(GXutil.strcmp("", AV33TFBarAgrSer_Sel)==0), AV33TFBarAgrSer_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFBARAGRDSC", "", !(GXutil.strcmp("", AV34TFBarAgrDsc)==0), (short)(0), AV34TFBarAgrDsc, "", !(GXutil.strcmp("", AV35TFBarAgrDsc_Sel)==0), AV35TFBarAgrDsc_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCOLNOMAGR", "", !(GXutil.strcmp("", AV36TFColNomAgr)==0), (short)(0), AV36TFColNomAgr, "", !(GXutil.strcmp("", AV37TFColNomAgr_Sel)==0), AV37TFColNomAgr_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCOLNUMAGR", "", !((0==AV38TFColNumAgr)&&(0==AV39TFColNumAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFColNumAgr, 6, 0)), GXutil.trim( GXutil.str( AV39TFColNumAgr_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFKGMAGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFKgmAgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFKgmAgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFKgmAgr, 9, 2)), GXutil.trim( GXutil.str( AV41TFKgmAgr_To, 9, 2))) ;
      AV14GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMTRAGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMtrAgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMtrAgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFMtrAgr, 9, 2)), GXutil.trim( GXutil.str( AV43TFMtrAgr_To, 9, 2))) ;
      AV14GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFPIEAGR", "", !((0==AV44TFPieAgr)&&(0==AV45TFPieAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFPieAgr, 4, 0)), GXutil.trim( GXutil.str( AV45TFPieAgr_To, 4, 0))) ;
      AV14GridState = GXv_SdtWWPGridState20[0] ;
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV115Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV12TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV115Pgmname );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "RecetasdeTinte_Agrupacion_Registro" );
      AV24Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV73TotKgmAgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TotKgmAgr", GXutil.ltrimstr( AV73TotKgmAgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGMAGR", getSecureSignedToken( "", localUtil.format( AV73TotKgmAgr, "ZZZZZ9.99")));
      AV75TotMtrAgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TotMtrAgr", GXutil.ltrimstr( AV75TotMtrAgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMTRAGR", getSecureSignedToken( "", localUtil.format( AV75TotMtrAgr, "ZZZZZ9.99")));
      AV77TotPieAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TotPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TotPieAgr), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEAGR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77TotPieAgr), "ZZZ9")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV28TFBarAgrNhdr ;
      AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV29TFBarAgrNhdr_Sel ;
      AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV30TFCliCodAgr ;
      AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV31TFCliCodAgr_To ;
      AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV32TFBarAgrSer ;
      AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV34TFBarAgrDsc ;
      AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV35TFBarAgrDsc_Sel ;
      AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV36TFColNomAgr ;
      AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV37TFColNomAgr_Sel ;
      AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV38TFColNumAgr ;
      AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV39TFColNumAgr_To ;
      AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV40TFKgmAgr ;
      AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV41TFKgmAgr_To ;
      AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV42TFMtrAgr ;
      AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV43TFMtrAgr_To ;
      AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV44TFPieAgr ;
      AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV45TFPieAgr_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                           AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                           Integer.valueOf(AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr) ,
                                           Integer.valueOf(AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) ,
                                           AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                           AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                           AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                           AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                           AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                           AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                           Integer.valueOf(AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) ,
                                           Integer.valueOf(AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) ,
                                           AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                           AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                           AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                           AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                           Short.valueOf(AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr) ,
                                           Short.valueOf(AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           AV8Emprcod ,
                                           Integer.valueOf(AV5BarCod) ,
                                           Byte.valueOf(AV6BarCodReo) ,
                                           AV7BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr), 11, "%") ;
      lV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = GXutil.padr( GXutil.rtrim( AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser), 16, "%") ;
      lV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc), 26, "%") ;
      lV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr), 13, "%") ;
      /* Using cursor H01IH4 */
      pr_default.execute(2, new Object[] {AV8Emprcod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar, lV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr, AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel, Integer.valueOf(AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr), Integer.valueOf(AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to), lV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser, AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel, lV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc, AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel, lV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr, AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel, Integer.valueOf(AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr), Integer.valueOf(AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to), AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr, AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to, AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr, AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to, Short.valueOf(AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr), Short.valueOf(AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = H01IH4_A130BarCodPar[0] ;
         A132BarCodReo = H01IH4_A132BarCodReo[0] ;
         A129BarCod = H01IH4_A129BarCod[0] ;
         A396EmprCod = H01IH4_A396EmprCod[0] ;
         A671PieAgr = H01IH4_A671PieAgr[0] ;
         A869MtrAgr = H01IH4_A869MtrAgr[0] ;
         A590KgmAgr = H01IH4_A590KgmAgr[0] ;
         A1512ColNumAgr = H01IH4_A1512ColNumAgr[0] ;
         A1510ColNomAgr = H01IH4_A1510ColNomAgr[0] ;
         A1507BarAgrDsc = H01IH4_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = H01IH4_A1245BarAgrSer[0] ;
         A1508CliCodAgr = H01IH4_A1508CliCodAgr[0] ;
         A122BarAgrPar = H01IH4_A122BarAgrPar[0] ;
         A124BarAgrReo = H01IH4_A124BarAgrReo[0] ;
         A119BarAgrCod = H01IH4_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV73TotKgmAgr = A590KgmAgr.add(AV73TotKgmAgr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73TotKgmAgr", GXutil.ltrimstr( AV73TotKgmAgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGMAGR", getSecureSignedToken( "", localUtil.format( AV73TotKgmAgr, "ZZZZZ9.99")));
         AV75TotMtrAgr = A869MtrAgr.add(AV75TotMtrAgr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75TotMtrAgr", GXutil.ltrimstr( AV75TotMtrAgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMTRAGR", getSecureSignedToken( "", localUtil.format( AV75TotMtrAgr, "ZZZZZ9.99")));
         AV77TotPieAgr = (long)(A671PieAgr+AV77TotPieAgr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77TotPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TotPieAgr), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEAGR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77TotPieAgr), "ZZZ9")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV74TotValueKgmAgr = localUtil.format( AV73TotKgmAgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TotValueKgmAgr", AV74TotValueKgmAgr);
      AV76TotValueMtrAgr = localUtil.format( AV75TotMtrAgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TotValueMtrAgr", AV76TotValueMtrAgr);
      AV78TotValuePieAgr = localUtil.format( DecimalUtil.doubleToDec(AV77TotPieAgr), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TotValuePieAgr", AV78TotValuePieAgr);
   }

   public void wb_table3_130_1IH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname, tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("Title", Dvelop_confirmpanel_eliminaragrupacion_Title);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("ConfirmType", Dvelop_confirmpanel_eliminaragrupacion_Confirmtype);
         ucDvelop_confirmpanel_eliminaragrupacion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminaragrupacion_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARAGRUPACIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_130_1IH2e( true) ;
      }
      else
      {
         wb_table3_130_1IH2e( false) ;
      }
   }

   public void wb_table2_125_1IH2( boolean wbgen )
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
         wb_table2_125_1IH2e( true) ;
      }
      else
      {
         wb_table2_125_1IH2e( false) ;
      }
   }

   public void wb_table1_86_1IH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluekgmagr_Internalname, httpContext.getMessage( "Tot Value Kgm Agr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluekgmagr_Internalname, AV74TotValueKgmAgr, GXutil.rtrim( localUtil.format( AV74TotValueKgmAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluekgmagr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluekgmagr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemtragr_Internalname, httpContext.getMessage( "Tot Value Mtr Agr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemtragr_Internalname, AV76TotValueMtrAgr, GXutil.rtrim( localUtil.format( AV76TotValueMtrAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemtragr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemtragr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluepieagr_Internalname, httpContext.getMessage( "Tot Value Pie Agr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluepieagr_Internalname, AV78TotValuePieAgr, GXutil.rtrim( localUtil.format( AV78TotValuePieAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluepieagr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluepieagr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_86_1IH2e( true) ;
      }
      else
      {
         wb_table1_86_1IH2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV8Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Emprcod", AV8Emprcod);
      AV5BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      AV6BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
      AV7BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
      AV80BarMaqCod = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80BarMaqCod", AV80BarMaqCod);
      AV79BarVolMaq = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79BarVolMaq), 5, 0));
      AV81CliCod = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81CliCod), 6, 0));
      AV82CliNom = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82CliNom", AV82CliNom);
      AV83BarSer = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83BarSer", AV83BarSer);
      AV84BarColNom = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84BarColNom", AV84BarColNom);
      AV85BarColNum = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85BarColNum), 6, 0));
      AV70FlagRec = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70FlagRec", GXutil.str( AV70FlagRec, 1, 0));
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
      pa1IH2( ) ;
      ws1IH2( ) ;
      we1IH2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116133982", true, true);
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
      httpContext.AddJavascriptSource("recetasdetinte_agrupacion_ww.js", "?202682116133982", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_702( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_70_idx );
      edtBarAgrNhdr_Internalname = "BARAGRNHDR_"+sGXsfl_70_idx ;
      edtCliCodAgr_Internalname = "CLICODAGR_"+sGXsfl_70_idx ;
      edtBarAgrSer_Internalname = "BARAGRSER_"+sGXsfl_70_idx ;
      edtBarAgrDsc_Internalname = "BARAGRDSC_"+sGXsfl_70_idx ;
      edtColNomAgr_Internalname = "COLNOMAGR_"+sGXsfl_70_idx ;
      edtColNumAgr_Internalname = "COLNUMAGR_"+sGXsfl_70_idx ;
      edtKgmAgr_Internalname = "KGMAGR_"+sGXsfl_70_idx ;
      edtMtrAgr_Internalname = "MTRAGR_"+sGXsfl_70_idx ;
      edtPieAgr_Internalname = "PIEAGR_"+sGXsfl_70_idx ;
      edtBarAgrCod_Internalname = "BARAGRCOD_"+sGXsfl_70_idx ;
      edtBarAgrReo_Internalname = "BARAGRREO_"+sGXsfl_70_idx ;
      edtBarAgrPar_Internalname = "BARAGRPAR_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_702( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_70_fel_idx );
      edtBarAgrNhdr_Internalname = "BARAGRNHDR_"+sGXsfl_70_fel_idx ;
      edtCliCodAgr_Internalname = "CLICODAGR_"+sGXsfl_70_fel_idx ;
      edtBarAgrSer_Internalname = "BARAGRSER_"+sGXsfl_70_fel_idx ;
      edtBarAgrDsc_Internalname = "BARAGRDSC_"+sGXsfl_70_fel_idx ;
      edtColNomAgr_Internalname = "COLNOMAGR_"+sGXsfl_70_fel_idx ;
      edtColNumAgr_Internalname = "COLNUMAGR_"+sGXsfl_70_fel_idx ;
      edtKgmAgr_Internalname = "KGMAGR_"+sGXsfl_70_fel_idx ;
      edtMtrAgr_Internalname = "MTRAGR_"+sGXsfl_70_fel_idx ;
      edtPieAgr_Internalname = "PIEAGR_"+sGXsfl_70_fel_idx ;
      edtBarAgrCod_Internalname = "BARAGRCOD_"+sGXsfl_70_fel_idx ;
      edtBarAgrReo_Internalname = "BARAGRREO_"+sGXsfl_70_fel_idx ;
      edtBarAgrPar_Internalname = "BARAGRPAR_"+sGXsfl_70_fel_idx ;
   }

   public void sendrow_702( )
   {
      subsflControlProps_702( ) ;
      wb1IH0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_70_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_70_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_70_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV53GrupodeAcciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV53GrupodeAcciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GrupodeAcciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV53GrupodeAcciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRUPODEACCIONES.CLICK."+sGXsfl_70_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV53GrupodeAcciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_70_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrNhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrNhdr_Internalname,GXutil.rtrim( A13792BarAgrNhdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrNhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrNhdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCodAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCodAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCodAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCodAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrSer_Internalname,GXutil.rtrim( A1245BarAgrSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrDsc_Internalname,GXutil.rtrim( A1507BarAgrDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtColNomAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNomAgr_Internalname,GXutil.rtrim( A1510ColNomAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNomAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtColNomAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtColNumAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNumAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNumAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtColNumAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtKgmAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKgmAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A590KgmAgr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKgmAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtKgmAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMtrAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtrAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A869MtrAgr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtrAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMtrAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPieAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPieAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPieAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPieAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrReo_Internalname,GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrPar_Internalname,GXutil.rtrim( A122BarAgrPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1IH2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_70_idx = ((subGrid_Islastpage==1)&&(nGXsfl_70_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
      }
      /* End function sendrow_702 */
   }

   public void startgridcontrol70( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"70\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrNhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr Agrupada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCodAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtColNomAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtColNumAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtKgmAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMtrAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPieAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53GrupodeAcciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13792BarAgrNhdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1245BarAgrSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1507BarAgrDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1510ColNomAgr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtColNomAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtColNumAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtKgmAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMtrAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPieAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A122BarAgrPar));
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
      bttBtnadd_Internalname = "BTNADD" ;
      bttBtneliminaragrupacion_Internalname = "BTNELIMINARAGRUPACION" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      edtavBarmaqcod_Internalname = "vBARMAQCOD" ;
      edtavBarvolmaq_Internalname = "vBARVOLMAQ" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      chkavFlagrec.setInternalname( "vFLAGREC" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES" );
      edtBarAgrNhdr_Internalname = "BARAGRNHDR" ;
      edtCliCodAgr_Internalname = "CLICODAGR" ;
      edtBarAgrSer_Internalname = "BARAGRSER" ;
      edtBarAgrDsc_Internalname = "BARAGRDSC" ;
      edtColNomAgr_Internalname = "COLNOMAGR" ;
      edtColNumAgr_Internalname = "COLNUMAGR" ;
      edtKgmAgr_Internalname = "KGMAGR" ;
      edtMtrAgr_Internalname = "MTRAGR" ;
      edtPieAgr_Internalname = "PIEAGR" ;
      edtBarAgrCod_Internalname = "BARAGRCOD" ;
      edtBarAgrReo_Internalname = "BARAGRREO" ;
      edtBarAgrPar_Internalname = "BARAGRPAR" ;
      edtavTotvaluekgmagr_Internalname = "vTOTVALUEKGMAGR" ;
      edtavTotvaluemtragr_Internalname = "vTOTVALUEMTRAGR" ;
      edtavTotvaluepieagr_Internalname = "vTOTVALUEPIEAGR" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_eliminaragrupacion_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION" ;
      tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARAGRUPACION" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtBarAgrPar_Jsonclick = "" ;
      edtBarAgrReo_Jsonclick = "" ;
      edtBarAgrCod_Jsonclick = "" ;
      edtPieAgr_Jsonclick = "" ;
      edtMtrAgr_Jsonclick = "" ;
      edtKgmAgr_Jsonclick = "" ;
      edtColNumAgr_Jsonclick = "" ;
      edtColNomAgr_Jsonclick = "" ;
      edtBarAgrDsc_Jsonclick = "" ;
      edtBarAgrSer_Jsonclick = "" ;
      edtCliCodAgr_Jsonclick = "" ;
      edtBarAgrNhdr_Jsonclick = "" ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluepieagr_Jsonclick = "" ;
      edtavTotvaluepieagr_Enabled = 1 ;
      edtavTotvaluemtragr_Jsonclick = "" ;
      edtavTotvaluemtragr_Enabled = 1 ;
      edtavTotvaluekgmagr_Jsonclick = "" ;
      edtavTotvaluekgmagr_Enabled = 1 ;
      edtPieAgr_Visible = -1 ;
      edtMtrAgr_Visible = -1 ;
      edtKgmAgr_Visible = -1 ;
      edtColNumAgr_Visible = -1 ;
      edtColNomAgr_Visible = -1 ;
      edtBarAgrDsc_Visible = -1 ;
      edtBarAgrSer_Visible = -1 ;
      edtCliCodAgr_Visible = -1 ;
      edtBarAgrNhdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      chkavFlagrec.setEnabled( 0 );
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavBarvolmaq_Jsonclick = "" ;
      edtavBarvolmaq_Enabled = 0 ;
      edtavBarmaqcod_Jsonclick = "" ;
      edtavBarmaqcod_Enabled = 0 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminaragrupacion_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext = "¿Desea eliminar la agrupacion?" ;
      Dvelop_confirmpanel_eliminaragrupacion_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "RecetasdeTinte_Agrupacion_WWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic|Dynamic|Dynamic||||" ;
      Ddo_grid_Includedatalist = "T||T|T|T||||" ;
      Ddo_grid_Filterisrange = "|T||||T|T|T|T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Character|Character|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "1:BarAgrNhdr|2:CliCodAgr|3:BarAgrSer|4:BarAgrDsc|5:ColNomAgr|6:ColNumAgr|7:KgmAgr|8:MtrAgr|9:PieAgr" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Recetas de Tinte (Agrupacion_Registro)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavFlagrec.setName( "vFLAGREC" );
      chkavFlagrec.setWebtags( "" );
      chkavFlagrec.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavFlagrec.getInternalname(), "TitleCaption", chkavFlagrec.getCaption(), true);
      chkavFlagrec.setCheckedValue( "0" );
      AV70FlagRec = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV70FlagRec, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70FlagRec", GXutil.str( AV70FlagRec, 1, 0));
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_70_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
         AV53GrupodeAcciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV53GrupodeAcciones, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GrupodeAcciones), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV28TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV29TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV30TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV31TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV35TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV36TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV37TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV38TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV39TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV40TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV41TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV43TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV45TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'},{av:'AV64UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV61Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarAgrNhdr_Visible',ctrl:'BARAGRNHDR',prop:'Visible'},{av:'edtCliCodAgr_Visible',ctrl:'CLICODAGR',prop:'Visible'},{av:'edtBarAgrSer_Visible',ctrl:'BARAGRSER',prop:'Visible'},{av:'edtBarAgrDsc_Visible',ctrl:'BARAGRDSC',prop:'Visible'},{av:'edtColNomAgr_Visible',ctrl:'COLNOMAGR',prop:'Visible'},{av:'edtColNumAgr_Visible',ctrl:'COLNUMAGR',prop:'Visible'},{av:'edtKgmAgr_Visible',ctrl:'KGMAGR',prop:'Visible'},{av:'edtMtrAgr_Visible',ctrl:'MTRAGR',prop:'Visible'},{av:'edtPieAgr_Visible',ctrl:'PIEAGR',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV74TotValueKgmAgr',fld:'vTOTVALUEKGMAGR',pic:''},{av:'AV76TotValueMtrAgr',fld:'vTOTVALUEMTRAGR',pic:''},{av:'AV78TotValuePieAgr',fld:'vTOTVALUEPIEAGR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111IH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV29TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV30TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV31TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV35TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV36TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV37TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV38TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV39TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV40TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV41TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV43TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV45TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'},{av:'AV64UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV61Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121IH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV29TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV30TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV31TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV35TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV36TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV37TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV38TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV39TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV40TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV41TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV43TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV45TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'},{av:'AV64UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV61Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131IH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV29TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV30TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV31TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV35TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV36TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV37TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV38TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV39TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV40TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV41TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV43TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV45TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'},{av:'AV64UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV61Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV45TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV42TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV43TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV40TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV41TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV38TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV39TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV36TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV37TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV34TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV35TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV30TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV31TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV28TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV29TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221IH2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV53GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141IH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV29TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV30TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV31TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV35TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV36TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV37TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV38TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV39TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV40TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV41TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV43TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV45TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'},{av:'AV64UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV61Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarAgrNhdr_Visible',ctrl:'BARAGRNHDR',prop:'Visible'},{av:'edtCliCodAgr_Visible',ctrl:'CLICODAGR',prop:'Visible'},{av:'edtBarAgrSer_Visible',ctrl:'BARAGRSER',prop:'Visible'},{av:'edtBarAgrDsc_Visible',ctrl:'BARAGRDSC',prop:'Visible'},{av:'edtColNomAgr_Visible',ctrl:'COLNOMAGR',prop:'Visible'},{av:'edtColNumAgr_Visible',ctrl:'COLNUMAGR',prop:'Visible'},{av:'edtKgmAgr_Visible',ctrl:'KGMAGR',prop:'Visible'},{av:'edtMtrAgr_Visible',ctrl:'MTRAGR',prop:'Visible'},{av:'edtPieAgr_Visible',ctrl:'PIEAGR',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV74TotValueKgmAgr',fld:'vTOTVALUEKGMAGR',pic:''},{av:'AV76TotValueMtrAgr',fld:'vTOTVALUEMTRAGR',pic:''},{av:'AV78TotValuePieAgr',fld:'vTOTVALUEPIEAGR',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e171IH2',iparms:[{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'},{av:'AV85BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV83BarSer',fld:'vBARSER',pic:''},{av:'AV82CliNom',fld:'vCLINOM',pic:''},{av:'AV81CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV79BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV80BarMaqCod',fld:'vBARMAQCOD',pic:''},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e231IH2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV53GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV53GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e151IH2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV29TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV30TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV31TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV35TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV36TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV37TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV38TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV39TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV40TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV41TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV43TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV45TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'},{av:'AV64UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV61Station',fld:'vSTATION',pic:'',hsh:true},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarAgrNhdr_Visible',ctrl:'BARAGRNHDR',prop:'Visible'},{av:'edtCliCodAgr_Visible',ctrl:'CLICODAGR',prop:'Visible'},{av:'edtBarAgrSer_Visible',ctrl:'BARAGRSER',prop:'Visible'},{av:'edtBarAgrDsc_Visible',ctrl:'BARAGRDSC',prop:'Visible'},{av:'edtColNomAgr_Visible',ctrl:'COLNOMAGR',prop:'Visible'},{av:'edtColNumAgr_Visible',ctrl:'COLNUMAGR',prop:'Visible'},{av:'edtKgmAgr_Visible',ctrl:'KGMAGR',prop:'Visible'},{av:'edtMtrAgr_Visible',ctrl:'MTRAGR',prop:'Visible'},{av:'edtPieAgr_Visible',ctrl:'PIEAGR',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV74TotValueKgmAgr',fld:'vTOTVALUEKGMAGR',pic:''},{av:'AV76TotValueMtrAgr',fld:'vTOTVALUEMTRAGR',pic:''},{av:'AV78TotValuePieAgr',fld:'vTOTVALUEPIEAGR',pic:''}]}");
      setEventMetadata("'DOADD'","{handler:'e181IH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV29TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV30TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV31TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV35TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV36TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV37TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV38TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV39TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV40TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV41TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV43TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV45TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'},{av:'AV64UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV61Station',fld:'vSTATION',pic:'',hsh:true},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("'DOADD'",",oparms:[{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarAgrNhdr_Visible',ctrl:'BARAGRNHDR',prop:'Visible'},{av:'edtCliCodAgr_Visible',ctrl:'CLICODAGR',prop:'Visible'},{av:'edtBarAgrSer_Visible',ctrl:'BARAGRSER',prop:'Visible'},{av:'edtBarAgrDsc_Visible',ctrl:'BARAGRDSC',prop:'Visible'},{av:'edtColNomAgr_Visible',ctrl:'COLNOMAGR',prop:'Visible'},{av:'edtColNumAgr_Visible',ctrl:'COLNUMAGR',prop:'Visible'},{av:'edtKgmAgr_Visible',ctrl:'KGMAGR',prop:'Visible'},{av:'edtMtrAgr_Visible',ctrl:'MTRAGR',prop:'Visible'},{av:'edtPieAgr_Visible',ctrl:'PIEAGR',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV73TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV75TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV74TotValueKgmAgr',fld:'vTOTVALUEKGMAGR',pic:''},{av:'AV76TotValueMtrAgr',fld:'vTOTVALUEMTRAGR',pic:''},{av:'AV78TotValuePieAgr',fld:'vTOTVALUEPIEAGR',pic:''}]}");
      setEventMetadata("'DOELIMINARAGRUPACION'","{handler:'e191IH2',iparms:[{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'}]");
      setEventMetadata("'DOELIMINARAGRUPACION'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION.CLOSE","{handler:'e161IH2',iparms:[{av:'Dvelop_confirmpanel_eliminaragrupacion_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION',prop:'Result'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV70FlagRec',fld:'vFLAGREC',pic:'9'},{av:'AV85BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV83BarSer',fld:'vBARSER',pic:''},{av:'AV82CliNom',fld:'vCLINOM',pic:''},{av:'AV81CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV79BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV80BarMaqCod',fld:'vBARMAQCOD',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION.CLOSE",",oparms:[{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_BARAGRCOD","{handler:'valid_Baragrcod',iparms:[]");
      setEventMetadata("VALID_BARAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARAGRREO","{handler:'valid_Baragrreo',iparms:[]");
      setEventMetadata("VALID_BARAGRREO",",oparms:[]}");
      setEventMetadata("VALID_BARAGRPAR","{handler:'valid_Baragrpar',iparms:[]");
      setEventMetadata("VALID_BARAGRPAR",",oparms:[]}");
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
      wcpOAV8Emprcod = "" ;
      wcpOAV7BarCodPar = "" ;
      wcpOAV80BarMaqCod = "" ;
      wcpOAV82CliNom = "" ;
      wcpOAV83BarSer = "" ;
      wcpOAV84BarColNom = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_eliminaragrupacion_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV8Emprcod = "" ;
      AV7BarCodPar = "" ;
      AV80BarMaqCod = "" ;
      AV82CliNom = "" ;
      AV83BarSer = "" ;
      AV84BarColNom = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFBarAgrNhdr = "" ;
      AV29TFBarAgrNhdr_Sel = "" ;
      AV32TFBarAgrSer = "" ;
      AV33TFBarAgrSer_Sel = "" ;
      AV34TFBarAgrDsc = "" ;
      AV35TFBarAgrDsc_Sel = "" ;
      AV36TFColNomAgr = "" ;
      AV37TFColNomAgr_Sel = "" ;
      AV40TFKgmAgr = DecimalUtil.ZERO ;
      AV41TFKgmAgr_To = DecimalUtil.ZERO ;
      AV42TFMtrAgr = DecimalUtil.ZERO ;
      AV43TFMtrAgr_To = DecimalUtil.ZERO ;
      AV115Pgmname = "" ;
      AV73TotKgmAgr = DecimalUtil.ZERO ;
      AV75TotMtrAgr = DecimalUtil.ZERO ;
      AV64UsurCod = "" ;
      AV61Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV46DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
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
      bttBtnadd_Jsonclick = "" ;
      bttBtneliminaragrupacion_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV72BarNHdr = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtncerrar_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13792BarAgrNhdr = "" ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      scmdbuf = "" ;
      lV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = "" ;
      lV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = "" ;
      lV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = "" ;
      lV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = "" ;
      AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = "" ;
      AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = "" ;
      AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = "" ;
      AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser = "" ;
      AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = "" ;
      AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = "" ;
      AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = "" ;
      AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = "" ;
      AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr = DecimalUtil.ZERO ;
      AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = DecimalUtil.ZERO ;
      AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr = DecimalUtil.ZERO ;
      AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = DecimalUtil.ZERO ;
      H01IH2_A396EmprCod = new String[] {""} ;
      H01IH2_A129BarCod = new int[1] ;
      H01IH2_A132BarCodReo = new byte[1] ;
      H01IH2_A130BarCodPar = new String[] {""} ;
      H01IH2_A671PieAgr = new short[1] ;
      H01IH2_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01IH2_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01IH2_A1512ColNumAgr = new int[1] ;
      H01IH2_A1510ColNomAgr = new String[] {""} ;
      H01IH2_A1507BarAgrDsc = new String[] {""} ;
      H01IH2_A1245BarAgrSer = new String[] {""} ;
      H01IH2_A1508CliCodAgr = new int[1] ;
      H01IH2_A122BarAgrPar = new String[] {""} ;
      H01IH2_A124BarAgrReo = new byte[1] ;
      H01IH2_A119BarAgrCod = new int[1] ;
      H01IH3_AGRID_nRecordCount = new long[1] ;
      AV74TotValueKgmAgr = "" ;
      AV76TotValueMtrAgr = "" ;
      AV78TotValuePieAgr = "" ;
      AV62BuscarEmprCod = "" ;
      AV63EmprNom = "" ;
      AV55msg0 = "" ;
      AV56msg1 = "" ;
      AV57msg2 = "" ;
      AV58msg3 = "" ;
      AV59msg4 = "" ;
      AV60msg5 = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV24Session = httpContext.getWebSession();
      AV20ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV52BarAgrPar = "" ;
      AV21UserCustomValue = "" ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV108Emprcod_selected = "" ;
      AV111Barcodpar_selected = "" ;
      AV114Baragrpar_selected = "" ;
      GXv_int12 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV68inc_obs = "" ;
      AV69inc_obs2 = "" ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char19 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      H01IH4_A130BarCodPar = new String[] {""} ;
      H01IH4_A132BarCodReo = new byte[1] ;
      H01IH4_A129BarCod = new int[1] ;
      H01IH4_A396EmprCod = new String[] {""} ;
      H01IH4_A671PieAgr = new short[1] ;
      H01IH4_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01IH4_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01IH4_A1512ColNumAgr = new int[1] ;
      H01IH4_A1510ColNomAgr = new String[] {""} ;
      H01IH4_A1507BarAgrDsc = new String[] {""} ;
      H01IH4_A1245BarAgrSer = new String[] {""} ;
      H01IH4_A1508CliCodAgr = new int[1] ;
      H01IH4_A122BarAgrPar = new String[] {""} ;
      H01IH4_A124BarAgrReo = new byte[1] ;
      H01IH4_A119BarAgrCod = new int[1] ;
      ucDvelop_confirmpanel_eliminaragrupacion = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion_ww__default(),
         new Object[] {
             new Object[] {
            H01IH2_A396EmprCod, H01IH2_A129BarCod, H01IH2_A132BarCodReo, H01IH2_A130BarCodPar, H01IH2_A671PieAgr, H01IH2_A869MtrAgr, H01IH2_A590KgmAgr, H01IH2_A1512ColNumAgr, H01IH2_A1510ColNomAgr, H01IH2_A1507BarAgrDsc,
            H01IH2_A1245BarAgrSer, H01IH2_A1508CliCodAgr, H01IH2_A122BarAgrPar, H01IH2_A124BarAgrReo, H01IH2_A119BarAgrCod
            }
            , new Object[] {
            H01IH3_AGRID_nRecordCount
            }
            , new Object[] {
            H01IH4_A130BarCodPar, H01IH4_A132BarCodReo, H01IH4_A129BarCod, H01IH4_A396EmprCod, H01IH4_A671PieAgr, H01IH4_A869MtrAgr, H01IH4_A590KgmAgr, H01IH4_A1512ColNumAgr, H01IH4_A1510ColNomAgr, H01IH4_A1507BarAgrDsc,
            H01IH4_A1245BarAgrSer, H01IH4_A1508CliCodAgr, H01IH4_A122BarAgrPar, H01IH4_A124BarAgrReo, H01IH4_A119BarAgrCod
            }
         }
      );
      AV115Pgmname = "RecetasdeTinte_Agrupacion_WW" ;
      /* GeneXus formulas. */
      AV115Pgmname = "RecetasdeTinte_Agrupacion_WW" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavBarmaqcod_Enabled = 0 ;
      edtavBarvolmaq_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      chkavFlagrec.setEnabled( 0 );
      edtavTotvaluekgmagr_Enabled = 0 ;
      edtavTotvaluemtragr_Enabled = 0 ;
      edtavTotvaluepieagr_Enabled = 0 ;
   }

   private byte wcpOAV6BarCodReo ;
   private byte wcpOAV70FlagRec ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV6BarCodReo ;
   private byte AV70FlagRec ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV51BarAgrReo ;
   private byte AV87hayrecetatinte ;
   private byte GXt_int8 ;
   private byte AV110Barcodreo_selected ;
   private byte AV113Baragrreo_selected ;
   private byte GXv_int9[] ;
   private byte GXv_int14[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV44TFPieAgr ;
   private short AV45TFPieAgr_To ;
   private short AV16OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV53GrupodeAcciones ;
   private short A671PieAgr ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr ;
   private short AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to ;
   private int wcpOAV5BarCod ;
   private int wcpOAV79BarVolMaq ;
   private int wcpOAV81CliCod ;
   private int wcpOAV85BarColNum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_70 ;
   private int AV5BarCod ;
   private int AV79BarVolMaq ;
   private int AV81CliCod ;
   private int AV85BarColNum ;
   private int nGXsfl_70_idx=1 ;
   private int AV30TFCliCodAgr ;
   private int AV31TFCliCodAgr_To ;
   private int AV38TFColNumAgr ;
   private int AV39TFColNumAgr_To ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarnhdr_Enabled ;
   private int edtavBarmaqcod_Enabled ;
   private int edtavBarvolmaq_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int A119BarAgrCod ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluekgmagr_Enabled ;
   private int edtavTotvaluemtragr_Enabled ;
   private int edtavTotvaluepieagr_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr ;
   private int AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to ;
   private int AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr ;
   private int AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to ;
   private int edtBarAgrNhdr_Visible ;
   private int edtCliCodAgr_Visible ;
   private int edtBarAgrSer_Visible ;
   private int edtBarAgrDsc_Visible ;
   private int edtColNomAgr_Visible ;
   private int edtColNumAgr_Visible ;
   private int edtKgmAgr_Visible ;
   private int edtMtrAgr_Visible ;
   private int edtPieAgr_Visible ;
   private int AV47PageToGo ;
   private int AV50BarAgrCod ;
   private int AV109Barcod_selected ;
   private int AV112Baragrcod_selected ;
   private int GXv_int12[] ;
   private int GXv_int13[] ;
   private int AV116GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV77TotPieAgr ;
   private long AV48GridCurrentPage ;
   private long AV49GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV40TFKgmAgr ;
   private java.math.BigDecimal AV41TFKgmAgr_To ;
   private java.math.BigDecimal AV42TFMtrAgr ;
   private java.math.BigDecimal AV43TFMtrAgr_To ;
   private java.math.BigDecimal AV73TotKgmAgr ;
   private java.math.BigDecimal AV75TotMtrAgr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr ;
   private java.math.BigDecimal AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ;
   private java.math.BigDecimal AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr ;
   private java.math.BigDecimal AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ;
   private String wcpOAV8Emprcod ;
   private String wcpOAV7BarCodPar ;
   private String wcpOAV80BarMaqCod ;
   private String wcpOAV82CliNom ;
   private String wcpOAV83BarSer ;
   private String wcpOAV84BarColNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV8Emprcod ;
   private String AV7BarCodPar ;
   private String AV80BarMaqCod ;
   private String AV82CliNom ;
   private String AV83BarSer ;
   private String AV84BarColNom ;
   private String sGXsfl_70_idx="0001" ;
   private String AV28TFBarAgrNhdr ;
   private String AV29TFBarAgrNhdr_Sel ;
   private String AV32TFBarAgrSer ;
   private String AV33TFBarAgrSer_Sel ;
   private String AV34TFBarAgrDsc ;
   private String AV35TFBarAgrDsc_Sel ;
   private String AV36TFColNomAgr ;
   private String AV37TFColNomAgr_Sel ;
   private String AV115Pgmname ;
   private String AV64UsurCod ;
   private String AV61Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Title ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
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
   private String bttBtnadd_Internalname ;
   private String bttBtnadd_Jsonclick ;
   private String bttBtneliminaragrupacion_Internalname ;
   private String bttBtneliminaragrupacion_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String AV72BarNHdr ;
   private String edtavBarnhdr_Jsonclick ;
   private String edtavBarmaqcod_Internalname ;
   private String edtavBarmaqcod_Jsonclick ;
   private String edtavBarvolmaq_Internalname ;
   private String edtavBarvolmaq_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13792BarAgrNhdr ;
   private String edtBarAgrNhdr_Internalname ;
   private String edtCliCodAgr_Internalname ;
   private String A1245BarAgrSer ;
   private String edtBarAgrSer_Internalname ;
   private String A1507BarAgrDsc ;
   private String edtBarAgrDsc_Internalname ;
   private String A1510ColNomAgr ;
   private String edtColNomAgr_Internalname ;
   private String edtColNumAgr_Internalname ;
   private String edtKgmAgr_Internalname ;
   private String edtMtrAgr_Internalname ;
   private String edtPieAgr_Internalname ;
   private String edtBarAgrCod_Internalname ;
   private String edtBarAgrReo_Internalname ;
   private String A122BarAgrPar ;
   private String edtBarAgrPar_Internalname ;
   private String edtavTotvaluekgmagr_Internalname ;
   private String edtavTotvaluemtragr_Internalname ;
   private String edtavTotvaluepieagr_Internalname ;
   private String scmdbuf ;
   private String lV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ;
   private String lV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser ;
   private String lV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ;
   private String lV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ;
   private String AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ;
   private String AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ;
   private String AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ;
   private String AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser ;
   private String AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ;
   private String AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ;
   private String AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ;
   private String AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ;
   private String AV62BuscarEmprCod ;
   private String AV63EmprNom ;
   private String AV52BarAgrPar ;
   private String AV108Emprcod_selected ;
   private String AV111Barcodpar_selected ;
   private String AV114Baragrpar_selected ;
   private String GXv_char2[] ;
   private String GXt_char19 ;
   private String GXv_char16[] ;
   private String GXt_char18 ;
   private String GXv_char15[] ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluekgmagr_Jsonclick ;
   private String edtavTotvaluemtragr_Jsonclick ;
   private String edtavTotvaluepieagr_Jsonclick ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarAgrNhdr_Jsonclick ;
   private String edtCliCodAgr_Jsonclick ;
   private String edtBarAgrSer_Jsonclick ;
   private String edtBarAgrDsc_Jsonclick ;
   private String edtColNomAgr_Jsonclick ;
   private String edtColNumAgr_Jsonclick ;
   private String edtKgmAgr_Jsonclick ;
   private String edtMtrAgr_Jsonclick ;
   private String edtPieAgr_Jsonclick ;
   private String edtBarAgrCod_Jsonclick ;
   private String edtBarAgrReo_Jsonclick ;
   private String edtBarAgrPar_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV17OrderedDsc ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV20ColumnsSelectorXML ;
   private String AV21UserCustomValue ;
   private String AV74TotValueKgmAgr ;
   private String AV76TotValueMtrAgr ;
   private String AV78TotValuePieAgr ;
   private String AV55msg0 ;
   private String AV56msg1 ;
   private String AV57msg2 ;
   private String AV58msg3 ;
   private String AV59msg4 ;
   private String AV60msg5 ;
   private String AV68inc_obs ;
   private String AV69inc_obs2 ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminaragrupacion ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private ICheckbox chkavFlagrec ;
   private HTMLChoice cmbavGrupodeacciones ;
   private IDataStoreProvider pr_default ;
   private String[] H01IH2_A396EmprCod ;
   private int[] H01IH2_A129BarCod ;
   private byte[] H01IH2_A132BarCodReo ;
   private String[] H01IH2_A130BarCodPar ;
   private short[] H01IH2_A671PieAgr ;
   private java.math.BigDecimal[] H01IH2_A869MtrAgr ;
   private java.math.BigDecimal[] H01IH2_A590KgmAgr ;
   private int[] H01IH2_A1512ColNumAgr ;
   private String[] H01IH2_A1510ColNomAgr ;
   private String[] H01IH2_A1507BarAgrDsc ;
   private String[] H01IH2_A1245BarAgrSer ;
   private int[] H01IH2_A1508CliCodAgr ;
   private String[] H01IH2_A122BarAgrPar ;
   private byte[] H01IH2_A124BarAgrReo ;
   private int[] H01IH2_A119BarAgrCod ;
   private long[] H01IH3_AGRID_nRecordCount ;
   private String[] H01IH4_A130BarCodPar ;
   private byte[] H01IH4_A132BarCodReo ;
   private int[] H01IH4_A129BarCod ;
   private String[] H01IH4_A396EmprCod ;
   private short[] H01IH4_A671PieAgr ;
   private java.math.BigDecimal[] H01IH4_A869MtrAgr ;
   private java.math.BigDecimal[] H01IH4_A590KgmAgr ;
   private int[] H01IH4_A1512ColNumAgr ;
   private String[] H01IH4_A1510ColNomAgr ;
   private String[] H01IH4_A1507BarAgrDsc ;
   private String[] H01IH4_A1245BarAgrSer ;
   private int[] H01IH4_A1508CliCodAgr ;
   private String[] H01IH4_A122BarAgrPar ;
   private byte[] H01IH4_A124BarAgrReo ;
   private int[] H01IH4_A119BarAgrCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV46DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class recetasdetinte_agrupacion_ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01IH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                          String AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                          int AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr ,
                                          int AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to ,
                                          String AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                          String AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                          String AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                          String AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                          String AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                          String AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                          int AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr ,
                                          int AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to ,
                                          java.math.BigDecimal AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                          java.math.BigDecimal AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                          java.math.BigDecimal AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                          java.math.BigDecimal AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                          short AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr ,
                                          short AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          int A1508CliCodAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV8Emprcod ,
                                          int AV5BarCod ,
                                          byte AV6BarCodReo ,
                                          String AV7BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[27];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, BarCod, BarCodReo, BarCodPar, PieAgr, MtrAgr, KgmAgr, ColNumAgr, ColNomAgr, BarAgrDsc, BarAgrSer, CliCodAgr, BarAgrPar, BarAgrReo, BarAgrCod" ;
      sFromString = " FROM TXPBARAGR" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( ! (0==AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (0==AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (0==AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (0==AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (0==AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY CliCodAgr" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY CliCodAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY BarAgrSer" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY BarAgrSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY BarAgrDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY BarAgrDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY ColNomAgr" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNomAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY ColNumAgr" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNumAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY KgmAgr" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY KgmAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY MtrAgr" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY MtrAgr DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY PieAgr" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY PieAgr DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H01IH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                          String AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                          int AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr ,
                                          int AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to ,
                                          String AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                          String AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                          String AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                          String AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                          String AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                          String AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                          int AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr ,
                                          int AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to ,
                                          java.math.BigDecimal AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                          java.math.BigDecimal AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                          java.math.BigDecimal AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                          java.math.BigDecimal AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                          short AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr ,
                                          short AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          int A1508CliCodAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV8Emprcod ,
                                          int AV5BarCod ,
                                          byte AV6BarCodReo ,
                                          String AV7BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[22];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (0==AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (0==AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (0==AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (0==AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (0==AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H01IH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                          String AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                          int AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr ,
                                          int AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to ,
                                          String AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                          String AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                          String AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                          String AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                          String AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                          String AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                          int AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr ,
                                          int AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to ,
                                          java.math.BigDecimal AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                          java.math.BigDecimal AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                          java.math.BigDecimal AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                          java.math.BigDecimal AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                          short AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr ,
                                          short AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          int A1508CliCodAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String AV8Emprcod ,
                                          int AV5BarCod ,
                                          byte AV6BarCodReo ,
                                          String AV7BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[22];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, PieAgr, MtrAgr, KgmAgr, ColNumAgr, ColNomAgr, BarAgrDsc, BarAgrSer, CliCodAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM" ;
      scmdbuf += " TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV90Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (0==AV92Recetasdetinte_agrupacion_wwds_3_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (0==AV93Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV94Recetasdetinte_agrupacion_wwds_5_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV98Recetasdetinte_agrupacion_wwds_9_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (0==AV100Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (0==AV101Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Recetasdetinte_agrupacion_wwds_13_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Recetasdetinte_agrupacion_wwds_15_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Recetasdetinte_agrupacion_wwds_16_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (0==AV106Recetasdetinte_agrupacion_wwds_17_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (0==AV107Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
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
            case 0 :
                  return conditional_H01IH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] );
            case 1 :
                  return conditional_H01IH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] );
            case 2 :
                  return conditional_H01IH4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01IH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               return;
      }
   }

}

