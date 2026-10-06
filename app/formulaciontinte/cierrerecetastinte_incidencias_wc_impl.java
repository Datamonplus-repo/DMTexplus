package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_incidencias_wc_impl extends GXDataArea
{
   public cierrerecetastinte_incidencias_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cierrerecetastinte_incidencias_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_incidencias_wc_impl.class ));
   }

   public cierrerecetastinte_incidencias_wc_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
            AV5emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6barcod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6barcod), "ZZZZZZZ9")));
               AV7barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7barcodreo", GXutil.str( AV7barcodreo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7barcodreo), "9")));
               AV8barcodpar = httpContext.GetPar( "barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8barcodpar", AV8barcodpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8barcodpar, ""))));
               AV9reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "reclinmaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9reclinmaq), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9reclinmaq), "ZZZ9")));
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
      AV25FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5emprcod = httpContext.GetPar( "emprcod") ;
      AV6barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
      AV7barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
      AV8barcodpar = httpContext.GetPar( "barcodpar") ;
      AV9reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "reclinmaq"))) ;
      AV35ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV30ColumnsSelector);
      AV58TFRecPrdNum = httpContext.GetPar( "TFRecPrdNum") ;
      AV59TFRecPrdNum_Sel = httpContext.GetPar( "TFRecPrdNum_Sel") ;
      AV60TFRecPrdDsc = httpContext.GetPar( "TFRecPrdDsc") ;
      AV61TFRecPrdDsc_Sel = httpContext.GetPar( "TFRecPrdDsc_Sel") ;
      AV62TFFacCon = CommonUtil.decimalVal( httpContext.GetPar( "TFFacCon"), ".") ;
      AV63TFFacCon_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacCon_To"), ".") ;
      AV64TFPrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm"), ".") ;
      AV65TFPrdExiAlm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm_To"), ".") ;
      AV66TFPrdExiCC = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiCC"), ".") ;
      AV67TFPrdExiCC_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiCC_To"), ".") ;
      AV68TFPrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes"), ".") ;
      AV69TFPrdCanRes_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes_To"), ".") ;
      AV70TFRecLote = httpContext.GetPar( "TFRecLote") ;
      AV71TFRecLote_Sel = httpContext.GetPar( "TFRecLote_Sel") ;
      AV46TFRecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro"))) ;
      AV47TFRecLinPro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro_To"))) ;
      AV56TFRecLin = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin"))) ;
      AV57TFRecLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin_To"))) ;
      AV75Pgmname = httpContext.GetPar( "Pgmname") ;
      AV22OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV23OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV14todosproductos = (short)(GXutil.lval( httpContext.GetPar( "todosproductos"))) ;
      AV13consumos = (short)(GXutil.lval( httpContext.GetPar( "consumos"))) ;
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = httpContext.GetPar( "Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod") ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod"))) ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo"))) ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = httpContext.GetPar( "Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar") ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV5emprcod, AV6barcod, AV7barcodreo, AV8barcodpar, AV9reclinmaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV58TFRecPrdNum, AV59TFRecPrdNum_Sel, AV60TFRecPrdDsc, AV61TFRecPrdDsc_Sel, AV62TFFacCon, AV63TFFacCon_To, AV64TFPrdExiAlm, AV65TFPrdExiAlm_To, AV66TFPrdExiCC, AV67TFPrdExiCC_To, AV68TFPrdCanRes, AV69TFPrdCanRes_To, AV70TFRecLote, AV71TFRecLote_Sel, AV46TFRecLinPro, AV47TFRecLinPro_To, AV56TFRecLin, AV57TFRecLin_To, AV75Pgmname, AV22OrderedBy, AV23OrderedDsc, AV14todosproductos, AV13consumos, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) ;
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
      pa1LO2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1LO2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.cierrerecetastinte_incidencias_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV9reclinmaq,4,0))}, new String[] {"emprcod","barcod","barcodreo","barcodpar","reclinmaq"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9reclinmaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODOSPRODUCTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14todosproductos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13consumos), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CierreRecetasTinte_Incidencias_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\cierrerecetastinte_incidencias_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV25FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV33ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV33ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV50GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV51GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV30ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV30ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV35ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV9reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9reclinmaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDNUM", GXutil.rtrim( AV58TFRecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDNUM_SEL", GXutil.rtrim( AV59TFRecPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDDSC", GXutil.rtrim( AV60TFRecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDDSC_SEL", GXutil.rtrim( AV61TFRecPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCON", GXutil.ltrim( localUtil.ntoc( AV62TFFacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCON_TO", GXutil.ltrim( localUtil.ntoc( AV63TFFacCon_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXIALM", GXutil.ltrim( localUtil.ntoc( AV64TFPrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXIALM_TO", GXutil.ltrim( localUtil.ntoc( AV65TFPrdExiAlm_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXICC", GXutil.ltrim( localUtil.ntoc( AV66TFPrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXICC_TO", GXutil.ltrim( localUtil.ntoc( AV67TFPrdExiCC_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANRES", GXutil.ltrim( localUtil.ntoc( AV68TFPrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANRES_TO", GXutil.ltrim( localUtil.ntoc( AV69TFPrdCanRes_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLOTE", GXutil.rtrim( AV70TFRecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLOTE_SEL", GXutil.rtrim( AV71TFRecLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINPRO", GXutil.ltrim( localUtil.ntoc( AV46TFRecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINPRO_TO", GXutil.ltrim( localUtil.ntoc( AV47TFRecLinPro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLIN", GXutil.ltrim( localUtil.ntoc( AV56TFRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLIN_TO", GXutil.ltrim( localUtil.ntoc( AV57TFRecLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV22OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV23OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTODOSPRODUCTOS", GXutil.ltrim( localUtil.ntoc( AV14todosproductos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODOSPRODUCTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14todosproductos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANT", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANANY", GXutil.ltrim( localUtil.ntoc( A1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV13consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13consumos), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV20GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV20GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_1_EMPRCOD", GXutil.rtrim( AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_4_BARCODPAR", GXutil.rtrim( AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_5_RECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we1LO2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1LO2( ) ;
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
      return formatLink("app.formulaciontinte.cierrerecetastinte_incidencias_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV9reclinmaq,4,0))}, new String[] {"emprcod","barcod","barcodreo","barcodpar","reclinmaq"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.CierreRecetasTinte_Incidencias_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle de Productos quimicos en Receta", "") ;
   }

   public void wb1LO0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CierreRecetasTinte_Incidencias_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CierreRecetasTinte_Incidencias_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CierreRecetasTinte_Incidencias_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1LO2( true) ;
      }
      else
      {
         wb_table1_23_1LO2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1LO2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV50GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV51GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV75Pgmname), GXutil.rtrim( localUtil.format( AV75Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\CierreRecetasTinte_Incidencias_WC.htm");
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV30ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
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

   public void start1LO2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Detalle de Productos quimicos en Receta", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1LO0( ) ;
   }

   public void ws1LO2( )
   {
      start1LO2( ) ;
      evt1LO2( ) ;
   }

   public void evt1LO2( )
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
                           e111LO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121LO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131LO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141LO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151LO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e161LO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e171LO2 ();
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
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
                           A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
                           A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
                           AV54PrdCant = localUtil.ctond( httpContext.cgiGet( edtavPrdcant_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPrdcant_Internalname, GXutil.ltrimstr( AV54PrdCant, 11, 3));
                           AV55ForPrdDsc = httpContext.cgiGet( edtavForprddsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavForprddsc_Internalname, AV55ForPrdDsc);
                           Gx_err = (short)(localUtil.ctol( httpContext.cgiGet( edtavErr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavErr_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(Gx_err), 3, 0));
                           A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
                           A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
                           A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
                           A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
                           A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e181LO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e191LO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e201LO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV25FilterFullText) != 0 )
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

   public void we1LO2( )
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

   public void pa1LO2( )
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
                                 String AV25FilterFullText ,
                                 String AV5emprcod ,
                                 int AV6barcod ,
                                 byte AV7barcodreo ,
                                 String AV8barcodpar ,
                                 short AV9reclinmaq ,
                                 byte AV35ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelector ,
                                 String AV58TFRecPrdNum ,
                                 String AV59TFRecPrdNum_Sel ,
                                 String AV60TFRecPrdDsc ,
                                 String AV61TFRecPrdDsc_Sel ,
                                 java.math.BigDecimal AV62TFFacCon ,
                                 java.math.BigDecimal AV63TFFacCon_To ,
                                 java.math.BigDecimal AV64TFPrdExiAlm ,
                                 java.math.BigDecimal AV65TFPrdExiAlm_To ,
                                 java.math.BigDecimal AV66TFPrdExiCC ,
                                 java.math.BigDecimal AV67TFPrdExiCC_To ,
                                 java.math.BigDecimal AV68TFPrdCanRes ,
                                 java.math.BigDecimal AV69TFPrdCanRes_To ,
                                 String AV70TFRecLote ,
                                 String AV71TFRecLote_Sel ,
                                 byte AV46TFRecLinPro ,
                                 byte AV47TFRecLinPro_To ,
                                 short AV56TFRecLin ,
                                 short AV57TFRecLin_To ,
                                 String AV75Pgmname ,
                                 short AV22OrderedBy ,
                                 boolean AV23OrderedDsc ,
                                 short AV14todosproductos ,
                                 short AV13consumos ,
                                 String AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                 int AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ,
                                 byte AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ,
                                 String AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                 short AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191LO2 ();
      GRID_nCurrentRecord = 0 ;
      rf1LO2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CierreRecetasTinte_Incidencias_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\cierrerecetastinte_incidencias_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1LO2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV75Pgmname = "FormulacionTinte.CierreRecetasTinte_Incidencias_WC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
      Gx_err = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavErr_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(Gx_err), 3, 0));
      edtavPrdcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcant_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavErr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1LO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191LO2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
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
         subsflControlProps_412( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                              AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                              AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                              AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                              AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                              AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                              AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                              AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                              AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                              AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                              AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                              AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                              AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                              AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                              AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                              Byte.valueOf(AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) ,
                                              Byte.valueOf(AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) ,
                                              Short.valueOf(AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) ,
                                              Short.valueOf(AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) ,
                                              A872RecPrdNum ,
                                              A875RecPrdDsc ,
                                              A431FacCon ,
                                              A704PrdExiAlm ,
                                              A705PrdExiCC ,
                                              A685PrdCanRes ,
                                              A5725RecLote ,
                                              Byte.valueOf(A1273RecLinPro) ,
                                              Short.valueOf(A811RecLin) ,
                                              Short.valueOf(AV22OrderedBy) ,
                                              Boolean.valueOf(AV23OrderedDsc) ,
                                              A396EmprCod ,
                                              AV5emprcod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV6barcod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV7barcodreo) ,
                                              A130BarCodPar ,
                                              AV8barcodpar ,
                                              Short.valueOf(A2804RecLinMaq) ,
                                              Short.valueOf(AV9reclinmaq) ,
                                              AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                              Integer.valueOf(AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod) ,
                                              Byte.valueOf(AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo) ,
                                              AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                              Short.valueOf(AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                              }
         });
         lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
         lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
         lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
         lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
         lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
         lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
         lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
         lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
         lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
         lV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum), 6, "%") ;
         lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc), 26, "%") ;
         lV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote), 26, "%") ;
         /* Using cursor H01LO2 */
         pr_default.execute(0, new Object[] {AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, Integer.valueOf(AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod), Byte.valueOf(AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo), AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, Short.valueOf(AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq), AV5emprcod, Integer.valueOf(AV6barcod), Byte.valueOf(AV7barcodreo), AV8barcodpar, Short.valueOf(AV9reclinmaq), lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum, AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel, lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc, AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel, AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon, AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to, AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm, AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to, AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc, AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to, AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres, AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to, lV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote, AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel, Byte.valueOf(AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro), Byte.valueOf(AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to), Short.valueOf(AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin), Short.valueOf(AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A719PrdNum = H01LO2_A719PrdNum[0] ;
            n719PrdNum = H01LO2_n719PrdNum[0] ;
            A686PrdCant = H01LO2_A686PrdCant[0] ;
            A490ForPrdUMe = H01LO2_A490ForPrdUMe[0] ;
            n490ForPrdUMe = H01LO2_n490ForPrdUMe[0] ;
            A488ForPrdDsc = H01LO2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01LO2_n488ForPrdDsc[0] ;
            A707PrdFacCon = H01LO2_A707PrdFacCon[0] ;
            A1797PrdCanAny = H01LO2_A1797PrdCanAny[0] ;
            A811RecLin = H01LO2_A811RecLin[0] ;
            A1273RecLinPro = H01LO2_A1273RecLinPro[0] ;
            A5725RecLote = H01LO2_A5725RecLote[0] ;
            A685PrdCanRes = H01LO2_A685PrdCanRes[0] ;
            A705PrdExiCC = H01LO2_A705PrdExiCC[0] ;
            A704PrdExiAlm = H01LO2_A704PrdExiAlm[0] ;
            A431FacCon = H01LO2_A431FacCon[0] ;
            A875RecPrdDsc = H01LO2_A875RecPrdDsc[0] ;
            A872RecPrdNum = H01LO2_A872RecPrdNum[0] ;
            A2804RecLinMaq = H01LO2_A2804RecLinMaq[0] ;
            A130BarCodPar = H01LO2_A130BarCodPar[0] ;
            A132BarCodReo = H01LO2_A132BarCodReo[0] ;
            A129BarCod = H01LO2_A129BarCod[0] ;
            A396EmprCod = H01LO2_A396EmprCod[0] ;
            A707PrdFacCon = H01LO2_A707PrdFacCon[0] ;
            A685PrdCanRes = H01LO2_A685PrdCanRes[0] ;
            A705PrdExiCC = H01LO2_A705PrdExiCC[0] ;
            A704PrdExiAlm = H01LO2_A704PrdExiAlm[0] ;
            A488ForPrdDsc = H01LO2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01LO2_n488ForPrdDsc[0] ;
            e201LO2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb1LO0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1LO2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV9reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9reclinmaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODOSPRODUCTOS", GXutil.ltrim( localUtil.ntoc( AV14todosproductos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODOSPRODUCTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14todosproductos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV13consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13consumos), "ZZZ9")));
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
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV5emprcod ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV6barcod ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV7barcodreo ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV8barcodpar ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV9reclinmaq ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV25FilterFullText ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV58TFRecPrdNum ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV59TFRecPrdNum_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV60TFRecPrdDsc ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV61TFRecPrdDsc_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV62TFFacCon ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV63TFFacCon_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV64TFPrdExiAlm ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV65TFPrdExiAlm_To ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV66TFPrdExiCC ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV67TFPrdExiCC_To ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV68TFPrdCanRes ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV69TFPrdCanRes_To ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV70TFRecLote ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV71TFRecLote_Sel ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV46TFRecLinPro ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV47TFRecLinPro_To ;
      AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV56TFRecLin ;
      AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV57TFRecLin_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                           AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                           AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                           AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                           AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                           AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                           AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                           AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                           AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                           AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                           AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                           AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                           AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                           AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                           AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                           Byte.valueOf(AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) ,
                                           Byte.valueOf(AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) ,
                                           Short.valueOf(AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) ,
                                           Short.valueOf(AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           Short.valueOf(AV22OrderedBy) ,
                                           Boolean.valueOf(AV23OrderedDsc) ,
                                           A396EmprCod ,
                                           AV5emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV6barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV7barcodreo) ,
                                           A130BarCodPar ,
                                           AV8barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV9reclinmaq) ,
                                           AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo) ,
                                           AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum), 6, "%") ;
      lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc), 26, "%") ;
      lV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote), 26, "%") ;
      /* Using cursor H01LO3 */
      pr_default.execute(1, new Object[] {AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, Integer.valueOf(AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod), Byte.valueOf(AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo), AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, Short.valueOf(AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq), AV5emprcod, Integer.valueOf(AV6barcod), Byte.valueOf(AV7barcodreo), AV8barcodpar, Short.valueOf(AV9reclinmaq), lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum, AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel, lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc, AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel, AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon, AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to, AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm, AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to, AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc, AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to, AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres, AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to, lV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote, AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel, Byte.valueOf(AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro), Byte.valueOf(AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to), Short.valueOf(AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin), Short.valueOf(AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to)});
      GRID_nRecordCount = H01LO3_AGRID_nRecordCount[0] ;
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
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV5emprcod ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV6barcod ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV7barcodreo ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV8barcodpar ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV9reclinmaq ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV25FilterFullText ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV58TFRecPrdNum ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV59TFRecPrdNum_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV60TFRecPrdDsc ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV61TFRecPrdDsc_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV62TFFacCon ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV63TFFacCon_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV64TFPrdExiAlm ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV65TFPrdExiAlm_To ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV66TFPrdExiCC ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV67TFPrdExiCC_To ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV68TFPrdCanRes ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV69TFPrdCanRes_To ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV70TFRecLote ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV71TFRecLote_Sel ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV46TFRecLinPro ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV47TFRecLinPro_To ;
      AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV56TFRecLin ;
      AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV57TFRecLin_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV5emprcod, AV6barcod, AV7barcodreo, AV8barcodpar, AV9reclinmaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV58TFRecPrdNum, AV59TFRecPrdNum_Sel, AV60TFRecPrdDsc, AV61TFRecPrdDsc_Sel, AV62TFFacCon, AV63TFFacCon_To, AV64TFPrdExiAlm, AV65TFPrdExiAlm_To, AV66TFPrdExiCC, AV67TFPrdExiCC_To, AV68TFPrdCanRes, AV69TFPrdCanRes_To, AV70TFRecLote, AV71TFRecLote_Sel, AV46TFRecLinPro, AV47TFRecLinPro_To, AV56TFRecLin, AV57TFRecLin_To, AV75Pgmname, AV22OrderedBy, AV23OrderedDsc, AV14todosproductos, AV13consumos, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV5emprcod ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV6barcod ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV7barcodreo ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV8barcodpar ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV9reclinmaq ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV25FilterFullText ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV58TFRecPrdNum ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV59TFRecPrdNum_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV60TFRecPrdDsc ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV61TFRecPrdDsc_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV62TFFacCon ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV63TFFacCon_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV64TFPrdExiAlm ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV65TFPrdExiAlm_To ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV66TFPrdExiCC ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV67TFPrdExiCC_To ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV68TFPrdCanRes ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV69TFPrdCanRes_To ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV70TFRecLote ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV71TFRecLote_Sel ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV46TFRecLinPro ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV47TFRecLinPro_To ;
      AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV56TFRecLin ;
      AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV57TFRecLin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV5emprcod, AV6barcod, AV7barcodreo, AV8barcodpar, AV9reclinmaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV58TFRecPrdNum, AV59TFRecPrdNum_Sel, AV60TFRecPrdDsc, AV61TFRecPrdDsc_Sel, AV62TFFacCon, AV63TFFacCon_To, AV64TFPrdExiAlm, AV65TFPrdExiAlm_To, AV66TFPrdExiCC, AV67TFPrdExiCC_To, AV68TFPrdCanRes, AV69TFPrdCanRes_To, AV70TFRecLote, AV71TFRecLote_Sel, AV46TFRecLinPro, AV47TFRecLinPro_To, AV56TFRecLin, AV57TFRecLin_To, AV75Pgmname, AV22OrderedBy, AV23OrderedDsc, AV14todosproductos, AV13consumos, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV5emprcod ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV6barcod ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV7barcodreo ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV8barcodpar ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV9reclinmaq ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV25FilterFullText ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV58TFRecPrdNum ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV59TFRecPrdNum_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV60TFRecPrdDsc ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV61TFRecPrdDsc_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV62TFFacCon ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV63TFFacCon_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV64TFPrdExiAlm ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV65TFPrdExiAlm_To ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV66TFPrdExiCC ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV67TFPrdExiCC_To ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV68TFPrdCanRes ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV69TFPrdCanRes_To ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV70TFRecLote ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV71TFRecLote_Sel ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV46TFRecLinPro ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV47TFRecLinPro_To ;
      AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV56TFRecLin ;
      AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV57TFRecLin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV5emprcod, AV6barcod, AV7barcodreo, AV8barcodpar, AV9reclinmaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV58TFRecPrdNum, AV59TFRecPrdNum_Sel, AV60TFRecPrdDsc, AV61TFRecPrdDsc_Sel, AV62TFFacCon, AV63TFFacCon_To, AV64TFPrdExiAlm, AV65TFPrdExiAlm_To, AV66TFPrdExiCC, AV67TFPrdExiCC_To, AV68TFPrdCanRes, AV69TFPrdCanRes_To, AV70TFRecLote, AV71TFRecLote_Sel, AV46TFRecLinPro, AV47TFRecLinPro_To, AV56TFRecLin, AV57TFRecLin_To, AV75Pgmname, AV22OrderedBy, AV23OrderedDsc, AV14todosproductos, AV13consumos, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV5emprcod ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV6barcod ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV7barcodreo ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV8barcodpar ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV9reclinmaq ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV25FilterFullText ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV58TFRecPrdNum ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV59TFRecPrdNum_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV60TFRecPrdDsc ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV61TFRecPrdDsc_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV62TFFacCon ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV63TFFacCon_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV64TFPrdExiAlm ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV65TFPrdExiAlm_To ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV66TFPrdExiCC ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV67TFPrdExiCC_To ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV68TFPrdCanRes ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV69TFPrdCanRes_To ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV70TFRecLote ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV71TFRecLote_Sel ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV46TFRecLinPro ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV47TFRecLinPro_To ;
      AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV56TFRecLin ;
      AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV57TFRecLin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV5emprcod, AV6barcod, AV7barcodreo, AV8barcodpar, AV9reclinmaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV58TFRecPrdNum, AV59TFRecPrdNum_Sel, AV60TFRecPrdDsc, AV61TFRecPrdDsc_Sel, AV62TFFacCon, AV63TFFacCon_To, AV64TFPrdExiAlm, AV65TFPrdExiAlm_To, AV66TFPrdExiCC, AV67TFPrdExiCC_To, AV68TFPrdCanRes, AV69TFPrdCanRes_To, AV70TFRecLote, AV71TFRecLote_Sel, AV46TFRecLinPro, AV47TFRecLinPro_To, AV56TFRecLin, AV57TFRecLin_To, AV75Pgmname, AV22OrderedBy, AV23OrderedDsc, AV14todosproductos, AV13consumos, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV5emprcod ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV6barcod ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV7barcodreo ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV8barcodpar ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV9reclinmaq ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV25FilterFullText ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV58TFRecPrdNum ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV59TFRecPrdNum_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV60TFRecPrdDsc ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV61TFRecPrdDsc_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV62TFFacCon ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV63TFFacCon_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV64TFPrdExiAlm ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV65TFPrdExiAlm_To ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV66TFPrdExiCC ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV67TFPrdExiCC_To ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV68TFPrdCanRes ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV69TFPrdCanRes_To ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV70TFRecLote ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV71TFRecLote_Sel ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV46TFRecLinPro ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV47TFRecLinPro_To ;
      AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV56TFRecLin ;
      AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV57TFRecLin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV5emprcod, AV6barcod, AV7barcodreo, AV8barcodpar, AV9reclinmaq, AV35ManageFiltersExecutionStep, AV30ColumnsSelector, AV58TFRecPrdNum, AV59TFRecPrdNum_Sel, AV60TFRecPrdDsc, AV61TFRecPrdDsc_Sel, AV62TFFacCon, AV63TFFacCon_To, AV64TFPrdExiAlm, AV65TFPrdExiAlm_To, AV66TFPrdExiCC, AV67TFPrdExiCC_To, AV68TFPrdCanRes, AV69TFPrdCanRes_To, AV70TFRecLote, AV71TFRecLote_Sel, AV46TFRecLinPro, AV47TFRecLinPro_To, AV56TFRecLin, AV57TFRecLin_To, AV75Pgmname, AV22OrderedBy, AV23OrderedDsc, AV14todosproductos, AV13consumos, AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod, AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo, AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV75Pgmname = "FormulacionTinte.CierreRecetasTinte_Incidencias_WC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
      Gx_err = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavErr_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(Gx_err), 3, 0));
      edtavPrdcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcant_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavErr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1LO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181LO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV33ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV48DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV30ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV50GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV51GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         /* Read variables values. */
         AV25FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25FilterFullText", AV25FilterFullText);
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"CierreRecetasTinte_Incidencias_WC");
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\cierrerecetastinte_incidencias_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV25FilterFullText) != 0 )
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
      e181LO2 ();
      if (returnInSub) return;
   }

   public void e181LO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = AV5emprcod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      cierrerecetastinte_incidencias_wc_impl.this.AV5emprcod = GXv_char2[0] ;
      cierrerecetastinte_incidencias_wc_impl.this.AV11EmprNom = GXv_char3[0] ;
      cierrerecetastinte_incidencias_wc_impl.this.AV12UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5emprcod, "@!"))));
      GXt_int5 = AV13consumos ;
      GXv_char4[0] = AV5emprcod ;
      GXv_char3[0] = "011100" ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      cierrerecetastinte_incidencias_wc_impl.this.AV5emprcod = GXv_char4[0] ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5emprcod, "@!"))));
      AV13consumos = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13consumos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13consumos), "ZZZ9")));
      GXt_int7 = (byte)(AV14todosproductos) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5emprcod, httpContext.getMessage( "ALLCP0", ""), GXv_int8) ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV14todosproductos = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14todosproductos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14todosproductos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODOSPRODUCTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14todosproductos), "ZZZ9")));
      GXt_char1 = AV10Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV10Station = GXt_char1 ;
      GXv_char4[0] = AV5emprcod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char4, GXv_char3, GXv_char2) ;
      cierrerecetastinte_incidencias_wc_impl.this.AV5emprcod = GXv_char4[0] ;
      cierrerecetastinte_incidencias_wc_impl.this.AV11EmprNom = GXv_char3[0] ;
      cierrerecetastinte_incidencias_wc_impl.this.AV12UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      if ( GXutil.strcmp(AV17HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Detalle de Productos quimicos en Receta", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV22OrderedBy < 1 )
      {
         AV22OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV48DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV48DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191LO2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV16WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV16WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV35ManageFiltersExecutionStep == 1 )
      {
         AV35ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35ManageFiltersExecutionStep", GXutil.str( AV35ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV35ManageFiltersExecutionStep == 2 )
      {
         AV35ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35ManageFiltersExecutionStep", GXutil.str( AV35ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV32Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCColumnsSelector"), "") != 0 )
      {
         AV28ColumnsSelectorXML = AV32Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCColumnsSelector") ;
         AV30ColumnsSelector.fromxml(AV28ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtRecPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecPrdDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtFacCon_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavPrdcant_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdcant_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcant_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavForprddsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavErr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdExiAlm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdExiCC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdCanRes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecLinPro_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV50GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridCurrentPage), 10, 0));
      AV51GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridPageCount), 10, 0));
      edtRecPrdNum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Columnheaderclass", edtRecPrdNum_Columnheaderclass, !bGXsfl_41_Refreshing);
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV5emprcod ;
      AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV6barcod ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV7barcodreo ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV8barcodpar ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV9reclinmaq ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV25FilterFullText ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV58TFRecPrdNum ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV59TFRecPrdNum_Sel ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV60TFRecPrdDsc ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV61TFRecPrdDsc_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV62TFFacCon ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV63TFFacCon_To ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV64TFPrdExiAlm ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV65TFPrdExiAlm_To ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV66TFPrdExiCC ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV67TFPrdExiCC_To ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV68TFPrdCanRes ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV69TFPrdCanRes_To ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV70TFRecLote ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV71TFRecLote_Sel ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV46TFRecLinPro ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV47TFRecLinPro_To ;
      AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV56TFRecLin ;
      AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV57TFRecLin_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ColumnsSelector", AV30ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20GridState", AV20GridState);
   }

   public void e121LO2( )
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
         AV49PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV49PageToGo) ;
      }
   }

   public void e131LO2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141LO2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV22OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
         AV23OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedDsc", AV23OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdNum") == 0 )
         {
            AV58TFRecPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFRecPrdNum", AV58TFRecPrdNum);
            AV59TFRecPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFRecPrdNum_Sel", AV59TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdDsc") == 0 )
         {
            AV60TFRecPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFRecPrdDsc", AV60TFRecPrdDsc);
            AV61TFRecPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFRecPrdDsc_Sel", AV61TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacCon") == 0 )
         {
            AV62TFFacCon = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFFacCon", GXutil.ltrimstr( AV62TFFacCon, 11, 5));
            AV63TFFacCon_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFFacCon_To", GXutil.ltrimstr( AV63TFFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiAlm") == 0 )
         {
            AV64TFPrdExiAlm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrdExiAlm", GXutil.ltrimstr( AV64TFPrdExiAlm, 12, 4));
            AV65TFPrdExiAlm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdExiAlm_To", GXutil.ltrimstr( AV65TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiCC") == 0 )
         {
            AV66TFPrdExiCC = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdExiCC", GXutil.ltrimstr( AV66TFPrdExiCC, 12, 4));
            AV67TFPrdExiCC_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdExiCC_To", GXutil.ltrimstr( AV67TFPrdExiCC_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanRes") == 0 )
         {
            AV68TFPrdCanRes = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdCanRes", GXutil.ltrimstr( AV68TFPrdCanRes, 12, 4));
            AV69TFPrdCanRes_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrdCanRes_To", GXutil.ltrimstr( AV69TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLote") == 0 )
         {
            AV70TFRecLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFRecLote", AV70TFRecLote);
            AV71TFRecLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFRecLote_Sel", AV71TFRecLote_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinPro") == 0 )
         {
            AV46TFRecLinPro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFRecLinPro), 2, 0));
            AV47TFRecLinPro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLin") == 0 )
         {
            AV56TFRecLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFRecLin), 4, 0));
            AV57TFRecLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFRecLin_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201LO2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV54PrdCant = ((AV14todosproductos==0) ? A686PrdCant : A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrdcant_Internalname, GXutil.ltrimstr( AV54PrdCant, 11, 3));
      AV55ForPrdDsc = ((AV14todosproductos==0) ? A488ForPrdDsc : ((A490ForPrdUMe==2) ? httpContext.getMessage( "Lt", "") : ((A490ForPrdUMe==1) ? httpContext.getMessage( "Kg", "") : httpContext.getMessage( "Kg", "")))) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavForprddsc_Internalname, AV55ForPrdDsc);
      AV52Existencias = DecimalUtil.doubleToDec(0) ;
      if ( ( GXutil.strcmp(A872RecPrdNum, "100000") >= 0 ) && ( GXutil.strcmp(A872RecPrdNum, "999999") <= 0 ) )
      {
         AV52Existencias = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
      }
      Gx_err = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavErr_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(Gx_err), 3, 0));
      if ( ( GXutil.strcmp(A872RecPrdNum, "100000") >= 0 ) && ( GXutil.strcmp(A872RecPrdNum, "999999") <= 0 ) )
      {
         if ( AV13consumos == 1 )
         {
            Gx_err = (short)(((DecimalUtil.compareTo(AV52Existencias, A704PrdExiAlm)>0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavErr_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(Gx_err), 3, 0));
         }
         else
         {
            Gx_err = (short)(((DecimalUtil.compareTo(AV52Existencias, A705PrdExiCC)>0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavErr_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(Gx_err), 3, 0));
         }
      }
      edtRecPrdNum_Columnclass = ((Gx_err>0) ? "WWColumn WWColumnDanger WWColumnDangerSingleCell" : "WWColumn") ;
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
      /*  Sending Event outputs  */
   }

   public void e151LO2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV28ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV30ColumnsSelector.fromJSonString(AV28ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_Incidencias_WCColumnsSelector", ((GXutil.strcmp("", AV28ColumnsSelectorXML)==0) ? "" : AV30ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ColumnsSelector", AV30ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20GridState", AV20GridState);
   }

   public void e111LO2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.CierreRecetasTinte_Incidencias_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV75Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV35ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35ManageFiltersExecutionStep", GXutil.str( AV35ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.CierreRecetasTinte_Incidencias_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV35ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35ManageFiltersExecutionStep", GXutil.str( AV35ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV34ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_Incidencias_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         cierrerecetastinte_incidencias_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV34ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV34ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV34ManageFiltersXml) ;
            AV20GridState.fromxml(AV34ManageFiltersXml, null, null);
            AV22OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
            AV23OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedDsc", AV23OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20GridState", AV20GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ColumnsSelector", AV30ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ManageFiltersData", AV33ManageFiltersData);
   }

   public void e161LO2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV26ExcelFilename ;
      GXv_char3[0] = AV27ErrorMessage ;
      new app.formulaciontinte.cierrerecetastinte_incidencias_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      cierrerecetastinte_incidencias_wc_impl.this.AV26ExcelFilename = GXv_char4[0] ;
      cierrerecetastinte_incidencias_wc_impl.this.AV27ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV26ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV26ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV27ErrorMessage);
      }
   }

   public void e171LO2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.cierrerecetastinte_incidencias_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV22OrderedBy, 4, 0))+":"+(AV23OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV30ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecPrdNum", "", "Producto", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecPrdDsc", "", "Descripcion", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "FacCon", "", "Factor", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&PrdCant", "", "Cantidad", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&ForPrdDsc", "", "Und", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&err", "", "", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdExiAlm", "Existencias", "Almacen", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_char4[0] = AV5emprcod ;
      GXv_char3[0] = "011100" ;
      if ( new app.pbuscou(remoteHandle, context).executeUdp( GXv_char4, GXv_char3) != 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      cierrerecetastinte_incidencias_wc_impl.this.AV5emprcod = GXv_char4[0] ;
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdExiCC", "Existencias", "C.C.", true, "") ;
         AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "", "", "", false, "") ;
         AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
         AV66TFPrdExiCC = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdExiCC", GXutil.ltrimstr( AV66TFPrdExiCC, 12, 4));
         AV67TFPrdExiCC_To = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdExiCC_To", GXutil.ltrimstr( AV67TFPrdExiCC_To, 12, 4));
      }
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdCanRes", "", "Reservada", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecLote", "", "Lote", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecLinPro", "", "##", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecLin", "", "#", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV29UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_Incidencias_WCColumnsSelector", GXv_char4) ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV29UserCustomValue)==0) ) )
      {
         AV31ColumnsSelectorAux.fromxml(AV29UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV31ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV30ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV31ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV30ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV33ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_Incidencias_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV33ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV25FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25FilterFullText", AV25FilterFullText);
      AV58TFRecPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFRecPrdNum", AV58TFRecPrdNum);
      AV59TFRecPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFRecPrdNum_Sel", AV59TFRecPrdNum_Sel);
      AV60TFRecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFRecPrdDsc", AV60TFRecPrdDsc);
      AV61TFRecPrdDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFRecPrdDsc_Sel", AV61TFRecPrdDsc_Sel);
      AV62TFFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFFacCon", GXutil.ltrimstr( AV62TFFacCon, 11, 5));
      AV63TFFacCon_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFFacCon_To", GXutil.ltrimstr( AV63TFFacCon_To, 11, 5));
      AV64TFPrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrdExiAlm", GXutil.ltrimstr( AV64TFPrdExiAlm, 12, 4));
      AV65TFPrdExiAlm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdExiAlm_To", GXutil.ltrimstr( AV65TFPrdExiAlm_To, 12, 4));
      AV66TFPrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdExiCC", GXutil.ltrimstr( AV66TFPrdExiCC, 12, 4));
      AV67TFPrdExiCC_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdExiCC_To", GXutil.ltrimstr( AV67TFPrdExiCC_To, 12, 4));
      AV68TFPrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdCanRes", GXutil.ltrimstr( AV68TFPrdCanRes, 12, 4));
      AV69TFPrdCanRes_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrdCanRes_To", GXutil.ltrimstr( AV69TFPrdCanRes_To, 12, 4));
      AV70TFRecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFRecLote", AV70TFRecLote);
      AV71TFRecLote_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFRecLote_Sel", AV71TFRecLote_Sel);
      AV46TFRecLinPro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFRecLinPro), 2, 0));
      AV47TFRecLinPro_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFRecLinPro_To), 2, 0));
      AV56TFRecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFRecLin), 4, 0));
      AV57TFRecLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFRecLin_To), 4, 0));
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
      if ( GXutil.strcmp(AV32Session.getValue(AV75Pgmname+"GridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV75Pgmname+"GridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV32Session.getValue(AV75Pgmname+"GridState"), null, null);
      }
      AV22OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
      AV23OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedDsc", AV23OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV20GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV20GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV20GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV1));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV25FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25FilterFullText", AV25FilterFullText);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV58TFRecPrdNum = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFRecPrdNum", AV58TFRecPrdNum);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV59TFRecPrdNum_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFRecPrdNum_Sel", AV59TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV60TFRecPrdDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFRecPrdDsc", AV60TFRecPrdDsc);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV61TFRecPrdDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFRecPrdDsc_Sel", AV61TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV62TFFacCon = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFFacCon", GXutil.ltrimstr( AV62TFFacCon, 11, 5));
            AV63TFFacCon_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFFacCon_To", GXutil.ltrimstr( AV63TFFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV64TFPrdExiAlm = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrdExiAlm", GXutil.ltrimstr( AV64TFPrdExiAlm, 12, 4));
            AV65TFPrdExiAlm_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdExiAlm_To", GXutil.ltrimstr( AV65TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXICC") == 0 )
         {
            AV66TFPrdExiCC = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdExiCC", GXutil.ltrimstr( AV66TFPrdExiCC, 12, 4));
            AV67TFPrdExiCC_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdExiCC_To", GXutil.ltrimstr( AV67TFPrdExiCC_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV68TFPrdCanRes = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdCanRes", GXutil.ltrimstr( AV68TFPrdCanRes, 12, 4));
            AV69TFPrdCanRes_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrdCanRes_To", GXutil.ltrimstr( AV69TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV70TFRecLote = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFRecLote", AV70TFRecLote);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV71TFRecLote_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFRecLote_Sel", AV71TFRecLote_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV46TFRecLinPro = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFRecLinPro), 2, 0));
            AV47TFRecLinPro_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV56TFRecLin = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFRecLin), 4, 0));
            AV57TFRecLin_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFRecLin_To), 4, 0));
         }
         AV100GXV1 = (int)(AV100GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFRecPrdNum_Sel)==0), AV59TFRecPrdNum_Sel, GXv_char4) ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFRecPrdDsc_Sel)==0), AV61TFRecPrdDsc_Sel, GXv_char3) ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFRecLote_Sel)==0), AV71TFRecLote_Sel, GXv_char2) ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_char17 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char16+"||||||||"+GXt_char17+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFRecPrdNum)==0), AV58TFRecPrdNum, GXv_char4) ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFRecPrdDsc)==0), AV60TFRecPrdDsc, GXv_char3) ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFRecLote)==0), AV70TFRecLote, GXv_char2) ;
      cierrerecetastinte_incidencias_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char17+"|"+GXt_char16+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFFacCon)==0) ? "" : GXutil.str( AV62TFFacCon, 11, 5))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFPrdExiAlm)==0) ? "" : GXutil.str( AV64TFPrdExiAlm, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdExiCC)==0) ? "" : GXutil.str( AV66TFPrdExiCC, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFPrdCanRes)==0) ? "" : GXutil.str( AV68TFPrdCanRes, 12, 4))+"|"+GXt_char1+"|"+((0==AV46TFRecLinPro) ? "" : GXutil.str( AV46TFRecLinPro, 2, 0))+"|"+((0==AV56TFRecLin) ? "" : GXutil.str( AV56TFRecLin, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFFacCon_To)==0) ? "" : GXutil.str( AV63TFFacCon_To, 11, 5))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFPrdExiAlm_To)==0) ? "" : GXutil.str( AV65TFPrdExiAlm_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdExiCC_To)==0) ? "" : GXutil.str( AV67TFPrdExiCC_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFPrdCanRes_To)==0) ? "" : GXutil.str( AV69TFPrdCanRes_To, 12, 4))+"||"+((0==AV47TFRecLinPro_To) ? "" : GXutil.str( AV47TFRecLinPro_To, 2, 0))+"|"+((0==AV57TFRecLin_To) ? "" : GXutil.str( AV57TFRecLin_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV20GridState.fromxml(AV32Session.getValue(AV75Pgmname+"GridState"), null, null);
      AV20GridState.setgxTv_SdtWWPGridState_Orderedby( AV22OrderedBy );
      AV20GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV23OrderedDsc );
      AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV25FilterFullText)==0), (short)(0), AV25FilterFullText, "") ;
      AV20GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFRECPRDNUM", "", !(GXutil.strcmp("", AV58TFRecPrdNum)==0), (short)(0), AV58TFRecPrdNum, "", !(GXutil.strcmp("", AV59TFRecPrdNum_Sel)==0), AV59TFRecPrdNum_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFRECPRDDSC", "", !(GXutil.strcmp("", AV60TFRecPrdDsc)==0), (short)(0), AV60TFRecPrdDsc, "", !(GXutil.strcmp("", AV61TFRecPrdDsc_Sel)==0), AV61TFRecPrdDsc_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACCON", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFFacCon)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFFacCon_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV62TFFacCon, 11, 5)), GXutil.trim( GXutil.str( AV63TFFacCon_To, 11, 5))) ;
      AV20GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPRDEXIALM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFPrdExiAlm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFPrdExiAlm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV64TFPrdExiAlm, 12, 4)), GXutil.trim( GXutil.str( AV65TFPrdExiAlm_To, 12, 4))) ;
      AV20GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPRDEXICC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdExiCC)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdExiCC_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV66TFPrdExiCC, 12, 4)), GXutil.trim( GXutil.str( AV67TFPrdExiCC_To, 12, 4))) ;
      AV20GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPRDCANRES", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFPrdCanRes)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFPrdCanRes_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV68TFPrdCanRes, 12, 4)), GXutil.trim( GXutil.str( AV69TFPrdCanRes_To, 12, 4))) ;
      AV20GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFRECLOTE", "", !(GXutil.strcmp("", AV70TFRecLote)==0), (short)(0), AV70TFRecLote, "", !(GXutil.strcmp("", AV71TFRecLote_Sel)==0), AV71TFRecLote_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFRECLINPRO", "", !((0==AV46TFRecLinPro)&&(0==AV47TFRecLinPro_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFRecLinPro, 2, 0)), GXutil.trim( GXutil.str( AV47TFRecLinPro_To, 2, 0))) ;
      AV20GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFRECLIN", "", !((0==AV56TFRecLin)&&(0==AV57TFRecLin_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFRecLin, 4, 0)), GXutil.trim( GXutil.str( AV57TFRecLin_To, 4, 0))) ;
      AV20GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV5emprcod)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5emprcod );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV6barcod) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6barcod, 8, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV7barcodreo) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV7barcodreo, 1, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8barcodpar)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8barcodpar );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV9reclinmaq) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECLINMAQ" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9reclinmaq, 4, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      AV20GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV20GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV20GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV18TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV75Pgmname );
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV17HTTPRequest.getScriptName()+"?"+AV17HTTPRequest.getQuerystring() );
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MantenimientoProductosReceta_TRN" );
      AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV19TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "emprcod" );
      AV19TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV5emprcod );
      AV18TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV19TrnContextAtt, 0);
      AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV19TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "barcod" );
      AV19TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV6barcod, 8, 0) );
      AV18TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV19TrnContextAtt, 0);
      AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV19TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "barcodreo" );
      AV19TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV7barcodreo, 1, 0) );
      AV18TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV19TrnContextAtt, 0);
      AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV19TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "barcodpar" );
      AV19TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV8barcodpar );
      AV18TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV19TrnContextAtt, 0);
      AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV19TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "reclinmaq" );
      AV19TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV9reclinmaq, 4, 0) );
      AV18TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV19TrnContextAtt, 0);
      AV32Session.setValue("TrnContext", AV18TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1LO2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV33ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_1LO2( true) ;
      }
      else
      {
         wb_table2_28_1LO2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_1LO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1LO2e( true) ;
      }
      else
      {
         wb_table1_23_1LO2e( false) ;
      }
   }

   public void wb_table2_28_1LO2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV25FilterFullText, GXutil.rtrim( localUtil.format( AV25FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\CierreRecetasTinte_Incidencias_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_1LO2e( true) ;
      }
      else
      {
         wb_table2_28_1LO2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5emprcod, "@!"))));
      AV6barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6barcod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6barcod), "ZZZZZZZ9")));
      AV7barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7barcodreo", GXutil.str( AV7barcodreo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7barcodreo), "9")));
      AV8barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8barcodpar", AV8barcodpar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8barcodpar, ""))));
      AV9reclinmaq = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9reclinmaq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9reclinmaq), "ZZZ9")));
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
      pa1LO2( ) ;
      ws1LO2( ) ;
      we1LO2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116134350", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/cierrerecetastinte_incidencias_wc.js", "?202682116134351", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_41_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_41_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_41_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_41_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_41_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_41_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_41_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_41_idx ;
      edtavPrdcant_Internalname = "vPRDCANT_"+sGXsfl_41_idx ;
      edtavForprddsc_Internalname = "vFORPRDDSC_"+sGXsfl_41_idx ;
      edtavErr_Internalname = "vERR_"+sGXsfl_41_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_41_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_41_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_41_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_41_idx ;
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_41_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_41_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_41_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_41_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_41_fel_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_41_fel_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_41_fel_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_41_fel_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_41_fel_idx ;
      edtavPrdcant_Internalname = "vPRDCANT_"+sGXsfl_41_fel_idx ;
      edtavForprddsc_Internalname = "vFORPRDDSC_"+sGXsfl_41_fel_idx ;
      edtavErr_Internalname = "vERR_"+sGXsfl_41_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_41_fel_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_41_fel_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_41_fel_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_41_fel_idx ;
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_41_fel_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1LO0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecPrdNum_Columnclass,edtRecPrdNum_Columnheaderclass,Integer.valueOf(edtRecPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecPrdDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecPrdDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFacCon_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A431FacCon, "ZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacCon_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrdcant_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdcant_Internalname,GXutil.ltrim( localUtil.ntoc( AV54PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdcant_Enabled!=0) ? localUtil.format( AV54PrdCant, "ZZZZZZ9.999") : localUtil.format( AV54PrdCant, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrdcant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdcant_Visible),Integer.valueOf(edtavPrdcant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavForprddsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavForprddsc_Internalname,GXutil.rtrim( AV55ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavForprddsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavForprddsc_Visible),Integer.valueOf(edtavForprddsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavErr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavErr_Internalname,GXutil.ltrim( localUtil.ntoc( Gx_err, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavErr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(Gx_err), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(Gx_err), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavErr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavErr_Visible),Integer.valueOf(edtavErr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdExiAlm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiCC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiCC_Internalname,GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiCC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdExiCC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCanRes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLote_Internalname,GXutil.rtrim( A5725RecLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecLote_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecLinPro_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecLinPro_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1LO2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecPrdDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacCon_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdcant_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavForprddsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavErr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiCC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.C.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reservada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLinPro_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "##") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A872RecPrdNum));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtRecPrdNum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtRecPrdNum_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A875RecPrdDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacCon_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV54PrdCant, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdcant_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdcant_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV55ForPrdDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavForprddsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavForprddsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( Gx_err, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavErr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavErr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5725RecLote));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLinPro_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLin_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtRecPrdNum_Internalname = "RECPRDNUM" ;
      edtRecPrdDsc_Internalname = "RECPRDDSC" ;
      edtFacCon_Internalname = "FACCON" ;
      edtavPrdcant_Internalname = "vPRDCANT" ;
      edtavForprddsc_Internalname = "vFORPRDDSC" ;
      edtavErr_Internalname = "vERR" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtRecLote_Internalname = "RECLOTE" ;
      edtRecLinPro_Internalname = "RECLINPRO" ;
      edtRecLin_Internalname = "RECLIN" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
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
      edtRecLin_Jsonclick = "" ;
      edtRecLinPro_Jsonclick = "" ;
      edtRecLote_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtavErr_Jsonclick = "" ;
      edtavErr_Enabled = 0 ;
      edtavForprddsc_Jsonclick = "" ;
      edtavForprddsc_Enabled = 0 ;
      edtavPrdcant_Jsonclick = "" ;
      edtavPrdcant_Enabled = 0 ;
      edtFacCon_Jsonclick = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecPrdNum_Columnclass = "WWColumn" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtRecPrdNum_Columnheaderclass = "" ;
      edtRecLin_Visible = -1 ;
      edtRecLinPro_Visible = -1 ;
      edtRecLote_Visible = -1 ;
      edtPrdCanRes_Visible = -1 ;
      edtPrdExiCC_Visible = -1 ;
      edtPrdExiAlm_Visible = -1 ;
      edtavErr_Visible = -1 ;
      edtavForprddsc_Visible = -1 ;
      edtavPrdcant_Visible = -1 ;
      edtFacCon_Visible = -1 ;
      edtRecPrdDsc_Visible = -1 ;
      edtRecPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = ";;;;;L;L;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;Existencias;Existencias;;;;" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "FormulacionTinte.CierreRecetasTinte_Incidencias_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||||||||Dynamic||" ;
      Ddo_grid_Includedatalist = "T|T||||||||T||" ;
      Ddo_grid_Filterisrange = "||T||||T|T|T||T|T" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric||||Numeric|Numeric|Numeric|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T|T|T||||T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "||T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Includesortasc = "T|T|T||||T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "3|4|5||||6|7|8|9|1|2" ;
      Ddo_grid_Columnids = "5:RecPrdNum|6:RecPrdDsc|7:FacCon|8:PrdCant|9:ForPrdDsc|10:err|11:PrdExiAlm|12:PrdExiCC|13:PrdCanRes|14:RecLote|15:RecLinPro|16:RecLin" ;
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
      Form.setCaption( httpContext.getMessage( "Detalle de Productos quimicos en Receta", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_4_BARCODPAR',pic:''},{av:'AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV7barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV9reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV58TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV59TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV60TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV61TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV62TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV63TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV64TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV65TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV66TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV69TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV70TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV71TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV46TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV47TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV56TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV57TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV13consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtFacCon_Visible',ctrl:'FACCON',prop:'Visible'},{av:'edtavPrdcant_Visible',ctrl:'vPRDCANT',prop:'Visible'},{av:'edtavForprddsc_Visible',ctrl:'vFORPRDDSC',prop:'Visible'},{av:'edtavErr_Visible',ctrl:'vERR',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtRecLote_Visible',ctrl:'RECLOTE',prop:'Visible'},{av:'edtRecLinPro_Visible',ctrl:'RECLINPRO',prop:'Visible'},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''},{av:'AV66TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121LO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV7barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV9reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV59TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV60TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV61TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV62TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV63TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV64TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV65TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV66TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV69TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV70TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV71TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV46TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV47TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV56TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV57TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV13consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_4_BARCODPAR',pic:''},{av:'AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131LO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV7barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV9reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV59TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV60TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV61TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV62TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV63TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV64TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV65TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV66TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV69TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV70TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV71TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV46TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV47TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV56TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV57TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV13consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_4_BARCODPAR',pic:''},{av:'AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141LO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV7barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV9reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV59TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV60TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV61TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV62TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV63TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV64TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV65TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV66TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV69TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV70TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV71TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV46TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV47TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV56TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV57TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV13consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_4_BARCODPAR',pic:''},{av:'AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV57TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV46TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV47TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV70TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV71TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV68TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV69TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV66TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV64TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV65TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV62TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV63TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV60TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV61TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV58TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV59TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201LO2',iparms:[{av:'AV14todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A1797PrdCanAny',fld:'PRDCANANY',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'AV13consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV54PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV55ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'Gx_err',fld:'vERR',pic:'ZZ9'},{av:'edtRecPrdNum_Columnclass',ctrl:'RECPRDNUM',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151LO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV7barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV9reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV59TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV60TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV61TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV62TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV63TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV64TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV65TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV66TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV69TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV70TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV71TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV46TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV47TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV56TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV57TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV13consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_4_BARCODPAR',pic:''},{av:'AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtFacCon_Visible',ctrl:'FACCON',prop:'Visible'},{av:'edtavPrdcant_Visible',ctrl:'vPRDCANT',prop:'Visible'},{av:'edtavForprddsc_Visible',ctrl:'vFORPRDDSC',prop:'Visible'},{av:'edtavErr_Visible',ctrl:'vERR',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtRecLote_Visible',ctrl:'RECLOTE',prop:'Visible'},{av:'edtRecLinPro_Visible',ctrl:'RECLINPRO',prop:'Visible'},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''},{av:'AV66TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111LO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV7barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV9reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV59TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV60TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV61TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV62TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV63TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV64TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV65TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV66TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV69TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV70TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV71TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV46TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV47TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV56TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV57TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV13consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_4_BARCODPAR',pic:''},{av:'AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIAS_WCDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV35ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV59TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV60TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV61TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV62TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV63TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV64TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV65TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV66TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV69TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV70TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV71TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV46TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV47TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV56TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV57TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV30ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtFacCon_Visible',ctrl:'FACCON',prop:'Visible'},{av:'edtavPrdcant_Visible',ctrl:'vPRDCANT',prop:'Visible'},{av:'edtavForprddsc_Visible',ctrl:'vFORPRDDSC',prop:'Visible'},{av:'edtavErr_Visible',ctrl:'vERR',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtRecLote_Visible',ctrl:'RECLOTE',prop:'Visible'},{av:'edtRecLinPro_Visible',ctrl:'RECLINPRO',prop:'Visible'},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161LO2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171LO2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Reclin',iparms:[]");
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
      wcpOAV5emprcod = "" ;
      wcpOAV8barcodpar = "" ;
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
      AV5emprcod = "" ;
      AV8barcodpar = "" ;
      AV25FilterFullText = "" ;
      AV30ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV58TFRecPrdNum = "" ;
      AV59TFRecPrdNum_Sel = "" ;
      AV60TFRecPrdDsc = "" ;
      AV61TFRecPrdDsc_Sel = "" ;
      AV62TFFacCon = DecimalUtil.ZERO ;
      AV63TFFacCon_To = DecimalUtil.ZERO ;
      AV64TFPrdExiAlm = DecimalUtil.ZERO ;
      AV65TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV66TFPrdExiCC = DecimalUtil.ZERO ;
      AV67TFPrdExiCC_To = DecimalUtil.ZERO ;
      AV68TFPrdCanRes = DecimalUtil.ZERO ;
      AV69TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV70TFRecLote = "" ;
      AV71TFRecLote_Sel = "" ;
      AV75Pgmname = "" ;
      AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = "" ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV33ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV48DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      AV54PrdCant = DecimalUtil.ZERO ;
      AV55ForPrdDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      scmdbuf = "" ;
      lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = "" ;
      lV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = "" ;
      lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = "" ;
      lV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = "" ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = "" ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = "" ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = "" ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = "" ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = "" ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = DecimalUtil.ZERO ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = DecimalUtil.ZERO ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = DecimalUtil.ZERO ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = DecimalUtil.ZERO ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = DecimalUtil.ZERO ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = DecimalUtil.ZERO ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = DecimalUtil.ZERO ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = DecimalUtil.ZERO ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = "" ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = "" ;
      H01LO2_A719PrdNum = new String[] {""} ;
      H01LO2_n719PrdNum = new boolean[] {false} ;
      H01LO2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LO2_A490ForPrdUMe = new byte[1] ;
      H01LO2_n490ForPrdUMe = new boolean[] {false} ;
      H01LO2_A488ForPrdDsc = new String[] {""} ;
      H01LO2_n488ForPrdDsc = new boolean[] {false} ;
      H01LO2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LO2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LO2_A811RecLin = new short[1] ;
      H01LO2_A1273RecLinPro = new byte[1] ;
      H01LO2_A5725RecLote = new String[] {""} ;
      H01LO2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LO2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LO2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LO2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LO2_A875RecPrdDsc = new String[] {""} ;
      H01LO2_A872RecPrdNum = new String[] {""} ;
      H01LO2_A2804RecLinMaq = new short[1] ;
      H01LO2_A130BarCodPar = new String[] {""} ;
      H01LO2_A132BarCodReo = new byte[1] ;
      H01LO2_A129BarCod = new int[1] ;
      H01LO2_A396EmprCod = new String[] {""} ;
      A719PrdNum = "" ;
      H01LO3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV10Station = "" ;
      AV11EmprNom = "" ;
      AV12UsurCod = "" ;
      GXv_int6 = new int[1] ;
      GXv_int8 = new byte[1] ;
      AV17HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV16WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV32Session = httpContext.getWebSession();
      AV28ColumnsSelectorXML = "" ;
      AV52Existencias = DecimalUtil.ZERO ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV34ManageFiltersXml = "" ;
      AV26ExcelFilename = "" ;
      AV27ErrorMessage = "" ;
      AV29UserCustomValue = "" ;
      AV31ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV18TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV19TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_incidencias_wc__default(),
         new Object[] {
             new Object[] {
            H01LO2_A719PrdNum, H01LO2_n719PrdNum, H01LO2_A686PrdCant, H01LO2_A490ForPrdUMe, H01LO2_n490ForPrdUMe, H01LO2_A488ForPrdDsc, H01LO2_n488ForPrdDsc, H01LO2_A707PrdFacCon, H01LO2_A1797PrdCanAny, H01LO2_A811RecLin,
            H01LO2_A1273RecLinPro, H01LO2_A5725RecLote, H01LO2_A685PrdCanRes, H01LO2_A705PrdExiCC, H01LO2_A704PrdExiAlm, H01LO2_A431FacCon, H01LO2_A875RecPrdDsc, H01LO2_A872RecPrdNum, H01LO2_A2804RecLinMaq, H01LO2_A130BarCodPar,
            H01LO2_A132BarCodReo, H01LO2_A129BarCod, H01LO2_A396EmprCod
            }
            , new Object[] {
            H01LO3_AGRID_nRecordCount
            }
         }
      );
      AV75Pgmname = "FormulacionTinte.CierreRecetasTinte_Incidencias_WC" ;
      /* GeneXus formulas. */
      AV75Pgmname = "FormulacionTinte.CierreRecetasTinte_Incidencias_WC" ;
      Gx_err = (short)(0) ;
      edtavPrdcant_Enabled = 0 ;
      edtavForprddsc_Enabled = 0 ;
      edtavErr_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV7barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV7barcodreo ;
   private byte AV35ManageFiltersExecutionStep ;
   private byte AV46TFRecLinPro ;
   private byte AV47TFRecLinPro_To ;
   private byte AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ;
   private byte gxajaxcallmode ;
   private byte A490ForPrdUMe ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ;
   private byte AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV9reclinmaq ;
   private short AV9reclinmaq ;
   private short AV56TFRecLin ;
   private short AV57TFRecLin_To ;
   private short AV22OrderedBy ;
   private short AV14todosproductos ;
   private short AV13consumos ;
   private short AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq ;
   private short wbEnd ;
   private short wbStart ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private short A811RecLin ;
   private short gxcookieaux ;
   private short AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ;
   private short AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ;
   private int wcpOAV6barcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV6barcod ;
   private int nGXsfl_41_idx=1 ;
   private int AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavPrdcant_Enabled ;
   private int edtavForprddsc_Enabled ;
   private int edtavErr_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int edtRecPrdNum_Visible ;
   private int edtRecPrdDsc_Visible ;
   private int edtFacCon_Visible ;
   private int edtavPrdcant_Visible ;
   private int edtavForprddsc_Visible ;
   private int edtavErr_Visible ;
   private int edtPrdExiAlm_Visible ;
   private int edtPrdExiCC_Visible ;
   private int edtPrdCanRes_Visible ;
   private int edtRecLote_Visible ;
   private int edtRecLinPro_Visible ;
   private int edtRecLin_Visible ;
   private int AV49PageToGo ;
   private int AV100GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV50GridCurrentPage ;
   private long AV51GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV62TFFacCon ;
   private java.math.BigDecimal AV63TFFacCon_To ;
   private java.math.BigDecimal AV64TFPrdExiAlm ;
   private java.math.BigDecimal AV65TFPrdExiAlm_To ;
   private java.math.BigDecimal AV66TFPrdExiCC ;
   private java.math.BigDecimal AV67TFPrdExiCC_To ;
   private java.math.BigDecimal AV68TFPrdCanRes ;
   private java.math.BigDecimal AV69TFPrdCanRes_To ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal AV54PrdCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ;
   private java.math.BigDecimal AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ;
   private java.math.BigDecimal AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ;
   private java.math.BigDecimal AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ;
   private java.math.BigDecimal AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ;
   private java.math.BigDecimal AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ;
   private java.math.BigDecimal AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ;
   private java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ;
   private java.math.BigDecimal AV52Existencias ;
   private String wcpOAV5emprcod ;
   private String wcpOAV8barcodpar ;
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
   private String AV5emprcod ;
   private String AV8barcodpar ;
   private String sGXsfl_41_idx="0001" ;
   private String AV58TFRecPrdNum ;
   private String AV59TFRecPrdNum_Sel ;
   private String AV60TFRecPrdDsc ;
   private String AV61TFRecPrdDsc_Sel ;
   private String AV70TFRecLote ;
   private String AV71TFRecLote_Sel ;
   private String AV75Pgmname ;
   private String AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ;
   private String AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A488ForPrdDsc ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String A872RecPrdNum ;
   private String edtRecPrdNum_Internalname ;
   private String A875RecPrdDsc ;
   private String edtRecPrdDsc_Internalname ;
   private String edtFacCon_Internalname ;
   private String edtavPrdcant_Internalname ;
   private String AV55ForPrdDsc ;
   private String edtavForprddsc_Internalname ;
   private String edtavErr_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String A5725RecLote ;
   private String edtRecLote_Internalname ;
   private String edtRecLinPro_Internalname ;
   private String edtRecLin_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ;
   private String lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ;
   private String lV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ;
   private String AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ;
   private String AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ;
   private String AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ;
   private String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ;
   private String AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ;
   private String AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ;
   private String A719PrdNum ;
   private String hsh ;
   private String AV10Station ;
   private String AV11EmprNom ;
   private String AV12UsurCod ;
   private String edtRecPrdNum_Columnheaderclass ;
   private String edtRecPrdNum_Columnclass ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtFacCon_Jsonclick ;
   private String edtavPrdcant_Jsonclick ;
   private String edtavForprddsc_Jsonclick ;
   private String edtavErr_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtRecLote_Jsonclick ;
   private String edtRecLinPro_Jsonclick ;
   private String edtRecLin_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV23OrderedDsc ;
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
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV28ColumnsSelectorXML ;
   private String AV34ManageFiltersXml ;
   private String AV29UserCustomValue ;
   private String AV25FilterFullText ;
   private String lV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ;
   private String AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ;
   private String AV26ExcelFilename ;
   private String AV27ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV17HTTPRequest ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01LO2_A719PrdNum ;
   private boolean[] H01LO2_n719PrdNum ;
   private java.math.BigDecimal[] H01LO2_A686PrdCant ;
   private byte[] H01LO2_A490ForPrdUMe ;
   private boolean[] H01LO2_n490ForPrdUMe ;
   private String[] H01LO2_A488ForPrdDsc ;
   private boolean[] H01LO2_n488ForPrdDsc ;
   private java.math.BigDecimal[] H01LO2_A707PrdFacCon ;
   private java.math.BigDecimal[] H01LO2_A1797PrdCanAny ;
   private short[] H01LO2_A811RecLin ;
   private byte[] H01LO2_A1273RecLinPro ;
   private String[] H01LO2_A5725RecLote ;
   private java.math.BigDecimal[] H01LO2_A685PrdCanRes ;
   private java.math.BigDecimal[] H01LO2_A705PrdExiCC ;
   private java.math.BigDecimal[] H01LO2_A704PrdExiAlm ;
   private java.math.BigDecimal[] H01LO2_A431FacCon ;
   private String[] H01LO2_A875RecPrdDsc ;
   private String[] H01LO2_A872RecPrdNum ;
   private short[] H01LO2_A2804RecLinMaq ;
   private String[] H01LO2_A130BarCodPar ;
   private byte[] H01LO2_A132BarCodReo ;
   private int[] H01LO2_A129BarCod ;
   private String[] H01LO2_A396EmprCod ;
   private long[] H01LO3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV33ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV31ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV48DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV18TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV19TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV16WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class cierrerecetastinte_incidencias_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01LO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                          String AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                          String AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                          String AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                          String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                          java.math.BigDecimal AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                          java.math.BigDecimal AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                          java.math.BigDecimal AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                          java.math.BigDecimal AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                          java.math.BigDecimal AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                          java.math.BigDecimal AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                          java.math.BigDecimal AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                          java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                          String AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                          String AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                          byte AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ,
                                          byte AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ,
                                          short AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ,
                                          short AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV5emprcod ,
                                          int A129BarCod ,
                                          int AV6barcod ,
                                          byte A132BarCodReo ,
                                          byte AV7barcodreo ,
                                          String A130BarCodPar ,
                                          String AV8barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV9reclinmaq ,
                                          String AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                          int AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ,
                                          byte AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ,
                                          String AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                          short AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[42];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.PrdNum, T1.PrdCant, T1.ForPrdUMe, T3.ForPrdDsc, T2.PrdFacCon, T1.PrdCanAny, T1.RecLin, T1.RecLinPro, T1.RecLote, T2.PrdCanRes, T2.PrdExiCC, T2.PrdExiAlm, T1.FacCon," ;
      sSelectString += " T1.RecPrdDsc, T1.RecPrdNum, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod" ;
      sFromString = " FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      sFromString += " = T1.ForPrdUMe)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
         GXv_int19[11] = (byte)(1) ;
         GXv_int19[12] = (byte)(1) ;
         GXv_int19[13] = (byte)(1) ;
         GXv_int19[14] = (byte)(1) ;
         GXv_int19[15] = (byte)(1) ;
         GXv_int19[16] = (byte)(1) ;
         GXv_int19[17] = (byte)(1) ;
         GXv_int19[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ( AV22OrderedBy == 1 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro" ;
      }
      else if ( ( AV22OrderedBy == 1 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLinPro DESC" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLin" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLin DESC" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdNum DESC" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.FacCon" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.FacCon DESC" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiAlm" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiCC" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiCC DESC" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdCanRes" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdCanRes DESC" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLote DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H01LO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                          String AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                          String AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                          String AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                          String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                          java.math.BigDecimal AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                          java.math.BigDecimal AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                          java.math.BigDecimal AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                          java.math.BigDecimal AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                          java.math.BigDecimal AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                          java.math.BigDecimal AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                          java.math.BigDecimal AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                          java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                          String AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                          String AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                          byte AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ,
                                          byte AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ,
                                          short AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ,
                                          short AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV5emprcod ,
                                          int A129BarCod ,
                                          int AV6barcod ,
                                          byte A132BarCodReo ,
                                          byte AV7barcodreo ,
                                          String A130BarCodPar ,
                                          String AV8barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV9reclinmaq ,
                                          String AV76Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                          int AV77Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ,
                                          byte AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ,
                                          String AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                          short AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[37];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
         GXv_int21[11] = (byte)(1) ;
         GXv_int21[12] = (byte)(1) ;
         GXv_int21[13] = (byte)(1) ;
         GXv_int21[14] = (byte)(1) ;
         GXv_int21[15] = (byte)(1) ;
         GXv_int21[16] = (byte)(1) ;
         GXv_int21[17] = (byte)(1) ;
         GXv_int21[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV22OrderedBy == 1 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 1 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ( AV23OrderedDsc ) )
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

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H01LO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Boolean) dynConstraints[29]).booleanValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).shortValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() );
            case 1 :
                  return conditional_H01LO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Boolean) dynConstraints[29]).booleanValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).shortValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01LO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01LO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,3);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,4);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[16])[0] = rslt.getString(14, 26);
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((short[]) buf[18])[0] = rslt.getShort(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
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
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
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
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
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
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
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
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               return;
      }
   }

}

