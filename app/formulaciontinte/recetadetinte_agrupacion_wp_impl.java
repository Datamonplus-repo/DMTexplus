package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte_agrupacion_wp_impl extends GXDataArea
{
   public recetadetinte_agrupacion_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadetinte_agrupacion_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_agrupacion_wp_impl.class ));
   }

   public recetadetinte_agrupacion_wp_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            A396EmprCod = gxfirstwebparm ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV80TFBarAgrNhdr = httpContext.GetPar( "TFBarAgrNhdr") ;
      AV81TFBarAgrNhdr_Sel = httpContext.GetPar( "TFBarAgrNhdr_Sel") ;
      AV54TFKgmAgr = CommonUtil.decimalVal( httpContext.GetPar( "TFKgmAgr"), ".") ;
      AV55TFKgmAgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFKgmAgr_To"), ".") ;
      AV58TFMtrAgr = CommonUtil.decimalVal( httpContext.GetPar( "TFMtrAgr"), ".") ;
      AV59TFMtrAgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMtrAgr_To"), ".") ;
      AV56TFPieAgr = (short)(GXutil.lval( httpContext.GetPar( "TFPieAgr"))) ;
      AV57TFPieAgr_To = (short)(GXutil.lval( httpContext.GetPar( "TFPieAgr_To"))) ;
      AV60TFBarAgrSer = httpContext.GetPar( "TFBarAgrSer") ;
      AV61TFBarAgrSer_Sel = httpContext.GetPar( "TFBarAgrSer_Sel") ;
      AV62TFBarAgrDsc = httpContext.GetPar( "TFBarAgrDsc") ;
      AV63TFBarAgrDsc_Sel = httpContext.GetPar( "TFBarAgrDsc_Sel") ;
      AV64TFCliCodAgr = (int)(GXutil.lval( httpContext.GetPar( "TFCliCodAgr"))) ;
      AV65TFCliCodAgr_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCodAgr_To"))) ;
      AV68TFColNomAgr = httpContext.GetPar( "TFColNomAgr") ;
      AV69TFColNomAgr_Sel = httpContext.GetPar( "TFColNomAgr_Sel") ;
      AV70TFColNumAgr = (int)(GXutil.lval( httpContext.GetPar( "TFColNumAgr"))) ;
      AV71TFColNumAgr_To = (int)(GXutil.lval( httpContext.GetPar( "TFColNumAgr_To"))) ;
      AV72TFColNoCAgr = httpContext.GetPar( "TFColNoCAgr") ;
      AV73TFColNoCAgr_Sel = httpContext.GetPar( "TFColNoCAgr_Sel") ;
      AV74TFColNuCAgr = (int)(GXutil.lval( httpContext.GetPar( "TFColNuCAgr"))) ;
      AV75TFColNuCAgr_To = (int)(GXutil.lval( httpContext.GetPar( "TFColNuCAgr_To"))) ;
      AV122Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV87TotKgmAgr = CommonUtil.decimalVal( httpContext.GetPar( "TotKgmAgr"), ".") ;
      AV89TotMtrAgr = CommonUtil.decimalVal( httpContext.GetPar( "TotMtrAgr"), ".") ;
      AV91TotPieAgr = GXutil.lval( httpContext.GetPar( "TotPieAgr")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV80TFBarAgrNhdr, AV81TFBarAgrNhdr_Sel, AV54TFKgmAgr, AV55TFKgmAgr_To, AV58TFMtrAgr, AV59TFMtrAgr_To, AV56TFPieAgr, AV57TFPieAgr_To, AV60TFBarAgrSer, AV61TFBarAgrSer_Sel, AV62TFBarAgrDsc, AV63TFBarAgrDsc_Sel, AV64TFCliCodAgr, AV65TFCliCodAgr_To, AV68TFColNomAgr, AV69TFColNomAgr_Sel, AV70TFColNumAgr, AV71TFColNumAgr_To, AV72TFColNoCAgr, AV73TFColNoCAgr_Sel, AV74TFColNuCAgr, AV75TFColNuCAgr_To, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotKgmAgr, AV89TotMtrAgr, AV91TotPieAgr) ;
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
      pa1O92( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1O92( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.recetadetinte_agrupacion_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV122Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGMAGR", getSecureSignedToken( "", localUtil.format( AV87TotKgmAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMTRAGR", getSecureSignedToken( "", localUtil.format( AV89TotMtrAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEAGR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV91TotPieAgr), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRNHDR", GXutil.rtrim( AV80TFBarAgrNhdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRNHDR_SEL", GXutil.rtrim( AV81TFBarAgrNhdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFKGMAGR", GXutil.ltrim( localUtil.ntoc( AV54TFKgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFKGMAGR_TO", GXutil.ltrim( localUtil.ntoc( AV55TFKgmAgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMTRAGR", GXutil.ltrim( localUtil.ntoc( AV58TFMtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMTRAGR_TO", GXutil.ltrim( localUtil.ntoc( AV59TFMtrAgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPIEAGR", GXutil.ltrim( localUtil.ntoc( AV56TFPieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPIEAGR_TO", GXutil.ltrim( localUtil.ntoc( AV57TFPieAgr_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRSER", GXutil.rtrim( AV60TFBarAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRSER_SEL", GXutil.rtrim( AV61TFBarAgrSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRDSC", GXutil.rtrim( AV62TFBarAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRDSC_SEL", GXutil.rtrim( AV63TFBarAgrDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICODAGR", GXutil.ltrim( localUtil.ntoc( AV64TFCliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICODAGR_TO", GXutil.ltrim( localUtil.ntoc( AV65TFCliCodAgr_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNOMAGR", GXutil.rtrim( AV68TFColNomAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNOMAGR_SEL", GXutil.rtrim( AV69TFColNomAgr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNUMAGR", GXutil.ltrim( localUtil.ntoc( AV70TFColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNUMAGR_TO", GXutil.ltrim( localUtil.ntoc( AV71TFColNumAgr_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNOCAGR", GXutil.rtrim( AV72TFColNoCAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNOCAGR_SEL", GXutil.rtrim( AV73TFColNoCAgr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNUCAGR", GXutil.ltrim( localUtil.ntoc( AV74TFColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNUCAGR_TO", GXutil.ltrim( localUtil.ntoc( AV75TFColNuCAgr_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV122Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV122Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKGMAGR", GXutil.ltrim( localUtil.ntoc( AV87TotKgmAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGMAGR", getSecureSignedToken( "", localUtil.format( AV87TotKgmAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMTRAGR", GXutil.ltrim( localUtil.ntoc( AV89TotMtrAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMTRAGR", getSecureSignedToken( "", localUtil.format( AV89TotMtrAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTPIEAGR", GXutil.ltrim( localUtil.ntoc( AV91TotPieAgr, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEAGR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV91TotPieAgr), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
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
         we1O92( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1O92( ) ;
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
      return formatLink("app.formulaciontinte.recetadetinte_agrupacion_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.RecetadeTinte_Agrupacion_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle de HDRs Agrupadas para Tinte", "") ;
   }

   public void wb1O90( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte_Agrupacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte_Agrupacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte_Agrupacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1O92( true) ;
      }
      else
      {
         wb_table1_23_1O92( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1O92e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_62_1O92( true) ;
      }
      else
      {
         wb_table2_62_1O92( false) ;
      }
      return  ;
   }

   public void wb_table2_62_1O92e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV84GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV85GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV82DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV82DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
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

   public void start1O92( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Detalle de HDRs Agrupadas para Tinte", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1O90( ) ;
   }

   public void ws1O92( )
   {
      start1O92( ) ;
      evt1O92( ) ;
   }

   public void evt1O92( )
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
                           e111O92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121O92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131O92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141O92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151O92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e161O92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e171O92 ();
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
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
                           A590KgmAgr = localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)) ;
                           A869MtrAgr = localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)) ;
                           A671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
                           A1507BarAgrDsc = httpContext.cgiGet( edtBarAgrDsc_Internalname) ;
                           A1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
                           A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1509ColNoCAgr = httpContext.cgiGet( edtColNoCAgr_Internalname) ;
                           A1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNuCAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                 e181O92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e191O92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e201O92 ();
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
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
                           A590KgmAgr = localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)) ;
                           A869MtrAgr = localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)) ;
                           A671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
                           A1507BarAgrDsc = httpContext.cgiGet( edtBarAgrDsc_Internalname) ;
                           A1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
                           A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1509ColNoCAgr = httpContext.cgiGet( edtColNoCAgr_Internalname) ;
                           A1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNuCAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                 e181O92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e191O92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e201O92 ();
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

   public void we1O92( )
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

   public void pa1O92( )
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
                                 String AV15FilterFullText ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV80TFBarAgrNhdr ,
                                 String AV81TFBarAgrNhdr_Sel ,
                                 java.math.BigDecimal AV54TFKgmAgr ,
                                 java.math.BigDecimal AV55TFKgmAgr_To ,
                                 java.math.BigDecimal AV58TFMtrAgr ,
                                 java.math.BigDecimal AV59TFMtrAgr_To ,
                                 short AV56TFPieAgr ,
                                 short AV57TFPieAgr_To ,
                                 String AV60TFBarAgrSer ,
                                 String AV61TFBarAgrSer_Sel ,
                                 String AV62TFBarAgrDsc ,
                                 String AV63TFBarAgrDsc_Sel ,
                                 int AV64TFCliCodAgr ,
                                 int AV65TFCliCodAgr_To ,
                                 String AV68TFColNomAgr ,
                                 String AV69TFColNomAgr_Sel ,
                                 int AV70TFColNumAgr ,
                                 int AV71TFColNumAgr_To ,
                                 String AV72TFColNoCAgr ,
                                 String AV73TFColNoCAgr_Sel ,
                                 int AV74TFColNuCAgr ,
                                 int AV75TFColNuCAgr_To ,
                                 String AV122Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV87TotKgmAgr ,
                                 java.math.BigDecimal AV89TotMtrAgr ,
                                 long AV91TotPieAgr )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191O92 ();
      GRID_nCurrentRecord = 0 ;
      rf1O92( ) ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1O92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV122Pgmname = "FormulacionTinte.RecetadeTinte_Agrupacion_WP" ;
      Gx_err = (short)(0) ;
      edtavTotvaluekgmagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluekgmagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekgmagr_Enabled), 5, 0), true);
      edtavTotvaluemtragr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemtragr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemtragr_Enabled), 5, 0), true);
      edtavTotvaluepieagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluepieagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluepieagr_Enabled), 5, 0), true);
   }

   public void rf1O92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191O92 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                              AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                              AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                              AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                              AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                              AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                              AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                              Short.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) ,
                                              Short.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) ,
                                              AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                              AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                              AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                              AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                              Integer.valueOf(AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) ,
                                              Integer.valueOf(AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) ,
                                              AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                              AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                              Integer.valueOf(AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) ,
                                              Integer.valueOf(AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) ,
                                              AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                              AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                              Integer.valueOf(AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) ,
                                              Integer.valueOf(AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) ,
                                              Integer.valueOf(A119BarAgrCod) ,
                                              Byte.valueOf(A124BarAgrReo) ,
                                              A122BarAgrPar ,
                                              A590KgmAgr ,
                                              A869MtrAgr ,
                                              Short.valueOf(A671PieAgr) ,
                                              A1245BarAgrSer ,
                                              A1507BarAgrDsc ,
                                              Integer.valueOf(A1508CliCodAgr) ,
                                              A1510ColNomAgr ,
                                              Integer.valueOf(A1512ColNumAgr) ,
                                              A1509ColNoCAgr ,
                                              Integer.valueOf(A1511ColNuCAgr) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
         lV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr), 11, "%") ;
         lV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser), 16, "%") ;
         lV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc), 26, "%") ;
         lV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr), 13, "%") ;
         lV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr), 13, "%") ;
         /* Using cursor H01O92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr, AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel, AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr, AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to, AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to, Short.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr), Short.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to), lV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser, AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel, lV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc, AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel, Integer.valueOf(AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr), Integer.valueOf(AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to), lV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr, AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel, Integer.valueOf(AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr), Integer.valueOf(AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to), lV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr, AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel, Integer.valueOf(AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr), Integer.valueOf(AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1511ColNuCAgr = H01O92_A1511ColNuCAgr[0] ;
            A1509ColNoCAgr = H01O92_A1509ColNoCAgr[0] ;
            A1512ColNumAgr = H01O92_A1512ColNumAgr[0] ;
            A1510ColNomAgr = H01O92_A1510ColNomAgr[0] ;
            A1508CliCodAgr = H01O92_A1508CliCodAgr[0] ;
            A1507BarAgrDsc = H01O92_A1507BarAgrDsc[0] ;
            A1245BarAgrSer = H01O92_A1245BarAgrSer[0] ;
            A671PieAgr = H01O92_A671PieAgr[0] ;
            A869MtrAgr = H01O92_A869MtrAgr[0] ;
            A590KgmAgr = H01O92_A590KgmAgr[0] ;
            A122BarAgrPar = H01O92_A122BarAgrPar[0] ;
            A124BarAgrReo = H01O92_A124BarAgrReo[0] ;
            A119BarAgrCod = H01O92_A119BarAgrCod[0] ;
            A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
            e201O92 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb1O90( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1O92( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV122Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV122Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKGMAGR", GXutil.ltrim( localUtil.ntoc( AV87TotKgmAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGMAGR", getSecureSignedToken( "", localUtil.format( AV87TotKgmAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMTRAGR", GXutil.ltrim( localUtil.ntoc( AV89TotMtrAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMTRAGR", getSecureSignedToken( "", localUtil.format( AV89TotMtrAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTPIEAGR", GXutil.ltrim( localUtil.ntoc( AV91TotPieAgr, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEAGR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV91TotPieAgr), "ZZZ9")));
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
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV15FilterFullText ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV80TFBarAgrNhdr ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV81TFBarAgrNhdr_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV54TFKgmAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV55TFKgmAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV58TFMtrAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV59TFMtrAgr_To ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV56TFPieAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV57TFPieAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV60TFBarAgrSer ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV61TFBarAgrSer_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV62TFBarAgrDsc ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV63TFBarAgrDsc_Sel ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV64TFCliCodAgr ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV65TFCliCodAgr_To ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV68TFColNomAgr ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV69TFColNomAgr_Sel ;
      AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV70TFColNumAgr ;
      AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV71TFColNumAgr_To ;
      AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV72TFColNoCAgr ;
      AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV73TFColNoCAgr_Sel ;
      AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV74TFColNuCAgr ;
      AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV75TFColNuCAgr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                           AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                           AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                           AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                           AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                           AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                           AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                           Short.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) ,
                                           Short.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) ,
                                           AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                           AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                           AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                           AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) ,
                                           Integer.valueOf(AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) ,
                                           AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                           AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                           Integer.valueOf(AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) ,
                                           AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                           AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                           Integer.valueOf(AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr), 11, "%") ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser), 16, "%") ;
      lV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc), 26, "%") ;
      lV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr), 13, "%") ;
      lV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor H01O93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr, AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel, AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr, AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to, AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to, Short.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr), Short.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to), lV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser, AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel, lV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc, AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel, Integer.valueOf(AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr), Integer.valueOf(AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to), lV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr, AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel, Integer.valueOf(AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr), Integer.valueOf(AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to), lV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr, AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel, Integer.valueOf(AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr), Integer.valueOf(AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to)});
      GRID_nRecordCount = H01O93_AGRID_nRecordCount[0] ;
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
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV15FilterFullText ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV80TFBarAgrNhdr ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV81TFBarAgrNhdr_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV54TFKgmAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV55TFKgmAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV58TFMtrAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV59TFMtrAgr_To ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV56TFPieAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV57TFPieAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV60TFBarAgrSer ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV61TFBarAgrSer_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV62TFBarAgrDsc ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV63TFBarAgrDsc_Sel ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV64TFCliCodAgr ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV65TFCliCodAgr_To ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV68TFColNomAgr ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV69TFColNomAgr_Sel ;
      AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV70TFColNumAgr ;
      AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV71TFColNumAgr_To ;
      AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV72TFColNoCAgr ;
      AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV73TFColNoCAgr_Sel ;
      AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV74TFColNuCAgr ;
      AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV75TFColNuCAgr_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV80TFBarAgrNhdr, AV81TFBarAgrNhdr_Sel, AV54TFKgmAgr, AV55TFKgmAgr_To, AV58TFMtrAgr, AV59TFMtrAgr_To, AV56TFPieAgr, AV57TFPieAgr_To, AV60TFBarAgrSer, AV61TFBarAgrSer_Sel, AV62TFBarAgrDsc, AV63TFBarAgrDsc_Sel, AV64TFCliCodAgr, AV65TFCliCodAgr_To, AV68TFColNomAgr, AV69TFColNomAgr_Sel, AV70TFColNumAgr, AV71TFColNumAgr_To, AV72TFColNoCAgr, AV73TFColNoCAgr_Sel, AV74TFColNuCAgr, AV75TFColNuCAgr_To, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotKgmAgr, AV89TotMtrAgr, AV91TotPieAgr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV15FilterFullText ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV80TFBarAgrNhdr ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV81TFBarAgrNhdr_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV54TFKgmAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV55TFKgmAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV58TFMtrAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV59TFMtrAgr_To ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV56TFPieAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV57TFPieAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV60TFBarAgrSer ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV61TFBarAgrSer_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV62TFBarAgrDsc ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV63TFBarAgrDsc_Sel ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV64TFCliCodAgr ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV65TFCliCodAgr_To ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV68TFColNomAgr ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV69TFColNomAgr_Sel ;
      AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV70TFColNumAgr ;
      AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV71TFColNumAgr_To ;
      AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV72TFColNoCAgr ;
      AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV73TFColNoCAgr_Sel ;
      AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV74TFColNuCAgr ;
      AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV75TFColNuCAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV80TFBarAgrNhdr, AV81TFBarAgrNhdr_Sel, AV54TFKgmAgr, AV55TFKgmAgr_To, AV58TFMtrAgr, AV59TFMtrAgr_To, AV56TFPieAgr, AV57TFPieAgr_To, AV60TFBarAgrSer, AV61TFBarAgrSer_Sel, AV62TFBarAgrDsc, AV63TFBarAgrDsc_Sel, AV64TFCliCodAgr, AV65TFCliCodAgr_To, AV68TFColNomAgr, AV69TFColNomAgr_Sel, AV70TFColNumAgr, AV71TFColNumAgr_To, AV72TFColNoCAgr, AV73TFColNoCAgr_Sel, AV74TFColNuCAgr, AV75TFColNuCAgr_To, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotKgmAgr, AV89TotMtrAgr, AV91TotPieAgr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV15FilterFullText ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV80TFBarAgrNhdr ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV81TFBarAgrNhdr_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV54TFKgmAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV55TFKgmAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV58TFMtrAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV59TFMtrAgr_To ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV56TFPieAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV57TFPieAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV60TFBarAgrSer ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV61TFBarAgrSer_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV62TFBarAgrDsc ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV63TFBarAgrDsc_Sel ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV64TFCliCodAgr ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV65TFCliCodAgr_To ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV68TFColNomAgr ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV69TFColNomAgr_Sel ;
      AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV70TFColNumAgr ;
      AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV71TFColNumAgr_To ;
      AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV72TFColNoCAgr ;
      AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV73TFColNoCAgr_Sel ;
      AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV74TFColNuCAgr ;
      AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV75TFColNuCAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV80TFBarAgrNhdr, AV81TFBarAgrNhdr_Sel, AV54TFKgmAgr, AV55TFKgmAgr_To, AV58TFMtrAgr, AV59TFMtrAgr_To, AV56TFPieAgr, AV57TFPieAgr_To, AV60TFBarAgrSer, AV61TFBarAgrSer_Sel, AV62TFBarAgrDsc, AV63TFBarAgrDsc_Sel, AV64TFCliCodAgr, AV65TFCliCodAgr_To, AV68TFColNomAgr, AV69TFColNomAgr_Sel, AV70TFColNumAgr, AV71TFColNumAgr_To, AV72TFColNoCAgr, AV73TFColNoCAgr_Sel, AV74TFColNuCAgr, AV75TFColNuCAgr_To, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotKgmAgr, AV89TotMtrAgr, AV91TotPieAgr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV15FilterFullText ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV80TFBarAgrNhdr ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV81TFBarAgrNhdr_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV54TFKgmAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV55TFKgmAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV58TFMtrAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV59TFMtrAgr_To ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV56TFPieAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV57TFPieAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV60TFBarAgrSer ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV61TFBarAgrSer_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV62TFBarAgrDsc ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV63TFBarAgrDsc_Sel ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV64TFCliCodAgr ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV65TFCliCodAgr_To ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV68TFColNomAgr ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV69TFColNomAgr_Sel ;
      AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV70TFColNumAgr ;
      AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV71TFColNumAgr_To ;
      AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV72TFColNoCAgr ;
      AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV73TFColNoCAgr_Sel ;
      AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV74TFColNuCAgr ;
      AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV75TFColNuCAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV80TFBarAgrNhdr, AV81TFBarAgrNhdr_Sel, AV54TFKgmAgr, AV55TFKgmAgr_To, AV58TFMtrAgr, AV59TFMtrAgr_To, AV56TFPieAgr, AV57TFPieAgr_To, AV60TFBarAgrSer, AV61TFBarAgrSer_Sel, AV62TFBarAgrDsc, AV63TFBarAgrDsc_Sel, AV64TFCliCodAgr, AV65TFCliCodAgr_To, AV68TFColNomAgr, AV69TFColNomAgr_Sel, AV70TFColNumAgr, AV71TFColNumAgr_To, AV72TFColNoCAgr, AV73TFColNoCAgr_Sel, AV74TFColNuCAgr, AV75TFColNuCAgr_To, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotKgmAgr, AV89TotMtrAgr, AV91TotPieAgr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV15FilterFullText ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV80TFBarAgrNhdr ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV81TFBarAgrNhdr_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV54TFKgmAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV55TFKgmAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV58TFMtrAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV59TFMtrAgr_To ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV56TFPieAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV57TFPieAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV60TFBarAgrSer ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV61TFBarAgrSer_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV62TFBarAgrDsc ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV63TFBarAgrDsc_Sel ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV64TFCliCodAgr ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV65TFCliCodAgr_To ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV68TFColNomAgr ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV69TFColNomAgr_Sel ;
      AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV70TFColNumAgr ;
      AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV71TFColNumAgr_To ;
      AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV72TFColNoCAgr ;
      AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV73TFColNoCAgr_Sel ;
      AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV74TFColNuCAgr ;
      AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV75TFColNuCAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV80TFBarAgrNhdr, AV81TFBarAgrNhdr_Sel, AV54TFKgmAgr, AV55TFKgmAgr_To, AV58TFMtrAgr, AV59TFMtrAgr_To, AV56TFPieAgr, AV57TFPieAgr_To, AV60TFBarAgrSer, AV61TFBarAgrSer_Sel, AV62TFBarAgrDsc, AV63TFBarAgrDsc_Sel, AV64TFCliCodAgr, AV65TFCliCodAgr_To, AV68TFColNomAgr, AV69TFColNomAgr_Sel, AV70TFColNumAgr, AV71TFColNumAgr_To, AV72TFColNoCAgr, AV73TFColNoCAgr_Sel, AV74TFColNuCAgr, AV75TFColNuCAgr_To, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc, AV87TotKgmAgr, AV89TotMtrAgr, AV91TotPieAgr) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV122Pgmname = "FormulacionTinte.RecetadeTinte_Agrupacion_WP" ;
      Gx_err = (short)(0) ;
      edtavTotvaluekgmagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluekgmagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekgmagr_Enabled), 5, 0), true);
      edtavTotvaluemtragr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemtragr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemtragr_Enabled), 5, 0), true);
      edtavTotvaluepieagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluepieagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluepieagr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1O90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181O92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV82DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV84GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV85GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV88TotValueKgmAgr = httpContext.cgiGet( edtavTotvaluekgmagr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88TotValueKgmAgr", AV88TotValueKgmAgr);
         AV90TotValueMtrAgr = httpContext.cgiGet( edtavTotvaluemtragr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90TotValueMtrAgr", AV90TotValueMtrAgr);
         AV92TotValuePieAgr = httpContext.cgiGet( edtavTotvaluepieagr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92TotValuePieAgr", AV92TotValuePieAgr);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e181O92 ();
      if (returnInSub) return;
   }

   public void e181O92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV95Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV95Station = GXt_char1 ;
      GXv_char2[0] = AV96Emprcod ;
      GXv_char3[0] = AV97Emprnom ;
      GXv_char4[0] = AV98Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV95Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadetinte_agrupacion_wp_impl.this.AV96Emprcod = GXv_char2[0] ;
      recetadetinte_agrupacion_wp_impl.this.AV97Emprnom = GXv_char3[0] ;
      recetadetinte_agrupacion_wp_impl.this.AV98Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( "Detalle de HDRs Agrupadas para Tinte", "") );
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

   public void e191O92( )
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
      if ( GXutil.strcmp(AV22Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtBarAgrNhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtKgmAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtMtrAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPieAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarAgrSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarAgrDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliCodAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtColNomAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtColNumAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtColNoCAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNoCAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtColNuCAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNuCAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV84GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84GridCurrentPage), 10, 0));
      AV85GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV15FilterFullText ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV80TFBarAgrNhdr ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV81TFBarAgrNhdr_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV54TFKgmAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV55TFKgmAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV58TFMtrAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV59TFMtrAgr_To ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV56TFPieAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV57TFPieAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV60TFBarAgrSer ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV61TFBarAgrSer_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV62TFBarAgrDsc ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV63TFBarAgrDsc_Sel ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV64TFCliCodAgr ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV65TFCliCodAgr_To ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV68TFColNomAgr ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV69TFColNomAgr_Sel ;
      AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV70TFColNumAgr ;
      AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV71TFColNumAgr_To ;
      AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV72TFColNoCAgr ;
      AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV73TFColNoCAgr_Sel ;
      AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV74TFColNuCAgr ;
      AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV75TFColNuCAgr_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121O92( )
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

   public void e131O92( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141O92( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrNhdr") == 0 )
         {
            AV80TFBarAgrNhdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFBarAgrNhdr", AV80TFBarAgrNhdr);
            AV81TFBarAgrNhdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFBarAgrNhdr_Sel", AV81TFBarAgrNhdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "KgmAgr") == 0 )
         {
            AV54TFKgmAgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFKgmAgr", GXutil.ltrimstr( AV54TFKgmAgr, 9, 2));
            AV55TFKgmAgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFKgmAgr_To", GXutil.ltrimstr( AV55TFKgmAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MtrAgr") == 0 )
         {
            AV58TFMtrAgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFMtrAgr", GXutil.ltrimstr( AV58TFMtrAgr, 9, 2));
            AV59TFMtrAgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFMtrAgr_To", GXutil.ltrimstr( AV59TFMtrAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PieAgr") == 0 )
         {
            AV56TFPieAgr = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFPieAgr), 4, 0));
            AV57TFPieAgr_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFPieAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFPieAgr_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrSer") == 0 )
         {
            AV60TFBarAgrSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarAgrSer", AV60TFBarAgrSer);
            AV61TFBarAgrSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarAgrSer_Sel", AV61TFBarAgrSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrDsc") == 0 )
         {
            AV62TFBarAgrDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFBarAgrDsc", AV62TFBarAgrDsc);
            AV63TFBarAgrDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarAgrDsc_Sel", AV63TFBarAgrDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCodAgr") == 0 )
         {
            AV64TFCliCodAgr = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFCliCodAgr), 6, 0));
            AV65TFCliCodAgr_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliCodAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFCliCodAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNomAgr") == 0 )
         {
            AV68TFColNomAgr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFColNomAgr", AV68TFColNomAgr);
            AV69TFColNomAgr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFColNomAgr_Sel", AV69TFColNomAgr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNumAgr") == 0 )
         {
            AV70TFColNumAgr = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFColNumAgr), 6, 0));
            AV71TFColNumAgr_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFColNumAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFColNumAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNoCAgr") == 0 )
         {
            AV72TFColNoCAgr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFColNoCAgr", AV72TFColNoCAgr);
            AV73TFColNoCAgr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFColNoCAgr_Sel", AV73TFColNoCAgr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNuCAgr") == 0 )
         {
            AV74TFColNuCAgr = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFColNuCAgr), 6, 0));
            AV75TFColNuCAgr_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFColNuCAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFColNuCAgr_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201O92( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      sendrow_412( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
   }

   public void e151O92( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Agrupacion_WPColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111O92( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.RecetadeTinte_Agrupacion_WPFilters")),GXutil.URLEncode(GXutil.rtrim(AV122Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.RecetadeTinte_Agrupacion_WPFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Agrupacion_WPFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         recetadetinte_agrupacion_wp_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV122Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
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

   public void e161O92( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.formulaciontinte.recetadetinte_agrupacion_wpexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      recetadetinte_agrupacion_wp_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      recetadetinte_agrupacion_wp_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e171O92( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.formulaciontinte.recetadetinte_agrupacion_wpexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarAgrNhdr", "", "Nº HDR", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "KgmAgr", "", "Kilos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MtrAgr", "", "Metros", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PieAgr", "", "Piezas", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarAgrSer", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarAgrDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCodAgr", "", "Cód Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ColNomAgr", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ColNumAgr", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ColNoCAgr", "", "Color Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ColNuCAgr", "", "N° Color Cliente", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Agrupacion_WPColumnsSelector", GXv_char4) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Agrupacion_WPFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV80TFBarAgrNhdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFBarAgrNhdr", AV80TFBarAgrNhdr);
      AV81TFBarAgrNhdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFBarAgrNhdr_Sel", AV81TFBarAgrNhdr_Sel);
      AV54TFKgmAgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFKgmAgr", GXutil.ltrimstr( AV54TFKgmAgr, 9, 2));
      AV55TFKgmAgr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFKgmAgr_To", GXutil.ltrimstr( AV55TFKgmAgr_To, 9, 2));
      AV58TFMtrAgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFMtrAgr", GXutil.ltrimstr( AV58TFMtrAgr, 9, 2));
      AV59TFMtrAgr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFMtrAgr_To", GXutil.ltrimstr( AV59TFMtrAgr_To, 9, 2));
      AV56TFPieAgr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFPieAgr), 4, 0));
      AV57TFPieAgr_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFPieAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFPieAgr_To), 4, 0));
      AV60TFBarAgrSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarAgrSer", AV60TFBarAgrSer);
      AV61TFBarAgrSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarAgrSer_Sel", AV61TFBarAgrSer_Sel);
      AV62TFBarAgrDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFBarAgrDsc", AV62TFBarAgrDsc);
      AV63TFBarAgrDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarAgrDsc_Sel", AV63TFBarAgrDsc_Sel);
      AV64TFCliCodAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFCliCodAgr), 6, 0));
      AV65TFCliCodAgr_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliCodAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFCliCodAgr_To), 6, 0));
      AV68TFColNomAgr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFColNomAgr", AV68TFColNomAgr);
      AV69TFColNomAgr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFColNomAgr_Sel", AV69TFColNomAgr_Sel);
      AV70TFColNumAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFColNumAgr), 6, 0));
      AV71TFColNumAgr_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFColNumAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFColNumAgr_To), 6, 0));
      AV72TFColNoCAgr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFColNoCAgr", AV72TFColNoCAgr);
      AV73TFColNoCAgr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFColNoCAgr_Sel", AV73TFColNoCAgr_Sel);
      AV74TFColNuCAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFColNuCAgr), 6, 0));
      AV75TFColNuCAgr_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFColNuCAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFColNuCAgr_To), 6, 0));
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
      if ( GXutil.strcmp(AV22Session.getValue(AV122Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV122Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV122Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV123GXV1 = 1 ;
      while ( AV123GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV123GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR") == 0 )
         {
            AV80TFBarAgrNhdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFBarAgrNhdr", AV80TFBarAgrNhdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR_SEL") == 0 )
         {
            AV81TFBarAgrNhdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFBarAgrNhdr_Sel", AV81TFBarAgrNhdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKGMAGR") == 0 )
         {
            AV54TFKgmAgr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFKgmAgr", GXutil.ltrimstr( AV54TFKgmAgr, 9, 2));
            AV55TFKgmAgr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFKgmAgr_To", GXutil.ltrimstr( AV55TFKgmAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTRAGR") == 0 )
         {
            AV58TFMtrAgr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFMtrAgr", GXutil.ltrimstr( AV58TFMtrAgr, 9, 2));
            AV59TFMtrAgr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFMtrAgr_To", GXutil.ltrimstr( AV59TFMtrAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEAGR") == 0 )
         {
            AV56TFPieAgr = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFPieAgr), 4, 0));
            AV57TFPieAgr_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFPieAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFPieAgr_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER") == 0 )
         {
            AV60TFBarAgrSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarAgrSer", AV60TFBarAgrSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER_SEL") == 0 )
         {
            AV61TFBarAgrSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarAgrSer_Sel", AV61TFBarAgrSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC") == 0 )
         {
            AV62TFBarAgrDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFBarAgrDsc", AV62TFBarAgrDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC_SEL") == 0 )
         {
            AV63TFBarAgrDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarAgrDsc_Sel", AV63TFBarAgrDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICODAGR") == 0 )
         {
            AV64TFCliCodAgr = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFCliCodAgr), 6, 0));
            AV65TFCliCodAgr_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliCodAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFCliCodAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR") == 0 )
         {
            AV68TFColNomAgr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFColNomAgr", AV68TFColNomAgr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR_SEL") == 0 )
         {
            AV69TFColNomAgr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFColNomAgr_Sel", AV69TFColNomAgr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUMAGR") == 0 )
         {
            AV70TFColNumAgr = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFColNumAgr), 6, 0));
            AV71TFColNumAgr_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFColNumAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFColNumAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOCAGR") == 0 )
         {
            AV72TFColNoCAgr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFColNoCAgr", AV72TFColNoCAgr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOCAGR_SEL") == 0 )
         {
            AV73TFColNoCAgr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFColNoCAgr_Sel", AV73TFColNoCAgr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUCAGR") == 0 )
         {
            AV74TFColNuCAgr = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFColNuCAgr), 6, 0));
            AV75TFColNuCAgr_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFColNuCAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFColNuCAgr_To), 6, 0));
         }
         AV123GXV1 = (int)(AV123GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFBarAgrNhdr_Sel)==0), AV81TFBarAgrNhdr_Sel, GXv_char4) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFBarAgrSer_Sel)==0), AV61TFBarAgrSer_Sel, GXv_char3) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFBarAgrDsc_Sel)==0), AV63TFBarAgrDsc_Sel, GXv_char2) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFColNomAgr_Sel)==0), AV69TFColNomAgr_Sel, GXv_char15) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFColNoCAgr_Sel)==0), AV73TFColNoCAgr_Sel, GXv_char17) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||||"+GXt_char12+"|"+GXt_char13+"||"+GXt_char14+"||"+GXt_char16+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFBarAgrNhdr)==0), AV80TFBarAgrNhdr, GXv_char17) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFBarAgrSer)==0), AV60TFBarAgrSer, GXv_char15) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFBarAgrDsc)==0), AV62TFBarAgrDsc, GXv_char4) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFColNomAgr)==0), AV68TFColNomAgr, GXv_char3) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFColNoCAgr)==0), AV72TFColNoCAgr, GXv_char2) ;
      recetadetinte_agrupacion_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char16+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFKgmAgr)==0) ? "" : GXutil.str( AV54TFKgmAgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFMtrAgr)==0) ? "" : GXutil.str( AV58TFMtrAgr, 9, 2))+"|"+((0==AV56TFPieAgr) ? "" : GXutil.str( AV56TFPieAgr, 4, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+((0==AV64TFCliCodAgr) ? "" : GXutil.str( AV64TFCliCodAgr, 6, 0))+"|"+GXt_char12+"|"+((0==AV70TFColNumAgr) ? "" : GXutil.str( AV70TFColNumAgr, 6, 0))+"|"+GXt_char1+"|"+((0==AV74TFColNuCAgr) ? "" : GXutil.str( AV74TFColNuCAgr, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFKgmAgr_To)==0) ? "" : GXutil.str( AV55TFKgmAgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFMtrAgr_To)==0) ? "" : GXutil.str( AV59TFMtrAgr_To, 9, 2))+"|"+((0==AV57TFPieAgr_To) ? "" : GXutil.str( AV57TFPieAgr_To, 4, 0))+"|||"+((0==AV65TFCliCodAgr_To) ? "" : GXutil.str( AV65TFCliCodAgr_To, 6, 0))+"||"+((0==AV71TFColNumAgr_To) ? "" : GXutil.str( AV71TFColNumAgr_To, 6, 0))+"||"+((0==AV75TFColNuCAgr_To) ? "" : GXutil.str( AV75TFColNuCAgr_To, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV122Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARAGRNHDR", "", !(GXutil.strcmp("", AV80TFBarAgrNhdr)==0), (short)(0), AV80TFBarAgrNhdr, "", !(GXutil.strcmp("", AV81TFBarAgrNhdr_Sel)==0), AV81TFBarAgrNhdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFKGMAGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFKgmAgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFKgmAgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV54TFKgmAgr, 9, 2)), GXutil.trim( GXutil.str( AV55TFKgmAgr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMTRAGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFMtrAgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFMtrAgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV58TFMtrAgr, 9, 2)), GXutil.trim( GXutil.str( AV59TFMtrAgr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPIEAGR", "", !((0==AV56TFPieAgr)&&(0==AV57TFPieAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFPieAgr, 4, 0)), GXutil.trim( GXutil.str( AV57TFPieAgr_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARAGRSER", "", !(GXutil.strcmp("", AV60TFBarAgrSer)==0), (short)(0), AV60TFBarAgrSer, "", !(GXutil.strcmp("", AV61TFBarAgrSer_Sel)==0), AV61TFBarAgrSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARAGRDSC", "", !(GXutil.strcmp("", AV62TFBarAgrDsc)==0), (short)(0), AV62TFBarAgrDsc, "", !(GXutil.strcmp("", AV63TFBarAgrDsc_Sel)==0), AV63TFBarAgrDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCLICODAGR", "", !((0==AV64TFCliCodAgr)&&(0==AV65TFCliCodAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV64TFCliCodAgr, 6, 0)), GXutil.trim( GXutil.str( AV65TFCliCodAgr_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCOLNOMAGR", "", !(GXutil.strcmp("", AV68TFColNomAgr)==0), (short)(0), AV68TFColNomAgr, "", !(GXutil.strcmp("", AV69TFColNomAgr_Sel)==0), AV69TFColNomAgr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCOLNUMAGR", "", !((0==AV70TFColNumAgr)&&(0==AV71TFColNumAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV70TFColNumAgr, 6, 0)), GXutil.trim( GXutil.str( AV71TFColNumAgr_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCOLNOCAGR", "", !(GXutil.strcmp("", AV72TFColNoCAgr)==0), (short)(0), AV72TFColNoCAgr, "", !(GXutil.strcmp("", AV73TFColNoCAgr_Sel)==0), AV73TFColNoCAgr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCOLNUCAGR", "", !((0==AV74TFColNuCAgr)&&(0==AV75TFColNuCAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV74TFColNuCAgr, 6, 0)), GXutil.trim( GXutil.str( AV75TFColNuCAgr_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV122Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV122Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "BARAGR" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV87TotKgmAgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TotKgmAgr", GXutil.ltrimstr( AV87TotKgmAgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGMAGR", getSecureSignedToken( "", localUtil.format( AV87TotKgmAgr, "ZZZZZ9.99")));
      AV89TotMtrAgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TotMtrAgr", GXutil.ltrimstr( AV89TotMtrAgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMTRAGR", getSecureSignedToken( "", localUtil.format( AV89TotMtrAgr, "ZZZZZ9.99")));
      AV91TotPieAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TotPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TotPieAgr), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEAGR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV91TotPieAgr), "ZZZ9")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV15FilterFullText ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV80TFBarAgrNhdr ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV81TFBarAgrNhdr_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV54TFKgmAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV55TFKgmAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV58TFMtrAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV59TFMtrAgr_To ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV56TFPieAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV57TFPieAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV60TFBarAgrSer ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV61TFBarAgrSer_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV62TFBarAgrDsc ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV63TFBarAgrDsc_Sel ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV64TFCliCodAgr ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV65TFCliCodAgr_To ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV68TFColNomAgr ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV69TFColNomAgr_Sel ;
      AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV70TFColNumAgr ;
      AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV71TFColNumAgr_To ;
      AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV72TFColNoCAgr ;
      AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV73TFColNoCAgr_Sel ;
      AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV74TFColNuCAgr ;
      AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV75TFColNuCAgr_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                           AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                           AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                           AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                           AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                           AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                           AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                           Short.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) ,
                                           Short.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) ,
                                           AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                           AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                           AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                           AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) ,
                                           Integer.valueOf(AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) ,
                                           AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                           AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                           Integer.valueOf(AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) ,
                                           AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                           AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                           Integer.valueOf(AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr), 11, "%") ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser), 16, "%") ;
      lV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc), 26, "%") ;
      lV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr), 13, "%") ;
      lV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor H01O94 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr, AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel, AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr, AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to, AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to, Short.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr), Short.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to), lV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser, AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel, lV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc, AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel, Integer.valueOf(AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr), Integer.valueOf(AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to), lV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr, AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel, Integer.valueOf(AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr), Integer.valueOf(AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to), lV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr, AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel, Integer.valueOf(AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr), Integer.valueOf(AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to)});
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      GRID_nEOF = (byte)(0) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
      {
         A1511ColNuCAgr = H01O94_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = H01O94_A1509ColNoCAgr[0] ;
         A1512ColNumAgr = H01O94_A1512ColNumAgr[0] ;
         A1510ColNomAgr = H01O94_A1510ColNomAgr[0] ;
         A1508CliCodAgr = H01O94_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = H01O94_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = H01O94_A1245BarAgrSer[0] ;
         A671PieAgr = H01O94_A671PieAgr[0] ;
         A869MtrAgr = H01O94_A869MtrAgr[0] ;
         A590KgmAgr = H01O94_A590KgmAgr[0] ;
         A122BarAgrPar = H01O94_A122BarAgrPar[0] ;
         A124BarAgrReo = H01O94_A124BarAgrReo[0] ;
         A119BarAgrCod = H01O94_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV87TotKgmAgr = A590KgmAgr.add(AV87TotKgmAgr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TotKgmAgr", GXutil.ltrimstr( AV87TotKgmAgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGMAGR", getSecureSignedToken( "", localUtil.format( AV87TotKgmAgr, "ZZZZZ9.99")));
         AV89TotMtrAgr = A869MtrAgr.add(AV89TotMtrAgr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89TotMtrAgr", GXutil.ltrimstr( AV89TotMtrAgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMTRAGR", getSecureSignedToken( "", localUtil.format( AV89TotMtrAgr, "ZZZZZ9.99")));
         AV91TotPieAgr = (long)(A671PieAgr+AV91TotPieAgr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91TotPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TotPieAgr), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEAGR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV91TotPieAgr), "ZZZ9")));
         pr_default.readNext(2);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(2);
      AV88TotValueKgmAgr = localUtil.format( AV87TotKgmAgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TotValueKgmAgr", AV88TotValueKgmAgr);
      AV90TotValueMtrAgr = localUtil.format( AV89TotMtrAgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TotValueMtrAgr", AV90TotValueMtrAgr);
      AV92TotValuePieAgr = localUtil.format( DecimalUtil.doubleToDec(AV91TotPieAgr), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TotValuePieAgr", AV92TotValuePieAgr);
   }

   public void wb_table2_62_1O92( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluekgmagr_Internalname, httpContext.getMessage( "Tot Value Kgm Agr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluekgmagr_Internalname, AV88TotValueKgmAgr, GXutil.rtrim( localUtil.format( AV88TotValueKgmAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluekgmagr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluekgmagr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinte_Agrupacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemtragr_Internalname, httpContext.getMessage( "Tot Value Mtr Agr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemtragr_Internalname, AV90TotValueMtrAgr, GXutil.rtrim( localUtil.format( AV90TotValueMtrAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemtragr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemtragr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinte_Agrupacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluepieagr_Internalname, httpContext.getMessage( "Tot Value Pie Agr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluepieagr_Internalname, AV92TotValuePieAgr, GXutil.rtrim( localUtil.format( AV92TotValuePieAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluepieagr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluepieagr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinte_Agrupacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_62_1O92e( true) ;
      }
      else
      {
         wb_table2_62_1O92e( false) ;
      }
   }

   public void wb_table1_23_1O92( boolean wbgen )
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
         wb_table3_28_1O92( true) ;
      }
      else
      {
         wb_table3_28_1O92( false) ;
      }
      return  ;
   }

   public void wb_table3_28_1O92e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1O92e( true) ;
      }
      else
      {
         wb_table1_23_1O92e( false) ;
      }
   }

   public void wb_table3_28_1O92( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinte_Agrupacion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1O92e( true) ;
      }
      else
      {
         wb_table3_28_1O92e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      A130BarCodPar = (String)getParm(obj,3) ;
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
      pa1O92( ) ;
      ws1O92( ) ;
      we1O92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116135088", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/recetadetinte_agrupacion_wp.js", "?202682116135089", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtBarAgrNhdr_Internalname = "BARAGRNHDR_"+sGXsfl_41_idx ;
      edtKgmAgr_Internalname = "KGMAGR_"+sGXsfl_41_idx ;
      edtMtrAgr_Internalname = "MTRAGR_"+sGXsfl_41_idx ;
      edtPieAgr_Internalname = "PIEAGR_"+sGXsfl_41_idx ;
      edtBarAgrSer_Internalname = "BARAGRSER_"+sGXsfl_41_idx ;
      edtBarAgrDsc_Internalname = "BARAGRDSC_"+sGXsfl_41_idx ;
      edtCliCodAgr_Internalname = "CLICODAGR_"+sGXsfl_41_idx ;
      edtColNomAgr_Internalname = "COLNOMAGR_"+sGXsfl_41_idx ;
      edtColNumAgr_Internalname = "COLNUMAGR_"+sGXsfl_41_idx ;
      edtColNoCAgr_Internalname = "COLNOCAGR_"+sGXsfl_41_idx ;
      edtColNuCAgr_Internalname = "COLNUCAGR_"+sGXsfl_41_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_41_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_41_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_41_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_41_idx ;
      edtBarAgrCod_Internalname = "BARAGRCOD_"+sGXsfl_41_idx ;
      edtBarAgrReo_Internalname = "BARAGRREO_"+sGXsfl_41_idx ;
      edtBarAgrPar_Internalname = "BARAGRPAR_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtBarAgrNhdr_Internalname = "BARAGRNHDR_"+sGXsfl_41_fel_idx ;
      edtKgmAgr_Internalname = "KGMAGR_"+sGXsfl_41_fel_idx ;
      edtMtrAgr_Internalname = "MTRAGR_"+sGXsfl_41_fel_idx ;
      edtPieAgr_Internalname = "PIEAGR_"+sGXsfl_41_fel_idx ;
      edtBarAgrSer_Internalname = "BARAGRSER_"+sGXsfl_41_fel_idx ;
      edtBarAgrDsc_Internalname = "BARAGRDSC_"+sGXsfl_41_fel_idx ;
      edtCliCodAgr_Internalname = "CLICODAGR_"+sGXsfl_41_fel_idx ;
      edtColNomAgr_Internalname = "COLNOMAGR_"+sGXsfl_41_fel_idx ;
      edtColNumAgr_Internalname = "COLNUMAGR_"+sGXsfl_41_fel_idx ;
      edtColNoCAgr_Internalname = "COLNOCAGR_"+sGXsfl_41_fel_idx ;
      edtColNuCAgr_Internalname = "COLNUCAGR_"+sGXsfl_41_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_41_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_41_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_41_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_41_fel_idx ;
      edtBarAgrCod_Internalname = "BARAGRCOD_"+sGXsfl_41_fel_idx ;
      edtBarAgrReo_Internalname = "BARAGRREO_"+sGXsfl_41_fel_idx ;
      edtBarAgrPar_Internalname = "BARAGRPAR_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1O90( ) ;
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrNhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrNhdr_Internalname,GXutil.rtrim( A13792BarAgrNhdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrNhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrNhdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtKgmAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKgmAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A590KgmAgr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKgmAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtKgmAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMtrAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtrAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A869MtrAgr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtrAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMtrAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPieAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPieAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPieAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPieAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrSer_Internalname,GXutil.rtrim( A1245BarAgrSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrDsc_Internalname,GXutil.rtrim( A1507BarAgrDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCodAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCodAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCodAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCodAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtColNomAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNomAgr_Internalname,GXutil.rtrim( A1510ColNomAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNomAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtColNomAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtColNumAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNumAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNumAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtColNumAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtColNoCAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNoCAgr_Internalname,GXutil.rtrim( A1509ColNoCAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNoCAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtColNoCAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtColNuCAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNuCAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1511ColNuCAgr), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNuCAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtColNuCAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrReo_Internalname,GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrPar_Internalname,GXutil.rtrim( A122BarAgrPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1O92( ) ;
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
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrNhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº HDR", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCodAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtColNomAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtColNumAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtColNoCAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtColNuCAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Color Cliente", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13792BarAgrNhdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1245BarAgrSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1507BarAgrDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1509ColNoCAgr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtColNoCAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtColNuCAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR" ;
      edtKgmAgr_Internalname = "KGMAGR" ;
      edtMtrAgr_Internalname = "MTRAGR" ;
      edtPieAgr_Internalname = "PIEAGR" ;
      edtBarAgrSer_Internalname = "BARAGRSER" ;
      edtBarAgrDsc_Internalname = "BARAGRDSC" ;
      edtCliCodAgr_Internalname = "CLICODAGR" ;
      edtColNomAgr_Internalname = "COLNOMAGR" ;
      edtColNumAgr_Internalname = "COLNUMAGR" ;
      edtColNoCAgr_Internalname = "COLNOCAGR" ;
      edtColNuCAgr_Internalname = "COLNUCAGR" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarAgrCod_Internalname = "BARAGRCOD" ;
      edtBarAgrReo_Internalname = "BARAGRREO" ;
      edtBarAgrPar_Internalname = "BARAGRPAR" ;
      edtavTotvaluekgmagr_Internalname = "vTOTVALUEKGMAGR" ;
      edtavTotvaluemtragr_Internalname = "vTOTVALUEMTRAGR" ;
      edtavTotvaluepieagr_Internalname = "vTOTVALUEPIEAGR" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
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
      edtBarAgrPar_Jsonclick = "" ;
      edtBarAgrReo_Jsonclick = "" ;
      edtBarAgrCod_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtColNuCAgr_Jsonclick = "" ;
      edtColNoCAgr_Jsonclick = "" ;
      edtColNumAgr_Jsonclick = "" ;
      edtColNomAgr_Jsonclick = "" ;
      edtCliCodAgr_Jsonclick = "" ;
      edtBarAgrDsc_Jsonclick = "" ;
      edtBarAgrSer_Jsonclick = "" ;
      edtPieAgr_Jsonclick = "" ;
      edtMtrAgr_Jsonclick = "" ;
      edtKgmAgr_Jsonclick = "" ;
      edtBarAgrNhdr_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluepieagr_Jsonclick = "" ;
      edtavTotvaluepieagr_Enabled = 1 ;
      edtavTotvaluemtragr_Jsonclick = "" ;
      edtavTotvaluemtragr_Enabled = 1 ;
      edtavTotvaluekgmagr_Jsonclick = "" ;
      edtavTotvaluekgmagr_Enabled = 1 ;
      edtColNuCAgr_Visible = -1 ;
      edtColNoCAgr_Visible = -1 ;
      edtColNumAgr_Visible = -1 ;
      edtColNomAgr_Visible = -1 ;
      edtCliCodAgr_Visible = -1 ;
      edtBarAgrDsc_Visible = -1 ;
      edtBarAgrSer_Visible = -1 ;
      edtPieAgr_Visible = -1 ;
      edtMtrAgr_Visible = -1 ;
      edtKgmAgr_Visible = -1 ;
      edtBarAgrNhdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "FormulacionTinte.RecetadeTinte_Agrupacion_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||||Dynamic|Dynamic||Dynamic||Dynamic|" ;
      Ddo_grid_Includedatalist = "T||||T|T||T||T|" ;
      Ddo_grid_Filterisrange = "|T|T|T|||T||T||T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric|Character|Character|Numeric|Character|Numeric|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "0:BarAgrNhdr|1:KgmAgr|2:MtrAgr|3:PieAgr|4:BarAgrSer|5:BarAgrDsc|6:CliCodAgr|7:ColNomAgr|8:ColNumAgr|9:ColNoCAgr|10:ColNuCAgr" ;
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
      Form.setCaption( httpContext.getMessage( "Detalle de HDRs Agrupadas para Tinte", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarAgrNhdr_Visible',ctrl:'BARAGRNHDR',prop:'Visible'},{av:'edtKgmAgr_Visible',ctrl:'KGMAGR',prop:'Visible'},{av:'edtMtrAgr_Visible',ctrl:'MTRAGR',prop:'Visible'},{av:'edtPieAgr_Visible',ctrl:'PIEAGR',prop:'Visible'},{av:'edtBarAgrSer_Visible',ctrl:'BARAGRSER',prop:'Visible'},{av:'edtBarAgrDsc_Visible',ctrl:'BARAGRDSC',prop:'Visible'},{av:'edtCliCodAgr_Visible',ctrl:'CLICODAGR',prop:'Visible'},{av:'edtColNomAgr_Visible',ctrl:'COLNOMAGR',prop:'Visible'},{av:'edtColNumAgr_Visible',ctrl:'COLNUMAGR',prop:'Visible'},{av:'edtColNoCAgr_Visible',ctrl:'COLNOCAGR',prop:'Visible'},{av:'edtColNuCAgr_Visible',ctrl:'COLNUCAGR',prop:'Visible'},{av:'AV84GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV85GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV88TotValueKgmAgr',fld:'vTOTVALUEKGMAGR',pic:''},{av:'AV90TotValueMtrAgr',fld:'vTOTVALUEMTRAGR',pic:''},{av:'AV92TotValuePieAgr',fld:'vTOTVALUEPIEAGR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121O92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131O92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141O92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201O92',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151O92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarAgrNhdr_Visible',ctrl:'BARAGRNHDR',prop:'Visible'},{av:'edtKgmAgr_Visible',ctrl:'KGMAGR',prop:'Visible'},{av:'edtMtrAgr_Visible',ctrl:'MTRAGR',prop:'Visible'},{av:'edtPieAgr_Visible',ctrl:'PIEAGR',prop:'Visible'},{av:'edtBarAgrSer_Visible',ctrl:'BARAGRSER',prop:'Visible'},{av:'edtBarAgrDsc_Visible',ctrl:'BARAGRDSC',prop:'Visible'},{av:'edtCliCodAgr_Visible',ctrl:'CLICODAGR',prop:'Visible'},{av:'edtColNomAgr_Visible',ctrl:'COLNOMAGR',prop:'Visible'},{av:'edtColNumAgr_Visible',ctrl:'COLNUMAGR',prop:'Visible'},{av:'edtColNoCAgr_Visible',ctrl:'COLNOCAGR',prop:'Visible'},{av:'edtColNuCAgr_Visible',ctrl:'COLNUCAGR',prop:'Visible'},{av:'AV84GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV85GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV88TotValueKgmAgr',fld:'vTOTVALUEKGMAGR',pic:''},{av:'AV90TotValueMtrAgr',fld:'vTOTVALUEMTRAGR',pic:''},{av:'AV92TotValuePieAgr',fld:'vTOTVALUEPIEAGR',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111O92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarAgrNhdr_Visible',ctrl:'BARAGRNHDR',prop:'Visible'},{av:'edtKgmAgr_Visible',ctrl:'KGMAGR',prop:'Visible'},{av:'edtMtrAgr_Visible',ctrl:'MTRAGR',prop:'Visible'},{av:'edtPieAgr_Visible',ctrl:'PIEAGR',prop:'Visible'},{av:'edtBarAgrSer_Visible',ctrl:'BARAGRSER',prop:'Visible'},{av:'edtBarAgrDsc_Visible',ctrl:'BARAGRDSC',prop:'Visible'},{av:'edtCliCodAgr_Visible',ctrl:'CLICODAGR',prop:'Visible'},{av:'edtColNomAgr_Visible',ctrl:'COLNOMAGR',prop:'Visible'},{av:'edtColNumAgr_Visible',ctrl:'COLNUMAGR',prop:'Visible'},{av:'edtColNoCAgr_Visible',ctrl:'COLNOCAGR',prop:'Visible'},{av:'edtColNuCAgr_Visible',ctrl:'COLNUCAGR',prop:'Visible'},{av:'AV84GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV85GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV88TotValueKgmAgr',fld:'vTOTVALUEKGMAGR',pic:''},{av:'AV90TotValueMtrAgr',fld:'vTOTVALUEMTRAGR',pic:''},{av:'AV92TotValuePieAgr',fld:'vTOTVALUEPIEAGR',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161O92',iparms:[{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171O92',iparms:[{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV80TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV81TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV54TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV55TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV58TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV59TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV57TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV60TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV61TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV62TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV63TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV64TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV65TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV68TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV69TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV70TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV71TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV72TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV73TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV74TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV75TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV87TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV91TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
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
      A130BarCodPar = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV80TFBarAgrNhdr = "" ;
      AV81TFBarAgrNhdr_Sel = "" ;
      AV54TFKgmAgr = DecimalUtil.ZERO ;
      AV55TFKgmAgr_To = DecimalUtil.ZERO ;
      AV58TFMtrAgr = DecimalUtil.ZERO ;
      AV59TFMtrAgr_To = DecimalUtil.ZERO ;
      AV60TFBarAgrSer = "" ;
      AV61TFBarAgrSer_Sel = "" ;
      AV62TFBarAgrDsc = "" ;
      AV63TFBarAgrDsc_Sel = "" ;
      AV68TFColNomAgr = "" ;
      AV69TFColNomAgr_Sel = "" ;
      AV72TFColNoCAgr = "" ;
      AV73TFColNoCAgr_Sel = "" ;
      AV122Pgmname = "" ;
      AV87TotKgmAgr = DecimalUtil.ZERO ;
      AV89TotMtrAgr = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
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
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13792BarAgrNhdr = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A1509ColNoCAgr = "" ;
      A122BarAgrPar = "" ;
      scmdbuf = "" ;
      lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = "" ;
      lV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = "" ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = "" ;
      lV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = "" ;
      lV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = "" ;
      lV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = "" ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = "" ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = "" ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = "" ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = DecimalUtil.ZERO ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = DecimalUtil.ZERO ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = DecimalUtil.ZERO ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = DecimalUtil.ZERO ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = "" ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = "" ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = "" ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = "" ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = "" ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = "" ;
      AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = "" ;
      AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = "" ;
      H01O92_A396EmprCod = new String[] {""} ;
      H01O92_A129BarCod = new int[1] ;
      H01O92_A132BarCodReo = new byte[1] ;
      H01O92_A130BarCodPar = new String[] {""} ;
      H01O92_A1511ColNuCAgr = new int[1] ;
      H01O92_A1509ColNoCAgr = new String[] {""} ;
      H01O92_A1512ColNumAgr = new int[1] ;
      H01O92_A1510ColNomAgr = new String[] {""} ;
      H01O92_A1508CliCodAgr = new int[1] ;
      H01O92_A1507BarAgrDsc = new String[] {""} ;
      H01O92_A1245BarAgrSer = new String[] {""} ;
      H01O92_A671PieAgr = new short[1] ;
      H01O92_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01O92_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01O92_A122BarAgrPar = new String[] {""} ;
      H01O92_A124BarAgrReo = new byte[1] ;
      H01O92_A119BarAgrCod = new int[1] ;
      H01O93_AGRID_nRecordCount = new long[1] ;
      AV88TotValueKgmAgr = "" ;
      AV90TotValueMtrAgr = "" ;
      AV92TotValuePieAgr = "" ;
      AV95Station = "" ;
      AV96Emprcod = "" ;
      AV97Emprnom = "" ;
      AV98Usurcod = "" ;
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
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      H01O94_A396EmprCod = new String[] {""} ;
      H01O94_A129BarCod = new int[1] ;
      H01O94_A132BarCodReo = new byte[1] ;
      H01O94_A130BarCodPar = new String[] {""} ;
      H01O94_A1511ColNuCAgr = new int[1] ;
      H01O94_A1509ColNoCAgr = new String[] {""} ;
      H01O94_A1512ColNumAgr = new int[1] ;
      H01O94_A1510ColNomAgr = new String[] {""} ;
      H01O94_A1508CliCodAgr = new int[1] ;
      H01O94_A1507BarAgrDsc = new String[] {""} ;
      H01O94_A1245BarAgrSer = new String[] {""} ;
      H01O94_A671PieAgr = new short[1] ;
      H01O94_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01O94_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01O94_A122BarAgrPar = new String[] {""} ;
      H01O94_A124BarAgrReo = new byte[1] ;
      H01O94_A119BarAgrCod = new int[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_agrupacion_wp__default(),
         new Object[] {
             new Object[] {
            H01O92_A396EmprCod, H01O92_A129BarCod, H01O92_A132BarCodReo, H01O92_A130BarCodPar, H01O92_A1511ColNuCAgr, H01O92_A1509ColNoCAgr, H01O92_A1512ColNumAgr, H01O92_A1510ColNomAgr, H01O92_A1508CliCodAgr, H01O92_A1507BarAgrDsc,
            H01O92_A1245BarAgrSer, H01O92_A671PieAgr, H01O92_A869MtrAgr, H01O92_A590KgmAgr, H01O92_A122BarAgrPar, H01O92_A124BarAgrReo, H01O92_A119BarAgrCod
            }
            , new Object[] {
            H01O93_AGRID_nRecordCount
            }
            , new Object[] {
            H01O94_A396EmprCod, H01O94_A129BarCod, H01O94_A132BarCodReo, H01O94_A130BarCodPar, H01O94_A1511ColNuCAgr, H01O94_A1509ColNoCAgr, H01O94_A1512ColNumAgr, H01O94_A1510ColNomAgr, H01O94_A1508CliCodAgr, H01O94_A1507BarAgrDsc,
            H01O94_A1245BarAgrSer, H01O94_A671PieAgr, H01O94_A869MtrAgr, H01O94_A590KgmAgr, H01O94_A122BarAgrPar, H01O94_A124BarAgrReo, H01O94_A119BarAgrCod
            }
         }
      );
      AV122Pgmname = "FormulacionTinte.RecetadeTinte_Agrupacion_WP" ;
      /* GeneXus formulas. */
      AV122Pgmname = "FormulacionTinte.RecetadeTinte_Agrupacion_WP" ;
      Gx_err = (short)(0) ;
      edtavTotvaluekgmagr_Enabled = 0 ;
      edtavTotvaluemtragr_Enabled = 0 ;
      edtavTotvaluepieagr_Enabled = 0 ;
   }

   private byte wcpOA132BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A124BarAgrReo ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV56TFPieAgr ;
   private short AV57TFPieAgr_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A671PieAgr ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ;
   private short AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ;
   private int wcpOA129BarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int A129BarCod ;
   private int nGXsfl_41_idx=1 ;
   private int AV64TFCliCodAgr ;
   private int AV65TFCliCodAgr_To ;
   private int AV70TFColNumAgr ;
   private int AV71TFColNumAgr_To ;
   private int AV74TFColNuCAgr ;
   private int AV75TFColNuCAgr_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int A1511ColNuCAgr ;
   private int A119BarAgrCod ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluekgmagr_Enabled ;
   private int edtavTotvaluemtragr_Enabled ;
   private int edtavTotvaluepieagr_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ;
   private int AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ;
   private int AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ;
   private int AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ;
   private int AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ;
   private int AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ;
   private int edtBarAgrNhdr_Visible ;
   private int edtKgmAgr_Visible ;
   private int edtMtrAgr_Visible ;
   private int edtPieAgr_Visible ;
   private int edtBarAgrSer_Visible ;
   private int edtBarAgrDsc_Visible ;
   private int edtCliCodAgr_Visible ;
   private int edtColNomAgr_Visible ;
   private int edtColNumAgr_Visible ;
   private int edtColNoCAgr_Visible ;
   private int edtColNuCAgr_Visible ;
   private int AV83PageToGo ;
   private int AV123GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV91TotPieAgr ;
   private long AV84GridCurrentPage ;
   private long AV85GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV54TFKgmAgr ;
   private java.math.BigDecimal AV55TFKgmAgr_To ;
   private java.math.BigDecimal AV58TFMtrAgr ;
   private java.math.BigDecimal AV59TFMtrAgr_To ;
   private java.math.BigDecimal AV87TotKgmAgr ;
   private java.math.BigDecimal AV89TotMtrAgr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ;
   private java.math.BigDecimal AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ;
   private java.math.BigDecimal AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ;
   private java.math.BigDecimal AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
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
   private String A130BarCodPar ;
   private String sGXsfl_41_idx="0001" ;
   private String AV80TFBarAgrNhdr ;
   private String AV81TFBarAgrNhdr_Sel ;
   private String AV60TFBarAgrSer ;
   private String AV61TFBarAgrSer_Sel ;
   private String AV62TFBarAgrDsc ;
   private String AV63TFBarAgrDsc_Sel ;
   private String AV68TFColNomAgr ;
   private String AV69TFColNomAgr_Sel ;
   private String AV72TFColNoCAgr ;
   private String AV73TFColNoCAgr_Sel ;
   private String AV122Pgmname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13792BarAgrNhdr ;
   private String edtBarAgrNhdr_Internalname ;
   private String edtKgmAgr_Internalname ;
   private String edtMtrAgr_Internalname ;
   private String edtPieAgr_Internalname ;
   private String A1245BarAgrSer ;
   private String edtBarAgrSer_Internalname ;
   private String A1507BarAgrDsc ;
   private String edtBarAgrDsc_Internalname ;
   private String edtCliCodAgr_Internalname ;
   private String A1510ColNomAgr ;
   private String edtColNomAgr_Internalname ;
   private String edtColNumAgr_Internalname ;
   private String A1509ColNoCAgr ;
   private String edtColNoCAgr_Internalname ;
   private String edtColNuCAgr_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarAgrCod_Internalname ;
   private String edtBarAgrReo_Internalname ;
   private String A122BarAgrPar ;
   private String edtBarAgrPar_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavTotvaluekgmagr_Internalname ;
   private String edtavTotvaluemtragr_Internalname ;
   private String edtavTotvaluepieagr_Internalname ;
   private String scmdbuf ;
   private String lV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ;
   private String lV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ;
   private String lV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ;
   private String lV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ;
   private String lV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ;
   private String AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ;
   private String AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ;
   private String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ;
   private String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ;
   private String AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ;
   private String AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ;
   private String AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ;
   private String AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ;
   private String AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ;
   private String AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ;
   private String AV95Station ;
   private String AV96Emprcod ;
   private String AV97Emprnom ;
   private String AV98Usurcod ;
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
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluekgmagr_Jsonclick ;
   private String edtavTotvaluemtragr_Jsonclick ;
   private String edtavTotvaluepieagr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarAgrNhdr_Jsonclick ;
   private String edtKgmAgr_Jsonclick ;
   private String edtMtrAgr_Jsonclick ;
   private String edtPieAgr_Jsonclick ;
   private String edtBarAgrSer_Jsonclick ;
   private String edtBarAgrDsc_Jsonclick ;
   private String edtCliCodAgr_Jsonclick ;
   private String edtColNomAgr_Jsonclick ;
   private String edtColNumAgr_Jsonclick ;
   private String edtColNoCAgr_Jsonclick ;
   private String edtColNuCAgr_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarAgrCod_Jsonclick ;
   private String edtBarAgrReo_Jsonclick ;
   private String edtBarAgrPar_Jsonclick ;
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
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ;
   private String AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ;
   private String AV88TotValueKgmAgr ;
   private String AV90TotValueMtrAgr ;
   private String AV92TotValuePieAgr ;
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
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01O92_A396EmprCod ;
   private int[] H01O92_A129BarCod ;
   private byte[] H01O92_A132BarCodReo ;
   private String[] H01O92_A130BarCodPar ;
   private int[] H01O92_A1511ColNuCAgr ;
   private String[] H01O92_A1509ColNoCAgr ;
   private int[] H01O92_A1512ColNumAgr ;
   private String[] H01O92_A1510ColNomAgr ;
   private int[] H01O92_A1508CliCodAgr ;
   private String[] H01O92_A1507BarAgrDsc ;
   private String[] H01O92_A1245BarAgrSer ;
   private short[] H01O92_A671PieAgr ;
   private java.math.BigDecimal[] H01O92_A869MtrAgr ;
   private java.math.BigDecimal[] H01O92_A590KgmAgr ;
   private String[] H01O92_A122BarAgrPar ;
   private byte[] H01O92_A124BarAgrReo ;
   private int[] H01O92_A119BarAgrCod ;
   private long[] H01O93_AGRID_nRecordCount ;
   private String[] H01O94_A396EmprCod ;
   private int[] H01O94_A129BarCod ;
   private byte[] H01O94_A132BarCodReo ;
   private String[] H01O94_A130BarCodPar ;
   private int[] H01O94_A1511ColNuCAgr ;
   private String[] H01O94_A1509ColNoCAgr ;
   private int[] H01O94_A1512ColNumAgr ;
   private String[] H01O94_A1510ColNomAgr ;
   private int[] H01O94_A1508CliCodAgr ;
   private String[] H01O94_A1507BarAgrDsc ;
   private String[] H01O94_A1245BarAgrSer ;
   private short[] H01O94_A671PieAgr ;
   private java.math.BigDecimal[] H01O94_A869MtrAgr ;
   private java.math.BigDecimal[] H01O94_A590KgmAgr ;
   private String[] H01O94_A122BarAgrPar ;
   private byte[] H01O94_A124BarAgrReo ;
   private int[] H01O94_A119BarAgrCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV82DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class recetadetinte_agrupacion_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01O92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                          String AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                          String AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                          java.math.BigDecimal AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                          java.math.BigDecimal AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                          short AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ,
                                          short AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ,
                                          String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                          String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                          String AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                          String AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                          int AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ,
                                          int AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ,
                                          String AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                          String AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                          int AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ,
                                          int AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ,
                                          String AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                          String AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                          int AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ,
                                          int AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[42];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, BarCod, BarCodReo, BarCodPar, ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrDsc, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo," ;
      sSelectString += " BarAgrCod" ;
      sFromString = " FROM TXPBARAGR" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
         GXv_int19[9] = (byte)(1) ;
         GXv_int19[10] = (byte)(1) ;
         GXv_int19[11] = (byte)(1) ;
         GXv_int19[12] = (byte)(1) ;
         GXv_int19[13] = (byte)(1) ;
         GXv_int19[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (0==AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (0==AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY KgmAgr" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY KgmAgr DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MtrAgr" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MtrAgr DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY PieAgr" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY PieAgr DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY BarAgrSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY BarAgrSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY BarAgrDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY BarAgrDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CliCodAgr" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CliCodAgr DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY ColNomAgr" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNomAgr DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY ColNumAgr" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNumAgr DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY ColNoCAgr" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNoCAgr DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY ColNuCAgr" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNuCAgr DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H01O93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                          String AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                          String AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                          java.math.BigDecimal AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                          java.math.BigDecimal AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                          short AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ,
                                          short AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ,
                                          String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                          String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                          String AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                          String AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                          int AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ,
                                          int AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ,
                                          String AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                          String AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                          int AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ,
                                          int AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ,
                                          String AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                          String AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                          int AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ,
                                          int AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[37];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
         GXv_int21[5] = (byte)(1) ;
         GXv_int21[6] = (byte)(1) ;
         GXv_int21[7] = (byte)(1) ;
         GXv_int21[8] = (byte)(1) ;
         GXv_int21[9] = (byte)(1) ;
         GXv_int21[10] = (byte)(1) ;
         GXv_int21[11] = (byte)(1) ;
         GXv_int21[12] = (byte)(1) ;
         GXv_int21[13] = (byte)(1) ;
         GXv_int21[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (0==AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (0==AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H01O94( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                          String AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                          String AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                          java.math.BigDecimal AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                          java.math.BigDecimal AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                          short AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ,
                                          short AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ,
                                          String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                          String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                          String AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                          String AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                          int AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ,
                                          int AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ,
                                          String AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                          String AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                          int AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ,
                                          int AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ,
                                          String AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                          String AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                          int AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ,
                                          int AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[37];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrDsc, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo," ;
      scmdbuf += " BarAgrCod FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
         GXv_int23[5] = (byte)(1) ;
         GXv_int23[6] = (byte)(1) ;
         GXv_int23[7] = (byte)(1) ;
         GXv_int23[8] = (byte)(1) ;
         GXv_int23[9] = (byte)(1) ;
         GXv_int23[10] = (byte)(1) ;
         GXv_int23[11] = (byte)(1) ;
         GXv_int23[12] = (byte)(1) ;
         GXv_int23[13] = (byte)(1) ;
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (0==AV112Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (0==AV113Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV118Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_H01O92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] );
            case 1 :
                  return conditional_H01O93(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] );
            case 2 :
                  return conditional_H01O94(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01O92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01O93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01O94", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
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
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
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
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 11);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 11);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 11);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
      }
   }

}

