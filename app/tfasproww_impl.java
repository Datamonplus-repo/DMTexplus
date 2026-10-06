package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfasproww_impl extends GXDataArea
{
   public tfasproww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfasproww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasproww_impl.class ));
   }

   public tfasproww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkFasActiva = UIFactory.getCheckbox(this);
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
      AV124FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV59ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV49ColumnsSelector);
      AV138TFFasActiva_Sel = httpContext.GetPar( "TFFasActiva_Sel") ;
      AV61TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV62TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV64TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV65TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV67TFFasSigla = httpContext.GetPar( "TFFasSigla") ;
      AV68TFFasSigla_Sel = httpContext.GetPar( "TFFasSigla_Sel") ;
      AV70TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV71TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV73TFMaqDsc = httpContext.GetPar( "TFMaqDsc") ;
      AV74TFMaqDsc_Sel = httpContext.GetPar( "TFMaqDsc_Sel") ;
      AV76TFFasDec = CommonUtil.decimalVal( httpContext.GetPar( "TFFasDec"), ".") ;
      AV77TFFasDec_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasDec_To"), ".") ;
      AV79TFFasDec2 = CommonUtil.decimalVal( httpContext.GetPar( "TFFasDec2"), ".") ;
      AV80TFFasDec2_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasDec2_To"), ".") ;
      AV82TFFasPreSal = (short)(GXutil.lval( httpContext.GetPar( "TFFasPreSal"))) ;
      AV83TFFasPreSal_To = (short)(GXutil.lval( httpContext.GetPar( "TFFasPreSal_To"))) ;
      AV85TFFasPrePie = (short)(GXutil.lval( httpContext.GetPar( "TFFasPrePie"))) ;
      AV86TFFasPrePie_To = (short)(GXutil.lval( httpContext.GetPar( "TFFasPrePie_To"))) ;
      AV88TFFasVelPro = CommonUtil.decimalVal( httpContext.GetPar( "TFFasVelPro"), ".") ;
      AV89TFFasVelPro_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasVelPro_To"), ".") ;
      AV91TFFasNumPas = (short)(GXutil.lval( httpContext.GetPar( "TFFasNumPas"))) ;
      AV92TFFasNumPas_To = (short)(GXutil.lval( httpContext.GetPar( "TFFasNumPas_To"))) ;
      AV94TFFasActTin = httpContext.GetPar( "TFFasActTin") ;
      AV95TFFasActTin_Sel = httpContext.GetPar( "TFFasActTin_Sel") ;
      AV97TFFasCon = httpContext.GetPar( "TFFasCon") ;
      AV98TFFasCon_Sel = httpContext.GetPar( "TFFasCon_Sel") ;
      AV100TFFasAcab = httpContext.GetPar( "TFFasAcab") ;
      AV101TFFasAcab_Sel = httpContext.GetPar( "TFFasAcab_Sel") ;
      AV103TFFasForMul = httpContext.GetPar( "TFFasForMul") ;
      AV104TFFasForMul_Sel = httpContext.GetPar( "TFFasForMul_Sel") ;
      AV106TFFasConPla = httpContext.GetPar( "TFFasConPla") ;
      AV107TFFasConPla_Sel = httpContext.GetPar( "TFFasConPla_Sel") ;
      AV142Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV139FlagCC = (short)(GXutil.lval( httpContext.GetPar( "FlagCC"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV124FilterFullText, AV59ManageFiltersExecutionStep, AV49ColumnsSelector, AV138TFFasActiva_Sel, AV61TFFasCod, AV62TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFFasSigla, AV68TFFasSigla_Sel, AV70TFMaqCod, AV71TFMaqCod_Sel, AV73TFMaqDsc, AV74TFMaqDsc_Sel, AV76TFFasDec, AV77TFFasDec_To, AV79TFFasDec2, AV80TFFasDec2_To, AV82TFFasPreSal, AV83TFFasPreSal_To, AV85TFFasPrePie, AV86TFFasPrePie_To, AV88TFFasVelPro, AV89TFFasVelPro_To, AV91TFFasNumPas, AV92TFFasNumPas_To, AV94TFFasActTin, AV95TFFasActTin_Sel, AV97TFFasCon, AV98TFFasCon_Sel, AV100TFFasAcab, AV101TFFasAcab_Sel, AV103TFFasForMul, AV104TFFasForMul_Sel, AV106TFFasConPla, AV107TFFasConPla_Sel, AV142Pgmname, AV13OrderedBy, AV14OrderedDsc, AV139FlagCC) ;
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
      pa7N2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start7N2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tfasproww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV139FlagCC), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TFASPROWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tfasproww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV124FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV57ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV57ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV120GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV121GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV118DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV118DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV49ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV49ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV59ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACTIVA_SEL", GXutil.rtrim( AV138TFFasActiva_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD", GXutil.rtrim( AV61TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD_SEL", GXutil.rtrim( AV62TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC", GXutil.rtrim( AV64TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC_SEL", GXutil.rtrim( AV65TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASSIGLA", GXutil.rtrim( AV67TFFasSigla));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASSIGLA_SEL", GXutil.rtrim( AV68TFFasSigla_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD", GXutil.rtrim( AV70TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD_SEL", GXutil.rtrim( AV71TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQDSC", GXutil.rtrim( AV73TFMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQDSC_SEL", GXutil.rtrim( AV74TFMaqDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDEC", GXutil.ltrim( localUtil.ntoc( AV76TFFasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDEC_TO", GXutil.ltrim( localUtil.ntoc( AV77TFFasDec_To, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDEC2", GXutil.ltrim( localUtil.ntoc( AV79TFFasDec2, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDEC2_TO", GXutil.ltrim( localUtil.ntoc( AV80TFFasDec2_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPRESAL", GXutil.ltrim( localUtil.ntoc( AV82TFFasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPRESAL_TO", GXutil.ltrim( localUtil.ntoc( AV83TFFasPreSal_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREPIE", GXutil.ltrim( localUtil.ntoc( AV85TFFasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREPIE_TO", GXutil.ltrim( localUtil.ntoc( AV86TFFasPrePie_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASVELPRO", GXutil.ltrim( localUtil.ntoc( AV88TFFasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASVELPRO_TO", GXutil.ltrim( localUtil.ntoc( AV89TFFasVelPro_To, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASNUMPAS", GXutil.ltrim( localUtil.ntoc( AV91TFFasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASNUMPAS_TO", GXutil.ltrim( localUtil.ntoc( AV92TFFasNumPas_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACTTIN", GXutil.rtrim( AV94TFFasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACTTIN_SEL", GXutil.rtrim( AV95TFFasActTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCON", GXutil.rtrim( AV97TFFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCON_SEL", GXutil.rtrim( AV98TFFasCon_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACAB", GXutil.rtrim( AV100TFFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACAB_SEL", GXutil.rtrim( AV101TFFasAcab_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASFORMUL", GXutil.rtrim( AV103TFFasForMul));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASFORMUL_SEL", GXutil.rtrim( AV104TFFasForMul_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCONPLA", GXutil.rtrim( AV106TFFasConPla));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCONPLA_SEL", GXutil.rtrim( AV107TFFasConPla_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCC", GXutil.ltrim( localUtil.ntoc( AV139FlagCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV139FlagCC), "ZZZ9")));
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
         we7N2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt7N2( ) ;
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
      return formatLink("app.tfasproww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TFASPROWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " FASES", "") ;
   }

   public void wb7N0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_7N2( true) ;
      }
      else
      {
         wb_table1_27_7N2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_7N2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV120GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV121GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV142Pgmname), GXutil.rtrim( localUtil.format( AV142Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPROWW.htm");
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
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV118DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV118DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV49ColumnsSelector);
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

   public void start7N2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " FASES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup7N0( ) ;
   }

   public void ws7N2( )
   {
      start7N2( ) ;
      evt7N2( ) ;
   }

   public void evt7N2( )
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
                           e117N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e127N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e137N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e147N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e157N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e167N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e177N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e187N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e197N2 ();
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
                           AV128GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A14042FasActiva = ((GXutil.strcmp(httpContext.cgiGet( chkFasActiva.getInternalname()), "S")==0) ? "S" : "N") ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A7070FasSigla = httpContext.cgiGet( edtFasSigla_Internalname) ;
                           n7070FasSigla = false ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           n602MaqCod = false ;
                           A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
                           n606MaqDsc = false ;
                           A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
                           n459FasDec = false ;
                           A5990FasDec2 = localUtil.ctond( httpContext.cgiGet( edtFasDec2_Internalname)) ;
                           n5990FasDec2 = false ;
                           A469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreSal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n469FasPreSal = false ;
                           A468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPrePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n468FasPrePie = false ;
                           A472FasVelPro = localUtil.ctond( httpContext.cgiGet( edtFasVelPro_Internalname)) ;
                           n472FasVelPro = false ;
                           A464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( edtFasNumPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n464FasNumPas = false ;
                           A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
                           n456FasActTin = false ;
                           A458FasCon = GXutil.upper( httpContext.cgiGet( edtFasCon_Internalname)) ;
                           n458FasCon = false ;
                           A4903FasAcab = GXutil.upper( httpContext.cgiGet( edtFasAcab_Internalname)) ;
                           n4903FasAcab = false ;
                           A4286FasForMul = GXutil.upper( httpContext.cgiGet( edtFasForMul_Internalname)) ;
                           n4286FasForMul = false ;
                           A4299FasConPla = GXutil.upper( httpContext.cgiGet( edtFasConPla_Internalname)) ;
                           n4299FasConPla = false ;
                           A4343FasEstamp = GXutil.upper( httpContext.cgiGet( edtFasEstamp_Internalname)) ;
                           n4343FasEstamp = false ;
                           A5168FasPreMC = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreMC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n5168FasPreMC = false ;
                           A4791FasValMtr = localUtil.ctond( httpContext.cgiGet( edtFasValMtr_Internalname)) ;
                           n4791FasValMtr = false ;
                           A4588FasCC = GXutil.upper( httpContext.cgiGet( edtFasCC_Internalname)) ;
                           n4588FasCC = false ;
                           A5232FasProCtb = httpContext.cgiGet( edtFasProCtb_Internalname) ;
                           n5232FasProCtb = false ;
                           A5616FasTExt = GXutil.upper( httpContext.cgiGet( edtFasTExt_Internalname)) ;
                           n5616FasTExt = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e207N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e217N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e227N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e237N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV124FilterFullText) != 0 )
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

   public void we7N2( )
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

   public void pa7N2( )
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
                                 String AV124FilterFullText ,
                                 byte AV59ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV49ColumnsSelector ,
                                 String AV138TFFasActiva_Sel ,
                                 String AV61TFFasCod ,
                                 String AV62TFFasCod_Sel ,
                                 String AV64TFFasDsc ,
                                 String AV65TFFasDsc_Sel ,
                                 String AV67TFFasSigla ,
                                 String AV68TFFasSigla_Sel ,
                                 String AV70TFMaqCod ,
                                 String AV71TFMaqCod_Sel ,
                                 String AV73TFMaqDsc ,
                                 String AV74TFMaqDsc_Sel ,
                                 java.math.BigDecimal AV76TFFasDec ,
                                 java.math.BigDecimal AV77TFFasDec_To ,
                                 java.math.BigDecimal AV79TFFasDec2 ,
                                 java.math.BigDecimal AV80TFFasDec2_To ,
                                 short AV82TFFasPreSal ,
                                 short AV83TFFasPreSal_To ,
                                 short AV85TFFasPrePie ,
                                 short AV86TFFasPrePie_To ,
                                 java.math.BigDecimal AV88TFFasVelPro ,
                                 java.math.BigDecimal AV89TFFasVelPro_To ,
                                 short AV91TFFasNumPas ,
                                 short AV92TFFasNumPas_To ,
                                 String AV94TFFasActTin ,
                                 String AV95TFFasActTin_Sel ,
                                 String AV97TFFasCon ,
                                 String AV98TFFasCon_Sel ,
                                 String AV100TFFasAcab ,
                                 String AV101TFFasAcab_Sel ,
                                 String AV103TFFasForMul ,
                                 String AV104TFFasForMul_Sel ,
                                 String AV106TFFasConPla ,
                                 String AV107TFFasConPla_Sel ,
                                 String AV142Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 short AV139FlagCC )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e217N2 ();
      GRID_nCurrentRecord = 0 ;
      rf7N2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TFASPROWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tfasproww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf7N2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV142Pgmname = "TFASPROWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf7N2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e217N2 ();
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
                                              AV143Tfasprowwds_1_filterfulltext ,
                                              AV144Tfasprowwds_2_tffasactiva_sel ,
                                              AV146Tfasprowwds_4_tffascod_sel ,
                                              AV145Tfasprowwds_3_tffascod ,
                                              AV148Tfasprowwds_6_tffasdsc_sel ,
                                              AV147Tfasprowwds_5_tffasdsc ,
                                              AV150Tfasprowwds_8_tffassigla_sel ,
                                              AV149Tfasprowwds_7_tffassigla ,
                                              AV152Tfasprowwds_10_tfmaqcod_sel ,
                                              AV151Tfasprowwds_9_tfmaqcod ,
                                              AV154Tfasprowwds_12_tfmaqdsc_sel ,
                                              AV153Tfasprowwds_11_tfmaqdsc ,
                                              AV155Tfasprowwds_13_tffasdec ,
                                              AV156Tfasprowwds_14_tffasdec_to ,
                                              AV157Tfasprowwds_15_tffasdec2 ,
                                              AV158Tfasprowwds_16_tffasdec2_to ,
                                              Short.valueOf(AV159Tfasprowwds_17_tffaspresal) ,
                                              Short.valueOf(AV160Tfasprowwds_18_tffaspresal_to) ,
                                              Short.valueOf(AV161Tfasprowwds_19_tffasprepie) ,
                                              Short.valueOf(AV162Tfasprowwds_20_tffasprepie_to) ,
                                              AV163Tfasprowwds_21_tffasvelpro ,
                                              AV164Tfasprowwds_22_tffasvelpro_to ,
                                              Short.valueOf(AV165Tfasprowwds_23_tffasnumpas) ,
                                              Short.valueOf(AV166Tfasprowwds_24_tffasnumpas_to) ,
                                              AV168Tfasprowwds_26_tffasacttin_sel ,
                                              AV167Tfasprowwds_25_tffasacttin ,
                                              AV170Tfasprowwds_28_tffascon_sel ,
                                              AV169Tfasprowwds_27_tffascon ,
                                              AV172Tfasprowwds_30_tffasacab_sel ,
                                              AV171Tfasprowwds_29_tffasacab ,
                                              AV174Tfasprowwds_32_tffasformul_sel ,
                                              AV173Tfasprowwds_31_tffasformul ,
                                              AV176Tfasprowwds_34_tffasconpla_sel ,
                                              AV175Tfasprowwds_33_tffasconpla ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A7070FasSigla ,
                                              A602MaqCod ,
                                              A606MaqDsc ,
                                              A459FasDec ,
                                              A5990FasDec2 ,
                                              Short.valueOf(A469FasPreSal) ,
                                              Short.valueOf(A468FasPrePie) ,
                                              A472FasVelPro ,
                                              Short.valueOf(A464FasNumPas) ,
                                              A456FasActTin ,
                                              A458FasCon ,
                                              A4903FasAcab ,
                                              A4286FasForMul ,
                                              A4299FasConPla ,
                                              A14042FasActiva ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
         lV145Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV145Tfasprowwds_3_tffascod), 8, "%") ;
         lV147Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV147Tfasprowwds_5_tffasdsc), 28, "%") ;
         lV149Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV149Tfasprowwds_7_tffassigla), 4, "%") ;
         lV151Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV151Tfasprowwds_9_tfmaqcod), 6, "%") ;
         lV153Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV153Tfasprowwds_11_tfmaqdsc), 16, "%") ;
         lV167Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV167Tfasprowwds_25_tffasacttin), 1, "%") ;
         lV169Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV169Tfasprowwds_27_tffascon), 1, "%") ;
         lV171Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV171Tfasprowwds_29_tffasacab), 1, "%") ;
         lV173Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV173Tfasprowwds_31_tffasformul), 1, "%") ;
         lV175Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV175Tfasprowwds_33_tffasconpla), 1, "%") ;
         /* Using cursor H007N2 */
         pr_default.execute(0, new Object[] {lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, AV144Tfasprowwds_2_tffasactiva_sel, lV145Tfasprowwds_3_tffascod, AV146Tfasprowwds_4_tffascod_sel, lV147Tfasprowwds_5_tffasdsc, AV148Tfasprowwds_6_tffasdsc_sel, lV149Tfasprowwds_7_tffassigla, AV150Tfasprowwds_8_tffassigla_sel, lV151Tfasprowwds_9_tfmaqcod, AV152Tfasprowwds_10_tfmaqcod_sel, lV153Tfasprowwds_11_tfmaqdsc, AV154Tfasprowwds_12_tfmaqdsc_sel, AV155Tfasprowwds_13_tffasdec, AV156Tfasprowwds_14_tffasdec_to, AV157Tfasprowwds_15_tffasdec2, AV158Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV159Tfasprowwds_17_tffaspresal), Short.valueOf(AV160Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV161Tfasprowwds_19_tffasprepie), Short.valueOf(AV162Tfasprowwds_20_tffasprepie_to), AV163Tfasprowwds_21_tffasvelpro, AV164Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV165Tfasprowwds_23_tffasnumpas), Short.valueOf(AV166Tfasprowwds_24_tffasnumpas_to), lV167Tfasprowwds_25_tffasacttin, AV168Tfasprowwds_26_tffasacttin_sel, lV169Tfasprowwds_27_tffascon, AV170Tfasprowwds_28_tffascon_sel, lV171Tfasprowwds_29_tffasacab, AV172Tfasprowwds_30_tffasacab_sel, lV173Tfasprowwds_31_tffasformul, AV174Tfasprowwds_32_tffasformul_sel, lV175Tfasprowwds_33_tffasconpla, AV176Tfasprowwds_34_tffasconpla_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5616FasTExt = H007N2_A5616FasTExt[0] ;
            n5616FasTExt = H007N2_n5616FasTExt[0] ;
            A5232FasProCtb = H007N2_A5232FasProCtb[0] ;
            n5232FasProCtb = H007N2_n5232FasProCtb[0] ;
            A4588FasCC = H007N2_A4588FasCC[0] ;
            n4588FasCC = H007N2_n4588FasCC[0] ;
            A4791FasValMtr = H007N2_A4791FasValMtr[0] ;
            n4791FasValMtr = H007N2_n4791FasValMtr[0] ;
            A5168FasPreMC = H007N2_A5168FasPreMC[0] ;
            n5168FasPreMC = H007N2_n5168FasPreMC[0] ;
            A4343FasEstamp = H007N2_A4343FasEstamp[0] ;
            n4343FasEstamp = H007N2_n4343FasEstamp[0] ;
            A4299FasConPla = H007N2_A4299FasConPla[0] ;
            n4299FasConPla = H007N2_n4299FasConPla[0] ;
            A4286FasForMul = H007N2_A4286FasForMul[0] ;
            n4286FasForMul = H007N2_n4286FasForMul[0] ;
            A4903FasAcab = H007N2_A4903FasAcab[0] ;
            n4903FasAcab = H007N2_n4903FasAcab[0] ;
            A458FasCon = H007N2_A458FasCon[0] ;
            n458FasCon = H007N2_n458FasCon[0] ;
            A456FasActTin = H007N2_A456FasActTin[0] ;
            n456FasActTin = H007N2_n456FasActTin[0] ;
            A464FasNumPas = H007N2_A464FasNumPas[0] ;
            n464FasNumPas = H007N2_n464FasNumPas[0] ;
            A472FasVelPro = H007N2_A472FasVelPro[0] ;
            n472FasVelPro = H007N2_n472FasVelPro[0] ;
            A468FasPrePie = H007N2_A468FasPrePie[0] ;
            n468FasPrePie = H007N2_n468FasPrePie[0] ;
            A469FasPreSal = H007N2_A469FasPreSal[0] ;
            n469FasPreSal = H007N2_n469FasPreSal[0] ;
            A5990FasDec2 = H007N2_A5990FasDec2[0] ;
            n5990FasDec2 = H007N2_n5990FasDec2[0] ;
            A459FasDec = H007N2_A459FasDec[0] ;
            n459FasDec = H007N2_n459FasDec[0] ;
            A606MaqDsc = H007N2_A606MaqDsc[0] ;
            n606MaqDsc = H007N2_n606MaqDsc[0] ;
            A602MaqCod = H007N2_A602MaqCod[0] ;
            n602MaqCod = H007N2_n602MaqCod[0] ;
            A7070FasSigla = H007N2_A7070FasSigla[0] ;
            n7070FasSigla = H007N2_n7070FasSigla[0] ;
            A460FasDsc = H007N2_A460FasDsc[0] ;
            A457FasCod = H007N2_A457FasCod[0] ;
            A14042FasActiva = H007N2_A14042FasActiva[0] ;
            A396EmprCod = H007N2_A396EmprCod[0] ;
            A606MaqDsc = H007N2_A606MaqDsc[0] ;
            n606MaqDsc = H007N2_n606MaqDsc[0] ;
            e227N2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb7N0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes7N2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCC", GXutil.ltrim( localUtil.ntoc( AV139FlagCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV139FlagCC), "ZZZ9")));
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
      AV143Tfasprowwds_1_filterfulltext = AV124FilterFullText ;
      AV144Tfasprowwds_2_tffasactiva_sel = AV138TFFasActiva_Sel ;
      AV145Tfasprowwds_3_tffascod = AV61TFFasCod ;
      AV146Tfasprowwds_4_tffascod_sel = AV62TFFasCod_Sel ;
      AV147Tfasprowwds_5_tffasdsc = AV64TFFasDsc ;
      AV148Tfasprowwds_6_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV149Tfasprowwds_7_tffassigla = AV67TFFasSigla ;
      AV150Tfasprowwds_8_tffassigla_sel = AV68TFFasSigla_Sel ;
      AV151Tfasprowwds_9_tfmaqcod = AV70TFMaqCod ;
      AV152Tfasprowwds_10_tfmaqcod_sel = AV71TFMaqCod_Sel ;
      AV153Tfasprowwds_11_tfmaqdsc = AV73TFMaqDsc ;
      AV154Tfasprowwds_12_tfmaqdsc_sel = AV74TFMaqDsc_Sel ;
      AV155Tfasprowwds_13_tffasdec = AV76TFFasDec ;
      AV156Tfasprowwds_14_tffasdec_to = AV77TFFasDec_To ;
      AV157Tfasprowwds_15_tffasdec2 = AV79TFFasDec2 ;
      AV158Tfasprowwds_16_tffasdec2_to = AV80TFFasDec2_To ;
      AV159Tfasprowwds_17_tffaspresal = AV82TFFasPreSal ;
      AV160Tfasprowwds_18_tffaspresal_to = AV83TFFasPreSal_To ;
      AV161Tfasprowwds_19_tffasprepie = AV85TFFasPrePie ;
      AV162Tfasprowwds_20_tffasprepie_to = AV86TFFasPrePie_To ;
      AV163Tfasprowwds_21_tffasvelpro = AV88TFFasVelPro ;
      AV164Tfasprowwds_22_tffasvelpro_to = AV89TFFasVelPro_To ;
      AV165Tfasprowwds_23_tffasnumpas = AV91TFFasNumPas ;
      AV166Tfasprowwds_24_tffasnumpas_to = AV92TFFasNumPas_To ;
      AV167Tfasprowwds_25_tffasacttin = AV94TFFasActTin ;
      AV168Tfasprowwds_26_tffasacttin_sel = AV95TFFasActTin_Sel ;
      AV169Tfasprowwds_27_tffascon = AV97TFFasCon ;
      AV170Tfasprowwds_28_tffascon_sel = AV98TFFasCon_Sel ;
      AV171Tfasprowwds_29_tffasacab = AV100TFFasAcab ;
      AV172Tfasprowwds_30_tffasacab_sel = AV101TFFasAcab_Sel ;
      AV173Tfasprowwds_31_tffasformul = AV103TFFasForMul ;
      AV174Tfasprowwds_32_tffasformul_sel = AV104TFFasForMul_Sel ;
      AV175Tfasprowwds_33_tffasconpla = AV106TFFasConPla ;
      AV176Tfasprowwds_34_tffasconpla_sel = AV107TFFasConPla_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV143Tfasprowwds_1_filterfulltext ,
                                           AV144Tfasprowwds_2_tffasactiva_sel ,
                                           AV146Tfasprowwds_4_tffascod_sel ,
                                           AV145Tfasprowwds_3_tffascod ,
                                           AV148Tfasprowwds_6_tffasdsc_sel ,
                                           AV147Tfasprowwds_5_tffasdsc ,
                                           AV150Tfasprowwds_8_tffassigla_sel ,
                                           AV149Tfasprowwds_7_tffassigla ,
                                           AV152Tfasprowwds_10_tfmaqcod_sel ,
                                           AV151Tfasprowwds_9_tfmaqcod ,
                                           AV154Tfasprowwds_12_tfmaqdsc_sel ,
                                           AV153Tfasprowwds_11_tfmaqdsc ,
                                           AV155Tfasprowwds_13_tffasdec ,
                                           AV156Tfasprowwds_14_tffasdec_to ,
                                           AV157Tfasprowwds_15_tffasdec2 ,
                                           AV158Tfasprowwds_16_tffasdec2_to ,
                                           Short.valueOf(AV159Tfasprowwds_17_tffaspresal) ,
                                           Short.valueOf(AV160Tfasprowwds_18_tffaspresal_to) ,
                                           Short.valueOf(AV161Tfasprowwds_19_tffasprepie) ,
                                           Short.valueOf(AV162Tfasprowwds_20_tffasprepie_to) ,
                                           AV163Tfasprowwds_21_tffasvelpro ,
                                           AV164Tfasprowwds_22_tffasvelpro_to ,
                                           Short.valueOf(AV165Tfasprowwds_23_tffasnumpas) ,
                                           Short.valueOf(AV166Tfasprowwds_24_tffasnumpas_to) ,
                                           AV168Tfasprowwds_26_tffasacttin_sel ,
                                           AV167Tfasprowwds_25_tffasacttin ,
                                           AV170Tfasprowwds_28_tffascon_sel ,
                                           AV169Tfasprowwds_27_tffascon ,
                                           AV172Tfasprowwds_30_tffasacab_sel ,
                                           AV171Tfasprowwds_29_tffasacab ,
                                           AV174Tfasprowwds_32_tffasformul_sel ,
                                           AV173Tfasprowwds_31_tffasformul ,
                                           AV176Tfasprowwds_34_tffasconpla_sel ,
                                           AV175Tfasprowwds_33_tffasconpla ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A7070FasSigla ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A459FasDec ,
                                           A5990FasDec2 ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           A14042FasActiva ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV143Tfasprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV143Tfasprowwds_1_filterfulltext), "%", "") ;
      lV145Tfasprowwds_3_tffascod = GXutil.padr( GXutil.rtrim( AV145Tfasprowwds_3_tffascod), 8, "%") ;
      lV147Tfasprowwds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV147Tfasprowwds_5_tffasdsc), 28, "%") ;
      lV149Tfasprowwds_7_tffassigla = GXutil.padr( GXutil.rtrim( AV149Tfasprowwds_7_tffassigla), 4, "%") ;
      lV151Tfasprowwds_9_tfmaqcod = GXutil.padr( GXutil.rtrim( AV151Tfasprowwds_9_tfmaqcod), 6, "%") ;
      lV153Tfasprowwds_11_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV153Tfasprowwds_11_tfmaqdsc), 16, "%") ;
      lV167Tfasprowwds_25_tffasacttin = GXutil.padr( GXutil.rtrim( AV167Tfasprowwds_25_tffasacttin), 1, "%") ;
      lV169Tfasprowwds_27_tffascon = GXutil.padr( GXutil.rtrim( AV169Tfasprowwds_27_tffascon), 1, "%") ;
      lV171Tfasprowwds_29_tffasacab = GXutil.padr( GXutil.rtrim( AV171Tfasprowwds_29_tffasacab), 1, "%") ;
      lV173Tfasprowwds_31_tffasformul = GXutil.padr( GXutil.rtrim( AV173Tfasprowwds_31_tffasformul), 1, "%") ;
      lV175Tfasprowwds_33_tffasconpla = GXutil.padr( GXutil.rtrim( AV175Tfasprowwds_33_tffasconpla), 1, "%") ;
      /* Using cursor H007N3 */
      pr_default.execute(1, new Object[] {lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, lV143Tfasprowwds_1_filterfulltext, AV144Tfasprowwds_2_tffasactiva_sel, lV145Tfasprowwds_3_tffascod, AV146Tfasprowwds_4_tffascod_sel, lV147Tfasprowwds_5_tffasdsc, AV148Tfasprowwds_6_tffasdsc_sel, lV149Tfasprowwds_7_tffassigla, AV150Tfasprowwds_8_tffassigla_sel, lV151Tfasprowwds_9_tfmaqcod, AV152Tfasprowwds_10_tfmaqcod_sel, lV153Tfasprowwds_11_tfmaqdsc, AV154Tfasprowwds_12_tfmaqdsc_sel, AV155Tfasprowwds_13_tffasdec, AV156Tfasprowwds_14_tffasdec_to, AV157Tfasprowwds_15_tffasdec2, AV158Tfasprowwds_16_tffasdec2_to, Short.valueOf(AV159Tfasprowwds_17_tffaspresal), Short.valueOf(AV160Tfasprowwds_18_tffaspresal_to), Short.valueOf(AV161Tfasprowwds_19_tffasprepie), Short.valueOf(AV162Tfasprowwds_20_tffasprepie_to), AV163Tfasprowwds_21_tffasvelpro, AV164Tfasprowwds_22_tffasvelpro_to, Short.valueOf(AV165Tfasprowwds_23_tffasnumpas), Short.valueOf(AV166Tfasprowwds_24_tffasnumpas_to), lV167Tfasprowwds_25_tffasacttin, AV168Tfasprowwds_26_tffasacttin_sel, lV169Tfasprowwds_27_tffascon, AV170Tfasprowwds_28_tffascon_sel, lV171Tfasprowwds_29_tffasacab, AV172Tfasprowwds_30_tffasacab_sel, lV173Tfasprowwds_31_tffasformul, AV174Tfasprowwds_32_tffasformul_sel, lV175Tfasprowwds_33_tffasconpla, AV176Tfasprowwds_34_tffasconpla_sel});
      GRID_nRecordCount = H007N3_AGRID_nRecordCount[0] ;
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
      AV143Tfasprowwds_1_filterfulltext = AV124FilterFullText ;
      AV144Tfasprowwds_2_tffasactiva_sel = AV138TFFasActiva_Sel ;
      AV145Tfasprowwds_3_tffascod = AV61TFFasCod ;
      AV146Tfasprowwds_4_tffascod_sel = AV62TFFasCod_Sel ;
      AV147Tfasprowwds_5_tffasdsc = AV64TFFasDsc ;
      AV148Tfasprowwds_6_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV149Tfasprowwds_7_tffassigla = AV67TFFasSigla ;
      AV150Tfasprowwds_8_tffassigla_sel = AV68TFFasSigla_Sel ;
      AV151Tfasprowwds_9_tfmaqcod = AV70TFMaqCod ;
      AV152Tfasprowwds_10_tfmaqcod_sel = AV71TFMaqCod_Sel ;
      AV153Tfasprowwds_11_tfmaqdsc = AV73TFMaqDsc ;
      AV154Tfasprowwds_12_tfmaqdsc_sel = AV74TFMaqDsc_Sel ;
      AV155Tfasprowwds_13_tffasdec = AV76TFFasDec ;
      AV156Tfasprowwds_14_tffasdec_to = AV77TFFasDec_To ;
      AV157Tfasprowwds_15_tffasdec2 = AV79TFFasDec2 ;
      AV158Tfasprowwds_16_tffasdec2_to = AV80TFFasDec2_To ;
      AV159Tfasprowwds_17_tffaspresal = AV82TFFasPreSal ;
      AV160Tfasprowwds_18_tffaspresal_to = AV83TFFasPreSal_To ;
      AV161Tfasprowwds_19_tffasprepie = AV85TFFasPrePie ;
      AV162Tfasprowwds_20_tffasprepie_to = AV86TFFasPrePie_To ;
      AV163Tfasprowwds_21_tffasvelpro = AV88TFFasVelPro ;
      AV164Tfasprowwds_22_tffasvelpro_to = AV89TFFasVelPro_To ;
      AV165Tfasprowwds_23_tffasnumpas = AV91TFFasNumPas ;
      AV166Tfasprowwds_24_tffasnumpas_to = AV92TFFasNumPas_To ;
      AV167Tfasprowwds_25_tffasacttin = AV94TFFasActTin ;
      AV168Tfasprowwds_26_tffasacttin_sel = AV95TFFasActTin_Sel ;
      AV169Tfasprowwds_27_tffascon = AV97TFFasCon ;
      AV170Tfasprowwds_28_tffascon_sel = AV98TFFasCon_Sel ;
      AV171Tfasprowwds_29_tffasacab = AV100TFFasAcab ;
      AV172Tfasprowwds_30_tffasacab_sel = AV101TFFasAcab_Sel ;
      AV173Tfasprowwds_31_tffasformul = AV103TFFasForMul ;
      AV174Tfasprowwds_32_tffasformul_sel = AV104TFFasForMul_Sel ;
      AV175Tfasprowwds_33_tffasconpla = AV106TFFasConPla ;
      AV176Tfasprowwds_34_tffasconpla_sel = AV107TFFasConPla_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV124FilterFullText, AV59ManageFiltersExecutionStep, AV49ColumnsSelector, AV138TFFasActiva_Sel, AV61TFFasCod, AV62TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFFasSigla, AV68TFFasSigla_Sel, AV70TFMaqCod, AV71TFMaqCod_Sel, AV73TFMaqDsc, AV74TFMaqDsc_Sel, AV76TFFasDec, AV77TFFasDec_To, AV79TFFasDec2, AV80TFFasDec2_To, AV82TFFasPreSal, AV83TFFasPreSal_To, AV85TFFasPrePie, AV86TFFasPrePie_To, AV88TFFasVelPro, AV89TFFasVelPro_To, AV91TFFasNumPas, AV92TFFasNumPas_To, AV94TFFasActTin, AV95TFFasActTin_Sel, AV97TFFasCon, AV98TFFasCon_Sel, AV100TFFasAcab, AV101TFFasAcab_Sel, AV103TFFasForMul, AV104TFFasForMul_Sel, AV106TFFasConPla, AV107TFFasConPla_Sel, AV142Pgmname, AV13OrderedBy, AV14OrderedDsc, AV139FlagCC) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV143Tfasprowwds_1_filterfulltext = AV124FilterFullText ;
      AV144Tfasprowwds_2_tffasactiva_sel = AV138TFFasActiva_Sel ;
      AV145Tfasprowwds_3_tffascod = AV61TFFasCod ;
      AV146Tfasprowwds_4_tffascod_sel = AV62TFFasCod_Sel ;
      AV147Tfasprowwds_5_tffasdsc = AV64TFFasDsc ;
      AV148Tfasprowwds_6_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV149Tfasprowwds_7_tffassigla = AV67TFFasSigla ;
      AV150Tfasprowwds_8_tffassigla_sel = AV68TFFasSigla_Sel ;
      AV151Tfasprowwds_9_tfmaqcod = AV70TFMaqCod ;
      AV152Tfasprowwds_10_tfmaqcod_sel = AV71TFMaqCod_Sel ;
      AV153Tfasprowwds_11_tfmaqdsc = AV73TFMaqDsc ;
      AV154Tfasprowwds_12_tfmaqdsc_sel = AV74TFMaqDsc_Sel ;
      AV155Tfasprowwds_13_tffasdec = AV76TFFasDec ;
      AV156Tfasprowwds_14_tffasdec_to = AV77TFFasDec_To ;
      AV157Tfasprowwds_15_tffasdec2 = AV79TFFasDec2 ;
      AV158Tfasprowwds_16_tffasdec2_to = AV80TFFasDec2_To ;
      AV159Tfasprowwds_17_tffaspresal = AV82TFFasPreSal ;
      AV160Tfasprowwds_18_tffaspresal_to = AV83TFFasPreSal_To ;
      AV161Tfasprowwds_19_tffasprepie = AV85TFFasPrePie ;
      AV162Tfasprowwds_20_tffasprepie_to = AV86TFFasPrePie_To ;
      AV163Tfasprowwds_21_tffasvelpro = AV88TFFasVelPro ;
      AV164Tfasprowwds_22_tffasvelpro_to = AV89TFFasVelPro_To ;
      AV165Tfasprowwds_23_tffasnumpas = AV91TFFasNumPas ;
      AV166Tfasprowwds_24_tffasnumpas_to = AV92TFFasNumPas_To ;
      AV167Tfasprowwds_25_tffasacttin = AV94TFFasActTin ;
      AV168Tfasprowwds_26_tffasacttin_sel = AV95TFFasActTin_Sel ;
      AV169Tfasprowwds_27_tffascon = AV97TFFasCon ;
      AV170Tfasprowwds_28_tffascon_sel = AV98TFFasCon_Sel ;
      AV171Tfasprowwds_29_tffasacab = AV100TFFasAcab ;
      AV172Tfasprowwds_30_tffasacab_sel = AV101TFFasAcab_Sel ;
      AV173Tfasprowwds_31_tffasformul = AV103TFFasForMul ;
      AV174Tfasprowwds_32_tffasformul_sel = AV104TFFasForMul_Sel ;
      AV175Tfasprowwds_33_tffasconpla = AV106TFFasConPla ;
      AV176Tfasprowwds_34_tffasconpla_sel = AV107TFFasConPla_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV124FilterFullText, AV59ManageFiltersExecutionStep, AV49ColumnsSelector, AV138TFFasActiva_Sel, AV61TFFasCod, AV62TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFFasSigla, AV68TFFasSigla_Sel, AV70TFMaqCod, AV71TFMaqCod_Sel, AV73TFMaqDsc, AV74TFMaqDsc_Sel, AV76TFFasDec, AV77TFFasDec_To, AV79TFFasDec2, AV80TFFasDec2_To, AV82TFFasPreSal, AV83TFFasPreSal_To, AV85TFFasPrePie, AV86TFFasPrePie_To, AV88TFFasVelPro, AV89TFFasVelPro_To, AV91TFFasNumPas, AV92TFFasNumPas_To, AV94TFFasActTin, AV95TFFasActTin_Sel, AV97TFFasCon, AV98TFFasCon_Sel, AV100TFFasAcab, AV101TFFasAcab_Sel, AV103TFFasForMul, AV104TFFasForMul_Sel, AV106TFFasConPla, AV107TFFasConPla_Sel, AV142Pgmname, AV13OrderedBy, AV14OrderedDsc, AV139FlagCC) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV143Tfasprowwds_1_filterfulltext = AV124FilterFullText ;
      AV144Tfasprowwds_2_tffasactiva_sel = AV138TFFasActiva_Sel ;
      AV145Tfasprowwds_3_tffascod = AV61TFFasCod ;
      AV146Tfasprowwds_4_tffascod_sel = AV62TFFasCod_Sel ;
      AV147Tfasprowwds_5_tffasdsc = AV64TFFasDsc ;
      AV148Tfasprowwds_6_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV149Tfasprowwds_7_tffassigla = AV67TFFasSigla ;
      AV150Tfasprowwds_8_tffassigla_sel = AV68TFFasSigla_Sel ;
      AV151Tfasprowwds_9_tfmaqcod = AV70TFMaqCod ;
      AV152Tfasprowwds_10_tfmaqcod_sel = AV71TFMaqCod_Sel ;
      AV153Tfasprowwds_11_tfmaqdsc = AV73TFMaqDsc ;
      AV154Tfasprowwds_12_tfmaqdsc_sel = AV74TFMaqDsc_Sel ;
      AV155Tfasprowwds_13_tffasdec = AV76TFFasDec ;
      AV156Tfasprowwds_14_tffasdec_to = AV77TFFasDec_To ;
      AV157Tfasprowwds_15_tffasdec2 = AV79TFFasDec2 ;
      AV158Tfasprowwds_16_tffasdec2_to = AV80TFFasDec2_To ;
      AV159Tfasprowwds_17_tffaspresal = AV82TFFasPreSal ;
      AV160Tfasprowwds_18_tffaspresal_to = AV83TFFasPreSal_To ;
      AV161Tfasprowwds_19_tffasprepie = AV85TFFasPrePie ;
      AV162Tfasprowwds_20_tffasprepie_to = AV86TFFasPrePie_To ;
      AV163Tfasprowwds_21_tffasvelpro = AV88TFFasVelPro ;
      AV164Tfasprowwds_22_tffasvelpro_to = AV89TFFasVelPro_To ;
      AV165Tfasprowwds_23_tffasnumpas = AV91TFFasNumPas ;
      AV166Tfasprowwds_24_tffasnumpas_to = AV92TFFasNumPas_To ;
      AV167Tfasprowwds_25_tffasacttin = AV94TFFasActTin ;
      AV168Tfasprowwds_26_tffasacttin_sel = AV95TFFasActTin_Sel ;
      AV169Tfasprowwds_27_tffascon = AV97TFFasCon ;
      AV170Tfasprowwds_28_tffascon_sel = AV98TFFasCon_Sel ;
      AV171Tfasprowwds_29_tffasacab = AV100TFFasAcab ;
      AV172Tfasprowwds_30_tffasacab_sel = AV101TFFasAcab_Sel ;
      AV173Tfasprowwds_31_tffasformul = AV103TFFasForMul ;
      AV174Tfasprowwds_32_tffasformul_sel = AV104TFFasForMul_Sel ;
      AV175Tfasprowwds_33_tffasconpla = AV106TFFasConPla ;
      AV176Tfasprowwds_34_tffasconpla_sel = AV107TFFasConPla_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV124FilterFullText, AV59ManageFiltersExecutionStep, AV49ColumnsSelector, AV138TFFasActiva_Sel, AV61TFFasCod, AV62TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFFasSigla, AV68TFFasSigla_Sel, AV70TFMaqCod, AV71TFMaqCod_Sel, AV73TFMaqDsc, AV74TFMaqDsc_Sel, AV76TFFasDec, AV77TFFasDec_To, AV79TFFasDec2, AV80TFFasDec2_To, AV82TFFasPreSal, AV83TFFasPreSal_To, AV85TFFasPrePie, AV86TFFasPrePie_To, AV88TFFasVelPro, AV89TFFasVelPro_To, AV91TFFasNumPas, AV92TFFasNumPas_To, AV94TFFasActTin, AV95TFFasActTin_Sel, AV97TFFasCon, AV98TFFasCon_Sel, AV100TFFasAcab, AV101TFFasAcab_Sel, AV103TFFasForMul, AV104TFFasForMul_Sel, AV106TFFasConPla, AV107TFFasConPla_Sel, AV142Pgmname, AV13OrderedBy, AV14OrderedDsc, AV139FlagCC) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV143Tfasprowwds_1_filterfulltext = AV124FilterFullText ;
      AV144Tfasprowwds_2_tffasactiva_sel = AV138TFFasActiva_Sel ;
      AV145Tfasprowwds_3_tffascod = AV61TFFasCod ;
      AV146Tfasprowwds_4_tffascod_sel = AV62TFFasCod_Sel ;
      AV147Tfasprowwds_5_tffasdsc = AV64TFFasDsc ;
      AV148Tfasprowwds_6_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV149Tfasprowwds_7_tffassigla = AV67TFFasSigla ;
      AV150Tfasprowwds_8_tffassigla_sel = AV68TFFasSigla_Sel ;
      AV151Tfasprowwds_9_tfmaqcod = AV70TFMaqCod ;
      AV152Tfasprowwds_10_tfmaqcod_sel = AV71TFMaqCod_Sel ;
      AV153Tfasprowwds_11_tfmaqdsc = AV73TFMaqDsc ;
      AV154Tfasprowwds_12_tfmaqdsc_sel = AV74TFMaqDsc_Sel ;
      AV155Tfasprowwds_13_tffasdec = AV76TFFasDec ;
      AV156Tfasprowwds_14_tffasdec_to = AV77TFFasDec_To ;
      AV157Tfasprowwds_15_tffasdec2 = AV79TFFasDec2 ;
      AV158Tfasprowwds_16_tffasdec2_to = AV80TFFasDec2_To ;
      AV159Tfasprowwds_17_tffaspresal = AV82TFFasPreSal ;
      AV160Tfasprowwds_18_tffaspresal_to = AV83TFFasPreSal_To ;
      AV161Tfasprowwds_19_tffasprepie = AV85TFFasPrePie ;
      AV162Tfasprowwds_20_tffasprepie_to = AV86TFFasPrePie_To ;
      AV163Tfasprowwds_21_tffasvelpro = AV88TFFasVelPro ;
      AV164Tfasprowwds_22_tffasvelpro_to = AV89TFFasVelPro_To ;
      AV165Tfasprowwds_23_tffasnumpas = AV91TFFasNumPas ;
      AV166Tfasprowwds_24_tffasnumpas_to = AV92TFFasNumPas_To ;
      AV167Tfasprowwds_25_tffasacttin = AV94TFFasActTin ;
      AV168Tfasprowwds_26_tffasacttin_sel = AV95TFFasActTin_Sel ;
      AV169Tfasprowwds_27_tffascon = AV97TFFasCon ;
      AV170Tfasprowwds_28_tffascon_sel = AV98TFFasCon_Sel ;
      AV171Tfasprowwds_29_tffasacab = AV100TFFasAcab ;
      AV172Tfasprowwds_30_tffasacab_sel = AV101TFFasAcab_Sel ;
      AV173Tfasprowwds_31_tffasformul = AV103TFFasForMul ;
      AV174Tfasprowwds_32_tffasformul_sel = AV104TFFasForMul_Sel ;
      AV175Tfasprowwds_33_tffasconpla = AV106TFFasConPla ;
      AV176Tfasprowwds_34_tffasconpla_sel = AV107TFFasConPla_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV124FilterFullText, AV59ManageFiltersExecutionStep, AV49ColumnsSelector, AV138TFFasActiva_Sel, AV61TFFasCod, AV62TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFFasSigla, AV68TFFasSigla_Sel, AV70TFMaqCod, AV71TFMaqCod_Sel, AV73TFMaqDsc, AV74TFMaqDsc_Sel, AV76TFFasDec, AV77TFFasDec_To, AV79TFFasDec2, AV80TFFasDec2_To, AV82TFFasPreSal, AV83TFFasPreSal_To, AV85TFFasPrePie, AV86TFFasPrePie_To, AV88TFFasVelPro, AV89TFFasVelPro_To, AV91TFFasNumPas, AV92TFFasNumPas_To, AV94TFFasActTin, AV95TFFasActTin_Sel, AV97TFFasCon, AV98TFFasCon_Sel, AV100TFFasAcab, AV101TFFasAcab_Sel, AV103TFFasForMul, AV104TFFasForMul_Sel, AV106TFFasConPla, AV107TFFasConPla_Sel, AV142Pgmname, AV13OrderedBy, AV14OrderedDsc, AV139FlagCC) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV143Tfasprowwds_1_filterfulltext = AV124FilterFullText ;
      AV144Tfasprowwds_2_tffasactiva_sel = AV138TFFasActiva_Sel ;
      AV145Tfasprowwds_3_tffascod = AV61TFFasCod ;
      AV146Tfasprowwds_4_tffascod_sel = AV62TFFasCod_Sel ;
      AV147Tfasprowwds_5_tffasdsc = AV64TFFasDsc ;
      AV148Tfasprowwds_6_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV149Tfasprowwds_7_tffassigla = AV67TFFasSigla ;
      AV150Tfasprowwds_8_tffassigla_sel = AV68TFFasSigla_Sel ;
      AV151Tfasprowwds_9_tfmaqcod = AV70TFMaqCod ;
      AV152Tfasprowwds_10_tfmaqcod_sel = AV71TFMaqCod_Sel ;
      AV153Tfasprowwds_11_tfmaqdsc = AV73TFMaqDsc ;
      AV154Tfasprowwds_12_tfmaqdsc_sel = AV74TFMaqDsc_Sel ;
      AV155Tfasprowwds_13_tffasdec = AV76TFFasDec ;
      AV156Tfasprowwds_14_tffasdec_to = AV77TFFasDec_To ;
      AV157Tfasprowwds_15_tffasdec2 = AV79TFFasDec2 ;
      AV158Tfasprowwds_16_tffasdec2_to = AV80TFFasDec2_To ;
      AV159Tfasprowwds_17_tffaspresal = AV82TFFasPreSal ;
      AV160Tfasprowwds_18_tffaspresal_to = AV83TFFasPreSal_To ;
      AV161Tfasprowwds_19_tffasprepie = AV85TFFasPrePie ;
      AV162Tfasprowwds_20_tffasprepie_to = AV86TFFasPrePie_To ;
      AV163Tfasprowwds_21_tffasvelpro = AV88TFFasVelPro ;
      AV164Tfasprowwds_22_tffasvelpro_to = AV89TFFasVelPro_To ;
      AV165Tfasprowwds_23_tffasnumpas = AV91TFFasNumPas ;
      AV166Tfasprowwds_24_tffasnumpas_to = AV92TFFasNumPas_To ;
      AV167Tfasprowwds_25_tffasacttin = AV94TFFasActTin ;
      AV168Tfasprowwds_26_tffasacttin_sel = AV95TFFasActTin_Sel ;
      AV169Tfasprowwds_27_tffascon = AV97TFFasCon ;
      AV170Tfasprowwds_28_tffascon_sel = AV98TFFasCon_Sel ;
      AV171Tfasprowwds_29_tffasacab = AV100TFFasAcab ;
      AV172Tfasprowwds_30_tffasacab_sel = AV101TFFasAcab_Sel ;
      AV173Tfasprowwds_31_tffasformul = AV103TFFasForMul ;
      AV174Tfasprowwds_32_tffasformul_sel = AV104TFFasForMul_Sel ;
      AV175Tfasprowwds_33_tffasconpla = AV106TFFasConPla ;
      AV176Tfasprowwds_34_tffasconpla_sel = AV107TFFasConPla_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV124FilterFullText, AV59ManageFiltersExecutionStep, AV49ColumnsSelector, AV138TFFasActiva_Sel, AV61TFFasCod, AV62TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFFasSigla, AV68TFFasSigla_Sel, AV70TFMaqCod, AV71TFMaqCod_Sel, AV73TFMaqDsc, AV74TFMaqDsc_Sel, AV76TFFasDec, AV77TFFasDec_To, AV79TFFasDec2, AV80TFFasDec2_To, AV82TFFasPreSal, AV83TFFasPreSal_To, AV85TFFasPrePie, AV86TFFasPrePie_To, AV88TFFasVelPro, AV89TFFasVelPro_To, AV91TFFasNumPas, AV92TFFasNumPas_To, AV94TFFasActTin, AV95TFFasActTin_Sel, AV97TFFasCon, AV98TFFasCon_Sel, AV100TFFasAcab, AV101TFFasAcab_Sel, AV103TFFasForMul, AV104TFFasForMul_Sel, AV106TFFasConPla, AV107TFFasConPla_Sel, AV142Pgmname, AV13OrderedBy, AV14OrderedDsc, AV139FlagCC) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV142Pgmname = "TFASPROWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup7N0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e207N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV57ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV118DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV49ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV120GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV121GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV124FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124FilterFullText", AV124FilterFullText);
         AV142Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TFASPROWW");
         AV142Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tfasproww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV124FilterFullText) != 0 )
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
      e207N2 ();
      if (returnInSub) return;
   }

   public void e207N2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV132Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tfasproww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV132Station = GXt_char1 ;
      GXv_char2[0] = AV131EmprCod ;
      GXv_char3[0] = AV133EmprNom ;
      GXv_char4[0] = AV134UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV132Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfasproww_impl.this.AV131EmprCod = GXv_char2[0] ;
      tfasproww_impl.this.AV133EmprNom = GXv_char3[0] ;
      tfasproww_impl.this.AV134UsurCod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " FASES", "") );
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
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV118DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV118DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV130Parfss) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV131EmprCod, httpContext.getMessage( "PARFSS", ""), GXv_int8) ;
      tfasproww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV130Parfss = GXt_int7 ;
      GXt_int7 = (byte)(AV135Faspq) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV131EmprCod, httpContext.getMessage( "FASPQ", ""), GXv_int8) ;
      tfasproww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV135Faspq = GXt_int7 ;
      GXt_int7 = (byte)(AV139FlagCC) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV131EmprCod, httpContext.getMessage( "CC", ""), GXv_int8) ;
      tfasproww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV139FlagCC = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV139FlagCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139FlagCC), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV139FlagCC), "ZZZ9")));
   }

   public void e217N2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV59ManageFiltersExecutionStep == 1 )
      {
         AV59ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV59ManageFiltersExecutionStep == 2 )
      {
         AV59ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV56Session.getValue("TFASPROWWColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV56Session.getValue("TFASPROWWColumnsSelector") ;
         AV49ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      chkFasActiva.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkFasActiva.getInternalname(), "Visible", GXutil.ltrimstr( chkFasActiva.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasSigla_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasSigla_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasSigla_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasDec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasDec2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec2_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasPreSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasPrePie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPrePie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasVelPro_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasVelPro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasNumPas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasNumPas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasActTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasCon_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasAcab_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasAcab_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAcab_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasForMul_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFasConPla_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV49ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasConPla_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasConPla_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV120GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120GridCurrentPage), 10, 0));
      AV121GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121GridPageCount), 10, 0));
      AV143Tfasprowwds_1_filterfulltext = AV124FilterFullText ;
      AV144Tfasprowwds_2_tffasactiva_sel = AV138TFFasActiva_Sel ;
      AV145Tfasprowwds_3_tffascod = AV61TFFasCod ;
      AV146Tfasprowwds_4_tffascod_sel = AV62TFFasCod_Sel ;
      AV147Tfasprowwds_5_tffasdsc = AV64TFFasDsc ;
      AV148Tfasprowwds_6_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV149Tfasprowwds_7_tffassigla = AV67TFFasSigla ;
      AV150Tfasprowwds_8_tffassigla_sel = AV68TFFasSigla_Sel ;
      AV151Tfasprowwds_9_tfmaqcod = AV70TFMaqCod ;
      AV152Tfasprowwds_10_tfmaqcod_sel = AV71TFMaqCod_Sel ;
      AV153Tfasprowwds_11_tfmaqdsc = AV73TFMaqDsc ;
      AV154Tfasprowwds_12_tfmaqdsc_sel = AV74TFMaqDsc_Sel ;
      AV155Tfasprowwds_13_tffasdec = AV76TFFasDec ;
      AV156Tfasprowwds_14_tffasdec_to = AV77TFFasDec_To ;
      AV157Tfasprowwds_15_tffasdec2 = AV79TFFasDec2 ;
      AV158Tfasprowwds_16_tffasdec2_to = AV80TFFasDec2_To ;
      AV159Tfasprowwds_17_tffaspresal = AV82TFFasPreSal ;
      AV160Tfasprowwds_18_tffaspresal_to = AV83TFFasPreSal_To ;
      AV161Tfasprowwds_19_tffasprepie = AV85TFFasPrePie ;
      AV162Tfasprowwds_20_tffasprepie_to = AV86TFFasPrePie_To ;
      AV163Tfasprowwds_21_tffasvelpro = AV88TFFasVelPro ;
      AV164Tfasprowwds_22_tffasvelpro_to = AV89TFFasVelPro_To ;
      AV165Tfasprowwds_23_tffasnumpas = AV91TFFasNumPas ;
      AV166Tfasprowwds_24_tffasnumpas_to = AV92TFFasNumPas_To ;
      AV167Tfasprowwds_25_tffasacttin = AV94TFFasActTin ;
      AV168Tfasprowwds_26_tffasacttin_sel = AV95TFFasActTin_Sel ;
      AV169Tfasprowwds_27_tffascon = AV97TFFasCon ;
      AV170Tfasprowwds_28_tffascon_sel = AV98TFFasCon_Sel ;
      AV171Tfasprowwds_29_tffasacab = AV100TFFasAcab ;
      AV172Tfasprowwds_30_tffasacab_sel = AV101TFFasAcab_Sel ;
      AV173Tfasprowwds_31_tffasformul = AV103TFFasForMul ;
      AV174Tfasprowwds_32_tffasformul_sel = AV104TFFasForMul_Sel ;
      AV175Tfasprowwds_33_tffasconpla = AV106TFFasConPla ;
      AV176Tfasprowwds_34_tffasconpla_sel = AV107TFFasConPla_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV49ColumnsSelector", AV49ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57ManageFiltersData", AV57ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e127N2( )
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
         AV119PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV119PageToGo) ;
      }
   }

   public void e137N2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e147N2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasActiva") == 0 )
         {
            AV138TFFasActiva_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138TFFasActiva_Sel", AV138TFFasActiva_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV61TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFFasCod", AV61TFFasCod);
            AV62TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFFasCod_Sel", AV62TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV64TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFFasDsc", AV64TFFasDsc);
            AV65TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFFasDsc_Sel", AV65TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasSigla") == 0 )
         {
            AV67TFFasSigla = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFFasSigla", AV67TFFasSigla);
            AV68TFFasSigla_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFFasSigla_Sel", AV68TFFasSigla_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV70TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFMaqCod", AV70TFMaqCod);
            AV71TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFMaqCod_Sel", AV71TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqDsc") == 0 )
         {
            AV73TFMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFMaqDsc", AV73TFMaqDsc);
            AV74TFMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFMaqDsc_Sel", AV74TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDec") == 0 )
         {
            AV76TFFasDec = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFFasDec", GXutil.ltrimstr( AV76TFFasDec, 5, 1));
            AV77TFFasDec_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFFasDec_To", GXutil.ltrimstr( AV77TFFasDec_To, 5, 1));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDec2") == 0 )
         {
            AV79TFFasDec2 = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFFasDec2", GXutil.ltrimstr( AV79TFFasDec2, 7, 2));
            AV80TFFasDec2_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFFasDec2_To", GXutil.ltrimstr( AV80TFFasDec2_To, 7, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPreSal") == 0 )
         {
            AV82TFFasPreSal = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFFasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFFasPreSal), 4, 0));
            AV83TFFasPreSal_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFFasPreSal_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFFasPreSal_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPrePie") == 0 )
         {
            AV85TFFasPrePie = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFFasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFFasPrePie), 4, 0));
            AV86TFFasPrePie_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFFasPrePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFFasPrePie_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasVelPro") == 0 )
         {
            AV88TFFasVelPro = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFFasVelPro", GXutil.ltrimstr( AV88TFFasVelPro, 5, 1));
            AV89TFFasVelPro_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFFasVelPro_To", GXutil.ltrimstr( AV89TFFasVelPro_To, 5, 1));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasNumPas") == 0 )
         {
            AV91TFFasNumPas = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFFasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFFasNumPas), 3, 0));
            AV92TFFasNumPas_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFFasNumPas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFFasNumPas_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasActTin") == 0 )
         {
            AV94TFFasActTin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFFasActTin", AV94TFFasActTin);
            AV95TFFasActTin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFFasActTin_Sel", AV95TFFasActTin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCon") == 0 )
         {
            AV97TFFasCon = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFFasCon", AV97TFFasCon);
            AV98TFFasCon_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFFasCon_Sel", AV98TFFasCon_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasAcab") == 0 )
         {
            AV100TFFasAcab = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFFasAcab", AV100TFFasAcab);
            AV101TFFasAcab_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFFasAcab_Sel", AV101TFFasAcab_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasForMul") == 0 )
         {
            AV103TFFasForMul = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFFasForMul", AV103TFFasForMul);
            AV104TFFasForMul_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFFasForMul_Sel", AV104TFFasForMul_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasConPla") == 0 )
         {
            AV106TFFasConPla = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFFasConPla", AV106TFFasConPla);
            AV107TFFasConPla_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFFasConPla_Sel", AV107TFFasConPla_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e227N2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      GXt_int7 = (byte)(0) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PARFSS", ""), GXv_int8) ;
      tfasproww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV136TempBoolean = (boolean)((GXt_int7==1)) ;
      if ( AV136TempBoolean )
      {
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Parametros", ""), "fas fa-cogs", "", "", "", "", "", "", ""), (short)(0));
      }
      GXt_int7 = (byte)(0) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FASPQ", ""), GXv_int8) ;
      tfasproww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV136TempBoolean = (boolean)((GXt_int7==1)) ;
      if ( AV136TempBoolean )
      {
         cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Tratamientos", ""), "fas fa-quidditch", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      if ( AV139FlagCC == 1 )
      {
         cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Controles Calidad", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV128GridActions, 4, 0)) );
   }

   public void e157N2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV37ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV49ColumnsSelector.fromJSonString(AV37ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TFASPROWWColumnsSelector", ((GXutil.strcmp("", AV37ColumnsSelectorXML)==0) ? "" : AV49ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV49ColumnsSelector", AV49ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57ManageFiltersData", AV57ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e117N2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TFASPROWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV142Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV59ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TFASPROWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV59ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV58ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TFASPROWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tfasproww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV58ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV58ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV142Pgmname+"GridState", AV58ManageFiltersXml) ;
            AV10GridState.fromxml(AV58ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV49ColumnsSelector", AV49ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57ManageFiltersData", AV57ManageFiltersData);
   }

   public void e237N2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV128GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 4 )
      {
         /* Execute user subroutine: 'DO PARAMETROS' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 5 )
      {
         /* Execute user subroutine: 'DO TRATAMIENTOS' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 6 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 7 )
      {
         /* Execute user subroutine: 'DO CONTROLESCALIDAD' */
         S252 ();
         if (returnInSub) return;
      }
      AV128GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV128GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV49ColumnsSelector", AV49ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57ManageFiltersData", AV57ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e167N2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tfaspro", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","FasCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e177N2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV35ExcelFilename ;
      GXv_char3[0] = AV36ErrorMessage ;
      new app.tfasprowwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tfasproww_impl.this.AV35ExcelFilename = GXv_char4[0] ;
      tfasproww_impl.this.AV36ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV35ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV35ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV36ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e187N2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tfasprowwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e197N2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tfasprowwexportcsv", new String[] {}, new String[] {}) );
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
      AV49ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasActiva", "", "Activa?", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasCod", "", "Fase", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasDsc", "", "Descripcion", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasSigla", "", "Siglas", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MaqCod", "", "Maquina", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MaqDsc", "", "Descripcion", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasDec", "", "Decalage ", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasDec2", "", "Decalage 2", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasPreSal", "", "T prepysal", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasPrePie", "", "T prepppza", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasVelPro", "", "Vel (mts/m)", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasNumPas", "", "N pases", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasActTin", "", "T?", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasCon", "", "C?", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasAcab", "", "A?", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasForMul", "", "F?", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FasConPla", "", "P?", true, "") ;
      AV49ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV44UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TFASPROWWColumnsSelector", GXv_char4) ;
      tfasproww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV44UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV44UserCustomValue)==0) ) )
      {
         AV50ColumnsSelectorAux.fromxml(AV44UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV50ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV49ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV50ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV49ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV57ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TFASPROWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV57ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV124FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124FilterFullText", AV124FilterFullText);
      AV138TFFasActiva_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138TFFasActiva_Sel", AV138TFFasActiva_Sel);
      AV61TFFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFFasCod", AV61TFFasCod);
      AV62TFFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFFasCod_Sel", AV62TFFasCod_Sel);
      AV64TFFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFFasDsc", AV64TFFasDsc);
      AV65TFFasDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFFasDsc_Sel", AV65TFFasDsc_Sel);
      AV67TFFasSigla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFFasSigla", AV67TFFasSigla);
      AV68TFFasSigla_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFFasSigla_Sel", AV68TFFasSigla_Sel);
      AV70TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFMaqCod", AV70TFMaqCod);
      AV71TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFMaqCod_Sel", AV71TFMaqCod_Sel);
      AV73TFMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFMaqDsc", AV73TFMaqDsc);
      AV74TFMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFMaqDsc_Sel", AV74TFMaqDsc_Sel);
      AV76TFFasDec = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFFasDec", GXutil.ltrimstr( AV76TFFasDec, 5, 1));
      AV77TFFasDec_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFFasDec_To", GXutil.ltrimstr( AV77TFFasDec_To, 5, 1));
      AV79TFFasDec2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFFasDec2", GXutil.ltrimstr( AV79TFFasDec2, 7, 2));
      AV80TFFasDec2_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFFasDec2_To", GXutil.ltrimstr( AV80TFFasDec2_To, 7, 2));
      AV82TFFasPreSal = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFFasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFFasPreSal), 4, 0));
      AV83TFFasPreSal_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFFasPreSal_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFFasPreSal_To), 4, 0));
      AV85TFFasPrePie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFFasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFFasPrePie), 4, 0));
      AV86TFFasPrePie_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFFasPrePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFFasPrePie_To), 4, 0));
      AV88TFFasVelPro = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFFasVelPro", GXutil.ltrimstr( AV88TFFasVelPro, 5, 1));
      AV89TFFasVelPro_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFFasVelPro_To", GXutil.ltrimstr( AV89TFFasVelPro_To, 5, 1));
      AV91TFFasNumPas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFFasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFFasNumPas), 3, 0));
      AV92TFFasNumPas_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFFasNumPas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFFasNumPas_To), 3, 0));
      AV94TFFasActTin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94TFFasActTin", AV94TFFasActTin);
      AV95TFFasActTin_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFFasActTin_Sel", AV95TFFasActTin_Sel);
      AV97TFFasCon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97TFFasCon", AV97TFFasCon);
      AV98TFFasCon_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98TFFasCon_Sel", AV98TFFasCon_Sel);
      AV100TFFasAcab = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TFFasAcab", AV100TFFasAcab);
      AV101TFFasAcab_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101TFFasAcab_Sel", AV101TFFasAcab_Sel);
      AV103TFFasForMul = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103TFFasForMul", AV103TFFasForMul);
      AV104TFFasForMul_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104TFFasForMul_Sel", AV104TFFasForMul_Sel);
      AV106TFFasConPla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106TFFasConPla", AV106TFFasConPla);
      AV107TFFasConPla_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107TFFasConPla_Sel", AV107TFFasConPla_Sel);
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
         callWebObject(formatLink("app.tfaspro", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"Mode","EmprCod","FasCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      callWebObject(formatLink("app.tfaspro", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"Mode","EmprCod","FasCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tfaspro", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"Mode","EmprCod","FasCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tfaspro", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"Mode","EmprCod","FasCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO PARAMETROS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tparfss", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"Mode","EmprCod","FasCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO TRATAMIENTOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tfaspq", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {}) , new Object[] {"A396EmprCod","A457FasCod"});
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tfaspro_observaciones", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"Mode","EmprCod","FasCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S252( )
   {
      /* 'DO CONTROLESCALIDAD' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.controlcalidadhtd.controlcalidad_ccfas", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"Mode","EmprCod","FasCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV56Session.getValue(AV142Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV142Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV56Session.getValue(AV142Pgmname+"GridState"), null, null);
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
      AV177GXV1 = 1 ;
      while ( AV177GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV177GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV124FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124FilterFullText", AV124FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTIVA_SEL") == 0 )
         {
            AV138TFFasActiva_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138TFFasActiva_Sel", AV138TFFasActiva_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV61TFFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFFasCod", AV61TFFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV62TFFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFFasCod_Sel", AV62TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV64TFFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFFasDsc", AV64TFFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV65TFFasDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFFasDsc_Sel", AV65TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASSIGLA") == 0 )
         {
            AV67TFFasSigla = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFFasSigla", AV67TFFasSigla);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASSIGLA_SEL") == 0 )
         {
            AV68TFFasSigla_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFFasSigla_Sel", AV68TFFasSigla_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV70TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFMaqCod", AV70TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV71TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFMaqCod_Sel", AV71TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV73TFMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFMaqDsc", AV73TFMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV74TFMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFMaqDsc_Sel", AV74TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC") == 0 )
         {
            AV76TFFasDec = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFFasDec", GXutil.ltrimstr( AV76TFFasDec, 5, 1));
            AV77TFFasDec_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFFasDec_To", GXutil.ltrimstr( AV77TFFasDec_To, 5, 1));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC2") == 0 )
         {
            AV79TFFasDec2 = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFFasDec2", GXutil.ltrimstr( AV79TFFasDec2, 7, 2));
            AV80TFFasDec2_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFFasDec2_To", GXutil.ltrimstr( AV80TFFasDec2_To, 7, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPRESAL") == 0 )
         {
            AV82TFFasPreSal = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFFasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFFasPreSal), 4, 0));
            AV83TFFasPreSal_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFFasPreSal_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFFasPreSal_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREPIE") == 0 )
         {
            AV85TFFasPrePie = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFFasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFFasPrePie), 4, 0));
            AV86TFFasPrePie_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFFasPrePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFFasPrePie_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASVELPRO") == 0 )
         {
            AV88TFFasVelPro = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFFasVelPro", GXutil.ltrimstr( AV88TFFasVelPro, 5, 1));
            AV89TFFasVelPro_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFFasVelPro_To", GXutil.ltrimstr( AV89TFFasVelPro_To, 5, 1));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASNUMPAS") == 0 )
         {
            AV91TFFasNumPas = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFFasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFFasNumPas), 3, 0));
            AV92TFFasNumPas_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFFasNumPas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFFasNumPas_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN") == 0 )
         {
            AV94TFFasActTin = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFFasActTin", AV94TFFasActTin);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN_SEL") == 0 )
         {
            AV95TFFasActTin_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFFasActTin_Sel", AV95TFFasActTin_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON") == 0 )
         {
            AV97TFFasCon = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFFasCon", AV97TFFasCon);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON_SEL") == 0 )
         {
            AV98TFFasCon_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFFasCon_Sel", AV98TFFasCon_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB") == 0 )
         {
            AV100TFFasAcab = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFFasAcab", AV100TFFasAcab);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB_SEL") == 0 )
         {
            AV101TFFasAcab_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFFasAcab_Sel", AV101TFFasAcab_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV103TFFasForMul = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFFasForMul", AV103TFFasForMul);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV104TFFasForMul_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFFasForMul_Sel", AV104TFFasForMul_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA") == 0 )
         {
            AV106TFFasConPla = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFFasConPla", AV106TFFasConPla);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA_SEL") == 0 )
         {
            AV107TFFasConPla_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFFasConPla_Sel", AV107TFFasConPla_Sel);
         }
         AV177GXV1 = (int)(AV177GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV138TFFasActiva_Sel)==0), AV138TFFasActiva_Sel, GXv_char4) ;
      tfasproww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFFasCod_Sel)==0), AV62TFFasCod_Sel, GXv_char3) ;
      tfasproww_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFFasDsc_Sel)==0), AV65TFFasDsc_Sel, GXv_char2) ;
      tfasproww_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFFasSigla_Sel)==0), AV68TFFasSigla_Sel, GXv_char17) ;
      tfasproww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFMaqCod_Sel)==0), AV71TFMaqCod_Sel, GXv_char19) ;
      tfasproww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFMaqDsc_Sel)==0), AV74TFMaqDsc_Sel, GXv_char21) ;
      tfasproww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV95TFFasActTin_Sel)==0), AV95TFFasActTin_Sel, GXv_char23) ;
      tfasproww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV98TFFasCon_Sel)==0), AV98TFFasCon_Sel, GXv_char25) ;
      tfasproww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFFasAcab_Sel)==0), AV101TFFasAcab_Sel, GXv_char27) ;
      tfasproww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV104TFFasForMul_Sel)==0), AV104TFFasForMul_Sel, GXv_char29) ;
      tfasproww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV107TFFasConPla_Sel)==0), AV107TFFasConPla_Sel, GXv_char31) ;
      tfasproww_impl.this.GXt_char30 = GXv_char31[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char14+"|"+GXt_char15+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"|||||||"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|"+GXt_char28+"|"+GXt_char30 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFFasCod)==0), AV61TFFasCod, GXv_char31) ;
      tfasproww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFFasDsc)==0), AV64TFFasDsc, GXv_char29) ;
      tfasproww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFFasSigla)==0), AV67TFFasSigla, GXv_char27) ;
      tfasproww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFMaqCod)==0), AV70TFMaqCod, GXv_char25) ;
      tfasproww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFMaqDsc)==0), AV73TFMaqDsc, GXv_char23) ;
      tfasproww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV94TFFasActTin)==0), AV94TFFasActTin, GXv_char21) ;
      tfasproww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV97TFFasCon)==0), AV97TFFasCon, GXv_char19) ;
      tfasproww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV100TFFasAcab)==0), AV100TFFasAcab, GXv_char17) ;
      tfasproww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV103TFFasForMul)==0), AV103TFFasForMul, GXv_char4) ;
      tfasproww_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV106TFFasConPla)==0), AV106TFFasConPla, GXv_char3) ;
      tfasproww_impl.this.GXt_char14 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = "|"+GXt_char30+"|"+GXt_char28+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFFasDec)==0) ? "" : GXutil.str( AV76TFFasDec, 5, 1))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFFasDec2)==0) ? "" : GXutil.str( AV79TFFasDec2, 7, 2))+"|"+((0==AV82TFFasPreSal) ? "" : GXutil.str( AV82TFFasPreSal, 4, 0))+"|"+((0==AV85TFFasPrePie) ? "" : GXutil.str( AV85TFFasPrePie, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFFasVelPro)==0) ? "" : GXutil.str( AV88TFFasVelPro, 5, 1))+"|"+((0==AV91TFFasNumPas) ? "" : GXutil.str( AV91TFFasNumPas, 3, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char15+"|"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFFasDec_To)==0) ? "" : GXutil.str( AV77TFFasDec_To, 5, 1))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFFasDec2_To)==0) ? "" : GXutil.str( AV80TFFasDec2_To, 7, 2))+"|"+((0==AV83TFFasPreSal_To) ? "" : GXutil.str( AV83TFFasPreSal_To, 4, 0))+"|"+((0==AV86TFFasPrePie_To) ? "" : GXutil.str( AV86TFFasPrePie_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFFasVelPro_To)==0) ? "" : GXutil.str( AV89TFFasVelPro_To, 5, 1))+"|"+((0==AV92TFFasNumPas_To) ? "" : GXutil.str( AV92TFFasNumPas_To, 3, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV56Session.getValue(AV142Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV124FilterFullText)==0), (short)(0), AV124FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASACTIVA_SEL", "", !(GXutil.strcmp("", AV138TFFasActiva_Sel)==0), (short)(0), AV138TFFasActiva_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASCOD", "", !(GXutil.strcmp("", AV61TFFasCod)==0), (short)(0), AV61TFFasCod, "", !(GXutil.strcmp("", AV62TFFasCod_Sel)==0), AV62TFFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASDSC", "", !(GXutil.strcmp("", AV64TFFasDsc)==0), (short)(0), AV64TFFasDsc, "", !(GXutil.strcmp("", AV65TFFasDsc_Sel)==0), AV65TFFasDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASSIGLA", "", !(GXutil.strcmp("", AV67TFFasSigla)==0), (short)(0), AV67TFFasSigla, "", !(GXutil.strcmp("", AV68TFFasSigla_Sel)==0), AV68TFFasSigla_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFMAQCOD", "", !(GXutil.strcmp("", AV70TFMaqCod)==0), (short)(0), AV70TFMaqCod, "", !(GXutil.strcmp("", AV71TFMaqCod_Sel)==0), AV71TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFMAQDSC", "", !(GXutil.strcmp("", AV73TFMaqDsc)==0), (short)(0), AV73TFMaqDsc, "", !(GXutil.strcmp("", AV74TFMaqDsc_Sel)==0), AV74TFMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASDEC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFFasDec)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFFasDec_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV76TFFasDec, 5, 1)), GXutil.trim( GXutil.str( AV77TFFasDec_To, 5, 1))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASDEC2", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFFasDec2)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFFasDec2_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV79TFFasDec2, 7, 2)), GXutil.trim( GXutil.str( AV80TFFasDec2_To, 7, 2))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASPRESAL", "", !((0==AV82TFFasPreSal)&&(0==AV83TFFasPreSal_To)), (short)(0), GXutil.trim( GXutil.str( AV82TFFasPreSal, 4, 0)), GXutil.trim( GXutil.str( AV83TFFasPreSal_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASPREPIE", "", !((0==AV85TFFasPrePie)&&(0==AV86TFFasPrePie_To)), (short)(0), GXutil.trim( GXutil.str( AV85TFFasPrePie, 4, 0)), GXutil.trim( GXutil.str( AV86TFFasPrePie_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASVELPRO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFFasVelPro)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFFasVelPro_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV88TFFasVelPro, 5, 1)), GXutil.trim( GXutil.str( AV89TFFasVelPro_To, 5, 1))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASNUMPAS", "", !((0==AV91TFFasNumPas)&&(0==AV92TFFasNumPas_To)), (short)(0), GXutil.trim( GXutil.str( AV91TFFasNumPas, 3, 0)), GXutil.trim( GXutil.str( AV92TFFasNumPas_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASACTTIN", "", !(GXutil.strcmp("", AV94TFFasActTin)==0), (short)(0), AV94TFFasActTin, "", !(GXutil.strcmp("", AV95TFFasActTin_Sel)==0), AV95TFFasActTin_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASCON", "", !(GXutil.strcmp("", AV97TFFasCon)==0), (short)(0), AV97TFFasCon, "", !(GXutil.strcmp("", AV98TFFasCon_Sel)==0), AV98TFFasCon_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASACAB", "", !(GXutil.strcmp("", AV100TFFasAcab)==0), (short)(0), AV100TFFasAcab, "", !(GXutil.strcmp("", AV101TFFasAcab_Sel)==0), AV101TFFasAcab_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASFORMUL", "", !(GXutil.strcmp("", AV103TFFasForMul)==0), (short)(0), AV103TFFasForMul, "", !(GXutil.strcmp("", AV104TFFasForMul_Sel)==0), AV104TFFasForMul_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFFASCONPLA", "", !(GXutil.strcmp("", AV106TFFasConPla)==0), (short)(0), AV106TFFasConPla, "", !(GXutil.strcmp("", AV107TFFasConPla_Sel)==0), AV107TFFasConPla_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV142Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV142Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TFASPRO" );
      AV56Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_7N2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV57ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_7N2( true) ;
      }
      else
      {
         wb_table2_32_7N2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_7N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_7N2e( true) ;
      }
      else
      {
         wb_table1_27_7N2e( false) ;
      }
   }

   public void wb_table2_32_7N2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV124FilterFullText, GXutil.rtrim( localUtil.format( AV124FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TFASPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_7N2e( true) ;
      }
      else
      {
         wb_table2_32_7N2e( false) ;
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
      pa7N2( ) ;
      ws7N2( ) ;
      we7N2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116113492", true, true);
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
      httpContext.AddJavascriptSource("tfasproww.js", "?202682116113492", false, true);
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

   public void subsflControlProps_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_idx ;
      chkFasActiva.setInternalname( "FASACTIVA_"+sGXsfl_45_idx );
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_45_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_45_idx ;
      edtFasSigla_Internalname = "FASSIGLA_"+sGXsfl_45_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_45_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_45_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_45_idx ;
      edtFasDec2_Internalname = "FASDEC2_"+sGXsfl_45_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_45_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_45_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_45_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_45_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_45_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_45_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_45_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_45_idx ;
      edtFasConPla_Internalname = "FASCONPLA_"+sGXsfl_45_idx ;
      edtFasEstamp_Internalname = "FASESTAMP_"+sGXsfl_45_idx ;
      edtFasPreMC_Internalname = "FASPREMC_"+sGXsfl_45_idx ;
      edtFasValMtr_Internalname = "FASVALMTR_"+sGXsfl_45_idx ;
      edtFasCC_Internalname = "FASCC_"+sGXsfl_45_idx ;
      edtFasProCtb_Internalname = "FASPROCTB_"+sGXsfl_45_idx ;
      edtFasTExt_Internalname = "FASTEXT_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      chkFasActiva.setInternalname( "FASACTIVA_"+sGXsfl_45_fel_idx );
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_45_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_45_fel_idx ;
      edtFasSigla_Internalname = "FASSIGLA_"+sGXsfl_45_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_45_fel_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_45_fel_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_45_fel_idx ;
      edtFasDec2_Internalname = "FASDEC2_"+sGXsfl_45_fel_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_45_fel_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_45_fel_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_45_fel_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_45_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_45_fel_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_45_fel_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_45_fel_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_45_fel_idx ;
      edtFasConPla_Internalname = "FASCONPLA_"+sGXsfl_45_fel_idx ;
      edtFasEstamp_Internalname = "FASESTAMP_"+sGXsfl_45_fel_idx ;
      edtFasPreMC_Internalname = "FASPREMC_"+sGXsfl_45_fel_idx ;
      edtFasValMtr_Internalname = "FASVALMTR_"+sGXsfl_45_fel_idx ;
      edtFasCC_Internalname = "FASCC_"+sGXsfl_45_fel_idx ;
      edtFasProCtb_Internalname = "FASPROCTB_"+sGXsfl_45_fel_idx ;
      edtFasTExt_Internalname = "FASTEXT_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb7N0( ) ;
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
               AV128GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV128GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV128GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_45_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV128GridActions, 4, 0)) );
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkFasActiva.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "FASACTIVA_" + sGXsfl_45_idx ;
         chkFasActiva.setName( GXCCtl );
         chkFasActiva.setWebtags( "" );
         chkFasActiva.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkFasActiva.getInternalname(), "TitleCaption", chkFasActiva.getCaption(), !bGXsfl_45_Refreshing);
         chkFasActiva.setCheckedValue( "N" );
         A14042FasActiva = ((GXutil.strcmp(GXutil.rtrim( A14042FasActiva), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkFasActiva.getInternalname(),A14042FasActiva,"","",Integer.valueOf(chkFasActiva.getVisible()),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFasDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasSigla_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasSigla_Internalname,GXutil.rtrim( A7070FasSigla),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasSigla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasSigla_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDsc_Internalname,GXutil.rtrim( A606MaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFasDec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A459FasDec, "ZZ9.9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasDec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFasDec2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec2_Internalname,GXutil.ltrim( localUtil.ntoc( A5990FasDec2, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5990FasDec2, "ZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDec2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasDec2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFasPreSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreSal_Internalname,GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasPreSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFasPrePie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPrePie_Internalname,GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPrePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasPrePie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFasVelPro_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasVelPro_Internalname,GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A472FasVelPro, "ZZ9.9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasVelPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasVelPro_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFasNumPas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasNumPas_Internalname,GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasNumPas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasNumPas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasActTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasActTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasCon_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCon_Internalname,GXutil.rtrim( A458FasCon),GXutil.rtrim( localUtil.format( A458FasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasCon_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasAcab_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasAcab_Internalname,GXutil.rtrim( A4903FasAcab),GXutil.rtrim( localUtil.format( A4903FasAcab, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasAcab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasAcab_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasForMul_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasForMul_Internalname,GXutil.rtrim( A4286FasForMul),GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasForMul_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasForMul_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasConPla_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasConPla_Internalname,GXutil.rtrim( A4299FasConPla),GXutil.rtrim( localUtil.format( A4299FasConPla, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasConPla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasConPla_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasEstamp_Internalname,GXutil.rtrim( A4343FasEstamp),GXutil.rtrim( localUtil.format( A4343FasEstamp, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasEstamp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreMC_Internalname,GXutil.ltrim( localUtil.ntoc( A5168FasPreMC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5168FasPreMC), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreMC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasValMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A4791FasValMtr, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4791FasValMtr, "ZZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasValMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCC_Internalname,GXutil.rtrim( A4588FasCC),GXutil.rtrim( localUtil.format( A4588FasCC, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasProCtb_Internalname,GXutil.rtrim( A5232FasProCtb),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasProCtb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasTExt_Internalname,GXutil.rtrim( A5616FasTExt),GXutil.rtrim( localUtil.format( A5616FasTExt, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasTExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes7N2( ) ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkFasActiva.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Activa?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasSigla_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Siglas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasDec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Decalage ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasDec2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Decalage 2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasPreSal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T prepysal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasPrePie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T prepppza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasVelPro_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Vel (mts/m)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasNumPas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N pases", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasActTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasCon_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasAcab_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasForMul_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasConPla_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV128GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14042FasActiva));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkFasActiva.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7070FasSigla));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasSigla_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A606MaqDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasDec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5990FasDec2, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasDec2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A458FasCon));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasCon_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4903FasAcab));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4286FasForMul));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4299FasConPla));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasConPla_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4343FasEstamp));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5168FasPreMC, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4791FasValMtr, (byte)(12), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4588FasCC));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5232FasProCtb));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5616FasTExt));
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
      chkFasActiva.setInternalname( "FASACTIVA" );
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtFasSigla_Internalname = "FASSIGLA" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtFasDec2_Internalname = "FASDEC2" ;
      edtFasPreSal_Internalname = "FASPRESAL" ;
      edtFasPrePie_Internalname = "FASPREPIE" ;
      edtFasVelPro_Internalname = "FASVELPRO" ;
      edtFasNumPas_Internalname = "FASNUMPAS" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtFasCon_Internalname = "FASCON" ;
      edtFasAcab_Internalname = "FASACAB" ;
      edtFasForMul_Internalname = "FASFORMUL" ;
      edtFasConPla_Internalname = "FASCONPLA" ;
      edtFasEstamp_Internalname = "FASESTAMP" ;
      edtFasPreMC_Internalname = "FASPREMC" ;
      edtFasValMtr_Internalname = "FASVALMTR" ;
      edtFasCC_Internalname = "FASCC" ;
      edtFasProCtb_Internalname = "FASPROCTB" ;
      edtFasTExt_Internalname = "FASTEXT" ;
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
      edtFasTExt_Jsonclick = "" ;
      edtFasProCtb_Jsonclick = "" ;
      edtFasCC_Jsonclick = "" ;
      edtFasValMtr_Jsonclick = "" ;
      edtFasPreMC_Jsonclick = "" ;
      edtFasEstamp_Jsonclick = "" ;
      edtFasConPla_Jsonclick = "" ;
      edtFasForMul_Jsonclick = "" ;
      edtFasAcab_Jsonclick = "" ;
      edtFasCon_Jsonclick = "" ;
      edtFasActTin_Jsonclick = "" ;
      edtFasNumPas_Jsonclick = "" ;
      edtFasVelPro_Jsonclick = "" ;
      edtFasPrePie_Jsonclick = "" ;
      edtFasPreSal_Jsonclick = "" ;
      edtFasDec2_Jsonclick = "" ;
      edtFasDec_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtFasSigla_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      chkFasActiva.setCaption( "" );
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtFasConPla_Visible = -1 ;
      edtFasForMul_Visible = -1 ;
      edtFasAcab_Visible = -1 ;
      edtFasCon_Visible = -1 ;
      edtFasActTin_Visible = -1 ;
      edtFasNumPas_Visible = -1 ;
      edtFasVelPro_Visible = -1 ;
      edtFasPrePie_Visible = -1 ;
      edtFasPreSal_Visible = -1 ;
      edtFasDec2_Visible = -1 ;
      edtFasDec_Visible = -1 ;
      edtMaqDsc_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      edtFasSigla_Visible = -1 ;
      edtFasDsc_Visible = -1 ;
      edtFasCod_Visible = -1 ;
      chkFasActiva.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TFASPROWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "S:WWP_TSChecked,N:WWP_TSUnChecked||||||||||||||||" ;
      Ddo_grid_Datalisttype = "FixedValues|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|||||||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|T|T|T|T|||||||T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "||||||T|T|T|T|T|T|||||" ;
      Ddo_grid_Filtertype = "|Character|Character|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|1|4|5|6|7|8|9|10|11|12|13|14|15|16|17" ;
      Ddo_grid_Columnids = "2:FasActiva|3:FasCod|4:FasDsc|5:FasSigla|6:MaqCod|7:MaqDsc|8:FasDec|9:FasDec2|10:FasPreSal|11:FasPrePie|12:FasVelPro|13:FasNumPas|14:FasActTin|15:FasCon|16:FasAcab|17:FasForMul|18:FasConPla" ;
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
      Form.setCaption( httpContext.getMessage( " FASES", "") );
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
         AV128GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV128GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
      }
      GXCCtl = "FASACTIVA_" + sGXsfl_45_idx ;
      chkFasActiva.setName( GXCCtl );
      chkFasActiva.setWebtags( "" );
      chkFasActiva.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasActiva.getInternalname(), "TitleCaption", chkFasActiva.getCaption(), !bGXsfl_45_Refreshing);
      chkFasActiva.setCheckedValue( "N" );
      A14042FasActiva = ((GXutil.strcmp(GXutil.rtrim( A14042FasActiva), "S")==0) ? "S" : "N") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkFasActiva.getVisible()',ctrl:'FASACTIVA',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtFasSigla_Visible',ctrl:'FASSIGLA',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtFasDec_Visible',ctrl:'FASDEC',prop:'Visible'},{av:'edtFasDec2_Visible',ctrl:'FASDEC2',prop:'Visible'},{av:'edtFasPreSal_Visible',ctrl:'FASPRESAL',prop:'Visible'},{av:'edtFasPrePie_Visible',ctrl:'FASPREPIE',prop:'Visible'},{av:'edtFasVelPro_Visible',ctrl:'FASVELPRO',prop:'Visible'},{av:'edtFasNumPas_Visible',ctrl:'FASNUMPAS',prop:'Visible'},{av:'edtFasActTin_Visible',ctrl:'FASACTTIN',prop:'Visible'},{av:'edtFasCon_Visible',ctrl:'FASCON',prop:'Visible'},{av:'edtFasAcab_Visible',ctrl:'FASACAB',prop:'Visible'},{av:'edtFasForMul_Visible',ctrl:'FASFORMUL',prop:'Visible'},{av:'edtFasConPla_Visible',ctrl:'FASCONPLA',prop:'Visible'},{av:'AV120GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV121GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e127N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e137N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e147N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e227N2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV128GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e157N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkFasActiva.getVisible()',ctrl:'FASACTIVA',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtFasSigla_Visible',ctrl:'FASSIGLA',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtFasDec_Visible',ctrl:'FASDEC',prop:'Visible'},{av:'edtFasDec2_Visible',ctrl:'FASDEC2',prop:'Visible'},{av:'edtFasPreSal_Visible',ctrl:'FASPRESAL',prop:'Visible'},{av:'edtFasPrePie_Visible',ctrl:'FASPREPIE',prop:'Visible'},{av:'edtFasVelPro_Visible',ctrl:'FASVELPRO',prop:'Visible'},{av:'edtFasNumPas_Visible',ctrl:'FASNUMPAS',prop:'Visible'},{av:'edtFasActTin_Visible',ctrl:'FASACTTIN',prop:'Visible'},{av:'edtFasCon_Visible',ctrl:'FASCON',prop:'Visible'},{av:'edtFasAcab_Visible',ctrl:'FASACAB',prop:'Visible'},{av:'edtFasForMul_Visible',ctrl:'FASFORMUL',prop:'Visible'},{av:'edtFasConPla_Visible',ctrl:'FASCONPLA',prop:'Visible'},{av:'AV120GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV121GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e117N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkFasActiva.getVisible()',ctrl:'FASACTIVA',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtFasSigla_Visible',ctrl:'FASSIGLA',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtFasDec_Visible',ctrl:'FASDEC',prop:'Visible'},{av:'edtFasDec2_Visible',ctrl:'FASDEC2',prop:'Visible'},{av:'edtFasPreSal_Visible',ctrl:'FASPRESAL',prop:'Visible'},{av:'edtFasPrePie_Visible',ctrl:'FASPREPIE',prop:'Visible'},{av:'edtFasVelPro_Visible',ctrl:'FASVELPRO',prop:'Visible'},{av:'edtFasNumPas_Visible',ctrl:'FASNUMPAS',prop:'Visible'},{av:'edtFasActTin_Visible',ctrl:'FASACTTIN',prop:'Visible'},{av:'edtFasCon_Visible',ctrl:'FASCON',prop:'Visible'},{av:'edtFasAcab_Visible',ctrl:'FASACAB',prop:'Visible'},{av:'edtFasForMul_Visible',ctrl:'FASFORMUL',prop:'Visible'},{av:'edtFasConPla_Visible',ctrl:'FASCONPLA',prop:'Visible'},{av:'AV120GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV121GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e237N2',iparms:[{av:'cmbavGridactions'},{av:'AV128GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV128GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkFasActiva.getVisible()',ctrl:'FASACTIVA',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtFasSigla_Visible',ctrl:'FASSIGLA',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtFasDec_Visible',ctrl:'FASDEC',prop:'Visible'},{av:'edtFasDec2_Visible',ctrl:'FASDEC2',prop:'Visible'},{av:'edtFasPreSal_Visible',ctrl:'FASPRESAL',prop:'Visible'},{av:'edtFasPrePie_Visible',ctrl:'FASPREPIE',prop:'Visible'},{av:'edtFasVelPro_Visible',ctrl:'FASVELPRO',prop:'Visible'},{av:'edtFasNumPas_Visible',ctrl:'FASNUMPAS',prop:'Visible'},{av:'edtFasActTin_Visible',ctrl:'FASACTTIN',prop:'Visible'},{av:'edtFasCon_Visible',ctrl:'FASCON',prop:'Visible'},{av:'edtFasAcab_Visible',ctrl:'FASACAB',prop:'Visible'},{av:'edtFasForMul_Visible',ctrl:'FASFORMUL',prop:'Visible'},{av:'edtFasConPla_Visible',ctrl:'FASCONPLA',prop:'Visible'},{av:'AV120GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV121GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e167N2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e177N2',iparms:[{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e187N2',iparms:[{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e197N2',iparms:[{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV138TFFasActiva_Sel',fld:'vTFFASACTIVA_SEL',pic:''},{av:'AV61TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV62TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFFasSigla',fld:'vTFFASSIGLA',pic:''},{av:'AV68TFFasSigla_Sel',fld:'vTFFASSIGLA_SEL',pic:''},{av:'AV70TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV73TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV74TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV76TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV77TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV79TFFasDec2',fld:'vTFFASDEC2',pic:'ZZZ9.99'},{av:'AV80TFFasDec2_To',fld:'vTFFASDEC2_TO',pic:'ZZZ9.99'},{av:'AV82TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV83TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV85TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV86TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV88TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV89TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV91TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV92TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV94TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV95TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV97TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV98TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV100TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV101TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV103TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV104TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV106TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV107TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV139FlagCC',fld:'vFLAGCC',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Fastext',iparms:[]");
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
      AV124FilterFullText = "" ;
      AV49ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV138TFFasActiva_Sel = "" ;
      AV61TFFasCod = "" ;
      AV62TFFasCod_Sel = "" ;
      AV64TFFasDsc = "" ;
      AV65TFFasDsc_Sel = "" ;
      AV67TFFasSigla = "" ;
      AV68TFFasSigla_Sel = "" ;
      AV70TFMaqCod = "" ;
      AV71TFMaqCod_Sel = "" ;
      AV73TFMaqDsc = "" ;
      AV74TFMaqDsc_Sel = "" ;
      AV76TFFasDec = DecimalUtil.ZERO ;
      AV77TFFasDec_To = DecimalUtil.ZERO ;
      AV79TFFasDec2 = DecimalUtil.ZERO ;
      AV80TFFasDec2_To = DecimalUtil.ZERO ;
      AV88TFFasVelPro = DecimalUtil.ZERO ;
      AV89TFFasVelPro_To = DecimalUtil.ZERO ;
      AV94TFFasActTin = "" ;
      AV95TFFasActTin_Sel = "" ;
      AV97TFFasCon = "" ;
      AV98TFFasCon_Sel = "" ;
      AV100TFFasAcab = "" ;
      AV101TFFasAcab_Sel = "" ;
      AV103TFFasForMul = "" ;
      AV104TFFasForMul_Sel = "" ;
      AV106TFFasConPla = "" ;
      AV107TFFasConPla_Sel = "" ;
      AV142Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV57ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV118DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      bttBtnexportcsv_Jsonclick = "" ;
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
      A396EmprCod = "" ;
      A14042FasActiva = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A7070FasSigla = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A5990FasDec2 = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      A4343FasEstamp = "" ;
      A4791FasValMtr = DecimalUtil.ZERO ;
      A4588FasCC = "" ;
      A5232FasProCtb = "" ;
      A5616FasTExt = "" ;
      scmdbuf = "" ;
      lV143Tfasprowwds_1_filterfulltext = "" ;
      lV145Tfasprowwds_3_tffascod = "" ;
      lV147Tfasprowwds_5_tffasdsc = "" ;
      lV149Tfasprowwds_7_tffassigla = "" ;
      lV151Tfasprowwds_9_tfmaqcod = "" ;
      lV153Tfasprowwds_11_tfmaqdsc = "" ;
      lV167Tfasprowwds_25_tffasacttin = "" ;
      lV169Tfasprowwds_27_tffascon = "" ;
      lV171Tfasprowwds_29_tffasacab = "" ;
      lV173Tfasprowwds_31_tffasformul = "" ;
      lV175Tfasprowwds_33_tffasconpla = "" ;
      AV143Tfasprowwds_1_filterfulltext = "" ;
      AV144Tfasprowwds_2_tffasactiva_sel = "" ;
      AV146Tfasprowwds_4_tffascod_sel = "" ;
      AV145Tfasprowwds_3_tffascod = "" ;
      AV148Tfasprowwds_6_tffasdsc_sel = "" ;
      AV147Tfasprowwds_5_tffasdsc = "" ;
      AV150Tfasprowwds_8_tffassigla_sel = "" ;
      AV149Tfasprowwds_7_tffassigla = "" ;
      AV152Tfasprowwds_10_tfmaqcod_sel = "" ;
      AV151Tfasprowwds_9_tfmaqcod = "" ;
      AV154Tfasprowwds_12_tfmaqdsc_sel = "" ;
      AV153Tfasprowwds_11_tfmaqdsc = "" ;
      AV155Tfasprowwds_13_tffasdec = DecimalUtil.ZERO ;
      AV156Tfasprowwds_14_tffasdec_to = DecimalUtil.ZERO ;
      AV157Tfasprowwds_15_tffasdec2 = DecimalUtil.ZERO ;
      AV158Tfasprowwds_16_tffasdec2_to = DecimalUtil.ZERO ;
      AV163Tfasprowwds_21_tffasvelpro = DecimalUtil.ZERO ;
      AV164Tfasprowwds_22_tffasvelpro_to = DecimalUtil.ZERO ;
      AV168Tfasprowwds_26_tffasacttin_sel = "" ;
      AV167Tfasprowwds_25_tffasacttin = "" ;
      AV170Tfasprowwds_28_tffascon_sel = "" ;
      AV169Tfasprowwds_27_tffascon = "" ;
      AV172Tfasprowwds_30_tffasacab_sel = "" ;
      AV171Tfasprowwds_29_tffasacab = "" ;
      AV174Tfasprowwds_32_tffasformul_sel = "" ;
      AV173Tfasprowwds_31_tffasformul = "" ;
      AV176Tfasprowwds_34_tffasconpla_sel = "" ;
      AV175Tfasprowwds_33_tffasconpla = "" ;
      H007N2_A5616FasTExt = new String[] {""} ;
      H007N2_n5616FasTExt = new boolean[] {false} ;
      H007N2_A5232FasProCtb = new String[] {""} ;
      H007N2_n5232FasProCtb = new boolean[] {false} ;
      H007N2_A4588FasCC = new String[] {""} ;
      H007N2_n4588FasCC = new boolean[] {false} ;
      H007N2_A4791FasValMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007N2_n4791FasValMtr = new boolean[] {false} ;
      H007N2_A5168FasPreMC = new short[1] ;
      H007N2_n5168FasPreMC = new boolean[] {false} ;
      H007N2_A4343FasEstamp = new String[] {""} ;
      H007N2_n4343FasEstamp = new boolean[] {false} ;
      H007N2_A4299FasConPla = new String[] {""} ;
      H007N2_n4299FasConPla = new boolean[] {false} ;
      H007N2_A4286FasForMul = new String[] {""} ;
      H007N2_n4286FasForMul = new boolean[] {false} ;
      H007N2_A4903FasAcab = new String[] {""} ;
      H007N2_n4903FasAcab = new boolean[] {false} ;
      H007N2_A458FasCon = new String[] {""} ;
      H007N2_n458FasCon = new boolean[] {false} ;
      H007N2_A456FasActTin = new String[] {""} ;
      H007N2_n456FasActTin = new boolean[] {false} ;
      H007N2_A464FasNumPas = new short[1] ;
      H007N2_n464FasNumPas = new boolean[] {false} ;
      H007N2_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007N2_n472FasVelPro = new boolean[] {false} ;
      H007N2_A468FasPrePie = new short[1] ;
      H007N2_n468FasPrePie = new boolean[] {false} ;
      H007N2_A469FasPreSal = new short[1] ;
      H007N2_n469FasPreSal = new boolean[] {false} ;
      H007N2_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007N2_n5990FasDec2 = new boolean[] {false} ;
      H007N2_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007N2_n459FasDec = new boolean[] {false} ;
      H007N2_A606MaqDsc = new String[] {""} ;
      H007N2_n606MaqDsc = new boolean[] {false} ;
      H007N2_A602MaqCod = new String[] {""} ;
      H007N2_n602MaqCod = new boolean[] {false} ;
      H007N2_A7070FasSigla = new String[] {""} ;
      H007N2_n7070FasSigla = new boolean[] {false} ;
      H007N2_A460FasDsc = new String[] {""} ;
      H007N2_A457FasCod = new String[] {""} ;
      H007N2_A14042FasActiva = new String[] {""} ;
      H007N2_A396EmprCod = new String[] {""} ;
      H007N3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV132Station = "" ;
      AV131EmprCod = "" ;
      AV133EmprNom = "" ;
      AV134UsurCod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV56Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      GXv_int8 = new byte[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV58ManageFiltersXml = "" ;
      AV35ExcelFilename = "" ;
      AV36ErrorMessage = "" ;
      AV44UserCustomValue = "" ;
      AV50ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
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
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState32 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasproww__default(),
         new Object[] {
             new Object[] {
            H007N2_A5616FasTExt, H007N2_n5616FasTExt, H007N2_A5232FasProCtb, H007N2_n5232FasProCtb, H007N2_A4588FasCC, H007N2_n4588FasCC, H007N2_A4791FasValMtr, H007N2_n4791FasValMtr, H007N2_A5168FasPreMC, H007N2_n5168FasPreMC,
            H007N2_A4343FasEstamp, H007N2_n4343FasEstamp, H007N2_A4299FasConPla, H007N2_n4299FasConPla, H007N2_A4286FasForMul, H007N2_n4286FasForMul, H007N2_A4903FasAcab, H007N2_n4903FasAcab, H007N2_A458FasCon, H007N2_n458FasCon,
            H007N2_A456FasActTin, H007N2_n456FasActTin, H007N2_A464FasNumPas, H007N2_n464FasNumPas, H007N2_A472FasVelPro, H007N2_n472FasVelPro, H007N2_A468FasPrePie, H007N2_n468FasPrePie, H007N2_A469FasPreSal, H007N2_n469FasPreSal,
            H007N2_A5990FasDec2, H007N2_n5990FasDec2, H007N2_A459FasDec, H007N2_n459FasDec, H007N2_A606MaqDsc, H007N2_n606MaqDsc, H007N2_A602MaqCod, H007N2_n602MaqCod, H007N2_A7070FasSigla, H007N2_n7070FasSigla,
            H007N2_A460FasDsc, H007N2_A457FasCod, H007N2_A14042FasActiva, H007N2_A396EmprCod
            }
            , new Object[] {
            H007N3_AGRID_nRecordCount
            }
         }
      );
      AV142Pgmname = "TFASPROWW" ;
      /* GeneXus formulas. */
      AV142Pgmname = "TFASPROWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV59ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV82TFFasPreSal ;
   private short AV83TFFasPreSal_To ;
   private short AV85TFFasPrePie ;
   private short AV86TFFasPrePie_To ;
   private short AV91TFFasNumPas ;
   private short AV92TFFasNumPas_To ;
   private short AV13OrderedBy ;
   private short AV139FlagCC ;
   private short wbEnd ;
   private short wbStart ;
   private short AV128GridActions ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short A5168FasPreMC ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV159Tfasprowwds_17_tffaspresal ;
   private short AV160Tfasprowwds_18_tffaspresal_to ;
   private short AV161Tfasprowwds_19_tffasprepie ;
   private short AV162Tfasprowwds_20_tffasprepie_to ;
   private short AV165Tfasprowwds_23_tffasnumpas ;
   private short AV166Tfasprowwds_24_tffasnumpas_to ;
   private short AV130Parfss ;
   private short AV135Faspq ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtFasCod_Visible ;
   private int edtFasDsc_Visible ;
   private int edtFasSigla_Visible ;
   private int edtMaqCod_Visible ;
   private int edtMaqDsc_Visible ;
   private int edtFasDec_Visible ;
   private int edtFasDec2_Visible ;
   private int edtFasPreSal_Visible ;
   private int edtFasPrePie_Visible ;
   private int edtFasVelPro_Visible ;
   private int edtFasNumPas_Visible ;
   private int edtFasActTin_Visible ;
   private int edtFasCon_Visible ;
   private int edtFasAcab_Visible ;
   private int edtFasForMul_Visible ;
   private int edtFasConPla_Visible ;
   private int AV119PageToGo ;
   private int AV177GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV120GridCurrentPage ;
   private long AV121GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV76TFFasDec ;
   private java.math.BigDecimal AV77TFFasDec_To ;
   private java.math.BigDecimal AV79TFFasDec2 ;
   private java.math.BigDecimal AV80TFFasDec2_To ;
   private java.math.BigDecimal AV88TFFasVelPro ;
   private java.math.BigDecimal AV89TFFasVelPro_To ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A5990FasDec2 ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A4791FasValMtr ;
   private java.math.BigDecimal AV155Tfasprowwds_13_tffasdec ;
   private java.math.BigDecimal AV156Tfasprowwds_14_tffasdec_to ;
   private java.math.BigDecimal AV157Tfasprowwds_15_tffasdec2 ;
   private java.math.BigDecimal AV158Tfasprowwds_16_tffasdec2_to ;
   private java.math.BigDecimal AV163Tfasprowwds_21_tffasvelpro ;
   private java.math.BigDecimal AV164Tfasprowwds_22_tffasvelpro_to ;
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
   private String AV138TFFasActiva_Sel ;
   private String AV61TFFasCod ;
   private String AV62TFFasCod_Sel ;
   private String AV64TFFasDsc ;
   private String AV65TFFasDsc_Sel ;
   private String AV67TFFasSigla ;
   private String AV68TFFasSigla_Sel ;
   private String AV70TFMaqCod ;
   private String AV71TFMaqCod_Sel ;
   private String AV73TFMaqDsc ;
   private String AV74TFMaqDsc_Sel ;
   private String AV94TFFasActTin ;
   private String AV95TFFasActTin_Sel ;
   private String AV97TFFasCon ;
   private String AV98TFFasCon_Sel ;
   private String AV100TFFasAcab ;
   private String AV101TFFasAcab_Sel ;
   private String AV103TFFasForMul ;
   private String AV104TFFasForMul_Sel ;
   private String AV106TFFasConPla ;
   private String AV107TFFasConPla_Sel ;
   private String AV142Pgmname ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A14042FasActiva ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String A7070FasSigla ;
   private String edtFasSigla_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Internalname ;
   private String edtFasDec_Internalname ;
   private String edtFasDec2_Internalname ;
   private String edtFasPreSal_Internalname ;
   private String edtFasPrePie_Internalname ;
   private String edtFasVelPro_Internalname ;
   private String edtFasNumPas_Internalname ;
   private String A456FasActTin ;
   private String edtFasActTin_Internalname ;
   private String A458FasCon ;
   private String edtFasCon_Internalname ;
   private String A4903FasAcab ;
   private String edtFasAcab_Internalname ;
   private String A4286FasForMul ;
   private String edtFasForMul_Internalname ;
   private String A4299FasConPla ;
   private String edtFasConPla_Internalname ;
   private String A4343FasEstamp ;
   private String edtFasEstamp_Internalname ;
   private String edtFasPreMC_Internalname ;
   private String edtFasValMtr_Internalname ;
   private String A4588FasCC ;
   private String edtFasCC_Internalname ;
   private String A5232FasProCtb ;
   private String edtFasProCtb_Internalname ;
   private String A5616FasTExt ;
   private String edtFasTExt_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV145Tfasprowwds_3_tffascod ;
   private String lV147Tfasprowwds_5_tffasdsc ;
   private String lV149Tfasprowwds_7_tffassigla ;
   private String lV151Tfasprowwds_9_tfmaqcod ;
   private String lV153Tfasprowwds_11_tfmaqdsc ;
   private String lV167Tfasprowwds_25_tffasacttin ;
   private String lV169Tfasprowwds_27_tffascon ;
   private String lV171Tfasprowwds_29_tffasacab ;
   private String lV173Tfasprowwds_31_tffasformul ;
   private String lV175Tfasprowwds_33_tffasconpla ;
   private String AV144Tfasprowwds_2_tffasactiva_sel ;
   private String AV146Tfasprowwds_4_tffascod_sel ;
   private String AV145Tfasprowwds_3_tffascod ;
   private String AV148Tfasprowwds_6_tffasdsc_sel ;
   private String AV147Tfasprowwds_5_tffasdsc ;
   private String AV150Tfasprowwds_8_tffassigla_sel ;
   private String AV149Tfasprowwds_7_tffassigla ;
   private String AV152Tfasprowwds_10_tfmaqcod_sel ;
   private String AV151Tfasprowwds_9_tfmaqcod ;
   private String AV154Tfasprowwds_12_tfmaqdsc_sel ;
   private String AV153Tfasprowwds_11_tfmaqdsc ;
   private String AV168Tfasprowwds_26_tffasacttin_sel ;
   private String AV167Tfasprowwds_25_tffasacttin ;
   private String AV170Tfasprowwds_28_tffascon_sel ;
   private String AV169Tfasprowwds_27_tffascon ;
   private String AV172Tfasprowwds_30_tffasacab_sel ;
   private String AV171Tfasprowwds_29_tffasacab ;
   private String AV174Tfasprowwds_32_tffasformul_sel ;
   private String AV173Tfasprowwds_31_tffasformul ;
   private String AV176Tfasprowwds_34_tffasconpla_sel ;
   private String AV175Tfasprowwds_33_tffasconpla ;
   private String hsh ;
   private String AV132Station ;
   private String AV131EmprCod ;
   private String AV133EmprNom ;
   private String AV134UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
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
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
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
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasSigla_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtFasDec_Jsonclick ;
   private String edtFasDec2_Jsonclick ;
   private String edtFasPreSal_Jsonclick ;
   private String edtFasPrePie_Jsonclick ;
   private String edtFasVelPro_Jsonclick ;
   private String edtFasNumPas_Jsonclick ;
   private String edtFasActTin_Jsonclick ;
   private String edtFasCon_Jsonclick ;
   private String edtFasAcab_Jsonclick ;
   private String edtFasForMul_Jsonclick ;
   private String edtFasConPla_Jsonclick ;
   private String edtFasEstamp_Jsonclick ;
   private String edtFasPreMC_Jsonclick ;
   private String edtFasValMtr_Jsonclick ;
   private String edtFasCC_Jsonclick ;
   private String edtFasProCtb_Jsonclick ;
   private String edtFasTExt_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean n7070FasSigla ;
   private boolean n602MaqCod ;
   private boolean n606MaqDsc ;
   private boolean n459FasDec ;
   private boolean n5990FasDec2 ;
   private boolean n469FasPreSal ;
   private boolean n468FasPrePie ;
   private boolean n472FasVelPro ;
   private boolean n464FasNumPas ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private boolean n4299FasConPla ;
   private boolean n4343FasEstamp ;
   private boolean n5168FasPreMC ;
   private boolean n4791FasValMtr ;
   private boolean n4588FasCC ;
   private boolean n5232FasProCtb ;
   private boolean n5616FasTExt ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV136TempBoolean ;
   private String AV37ColumnsSelectorXML ;
   private String AV58ManageFiltersXml ;
   private String AV44UserCustomValue ;
   private String AV124FilterFullText ;
   private String lV143Tfasprowwds_1_filterfulltext ;
   private String AV143Tfasprowwds_1_filterfulltext ;
   private String AV35ExcelFilename ;
   private String AV36ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV56Session ;
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
   private ICheckbox chkFasActiva ;
   private IDataStoreProvider pr_default ;
   private String[] H007N2_A5616FasTExt ;
   private boolean[] H007N2_n5616FasTExt ;
   private String[] H007N2_A5232FasProCtb ;
   private boolean[] H007N2_n5232FasProCtb ;
   private String[] H007N2_A4588FasCC ;
   private boolean[] H007N2_n4588FasCC ;
   private java.math.BigDecimal[] H007N2_A4791FasValMtr ;
   private boolean[] H007N2_n4791FasValMtr ;
   private short[] H007N2_A5168FasPreMC ;
   private boolean[] H007N2_n5168FasPreMC ;
   private String[] H007N2_A4343FasEstamp ;
   private boolean[] H007N2_n4343FasEstamp ;
   private String[] H007N2_A4299FasConPla ;
   private boolean[] H007N2_n4299FasConPla ;
   private String[] H007N2_A4286FasForMul ;
   private boolean[] H007N2_n4286FasForMul ;
   private String[] H007N2_A4903FasAcab ;
   private boolean[] H007N2_n4903FasAcab ;
   private String[] H007N2_A458FasCon ;
   private boolean[] H007N2_n458FasCon ;
   private String[] H007N2_A456FasActTin ;
   private boolean[] H007N2_n456FasActTin ;
   private short[] H007N2_A464FasNumPas ;
   private boolean[] H007N2_n464FasNumPas ;
   private java.math.BigDecimal[] H007N2_A472FasVelPro ;
   private boolean[] H007N2_n472FasVelPro ;
   private short[] H007N2_A468FasPrePie ;
   private boolean[] H007N2_n468FasPrePie ;
   private short[] H007N2_A469FasPreSal ;
   private boolean[] H007N2_n469FasPreSal ;
   private java.math.BigDecimal[] H007N2_A5990FasDec2 ;
   private boolean[] H007N2_n5990FasDec2 ;
   private java.math.BigDecimal[] H007N2_A459FasDec ;
   private boolean[] H007N2_n459FasDec ;
   private String[] H007N2_A606MaqDsc ;
   private boolean[] H007N2_n606MaqDsc ;
   private String[] H007N2_A602MaqCod ;
   private boolean[] H007N2_n602MaqCod ;
   private String[] H007N2_A7070FasSigla ;
   private boolean[] H007N2_n7070FasSigla ;
   private String[] H007N2_A460FasDsc ;
   private String[] H007N2_A457FasCod ;
   private String[] H007N2_A14042FasActiva ;
   private String[] H007N2_A396EmprCod ;
   private long[] H007N3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV57ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState32[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV49ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV50ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV118DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tfasproww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H007N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV143Tfasprowwds_1_filterfulltext ,
                                          String AV144Tfasprowwds_2_tffasactiva_sel ,
                                          String AV146Tfasprowwds_4_tffascod_sel ,
                                          String AV145Tfasprowwds_3_tffascod ,
                                          String AV148Tfasprowwds_6_tffasdsc_sel ,
                                          String AV147Tfasprowwds_5_tffasdsc ,
                                          String AV150Tfasprowwds_8_tffassigla_sel ,
                                          String AV149Tfasprowwds_7_tffassigla ,
                                          String AV152Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV151Tfasprowwds_9_tfmaqcod ,
                                          String AV154Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV153Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV155Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV156Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV157Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV158Tfasprowwds_16_tffasdec2_to ,
                                          short AV159Tfasprowwds_17_tffaspresal ,
                                          short AV160Tfasprowwds_18_tffaspresal_to ,
                                          short AV161Tfasprowwds_19_tffasprepie ,
                                          short AV162Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV163Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV164Tfasprowwds_22_tffasvelpro_to ,
                                          short AV165Tfasprowwds_23_tffasnumpas ,
                                          short AV166Tfasprowwds_24_tffasnumpas_to ,
                                          String AV168Tfasprowwds_26_tffasacttin_sel ,
                                          String AV167Tfasprowwds_25_tffasacttin ,
                                          String AV170Tfasprowwds_28_tffascon_sel ,
                                          String AV169Tfasprowwds_27_tffascon ,
                                          String AV172Tfasprowwds_30_tffasacab_sel ,
                                          String AV171Tfasprowwds_29_tffasacab ,
                                          String AV174Tfasprowwds_32_tffasformul_sel ,
                                          String AV173Tfasprowwds_31_tffasformul ,
                                          String AV176Tfasprowwds_34_tffasconpla_sel ,
                                          String AV175Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[54];
      Object[] GXv_Object34 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.FasTExt, T1.FasProCtb, T1.FasCC, T1.FasValMtr, T1.FasPreMC, T1.FasEstamp, T1.FasConPla, T1.FasForMul, T1.FasAcab, T1.FasCon, T1.FasActTin, T1.FasNumPas, T1.FasVelPro," ;
      sSelectString += " T1.FasPrePie, T1.FasPreSal, T1.FasDec2, T1.FasDec, T2.MaqDsc, T1.MaqCod, T1.FasSigla, T1.FasDsc, T1.FasCod, T1.FasActiva, T1.EmprCod" ;
      sFromString = " FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV143Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int33[0] = (byte)(1) ;
         GXv_int33[1] = (byte)(1) ;
         GXv_int33[2] = (byte)(1) ;
         GXv_int33[3] = (byte)(1) ;
         GXv_int33[4] = (byte)(1) ;
         GXv_int33[5] = (byte)(1) ;
         GXv_int33[6] = (byte)(1) ;
         GXv_int33[7] = (byte)(1) ;
         GXv_int33[8] = (byte)(1) ;
         GXv_int33[9] = (byte)(1) ;
         GXv_int33[10] = (byte)(1) ;
         GXv_int33[11] = (byte)(1) ;
         GXv_int33[12] = (byte)(1) ;
         GXv_int33[13] = (byte)(1) ;
         GXv_int33[14] = (byte)(1) ;
         GXv_int33[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV145Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV147Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV149Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV151Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV153Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( ! (0==AV159Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( ! (0==AV160Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( ! (0==AV161Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( ! (0==AV162Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( ! (0==AV165Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      if ( ! (0==AV166Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int33[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV167Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int33[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV169Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int33[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV171Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int33[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV173Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int33[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV175Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int33[48] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasDsc" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasActiva" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasActiva DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasSigla" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasSigla DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasDec" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasDec DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasDec2" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasDec2 DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasPreSal" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasPreSal DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasPrePie" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasPrePie DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasVelPro" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasVelPro DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasNumPas" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasNumPas DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasActTin" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasActTin DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasCon" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasCon DESC" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasAcab" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasAcab DESC" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasForMul" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasForMul DESC" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasConPla" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasConPla DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.FasCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
   }

   protected Object[] conditional_H007N3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV143Tfasprowwds_1_filterfulltext ,
                                          String AV144Tfasprowwds_2_tffasactiva_sel ,
                                          String AV146Tfasprowwds_4_tffascod_sel ,
                                          String AV145Tfasprowwds_3_tffascod ,
                                          String AV148Tfasprowwds_6_tffasdsc_sel ,
                                          String AV147Tfasprowwds_5_tffasdsc ,
                                          String AV150Tfasprowwds_8_tffassigla_sel ,
                                          String AV149Tfasprowwds_7_tffassigla ,
                                          String AV152Tfasprowwds_10_tfmaqcod_sel ,
                                          String AV151Tfasprowwds_9_tfmaqcod ,
                                          String AV154Tfasprowwds_12_tfmaqdsc_sel ,
                                          String AV153Tfasprowwds_11_tfmaqdsc ,
                                          java.math.BigDecimal AV155Tfasprowwds_13_tffasdec ,
                                          java.math.BigDecimal AV156Tfasprowwds_14_tffasdec_to ,
                                          java.math.BigDecimal AV157Tfasprowwds_15_tffasdec2 ,
                                          java.math.BigDecimal AV158Tfasprowwds_16_tffasdec2_to ,
                                          short AV159Tfasprowwds_17_tffaspresal ,
                                          short AV160Tfasprowwds_18_tffaspresal_to ,
                                          short AV161Tfasprowwds_19_tffasprepie ,
                                          short AV162Tfasprowwds_20_tffasprepie_to ,
                                          java.math.BigDecimal AV163Tfasprowwds_21_tffasvelpro ,
                                          java.math.BigDecimal AV164Tfasprowwds_22_tffasvelpro_to ,
                                          short AV165Tfasprowwds_23_tffasnumpas ,
                                          short AV166Tfasprowwds_24_tffasnumpas_to ,
                                          String AV168Tfasprowwds_26_tffasacttin_sel ,
                                          String AV167Tfasprowwds_25_tffasacttin ,
                                          String AV170Tfasprowwds_28_tffascon_sel ,
                                          String AV169Tfasprowwds_27_tffascon ,
                                          String AV172Tfasprowwds_30_tffasacab_sel ,
                                          String AV171Tfasprowwds_29_tffasacab ,
                                          String AV174Tfasprowwds_32_tffasformul_sel ,
                                          String AV173Tfasprowwds_31_tffasformul ,
                                          String AV176Tfasprowwds_34_tffasconpla_sel ,
                                          String AV175Tfasprowwds_33_tffasconpla ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A7070FasSigla ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.math.BigDecimal A459FasDec ,
                                          java.math.BigDecimal A5990FasDec2 ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          String A14042FasActiva ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[49];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV143Tfasprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T1.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasSigla) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FasDec,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasDec2,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPreSal,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasPrePie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasVelPro,'990.9'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasNumPas,'990'), 2) like '%' || ?) or ( UPPER(T1.FasActTin) like '%' || UPPER(?)) or ( UPPER(T1.FasCon) like '%' || UPPER(?)) or ( UPPER(T1.FasAcab) like '%' || UPPER(?)) or ( UPPER(T1.FasForMul) like '%' || UPPER(?)) or ( UPPER(T1.FasConPla) like '%' || UPPER(?)))");
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
         GXv_int35[11] = (byte)(1) ;
         GXv_int35[12] = (byte)(1) ;
         GXv_int35[13] = (byte)(1) ;
         GXv_int35[14] = (byte)(1) ;
         GXv_int35[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Tfasprowwds_2_tffasactiva_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActiva = ?)");
      }
      else
      {
         GXv_int35[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Tfasprowwds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV145Tfasprowwds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Tfasprowwds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int35[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Tfasprowwds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV147Tfasprowwds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Tfasprowwds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDsc = ?)");
      }
      else
      {
         GXv_int35[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Tfasprowwds_8_tffassigla_sel)==0) && ( ! (GXutil.strcmp("", AV149Tfasprowwds_7_tffassigla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasSigla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Tfasprowwds_8_tffassigla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasSigla = ?)");
      }
      else
      {
         GXv_int35[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Tfasprowwds_10_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV151Tfasprowwds_9_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Tfasprowwds_10_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int35[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Tfasprowwds_12_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV153Tfasprowwds_11_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Tfasprowwds_12_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int35[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Tfasprowwds_13_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec >= ?)");
      }
      else
      {
         GXv_int35[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Tfasprowwds_14_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec <= ?)");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Tfasprowwds_15_tffasdec2)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 >= ?)");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158Tfasprowwds_16_tffasdec2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasDec2 <= ?)");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( ! (0==AV159Tfasprowwds_17_tffaspresal) )
      {
         addWhere(sWhereString, "(T1.FasPreSal >= ?)");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( ! (0==AV160Tfasprowwds_18_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T1.FasPreSal <= ?)");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
      }
      if ( ! (0==AV161Tfasprowwds_19_tffasprepie) )
      {
         addWhere(sWhereString, "(T1.FasPrePie >= ?)");
      }
      else
      {
         GXv_int35[33] = (byte)(1) ;
      }
      if ( ! (0==AV162Tfasprowwds_20_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T1.FasPrePie <= ?)");
      }
      else
      {
         GXv_int35[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Tfasprowwds_21_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro >= ?)");
      }
      else
      {
         GXv_int35[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Tfasprowwds_22_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasVelPro <= ?)");
      }
      else
      {
         GXv_int35[36] = (byte)(1) ;
      }
      if ( ! (0==AV165Tfasprowwds_23_tffasnumpas) )
      {
         addWhere(sWhereString, "(T1.FasNumPas >= ?)");
      }
      else
      {
         GXv_int35[37] = (byte)(1) ;
      }
      if ( ! (0==AV166Tfasprowwds_24_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T1.FasNumPas <= ?)");
      }
      else
      {
         GXv_int35[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Tfasprowwds_26_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV167Tfasprowwds_25_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Tfasprowwds_26_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasActTin = ?)");
      }
      else
      {
         GXv_int35[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Tfasprowwds_28_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV169Tfasprowwds_27_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Tfasprowwds_28_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCon = ?)");
      }
      else
      {
         GXv_int35[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Tfasprowwds_30_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV171Tfasprowwds_29_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Tfasprowwds_30_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasAcab = ?)");
      }
      else
      {
         GXv_int35[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Tfasprowwds_32_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV173Tfasprowwds_31_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Tfasprowwds_32_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasForMul = ?)");
      }
      else
      {
         GXv_int35[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Tfasprowwds_34_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV175Tfasprowwds_33_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Tfasprowwds_34_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasConPla = ?)");
      }
      else
      {
         GXv_int35[48] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ( AV14OrderedDsc ) )
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
                  return conditional_H007N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Boolean) dynConstraints[52]).booleanValue() );
            case 1 :
                  return conditional_H007N3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Boolean) dynConstraints[52]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H007N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H007N3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 9);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(15);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(17,1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(20, 4);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(21, 28);
               ((String[]) buf[41])[0] = rslt.getString(22, 8);
               ((String[]) buf[42])[0] = rslt.getString(23, 1);
               ((String[]) buf[43])[0] = rslt.getString(24, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[92]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[105]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               return;
      }
   }

}

