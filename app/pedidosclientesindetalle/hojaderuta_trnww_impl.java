package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta_trnww_impl extends GXDataArea
{
   public hojaderuta_trnww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta_trnww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta_trnww_impl.class ));
   }

   public hojaderuta_trnww_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkBarAcc = UIFactory.getCheckbox(this);
      chkBarHayAlb = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_99 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_99"))) ;
      nGXsfl_99_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_99_idx"))) ;
      sGXsfl_99_idx = httpContext.GetPar( "sGXsfl_99_idx") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
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
      AV97BarCodIN = (int)(GXutil.lval( httpContext.GetPar( "BarCodIN"))) ;
      AV98BarCodReoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoIN"))) ;
      AV99BarCodParIN = httpContext.GetPar( "BarCodParIN") ;
      AV100BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
      AV101BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
      AV102BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
      AV103BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
      AV14FilterFullText = httpContext.GetPar( "FilterFullText") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV24ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV19ColumnsSelector);
      AV111Pgmname = httpContext.GetPar( "Pgmname") ;
      AV34OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV12OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV47TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV48TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV49TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV50TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV43TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV44TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV76TFBarTipDis = httpContext.GetPar( "TFBarTipDis") ;
      AV77TFBarTipDis_Sel = httpContext.GetPar( "TFBarTipDis_Sel") ;
      AV51TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV52TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV53TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV54TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV55TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV56TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV57TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV58TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV78TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV79TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV80TFBarNumCli = (int)(GXutil.lval( httpContext.GetPar( "TFBarNumCli"))) ;
      AV81TFBarNumCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarNumCli_To"))) ;
      AV82TFBarMaqCod = httpContext.GetPar( "TFBarMaqCod") ;
      AV83TFBarMaqCod_Sel = httpContext.GetPar( "TFBarMaqCod_Sel") ;
      AV84TFBarPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarPie"))) ;
      AV85TFBarPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarPie_To"))) ;
      AV86TFBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm"), ".") ;
      AV87TFBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm_To"), ".") ;
      AV88TFBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr"), ".") ;
      AV89TFBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr_To"), ".") ;
      AV90TFBarAcaQui = httpContext.GetPar( "TFBarAcaQui") ;
      AV91TFBarAcaQui_Sel = httpContext.GetPar( "TFBarAcaQui_Sel") ;
      AV95TFBarAgrEst = httpContext.GetPar( "TFBarAgrEst") ;
      AV96TFBarAgrEst_Sel = httpContext.GetPar( "TFBarAgrEst_Sel") ;
      AV108TFBarHayAlb_Sel = (byte)(GXutil.lval( httpContext.GetPar( "TFBarHayAlb_Sel"))) ;
      AV104Ensayos = (short)(GXutil.lval( httpContext.GetPar( "Ensayos"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV59moda21 = (short)(GXutil.lval( httpContext.GetPar( "moda21"))) ;
      AV61ImpCod = httpContext.GetPar( "ImpCod") ;
      AV42UsurCod = httpContext.GetPar( "UsurCod") ;
      AV40Station = httpContext.GetPar( "Station") ;
      A3594BarPriTin = (byte)(GXutil.lval( httpContext.GetPar( "BarPriTin"))) ;
      A2265BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
      n2265BarExt = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV97BarCodIN, AV98BarCodReoIN, AV99BarCodParIN, AV100BarFecGenfrom, AV101BarFecGento, AV102BarSitfrom, AV103BarSitto, AV14FilterFullText, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV111Pgmname, AV34OrderedBy, AV12OrderedDsc, AV47TFCliCod, AV48TFCliCod_To, AV49TFCliNom, AV50TFCliNom_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV76TFBarTipDis, AV77TFBarTipDis_Sel, AV51TFBarSer, AV52TFBarSer_Sel, AV53TFBarSerDsc, AV54TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV78TFBarNomCli, AV79TFBarNomCli_Sel, AV80TFBarNumCli, AV81TFBarNumCli_To, AV82TFBarMaqCod, AV83TFBarMaqCod_Sel, AV84TFBarPie, AV85TFBarPie_To, AV86TFBarKgm, AV87TFBarKgm_To, AV88TFBarMtr, AV89TFBarMtr_To, AV90TFBarAcaQui, AV91TFBarAcaQui_Sel, AV95TFBarAgrEst, AV96TFBarAgrEst_Sel, AV108TFBarHayAlb_Sel, AV104Ensayos, Gx_mode, AV59moda21, AV61ImpCod, AV42UsurCod, AV40Station, A3594BarPriTin, A2265BarExt) ;
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
      pa1QL2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1QL2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta_trnww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV104Ensayos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta_TRNWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta_trnww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODIN", GXutil.ltrim( localUtil.ntoc( AV97BarCodIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODREOIN", GXutil.ltrim( localUtil.ntoc( AV98BarCodReoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODPARIN", GXutil.rtrim( AV99BarCodParIN));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGENFROM", localUtil.format(AV100BarFecGenfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGENTO", localUtil.format(AV101BarFecGento, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV102BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV103BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV14FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_99", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_99, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV22ManageFiltersData);
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
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV24ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV34OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV12OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV47TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV48TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV49TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV50TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDIDOCLIENTE", GXutil.rtrim( AV43TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV44TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARTIPDIS", GXutil.rtrim( AV76TFBarTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARTIPDIS_SEL", GXutil.rtrim( AV77TFBarTipDis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV51TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV52TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC", GXutil.rtrim( AV53TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC_SEL", GXutil.rtrim( AV54TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM", GXutil.rtrim( AV55TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM_SEL", GXutil.rtrim( AV56TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV57TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV58TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI", GXutil.rtrim( AV78TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI_SEL", GXutil.rtrim( AV79TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNUMCLI", GXutil.ltrim( localUtil.ntoc( AV80TFBarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNUMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV81TFBarNumCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMAQCOD", GXutil.rtrim( AV82TFBarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMAQCOD_SEL", GXutil.rtrim( AV83TFBarMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIE", GXutil.ltrim( localUtil.ntoc( AV84TFBarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIE_TO", GXutil.ltrim( localUtil.ntoc( AV85TFBarPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV86TFBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV87TFBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV88TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV89TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARACAQUI", GXutil.rtrim( AV90TFBarAcaQui));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARACAQUI_SEL", GXutil.rtrim( AV91TFBarAcaQui_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGREST", GXutil.rtrim( AV95TFBarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGREST_SEL", GXutil.rtrim( AV96TFBarAgrEst_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARHAYALB_SEL", GXutil.ltrim( localUtil.ntoc( AV108TFBarHayAlb_Sel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vENSAYOS", GXutil.ltrim( localUtil.ntoc( AV104Ensayos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV104Ensayos), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRITIN", GXutil.ltrim( localUtil.ntoc( A3594BarPriTin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAREXT", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV59moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV61ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV39EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV42UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV40Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
         we1QL2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1QL2( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta_trnww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta_TRNWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Hoja de Ruta", "") ;
   }

   public void wb1QL0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 700, "px", 60, "px", "", "left", "top", " "+"data-gx-smarttable"+" ", "grid-template-columns:90px 90px 90px 120px 120px 120px 120px;grid-template-rows:60px;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarcodin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcodin_Internalname, httpContext.getMessage( "Nº HDR", ""), "", "", lblTextblockbarcodin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodin_Internalname, httpContext.getMessage( "Bar Cod IN", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodin_Internalname, GXutil.ltrim( localUtil.ntoc( AV97BarCodIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV97BarCodIN), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV97BarCodIN), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarcodreoin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcodreoin_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblockbarcodreoin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreoin_Internalname, httpContext.getMessage( "Bar Cod Reo IN", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreoin_Internalname, GXutil.ltrim( localUtil.ntoc( AV98BarCodReoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreoin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV98BarCodReoIN), "9") : localUtil.format( DecimalUtil.doubleToDec(AV98BarCodReoIN), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreoin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreoin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarcodparin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcodparin_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblockbarcodparin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparin_Internalname, httpContext.getMessage( "Bar Cod Par IN", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparin_Internalname, GXutil.rtrim( AV99BarCodParIN), GXutil.rtrim( localUtil.format( AV99BarCodParIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarfecgenfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarfecgenfrom_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "", "", lblTextblockbarfecgenfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgenfrom_Internalname, httpContext.getMessage( "Bar Fec Genfrom", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgenfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgenfrom_Internalname, localUtil.format(AV100BarFecGenfrom, "99/99/99"), localUtil.format( AV100BarFecGenfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgenfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgenfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgenfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgenfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarfecgento_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarfecgento_Internalname, httpContext.getMessage( "Fecha Final", ""), "", "", lblTextblockbarfecgento_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgento_Internalname, httpContext.getMessage( "Bar Fec Gento", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgento_Internalname, localUtil.format(AV101BarFecGento, "99/99/99"), localUtil.format( AV101BarFecGento, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgento_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgento_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarsitfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarsitfrom_Internalname, httpContext.getMessage( "Sit. Inicial", ""), "", "", lblTextblockbarsitfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitfrom_Internalname, httpContext.getMessage( "Bar Sitfrom", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV102BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV102BarSitfrom), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV102BarSitfrom), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitfrom_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarsitto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarsitto_Internalname, httpContext.getMessage( "SIt. Final", ""), "", "", lblTextblockbarsitto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitto_Internalname, httpContext.getMessage( "Bar Sitto", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitto_Internalname, GXutil.ltrim( localUtil.ntoc( AV103BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV103BarSitto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV103BarSitto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_81_1QL2( true) ;
      }
      else
      {
         wb_table1_81_1QL2( false) ;
      }
      return  ;
   }

   public void wb_table1_81_1QL2e( boolean wbgen )
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
         startgridcontrol99( ) ;
      }
      if ( wbEnd == 99 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_99 = (int)(nGXsfl_99_idx-1) ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV111Pgmname), GXutil.rtrim( localUtil.format( AV111Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV29DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV29DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV19ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_148_1QL2( true) ;
      }
      else
      {
         wb_table2_148_1QL2( false) ;
      }
      return  ;
   }

   public void wb_table2_148_1QL2e( boolean wbgen )
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
      if ( wbEnd == 99 )
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

   public void start1QL2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Hoja de Ruta", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1QL0( ) ;
   }

   public void ws1QL2( )
   {
      start1QL2( ) ;
      evt1QL2( ) ;
   }

   public void evt1QL2( )
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
                           e111QL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121QL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131QL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141QL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151QL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161QL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e171QL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e181QL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e191QL2 ();
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
                           nGXsfl_99_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_992( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV33GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridActions), 4, 0));
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
                           A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A118BarAcaQui = httpContext.cgiGet( edtBarAcaQui_Internalname) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A5253BarAcc = ((GXutil.strcmp(httpContext.cgiGet( chkBarAcc.getInternalname()), "S")==0) ? "S" : "N") ;
                           A14007E_Barser = (short)(localUtil.ctol( httpContext.cgiGet( edtE_Barser_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
                           A864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A209BarPri = httpContext.cgiGet( edtBarPri_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_COLOR");
                              GX_FocusControl = edtavF_color_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV92F_color = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92F_color), 4, 0));
                           }
                           else
                           {
                              AV92F_color = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92F_color), 4, 0));
                           }
                           A1923BarCodTN = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodTN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
                           A14502BarHayAlb = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkBarHayAlb.getInternalname()), "1")==0) ? 1 : 0)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e201QL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e211QL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221QL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e231QL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Barcodin Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV97BarCodIN )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodreoin Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREOIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV98BarCodReoIN )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodparin Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPARIN"), AV99BarCodParIN) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgenfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGENFROM"), 0), AV100BarFecGenfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgento Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGENTO"), 0), AV101BarFecGento) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsitfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV102BarSitfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsitto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV103BarSitto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV14FilterFullText) != 0 )
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

   public void we1QL2( )
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

   public void pa1QL2( )
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
            GX_FocusControl = edtavBarcodin_Internalname ;
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
      subsflControlProps_992( ) ;
      while ( nGXsfl_99_idx <= nRC_GXsfl_99 )
      {
         sendrow_992( ) ;
         nGXsfl_99_idx = ((subGrid_Islastpage==1)&&(nGXsfl_99_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_99_idx+1) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV97BarCodIN ,
                                 byte AV98BarCodReoIN ,
                                 String AV99BarCodParIN ,
                                 java.util.Date AV100BarFecGenfrom ,
                                 java.util.Date AV101BarFecGento ,
                                 byte AV102BarSitfrom ,
                                 byte AV103BarSitto ,
                                 String AV14FilterFullText ,
                                 String A396EmprCod ,
                                 byte AV24ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ,
                                 String AV111Pgmname ,
                                 short AV34OrderedBy ,
                                 boolean AV12OrderedDsc ,
                                 int AV47TFCliCod ,
                                 int AV48TFCliCod_To ,
                                 String AV49TFCliNom ,
                                 String AV50TFCliNom_Sel ,
                                 String AV43TFPedidoCliente ,
                                 String AV44TFPedidoCliente_Sel ,
                                 String AV76TFBarTipDis ,
                                 String AV77TFBarTipDis_Sel ,
                                 String AV51TFBarSer ,
                                 String AV52TFBarSer_Sel ,
                                 String AV53TFBarSerDsc ,
                                 String AV54TFBarSerDsc_Sel ,
                                 String AV55TFBarColNom ,
                                 String AV56TFBarColNom_Sel ,
                                 int AV57TFBarColNum ,
                                 int AV58TFBarColNum_To ,
                                 String AV78TFBarNomCli ,
                                 String AV79TFBarNomCli_Sel ,
                                 int AV80TFBarNumCli ,
                                 int AV81TFBarNumCli_To ,
                                 String AV82TFBarMaqCod ,
                                 String AV83TFBarMaqCod_Sel ,
                                 int AV84TFBarPie ,
                                 int AV85TFBarPie_To ,
                                 java.math.BigDecimal AV86TFBarKgm ,
                                 java.math.BigDecimal AV87TFBarKgm_To ,
                                 java.math.BigDecimal AV88TFBarMtr ,
                                 java.math.BigDecimal AV89TFBarMtr_To ,
                                 String AV90TFBarAcaQui ,
                                 String AV91TFBarAcaQui_Sel ,
                                 String AV95TFBarAgrEst ,
                                 String AV96TFBarAgrEst_Sel ,
                                 byte AV108TFBarHayAlb_Sel ,
                                 short AV104Ensayos ,
                                 String Gx_mode ,
                                 short AV59moda21 ,
                                 String AV61ImpCod ,
                                 String AV42UsurCod ,
                                 String AV40Station ,
                                 byte A3594BarPriTin ,
                                 byte A2265BarExt )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211QL2 ();
      GRID_nCurrentRecord = 0 ;
      rf1QL2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta_TRNWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta_trnww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A228BarUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNIMED", GXutil.rtrim( A228BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPES", GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A212BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PEDIDOCLIE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A135BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A1652BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECGEN", getSecureSignedToken( "", A159BarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECGEN", localUtil.format(A159BarFecGen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A209BarPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRI", GXutil.rtrim( A209BarPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARHAYALB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14502BarHayAlb), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHAYALB", GXutil.ltrim( localUtil.ntoc( A14502BarHayAlb, (byte)(1), (byte)(0), ".", "")));
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
      rf1QL2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV111Pgmname = "PedidosClienteSinDetalle.HojadeRuta_TRNWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavF_color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF_color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_color_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV47TFCliCod) ,
                                           Integer.valueOf(AV48TFCliCod_To) ,
                                           AV50TFCliNom_Sel ,
                                           AV49TFCliNom ,
                                           AV77TFBarTipDis_Sel ,
                                           AV76TFBarTipDis ,
                                           AV52TFBarSer_Sel ,
                                           AV51TFBarSer ,
                                           AV54TFBarSerDsc_Sel ,
                                           AV53TFBarSerDsc ,
                                           AV56TFBarColNom_Sel ,
                                           AV55TFBarColNom ,
                                           Integer.valueOf(AV57TFBarColNum) ,
                                           Integer.valueOf(AV58TFBarColNum_To) ,
                                           AV79TFBarNomCli_Sel ,
                                           AV78TFBarNomCli ,
                                           Integer.valueOf(AV80TFBarNumCli) ,
                                           Integer.valueOf(AV81TFBarNumCli_To) ,
                                           AV83TFBarMaqCod_Sel ,
                                           AV82TFBarMaqCod ,
                                           AV86TFBarKgm ,
                                           AV87TFBarKgm_To ,
                                           AV88TFBarMtr ,
                                           AV89TFBarMtr_To ,
                                           AV91TFBarAcaQui_Sel ,
                                           AV90TFBarAcaQui ,
                                           AV96TFBarAgrEst_Sel ,
                                           AV95TFBarAgrEst ,
                                           AV100BarFecGenfrom ,
                                           AV101BarFecGento ,
                                           Byte.valueOf(AV102BarSitfrom) ,
                                           Byte.valueOf(AV103BarSitto) ,
                                           Integer.valueOf(AV97BarCodIN) ,
                                           Byte.valueOf(AV98BarCodReoIN) ,
                                           AV99BarCodParIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV12OrderedDsc) ,
                                           AV14FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV44TFPedidoCliente_Sel ,
                                           AV43TFPedidoCliente ,
                                           Integer.valueOf(AV84TFBarPie) ,
                                           Integer.valueOf(AV85TFBarPie_To) ,
                                           Byte.valueOf(AV108TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
      lV76TFBarTipDis = GXutil.padr( GXutil.rtrim( AV76TFBarTipDis), 1, "%") ;
      lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
      lV53TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV53TFBarSerDsc), 26, "%") ;
      lV55TFBarColNom = GXutil.padr( GXutil.rtrim( AV55TFBarColNom), 13, "%") ;
      lV78TFBarNomCli = GXutil.padr( GXutil.rtrim( AV78TFBarNomCli), 13, "%") ;
      lV82TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV82TFBarMaqCod), 6, "%") ;
      lV90TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV90TFBarAcaQui), 6, "%") ;
      lV95TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV95TFBarAgrEst), 1, "%") ;
      /* Using cursor H01QL3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV47TFCliCod), Integer.valueOf(AV48TFCliCod_To), lV49TFCliNom, AV50TFCliNom_Sel, lV76TFBarTipDis, AV77TFBarTipDis_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarSerDsc, AV54TFBarSerDsc_Sel, lV55TFBarColNom, AV56TFBarColNom_Sel, Integer.valueOf(AV57TFBarColNum), Integer.valueOf(AV58TFBarColNum_To), lV78TFBarNomCli, AV79TFBarNomCli_Sel, Integer.valueOf(AV80TFBarNumCli), Integer.valueOf(AV81TFBarNumCli_To), lV82TFBarMaqCod, AV83TFBarMaqCod_Sel, AV86TFBarKgm, AV87TFBarKgm_To, AV88TFBarMtr, AV89TFBarMtr_To, lV90TFBarAcaQui, AV91TFBarAcaQui_Sel, lV95TFBarAgrEst, AV96TFBarAgrEst_Sel, AV100BarFecGenfrom, AV101BarFecGento, Byte.valueOf(AV102BarSitfrom), Byte.valueOf(AV103BarSitto), Integer.valueOf(AV97BarCodIN), Byte.valueOf(AV98BarCodReoIN), AV99BarCodParIN});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3594BarPriTin = H01QL3_A3594BarPriTin[0] ;
         A2265BarExt = H01QL3_A2265BarExt[0] ;
         n2265BarExt = H01QL3_n2265BarExt[0] ;
         A120BarAgrEst = H01QL3_A120BarAgrEst[0] ;
         A1923BarCodTN = H01QL3_A1923BarCodTN[0] ;
         A209BarPri = H01QL3_A209BarPri[0] ;
         A864BarPes = H01QL3_A864BarPes[0] ;
         A228BarUniMed = H01QL3_A228BarUniMed[0] ;
         A361DisCod = H01QL3_A361DisCod[0] ;
         A5253BarAcc = H01QL3_A5253BarAcc[0] ;
         A118BarAcaQui = H01QL3_A118BarAcaQui[0] ;
         A180BarMaqCod = H01QL3_A180BarMaqCod[0] ;
         A213BarSit = H01QL3_A213BarSit[0] ;
         A1235BarNumCli = H01QL3_A1235BarNumCli[0] ;
         A1234BarNomCli = H01QL3_A1234BarNomCli[0] ;
         A136BarColNum = H01QL3_A136BarColNum[0] ;
         A135BarColNom = H01QL3_A135BarColNom[0] ;
         A1652BarSerDsc = H01QL3_A1652BarSerDsc[0] ;
         A159BarFecGen = H01QL3_A159BarFecGen[0] ;
         A2010BarTipDis = H01QL3_A2010BarTipDis[0] ;
         A13696BarNHdr = H01QL3_A13696BarNHdr[0] ;
         A279CliNom = H01QL3_A279CliNom[0] ;
         A184BarMtr = H01QL3_A184BarMtr[0] ;
         A166BarKgm = H01QL3_A166BarKgm[0] ;
         A143BarDisNum = H01QL3_A143BarDisNum[0] ;
         A4812BarEncCli = H01QL3_A4812BarEncCli[0] ;
         A199BarPie1 = H01QL3_A199BarPie1[0] ;
         A365DisDes = H01QL3_A365DisDes[0] ;
         A898BarPieNDes = H01QL3_A898BarPieNDes[0] ;
         A212BarSer = H01QL3_A212BarSer[0] ;
         A252CliCod = H01QL3_A252CliCod[0] ;
         n252CliCod = H01QL3_n252CliCod[0] ;
         A130BarCodPar = H01QL3_A130BarCodPar[0] ;
         A132BarCodReo = H01QL3_A132BarCodReo[0] ;
         A129BarCod = H01QL3_A129BarCod[0] ;
         A279CliNom = H01QL3_A279CliNom[0] ;
         A184BarMtr = H01QL3_A184BarMtr[0] ;
         A166BarKgm = H01QL3_A166BarKgm[0] ;
         A199BarPie1 = H01QL3_A199BarPie1[0] ;
         A898BarPieNDes = H01QL3_A898BarPieNDes[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         hojaderuta_trnww_impl.this.A396EmprCod = GXv_char2[0] ;
         hojaderuta_trnww_impl.this.A4812BarEncCli = GXv_char3[0] ;
         hojaderuta_trnww_impl.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta_trnww_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV44TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV43TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV44TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV44TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int6 = A14007E_Barser ;
               GXv_int7[0] = GXt_int6 ;
               new app.pedidosclientesindetalle.existearticulo(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, GXv_int7) ;
               hojaderuta_trnww_impl.this.GXt_int6 = GXv_int7[0] ;
               A14007E_Barser = GXt_int6 ;
               GXt_int8 = A14502BarHayAlb ;
               GXv_int9[0] = GXt_int8 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int9) ;
               hojaderuta_trnww_impl.this.GXt_int8 = GXv_int9[0] ;
               A14502BarHayAlb = GXt_int8 ;
               if ( ( AV108TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV108TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV14FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV84TFBarPie) || ( ( A198BarPie >= AV84TFBarPie ) ) )
                        {
                           if ( (0==AV85TFBarPie_To) || ( ( A198BarPie <= AV85TFBarPie_To ) ) )
                           {
                              GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
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

   public void rf1QL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(99) ;
      /* Execute user event: Refresh */
      e211QL2 ();
      nGXsfl_99_idx = 1 ;
      sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_992( ) ;
      bGXsfl_99_Refreshing = true ;
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
         subsflControlProps_992( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV47TFCliCod) ,
                                              Integer.valueOf(AV48TFCliCod_To) ,
                                              AV50TFCliNom_Sel ,
                                              AV49TFCliNom ,
                                              AV77TFBarTipDis_Sel ,
                                              AV76TFBarTipDis ,
                                              AV52TFBarSer_Sel ,
                                              AV51TFBarSer ,
                                              AV54TFBarSerDsc_Sel ,
                                              AV53TFBarSerDsc ,
                                              AV56TFBarColNom_Sel ,
                                              AV55TFBarColNom ,
                                              Integer.valueOf(AV57TFBarColNum) ,
                                              Integer.valueOf(AV58TFBarColNum_To) ,
                                              AV79TFBarNomCli_Sel ,
                                              AV78TFBarNomCli ,
                                              Integer.valueOf(AV80TFBarNumCli) ,
                                              Integer.valueOf(AV81TFBarNumCli_To) ,
                                              AV83TFBarMaqCod_Sel ,
                                              AV82TFBarMaqCod ,
                                              AV86TFBarKgm ,
                                              AV87TFBarKgm_To ,
                                              AV88TFBarMtr ,
                                              AV89TFBarMtr_To ,
                                              AV91TFBarAcaQui_Sel ,
                                              AV90TFBarAcaQui ,
                                              AV96TFBarAgrEst_Sel ,
                                              AV95TFBarAgrEst ,
                                              AV100BarFecGenfrom ,
                                              AV101BarFecGento ,
                                              Byte.valueOf(AV102BarSitfrom) ,
                                              Byte.valueOf(AV103BarSitto) ,
                                              Integer.valueOf(AV97BarCodIN) ,
                                              Byte.valueOf(AV98BarCodReoIN) ,
                                              AV99BarCodParIN ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A2010BarTipDis ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              Integer.valueOf(A1235BarNumCli) ,
                                              A180BarMaqCod ,
                                              A166BarKgm ,
                                              A184BarMtr ,
                                              A118BarAcaQui ,
                                              A120BarAgrEst ,
                                              A159BarFecGen ,
                                              Byte.valueOf(A213BarSit) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(AV34OrderedBy) ,
                                              Boolean.valueOf(AV12OrderedDsc) ,
                                              AV14FilterFullText ,
                                              A13878PedidoClie ,
                                              A13696BarNHdr ,
                                              Integer.valueOf(A198BarPie) ,
                                              AV44TFPedidoCliente_Sel ,
                                              AV43TFPedidoCliente ,
                                              Integer.valueOf(AV84TFBarPie) ,
                                              Integer.valueOf(AV85TFBarPie_To) ,
                                              Byte.valueOf(AV108TFBarHayAlb_Sel) ,
                                              Byte.valueOf(A14502BarHayAlb) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
         lV76TFBarTipDis = GXutil.padr( GXutil.rtrim( AV76TFBarTipDis), 1, "%") ;
         lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
         lV53TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV53TFBarSerDsc), 26, "%") ;
         lV55TFBarColNom = GXutil.padr( GXutil.rtrim( AV55TFBarColNom), 13, "%") ;
         lV78TFBarNomCli = GXutil.padr( GXutil.rtrim( AV78TFBarNomCli), 13, "%") ;
         lV82TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV82TFBarMaqCod), 6, "%") ;
         lV90TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV90TFBarAcaQui), 6, "%") ;
         lV95TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV95TFBarAgrEst), 1, "%") ;
         /* Using cursor H01QL5 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV47TFCliCod), Integer.valueOf(AV48TFCliCod_To), lV49TFCliNom, AV50TFCliNom_Sel, lV76TFBarTipDis, AV77TFBarTipDis_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarSerDsc, AV54TFBarSerDsc_Sel, lV55TFBarColNom, AV56TFBarColNom_Sel, Integer.valueOf(AV57TFBarColNum), Integer.valueOf(AV58TFBarColNum_To), lV78TFBarNomCli, AV79TFBarNomCli_Sel, Integer.valueOf(AV80TFBarNumCli), Integer.valueOf(AV81TFBarNumCli_To), lV82TFBarMaqCod, AV83TFBarMaqCod_Sel, AV86TFBarKgm, AV87TFBarKgm_To, AV88TFBarMtr, AV89TFBarMtr_To, lV90TFBarAcaQui, AV91TFBarAcaQui_Sel, lV95TFBarAgrEst, AV96TFBarAgrEst_Sel, AV100BarFecGenfrom, AV101BarFecGento, Byte.valueOf(AV102BarSitfrom), Byte.valueOf(AV103BarSitto), Integer.valueOf(AV97BarCodIN), Byte.valueOf(AV98BarCodReoIN), AV99BarCodParIN});
         nGXsfl_99_idx = 1 ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3594BarPriTin = H01QL5_A3594BarPriTin[0] ;
            A2265BarExt = H01QL5_A2265BarExt[0] ;
            n2265BarExt = H01QL5_n2265BarExt[0] ;
            A120BarAgrEst = H01QL5_A120BarAgrEst[0] ;
            A1923BarCodTN = H01QL5_A1923BarCodTN[0] ;
            A209BarPri = H01QL5_A209BarPri[0] ;
            A864BarPes = H01QL5_A864BarPes[0] ;
            A228BarUniMed = H01QL5_A228BarUniMed[0] ;
            A361DisCod = H01QL5_A361DisCod[0] ;
            A5253BarAcc = H01QL5_A5253BarAcc[0] ;
            A118BarAcaQui = H01QL5_A118BarAcaQui[0] ;
            A180BarMaqCod = H01QL5_A180BarMaqCod[0] ;
            A213BarSit = H01QL5_A213BarSit[0] ;
            A1235BarNumCli = H01QL5_A1235BarNumCli[0] ;
            A1234BarNomCli = H01QL5_A1234BarNomCli[0] ;
            A136BarColNum = H01QL5_A136BarColNum[0] ;
            A135BarColNom = H01QL5_A135BarColNom[0] ;
            A1652BarSerDsc = H01QL5_A1652BarSerDsc[0] ;
            A159BarFecGen = H01QL5_A159BarFecGen[0] ;
            A2010BarTipDis = H01QL5_A2010BarTipDis[0] ;
            A13696BarNHdr = H01QL5_A13696BarNHdr[0] ;
            A279CliNom = H01QL5_A279CliNom[0] ;
            A184BarMtr = H01QL5_A184BarMtr[0] ;
            A166BarKgm = H01QL5_A166BarKgm[0] ;
            A143BarDisNum = H01QL5_A143BarDisNum[0] ;
            A4812BarEncCli = H01QL5_A4812BarEncCli[0] ;
            A199BarPie1 = H01QL5_A199BarPie1[0] ;
            A365DisDes = H01QL5_A365DisDes[0] ;
            A898BarPieNDes = H01QL5_A898BarPieNDes[0] ;
            A212BarSer = H01QL5_A212BarSer[0] ;
            A252CliCod = H01QL5_A252CliCod[0] ;
            n252CliCod = H01QL5_n252CliCod[0] ;
            A130BarCodPar = H01QL5_A130BarCodPar[0] ;
            A132BarCodReo = H01QL5_A132BarCodReo[0] ;
            A129BarCod = H01QL5_A129BarCod[0] ;
            A279CliNom = H01QL5_A279CliNom[0] ;
            A184BarMtr = H01QL5_A184BarMtr[0] ;
            A166BarKgm = H01QL5_A166BarKgm[0] ;
            A199BarPie1 = H01QL5_A199BarPie1[0] ;
            A898BarPieNDes = H01QL5_A898BarPieNDes[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            hojaderuta_trnww_impl.this.A396EmprCod = GXv_char5[0] ;
            hojaderuta_trnww_impl.this.A4812BarEncCli = GXv_char4[0] ;
            hojaderuta_trnww_impl.this.A143BarDisNum = GXv_char3[0] ;
            hojaderuta_trnww_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV44TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV43TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV44TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV44TFPedidoCliente_Sel) == 0 ) ) )
               {
                  GXt_int6 = A14007E_Barser ;
                  GXv_int7[0] = GXt_int6 ;
                  new app.pedidosclientesindetalle.existearticulo(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, GXv_int7) ;
                  hojaderuta_trnww_impl.this.GXt_int6 = GXv_int7[0] ;
                  A14007E_Barser = GXt_int6 ;
                  GXt_int8 = A14502BarHayAlb ;
                  GXv_int9[0] = GXt_int8 ;
                  new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int9) ;
                  hojaderuta_trnww_impl.this.GXt_int8 = GXv_int9[0] ;
                  A14502BarHayAlb = GXt_int8 ;
                  if ( ( AV108TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
                  {
                     if ( ( AV108TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                     {
                        if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                        {
                           A198BarPie = A898BarPieNDes ;
                        }
                        else
                        {
                           A198BarPie = A199BarPie1 ;
                        }
                        if ( (GXutil.strcmp("", AV14FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV14FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV14FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                        {
                           if ( (0==AV84TFBarPie) || ( ( A198BarPie >= AV84TFBarPie ) ) )
                           {
                              if ( (0==AV85TFBarPie_To) || ( ( A198BarPie <= AV85TFBarPie_To ) ) )
                              {
                                 e221QL2 ();
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
         wbEnd = (short)(99) ;
         wb1QL0( ) ;
      }
      bGXsfl_99_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1QL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vENSAYOS", GXutil.ltrim( localUtil.ntoc( AV104Ensayos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV104Ensayos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSIT"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARUNIMED"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A228BarUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPES"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSER"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A212BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PEDIDOCLIE"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNOM"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A135BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNUM"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIE"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSERDSC"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A1652BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARAGREST"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRITIN", GXutil.ltrim( localUtil.ntoc( A3594BarPriTin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAREXT", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECGEN"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, A159BarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRI"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A209BarPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV59moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV61ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARHAYALB"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A14502BarHayAlb), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV42UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV40Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40Station, ""))));
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV97BarCodIN, AV98BarCodReoIN, AV99BarCodParIN, AV100BarFecGenfrom, AV101BarFecGento, AV102BarSitfrom, AV103BarSitto, AV14FilterFullText, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV111Pgmname, AV34OrderedBy, AV12OrderedDsc, AV47TFCliCod, AV48TFCliCod_To, AV49TFCliNom, AV50TFCliNom_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV76TFBarTipDis, AV77TFBarTipDis_Sel, AV51TFBarSer, AV52TFBarSer_Sel, AV53TFBarSerDsc, AV54TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV78TFBarNomCli, AV79TFBarNomCli_Sel, AV80TFBarNumCli, AV81TFBarNumCli_To, AV82TFBarMaqCod, AV83TFBarMaqCod_Sel, AV84TFBarPie, AV85TFBarPie_To, AV86TFBarKgm, AV87TFBarKgm_To, AV88TFBarMtr, AV89TFBarMtr_To, AV90TFBarAcaQui, AV91TFBarAcaQui_Sel, AV95TFBarAgrEst, AV96TFBarAgrEst_Sel, AV108TFBarHayAlb_Sel, AV104Ensayos, Gx_mode, AV59moda21, AV61ImpCod, AV42UsurCod, AV40Station, A3594BarPriTin, A2265BarExt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV97BarCodIN, AV98BarCodReoIN, AV99BarCodParIN, AV100BarFecGenfrom, AV101BarFecGento, AV102BarSitfrom, AV103BarSitto, AV14FilterFullText, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV111Pgmname, AV34OrderedBy, AV12OrderedDsc, AV47TFCliCod, AV48TFCliCod_To, AV49TFCliNom, AV50TFCliNom_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV76TFBarTipDis, AV77TFBarTipDis_Sel, AV51TFBarSer, AV52TFBarSer_Sel, AV53TFBarSerDsc, AV54TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV78TFBarNomCli, AV79TFBarNomCli_Sel, AV80TFBarNumCli, AV81TFBarNumCli_To, AV82TFBarMaqCod, AV83TFBarMaqCod_Sel, AV84TFBarPie, AV85TFBarPie_To, AV86TFBarKgm, AV87TFBarKgm_To, AV88TFBarMtr, AV89TFBarMtr_To, AV90TFBarAcaQui, AV91TFBarAcaQui_Sel, AV95TFBarAgrEst, AV96TFBarAgrEst_Sel, AV108TFBarHayAlb_Sel, AV104Ensayos, Gx_mode, AV59moda21, AV61ImpCod, AV42UsurCod, AV40Station, A3594BarPriTin, A2265BarExt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV97BarCodIN, AV98BarCodReoIN, AV99BarCodParIN, AV100BarFecGenfrom, AV101BarFecGento, AV102BarSitfrom, AV103BarSitto, AV14FilterFullText, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV111Pgmname, AV34OrderedBy, AV12OrderedDsc, AV47TFCliCod, AV48TFCliCod_To, AV49TFCliNom, AV50TFCliNom_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV76TFBarTipDis, AV77TFBarTipDis_Sel, AV51TFBarSer, AV52TFBarSer_Sel, AV53TFBarSerDsc, AV54TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV78TFBarNomCli, AV79TFBarNomCli_Sel, AV80TFBarNumCli, AV81TFBarNumCli_To, AV82TFBarMaqCod, AV83TFBarMaqCod_Sel, AV84TFBarPie, AV85TFBarPie_To, AV86TFBarKgm, AV87TFBarKgm_To, AV88TFBarMtr, AV89TFBarMtr_To, AV90TFBarAcaQui, AV91TFBarAcaQui_Sel, AV95TFBarAgrEst, AV96TFBarAgrEst_Sel, AV108TFBarHayAlb_Sel, AV104Ensayos, Gx_mode, AV59moda21, AV61ImpCod, AV42UsurCod, AV40Station, A3594BarPriTin, A2265BarExt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV97BarCodIN, AV98BarCodReoIN, AV99BarCodParIN, AV100BarFecGenfrom, AV101BarFecGento, AV102BarSitfrom, AV103BarSitto, AV14FilterFullText, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV111Pgmname, AV34OrderedBy, AV12OrderedDsc, AV47TFCliCod, AV48TFCliCod_To, AV49TFCliNom, AV50TFCliNom_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV76TFBarTipDis, AV77TFBarTipDis_Sel, AV51TFBarSer, AV52TFBarSer_Sel, AV53TFBarSerDsc, AV54TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV78TFBarNomCli, AV79TFBarNomCli_Sel, AV80TFBarNumCli, AV81TFBarNumCli_To, AV82TFBarMaqCod, AV83TFBarMaqCod_Sel, AV84TFBarPie, AV85TFBarPie_To, AV86TFBarKgm, AV87TFBarKgm_To, AV88TFBarMtr, AV89TFBarMtr_To, AV90TFBarAcaQui, AV91TFBarAcaQui_Sel, AV95TFBarAgrEst, AV96TFBarAgrEst_Sel, AV108TFBarHayAlb_Sel, AV104Ensayos, Gx_mode, AV59moda21, AV61ImpCod, AV42UsurCod, AV40Station, A3594BarPriTin, A2265BarExt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV97BarCodIN, AV98BarCodReoIN, AV99BarCodParIN, AV100BarFecGenfrom, AV101BarFecGento, AV102BarSitfrom, AV103BarSitto, AV14FilterFullText, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV111Pgmname, AV34OrderedBy, AV12OrderedDsc, AV47TFCliCod, AV48TFCliCod_To, AV49TFCliNom, AV50TFCliNom_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV76TFBarTipDis, AV77TFBarTipDis_Sel, AV51TFBarSer, AV52TFBarSer_Sel, AV53TFBarSerDsc, AV54TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV78TFBarNomCli, AV79TFBarNomCli_Sel, AV80TFBarNumCli, AV81TFBarNumCli_To, AV82TFBarMaqCod, AV83TFBarMaqCod_Sel, AV84TFBarPie, AV85TFBarPie_To, AV86TFBarKgm, AV87TFBarKgm_To, AV88TFBarMtr, AV89TFBarMtr_To, AV90TFBarAcaQui, AV91TFBarAcaQui_Sel, AV95TFBarAgrEst, AV96TFBarAgrEst_Sel, AV108TFBarHayAlb_Sel, AV104Ensayos, Gx_mode, AV59moda21, AV61ImpCod, AV42UsurCod, AV40Station, A3594BarPriTin, A2265BarExt) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV111Pgmname = "PedidosClienteSinDetalle.HojadeRuta_TRNWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavF_color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF_color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_color_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1QL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201QL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV22ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV29DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV19ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_99 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_99"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV31GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV32GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODIN");
            GX_FocusControl = edtavBarcodin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV97BarCodIN = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97BarCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97BarCodIN), 8, 0));
         }
         else
         {
            AV97BarCodIN = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97BarCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97BarCodIN), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOIN");
            GX_FocusControl = edtavBarcodreoin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV98BarCodReoIN = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarCodReoIN", GXutil.str( AV98BarCodReoIN, 1, 0));
         }
         else
         {
            AV98BarCodReoIN = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarCodReoIN", GXutil.str( AV98BarCodReoIN, 1, 0));
         }
         AV99BarCodParIN = httpContext.cgiGet( edtavBarcodparin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99BarCodParIN", AV99BarCodParIN);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgenfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGENFROM");
            GX_FocusControl = edtavBarfecgenfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV100BarFecGenfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100BarFecGenfrom", localUtil.format(AV100BarFecGenfrom, "99/99/99"));
         }
         else
         {
            AV100BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecgenfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100BarFecGenfrom", localUtil.format(AV100BarFecGenfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgento_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGENTO");
            GX_FocusControl = edtavBarfecgento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV101BarFecGento = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101BarFecGento", localUtil.format(AV101BarFecGento, "99/99/99"));
         }
         else
         {
            AV101BarFecGento = localUtil.ctod( httpContext.cgiGet( edtavBarfecgento_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101BarFecGento", localUtil.format(AV101BarFecGento, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITFROM");
            GX_FocusControl = edtavBarsitfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV102BarSitfrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102BarSitfrom), 2, 0));
         }
         else
         {
            AV102BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102BarSitfrom), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITTO");
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV103BarSitto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarSitto), 2, 0));
         }
         else
         {
            AV103BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarSitto), 2, 0));
         }
         AV14FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_99_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
         if ( nGXsfl_99_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV33GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridActions), 4, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
            A159BarFecGen = localUtil.ctod( httpContext.cgiGet( edtBarFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
            A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
            A118BarAcaQui = httpContext.cgiGet( edtBarAcaQui_Internalname) ;
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A5253BarAcc = ((GXutil.strcmp(httpContext.cgiGet( chkBarAcc.getInternalname()), "S")==0) ? "S" : "N") ;
            A14007E_Barser = (short)(localUtil.ctol( httpContext.cgiGet( edtE_Barser_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
            A864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A209BarPri = httpContext.cgiGet( edtBarPri_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_COLOR");
               GX_FocusControl = edtavF_color_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV92F_color = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92F_color), 4, 0));
            }
            else
            {
               AV92F_color = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92F_color), 4, 0));
            }
            A1923BarCodTN = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodTN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            A14502BarHayAlb = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkBarHayAlb.getInternalname()), "1")==0) ? 1 : 0)) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta_TRNWW");
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\hojaderuta_trnww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV97BarCodIN )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREOIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV98BarCodReoIN )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPARIN"), AV99BarCodParIN) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGENFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV100BarFecGenfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGENTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV101BarFecGento)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV102BarSitfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV103BarSitto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV14FilterFullText) != 0 )
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
      e201QL2 ();
      if (returnInSub) return;
   }

   public void e201QL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV40Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      hojaderuta_trnww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV40Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Station", AV40Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40Station, ""))));
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = AV41EmprNom ;
      GXv_char3[0] = AV42UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV40Station, GXv_char5, GXv_char4, GXv_char3) ;
      hojaderuta_trnww_impl.this.A396EmprCod = GXv_char5[0] ;
      hojaderuta_trnww_impl.this.AV41EmprNom = GXv_char4[0] ;
      hojaderuta_trnww_impl.this.AV42UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42UsurCod", AV42UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42UsurCod, "@!"))));
      GXt_int8 = (byte)(AV59moda21) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      hojaderuta_trnww_impl.this.GXt_int8 = GXv_int9[0] ;
      AV59moda21 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59moda21), "ZZZ9")));
      GXt_int8 = (byte)(AV104Ensayos) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS000", ""), GXv_int9) ;
      hojaderuta_trnww_impl.this.GXt_int8 = GXv_int9[0] ;
      AV104Ensayos = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104Ensayos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104Ensayos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV104Ensayos), "ZZZ9")));
      GXt_char1 = AV40Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      hojaderuta_trnww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV40Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Station", AV40Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40Station, ""))));
      GXv_char5[0] = AV39EmprCod ;
      GXv_char4[0] = AV41EmprNom ;
      GXv_char3[0] = AV42UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV40Station, GXv_char5, GXv_char4, GXv_char3) ;
      hojaderuta_trnww_impl.this.AV39EmprCod = GXv_char5[0] ;
      hojaderuta_trnww_impl.this.AV41EmprNom = GXv_char4[0] ;
      hojaderuta_trnww_impl.this.AV42UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39EmprCod", AV39EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV42UsurCod", AV42UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42UsurCod, "@!"))));
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Hoja de Ruta", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV34OrderedBy < 1 )
      {
         AV34OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = AV29DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[0] ;
      AV29DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e211QL2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext12[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext12) ;
      AV6WWPContext = GXv_SdtWWPContext12[0] ;
      if ( AV24ManageFiltersExecutionStep == 1 )
      {
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV24ManageFiltersExecutionStep == 2 )
      {
         AV24ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV21Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWColumnsSelector"), "") != 0 )
      {
         AV17ColumnsSelectorXML = AV21Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWColumnsSelector") ;
         AV19ColumnsSelector.fromxml(AV17ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtPedidoClie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarTipDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDis_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarNumCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarAcaQui_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaQui_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaQui_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtBarAgrEst_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Visible), 5, 0), !bGXsfl_99_Refreshing);
      chkBarHayAlb.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkBarHayAlb.getInternalname(), "Visible", GXutil.ltrimstr( chkBarHayAlb.getVisible(), 5, 0), !bGXsfl_99_Refreshing);
      AV31GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridCurrentPage), 10, 0));
      AV32GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_99_Refreshing);
      edtCliCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Columnheaderclass", edtCliCod_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtCliNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Columnheaderclass", edtCliNom_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtPedidoClie_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Columnheaderclass", edtPedidoClie_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarNHdr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Columnheaderclass", edtBarNHdr_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarTipDis_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDis_Internalname, "Columnheaderclass", edtBarTipDis_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarFecGen_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecGen_Internalname, "Columnheaderclass", edtBarFecGen_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarSer_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Columnheaderclass", edtBarSer_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarSerDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Columnheaderclass", edtBarSerDsc_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarColNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Columnheaderclass", edtBarColNom_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarColNum_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Columnheaderclass", edtBarColNum_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarNomCli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Columnheaderclass", edtBarNomCli_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarNumCli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Columnheaderclass", edtBarNumCli_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarSit_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Columnheaderclass", edtBarSit_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarMaqCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Columnheaderclass", edtBarMaqCod_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarPie_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Columnheaderclass", edtBarPie_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarKgm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgm_Internalname, "Columnheaderclass", edtBarKgm_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarMtr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtr_Internalname, "Columnheaderclass", edtBarMtr_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarAcaQui_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaQui_Internalname, "Columnheaderclass", edtBarAcaQui_Columnheaderclass, !bGXsfl_99_Refreshing);
      edtBarAgrEst_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Columnheaderclass", edtBarAgrEst_Columnheaderclass, !bGXsfl_99_Refreshing);
      chkBarHayAlb.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarHayAlb.getInternalname(), "Columnheaderclass", chkBarHayAlb.getColumnHeaderClass(), !bGXsfl_99_Refreshing);
      if ( (0==AV97BarCodIN) )
      {
         AV97BarCodIN = (int)(GXutil.lval( AV105websession.getValue(httpContext.getMessage( "VarBarCodIN", "")))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV97BarCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97BarCodIN), 8, 0));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121QL2( )
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

   public void e131QL2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141QL2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV34OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         AV12OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedDsc", AV12OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV47TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFCliCod), 6, 0));
            AV48TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV49TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFCliNom", AV49TFCliNom);
            AV50TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFCliNom_Sel", AV50TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedidoCliente") == 0 )
         {
            AV43TFPedidoCliente = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPedidoCliente", AV43TFPedidoCliente);
            AV44TFPedidoCliente_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPedidoCliente_Sel", AV44TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipDis") == 0 )
         {
            AV76TFBarTipDis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFBarTipDis", AV76TFBarTipDis);
            AV77TFBarTipDis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFBarTipDis_Sel", AV77TFBarTipDis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV51TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFBarSer", AV51TFBarSer);
            AV52TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFBarSer_Sel", AV52TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV53TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarSerDsc", AV53TFBarSerDsc);
            AV54TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarSerDsc_Sel", AV54TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV55TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarColNom", AV55TFBarColNom);
            AV56TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarColNom_Sel", AV56TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV57TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarColNum), 6, 0));
            AV58TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV78TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFBarNomCli", AV78TFBarNomCli);
            AV79TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFBarNomCli_Sel", AV79TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNumCli") == 0 )
         {
            AV80TFBarNumCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFBarNumCli), 6, 0));
            AV81TFBarNumCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFBarNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMaqCod") == 0 )
         {
            AV82TFBarMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFBarMaqCod", AV82TFBarMaqCod);
            AV83TFBarMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFBarMaqCod_Sel", AV83TFBarMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPie") == 0 )
         {
            AV84TFBarPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFBarPie), 6, 0));
            AV85TFBarPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgm") == 0 )
         {
            AV86TFBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarKgm", GXutil.ltrimstr( AV86TFBarKgm, 9, 2));
            AV87TFBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFBarKgm_To", GXutil.ltrimstr( AV87TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtr") == 0 )
         {
            AV88TFBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFBarMtr", GXutil.ltrimstr( AV88TFBarMtr, 9, 2));
            AV89TFBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFBarMtr_To", GXutil.ltrimstr( AV89TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAcaQui") == 0 )
         {
            AV90TFBarAcaQui = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFBarAcaQui", AV90TFBarAcaQui);
            AV91TFBarAcaQui_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarAcaQui_Sel", AV91TFBarAcaQui_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrEst") == 0 )
         {
            AV95TFBarAgrEst = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFBarAgrEst", AV95TFBarAgrEst);
            AV96TFBarAgrEst_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFBarAgrEst_Sel", AV96TFBarAgrEst_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarHayAlb") == 0 )
         {
            AV108TFBarHayAlb_Sel = (byte)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFBarHayAlb_Sel", GXutil.str( AV108TFBarHayAlb_Sel, 1, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e221QL2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         if ( 1 == 2 )
         {
            cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Piezas", ""), "fa fa-store", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Piezas v02", ""), "fa fa-store", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Procesos", ""), "fas fa-industry", "", "", "", "", "", "", ""), (short)(0));
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STDNOR", ""), GXv_int9) ;
         hojaderuta_trnww_impl.this.GXt_int8 = GXv_int9[0] ;
         AV60TempBoolean = (boolean)((GXt_int8==1)) ;
         if ( AV60TempBoolean )
         {
            cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Normas Estandares Textil", ""), "fa fa-shapes", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Notas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir HDR", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
         if ( 1 == 2 )
         {
            cmbavGridactions.addItem("10", GXutil.format( "%1;%2", httpContext.getMessage( "Programas de Tingimento", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREUNI", ""), GXv_int9) ;
         hojaderuta_trnww_impl.this.GXt_int8 = GXv_int9[0] ;
         AV60TempBoolean = (boolean)((GXt_int8==1)) ;
         if ( AV60TempBoolean )
         {
            cmbavGridactions.addItem("11", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar Precio", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("12", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         if ( ( A213BarSit == 1 ) && ( A1923BarCodTN == 1 ) && ( AV104Ensayos == 1 ) )
         {
            AV92F_color = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92F_color), 4, 0));
         }
         else if ( ( A213BarSit == 1 ) && ( A1923BarCodTN != 1 ) && ( AV104Ensayos == 1 ) )
         {
            AV92F_color = (short)(2) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92F_color), 4, 0));
         }
         else
         {
            AV92F_color = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92F_color), 4, 0));
         }
         if ( AV92F_color == 2 )
         {
            cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" );
            edtCliCod_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtCliNom_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarTipDis_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarSerDsc_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarNomCli_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarNumCli_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarSit_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarMaqCod_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarPie_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarKgm_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarMtr_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarAcaQui_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarAgrEst_Columnclass = "WWColumn WWColumnDanger" ;
            chkBarHayAlb.setColumnClass( "WWColumn WWColumnDanger" );
         }
         else if ( AV92F_color == 1 )
         {
            cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnInfo WWColumnInfoFirstColumn" );
            edtCliCod_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtCliNom_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarTipDis_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarSerDsc_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarNomCli_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarNumCli_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarSit_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarMaqCod_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarPie_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarKgm_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarMtr_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarAcaQui_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarAgrEst_Columnclass = "WWColumn WWColumnInfo" ;
            chkBarHayAlb.setColumnClass( "WWColumn WWColumnInfo" );
         }
         else if ( AV92F_color == 0 )
         {
            cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnGray WWColumnGrayFirstColumn" );
            edtCliCod_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtCliNom_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnGray" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnGray" ;
            edtBarTipDis_Columnclass = "WWColumn WWColumnGray" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarSerDsc_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarNomCli_Columnclass = "WWColumn WWColumnGray" ;
            edtBarNumCli_Columnclass = "WWColumn WWColumnGray" ;
            edtBarSit_Columnclass = "WWColumn WWColumnGray" ;
            edtBarMaqCod_Columnclass = "WWColumn WWColumnGray" ;
            edtBarPie_Columnclass = "WWColumn WWColumnGray" ;
            edtBarKgm_Columnclass = "WWColumn WWColumnGray" ;
            edtBarMtr_Columnclass = "WWColumn WWColumnGray" ;
            edtBarAcaQui_Columnclass = "WWColumn WWColumnGray" ;
            edtBarAgrEst_Columnclass = "WWColumn WWColumnGray" ;
            chkBarHayAlb.setColumnClass( "WWColumn WWColumnGray" );
         }
         else
         {
            cmbavGridactions.setColumnClass( httpContext.getMessage( "WWActionGroupColumn", "") );
            edtCliCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtCliNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtPedidoClie_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarNHdr_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarTipDis_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarFecGen_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarSer_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarSerDsc_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarColNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarColNum_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarNomCli_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarNumCli_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarSit_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarMaqCod_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarPie_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarKgm_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarMtr_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarAcaQui_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarAgrEst_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            chkBarHayAlb.setColumnClass( httpContext.getMessage( "WWColumn", "") );
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(99) ;
         }
         sendrow_992( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_99_Refreshing )
      {
         httpContext.doAjaxLoad(99, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV33GridActions, 4, 0)) );
   }

   public void e151QL2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV17ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV19ColumnsSelector.fromJSonString(AV17ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta_TRNWWColumnsSelector", ((GXutil.strcmp("", AV17ColumnsSelectorXML)==0) ? "" : AV19ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111QL2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("PedidosClienteSinDetalle.HojadeRuta_TRNWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV111Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("PedidosClienteSinDetalle.HojadeRuta_TRNWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV23ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta_TRNWWFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         hojaderuta_trnww_impl.this.GXt_char1 = GXv_char5[0] ;
         AV23ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV23ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV111Pgmname+"GridState", AV23ManageFiltersXml) ;
            AV10GridState.fromxml(AV23ManageFiltersXml, null, null);
            AV34OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
            AV12OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedDsc", AV12OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
   }

   public void e231QL2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV33GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 3 )
      {
         /* Execute user subroutine: 'DO PIEZAS' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 4 )
      {
         /* Execute user subroutine: 'DO PIEZASV02' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 5 )
      {
         /* Execute user subroutine: 'DO PROCESOS' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 6 )
      {
         /* Execute user subroutine: 'DO NORMAS' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 7 )
      {
         /* Execute user subroutine: 'DO NOTAS' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 8 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 9 )
      {
         /* Execute user subroutine: 'DO IMPRIMIRHDR' */
         S272 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 10 )
      {
         /* Execute user subroutine: 'DO PROGRAMATINTE' */
         S282 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 11 )
      {
         /* Execute user subroutine: 'DO MODIFICARPRECIO' */
         S292 ();
         if (returnInSub) return;
      }
      else if ( AV33GridActions == 12 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S302 ();
         if (returnInSub) return;
      }
      AV33GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV33GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e161QL2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S312 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e171QL2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char5[0] = AV15ExcelFilename ;
      GXv_char4[0] = AV16ErrorMessage ;
      new app.pedidosclientesindetalle.hojaderuta_trnwwexport(remoteHandle, context).execute( AV39EmprCod, AV97BarCodIN, AV98BarCodReoIN, AV99BarCodParIN, AV100BarFecGenfrom, AV101BarFecGento, AV102BarSitfrom, AV103BarSitto, GXv_char5, GXv_char4) ;
      hojaderuta_trnww_impl.this.AV15ExcelFilename = GXv_char5[0] ;
      hojaderuta_trnww_impl.this.AV16ErrorMessage = GXv_char4[0] ;
      if ( GXutil.strcmp(AV15ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV15ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV16ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e181QL2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trnwwexportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV97BarCodIN,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV98BarCodReoIN,1,0)),GXutil.URLEncode(GXutil.rtrim(AV99BarCodParIN)),GXutil.URLEncode(GXutil.formatDateParm(AV100BarFecGenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV101BarFecGento)),GXutil.URLEncode(GXutil.ltrimstr(AV102BarSitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV103BarSitto,2,0))}, new String[] {"Emprcod","BarCodIN","BarCodreoIN","BarCodparIN","BarFecGenfrom","BarFecGento","BarSitfrom","BarSitto"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV34OrderedBy, 4, 0))+":"+(AV12OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV19ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "CliCod", "", "Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "CliNom", "", "Nombre", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarNHdr", "", "N° Hdr", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarTipDis", "", "Tipo", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarFecGen", "", "Fecha Creacion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarSer", "", "Articulo", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarSerDsc", "", "Descripcion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarColNom", "", "Color", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarColNum", "", "Numero", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarNomCli", "", "Color Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarNumCli", "", "Numero ", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarSit", "", "St", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarMaqCod", "", "Maquina", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarPie", "", "Pzas.", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarKgm", "", "KIlos", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarMtr", "", "Metros", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarAcaQui", "", "Acs", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarAgrEst", "", "A?", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXv_SdtWWPColumnsSelector13[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, "BarHayAlb", "", "Albaran?", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      GXt_char1 = AV18UserCustomValue ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta_TRNWWColumnsSelector", GXv_char5) ;
      hojaderuta_trnww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV18UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV18UserCustomValue)==0) ) )
      {
         AV20ColumnsSelectorAux.fromxml(AV18UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector13, GXv_SdtWWPColumnsSelector14) ;
         AV20ColumnsSelectorAux = GXv_SdtWWPColumnsSelector13[0] ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = AV22ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta_TRNWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[0] ;
      AV22ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV14FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
      AV47TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFCliCod), 6, 0));
      AV48TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFCliCod_To), 6, 0));
      AV49TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFCliNom", AV49TFCliNom);
      AV50TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFCliNom_Sel", AV50TFCliNom_Sel);
      AV43TFPedidoCliente = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFPedidoCliente", AV43TFPedidoCliente);
      AV44TFPedidoCliente_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFPedidoCliente_Sel", AV44TFPedidoCliente_Sel);
      AV76TFBarTipDis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFBarTipDis", AV76TFBarTipDis);
      AV77TFBarTipDis_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFBarTipDis_Sel", AV77TFBarTipDis_Sel);
      AV51TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFBarSer", AV51TFBarSer);
      AV52TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFBarSer_Sel", AV52TFBarSer_Sel);
      AV53TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarSerDsc", AV53TFBarSerDsc);
      AV54TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarSerDsc_Sel", AV54TFBarSerDsc_Sel);
      AV55TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarColNom", AV55TFBarColNom);
      AV56TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarColNom_Sel", AV56TFBarColNom_Sel);
      AV57TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarColNum), 6, 0));
      AV58TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarColNum_To), 6, 0));
      AV78TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TFBarNomCli", AV78TFBarNomCli);
      AV79TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFBarNomCli_Sel", AV79TFBarNomCli_Sel);
      AV80TFBarNumCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFBarNumCli), 6, 0));
      AV81TFBarNumCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFBarNumCli_To), 6, 0));
      AV82TFBarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFBarMaqCod", AV82TFBarMaqCod);
      AV83TFBarMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFBarMaqCod_Sel", AV83TFBarMaqCod_Sel);
      AV84TFBarPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFBarPie), 6, 0));
      AV85TFBarPie_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarPie_To), 6, 0));
      AV86TFBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarKgm", GXutil.ltrimstr( AV86TFBarKgm, 9, 2));
      AV87TFBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFBarKgm_To", GXutil.ltrimstr( AV87TFBarKgm_To, 9, 2));
      AV88TFBarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFBarMtr", GXutil.ltrimstr( AV88TFBarMtr, 9, 2));
      AV89TFBarMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFBarMtr_To", GXutil.ltrimstr( AV89TFBarMtr_To, 9, 2));
      AV90TFBarAcaQui = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFBarAcaQui", AV90TFBarAcaQui);
      AV91TFBarAcaQui_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarAcaQui_Sel", AV91TFBarAcaQui_Sel);
      AV95TFBarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFBarAgrEst", AV95TFBarAgrEst);
      AV96TFBarAgrEst_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96TFBarAgrEst_Sel", AV96TFBarAgrEst_Sel);
      AV108TFBarHayAlb_Sel = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108TFBarHayAlb_Sel", GXutil.str( AV108TFBarHayAlb_Sel, 1, 0));
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
      callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( A213BarSit >= 9 )
      {
         callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S212( )
   {
      /* 'DO PIEZAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta__piezas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A228BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(A864BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A198BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A166BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(A184BarMtr)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","Discod","BarUniMed","BarPes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S222( )
   {
      /* 'DO PIEZASV02' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta___piezas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A228BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(A864BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A198BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A166BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(A184BarMtr)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(A120BarAgrEst))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","Discod","BarUniMed","BarPes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrEst","Hayrec"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO PROCESOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta__procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A3594BarPriTin,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A2265BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A228BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(A864BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A198BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A166BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(A184BarMtr)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(A120BarAgrEst))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Discod","BarSit","BarExt","CliCod","Barunimed","Barpes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrEst"}) , new Object[] {});
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
      /* 'DO NOTAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tnotashdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A198BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A166BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(A184BarMtr)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","DisCod","CliCod","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S262( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      System.out.println( httpContext.getMessage( "Do Observaciones", "") );
      System.out.println( localUtil.format( A159BarFecGen, "99/99/99") );
      httpContext.popup(formatLink("app.pedidos.disobs__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A209BarPri)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.formatDateParm(A159BarFecGen))}, new String[] {"Mode","EmprCod","DisCod","PriCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S272( )
   {
      /* 'DO IMPRIMIRHDR' Routine */
      returnInSub = false ;
      if ( AV59moda21 == 1 )
      {
         httpContext.popup(formatLink("app.rhdrmod", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV61ImpCod)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definiri el formato¡", ""));
      }
   }

   public void S282( )
   {
      /* 'DO PROGRAMATINTE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.facturacion.programasdetingimento_1ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom))}, new String[] {"Emprcod","CliCod","CliNom"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S292( )
   {
      /* 'DO MODIFICARPRECIO' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.almacensindetalle.preciounico_wp", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A5253BarAcc))}, new String[] {"Mode","Emprcod","Discod","Baracc"}) , new Object[] {"A396EmprCod","A361DisCod","A5253BarAcc"});
      httpContext.doAjaxRefresh();
   }

   public void S302( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( A14502BarHayAlb == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion, hay Albaran de Produccion ¡¡", ""));
      }
      else
      {
         if ( ( A213BarSit == 1 ) || ( A213BarSit == 2 ) )
         {
            Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Desea eliminar el Nº Hdr ", "")+GXutil.str( A129BarCod, 8, 0)+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar+" ?" ;
            ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
            AV113Emprcod_selected = A396EmprCod ;
            AV114Barcod_selected = A129BarCod ;
            AV115Barcodreo_selected = A132BarCodReo ;
            AV116Barcodpar_selected = A130BarCodPar ;
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "La situacion de la Hdr, ", "")+GXutil.str( A213BarSit, 2, 0)+httpContext.getMessage( " no permite su eliminacion", ""));
         }
      }
   }

   public void S312( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char5[0] = AV39EmprCod ;
      GXv_int17[0] = A129BarCod ;
      GXv_int9[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_int18[0] = A361DisCod ;
      new app.pbordis(remoteHandle, context).execute( GXv_char5, GXv_int17, GXv_int9, GXv_char4, GXv_int18) ;
      hojaderuta_trnww_impl.this.AV39EmprCod = GXv_char5[0] ;
      hojaderuta_trnww_impl.this.A129BarCod = GXv_int17[0] ;
      hojaderuta_trnww_impl.this.A132BarCodReo = GXv_int9[0] ;
      hojaderuta_trnww_impl.this.A130BarCodPar = GXv_char4[0] ;
      hojaderuta_trnww_impl.this.A361DisCod = GXv_int18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39EmprCod", AV39EmprCod);
      AV75Inc_obs = httpContext.getMessage( "->Eliminacion Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( AV39EmprCod, AV111Pgmname, AV42UsurCod, AV40Station, AV75Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue(AV111Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV111Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV21Session.getValue(AV111Pgmname+"GridState"), null, null);
      }
      AV34OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
      AV12OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedDsc", AV12OrderedDsc);
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
      AV117GXV1 = 1 ;
      while ( AV117GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV117GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV14FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV47TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFCliCod), 6, 0));
            AV48TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV49TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFCliNom", AV49TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV50TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFCliNom_Sel", AV50TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV43TFPedidoCliente = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPedidoCliente", AV43TFPedidoCliente);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV44TFPedidoCliente_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPedidoCliente_Sel", AV44TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPDIS") == 0 )
         {
            AV76TFBarTipDis = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFBarTipDis", AV76TFBarTipDis);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPDIS_SEL") == 0 )
         {
            AV77TFBarTipDis_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFBarTipDis_Sel", AV77TFBarTipDis_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV51TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFBarSer", AV51TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV52TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFBarSer_Sel", AV52TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV53TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarSerDsc", AV53TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV54TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarSerDsc_Sel", AV54TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV55TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarColNom", AV55TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV56TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarColNom_Sel", AV56TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV57TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarColNum), 6, 0));
            AV58TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV78TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFBarNomCli", AV78TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV79TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFBarNomCli_Sel", AV79TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV80TFBarNumCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFBarNumCli), 6, 0));
            AV81TFBarNumCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFBarNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV82TFBarMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFBarMaqCod", AV82TFBarMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV83TFBarMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFBarMaqCod_Sel", AV83TFBarMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV84TFBarPie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFBarPie), 6, 0));
            AV85TFBarPie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFBarPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV86TFBarKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarKgm", GXutil.ltrimstr( AV86TFBarKgm, 9, 2));
            AV87TFBarKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFBarKgm_To", GXutil.ltrimstr( AV87TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV88TFBarMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFBarMtr", GXutil.ltrimstr( AV88TFBarMtr, 9, 2));
            AV89TFBarMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFBarMtr_To", GXutil.ltrimstr( AV89TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI") == 0 )
         {
            AV90TFBarAcaQui = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFBarAcaQui", AV90TFBarAcaQui);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI_SEL") == 0 )
         {
            AV91TFBarAcaQui_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarAcaQui_Sel", AV91TFBarAcaQui_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV95TFBarAgrEst = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFBarAgrEst", AV95TFBarAgrEst);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV96TFBarAgrEst_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFBarAgrEst_Sel", AV96TFBarAgrEst_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARHAYALB_SEL") == 0 )
         {
            AV108TFBarHayAlb_Sel = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFBarHayAlb_Sel", GXutil.str( AV108TFBarHayAlb_Sel, 1, 0));
         }
         AV117GXV1 = (int)(AV117GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFCliNom_Sel)==0), AV50TFCliNom_Sel, GXv_char5) ;
      hojaderuta_trnww_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFPedidoCliente_Sel)==0), AV44TFPedidoCliente_Sel, GXv_char4) ;
      hojaderuta_trnww_impl.this.GXt_char19 = GXv_char4[0] ;
      GXt_char20 = "" ;
      GXv_char3[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFBarTipDis_Sel)==0), AV77TFBarTipDis_Sel, GXv_char3) ;
      hojaderuta_trnww_impl.this.GXt_char20 = GXv_char3[0] ;
      GXt_char21 = "" ;
      GXv_char2[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFBarSer_Sel)==0), AV52TFBarSer_Sel, GXv_char2) ;
      hojaderuta_trnww_impl.this.GXt_char21 = GXv_char2[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFBarSerDsc_Sel)==0), AV54TFBarSerDsc_Sel, GXv_char23) ;
      hojaderuta_trnww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFBarColNom_Sel)==0), AV56TFBarColNom_Sel, GXv_char25) ;
      hojaderuta_trnww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFBarNomCli_Sel)==0), AV79TFBarNomCli_Sel, GXv_char27) ;
      hojaderuta_trnww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFBarMaqCod_Sel)==0), AV83TFBarMaqCod_Sel, GXv_char29) ;
      hojaderuta_trnww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV91TFBarAcaQui_Sel)==0), AV91TFBarAcaQui_Sel, GXv_char31) ;
      hojaderuta_trnww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV96TFBarAgrEst_Sel)==0), AV96TFBarAgrEst_Sel, GXv_char33) ;
      hojaderuta_trnww_impl.this.GXt_char32 = GXv_char33[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char19+"||"+GXt_char20+"||"+GXt_char21+"|"+GXt_char22+"|"+GXt_char24+"||"+GXt_char26+"|||"+GXt_char28+"||||"+GXt_char30+"|"+GXt_char32+"|"+((0==AV108TFBarHayAlb_Sel) ? "" : GXutil.str( AV108TFBarHayAlb_Sel, 1, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFCliNom)==0), AV49TFCliNom, GXv_char33) ;
      hojaderuta_trnww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFPedidoCliente)==0), AV43TFPedidoCliente, GXv_char31) ;
      hojaderuta_trnww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFBarTipDis)==0), AV76TFBarTipDis, GXv_char29) ;
      hojaderuta_trnww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFBarSer)==0), AV51TFBarSer, GXv_char27) ;
      hojaderuta_trnww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFBarSerDsc)==0), AV53TFBarSerDsc, GXv_char25) ;
      hojaderuta_trnww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFBarColNom)==0), AV55TFBarColNom, GXv_char23) ;
      hojaderuta_trnww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char21 = "" ;
      GXv_char5[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFBarNomCli)==0), AV78TFBarNomCli, GXv_char5) ;
      hojaderuta_trnww_impl.this.GXt_char21 = GXv_char5[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFBarMaqCod)==0), AV82TFBarMaqCod, GXv_char4) ;
      hojaderuta_trnww_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFBarAcaQui)==0), AV90TFBarAcaQui, GXv_char3) ;
      hojaderuta_trnww_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV95TFBarAgrEst)==0), AV95TFBarAgrEst, GXv_char2) ;
      hojaderuta_trnww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV47TFCliCod) ? "" : GXutil.str( AV47TFCliCod, 6, 0))+"|"+GXt_char32+"|"+GXt_char30+"||"+GXt_char28+"||"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+((0==AV57TFBarColNum) ? "" : GXutil.str( AV57TFBarColNum, 6, 0))+"|"+GXt_char21+"|"+((0==AV80TFBarNumCli) ? "" : GXutil.str( AV80TFBarNumCli, 6, 0))+"||"+GXt_char20+"|"+((0==AV84TFBarPie) ? "" : GXutil.str( AV84TFBarPie, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFBarKgm)==0) ? "" : GXutil.str( AV86TFBarKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFBarMtr)==0) ? "" : GXutil.str( AV88TFBarMtr, 9, 2))+"|"+GXt_char19+"|"+GXt_char1+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV48TFCliCod_To) ? "" : GXutil.str( AV48TFCliCod_To, 6, 0))+"|||||||||"+((0==AV58TFBarColNum_To) ? "" : GXutil.str( AV58TFBarColNum_To, 6, 0))+"||"+((0==AV81TFBarNumCli_To) ? "" : GXutil.str( AV81TFBarNumCli_To, 6, 0))+"|||"+((0==AV85TFBarPie_To) ? "" : GXutil.str( AV85TFBarPie_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFBarKgm_To)==0) ? "" : GXutil.str( AV87TFBarKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFBarMtr_To)==0) ? "" : GXutil.str( AV89TFBarMtr_To, 9, 2))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV21Session.getValue(AV111Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV34OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV12OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState34, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV14FilterFullText)==0), (short)(0), AV14FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFCLICOD", "", !((0==AV47TFCliCod)&&(0==AV48TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV47TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV48TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFCLINOM", "", !(GXutil.strcmp("", AV49TFCliNom)==0), (short)(0), AV49TFCliNom, "", !(GXutil.strcmp("", AV50TFCliNom_Sel)==0), AV50TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFPEDIDOCLIENTE", "", !(GXutil.strcmp("", AV43TFPedidoCliente)==0), (short)(0), AV43TFPedidoCliente, "", !(GXutil.strcmp("", AV44TFPedidoCliente_Sel)==0), AV44TFPedidoCliente_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARTIPDIS", "", !(GXutil.strcmp("", AV76TFBarTipDis)==0), (short)(0), AV76TFBarTipDis, "", !(GXutil.strcmp("", AV77TFBarTipDis_Sel)==0), AV77TFBarTipDis_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARSER", "", !(GXutil.strcmp("", AV51TFBarSer)==0), (short)(0), AV51TFBarSer, "", !(GXutil.strcmp("", AV52TFBarSer_Sel)==0), AV52TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARSERDSC", "", !(GXutil.strcmp("", AV53TFBarSerDsc)==0), (short)(0), AV53TFBarSerDsc, "", !(GXutil.strcmp("", AV54TFBarSerDsc_Sel)==0), AV54TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV55TFBarColNom)==0), (short)(0), AV55TFBarColNom, "", !(GXutil.strcmp("", AV56TFBarColNom_Sel)==0), AV56TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARCOLNUM", "", !((0==AV57TFBarColNum)&&(0==AV58TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV58TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV78TFBarNomCli)==0), (short)(0), AV78TFBarNomCli, "", !(GXutil.strcmp("", AV79TFBarNomCli_Sel)==0), AV79TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARNUMCLI", "", !((0==AV80TFBarNumCli)&&(0==AV81TFBarNumCli_To)), (short)(0), GXutil.trim( GXutil.str( AV80TFBarNumCli, 6, 0)), GXutil.trim( GXutil.str( AV81TFBarNumCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARMAQCOD", "", !(GXutil.strcmp("", AV82TFBarMaqCod)==0), (short)(0), AV82TFBarMaqCod, "", !(GXutil.strcmp("", AV83TFBarMaqCod_Sel)==0), AV83TFBarMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARPIE", "", !((0==AV84TFBarPie)&&(0==AV85TFBarPie_To)), (short)(0), GXutil.trim( GXutil.str( AV84TFBarPie, 6, 0)), GXutil.trim( GXutil.str( AV85TFBarPie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV86TFBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV87TFBarKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV88TFBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV89TFBarMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARACAQUI", "", !(GXutil.strcmp("", AV90TFBarAcaQui)==0), (short)(0), AV90TFBarAcaQui, "", !(GXutil.strcmp("", AV91TFBarAcaQui_Sel)==0), AV91TFBarAcaQui_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARAGREST", "", !(GXutil.strcmp("", AV95TFBarAgrEst)==0), (short)(0), AV95TFBarAgrEst, "", !(GXutil.strcmp("", AV96TFBarAgrEst_Sel)==0), AV96TFBarAgrEst_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      GXv_SdtWWPGridState34[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState34, "TFBARHAYALB_SEL", "", !(0==AV108TFBarHayAlb_Sel), (short)(0), GXutil.trim( GXutil.str( AV108TFBarHayAlb_Sel, 1, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState34[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV111Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV111Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PedidosClienteSinDetalle.HojadeRuta_TRN" );
      AV21Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e191QL2( )
   {
      /* Barcodin_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV97BarCodIN > 0 )
      {
         AV105websession.setValue(httpContext.getMessage( "VarBarCodIN", ""), GXutil.str( AV97BarCodIN, 8, 0));
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         AV100BarFecGenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100BarFecGenfrom", localUtil.format(AV100BarFecGenfrom, "99/99/99"));
         AV101BarFecGento = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101BarFecGento", localUtil.format(AV101BarFecGento, "99/99/99"));
         AV102BarSitfrom = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102BarSitfrom), 2, 0));
         AV103BarSitto = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarSitto), 2, 0));
      }
      else
      {
         AV100BarFecGenfrom = GXutil.dadd(GXutil.today( ),-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100BarFecGenfrom", localUtil.format(AV100BarFecGenfrom, "99/99/99"));
         AV101BarFecGento = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101BarFecGento", localUtil.format(AV101BarFecGento, "99/99/99"));
         AV102BarSitfrom = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102BarSitfrom), 2, 0));
         AV103BarSitto = (byte)(6) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarSitto), 2, 0));
      }
      /*  Sending Event outputs  */
   }

   public void wb_table2_148_1QL2( boolean wbgen )
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
         wb_table2_148_1QL2e( true) ;
      }
      else
      {
         wb_table2_148_1QL2e( false) ;
      }
   }

   public void wb_table1_81_1QL2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV22ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_86_1QL2( true) ;
      }
      else
      {
         wb_table3_86_1QL2( false) ;
      }
      return  ;
   }

   public void wb_table3_86_1QL2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_81_1QL2e( true) ;
      }
      else
      {
         wb_table1_81_1QL2e( false) ;
      }
   }

   public void wb_table3_86_1QL2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV14FilterFullText, GXutil.rtrim( localUtil.format( AV14FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_86_1QL2e( true) ;
      }
      else
      {
         wb_table3_86_1QL2e( false) ;
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
      pa1QL2( ) ;
      ws1QL2( ) ;
      we1QL2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116141665", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta_trnww.js", "?202682116141665", false, true);
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

   public void subsflControlProps_992( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_99_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_99_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_99_idx ;
      edtPedidoClie_Internalname = "PEDIDOCLIE_"+sGXsfl_99_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_99_idx ;
      edtBarTipDis_Internalname = "BARTIPDIS_"+sGXsfl_99_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_99_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_99_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_99_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_99_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_99_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_99_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_99_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_99_idx ;
      edtBarMaqCod_Internalname = "BARMAQCOD_"+sGXsfl_99_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_99_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_99_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_99_idx ;
      edtBarAcaQui_Internalname = "BARACAQUI_"+sGXsfl_99_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_99_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_99_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_99_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_99_idx ;
      chkBarAcc.setInternalname( "BARACC_"+sGXsfl_99_idx );
      edtE_Barser_Internalname = "E_BARSER_"+sGXsfl_99_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_99_idx ;
      edtBarUniMed_Internalname = "BARUNIMED_"+sGXsfl_99_idx ;
      edtBarPes_Internalname = "BARPES_"+sGXsfl_99_idx ;
      edtBarPri_Internalname = "BARPRI_"+sGXsfl_99_idx ;
      edtavF_color_Internalname = "vF_COLOR_"+sGXsfl_99_idx ;
      edtBarCodTN_Internalname = "BARCODTN_"+sGXsfl_99_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_99_idx ;
      chkBarHayAlb.setInternalname( "BARHAYALB_"+sGXsfl_99_idx );
   }

   public void subsflControlProps_fel_992( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_99_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_99_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_99_fel_idx ;
      edtPedidoClie_Internalname = "PEDIDOCLIE_"+sGXsfl_99_fel_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_99_fel_idx ;
      edtBarTipDis_Internalname = "BARTIPDIS_"+sGXsfl_99_fel_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_99_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_99_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_99_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_99_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_99_fel_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_99_fel_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_99_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_99_fel_idx ;
      edtBarMaqCod_Internalname = "BARMAQCOD_"+sGXsfl_99_fel_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_99_fel_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_99_fel_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_99_fel_idx ;
      edtBarAcaQui_Internalname = "BARACAQUI_"+sGXsfl_99_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_99_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_99_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_99_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_99_fel_idx ;
      chkBarAcc.setInternalname( "BARACC_"+sGXsfl_99_fel_idx );
      edtE_Barser_Internalname = "E_BARSER_"+sGXsfl_99_fel_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_99_fel_idx ;
      edtBarUniMed_Internalname = "BARUNIMED_"+sGXsfl_99_fel_idx ;
      edtBarPes_Internalname = "BARPES_"+sGXsfl_99_fel_idx ;
      edtBarPri_Internalname = "BARPRI_"+sGXsfl_99_fel_idx ;
      edtavF_color_Internalname = "vF_COLOR_"+sGXsfl_99_fel_idx ;
      edtBarCodTN_Internalname = "BARCODTN_"+sGXsfl_99_fel_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_99_fel_idx ;
      chkBarHayAlb.setInternalname( "BARHAYALB_"+sGXsfl_99_fel_idx );
   }

   public void sendrow_992( )
   {
      subsflControlProps_992( ) ;
      wb1QL0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_99_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_99_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_99_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_99_idx+"',99)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_99_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV33GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV33GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV33GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_99_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,100);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV33GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_99_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCod_Columnclass,edtCliCod_Columnheaderclass,Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliNom_Columnclass,edtCliNom_Columnheaderclass,Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPedidoClie_Columnclass,edtPedidoClie_Columnheaderclass,Integer.valueOf(edtPedidoClie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNHdr_Columnclass,edtBarNHdr_Columnheaderclass,Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarTipDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipDis_Internalname,GXutil.rtrim( A2010BarTipDis),GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarTipDis_Columnclass,edtBarTipDis_Columnheaderclass,Integer.valueOf(edtBarTipDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarFecGen_Columnclass,edtBarFecGen_Columnheaderclass,Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarSer_Columnclass,edtBarSer_Columnheaderclass,Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarSerDsc_Columnclass,edtBarSerDsc_Columnheaderclass,Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarColNom_Columnclass,edtBarColNom_Columnheaderclass,Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarColNum_Columnclass,edtBarColNum_Columnheaderclass,Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNomCli_Columnclass,edtBarNomCli_Columnheaderclass,Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarNumCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNumCli_Columnclass,edtBarNumCli_Columnheaderclass,Integer.valueOf(edtBarNumCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarSit_Columnclass,edtBarSit_Columnheaderclass,Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMaqCod_Internalname,GXutil.rtrim( A180BarMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarMaqCod_Columnclass,edtBarMaqCod_Columnheaderclass,Integer.valueOf(edtBarMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarPie_Columnclass,edtBarPie_Columnheaderclass,Integer.valueOf(edtBarPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarKgm_Columnclass,edtBarKgm_Columnheaderclass,Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarMtr_Columnclass,edtBarMtr_Columnheaderclass,Integer.valueOf(edtBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAcaQui_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAcaQui_Internalname,GXutil.rtrim( A118BarAcaQui),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAcaQui_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarAcaQui_Columnclass,edtBarAcaQui_Columnheaderclass,Integer.valueOf(edtBarAcaQui_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARACC_" + sGXsfl_99_idx ;
         chkBarAcc.setName( GXCCtl );
         chkBarAcc.setWebtags( "" );
         chkBarAcc.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "TitleCaption", chkBarAcc.getCaption(), !bGXsfl_99_Refreshing);
         chkBarAcc.setCheckedValue( "N" );
         A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarAcc.getInternalname(),A5253BarAcc,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtE_Barser_Internalname,GXutil.ltrim( localUtil.ntoc( A14007E_Barser, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14007E_Barser), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtE_Barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarUniMed_Internalname,GXutil.rtrim( A228BarUniMed),GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPes_Internalname,GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPri_Internalname,GXutil.rtrim( A209BarPri),GXutil.rtrim( localUtil.format( A209BarPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavF_color_Enabled!=0)&&(edtavF_color_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 129,'',false,'"+sGXsfl_99_idx+"',99)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavF_color_Internalname,GXutil.ltrim( localUtil.ntoc( AV92F_color, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavF_color_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV92F_color), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV92F_color), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavF_color_Enabled!=0)&&(edtavF_color_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavF_color_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavF_color_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodTN_Internalname,GXutil.ltrim( localUtil.ntoc( A1923BarCodTN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1923BarCodTN), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodTN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrEst_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrEst_Internalname,GXutil.rtrim( A120BarAgrEst),GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarAgrEst_Columnclass,edtBarAgrEst_Columnheaderclass,Integer.valueOf(edtBarAgrEst_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkBarHayAlb.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARHAYALB_" + sGXsfl_99_idx ;
         chkBarHayAlb.setName( GXCCtl );
         chkBarHayAlb.setWebtags( "" );
         chkBarHayAlb.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkBarHayAlb.getInternalname(), "TitleCaption", chkBarHayAlb.getCaption(), !bGXsfl_99_Refreshing);
         chkBarHayAlb.setCheckedValue( "0" );
         A14502BarHayAlb = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A14502BarHayAlb, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarHayAlb.getInternalname(),GXutil.str( A14502BarHayAlb, 1, 0),"","",Integer.valueOf(chkBarHayAlb.getVisible()),Integer.valueOf(0),"1","",StyleString,ClassString,chkBarHayAlb.getColumnClass(),chkBarHayAlb.getColumnHeaderClass(),""});
         send_integrity_lvl_hashes1QL2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_99_idx = ((subGrid_Islastpage==1)&&(nGXsfl_99_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_99_idx+1) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
      }
      /* End function sendrow_992 */
   }

   public void startgridcontrol99( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"99\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipDis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Creacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNumCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "St", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzas.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "KIlos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAcaQui_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acs", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrEst_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkBarHayAlb.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Albaran?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV33GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliNom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPedidoClie_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPedidoClie_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedidoClie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarNHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarNHdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2010BarTipDis));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarTipDis_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarTipDis_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipDis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFecGen_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFecGen_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecGen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarSer_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarSer_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarSerDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarSerDsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarColNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarColNom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarColNum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarColNum_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarNomCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarNomCli_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarNumCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarNumCli_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNumCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarSit_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarSit_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A180BarMaqCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarMaqCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarMaqCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarPie_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarPie_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarKgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarKgm_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarMtr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarMtr_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A118BarAcaQui));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarAcaQui_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarAcaQui_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAcaQui_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5253BarAcc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14007E_Barser, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A228BarUniMed));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A209BarPri));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV92F_color, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavF_color_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1923BarCodTN, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A120BarAgrEst));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarAgrEst_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarAgrEst_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrEst_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14502BarHayAlb, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkBarHayAlb.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkBarHayAlb.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkBarHayAlb.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      lblTextblockbarcodin_Internalname = "TEXTBLOCKBARCODIN" ;
      edtavBarcodin_Internalname = "vBARCODIN" ;
      divUnnamedtablebarcodin_Internalname = "UNNAMEDTABLEBARCODIN" ;
      lblTextblockbarcodreoin_Internalname = "TEXTBLOCKBARCODREOIN" ;
      edtavBarcodreoin_Internalname = "vBARCODREOIN" ;
      divUnnamedtablebarcodreoin_Internalname = "UNNAMEDTABLEBARCODREOIN" ;
      lblTextblockbarcodparin_Internalname = "TEXTBLOCKBARCODPARIN" ;
      edtavBarcodparin_Internalname = "vBARCODPARIN" ;
      divUnnamedtablebarcodparin_Internalname = "UNNAMEDTABLEBARCODPARIN" ;
      lblTextblockbarfecgenfrom_Internalname = "TEXTBLOCKBARFECGENFROM" ;
      edtavBarfecgenfrom_Internalname = "vBARFECGENFROM" ;
      divUnnamedtablebarfecgenfrom_Internalname = "UNNAMEDTABLEBARFECGENFROM" ;
      lblTextblockbarfecgento_Internalname = "TEXTBLOCKBARFECGENTO" ;
      edtavBarfecgento_Internalname = "vBARFECGENTO" ;
      divUnnamedtablebarfecgento_Internalname = "UNNAMEDTABLEBARFECGENTO" ;
      lblTextblockbarsitfrom_Internalname = "TEXTBLOCKBARSITFROM" ;
      edtavBarsitfrom_Internalname = "vBARSITFROM" ;
      divUnnamedtablebarsitfrom_Internalname = "UNNAMEDTABLEBARSITFROM" ;
      lblTextblockbarsitto_Internalname = "TEXTBLOCKBARSITTO" ;
      edtavBarsitto_Internalname = "vBARSITTO" ;
      divUnnamedtablebarsitto_Internalname = "UNNAMEDTABLEBARSITTO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtPedidoClie_Internalname = "PEDIDOCLIE" ;
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtBarTipDis_Internalname = "BARTIPDIS" ;
      edtBarFecGen_Internalname = "BARFECGEN" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtBarMaqCod_Internalname = "BARMAQCOD" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtBarKgm_Internalname = "BARKGM" ;
      edtBarMtr_Internalname = "BARMTR" ;
      edtBarAcaQui_Internalname = "BARACAQUI" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      chkBarAcc.setInternalname( "BARACC" );
      edtE_Barser_Internalname = "E_BARSER" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      edtBarPes_Internalname = "BARPES" ;
      edtBarPri_Internalname = "BARPRI" ;
      edtavF_color_Internalname = "vF_COLOR" ;
      edtBarCodTN_Internalname = "BARCODTN" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      chkBarHayAlb.setInternalname( "BARHAYALB" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      chkBarHayAlb.setCaption( "" );
      chkBarHayAlb.setColumnClass( "WWColumn" );
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Columnclass = "WWColumn" ;
      edtBarCodTN_Jsonclick = "" ;
      edtavF_color_Jsonclick = "" ;
      edtavF_color_Visible = 0 ;
      edtavF_color_Enabled = 1 ;
      edtBarPri_Jsonclick = "" ;
      edtBarPes_Jsonclick = "" ;
      edtBarUniMed_Jsonclick = "" ;
      edtDisCod_Jsonclick = "" ;
      edtE_Barser_Jsonclick = "" ;
      chkBarAcc.setCaption( "" );
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtBarAcaQui_Jsonclick = "" ;
      edtBarAcaQui_Columnclass = "WWColumn" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarMtr_Columnclass = "WWColumn" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarKgm_Columnclass = "WWColumn" ;
      edtBarPie_Jsonclick = "" ;
      edtBarPie_Columnclass = "WWColumn" ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarMaqCod_Columnclass = "WWColumn" ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Columnclass = "WWColumn" ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNumCli_Columnclass = "WWColumn" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Columnclass = "WWColumn" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Columnclass = "WWColumn hidden-xs" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Columnclass = "WWColumn hidden-xs" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Columnclass = "WWColumn hidden-xs" ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Columnclass = "WWColumn hidden-xs" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarFecGen_Columnclass = "WWColumn hidden-xs" ;
      edtBarTipDis_Jsonclick = "" ;
      edtBarTipDis_Columnclass = "WWColumn" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Columnclass = "WWColumn" ;
      edtPedidoClie_Jsonclick = "" ;
      edtPedidoClie_Columnclass = "WWColumn" ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Columnclass = "WWColumn hidden-xs" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Columnclass = "WWColumn hidden-xs" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkBarHayAlb.setColumnHeaderClass( "" );
      edtBarAgrEst_Columnheaderclass = "" ;
      edtBarAcaQui_Columnheaderclass = "" ;
      edtBarMtr_Columnheaderclass = "" ;
      edtBarKgm_Columnheaderclass = "" ;
      edtBarPie_Columnheaderclass = "" ;
      edtBarMaqCod_Columnheaderclass = "" ;
      edtBarSit_Columnheaderclass = "" ;
      edtBarNumCli_Columnheaderclass = "" ;
      edtBarNomCli_Columnheaderclass = "" ;
      edtBarColNum_Columnheaderclass = "" ;
      edtBarColNom_Columnheaderclass = "" ;
      edtBarSerDsc_Columnheaderclass = "" ;
      edtBarSer_Columnheaderclass = "" ;
      edtBarFecGen_Columnheaderclass = "" ;
      edtBarTipDis_Columnheaderclass = "" ;
      edtBarNHdr_Columnheaderclass = "" ;
      edtPedidoClie_Columnheaderclass = "" ;
      edtCliNom_Columnheaderclass = "" ;
      edtCliCod_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      chkBarHayAlb.setVisible( -1 );
      edtBarAgrEst_Visible = -1 ;
      edtBarAcaQui_Visible = -1 ;
      edtBarMtr_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtBarPie_Visible = -1 ;
      edtBarMaqCod_Visible = -1 ;
      edtBarSit_Visible = -1 ;
      edtBarNumCli_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtBarTipDis_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtPedidoClie_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarsitto_Jsonclick = "" ;
      edtavBarsitto_Enabled = 1 ;
      edtavBarsitfrom_Jsonclick = "" ;
      edtavBarsitfrom_Enabled = 1 ;
      edtavBarfecgento_Jsonclick = "" ;
      edtavBarfecgento_Enabled = 1 ;
      edtavBarfecgenfrom_Jsonclick = "" ;
      edtavBarfecgenfrom_Enabled = 1 ;
      edtavBarcodparin_Jsonclick = "" ;
      edtavBarcodparin_Enabled = 1 ;
      edtavBarcodreoin_Jsonclick = "" ;
      edtavBarcodreoin_Enabled = 1 ;
      edtavBarcodin_Jsonclick = "" ;
      edtavBarcodin_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la produccion?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "PedidosClienteSinDetalle.HojadeRuta_TRNWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||||||||1:WWP_TSChecked,2:WWP_TSUnChecked" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||Dynamic||Dynamic|Dynamic|Dynamic||Dynamic|||Dynamic||||Dynamic|Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "|T|T||T||T|T|T||T|||T||||T|T|T" ;
      Ddo_grid_Filterisrange = "T|||||||||T||T|||T|T|T|||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character||Character||Character|Character|Character|Numeric|Character|Numeric||Character|Numeric|Numeric|Numeric|Character|Character|" ;
      Ddo_grid_Includefilter = "T|T|T||T||T|T|T|T|T|T||T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T|T|T|T|T|T|T|T|T||||T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3||4|5|6|7|8|9|10|11|12|13|14||||15|16|" ;
      Ddo_grid_Columnids = "1:CliCod|2:CliNom|3:PedidoCliente|4:BarNHdr|5:BarTipDis|6:BarFecGen|7:BarSer|8:BarSerDsc|9:BarColNom|10:BarColNum|11:BarNomCli|12:BarNumCli|13:BarSit|14:BarMaqCod|15:BarPie|16:BarKgm|17:BarMtr|18:BarAcaQui|31:BarAgrEst|32:BarHayAlb" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Hoja de Ruta", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_99_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV33GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV33GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridActions), 4, 0));
      }
      GXCCtl = "BARACC_" + sGXsfl_99_idx ;
      chkBarAcc.setName( GXCCtl );
      chkBarAcc.setWebtags( "" );
      chkBarAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "TitleCaption", chkBarAcc.getCaption(), !bGXsfl_99_Refreshing);
      chkBarAcc.setCheckedValue( "N" );
      A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
      GXCCtl = "BARHAYALB_" + sGXsfl_99_idx ;
      chkBarHayAlb.setName( GXCCtl );
      chkBarHayAlb.setWebtags( "" );
      chkBarHayAlb.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarHayAlb.getInternalname(), "TitleCaption", chkBarHayAlb.getCaption(), !bGXsfl_99_Refreshing);
      chkBarHayAlb.setCheckedValue( "0" );
      A14502BarHayAlb = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A14502BarHayAlb, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV42UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV40Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipDis_Visible',ctrl:'BARTIPDIS',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkBarHayAlb.getVisible()',ctrl:'BARHAYALB',prop:'Visible'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarTipDis_Columnheaderclass',ctrl:'BARTIPDIS',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarNomCli_Columnheaderclass',ctrl:'BARNOMCLI',prop:'Columnheaderclass'},{av:'edtBarNumCli_Columnheaderclass',ctrl:'BARNUMCLI',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarPie_Columnheaderclass',ctrl:'BARPIE',prop:'Columnheaderclass'},{av:'edtBarKgm_Columnheaderclass',ctrl:'BARKGM',prop:'Columnheaderclass'},{av:'edtBarMtr_Columnheaderclass',ctrl:'BARMTR',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkBarHayAlb.getColumnHeaderClass()',ctrl:'BARHAYALB',prop:'Columnheaderclass'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121QL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV42UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV40Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131QL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV42UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV40Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141QL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV42UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV40Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221QL2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9',hsh:true},{av:'A1923BarCodTN',fld:'BARCODTN',pic:'ZZZZZ9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV33GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV92F_color',fld:'vF_COLOR',pic:'ZZZ9'},{av:'edtCliCod_Columnclass',ctrl:'CLICOD',prop:'Columnclass'},{av:'edtCliNom_Columnclass',ctrl:'CLINOM',prop:'Columnclass'},{av:'edtPedidoClie_Columnclass',ctrl:'PEDIDOCLIE',prop:'Columnclass'},{av:'edtBarNHdr_Columnclass',ctrl:'BARNHDR',prop:'Columnclass'},{av:'edtBarTipDis_Columnclass',ctrl:'BARTIPDIS',prop:'Columnclass'},{av:'edtBarFecGen_Columnclass',ctrl:'BARFECGEN',prop:'Columnclass'},{av:'edtBarSer_Columnclass',ctrl:'BARSER',prop:'Columnclass'},{av:'edtBarSerDsc_Columnclass',ctrl:'BARSERDSC',prop:'Columnclass'},{av:'edtBarColNom_Columnclass',ctrl:'BARCOLNOM',prop:'Columnclass'},{av:'edtBarColNum_Columnclass',ctrl:'BARCOLNUM',prop:'Columnclass'},{av:'edtBarNomCli_Columnclass',ctrl:'BARNOMCLI',prop:'Columnclass'},{av:'edtBarNumCli_Columnclass',ctrl:'BARNUMCLI',prop:'Columnclass'},{av:'edtBarSit_Columnclass',ctrl:'BARSIT',prop:'Columnclass'},{av:'edtBarMaqCod_Columnclass',ctrl:'BARMAQCOD',prop:'Columnclass'},{av:'edtBarPie_Columnclass',ctrl:'BARPIE',prop:'Columnclass'},{av:'edtBarKgm_Columnclass',ctrl:'BARKGM',prop:'Columnclass'},{av:'edtBarMtr_Columnclass',ctrl:'BARMTR',prop:'Columnclass'},{av:'edtBarAcaQui_Columnclass',ctrl:'BARACAQUI',prop:'Columnclass'},{av:'edtBarAgrEst_Columnclass',ctrl:'BARAGREST',prop:'Columnclass'},{av:'chkBarHayAlb.getColumnClass()',ctrl:'BARHAYALB',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151QL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV42UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV40Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipDis_Visible',ctrl:'BARTIPDIS',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkBarHayAlb.getVisible()',ctrl:'BARHAYALB',prop:'Visible'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarTipDis_Columnheaderclass',ctrl:'BARTIPDIS',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarNomCli_Columnheaderclass',ctrl:'BARNOMCLI',prop:'Columnheaderclass'},{av:'edtBarNumCli_Columnheaderclass',ctrl:'BARNUMCLI',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarPie_Columnheaderclass',ctrl:'BARPIE',prop:'Columnheaderclass'},{av:'edtBarKgm_Columnheaderclass',ctrl:'BARKGM',prop:'Columnheaderclass'},{av:'edtBarMtr_Columnheaderclass',ctrl:'BARMTR',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkBarHayAlb.getColumnHeaderClass()',ctrl:'BARHAYALB',prop:'Columnheaderclass'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111QL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV42UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV40Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipDis_Visible',ctrl:'BARTIPDIS',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkBarHayAlb.getVisible()',ctrl:'BARHAYALB',prop:'Visible'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarTipDis_Columnheaderclass',ctrl:'BARTIPDIS',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarNomCli_Columnheaderclass',ctrl:'BARNOMCLI',prop:'Columnheaderclass'},{av:'edtBarNumCli_Columnheaderclass',ctrl:'BARNUMCLI',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarPie_Columnheaderclass',ctrl:'BARPIE',prop:'Columnheaderclass'},{av:'edtBarKgm_Columnheaderclass',ctrl:'BARKGM',prop:'Columnheaderclass'},{av:'edtBarMtr_Columnheaderclass',ctrl:'BARMTR',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkBarHayAlb.getColumnHeaderClass()',ctrl:'BARHAYALB',prop:'Columnheaderclass'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e231QL2',iparms:[{av:'cmbavGridactions'},{av:'AV33GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV42UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV40Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!',hsh:true},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9',hsh:true},{av:'A212BarSer',fld:'BARSER',pic:'',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:'',hsh:true},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9',hsh:true},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:'',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!',hsh:true},{av:'A159BarFecGen',fld:'BARFECGEN',pic:'',hsh:true},{av:'A209BarPri',fld:'BARPRI',pic:'9',hsh:true},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A14502BarHayAlb',fld:'BARHAYALB',pic:'9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV33GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipDis_Visible',ctrl:'BARTIPDIS',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkBarHayAlb.getVisible()',ctrl:'BARHAYALB',prop:'Visible'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarTipDis_Columnheaderclass',ctrl:'BARTIPDIS',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarNomCli_Columnheaderclass',ctrl:'BARNOMCLI',prop:'Columnheaderclass'},{av:'edtBarNumCli_Columnheaderclass',ctrl:'BARNUMCLI',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarPie_Columnheaderclass',ctrl:'BARPIE',prop:'Columnheaderclass'},{av:'edtBarKgm_Columnheaderclass',ctrl:'BARKGM',prop:'Columnheaderclass'},{av:'edtBarMtr_Columnheaderclass',ctrl:'BARMTR',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkBarHayAlb.getColumnHeaderClass()',ctrl:'BARHAYALB',prop:'Columnheaderclass'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e161QL2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV42UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV40Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'AV39EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV39EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipDis_Visible',ctrl:'BARTIPDIS',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkBarHayAlb.getVisible()',ctrl:'BARHAYALB',prop:'Visible'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarTipDis_Columnheaderclass',ctrl:'BARTIPDIS',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarNomCli_Columnheaderclass',ctrl:'BARNOMCLI',prop:'Columnheaderclass'},{av:'edtBarNumCli_Columnheaderclass',ctrl:'BARNUMCLI',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarPie_Columnheaderclass',ctrl:'BARPIE',prop:'Columnheaderclass'},{av:'edtBarKgm_Columnheaderclass',ctrl:'BARKGM',prop:'Columnheaderclass'},{av:'edtBarMtr_Columnheaderclass',ctrl:'BARMTR',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkBarHayAlb.getColumnHeaderClass()',ctrl:'BARHAYALB',prop:'Columnheaderclass'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171QL2',iparms:[{av:'AV39EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV42UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV40Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181QL2',iparms:[{av:'AV39EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV98BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV99BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'AV104Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV42UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV40Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VBARCODIN.CONTROLVALUECHANGED","{handler:'e191QL2',iparms:[{av:'AV97BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VBARCODIN.CONTROLVALUECHANGED",",oparms:[{av:'AV100BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV101BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV102BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV103BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV48TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV49TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV50TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV76TFBarTipDis',fld:'vTFBARTIPDIS',pic:'@!'},{av:'AV77TFBarTipDis_Sel',fld:'vTFBARTIPDIS_SEL',pic:'@!'},{av:'AV51TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV52TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV53TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV54TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV79TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV80TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV81TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV82TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV83TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV84TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV85TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV86TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV87TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV88TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV89TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV91TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV95TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV96TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV108TFBarHayAlb_Sel',fld:'vTFBARHAYALB_SEL',pic:'9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARNHDR","{handler:'valid_Barnhdr',iparms:[]");
      setEventMetadata("VALID_BARNHDR",",oparms:[]}");
      setEventMetadata("VALID_BARTIPDIS","{handler:'valid_Bartipdis',iparms:[]");
      setEventMetadata("VALID_BARTIPDIS",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARNOMCLI","{handler:'valid_Barnomcli',iparms:[]");
      setEventMetadata("VALID_BARNOMCLI",",oparms:[]}");
      setEventMetadata("VALID_BARNUMCLI","{handler:'valid_Barnumcli',iparms:[]");
      setEventMetadata("VALID_BARNUMCLI",",oparms:[]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
      setEventMetadata("VALID_BARMAQCOD","{handler:'valid_Barmaqcod',iparms:[]");
      setEventMetadata("VALID_BARMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_BARPIE","{handler:'valid_Barpie',iparms:[]");
      setEventMetadata("VALID_BARPIE",",oparms:[]}");
      setEventMetadata("VALID_BARKGM","{handler:'valid_Barkgm',iparms:[]");
      setEventMetadata("VALID_BARKGM",",oparms:[]}");
      setEventMetadata("VALID_BARMTR","{handler:'valid_Barmtr',iparms:[]");
      setEventMetadata("VALID_BARMTR",",oparms:[]}");
      setEventMetadata("VALID_BARACAQUI","{handler:'valid_Baracaqui',iparms:[]");
      setEventMetadata("VALID_BARACAQUI",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARAGREST","{handler:'valid_Baragrest',iparms:[]");
      setEventMetadata("VALID_BARAGREST",",oparms:[]}");
      setEventMetadata("VALID_BARHAYALB","{handler:'valid_Barhayalb',iparms:[]");
      setEventMetadata("VALID_BARHAYALB",",oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV99BarCodParIN = "" ;
      AV100BarFecGenfrom = GXutil.nullDate() ;
      AV101BarFecGento = GXutil.nullDate() ;
      AV14FilterFullText = "" ;
      AV19ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV111Pgmname = "" ;
      AV49TFCliNom = "" ;
      AV50TFCliNom_Sel = "" ;
      AV43TFPedidoCliente = "" ;
      AV44TFPedidoCliente_Sel = "" ;
      AV76TFBarTipDis = "" ;
      AV77TFBarTipDis_Sel = "" ;
      AV51TFBarSer = "" ;
      AV52TFBarSer_Sel = "" ;
      AV53TFBarSerDsc = "" ;
      AV54TFBarSerDsc_Sel = "" ;
      AV55TFBarColNom = "" ;
      AV56TFBarColNom_Sel = "" ;
      AV78TFBarNomCli = "" ;
      AV79TFBarNomCli_Sel = "" ;
      AV82TFBarMaqCod = "" ;
      AV83TFBarMaqCod_Sel = "" ;
      AV86TFBarKgm = DecimalUtil.ZERO ;
      AV87TFBarKgm_To = DecimalUtil.ZERO ;
      AV88TFBarMtr = DecimalUtil.ZERO ;
      AV89TFBarMtr_To = DecimalUtil.ZERO ;
      AV90TFBarAcaQui = "" ;
      AV91TFBarAcaQui_Sel = "" ;
      AV95TFBarAgrEst = "" ;
      AV96TFBarAgrEst_Sel = "" ;
      Gx_mode = "" ;
      AV61ImpCod = "" ;
      AV42UsurCod = "" ;
      AV40Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV22ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV29DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39EmprCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
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
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      lblTextblockbarcodin_Jsonclick = "" ;
      lblTextblockbarcodreoin_Jsonclick = "" ;
      lblTextblockbarcodparin_Jsonclick = "" ;
      lblTextblockbarfecgenfrom_Jsonclick = "" ;
      lblTextblockbarfecgento_Jsonclick = "" ;
      lblTextblockbarsitfrom_Jsonclick = "" ;
      lblTextblockbarsitto_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A2010BarTipDis = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A180BarMaqCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A118BarAcaQui = "" ;
      A130BarCodPar = "" ;
      A5253BarAcc = "" ;
      A228BarUniMed = "" ;
      A209BarPri = "" ;
      A120BarAgrEst = "" ;
      scmdbuf = "" ;
      lV14FilterFullText = "" ;
      lV49TFCliNom = "" ;
      lV76TFBarTipDis = "" ;
      lV51TFBarSer = "" ;
      lV53TFBarSerDsc = "" ;
      lV55TFBarColNom = "" ;
      lV78TFBarNomCli = "" ;
      lV82TFBarMaqCod = "" ;
      lV90TFBarAcaQui = "" ;
      lV95TFBarAgrEst = "" ;
      H01QL3_A3594BarPriTin = new byte[1] ;
      H01QL3_A2265BarExt = new byte[1] ;
      H01QL3_n2265BarExt = new boolean[] {false} ;
      H01QL3_A120BarAgrEst = new String[] {""} ;
      H01QL3_A1923BarCodTN = new int[1] ;
      H01QL3_A209BarPri = new String[] {""} ;
      H01QL3_A864BarPes = new short[1] ;
      H01QL3_A228BarUniMed = new String[] {""} ;
      H01QL3_A361DisCod = new int[1] ;
      H01QL3_A5253BarAcc = new String[] {""} ;
      H01QL3_A118BarAcaQui = new String[] {""} ;
      H01QL3_A180BarMaqCod = new String[] {""} ;
      H01QL3_A213BarSit = new byte[1] ;
      H01QL3_A1235BarNumCli = new int[1] ;
      H01QL3_A1234BarNomCli = new String[] {""} ;
      H01QL3_A136BarColNum = new int[1] ;
      H01QL3_A135BarColNom = new String[] {""} ;
      H01QL3_A1652BarSerDsc = new String[] {""} ;
      H01QL3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01QL3_A2010BarTipDis = new String[] {""} ;
      H01QL3_A13696BarNHdr = new String[] {""} ;
      H01QL3_A279CliNom = new String[] {""} ;
      H01QL3_A396EmprCod = new String[] {""} ;
      H01QL3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QL3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QL3_A143BarDisNum = new String[] {""} ;
      H01QL3_A4812BarEncCli = new String[] {""} ;
      H01QL3_A199BarPie1 = new short[1] ;
      H01QL3_A365DisDes = new String[] {""} ;
      H01QL3_A898BarPieNDes = new int[1] ;
      H01QL3_A212BarSer = new String[] {""} ;
      H01QL3_A252CliCod = new int[1] ;
      H01QL3_n252CliCod = new boolean[] {false} ;
      H01QL3_A130BarCodPar = new String[] {""} ;
      H01QL3_A132BarCodReo = new byte[1] ;
      H01QL3_A129BarCod = new int[1] ;
      H01QL5_A3594BarPriTin = new byte[1] ;
      H01QL5_A2265BarExt = new byte[1] ;
      H01QL5_n2265BarExt = new boolean[] {false} ;
      H01QL5_A120BarAgrEst = new String[] {""} ;
      H01QL5_A1923BarCodTN = new int[1] ;
      H01QL5_A209BarPri = new String[] {""} ;
      H01QL5_A864BarPes = new short[1] ;
      H01QL5_A228BarUniMed = new String[] {""} ;
      H01QL5_A361DisCod = new int[1] ;
      H01QL5_A5253BarAcc = new String[] {""} ;
      H01QL5_A118BarAcaQui = new String[] {""} ;
      H01QL5_A180BarMaqCod = new String[] {""} ;
      H01QL5_A213BarSit = new byte[1] ;
      H01QL5_A1235BarNumCli = new int[1] ;
      H01QL5_A1234BarNomCli = new String[] {""} ;
      H01QL5_A136BarColNum = new int[1] ;
      H01QL5_A135BarColNom = new String[] {""} ;
      H01QL5_A1652BarSerDsc = new String[] {""} ;
      H01QL5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01QL5_A2010BarTipDis = new String[] {""} ;
      H01QL5_A13696BarNHdr = new String[] {""} ;
      H01QL5_A279CliNom = new String[] {""} ;
      H01QL5_A396EmprCod = new String[] {""} ;
      H01QL5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QL5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QL5_A143BarDisNum = new String[] {""} ;
      H01QL5_A4812BarEncCli = new String[] {""} ;
      H01QL5_A199BarPie1 = new short[1] ;
      H01QL5_A365DisDes = new String[] {""} ;
      H01QL5_A898BarPieNDes = new int[1] ;
      H01QL5_A212BarSer = new String[] {""} ;
      H01QL5_A252CliCod = new int[1] ;
      H01QL5_n252CliCod = new boolean[] {false} ;
      H01QL5_A130BarCodPar = new String[] {""} ;
      H01QL5_A132BarCodReo = new byte[1] ;
      H01QL5_A129BarCod = new int[1] ;
      GXv_int7 = new short[1] ;
      hsh = "" ;
      AV41EmprNom = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext12 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV17ColumnsSelectorXML = "" ;
      AV105websession = httpContext.getWebSession();
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV23ManageFiltersXml = "" ;
      AV15ExcelFilename = "" ;
      AV16ErrorMessage = "" ;
      AV18UserCustomValue = "" ;
      AV20ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      AV113Emprcod_selected = "" ;
      AV116Barcodpar_selected = "" ;
      GXv_int17 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int18 = new int[1] ;
      AV75Inc_obs = "" ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char32 = "" ;
      GXv_char33 = new String[1] ;
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
      GXt_char21 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState34 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_trnww__default(),
         new Object[] {
             new Object[] {
            H01QL3_A3594BarPriTin, H01QL3_A2265BarExt, H01QL3_n2265BarExt, H01QL3_A120BarAgrEst, H01QL3_A1923BarCodTN, H01QL3_A209BarPri, H01QL3_A864BarPes, H01QL3_A228BarUniMed, H01QL3_A361DisCod, H01QL3_A5253BarAcc,
            H01QL3_A118BarAcaQui, H01QL3_A180BarMaqCod, H01QL3_A213BarSit, H01QL3_A1235BarNumCli, H01QL3_A1234BarNomCli, H01QL3_A136BarColNum, H01QL3_A135BarColNom, H01QL3_A1652BarSerDsc, H01QL3_A159BarFecGen, H01QL3_A2010BarTipDis,
            H01QL3_A13696BarNHdr, H01QL3_A279CliNom, H01QL3_A396EmprCod, H01QL3_A184BarMtr, H01QL3_A166BarKgm, H01QL3_A143BarDisNum, H01QL3_A4812BarEncCli, H01QL3_A199BarPie1, H01QL3_A365DisDes, H01QL3_A898BarPieNDes,
            H01QL3_A212BarSer, H01QL3_A252CliCod, H01QL3_n252CliCod, H01QL3_A130BarCodPar, H01QL3_A132BarCodReo, H01QL3_A129BarCod
            }
            , new Object[] {
            H01QL5_A3594BarPriTin, H01QL5_A2265BarExt, H01QL5_n2265BarExt, H01QL5_A120BarAgrEst, H01QL5_A1923BarCodTN, H01QL5_A209BarPri, H01QL5_A864BarPes, H01QL5_A228BarUniMed, H01QL5_A361DisCod, H01QL5_A5253BarAcc,
            H01QL5_A118BarAcaQui, H01QL5_A180BarMaqCod, H01QL5_A213BarSit, H01QL5_A1235BarNumCli, H01QL5_A1234BarNomCli, H01QL5_A136BarColNum, H01QL5_A135BarColNom, H01QL5_A1652BarSerDsc, H01QL5_A159BarFecGen, H01QL5_A2010BarTipDis,
            H01QL5_A13696BarNHdr, H01QL5_A279CliNom, H01QL5_A396EmprCod, H01QL5_A184BarMtr, H01QL5_A166BarKgm, H01QL5_A143BarDisNum, H01QL5_A4812BarEncCli, H01QL5_A199BarPie1, H01QL5_A365DisDes, H01QL5_A898BarPieNDes,
            H01QL5_A212BarSer, H01QL5_A252CliCod, H01QL5_n252CliCod, H01QL5_A130BarCodPar, H01QL5_A132BarCodReo, H01QL5_A129BarCod
            }
         }
      );
      AV111Pgmname = "PedidosClienteSinDetalle.HojadeRuta_TRNWW" ;
      /* GeneXus formulas. */
      AV111Pgmname = "PedidosClienteSinDetalle.HojadeRuta_TRNWW" ;
      Gx_err = (short)(0) ;
      edtavF_color_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV98BarCodReoIN ;
   private byte AV102BarSitfrom ;
   private byte AV103BarSitto ;
   private byte AV24ManageFiltersExecutionStep ;
   private byte AV108TFBarHayAlb_Sel ;
   private byte A3594BarPriTin ;
   private byte A2265BarExt ;
   private byte gxajaxcallmode ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A14502BarHayAlb ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int8 ;
   private byte AV115Barcodreo_selected ;
   private byte GXv_int9[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV34OrderedBy ;
   private short AV104Ensayos ;
   private short AV59moda21 ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV33GridActions ;
   private short A14007E_Barser ;
   private short A864BarPes ;
   private short AV92F_color ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXt_int6 ;
   private short GXv_int7[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_99 ;
   private int nGXsfl_99_idx=1 ;
   private int AV97BarCodIN ;
   private int AV47TFCliCod ;
   private int AV48TFCliCod_To ;
   private int AV57TFBarColNum ;
   private int AV58TFBarColNum_To ;
   private int AV80TFBarNumCli ;
   private int AV81TFBarNumCli_To ;
   private int AV84TFBarPie ;
   private int AV85TFBarPie_To ;
   private int A898BarPieNDes ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarcodin_Enabled ;
   private int edtavBarcodreoin_Enabled ;
   private int edtavBarcodparin_Enabled ;
   private int edtavBarfecgenfrom_Enabled ;
   private int edtavBarfecgento_Enabled ;
   private int edtavBarsitfrom_Enabled ;
   private int edtavBarsitto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A198BarPie ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A1923BarCodTN ;
   private int subGrid_Islastpage ;
   private int edtavF_color_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtPedidoClie_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarTipDis_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarNumCli_Visible ;
   private int edtBarSit_Visible ;
   private int edtBarMaqCod_Visible ;
   private int edtBarPie_Visible ;
   private int edtBarKgm_Visible ;
   private int edtBarMtr_Visible ;
   private int edtBarAcaQui_Visible ;
   private int edtBarAgrEst_Visible ;
   private int AV30PageToGo ;
   private int AV114Barcod_selected ;
   private int GXv_int17[] ;
   private int GXv_int18[] ;
   private int AV117GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavF_color_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV31GridCurrentPage ;
   private long AV32GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV86TFBarKgm ;
   private java.math.BigDecimal AV87TFBarKgm_To ;
   private java.math.BigDecimal AV88TFBarMtr ;
   private java.math.BigDecimal AV89TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_99_idx="0001" ;
   private String A396EmprCod ;
   private String AV99BarCodParIN ;
   private String AV111Pgmname ;
   private String AV49TFCliNom ;
   private String AV50TFCliNom_Sel ;
   private String AV43TFPedidoCliente ;
   private String AV44TFPedidoCliente_Sel ;
   private String AV76TFBarTipDis ;
   private String AV77TFBarTipDis_Sel ;
   private String AV51TFBarSer ;
   private String AV52TFBarSer_Sel ;
   private String AV53TFBarSerDsc ;
   private String AV54TFBarSerDsc_Sel ;
   private String AV55TFBarColNom ;
   private String AV56TFBarColNom_Sel ;
   private String AV78TFBarNomCli ;
   private String AV79TFBarNomCli_Sel ;
   private String AV82TFBarMaqCod ;
   private String AV83TFBarMaqCod_Sel ;
   private String AV90TFBarAcaQui ;
   private String AV91TFBarAcaQui_Sel ;
   private String AV95TFBarAgrEst ;
   private String AV96TFBarAgrEst_Sel ;
   private String Gx_mode ;
   private String AV61ImpCod ;
   private String AV42UsurCod ;
   private String AV40Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV39EmprCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A365DisDes ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
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
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtablebarcodin_Internalname ;
   private String lblTextblockbarcodin_Internalname ;
   private String lblTextblockbarcodin_Jsonclick ;
   private String edtavBarcodin_Internalname ;
   private String edtavBarcodin_Jsonclick ;
   private String divUnnamedtablebarcodreoin_Internalname ;
   private String lblTextblockbarcodreoin_Internalname ;
   private String lblTextblockbarcodreoin_Jsonclick ;
   private String edtavBarcodreoin_Internalname ;
   private String edtavBarcodreoin_Jsonclick ;
   private String divUnnamedtablebarcodparin_Internalname ;
   private String lblTextblockbarcodparin_Internalname ;
   private String lblTextblockbarcodparin_Jsonclick ;
   private String edtavBarcodparin_Internalname ;
   private String edtavBarcodparin_Jsonclick ;
   private String divUnnamedtablebarfecgenfrom_Internalname ;
   private String lblTextblockbarfecgenfrom_Internalname ;
   private String lblTextblockbarfecgenfrom_Jsonclick ;
   private String edtavBarfecgenfrom_Internalname ;
   private String edtavBarfecgenfrom_Jsonclick ;
   private String divUnnamedtablebarfecgento_Internalname ;
   private String lblTextblockbarfecgento_Internalname ;
   private String lblTextblockbarfecgento_Jsonclick ;
   private String edtavBarfecgento_Internalname ;
   private String edtavBarfecgento_Jsonclick ;
   private String divUnnamedtablebarsitfrom_Internalname ;
   private String lblTextblockbarsitfrom_Internalname ;
   private String lblTextblockbarsitfrom_Jsonclick ;
   private String edtavBarsitfrom_Internalname ;
   private String edtavBarsitfrom_Jsonclick ;
   private String divUnnamedtablebarsitto_Internalname ;
   private String lblTextblockbarsitto_Internalname ;
   private String lblTextblockbarsitto_Jsonclick ;
   private String edtavBarsitto_Internalname ;
   private String edtavBarsitto_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A2010BarTipDis ;
   private String edtBarTipDis_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarNumCli_Internalname ;
   private String edtBarSit_Internalname ;
   private String A180BarMaqCod ;
   private String edtBarMaqCod_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String A118BarAcaQui ;
   private String edtBarAcaQui_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A5253BarAcc ;
   private String edtE_Barser_Internalname ;
   private String edtDisCod_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Internalname ;
   private String edtBarPes_Internalname ;
   private String A209BarPri ;
   private String edtBarPri_Internalname ;
   private String edtavF_color_Internalname ;
   private String edtBarCodTN_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Internalname ;
   private String scmdbuf ;
   private String lV49TFCliNom ;
   private String lV76TFBarTipDis ;
   private String lV51TFBarSer ;
   private String lV53TFBarSerDsc ;
   private String lV55TFBarColNom ;
   private String lV78TFBarNomCli ;
   private String lV82TFBarMaqCod ;
   private String lV90TFBarAcaQui ;
   private String lV95TFBarAgrEst ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV41EmprNom ;
   private String edtCliCod_Columnheaderclass ;
   private String edtCliNom_Columnheaderclass ;
   private String edtPedidoClie_Columnheaderclass ;
   private String edtBarNHdr_Columnheaderclass ;
   private String edtBarTipDis_Columnheaderclass ;
   private String edtBarFecGen_Columnheaderclass ;
   private String edtBarSer_Columnheaderclass ;
   private String edtBarSerDsc_Columnheaderclass ;
   private String edtBarColNom_Columnheaderclass ;
   private String edtBarColNum_Columnheaderclass ;
   private String edtBarNomCli_Columnheaderclass ;
   private String edtBarNumCli_Columnheaderclass ;
   private String edtBarSit_Columnheaderclass ;
   private String edtBarMaqCod_Columnheaderclass ;
   private String edtBarPie_Columnheaderclass ;
   private String edtBarKgm_Columnheaderclass ;
   private String edtBarMtr_Columnheaderclass ;
   private String edtBarAcaQui_Columnheaderclass ;
   private String edtBarAgrEst_Columnheaderclass ;
   private String edtCliCod_Columnclass ;
   private String edtCliNom_Columnclass ;
   private String edtPedidoClie_Columnclass ;
   private String edtBarNHdr_Columnclass ;
   private String edtBarTipDis_Columnclass ;
   private String edtBarFecGen_Columnclass ;
   private String edtBarSer_Columnclass ;
   private String edtBarSerDsc_Columnclass ;
   private String edtBarColNom_Columnclass ;
   private String edtBarColNum_Columnclass ;
   private String edtBarNomCli_Columnclass ;
   private String edtBarNumCli_Columnclass ;
   private String edtBarSit_Columnclass ;
   private String edtBarMaqCod_Columnclass ;
   private String edtBarPie_Columnclass ;
   private String edtBarKgm_Columnclass ;
   private String edtBarMtr_Columnclass ;
   private String edtBarAcaQui_Columnclass ;
   private String edtBarAgrEst_Columnclass ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String AV113Emprcod_selected ;
   private String AV116Barcodpar_selected ;
   private String GXt_char32 ;
   private String GXv_char33[] ;
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
   private String GXt_char21 ;
   private String GXv_char5[] ;
   private String GXt_char20 ;
   private String GXv_char4[] ;
   private String GXt_char19 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_99_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarTipDis_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarNumCli_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarMaqCod_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarAcaQui_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtE_Barser_Jsonclick ;
   private String edtDisCod_Jsonclick ;
   private String edtBarUniMed_Jsonclick ;
   private String edtBarPes_Jsonclick ;
   private String edtBarPri_Jsonclick ;
   private String edtavF_color_Jsonclick ;
   private String edtBarCodTN_Jsonclick ;
   private String edtBarAgrEst_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV100BarFecGenfrom ;
   private java.util.Date AV101BarFecGento ;
   private java.util.Date A159BarFecGen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV12OrderedDsc ;
   private boolean n2265BarExt ;
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
   private boolean n252CliCod ;
   private boolean bGXsfl_99_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV60TempBoolean ;
   private String AV17ColumnsSelectorXML ;
   private String AV23ManageFiltersXml ;
   private String AV18UserCustomValue ;
   private String AV14FilterFullText ;
   private String lV14FilterFullText ;
   private String AV15ExcelFilename ;
   private String AV16ErrorMessage ;
   private String AV75Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private com.genexus.webpanels.WebSession AV105websession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkBarAcc ;
   private ICheckbox chkBarHayAlb ;
   private IDataStoreProvider pr_default ;
   private byte[] H01QL3_A3594BarPriTin ;
   private byte[] H01QL3_A2265BarExt ;
   private boolean[] H01QL3_n2265BarExt ;
   private String[] H01QL3_A120BarAgrEst ;
   private int[] H01QL3_A1923BarCodTN ;
   private String[] H01QL3_A209BarPri ;
   private short[] H01QL3_A864BarPes ;
   private String[] H01QL3_A228BarUniMed ;
   private int[] H01QL3_A361DisCod ;
   private String[] H01QL3_A5253BarAcc ;
   private String[] H01QL3_A118BarAcaQui ;
   private String[] H01QL3_A180BarMaqCod ;
   private byte[] H01QL3_A213BarSit ;
   private int[] H01QL3_A1235BarNumCli ;
   private String[] H01QL3_A1234BarNomCli ;
   private int[] H01QL3_A136BarColNum ;
   private String[] H01QL3_A135BarColNom ;
   private String[] H01QL3_A1652BarSerDsc ;
   private java.util.Date[] H01QL3_A159BarFecGen ;
   private String[] H01QL3_A2010BarTipDis ;
   private String[] H01QL3_A13696BarNHdr ;
   private String[] H01QL3_A279CliNom ;
   private String[] H01QL3_A396EmprCod ;
   private java.math.BigDecimal[] H01QL3_A184BarMtr ;
   private java.math.BigDecimal[] H01QL3_A166BarKgm ;
   private String[] H01QL3_A143BarDisNum ;
   private String[] H01QL3_A4812BarEncCli ;
   private short[] H01QL3_A199BarPie1 ;
   private String[] H01QL3_A365DisDes ;
   private int[] H01QL3_A898BarPieNDes ;
   private String[] H01QL3_A212BarSer ;
   private int[] H01QL3_A252CliCod ;
   private boolean[] H01QL3_n252CliCod ;
   private String[] H01QL3_A130BarCodPar ;
   private byte[] H01QL3_A132BarCodReo ;
   private int[] H01QL3_A129BarCod ;
   private byte[] H01QL5_A3594BarPriTin ;
   private byte[] H01QL5_A2265BarExt ;
   private boolean[] H01QL5_n2265BarExt ;
   private String[] H01QL5_A120BarAgrEst ;
   private int[] H01QL5_A1923BarCodTN ;
   private String[] H01QL5_A209BarPri ;
   private short[] H01QL5_A864BarPes ;
   private String[] H01QL5_A228BarUniMed ;
   private int[] H01QL5_A361DisCod ;
   private String[] H01QL5_A5253BarAcc ;
   private String[] H01QL5_A118BarAcaQui ;
   private String[] H01QL5_A180BarMaqCod ;
   private byte[] H01QL5_A213BarSit ;
   private int[] H01QL5_A1235BarNumCli ;
   private String[] H01QL5_A1234BarNomCli ;
   private int[] H01QL5_A136BarColNum ;
   private String[] H01QL5_A135BarColNom ;
   private String[] H01QL5_A1652BarSerDsc ;
   private java.util.Date[] H01QL5_A159BarFecGen ;
   private String[] H01QL5_A2010BarTipDis ;
   private String[] H01QL5_A13696BarNHdr ;
   private String[] H01QL5_A279CliNom ;
   private String[] H01QL5_A396EmprCod ;
   private java.math.BigDecimal[] H01QL5_A184BarMtr ;
   private java.math.BigDecimal[] H01QL5_A166BarKgm ;
   private String[] H01QL5_A143BarDisNum ;
   private String[] H01QL5_A4812BarEncCli ;
   private short[] H01QL5_A199BarPie1 ;
   private String[] H01QL5_A365DisDes ;
   private int[] H01QL5_A898BarPieNDes ;
   private String[] H01QL5_A212BarSer ;
   private int[] H01QL5_A252CliCod ;
   private boolean[] H01QL5_n252CliCod ;
   private String[] H01QL5_A130BarCodPar ;
   private byte[] H01QL5_A132BarCodReo ;
   private int[] H01QL5_A129BarCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV22ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item15 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item16[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext12[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState34[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV29DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[] ;
}

final  class hojaderuta_trnww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01QL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV47TFCliCod ,
                                          int AV48TFCliCod_To ,
                                          String AV50TFCliNom_Sel ,
                                          String AV49TFCliNom ,
                                          String AV77TFBarTipDis_Sel ,
                                          String AV76TFBarTipDis ,
                                          String AV52TFBarSer_Sel ,
                                          String AV51TFBarSer ,
                                          String AV54TFBarSerDsc_Sel ,
                                          String AV53TFBarSerDsc ,
                                          String AV56TFBarColNom_Sel ,
                                          String AV55TFBarColNom ,
                                          int AV57TFBarColNum ,
                                          int AV58TFBarColNum_To ,
                                          String AV79TFBarNomCli_Sel ,
                                          String AV78TFBarNomCli ,
                                          int AV80TFBarNumCli ,
                                          int AV81TFBarNumCli_To ,
                                          String AV83TFBarMaqCod_Sel ,
                                          String AV82TFBarMaqCod ,
                                          java.math.BigDecimal AV86TFBarKgm ,
                                          java.math.BigDecimal AV87TFBarKgm_To ,
                                          java.math.BigDecimal AV88TFBarMtr ,
                                          java.math.BigDecimal AV89TFBarMtr_To ,
                                          String AV91TFBarAcaQui_Sel ,
                                          String AV90TFBarAcaQui ,
                                          String AV96TFBarAgrEst_Sel ,
                                          String AV95TFBarAgrEst ,
                                          java.util.Date AV100BarFecGenfrom ,
                                          java.util.Date AV101BarFecGento ,
                                          byte AV102BarSitfrom ,
                                          byte AV103BarSitto ,
                                          int AV97BarCodIN ,
                                          byte AV98BarCodReoIN ,
                                          String AV99BarCodParIN ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A2010BarTipDis ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A180BarMaqCod ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          String A118BarAcaQui ,
                                          String A120BarAgrEst ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV34OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          String AV14FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String AV44TFPedidoCliente_Sel ,
                                          String AV43TFPedidoCliente ,
                                          int AV84TFBarPie ,
                                          int AV85TFBarPie_To ,
                                          byte AV108TFBarHayAlb_Sel ,
                                          byte A14502BarHayAlb ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[36];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT T1.BarPriTin, T1.BarExt, T1.BarAgrEst, T1.BarCodTN, T1.BarPri, T1.BarPes, T1.BarUniMed, T1.DisCod, T1.BarAcc, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarFecGen, T1.BarTipDis, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.EmprCod, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, T1.BarSer, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPBARCAD T1" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV47TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int35[1] = (byte)(1) ;
      }
      if ( ! (0==AV48TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int35[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int35[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV76TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int35[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int35[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int35[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV55TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int35[12] = (byte)(1) ;
      }
      if ( ! (0==AV57TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int35[13] = (byte)(1) ;
      }
      if ( ! (0==AV58TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int35[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV78TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int35[16] = (byte)(1) ;
      }
      if ( ! (0==AV80TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int35[17] = (byte)(1) ;
      }
      if ( ! (0==AV81TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int35[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV82TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int35[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int35[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int35[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int35[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int35[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int35[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV95TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( ! (0==AV102BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( ! (0==AV103BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
      }
      if ( ! (0==AV97BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int35[33] = (byte)(1) ;
      }
      if ( ! (0==AV98BarCodReoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int35[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99BarCodParIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int35[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV34OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarNHdr DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipDis" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipDis DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumCli" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui DESC" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
   }

   protected Object[] conditional_H01QL5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV47TFCliCod ,
                                          int AV48TFCliCod_To ,
                                          String AV50TFCliNom_Sel ,
                                          String AV49TFCliNom ,
                                          String AV77TFBarTipDis_Sel ,
                                          String AV76TFBarTipDis ,
                                          String AV52TFBarSer_Sel ,
                                          String AV51TFBarSer ,
                                          String AV54TFBarSerDsc_Sel ,
                                          String AV53TFBarSerDsc ,
                                          String AV56TFBarColNom_Sel ,
                                          String AV55TFBarColNom ,
                                          int AV57TFBarColNum ,
                                          int AV58TFBarColNum_To ,
                                          String AV79TFBarNomCli_Sel ,
                                          String AV78TFBarNomCli ,
                                          int AV80TFBarNumCli ,
                                          int AV81TFBarNumCli_To ,
                                          String AV83TFBarMaqCod_Sel ,
                                          String AV82TFBarMaqCod ,
                                          java.math.BigDecimal AV86TFBarKgm ,
                                          java.math.BigDecimal AV87TFBarKgm_To ,
                                          java.math.BigDecimal AV88TFBarMtr ,
                                          java.math.BigDecimal AV89TFBarMtr_To ,
                                          String AV91TFBarAcaQui_Sel ,
                                          String AV90TFBarAcaQui ,
                                          String AV96TFBarAgrEst_Sel ,
                                          String AV95TFBarAgrEst ,
                                          java.util.Date AV100BarFecGenfrom ,
                                          java.util.Date AV101BarFecGento ,
                                          byte AV102BarSitfrom ,
                                          byte AV103BarSitto ,
                                          int AV97BarCodIN ,
                                          byte AV98BarCodReoIN ,
                                          String AV99BarCodParIN ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A2010BarTipDis ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A180BarMaqCod ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          String A118BarAcaQui ,
                                          String A120BarAgrEst ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV34OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          String AV14FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String AV44TFPedidoCliente_Sel ,
                                          String AV43TFPedidoCliente ,
                                          int AV84TFBarPie ,
                                          int AV85TFBarPie_To ,
                                          byte AV108TFBarHayAlb_Sel ,
                                          byte A14502BarHayAlb ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int37 = new byte[36];
      Object[] GXv_Object38 = new Object[2];
      scmdbuf = "SELECT T1.BarPriTin, T1.BarExt, T1.BarAgrEst, T1.BarCodTN, T1.BarPri, T1.BarPes, T1.BarUniMed, T1.DisCod, T1.BarAcc, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarFecGen, T1.BarTipDis, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.EmprCod, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, T1.BarSer, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPBARCAD T1" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV47TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int37[1] = (byte)(1) ;
      }
      if ( ! (0==AV48TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int37[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int37[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV76TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int37[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int37[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int37[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV55TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int37[12] = (byte)(1) ;
      }
      if ( ! (0==AV57TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int37[13] = (byte)(1) ;
      }
      if ( ! (0==AV58TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int37[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV78TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int37[16] = (byte)(1) ;
      }
      if ( ! (0==AV80TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int37[17] = (byte)(1) ;
      }
      if ( ! (0==AV81TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int37[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV82TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int37[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int37[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int37[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int37[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int37[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int37[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV95TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int37[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int37[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int37[30] = (byte)(1) ;
      }
      if ( ! (0==AV102BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int37[31] = (byte)(1) ;
      }
      if ( ! (0==AV103BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int37[32] = (byte)(1) ;
      }
      if ( ! (0==AV97BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int37[33] = (byte)(1) ;
      }
      if ( ! (0==AV98BarCodReoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int37[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99BarCodParIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int37[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV34OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarNHdr DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipDis" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipDis DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumCli" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui DESC" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      GXv_Object38[0] = scmdbuf ;
      GXv_Object38[1] = GXv_int37 ;
      return GXv_Object38 ;
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
                  return conditional_H01QL3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Boolean) dynConstraints[55]).booleanValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , (String)dynConstraints[66] );
            case 1 :
                  return conditional_H01QL5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Boolean) dynConstraints[55]).booleanValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01QL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01QL5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 26);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 11);
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[25])[0] = rslt.getString(25, 8);
               ((String[]) buf[26])[0] = rslt.getString(26, 20);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 1);
               ((int[]) buf[29])[0] = rslt.getInt(29);
               ((String[]) buf[30])[0] = rslt.getString(30, 16);
               ((int[]) buf[31])[0] = rslt.getInt(31);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(32, 1);
               ((byte[]) buf[34])[0] = rslt.getByte(33);
               ((int[]) buf[35])[0] = rslt.getInt(34);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 26);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 11);
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[25])[0] = rslt.getString(25, 8);
               ((String[]) buf[26])[0] = rslt.getString(26, 20);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 1);
               ((int[]) buf[29])[0] = rslt.getInt(29);
               ((String[]) buf[30])[0] = rslt.getString(30, 16);
               ((int[]) buf[31])[0] = rslt.getInt(31);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(32, 1);
               ((byte[]) buf[34])[0] = rslt.getByte(33);
               ((int[]) buf[35])[0] = rslt.getInt(34);
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
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
      }
   }

}

