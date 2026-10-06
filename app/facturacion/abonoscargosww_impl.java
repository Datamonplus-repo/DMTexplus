package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class abonoscargosww_impl extends GXDataArea
{
   public abonoscargosww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public abonoscargosww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( abonoscargosww_impl.class ));
   }

   public abonoscargosww_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavFactipfac = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbFacTipFac = new HTMLChoice();
      cmbFacEst = new HTMLChoice();
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
      nRC_GXsfl_46 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_46"))) ;
      nGXsfl_46_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_46_idx"))) ;
      sGXsfl_46_idx = httpContext.GetPar( "sGXsfl_46_idx") ;
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
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFFacCod = (int)(GXutil.lval( httpContext.GetPar( "TFFacCod"))) ;
      AV27TFFacCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFFacCod_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV87TFFacTipFac_Sels);
      AV30TFFacFch = localUtil.parseDateParm( httpContext.GetPar( "TFFacFch")) ;
      AV36TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV37TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV38TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV39TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV88TFFacImpPP = CommonUtil.decimalVal( httpContext.GetPar( "TFFacImpPP"), ".") ;
      AV89TFFacImpPP_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacImpPP_To"), ".") ;
      AV90TFFacBasImp = CommonUtil.decimalVal( httpContext.GetPar( "TFFacBasImp"), ".") ;
      AV91TFFacBasImp_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacBasImp_To"), ".") ;
      AV92TFFacIVAImp = CommonUtil.decimalVal( httpContext.GetPar( "TFFacIVAImp"), ".") ;
      AV93TFFacIVAImp_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacIVAImp_To"), ".") ;
      AV94TFFacTot = CommonUtil.decimalVal( httpContext.GetPar( "TFFacTot"), ".") ;
      AV95TFFacTot_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacTot_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV97TFFacEst_Sels);
      AV98TFFacCob = httpContext.GetPar( "TFFacCob") ;
      AV99TFFacCob_Sel = httpContext.GetPar( "TFFacCob_Sel") ;
      AV123Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV102TotFacImpPP = CommonUtil.decimalVal( httpContext.GetPar( "TotFacImpPP"), ".") ;
      AV104TotFacBasImp = CommonUtil.decimalVal( httpContext.GetPar( "TotFacBasImp"), ".") ;
      AV106TotFacIVAImp = CommonUtil.decimalVal( httpContext.GetPar( "TotFacIVAImp"), ".") ;
      AV108TotFacTot = CommonUtil.decimalVal( httpContext.GetPar( "TotFacTot"), ".") ;
      AV114FirmaD = (short)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
      AV112ExisteC = (short)(GXutil.lval( httpContext.GetPar( "ExisteC"))) ;
      A9606FacHor = localUtil.parseDTimeParm( httpContext.GetPar( "FacHor")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV26TFFacCod, AV27TFFacCod_To, AV87TFFacTipFac_Sels, AV30TFFacFch, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV88TFFacImpPP, AV89TFFacImpPP_To, AV90TFFacBasImp, AV91TFFacBasImp_To, AV92TFFacIVAImp, AV93TFFacIVAImp_To, AV94TFFacTot, AV95TFFacTot_To, AV97TFFacEst_Sels, AV98TFFacCob, AV99TFFacCob_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV102TotFacImpPP, AV104TotFacBasImp, AV106TotFacIVAImp, AV108TotFacTot, AV114FirmaD, AV112ExisteC, A9606FacHor) ;
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
      pa2312( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2312( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.abonoscargosww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPPP", getSecureSignedToken( "", localUtil.format( AV102TotFacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACBASIMP", getSecureSignedToken( "", localUtil.format( AV104TotFacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIVAIMP", getSecureSignedToken( "", localUtil.format( AV106TotFacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACTOT", getSecureSignedToken( "", localUtil.format( AV108TotFacTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV114FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACHOR", getSecureSignedToken( "", localUtil.format( A9606FacHor, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXISTEC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV112ExisteC), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"AbonosCargosWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV123Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\abonoscargosww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_46", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_46, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV78GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV79GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV76DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV76DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCOD", GXutil.ltrim( localUtil.ntoc( AV26TFFacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFFacCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFFACTIPFAC_SELS", AV87TFFacTipFac_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFFACTIPFAC_SELS", AV87TFFacTipFac_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACFCH", localUtil.dtoc( AV30TFFacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV36TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV38TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV39TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACIMPPP", GXutil.ltrim( localUtil.ntoc( AV88TFFacImpPP, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACIMPPP_TO", GXutil.ltrim( localUtil.ntoc( AV89TFFacImpPP_To, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACBASIMP", GXutil.ltrim( localUtil.ntoc( AV90TFFacBasImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACBASIMP_TO", GXutil.ltrim( localUtil.ntoc( AV91TFFacBasImp_To, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV92TFFacIVAImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACIVAIMP_TO", GXutil.ltrim( localUtil.ntoc( AV93TFFacIVAImp_To, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACTOT", GXutil.ltrim( localUtil.ntoc( AV94TFFacTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACTOT_TO", GXutil.ltrim( localUtil.ntoc( AV95TFFacTot_To, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFFACEST_SELS", AV97TFFacEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFFACEST_SELS", AV97TFFacEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCOB", GXutil.rtrim( AV98TFFacCob));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCOB_SEL", GXutil.rtrim( AV99TFFacCob_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACIMPPP", GXutil.ltrim( localUtil.ntoc( AV102TotFacImpPP, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPPP", getSecureSignedToken( "", localUtil.format( AV102TotFacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACBASIMP", GXutil.ltrim( localUtil.ntoc( AV104TotFacBasImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACBASIMP", getSecureSignedToken( "", localUtil.format( AV104TotFacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV106TotFacIVAImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIVAIMP", getSecureSignedToken( "", localUtil.format( AV106TotFacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACTOT", GXutil.ltrim( localUtil.ntoc( AV108TotFacTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACTOT", getSecureSignedToken( "", localUtil.format( AV108TotFacTot, "ZZZZZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACTIPFAC_SELSJSON", AV86TFFacTipFac_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACEST_SELSJSON", AV96TFFacEst_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV114FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV114FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACHOR", localUtil.ttoc( A9606FacHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACHOR", getSecureSignedToken( "", localUtil.format( A9606FacHor, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISTEC", GXutil.ltrim( localUtil.ntoc( AV112ExisteC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXISTEC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV112ExisteC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECICA", GXutil.ltrim( localUtil.ntoc( A11513FacRecIca, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPICA1", GXutil.ltrim( localUtil.ntoc( A11514FacImpIca1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPICA", GXutil.ltrim( localUtil.ntoc( A11515FacImpIca, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECI", GXutil.ltrim( localUtil.ntoc( A8346FacRecI, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPREI1", GXutil.ltrim( localUtil.ntoc( A8348FacImpReI1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLOMBIA", GXutil.ltrim( localUtil.ntoc( A7209Colombia, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPREI", GXutil.ltrim( localUtil.ntoc( A8347FacImpReI, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECT", GXutil.ltrim( localUtil.ntoc( A7212FacRect, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPRET1", GXutil.ltrim( localUtil.ntoc( A7214FacImpRet1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPRET", GXutil.ltrim( localUtil.ntoc( A7213FacImpRet, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECPOR", GXutil.ltrim( localUtil.ntoc( A453FacRECPor, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECIMP1", GXutil.ltrim( localUtil.ntoc( A3922FacRecImp1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECIMP", GXutil.ltrim( localUtil.ntoc( A452FacRecImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIVAPOR", GXutil.ltrim( localUtil.ntoc( A443FacIVAPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIVAIMP1", GXutil.ltrim( localUtil.ntoc( A3921FacIvaImp1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTMTS", GXutil.ltrim( localUtil.ntoc( A14222FacCostMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTKGS", GXutil.ltrim( localUtil.ntoc( A14223FacCostKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTFAC", GXutil.ltrim( localUtil.ntoc( A14224FacCostFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTENG", GXutil.ltrim( localUtil.ntoc( A14221FacCostEng, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTENE", GXutil.ltrim( localUtil.ntoc( A14220FacCostEne, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPTOT1", GXutil.ltrim( localUtil.ntoc( A3918FacImpTot1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDTOGEN", GXutil.ltrim( localUtil.ntoc( A433FacDtoGen, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPGEN1", GXutil.ltrim( localUtil.ntoc( A3919FacImpGen1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPGEN", GXutil.ltrim( localUtil.ntoc( A439FacImpGen, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACENERGIA", GXutil.ltrim( localUtil.ntoc( A14219FacEnergia, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPENG1", GXutil.ltrim( localUtil.ntoc( A14218FacImpEng1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPTOT", GXutil.ltrim( localUtil.ntoc( A441FacImpTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
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
         we2312( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2312( ) ;
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
      return formatLink("app.facturacion.abonoscargosww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.AbonosCargosWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Abonos / Cargos", "") ;
   }

   public void wb2310( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\AbonosCargosWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\AbonosCargosWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavFactipfac.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavFactipfac.getInternalname(), httpContext.getMessage( "Tipo Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavFactipfac, cmbavFactipfac.getInternalname(), GXutil.trim( GXutil.str( AV85FacTipFac, 1, 0)), 1, cmbavFactipfac.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavFactipfac.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "", true, (byte)(0), "HLP_Facturacion\\AbonosCargosWW.htm");
         cmbavFactipfac.setValue( GXutil.trim( GXutil.str( AV85FacTipFac, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavFactipfac.getInternalname(), "Values", cmbavFactipfac.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_28_2312( true) ;
      }
      else
      {
         wb_table1_28_2312( false) ;
      }
      return  ;
   }

   public void wb_table1_28_2312e( boolean wbgen )
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
         startgridcontrol46( ) ;
      }
      if ( wbEnd == 46 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_46 = (int)(nGXsfl_46_idx-1) ;
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
         wb_table2_62_2312( true) ;
      }
      else
      {
         wb_table2_62_2312( false) ;
      }
      return  ;
   }

   public void wb_table2_62_2312e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV78GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV79GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV123Pgmname), GXutil.rtrim( localUtil.format( AV123Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargosWW.htm");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV76DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV76DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacpri_Internalname, GXutil.rtrim( AV113FacPri), GXutil.rtrim( localUtil.format( AV113FacPri, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacpri_Jsonclick, 0, "Attribute", "", "", "", "", edtavFacpri_Visible, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargosWW.htm");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_facfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_facfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_facfchauxdate_Internalname, localUtil.format(AV32DDO_FacFchAuxDate, "99/99/99"), localUtil.format( AV32DDO_FacFchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_facfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AbonosCargosWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_facfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\AbonosCargosWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 46 )
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

   public void start2312( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Abonos / Cargos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2310( ) ;
   }

   public void ws2312( )
   {
      start2312( ) ;
      evt2312( ) ;
   }

   public void evt2312( )
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
                           e112312 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122312 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132312 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142312 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152312 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e162312 ();
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
                           nGXsfl_46_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_462( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV80GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
                           A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbFacTipFac.setName( cmbFacTipFac.getInternalname() );
                           cmbFacTipFac.setValue( httpContext.cgiGet( cmbFacTipFac.getInternalname()) );
                           A1153FacTipFac = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacTipFac.getInternalname()))) ;
                           A436FacFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtFacFch_Internalname), 0)) ;
                           A450FacPri = httpContext.cgiGet( edtFacPri_Internalname) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A440FacImpPP = localUtil.ctond( httpContext.cgiGet( edtFacImpPP_Internalname)) ;
                           n440FacImpPP = false ;
                           A429FacBasImp = localUtil.ctond( httpContext.cgiGet( edtFacBasImp_Internalname)) ;
                           A442FacIVAImp = localUtil.ctond( httpContext.cgiGet( edtFacIVAImp_Internalname)) ;
                           A455FacTot = localUtil.ctond( httpContext.cgiGet( edtFacTot_Internalname)) ;
                           cmbFacEst.setName( cmbFacEst.getInternalname() );
                           cmbFacEst.setValue( httpContext.cgiGet( cmbFacEst.getInternalname()) );
                           A435FacEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacEst.getInternalname()))) ;
                           A965FacCob = httpContext.cgiGet( edtFacCob_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e172312 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e182312 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e192312 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e202312 ();
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

   public void we2312( )
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

   public void pa2312( )
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
            GX_FocusControl = cmbavFactipfac.getInternalname() ;
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
      subsflControlProps_462( ) ;
      while ( nGXsfl_46_idx <= nRC_GXsfl_46 )
      {
         sendrow_462( ) ;
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 int AV26TFFacCod ,
                                 int AV27TFFacCod_To ,
                                 GXSimpleCollection<Byte> AV87TFFacTipFac_Sels ,
                                 java.util.Date AV30TFFacFch ,
                                 int AV36TFCliCod ,
                                 int AV37TFCliCod_To ,
                                 String AV38TFCliNom ,
                                 String AV39TFCliNom_Sel ,
                                 java.math.BigDecimal AV88TFFacImpPP ,
                                 java.math.BigDecimal AV89TFFacImpPP_To ,
                                 java.math.BigDecimal AV90TFFacBasImp ,
                                 java.math.BigDecimal AV91TFFacBasImp_To ,
                                 java.math.BigDecimal AV92TFFacIVAImp ,
                                 java.math.BigDecimal AV93TFFacIVAImp_To ,
                                 java.math.BigDecimal AV94TFFacTot ,
                                 java.math.BigDecimal AV95TFFacTot_To ,
                                 GXSimpleCollection<Byte> AV97TFFacEst_Sels ,
                                 String AV98TFFacCob ,
                                 String AV99TFFacCob_Sel ,
                                 String AV123Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV102TotFacImpPP ,
                                 java.math.BigDecimal AV104TotFacBasImp ,
                                 java.math.BigDecimal AV106TotFacIVAImp ,
                                 java.math.BigDecimal AV108TotFacTot ,
                                 short AV114FirmaD ,
                                 short AV112ExisteC ,
                                 java.util.Date A9606FacHor )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e182312 ();
      GRID_nCurrentRecord = 0 ;
      rf2312( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"AbonosCargosWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV123Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\abonoscargosww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A450FacPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPRI", GXutil.rtrim( A450FacPri));
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
      if ( cmbavFactipfac.getItemCount() > 0 )
      {
         AV85FacTipFac = (byte)(GXutil.lval( cmbavFactipfac.getValidValue(GXutil.trim( GXutil.str( AV85FacTipFac, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85FacTipFac", GXutil.str( AV85FacTipFac, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavFactipfac.setValue( GXutil.trim( GXutil.str( AV85FacTipFac, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavFactipfac.getInternalname(), "Values", cmbavFactipfac.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2312( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV123Pgmname = "Facturacion.AbonosCargosWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123Pgmname", AV123Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluefacimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacimppp_Enabled), 5, 0), true);
      edtavTotvaluefacbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacbasimp_Enabled), 5, 0), true);
      edtavTotvaluefacivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacivaimp_Enabled), 5, 0), true);
      edtavTotvaluefactot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefactot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefactot_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV125Facturacion_abonoscargoswwds_1_filterfulltext = AV15FilterFullText ;
      AV126Facturacion_abonoscargoswwds_2_tffaccod = AV26TFFacCod ;
      AV127Facturacion_abonoscargoswwds_3_tffaccod_to = AV27TFFacCod_To ;
      AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels = AV87TFFacTipFac_Sels ;
      AV129Facturacion_abonoscargoswwds_5_tffacfch = AV30TFFacFch ;
      AV130Facturacion_abonoscargoswwds_6_tfclicod = AV36TFCliCod ;
      AV131Facturacion_abonoscargoswwds_7_tfclicod_to = AV37TFCliCod_To ;
      AV132Facturacion_abonoscargoswwds_8_tfclinom = AV38TFCliNom ;
      AV133Facturacion_abonoscargoswwds_9_tfclinom_sel = AV39TFCliNom_Sel ;
      AV134Facturacion_abonoscargoswwds_10_tffacimppp = AV88TFFacImpPP ;
      AV135Facturacion_abonoscargoswwds_11_tffacimppp_to = AV89TFFacImpPP_To ;
      AV136Facturacion_abonoscargoswwds_12_tffacbasimp = AV90TFFacBasImp ;
      AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to = AV91TFFacBasImp_To ;
      AV138Facturacion_abonoscargoswwds_14_tffacivaimp = AV92TFFacIVAImp ;
      AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to = AV93TFFacIVAImp_To ;
      AV140Facturacion_abonoscargoswwds_16_tffactot = AV94TFFacTot ;
      AV141Facturacion_abonoscargoswwds_17_tffactot_to = AV95TFFacTot_To ;
      AV142Facturacion_abonoscargoswwds_18_tffacest_sels = AV97TFFacEst_Sels ;
      AV143Facturacion_abonoscargoswwds_19_tffaccob = AV98TFFacCob ;
      AV144Facturacion_abonoscargoswwds_20_tffaccob_sel = AV99TFFacCob_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels ,
                                           Byte.valueOf(A435FacEst) ,
                                           AV142Facturacion_abonoscargoswwds_18_tffacest_sels ,
                                           Integer.valueOf(AV126Facturacion_abonoscargoswwds_2_tffaccod) ,
                                           Integer.valueOf(AV127Facturacion_abonoscargoswwds_3_tffaccod_to) ,
                                           Integer.valueOf(AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels.size()) ,
                                           AV129Facturacion_abonoscargoswwds_5_tffacfch ,
                                           Integer.valueOf(AV130Facturacion_abonoscargoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV131Facturacion_abonoscargoswwds_7_tfclicod_to) ,
                                           AV133Facturacion_abonoscargoswwds_9_tfclinom_sel ,
                                           AV132Facturacion_abonoscargoswwds_8_tfclinom ,
                                           Integer.valueOf(AV142Facturacion_abonoscargoswwds_18_tffacest_sels.size()) ,
                                           AV144Facturacion_abonoscargoswwds_20_tffaccob_sel ,
                                           AV143Facturacion_abonoscargoswwds_19_tffaccob ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A965FacCob ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV125Facturacion_abonoscargoswwds_1_filterfulltext ,
                                           A440FacImpPP ,
                                           A429FacBasImp ,
                                           A442FacIVAImp ,
                                           A455FacTot ,
                                           AV134Facturacion_abonoscargoswwds_10_tffacimppp ,
                                           AV135Facturacion_abonoscargoswwds_11_tffacimppp_to ,
                                           AV136Facturacion_abonoscargoswwds_12_tffacbasimp ,
                                           AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to ,
                                           AV138Facturacion_abonoscargoswwds_14_tffacivaimp ,
                                           AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to ,
                                           AV140Facturacion_abonoscargoswwds_16_tffactot ,
                                           AV141Facturacion_abonoscargoswwds_17_tffactot_to ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV132Facturacion_abonoscargoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV132Facturacion_abonoscargoswwds_8_tfclinom), 30, "%") ;
      lV143Facturacion_abonoscargoswwds_19_tffaccob = GXutil.padr( GXutil.rtrim( AV143Facturacion_abonoscargoswwds_19_tffaccob), 1, "%") ;
      /* Using cursor H02315 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV134Facturacion_abonoscargoswwds_10_tffacimppp, AV134Facturacion_abonoscargoswwds_10_tffacimppp, AV135Facturacion_abonoscargoswwds_11_tffacimppp_to, AV135Facturacion_abonoscargoswwds_11_tffacimppp_to, Integer.valueOf(AV126Facturacion_abonoscargoswwds_2_tffaccod), Integer.valueOf(AV127Facturacion_abonoscargoswwds_3_tffaccod_to), AV129Facturacion_abonoscargoswwds_5_tffacfch, Integer.valueOf(AV130Facturacion_abonoscargoswwds_6_tfclicod), Integer.valueOf(AV131Facturacion_abonoscargoswwds_7_tfclicod_to), lV132Facturacion_abonoscargoswwds_8_tfclinom, AV133Facturacion_abonoscargoswwds_9_tfclinom_sel, lV143Facturacion_abonoscargoswwds_19_tffaccob, AV144Facturacion_abonoscargoswwds_20_tffaccob_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9606FacHor = H02315_A9606FacHor[0] ;
         A965FacCob = H02315_A965FacCob[0] ;
         A435FacEst = H02315_A435FacEst[0] ;
         A279CliNom = H02315_A279CliNom[0] ;
         A252CliCod = H02315_A252CliCod[0] ;
         A450FacPri = H02315_A450FacPri[0] ;
         A436FacFch = H02315_A436FacFch[0] ;
         A1153FacTipFac = H02315_A1153FacTipFac[0] ;
         A430FacCod = H02315_A430FacCod[0] ;
         A11513FacRecIca = H02315_A11513FacRecIca[0] ;
         A8346FacRecI = H02315_A8346FacRecI[0] ;
         n8346FacRecI = H02315_n8346FacRecI[0] ;
         A7212FacRect = H02315_A7212FacRect[0] ;
         A453FacRECPor = H02315_A453FacRECPor[0] ;
         A443FacIVAPor = H02315_A443FacIVAPor[0] ;
         A14224FacCostFac = H02315_A14224FacCostFac[0] ;
         A14223FacCostKgs = H02315_A14223FacCostKgs[0] ;
         A14222FacCostMts = H02315_A14222FacCostMts[0] ;
         A433FacDtoGen = H02315_A433FacDtoGen[0] ;
         A14219FacEnergia = H02315_A14219FacEnergia[0] ;
         A3918FacImpTot1 = H02315_A3918FacImpTot1[0] ;
         A440FacImpPP = H02315_A440FacImpPP[0] ;
         n440FacImpPP = H02315_n440FacImpPP[0] ;
         A279CliNom = H02315_A279CliNom[0] ;
         A3918FacImpTot1 = H02315_A3918FacImpTot1[0] ;
         A440FacImpPP = H02315_A440FacImpPP[0] ;
         n440FacImpPP = H02315_n440FacImpPP[0] ;
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Facturacion_abonoscargoswwds_12_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV136Facturacion_abonoscargoswwds_12_tffacbasimp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to) <= 0 ) ) )
            {
               A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
               A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
               A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  }
                  else
                  {
                     A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  }
               }
               A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  }
                  else
                  {
                     A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  }
               }
               A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                  }
                  else
                  {
                     A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Facturacion_abonoscargoswwds_14_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV138Facturacion_abonoscargoswwds_14_tffacivaimp) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to) <= 0 ) ) )
                  {
                     A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
                     if ( A7209Colombia == 0 )
                     {
                        A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                     }
                     else
                     {
                        if ( A7209Colombia == 1 )
                        {
                           A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        }
                        else
                        {
                           A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        }
                     }
                     A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                     if ( (GXutil.strcmp("", AV125Facturacion_abonoscargoswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1153FacTipFac, 1, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV125Facturacion_abonoscargoswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A440FacImpPP, 11, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A429FacBasImp, 13, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A442FacIVAImp, 11, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A455FacTot, 13, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A435FacEst, 1, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A965FacCob) , GXutil.padr( "%" + GXutil.upper( AV125Facturacion_abonoscargoswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Facturacion_abonoscargoswwds_16_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV140Facturacion_abonoscargoswwds_16_tffactot) >= 0 ) ) )
                        {
                           if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV141Facturacion_abonoscargoswwds_17_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV141Facturacion_abonoscargoswwds_17_tffactot_to) <= 0 ) ) )
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

   public void rf2312( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(46) ;
      /* Execute user event: Refresh */
      e182312 ();
      nGXsfl_46_idx = 1 ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_462( ) ;
      bGXsfl_46_Refreshing = true ;
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
         subsflControlProps_462( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Byte.valueOf(A1153FacTipFac) ,
                                              AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels ,
                                              Byte.valueOf(A435FacEst) ,
                                              AV142Facturacion_abonoscargoswwds_18_tffacest_sels ,
                                              Integer.valueOf(AV126Facturacion_abonoscargoswwds_2_tffaccod) ,
                                              Integer.valueOf(AV127Facturacion_abonoscargoswwds_3_tffaccod_to) ,
                                              Integer.valueOf(AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels.size()) ,
                                              AV129Facturacion_abonoscargoswwds_5_tffacfch ,
                                              Integer.valueOf(AV130Facturacion_abonoscargoswwds_6_tfclicod) ,
                                              Integer.valueOf(AV131Facturacion_abonoscargoswwds_7_tfclicod_to) ,
                                              AV133Facturacion_abonoscargoswwds_9_tfclinom_sel ,
                                              AV132Facturacion_abonoscargoswwds_8_tfclinom ,
                                              Integer.valueOf(AV142Facturacion_abonoscargoswwds_18_tffacest_sels.size()) ,
                                              AV144Facturacion_abonoscargoswwds_20_tffaccob_sel ,
                                              AV143Facturacion_abonoscargoswwds_19_tffaccob ,
                                              Integer.valueOf(A430FacCod) ,
                                              A436FacFch ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A965FacCob ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV125Facturacion_abonoscargoswwds_1_filterfulltext ,
                                              A440FacImpPP ,
                                              A429FacBasImp ,
                                              A442FacIVAImp ,
                                              A455FacTot ,
                                              AV134Facturacion_abonoscargoswwds_10_tffacimppp ,
                                              AV135Facturacion_abonoscargoswwds_11_tffacimppp_to ,
                                              AV136Facturacion_abonoscargoswwds_12_tffacbasimp ,
                                              AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to ,
                                              AV138Facturacion_abonoscargoswwds_14_tffacivaimp ,
                                              AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to ,
                                              AV140Facturacion_abonoscargoswwds_16_tffactot ,
                                              AV141Facturacion_abonoscargoswwds_17_tffactot_to ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING
                                              }
         });
         lV132Facturacion_abonoscargoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV132Facturacion_abonoscargoswwds_8_tfclinom), 30, "%") ;
         lV143Facturacion_abonoscargoswwds_19_tffaccob = GXutil.padr( GXutil.rtrim( AV143Facturacion_abonoscargoswwds_19_tffaccob), 1, "%") ;
         /* Using cursor H02319 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV134Facturacion_abonoscargoswwds_10_tffacimppp, AV134Facturacion_abonoscargoswwds_10_tffacimppp, AV135Facturacion_abonoscargoswwds_11_tffacimppp_to, AV135Facturacion_abonoscargoswwds_11_tffacimppp_to, Integer.valueOf(AV126Facturacion_abonoscargoswwds_2_tffaccod), Integer.valueOf(AV127Facturacion_abonoscargoswwds_3_tffaccod_to), AV129Facturacion_abonoscargoswwds_5_tffacfch, Integer.valueOf(AV130Facturacion_abonoscargoswwds_6_tfclicod), Integer.valueOf(AV131Facturacion_abonoscargoswwds_7_tfclicod_to), lV132Facturacion_abonoscargoswwds_8_tfclinom, AV133Facturacion_abonoscargoswwds_9_tfclinom_sel, lV143Facturacion_abonoscargoswwds_19_tffaccob, AV144Facturacion_abonoscargoswwds_20_tffaccob_sel});
         nGXsfl_46_idx = 1 ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A9606FacHor = H02319_A9606FacHor[0] ;
            A965FacCob = H02319_A965FacCob[0] ;
            A435FacEst = H02319_A435FacEst[0] ;
            A279CliNom = H02319_A279CliNom[0] ;
            A252CliCod = H02319_A252CliCod[0] ;
            A450FacPri = H02319_A450FacPri[0] ;
            A436FacFch = H02319_A436FacFch[0] ;
            A1153FacTipFac = H02319_A1153FacTipFac[0] ;
            A430FacCod = H02319_A430FacCod[0] ;
            A11513FacRecIca = H02319_A11513FacRecIca[0] ;
            A8346FacRecI = H02319_A8346FacRecI[0] ;
            n8346FacRecI = H02319_n8346FacRecI[0] ;
            A7212FacRect = H02319_A7212FacRect[0] ;
            A453FacRECPor = H02319_A453FacRECPor[0] ;
            A443FacIVAPor = H02319_A443FacIVAPor[0] ;
            A14224FacCostFac = H02319_A14224FacCostFac[0] ;
            A14223FacCostKgs = H02319_A14223FacCostKgs[0] ;
            A14222FacCostMts = H02319_A14222FacCostMts[0] ;
            A433FacDtoGen = H02319_A433FacDtoGen[0] ;
            A14219FacEnergia = H02319_A14219FacEnergia[0] ;
            A3918FacImpTot1 = H02319_A3918FacImpTot1[0] ;
            A440FacImpPP = H02319_A440FacImpPP[0] ;
            n440FacImpPP = H02319_n440FacImpPP[0] ;
            A279CliNom = H02319_A279CliNom[0] ;
            A3918FacImpTot1 = H02319_A3918FacImpTot1[0] ;
            A440FacImpPP = H02319_A440FacImpPP[0] ;
            n440FacImpPP = H02319_n440FacImpPP[0] ;
            A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
            A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
            A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
            if ( A7209Colombia == 0 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
               }
               else
               {
                  A439FacImpGen = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
               }
            }
            A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
            A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
            A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Facturacion_abonoscargoswwds_12_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV136Facturacion_abonoscargoswwds_12_tffacbasimp) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to) <= 0 ) ) )
               {
                  A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
                  A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
                  A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
                  if ( A7209Colombia == 0 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                     }
                     else
                     {
                        A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                     }
                  }
                  A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
                  if ( A7209Colombia == 0 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                     }
                     else
                     {
                        A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                     }
                  }
                  A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
                  if ( A7209Colombia == 0 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                     }
                     else
                     {
                        A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Facturacion_abonoscargoswwds_14_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV138Facturacion_abonoscargoswwds_14_tffacivaimp) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to) <= 0 ) ) )
                     {
                        A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
                        if ( A7209Colombia == 0 )
                        {
                           A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        }
                        else
                        {
                           if ( A7209Colombia == 1 )
                           {
                              A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                           }
                           else
                           {
                              A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                           }
                        }
                        A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                        if ( (GXutil.strcmp("", AV125Facturacion_abonoscargoswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1153FacTipFac, 1, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV125Facturacion_abonoscargoswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A440FacImpPP, 11, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A429FacBasImp, 13, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A442FacIVAImp, 11, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A455FacTot, 13, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A435FacEst, 1, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A965FacCob) , GXutil.padr( "%" + GXutil.upper( AV125Facturacion_abonoscargoswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                        {
                           if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Facturacion_abonoscargoswwds_16_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV140Facturacion_abonoscargoswwds_16_tffactot) >= 0 ) ) )
                           {
                              if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV141Facturacion_abonoscargoswwds_17_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV141Facturacion_abonoscargoswwds_17_tffactot_to) <= 0 ) ) )
                              {
                                 e192312 ();
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
         wbEnd = (short)(46) ;
         wb2310( ) ;
      }
      bGXsfl_46_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2312( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACIMPPP", GXutil.ltrim( localUtil.ntoc( AV102TotFacImpPP, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPPP", getSecureSignedToken( "", localUtil.format( AV102TotFacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACBASIMP", GXutil.ltrim( localUtil.ntoc( AV104TotFacBasImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACBASIMP", getSecureSignedToken( "", localUtil.format( AV104TotFacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV106TotFacIVAImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIVAIMP", getSecureSignedToken( "", localUtil.format( AV106TotFacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACTOT", GXutil.ltrim( localUtil.ntoc( AV108TotFacTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACTOT", getSecureSignedToken( "", localUtil.format( AV108TotFacTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACPRI"+"_"+sGXsfl_46_idx, getSecureSignedToken( sGXsfl_46_idx, GXutil.rtrim( localUtil.format( A450FacPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV114FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV114FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACHOR", localUtil.ttoc( A9606FacHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACHOR", getSecureSignedToken( "", localUtil.format( A9606FacHor, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISTEC", GXutil.ltrim( localUtil.ntoc( AV112ExisteC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXISTEC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV112ExisteC), "ZZZ9")));
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
      AV125Facturacion_abonoscargoswwds_1_filterfulltext = AV15FilterFullText ;
      AV126Facturacion_abonoscargoswwds_2_tffaccod = AV26TFFacCod ;
      AV127Facturacion_abonoscargoswwds_3_tffaccod_to = AV27TFFacCod_To ;
      AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels = AV87TFFacTipFac_Sels ;
      AV129Facturacion_abonoscargoswwds_5_tffacfch = AV30TFFacFch ;
      AV130Facturacion_abonoscargoswwds_6_tfclicod = AV36TFCliCod ;
      AV131Facturacion_abonoscargoswwds_7_tfclicod_to = AV37TFCliCod_To ;
      AV132Facturacion_abonoscargoswwds_8_tfclinom = AV38TFCliNom ;
      AV133Facturacion_abonoscargoswwds_9_tfclinom_sel = AV39TFCliNom_Sel ;
      AV134Facturacion_abonoscargoswwds_10_tffacimppp = AV88TFFacImpPP ;
      AV135Facturacion_abonoscargoswwds_11_tffacimppp_to = AV89TFFacImpPP_To ;
      AV136Facturacion_abonoscargoswwds_12_tffacbasimp = AV90TFFacBasImp ;
      AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to = AV91TFFacBasImp_To ;
      AV138Facturacion_abonoscargoswwds_14_tffacivaimp = AV92TFFacIVAImp ;
      AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to = AV93TFFacIVAImp_To ;
      AV140Facturacion_abonoscargoswwds_16_tffactot = AV94TFFacTot ;
      AV141Facturacion_abonoscargoswwds_17_tffactot_to = AV95TFFacTot_To ;
      AV142Facturacion_abonoscargoswwds_18_tffacest_sels = AV97TFFacEst_Sels ;
      AV143Facturacion_abonoscargoswwds_19_tffaccob = AV98TFFacCob ;
      AV144Facturacion_abonoscargoswwds_20_tffaccob_sel = AV99TFFacCob_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV26TFFacCod, AV27TFFacCod_To, AV87TFFacTipFac_Sels, AV30TFFacFch, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV88TFFacImpPP, AV89TFFacImpPP_To, AV90TFFacBasImp, AV91TFFacBasImp_To, AV92TFFacIVAImp, AV93TFFacIVAImp_To, AV94TFFacTot, AV95TFFacTot_To, AV97TFFacEst_Sels, AV98TFFacCob, AV99TFFacCob_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV102TotFacImpPP, AV104TotFacBasImp, AV106TotFacIVAImp, AV108TotFacTot, AV114FirmaD, AV112ExisteC, A9606FacHor) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV125Facturacion_abonoscargoswwds_1_filterfulltext = AV15FilterFullText ;
      AV126Facturacion_abonoscargoswwds_2_tffaccod = AV26TFFacCod ;
      AV127Facturacion_abonoscargoswwds_3_tffaccod_to = AV27TFFacCod_To ;
      AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels = AV87TFFacTipFac_Sels ;
      AV129Facturacion_abonoscargoswwds_5_tffacfch = AV30TFFacFch ;
      AV130Facturacion_abonoscargoswwds_6_tfclicod = AV36TFCliCod ;
      AV131Facturacion_abonoscargoswwds_7_tfclicod_to = AV37TFCliCod_To ;
      AV132Facturacion_abonoscargoswwds_8_tfclinom = AV38TFCliNom ;
      AV133Facturacion_abonoscargoswwds_9_tfclinom_sel = AV39TFCliNom_Sel ;
      AV134Facturacion_abonoscargoswwds_10_tffacimppp = AV88TFFacImpPP ;
      AV135Facturacion_abonoscargoswwds_11_tffacimppp_to = AV89TFFacImpPP_To ;
      AV136Facturacion_abonoscargoswwds_12_tffacbasimp = AV90TFFacBasImp ;
      AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to = AV91TFFacBasImp_To ;
      AV138Facturacion_abonoscargoswwds_14_tffacivaimp = AV92TFFacIVAImp ;
      AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to = AV93TFFacIVAImp_To ;
      AV140Facturacion_abonoscargoswwds_16_tffactot = AV94TFFacTot ;
      AV141Facturacion_abonoscargoswwds_17_tffactot_to = AV95TFFacTot_To ;
      AV142Facturacion_abonoscargoswwds_18_tffacest_sels = AV97TFFacEst_Sels ;
      AV143Facturacion_abonoscargoswwds_19_tffaccob = AV98TFFacCob ;
      AV144Facturacion_abonoscargoswwds_20_tffaccob_sel = AV99TFFacCob_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV26TFFacCod, AV27TFFacCod_To, AV87TFFacTipFac_Sels, AV30TFFacFch, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV88TFFacImpPP, AV89TFFacImpPP_To, AV90TFFacBasImp, AV91TFFacBasImp_To, AV92TFFacIVAImp, AV93TFFacIVAImp_To, AV94TFFacTot, AV95TFFacTot_To, AV97TFFacEst_Sels, AV98TFFacCob, AV99TFFacCob_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV102TotFacImpPP, AV104TotFacBasImp, AV106TotFacIVAImp, AV108TotFacTot, AV114FirmaD, AV112ExisteC, A9606FacHor) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV125Facturacion_abonoscargoswwds_1_filterfulltext = AV15FilterFullText ;
      AV126Facturacion_abonoscargoswwds_2_tffaccod = AV26TFFacCod ;
      AV127Facturacion_abonoscargoswwds_3_tffaccod_to = AV27TFFacCod_To ;
      AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels = AV87TFFacTipFac_Sels ;
      AV129Facturacion_abonoscargoswwds_5_tffacfch = AV30TFFacFch ;
      AV130Facturacion_abonoscargoswwds_6_tfclicod = AV36TFCliCod ;
      AV131Facturacion_abonoscargoswwds_7_tfclicod_to = AV37TFCliCod_To ;
      AV132Facturacion_abonoscargoswwds_8_tfclinom = AV38TFCliNom ;
      AV133Facturacion_abonoscargoswwds_9_tfclinom_sel = AV39TFCliNom_Sel ;
      AV134Facturacion_abonoscargoswwds_10_tffacimppp = AV88TFFacImpPP ;
      AV135Facturacion_abonoscargoswwds_11_tffacimppp_to = AV89TFFacImpPP_To ;
      AV136Facturacion_abonoscargoswwds_12_tffacbasimp = AV90TFFacBasImp ;
      AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to = AV91TFFacBasImp_To ;
      AV138Facturacion_abonoscargoswwds_14_tffacivaimp = AV92TFFacIVAImp ;
      AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to = AV93TFFacIVAImp_To ;
      AV140Facturacion_abonoscargoswwds_16_tffactot = AV94TFFacTot ;
      AV141Facturacion_abonoscargoswwds_17_tffactot_to = AV95TFFacTot_To ;
      AV142Facturacion_abonoscargoswwds_18_tffacest_sels = AV97TFFacEst_Sels ;
      AV143Facturacion_abonoscargoswwds_19_tffaccob = AV98TFFacCob ;
      AV144Facturacion_abonoscargoswwds_20_tffaccob_sel = AV99TFFacCob_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV26TFFacCod, AV27TFFacCod_To, AV87TFFacTipFac_Sels, AV30TFFacFch, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV88TFFacImpPP, AV89TFFacImpPP_To, AV90TFFacBasImp, AV91TFFacBasImp_To, AV92TFFacIVAImp, AV93TFFacIVAImp_To, AV94TFFacTot, AV95TFFacTot_To, AV97TFFacEst_Sels, AV98TFFacCob, AV99TFFacCob_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV102TotFacImpPP, AV104TotFacBasImp, AV106TotFacIVAImp, AV108TotFacTot, AV114FirmaD, AV112ExisteC, A9606FacHor) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV125Facturacion_abonoscargoswwds_1_filterfulltext = AV15FilterFullText ;
      AV126Facturacion_abonoscargoswwds_2_tffaccod = AV26TFFacCod ;
      AV127Facturacion_abonoscargoswwds_3_tffaccod_to = AV27TFFacCod_To ;
      AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels = AV87TFFacTipFac_Sels ;
      AV129Facturacion_abonoscargoswwds_5_tffacfch = AV30TFFacFch ;
      AV130Facturacion_abonoscargoswwds_6_tfclicod = AV36TFCliCod ;
      AV131Facturacion_abonoscargoswwds_7_tfclicod_to = AV37TFCliCod_To ;
      AV132Facturacion_abonoscargoswwds_8_tfclinom = AV38TFCliNom ;
      AV133Facturacion_abonoscargoswwds_9_tfclinom_sel = AV39TFCliNom_Sel ;
      AV134Facturacion_abonoscargoswwds_10_tffacimppp = AV88TFFacImpPP ;
      AV135Facturacion_abonoscargoswwds_11_tffacimppp_to = AV89TFFacImpPP_To ;
      AV136Facturacion_abonoscargoswwds_12_tffacbasimp = AV90TFFacBasImp ;
      AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to = AV91TFFacBasImp_To ;
      AV138Facturacion_abonoscargoswwds_14_tffacivaimp = AV92TFFacIVAImp ;
      AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to = AV93TFFacIVAImp_To ;
      AV140Facturacion_abonoscargoswwds_16_tffactot = AV94TFFacTot ;
      AV141Facturacion_abonoscargoswwds_17_tffactot_to = AV95TFFacTot_To ;
      AV142Facturacion_abonoscargoswwds_18_tffacest_sels = AV97TFFacEst_Sels ;
      AV143Facturacion_abonoscargoswwds_19_tffaccob = AV98TFFacCob ;
      AV144Facturacion_abonoscargoswwds_20_tffaccob_sel = AV99TFFacCob_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV26TFFacCod, AV27TFFacCod_To, AV87TFFacTipFac_Sels, AV30TFFacFch, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV88TFFacImpPP, AV89TFFacImpPP_To, AV90TFFacBasImp, AV91TFFacBasImp_To, AV92TFFacIVAImp, AV93TFFacIVAImp_To, AV94TFFacTot, AV95TFFacTot_To, AV97TFFacEst_Sels, AV98TFFacCob, AV99TFFacCob_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV102TotFacImpPP, AV104TotFacBasImp, AV106TotFacIVAImp, AV108TotFacTot, AV114FirmaD, AV112ExisteC, A9606FacHor) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV125Facturacion_abonoscargoswwds_1_filterfulltext = AV15FilterFullText ;
      AV126Facturacion_abonoscargoswwds_2_tffaccod = AV26TFFacCod ;
      AV127Facturacion_abonoscargoswwds_3_tffaccod_to = AV27TFFacCod_To ;
      AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels = AV87TFFacTipFac_Sels ;
      AV129Facturacion_abonoscargoswwds_5_tffacfch = AV30TFFacFch ;
      AV130Facturacion_abonoscargoswwds_6_tfclicod = AV36TFCliCod ;
      AV131Facturacion_abonoscargoswwds_7_tfclicod_to = AV37TFCliCod_To ;
      AV132Facturacion_abonoscargoswwds_8_tfclinom = AV38TFCliNom ;
      AV133Facturacion_abonoscargoswwds_9_tfclinom_sel = AV39TFCliNom_Sel ;
      AV134Facturacion_abonoscargoswwds_10_tffacimppp = AV88TFFacImpPP ;
      AV135Facturacion_abonoscargoswwds_11_tffacimppp_to = AV89TFFacImpPP_To ;
      AV136Facturacion_abonoscargoswwds_12_tffacbasimp = AV90TFFacBasImp ;
      AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to = AV91TFFacBasImp_To ;
      AV138Facturacion_abonoscargoswwds_14_tffacivaimp = AV92TFFacIVAImp ;
      AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to = AV93TFFacIVAImp_To ;
      AV140Facturacion_abonoscargoswwds_16_tffactot = AV94TFFacTot ;
      AV141Facturacion_abonoscargoswwds_17_tffactot_to = AV95TFFacTot_To ;
      AV142Facturacion_abonoscargoswwds_18_tffacest_sels = AV97TFFacEst_Sels ;
      AV143Facturacion_abonoscargoswwds_19_tffaccob = AV98TFFacCob ;
      AV144Facturacion_abonoscargoswwds_20_tffaccob_sel = AV99TFFacCob_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV15FilterFullText, AV26TFFacCod, AV27TFFacCod_To, AV87TFFacTipFac_Sels, AV30TFFacFch, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV88TFFacImpPP, AV89TFFacImpPP_To, AV90TFFacBasImp, AV91TFFacBasImp_To, AV92TFFacIVAImp, AV93TFFacIVAImp_To, AV94TFFacTot, AV95TFFacTot_To, AV97TFFacEst_Sels, AV98TFFacCob, AV99TFFacCob_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV102TotFacImpPP, AV104TotFacBasImp, AV106TotFacIVAImp, AV108TotFacTot, AV114FirmaD, AV112ExisteC, A9606FacHor) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV123Pgmname = "Facturacion.AbonosCargosWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123Pgmname", AV123Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluefacimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacimppp_Enabled), 5, 0), true);
      edtavTotvaluefacbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacbasimp_Enabled), 5, 0), true);
      edtavTotvaluefacivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacivaimp_Enabled), 5, 0), true);
      edtavTotvaluefactot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefactot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefactot_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2310( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e172312 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      /* Using cursor H023110 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      A7209Colombia = H023110_A7209Colombia[0] ;
      n7209Colombia = H023110_n7209Colombia[0] ;
      pr_default.close(2);
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV76DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_46 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_46"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV78GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV79GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
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
         cmbavFactipfac.setName( cmbavFactipfac.getInternalname() );
         cmbavFactipfac.setValue( httpContext.cgiGet( cmbavFactipfac.getInternalname()) );
         AV85FacTipFac = (byte)(GXutil.lval( httpContext.cgiGet( cmbavFactipfac.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85FacTipFac", GXutil.str( AV85FacTipFac, 1, 0));
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV103TotValueFacImpPP = httpContext.cgiGet( edtavTotvaluefacimppp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103TotValueFacImpPP", AV103TotValueFacImpPP);
         AV105TotValueFacBasImp = httpContext.cgiGet( edtavTotvaluefacbasimp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105TotValueFacBasImp", AV105TotValueFacBasImp);
         AV107TotValueFacIVAImp = httpContext.cgiGet( edtavTotvaluefacivaimp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107TotValueFacIVAImp", AV107TotValueFacIVAImp);
         AV109TotValueFacTot = httpContext.cgiGet( edtavTotvaluefactot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109TotValueFacTot", AV109TotValueFacTot);
         AV123Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV123Pgmname", AV123Pgmname);
         AV113FacPri = httpContext.cgiGet( edtavFacpri_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV113FacPri", AV113FacPri);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_facfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FACFCHAUXDATE");
            GX_FocusControl = edtavDdo_facfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32DDO_FacFchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32DDO_FacFchAuxDate", localUtil.format(AV32DDO_FacFchAuxDate, "99/99/99"));
         }
         else
         {
            AV32DDO_FacFchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_facfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32DDO_FacFchAuxDate", localUtil.format(AV32DDO_FacFchAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"AbonosCargosWW");
         AV123Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV123Pgmname", AV123Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV123Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\abonoscargosww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e172312 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e172312( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV81Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      abonoscargosww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV81Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV82EmprNom ;
      GXv_char4[0] = AV83UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV81Station, GXv_char2, GXv_char3, GXv_char4) ;
      abonoscargosww_impl.this.A396EmprCod = GXv_char2[0] ;
      abonoscargosww_impl.this.AV82EmprNom = GXv_char3[0] ;
      abonoscargosww_impl.this.AV83UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXt_int5 = (byte)(AV114FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDIG", ""), GXv_int6) ;
      abonoscargosww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV114FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114FirmaD), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV114FirmaD), "ZZZ9")));
      GXt_char1 = AV84ContDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "FIRDIG", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      abonoscargosww_impl.this.A396EmprCod = GXv_char4[0] ;
      abonoscargosww_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV84ContDsc = GXt_char1 ;
      AV113FacPri = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113FacPri", AV113FacPri);
      if ( AV85FacTipFac == 1 )
      {
         AV110ContCod = "050200" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110ContCod", AV110ContCod);
      }
      else if ( AV85FacTipFac == 2 )
      {
         AV110ContCod = "050300" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110ContCod", AV110ContCod);
      }
      else
      {
      }
      GXt_int5 = (byte)(AV112ExisteC) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, AV110ContCod, GXv_int6) ;
      abonoscargosww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV112ExisteC = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112ExisteC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112ExisteC), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXISTEC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV112ExisteC), "ZZZ9")));
      GXt_char1 = AV81Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      abonoscargosww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV81Station = GXt_char1 ;
      GXv_char4[0] = AV124Emprcod ;
      GXv_char3[0] = AV82EmprNom ;
      GXv_char2[0] = AV83UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV81Station, GXv_char4, GXv_char3, GXv_char2) ;
      abonoscargosww_impl.this.AV124Emprcod = GXv_char4[0] ;
      abonoscargosww_impl.this.AV82EmprNom = GXv_char3[0] ;
      abonoscargosww_impl.this.AV83UsurCod = GXv_char2[0] ;
      edtavFacpri_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacpri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacpri_Visible), 5, 0), true);
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
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Abonos / Cargos", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV76DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV76DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e182312( )
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
      if ( AV23ManageFiltersExecutionStep == 1 )
      {
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV23ManageFiltersExecutionStep == 2 )
      {
         AV23ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
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
      if ( GXutil.strcmp(AV20Session.getValue("Facturacion.AbonosCargosWWColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("Facturacion.AbonosCargosWWColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
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
      edtFacCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Visible), 5, 0), !bGXsfl_46_Refreshing);
      cmbFacTipFac.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacTipFac.getInternalname(), "Visible", GXutil.ltrimstr( cmbFacTipFac.getVisible(), 5, 0), !bGXsfl_46_Refreshing);
      edtFacFch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtFacImpPP_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImpPP_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpPP_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtFacBasImp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBasImp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBasImp_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtFacIVAImp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacIVAImp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAImp_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtFacTot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacTot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacTot_Visible), 5, 0), !bGXsfl_46_Refreshing);
      cmbFacEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbFacEst.getVisible(), 5, 0), !bGXsfl_46_Refreshing);
      edtFacCob_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCob_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCob_Visible), 5, 0), !bGXsfl_46_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV78GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78GridCurrentPage), 10, 0));
      AV79GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV125Facturacion_abonoscargoswwds_1_filterfulltext = AV15FilterFullText ;
      AV126Facturacion_abonoscargoswwds_2_tffaccod = AV26TFFacCod ;
      AV127Facturacion_abonoscargoswwds_3_tffaccod_to = AV27TFFacCod_To ;
      AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels = AV87TFFacTipFac_Sels ;
      AV129Facturacion_abonoscargoswwds_5_tffacfch = AV30TFFacFch ;
      AV130Facturacion_abonoscargoswwds_6_tfclicod = AV36TFCliCod ;
      AV131Facturacion_abonoscargoswwds_7_tfclicod_to = AV37TFCliCod_To ;
      AV132Facturacion_abonoscargoswwds_8_tfclinom = AV38TFCliNom ;
      AV133Facturacion_abonoscargoswwds_9_tfclinom_sel = AV39TFCliNom_Sel ;
      AV134Facturacion_abonoscargoswwds_10_tffacimppp = AV88TFFacImpPP ;
      AV135Facturacion_abonoscargoswwds_11_tffacimppp_to = AV89TFFacImpPP_To ;
      AV136Facturacion_abonoscargoswwds_12_tffacbasimp = AV90TFFacBasImp ;
      AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to = AV91TFFacBasImp_To ;
      AV138Facturacion_abonoscargoswwds_14_tffacivaimp = AV92TFFacIVAImp ;
      AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to = AV93TFFacIVAImp_To ;
      AV140Facturacion_abonoscargoswwds_16_tffactot = AV94TFFacTot ;
      AV141Facturacion_abonoscargoswwds_17_tffactot_to = AV95TFFacTot_To ;
      AV142Facturacion_abonoscargoswwds_18_tffacest_sels = AV97TFFacEst_Sels ;
      AV143Facturacion_abonoscargoswwds_19_tffaccob = AV98TFFacCob ;
      AV144Facturacion_abonoscargoswwds_20_tffaccob_sel = AV99TFFacCob_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e122312( )
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
         AV77PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV77PageToGo) ;
      }
   }

   public void e132312( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142312( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacCod") == 0 )
         {
            AV26TFFacCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFFacCod), 8, 0));
            AV27TFFacCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFFacCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacTipFac") == 0 )
         {
            AV86TFFacTipFac_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFFacTipFac_SelsJson", AV86TFFacTipFac_SelsJson);
            AV87TFFacTipFac_Sels.fromJSonString(GXutil.strReplace( AV86TFFacTipFac_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacFch") == 0 )
         {
            AV30TFFacFch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFFacFch", localUtil.format(AV30TFFacFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
            AV37TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV38TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFCliNom", AV38TFCliNom);
            AV39TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFCliNom_Sel", AV39TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacImpPP") == 0 )
         {
            AV88TFFacImpPP = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFFacImpPP", GXutil.ltrimstr( AV88TFFacImpPP, 11, 2));
            AV89TFFacImpPP_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFFacImpPP_To", GXutil.ltrimstr( AV89TFFacImpPP_To, 11, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacBasImp") == 0 )
         {
            AV90TFFacBasImp = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFFacBasImp", GXutil.ltrimstr( AV90TFFacBasImp, 13, 2));
            AV91TFFacBasImp_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFFacBasImp_To", GXutil.ltrimstr( AV91TFFacBasImp_To, 13, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacIVAImp") == 0 )
         {
            AV92TFFacIVAImp = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFFacIVAImp", GXutil.ltrimstr( AV92TFFacIVAImp, 11, 2));
            AV93TFFacIVAImp_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFFacIVAImp_To", GXutil.ltrimstr( AV93TFFacIVAImp_To, 11, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacTot") == 0 )
         {
            AV94TFFacTot = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFFacTot", GXutil.ltrimstr( AV94TFFacTot, 13, 2));
            AV95TFFacTot_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFFacTot_To", GXutil.ltrimstr( AV95TFFacTot_To, 13, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacEst") == 0 )
         {
            AV96TFFacEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFFacEst_SelsJson", AV96TFFacEst_SelsJson);
            AV97TFFacEst_Sels.fromJSonString(GXutil.strReplace( AV96TFFacEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacCob") == 0 )
         {
            AV98TFFacCob = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFFacCob", AV98TFFacCob);
            AV99TFFacCob_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFFacCob_Sel", AV99TFFacCob_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97TFFacEst_Sels", AV97TFFacEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV87TFFacTipFac_Sels", AV87TFFacTipFac_Sels);
   }

   private void e192312( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Hash", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(46) ;
         }
         sendrow_462( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_46_Refreshing )
      {
         httpContext.doAjaxLoad(46, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV80GridActions, 4, 0)) );
   }

   public void e152312( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Facturacion.AbonosCargosWWColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e112312( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Facturacion.AbonosCargosWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV123Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Facturacion.AbonosCargosWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Facturacion.AbonosCargosWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         abonoscargosww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV123Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
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
            S202 ();
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
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV87TFFacTipFac_Sels", AV87TFFacTipFac_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97TFFacEst_Sels", AV97TFFacEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void e202312( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV80GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S212 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      else if ( AV80GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S222 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      else if ( AV80GridActions == 3 )
      {
         /* Execute user subroutine: 'DO HASH' */
         S232 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      AV80GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV80GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e162312( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      if ( (0==AV112ExisteC) )
      {
         if ( AV85FacTipFac == 1 )
         {
            Gx_msg = httpContext.getMessage( "NAO EXISTE CONTADOR FATURAS DE DEBITO¡¡¡", "") ;
         }
         else
         {
            Gx_msg = httpContext.getMessage( "NAO EXISTE CONTADOR FATURAS DE CREDITO¡¡¡", "") ;
         }
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         callWebObject(formatLink("app.facturacion.abonoscargos", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(AV85FacTipFac,1,0)),GXutil.URLEncode(GXutil.rtrim(AV113FacPri))}, new String[] {"Mode","EmprCod","FacCod","FacTipFac","FacPri"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
         if ( 1 == 0 )
         {
            callWebObject(formatLink("app.facturacion.abonoscargos", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(AV85FacTipFac,1,0)),GXutil.URLEncode(GXutil.rtrim(AV113FacPri))}, new String[] {"Mode","EmprCod","FacCod","FacTipFac","FacPri"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
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
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FacCod", "", "Nº Factura", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FacTipFac", "", "Tipo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FacFch", "", "Fecha", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCod", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FacImpPP", "", "Imp. Dto. P.P.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FacBasImp", "", "Base Imp.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FacIVAImp", "", "Imp. IVA", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FacTot", "", "Total", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FacEst", "", "E", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "FacCob", "", "Ctb", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.AbonosCargosWWColumnsSelector", GXv_char4) ;
      abonoscargosww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Facturacion.AbonosCargosWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFFacCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFFacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFFacCod), 8, 0));
      AV27TFFacCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFFacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFFacCod_To), 8, 0));
      AV87TFFacTipFac_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV30TFFacFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFFacFch", localUtil.format(AV30TFFacFch, "99/99/99"));
      AV36TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
      AV37TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
      AV38TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFCliNom", AV38TFCliNom);
      AV39TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFCliNom_Sel", AV39TFCliNom_Sel);
      AV88TFFacImpPP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFFacImpPP", GXutil.ltrimstr( AV88TFFacImpPP, 11, 2));
      AV89TFFacImpPP_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFFacImpPP_To", GXutil.ltrimstr( AV89TFFacImpPP_To, 11, 2));
      AV90TFFacBasImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFFacBasImp", GXutil.ltrimstr( AV90TFFacBasImp, 13, 2));
      AV91TFFacBasImp_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFFacBasImp_To", GXutil.ltrimstr( AV91TFFacBasImp_To, 13, 2));
      AV92TFFacIVAImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFFacIVAImp", GXutil.ltrimstr( AV92TFFacIVAImp, 11, 2));
      AV93TFFacIVAImp_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93TFFacIVAImp_To", GXutil.ltrimstr( AV93TFFacIVAImp_To, 11, 2));
      AV94TFFacTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94TFFacTot", GXutil.ltrimstr( AV94TFFacTot, 13, 2));
      AV95TFFacTot_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFFacTot_To", GXutil.ltrimstr( AV95TFFacTot_To, 13, 2));
      AV97TFFacEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV98TFFacCob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98TFFacCob", AV98TFFacCob);
      AV99TFFacCob_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99TFFacCob_Sel", AV99TFFacCob_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S212( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.facturacion.abonoscargos", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A1153FacTipFac,1,0)),GXutil.URLEncode(GXutil.rtrim(A450FacPri))}, new String[] {"Mode","EmprCod","FacCod","FacTipFac","FacPri"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.facturacion.abonoscargos", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV85FacTipFac,1,0)),GXutil.URLEncode(GXutil.rtrim(AV113FacPri))}, new String[] {"Mode","EmprCod","FacCod","FacTipFac","FacPri"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S222( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( ( AV114FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Factura Impresa.NO se permite MODIFICACION.Activado FIRMA DIGITAL", ""));
      }
      else
      {
         if ( GXutil.strcmp(A965FacCob, httpContext.getMessage( "S", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura Traspasada a Contabilidad", ""));
         }
         else
         {
            callWebObject(formatLink("app.facturacion.abonoscargos", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A1153FacTipFac,1,0)),GXutil.URLEncode(GXutil.rtrim(A450FacPri))}, new String[] {"Mode","EmprCod","FacCod","FacTipFac","FacPri"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
            if ( 1 == 0 )
            {
               callWebObject(formatLink("app.facturacion.abonoscargos", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV85FacTipFac,1,0)),GXutil.URLEncode(GXutil.rtrim(AV113FacPri))}, new String[] {"Mode","EmprCod","FacCod","FacTipFac","FacPri"}) );
               httpContext.wjLocDisableFrm = (byte)(1) ;
            }
         }
      }
   }

   public void S232( )
   {
      /* 'DO HASH' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV115Cadena ;
      GXv_char3[0] = AV116firma ;
      new app.obtengocadenaparahashdocumentofactura(remoteHandle, context).execute( A396EmprCod, A430FacCod, A9606FacHor, GXv_char4, GXv_char3) ;
      abonoscargosww_impl.this.AV115Cadena = GXv_char4[0] ;
      abonoscargosww_impl.this.AV116firma = GXv_char3[0] ;
      GXv_char4[0] = AV117Hash ;
      GXv_objcol_SdtMessages_Message14[0] = AV118Messages ;
      GXv_boolean15[0] = AV119ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV115Cadena, GXv_char4, GXv_objcol_SdtMessages_Message14, GXv_boolean15) ;
      abonoscargosww_impl.this.AV117Hash = GXv_char4[0] ;
      AV118Messages = GXv_objcol_SdtMessages_Message14[0] ;
      abonoscargosww_impl.this.AV119ok = GXv_boolean15[0] ;
      if ( AV119ok )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int16[0] = A430FacCod ;
         GXv_char3[0] = AV115Cadena ;
         GXv_char2[0] = AV117Hash ;
         new app.facturacion.actualizohashdocumentofactura(remoteHandle, context).execute( GXv_char4, GXv_int16, GXv_char3, GXv_char2) ;
         abonoscargosww_impl.this.A396EmprCod = GXv_char4[0] ;
         abonoscargosww_impl.this.A430FacCod = GXv_int16[0] ;
         abonoscargosww_impl.this.AV115Cadena = GXv_char3[0] ;
         abonoscargosww_impl.this.AV117Hash = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
      }
      else
      {
         AV146GXV1 = 1 ;
         while ( AV146GXV1 <= AV118Messages.size() )
         {
            AV120Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV118Messages.elementAt(-1+AV146GXV1));
            httpContext.GX_msglist.addItem(AV120Message.getgxTv_SdtMessages_Message_Description());
            AV146GXV1 = (int)(AV146GXV1+1) ;
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV123Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV123Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV123Pgmname+"GridState"), null, null);
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
      S202 ();
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

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV147GXV2 = 1 ;
      while ( AV147GXV2 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV147GXV2));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOD") == 0 )
         {
            AV26TFFacCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFFacCod), 8, 0));
            AV27TFFacCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFFacCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACTIPFAC_SEL") == 0 )
         {
            AV86TFFacTipFac_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFFacTipFac_SelsJson", AV86TFFacTipFac_SelsJson);
            AV87TFFacTipFac_Sels.fromJSonString(AV86TFFacTipFac_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACFCH") == 0 )
         {
            AV30TFFacFch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFFacFch", localUtil.format(AV30TFFacFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
            AV37TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV38TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFCliNom", AV38TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV39TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFCliNom_Sel", AV39TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIMPPP") == 0 )
         {
            AV88TFFacImpPP = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFFacImpPP", GXutil.ltrimstr( AV88TFFacImpPP, 11, 2));
            AV89TFFacImpPP_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFFacImpPP_To", GXutil.ltrimstr( AV89TFFacImpPP_To, 11, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBASIMP") == 0 )
         {
            AV90TFFacBasImp = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFFacBasImp", GXutil.ltrimstr( AV90TFFacBasImp, 13, 2));
            AV91TFFacBasImp_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFFacBasImp_To", GXutil.ltrimstr( AV91TFFacBasImp_To, 13, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIVAIMP") == 0 )
         {
            AV92TFFacIVAImp = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFFacIVAImp", GXutil.ltrimstr( AV92TFFacIVAImp, 11, 2));
            AV93TFFacIVAImp_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFFacIVAImp_To", GXutil.ltrimstr( AV93TFFacIVAImp_To, 11, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACTOT") == 0 )
         {
            AV94TFFacTot = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFFacTot", GXutil.ltrimstr( AV94TFFacTot, 13, 2));
            AV95TFFacTot_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFFacTot_To", GXutil.ltrimstr( AV95TFFacTot_To, 13, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACEST_SEL") == 0 )
         {
            AV96TFFacEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFFacEst_SelsJson", AV96TFFacEst_SelsJson);
            AV97TFFacEst_Sels.fromJSonString(AV96TFFacEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOB") == 0 )
         {
            AV98TFFacCob = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFFacCob", AV98TFFacCob);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOB_SEL") == 0 )
         {
            AV99TFFacCob_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFFacCob_Sel", AV99TFFacCob_Sel);
         }
         AV147GXV2 = (int)(AV147GXV2+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFCliNom_Sel)==0), AV39TFCliNom_Sel, GXv_char4) ;
      abonoscargosww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char17 = "" ;
      GXv_char3[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV99TFFacCob_Sel)==0), AV99TFFacCob_Sel, GXv_char3) ;
      abonoscargosww_impl.this.GXt_char17 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+((AV87TFFacTipFac_Sels.size()==0) ? "" : AV86TFFacTipFac_SelsJson)+"|||"+GXt_char1+"|||||"+((AV97TFFacEst_Sels.size()==0) ? "" : AV96TFFacEst_SelsJson)+"|"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFCliNom)==0), AV38TFCliNom, GXv_char4) ;
      abonoscargosww_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV98TFFacCob)==0), AV98TFFacCob, GXv_char3) ;
      abonoscargosww_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFFacCod) ? "" : GXutil.str( AV26TFFacCod, 8, 0))+"||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30TFFacFch)) ? "" : localUtil.dtoc( AV30TFFacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV36TFCliCod) ? "" : GXutil.str( AV36TFCliCod, 6, 0))+"|"+GXt_char17+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFFacImpPP)==0) ? "" : GXutil.str( AV88TFFacImpPP, 11, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV90TFFacBasImp)==0) ? "" : GXutil.str( AV90TFFacBasImp, 13, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFFacIVAImp)==0) ? "" : GXutil.str( AV92TFFacIVAImp, 11, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV94TFFacTot)==0) ? "" : GXutil.str( AV94TFFacTot, 13, 2))+"||"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFFacCod_To) ? "" : GXutil.str( AV27TFFacCod_To, 8, 0))+"|||"+((0==AV37TFCliCod_To) ? "" : GXutil.str( AV37TFCliCod_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFFacImpPP_To)==0) ? "" : GXutil.str( AV89TFFacImpPP_To, 11, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFFacBasImp_To)==0) ? "" : GXutil.str( AV91TFFacBasImp_To, 13, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFFacIVAImp_To)==0) ? "" : GXutil.str( AV93TFFacIVAImp_To, 11, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV95TFFacTot_To)==0) ? "" : GXutil.str( AV95TFFacTot_To, 13, 2))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV123Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACCOD", "", !((0==AV26TFFacCod)&&(0==AV27TFFacCod_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFFacCod, 8, 0)), GXutil.trim( GXutil.str( AV27TFFacCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACTIPFAC_SEL", "", !(AV87TFFacTipFac_Sels.size()==0), (short)(0), AV87TFFacTipFac_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30TFFacFch)), (short)(0), GXutil.trim( localUtil.dtoc( AV30TFFacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCLICOD", "", !((0==AV36TFCliCod)&&(0==AV37TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV37TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCLINOM", "", !(GXutil.strcmp("", AV38TFCliNom)==0), (short)(0), AV38TFCliNom, "", !(GXutil.strcmp("", AV39TFCliNom_Sel)==0), AV39TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACIMPPP", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFFacImpPP)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFFacImpPP_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV88TFFacImpPP, 11, 2)), GXutil.trim( GXutil.str( AV89TFFacImpPP_To, 11, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACBASIMP", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV90TFFacBasImp)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFFacBasImp_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV90TFFacBasImp, 13, 2)), GXutil.trim( GXutil.str( AV91TFFacBasImp_To, 13, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACIVAIMP", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFFacIVAImp)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFFacIVAImp_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV92TFFacIVAImp, 11, 2)), GXutil.trim( GXutil.str( AV93TFFacIVAImp_To, 11, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACTOT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV94TFFacTot)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV95TFFacTot_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV94TFFacTot, 13, 2)), GXutil.trim( GXutil.str( AV95TFFacTot_To, 13, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACEST_SEL", "", !(AV97TFFacEst_Sels.size()==0), (short)(0), AV97TFFacEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACCOB", "", !(GXutil.strcmp("", AV98TFFacCob)==0), (short)(0), AV98TFFacCob, "", !(GXutil.strcmp("", AV99TFFacCob_Sel)==0), AV99TFFacCob_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV123Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV123Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Facturacion.AbonosCargos" );
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV102TotFacImpPP = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102TotFacImpPP", GXutil.ltrimstr( AV102TotFacImpPP, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPPP", getSecureSignedToken( "", localUtil.format( AV102TotFacImpPP, "ZZZZZZZ9.99")));
      AV104TotFacBasImp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104TotFacBasImp", GXutil.ltrimstr( AV104TotFacBasImp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACBASIMP", getSecureSignedToken( "", localUtil.format( AV104TotFacBasImp, "ZZZZZZZZZ9.99")));
      AV106TotFacIVAImp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106TotFacIVAImp", GXutil.ltrimstr( AV106TotFacIVAImp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIVAIMP", getSecureSignedToken( "", localUtil.format( AV106TotFacIVAImp, "ZZZZZZZ9.99")));
      AV108TotFacTot = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108TotFacTot", GXutil.ltrimstr( AV108TotFacTot, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACTOT", getSecureSignedToken( "", localUtil.format( AV108TotFacTot, "ZZZZZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV125Facturacion_abonoscargoswwds_1_filterfulltext = AV15FilterFullText ;
      AV126Facturacion_abonoscargoswwds_2_tffaccod = AV26TFFacCod ;
      AV127Facturacion_abonoscargoswwds_3_tffaccod_to = AV27TFFacCod_To ;
      AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels = AV87TFFacTipFac_Sels ;
      AV129Facturacion_abonoscargoswwds_5_tffacfch = AV30TFFacFch ;
      AV130Facturacion_abonoscargoswwds_6_tfclicod = AV36TFCliCod ;
      AV131Facturacion_abonoscargoswwds_7_tfclicod_to = AV37TFCliCod_To ;
      AV132Facturacion_abonoscargoswwds_8_tfclinom = AV38TFCliNom ;
      AV133Facturacion_abonoscargoswwds_9_tfclinom_sel = AV39TFCliNom_Sel ;
      AV134Facturacion_abonoscargoswwds_10_tffacimppp = AV88TFFacImpPP ;
      AV135Facturacion_abonoscargoswwds_11_tffacimppp_to = AV89TFFacImpPP_To ;
      AV136Facturacion_abonoscargoswwds_12_tffacbasimp = AV90TFFacBasImp ;
      AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to = AV91TFFacBasImp_To ;
      AV138Facturacion_abonoscargoswwds_14_tffacivaimp = AV92TFFacIVAImp ;
      AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to = AV93TFFacIVAImp_To ;
      AV140Facturacion_abonoscargoswwds_16_tffactot = AV94TFFacTot ;
      AV141Facturacion_abonoscargoswwds_17_tffactot_to = AV95TFFacTot_To ;
      AV142Facturacion_abonoscargoswwds_18_tffacest_sels = AV97TFFacEst_Sels ;
      AV143Facturacion_abonoscargoswwds_19_tffaccob = AV98TFFacCob ;
      AV144Facturacion_abonoscargoswwds_20_tffaccob_sel = AV99TFFacCob_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels ,
                                           Byte.valueOf(A435FacEst) ,
                                           AV142Facturacion_abonoscargoswwds_18_tffacest_sels ,
                                           Integer.valueOf(AV126Facturacion_abonoscargoswwds_2_tffaccod) ,
                                           Integer.valueOf(AV127Facturacion_abonoscargoswwds_3_tffaccod_to) ,
                                           Integer.valueOf(AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels.size()) ,
                                           AV129Facturacion_abonoscargoswwds_5_tffacfch ,
                                           Integer.valueOf(AV130Facturacion_abonoscargoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV131Facturacion_abonoscargoswwds_7_tfclicod_to) ,
                                           AV133Facturacion_abonoscargoswwds_9_tfclinom_sel ,
                                           AV132Facturacion_abonoscargoswwds_8_tfclinom ,
                                           Integer.valueOf(AV142Facturacion_abonoscargoswwds_18_tffacest_sels.size()) ,
                                           AV144Facturacion_abonoscargoswwds_20_tffaccob_sel ,
                                           AV143Facturacion_abonoscargoswwds_19_tffaccob ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A965FacCob ,
                                           AV125Facturacion_abonoscargoswwds_1_filterfulltext ,
                                           A440FacImpPP ,
                                           A429FacBasImp ,
                                           A442FacIVAImp ,
                                           A455FacTot ,
                                           AV134Facturacion_abonoscargoswwds_10_tffacimppp ,
                                           AV135Facturacion_abonoscargoswwds_11_tffacimppp_to ,
                                           AV136Facturacion_abonoscargoswwds_12_tffacbasimp ,
                                           AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to ,
                                           AV138Facturacion_abonoscargoswwds_14_tffacivaimp ,
                                           AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to ,
                                           AV140Facturacion_abonoscargoswwds_16_tffactot ,
                                           AV141Facturacion_abonoscargoswwds_17_tffactot_to ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV132Facturacion_abonoscargoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV132Facturacion_abonoscargoswwds_8_tfclinom), 30, "%") ;
      lV143Facturacion_abonoscargoswwds_19_tffaccob = GXutil.padr( GXutil.rtrim( AV143Facturacion_abonoscargoswwds_19_tffaccob), 1, "%") ;
      /* Using cursor H023114 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV134Facturacion_abonoscargoswwds_10_tffacimppp, AV134Facturacion_abonoscargoswwds_10_tffacimppp, AV135Facturacion_abonoscargoswwds_11_tffacimppp_to, AV135Facturacion_abonoscargoswwds_11_tffacimppp_to, Integer.valueOf(AV126Facturacion_abonoscargoswwds_2_tffaccod), Integer.valueOf(AV127Facturacion_abonoscargoswwds_3_tffaccod_to), AV129Facturacion_abonoscargoswwds_5_tffacfch, Integer.valueOf(AV130Facturacion_abonoscargoswwds_6_tfclicod), Integer.valueOf(AV131Facturacion_abonoscargoswwds_7_tfclicod_to), lV132Facturacion_abonoscargoswwds_8_tfclinom, AV133Facturacion_abonoscargoswwds_9_tfclinom_sel, lV143Facturacion_abonoscargoswwds_19_tffaccob, AV144Facturacion_abonoscargoswwds_20_tffaccob_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A965FacCob = H023114_A965FacCob[0] ;
         A435FacEst = H023114_A435FacEst[0] ;
         A279CliNom = H023114_A279CliNom[0] ;
         A252CliCod = H023114_A252CliCod[0] ;
         A436FacFch = H023114_A436FacFch[0] ;
         A1153FacTipFac = H023114_A1153FacTipFac[0] ;
         A430FacCod = H023114_A430FacCod[0] ;
         A11513FacRecIca = H023114_A11513FacRecIca[0] ;
         A8346FacRecI = H023114_A8346FacRecI[0] ;
         n8346FacRecI = H023114_n8346FacRecI[0] ;
         A7212FacRect = H023114_A7212FacRect[0] ;
         A453FacRECPor = H023114_A453FacRECPor[0] ;
         A443FacIVAPor = H023114_A443FacIVAPor[0] ;
         A14224FacCostFac = H023114_A14224FacCostFac[0] ;
         A14223FacCostKgs = H023114_A14223FacCostKgs[0] ;
         A14222FacCostMts = H023114_A14222FacCostMts[0] ;
         A433FacDtoGen = H023114_A433FacDtoGen[0] ;
         A7209Colombia = H023114_A7209Colombia[0] ;
         n7209Colombia = H023114_n7209Colombia[0] ;
         A14219FacEnergia = H023114_A14219FacEnergia[0] ;
         A3918FacImpTot1 = H023114_A3918FacImpTot1[0] ;
         A440FacImpPP = H023114_A440FacImpPP[0] ;
         n440FacImpPP = H023114_n440FacImpPP[0] ;
         A7209Colombia = H023110_A7209Colombia[0] ;
         n7209Colombia = H023110_n7209Colombia[0] ;
         A279CliNom = H023114_A279CliNom[0] ;
         A3918FacImpTot1 = H023114_A3918FacImpTot1[0] ;
         A440FacImpPP = H023114_A440FacImpPP[0] ;
         n440FacImpPP = H023114_n440FacImpPP[0] ;
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Facturacion_abonoscargoswwds_12_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV136Facturacion_abonoscargoswwds_12_tffacbasimp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to) <= 0 ) ) )
            {
               A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
               A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
               A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  }
                  else
                  {
                     A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  }
               }
               A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  }
                  else
                  {
                     A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  }
               }
               A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                  }
                  else
                  {
                     A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Facturacion_abonoscargoswwds_14_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV138Facturacion_abonoscargoswwds_14_tffacivaimp) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to) <= 0 ) ) )
                  {
                     A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
                     if ( A7209Colombia == 0 )
                     {
                        A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                     }
                     else
                     {
                        if ( A7209Colombia == 1 )
                        {
                           A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        }
                        else
                        {
                           A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        }
                     }
                     A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                     if ( (GXutil.strcmp("", AV125Facturacion_abonoscargoswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1153FacTipFac, 1, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV125Facturacion_abonoscargoswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A440FacImpPP, 11, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A429FacBasImp, 13, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A442FacIVAImp, 11, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A455FacTot, 13, 2) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A435FacEst, 1, 0) , GXutil.padr( "%" + AV125Facturacion_abonoscargoswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A965FacCob) , GXutil.padr( "%" + GXutil.upper( AV125Facturacion_abonoscargoswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Facturacion_abonoscargoswwds_16_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV140Facturacion_abonoscargoswwds_16_tffactot) >= 0 ) ) )
                        {
                           if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV141Facturacion_abonoscargoswwds_17_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV141Facturacion_abonoscargoswwds_17_tffactot_to) <= 0 ) ) )
                           {
                              AV102TotFacImpPP = A440FacImpPP.add(AV102TotFacImpPP) ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV102TotFacImpPP", GXutil.ltrimstr( AV102TotFacImpPP, 18, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPPP", getSecureSignedToken( "", localUtil.format( AV102TotFacImpPP, "ZZZZZZZ9.99")));
                              AV104TotFacBasImp = A429FacBasImp.add(AV104TotFacBasImp) ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV104TotFacBasImp", GXutil.ltrimstr( AV104TotFacBasImp, 18, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACBASIMP", getSecureSignedToken( "", localUtil.format( AV104TotFacBasImp, "ZZZZZZZZZ9.99")));
                              AV106TotFacIVAImp = A442FacIVAImp.add(AV106TotFacIVAImp) ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV106TotFacIVAImp", GXutil.ltrimstr( AV106TotFacIVAImp, 18, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIVAIMP", getSecureSignedToken( "", localUtil.format( AV106TotFacIVAImp, "ZZZZZZZ9.99")));
                              AV108TotFacTot = A455FacTot.add(AV108TotFacTot) ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV108TotFacTot", GXutil.ltrimstr( AV108TotFacTot, 18, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACTOT", getSecureSignedToken( "", localUtil.format( AV108TotFacTot, "ZZZZZZZZZ9.99")));
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV103TotValueFacImpPP = localUtil.format( AV102TotFacImpPP, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103TotValueFacImpPP", AV103TotValueFacImpPP);
      AV105TotValueFacBasImp = localUtil.format( AV104TotFacBasImp, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105TotValueFacBasImp", AV105TotValueFacBasImp);
      AV107TotValueFacIVAImp = localUtil.format( AV106TotFacIVAImp, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107TotValueFacIVAImp", AV107TotValueFacIVAImp);
      AV109TotValueFacTot = localUtil.format( AV108TotFacTot, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109TotValueFacTot", AV109TotValueFacTot);
   }

   public void wb_table2_62_2312( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluefacimppp_Internalname, httpContext.getMessage( "Tot Value Fac Imp PP", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluefacimppp_Internalname, AV103TotValueFacImpPP, GXutil.rtrim( localUtil.format( AV103TotValueFacImpPP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluefacimppp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluefacimppp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargosWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluefacbasimp_Internalname, httpContext.getMessage( "Tot Value Fac Bas Imp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluefacbasimp_Internalname, AV105TotValueFacBasImp, GXutil.rtrim( localUtil.format( AV105TotValueFacBasImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluefacbasimp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluefacbasimp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargosWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluefacivaimp_Internalname, httpContext.getMessage( "Tot Value Fac IVAImp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluefacivaimp_Internalname, AV107TotValueFacIVAImp, GXutil.rtrim( localUtil.format( AV107TotValueFacIVAImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluefacivaimp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluefacivaimp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargosWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluefactot_Internalname, httpContext.getMessage( "Tot Value Fac Tot", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluefactot_Internalname, AV109TotValueFacTot, GXutil.rtrim( localUtil.format( AV109TotValueFacTot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluefactot_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluefactot_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AbonosCargosWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_62_2312e( true) ;
      }
      else
      {
         wb_table2_62_2312e( false) ;
      }
   }

   public void wb_table1_28_2312( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV21ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_33_2312( true) ;
      }
      else
      {
         wb_table3_33_2312( false) ;
      }
      return  ;
   }

   public void wb_table3_33_2312e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_28_2312e( true) ;
      }
      else
      {
         wb_table1_28_2312e( false) ;
      }
   }

   public void wb_table3_33_2312( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Facturacion\\AbonosCargosWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_33_2312e( true) ;
      }
      else
      {
         wb_table3_33_2312e( false) ;
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
      pa2312( ) ;
      ws2312( ) ;
      we2312( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415133029", true, true);
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
      httpContext.AddJavascriptSource("facturacion/abonoscargosww.js", "?202682415133030", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_462( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_46_idx );
      edtFacCod_Internalname = "FACCOD_"+sGXsfl_46_idx ;
      cmbFacTipFac.setInternalname( "FACTIPFAC_"+sGXsfl_46_idx );
      edtFacFch_Internalname = "FACFCH_"+sGXsfl_46_idx ;
      edtFacPri_Internalname = "FACPRI_"+sGXsfl_46_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_46_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_46_idx ;
      edtFacImpPP_Internalname = "FACIMPPP_"+sGXsfl_46_idx ;
      edtFacBasImp_Internalname = "FACBASIMP_"+sGXsfl_46_idx ;
      edtFacIVAImp_Internalname = "FACIVAIMP_"+sGXsfl_46_idx ;
      edtFacTot_Internalname = "FACTOT_"+sGXsfl_46_idx ;
      cmbFacEst.setInternalname( "FACEST_"+sGXsfl_46_idx );
      edtFacCob_Internalname = "FACCOB_"+sGXsfl_46_idx ;
   }

   public void subsflControlProps_fel_462( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_46_fel_idx );
      edtFacCod_Internalname = "FACCOD_"+sGXsfl_46_fel_idx ;
      cmbFacTipFac.setInternalname( "FACTIPFAC_"+sGXsfl_46_fel_idx );
      edtFacFch_Internalname = "FACFCH_"+sGXsfl_46_fel_idx ;
      edtFacPri_Internalname = "FACPRI_"+sGXsfl_46_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_46_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_46_fel_idx ;
      edtFacImpPP_Internalname = "FACIMPPP_"+sGXsfl_46_fel_idx ;
      edtFacBasImp_Internalname = "FACBASIMP_"+sGXsfl_46_fel_idx ;
      edtFacIVAImp_Internalname = "FACIVAIMP_"+sGXsfl_46_fel_idx ;
      edtFacTot_Internalname = "FACTOT_"+sGXsfl_46_fel_idx ;
      cmbFacEst.setInternalname( "FACEST_"+sGXsfl_46_fel_idx );
      edtFacCob_Internalname = "FACCOB_"+sGXsfl_46_fel_idx ;
   }

   public void sendrow_462( )
   {
      subsflControlProps_462( ) ;
      wb2310( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_46_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_46_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_46_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_46_idx+"',46)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_46_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV80GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV80GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV80GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_46_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV80GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_46_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFacCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCod_Internalname,GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbFacTipFac.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbFacTipFac.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "FACTIPFAC_" + sGXsfl_46_idx ;
            cmbFacTipFac.setName( GXCCtl );
            cmbFacTipFac.setWebtags( "" );
            cmbFacTipFac.addItem("1", httpContext.getMessage( "Abono", ""), (short)(0));
            cmbFacTipFac.addItem("2", httpContext.getMessage( "Cargo", ""), (short)(0));
            if ( cmbFacTipFac.getItemCount() > 0 )
            {
               A1153FacTipFac = (byte)(GXutil.lval( cmbFacTipFac.getValidValue(GXutil.trim( GXutil.str( A1153FacTipFac, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbFacTipFac,cmbFacTipFac.getInternalname(),GXutil.trim( GXutil.str( A1153FacTipFac, 1, 0)),Integer.valueOf(1),cmbFacTipFac.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbFacTipFac.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbFacTipFac.setValue( GXutil.trim( GXutil.str( A1153FacTipFac, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFacTipFac.getInternalname(), "Values", cmbFacTipFac.ToJavascriptSource(), !bGXsfl_46_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFacFch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacFch_Internalname,localUtil.format(A436FacFch, "99/99/99"),localUtil.format( A436FacFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacFch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacPri_Internalname,GXutil.rtrim( A450FacPri),GXutil.rtrim( localUtil.format( A450FacPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFacImpPP_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacImpPP_Internalname,GXutil.ltrim( localUtil.ntoc( A440FacImpPP, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A440FacImpPP, "ZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacImpPP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacImpPP_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFacBasImp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacBasImp_Internalname,GXutil.ltrim( localUtil.ntoc( A429FacBasImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacBasImp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacBasImp_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFacIVAImp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacIVAImp_Internalname,GXutil.ltrim( localUtil.ntoc( A442FacIVAImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A442FacIVAImp, "ZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacIVAImp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacIVAImp_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFacTot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacTot_Internalname,GXutil.ltrim( localUtil.ntoc( A455FacTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A455FacTot, "ZZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacTot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacTot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbFacEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbFacEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "FACEST_" + sGXsfl_46_idx ;
            cmbFacEst.setName( GXCCtl );
            cmbFacEst.setWebtags( "" );
            cmbFacEst.addItem("0", httpContext.getMessage( "Pdte. Imp.", ""), (short)(0));
            cmbFacEst.addItem("1", httpContext.getMessage( "Imp.", ""), (short)(0));
            cmbFacEst.addItem("2", httpContext.getMessage( "Act.", ""), (short)(0));
            if ( cmbFacEst.getItemCount() > 0 )
            {
               A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValidValue(GXutil.trim( GXutil.str( A435FacEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbFacEst,cmbFacEst.getInternalname(),GXutil.trim( GXutil.str( A435FacEst, 1, 0)),Integer.valueOf(1),cmbFacEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbFacEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbFacEst.setValue( GXutil.trim( GXutil.str( A435FacEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Values", cmbFacEst.ToJavascriptSource(), !bGXsfl_46_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFacCob_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCob_Internalname,GXutil.rtrim( A965FacCob),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFacCob_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2312( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      /* End function sendrow_462 */
   }

   public void startgridcontrol46( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"46\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbFacTipFac.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacFch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacImpPP_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. Dto. P.P.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacBasImp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Base Imp.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacIVAImp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. IVA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacTot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbFacEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacCob_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ctb", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV80GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1153FacTipFac, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbFacTipFac.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A436FacFch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacFch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A450FacPri));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A440FacImpPP, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacImpPP_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A429FacBasImp, (byte)(13), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacBasImp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A442FacIVAImp, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacIVAImp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A455FacTot, (byte)(13), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacTot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A435FacEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbFacEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A965FacCob));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacCob_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      cmbavFactipfac.setInternalname( "vFACTIPFAC" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtFacCod_Internalname = "FACCOD" ;
      cmbFacTipFac.setInternalname( "FACTIPFAC" );
      edtFacFch_Internalname = "FACFCH" ;
      edtFacPri_Internalname = "FACPRI" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtFacImpPP_Internalname = "FACIMPPP" ;
      edtFacBasImp_Internalname = "FACBASIMP" ;
      edtFacIVAImp_Internalname = "FACIVAIMP" ;
      edtFacTot_Internalname = "FACTOT" ;
      cmbFacEst.setInternalname( "FACEST" );
      edtFacCob_Internalname = "FACCOB" ;
      edtavTotvaluefacimppp_Internalname = "vTOTVALUEFACIMPPP" ;
      edtavTotvaluefacbasimp_Internalname = "vTOTVALUEFACBASIMP" ;
      edtavTotvaluefacivaimp_Internalname = "vTOTVALUEFACIVAIMP" ;
      edtavTotvaluefactot_Internalname = "vTOTVALUEFACTOT" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      edtavFacpri_Internalname = "vFACPRI" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_facfchauxdate_Internalname = "vDDO_FACFCHAUXDATE" ;
      divDdo_facfchauxdates_Internalname = "DDO_FACFCHAUXDATES" ;
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
      edtFacCob_Jsonclick = "" ;
      cmbFacEst.setJsonclick( "" );
      edtFacTot_Jsonclick = "" ;
      edtFacIVAImp_Jsonclick = "" ;
      edtFacBasImp_Jsonclick = "" ;
      edtFacImpPP_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtFacPri_Jsonclick = "" ;
      edtFacFch_Jsonclick = "" ;
      cmbFacTipFac.setJsonclick( "" );
      edtFacCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluefactot_Jsonclick = "" ;
      edtavTotvaluefactot_Enabled = 1 ;
      edtavTotvaluefacivaimp_Jsonclick = "" ;
      edtavTotvaluefacivaimp_Enabled = 1 ;
      edtavTotvaluefacbasimp_Jsonclick = "" ;
      edtavTotvaluefacbasimp_Enabled = 1 ;
      edtavTotvaluefacimppp_Jsonclick = "" ;
      edtavTotvaluefacimppp_Enabled = 1 ;
      edtFacCob_Visible = -1 ;
      cmbFacEst.setVisible( -1 );
      edtFacTot_Visible = -1 ;
      edtFacIVAImp_Visible = -1 ;
      edtFacBasImp_Visible = -1 ;
      edtFacImpPP_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtFacFch_Visible = -1 ;
      cmbFacTipFac.setVisible( -1 );
      edtFacCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_facfchauxdate_Jsonclick = "" ;
      edtavFacpri_Jsonclick = "" ;
      edtavFacpri_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavFactipfac.setJsonclick( "" );
      cmbavFactipfac.setEnabled( 1 );
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "Facturacion.AbonosCargosWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|1:Abono,2:Cargo||||||||0:Pdte. Imp.,1:Imp.,2:Act.|" ;
      Ddo_grid_Allowmultipleselection = "|T||||||||T|" ;
      Ddo_grid_Datalisttype = "|FixedValues|||Dynamic|||||FixedValues|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|||T|||||T|T" ;
      Ddo_grid_Filterisrange = "T|||T||T|T|T|T||" ;
      Ddo_grid_Filtertype = "Numeric||Date|Numeric|Character|Numeric|Numeric|Numeric|Numeric||Character" ;
      Ddo_grid_Includefilter = "T||T|T|T|T|T|T|T||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|||||T|T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|||||7|8" ;
      Ddo_grid_Columnids = "1:FacCod|2:FacTipFac|3:FacFch|5:CliCod|6:CliNom|7:FacImpPP|8:FacBasImp|9:FacIVAImp|10:FacTot|11:FacEst|12:FacCob" ;
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
      Form.setCaption( httpContext.getMessage( " Abonos / Cargos", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavFactipfac.setName( "vFACTIPFAC" );
      cmbavFactipfac.setWebtags( "" );
      cmbavFactipfac.addItem("1", httpContext.getMessage( "Abonos (Tipo=1)", ""), (short)(0));
      cmbavFactipfac.addItem("2", httpContext.getMessage( "Cargos (Tipo 2)", ""), (short)(0));
      if ( cmbavFactipfac.getItemCount() > 0 )
      {
         AV85FacTipFac = (byte)(GXutil.lval( cmbavFactipfac.getValidValue(GXutil.trim( GXutil.str( AV85FacTipFac, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85FacTipFac", GXutil.str( AV85FacTipFac, 1, 0));
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_46_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV80GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV80GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
      }
      GXCCtl = "FACTIPFAC_" + sGXsfl_46_idx ;
      cmbFacTipFac.setName( GXCCtl );
      cmbFacTipFac.setWebtags( "" );
      cmbFacTipFac.addItem("1", httpContext.getMessage( "Abono", ""), (short)(0));
      cmbFacTipFac.addItem("2", httpContext.getMessage( "Cargo", ""), (short)(0));
      if ( cmbFacTipFac.getItemCount() > 0 )
      {
         A1153FacTipFac = (byte)(GXutil.lval( cmbFacTipFac.getValidValue(GXutil.trim( GXutil.str( A1153FacTipFac, 1, 0))))) ;
      }
      GXCCtl = "FACEST_" + sGXsfl_46_idx ;
      cmbFacEst.setName( GXCCtl );
      cmbFacEst.setWebtags( "" );
      cmbFacEst.addItem("0", httpContext.getMessage( "Pdte. Imp.", ""), (short)(0));
      cmbFacEst.addItem("1", httpContext.getMessage( "Imp.", ""), (short)(0));
      cmbFacEst.addItem("2", httpContext.getMessage( "Act.", ""), (short)(0));
      if ( cmbFacEst.getItemCount() > 0 )
      {
         A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValidValue(GXutil.trim( GXutil.str( A435FacEst, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV27TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFFacTipFac_Sels',fld:'vTFFACTIPFAC_SELS',pic:''},{av:'AV30TFFacFch',fld:'vTFFACFCH',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV88TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV89TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV90TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV91TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV92TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV93TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV94TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV95TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV97TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV98TFFacCob',fld:'vTFFACCOB',pic:''},{av:'AV99TFFacCob_Sel',fld:'vTFFACCOB_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV114FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV112ExisteC',fld:'vEXISTEC',pic:'ZZZ9',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'cmbFacTipFac'},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'A440FacImpPP',fld:'FACIMPPP',pic:'ZZZZZZZ9.99'},{av:'A429FacBasImp',fld:'FACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'A442FacIVAImp',fld:'FACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'A455FacTot',fld:'FACTOT',pic:'ZZZZZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtFacCod_Visible',ctrl:'FACCOD',prop:'Visible'},{av:'cmbFacTipFac'},{av:'edtFacFch_Visible',ctrl:'FACFCH',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtFacImpPP_Visible',ctrl:'FACIMPPP',prop:'Visible'},{av:'edtFacBasImp_Visible',ctrl:'FACBASIMP',prop:'Visible'},{av:'edtFacIVAImp_Visible',ctrl:'FACIVAIMP',prop:'Visible'},{av:'edtFacTot_Visible',ctrl:'FACTOT',prop:'Visible'},{av:'cmbFacEst'},{av:'edtFacCob_Visible',ctrl:'FACCOB',prop:'Visible'},{av:'AV78GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV79GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV103TotValueFacImpPP',fld:'vTOTVALUEFACIMPPP',pic:''},{av:'AV105TotValueFacBasImp',fld:'vTOTVALUEFACBASIMP',pic:''},{av:'AV107TotValueFacIVAImp',fld:'vTOTVALUEFACIVAIMP',pic:''},{av:'AV109TotValueFacTot',fld:'vTOTVALUEFACTOT',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122312',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV27TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFFacTipFac_Sels',fld:'vTFFACTIPFAC_SELS',pic:''},{av:'AV30TFFacFch',fld:'vTFFACFCH',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV88TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV89TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV90TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV91TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV92TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV93TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV94TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV95TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV97TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV98TFFacCob',fld:'vTFFACCOB',pic:''},{av:'AV99TFFacCob_Sel',fld:'vTFFACCOB_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV114FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV112ExisteC',fld:'vEXISTEC',pic:'ZZZ9',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132312',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV27TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFFacTipFac_Sels',fld:'vTFFACTIPFAC_SELS',pic:''},{av:'AV30TFFacFch',fld:'vTFFACFCH',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV88TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV89TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV90TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV91TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV92TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV93TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV94TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV95TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV97TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV98TFFacCob',fld:'vTFFACCOB',pic:''},{av:'AV99TFFacCob_Sel',fld:'vTFFACCOB_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV114FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV112ExisteC',fld:'vEXISTEC',pic:'ZZZ9',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142312',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV27TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFFacTipFac_Sels',fld:'vTFFACTIPFAC_SELS',pic:''},{av:'AV30TFFacFch',fld:'vTFFACFCH',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV88TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV89TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV90TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV91TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV92TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV93TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV94TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV95TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV97TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV98TFFacCob',fld:'vTFFACCOB',pic:''},{av:'AV99TFFacCob_Sel',fld:'vTFFACCOB_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV114FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV112ExisteC',fld:'vEXISTEC',pic:'ZZZ9',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV98TFFacCob',fld:'vTFFACCOB',pic:''},{av:'AV99TFFacCob_Sel',fld:'vTFFACCOB_SEL',pic:''},{av:'AV96TFFacEst_SelsJson',fld:'vTFFACEST_SELSJSON',pic:''},{av:'AV97TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV94TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV95TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV92TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV93TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV90TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV91TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV88TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV89TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFFacFch',fld:'vTFFACFCH',pic:''},{av:'AV86TFFacTipFac_SelsJson',fld:'vTFFACTIPFAC_SELSJSON',pic:''},{av:'AV87TFFacTipFac_Sels',fld:'vTFFACTIPFAC_SELS',pic:''},{av:'AV26TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV27TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e192312',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV80GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152312',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV27TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFFacTipFac_Sels',fld:'vTFFACTIPFAC_SELS',pic:''},{av:'AV30TFFacFch',fld:'vTFFACFCH',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV88TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV89TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV90TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV91TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV92TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV93TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV94TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV95TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV97TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV98TFFacCob',fld:'vTFFACCOB',pic:''},{av:'AV99TFFacCob_Sel',fld:'vTFFACCOB_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV114FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV112ExisteC',fld:'vEXISTEC',pic:'ZZZ9',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'cmbFacTipFac'},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'A440FacImpPP',fld:'FACIMPPP',pic:'ZZZZZZZ9.99'},{av:'A429FacBasImp',fld:'FACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'A442FacIVAImp',fld:'FACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'A455FacTot',fld:'FACTOT',pic:'ZZZZZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtFacCod_Visible',ctrl:'FACCOD',prop:'Visible'},{av:'cmbFacTipFac'},{av:'edtFacFch_Visible',ctrl:'FACFCH',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtFacImpPP_Visible',ctrl:'FACIMPPP',prop:'Visible'},{av:'edtFacBasImp_Visible',ctrl:'FACBASIMP',prop:'Visible'},{av:'edtFacIVAImp_Visible',ctrl:'FACIVAIMP',prop:'Visible'},{av:'edtFacTot_Visible',ctrl:'FACTOT',prop:'Visible'},{av:'cmbFacEst'},{av:'edtFacCob_Visible',ctrl:'FACCOB',prop:'Visible'},{av:'AV78GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV79GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV103TotValueFacImpPP',fld:'vTOTVALUEFACIMPPP',pic:''},{av:'AV105TotValueFacBasImp',fld:'vTOTVALUEFACBASIMP',pic:''},{av:'AV107TotValueFacIVAImp',fld:'vTOTVALUEFACIVAIMP',pic:''},{av:'AV109TotValueFacTot',fld:'vTOTVALUEFACTOT',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112312',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV27TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFFacTipFac_Sels',fld:'vTFFACTIPFAC_SELS',pic:''},{av:'AV30TFFacFch',fld:'vTFFACFCH',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV88TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV89TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV90TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV91TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV92TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV93TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV94TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV95TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV97TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV98TFFacCob',fld:'vTFFACCOB',pic:''},{av:'AV99TFFacCob_Sel',fld:'vTFFACCOB_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV114FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV112ExisteC',fld:'vEXISTEC',pic:'ZZZ9',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV86TFFacTipFac_SelsJson',fld:'vTFFACTIPFAC_SELSJSON',pic:''},{av:'AV96TFFacEst_SelsJson',fld:'vTFFACEST_SELSJSON',pic:''},{av:'cmbFacTipFac'},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'A440FacImpPP',fld:'FACIMPPP',pic:'ZZZZZZZ9.99'},{av:'A429FacBasImp',fld:'FACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'A442FacIVAImp',fld:'FACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'A455FacTot',fld:'FACTOT',pic:'ZZZZZZZZZ9.99'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV27TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFFacTipFac_Sels',fld:'vTFFACTIPFAC_SELS',pic:''},{av:'AV30TFFacFch',fld:'vTFFACFCH',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV88TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV89TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV90TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV91TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV92TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV93TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV94TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV95TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV97TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV98TFFacCob',fld:'vTFFACCOB',pic:''},{av:'AV99TFFacCob_Sel',fld:'vTFFACCOB_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV96TFFacEst_SelsJson',fld:'vTFFACEST_SELSJSON',pic:''},{av:'AV86TFFacTipFac_SelsJson',fld:'vTFFACTIPFAC_SELSJSON',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtFacCod_Visible',ctrl:'FACCOD',prop:'Visible'},{av:'cmbFacTipFac'},{av:'edtFacFch_Visible',ctrl:'FACFCH',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtFacImpPP_Visible',ctrl:'FACIMPPP',prop:'Visible'},{av:'edtFacBasImp_Visible',ctrl:'FACBASIMP',prop:'Visible'},{av:'edtFacIVAImp_Visible',ctrl:'FACIVAIMP',prop:'Visible'},{av:'edtFacTot_Visible',ctrl:'FACTOT',prop:'Visible'},{av:'cmbFacEst'},{av:'edtFacCob_Visible',ctrl:'FACCOB',prop:'Visible'},{av:'AV78GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV79GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV103TotValueFacImpPP',fld:'vTOTVALUEFACIMPPP',pic:''},{av:'AV105TotValueFacBasImp',fld:'vTOTVALUEFACBASIMP',pic:''},{av:'AV107TotValueFacIVAImp',fld:'vTOTVALUEFACIVAIMP',pic:''},{av:'AV109TotValueFacTot',fld:'vTOTVALUEFACTOT',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e202312',iparms:[{av:'cmbavGridactions'},{av:'AV80GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'cmbFacTipFac'},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'A450FacPri',fld:'FACPRI',pic:'9',hsh:true},{av:'cmbavFactipfac'},{av:'AV85FacTipFac',fld:'vFACTIPFAC',pic:'9'},{av:'AV113FacPri',fld:'vFACPRI',pic:'9'},{av:'AV114FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'cmbFacEst'},{av:'A435FacEst',fld:'FACEST',pic:'9'},{av:'A965FacCob',fld:'FACCOB',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV27TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFFacTipFac_Sels',fld:'vTFFACTIPFAC_SELS',pic:''},{av:'AV30TFFacFch',fld:'vTFFACFCH',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV88TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV89TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV90TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV91TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV92TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV93TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV94TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV95TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV97TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV98TFFacCob',fld:'vTFFACCOB',pic:''},{av:'AV99TFFacCob_Sel',fld:'vTFFACCOB_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV112ExisteC',fld:'vEXISTEC',pic:'ZZZ9',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'A440FacImpPP',fld:'FACIMPPP',pic:'ZZZZZZZ9.99'},{av:'A429FacBasImp',fld:'FACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'A442FacIVAImp',fld:'FACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'A455FacTot',fld:'FACTOT',pic:'ZZZZZZZZZ9.99'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV80GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtFacCod_Visible',ctrl:'FACCOD',prop:'Visible'},{av:'cmbFacTipFac'},{av:'edtFacFch_Visible',ctrl:'FACFCH',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtFacImpPP_Visible',ctrl:'FACIMPPP',prop:'Visible'},{av:'edtFacBasImp_Visible',ctrl:'FACBASIMP',prop:'Visible'},{av:'edtFacIVAImp_Visible',ctrl:'FACIVAIMP',prop:'Visible'},{av:'edtFacTot_Visible',ctrl:'FACTOT',prop:'Visible'},{av:'cmbFacEst'},{av:'edtFacCob_Visible',ctrl:'FACCOB',prop:'Visible'},{av:'AV78GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV79GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV102TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV104TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV106TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV108TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV103TotValueFacImpPP',fld:'vTOTVALUEFACIMPPP',pic:''},{av:'AV105TotValueFacBasImp',fld:'vTOTVALUEFACBASIMP',pic:''},{av:'AV107TotValueFacIVAImp',fld:'vTOTVALUEFACIVAIMP',pic:''},{av:'AV109TotValueFacTot',fld:'vTOTVALUEFACTOT',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e162312',iparms:[{av:'AV112ExisteC',fld:'vEXISTEC',pic:'ZZZ9',hsh:true},{av:'cmbavFactipfac'},{av:'AV85FacTipFac',fld:'vFACTIPFAC',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV113FacPri',fld:'vFACPRI',pic:'9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("VALIDV_FACPRI","{handler:'validv_Facpri',iparms:[]");
      setEventMetadata("VALIDV_FACPRI",",oparms:[]}");
      setEventMetadata("VALID_FACCOD","{handler:'valid_Faccod',iparms:[]");
      setEventMetadata("VALID_FACCOD",",oparms:[]}");
      setEventMetadata("VALID_FACTIPFAC","{handler:'valid_Factipfac',iparms:[]");
      setEventMetadata("VALID_FACTIPFAC",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_FACIMPPP","{handler:'valid_Facimppp',iparms:[]");
      setEventMetadata("VALID_FACIMPPP",",oparms:[]}");
      setEventMetadata("VALID_FACBASIMP","{handler:'valid_Facbasimp',iparms:[]");
      setEventMetadata("VALID_FACBASIMP",",oparms:[]}");
      setEventMetadata("VALID_FACIVAIMP","{handler:'valid_Facivaimp',iparms:[]");
      setEventMetadata("VALID_FACIVAIMP",",oparms:[]}");
      setEventMetadata("VALID_FACTOT","{handler:'valid_Factot',iparms:[]");
      setEventMetadata("VALID_FACTOT",",oparms:[]}");
      setEventMetadata("VALID_FACEST","{handler:'valid_Facest',iparms:[]");
      setEventMetadata("VALID_FACEST",",oparms:[]}");
      setEventMetadata("VALID_FACCOB","{handler:'valid_Faccob',iparms:[]");
      setEventMetadata("VALID_FACCOB",",oparms:[]}");
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
      A396EmprCod = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV87TFFacTipFac_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV30TFFacFch = GXutil.nullDate() ;
      AV38TFCliNom = "" ;
      AV39TFCliNom_Sel = "" ;
      AV88TFFacImpPP = DecimalUtil.ZERO ;
      AV89TFFacImpPP_To = DecimalUtil.ZERO ;
      AV90TFFacBasImp = DecimalUtil.ZERO ;
      AV91TFFacBasImp_To = DecimalUtil.ZERO ;
      AV92TFFacIVAImp = DecimalUtil.ZERO ;
      AV93TFFacIVAImp_To = DecimalUtil.ZERO ;
      AV94TFFacTot = DecimalUtil.ZERO ;
      AV95TFFacTot_To = DecimalUtil.ZERO ;
      AV97TFFacEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV98TFFacCob = "" ;
      AV99TFFacCob_Sel = "" ;
      AV123Pgmname = "" ;
      AV102TotFacImpPP = DecimalUtil.ZERO ;
      AV104TotFacBasImp = DecimalUtil.ZERO ;
      AV106TotFacIVAImp = DecimalUtil.ZERO ;
      AV108TotFacTot = DecimalUtil.ZERO ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV76DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV86TFFacTipFac_SelsJson = "" ;
      AV96TFFacEst_SelsJson = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
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
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      AV113FacPri = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV32DDO_FacFchAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A436FacFch = GXutil.nullDate() ;
      A450FacPri = "" ;
      A279CliNom = "" ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      A965FacCob = "" ;
      AV125Facturacion_abonoscargoswwds_1_filterfulltext = "" ;
      AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV129Facturacion_abonoscargoswwds_5_tffacfch = GXutil.nullDate() ;
      AV132Facturacion_abonoscargoswwds_8_tfclinom = "" ;
      AV133Facturacion_abonoscargoswwds_9_tfclinom_sel = "" ;
      AV134Facturacion_abonoscargoswwds_10_tffacimppp = DecimalUtil.ZERO ;
      AV135Facturacion_abonoscargoswwds_11_tffacimppp_to = DecimalUtil.ZERO ;
      AV136Facturacion_abonoscargoswwds_12_tffacbasimp = DecimalUtil.ZERO ;
      AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to = DecimalUtil.ZERO ;
      AV138Facturacion_abonoscargoswwds_14_tffacivaimp = DecimalUtil.ZERO ;
      AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to = DecimalUtil.ZERO ;
      AV140Facturacion_abonoscargoswwds_16_tffactot = DecimalUtil.ZERO ;
      AV141Facturacion_abonoscargoswwds_17_tffactot_to = DecimalUtil.ZERO ;
      AV142Facturacion_abonoscargoswwds_18_tffacest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV143Facturacion_abonoscargoswwds_19_tffaccob = "" ;
      AV144Facturacion_abonoscargoswwds_20_tffaccob_sel = "" ;
      scmdbuf = "" ;
      lV125Facturacion_abonoscargoswwds_1_filterfulltext = "" ;
      lV132Facturacion_abonoscargoswwds_8_tfclinom = "" ;
      lV143Facturacion_abonoscargoswwds_19_tffaccob = "" ;
      H02315_A396EmprCod = new String[] {""} ;
      H02315_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      H02315_A965FacCob = new String[] {""} ;
      H02315_A435FacEst = new byte[1] ;
      H02315_A279CliNom = new String[] {""} ;
      H02315_A252CliCod = new int[1] ;
      H02315_A450FacPri = new String[] {""} ;
      H02315_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H02315_A1153FacTipFac = new byte[1] ;
      H02315_A430FacCod = new int[1] ;
      H02315_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_n8346FacRecI = new boolean[] {false} ;
      H02315_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_A443FacIVAPor = new byte[1] ;
      H02315_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_A7209Colombia = new byte[1] ;
      H02315_n7209Colombia = new boolean[] {false} ;
      H02315_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02315_n440FacImpPP = new boolean[] {false} ;
      H02319_A396EmprCod = new String[] {""} ;
      H02319_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      H02319_A965FacCob = new String[] {""} ;
      H02319_A435FacEst = new byte[1] ;
      H02319_A279CliNom = new String[] {""} ;
      H02319_A252CliCod = new int[1] ;
      H02319_A450FacPri = new String[] {""} ;
      H02319_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H02319_A1153FacTipFac = new byte[1] ;
      H02319_A430FacCod = new int[1] ;
      H02319_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_n8346FacRecI = new boolean[] {false} ;
      H02319_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_A443FacIVAPor = new byte[1] ;
      H02319_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_A7209Colombia = new byte[1] ;
      H02319_n7209Colombia = new boolean[] {false} ;
      H02319_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02319_n440FacImpPP = new boolean[] {false} ;
      H023110_A7209Colombia = new byte[1] ;
      H023110_n7209Colombia = new boolean[] {false} ;
      AV103TotValueFacImpPP = "" ;
      AV105TotValueFacBasImp = "" ;
      AV107TotValueFacIVAImp = "" ;
      AV109TotValueFacTot = "" ;
      hsh = "" ;
      AV81Station = "" ;
      AV82EmprNom = "" ;
      AV83UsurCod = "" ;
      AV84ContDsc = "" ;
      AV110ContCod = "" ;
      GXv_int6 = new byte[1] ;
      AV124Emprcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      Gx_msg = "" ;
      AV17UserCustomValue = "" ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV115Cadena = "" ;
      AV116firma = "" ;
      AV117Hash = "" ;
      AV118Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message14 = new GXBaseCollection[1] ;
      GXv_boolean15 = new boolean[1] ;
      GXv_int16 = new int[1] ;
      GXv_char2 = new String[1] ;
      AV120Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      H023114_A396EmprCod = new String[] {""} ;
      H023114_A965FacCob = new String[] {""} ;
      H023114_A435FacEst = new byte[1] ;
      H023114_A279CliNom = new String[] {""} ;
      H023114_A252CliCod = new int[1] ;
      H023114_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H023114_A1153FacTipFac = new byte[1] ;
      H023114_A430FacCod = new int[1] ;
      H023114_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_n8346FacRecI = new boolean[] {false} ;
      H023114_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_A443FacIVAPor = new byte[1] ;
      H023114_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_A7209Colombia = new byte[1] ;
      H023114_n7209Colombia = new boolean[] {false} ;
      H023114_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023114_n440FacImpPP = new boolean[] {false} ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.abonoscargosww__default(),
         new Object[] {
             new Object[] {
            H02315_A396EmprCod, H02315_A9606FacHor, H02315_A965FacCob, H02315_A435FacEst, H02315_A279CliNom, H02315_A252CliCod, H02315_A450FacPri, H02315_A436FacFch, H02315_A1153FacTipFac, H02315_A430FacCod,
            H02315_A11513FacRecIca, H02315_A8346FacRecI, H02315_n8346FacRecI, H02315_A7212FacRect, H02315_A453FacRECPor, H02315_A443FacIVAPor, H02315_A14224FacCostFac, H02315_A14223FacCostKgs, H02315_A14222FacCostMts, H02315_A433FacDtoGen,
            H02315_A7209Colombia, H02315_n7209Colombia, H02315_A14219FacEnergia, H02315_A3918FacImpTot1, H02315_A440FacImpPP, H02315_n440FacImpPP
            }
            , new Object[] {
            H02319_A396EmprCod, H02319_A9606FacHor, H02319_A965FacCob, H02319_A435FacEst, H02319_A279CliNom, H02319_A252CliCod, H02319_A450FacPri, H02319_A436FacFch, H02319_A1153FacTipFac, H02319_A430FacCod,
            H02319_A11513FacRecIca, H02319_A8346FacRecI, H02319_n8346FacRecI, H02319_A7212FacRect, H02319_A453FacRECPor, H02319_A443FacIVAPor, H02319_A14224FacCostFac, H02319_A14223FacCostKgs, H02319_A14222FacCostMts, H02319_A433FacDtoGen,
            H02319_A7209Colombia, H02319_n7209Colombia, H02319_A14219FacEnergia, H02319_A3918FacImpTot1, H02319_A440FacImpPP, H02319_n440FacImpPP
            }
            , new Object[] {
            H023110_A7209Colombia, H023110_n7209Colombia
            }
            , new Object[] {
            H023114_A396EmprCod, H023114_A965FacCob, H023114_A435FacEst, H023114_A279CliNom, H023114_A252CliCod, H023114_A436FacFch, H023114_A1153FacTipFac, H023114_A430FacCod, H023114_A11513FacRecIca, H023114_A8346FacRecI,
            H023114_n8346FacRecI, H023114_A7212FacRect, H023114_A453FacRECPor, H023114_A443FacIVAPor, H023114_A14224FacCostFac, H023114_A14223FacCostKgs, H023114_A14222FacCostMts, H023114_A433FacDtoGen, H023114_A7209Colombia, H023114_n7209Colombia,
            H023114_A14219FacEnergia, H023114_A3918FacImpTot1, H023114_A440FacImpPP, H023114_n440FacImpPP
            }
         }
      );
      AV123Pgmname = "Facturacion.AbonosCargosWW" ;
      /* GeneXus formulas. */
      AV123Pgmname = "Facturacion.AbonosCargosWW" ;
      Gx_err = (short)(0) ;
      edtavTotvaluefacimppp_Enabled = 0 ;
      edtavTotvaluefacbasimp_Enabled = 0 ;
      edtavTotvaluefacivaimp_Enabled = 0 ;
      edtavTotvaluefactot_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A7209Colombia ;
   private byte A443FacIVAPor ;
   private byte AV85FacTipFac ;
   private byte A1153FacTipFac ;
   private byte A435FacEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV12OrderedBy ;
   private short AV114FirmaD ;
   private short AV112ExisteC ;
   private short wbEnd ;
   private short wbStart ;
   private short AV80GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_46 ;
   private int nGXsfl_46_idx=1 ;
   private int AV26TFFacCod ;
   private int AV27TFFacCod_To ;
   private int AV36TFCliCod ;
   private int AV37TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int edtavFacpri_Visible ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluefacimppp_Enabled ;
   private int edtavTotvaluefacbasimp_Enabled ;
   private int edtavTotvaluefacivaimp_Enabled ;
   private int edtavTotvaluefactot_Enabled ;
   private int AV126Facturacion_abonoscargoswwds_2_tffaccod ;
   private int AV127Facturacion_abonoscargoswwds_3_tffaccod_to ;
   private int AV130Facturacion_abonoscargoswwds_6_tfclicod ;
   private int AV131Facturacion_abonoscargoswwds_7_tfclicod_to ;
   private int AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels_size ;
   private int AV142Facturacion_abonoscargoswwds_18_tffacest_sels_size ;
   private int edtFacCod_Visible ;
   private int edtFacFch_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtFacImpPP_Visible ;
   private int edtFacBasImp_Visible ;
   private int edtFacIVAImp_Visible ;
   private int edtFacTot_Visible ;
   private int edtFacCob_Visible ;
   private int AV77PageToGo ;
   private int GXv_int16[] ;
   private int AV146GXV1 ;
   private int AV147GXV2 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV78GridCurrentPage ;
   private long AV79GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV88TFFacImpPP ;
   private java.math.BigDecimal AV89TFFacImpPP_To ;
   private java.math.BigDecimal AV90TFFacBasImp ;
   private java.math.BigDecimal AV91TFFacBasImp_To ;
   private java.math.BigDecimal AV92TFFacIVAImp ;
   private java.math.BigDecimal AV93TFFacIVAImp_To ;
   private java.math.BigDecimal AV94TFFacTot ;
   private java.math.BigDecimal AV95TFFacTot_To ;
   private java.math.BigDecimal AV102TotFacImpPP ;
   private java.math.BigDecimal AV104TotFacBasImp ;
   private java.math.BigDecimal AV106TotFacIVAImp ;
   private java.math.BigDecimal AV108TotFacTot ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV134Facturacion_abonoscargoswwds_10_tffacimppp ;
   private java.math.BigDecimal AV135Facturacion_abonoscargoswwds_11_tffacimppp_to ;
   private java.math.BigDecimal AV136Facturacion_abonoscargoswwds_12_tffacbasimp ;
   private java.math.BigDecimal AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to ;
   private java.math.BigDecimal AV138Facturacion_abonoscargoswwds_14_tffacivaimp ;
   private java.math.BigDecimal AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to ;
   private java.math.BigDecimal AV140Facturacion_abonoscargoswwds_16_tffactot ;
   private java.math.BigDecimal AV141Facturacion_abonoscargoswwds_17_tffactot_to ;
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
   private String sGXsfl_46_idx="0001" ;
   private String A396EmprCod ;
   private String AV38TFCliNom ;
   private String AV39TFCliNom_Sel ;
   private String AV98TFFacCob ;
   private String AV99TFFacCob_Sel ;
   private String AV123Pgmname ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
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
   private String edtavFacpri_Internalname ;
   private String AV113FacPri ;
   private String edtavFacpri_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_facfchauxdates_Internalname ;
   private String edtavDdo_facfchauxdate_Internalname ;
   private String edtavDdo_facfchauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtFacCod_Internalname ;
   private String edtFacFch_Internalname ;
   private String A450FacPri ;
   private String edtFacPri_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String edtFacImpPP_Internalname ;
   private String edtFacBasImp_Internalname ;
   private String edtFacIVAImp_Internalname ;
   private String edtFacTot_Internalname ;
   private String A965FacCob ;
   private String edtFacCob_Internalname ;
   private String edtavTotvaluefacimppp_Internalname ;
   private String edtavTotvaluefacbasimp_Internalname ;
   private String edtavTotvaluefacivaimp_Internalname ;
   private String edtavTotvaluefactot_Internalname ;
   private String AV132Facturacion_abonoscargoswwds_8_tfclinom ;
   private String AV133Facturacion_abonoscargoswwds_9_tfclinom_sel ;
   private String AV143Facturacion_abonoscargoswwds_19_tffaccob ;
   private String AV144Facturacion_abonoscargoswwds_20_tffaccob_sel ;
   private String scmdbuf ;
   private String lV132Facturacion_abonoscargoswwds_8_tfclinom ;
   private String lV143Facturacion_abonoscargoswwds_19_tffaccob ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV81Station ;
   private String AV82EmprNom ;
   private String AV83UsurCod ;
   private String AV84ContDsc ;
   private String AV110ContCod ;
   private String AV124Emprcod ;
   private String Gx_msg ;
   private String GXv_char2[] ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluefacimppp_Jsonclick ;
   private String edtavTotvaluefacbasimp_Jsonclick ;
   private String edtavTotvaluefacivaimp_Jsonclick ;
   private String edtavTotvaluefactot_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_46_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtFacCod_Jsonclick ;
   private String edtFacFch_Jsonclick ;
   private String edtFacPri_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtFacImpPP_Jsonclick ;
   private String edtFacBasImp_Jsonclick ;
   private String edtFacIVAImp_Jsonclick ;
   private String edtFacTot_Jsonclick ;
   private String edtFacCob_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A9606FacHor ;
   private java.util.Date AV30TFFacFch ;
   private java.util.Date AV32DDO_FacFchAuxDate ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV129Facturacion_abonoscargoswwds_5_tffacfch ;
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
   private boolean n440FacImpPP ;
   private boolean n8346FacRecI ;
   private boolean bGXsfl_46_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n7209Colombia ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV119ok ;
   private boolean GXv_boolean15[] ;
   private String AV86TFFacTipFac_SelsJson ;
   private String AV96TFFacEst_SelsJson ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV125Facturacion_abonoscargoswwds_1_filterfulltext ;
   private String lV125Facturacion_abonoscargoswwds_1_filterfulltext ;
   private String AV103TotValueFacImpPP ;
   private String AV105TotValueFacBasImp ;
   private String AV107TotValueFacIVAImp ;
   private String AV109TotValueFacTot ;
   private String AV115Cadena ;
   private String AV116firma ;
   private String AV117Hash ;
   private GXSimpleCollection<Byte> AV87TFFacTipFac_Sels ;
   private GXSimpleCollection<Byte> AV97TFFacEst_Sels ;
   private GXSimpleCollection<Byte> AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels ;
   private GXSimpleCollection<Byte> AV142Facturacion_abonoscargoswwds_18_tffacest_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavFactipfac ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbFacTipFac ;
   private HTMLChoice cmbFacEst ;
   private IDataStoreProvider pr_default ;
   private String[] H02315_A396EmprCod ;
   private java.util.Date[] H02315_A9606FacHor ;
   private String[] H02315_A965FacCob ;
   private byte[] H02315_A435FacEst ;
   private String[] H02315_A279CliNom ;
   private int[] H02315_A252CliCod ;
   private String[] H02315_A450FacPri ;
   private java.util.Date[] H02315_A436FacFch ;
   private byte[] H02315_A1153FacTipFac ;
   private int[] H02315_A430FacCod ;
   private java.math.BigDecimal[] H02315_A11513FacRecIca ;
   private java.math.BigDecimal[] H02315_A8346FacRecI ;
   private boolean[] H02315_n8346FacRecI ;
   private java.math.BigDecimal[] H02315_A7212FacRect ;
   private java.math.BigDecimal[] H02315_A453FacRECPor ;
   private byte[] H02315_A443FacIVAPor ;
   private java.math.BigDecimal[] H02315_A14224FacCostFac ;
   private java.math.BigDecimal[] H02315_A14223FacCostKgs ;
   private java.math.BigDecimal[] H02315_A14222FacCostMts ;
   private java.math.BigDecimal[] H02315_A433FacDtoGen ;
   private byte[] H02315_A7209Colombia ;
   private boolean[] H02315_n7209Colombia ;
   private java.math.BigDecimal[] H02315_A14219FacEnergia ;
   private java.math.BigDecimal[] H02315_A3918FacImpTot1 ;
   private java.math.BigDecimal[] H02315_A440FacImpPP ;
   private boolean[] H02315_n440FacImpPP ;
   private String[] H02319_A396EmprCod ;
   private java.util.Date[] H02319_A9606FacHor ;
   private String[] H02319_A965FacCob ;
   private byte[] H02319_A435FacEst ;
   private String[] H02319_A279CliNom ;
   private int[] H02319_A252CliCod ;
   private String[] H02319_A450FacPri ;
   private java.util.Date[] H02319_A436FacFch ;
   private byte[] H02319_A1153FacTipFac ;
   private int[] H02319_A430FacCod ;
   private java.math.BigDecimal[] H02319_A11513FacRecIca ;
   private java.math.BigDecimal[] H02319_A8346FacRecI ;
   private boolean[] H02319_n8346FacRecI ;
   private java.math.BigDecimal[] H02319_A7212FacRect ;
   private java.math.BigDecimal[] H02319_A453FacRECPor ;
   private byte[] H02319_A443FacIVAPor ;
   private java.math.BigDecimal[] H02319_A14224FacCostFac ;
   private java.math.BigDecimal[] H02319_A14223FacCostKgs ;
   private java.math.BigDecimal[] H02319_A14222FacCostMts ;
   private java.math.BigDecimal[] H02319_A433FacDtoGen ;
   private byte[] H02319_A7209Colombia ;
   private boolean[] H02319_n7209Colombia ;
   private java.math.BigDecimal[] H02319_A14219FacEnergia ;
   private java.math.BigDecimal[] H02319_A3918FacImpTot1 ;
   private java.math.BigDecimal[] H02319_A440FacImpPP ;
   private boolean[] H02319_n440FacImpPP ;
   private byte[] H023110_A7209Colombia ;
   private boolean[] H023110_n7209Colombia ;
   private String[] H023114_A396EmprCod ;
   private String[] H023114_A965FacCob ;
   private byte[] H023114_A435FacEst ;
   private String[] H023114_A279CliNom ;
   private int[] H023114_A252CliCod ;
   private java.util.Date[] H023114_A436FacFch ;
   private byte[] H023114_A1153FacTipFac ;
   private int[] H023114_A430FacCod ;
   private java.math.BigDecimal[] H023114_A11513FacRecIca ;
   private java.math.BigDecimal[] H023114_A8346FacRecI ;
   private boolean[] H023114_n8346FacRecI ;
   private java.math.BigDecimal[] H023114_A7212FacRect ;
   private java.math.BigDecimal[] H023114_A453FacRECPor ;
   private byte[] H023114_A443FacIVAPor ;
   private java.math.BigDecimal[] H023114_A14224FacCostFac ;
   private java.math.BigDecimal[] H023114_A14223FacCostKgs ;
   private java.math.BigDecimal[] H023114_A14222FacCostMts ;
   private java.math.BigDecimal[] H023114_A433FacDtoGen ;
   private byte[] H023114_A7209Colombia ;
   private boolean[] H023114_n7209Colombia ;
   private java.math.BigDecimal[] H023114_A14219FacEnergia ;
   private java.math.BigDecimal[] H023114_A3918FacImpTot1 ;
   private java.math.BigDecimal[] H023114_A440FacImpPP ;
   private boolean[] H023114_n440FacImpPP ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV118Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message14[] ;
   private com.genexus.SdtMessages_Message AV120Message ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV76DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class abonoscargosww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02315( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A1153FacTipFac ,
                                          GXSimpleCollection<Byte> AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels ,
                                          byte A435FacEst ,
                                          GXSimpleCollection<Byte> AV142Facturacion_abonoscargoswwds_18_tffacest_sels ,
                                          int AV126Facturacion_abonoscargoswwds_2_tffaccod ,
                                          int AV127Facturacion_abonoscargoswwds_3_tffaccod_to ,
                                          int AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels_size ,
                                          java.util.Date AV129Facturacion_abonoscargoswwds_5_tffacfch ,
                                          int AV130Facturacion_abonoscargoswwds_6_tfclicod ,
                                          int AV131Facturacion_abonoscargoswwds_7_tfclicod_to ,
                                          String AV133Facturacion_abonoscargoswwds_9_tfclinom_sel ,
                                          String AV132Facturacion_abonoscargoswwds_8_tfclinom ,
                                          int AV142Facturacion_abonoscargoswwds_18_tffacest_sels_size ,
                                          String AV144Facturacion_abonoscargoswwds_20_tffaccob_sel ,
                                          String AV143Facturacion_abonoscargoswwds_19_tffaccob ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A965FacCob ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV125Facturacion_abonoscargoswwds_1_filterfulltext ,
                                          java.math.BigDecimal A440FacImpPP ,
                                          java.math.BigDecimal A429FacBasImp ,
                                          java.math.BigDecimal A442FacIVAImp ,
                                          java.math.BigDecimal A455FacTot ,
                                          java.math.BigDecimal AV134Facturacion_abonoscargoswwds_10_tffacimppp ,
                                          java.math.BigDecimal AV135Facturacion_abonoscargoswwds_11_tffacimppp_to ,
                                          java.math.BigDecimal AV136Facturacion_abonoscargoswwds_12_tffacbasimp ,
                                          java.math.BigDecimal AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to ,
                                          java.math.BigDecimal AV138Facturacion_abonoscargoswwds_14_tffacivaimp ,
                                          java.math.BigDecimal AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to ,
                                          java.math.BigDecimal AV140Facturacion_abonoscargoswwds_16_tffactot ,
                                          java.math.BigDecimal AV141Facturacion_abonoscargoswwds_17_tffactot_to ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[14];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FacHor, T1.FacCob, T1.FacEst, T3.CliNom, T1.CliCod, T1.FacPri, T1.FacFch, T1.FacTipFac, T1.FacCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor," ;
      scmdbuf += " T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1, COALESCE( T5.FacImpPP," ;
      scmdbuf += " 0) AS FacImpPP FROM ((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs" ;
      scmdbuf += " = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and" ;
      scmdbuf += " (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) LEFT JOIN (SELECT CASE  WHEN COALESCE( T7.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE(" ;
      scmdbuf += " T8.FacImpTot1, 0) * CAST(T6.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 2) WHEN COALESCE( T7.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T8.FacImpTot1," ;
      scmdbuf += " 0) * CAST(T6.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 0) END AS FacImpPP, T6.EmprCod, T6.FacCod FROM ((TXPCFAVEN T6 INNER JOIN TXPEMPRES T7 ON T7.EmprCod" ;
      scmdbuf += " = T6.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0)" ;
      scmdbuf += " and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs" ;
      scmdbuf += " = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T8 ON T8.EmprCod = T6.EmprCod AND T8.FacCod = T6.FacCod) ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.FacTipFac >= 1)");
      addWhere(sWhereString, "(T1.FacTipFac <= 2)");
      if ( ! (0==AV126Facturacion_abonoscargoswwds_2_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (0==AV127Facturacion_abonoscargoswwds_3_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels, "T1.FacTipFac IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Facturacion_abonoscargoswwds_5_tffacfch)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV130Facturacion_abonoscargoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV131Facturacion_abonoscargoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Facturacion_abonoscargoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV132Facturacion_abonoscargoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Facturacion_abonoscargoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( AV142Facturacion_abonoscargoswwds_18_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV142Facturacion_abonoscargoswwds_18_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV144Facturacion_abonoscargoswwds_20_tffaccob_sel)==0) && ( ! (GXutil.strcmp("", AV143Facturacion_abonoscargoswwds_19_tffaccob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacCob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Facturacion_abonoscargoswwds_20_tffaccob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacCob = ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.FacCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacTipFac" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacTipFac DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacFch" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacFch DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacEst" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCob" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCob DESC" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H02319( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A1153FacTipFac ,
                                          GXSimpleCollection<Byte> AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels ,
                                          byte A435FacEst ,
                                          GXSimpleCollection<Byte> AV142Facturacion_abonoscargoswwds_18_tffacest_sels ,
                                          int AV126Facturacion_abonoscargoswwds_2_tffaccod ,
                                          int AV127Facturacion_abonoscargoswwds_3_tffaccod_to ,
                                          int AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels_size ,
                                          java.util.Date AV129Facturacion_abonoscargoswwds_5_tffacfch ,
                                          int AV130Facturacion_abonoscargoswwds_6_tfclicod ,
                                          int AV131Facturacion_abonoscargoswwds_7_tfclicod_to ,
                                          String AV133Facturacion_abonoscargoswwds_9_tfclinom_sel ,
                                          String AV132Facturacion_abonoscargoswwds_8_tfclinom ,
                                          int AV142Facturacion_abonoscargoswwds_18_tffacest_sels_size ,
                                          String AV144Facturacion_abonoscargoswwds_20_tffaccob_sel ,
                                          String AV143Facturacion_abonoscargoswwds_19_tffaccob ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A965FacCob ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV125Facturacion_abonoscargoswwds_1_filterfulltext ,
                                          java.math.BigDecimal A440FacImpPP ,
                                          java.math.BigDecimal A429FacBasImp ,
                                          java.math.BigDecimal A442FacIVAImp ,
                                          java.math.BigDecimal A455FacTot ,
                                          java.math.BigDecimal AV134Facturacion_abonoscargoswwds_10_tffacimppp ,
                                          java.math.BigDecimal AV135Facturacion_abonoscargoswwds_11_tffacimppp_to ,
                                          java.math.BigDecimal AV136Facturacion_abonoscargoswwds_12_tffacbasimp ,
                                          java.math.BigDecimal AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to ,
                                          java.math.BigDecimal AV138Facturacion_abonoscargoswwds_14_tffacivaimp ,
                                          java.math.BigDecimal AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to ,
                                          java.math.BigDecimal AV140Facturacion_abonoscargoswwds_16_tffactot ,
                                          java.math.BigDecimal AV141Facturacion_abonoscargoswwds_17_tffactot_to ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[14];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FacHor, T1.FacCob, T1.FacEst, T3.CliNom, T1.CliCod, T1.FacPri, T1.FacFch, T1.FacTipFac, T1.FacCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor," ;
      scmdbuf += " T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1, COALESCE( T5.FacImpPP," ;
      scmdbuf += " 0) AS FacImpPP FROM ((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs" ;
      scmdbuf += " = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and" ;
      scmdbuf += " (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) LEFT JOIN (SELECT CASE  WHEN COALESCE( T7.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE(" ;
      scmdbuf += " T8.FacImpTot1, 0) * CAST(T6.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 2) WHEN COALESCE( T7.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T8.FacImpTot1," ;
      scmdbuf += " 0) * CAST(T6.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 0) END AS FacImpPP, T6.EmprCod, T6.FacCod FROM ((TXPCFAVEN T6 INNER JOIN TXPEMPRES T7 ON T7.EmprCod" ;
      scmdbuf += " = T6.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0)" ;
      scmdbuf += " and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs" ;
      scmdbuf += " = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T8 ON T8.EmprCod = T6.EmprCod AND T8.FacCod = T6.FacCod) ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.FacTipFac >= 1)");
      addWhere(sWhereString, "(T1.FacTipFac <= 2)");
      if ( ! (0==AV126Facturacion_abonoscargoswwds_2_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! (0==AV127Facturacion_abonoscargoswwds_3_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels, "T1.FacTipFac IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Facturacion_abonoscargoswwds_5_tffacfch)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (0==AV130Facturacion_abonoscargoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (0==AV131Facturacion_abonoscargoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Facturacion_abonoscargoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV132Facturacion_abonoscargoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Facturacion_abonoscargoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( AV142Facturacion_abonoscargoswwds_18_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV142Facturacion_abonoscargoswwds_18_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV144Facturacion_abonoscargoswwds_20_tffaccob_sel)==0) && ( ! (GXutil.strcmp("", AV143Facturacion_abonoscargoswwds_19_tffaccob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacCob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Facturacion_abonoscargoswwds_20_tffaccob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacCob = ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.FacCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacTipFac" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacTipFac DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacFch" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacFch DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacEst" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCob" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCob DESC" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H023114( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A1153FacTipFac ,
                                           GXSimpleCollection<Byte> AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels ,
                                           byte A435FacEst ,
                                           GXSimpleCollection<Byte> AV142Facturacion_abonoscargoswwds_18_tffacest_sels ,
                                           int AV126Facturacion_abonoscargoswwds_2_tffaccod ,
                                           int AV127Facturacion_abonoscargoswwds_3_tffaccod_to ,
                                           int AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels_size ,
                                           java.util.Date AV129Facturacion_abonoscargoswwds_5_tffacfch ,
                                           int AV130Facturacion_abonoscargoswwds_6_tfclicod ,
                                           int AV131Facturacion_abonoscargoswwds_7_tfclicod_to ,
                                           String AV133Facturacion_abonoscargoswwds_9_tfclinom_sel ,
                                           String AV132Facturacion_abonoscargoswwds_8_tfclinom ,
                                           int AV142Facturacion_abonoscargoswwds_18_tffacest_sels_size ,
                                           String AV144Facturacion_abonoscargoswwds_20_tffaccob_sel ,
                                           String AV143Facturacion_abonoscargoswwds_19_tffaccob ,
                                           int A430FacCod ,
                                           java.util.Date A436FacFch ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A965FacCob ,
                                           String AV125Facturacion_abonoscargoswwds_1_filterfulltext ,
                                           java.math.BigDecimal A440FacImpPP ,
                                           java.math.BigDecimal A429FacBasImp ,
                                           java.math.BigDecimal A442FacIVAImp ,
                                           java.math.BigDecimal A455FacTot ,
                                           java.math.BigDecimal AV134Facturacion_abonoscargoswwds_10_tffacimppp ,
                                           java.math.BigDecimal AV135Facturacion_abonoscargoswwds_11_tffacimppp_to ,
                                           java.math.BigDecimal AV136Facturacion_abonoscargoswwds_12_tffacbasimp ,
                                           java.math.BigDecimal AV137Facturacion_abonoscargoswwds_13_tffacbasimp_to ,
                                           java.math.BigDecimal AV138Facturacion_abonoscargoswwds_14_tffacivaimp ,
                                           java.math.BigDecimal AV139Facturacion_abonoscargoswwds_15_tffacivaimp_to ,
                                           java.math.BigDecimal AV140Facturacion_abonoscargoswwds_16_tffactot ,
                                           java.math.BigDecimal AV141Facturacion_abonoscargoswwds_17_tffactot_to ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[14];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FacCob, T1.FacEst, T3.CliNom, T1.CliCod, T1.FacFch, T1.FacTipFac, T1.FacCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor," ;
      scmdbuf += " T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1, COALESCE( T5.FacImpPP, 0) AS FacImpPP" ;
      scmdbuf += " FROM ((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN" ;
      scmdbuf += " (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA *" ;
      scmdbuf += " CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs =" ;
      scmdbuf += " 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and" ;
      scmdbuf += " (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) LEFT JOIN (SELECT CASE  WHEN COALESCE( T7.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE(" ;
      scmdbuf += " T8.FacImpTot1, 0) * CAST(T6.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 2) WHEN COALESCE( T7.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T8.FacImpTot1," ;
      scmdbuf += " 0) * CAST(T6.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 0) END AS FacImpPP, T6.EmprCod, T6.FacCod FROM ((TXPCFAVEN T6 INNER JOIN TXPEMPRES T7 ON T7.EmprCod" ;
      scmdbuf += " = T6.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0)" ;
      scmdbuf += " and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs" ;
      scmdbuf += " = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T8 ON T8.EmprCod = T6.EmprCod AND T8.FacCod = T6.FacCod) ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.FacTipFac >= 1)");
      addWhere(sWhereString, "(T1.FacTipFac <= 2)");
      if ( ! (0==AV126Facturacion_abonoscargoswwds_2_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (0==AV127Facturacion_abonoscargoswwds_3_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Facturacion_abonoscargoswwds_4_tffactipfac_sels, "T1.FacTipFac IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Facturacion_abonoscargoswwds_5_tffacfch)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (0==AV130Facturacion_abonoscargoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (0==AV131Facturacion_abonoscargoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Facturacion_abonoscargoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV132Facturacion_abonoscargoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Facturacion_abonoscargoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( AV142Facturacion_abonoscargoswwds_18_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV142Facturacion_abonoscargoswwds_18_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV144Facturacion_abonoscargoswwds_20_tffaccob_sel)==0) && ( ! (GXutil.strcmp("", AV143Facturacion_abonoscargoswwds_19_tffaccob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacCob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Facturacion_abonoscargoswwds_20_tffaccob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacCob = ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
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
                  return conditional_H02315(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Boolean) dynConstraints[21]).booleanValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (String)dynConstraints[35] );
            case 1 :
                  return conditional_H02319(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Boolean) dynConstraints[21]).booleanValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (String)dynConstraints[35] );
            case 3 :
                  return conditional_H023114(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02315", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02319", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H023110", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H023114", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,3);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,3);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               return;
      }
   }

}

