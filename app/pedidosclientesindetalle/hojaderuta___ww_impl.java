package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta___ww_impl extends GXDataArea
{
   public hojaderuta___ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta___ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta___ww_impl.class ));
   }

   public hojaderuta___ww_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkHayRec = UIFactory.getCheckbox(this);
      chkBarAcc = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_79 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_79"))) ;
      nGXsfl_79_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_79_idx"))) ;
      sGXsfl_79_idx = httpContext.GetPar( "sGXsfl_79_idx") ;
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
      AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV11BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV16CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV12BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
      AV13BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
      AV14BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
      AV15BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
      AV19EmprCod = httpContext.GetPar( "EmprCod") ;
      AV84ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV90ColumnsSelector);
      AV79FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV63TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV64TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV66TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV67TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV59TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV60TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV61TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV62TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV51TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV52TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV53TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV54TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV55TFBarMaqCod = httpContext.GetPar( "TFBarMaqCod") ;
      AV56TFBarMaqCod_Sel = httpContext.GetPar( "TFBarMaqCod_Sel") ;
      AV77TFBarAgrEst = httpContext.GetPar( "TFBarAgrEst") ;
      AV78TFBarAgrEst_Sel = httpContext.GetPar( "TFBarAgrEst_Sel") ;
      AV94Pgmname = httpContext.GetPar( "Pgmname") ;
      AV36OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV37OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV21Ensayos = (short)(GXutil.lval( httpContext.GetPar( "Ensayos"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV34moda21 = (short)(GXutil.lval( httpContext.GetPar( "moda21"))) ;
      AV40PATHPDF = httpContext.GetPar( "PATHPDF") ;
      AV7ImpCod = httpContext.GetPar( "ImpCod") ;
      AV70UsurCod = httpContext.GetPar( "UsurCod") ;
      AV48Station = httpContext.GetPar( "Station") ;
      A3594BarPriTin = (byte)(GXutil.lval( httpContext.GetPar( "BarPriTin"))) ;
      A2265BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
      n2265BarExt = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV16CliCod, AV12BarFecGenfrom, AV13BarFecGento, AV14BarSitfrom, AV15BarSitto, AV19EmprCod, AV84ManageFiltersExecutionStep, AV90ColumnsSelector, AV79FilterFullText, AV63TFCliNom, AV64TFCliNom_Sel, AV66TFPedidoCliente, AV67TFPedidoCliente_Sel, AV59TFBarSer, AV60TFBarSer_Sel, AV61TFBarSerDsc, AV62TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarMaqCod, AV56TFBarMaqCod_Sel, AV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV94Pgmname, AV36OrderedBy, AV37OrderedDsc, AV21Ensayos, Gx_mode, AV34moda21, AV40PATHPDF, AV7ImpCod, AV70UsurCod, AV48Station, A3594BarPriTin, A2265BarExt) ;
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
      pa2CH2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2CH2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta___ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Ensayos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta___WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta___ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOD", GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV11BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODPAR", GXutil.rtrim( AV10BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICOD", GXutil.ltrim( localUtil.ntoc( AV16CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGENFROM", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGENTO", localUtil.format(AV13BarFecGento, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV14BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV15BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_79", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_79, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV82ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV82ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV90ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV90ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV84ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV63TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV64TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDIDOCLIENTE", GXutil.rtrim( AV66TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV67TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV59TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV60TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC", GXutil.rtrim( AV61TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC_SEL", GXutil.rtrim( AV62TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM", GXutil.rtrim( AV51TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM_SEL", GXutil.rtrim( AV52TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV53TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV54TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMAQCOD", GXutil.rtrim( AV55TFBarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMAQCOD_SEL", GXutil.rtrim( AV56TFBarMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGREST", GXutil.rtrim( AV77TFBarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGREST_SEL", GXutil.rtrim( AV78TFBarAgrEst_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV36OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV37OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vENSAYOS", GXutil.ltrim( localUtil.ntoc( AV21Ensayos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Ensayos), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV28GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV28GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRITIN", GXutil.ltrim( localUtil.ntoc( A3594BarPriTin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAREXT", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV34moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF", AV40PATHPDF);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV7ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV19EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV70UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV48Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48Station, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERHOJADERUTA__WW", AV24FilterHojadeRuta__WW);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERHOJADERUTA__WW", AV24FilterHojadeRuta__WW);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Width", GXutil.rtrim( Situacionfases_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Title", GXutil.rtrim( Situacionfases_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Confirmtype", GXutil.rtrim( Situacionfases_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Bodytype", GXutil.rtrim( Situacionfases_modal_Bodytype));
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
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
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
         we2CH2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2CH2( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta___ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta___WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Hoja de Ruta v02", "") ;
   }

   public void wb2CH0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "CellMarginBottom15", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV11BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV10BarCodPar), GXutil.rtrim( localUtil.format( AV10BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV16CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecgenfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgenfrom_Internalname, httpContext.getMessage( "Fecha Inicial", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgenfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgenfrom_Internalname, localUtil.format(AV12BarFecGenfrom, "99/99/99"), localUtil.format( AV12BarFecGenfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgenfrom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarfecgenfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgenfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgenfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecgento_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgento_Internalname, httpContext.getMessage( "Fecha Final", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgento_Internalname, localUtil.format(AV13BarFecGento, "99/99/99"), localUtil.format( AV13BarFecGento, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgento_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarfecgento_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsitfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitfrom_Internalname, httpContext.getMessage( "Sit. Ini.", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarSitfrom), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarSitfrom), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitfrom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarsitfrom_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsitto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitto_Internalname, httpContext.getMessage( "Sit. Fin.", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitto_Internalname, GXutil.ltrim( localUtil.ntoc( AV15BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15BarSitto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV15BarSitto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitto_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarsitto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
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
         wb_table1_61_2CH2( true) ;
      }
      else
      {
         wb_table1_61_2CH2( false) ;
      }
      return  ;
   }

   public void wb_table1_61_2CH2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         startgridcontrol79( ) ;
      }
      if ( wbEnd == 79 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_79 = (int)(nGXsfl_79_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV94Pgmname), GXutil.rtrim( localUtil.format( AV94Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV90ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_128_2CH2( true) ;
      }
      else
      {
         wb_table2_128_2CH2( false) ;
      }
      return  ;
   }

   public void wb_table2_128_2CH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_133_2CH2( true) ;
      }
      else
      {
         wb_table3_133_2CH2( false) ;
      }
      return  ;
   }

   public void wb_table3_133_2CH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0140"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0140"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_79_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0140"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
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
      }
      if ( wbEnd == 79 )
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

   public void start2CH2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Hoja de Ruta v02", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2CH0( ) ;
   }

   public void ws2CH2( )
   {
      start2CH2( ) ;
      evt2CH2( ) ;
   }

   public void evt2CH2( )
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
                           e112CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SITUACIONFASES_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e182CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e192CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e202CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e212CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e222CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARFECGENFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e232CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARFECGENTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e242CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARSITFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e252CH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARSITTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e262CH2 ();
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
                           nGXsfl_79_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_792( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV25GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridActions), 4, 0));
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
                           A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
                           A13710HayRec = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkHayRec.getInternalname()), "1")==0) ? 1 : 0)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
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
                              AV22F_color = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22F_color), 4, 0));
                           }
                           else
                           {
                              AV22F_color = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22F_color), 4, 0));
                           }
                           A1923BarCodTN = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodTN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13930BarAlbUlti = localUtil.ctol( httpContext.cgiGet( edtBarAlbUlti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e272CH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e282CH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e292CH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e302CH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Barcod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV9BarCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodreo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV11BarCodReo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodpar Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPAR"), AV10BarCodPar) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV16CliCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgenfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGENFROM"), 0), AV12BarFecGenfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgento Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGENTO"), 0), AV13BarFecGento) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsitfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV14BarSitfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsitto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV15BarSitto )
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
                     if ( nCmpId == 140 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0140") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0140", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2CH2( )
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

   public void pa2CH2( )
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
            GX_FocusControl = edtavBarcod_Internalname ;
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
      subsflControlProps_792( ) ;
      while ( nGXsfl_79_idx <= nRC_GXsfl_79 )
      {
         sendrow_792( ) ;
         nGXsfl_79_idx = ((subGrid_Islastpage==1)&&(nGXsfl_79_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV9BarCod ,
                                 byte AV11BarCodReo ,
                                 String AV10BarCodPar ,
                                 int AV16CliCod ,
                                 java.util.Date AV12BarFecGenfrom ,
                                 java.util.Date AV13BarFecGento ,
                                 byte AV14BarSitfrom ,
                                 byte AV15BarSitto ,
                                 String AV19EmprCod ,
                                 byte AV84ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV90ColumnsSelector ,
                                 String AV79FilterFullText ,
                                 String AV63TFCliNom ,
                                 String AV64TFCliNom_Sel ,
                                 String AV66TFPedidoCliente ,
                                 String AV67TFPedidoCliente_Sel ,
                                 String AV59TFBarSer ,
                                 String AV60TFBarSer_Sel ,
                                 String AV61TFBarSerDsc ,
                                 String AV62TFBarSerDsc_Sel ,
                                 String AV51TFBarColNom ,
                                 String AV52TFBarColNom_Sel ,
                                 int AV53TFBarColNum ,
                                 int AV54TFBarColNum_To ,
                                 String AV55TFBarMaqCod ,
                                 String AV56TFBarMaqCod_Sel ,
                                 String AV77TFBarAgrEst ,
                                 String AV78TFBarAgrEst_Sel ,
                                 String AV94Pgmname ,
                                 short AV36OrderedBy ,
                                 boolean AV37OrderedDsc ,
                                 short AV21Ensayos ,
                                 String Gx_mode ,
                                 short AV34moda21 ,
                                 String AV40PATHPDF ,
                                 String AV7ImpCod ,
                                 String AV70UsurCod ,
                                 String AV48Station ,
                                 byte A3594BarPriTin ,
                                 byte A2265BarExt )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GridState.saveGridState();
      /* Execute user event: Refresh */
      e282CH2 ();
      GRID_nCurrentRecord = 0 ;
      rf2CH2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta___WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta___ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_HAYREC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13710HayRec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "HAYREC", GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A209BarPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRI", GXutil.rtrim( A209BarPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECGEN", getSecureSignedToken( "", A159BarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECGEN", localUtil.format(A159BarFecGen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBULTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBULTI", GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), ".", "")));
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
      rf2CH2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV94Pgmname = "PedidosClienteSinDetalle.HojadeRuta___WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
      Gx_err = (short)(0) ;
      edtavF_color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF_color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_color_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV79FilterFullText ;
      AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV63TFCliNom ;
      AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV64TFCliNom_Sel ;
      AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV66TFPedidoCliente ;
      AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV67TFPedidoCliente_Sel ;
      AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV59TFBarSer ;
      AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV60TFBarSer_Sel ;
      AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV61TFBarSerDsc ;
      AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV62TFBarSerDsc_Sel ;
      AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV51TFBarColNom ;
      AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV52TFBarColNom_Sel ;
      AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV53TFBarColNum ;
      AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV54TFBarColNum_To ;
      AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV55TFBarMaqCod ;
      AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV56TFBarMaqCod_Sel ;
      AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV77TFBarAgrEst ;
      AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV78TFBarAgrEst_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                           AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                           AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                           AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                           AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                           AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                           AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                           AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                           Integer.valueOf(AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                           AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                           AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                           AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                           AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                           Integer.valueOf(AV16CliCod) ,
                                           AV12BarFecGenfrom ,
                                           AV13BarFecGento ,
                                           Byte.valueOf(AV14BarSitfrom) ,
                                           Byte.valueOf(AV15BarSitto) ,
                                           Integer.valueOf(AV9BarCod) ,
                                           Byte.valueOf(AV11BarCodReo) ,
                                           AV10BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A120BarAgrEst ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV36OrderedBy) ,
                                           Boolean.valueOf(AV37OrderedDsc) ,
                                           AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                           AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                           AV19EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
      lV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
      lV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
      lV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
      lV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
      lV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
      /* Using cursor H02CH3 */
      pr_default.execute(0, new Object[] {AV19EmprCod, lV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV16CliCod), AV12BarFecGenfrom, AV13BarFecGento, Byte.valueOf(AV14BarSitfrom), Byte.valueOf(AV15BarSitto), Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3594BarPriTin = H02CH3_A3594BarPriTin[0] ;
         A2265BarExt = H02CH3_A2265BarExt[0] ;
         n2265BarExt = H02CH3_n2265BarExt[0] ;
         A1923BarCodTN = H02CH3_A1923BarCodTN[0] ;
         A209BarPri = H02CH3_A209BarPri[0] ;
         A864BarPes = H02CH3_A864BarPes[0] ;
         A228BarUniMed = H02CH3_A228BarUniMed[0] ;
         A361DisCod = H02CH3_A361DisCod[0] ;
         A5253BarAcc = H02CH3_A5253BarAcc[0] ;
         A1235BarNumCli = H02CH3_A1235BarNumCli[0] ;
         A1234BarNomCli = H02CH3_A1234BarNomCli[0] ;
         A2010BarTipDis = H02CH3_A2010BarTipDis[0] ;
         A120BarAgrEst = H02CH3_A120BarAgrEst[0] ;
         A180BarMaqCod = H02CH3_A180BarMaqCod[0] ;
         A213BarSit = H02CH3_A213BarSit[0] ;
         A136BarColNum = H02CH3_A136BarColNum[0] ;
         A135BarColNom = H02CH3_A135BarColNom[0] ;
         A1652BarSerDsc = H02CH3_A1652BarSerDsc[0] ;
         A159BarFecGen = H02CH3_A159BarFecGen[0] ;
         A13696BarNHdr = H02CH3_A13696BarNHdr[0] ;
         A279CliNom = H02CH3_A279CliNom[0] ;
         A184BarMtr = H02CH3_A184BarMtr[0] ;
         A166BarKgm = H02CH3_A166BarKgm[0] ;
         A143BarDisNum = H02CH3_A143BarDisNum[0] ;
         A4812BarEncCli = H02CH3_A4812BarEncCli[0] ;
         A199BarPie1 = H02CH3_A199BarPie1[0] ;
         A365DisDes = H02CH3_A365DisDes[0] ;
         A898BarPieNDes = H02CH3_A898BarPieNDes[0] ;
         A212BarSer = H02CH3_A212BarSer[0] ;
         A252CliCod = H02CH3_A252CliCod[0] ;
         n252CliCod = H02CH3_n252CliCod[0] ;
         A130BarCodPar = H02CH3_A130BarCodPar[0] ;
         A132BarCodReo = H02CH3_A132BarCodReo[0] ;
         A129BarCod = H02CH3_A129BarCod[0] ;
         A396EmprCod = H02CH3_A396EmprCod[0] ;
         A279CliNom = H02CH3_A279CliNom[0] ;
         A184BarMtr = H02CH3_A184BarMtr[0] ;
         A166BarKgm = H02CH3_A166BarKgm[0] ;
         A199BarPie1 = H02CH3_A199BarPie1[0] ;
         A898BarPieNDes = H02CH3_A898BarPieNDes[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         hojaderuta___ww_impl.this.A396EmprCod = GXv_char2[0] ;
         hojaderuta___ww_impl.this.A4812BarEncCli = GXv_char3[0] ;
         hojaderuta___ww_impl.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta___ww_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int6 = A13710HayRec ;
                  GXv_int7[0] = GXt_int6 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int7) ;
                  hojaderuta___ww_impl.this.GXt_int6 = GXv_int7[0] ;
                  A13710HayRec = GXt_int6 ;
                  GXt_int8 = A14007E_Barser ;
                  GXv_int9[0] = GXt_int8 ;
                  new app.pedidosclientesindetalle.existearticulo(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, GXv_int9) ;
                  hojaderuta___ww_impl.this.GXt_int8 = GXv_int9[0] ;
                  A14007E_Barser = GXt_int8 ;
                  GXt_int10 = A13930BarAlbUlti ;
                  GXv_int11[0] = GXt_int10 ;
                  new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int11) ;
                  hojaderuta___ww_impl.this.GXt_int10 = GXv_int11[0] ;
                  A13930BarAlbUlti = GXt_int10 ;
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
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

   public void rf2CH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(79) ;
      /* Execute user event: Refresh */
      e282CH2 ();
      nGXsfl_79_idx = 1 ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_792( ) ;
      bGXsfl_79_Refreshing = true ;
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
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_792( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                              AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                              AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                              AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                              AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                              AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                              AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                              AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                              Integer.valueOf(AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                              Integer.valueOf(AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                              AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                              AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                              AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                              AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                              Integer.valueOf(AV16CliCod) ,
                                              AV12BarFecGenfrom ,
                                              AV13BarFecGento ,
                                              Byte.valueOf(AV14BarSitfrom) ,
                                              Byte.valueOf(AV15BarSitto) ,
                                              Integer.valueOf(AV9BarCod) ,
                                              Byte.valueOf(AV11BarCodReo) ,
                                              AV10BarCodPar ,
                                              A279CliNom ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A180BarMaqCod ,
                                              A120BarAgrEst ,
                                              Integer.valueOf(A252CliCod) ,
                                              A159BarFecGen ,
                                              Byte.valueOf(A213BarSit) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(AV36OrderedBy) ,
                                              Boolean.valueOf(AV37OrderedDsc) ,
                                              AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                              A13878PedidoClie ,
                                              A13696BarNHdr ,
                                              AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                              AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                              AV19EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
         lV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
         lV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
         lV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
         lV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
         lV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
         /* Using cursor H02CH5 */
         pr_default.execute(1, new Object[] {AV19EmprCod, lV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV16CliCod), AV12BarFecGenfrom, AV13BarFecGento, Byte.valueOf(AV14BarSitfrom), Byte.valueOf(AV15BarSitto), Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar});
         nGXsfl_79_idx = 1 ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3594BarPriTin = H02CH5_A3594BarPriTin[0] ;
            A2265BarExt = H02CH5_A2265BarExt[0] ;
            n2265BarExt = H02CH5_n2265BarExt[0] ;
            A1923BarCodTN = H02CH5_A1923BarCodTN[0] ;
            A209BarPri = H02CH5_A209BarPri[0] ;
            A864BarPes = H02CH5_A864BarPes[0] ;
            A228BarUniMed = H02CH5_A228BarUniMed[0] ;
            A361DisCod = H02CH5_A361DisCod[0] ;
            A5253BarAcc = H02CH5_A5253BarAcc[0] ;
            A1235BarNumCli = H02CH5_A1235BarNumCli[0] ;
            A1234BarNomCli = H02CH5_A1234BarNomCli[0] ;
            A2010BarTipDis = H02CH5_A2010BarTipDis[0] ;
            A120BarAgrEst = H02CH5_A120BarAgrEst[0] ;
            A180BarMaqCod = H02CH5_A180BarMaqCod[0] ;
            A213BarSit = H02CH5_A213BarSit[0] ;
            A136BarColNum = H02CH5_A136BarColNum[0] ;
            A135BarColNom = H02CH5_A135BarColNom[0] ;
            A1652BarSerDsc = H02CH5_A1652BarSerDsc[0] ;
            A159BarFecGen = H02CH5_A159BarFecGen[0] ;
            A13696BarNHdr = H02CH5_A13696BarNHdr[0] ;
            A279CliNom = H02CH5_A279CliNom[0] ;
            A184BarMtr = H02CH5_A184BarMtr[0] ;
            A166BarKgm = H02CH5_A166BarKgm[0] ;
            A143BarDisNum = H02CH5_A143BarDisNum[0] ;
            A4812BarEncCli = H02CH5_A4812BarEncCli[0] ;
            A199BarPie1 = H02CH5_A199BarPie1[0] ;
            A365DisDes = H02CH5_A365DisDes[0] ;
            A898BarPieNDes = H02CH5_A898BarPieNDes[0] ;
            A212BarSer = H02CH5_A212BarSer[0] ;
            A252CliCod = H02CH5_A252CliCod[0] ;
            n252CliCod = H02CH5_n252CliCod[0] ;
            A130BarCodPar = H02CH5_A130BarCodPar[0] ;
            A132BarCodReo = H02CH5_A132BarCodReo[0] ;
            A129BarCod = H02CH5_A129BarCod[0] ;
            A396EmprCod = H02CH5_A396EmprCod[0] ;
            A279CliNom = H02CH5_A279CliNom[0] ;
            A184BarMtr = H02CH5_A184BarMtr[0] ;
            A166BarKgm = H02CH5_A166BarKgm[0] ;
            A199BarPie1 = H02CH5_A199BarPie1[0] ;
            A898BarPieNDes = H02CH5_A898BarPieNDes[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            hojaderuta___ww_impl.this.A396EmprCod = GXv_char5[0] ;
            hojaderuta___ww_impl.this.A4812BarEncCli = GXv_char4[0] ;
            hojaderuta___ww_impl.this.A143BarDisNum = GXv_char3[0] ;
            hojaderuta___ww_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
                  {
                     GXt_int6 = A13710HayRec ;
                     GXv_int7[0] = GXt_int6 ;
                     new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int7) ;
                     hojaderuta___ww_impl.this.GXt_int6 = GXv_int7[0] ;
                     A13710HayRec = GXt_int6 ;
                     GXt_int8 = A14007E_Barser ;
                     GXv_int9[0] = GXt_int8 ;
                     new app.pedidosclientesindetalle.existearticulo(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, GXv_int9) ;
                     hojaderuta___ww_impl.this.GXt_int8 = GXv_int9[0] ;
                     A14007E_Barser = GXt_int8 ;
                     GXt_int10 = A13930BarAlbUlti ;
                     GXv_int11[0] = GXt_int10 ;
                     new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int11) ;
                     hojaderuta___ww_impl.this.GXt_int10 = GXv_int11[0] ;
                     A13930BarAlbUlti = GXt_int10 ;
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     e292CH2 ();
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(79) ;
         wb2CH0( ) ;
      }
      bGXsfl_79_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CH2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vENSAYOS", GXutil.ltrim( localUtil.ntoc( AV21Ensayos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Ensayos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARUNIMED"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, GXutil.rtrim( localUtil.format( A228BarUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPES"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSER"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, GXutil.rtrim( localUtil.format( A212BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PEDIDOCLIE"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNOM"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, GXutil.rtrim( localUtil.format( A135BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNUM"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIE"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSERDSC"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, GXutil.rtrim( localUtil.format( A1652BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARAGREST"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_HAYREC"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, localUtil.format( DecimalUtil.doubleToDec(A13710HayRec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRITIN", GXutil.ltrim( localUtil.ntoc( A3594BarPriTin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAREXT", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRI"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, GXutil.rtrim( localUtil.format( A209BarPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECGEN"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, A159BarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV34moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF", AV40PATHPDF);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV7ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSIT"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBULTI"+"_"+sGXsfl_79_idx, getSecureSignedToken( sGXsfl_79_idx, localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV70UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV48Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48Station, ""))));
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
      AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV79FilterFullText ;
      AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV63TFCliNom ;
      AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV64TFCliNom_Sel ;
      AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV66TFPedidoCliente ;
      AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV67TFPedidoCliente_Sel ;
      AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV59TFBarSer ;
      AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV60TFBarSer_Sel ;
      AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV61TFBarSerDsc ;
      AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV62TFBarSerDsc_Sel ;
      AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV51TFBarColNom ;
      AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV52TFBarColNom_Sel ;
      AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV53TFBarColNum ;
      AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV54TFBarColNum_To ;
      AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV55TFBarMaqCod ;
      AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV56TFBarMaqCod_Sel ;
      AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV77TFBarAgrEst ;
      AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV78TFBarAgrEst_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV16CliCod, AV12BarFecGenfrom, AV13BarFecGento, AV14BarSitfrom, AV15BarSitto, AV19EmprCod, AV84ManageFiltersExecutionStep, AV90ColumnsSelector, AV79FilterFullText, AV63TFCliNom, AV64TFCliNom_Sel, AV66TFPedidoCliente, AV67TFPedidoCliente_Sel, AV59TFBarSer, AV60TFBarSer_Sel, AV61TFBarSerDsc, AV62TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarMaqCod, AV56TFBarMaqCod_Sel, AV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV94Pgmname, AV36OrderedBy, AV37OrderedDsc, AV21Ensayos, Gx_mode, AV34moda21, AV40PATHPDF, AV7ImpCod, AV70UsurCod, AV48Station, A3594BarPriTin, A2265BarExt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV79FilterFullText ;
      AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV63TFCliNom ;
      AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV64TFCliNom_Sel ;
      AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV66TFPedidoCliente ;
      AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV67TFPedidoCliente_Sel ;
      AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV59TFBarSer ;
      AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV60TFBarSer_Sel ;
      AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV61TFBarSerDsc ;
      AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV62TFBarSerDsc_Sel ;
      AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV51TFBarColNom ;
      AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV52TFBarColNom_Sel ;
      AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV53TFBarColNum ;
      AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV54TFBarColNum_To ;
      AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV55TFBarMaqCod ;
      AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV56TFBarMaqCod_Sel ;
      AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV77TFBarAgrEst ;
      AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV78TFBarAgrEst_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV16CliCod, AV12BarFecGenfrom, AV13BarFecGento, AV14BarSitfrom, AV15BarSitto, AV19EmprCod, AV84ManageFiltersExecutionStep, AV90ColumnsSelector, AV79FilterFullText, AV63TFCliNom, AV64TFCliNom_Sel, AV66TFPedidoCliente, AV67TFPedidoCliente_Sel, AV59TFBarSer, AV60TFBarSer_Sel, AV61TFBarSerDsc, AV62TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarMaqCod, AV56TFBarMaqCod_Sel, AV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV94Pgmname, AV36OrderedBy, AV37OrderedDsc, AV21Ensayos, Gx_mode, AV34moda21, AV40PATHPDF, AV7ImpCod, AV70UsurCod, AV48Station, A3594BarPriTin, A2265BarExt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV79FilterFullText ;
      AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV63TFCliNom ;
      AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV64TFCliNom_Sel ;
      AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV66TFPedidoCliente ;
      AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV67TFPedidoCliente_Sel ;
      AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV59TFBarSer ;
      AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV60TFBarSer_Sel ;
      AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV61TFBarSerDsc ;
      AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV62TFBarSerDsc_Sel ;
      AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV51TFBarColNom ;
      AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV52TFBarColNom_Sel ;
      AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV53TFBarColNum ;
      AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV54TFBarColNum_To ;
      AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV55TFBarMaqCod ;
      AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV56TFBarMaqCod_Sel ;
      AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV77TFBarAgrEst ;
      AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV78TFBarAgrEst_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV16CliCod, AV12BarFecGenfrom, AV13BarFecGento, AV14BarSitfrom, AV15BarSitto, AV19EmprCod, AV84ManageFiltersExecutionStep, AV90ColumnsSelector, AV79FilterFullText, AV63TFCliNom, AV64TFCliNom_Sel, AV66TFPedidoCliente, AV67TFPedidoCliente_Sel, AV59TFBarSer, AV60TFBarSer_Sel, AV61TFBarSerDsc, AV62TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarMaqCod, AV56TFBarMaqCod_Sel, AV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV94Pgmname, AV36OrderedBy, AV37OrderedDsc, AV21Ensayos, Gx_mode, AV34moda21, AV40PATHPDF, AV7ImpCod, AV70UsurCod, AV48Station, A3594BarPriTin, A2265BarExt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV79FilterFullText ;
      AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV63TFCliNom ;
      AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV64TFCliNom_Sel ;
      AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV66TFPedidoCliente ;
      AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV67TFPedidoCliente_Sel ;
      AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV59TFBarSer ;
      AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV60TFBarSer_Sel ;
      AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV61TFBarSerDsc ;
      AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV62TFBarSerDsc_Sel ;
      AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV51TFBarColNom ;
      AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV52TFBarColNom_Sel ;
      AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV53TFBarColNum ;
      AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV54TFBarColNum_To ;
      AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV55TFBarMaqCod ;
      AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV56TFBarMaqCod_Sel ;
      AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV77TFBarAgrEst ;
      AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV78TFBarAgrEst_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV16CliCod, AV12BarFecGenfrom, AV13BarFecGento, AV14BarSitfrom, AV15BarSitto, AV19EmprCod, AV84ManageFiltersExecutionStep, AV90ColumnsSelector, AV79FilterFullText, AV63TFCliNom, AV64TFCliNom_Sel, AV66TFPedidoCliente, AV67TFPedidoCliente_Sel, AV59TFBarSer, AV60TFBarSer_Sel, AV61TFBarSerDsc, AV62TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarMaqCod, AV56TFBarMaqCod_Sel, AV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV94Pgmname, AV36OrderedBy, AV37OrderedDsc, AV21Ensayos, Gx_mode, AV34moda21, AV40PATHPDF, AV7ImpCod, AV70UsurCod, AV48Station, A3594BarPriTin, A2265BarExt) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV79FilterFullText ;
      AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV63TFCliNom ;
      AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV64TFCliNom_Sel ;
      AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV66TFPedidoCliente ;
      AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV67TFPedidoCliente_Sel ;
      AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV59TFBarSer ;
      AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV60TFBarSer_Sel ;
      AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV61TFBarSerDsc ;
      AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV62TFBarSerDsc_Sel ;
      AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV51TFBarColNom ;
      AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV52TFBarColNom_Sel ;
      AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV53TFBarColNum ;
      AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV54TFBarColNum_To ;
      AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV55TFBarMaqCod ;
      AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV56TFBarMaqCod_Sel ;
      AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV77TFBarAgrEst ;
      AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV78TFBarAgrEst_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV16CliCod, AV12BarFecGenfrom, AV13BarFecGento, AV14BarSitfrom, AV15BarSitto, AV19EmprCod, AV84ManageFiltersExecutionStep, AV90ColumnsSelector, AV79FilterFullText, AV63TFCliNom, AV64TFCliNom_Sel, AV66TFPedidoCliente, AV67TFPedidoCliente_Sel, AV59TFBarSer, AV60TFBarSer_Sel, AV61TFBarSerDsc, AV62TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarMaqCod, AV56TFBarMaqCod_Sel, AV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV94Pgmname, AV36OrderedBy, AV37OrderedDsc, AV21Ensayos, Gx_mode, AV34moda21, AV40PATHPDF, AV7ImpCod, AV70UsurCod, AV48Station, A3594BarPriTin, A2265BarExt) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void subgrid_varsfromstate( )
   {
      if ( GridState.getFiltercount() >= 1 )
      {
         AV16CliCod = (int)(GXutil.lval( GridState.filterValues("Clicod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
         AV12BarFecGenfrom = localUtil.ctod( GridState.filterValues("Barfecgenfrom"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
         AV13BarFecGento = localUtil.ctod( GridState.filterValues("Barfecgento"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
         AV14BarSitfrom = (byte)(GXutil.lval( GridState.filterValues("Barsitfrom"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitfrom), 2, 0));
         AV15BarSitto = (byte)(GXutil.lval( GridState.filterValues("Barsitto"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarSitto), 2, 0));
         AV9BarCod = (int)(GXutil.lval( GridState.filterValues("Barcod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         AV11BarCodReo = (byte)(GXutil.lval( GridState.filterValues("Barcodreo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
         AV10BarCodPar = GridState.filterValues("Barcodpar") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      }
      if ( GridState.getOrderedby() != 0 )
      {
         AV36OrderedBy = GridState.getOrderedby() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
      }
      if ( GridState.getCurrentpage() > 0 )
      {
         GridPageCount = subgrid_fnc_pagecount( ) ;
         if ( ( GridPageCount > 0 ) && ( GridPageCount < GridState.getCurrentpage() ) )
         {
            subgrid_gotopage( GridPageCount) ;
         }
         else
         {
            subgrid_gotopage( ((GridPageCount<0) ? 0 : GridState.getCurrentpage())) ;
         }
      }
   }

   public void subgrid_varstostate( )
   {
      GridState.setCurrentpage( subgrid_fnc_currentpage( ) );
      GridState.setOrderedby( AV36OrderedBy );
      GridState.clearFilterValues();
      GridState.addFilterValue("CliCod", GXutil.str( AV16CliCod, 6, 0));
      GridState.addFilterValue("BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
      GridState.addFilterValue("BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
      GridState.addFilterValue("BarSitfrom", GXutil.str( AV14BarSitfrom, 2, 0));
      GridState.addFilterValue("BarSitto", GXutil.str( AV15BarSitto, 2, 0));
      GridState.addFilterValue("BarCod", GXutil.str( AV9BarCod, 8, 0));
      GridState.addFilterValue("BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
      GridState.addFilterValue("BarCodPar", AV10BarCodPar);
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV94Pgmname = "PedidosClienteSinDetalle.HojadeRuta___WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
      Gx_err = (short)(0) ;
      edtavF_color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF_color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_color_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2CH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e272CH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      GridState.loadGridState();
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV82ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV18DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV90ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Situacionfases_modal_Width = httpContext.cgiGet( "SITUACIONFASES_MODAL_Width") ;
         Situacionfases_modal_Title = httpContext.cgiGet( "SITUACIONFASES_MODAL_Title") ;
         Situacionfases_modal_Confirmtype = httpContext.cgiGet( "SITUACIONFASES_MODAL_Confirmtype") ;
         Situacionfases_modal_Bodytype = httpContext.cgiGet( "SITUACIONFASES_MODAL_Bodytype") ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         }
         else
         {
            AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
         }
         else
         {
            AV11BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
         }
         AV10BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
         }
         else
         {
            AV16CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgenfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGENFROM");
            GX_FocusControl = edtavBarfecgenfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12BarFecGenfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
         }
         else
         {
            AV12BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecgenfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgento_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGENTO");
            GX_FocusControl = edtavBarfecgento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13BarFecGento = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
         }
         else
         {
            AV13BarFecGento = localUtil.ctod( httpContext.cgiGet( edtavBarfecgento_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITFROM");
            GX_FocusControl = edtavBarsitfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14BarSitfrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitfrom), 2, 0));
         }
         else
         {
            AV14BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitfrom), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITTO");
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15BarSitto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarSitto), 2, 0));
         }
         else
         {
            AV15BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarSitto), 2, 0));
         }
         AV79FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79FilterFullText", AV79FilterFullText);
         AV94Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta___WW");
         AV94Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\hojaderuta___ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV9BarCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV11BarCodReo )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPAR"), AV10BarCodPar) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV16CliCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGENFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV12BarFecGenfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGENTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV13BarFecGento)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV14BarSitfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV15BarSitto )
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
      e272CH2 ();
      if (returnInSub) return;
   }

   public void e272CH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgento())) )
      {
         AV12BarFecGenfrom = AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
         AV13BarFecGento = AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgento() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
      }
      else
      {
         if ( (0==AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barcod()) )
         {
            AV12BarFecGenfrom = GXutil.dadd(GXutil.today( ),-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
            AV13BarFecGento = GXutil.today( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
            AV14BarSitfrom = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitfrom), 2, 0));
            AV15BarSitto = (byte)(6) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarSitto), 2, 0));
         }
      }
      GXt_char1 = AV48Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      hojaderuta___ww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV48Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Station", AV48Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48Station, ""))));
      GXv_char5[0] = AV19EmprCod ;
      GXv_char4[0] = AV20EmprNom ;
      GXv_char3[0] = AV70UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV48Station, GXv_char5, GXv_char4, GXv_char3) ;
      hojaderuta___ww_impl.this.AV19EmprCod = GXv_char5[0] ;
      hojaderuta___ww_impl.this.AV20EmprNom = GXv_char4[0] ;
      hojaderuta___ww_impl.this.AV70UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV70UsurCod", AV70UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70UsurCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV30HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Mantenimiento Hoja de Ruta v02", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV36OrderedBy < 1 )
      {
         AV36OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = AV18DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13[0] ;
      AV18DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int6 = (byte)(AV34moda21) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV19EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int7) ;
      hojaderuta___ww_impl.this.GXt_int6 = GXv_int7[0] ;
      AV34moda21 = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34moda21), "ZZZ9")));
      GXt_int6 = (byte)(AV21Ensayos) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV19EmprCod, httpContext.getMessage( "ENS000", ""), GXv_int7) ;
      hojaderuta___ww_impl.this.GXt_int6 = GXv_int7[0] ;
      AV21Ensayos = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Ensayos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Ensayos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Ensayos), "ZZZ9")));
      GXt_char1 = AV40PATHPDF ;
      GXv_char5[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV19EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char5) ;
      hojaderuta___ww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV40PATHPDF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40PATHPDF", AV40PATHPDF);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40PATHPDF, ""))));
      GXt_int6 = (byte)(AV76Enc20c) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV19EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int7) ;
      hojaderuta___ww_impl.this.GXt_int6 = GXv_int7[0] ;
      AV76Enc20c = GXt_int6 ;
      AV72Year = (short)(GXutil.year( Gx_date)) ;
      AV17Day = (byte)(GXutil.day( Gx_date)) ;
      AV35Mounth = (byte)(GXutil.month( Gx_date)) ;
      AV49strDate = localUtil.format( DecimalUtil.doubleToDec(AV72Year), "ZZZ9") + localUtil.format( DecimalUtil.doubleToDec(AV35Mounth), "Z9") + localUtil.format( DecimalUtil.doubleToDec(AV17Day), "Z9") ;
   }

   public void e282CH2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext14[0] = AV71WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext14) ;
      AV71WWPContext = GXv_SdtWWPContext14[0] ;
      if ( AV84ManageFiltersExecutionStep == 1 )
      {
         AV84ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84ManageFiltersExecutionStep", GXutil.str( AV84ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV84ManageFiltersExecutionStep == 2 )
      {
         AV84ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84ManageFiltersExecutionStep", GXutil.str( AV84ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV47Session.getValue("PedidosClienteSinDetalle.HojadeRuta___WWColumnsSelector"), "") != 0 )
      {
         AV88ColumnsSelectorXML = AV47Session.getValue("PedidosClienteSinDetalle.HojadeRuta___WWColumnsSelector") ;
         AV90ColumnsSelector.fromxml(AV88ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtPedidoClie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtBarMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtBarAgrEst_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Visible), 5, 0), !bGXsfl_79_Refreshing);
      chkHayRec.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV90ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "Visible", GXutil.ltrimstr( chkHayRec.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_79_Refreshing);
      edtCliCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Columnheaderclass", edtCliCod_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtCliNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Columnheaderclass", edtCliNom_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtPedidoClie_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Columnheaderclass", edtPedidoClie_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtBarNHdr_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Columnheaderclass", edtBarNHdr_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtBarFecGen_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecGen_Internalname, "Columnheaderclass", edtBarFecGen_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtBarSer_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Columnheaderclass", edtBarSer_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtBarSerDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Columnheaderclass", edtBarSerDsc_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtBarColNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Columnheaderclass", edtBarColNom_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtBarColNum_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Columnheaderclass", edtBarColNum_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtBarSit_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Columnheaderclass", edtBarSit_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtBarMaqCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Columnheaderclass", edtBarMaqCod_Columnheaderclass, !bGXsfl_79_Refreshing);
      edtBarAgrEst_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Columnheaderclass", edtBarAgrEst_Columnheaderclass, !bGXsfl_79_Refreshing);
      chkHayRec.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "Columnheaderclass", chkHayRec.getColumnHeaderClass(), !bGXsfl_79_Refreshing);
      AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV79FilterFullText ;
      AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV63TFCliNom ;
      AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV64TFCliNom_Sel ;
      AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV66TFPedidoCliente ;
      AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV67TFPedidoCliente_Sel ;
      AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV59TFBarSer ;
      AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV60TFBarSer_Sel ;
      AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV61TFBarSerDsc ;
      AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV62TFBarSerDsc_Sel ;
      AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV51TFBarColNom ;
      AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV52TFBarColNom_Sel ;
      AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV53TFBarColNum ;
      AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV54TFBarColNum_To ;
      AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV55TFBarMaqCod ;
      AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV56TFBarMaqCod_Sel ;
      AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV77TFBarAgrEst ;
      AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV78TFBarAgrEst_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90ColumnsSelector", AV90ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ManageFiltersData", AV82ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
   }

   public void e122CH2( )
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
         AV38PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV38PageToGo) ;
      }
   }

   public void e132CH2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142CH2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV36OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
         AV37OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37OrderedDsc", AV37OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV63TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFCliNom", AV63TFCliNom);
            AV64TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliNom_Sel", AV64TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedidoCliente") == 0 )
         {
            AV66TFPedidoCliente = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPedidoCliente", AV66TFPedidoCliente);
            AV67TFPedidoCliente_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPedidoCliente_Sel", AV67TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV59TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFBarSer", AV59TFBarSer);
            AV60TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarSer_Sel", AV60TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV61TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarSerDsc", AV61TFBarSerDsc);
            AV62TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFBarSerDsc_Sel", AV62TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV51TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFBarColNom", AV51TFBarColNom);
            AV52TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFBarColNom_Sel", AV52TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV53TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarColNum), 6, 0));
            AV54TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMaqCod") == 0 )
         {
            AV55TFBarMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarMaqCod", AV55TFBarMaqCod);
            AV56TFBarMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarMaqCod_Sel", AV56TFBarMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrEst") == 0 )
         {
            AV77TFBarAgrEst = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFBarAgrEst", AV77TFBarAgrEst);
            AV78TFBarAgrEst_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFBarAgrEst_Sel", AV78TFBarAgrEst_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e292CH2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Piezas v02", ""), "fa fa-store", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Procesos", ""), "fas fa-industry", "", "", "", "", "", "", ""), (short)(0));
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STDNOR", ""), GXv_int7) ;
         hojaderuta___ww_impl.this.GXt_int6 = GXv_int7[0] ;
         AV50TempBoolean = (boolean)((GXt_int6==1)) ;
         if ( AV50TempBoolean )
         {
            cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Normas Estandares Textil", ""), "fa fa-shapes", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Notas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir HDR", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
         if ( 1 == 2 )
         {
            cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Programas de Tingimento", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREUNI", ""), GXv_int7) ;
         hojaderuta___ww_impl.this.GXt_int6 = GXv_int7[0] ;
         AV50TempBoolean = (boolean)((GXt_int6==1)) ;
         if ( AV50TempBoolean )
         {
            cmbavGridactions.addItem("10", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar Precio", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("11", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("12", GXutil.format( "%1;%2", httpContext.getMessage( "Situacion Fases", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         if ( ( A213BarSit == 1 ) && ( A1923BarCodTN == 1 ) && ( AV21Ensayos == 1 ) )
         {
            AV22F_color = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22F_color), 4, 0));
         }
         else if ( ( A213BarSit == 1 ) && ( A1923BarCodTN != 1 ) && ( AV21Ensayos == 1 ) )
         {
            AV22F_color = (short)(2) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22F_color), 4, 0));
         }
         else
         {
            AV22F_color = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22F_color), 4, 0));
         }
         if ( AV22F_color == 2 )
         {
            cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnWarning WWColumnWarningFirstColumn" );
            edtCliCod_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtCliNom_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarSerDsc_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarSit_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarMaqCod_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarAgrEst_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            chkHayRec.setColumnClass( "WWColumn WWColumnWarning hidden-xs" );
         }
         else if ( AV22F_color == 1 )
         {
            cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnInfo WWColumnInfoFirstColumn" );
            edtCliCod_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtCliNom_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarSerDsc_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarSit_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarMaqCod_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarAgrEst_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            chkHayRec.setColumnClass( "WWColumn WWColumnInfo hidden-xs" );
         }
         else if ( AV22F_color == 0 )
         {
            cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnGray WWColumnGrayFirstColumn" );
            edtCliCod_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtCliNom_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarSerDsc_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarSit_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarMaqCod_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarAgrEst_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            chkHayRec.setColumnClass( "WWColumn WWColumnGray hidden-xs" );
         }
         else
         {
            cmbavGridactions.setColumnClass( httpContext.getMessage( "WWActionGroupColumn", "") );
            edtCliCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtCliNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtPedidoClie_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarNHdr_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarFecGen_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarSer_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarSerDsc_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarColNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarColNum_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarSit_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarMaqCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarAgrEst_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            chkHayRec.setColumnClass( httpContext.getMessage( "WWColumn hidden-xs", "") );
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(79) ;
         }
         sendrow_792( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_79_Refreshing )
      {
         httpContext.doAjaxLoad(79, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV25GridActions, 4, 0)) );
   }

   public void e152CH2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV88ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV90ColumnsSelector.fromJSonString(AV88ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta___WWColumnsSelector", ((GXutil.strcmp("", AV88ColumnsSelectorXML)==0) ? "" : AV90ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90ColumnsSelector", AV90ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ManageFiltersData", AV82ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
   }

   public void e112CH2( )
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
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("PedidosClienteSinDetalle.HojadeRuta___WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV94Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV84ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84ManageFiltersExecutionStep", GXutil.str( AV84ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("PedidosClienteSinDetalle.HojadeRuta___WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV84ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84ManageFiltersExecutionStep", GXutil.str( AV84ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV83ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta___WWFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         hojaderuta___ww_impl.this.GXt_char1 = GXv_char5[0] ;
         AV83ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV83ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV94Pgmname+"GridState", AV83ManageFiltersXml) ;
            AV28GridState.fromxml(AV83ManageFiltersXml, null, null);
            AV36OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
            AV37OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37OrderedDsc", AV37OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S152 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90ColumnsSelector", AV90ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ManageFiltersData", AV82ManageFiltersData);
   }

   public void e302CH2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV25GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 3 )
      {
         /* Execute user subroutine: 'DO PIEZASV02' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 4 )
      {
         /* Execute user subroutine: 'DO PROCESOS' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 5 )
      {
         /* Execute user subroutine: 'DO NORMAS' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 6 )
      {
         /* Execute user subroutine: 'DO NOTAS' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 7 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 8 )
      {
         /* Execute user subroutine: 'DO IMPRIMIRHDR' */
         S272 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 9 )
      {
         /* Execute user subroutine: 'DO PROGRAMATINTE' */
         S282 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 10 )
      {
         /* Execute user subroutine: 'DO MODIFICARPRECIO' */
         S292 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 11 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S302 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 12 )
      {
         /* Execute user subroutine: 'DO SITUACIONFASES' */
         S312 ();
         if (returnInSub) return;
      }
      AV25GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV25GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90ColumnsSelector", AV90ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ManageFiltersData", AV82ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
   }

   public void e162CH2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S322 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90ColumnsSelector", AV90ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ManageFiltersData", AV82ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
   }

   public void e172CH2( )
   {
      /* Situacionfases_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90ColumnsSelector", AV90ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ManageFiltersData", AV82ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
   }

   public void e182CH2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      GXv_char5[0] = AV80ExcelFilename ;
      GXv_char4[0] = AV81ErrorMessage ;
      new app.pedidosclientesindetalle.hojaderuta___wwexport(remoteHandle, context).execute( AV19EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, AV10BarCodPar, AV16CliCod, AV12BarFecGenfrom, AV13BarFecGento, AV14BarSitfrom, AV15BarSitto, GXv_char5, GXv_char4) ;
      hojaderuta___ww_impl.this.AV80ExcelFilename = GXv_char5[0] ;
      hojaderuta___ww_impl.this.AV81ErrorMessage = GXv_char4[0] ;
      if ( GXutil.strcmp(AV80ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV80ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV81ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
   }

   public void e192CH2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta___wwexportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV12BarFecGenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV13BarFecGento)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarSitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarSitto,2,0))}, new String[] {"Emprcod","BarCod","BarCodreo","BarCodpar","BarCodpar","CliCod","BarFecGenfrom","BarFecGento","BarSitfrom","BarSitto"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV36OrderedBy, 4, 0))+":"+(AV37OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV90ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliCod", "", "Cliente", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliNom", "", "Nombre", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNHdr", "", "N° Hdr", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecGen", "", "Fecha Creacion", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSer", "", "Articulo", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSerDsc", "", "Descripcion", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarColNom", "", "Color", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarColNum", "", "Numero", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSit", "", "St", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarMaqCod", "", "Maquina", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAgrEst", "", "A?", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV90ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HayRec", "", "Rct?", true, "") ;
      AV90ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXt_char1 = AV89UserCustomValue ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta___WWColumnsSelector", GXv_char5) ;
      hojaderuta___ww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV89UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV89UserCustomValue)==0) ) )
      {
         AV91ColumnsSelectorAux.fromxml(AV89UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector15[0] = AV91ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector16[0] = AV90ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, GXv_SdtWWPColumnsSelector16) ;
         AV91ColumnsSelectorAux = GXv_SdtWWPColumnsSelector15[0] ;
         AV90ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = AV82ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta___WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[0] ;
      AV82ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV79FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79FilterFullText", AV79FilterFullText);
      AV63TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFCliNom", AV63TFCliNom);
      AV64TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliNom_Sel", AV64TFCliNom_Sel);
      AV66TFPedidoCliente = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFPedidoCliente", AV66TFPedidoCliente);
      AV67TFPedidoCliente_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFPedidoCliente_Sel", AV67TFPedidoCliente_Sel);
      AV59TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFBarSer", AV59TFBarSer);
      AV60TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarSer_Sel", AV60TFBarSer_Sel);
      AV61TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarSerDsc", AV61TFBarSerDsc);
      AV62TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFBarSerDsc_Sel", AV62TFBarSerDsc_Sel);
      AV51TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFBarColNom", AV51TFBarColNom);
      AV52TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFBarColNom_Sel", AV52TFBarColNom_Sel);
      AV53TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarColNum), 6, 0));
      AV54TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum_To), 6, 0));
      AV55TFBarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarMaqCod", AV55TFBarMaqCod);
      AV56TFBarMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarMaqCod_Sel", AV56TFBarMaqCod_Sel);
      AV77TFBarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFBarAgrEst", AV77TFBarAgrEst);
      AV78TFBarAgrEst_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TFBarAgrEst_Sel", AV78TFBarAgrEst_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S202( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO PIEZASV02' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta___piezas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A228BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(A864BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A198BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A166BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(A184BarMtr)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(A120BarAgrEst)),GXutil.URLEncode(GXutil.ltrimstr(A13710HayRec,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","Discod","BarUniMed","BarPes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrEst","Hayrec"}) , new Object[] {});
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
      httpContext.popup(formatLink("app.tdisnor", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) , new Object[] {});
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
      httpContext.popup(formatLink("app.pedidos.disobs__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A209BarPri)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.formatDateParm(A159BarFecGen))}, new String[] {"Mode","EmprCod","DisCod","PriCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S272( )
   {
      /* 'DO IMPRIMIRHDR' Routine */
      returnInSub = false ;
      if ( AV34moda21 == 1 )
      {
         AV73shdr = localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") + "_" + localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") + A130BarCodPar ;
         AV44ReportOutPut = GXutil.format( "%1OS_%2.pdf", AV40PATHPDF, GXutil.trim( AV73shdr), "", "", "", "", "", "", "") ;
         AV23File.setSource( AV44ReportOutPut );
         if ( AV23File.exists() )
         {
            AV23File.delete();
         }
         AV43ReportInPut = GXutil.trim( AV40PATHPDF) ;
         AV74x = (short)(1) ;
         AV45Sdt_MergePDF.clear();
         AV39PathFile = GXutil.format( httpContext.getMessage( "%1Report_%2.pdf", ""), AV43ReportInPut, GXutil.trim( GXutil.str( AV74x, 4, 0)), "", "", "", "", "", "", "") ;
         new app.rhdrmod_txpl1148(remoteHandle, context).execute( AV39PathFile, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV7ImpCod, httpContext.getMessage( "SCR", "")) ;
         AV46Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
         AV46Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV39PathFile );
         AV45Sdt_MergePDF.add(AV46Sdt_MergePDF_Item, 0);
         AV33ListPdfJson = AV45Sdt_MergePDF.toJSonString(false) ;
         AV41PathPDFFull = AV5AppTool.merge(AV33ListPdfJson, AV44ReportOutPut, true) ;
         GXt_char1 = AV32Link ;
         GXv_char5[0] = GXt_char1 ;
         new app.viewfile(remoteHandle, context).execute( AV41PathPDFFull, "", GXv_char5) ;
         hojaderuta___ww_impl.this.GXt_char1 = GXv_char5[0] ;
         AV32Link = GXt_char1 ;
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {AV32Link,httpContext.getMessage( "_blank", "")});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definir el formato¡", ""));
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
      if ( A13710HayRec == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta Hdr, esta en Receta de Tinte. No se permite su eliminacion", ""));
      }
      else
      {
         if ( A213BarSit > 8 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta Hdr, esta CERRADA.No se permite su eliminacion", ""));
         }
         else
         {
            if ( A13930BarAlbUlti > 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta Hdr, esta en el Documento ", "")+localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9")+httpContext.getMessage( ", NO se permite su elimacion", ""));
            }
            else
            {
               if ( ( A213BarSit == 1 ) || ( A213BarSit == 2 ) )
               {
                  Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Desea eliminar el Nº Hdr ", "")+GXutil.str( A129BarCod, 8, 0)+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar+" ?" ;
                  ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
                  AV114Emprcod_selected = A396EmprCod ;
                  AV115Barcod_selected = A129BarCod ;
                  AV116Barcodreo_selected = A132BarCodReo ;
                  AV117Barcodpar_selected = A130BarCodPar ;
                  this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
               }
               else
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "La situacion de la Hdr, ", "")+GXutil.str( A213BarSit, 2, 0)+httpContext.getMessage( " no permite su eliminacion", ""));
               }
            }
         }
      }
   }

   public void S322( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char5[0] = AV19EmprCod ;
      GXv_int19[0] = A129BarCod ;
      GXv_int7[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_int20[0] = A361DisCod ;
      new app.pbordis(remoteHandle, context).execute( GXv_char5, GXv_int19, GXv_int7, GXv_char4, GXv_int20) ;
      hojaderuta___ww_impl.this.AV19EmprCod = GXv_char5[0] ;
      hojaderuta___ww_impl.this.A129BarCod = GXv_int19[0] ;
      hojaderuta___ww_impl.this.A132BarCodReo = GXv_int7[0] ;
      hojaderuta___ww_impl.this.A130BarCodPar = GXv_char4[0] ;
      hojaderuta___ww_impl.this.A361DisCod = GXv_int20[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      AV75Inc_obs = httpContext.getMessage( "->Eliminacion Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( AV19EmprCod, AV94Pgmname, AV70UsurCod, AV48Station, AV75Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      httpContext.doAjaxRefresh();
   }

   public void S312( )
   {
      /* 'DO SITUACIONFASES' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "SITUACIONFASES_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue(AV94Pgmname+"GridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV94Pgmname+"GridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV47Session.getValue(AV94Pgmname+"GridState"), null, null);
      }
      AV36OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
      AV37OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37OrderedDsc", AV37OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV28GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV28GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV28GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV118GXV1 = 1 ;
      while ( AV118GXV1 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV118GXV1));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV79FilterFullText = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79FilterFullText", AV79FilterFullText);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV63TFCliNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFCliNom", AV63TFCliNom);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV64TFCliNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliNom_Sel", AV64TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV66TFPedidoCliente = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPedidoCliente", AV66TFPedidoCliente);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV67TFPedidoCliente_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPedidoCliente_Sel", AV67TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV59TFBarSer = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFBarSer", AV59TFBarSer);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV60TFBarSer_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarSer_Sel", AV60TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV61TFBarSerDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarSerDsc", AV61TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV62TFBarSerDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFBarSerDsc_Sel", AV62TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV51TFBarColNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFBarColNom", AV51TFBarColNom);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV52TFBarColNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFBarColNom_Sel", AV52TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV53TFBarColNum = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarColNum), 6, 0));
            AV54TFBarColNum_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV55TFBarMaqCod = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarMaqCod", AV55TFBarMaqCod);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV56TFBarMaqCod_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarMaqCod_Sel", AV56TFBarMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV77TFBarAgrEst = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFBarAgrEst", AV77TFBarAgrEst);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV78TFBarAgrEst_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFBarAgrEst_Sel", AV78TFBarAgrEst_Sel);
         }
         AV118GXV1 = (int)(AV118GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFCliNom_Sel)==0), AV64TFCliNom_Sel, GXv_char5) ;
      hojaderuta___ww_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char21 = "" ;
      GXv_char4[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFPedidoCliente_Sel)==0), AV67TFPedidoCliente_Sel, GXv_char4) ;
      hojaderuta___ww_impl.this.GXt_char21 = GXv_char4[0] ;
      GXt_char22 = "" ;
      GXv_char3[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFBarSer_Sel)==0), AV60TFBarSer_Sel, GXv_char3) ;
      hojaderuta___ww_impl.this.GXt_char22 = GXv_char3[0] ;
      GXt_char23 = "" ;
      GXv_char2[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFBarSerDsc_Sel)==0), AV62TFBarSerDsc_Sel, GXv_char2) ;
      hojaderuta___ww_impl.this.GXt_char23 = GXv_char2[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFBarColNom_Sel)==0), AV52TFBarColNom_Sel, GXv_char25) ;
      hojaderuta___ww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFBarMaqCod_Sel)==0), AV56TFBarMaqCod_Sel, GXv_char27) ;
      hojaderuta___ww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0), AV78TFBarAgrEst_Sel, GXv_char29) ;
      hojaderuta___ww_impl.this.GXt_char28 = GXv_char29[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char21+"|||"+GXt_char22+"|"+GXt_char23+"|"+GXt_char24+"|||"+GXt_char26+"|"+GXt_char28+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFCliNom)==0), AV63TFCliNom, GXv_char29) ;
      hojaderuta___ww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFPedidoCliente)==0), AV66TFPedidoCliente, GXv_char27) ;
      hojaderuta___ww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFBarSer)==0), AV59TFBarSer, GXv_char25) ;
      hojaderuta___ww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char23 = "" ;
      GXv_char5[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFBarSerDsc)==0), AV61TFBarSerDsc, GXv_char5) ;
      hojaderuta___ww_impl.this.GXt_char23 = GXv_char5[0] ;
      GXt_char22 = "" ;
      GXv_char4[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFBarColNom)==0), AV51TFBarColNom, GXv_char4) ;
      hojaderuta___ww_impl.this.GXt_char22 = GXv_char4[0] ;
      GXt_char21 = "" ;
      GXv_char3[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFBarMaqCod)==0), AV55TFBarMaqCod, GXv_char3) ;
      hojaderuta___ww_impl.this.GXt_char21 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFBarAgrEst)==0), AV77TFBarAgrEst, GXv_char2) ;
      hojaderuta___ww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+GXt_char28+"|"+GXt_char26+"|||"+GXt_char24+"|"+GXt_char23+"|"+GXt_char22+"|"+((0==AV53TFBarColNum) ? "" : GXutil.str( AV53TFBarColNum, 6, 0))+"||"+GXt_char21+"|"+GXt_char1+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||||"+((0==AV54TFBarColNum_To) ? "" : GXutil.str( AV54TFBarColNum_To, 6, 0))+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV28GridState.fromxml(AV47Session.getValue(AV94Pgmname+"GridState"), null, null);
      AV28GridState.setgxTv_SdtWWPGridState_Orderedby( AV36OrderedBy );
      AV28GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV37OrderedDsc );
      AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState30[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV79FilterFullText)==0), (short)(0), AV79FilterFullText, "") ;
      AV28GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFCLINOM", "", !(GXutil.strcmp("", AV63TFCliNom)==0), (short)(0), AV63TFCliNom, "", !(GXutil.strcmp("", AV64TFCliNom_Sel)==0), AV64TFCliNom_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPEDIDOCLIENTE", "", !(GXutil.strcmp("", AV66TFPedidoCliente)==0), (short)(0), AV66TFPedidoCliente, "", !(GXutil.strcmp("", AV67TFPedidoCliente_Sel)==0), AV67TFPedidoCliente_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARSER", "", !(GXutil.strcmp("", AV59TFBarSer)==0), (short)(0), AV59TFBarSer, "", !(GXutil.strcmp("", AV60TFBarSer_Sel)==0), AV60TFBarSer_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARSERDSC", "", !(GXutil.strcmp("", AV61TFBarSerDsc)==0), (short)(0), AV61TFBarSerDsc, "", !(GXutil.strcmp("", AV62TFBarSerDsc_Sel)==0), AV62TFBarSerDsc_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV51TFBarColNom)==0), (short)(0), AV51TFBarColNom, "", !(GXutil.strcmp("", AV52TFBarColNom_Sel)==0), AV52TFBarColNom_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARCOLNUM", "", !((0==AV53TFBarColNum)&&(0==AV54TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV53TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV54TFBarColNum_To, 6, 0))) ;
      AV28GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARMAQCOD", "", !(GXutil.strcmp("", AV55TFBarMaqCod)==0), (short)(0), AV55TFBarMaqCod, "", !(GXutil.strcmp("", AV56TFBarMaqCod_Sel)==0), AV56TFBarMaqCod_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARAGREST", "", !(GXutil.strcmp("", AV77TFBarAgrEst)==0), (short)(0), AV77TFBarAgrEst, "", !(GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0), AV78TFBarAgrEst_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState30[0] ;
      AV28GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV28GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV94Pgmname+"GridState", AV28GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV68TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV68TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV94Pgmname );
      AV68TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV68TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV30HTTPRequest.getScriptName()+"?"+AV30HTTPRequest.getQuerystring() );
      AV68TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PedidosClienteSinDetalle.HojadeRuta_TRN" );
      AV47Session.setValue("TrnContext", AV68TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e202CH2( )
   {
      /* Barcod_Isvalid Routine */
      returnInSub = false ;
      if ( AV9BarCod > 0 )
      {
         AV12BarFecGenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
         AV13BarFecGento = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
         AV6BarFecGen = GXutil.nullDate() ;
         AV12BarFecGenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
         AV13BarFecGento = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
         AV14BarSitfrom = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitfrom), 2, 0));
         AV15BarSitto = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarSitto), 2, 0));
         AV16CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
      }
      else
      {
         AV12BarFecGenfrom = GXutil.dadd(GXutil.today( ),-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
         AV6BarFecGen = GXutil.dadd(GXutil.today( ),-(30)) ;
         AV13BarFecGento = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
         AV14BarSitfrom = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitfrom), 2, 0));
         AV15BarSitto = (byte)(6) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarSitto), 2, 0));
      }
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24FilterHojadeRuta__WW", AV24FilterHojadeRuta__WW);
   }

   public void e212CH2( )
   {
      /* Barcod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV9BarCod > 0 )
      {
         AV12BarFecGenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
         AV13BarFecGento = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
         AV14BarSitfrom = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitfrom), 2, 0));
         AV15BarSitto = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarSitto), 2, 0));
         AV16CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
      }
      else
      {
         AV12BarFecGenfrom = GXutil.dadd(GXutil.today( ),-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
         AV13BarFecGento = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
         AV14BarSitfrom = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitfrom), 2, 0));
         AV15BarSitto = (byte)(6) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarSitto), 2, 0));
      }
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24FilterHojadeRuta__WW", AV24FilterHojadeRuta__WW);
   }

   public void e222CH2( )
   {
      /* Clicod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24FilterHojadeRuta__WW", AV24FilterHojadeRuta__WW);
   }

   public void e232CH2( )
   {
      /* Barfecgenfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24FilterHojadeRuta__WW", AV24FilterHojadeRuta__WW);
   }

   public void e242CH2( )
   {
      /* Barfecgento_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24FilterHojadeRuta__WW", AV24FilterHojadeRuta__WW);
   }

   public void e252CH2( )
   {
      /* Barsitfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24FilterHojadeRuta__WW", AV24FilterHojadeRuta__WW);
   }

   public void e262CH2( )
   {
      /* Barsitto_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24FilterHojadeRuta__WW", AV24FilterHojadeRuta__WW);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV24FilterHojadeRuta__WW.fromJSonString(AV8WebSession.getValue(httpContext.getMessage( "FilterHojadeRuta__WW", "")), null);
      AV16CliCod = AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Clicod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
      AV9BarCod = AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barcod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
      AV11BarCodReo = AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barcodreo() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
      AV10BarCodPar = AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barcodpar() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      AV12BarFecGenfrom = AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarFecGenfrom", localUtil.format(AV12BarFecGenfrom, "99/99/99"));
      AV13BarFecGento = AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgento() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarFecGento", localUtil.format(AV13BarFecGento, "99/99/99"));
      AV14BarSitfrom = AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barsitfrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitfrom), 2, 0));
      AV15BarSitto = AV24FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barsitto() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarSitto), 2, 0));
   }

   public void S332( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV24FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Clicod( AV16CliCod );
      AV24FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barcod( AV9BarCod );
      AV24FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barcodreo( AV11BarCodReo );
      AV24FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barcodpar( AV10BarCodPar );
      AV24FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom( AV12BarFecGenfrom );
      AV24FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barfecgento( AV13BarFecGento );
      AV24FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barsitfrom( AV14BarSitfrom );
      AV24FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barsitto( AV15BarSitto );
      AV8WebSession.setValue(httpContext.getMessage( "FilterHojadeRuta__WW", ""), AV24FilterHojadeRuta__WW.toJSonString(false, true));
   }

   public void wb_table3_133_2CH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablesituacionfases_modal_Internalname, tblTablesituacionfases_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucSituacionfases_modal.setProperty("Width", Situacionfases_modal_Width);
         ucSituacionfases_modal.setProperty("Title", Situacionfases_modal_Title);
         ucSituacionfases_modal.setProperty("ConfirmType", Situacionfases_modal_Confirmtype);
         ucSituacionfases_modal.setProperty("BodyType", Situacionfases_modal_Bodytype);
         ucSituacionfases_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Situacionfases_modal_Internalname, "SITUACIONFASES_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"SITUACIONFASES_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_133_2CH2e( true) ;
      }
      else
      {
         wb_table3_133_2CH2e( false) ;
      }
   }

   public void wb_table2_128_2CH2( boolean wbgen )
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
         wb_table2_128_2CH2e( true) ;
      }
      else
      {
         wb_table2_128_2CH2e( false) ;
      }
   }

   public void wb_table1_61_2CH2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV82ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_66_2CH2( true) ;
      }
      else
      {
         wb_table4_66_2CH2( false) ;
      }
      return  ;
   }

   public void wb_table4_66_2CH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_61_2CH2e( true) ;
      }
      else
      {
         wb_table1_61_2CH2e( false) ;
      }
   }

   public void wb_table4_66_2CH2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV79FilterFullText, GXutil.rtrim( localUtil.format( AV79FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_66_2CH2e( true) ;
      }
      else
      {
         wb_table4_66_2CH2e( false) ;
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
      pa2CH2( ) ;
      ws2CH2( ) ;
      we2CH2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269291442575", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta___ww.js", "?20269291442575", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_792( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_79_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_79_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_79_idx ;
      edtPedidoClie_Internalname = "PEDIDOCLIE_"+sGXsfl_79_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_79_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_79_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_79_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_79_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_79_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_79_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_79_idx ;
      edtBarMaqCod_Internalname = "BARMAQCOD_"+sGXsfl_79_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_79_idx ;
      chkHayRec.setInternalname( "HAYREC_"+sGXsfl_79_idx );
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_79_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_79_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_79_idx ;
      edtBarTipDis_Internalname = "BARTIPDIS_"+sGXsfl_79_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_79_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_79_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_79_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_79_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_79_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_79_idx ;
      chkBarAcc.setInternalname( "BARACC_"+sGXsfl_79_idx );
      edtE_Barser_Internalname = "E_BARSER_"+sGXsfl_79_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_79_idx ;
      edtBarUniMed_Internalname = "BARUNIMED_"+sGXsfl_79_idx ;
      edtBarPes_Internalname = "BARPES_"+sGXsfl_79_idx ;
      edtBarPri_Internalname = "BARPRI_"+sGXsfl_79_idx ;
      edtavF_color_Internalname = "vF_COLOR_"+sGXsfl_79_idx ;
      edtBarCodTN_Internalname = "BARCODTN_"+sGXsfl_79_idx ;
      edtBarAlbUlti_Internalname = "BARALBULTI_"+sGXsfl_79_idx ;
   }

   public void subsflControlProps_fel_792( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_79_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_79_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_79_fel_idx ;
      edtPedidoClie_Internalname = "PEDIDOCLIE_"+sGXsfl_79_fel_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_79_fel_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_79_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_79_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_79_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_79_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_79_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_79_fel_idx ;
      edtBarMaqCod_Internalname = "BARMAQCOD_"+sGXsfl_79_fel_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_79_fel_idx ;
      chkHayRec.setInternalname( "HAYREC_"+sGXsfl_79_fel_idx );
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_79_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_79_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_79_fel_idx ;
      edtBarTipDis_Internalname = "BARTIPDIS_"+sGXsfl_79_fel_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_79_fel_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_79_fel_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_79_fel_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_79_fel_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_79_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_79_fel_idx ;
      chkBarAcc.setInternalname( "BARACC_"+sGXsfl_79_fel_idx );
      edtE_Barser_Internalname = "E_BARSER_"+sGXsfl_79_fel_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_79_fel_idx ;
      edtBarUniMed_Internalname = "BARUNIMED_"+sGXsfl_79_fel_idx ;
      edtBarPes_Internalname = "BARPES_"+sGXsfl_79_fel_idx ;
      edtBarPri_Internalname = "BARPRI_"+sGXsfl_79_fel_idx ;
      edtavF_color_Internalname = "vF_COLOR_"+sGXsfl_79_fel_idx ;
      edtBarCodTN_Internalname = "BARCODTN_"+sGXsfl_79_fel_idx ;
      edtBarAlbUlti_Internalname = "BARALBULTI_"+sGXsfl_79_fel_idx ;
   }

   public void sendrow_792( )
   {
      subsflControlProps_792( ) ;
      wb2CH0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_79_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_79_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_79_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_79_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV25GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV25GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV25GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_79_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,80);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV25GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_79_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCod_Columnclass,edtCliCod_Columnheaderclass,Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliNom_Columnclass,edtCliNom_Columnheaderclass,Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPedidoClie_Columnclass,edtPedidoClie_Columnheaderclass,Integer.valueOf(edtPedidoClie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNHdr_Columnclass,edtBarNHdr_Columnheaderclass,Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarFecGen_Columnclass,edtBarFecGen_Columnheaderclass,Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarSer_Columnclass,edtBarSer_Columnheaderclass,Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarSerDsc_Columnclass,edtBarSerDsc_Columnheaderclass,Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarColNom_Columnclass,edtBarColNom_Columnheaderclass,Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarColNum_Columnclass,edtBarColNum_Columnheaderclass,Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarSit_Columnclass,edtBarSit_Columnheaderclass,Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMaqCod_Internalname,GXutil.rtrim( A180BarMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarMaqCod_Columnclass,edtBarMaqCod_Columnheaderclass,Integer.valueOf(edtBarMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrEst_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrEst_Internalname,GXutil.rtrim( A120BarAgrEst),GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarAgrEst_Columnclass,edtBarAgrEst_Columnheaderclass,Integer.valueOf(edtBarAgrEst_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkHayRec.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "HAYREC_" + sGXsfl_79_idx ;
         chkHayRec.setName( GXCCtl );
         chkHayRec.setWebtags( "" );
         chkHayRec.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "TitleCaption", chkHayRec.getCaption(), !bGXsfl_79_Refreshing);
         chkHayRec.setCheckedValue( "0" );
         A13710HayRec = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkHayRec.getInternalname(),GXutil.str( A13710HayRec, 1, 0),"","",Integer.valueOf(chkHayRec.getVisible()),Integer.valueOf(0),"1","",StyleString,ClassString,chkHayRec.getColumnClass(),chkHayRec.getColumnHeaderClass(),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipDis_Internalname,GXutil.rtrim( A2010BarTipDis),GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARACC_" + sGXsfl_79_idx ;
         chkBarAcc.setName( GXCCtl );
         chkBarAcc.setWebtags( "" );
         chkBarAcc.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "TitleCaption", chkBarAcc.getCaption(), !bGXsfl_79_Refreshing);
         chkBarAcc.setCheckedValue( "N" );
         A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarAcc.getInternalname(),A5253BarAcc,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtE_Barser_Internalname,GXutil.ltrim( localUtil.ntoc( A14007E_Barser, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14007E_Barser), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtE_Barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarUniMed_Internalname,GXutil.rtrim( A228BarUniMed),GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPes_Internalname,GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPri_Internalname,GXutil.rtrim( A209BarPri),GXutil.rtrim( localUtil.format( A209BarPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavF_color_Enabled!=0)&&(edtavF_color_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavF_color_Internalname,GXutil.ltrim( localUtil.ntoc( AV22F_color, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavF_color_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22F_color), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22F_color), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavF_color_Enabled!=0)&&(edtavF_color_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavF_color_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavF_color_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodTN_Internalname,GXutil.ltrim( localUtil.ntoc( A1923BarCodTN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1923BarCodTN), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodTN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbUlti_Internalname,GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbUlti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2CH2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_79_idx = ((subGrid_Islastpage==1)&&(nGXsfl_79_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
      /* End function sendrow_792 */
   }

   public void startgridcontrol79( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"79\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "St", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrEst_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkHayRec.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rct?", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25GridActions, (byte)(4), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A120BarAgrEst));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarAgrEst_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarAgrEst_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrEst_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkHayRec.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkHayRec.getColumnHeaderClass()));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2010BarTipDis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22F_color, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavF_color_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1923BarCodTN, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), ".", "")));
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavBarfecgenfrom_Internalname = "vBARFECGENFROM" ;
      edtavBarfecgento_Internalname = "vBARFECGENTO" ;
      edtavBarsitfrom_Internalname = "vBARSITFROM" ;
      edtavBarsitto_Internalname = "vBARSITTO" ;
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
      edtBarFecGen_Internalname = "BARFECGEN" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtBarMaqCod_Internalname = "BARMAQCOD" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      chkHayRec.setInternalname( "HAYREC" );
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarTipDis_Internalname = "BARTIPDIS" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtBarKgm_Internalname = "BARKGM" ;
      edtBarMtr_Internalname = "BARMTR" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      chkBarAcc.setInternalname( "BARACC" );
      edtE_Barser_Internalname = "E_BARSER" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      edtBarPes_Internalname = "BARPES" ;
      edtBarPri_Internalname = "BARPRI" ;
      edtavF_color_Internalname = "vF_COLOR" ;
      edtBarCodTN_Internalname = "BARCODTN" ;
      edtBarAlbUlti_Internalname = "BARALBULTI" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Situacionfases_modal_Internalname = "SITUACIONFASES_MODAL" ;
      tblTablesituacionfases_modal_Internalname = "TABLESITUACIONFASES_MODAL" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
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
      edtBarAlbUlti_Jsonclick = "" ;
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
      edtEmprCod_Jsonclick = "" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarPie_Jsonclick = "" ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarTipDis_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      chkHayRec.setCaption( "" );
      chkHayRec.setColumnClass( "WWColumn hidden-xs" );
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Columnclass = "WWColumn hidden-xs" ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarMaqCod_Columnclass = "WWColumn hidden-xs" ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Columnclass = "WWColumn hidden-xs" ;
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
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Columnclass = "WWColumn hidden-xs" ;
      edtPedidoClie_Jsonclick = "" ;
      edtPedidoClie_Columnclass = "WWColumn hidden-xs" ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Columnclass = "WWColumn hidden-xs" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Columnclass = "WWColumn hidden-xs" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkHayRec.setColumnHeaderClass( "" );
      edtBarAgrEst_Columnheaderclass = "" ;
      edtBarMaqCod_Columnheaderclass = "" ;
      edtBarSit_Columnheaderclass = "" ;
      edtBarColNum_Columnheaderclass = "" ;
      edtBarColNom_Columnheaderclass = "" ;
      edtBarSerDsc_Columnheaderclass = "" ;
      edtBarSer_Columnheaderclass = "" ;
      edtBarFecGen_Columnheaderclass = "" ;
      edtBarNHdr_Columnheaderclass = "" ;
      edtPedidoClie_Columnheaderclass = "" ;
      edtCliNom_Columnheaderclass = "" ;
      edtCliCod_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      chkHayRec.setVisible( -1 );
      edtBarAgrEst_Visible = -1 ;
      edtBarMaqCod_Visible = -1 ;
      edtBarSit_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
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
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;R;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Situacionfases_modal_Bodytype = "WebComponent" ;
      Situacionfases_modal_Confirmtype = "" ;
      Situacionfases_modal_Title = httpContext.getMessage( "Consulta de Fases Produccion", "") ;
      Situacionfases_modal_Width = "1500" ;
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
      Ddo_grid_Datalistproc = "PedidosClienteSinDetalle.HojadeRuta___WWGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|||Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "|T|T|||T|T|T|||T|T|" ;
      Ddo_grid_Filterisrange = "||||||||T||||" ;
      Ddo_grid_Filtertype = "|Character|Character|||Character|Character|Character|Numeric||Character|Character|" ;
      Ddo_grid_Includefilter = "|T|T|||T|T|T|T||T|T|" ;
      Ddo_grid_Fixable = "T|T|T|T|T|T|T|T|T|T|T||T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3||4|5|6|7|8|9|10|11|12|" ;
      Ddo_grid_Columnids = "1:CliCod|2:CliNom|3:PedidoCliente|4:BarNHdr|5:BarFecGen|6:BarSer|7:BarSerDsc|8:BarColNom|9:BarColNum|10:BarSit|11:BarMaqCod|12:BarAgrEst|13:HayRec" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Hoja de Ruta v02", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_79_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV25GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV25GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridActions), 4, 0));
      }
      GXCCtl = "HAYREC_" + sGXsfl_79_idx ;
      chkHayRec.setName( GXCCtl );
      chkHayRec.setWebtags( "" );
      chkHayRec.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "TitleCaption", chkHayRec.getCaption(), !bGXsfl_79_Refreshing);
      chkHayRec.setCheckedValue( "0" );
      A13710HayRec = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      GXCCtl = "BARACC_" + sGXsfl_79_idx ;
      chkBarAcc.setName( GXCCtl );
      chkBarAcc.setWebtags( "" );
      chkBarAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "TitleCaption", chkBarAcc.getCaption(), !bGXsfl_79_Refreshing);
      chkBarAcc.setCheckedValue( "N" );
      A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV82ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122CH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132CH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142CH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e292CH2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9',hsh:true},{av:'A1923BarCodTN',fld:'BARCODTN',pic:'ZZZZZ9'},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV25GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV22F_color',fld:'vF_COLOR',pic:'ZZZ9'},{av:'edtCliCod_Columnclass',ctrl:'CLICOD',prop:'Columnclass'},{av:'edtCliNom_Columnclass',ctrl:'CLINOM',prop:'Columnclass'},{av:'edtPedidoClie_Columnclass',ctrl:'PEDIDOCLIE',prop:'Columnclass'},{av:'edtBarNHdr_Columnclass',ctrl:'BARNHDR',prop:'Columnclass'},{av:'edtBarFecGen_Columnclass',ctrl:'BARFECGEN',prop:'Columnclass'},{av:'edtBarSer_Columnclass',ctrl:'BARSER',prop:'Columnclass'},{av:'edtBarSerDsc_Columnclass',ctrl:'BARSERDSC',prop:'Columnclass'},{av:'edtBarColNom_Columnclass',ctrl:'BARCOLNOM',prop:'Columnclass'},{av:'edtBarColNum_Columnclass',ctrl:'BARCOLNUM',prop:'Columnclass'},{av:'edtBarSit_Columnclass',ctrl:'BARSIT',prop:'Columnclass'},{av:'edtBarMaqCod_Columnclass',ctrl:'BARMAQCOD',prop:'Columnclass'},{av:'edtBarAgrEst_Columnclass',ctrl:'BARAGREST',prop:'Columnclass'},{av:'chkHayRec.getColumnClass()',ctrl:'HAYREC',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152CH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV82ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112CH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV82ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e302CH2',iparms:[{av:'cmbavGridactions'},{av:'AV25GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!',hsh:true},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9',hsh:true},{av:'A212BarSer',fld:'BARSER',pic:'',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:'',hsh:true},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9',hsh:true},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:'',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!',hsh:true},{av:'A13710HayRec',fld:'HAYREC',pic:'9',hsh:true},{av:'A209BarPri',fld:'BARPRI',pic:'9',hsh:true},{av:'A159BarFecGen',fld:'BARFECGEN',pic:'',hsh:true},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV25GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV82ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e162CH2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV82ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE","{handler:'e172CH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true}]");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE",",oparms:[{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV82ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e182CH2',iparms:[{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e192CH2',iparms:[{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV84ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV90ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV64TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV67TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV59TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV60TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV61TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV62TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV56TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV77TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV78TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV7ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV48Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VBARCOD.ISVALID","{handler:'e202CH2',iparms:[{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARCOD.ISVALID",",oparms:[{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VBARCOD.CONTROLVALUECHANGED","{handler:'e212CH2',iparms:[{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED","{handler:'e222CH2',iparms:[{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED",",oparms:[{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VBARFECGENFROM.CONTROLVALUECHANGED","{handler:'e232CH2',iparms:[{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARFECGENFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VBARFECGENTO.CONTROLVALUECHANGED","{handler:'e242CH2',iparms:[{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARFECGENTO.CONTROLVALUECHANGED",",oparms:[{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VBARSITFROM.CONTROLVALUECHANGED","{handler:'e252CH2',iparms:[{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARSITFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VBARSITTO.CONTROLVALUECHANGED","{handler:'e262CH2',iparms:[{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV13BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV14BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV15BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARSITTO.CONTROLVALUECHANGED",",oparms:[{av:'AV24FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARNHDR","{handler:'valid_Barnhdr',iparms:[]");
      setEventMetadata("VALID_BARNHDR",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
      setEventMetadata("VALID_BARMAQCOD","{handler:'valid_Barmaqcod',iparms:[]");
      setEventMetadata("VALID_BARMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_BARAGREST","{handler:'valid_Baragrest',iparms:[]");
      setEventMetadata("VALID_BARAGREST",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Baralbulti',iparms:[]");
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
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV10BarCodPar = "" ;
      AV12BarFecGenfrom = GXutil.nullDate() ;
      AV13BarFecGento = GXutil.nullDate() ;
      AV19EmprCod = "" ;
      AV90ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV79FilterFullText = "" ;
      AV63TFCliNom = "" ;
      AV64TFCliNom_Sel = "" ;
      AV66TFPedidoCliente = "" ;
      AV67TFPedidoCliente_Sel = "" ;
      AV59TFBarSer = "" ;
      AV60TFBarSer_Sel = "" ;
      AV61TFBarSerDsc = "" ;
      AV62TFBarSerDsc_Sel = "" ;
      AV51TFBarColNom = "" ;
      AV52TFBarColNom_Sel = "" ;
      AV55TFBarMaqCod = "" ;
      AV56TFBarMaqCod_Sel = "" ;
      AV77TFBarAgrEst = "" ;
      AV78TFBarAgrEst_Sel = "" ;
      AV94Pgmname = "" ;
      Gx_mode = "" ;
      AV40PATHPDF = "" ;
      AV7ImpCod = "" ;
      AV70UsurCod = "" ;
      AV48Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV82ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV18DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24FilterHojadeRuta__WW = new app.pedidosclientesindetalle.SdtFilterHojadeRuta__WW(remoteHandle, context);
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
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      A130BarCodPar = "" ;
      A2010BarTipDis = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A5253BarAcc = "" ;
      A228BarUniMed = "" ;
      A209BarPri = "" ;
      GridState = new com.genexus.webpanels.gridstate.GXGridStateHandler(context,"Grid",getPgmname(),this,"subgrid_varsfromstate","subgrid_varstostate") ;
      Gx_date = GXutil.nullDate() ;
      AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = "" ;
      AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = "" ;
      AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = "" ;
      AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = "" ;
      AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = "" ;
      AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = "" ;
      AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = "" ;
      AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = "" ;
      AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = "" ;
      AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = "" ;
      AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = "" ;
      AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = "" ;
      AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = "" ;
      AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = "" ;
      AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = "" ;
      scmdbuf = "" ;
      lV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = "" ;
      lV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = "" ;
      lV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = "" ;
      lV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = "" ;
      lV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = "" ;
      lV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = "" ;
      lV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = "" ;
      H02CH3_A3594BarPriTin = new byte[1] ;
      H02CH3_A2265BarExt = new byte[1] ;
      H02CH3_n2265BarExt = new boolean[] {false} ;
      H02CH3_A1923BarCodTN = new int[1] ;
      H02CH3_A209BarPri = new String[] {""} ;
      H02CH3_A864BarPes = new short[1] ;
      H02CH3_A228BarUniMed = new String[] {""} ;
      H02CH3_A361DisCod = new int[1] ;
      H02CH3_A5253BarAcc = new String[] {""} ;
      H02CH3_A1235BarNumCli = new int[1] ;
      H02CH3_A1234BarNomCli = new String[] {""} ;
      H02CH3_A2010BarTipDis = new String[] {""} ;
      H02CH3_A120BarAgrEst = new String[] {""} ;
      H02CH3_A180BarMaqCod = new String[] {""} ;
      H02CH3_A213BarSit = new byte[1] ;
      H02CH3_A136BarColNum = new int[1] ;
      H02CH3_A135BarColNom = new String[] {""} ;
      H02CH3_A1652BarSerDsc = new String[] {""} ;
      H02CH3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H02CH3_A13696BarNHdr = new String[] {""} ;
      H02CH3_A279CliNom = new String[] {""} ;
      H02CH3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CH3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CH3_A143BarDisNum = new String[] {""} ;
      H02CH3_A4812BarEncCli = new String[] {""} ;
      H02CH3_A199BarPie1 = new short[1] ;
      H02CH3_A365DisDes = new String[] {""} ;
      H02CH3_A898BarPieNDes = new int[1] ;
      H02CH3_A212BarSer = new String[] {""} ;
      H02CH3_A252CliCod = new int[1] ;
      H02CH3_n252CliCod = new boolean[] {false} ;
      H02CH3_A130BarCodPar = new String[] {""} ;
      H02CH3_A132BarCodReo = new byte[1] ;
      H02CH3_A129BarCod = new int[1] ;
      H02CH3_A396EmprCod = new String[] {""} ;
      H02CH5_A3594BarPriTin = new byte[1] ;
      H02CH5_A2265BarExt = new byte[1] ;
      H02CH5_n2265BarExt = new boolean[] {false} ;
      H02CH5_A1923BarCodTN = new int[1] ;
      H02CH5_A209BarPri = new String[] {""} ;
      H02CH5_A864BarPes = new short[1] ;
      H02CH5_A228BarUniMed = new String[] {""} ;
      H02CH5_A361DisCod = new int[1] ;
      H02CH5_A5253BarAcc = new String[] {""} ;
      H02CH5_A1235BarNumCli = new int[1] ;
      H02CH5_A1234BarNomCli = new String[] {""} ;
      H02CH5_A2010BarTipDis = new String[] {""} ;
      H02CH5_A120BarAgrEst = new String[] {""} ;
      H02CH5_A180BarMaqCod = new String[] {""} ;
      H02CH5_A213BarSit = new byte[1] ;
      H02CH5_A136BarColNum = new int[1] ;
      H02CH5_A135BarColNom = new String[] {""} ;
      H02CH5_A1652BarSerDsc = new String[] {""} ;
      H02CH5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H02CH5_A13696BarNHdr = new String[] {""} ;
      H02CH5_A279CliNom = new String[] {""} ;
      H02CH5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CH5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CH5_A143BarDisNum = new String[] {""} ;
      H02CH5_A4812BarEncCli = new String[] {""} ;
      H02CH5_A199BarPie1 = new short[1] ;
      H02CH5_A365DisDes = new String[] {""} ;
      H02CH5_A898BarPieNDes = new int[1] ;
      H02CH5_A212BarSer = new String[] {""} ;
      H02CH5_A252CliCod = new int[1] ;
      H02CH5_n252CliCod = new boolean[] {false} ;
      H02CH5_A130BarCodPar = new String[] {""} ;
      H02CH5_A132BarCodReo = new byte[1] ;
      H02CH5_A129BarCod = new int[1] ;
      H02CH5_A396EmprCod = new String[] {""} ;
      GXv_int9 = new short[1] ;
      GXv_int11 = new long[1] ;
      hsh = "" ;
      AV20EmprNom = "" ;
      AV30HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV49strDate = "" ;
      AV71WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext14 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV88ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV83ManageFiltersXml = "" ;
      AV80ExcelFilename = "" ;
      AV81ErrorMessage = "" ;
      AV89UserCustomValue = "" ;
      AV91ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = new GXBaseCollection[1] ;
      AV73shdr = "" ;
      AV44ReportOutPut = "" ;
      AV23File = new com.genexus.util.GXFile();
      AV43ReportInPut = "" ;
      AV45Sdt_MergePDF = new GXBaseCollection<app.SdtSdt_MergePDF_PDF>(app.SdtSdt_MergePDF_PDF.class, "PDF", "TexplusNET", remoteHandle);
      AV39PathFile = "" ;
      AV46Sdt_MergePDF_Item = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV33ListPdfJson = "" ;
      AV41PathPDFFull = "" ;
      AV5AppTool = new app.SdtAppTool(remoteHandle, context);
      AV32Link = "" ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      AV114Emprcod_selected = "" ;
      AV117Barcodpar_selected = "" ;
      GXv_int19 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int20 = new int[1] ;
      AV75Inc_obs = "" ;
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char28 = "" ;
      GXv_char29 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState30 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV68TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV6BarFecGen = GXutil.nullDate() ;
      AV8WebSession = httpContext.getWebSession();
      ucSituacionfases_modal = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta___ww__default(),
         new Object[] {
             new Object[] {
            H02CH3_A3594BarPriTin, H02CH3_A2265BarExt, H02CH3_n2265BarExt, H02CH3_A1923BarCodTN, H02CH3_A209BarPri, H02CH3_A864BarPes, H02CH3_A228BarUniMed, H02CH3_A361DisCod, H02CH3_A5253BarAcc, H02CH3_A1235BarNumCli,
            H02CH3_A1234BarNomCli, H02CH3_A2010BarTipDis, H02CH3_A120BarAgrEst, H02CH3_A180BarMaqCod, H02CH3_A213BarSit, H02CH3_A136BarColNum, H02CH3_A135BarColNom, H02CH3_A1652BarSerDsc, H02CH3_A159BarFecGen, H02CH3_A13696BarNHdr,
            H02CH3_A279CliNom, H02CH3_A184BarMtr, H02CH3_A166BarKgm, H02CH3_A143BarDisNum, H02CH3_A4812BarEncCli, H02CH3_A199BarPie1, H02CH3_A365DisDes, H02CH3_A898BarPieNDes, H02CH3_A212BarSer, H02CH3_A252CliCod,
            H02CH3_n252CliCod, H02CH3_A130BarCodPar, H02CH3_A132BarCodReo, H02CH3_A129BarCod, H02CH3_A396EmprCod
            }
            , new Object[] {
            H02CH5_A3594BarPriTin, H02CH5_A2265BarExt, H02CH5_n2265BarExt, H02CH5_A1923BarCodTN, H02CH5_A209BarPri, H02CH5_A864BarPes, H02CH5_A228BarUniMed, H02CH5_A361DisCod, H02CH5_A5253BarAcc, H02CH5_A1235BarNumCli,
            H02CH5_A1234BarNomCli, H02CH5_A2010BarTipDis, H02CH5_A120BarAgrEst, H02CH5_A180BarMaqCod, H02CH5_A213BarSit, H02CH5_A136BarColNum, H02CH5_A135BarColNom, H02CH5_A1652BarSerDsc, H02CH5_A159BarFecGen, H02CH5_A13696BarNHdr,
            H02CH5_A279CliNom, H02CH5_A184BarMtr, H02CH5_A166BarKgm, H02CH5_A143BarDisNum, H02CH5_A4812BarEncCli, H02CH5_A199BarPie1, H02CH5_A365DisDes, H02CH5_A898BarPieNDes, H02CH5_A212BarSer, H02CH5_A252CliCod,
            H02CH5_n252CliCod, H02CH5_A130BarCodPar, H02CH5_A132BarCodReo, H02CH5_A129BarCod, H02CH5_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV94Pgmname = "PedidosClienteSinDetalle.HojadeRuta___WW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV94Pgmname = "PedidosClienteSinDetalle.HojadeRuta___WW" ;
      Gx_err = (short)(0) ;
      edtavF_color_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11BarCodReo ;
   private byte AV14BarSitfrom ;
   private byte AV15BarSitto ;
   private byte AV84ManageFiltersExecutionStep ;
   private byte A3594BarPriTin ;
   private byte A2265BarExt ;
   private byte gxajaxcallmode ;
   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV17Day ;
   private byte AV35Mounth ;
   private byte GXt_int6 ;
   private byte AV116Barcodreo_selected ;
   private byte GXv_int7[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV36OrderedBy ;
   private short AV21Ensayos ;
   private short AV34moda21 ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV25GridActions ;
   private short A14007E_Barser ;
   private short A864BarPes ;
   private short AV22F_color ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private short AV76Enc20c ;
   private short AV72Year ;
   private short AV74x ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_79 ;
   private int nGXsfl_79_idx=1 ;
   private int AV9BarCod ;
   private int AV16CliCod ;
   private int AV53TFBarColNum ;
   private int AV54TFBarColNum_To ;
   private int A898BarPieNDes ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavBarfecgenfrom_Enabled ;
   private int edtavBarfecgento_Enabled ;
   private int edtavBarsitfrom_Enabled ;
   private int edtavBarsitto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A1235BarNumCli ;
   private int A198BarPie ;
   private int A361DisCod ;
   private int A1923BarCodTN ;
   private int subGrid_Islastpage ;
   private int edtavF_color_Enabled ;
   private int AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ;
   private int AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ;
   private int GridPageCount ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtPedidoClie_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarSit_Visible ;
   private int edtBarMaqCod_Visible ;
   private int edtBarAgrEst_Visible ;
   private int AV38PageToGo ;
   private int AV115Barcod_selected ;
   private int GXv_int19[] ;
   private int GXv_int20[] ;
   private int AV118GXV1 ;
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
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long A13930BarAlbUlti ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXt_int10 ;
   private long GXv_int11[] ;
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
   private String sGXsfl_79_idx="0001" ;
   private String AV10BarCodPar ;
   private String AV19EmprCod ;
   private String AV63TFCliNom ;
   private String AV64TFCliNom_Sel ;
   private String AV66TFPedidoCliente ;
   private String AV67TFPedidoCliente_Sel ;
   private String AV59TFBarSer ;
   private String AV60TFBarSer_Sel ;
   private String AV61TFBarSerDsc ;
   private String AV62TFBarSerDsc_Sel ;
   private String AV51TFBarColNom ;
   private String AV52TFBarColNom_Sel ;
   private String AV55TFBarMaqCod ;
   private String AV56TFBarMaqCod_Sel ;
   private String AV77TFBarAgrEst ;
   private String AV78TFBarAgrEst_Sel ;
   private String AV94Pgmname ;
   private String Gx_mode ;
   private String AV7ImpCod ;
   private String AV70UsurCod ;
   private String AV48Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Situacionfases_modal_Width ;
   private String Situacionfases_modal_Title ;
   private String Situacionfases_modal_Confirmtype ;
   private String Situacionfases_modal_Bodytype ;
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
   private String divUnnamedtable1_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavBarfecgenfrom_Internalname ;
   private String edtavBarfecgenfrom_Jsonclick ;
   private String edtavBarfecgento_Internalname ;
   private String edtavBarfecgento_Jsonclick ;
   private String edtavBarsitfrom_Internalname ;
   private String edtavBarsitfrom_Jsonclick ;
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
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
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
   private String edtBarFecGen_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarSit_Internalname ;
   private String A180BarMaqCod ;
   private String edtBarMaqCod_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A2010BarTipDis ;
   private String edtBarTipDis_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarNumCli_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
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
   private String edtBarAlbUlti_Internalname ;
   private String AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ;
   private String AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ;
   private String AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ;
   private String AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ;
   private String AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ;
   private String AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ;
   private String AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ;
   private String AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ;
   private String AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ;
   private String AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ;
   private String AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ;
   private String AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ;
   private String AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ;
   private String AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ;
   private String scmdbuf ;
   private String lV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ;
   private String lV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ;
   private String lV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ;
   private String lV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ;
   private String lV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ;
   private String lV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV20EmprNom ;
   private String AV49strDate ;
   private String edtCliCod_Columnheaderclass ;
   private String edtCliNom_Columnheaderclass ;
   private String edtPedidoClie_Columnheaderclass ;
   private String edtBarNHdr_Columnheaderclass ;
   private String edtBarFecGen_Columnheaderclass ;
   private String edtBarSer_Columnheaderclass ;
   private String edtBarSerDsc_Columnheaderclass ;
   private String edtBarColNom_Columnheaderclass ;
   private String edtBarColNum_Columnheaderclass ;
   private String edtBarSit_Columnheaderclass ;
   private String edtBarMaqCod_Columnheaderclass ;
   private String edtBarAgrEst_Columnheaderclass ;
   private String edtCliCod_Columnclass ;
   private String edtCliNom_Columnclass ;
   private String edtPedidoClie_Columnclass ;
   private String edtBarNHdr_Columnclass ;
   private String edtBarFecGen_Columnclass ;
   private String edtBarSer_Columnclass ;
   private String edtBarSerDsc_Columnclass ;
   private String edtBarColNom_Columnclass ;
   private String edtBarColNum_Columnclass ;
   private String edtBarSit_Columnclass ;
   private String edtBarMaqCod_Columnclass ;
   private String edtBarAgrEst_Columnclass ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String AV114Emprcod_selected ;
   private String AV117Barcodpar_selected ;
   private String GXt_char28 ;
   private String GXv_char29[] ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
   private String GXt_char23 ;
   private String GXv_char5[] ;
   private String GXt_char22 ;
   private String GXv_char4[] ;
   private String GXt_char21 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablesituacionfases_modal_Internalname ;
   private String Situacionfases_modal_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_79_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarMaqCod_Jsonclick ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarTipDis_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarNumCli_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtE_Barser_Jsonclick ;
   private String edtDisCod_Jsonclick ;
   private String edtBarUniMed_Jsonclick ;
   private String edtBarPes_Jsonclick ;
   private String edtBarPri_Jsonclick ;
   private String edtavF_color_Jsonclick ;
   private String edtBarCodTN_Jsonclick ;
   private String edtBarAlbUlti_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV12BarFecGenfrom ;
   private java.util.Date AV13BarFecGento ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date Gx_date ;
   private java.util.Date AV6BarFecGen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV37OrderedDsc ;
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
   private boolean bGXsfl_79_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV50TempBoolean ;
   private String AV88ColumnsSelectorXML ;
   private String AV83ManageFiltersXml ;
   private String AV89UserCustomValue ;
   private String AV33ListPdfJson ;
   private String AV79FilterFullText ;
   private String AV40PATHPDF ;
   private String AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ;
   private String lV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ;
   private String AV80ExcelFilename ;
   private String AV81ErrorMessage ;
   private String AV73shdr ;
   private String AV44ReportOutPut ;
   private String AV43ReportInPut ;
   private String AV39PathFile ;
   private String AV41PathPDFFull ;
   private String AV32Link ;
   private String AV75Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV30HTTPRequest ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private com.genexus.webpanels.WebSession AV8WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucSituacionfases_modal ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXFile AV23File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.gridstate.GXGridStateHandler GridState ;
   private app.SdtAppTool AV5AppTool ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkHayRec ;
   private ICheckbox chkBarAcc ;
   private IDataStoreProvider pr_default ;
   private byte[] H02CH3_A3594BarPriTin ;
   private byte[] H02CH3_A2265BarExt ;
   private boolean[] H02CH3_n2265BarExt ;
   private int[] H02CH3_A1923BarCodTN ;
   private String[] H02CH3_A209BarPri ;
   private short[] H02CH3_A864BarPes ;
   private String[] H02CH3_A228BarUniMed ;
   private int[] H02CH3_A361DisCod ;
   private String[] H02CH3_A5253BarAcc ;
   private int[] H02CH3_A1235BarNumCli ;
   private String[] H02CH3_A1234BarNomCli ;
   private String[] H02CH3_A2010BarTipDis ;
   private String[] H02CH3_A120BarAgrEst ;
   private String[] H02CH3_A180BarMaqCod ;
   private byte[] H02CH3_A213BarSit ;
   private int[] H02CH3_A136BarColNum ;
   private String[] H02CH3_A135BarColNom ;
   private String[] H02CH3_A1652BarSerDsc ;
   private java.util.Date[] H02CH3_A159BarFecGen ;
   private String[] H02CH3_A13696BarNHdr ;
   private String[] H02CH3_A279CliNom ;
   private java.math.BigDecimal[] H02CH3_A184BarMtr ;
   private java.math.BigDecimal[] H02CH3_A166BarKgm ;
   private String[] H02CH3_A143BarDisNum ;
   private String[] H02CH3_A4812BarEncCli ;
   private short[] H02CH3_A199BarPie1 ;
   private String[] H02CH3_A365DisDes ;
   private int[] H02CH3_A898BarPieNDes ;
   private String[] H02CH3_A212BarSer ;
   private int[] H02CH3_A252CliCod ;
   private boolean[] H02CH3_n252CliCod ;
   private String[] H02CH3_A130BarCodPar ;
   private byte[] H02CH3_A132BarCodReo ;
   private int[] H02CH3_A129BarCod ;
   private String[] H02CH3_A396EmprCod ;
   private byte[] H02CH5_A3594BarPriTin ;
   private byte[] H02CH5_A2265BarExt ;
   private boolean[] H02CH5_n2265BarExt ;
   private int[] H02CH5_A1923BarCodTN ;
   private String[] H02CH5_A209BarPri ;
   private short[] H02CH5_A864BarPes ;
   private String[] H02CH5_A228BarUniMed ;
   private int[] H02CH5_A361DisCod ;
   private String[] H02CH5_A5253BarAcc ;
   private int[] H02CH5_A1235BarNumCli ;
   private String[] H02CH5_A1234BarNomCli ;
   private String[] H02CH5_A2010BarTipDis ;
   private String[] H02CH5_A120BarAgrEst ;
   private String[] H02CH5_A180BarMaqCod ;
   private byte[] H02CH5_A213BarSit ;
   private int[] H02CH5_A136BarColNum ;
   private String[] H02CH5_A135BarColNom ;
   private String[] H02CH5_A1652BarSerDsc ;
   private java.util.Date[] H02CH5_A159BarFecGen ;
   private String[] H02CH5_A13696BarNHdr ;
   private String[] H02CH5_A279CliNom ;
   private java.math.BigDecimal[] H02CH5_A184BarMtr ;
   private java.math.BigDecimal[] H02CH5_A166BarKgm ;
   private String[] H02CH5_A143BarDisNum ;
   private String[] H02CH5_A4812BarEncCli ;
   private short[] H02CH5_A199BarPie1 ;
   private String[] H02CH5_A365DisDes ;
   private int[] H02CH5_A898BarPieNDes ;
   private String[] H02CH5_A212BarSer ;
   private int[] H02CH5_A252CliCod ;
   private boolean[] H02CH5_n252CliCod ;
   private String[] H02CH5_A130BarCodPar ;
   private byte[] H02CH5_A132BarCodReo ;
   private int[] H02CH5_A129BarCod ;
   private String[] H02CH5_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSdt_MergePDF_PDF> AV45Sdt_MergePDF ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV82ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV18DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13[] ;
   private app.pedidosclientesindetalle.SdtFilterHojadeRuta__WW AV24FilterHojadeRuta__WW ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState30[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
   private app.SdtSdt_MergePDF_PDF AV46Sdt_MergePDF_Item ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV68TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV71WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV90ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV91ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
}

final  class hojaderuta___ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02CH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV16CliCod ,
                                          java.util.Date AV12BarFecGenfrom ,
                                          java.util.Date AV13BarFecGento ,
                                          byte AV14BarSitfrom ,
                                          byte AV15BarSitto ,
                                          int AV9BarCod ,
                                          byte AV11BarCodReo ,
                                          String AV10BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV36OrderedBy ,
                                          boolean AV37OrderedDsc ,
                                          String AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          String AV19EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[23];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT T1.BarPriTin, T1.BarExt, T1.BarCodTN, T1.BarPri, T1.BarPes, T1.BarUniMed, T1.DisCod, T1.BarAcc, T1.BarNumCli, T1.BarNomCli, T1.BarTipDis, T1.BarAgrEst, T1.BarMaqCod," ;
      scmdbuf += " T1.BarSit, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarFecGen, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1," ;
      scmdbuf += " 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, T1.BarSer, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int31[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int31[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int31[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int31[8] = (byte)(1) ;
      }
      if ( ! (0==AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int31[9] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int31[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int31[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( ! (0==AV16CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (0==AV14BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( ! (0==AV15BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (0==AV9BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( ! (0==AV11BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV36OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFecGen" ;
      }
      else if ( ( AV36OrderedBy == 2 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV36OrderedBy == 2 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarNHdr DESC" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV36OrderedBy == 11 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV36OrderedBy == 11 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV36OrderedBy == 12 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV36OrderedBy == 12 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
   }

   protected Object[] conditional_H02CH5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV16CliCod ,
                                          java.util.Date AV12BarFecGenfrom ,
                                          java.util.Date AV13BarFecGento ,
                                          byte AV14BarSitfrom ,
                                          byte AV15BarSitto ,
                                          int AV9BarCod ,
                                          byte AV11BarCodReo ,
                                          String AV10BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV36OrderedBy ,
                                          boolean AV37OrderedDsc ,
                                          String AV96Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV100Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV99Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          String AV19EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[23];
      Object[] GXv_Object34 = new Object[2];
      scmdbuf = "SELECT T1.BarPriTin, T1.BarExt, T1.BarCodTN, T1.BarPri, T1.BarPes, T1.BarUniMed, T1.DisCod, T1.BarAcc, T1.BarNumCli, T1.BarNomCli, T1.BarTipDis, T1.BarAgrEst, T1.BarMaqCod," ;
      scmdbuf += " T1.BarSit, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarFecGen, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1," ;
      scmdbuf += " 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, T1.BarSer, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int33[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV101Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int33[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int33[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int33[8] = (byte)(1) ;
      }
      if ( ! (0==AV107Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int33[9] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int33[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV109Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int33[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int33[14] = (byte)(1) ;
      }
      if ( ! (0==AV16CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int33[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( ! (0==AV14BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( ! (0==AV15BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( ! (0==AV9BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( ! (0==AV11BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV36OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFecGen" ;
      }
      else if ( ( AV36OrderedBy == 2 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV36OrderedBy == 2 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarNHdr DESC" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV36OrderedBy == 11 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV36OrderedBy == 11 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV36OrderedBy == 12 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV36OrderedBy == 12 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
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
                  return conditional_H02CH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 1 :
                  return conditional_H02CH5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02CH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CH5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 26);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 11);
               ((String[]) buf[20])[0] = rslt.getString(20, 30);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[23])[0] = rslt.getString(23, 8);
               ((String[]) buf[24])[0] = rslt.getString(24, 20);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 1);
               ((int[]) buf[27])[0] = rslt.getInt(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 16);
               ((int[]) buf[29])[0] = rslt.getInt(29);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(30, 1);
               ((byte[]) buf[32])[0] = rslt.getByte(31);
               ((int[]) buf[33])[0] = rslt.getInt(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 26);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 11);
               ((String[]) buf[20])[0] = rslt.getString(20, 30);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[23])[0] = rslt.getString(23, 8);
               ((String[]) buf[24])[0] = rslt.getString(24, 20);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 1);
               ((int[]) buf[27])[0] = rslt.getInt(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 16);
               ((int[]) buf[29])[0] = rslt.getInt(29);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(30, 1);
               ((byte[]) buf[32])[0] = rslt.getByte(31);
               ((int[]) buf[33])[0] = rslt.getInt(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 3);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
      }
   }

}

