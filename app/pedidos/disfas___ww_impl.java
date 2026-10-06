package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disfas___ww_impl extends GXDataArea
{
   public disfas___ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disfas___ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disfas___ww_impl.class ));
   }

   public disfas___ww_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactiongroup1 = new HTMLChoice();
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
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               AV36VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36VisualizarAcciones", AV36VisualizarAcciones);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV36VisualizarAcciones));
               AV37AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37AccionesEnPopup", AV37AccionesEnPopup);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV37AccionesEnPopup));
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
      nRC_GXsfl_93 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_93"))) ;
      nGXsfl_93_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_93_idx"))) ;
      sGXsfl_93_idx = httpContext.GetPar( "sGXsfl_93_idx") ;
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      AV43TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV44TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV45TFFasDec = CommonUtil.decimalVal( httpContext.GetPar( "TFFasDec"), ".") ;
      AV46TFFasDec_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasDec_To"), ".") ;
      AV47TFFasPreSal = (short)(GXutil.lval( httpContext.GetPar( "TFFasPreSal"))) ;
      AV48TFFasPreSal_To = (short)(GXutil.lval( httpContext.GetPar( "TFFasPreSal_To"))) ;
      AV49TFFasPrePie = (short)(GXutil.lval( httpContext.GetPar( "TFFasPrePie"))) ;
      AV50TFFasPrePie_To = (short)(GXutil.lval( httpContext.GetPar( "TFFasPrePie_To"))) ;
      AV51TFFasVelPro = CommonUtil.decimalVal( httpContext.GetPar( "TFFasVelPro"), ".") ;
      AV52TFFasVelPro_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasVelPro_To"), ".") ;
      AV53TFFasNumPas = (short)(GXutil.lval( httpContext.GetPar( "TFFasNumPas"))) ;
      AV54TFFasNumPas_To = (short)(GXutil.lval( httpContext.GetPar( "TFFasNumPas_To"))) ;
      AV55TFFasActTin = httpContext.GetPar( "TFFasActTin") ;
      AV56TFFasActTin_Sel = httpContext.GetPar( "TFFasActTin_Sel") ;
      AV57TFFasCon = httpContext.GetPar( "TFFasCon") ;
      AV58TFFasCon_Sel = httpContext.GetPar( "TFFasCon_Sel") ;
      AV59TFFasAcab = httpContext.GetPar( "TFFasAcab") ;
      AV60TFFasAcab_Sel = httpContext.GetPar( "TFFasAcab_Sel") ;
      AV61TFFasForMul = httpContext.GetPar( "TFFasForMul") ;
      AV62TFFasForMul_Sel = httpContext.GetPar( "TFFasForMul_Sel") ;
      AV63TFDisFasObs = httpContext.GetPar( "TFDisFasObs") ;
      AV64TFDisFasObs_Sel = httpContext.GetPar( "TFDisFasObs_Sel") ;
      AV79Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV41Foraca = (short)(GXutil.lval( httpContext.GetPar( "Foraca"))) ;
      AV40Flag_not = (short)(GXutil.lval( httpContext.GetPar( "Flag_not"))) ;
      AV36VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
      AV37AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, A758ProCod, AV43TFMaqCod, AV44TFMaqCod_Sel, AV45TFFasDec, AV46TFFasDec_To, AV47TFFasPreSal, AV48TFFasPreSal_To, AV49TFFasPrePie, AV50TFFasPrePie_To, AV51TFFasVelPro, AV52TFFasVelPro_To, AV53TFFasNumPas, AV54TFFasNumPas_To, AV55TFFasActTin, AV56TFFasActTin_Sel, AV57TFFasCon, AV58TFFasCon_Sel, AV59TFFasAcab, AV60TFFasAcab_Sel, AV61TFFasForMul, AV62TFFasForMul_Sel, AV63TFDisFasObs, AV64TFDisFasObs_Sel, AV79Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Foraca, AV40Flag_not, AV36VisualizarAcciones, AV37AccionesEnPopup) ;
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
      pa2922( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2922( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.disfas___ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.booltostr(AV36VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV37AccionesEnPopup))}, new String[] {"EmprCod","DisCod","ProCod","VisualizarAcciones","AccionesEnPopup"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORACA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Foraca), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAG_NOT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Flag_not), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV36VisualizarAcciones));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV37AccionesEnPopup));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DisFas___WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV79Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disfas___ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_93", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_93, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV67FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV67FasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV31GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV32GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV29DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV29DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD", GXutil.rtrim( AV43TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD_SEL", GXutil.rtrim( AV44TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDEC", GXutil.ltrim( localUtil.ntoc( AV45TFFasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDEC_TO", GXutil.ltrim( localUtil.ntoc( AV46TFFasDec_To, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPRESAL", GXutil.ltrim( localUtil.ntoc( AV47TFFasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPRESAL_TO", GXutil.ltrim( localUtil.ntoc( AV48TFFasPreSal_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREPIE", GXutil.ltrim( localUtil.ntoc( AV49TFFasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREPIE_TO", GXutil.ltrim( localUtil.ntoc( AV50TFFasPrePie_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASVELPRO", GXutil.ltrim( localUtil.ntoc( AV51TFFasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASVELPRO_TO", GXutil.ltrim( localUtil.ntoc( AV52TFFasVelPro_To, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASNUMPAS", GXutil.ltrim( localUtil.ntoc( AV53TFFasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASNUMPAS_TO", GXutil.ltrim( localUtil.ntoc( AV54TFFasNumPas_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACTTIN", GXutil.rtrim( AV55TFFasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACTTIN_SEL", GXutil.rtrim( AV56TFFasActTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCON", GXutil.rtrim( AV57TFFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCON_SEL", GXutil.rtrim( AV58TFFasCon_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACAB", GXutil.rtrim( AV59TFFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACAB_SEL", GXutil.rtrim( AV60TFFasAcab_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASFORMUL", GXutil.rtrim( AV61TFFasForMul));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASFORMUL_SEL", GXutil.rtrim( AV62TFFasForMul_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISFASOBS", AV63TFDisFasObs);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISFASOBS_SEL", AV64TFDisFasObs_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vFORACA", GXutil.ltrim( localUtil.ntoc( AV41Foraca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORACA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Foraca), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG_NOT", GXutil.ltrim( localUtil.ntoc( AV40Flag_not, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAG_NOT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Flag_not), "ZZZ9")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vVISUALIZARACCIONES", AV36VisualizarAcciones);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV36VisualizarAcciones));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vACCIONESENPOPUP", AV37AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV37AccionesEnPopup));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", AV73Msg_err);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Width", GXutil.rtrim( Dvpanel_tablepedido_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autowidth", GXutil.booltostr( Dvpanel_tablepedido_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoheight", GXutil.booltostr( Dvpanel_tablepedido_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Cls", GXutil.rtrim( Dvpanel_tablepedido_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Title", GXutil.rtrim( Dvpanel_tablepedido_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsible", GXutil.booltostr( Dvpanel_tablepedido_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsed", GXutil.booltostr( Dvpanel_tablepedido_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Showcollapseicon", GXutil.booltostr( Dvpanel_tablepedido_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Iconposition", GXutil.rtrim( Dvpanel_tablepedido_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoscroll", GXutil.booltostr( Dvpanel_tablepedido_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_set", GXutil.rtrim( Combo_fascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitem", GXutil.booltostr( Combo_fascod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we2922( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2922( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.pedidos.disfas___ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.booltostr(AV36VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV37AccionesEnPopup))}, new String[] {"EmprCod","DisCod","ProCod","VisualizarAcciones","AccionesEnPopup"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.DisFas___WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Fase del proceso", "") ;
   }

   public void wb2920( )
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_tablepedido_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tablepedido_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablepedido.setProperty("Width", Dvpanel_tablepedido_Width);
         ucDvpanel_tablepedido.setProperty("AutoWidth", Dvpanel_tablepedido_Autowidth);
         ucDvpanel_tablepedido.setProperty("AutoHeight", Dvpanel_tablepedido_Autoheight);
         ucDvpanel_tablepedido.setProperty("Cls", Dvpanel_tablepedido_Cls);
         ucDvpanel_tablepedido.setProperty("Title", Dvpanel_tablepedido_Title);
         ucDvpanel_tablepedido.setProperty("Collapsible", Dvpanel_tablepedido_Collapsible);
         ucDvpanel_tablepedido.setProperty("Collapsed", Dvpanel_tablepedido_Collapsed);
         ucDvpanel_tablepedido.setProperty("ShowCollapseIcon", Dvpanel_tablepedido_Showcollapseicon);
         ucDvpanel_tablepedido.setProperty("IconPosition", Dvpanel_tablepedido_Iconposition);
         ucDvpanel_tablepedido.setProperty("AutoScroll", Dvpanel_tablepedido_Autoscroll);
         ucDvpanel_tablepedido.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablepedido_Internalname, "DVPANEL_TABLEPEDIDOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEPEDIDOContainer"+"TablePedido"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepedido_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbngruia_Internalname, httpContext.getMessage( "<b>Nº Disp Int</b>", ""), "", "", lblTbngruia_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisFec_Internalname, httpContext.getMessage( "Fecha Generación Pedido", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDisFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisFec_Internalname, localUtil.format(A369DisFec, "99/99/99"), localUtil.format( A369DisFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtDisFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisFas___WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtCod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtDsc_Internalname, GXutil.rtrim( A337DisArtDsc), GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas___WW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbprocod_Internalname, httpContext.getMessage( "<b>Proceso</b>", ""), "", "", lblTbprocod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-5 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas___WW.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable1_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable1_cell_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfaslin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisfaslin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisfaslin_Internalname, GXutil.ltrim( localUtil.ntoc( AV65DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDisfaslin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV65DisFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV65DisFasLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisfaslin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisfaslin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fascod_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblockcombo_fascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
         ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
         ucCombo_fascod.setProperty("EmptyItem", Combo_fascod_Emptyitem);
         ucCombo_fascod.setProperty("DropDownOptionsData", AV67FasCod_Data);
         ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfasobs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisfasobs_Internalname, httpContext.getMessage( "Obs p/Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_93_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavDisfasobs_Internalname, AV76DisFasObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", (short)(0), 1, edtavDisfasobs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "3000", 1, 3, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Pedidos\\DisFas___WW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 93, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 93, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisFas___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", divUnnamedtable2_Height, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol93( ) ;
      }
      if ( wbEnd == 93 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_93 = (int)(nGXsfl_93_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV31GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV32GridPageCount);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV79Pgmname), GXutil.rtrim( localUtil.format( AV79Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas___WW.htm");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_Internalname, GXutil.rtrim( AV66FasCod), GXutil.rtrim( localUtil.format( AV66FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_Jsonclick, 0, "Attribute", "", "", "", "", edtavFascod_Visible, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas___WW.htm");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV29DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisFas___WW.htm");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 93 )
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

   public void start2922( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Fase del proceso", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2920( ) ;
   }

   public void ws2922( )
   {
      start2922( ) ;
      evt2922( ) ;
   }

   public void evt2922( )
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
                           e112922 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122922 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132922 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e142922 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e152922 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VDISFASLIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162922 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'DOINSERTARFASE'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           nGXsfl_93_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_932( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV42GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActionGroup1), 4, 0));
                           A368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           n602MaqCod = false ;
                           A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
                           n459FasDec = false ;
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
                           A9841DisFasObs = httpContext.cgiGet( edtDisFasObs_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e172922 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e182922 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e192922 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e202922 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOINSERTARFASE'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsertarFase' */
                                 e212922 ();
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

   public void we2922( )
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

   public void pa2922( )
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
            GX_FocusControl = edtavDisfaslin_Internalname ;
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
      subsflControlProps_932( ) ;
      while ( nGXsfl_93_idx <= nRC_GXsfl_93 )
      {
         sendrow_932( ) ;
         nGXsfl_93_idx = ((subGrid_Islastpage==1)&&(nGXsfl_93_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_93_idx+1) ;
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_932( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 int A361DisCod ,
                                 String A758ProCod ,
                                 String AV43TFMaqCod ,
                                 String AV44TFMaqCod_Sel ,
                                 java.math.BigDecimal AV45TFFasDec ,
                                 java.math.BigDecimal AV46TFFasDec_To ,
                                 short AV47TFFasPreSal ,
                                 short AV48TFFasPreSal_To ,
                                 short AV49TFFasPrePie ,
                                 short AV50TFFasPrePie_To ,
                                 java.math.BigDecimal AV51TFFasVelPro ,
                                 java.math.BigDecimal AV52TFFasVelPro_To ,
                                 short AV53TFFasNumPas ,
                                 short AV54TFFasNumPas_To ,
                                 String AV55TFFasActTin ,
                                 String AV56TFFasActTin_Sel ,
                                 String AV57TFFasCon ,
                                 String AV58TFFasCon_Sel ,
                                 String AV59TFFasAcab ,
                                 String AV60TFFasAcab_Sel ,
                                 String AV61TFFasForMul ,
                                 String AV62TFFasForMul_Sel ,
                                 String AV63TFDisFasObs ,
                                 String AV64TFDisFasObs_Sel ,
                                 String AV79Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 short AV41Foraca ,
                                 short AV40Flag_not ,
                                 boolean AV36VisualizarAcciones ,
                                 boolean AV37AccionesEnPopup )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e182922 ();
      GRID_nCurrentRecord = 0 ;
      rf2922( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DisFas___WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV79Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disfas___ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISFASLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASLIN", GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")));
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
      rf2922( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV79Pgmname = "Pedidos.DisFas___WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79Pgmname", AV79Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2922( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(93) ;
      /* Execute user event: Refresh */
      e182922 ();
      nGXsfl_93_idx = 1 ;
      sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_932( ) ;
      bGXsfl_93_Refreshing = true ;
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
         subsflControlProps_932( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV81Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                              AV80Pedidos_disfas___wwds_1_tfmaqcod ,
                                              AV82Pedidos_disfas___wwds_3_tffasdec ,
                                              AV83Pedidos_disfas___wwds_4_tffasdec_to ,
                                              Short.valueOf(AV84Pedidos_disfas___wwds_5_tffaspresal) ,
                                              Short.valueOf(AV85Pedidos_disfas___wwds_6_tffaspresal_to) ,
                                              Short.valueOf(AV86Pedidos_disfas___wwds_7_tffasprepie) ,
                                              Short.valueOf(AV87Pedidos_disfas___wwds_8_tffasprepie_to) ,
                                              AV88Pedidos_disfas___wwds_9_tffasvelpro ,
                                              AV89Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                              Short.valueOf(AV90Pedidos_disfas___wwds_11_tffasnumpas) ,
                                              Short.valueOf(AV91Pedidos_disfas___wwds_12_tffasnumpas_to) ,
                                              AV93Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                              AV92Pedidos_disfas___wwds_13_tffasacttin ,
                                              AV95Pedidos_disfas___wwds_16_tffascon_sel ,
                                              AV94Pedidos_disfas___wwds_15_tffascon ,
                                              AV97Pedidos_disfas___wwds_18_tffasacab_sel ,
                                              AV96Pedidos_disfas___wwds_17_tffasacab ,
                                              AV99Pedidos_disfas___wwds_20_tffasformul_sel ,
                                              AV98Pedidos_disfas___wwds_19_tffasformul ,
                                              AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                              AV100Pedidos_disfas___wwds_21_tfdisfasobs ,
                                              A602MaqCod ,
                                              A459FasDec ,
                                              Short.valueOf(A469FasPreSal) ,
                                              Short.valueOf(A468FasPrePie) ,
                                              A472FasVelPro ,
                                              Short.valueOf(A464FasNumPas) ,
                                              A456FasActTin ,
                                              A458FasCon ,
                                              A4903FasAcab ,
                                              A4286FasForMul ,
                                              A9841DisFasObs ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A361DisCod) ,
                                              A758ProCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV80Pedidos_disfas___wwds_1_tfmaqcod = GXutil.padr( GXutil.rtrim( AV80Pedidos_disfas___wwds_1_tfmaqcod), 6, "%") ;
         lV92Pedidos_disfas___wwds_13_tffasacttin = GXutil.padr( GXutil.rtrim( AV92Pedidos_disfas___wwds_13_tffasacttin), 1, "%") ;
         lV94Pedidos_disfas___wwds_15_tffascon = GXutil.padr( GXutil.rtrim( AV94Pedidos_disfas___wwds_15_tffascon), 1, "%") ;
         lV96Pedidos_disfas___wwds_17_tffasacab = GXutil.padr( GXutil.rtrim( AV96Pedidos_disfas___wwds_17_tffasacab), 1, "%") ;
         lV98Pedidos_disfas___wwds_19_tffasformul = GXutil.padr( GXutil.rtrim( AV98Pedidos_disfas___wwds_19_tffasformul), 1, "%") ;
         lV100Pedidos_disfas___wwds_21_tfdisfasobs = GXutil.concat( GXutil.rtrim( AV100Pedidos_disfas___wwds_21_tfdisfasobs), "%", "") ;
         /* Using cursor H02922 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, lV80Pedidos_disfas___wwds_1_tfmaqcod, AV81Pedidos_disfas___wwds_2_tfmaqcod_sel, AV82Pedidos_disfas___wwds_3_tffasdec, AV83Pedidos_disfas___wwds_4_tffasdec_to, Short.valueOf(AV84Pedidos_disfas___wwds_5_tffaspresal), Short.valueOf(AV85Pedidos_disfas___wwds_6_tffaspresal_to), Short.valueOf(AV86Pedidos_disfas___wwds_7_tffasprepie), Short.valueOf(AV87Pedidos_disfas___wwds_8_tffasprepie_to), AV88Pedidos_disfas___wwds_9_tffasvelpro, AV89Pedidos_disfas___wwds_10_tffasvelpro_to, Short.valueOf(AV90Pedidos_disfas___wwds_11_tffasnumpas), Short.valueOf(AV91Pedidos_disfas___wwds_12_tffasnumpas_to), lV92Pedidos_disfas___wwds_13_tffasacttin, AV93Pedidos_disfas___wwds_14_tffasacttin_sel, lV94Pedidos_disfas___wwds_15_tffascon, AV95Pedidos_disfas___wwds_16_tffascon_sel, lV96Pedidos_disfas___wwds_17_tffasacab, AV97Pedidos_disfas___wwds_18_tffasacab_sel, lV98Pedidos_disfas___wwds_19_tffasformul, AV99Pedidos_disfas___wwds_20_tffasformul_sel, lV100Pedidos_disfas___wwds_21_tfdisfasobs, AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_93_idx = 1 ;
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_932( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A9841DisFasObs = H02922_A9841DisFasObs[0] ;
            A4286FasForMul = H02922_A4286FasForMul[0] ;
            n4286FasForMul = H02922_n4286FasForMul[0] ;
            A4903FasAcab = H02922_A4903FasAcab[0] ;
            n4903FasAcab = H02922_n4903FasAcab[0] ;
            A458FasCon = H02922_A458FasCon[0] ;
            n458FasCon = H02922_n458FasCon[0] ;
            A456FasActTin = H02922_A456FasActTin[0] ;
            n456FasActTin = H02922_n456FasActTin[0] ;
            A464FasNumPas = H02922_A464FasNumPas[0] ;
            n464FasNumPas = H02922_n464FasNumPas[0] ;
            A472FasVelPro = H02922_A472FasVelPro[0] ;
            n472FasVelPro = H02922_n472FasVelPro[0] ;
            A468FasPrePie = H02922_A468FasPrePie[0] ;
            n468FasPrePie = H02922_n468FasPrePie[0] ;
            A469FasPreSal = H02922_A469FasPreSal[0] ;
            n469FasPreSal = H02922_n469FasPreSal[0] ;
            A459FasDec = H02922_A459FasDec[0] ;
            n459FasDec = H02922_n459FasDec[0] ;
            A602MaqCod = H02922_A602MaqCod[0] ;
            n602MaqCod = H02922_n602MaqCod[0] ;
            A460FasDsc = H02922_A460FasDsc[0] ;
            A457FasCod = H02922_A457FasCod[0] ;
            A368DisFasLin = H02922_A368DisFasLin[0] ;
            A4286FasForMul = H02922_A4286FasForMul[0] ;
            n4286FasForMul = H02922_n4286FasForMul[0] ;
            A4903FasAcab = H02922_A4903FasAcab[0] ;
            n4903FasAcab = H02922_n4903FasAcab[0] ;
            A458FasCon = H02922_A458FasCon[0] ;
            n458FasCon = H02922_n458FasCon[0] ;
            A456FasActTin = H02922_A456FasActTin[0] ;
            n456FasActTin = H02922_n456FasActTin[0] ;
            A464FasNumPas = H02922_A464FasNumPas[0] ;
            n464FasNumPas = H02922_n464FasNumPas[0] ;
            A472FasVelPro = H02922_A472FasVelPro[0] ;
            n472FasVelPro = H02922_n472FasVelPro[0] ;
            A468FasPrePie = H02922_A468FasPrePie[0] ;
            n468FasPrePie = H02922_n468FasPrePie[0] ;
            A469FasPreSal = H02922_A469FasPreSal[0] ;
            n469FasPreSal = H02922_n469FasPreSal[0] ;
            A459FasDec = H02922_A459FasDec[0] ;
            n459FasDec = H02922_n459FasDec[0] ;
            A602MaqCod = H02922_A602MaqCod[0] ;
            n602MaqCod = H02922_n602MaqCod[0] ;
            A460FasDsc = H02922_A460FasDsc[0] ;
            e192922 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(93) ;
         wb2920( ) ;
      }
      bGXsfl_93_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2922( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vFORACA", GXutil.ltrim( localUtil.ntoc( AV41Foraca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORACA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Foraca), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG_NOT", GXutil.ltrim( localUtil.ntoc( AV40Flag_not, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAG_NOT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Flag_not), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISFASLIN"+"_"+sGXsfl_93_idx, getSecureSignedToken( sGXsfl_93_idx, localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9")));
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
      AV80Pedidos_disfas___wwds_1_tfmaqcod = AV43TFMaqCod ;
      AV81Pedidos_disfas___wwds_2_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV82Pedidos_disfas___wwds_3_tffasdec = AV45TFFasDec ;
      AV83Pedidos_disfas___wwds_4_tffasdec_to = AV46TFFasDec_To ;
      AV84Pedidos_disfas___wwds_5_tffaspresal = AV47TFFasPreSal ;
      AV85Pedidos_disfas___wwds_6_tffaspresal_to = AV48TFFasPreSal_To ;
      AV86Pedidos_disfas___wwds_7_tffasprepie = AV49TFFasPrePie ;
      AV87Pedidos_disfas___wwds_8_tffasprepie_to = AV50TFFasPrePie_To ;
      AV88Pedidos_disfas___wwds_9_tffasvelpro = AV51TFFasVelPro ;
      AV89Pedidos_disfas___wwds_10_tffasvelpro_to = AV52TFFasVelPro_To ;
      AV90Pedidos_disfas___wwds_11_tffasnumpas = AV53TFFasNumPas ;
      AV91Pedidos_disfas___wwds_12_tffasnumpas_to = AV54TFFasNumPas_To ;
      AV92Pedidos_disfas___wwds_13_tffasacttin = AV55TFFasActTin ;
      AV93Pedidos_disfas___wwds_14_tffasacttin_sel = AV56TFFasActTin_Sel ;
      AV94Pedidos_disfas___wwds_15_tffascon = AV57TFFasCon ;
      AV95Pedidos_disfas___wwds_16_tffascon_sel = AV58TFFasCon_Sel ;
      AV96Pedidos_disfas___wwds_17_tffasacab = AV59TFFasAcab ;
      AV97Pedidos_disfas___wwds_18_tffasacab_sel = AV60TFFasAcab_Sel ;
      AV98Pedidos_disfas___wwds_19_tffasformul = AV61TFFasForMul ;
      AV99Pedidos_disfas___wwds_20_tffasformul_sel = AV62TFFasForMul_Sel ;
      AV100Pedidos_disfas___wwds_21_tfdisfasobs = AV63TFDisFasObs ;
      AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV64TFDisFasObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV81Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                           AV80Pedidos_disfas___wwds_1_tfmaqcod ,
                                           AV82Pedidos_disfas___wwds_3_tffasdec ,
                                           AV83Pedidos_disfas___wwds_4_tffasdec_to ,
                                           Short.valueOf(AV84Pedidos_disfas___wwds_5_tffaspresal) ,
                                           Short.valueOf(AV85Pedidos_disfas___wwds_6_tffaspresal_to) ,
                                           Short.valueOf(AV86Pedidos_disfas___wwds_7_tffasprepie) ,
                                           Short.valueOf(AV87Pedidos_disfas___wwds_8_tffasprepie_to) ,
                                           AV88Pedidos_disfas___wwds_9_tffasvelpro ,
                                           AV89Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                           Short.valueOf(AV90Pedidos_disfas___wwds_11_tffasnumpas) ,
                                           Short.valueOf(AV91Pedidos_disfas___wwds_12_tffasnumpas_to) ,
                                           AV93Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                           AV92Pedidos_disfas___wwds_13_tffasacttin ,
                                           AV95Pedidos_disfas___wwds_16_tffascon_sel ,
                                           AV94Pedidos_disfas___wwds_15_tffascon ,
                                           AV97Pedidos_disfas___wwds_18_tffasacab_sel ,
                                           AV96Pedidos_disfas___wwds_17_tffasacab ,
                                           AV99Pedidos_disfas___wwds_20_tffasformul_sel ,
                                           AV98Pedidos_disfas___wwds_19_tffasformul ,
                                           AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                           AV100Pedidos_disfas___wwds_21_tfdisfasobs ,
                                           A602MaqCod ,
                                           A459FasDec ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A9841DisFasObs ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A758ProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV80Pedidos_disfas___wwds_1_tfmaqcod = GXutil.padr( GXutil.rtrim( AV80Pedidos_disfas___wwds_1_tfmaqcod), 6, "%") ;
      lV92Pedidos_disfas___wwds_13_tffasacttin = GXutil.padr( GXutil.rtrim( AV92Pedidos_disfas___wwds_13_tffasacttin), 1, "%") ;
      lV94Pedidos_disfas___wwds_15_tffascon = GXutil.padr( GXutil.rtrim( AV94Pedidos_disfas___wwds_15_tffascon), 1, "%") ;
      lV96Pedidos_disfas___wwds_17_tffasacab = GXutil.padr( GXutil.rtrim( AV96Pedidos_disfas___wwds_17_tffasacab), 1, "%") ;
      lV98Pedidos_disfas___wwds_19_tffasformul = GXutil.padr( GXutil.rtrim( AV98Pedidos_disfas___wwds_19_tffasformul), 1, "%") ;
      lV100Pedidos_disfas___wwds_21_tfdisfasobs = GXutil.concat( GXutil.rtrim( AV100Pedidos_disfas___wwds_21_tfdisfasobs), "%", "") ;
      /* Using cursor H02923 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, lV80Pedidos_disfas___wwds_1_tfmaqcod, AV81Pedidos_disfas___wwds_2_tfmaqcod_sel, AV82Pedidos_disfas___wwds_3_tffasdec, AV83Pedidos_disfas___wwds_4_tffasdec_to, Short.valueOf(AV84Pedidos_disfas___wwds_5_tffaspresal), Short.valueOf(AV85Pedidos_disfas___wwds_6_tffaspresal_to), Short.valueOf(AV86Pedidos_disfas___wwds_7_tffasprepie), Short.valueOf(AV87Pedidos_disfas___wwds_8_tffasprepie_to), AV88Pedidos_disfas___wwds_9_tffasvelpro, AV89Pedidos_disfas___wwds_10_tffasvelpro_to, Short.valueOf(AV90Pedidos_disfas___wwds_11_tffasnumpas), Short.valueOf(AV91Pedidos_disfas___wwds_12_tffasnumpas_to), lV92Pedidos_disfas___wwds_13_tffasacttin, AV93Pedidos_disfas___wwds_14_tffasacttin_sel, lV94Pedidos_disfas___wwds_15_tffascon, AV95Pedidos_disfas___wwds_16_tffascon_sel, lV96Pedidos_disfas___wwds_17_tffasacab, AV97Pedidos_disfas___wwds_18_tffasacab_sel, lV98Pedidos_disfas___wwds_19_tffasformul, AV99Pedidos_disfas___wwds_20_tffasformul_sel, lV100Pedidos_disfas___wwds_21_tfdisfasobs, AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel});
      GRID_nRecordCount = H02923_AGRID_nRecordCount[0] ;
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
      AV80Pedidos_disfas___wwds_1_tfmaqcod = AV43TFMaqCod ;
      AV81Pedidos_disfas___wwds_2_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV82Pedidos_disfas___wwds_3_tffasdec = AV45TFFasDec ;
      AV83Pedidos_disfas___wwds_4_tffasdec_to = AV46TFFasDec_To ;
      AV84Pedidos_disfas___wwds_5_tffaspresal = AV47TFFasPreSal ;
      AV85Pedidos_disfas___wwds_6_tffaspresal_to = AV48TFFasPreSal_To ;
      AV86Pedidos_disfas___wwds_7_tffasprepie = AV49TFFasPrePie ;
      AV87Pedidos_disfas___wwds_8_tffasprepie_to = AV50TFFasPrePie_To ;
      AV88Pedidos_disfas___wwds_9_tffasvelpro = AV51TFFasVelPro ;
      AV89Pedidos_disfas___wwds_10_tffasvelpro_to = AV52TFFasVelPro_To ;
      AV90Pedidos_disfas___wwds_11_tffasnumpas = AV53TFFasNumPas ;
      AV91Pedidos_disfas___wwds_12_tffasnumpas_to = AV54TFFasNumPas_To ;
      AV92Pedidos_disfas___wwds_13_tffasacttin = AV55TFFasActTin ;
      AV93Pedidos_disfas___wwds_14_tffasacttin_sel = AV56TFFasActTin_Sel ;
      AV94Pedidos_disfas___wwds_15_tffascon = AV57TFFasCon ;
      AV95Pedidos_disfas___wwds_16_tffascon_sel = AV58TFFasCon_Sel ;
      AV96Pedidos_disfas___wwds_17_tffasacab = AV59TFFasAcab ;
      AV97Pedidos_disfas___wwds_18_tffasacab_sel = AV60TFFasAcab_Sel ;
      AV98Pedidos_disfas___wwds_19_tffasformul = AV61TFFasForMul ;
      AV99Pedidos_disfas___wwds_20_tffasformul_sel = AV62TFFasForMul_Sel ;
      AV100Pedidos_disfas___wwds_21_tfdisfasobs = AV63TFDisFasObs ;
      AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV64TFDisFasObs_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, A758ProCod, AV43TFMaqCod, AV44TFMaqCod_Sel, AV45TFFasDec, AV46TFFasDec_To, AV47TFFasPreSal, AV48TFFasPreSal_To, AV49TFFasPrePie, AV50TFFasPrePie_To, AV51TFFasVelPro, AV52TFFasVelPro_To, AV53TFFasNumPas, AV54TFFasNumPas_To, AV55TFFasActTin, AV56TFFasActTin_Sel, AV57TFFasCon, AV58TFFasCon_Sel, AV59TFFasAcab, AV60TFFasAcab_Sel, AV61TFFasForMul, AV62TFFasForMul_Sel, AV63TFDisFasObs, AV64TFDisFasObs_Sel, AV79Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Foraca, AV40Flag_not, AV36VisualizarAcciones, AV37AccionesEnPopup) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV80Pedidos_disfas___wwds_1_tfmaqcod = AV43TFMaqCod ;
      AV81Pedidos_disfas___wwds_2_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV82Pedidos_disfas___wwds_3_tffasdec = AV45TFFasDec ;
      AV83Pedidos_disfas___wwds_4_tffasdec_to = AV46TFFasDec_To ;
      AV84Pedidos_disfas___wwds_5_tffaspresal = AV47TFFasPreSal ;
      AV85Pedidos_disfas___wwds_6_tffaspresal_to = AV48TFFasPreSal_To ;
      AV86Pedidos_disfas___wwds_7_tffasprepie = AV49TFFasPrePie ;
      AV87Pedidos_disfas___wwds_8_tffasprepie_to = AV50TFFasPrePie_To ;
      AV88Pedidos_disfas___wwds_9_tffasvelpro = AV51TFFasVelPro ;
      AV89Pedidos_disfas___wwds_10_tffasvelpro_to = AV52TFFasVelPro_To ;
      AV90Pedidos_disfas___wwds_11_tffasnumpas = AV53TFFasNumPas ;
      AV91Pedidos_disfas___wwds_12_tffasnumpas_to = AV54TFFasNumPas_To ;
      AV92Pedidos_disfas___wwds_13_tffasacttin = AV55TFFasActTin ;
      AV93Pedidos_disfas___wwds_14_tffasacttin_sel = AV56TFFasActTin_Sel ;
      AV94Pedidos_disfas___wwds_15_tffascon = AV57TFFasCon ;
      AV95Pedidos_disfas___wwds_16_tffascon_sel = AV58TFFasCon_Sel ;
      AV96Pedidos_disfas___wwds_17_tffasacab = AV59TFFasAcab ;
      AV97Pedidos_disfas___wwds_18_tffasacab_sel = AV60TFFasAcab_Sel ;
      AV98Pedidos_disfas___wwds_19_tffasformul = AV61TFFasForMul ;
      AV99Pedidos_disfas___wwds_20_tffasformul_sel = AV62TFFasForMul_Sel ;
      AV100Pedidos_disfas___wwds_21_tfdisfasobs = AV63TFDisFasObs ;
      AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV64TFDisFasObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, A758ProCod, AV43TFMaqCod, AV44TFMaqCod_Sel, AV45TFFasDec, AV46TFFasDec_To, AV47TFFasPreSal, AV48TFFasPreSal_To, AV49TFFasPrePie, AV50TFFasPrePie_To, AV51TFFasVelPro, AV52TFFasVelPro_To, AV53TFFasNumPas, AV54TFFasNumPas_To, AV55TFFasActTin, AV56TFFasActTin_Sel, AV57TFFasCon, AV58TFFasCon_Sel, AV59TFFasAcab, AV60TFFasAcab_Sel, AV61TFFasForMul, AV62TFFasForMul_Sel, AV63TFDisFasObs, AV64TFDisFasObs_Sel, AV79Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Foraca, AV40Flag_not, AV36VisualizarAcciones, AV37AccionesEnPopup) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV80Pedidos_disfas___wwds_1_tfmaqcod = AV43TFMaqCod ;
      AV81Pedidos_disfas___wwds_2_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV82Pedidos_disfas___wwds_3_tffasdec = AV45TFFasDec ;
      AV83Pedidos_disfas___wwds_4_tffasdec_to = AV46TFFasDec_To ;
      AV84Pedidos_disfas___wwds_5_tffaspresal = AV47TFFasPreSal ;
      AV85Pedidos_disfas___wwds_6_tffaspresal_to = AV48TFFasPreSal_To ;
      AV86Pedidos_disfas___wwds_7_tffasprepie = AV49TFFasPrePie ;
      AV87Pedidos_disfas___wwds_8_tffasprepie_to = AV50TFFasPrePie_To ;
      AV88Pedidos_disfas___wwds_9_tffasvelpro = AV51TFFasVelPro ;
      AV89Pedidos_disfas___wwds_10_tffasvelpro_to = AV52TFFasVelPro_To ;
      AV90Pedidos_disfas___wwds_11_tffasnumpas = AV53TFFasNumPas ;
      AV91Pedidos_disfas___wwds_12_tffasnumpas_to = AV54TFFasNumPas_To ;
      AV92Pedidos_disfas___wwds_13_tffasacttin = AV55TFFasActTin ;
      AV93Pedidos_disfas___wwds_14_tffasacttin_sel = AV56TFFasActTin_Sel ;
      AV94Pedidos_disfas___wwds_15_tffascon = AV57TFFasCon ;
      AV95Pedidos_disfas___wwds_16_tffascon_sel = AV58TFFasCon_Sel ;
      AV96Pedidos_disfas___wwds_17_tffasacab = AV59TFFasAcab ;
      AV97Pedidos_disfas___wwds_18_tffasacab_sel = AV60TFFasAcab_Sel ;
      AV98Pedidos_disfas___wwds_19_tffasformul = AV61TFFasForMul ;
      AV99Pedidos_disfas___wwds_20_tffasformul_sel = AV62TFFasForMul_Sel ;
      AV100Pedidos_disfas___wwds_21_tfdisfasobs = AV63TFDisFasObs ;
      AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV64TFDisFasObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, A758ProCod, AV43TFMaqCod, AV44TFMaqCod_Sel, AV45TFFasDec, AV46TFFasDec_To, AV47TFFasPreSal, AV48TFFasPreSal_To, AV49TFFasPrePie, AV50TFFasPrePie_To, AV51TFFasVelPro, AV52TFFasVelPro_To, AV53TFFasNumPas, AV54TFFasNumPas_To, AV55TFFasActTin, AV56TFFasActTin_Sel, AV57TFFasCon, AV58TFFasCon_Sel, AV59TFFasAcab, AV60TFFasAcab_Sel, AV61TFFasForMul, AV62TFFasForMul_Sel, AV63TFDisFasObs, AV64TFDisFasObs_Sel, AV79Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Foraca, AV40Flag_not, AV36VisualizarAcciones, AV37AccionesEnPopup) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV80Pedidos_disfas___wwds_1_tfmaqcod = AV43TFMaqCod ;
      AV81Pedidos_disfas___wwds_2_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV82Pedidos_disfas___wwds_3_tffasdec = AV45TFFasDec ;
      AV83Pedidos_disfas___wwds_4_tffasdec_to = AV46TFFasDec_To ;
      AV84Pedidos_disfas___wwds_5_tffaspresal = AV47TFFasPreSal ;
      AV85Pedidos_disfas___wwds_6_tffaspresal_to = AV48TFFasPreSal_To ;
      AV86Pedidos_disfas___wwds_7_tffasprepie = AV49TFFasPrePie ;
      AV87Pedidos_disfas___wwds_8_tffasprepie_to = AV50TFFasPrePie_To ;
      AV88Pedidos_disfas___wwds_9_tffasvelpro = AV51TFFasVelPro ;
      AV89Pedidos_disfas___wwds_10_tffasvelpro_to = AV52TFFasVelPro_To ;
      AV90Pedidos_disfas___wwds_11_tffasnumpas = AV53TFFasNumPas ;
      AV91Pedidos_disfas___wwds_12_tffasnumpas_to = AV54TFFasNumPas_To ;
      AV92Pedidos_disfas___wwds_13_tffasacttin = AV55TFFasActTin ;
      AV93Pedidos_disfas___wwds_14_tffasacttin_sel = AV56TFFasActTin_Sel ;
      AV94Pedidos_disfas___wwds_15_tffascon = AV57TFFasCon ;
      AV95Pedidos_disfas___wwds_16_tffascon_sel = AV58TFFasCon_Sel ;
      AV96Pedidos_disfas___wwds_17_tffasacab = AV59TFFasAcab ;
      AV97Pedidos_disfas___wwds_18_tffasacab_sel = AV60TFFasAcab_Sel ;
      AV98Pedidos_disfas___wwds_19_tffasformul = AV61TFFasForMul ;
      AV99Pedidos_disfas___wwds_20_tffasformul_sel = AV62TFFasForMul_Sel ;
      AV100Pedidos_disfas___wwds_21_tfdisfasobs = AV63TFDisFasObs ;
      AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV64TFDisFasObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, A758ProCod, AV43TFMaqCod, AV44TFMaqCod_Sel, AV45TFFasDec, AV46TFFasDec_To, AV47TFFasPreSal, AV48TFFasPreSal_To, AV49TFFasPrePie, AV50TFFasPrePie_To, AV51TFFasVelPro, AV52TFFasVelPro_To, AV53TFFasNumPas, AV54TFFasNumPas_To, AV55TFFasActTin, AV56TFFasActTin_Sel, AV57TFFasCon, AV58TFFasCon_Sel, AV59TFFasAcab, AV60TFFasAcab_Sel, AV61TFFasForMul, AV62TFFasForMul_Sel, AV63TFDisFasObs, AV64TFDisFasObs_Sel, AV79Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Foraca, AV40Flag_not, AV36VisualizarAcciones, AV37AccionesEnPopup) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV80Pedidos_disfas___wwds_1_tfmaqcod = AV43TFMaqCod ;
      AV81Pedidos_disfas___wwds_2_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV82Pedidos_disfas___wwds_3_tffasdec = AV45TFFasDec ;
      AV83Pedidos_disfas___wwds_4_tffasdec_to = AV46TFFasDec_To ;
      AV84Pedidos_disfas___wwds_5_tffaspresal = AV47TFFasPreSal ;
      AV85Pedidos_disfas___wwds_6_tffaspresal_to = AV48TFFasPreSal_To ;
      AV86Pedidos_disfas___wwds_7_tffasprepie = AV49TFFasPrePie ;
      AV87Pedidos_disfas___wwds_8_tffasprepie_to = AV50TFFasPrePie_To ;
      AV88Pedidos_disfas___wwds_9_tffasvelpro = AV51TFFasVelPro ;
      AV89Pedidos_disfas___wwds_10_tffasvelpro_to = AV52TFFasVelPro_To ;
      AV90Pedidos_disfas___wwds_11_tffasnumpas = AV53TFFasNumPas ;
      AV91Pedidos_disfas___wwds_12_tffasnumpas_to = AV54TFFasNumPas_To ;
      AV92Pedidos_disfas___wwds_13_tffasacttin = AV55TFFasActTin ;
      AV93Pedidos_disfas___wwds_14_tffasacttin_sel = AV56TFFasActTin_Sel ;
      AV94Pedidos_disfas___wwds_15_tffascon = AV57TFFasCon ;
      AV95Pedidos_disfas___wwds_16_tffascon_sel = AV58TFFasCon_Sel ;
      AV96Pedidos_disfas___wwds_17_tffasacab = AV59TFFasAcab ;
      AV97Pedidos_disfas___wwds_18_tffasacab_sel = AV60TFFasAcab_Sel ;
      AV98Pedidos_disfas___wwds_19_tffasformul = AV61TFFasForMul ;
      AV99Pedidos_disfas___wwds_20_tffasformul_sel = AV62TFFasForMul_Sel ;
      AV100Pedidos_disfas___wwds_21_tfdisfasobs = AV63TFDisFasObs ;
      AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV64TFDisFasObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, A758ProCod, AV43TFMaqCod, AV44TFMaqCod_Sel, AV45TFFasDec, AV46TFFasDec_To, AV47TFFasPreSal, AV48TFFasPreSal_To, AV49TFFasPrePie, AV50TFFasPrePie_To, AV51TFFasVelPro, AV52TFFasVelPro_To, AV53TFFasNumPas, AV54TFFasNumPas_To, AV55TFFasActTin, AV56TFFasActTin_Sel, AV57TFFasCon, AV58TFFasCon_Sel, AV59TFFasAcab, AV60TFFasAcab_Sel, AV61TFFasForMul, AV62TFFasForMul_Sel, AV63TFDisFasObs, AV64TFDisFasObs_Sel, AV79Pgmname, AV12OrderedBy, AV13OrderedDsc, AV41Foraca, AV40Flag_not, AV36VisualizarAcciones, AV37AccionesEnPopup) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV79Pgmname = "Pedidos.DisFas___WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79Pgmname", AV79Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      /* Using cursor H02924 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      A369DisFec = H02924_A369DisFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A252CliCod = H02924_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A335DisArtCod = H02924_A335DisArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A337DisArtDsc = H02924_A337DisArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      pr_default.close(2);
      /* Using cursor H02925 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      A279CliNom = H02925_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor H02926 */
      pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod});
      A759ProDsc = H02926_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      fix_multi_value_controls( ) ;
   }

   public void strup2920( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e172922 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV67FasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV29DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_93 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_93"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV31GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV32GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tablepedido_Width = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Width") ;
         Dvpanel_tablepedido_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autowidth")) ;
         Dvpanel_tablepedido_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoheight")) ;
         Dvpanel_tablepedido_Cls = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Cls") ;
         Dvpanel_tablepedido_Title = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Title") ;
         Dvpanel_tablepedido_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsible")) ;
         Dvpanel_tablepedido_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsed")) ;
         Dvpanel_tablepedido_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Showcollapseicon")) ;
         Dvpanel_tablepedido_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Iconposition") ;
         Dvpanel_tablepedido_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoscroll")) ;
         Combo_fascod_Cls = httpContext.cgiGet( "COMBO_FASCOD_Cls") ;
         Combo_fascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_set") ;
         Combo_fascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Emptyitem")) ;
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDisfaslin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDisfaslin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISFASLIN");
            GX_FocusControl = edtavDisfaslin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV65DisFasLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65DisFasLin), 4, 0));
         }
         else
         {
            AV65DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavDisfaslin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65DisFasLin), 4, 0));
         }
         AV76DisFasObs = httpContext.cgiGet( edtavDisfasobs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76DisFasObs", AV76DisFasObs);
         AV79Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79Pgmname", AV79Pgmname);
         AV66FasCod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66FasCod", AV66FasCod);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DisFas___WW");
         AV79Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79Pgmname", AV79Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV79Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidos\\disfas___ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e172922 ();
      if (returnInSub) return;
   }

   public void e172922( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV41Foraca) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FORACA", ""), GXv_int2) ;
      disfas___ww_impl.this.GXt_int1 = GXv_int2[0] ;
      AV41Foraca = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Foraca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Foraca), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORACA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Foraca), "ZZZ9")));
      GXt_int1 = (byte)(AV40Flag_not) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FASNOT", ""), GXv_int2) ;
      disfas___ww_impl.this.GXt_int1 = GXv_int2[0] ;
      AV40Flag_not = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Flag_not", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Flag_not), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAG_NOT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Flag_not), "ZZZ9")));
      GXt_char3 = AV69Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      disfas___ww_impl.this.GXt_char3 = GXv_char4[0] ;
      AV69Station = GXt_char3 ;
      GXv_char4[0] = AV70EmprCod ;
      GXv_char5[0] = AV71EmprNom ;
      GXv_char6[0] = AV72UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV69Station, GXv_char4, GXv_char5, GXv_char6) ;
      disfas___ww_impl.this.AV70EmprCod = GXv_char4[0] ;
      disfas___ww_impl.this.AV71EmprNom = GXv_char5[0] ;
      disfas___ww_impl.this.AV72UsurCod = GXv_char6[0] ;
      divUnnamedtable2_Height = 500 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Height), 9, 0), true);
      edtavFascod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if (returnInSub) return;
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Fase del proceso", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV29DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV29DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int9 = AV65DisFasLin ;
      GXv_int10[0] = GXt_int9 ;
      new app.pedidos.disfas_proxid(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, GXv_int10) ;
      disfas___ww_impl.this.GXt_int9 = GXv_int10[0] ;
      AV65DisFasLin = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65DisFasLin), 4, 0));
   }

   public void e182922( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      AV31GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridCurrentPage), 10, 0));
      AV32GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridPageCount), 10, 0));
      AV80Pedidos_disfas___wwds_1_tfmaqcod = AV43TFMaqCod ;
      AV81Pedidos_disfas___wwds_2_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV82Pedidos_disfas___wwds_3_tffasdec = AV45TFFasDec ;
      AV83Pedidos_disfas___wwds_4_tffasdec_to = AV46TFFasDec_To ;
      AV84Pedidos_disfas___wwds_5_tffaspresal = AV47TFFasPreSal ;
      AV85Pedidos_disfas___wwds_6_tffaspresal_to = AV48TFFasPreSal_To ;
      AV86Pedidos_disfas___wwds_7_tffasprepie = AV49TFFasPrePie ;
      AV87Pedidos_disfas___wwds_8_tffasprepie_to = AV50TFFasPrePie_To ;
      AV88Pedidos_disfas___wwds_9_tffasvelpro = AV51TFFasVelPro ;
      AV89Pedidos_disfas___wwds_10_tffasvelpro_to = AV52TFFasVelPro_To ;
      AV90Pedidos_disfas___wwds_11_tffasnumpas = AV53TFFasNumPas ;
      AV91Pedidos_disfas___wwds_12_tffasnumpas_to = AV54TFFasNumPas_To ;
      AV92Pedidos_disfas___wwds_13_tffasacttin = AV55TFFasActTin ;
      AV93Pedidos_disfas___wwds_14_tffasacttin_sel = AV56TFFasActTin_Sel ;
      AV94Pedidos_disfas___wwds_15_tffascon = AV57TFFasCon ;
      AV95Pedidos_disfas___wwds_16_tffascon_sel = AV58TFFasCon_Sel ;
      AV96Pedidos_disfas___wwds_17_tffasacab = AV59TFFasAcab ;
      AV97Pedidos_disfas___wwds_18_tffasacab_sel = AV60TFFasAcab_Sel ;
      AV98Pedidos_disfas___wwds_19_tffasformul = AV61TFFasForMul ;
      AV99Pedidos_disfas___wwds_20_tffasformul_sel = AV62TFFasForMul_Sel ;
      AV100Pedidos_disfas___wwds_21_tfdisfasobs = AV63TFDisFasObs ;
      AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel = AV64TFDisFasObs_Sel ;
      /*  Sending Event outputs  */
   }

   public void e112922( )
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
         AV30PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV30PageToGo) ;
      }
   }

   public void e122922( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132922( )
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
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV43TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMaqCod", AV43TFMaqCod);
            AV44TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFMaqCod_Sel", AV44TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDec") == 0 )
         {
            AV45TFFasDec = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFFasDec", GXutil.ltrimstr( AV45TFFasDec, 5, 1));
            AV46TFFasDec_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFFasDec_To", GXutil.ltrimstr( AV46TFFasDec_To, 5, 1));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPreSal") == 0 )
         {
            AV47TFFasPreSal = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFFasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFFasPreSal), 4, 0));
            AV48TFFasPreSal_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFFasPreSal_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFFasPreSal_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPrePie") == 0 )
         {
            AV49TFFasPrePie = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFFasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFFasPrePie), 4, 0));
            AV50TFFasPrePie_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFFasPrePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFFasPrePie_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasVelPro") == 0 )
         {
            AV51TFFasVelPro = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFFasVelPro", GXutil.ltrimstr( AV51TFFasVelPro, 5, 1));
            AV52TFFasVelPro_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFFasVelPro_To", GXutil.ltrimstr( AV52TFFasVelPro_To, 5, 1));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasNumPas") == 0 )
         {
            AV53TFFasNumPas = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFFasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFFasNumPas), 3, 0));
            AV54TFFasNumPas_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFFasNumPas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFFasNumPas_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasActTin") == 0 )
         {
            AV55TFFasActTin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFFasActTin", AV55TFFasActTin);
            AV56TFFasActTin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFFasActTin_Sel", AV56TFFasActTin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCon") == 0 )
         {
            AV57TFFasCon = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFFasCon", AV57TFFasCon);
            AV58TFFasCon_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFFasCon_Sel", AV58TFFasCon_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasAcab") == 0 )
         {
            AV59TFFasAcab = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFFasAcab", AV59TFFasAcab);
            AV60TFFasAcab_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFFasAcab_Sel", AV60TFFasAcab_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasForMul") == 0 )
         {
            AV61TFFasForMul = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFFasForMul", AV61TFFasForMul);
            AV62TFFasForMul_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFFasForMul_Sel", AV62TFFasForMul_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisFasObs") == 0 )
         {
            AV63TFDisFasObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFDisFasObs", AV63TFDisFasObs);
            AV64TFDisFasObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFDisFasObs_Sel", AV64TFDisFasObs_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e192922( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      if ( AV41Foraca == 1 )
      {
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Acs", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( AV40Flag_not == 1 )
      {
         cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Parametros", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( AV36VisualizarAcciones )
      {
         cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( cmbavGridactiongroup1.getItemCount() == 1 )
      {
         cmbavGridactiongroup1.setThemeClass( "Invisible" );
      }
      else
      {
         cmbavGridactiongroup1.setThemeClass( "ConvertToDDO" );
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(93) ;
      }
      sendrow_932( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_93_Refreshing )
      {
         httpContext.doAjaxLoad(93, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV42GridActionGroup1, 4, 0)) );
   }

   public void e202922( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV42GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO ACS' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV42GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO PARAMETROS_' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV42GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S192 ();
         if (returnInSub) return;
      }
      AV42GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV42GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e142922( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'DO ACS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidos.disqui__ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0)),GXutil.URLEncode(GXutil.booltostr(AV36VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV37AccionesEnPopup))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin","VisualizarAcciones","AccionesEnPopup"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO PARAMETROS_' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidos.dispar__ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0)),GXutil.URLEncode(GXutil.booltostr(AV36VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV37AccionesEnPopup))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin","VisualizarAcciones","AccionesEnPopup"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char6[0] = A457FasCod ;
      GXv_int12[0] = A252CliCod ;
      GXv_char5[0] = A335DisArtCod ;
      GXv_char4[0] = httpContext.getMessage( "DL2", "") ;
      new app.pmdispar(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, GXv_char6, GXv_int12, GXv_char5, GXv_char4) ;
      disfas___ww_impl.this.A457FasCod = GXv_char6[0] ;
      disfas___ww_impl.this.A252CliCod = GXv_int12[0] ;
      disfas___ww_impl.this.A335DisArtCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      GXt_int9 = AV65DisFasLin ;
      GXv_int10[0] = GXt_int9 ;
      new app.pedidos.disfas_proxid(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, GXv_int10) ;
      disfas___ww_impl.this.GXt_int9 = GXv_int10[0] ;
      AV65DisFasLin = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65DisFasLin), 4, 0));
      httpContext.doAjaxRefresh();
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue(AV79Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV79Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV19Session.getValue(AV79Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      AV102GXV1 = 1 ;
      while ( AV102GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV102GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV43TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMaqCod", AV43TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV44TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFMaqCod_Sel", AV44TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC") == 0 )
         {
            AV45TFFasDec = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFFasDec", GXutil.ltrimstr( AV45TFFasDec, 5, 1));
            AV46TFFasDec_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFFasDec_To", GXutil.ltrimstr( AV46TFFasDec_To, 5, 1));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPRESAL") == 0 )
         {
            AV47TFFasPreSal = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFFasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFFasPreSal), 4, 0));
            AV48TFFasPreSal_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFFasPreSal_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFFasPreSal_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREPIE") == 0 )
         {
            AV49TFFasPrePie = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFFasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFFasPrePie), 4, 0));
            AV50TFFasPrePie_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFFasPrePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFFasPrePie_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASVELPRO") == 0 )
         {
            AV51TFFasVelPro = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFFasVelPro", GXutil.ltrimstr( AV51TFFasVelPro, 5, 1));
            AV52TFFasVelPro_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFFasVelPro_To", GXutil.ltrimstr( AV52TFFasVelPro_To, 5, 1));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASNUMPAS") == 0 )
         {
            AV53TFFasNumPas = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFFasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFFasNumPas), 3, 0));
            AV54TFFasNumPas_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFFasNumPas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFFasNumPas_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN") == 0 )
         {
            AV55TFFasActTin = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFFasActTin", AV55TFFasActTin);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN_SEL") == 0 )
         {
            AV56TFFasActTin_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFFasActTin_Sel", AV56TFFasActTin_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON") == 0 )
         {
            AV57TFFasCon = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFFasCon", AV57TFFasCon);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON_SEL") == 0 )
         {
            AV58TFFasCon_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFFasCon_Sel", AV58TFFasCon_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB") == 0 )
         {
            AV59TFFasAcab = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFFasAcab", AV59TFFasAcab);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB_SEL") == 0 )
         {
            AV60TFFasAcab_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFFasAcab_Sel", AV60TFFasAcab_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV61TFFasForMul = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFFasForMul", AV61TFFasForMul);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV62TFFasForMul_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFFasForMul_Sel", AV62TFFasForMul_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFASOBS") == 0 )
         {
            AV63TFDisFasObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFDisFasObs", AV63TFDisFasObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFASOBS_SEL") == 0 )
         {
            AV64TFDisFasObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFDisFasObs_Sel", AV64TFDisFasObs_Sel);
         }
         AV102GXV1 = (int)(AV102GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFMaqCod_Sel)==0), AV44TFMaqCod_Sel, GXv_char6) ;
      disfas___ww_impl.this.GXt_char3 = GXv_char6[0] ;
      GXt_char13 = "" ;
      GXv_char5[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFFasActTin_Sel)==0), AV56TFFasActTin_Sel, GXv_char5) ;
      disfas___ww_impl.this.GXt_char13 = GXv_char5[0] ;
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFFasCon_Sel)==0), AV58TFFasCon_Sel, GXv_char4) ;
      disfas___ww_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFFasAcab_Sel)==0), AV60TFFasAcab_Sel, GXv_char16) ;
      disfas___ww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFFasForMul_Sel)==0), AV62TFFasForMul_Sel, GXv_char18) ;
      disfas___ww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFDisFasObs_Sel)==0), AV64TFDisFasObs_Sel, GXv_char20) ;
      disfas___ww_impl.this.GXt_char19 = GXv_char20[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char3+"||||||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char15+"|"+GXt_char17+"|"+GXt_char19 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFMaqCod)==0), AV43TFMaqCod, GXv_char20) ;
      disfas___ww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFFasActTin)==0), AV55TFFasActTin, GXv_char18) ;
      disfas___ww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFFasCon)==0), AV57TFFasCon, GXv_char16) ;
      disfas___ww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char14 = "" ;
      GXv_char6[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFFasAcab)==0), AV59TFFasAcab, GXv_char6) ;
      disfas___ww_impl.this.GXt_char14 = GXv_char6[0] ;
      GXt_char13 = "" ;
      GXv_char5[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFFasForMul)==0), AV61TFFasForMul, GXv_char5) ;
      disfas___ww_impl.this.GXt_char13 = GXv_char5[0] ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFDisFasObs)==0), AV63TFDisFasObs, GXv_char4) ;
      disfas___ww_impl.this.GXt_char3 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = "|"+GXt_char19+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFFasDec)==0) ? "" : GXutil.str( AV45TFFasDec, 5, 1))+"|"+((0==AV47TFFasPreSal) ? "" : GXutil.str( AV47TFFasPreSal, 4, 0))+"|"+((0==AV49TFFasPrePie) ? "" : GXutil.str( AV49TFFasPrePie, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFFasVelPro)==0) ? "" : GXutil.str( AV51TFFasVelPro, 5, 1))+"|"+((0==AV53TFFasNumPas) ? "" : GXutil.str( AV53TFFasNumPas, 3, 0))+"|"+GXt_char17+"|"+GXt_char15+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char3 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFFasDec_To)==0) ? "" : GXutil.str( AV46TFFasDec_To, 5, 1))+"|"+((0==AV48TFFasPreSal_To) ? "" : GXutil.str( AV48TFFasPreSal_To, 4, 0))+"|"+((0==AV50TFFasPrePie_To) ? "" : GXutil.str( AV50TFFasPrePie_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFFasVelPro_To)==0) ? "" : GXutil.str( AV52TFFasVelPro_To, 5, 1))+"|"+((0==AV54TFFasNumPas_To) ? "" : GXutil.str( AV54TFFasNumPas_To, 3, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV19Session.getValue(AV79Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFMAQCOD", "", !(GXutil.strcmp("", AV43TFMaqCod)==0), (short)(0), AV43TFMaqCod, "", !(GXutil.strcmp("", AV44TFMaqCod_Sel)==0), AV44TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFASDEC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFFasDec)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFFasDec_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV45TFFasDec, 5, 1)), GXutil.trim( GXutil.str( AV46TFFasDec_To, 5, 1))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFASPRESAL", "", !((0==AV47TFFasPreSal)&&(0==AV48TFFasPreSal_To)), (short)(0), GXutil.trim( GXutil.str( AV47TFFasPreSal, 4, 0)), GXutil.trim( GXutil.str( AV48TFFasPreSal_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFASPREPIE", "", !((0==AV49TFFasPrePie)&&(0==AV50TFFasPrePie_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFFasPrePie, 4, 0)), GXutil.trim( GXutil.str( AV50TFFasPrePie_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFASVELPRO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFFasVelPro)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFFasVelPro_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV51TFFasVelPro, 5, 1)), GXutil.trim( GXutil.str( AV52TFFasVelPro_To, 5, 1))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFASNUMPAS", "", !((0==AV53TFFasNumPas)&&(0==AV54TFFasNumPas_To)), (short)(0), GXutil.trim( GXutil.str( AV53TFFasNumPas, 3, 0)), GXutil.trim( GXutil.str( AV54TFFasNumPas_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFASACTTIN", "", !(GXutil.strcmp("", AV55TFFasActTin)==0), (short)(0), AV55TFFasActTin, "", !(GXutil.strcmp("", AV56TFFasActTin_Sel)==0), AV56TFFasActTin_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFASCON", "", !(GXutil.strcmp("", AV57TFFasCon)==0), (short)(0), AV57TFFasCon, "", !(GXutil.strcmp("", AV58TFFasCon_Sel)==0), AV58TFFasCon_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFASACAB", "", !(GXutil.strcmp("", AV59TFFasAcab)==0), (short)(0), AV59TFFasAcab, "", !(GXutil.strcmp("", AV60TFFasAcab_Sel)==0), AV60TFFasAcab_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFFASFORMUL", "", !(GXutil.strcmp("", AV61TFFasForMul)==0), (short)(0), AV61TFFasForMul, "", !(GXutil.strcmp("", AV62TFFasForMul_Sel)==0), AV62TFFasForMul_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFDISFASOBS", "", !(GXutil.strcmp("", AV63TFDisFasObs)==0), (short)(0), AV63TFDisFasObs, "", !(GXutil.strcmp("", AV64TFDisFasObs_Sel)==0), AV64TFDisFasObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV79Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV79Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Pedidos.DisFas" );
      AV19Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( AV36VisualizarAcciones ) )
      {
         divDvpanel_tablepedido_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablepedido_cell_Internalname, "Class", divDvpanel_tablepedido_cell_Class, true);
      }
      else
      {
         divDvpanel_tablepedido_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablepedido_cell_Internalname, "Class", divDvpanel_tablepedido_cell_Class, true);
      }
      if ( ! ( ( AV36VisualizarAcciones ) ) )
      {
         divDvpanel_unnamedtable1_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable1_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      /* Using cursor H02927 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A14042FasActiva = H02927_A14042FasActiva[0] ;
         A13781FasCDsc = H02927_A13781FasCDsc[0] ;
         A457FasCod = H02927_A457FasCod[0] ;
         A460FasDsc = H02927_A460FasDsc[0] ;
         AV68Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV68Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV68Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13781FasCDsc );
         AV67FasCod_Data.add(AV68Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_fascod_Selectedvalue_set = AV66FasCod ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
   }

   public void e212922( )
   {
      /* 'DoInsertarFase' Routine */
      returnInSub = false ;
      if ( (0==AV65DisFasLin) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Linea", ""));
         GX_FocusControl = edtavDisfaslin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (GXutil.strcmp("", AV66FasCod)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fase", ""));
            GX_FocusControl = edtavDisfaslin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_char20[0] = A396EmprCod ;
            GXv_char18[0] = A758ProCod ;
            GXv_int12[0] = A361DisCod ;
            GXv_int10[0] = AV65DisFasLin ;
            GXv_char16[0] = AV73Msg_err ;
            new app.pexistdisfas(remoteHandle, context).execute( GXv_char20, GXv_char18, GXv_int12, GXv_int10, GXv_char16) ;
            disfas___ww_impl.this.A396EmprCod = GXv_char20[0] ;
            disfas___ww_impl.this.A758ProCod = GXv_char18[0] ;
            disfas___ww_impl.this.A361DisCod = GXv_int12[0] ;
            disfas___ww_impl.this.AV65DisFasLin = GXv_int10[0] ;
            disfas___ww_impl.this.AV73Msg_err = GXv_char16[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV65DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65DisFasLin), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV73Msg_err", AV73Msg_err);
            if ( ! (GXutil.strcmp("", AV73Msg_err)==0) )
            {
               httpContext.GX_msglist.addItem(AV73Msg_err);
               GX_FocusControl = edtavDisfaslin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               new app.pedidos.insdisfas(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, AV65DisFasLin, AV66FasCod, AV76DisFasObs) ;
               GXv_char20[0] = AV66FasCod ;
               GXv_int12[0] = A252CliCod ;
               GXv_char18[0] = A335DisArtCod ;
               GXv_char16[0] = httpContext.getMessage( "INS", "") ;
               new app.pmdispar(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, AV65DisFasLin, GXv_char20, GXv_int12, GXv_char18, GXv_char16) ;
               disfas___ww_impl.this.AV66FasCod = GXv_char20[0] ;
               disfas___ww_impl.this.A252CliCod = GXv_int12[0] ;
               disfas___ww_impl.this.A335DisArtCod = GXv_char18[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66FasCod", AV66FasCod);
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
               GXt_int9 = AV65DisFasLin ;
               GXv_int10[0] = GXt_int9 ;
               new app.pedidos.disfas_proxid(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, GXv_int10) ;
               disfas___ww_impl.this.GXt_int9 = GXv_int10[0] ;
               AV65DisFasLin = GXt_int9 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65DisFasLin), 4, 0));
               httpContext.doAjaxRefresh();
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e152922 ();
      if (returnInSub) return;
   }

   public void e152922( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( (0==AV65DisFasLin) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Linea", ""));
         GX_FocusControl = edtavDisfaslin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (GXutil.strcmp("", AV66FasCod)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fase", ""));
            GX_FocusControl = edtavDisfaslin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            new app.pedidos.insdisfas(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, AV65DisFasLin, AV66FasCod, AV76DisFasObs) ;
            GXv_char20[0] = AV66FasCod ;
            GXv_int12[0] = A252CliCod ;
            GXv_char18[0] = A335DisArtCod ;
            GXv_char16[0] = httpContext.getMessage( "INS", "") ;
            new app.pmdispar(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, AV65DisFasLin, GXv_char20, GXv_int12, GXv_char18, GXv_char16) ;
            disfas___ww_impl.this.AV66FasCod = GXv_char20[0] ;
            disfas___ww_impl.this.A252CliCod = GXv_int12[0] ;
            disfas___ww_impl.this.A335DisArtCod = GXv_char18[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66FasCod", AV66FasCod);
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
            GXt_int9 = AV65DisFasLin ;
            GXv_int10[0] = GXt_int9 ;
            new app.pedidos.disfas_proxid(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, GXv_int10) ;
            disfas___ww_impl.this.GXt_int9 = GXv_int10[0] ;
            AV65DisFasLin = GXt_int9 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65DisFasLin), 4, 0));
            AV66FasCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66FasCod", AV66FasCod);
            AV76DisFasObs = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DisFasObs", AV76DisFasObs);
            Combo_fascod_Selectedvalue_set = AV66FasCod ;
            ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
   }

   public void e162922( )
   {
      /* Disfaslin_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char20[0] = A396EmprCod ;
      GXv_char18[0] = A758ProCod ;
      GXv_int12[0] = A361DisCod ;
      GXv_int10[0] = AV65DisFasLin ;
      GXv_char16[0] = AV66FasCod ;
      GXv_char6[0] = AV76DisFasObs ;
      new app.obtengolineafase(remoteHandle, context).execute( GXv_char20, GXv_char18, GXv_int12, GXv_int10, GXv_char16, GXv_char6) ;
      disfas___ww_impl.this.A396EmprCod = GXv_char20[0] ;
      disfas___ww_impl.this.A758ProCod = GXv_char18[0] ;
      disfas___ww_impl.this.A361DisCod = GXv_int12[0] ;
      disfas___ww_impl.this.AV65DisFasLin = GXv_int10[0] ;
      disfas___ww_impl.this.AV66FasCod = GXv_char16[0] ;
      disfas___ww_impl.this.AV76DisFasObs = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV65DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65DisFasLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV66FasCod", AV66FasCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV76DisFasObs", AV76DisFasObs);
      Combo_fascod_Selectedvalue_set = AV66FasCod ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A758ProCod = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      AV36VisualizarAcciones = ((Boolean) getParm(obj,3)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36VisualizarAcciones", AV36VisualizarAcciones);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV36VisualizarAcciones));
      AV37AccionesEnPopup = ((Boolean) getParm(obj,4)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37AccionesEnPopup", AV37AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV37AccionesEnPopup));
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
      pa2922( ) ;
      ws2922( ) ;
      we2922( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116151543", true, true);
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
      httpContext.AddJavascriptSource("pedidos/disfas___ww.js", "?202682116151543", false, true);
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_932( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_93_idx );
      edtDisFasLin_Internalname = "DISFASLIN_"+sGXsfl_93_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_93_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_93_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_93_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_93_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_93_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_93_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_93_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_93_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_93_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_93_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_93_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_93_idx ;
      edtDisFasObs_Internalname = "DISFASOBS_"+sGXsfl_93_idx ;
   }

   public void subsflControlProps_fel_932( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_93_fel_idx );
      edtDisFasLin_Internalname = "DISFASLIN_"+sGXsfl_93_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_93_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_93_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_93_fel_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_93_fel_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_93_fel_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_93_fel_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_93_fel_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_93_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_93_fel_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_93_fel_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_93_fel_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_93_fel_idx ;
      edtDisFasObs_Internalname = "DISFASOBS_"+sGXsfl_93_fel_idx ;
   }

   public void sendrow_932( )
   {
      subsflControlProps_932( ) ;
      wb2920( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_93_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_93_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_93_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 94,'',false,'"+sGXsfl_93_idx+"',93)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_93_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV42GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV42GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV42GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_93_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","",cmbavGridactiongroup1.getThemeClass(),"WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,94);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV42GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_93_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A459FasDec, "ZZ9.9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreSal_Internalname,GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPrePie_Internalname,GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPrePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasVelPro_Internalname,GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A472FasVelPro, "ZZ9.9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasVelPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasNumPas_Internalname,GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasNumPas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCon_Internalname,GXutil.rtrim( A458FasCon),GXutil.rtrim( localUtil.format( A458FasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasAcab_Internalname,GXutil.rtrim( A4903FasAcab),GXutil.rtrim( localUtil.format( A4903FasAcab, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasAcab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasForMul_Internalname,GXutil.rtrim( A4286FasForMul),GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasForMul_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasObs_Internalname,A9841DisFasObs,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2922( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_93_idx = ((subGrid_Islastpage==1)&&(nGXsfl_93_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_93_idx+1) ;
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_932( ) ;
      }
      /* End function sendrow_932 */
   }

   public void startgridcontrol93( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"93\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+cmbavGridactiongroup1.getThemeClass()+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Decalage", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tpys", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tpp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Vel.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Pases", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( cmbavGridactiongroup1.getThemeClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A458FasCon));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4903FasAcab));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4286FasForMul));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A9841DisFasObs);
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
      lblTbngruia_Internalname = "TBNGRUIA" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtDisFec_Internalname = "DISFEC" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtDisArtCod_Internalname = "DISARTCOD" ;
      edtDisArtDsc_Internalname = "DISARTDSC" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      lblTbprocod_Internalname = "TBPROCOD" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTablepedido_Internalname = "TABLEPEDIDO" ;
      Dvpanel_tablepedido_Internalname = "DVPANEL_TABLEPEDIDO" ;
      divDvpanel_tablepedido_cell_Internalname = "DVPANEL_TABLEPEDIDO_CELL" ;
      edtavDisfaslin_Internalname = "vDISFASLIN" ;
      lblTextblockcombo_fascod_Internalname = "TEXTBLOCKCOMBO_FASCOD" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      edtavDisfasobs_Internalname = "vDISFASOBS" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divDvpanel_unnamedtable1_cell_Internalname = "DVPANEL_UNNAMEDTABLE1_CELL" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtDisFasLin_Internalname = "DISFASLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtFasPreSal_Internalname = "FASPRESAL" ;
      edtFasPrePie_Internalname = "FASPREPIE" ;
      edtFasVelPro_Internalname = "FASVELPRO" ;
      edtFasNumPas_Internalname = "FASNUMPAS" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtFasCon_Internalname = "FASCON" ;
      edtFasAcab_Internalname = "FASACAB" ;
      edtFasForMul_Internalname = "FASFORMUL" ;
      edtDisFasObs_Internalname = "DISFASOBS" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavFascod_Internalname = "vFASCOD" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
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
      edtDisFasObs_Jsonclick = "" ;
      edtFasForMul_Jsonclick = "" ;
      edtFasAcab_Jsonclick = "" ;
      edtFasCon_Jsonclick = "" ;
      edtFasActTin_Jsonclick = "" ;
      edtFasNumPas_Jsonclick = "" ;
      edtFasVelPro_Jsonclick = "" ;
      edtFasPrePie_Jsonclick = "" ;
      edtFasPreSal_Jsonclick = "" ;
      edtFasDec_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtDisFasLin_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      cmbavGridactiongroup1.setThemeClass( "ConvertToDDO" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable2_Height = 0 ;
      edtavDisfasobs_Enabled = 1 ;
      edtavDisfaslin_Jsonclick = "" ;
      edtavDisfaslin_Enabled = 1 ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12" ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 0 ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtDsc_Enabled = 0 ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisArtCod_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtDisFec_Jsonclick = "" ;
      edtDisFec_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      divDvpanel_tablepedido_cell_Class = "col-xs-12" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "Pedidos.DisFas___WWGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic||||||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T||||||T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "||T|T|T|T|T|||||" ;
      Ddo_grid_Filtertype = "|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12" ;
      Ddo_grid_Columnids = "1:DisFasLin|4:MaqCod|5:FasDec|6:FasPreSal|7:FasPrePie|8:FasVelPro|9:FasNumPas|10:FasActTin|11:FasCon|12:FasAcab|13:FasForMul|14:DisFasObs" ;
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
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Fase", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Combo_fascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fascod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_tablepedido_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Iconposition = "Right" ;
      Dvpanel_tablepedido_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Title = "" ;
      Dvpanel_tablepedido_Cls = "PanelNoHeader" ;
      Dvpanel_tablepedido_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablepedido_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Fase del proceso", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_93_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV42GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV42GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActionGroup1), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV45TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV46TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV47TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV48TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV49TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV50TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV51TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV52TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV53TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV54TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV55TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV56TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV57TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV58TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV59TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV60TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV61TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV62TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV63TFDisFasObs',fld:'vTFDISFASOBS',pic:''},{av:'AV64TFDisFasObs_Sel',fld:'vTFDISFASOBS_SEL',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41Foraca',fld:'vFORACA',pic:'ZZZ9',hsh:true},{av:'AV40Flag_not',fld:'vFLAG_NOT',pic:'ZZZ9',hsh:true},{av:'AV36VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV37AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112922',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV45TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV46TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV47TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV48TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV49TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV50TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV51TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV52TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV53TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV54TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV55TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV56TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV57TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV58TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV59TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV60TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV61TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV62TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV63TFDisFasObs',fld:'vTFDISFASOBS',pic:''},{av:'AV64TFDisFasObs_Sel',fld:'vTFDISFASOBS_SEL',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41Foraca',fld:'vFORACA',pic:'ZZZ9',hsh:true},{av:'AV40Flag_not',fld:'vFLAG_NOT',pic:'ZZZ9',hsh:true},{av:'AV36VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV37AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122922',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV45TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV46TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV47TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV48TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV49TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV50TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV51TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV52TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV53TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV54TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV55TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV56TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV57TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV58TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV59TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV60TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV61TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV62TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV63TFDisFasObs',fld:'vTFDISFASOBS',pic:''},{av:'AV64TFDisFasObs_Sel',fld:'vTFDISFASOBS_SEL',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41Foraca',fld:'vFORACA',pic:'ZZZ9',hsh:true},{av:'AV40Flag_not',fld:'vFLAG_NOT',pic:'ZZZ9',hsh:true},{av:'AV36VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV37AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132922',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV45TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV46TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV47TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV48TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV49TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV50TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV51TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV52TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV53TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV54TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV55TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV56TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV57TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV58TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV59TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV60TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV61TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV62TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV63TFDisFasObs',fld:'vTFDISFASOBS',pic:''},{av:'AV64TFDisFasObs_Sel',fld:'vTFDISFASOBS_SEL',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41Foraca',fld:'vFORACA',pic:'ZZZ9',hsh:true},{av:'AV40Flag_not',fld:'vFLAG_NOT',pic:'ZZZ9',hsh:true},{av:'AV36VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV37AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63TFDisFasObs',fld:'vTFDISFASOBS',pic:''},{av:'AV64TFDisFasObs_Sel',fld:'vTFDISFASOBS_SEL',pic:''},{av:'AV61TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV62TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV59TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV60TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV57TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV58TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV55TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV56TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV53TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV54TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV51TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV52TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV49TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV50TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV47TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV48TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV45TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV46TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e192922',iparms:[{av:'AV41Foraca',fld:'vFORACA',pic:'ZZZ9',hsh:true},{av:'AV40Flag_not',fld:'vFLAG_NOT',pic:'ZZZ9',hsh:true},{av:'AV36VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV42GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e202922',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV42GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV45TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV46TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV47TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV48TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV49TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV50TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV51TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV52TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV53TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV54TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV55TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV56TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV57TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV58TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV59TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV60TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV61TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV62TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV63TFDisFasObs',fld:'vTFDISFASOBS',pic:''},{av:'AV64TFDisFasObs_Sel',fld:'vTFDISFASOBS_SEL',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41Foraca',fld:'vFORACA',pic:'ZZZ9',hsh:true},{av:'AV40Flag_not',fld:'vFLAG_NOT',pic:'ZZZ9',hsh:true},{av:'AV36VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV37AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV42GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV65DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e142922',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOINSERTARFASE'","{handler:'e212922',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV45TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV46TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV47TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV48TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV49TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV50TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV51TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV52TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV53TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV54TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV55TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV56TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV57TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV58TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV59TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV60TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV61TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV62TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV63TFDisFasObs',fld:'vTFDISFASOBS',pic:''},{av:'AV64TFDisFasObs_Sel',fld:'vTFDISFASOBS_SEL',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41Foraca',fld:'vFORACA',pic:'ZZZ9',hsh:true},{av:'AV40Flag_not',fld:'vFLAG_NOT',pic:'ZZZ9',hsh:true},{av:'AV36VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV37AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'AV65DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9'},{av:'AV66FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV73Msg_err',fld:'vMSG_ERR',pic:''},{av:'AV76DisFasObs',fld:'vDISFASOBS',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''}]");
      setEventMetadata("'DOINSERTARFASE'",",oparms:[{av:'AV73Msg_err',fld:'vMSG_ERR',pic:''},{av:'AV65DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV66FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e152922',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV45TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV46TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV47TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV48TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV49TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV50TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV51TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV52TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV53TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV54TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV55TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV56TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV57TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV58TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV59TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV60TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV61TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV62TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV63TFDisFasObs',fld:'vTFDISFASOBS',pic:''},{av:'AV64TFDisFasObs_Sel',fld:'vTFDISFASOBS_SEL',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41Foraca',fld:'vFORACA',pic:'ZZZ9',hsh:true},{av:'AV40Flag_not',fld:'vFLAG_NOT',pic:'ZZZ9',hsh:true},{av:'AV36VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV37AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'AV65DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9'},{av:'AV66FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV76DisFasObs',fld:'vDISFASOBS',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV66FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV65DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9'},{av:'AV76DisFasObs',fld:'vDISFASOBS',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VDISFASLIN.CONTROLVALUECHANGED","{handler:'e162922',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV65DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9'}]");
      setEventMetadata("VDISFASLIN.CONTROLVALUECHANGED",",oparms:[{av:'AV76DisFasObs',fld:'vDISFASOBS',pic:''},{av:'AV66FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV65DisFasLin',fld:'vDISFASLIN',pic:'ZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Disfasobs',iparms:[]");
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
      wcpOA396EmprCod = "" ;
      wcpOA758ProCod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      AV43TFMaqCod = "" ;
      AV44TFMaqCod_Sel = "" ;
      AV45TFFasDec = DecimalUtil.ZERO ;
      AV46TFFasDec_To = DecimalUtil.ZERO ;
      AV51TFFasVelPro = DecimalUtil.ZERO ;
      AV52TFFasVelPro_To = DecimalUtil.ZERO ;
      AV55TFFasActTin = "" ;
      AV56TFFasActTin_Sel = "" ;
      AV57TFFasCon = "" ;
      AV58TFFasCon_Sel = "" ;
      AV59TFFasAcab = "" ;
      AV60TFFasAcab_Sel = "" ;
      AV61TFFasForMul = "" ;
      AV62TFFasForMul_Sel = "" ;
      AV63TFDisFasObs = "" ;
      AV64TFDisFasObs_Sel = "" ;
      AV79Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV67FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV29DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV73Msg_err = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablepedido = new com.genexus.webpanels.GXUserControl();
      lblTbngruia_Jsonclick = "" ;
      A369DisFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      lblTbprocod_Jsonclick = "" ;
      A759ProDsc = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcombo_fascod_Jsonclick = "" ;
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      Combo_fascod_Caption = "" ;
      AV76DisFasObs = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV66FasCod = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A602MaqCod = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A9841DisFasObs = "" ;
      scmdbuf = "" ;
      lV80Pedidos_disfas___wwds_1_tfmaqcod = "" ;
      lV92Pedidos_disfas___wwds_13_tffasacttin = "" ;
      lV94Pedidos_disfas___wwds_15_tffascon = "" ;
      lV96Pedidos_disfas___wwds_17_tffasacab = "" ;
      lV98Pedidos_disfas___wwds_19_tffasformul = "" ;
      lV100Pedidos_disfas___wwds_21_tfdisfasobs = "" ;
      AV81Pedidos_disfas___wwds_2_tfmaqcod_sel = "" ;
      AV80Pedidos_disfas___wwds_1_tfmaqcod = "" ;
      AV82Pedidos_disfas___wwds_3_tffasdec = DecimalUtil.ZERO ;
      AV83Pedidos_disfas___wwds_4_tffasdec_to = DecimalUtil.ZERO ;
      AV88Pedidos_disfas___wwds_9_tffasvelpro = DecimalUtil.ZERO ;
      AV89Pedidos_disfas___wwds_10_tffasvelpro_to = DecimalUtil.ZERO ;
      AV93Pedidos_disfas___wwds_14_tffasacttin_sel = "" ;
      AV92Pedidos_disfas___wwds_13_tffasacttin = "" ;
      AV95Pedidos_disfas___wwds_16_tffascon_sel = "" ;
      AV94Pedidos_disfas___wwds_15_tffascon = "" ;
      AV97Pedidos_disfas___wwds_18_tffasacab_sel = "" ;
      AV96Pedidos_disfas___wwds_17_tffasacab = "" ;
      AV99Pedidos_disfas___wwds_20_tffasformul_sel = "" ;
      AV98Pedidos_disfas___wwds_19_tffasformul = "" ;
      AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel = "" ;
      AV100Pedidos_disfas___wwds_21_tfdisfasobs = "" ;
      H02922_A396EmprCod = new String[] {""} ;
      H02922_A361DisCod = new int[1] ;
      H02922_A758ProCod = new String[] {""} ;
      H02922_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02922_A252CliCod = new int[1] ;
      H02922_A279CliNom = new String[] {""} ;
      H02922_A335DisArtCod = new String[] {""} ;
      H02922_A337DisArtDsc = new String[] {""} ;
      H02922_A759ProDsc = new String[] {""} ;
      H02922_A9841DisFasObs = new String[] {""} ;
      H02922_A4286FasForMul = new String[] {""} ;
      H02922_n4286FasForMul = new boolean[] {false} ;
      H02922_A4903FasAcab = new String[] {""} ;
      H02922_n4903FasAcab = new boolean[] {false} ;
      H02922_A458FasCon = new String[] {""} ;
      H02922_n458FasCon = new boolean[] {false} ;
      H02922_A456FasActTin = new String[] {""} ;
      H02922_n456FasActTin = new boolean[] {false} ;
      H02922_A464FasNumPas = new short[1] ;
      H02922_n464FasNumPas = new boolean[] {false} ;
      H02922_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02922_n472FasVelPro = new boolean[] {false} ;
      H02922_A468FasPrePie = new short[1] ;
      H02922_n468FasPrePie = new boolean[] {false} ;
      H02922_A469FasPreSal = new short[1] ;
      H02922_n469FasPreSal = new boolean[] {false} ;
      H02922_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02922_n459FasDec = new boolean[] {false} ;
      H02922_A602MaqCod = new String[] {""} ;
      H02922_n602MaqCod = new boolean[] {false} ;
      H02922_A460FasDsc = new String[] {""} ;
      H02922_A457FasCod = new String[] {""} ;
      H02922_A368DisFasLin = new short[1] ;
      H02923_AGRID_nRecordCount = new long[1] ;
      H02924_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02924_A252CliCod = new int[1] ;
      H02924_A335DisArtCod = new String[] {""} ;
      H02924_A337DisArtDsc = new String[] {""} ;
      H02925_A279CliNom = new String[] {""} ;
      H02926_A759ProDsc = new String[] {""} ;
      hsh = "" ;
      GXv_int2 = new byte[1] ;
      AV69Station = "" ;
      AV70EmprCod = "" ;
      AV71EmprNom = "" ;
      AV72UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV19Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char19 = "" ;
      GXt_char17 = "" ;
      GXt_char15 = "" ;
      GXt_char14 = "" ;
      GXt_char13 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState21 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H02927_A396EmprCod = new String[] {""} ;
      H02927_A14042FasActiva = new String[] {""} ;
      H02927_A13781FasCDsc = new String[] {""} ;
      H02927_A457FasCod = new String[] {""} ;
      H02927_A460FasDsc = new String[] {""} ;
      A14042FasActiva = "" ;
      A13781FasCDsc = "" ;
      AV68Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_char20 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int10 = new short[1] ;
      GXv_char16 = new String[1] ;
      GXv_char6 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disfas___ww__default(),
         new Object[] {
             new Object[] {
            H02922_A396EmprCod, H02922_A361DisCod, H02922_A758ProCod, H02922_A369DisFec, H02922_A252CliCod, H02922_A279CliNom, H02922_A335DisArtCod, H02922_A337DisArtDsc, H02922_A759ProDsc, H02922_A9841DisFasObs,
            H02922_A4286FasForMul, H02922_n4286FasForMul, H02922_A4903FasAcab, H02922_n4903FasAcab, H02922_A458FasCon, H02922_n458FasCon, H02922_A456FasActTin, H02922_n456FasActTin, H02922_A464FasNumPas, H02922_n464FasNumPas,
            H02922_A472FasVelPro, H02922_n472FasVelPro, H02922_A468FasPrePie, H02922_n468FasPrePie, H02922_A469FasPreSal, H02922_n469FasPreSal, H02922_A459FasDec, H02922_n459FasDec, H02922_A602MaqCod, H02922_n602MaqCod,
            H02922_A460FasDsc, H02922_A457FasCod, H02922_A368DisFasLin
            }
            , new Object[] {
            H02923_AGRID_nRecordCount
            }
            , new Object[] {
            H02924_A369DisFec, H02924_A252CliCod, H02924_A335DisArtCod, H02924_A337DisArtDsc
            }
            , new Object[] {
            H02925_A279CliNom
            }
            , new Object[] {
            H02926_A759ProDsc
            }
            , new Object[] {
            H02927_A396EmprCod, H02927_A14042FasActiva, H02927_A13781FasCDsc, H02927_A457FasCod, H02927_A460FasDsc
            }
         }
      );
      AV79Pgmname = "Pedidos.DisFas___WW" ;
      /* GeneXus formulas. */
      AV79Pgmname = "Pedidos.DisFas___WW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV47TFFasPreSal ;
   private short AV48TFFasPreSal_To ;
   private short AV49TFFasPrePie ;
   private short AV50TFFasPrePie_To ;
   private short AV53TFFasNumPas ;
   private short AV54TFFasNumPas_To ;
   private short AV12OrderedBy ;
   private short AV41Foraca ;
   private short AV40Flag_not ;
   private short wbEnd ;
   private short wbStart ;
   private short AV65DisFasLin ;
   private short AV42GridActionGroup1 ;
   private short A368DisFasLin ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV84Pedidos_disfas___wwds_5_tffaspresal ;
   private short AV85Pedidos_disfas___wwds_6_tffaspresal_to ;
   private short AV86Pedidos_disfas___wwds_7_tffasprepie ;
   private short AV87Pedidos_disfas___wwds_8_tffasprepie_to ;
   private short AV90Pedidos_disfas___wwds_11_tffasnumpas ;
   private short AV91Pedidos_disfas___wwds_12_tffasnumpas_to ;
   private short GXt_int9 ;
   private short GXv_int10[] ;
   private int wcpOA361DisCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_93 ;
   private int A361DisCod ;
   private int nGXsfl_93_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtDisCod_Enabled ;
   private int edtDisFec_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDisArtCod_Enabled ;
   private int edtDisArtDsc_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtavDisfaslin_Enabled ;
   private int edtavDisfasobs_Enabled ;
   private int divUnnamedtable2_Height ;
   private int edtavPgmname_Enabled ;
   private int edtavFascod_Visible ;
   private int edtEmprCod_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV30PageToGo ;
   private int AV102GXV1 ;
   private int GXv_int12[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV31GridCurrentPage ;
   private long AV32GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV45TFFasDec ;
   private java.math.BigDecimal AV46TFFasDec_To ;
   private java.math.BigDecimal AV51TFFasVelPro ;
   private java.math.BigDecimal AV52TFFasVelPro_To ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal AV82Pedidos_disfas___wwds_3_tffasdec ;
   private java.math.BigDecimal AV83Pedidos_disfas___wwds_4_tffasdec_to ;
   private java.math.BigDecimal AV88Pedidos_disfas___wwds_9_tffasvelpro ;
   private java.math.BigDecimal AV89Pedidos_disfas___wwds_10_tffasvelpro_to ;
   private String wcpOA396EmprCod ;
   private String wcpOA758ProCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Combo_fascod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String sGXsfl_93_idx="0001" ;
   private String AV43TFMaqCod ;
   private String AV44TFMaqCod_Sel ;
   private String AV55TFFasActTin ;
   private String AV56TFFasActTin_Sel ;
   private String AV57TFFasCon ;
   private String AV58TFFasCon_Sel ;
   private String AV59TFFasAcab ;
   private String AV60TFFasAcab_Sel ;
   private String AV61TFFasForMul ;
   private String AV62TFFasForMul_Sel ;
   private String AV79Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tablepedido_Width ;
   private String Dvpanel_tablepedido_Cls ;
   private String Dvpanel_tablepedido_Title ;
   private String Dvpanel_tablepedido_Iconposition ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Selectedvalue_set ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divDvpanel_tablepedido_cell_Internalname ;
   private String divDvpanel_tablepedido_cell_Class ;
   private String Dvpanel_tablepedido_Internalname ;
   private String divTablepedido_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String lblTbngruia_Internalname ;
   private String lblTbngruia_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtDisFec_Internalname ;
   private String edtDisFec_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtDisArtCod_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Jsonclick ;
   private String edtDisArtDsc_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String lblTbprocod_Internalname ;
   private String lblTbprocod_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String divDvpanel_unnamedtable1_cell_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Class ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavDisfaslin_Internalname ;
   private String TempTags ;
   private String edtavDisfaslin_Jsonclick ;
   private String divTablesplittedfascod_Internalname ;
   private String lblTextblockcombo_fascod_Internalname ;
   private String lblTextblockcombo_fascod_Jsonclick ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Internalname ;
   private String edtavDisfasobs_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavFascod_Internalname ;
   private String AV66FasCod ;
   private String edtavFascod_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtDisFasLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String edtFasDec_Internalname ;
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
   private String edtDisFasObs_Internalname ;
   private String scmdbuf ;
   private String lV80Pedidos_disfas___wwds_1_tfmaqcod ;
   private String lV92Pedidos_disfas___wwds_13_tffasacttin ;
   private String lV94Pedidos_disfas___wwds_15_tffascon ;
   private String lV96Pedidos_disfas___wwds_17_tffasacab ;
   private String lV98Pedidos_disfas___wwds_19_tffasformul ;
   private String AV81Pedidos_disfas___wwds_2_tfmaqcod_sel ;
   private String AV80Pedidos_disfas___wwds_1_tfmaqcod ;
   private String AV93Pedidos_disfas___wwds_14_tffasacttin_sel ;
   private String AV92Pedidos_disfas___wwds_13_tffasacttin ;
   private String AV95Pedidos_disfas___wwds_16_tffascon_sel ;
   private String AV94Pedidos_disfas___wwds_15_tffascon ;
   private String AV97Pedidos_disfas___wwds_18_tffasacab_sel ;
   private String AV96Pedidos_disfas___wwds_17_tffasacab ;
   private String AV99Pedidos_disfas___wwds_20_tffasformul_sel ;
   private String AV98Pedidos_disfas___wwds_19_tffasformul ;
   private String hsh ;
   private String AV69Station ;
   private String AV70EmprCod ;
   private String AV71EmprNom ;
   private String AV72UsurCod ;
   private String GXt_char19 ;
   private String GXt_char17 ;
   private String GXt_char15 ;
   private String GXt_char14 ;
   private String GXt_char13 ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String A14042FasActiva ;
   private String GXv_char20[] ;
   private String GXv_char18[] ;
   private String GXv_char16[] ;
   private String GXv_char6[] ;
   private String sGXsfl_93_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtDisFasLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtFasDec_Jsonclick ;
   private String edtFasPreSal_Jsonclick ;
   private String edtFasPrePie_Jsonclick ;
   private String edtFasVelPro_Jsonclick ;
   private String edtFasNumPas_Jsonclick ;
   private String edtFasActTin_Jsonclick ;
   private String edtFasCon_Jsonclick ;
   private String edtFasAcab_Jsonclick ;
   private String edtFasForMul_Jsonclick ;
   private String edtDisFasObs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A369DisFec ;
   private boolean wcpOAV36VisualizarAcciones ;
   private boolean wcpOAV37AccionesEnPopup ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV36VisualizarAcciones ;
   private boolean AV37AccionesEnPopup ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tablepedido_Autowidth ;
   private boolean Dvpanel_tablepedido_Autoheight ;
   private boolean Dvpanel_tablepedido_Collapsible ;
   private boolean Dvpanel_tablepedido_Collapsed ;
   private boolean Dvpanel_tablepedido_Showcollapseicon ;
   private boolean Dvpanel_tablepedido_Autoscroll ;
   private boolean Combo_fascod_Emptyitem ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n602MaqCod ;
   private boolean n459FasDec ;
   private boolean n469FasPreSal ;
   private boolean n468FasPrePie ;
   private boolean n472FasVelPro ;
   private boolean n464FasNumPas ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private boolean bGXsfl_93_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV63TFDisFasObs ;
   private String AV64TFDisFasObs_Sel ;
   private String AV73Msg_err ;
   private String AV76DisFasObs ;
   private String A9841DisFasObs ;
   private String lV100Pedidos_disfas___wwds_21_tfdisfasobs ;
   private String AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel ;
   private String AV100Pedidos_disfas___wwds_21_tfdisfasobs ;
   private String A13781FasCDsc ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablepedido ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private String[] H02922_A396EmprCod ;
   private int[] H02922_A361DisCod ;
   private String[] H02922_A758ProCod ;
   private java.util.Date[] H02922_A369DisFec ;
   private int[] H02922_A252CliCod ;
   private String[] H02922_A279CliNom ;
   private String[] H02922_A335DisArtCod ;
   private String[] H02922_A337DisArtDsc ;
   private String[] H02922_A759ProDsc ;
   private String[] H02922_A9841DisFasObs ;
   private String[] H02922_A4286FasForMul ;
   private boolean[] H02922_n4286FasForMul ;
   private String[] H02922_A4903FasAcab ;
   private boolean[] H02922_n4903FasAcab ;
   private String[] H02922_A458FasCon ;
   private boolean[] H02922_n458FasCon ;
   private String[] H02922_A456FasActTin ;
   private boolean[] H02922_n456FasActTin ;
   private short[] H02922_A464FasNumPas ;
   private boolean[] H02922_n464FasNumPas ;
   private java.math.BigDecimal[] H02922_A472FasVelPro ;
   private boolean[] H02922_n472FasVelPro ;
   private short[] H02922_A468FasPrePie ;
   private boolean[] H02922_n468FasPrePie ;
   private short[] H02922_A469FasPreSal ;
   private boolean[] H02922_n469FasPreSal ;
   private java.math.BigDecimal[] H02922_A459FasDec ;
   private boolean[] H02922_n459FasDec ;
   private String[] H02922_A602MaqCod ;
   private boolean[] H02922_n602MaqCod ;
   private String[] H02922_A460FasDsc ;
   private String[] H02922_A457FasCod ;
   private short[] H02922_A368DisFasLin ;
   private long[] H02923_AGRID_nRecordCount ;
   private java.util.Date[] H02924_A369DisFec ;
   private int[] H02924_A252CliCod ;
   private String[] H02924_A335DisArtCod ;
   private String[] H02924_A337DisArtDsc ;
   private String[] H02925_A279CliNom ;
   private String[] H02926_A759ProDsc ;
   private String[] H02927_A396EmprCod ;
   private String[] H02927_A14042FasActiva ;
   private String[] H02927_A13781FasCDsc ;
   private String[] H02927_A457FasCod ;
   private String[] H02927_A460FasDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV67FasCod_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState21[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV29DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV68Combo_DataItem ;
}

final  class disfas___ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02922( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                          String AV80Pedidos_disfas___wwds_1_tfmaqcod ,
                                          java.math.BigDecimal AV82Pedidos_disfas___wwds_3_tffasdec ,
                                          java.math.BigDecimal AV83Pedidos_disfas___wwds_4_tffasdec_to ,
                                          short AV84Pedidos_disfas___wwds_5_tffaspresal ,
                                          short AV85Pedidos_disfas___wwds_6_tffaspresal_to ,
                                          short AV86Pedidos_disfas___wwds_7_tffasprepie ,
                                          short AV87Pedidos_disfas___wwds_8_tffasprepie_to ,
                                          java.math.BigDecimal AV88Pedidos_disfas___wwds_9_tffasvelpro ,
                                          java.math.BigDecimal AV89Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                          short AV90Pedidos_disfas___wwds_11_tffasnumpas ,
                                          short AV91Pedidos_disfas___wwds_12_tffasnumpas_to ,
                                          String AV93Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                          String AV92Pedidos_disfas___wwds_13_tffasacttin ,
                                          String AV95Pedidos_disfas___wwds_16_tffascon_sel ,
                                          String AV94Pedidos_disfas___wwds_15_tffascon ,
                                          String AV97Pedidos_disfas___wwds_18_tffasacab_sel ,
                                          String AV96Pedidos_disfas___wwds_17_tffasacab ,
                                          String AV99Pedidos_disfas___wwds_20_tffasformul_sel ,
                                          String AV98Pedidos_disfas___wwds_19_tffasformul ,
                                          String AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                          String AV100Pedidos_disfas___wwds_21_tfdisfasobs ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A9841DisFasObs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          String A758ProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[30];
      Object[] GXv_Object23 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.DisCod, T1.ProCod, T3.DisFec, T3.CliCod, T4.CliNom, T3.DisArtCod, T3.DisArtDsc, T5.ProDsc, T1.DisFasObs, T2.FasForMul, T2.FasAcab, T2.FasCon, T2.FasActTin," ;
      sSelectString += " T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec, T2.MaqCod, T2.FasDsc, T1.FasCod, T1.DisFasLin" ;
      sFromString = " FROM ((((TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod" ;
      sFromString += " = T1.DisCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = T1.EmprCod AND T5.ProCod = T1.ProCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ?)");
      if ( (GXutil.strcmp("", AV81Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Pedidos_disfas___wwds_1_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidos_disfas___wwds_3_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidos_disfas___wwds_4_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( ! (0==AV84Pedidos_disfas___wwds_5_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_disfas___wwds_6_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_disfas___wwds_7_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (0==AV87Pedidos_disfas___wwds_8_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Pedidos_disfas___wwds_9_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Pedidos_disfas___wwds_10_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (0==AV90Pedidos_disfas___wwds_11_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidos_disfas___wwds_12_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidos_disfas___wwds_14_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidos_disfas___wwds_13_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidos_disfas___wwds_14_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_disfas___wwds_16_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_disfas___wwds_15_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_disfas___wwds_16_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_disfas___wwds_18_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_disfas___wwds_17_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_disfas___wwds_18_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_disfas___wwds_20_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_disfas___wwds_19_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_disfas___wwds_20_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_disfas___wwds_21_tfdisfasobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisFasObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisFasObs = ?)");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisFasLin" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisFasLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.MaqCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.MaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasDec" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasDec DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasPreSal" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasPreSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasPrePie" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasPrePie DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasVelPro" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasVelPro DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasNumPas" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasNumPas DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasActTin" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasActTin DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasCon" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasCon DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasAcab" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasAcab DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasForMul" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasForMul DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisFasObs" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisFasObs DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H02923( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Pedidos_disfas___wwds_2_tfmaqcod_sel ,
                                          String AV80Pedidos_disfas___wwds_1_tfmaqcod ,
                                          java.math.BigDecimal AV82Pedidos_disfas___wwds_3_tffasdec ,
                                          java.math.BigDecimal AV83Pedidos_disfas___wwds_4_tffasdec_to ,
                                          short AV84Pedidos_disfas___wwds_5_tffaspresal ,
                                          short AV85Pedidos_disfas___wwds_6_tffaspresal_to ,
                                          short AV86Pedidos_disfas___wwds_7_tffasprepie ,
                                          short AV87Pedidos_disfas___wwds_8_tffasprepie_to ,
                                          java.math.BigDecimal AV88Pedidos_disfas___wwds_9_tffasvelpro ,
                                          java.math.BigDecimal AV89Pedidos_disfas___wwds_10_tffasvelpro_to ,
                                          short AV90Pedidos_disfas___wwds_11_tffasnumpas ,
                                          short AV91Pedidos_disfas___wwds_12_tffasnumpas_to ,
                                          String AV93Pedidos_disfas___wwds_14_tffasacttin_sel ,
                                          String AV92Pedidos_disfas___wwds_13_tffasacttin ,
                                          String AV95Pedidos_disfas___wwds_16_tffascon_sel ,
                                          String AV94Pedidos_disfas___wwds_15_tffascon ,
                                          String AV97Pedidos_disfas___wwds_18_tffasacab_sel ,
                                          String AV96Pedidos_disfas___wwds_17_tffasacab ,
                                          String AV99Pedidos_disfas___wwds_20_tffasformul_sel ,
                                          String AV98Pedidos_disfas___wwds_19_tffasformul ,
                                          String AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel ,
                                          String AV100Pedidos_disfas___wwds_21_tfdisfasobs ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A9841DisFasObs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          String A758ProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[25];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((TXPDISFAS T1 INNER JOIN TXPFASPRO T4 ON T4.EmprCod = T1.EmprCod AND T4.FasCod = T1.FasCod) INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = T1.EmprCod AND T5.ProCod" ;
      scmdbuf += " = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ?)");
      if ( (GXutil.strcmp("", AV81Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Pedidos_disfas___wwds_1_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Pedidos_disfas___wwds_2_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T4.MaqCod = ?)");
      }
      else
      {
         GXv_int24[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidos_disfas___wwds_3_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T4.FasDec >= ?)");
      }
      else
      {
         GXv_int24[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidos_disfas___wwds_4_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T4.FasDec <= ?)");
      }
      else
      {
         GXv_int24[6] = (byte)(1) ;
      }
      if ( ! (0==AV84Pedidos_disfas___wwds_5_tffaspresal) )
      {
         addWhere(sWhereString, "(T4.FasPreSal >= ?)");
      }
      else
      {
         GXv_int24[7] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_disfas___wwds_6_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T4.FasPreSal <= ?)");
      }
      else
      {
         GXv_int24[8] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_disfas___wwds_7_tffasprepie) )
      {
         addWhere(sWhereString, "(T4.FasPrePie >= ?)");
      }
      else
      {
         GXv_int24[9] = (byte)(1) ;
      }
      if ( ! (0==AV87Pedidos_disfas___wwds_8_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T4.FasPrePie <= ?)");
      }
      else
      {
         GXv_int24[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Pedidos_disfas___wwds_9_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T4.FasVelPro >= ?)");
      }
      else
      {
         GXv_int24[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Pedidos_disfas___wwds_10_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T4.FasVelPro <= ?)");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! (0==AV90Pedidos_disfas___wwds_11_tffasnumpas) )
      {
         addWhere(sWhereString, "(T4.FasNumPas >= ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidos_disfas___wwds_12_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T4.FasNumPas <= ?)");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidos_disfas___wwds_14_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidos_disfas___wwds_13_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidos_disfas___wwds_14_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T4.FasActTin = ?)");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_disfas___wwds_16_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_disfas___wwds_15_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_disfas___wwds_16_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T4.FasCon = ?)");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_disfas___wwds_18_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_disfas___wwds_17_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_disfas___wwds_18_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T4.FasAcab = ?)");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_disfas___wwds_20_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_disfas___wwds_19_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_disfas___wwds_20_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T4.FasForMul = ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_disfas___wwds_21_tfdisfasobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisFasObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_disfas___wwds_22_tfdisfasobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisFasObs = ?)");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_H02922(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] );
            case 1 :
                  return conditional_H02923(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02922", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02923", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02924", "SELECT DisFec, CliCod, DisArtCod, DisArtDsc FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02925", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02926", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02927", "SELECT EmprCod, FasActiva, RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, FasCod, FasDsc FROM TXPFASPRO WHERE (EmprCod = ?) AND (FasActiva = 'S') ORDER BY FasCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(17);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(18);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(21, 28);
               ((String[]) buf[31])[0] = rslt.getString(22, 8);
               ((short[]) buf[32])[0] = rslt.getShort(23);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
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
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 3000);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 3000);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 3000);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 3000);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

