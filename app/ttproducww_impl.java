package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttproducww_impl extends GXDataArea
{
   public ttproducww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttproducww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttproducww_impl.class ));
   }

   public ttproducww_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbPrdOkotex = new HTMLChoice();
      cmbPrdZDHC = new HTMLChoice();
      cmbPrdList = new HTMLChoice();
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
      nRC_GXsfl_38 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_38"))) ;
      nGXsfl_38_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_38_idx"))) ;
      sGXsfl_38_idx = httpContext.GetPar( "sGXsfl_38_idx") ;
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
      AV24ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV19ColumnsSelector);
      AV29TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV30TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV26TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV27TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV32TFPrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm"), ".") ;
      AV33TFPrdExiAlm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm_To"), ".") ;
      AV38TFPrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes"), ".") ;
      AV39TFPrdCanRes_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes_To"), ".") ;
      AV137TFPrdDisponible = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdDisponible"), ".") ;
      AV138TFPrdDisponible_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdDisponible_To"), ".") ;
      AV50TFPrdCanPen = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanPen"), ".") ;
      AV51TFPrdCanPen_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanPen_To"), ".") ;
      AV53TFPrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct"), ".") ;
      AV54TFPrdPreAct_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct_To"), ".") ;
      AV59TFValDsc = httpContext.GetPar( "TFValDsc") ;
      AV60TFValDsc_Sel = httpContext.GetPar( "TFValDsc_Sel") ;
      AV62TFPrdRec = httpContext.GetPar( "TFPrdRec") ;
      AV63TFPrdRec_Sel = httpContext.GetPar( "TFPrdRec_Sel") ;
      AV65TFPrdAox = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAox"), ".") ;
      AV66TFPrdAox_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAox_To"), ".") ;
      AV135TFPrdGots = httpContext.GetPar( "TFPrdGots") ;
      AV136TFPrdGots_Sel = httpContext.GetPar( "TFPrdGots_Sel") ;
      AV68TFPrdReach = httpContext.GetPar( "TFPrdReach") ;
      AV69TFPrdReach_Sel = httpContext.GetPar( "TFPrdReach_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV124TFPrdOkotex_Sels);
      AV74TFPrdHm = httpContext.GetPar( "TFPrdHm") ;
      AV75TFPrdHm_Sel = httpContext.GetPar( "TFPrdHm_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV126TFPrdZDHC_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV128TFPrdList_Sels);
      AV81TFPrdTHELIST = httpContext.GetPar( "TFPrdTHELIST") ;
      AV82TFPrdTHELIST_Sel = httpContext.GetPar( "TFPrdTHELIST_Sel") ;
      AV84TFPrdHS = httpContext.GetPar( "TFPrdHS") ;
      AV85TFPrdHS_Sel = httpContext.GetPar( "TFPrdHS_Sel") ;
      AV87TFPrdFHS = localUtil.parseDateParm( httpContext.GetPar( "TFPrdFHS")) ;
      AV88TFPrdFHS_To = localUtil.parseDateParm( httpContext.GetPar( "TFPrdFHS_To")) ;
      AV92TFPrdNum2 = httpContext.GetPar( "TFPrdNum2") ;
      AV93TFPrdNum2_Sel = httpContext.GetPar( "TFPrdNum2_Sel") ;
      AV179Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV141Sirgb = CommonUtil.decimalVal( httpContext.GetPar( "Sirgb"), ".") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV29TFPrdNom, AV30TFPrdNom_Sel, AV26TFPrdNum, AV27TFPrdNum_Sel, AV32TFPrdExiAlm, AV33TFPrdExiAlm_To, AV38TFPrdCanRes, AV39TFPrdCanRes_To, AV137TFPrdDisponible, AV138TFPrdDisponible_To, AV50TFPrdCanPen, AV51TFPrdCanPen_To, AV53TFPrdPreAct, AV54TFPrdPreAct_To, AV59TFValDsc, AV60TFValDsc_Sel, AV62TFPrdRec, AV63TFPrdRec_Sel, AV65TFPrdAox, AV66TFPrdAox_To, AV135TFPrdGots, AV136TFPrdGots_Sel, AV68TFPrdReach, AV69TFPrdReach_Sel, AV124TFPrdOkotex_Sels, AV74TFPrdHm, AV75TFPrdHm_Sel, AV126TFPrdZDHC_Sels, AV128TFPrdList_Sels, AV81TFPrdTHELIST, AV82TFPrdTHELIST_Sel, AV84TFPrdHS, AV85TFPrdHS_Sel, AV87TFPrdFHS, AV88TFPrdFHS_To, AV92TFPrdNum2, AV93TFPrdNum2_Sel, AV179Pgmname, AV12OrderedBy, AV13OrderedDsc, AV141Sirgb, Gx_mode) ;
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
      paVA2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startVA2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttproducww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV179Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( AV141Sirgb, "9999999.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_38", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_38, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV43GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV44GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV24ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV29TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV30TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV26TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV27TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXIALM", GXutil.ltrim( localUtil.ntoc( AV32TFPrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXIALM_TO", GXutil.ltrim( localUtil.ntoc( AV33TFPrdExiAlm_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANRES", GXutil.ltrim( localUtil.ntoc( AV38TFPrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANRES_TO", GXutil.ltrim( localUtil.ntoc( AV39TFPrdCanRes_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDDISPONIBLE", GXutil.ltrim( localUtil.ntoc( AV137TFPrdDisponible, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDDISPONIBLE_TO", GXutil.ltrim( localUtil.ntoc( AV138TFPrdDisponible_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANPEN", GXutil.ltrim( localUtil.ntoc( AV50TFPrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANPEN_TO", GXutil.ltrim( localUtil.ntoc( AV51TFPrdCanPen_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREACT", GXutil.ltrim( localUtil.ntoc( AV53TFPrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREACT_TO", GXutil.ltrim( localUtil.ntoc( AV54TFPrdPreAct_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALDSC", GXutil.rtrim( AV59TFValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALDSC_SEL", GXutil.rtrim( AV60TFValDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREC", GXutil.rtrim( AV62TFPrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREC_SEL", GXutil.rtrim( AV63TFPrdRec_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDAOX", GXutil.ltrim( localUtil.ntoc( AV65TFPrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDAOX_TO", GXutil.ltrim( localUtil.ntoc( AV66TFPrdAox_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGOTS", GXutil.rtrim( AV135TFPrdGots));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGOTS_SEL", GXutil.rtrim( AV136TFPrdGots_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREACH", GXutil.rtrim( AV68TFPrdReach));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREACH_SEL", GXutil.rtrim( AV69TFPrdReach_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRDOKOTEX_SELS", AV124TFPrdOkotex_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRDOKOTEX_SELS", AV124TFPrdOkotex_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHM", GXutil.rtrim( AV74TFPrdHm));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHM_SEL", GXutil.rtrim( AV75TFPrdHm_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRDZDHC_SELS", AV126TFPrdZDHC_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRDZDHC_SELS", AV126TFPrdZDHC_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRDLIST_SELS", AV128TFPrdList_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRDLIST_SELS", AV128TFPrdList_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDTHELIST", GXutil.rtrim( AV81TFPrdTHELIST));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDTHELIST_SEL", GXutil.rtrim( AV82TFPrdTHELIST_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHS", GXutil.rtrim( AV84TFPrdHS));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHS_SEL", GXutil.rtrim( AV85TFPrdHS_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFHS", localUtil.dtoc( AV87TFPrdFHS, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFHS_TO", localUtil.dtoc( AV88TFPrdFHS_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM2", GXutil.rtrim( AV92TFPrdNum2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM2_SEL", GXutil.rtrim( AV93TFPrdNum2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV179Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV179Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDRGB", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIRGB", GXutil.ltrim( localUtil.ntoc( AV141Sirgb, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( AV141Sirgb, "9999999.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDOKOTEX_SELSJSON", AV123TFPrdOkotex_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDZDHC_SELSJSON", AV125TFPrdZDHC_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDLIST_SELSJSON", AV127TFPrdList_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
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
         weVA2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtVA2( ) ;
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
      return formatLink("app.ttproducww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTproducWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento de Productos Quimicos", "") ;
   }

   public void wbVA0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTproducWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTproducWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTproducWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTproducWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_VA2( true) ;
      }
      else
      {
         wb_table1_25_VA2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_VA2e( boolean wbgen )
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
         startgridcontrol38( ) ;
      }
      if ( wbEnd == 38 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_38 = (int)(nGXsfl_38_idx-1) ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV19ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_prdfhsauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_38_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_prdfhsauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_prdfhsauxdate_Internalname, localUtil.format(AV89DDO_PrdFHSAuxDate, "99/99/99"), localUtil.format( AV89DDO_PrdFHSAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_prdfhsauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_prdfhsauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTproducWW.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_38_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_prdfhsauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_prdfhsauxdateto_Internalname, localUtil.format(AV90DDO_PrdFHSAuxDateTo, "99/99/99"), localUtil.format( AV90DDO_PrdFHSAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_prdfhsauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTproducWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_prdfhsauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTproducWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 38 )
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

   public void startVA2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento de Productos Quimicos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupVA0( ) ;
   }

   public void wsVA2( )
   {
      startVA2( ) ;
      evtVA2( ) ;
   }

   public void evtVA2( )
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
                           e11VA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12VA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13VA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14VA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15VA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16VA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17VA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e18VA2 ();
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
                           nGXsfl_38_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_382( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV134GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134GridActions), 4, 0));
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
                           A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
                           A13831PrdDisponi = localUtil.ctond( httpContext.cgiGet( edtPrdDisponi_Internalname)) ;
                           A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
                           A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
                           A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
                           n857ValDsc = false ;
                           A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
                           A9733PrdAox = localUtil.ctond( httpContext.cgiGet( edtPrdAox_Internalname)) ;
                           A11363PrdGots = httpContext.cgiGet( edtPrdGots_Internalname) ;
                           A5887PrdReach = httpContext.cgiGet( edtPrdReach_Internalname) ;
                           cmbPrdOkotex.setName( cmbPrdOkotex.getInternalname() );
                           cmbPrdOkotex.setValue( httpContext.cgiGet( cmbPrdOkotex.getInternalname()) );
                           A5888PrdOkotex = httpContext.cgiGet( cmbPrdOkotex.getInternalname()) ;
                           A11364PrdHm = httpContext.cgiGet( edtPrdHm_Internalname) ;
                           cmbPrdZDHC.setName( cmbPrdZDHC.getInternalname() );
                           cmbPrdZDHC.setValue( httpContext.cgiGet( cmbPrdZDHC.getInternalname()) );
                           A13301PrdZDHC = httpContext.cgiGet( cmbPrdZDHC.getInternalname()) ;
                           cmbPrdList.setName( cmbPrdList.getInternalname() );
                           cmbPrdList.setValue( httpContext.cgiGet( cmbPrdList.getInternalname()) );
                           A11687PrdList = httpContext.cgiGet( cmbPrdList.getInternalname()) ;
                           A13302PrdTHELIST = GXutil.upper( httpContext.cgiGet( edtPrdTHELIST_Internalname)) ;
                           n13302PrdTHELIST = false ;
                           A9741PrdHS = httpContext.cgiGet( edtPrdHS_Internalname) ;
                           A9742PrdFHS = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPrdFHS_Internalname), 0)) ;
                           A4693PrdNum2 = httpContext.cgiGet( edtPrdNum2_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDRGB");
                              GX_FocusControl = edtavPrdrgb_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV121PrdRGB = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121PrdRGB), 10, 0));
                           }
                           else
                           {
                              AV121PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121PrdRGB), 10, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
                              GX_FocusControl = edtavR_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV95R = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95R), 3, 0));
                           }
                           else
                           {
                              AV95R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95R), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
                              GX_FocusControl = edtavG_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV96G = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96G), 3, 0));
                           }
                           else
                           {
                              AV96G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96G), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
                              GX_FocusControl = edtavB_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV97B = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97B), 3, 0));
                           }
                           else
                           {
                              AV97B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97B), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
                              GX_FocusControl = edtavR2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV98R2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98R2), 3, 0));
                           }
                           else
                           {
                              AV98R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98R2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
                              GX_FocusControl = edtavG2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV99G2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99G2), 3, 0));
                           }
                           else
                           {
                              AV99G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99G2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
                              GX_FocusControl = edtavB2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV100B2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100B2), 3, 0));
                           }
                           else
                           {
                              AV100B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100B2), 3, 0));
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19VA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e20VA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21VA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22VA2 ();
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

   public void weVA2( )
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

   public void paVA2( )
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
            GX_FocusControl = edtavDdo_prdfhsauxdate_Internalname ;
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
      subsflControlProps_382( ) ;
      while ( nGXsfl_38_idx <= nRC_GXsfl_38 )
      {
         sendrow_382( ) ;
         nGXsfl_38_idx = ((subGrid_Islastpage==1)&&(nGXsfl_38_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_38_idx+1) ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 byte AV24ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ,
                                 String AV29TFPrdNom ,
                                 String AV30TFPrdNom_Sel ,
                                 String AV26TFPrdNum ,
                                 String AV27TFPrdNum_Sel ,
                                 java.math.BigDecimal AV32TFPrdExiAlm ,
                                 java.math.BigDecimal AV33TFPrdExiAlm_To ,
                                 java.math.BigDecimal AV38TFPrdCanRes ,
                                 java.math.BigDecimal AV39TFPrdCanRes_To ,
                                 java.math.BigDecimal AV137TFPrdDisponible ,
                                 java.math.BigDecimal AV138TFPrdDisponible_To ,
                                 java.math.BigDecimal AV50TFPrdCanPen ,
                                 java.math.BigDecimal AV51TFPrdCanPen_To ,
                                 java.math.BigDecimal AV53TFPrdPreAct ,
                                 java.math.BigDecimal AV54TFPrdPreAct_To ,
                                 String AV59TFValDsc ,
                                 String AV60TFValDsc_Sel ,
                                 String AV62TFPrdRec ,
                                 String AV63TFPrdRec_Sel ,
                                 java.math.BigDecimal AV65TFPrdAox ,
                                 java.math.BigDecimal AV66TFPrdAox_To ,
                                 String AV135TFPrdGots ,
                                 String AV136TFPrdGots_Sel ,
                                 String AV68TFPrdReach ,
                                 String AV69TFPrdReach_Sel ,
                                 GXSimpleCollection<String> AV124TFPrdOkotex_Sels ,
                                 String AV74TFPrdHm ,
                                 String AV75TFPrdHm_Sel ,
                                 GXSimpleCollection<String> AV126TFPrdZDHC_Sels ,
                                 GXSimpleCollection<String> AV128TFPrdList_Sels ,
                                 String AV81TFPrdTHELIST ,
                                 String AV82TFPrdTHELIST_Sel ,
                                 String AV84TFPrdHS ,
                                 String AV85TFPrdHS_Sel ,
                                 java.util.Date AV87TFPrdFHS ,
                                 java.util.Date AV88TFPrdFHS_To ,
                                 String AV92TFPrdNum2 ,
                                 String AV93TFPrdNum2_Sel ,
                                 String AV179Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV141Sirgb ,
                                 String Gx_mode )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20VA2 ();
      GRID_nCurrentRecord = 0 ;
      rfVA2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
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
      rfVA2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV179Pgmname = "TTproducWW" ;
      Gx_err = (short)(0) ;
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_38_Refreshing);
   }

   public void rfVA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(38) ;
      /* Execute user event: Refresh */
      e20VA2 ();
      nGXsfl_38_idx = 1 ;
      sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_382( ) ;
      bGXsfl_38_Refreshing = true ;
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
         subsflControlProps_382( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A5888PrdOkotex ,
                                              AV166Ttproducwwds_25_tfprdokotex_sels ,
                                              A13301PrdZDHC ,
                                              AV169Ttproducwwds_28_tfprdzdhc_sels ,
                                              A11687PrdList ,
                                              AV170Ttproducwwds_29_tfprdlist_sels ,
                                              AV143Ttproducwwds_2_tfprdnom_sel ,
                                              AV142Ttproducwwds_1_tfprdnom ,
                                              AV145Ttproducwwds_4_tfprdnum_sel ,
                                              AV144Ttproducwwds_3_tfprdnum ,
                                              AV146Ttproducwwds_5_tfprdexialm ,
                                              AV147Ttproducwwds_6_tfprdexialm_to ,
                                              AV148Ttproducwwds_7_tfprdcanres ,
                                              AV149Ttproducwwds_8_tfprdcanres_to ,
                                              AV150Ttproducwwds_9_tfprddisponible ,
                                              AV151Ttproducwwds_10_tfprddisponible_to ,
                                              AV152Ttproducwwds_11_tfprdcanpen ,
                                              AV153Ttproducwwds_12_tfprdcanpen_to ,
                                              AV154Ttproducwwds_13_tfprdpreact ,
                                              AV155Ttproducwwds_14_tfprdpreact_to ,
                                              AV157Ttproducwwds_16_tfvaldsc_sel ,
                                              AV156Ttproducwwds_15_tfvaldsc ,
                                              AV159Ttproducwwds_18_tfprdrec_sel ,
                                              AV158Ttproducwwds_17_tfprdrec ,
                                              AV160Ttproducwwds_19_tfprdaox ,
                                              AV161Ttproducwwds_20_tfprdaox_to ,
                                              AV163Ttproducwwds_22_tfprdgots_sel ,
                                              AV162Ttproducwwds_21_tfprdgots ,
                                              AV165Ttproducwwds_24_tfprdreach_sel ,
                                              AV164Ttproducwwds_23_tfprdreach ,
                                              Integer.valueOf(AV166Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                              AV168Ttproducwwds_27_tfprdhm_sel ,
                                              AV167Ttproducwwds_26_tfprdhm ,
                                              Integer.valueOf(AV169Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                              Integer.valueOf(AV170Ttproducwwds_29_tfprdlist_sels.size()) ,
                                              AV172Ttproducwwds_31_tfprdthelist_sel ,
                                              AV171Ttproducwwds_30_tfprdthelist ,
                                              AV174Ttproducwwds_33_tfprdhs_sel ,
                                              AV173Ttproducwwds_32_tfprdhs ,
                                              AV175Ttproducwwds_34_tfprdfhs ,
                                              AV176Ttproducwwds_35_tfprdfhs_to ,
                                              AV178Ttproducwwds_37_tfprdnum2_sel ,
                                              AV177Ttproducwwds_36_tfprdnum2 ,
                                              A718PrdNom ,
                                              A719PrdNum ,
                                              A704PrdExiAlm ,
                                              A685PrdCanRes ,
                                              A684PrdCanPen ,
                                              A724PrdPreAct ,
                                              A857ValDsc ,
                                              A727PrdRec ,
                                              A9733PrdAox ,
                                              A11363PrdGots ,
                                              A5887PrdReach ,
                                              A11364PrdHm ,
                                              A13302PrdTHELIST ,
                                              A9741PrdHS ,
                                              A9742PrdFHS ,
                                              A4693PrdNum2 ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING
                                              }
         });
         lV142Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV142Ttproducwwds_1_tfprdnom), 26, "%") ;
         lV144Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV144Ttproducwwds_3_tfprdnum), 6, "%") ;
         lV156Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV156Ttproducwwds_15_tfvaldsc), 16, "%") ;
         lV158Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV158Ttproducwwds_17_tfprdrec), 1, "%") ;
         lV162Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV162Ttproducwwds_21_tfprdgots), 1, "%") ;
         lV164Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV164Ttproducwwds_23_tfprdreach), 1, "%") ;
         lV167Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV167Ttproducwwds_26_tfprdhm), 1, "%") ;
         lV171Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV171Ttproducwwds_30_tfprdthelist), 4, "%") ;
         lV173Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV173Ttproducwwds_32_tfprdhs), 1, "%") ;
         lV177Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV177Ttproducwwds_36_tfprdnum2), 16, "%") ;
         /* Using cursor H00VA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, lV142Ttproducwwds_1_tfprdnom, AV143Ttproducwwds_2_tfprdnom_sel, lV144Ttproducwwds_3_tfprdnum, AV145Ttproducwwds_4_tfprdnum_sel, AV146Ttproducwwds_5_tfprdexialm, AV147Ttproducwwds_6_tfprdexialm_to, AV148Ttproducwwds_7_tfprdcanres, AV149Ttproducwwds_8_tfprdcanres_to, AV150Ttproducwwds_9_tfprddisponible, AV151Ttproducwwds_10_tfprddisponible_to, AV152Ttproducwwds_11_tfprdcanpen, AV153Ttproducwwds_12_tfprdcanpen_to, AV154Ttproducwwds_13_tfprdpreact, AV155Ttproducwwds_14_tfprdpreact_to, lV156Ttproducwwds_15_tfvaldsc, AV157Ttproducwwds_16_tfvaldsc_sel, lV158Ttproducwwds_17_tfprdrec, AV159Ttproducwwds_18_tfprdrec_sel, AV160Ttproducwwds_19_tfprdaox, AV161Ttproducwwds_20_tfprdaox_to, lV162Ttproducwwds_21_tfprdgots, AV163Ttproducwwds_22_tfprdgots_sel, lV164Ttproducwwds_23_tfprdreach, AV165Ttproducwwds_24_tfprdreach_sel, lV167Ttproducwwds_26_tfprdhm, AV168Ttproducwwds_27_tfprdhm_sel, lV171Ttproducwwds_30_tfprdthelist, AV172Ttproducwwds_31_tfprdthelist_sel, lV173Ttproducwwds_32_tfprdhs, AV174Ttproducwwds_33_tfprdhs_sel, AV175Ttproducwwds_34_tfprdfhs, AV176Ttproducwwds_35_tfprdfhs_to, lV177Ttproducwwds_36_tfprdnum2, AV178Ttproducwwds_37_tfprdnum2_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_38_idx = 1 ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A856ValCod = H00VA2_A856ValCod[0] ;
            A13232PrdRGB = H00VA2_A13232PrdRGB[0] ;
            A4693PrdNum2 = H00VA2_A4693PrdNum2[0] ;
            A9742PrdFHS = H00VA2_A9742PrdFHS[0] ;
            A9741PrdHS = H00VA2_A9741PrdHS[0] ;
            A13302PrdTHELIST = H00VA2_A13302PrdTHELIST[0] ;
            n13302PrdTHELIST = H00VA2_n13302PrdTHELIST[0] ;
            A11687PrdList = H00VA2_A11687PrdList[0] ;
            A13301PrdZDHC = H00VA2_A13301PrdZDHC[0] ;
            A11364PrdHm = H00VA2_A11364PrdHm[0] ;
            A5888PrdOkotex = H00VA2_A5888PrdOkotex[0] ;
            A5887PrdReach = H00VA2_A5887PrdReach[0] ;
            A11363PrdGots = H00VA2_A11363PrdGots[0] ;
            A9733PrdAox = H00VA2_A9733PrdAox[0] ;
            A727PrdRec = H00VA2_A727PrdRec[0] ;
            A857ValDsc = H00VA2_A857ValDsc[0] ;
            n857ValDsc = H00VA2_n857ValDsc[0] ;
            A724PrdPreAct = H00VA2_A724PrdPreAct[0] ;
            A684PrdCanPen = H00VA2_A684PrdCanPen[0] ;
            A719PrdNum = H00VA2_A719PrdNum[0] ;
            A718PrdNom = H00VA2_A718PrdNom[0] ;
            A685PrdCanRes = H00VA2_A685PrdCanRes[0] ;
            A704PrdExiAlm = H00VA2_A704PrdExiAlm[0] ;
            A857ValDsc = H00VA2_A857ValDsc[0] ;
            n857ValDsc = H00VA2_n857ValDsc[0] ;
            A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
            e21VA2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(38) ;
         wbVA0( ) ;
      }
      bGXsfl_38_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesVA2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV179Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV179Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIRGB", GXutil.ltrim( localUtil.ntoc( AV141Sirgb, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( AV141Sirgb, "9999999.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM"+"_"+sGXsfl_38_idx, getSecureSignedToken( sGXsfl_38_idx, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
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
      AV142Ttproducwwds_1_tfprdnom = AV29TFPrdNom ;
      AV143Ttproducwwds_2_tfprdnom_sel = AV30TFPrdNom_Sel ;
      AV144Ttproducwwds_3_tfprdnum = AV26TFPrdNum ;
      AV145Ttproducwwds_4_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV146Ttproducwwds_5_tfprdexialm = AV32TFPrdExiAlm ;
      AV147Ttproducwwds_6_tfprdexialm_to = AV33TFPrdExiAlm_To ;
      AV148Ttproducwwds_7_tfprdcanres = AV38TFPrdCanRes ;
      AV149Ttproducwwds_8_tfprdcanres_to = AV39TFPrdCanRes_To ;
      AV150Ttproducwwds_9_tfprddisponible = AV137TFPrdDisponible ;
      AV151Ttproducwwds_10_tfprddisponible_to = AV138TFPrdDisponible_To ;
      AV152Ttproducwwds_11_tfprdcanpen = AV50TFPrdCanPen ;
      AV153Ttproducwwds_12_tfprdcanpen_to = AV51TFPrdCanPen_To ;
      AV154Ttproducwwds_13_tfprdpreact = AV53TFPrdPreAct ;
      AV155Ttproducwwds_14_tfprdpreact_to = AV54TFPrdPreAct_To ;
      AV156Ttproducwwds_15_tfvaldsc = AV59TFValDsc ;
      AV157Ttproducwwds_16_tfvaldsc_sel = AV60TFValDsc_Sel ;
      AV158Ttproducwwds_17_tfprdrec = AV62TFPrdRec ;
      AV159Ttproducwwds_18_tfprdrec_sel = AV63TFPrdRec_Sel ;
      AV160Ttproducwwds_19_tfprdaox = AV65TFPrdAox ;
      AV161Ttproducwwds_20_tfprdaox_to = AV66TFPrdAox_To ;
      AV162Ttproducwwds_21_tfprdgots = AV135TFPrdGots ;
      AV163Ttproducwwds_22_tfprdgots_sel = AV136TFPrdGots_Sel ;
      AV164Ttproducwwds_23_tfprdreach = AV68TFPrdReach ;
      AV165Ttproducwwds_24_tfprdreach_sel = AV69TFPrdReach_Sel ;
      AV166Ttproducwwds_25_tfprdokotex_sels = AV124TFPrdOkotex_Sels ;
      AV167Ttproducwwds_26_tfprdhm = AV74TFPrdHm ;
      AV168Ttproducwwds_27_tfprdhm_sel = AV75TFPrdHm_Sel ;
      AV169Ttproducwwds_28_tfprdzdhc_sels = AV126TFPrdZDHC_Sels ;
      AV170Ttproducwwds_29_tfprdlist_sels = AV128TFPrdList_Sels ;
      AV171Ttproducwwds_30_tfprdthelist = AV81TFPrdTHELIST ;
      AV172Ttproducwwds_31_tfprdthelist_sel = AV82TFPrdTHELIST_Sel ;
      AV173Ttproducwwds_32_tfprdhs = AV84TFPrdHS ;
      AV174Ttproducwwds_33_tfprdhs_sel = AV85TFPrdHS_Sel ;
      AV175Ttproducwwds_34_tfprdfhs = AV87TFPrdFHS ;
      AV176Ttproducwwds_35_tfprdfhs_to = AV88TFPrdFHS_To ;
      AV177Ttproducwwds_36_tfprdnum2 = AV92TFPrdNum2 ;
      AV178Ttproducwwds_37_tfprdnum2_sel = AV93TFPrdNum2_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV166Ttproducwwds_25_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV169Ttproducwwds_28_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV170Ttproducwwds_29_tfprdlist_sels ,
                                           AV143Ttproducwwds_2_tfprdnom_sel ,
                                           AV142Ttproducwwds_1_tfprdnom ,
                                           AV145Ttproducwwds_4_tfprdnum_sel ,
                                           AV144Ttproducwwds_3_tfprdnum ,
                                           AV146Ttproducwwds_5_tfprdexialm ,
                                           AV147Ttproducwwds_6_tfprdexialm_to ,
                                           AV148Ttproducwwds_7_tfprdcanres ,
                                           AV149Ttproducwwds_8_tfprdcanres_to ,
                                           AV150Ttproducwwds_9_tfprddisponible ,
                                           AV151Ttproducwwds_10_tfprddisponible_to ,
                                           AV152Ttproducwwds_11_tfprdcanpen ,
                                           AV153Ttproducwwds_12_tfprdcanpen_to ,
                                           AV154Ttproducwwds_13_tfprdpreact ,
                                           AV155Ttproducwwds_14_tfprdpreact_to ,
                                           AV157Ttproducwwds_16_tfvaldsc_sel ,
                                           AV156Ttproducwwds_15_tfvaldsc ,
                                           AV159Ttproducwwds_18_tfprdrec_sel ,
                                           AV158Ttproducwwds_17_tfprdrec ,
                                           AV160Ttproducwwds_19_tfprdaox ,
                                           AV161Ttproducwwds_20_tfprdaox_to ,
                                           AV163Ttproducwwds_22_tfprdgots_sel ,
                                           AV162Ttproducwwds_21_tfprdgots ,
                                           AV165Ttproducwwds_24_tfprdreach_sel ,
                                           AV164Ttproducwwds_23_tfprdreach ,
                                           Integer.valueOf(AV166Ttproducwwds_25_tfprdokotex_sels.size()) ,
                                           AV168Ttproducwwds_27_tfprdhm_sel ,
                                           AV167Ttproducwwds_26_tfprdhm ,
                                           Integer.valueOf(AV169Ttproducwwds_28_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV170Ttproducwwds_29_tfprdlist_sels.size()) ,
                                           AV172Ttproducwwds_31_tfprdthelist_sel ,
                                           AV171Ttproducwwds_30_tfprdthelist ,
                                           AV174Ttproducwwds_33_tfprdhs_sel ,
                                           AV173Ttproducwwds_32_tfprdhs ,
                                           AV175Ttproducwwds_34_tfprdfhs ,
                                           AV176Ttproducwwds_35_tfprdfhs_to ,
                                           AV178Ttproducwwds_37_tfprdnum2_sel ,
                                           AV177Ttproducwwds_36_tfprdnum2 ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV142Ttproducwwds_1_tfprdnom = GXutil.padr( GXutil.rtrim( AV142Ttproducwwds_1_tfprdnom), 26, "%") ;
      lV144Ttproducwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV144Ttproducwwds_3_tfprdnum), 6, "%") ;
      lV156Ttproducwwds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV156Ttproducwwds_15_tfvaldsc), 16, "%") ;
      lV158Ttproducwwds_17_tfprdrec = GXutil.padr( GXutil.rtrim( AV158Ttproducwwds_17_tfprdrec), 1, "%") ;
      lV162Ttproducwwds_21_tfprdgots = GXutil.padr( GXutil.rtrim( AV162Ttproducwwds_21_tfprdgots), 1, "%") ;
      lV164Ttproducwwds_23_tfprdreach = GXutil.padr( GXutil.rtrim( AV164Ttproducwwds_23_tfprdreach), 1, "%") ;
      lV167Ttproducwwds_26_tfprdhm = GXutil.padr( GXutil.rtrim( AV167Ttproducwwds_26_tfprdhm), 1, "%") ;
      lV171Ttproducwwds_30_tfprdthelist = GXutil.padr( GXutil.rtrim( AV171Ttproducwwds_30_tfprdthelist), 4, "%") ;
      lV173Ttproducwwds_32_tfprdhs = GXutil.padr( GXutil.rtrim( AV173Ttproducwwds_32_tfprdhs), 1, "%") ;
      lV177Ttproducwwds_36_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV177Ttproducwwds_36_tfprdnum2), 16, "%") ;
      /* Using cursor H00VA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, lV142Ttproducwwds_1_tfprdnom, AV143Ttproducwwds_2_tfprdnom_sel, lV144Ttproducwwds_3_tfprdnum, AV145Ttproducwwds_4_tfprdnum_sel, AV146Ttproducwwds_5_tfprdexialm, AV147Ttproducwwds_6_tfprdexialm_to, AV148Ttproducwwds_7_tfprdcanres, AV149Ttproducwwds_8_tfprdcanres_to, AV150Ttproducwwds_9_tfprddisponible, AV151Ttproducwwds_10_tfprddisponible_to, AV152Ttproducwwds_11_tfprdcanpen, AV153Ttproducwwds_12_tfprdcanpen_to, AV154Ttproducwwds_13_tfprdpreact, AV155Ttproducwwds_14_tfprdpreact_to, lV156Ttproducwwds_15_tfvaldsc, AV157Ttproducwwds_16_tfvaldsc_sel, lV158Ttproducwwds_17_tfprdrec, AV159Ttproducwwds_18_tfprdrec_sel, AV160Ttproducwwds_19_tfprdaox, AV161Ttproducwwds_20_tfprdaox_to, lV162Ttproducwwds_21_tfprdgots, AV163Ttproducwwds_22_tfprdgots_sel, lV164Ttproducwwds_23_tfprdreach, AV165Ttproducwwds_24_tfprdreach_sel, lV167Ttproducwwds_26_tfprdhm, AV168Ttproducwwds_27_tfprdhm_sel, lV171Ttproducwwds_30_tfprdthelist, AV172Ttproducwwds_31_tfprdthelist_sel, lV173Ttproducwwds_32_tfprdhs, AV174Ttproducwwds_33_tfprdhs_sel, AV175Ttproducwwds_34_tfprdfhs, AV176Ttproducwwds_35_tfprdfhs_to, lV177Ttproducwwds_36_tfprdnum2, AV178Ttproducwwds_37_tfprdnum2_sel});
      GRID_nRecordCount = H00VA3_AGRID_nRecordCount[0] ;
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
      AV142Ttproducwwds_1_tfprdnom = AV29TFPrdNom ;
      AV143Ttproducwwds_2_tfprdnom_sel = AV30TFPrdNom_Sel ;
      AV144Ttproducwwds_3_tfprdnum = AV26TFPrdNum ;
      AV145Ttproducwwds_4_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV146Ttproducwwds_5_tfprdexialm = AV32TFPrdExiAlm ;
      AV147Ttproducwwds_6_tfprdexialm_to = AV33TFPrdExiAlm_To ;
      AV148Ttproducwwds_7_tfprdcanres = AV38TFPrdCanRes ;
      AV149Ttproducwwds_8_tfprdcanres_to = AV39TFPrdCanRes_To ;
      AV150Ttproducwwds_9_tfprddisponible = AV137TFPrdDisponible ;
      AV151Ttproducwwds_10_tfprddisponible_to = AV138TFPrdDisponible_To ;
      AV152Ttproducwwds_11_tfprdcanpen = AV50TFPrdCanPen ;
      AV153Ttproducwwds_12_tfprdcanpen_to = AV51TFPrdCanPen_To ;
      AV154Ttproducwwds_13_tfprdpreact = AV53TFPrdPreAct ;
      AV155Ttproducwwds_14_tfprdpreact_to = AV54TFPrdPreAct_To ;
      AV156Ttproducwwds_15_tfvaldsc = AV59TFValDsc ;
      AV157Ttproducwwds_16_tfvaldsc_sel = AV60TFValDsc_Sel ;
      AV158Ttproducwwds_17_tfprdrec = AV62TFPrdRec ;
      AV159Ttproducwwds_18_tfprdrec_sel = AV63TFPrdRec_Sel ;
      AV160Ttproducwwds_19_tfprdaox = AV65TFPrdAox ;
      AV161Ttproducwwds_20_tfprdaox_to = AV66TFPrdAox_To ;
      AV162Ttproducwwds_21_tfprdgots = AV135TFPrdGots ;
      AV163Ttproducwwds_22_tfprdgots_sel = AV136TFPrdGots_Sel ;
      AV164Ttproducwwds_23_tfprdreach = AV68TFPrdReach ;
      AV165Ttproducwwds_24_tfprdreach_sel = AV69TFPrdReach_Sel ;
      AV166Ttproducwwds_25_tfprdokotex_sels = AV124TFPrdOkotex_Sels ;
      AV167Ttproducwwds_26_tfprdhm = AV74TFPrdHm ;
      AV168Ttproducwwds_27_tfprdhm_sel = AV75TFPrdHm_Sel ;
      AV169Ttproducwwds_28_tfprdzdhc_sels = AV126TFPrdZDHC_Sels ;
      AV170Ttproducwwds_29_tfprdlist_sels = AV128TFPrdList_Sels ;
      AV171Ttproducwwds_30_tfprdthelist = AV81TFPrdTHELIST ;
      AV172Ttproducwwds_31_tfprdthelist_sel = AV82TFPrdTHELIST_Sel ;
      AV173Ttproducwwds_32_tfprdhs = AV84TFPrdHS ;
      AV174Ttproducwwds_33_tfprdhs_sel = AV85TFPrdHS_Sel ;
      AV175Ttproducwwds_34_tfprdfhs = AV87TFPrdFHS ;
      AV176Ttproducwwds_35_tfprdfhs_to = AV88TFPrdFHS_To ;
      AV177Ttproducwwds_36_tfprdnum2 = AV92TFPrdNum2 ;
      AV178Ttproducwwds_37_tfprdnum2_sel = AV93TFPrdNum2_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV29TFPrdNom, AV30TFPrdNom_Sel, AV26TFPrdNum, AV27TFPrdNum_Sel, AV32TFPrdExiAlm, AV33TFPrdExiAlm_To, AV38TFPrdCanRes, AV39TFPrdCanRes_To, AV137TFPrdDisponible, AV138TFPrdDisponible_To, AV50TFPrdCanPen, AV51TFPrdCanPen_To, AV53TFPrdPreAct, AV54TFPrdPreAct_To, AV59TFValDsc, AV60TFValDsc_Sel, AV62TFPrdRec, AV63TFPrdRec_Sel, AV65TFPrdAox, AV66TFPrdAox_To, AV135TFPrdGots, AV136TFPrdGots_Sel, AV68TFPrdReach, AV69TFPrdReach_Sel, AV124TFPrdOkotex_Sels, AV74TFPrdHm, AV75TFPrdHm_Sel, AV126TFPrdZDHC_Sels, AV128TFPrdList_Sels, AV81TFPrdTHELIST, AV82TFPrdTHELIST_Sel, AV84TFPrdHS, AV85TFPrdHS_Sel, AV87TFPrdFHS, AV88TFPrdFHS_To, AV92TFPrdNum2, AV93TFPrdNum2_Sel, AV179Pgmname, AV12OrderedBy, AV13OrderedDsc, AV141Sirgb, Gx_mode) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV142Ttproducwwds_1_tfprdnom = AV29TFPrdNom ;
      AV143Ttproducwwds_2_tfprdnom_sel = AV30TFPrdNom_Sel ;
      AV144Ttproducwwds_3_tfprdnum = AV26TFPrdNum ;
      AV145Ttproducwwds_4_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV146Ttproducwwds_5_tfprdexialm = AV32TFPrdExiAlm ;
      AV147Ttproducwwds_6_tfprdexialm_to = AV33TFPrdExiAlm_To ;
      AV148Ttproducwwds_7_tfprdcanres = AV38TFPrdCanRes ;
      AV149Ttproducwwds_8_tfprdcanres_to = AV39TFPrdCanRes_To ;
      AV150Ttproducwwds_9_tfprddisponible = AV137TFPrdDisponible ;
      AV151Ttproducwwds_10_tfprddisponible_to = AV138TFPrdDisponible_To ;
      AV152Ttproducwwds_11_tfprdcanpen = AV50TFPrdCanPen ;
      AV153Ttproducwwds_12_tfprdcanpen_to = AV51TFPrdCanPen_To ;
      AV154Ttproducwwds_13_tfprdpreact = AV53TFPrdPreAct ;
      AV155Ttproducwwds_14_tfprdpreact_to = AV54TFPrdPreAct_To ;
      AV156Ttproducwwds_15_tfvaldsc = AV59TFValDsc ;
      AV157Ttproducwwds_16_tfvaldsc_sel = AV60TFValDsc_Sel ;
      AV158Ttproducwwds_17_tfprdrec = AV62TFPrdRec ;
      AV159Ttproducwwds_18_tfprdrec_sel = AV63TFPrdRec_Sel ;
      AV160Ttproducwwds_19_tfprdaox = AV65TFPrdAox ;
      AV161Ttproducwwds_20_tfprdaox_to = AV66TFPrdAox_To ;
      AV162Ttproducwwds_21_tfprdgots = AV135TFPrdGots ;
      AV163Ttproducwwds_22_tfprdgots_sel = AV136TFPrdGots_Sel ;
      AV164Ttproducwwds_23_tfprdreach = AV68TFPrdReach ;
      AV165Ttproducwwds_24_tfprdreach_sel = AV69TFPrdReach_Sel ;
      AV166Ttproducwwds_25_tfprdokotex_sels = AV124TFPrdOkotex_Sels ;
      AV167Ttproducwwds_26_tfprdhm = AV74TFPrdHm ;
      AV168Ttproducwwds_27_tfprdhm_sel = AV75TFPrdHm_Sel ;
      AV169Ttproducwwds_28_tfprdzdhc_sels = AV126TFPrdZDHC_Sels ;
      AV170Ttproducwwds_29_tfprdlist_sels = AV128TFPrdList_Sels ;
      AV171Ttproducwwds_30_tfprdthelist = AV81TFPrdTHELIST ;
      AV172Ttproducwwds_31_tfprdthelist_sel = AV82TFPrdTHELIST_Sel ;
      AV173Ttproducwwds_32_tfprdhs = AV84TFPrdHS ;
      AV174Ttproducwwds_33_tfprdhs_sel = AV85TFPrdHS_Sel ;
      AV175Ttproducwwds_34_tfprdfhs = AV87TFPrdFHS ;
      AV176Ttproducwwds_35_tfprdfhs_to = AV88TFPrdFHS_To ;
      AV177Ttproducwwds_36_tfprdnum2 = AV92TFPrdNum2 ;
      AV178Ttproducwwds_37_tfprdnum2_sel = AV93TFPrdNum2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV29TFPrdNom, AV30TFPrdNom_Sel, AV26TFPrdNum, AV27TFPrdNum_Sel, AV32TFPrdExiAlm, AV33TFPrdExiAlm_To, AV38TFPrdCanRes, AV39TFPrdCanRes_To, AV137TFPrdDisponible, AV138TFPrdDisponible_To, AV50TFPrdCanPen, AV51TFPrdCanPen_To, AV53TFPrdPreAct, AV54TFPrdPreAct_To, AV59TFValDsc, AV60TFValDsc_Sel, AV62TFPrdRec, AV63TFPrdRec_Sel, AV65TFPrdAox, AV66TFPrdAox_To, AV135TFPrdGots, AV136TFPrdGots_Sel, AV68TFPrdReach, AV69TFPrdReach_Sel, AV124TFPrdOkotex_Sels, AV74TFPrdHm, AV75TFPrdHm_Sel, AV126TFPrdZDHC_Sels, AV128TFPrdList_Sels, AV81TFPrdTHELIST, AV82TFPrdTHELIST_Sel, AV84TFPrdHS, AV85TFPrdHS_Sel, AV87TFPrdFHS, AV88TFPrdFHS_To, AV92TFPrdNum2, AV93TFPrdNum2_Sel, AV179Pgmname, AV12OrderedBy, AV13OrderedDsc, AV141Sirgb, Gx_mode) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV142Ttproducwwds_1_tfprdnom = AV29TFPrdNom ;
      AV143Ttproducwwds_2_tfprdnom_sel = AV30TFPrdNom_Sel ;
      AV144Ttproducwwds_3_tfprdnum = AV26TFPrdNum ;
      AV145Ttproducwwds_4_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV146Ttproducwwds_5_tfprdexialm = AV32TFPrdExiAlm ;
      AV147Ttproducwwds_6_tfprdexialm_to = AV33TFPrdExiAlm_To ;
      AV148Ttproducwwds_7_tfprdcanres = AV38TFPrdCanRes ;
      AV149Ttproducwwds_8_tfprdcanres_to = AV39TFPrdCanRes_To ;
      AV150Ttproducwwds_9_tfprddisponible = AV137TFPrdDisponible ;
      AV151Ttproducwwds_10_tfprddisponible_to = AV138TFPrdDisponible_To ;
      AV152Ttproducwwds_11_tfprdcanpen = AV50TFPrdCanPen ;
      AV153Ttproducwwds_12_tfprdcanpen_to = AV51TFPrdCanPen_To ;
      AV154Ttproducwwds_13_tfprdpreact = AV53TFPrdPreAct ;
      AV155Ttproducwwds_14_tfprdpreact_to = AV54TFPrdPreAct_To ;
      AV156Ttproducwwds_15_tfvaldsc = AV59TFValDsc ;
      AV157Ttproducwwds_16_tfvaldsc_sel = AV60TFValDsc_Sel ;
      AV158Ttproducwwds_17_tfprdrec = AV62TFPrdRec ;
      AV159Ttproducwwds_18_tfprdrec_sel = AV63TFPrdRec_Sel ;
      AV160Ttproducwwds_19_tfprdaox = AV65TFPrdAox ;
      AV161Ttproducwwds_20_tfprdaox_to = AV66TFPrdAox_To ;
      AV162Ttproducwwds_21_tfprdgots = AV135TFPrdGots ;
      AV163Ttproducwwds_22_tfprdgots_sel = AV136TFPrdGots_Sel ;
      AV164Ttproducwwds_23_tfprdreach = AV68TFPrdReach ;
      AV165Ttproducwwds_24_tfprdreach_sel = AV69TFPrdReach_Sel ;
      AV166Ttproducwwds_25_tfprdokotex_sels = AV124TFPrdOkotex_Sels ;
      AV167Ttproducwwds_26_tfprdhm = AV74TFPrdHm ;
      AV168Ttproducwwds_27_tfprdhm_sel = AV75TFPrdHm_Sel ;
      AV169Ttproducwwds_28_tfprdzdhc_sels = AV126TFPrdZDHC_Sels ;
      AV170Ttproducwwds_29_tfprdlist_sels = AV128TFPrdList_Sels ;
      AV171Ttproducwwds_30_tfprdthelist = AV81TFPrdTHELIST ;
      AV172Ttproducwwds_31_tfprdthelist_sel = AV82TFPrdTHELIST_Sel ;
      AV173Ttproducwwds_32_tfprdhs = AV84TFPrdHS ;
      AV174Ttproducwwds_33_tfprdhs_sel = AV85TFPrdHS_Sel ;
      AV175Ttproducwwds_34_tfprdfhs = AV87TFPrdFHS ;
      AV176Ttproducwwds_35_tfprdfhs_to = AV88TFPrdFHS_To ;
      AV177Ttproducwwds_36_tfprdnum2 = AV92TFPrdNum2 ;
      AV178Ttproducwwds_37_tfprdnum2_sel = AV93TFPrdNum2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV29TFPrdNom, AV30TFPrdNom_Sel, AV26TFPrdNum, AV27TFPrdNum_Sel, AV32TFPrdExiAlm, AV33TFPrdExiAlm_To, AV38TFPrdCanRes, AV39TFPrdCanRes_To, AV137TFPrdDisponible, AV138TFPrdDisponible_To, AV50TFPrdCanPen, AV51TFPrdCanPen_To, AV53TFPrdPreAct, AV54TFPrdPreAct_To, AV59TFValDsc, AV60TFValDsc_Sel, AV62TFPrdRec, AV63TFPrdRec_Sel, AV65TFPrdAox, AV66TFPrdAox_To, AV135TFPrdGots, AV136TFPrdGots_Sel, AV68TFPrdReach, AV69TFPrdReach_Sel, AV124TFPrdOkotex_Sels, AV74TFPrdHm, AV75TFPrdHm_Sel, AV126TFPrdZDHC_Sels, AV128TFPrdList_Sels, AV81TFPrdTHELIST, AV82TFPrdTHELIST_Sel, AV84TFPrdHS, AV85TFPrdHS_Sel, AV87TFPrdFHS, AV88TFPrdFHS_To, AV92TFPrdNum2, AV93TFPrdNum2_Sel, AV179Pgmname, AV12OrderedBy, AV13OrderedDsc, AV141Sirgb, Gx_mode) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV142Ttproducwwds_1_tfprdnom = AV29TFPrdNom ;
      AV143Ttproducwwds_2_tfprdnom_sel = AV30TFPrdNom_Sel ;
      AV144Ttproducwwds_3_tfprdnum = AV26TFPrdNum ;
      AV145Ttproducwwds_4_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV146Ttproducwwds_5_tfprdexialm = AV32TFPrdExiAlm ;
      AV147Ttproducwwds_6_tfprdexialm_to = AV33TFPrdExiAlm_To ;
      AV148Ttproducwwds_7_tfprdcanres = AV38TFPrdCanRes ;
      AV149Ttproducwwds_8_tfprdcanres_to = AV39TFPrdCanRes_To ;
      AV150Ttproducwwds_9_tfprddisponible = AV137TFPrdDisponible ;
      AV151Ttproducwwds_10_tfprddisponible_to = AV138TFPrdDisponible_To ;
      AV152Ttproducwwds_11_tfprdcanpen = AV50TFPrdCanPen ;
      AV153Ttproducwwds_12_tfprdcanpen_to = AV51TFPrdCanPen_To ;
      AV154Ttproducwwds_13_tfprdpreact = AV53TFPrdPreAct ;
      AV155Ttproducwwds_14_tfprdpreact_to = AV54TFPrdPreAct_To ;
      AV156Ttproducwwds_15_tfvaldsc = AV59TFValDsc ;
      AV157Ttproducwwds_16_tfvaldsc_sel = AV60TFValDsc_Sel ;
      AV158Ttproducwwds_17_tfprdrec = AV62TFPrdRec ;
      AV159Ttproducwwds_18_tfprdrec_sel = AV63TFPrdRec_Sel ;
      AV160Ttproducwwds_19_tfprdaox = AV65TFPrdAox ;
      AV161Ttproducwwds_20_tfprdaox_to = AV66TFPrdAox_To ;
      AV162Ttproducwwds_21_tfprdgots = AV135TFPrdGots ;
      AV163Ttproducwwds_22_tfprdgots_sel = AV136TFPrdGots_Sel ;
      AV164Ttproducwwds_23_tfprdreach = AV68TFPrdReach ;
      AV165Ttproducwwds_24_tfprdreach_sel = AV69TFPrdReach_Sel ;
      AV166Ttproducwwds_25_tfprdokotex_sels = AV124TFPrdOkotex_Sels ;
      AV167Ttproducwwds_26_tfprdhm = AV74TFPrdHm ;
      AV168Ttproducwwds_27_tfprdhm_sel = AV75TFPrdHm_Sel ;
      AV169Ttproducwwds_28_tfprdzdhc_sels = AV126TFPrdZDHC_Sels ;
      AV170Ttproducwwds_29_tfprdlist_sels = AV128TFPrdList_Sels ;
      AV171Ttproducwwds_30_tfprdthelist = AV81TFPrdTHELIST ;
      AV172Ttproducwwds_31_tfprdthelist_sel = AV82TFPrdTHELIST_Sel ;
      AV173Ttproducwwds_32_tfprdhs = AV84TFPrdHS ;
      AV174Ttproducwwds_33_tfprdhs_sel = AV85TFPrdHS_Sel ;
      AV175Ttproducwwds_34_tfprdfhs = AV87TFPrdFHS ;
      AV176Ttproducwwds_35_tfprdfhs_to = AV88TFPrdFHS_To ;
      AV177Ttproducwwds_36_tfprdnum2 = AV92TFPrdNum2 ;
      AV178Ttproducwwds_37_tfprdnum2_sel = AV93TFPrdNum2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV29TFPrdNom, AV30TFPrdNom_Sel, AV26TFPrdNum, AV27TFPrdNum_Sel, AV32TFPrdExiAlm, AV33TFPrdExiAlm_To, AV38TFPrdCanRes, AV39TFPrdCanRes_To, AV137TFPrdDisponible, AV138TFPrdDisponible_To, AV50TFPrdCanPen, AV51TFPrdCanPen_To, AV53TFPrdPreAct, AV54TFPrdPreAct_To, AV59TFValDsc, AV60TFValDsc_Sel, AV62TFPrdRec, AV63TFPrdRec_Sel, AV65TFPrdAox, AV66TFPrdAox_To, AV135TFPrdGots, AV136TFPrdGots_Sel, AV68TFPrdReach, AV69TFPrdReach_Sel, AV124TFPrdOkotex_Sels, AV74TFPrdHm, AV75TFPrdHm_Sel, AV126TFPrdZDHC_Sels, AV128TFPrdList_Sels, AV81TFPrdTHELIST, AV82TFPrdTHELIST_Sel, AV84TFPrdHS, AV85TFPrdHS_Sel, AV87TFPrdFHS, AV88TFPrdFHS_To, AV92TFPrdNum2, AV93TFPrdNum2_Sel, AV179Pgmname, AV12OrderedBy, AV13OrderedDsc, AV141Sirgb, Gx_mode) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV142Ttproducwwds_1_tfprdnom = AV29TFPrdNom ;
      AV143Ttproducwwds_2_tfprdnom_sel = AV30TFPrdNom_Sel ;
      AV144Ttproducwwds_3_tfprdnum = AV26TFPrdNum ;
      AV145Ttproducwwds_4_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV146Ttproducwwds_5_tfprdexialm = AV32TFPrdExiAlm ;
      AV147Ttproducwwds_6_tfprdexialm_to = AV33TFPrdExiAlm_To ;
      AV148Ttproducwwds_7_tfprdcanres = AV38TFPrdCanRes ;
      AV149Ttproducwwds_8_tfprdcanres_to = AV39TFPrdCanRes_To ;
      AV150Ttproducwwds_9_tfprddisponible = AV137TFPrdDisponible ;
      AV151Ttproducwwds_10_tfprddisponible_to = AV138TFPrdDisponible_To ;
      AV152Ttproducwwds_11_tfprdcanpen = AV50TFPrdCanPen ;
      AV153Ttproducwwds_12_tfprdcanpen_to = AV51TFPrdCanPen_To ;
      AV154Ttproducwwds_13_tfprdpreact = AV53TFPrdPreAct ;
      AV155Ttproducwwds_14_tfprdpreact_to = AV54TFPrdPreAct_To ;
      AV156Ttproducwwds_15_tfvaldsc = AV59TFValDsc ;
      AV157Ttproducwwds_16_tfvaldsc_sel = AV60TFValDsc_Sel ;
      AV158Ttproducwwds_17_tfprdrec = AV62TFPrdRec ;
      AV159Ttproducwwds_18_tfprdrec_sel = AV63TFPrdRec_Sel ;
      AV160Ttproducwwds_19_tfprdaox = AV65TFPrdAox ;
      AV161Ttproducwwds_20_tfprdaox_to = AV66TFPrdAox_To ;
      AV162Ttproducwwds_21_tfprdgots = AV135TFPrdGots ;
      AV163Ttproducwwds_22_tfprdgots_sel = AV136TFPrdGots_Sel ;
      AV164Ttproducwwds_23_tfprdreach = AV68TFPrdReach ;
      AV165Ttproducwwds_24_tfprdreach_sel = AV69TFPrdReach_Sel ;
      AV166Ttproducwwds_25_tfprdokotex_sels = AV124TFPrdOkotex_Sels ;
      AV167Ttproducwwds_26_tfprdhm = AV74TFPrdHm ;
      AV168Ttproducwwds_27_tfprdhm_sel = AV75TFPrdHm_Sel ;
      AV169Ttproducwwds_28_tfprdzdhc_sels = AV126TFPrdZDHC_Sels ;
      AV170Ttproducwwds_29_tfprdlist_sels = AV128TFPrdList_Sels ;
      AV171Ttproducwwds_30_tfprdthelist = AV81TFPrdTHELIST ;
      AV172Ttproducwwds_31_tfprdthelist_sel = AV82TFPrdTHELIST_Sel ;
      AV173Ttproducwwds_32_tfprdhs = AV84TFPrdHS ;
      AV174Ttproducwwds_33_tfprdhs_sel = AV85TFPrdHS_Sel ;
      AV175Ttproducwwds_34_tfprdfhs = AV87TFPrdFHS ;
      AV176Ttproducwwds_35_tfprdfhs_to = AV88TFPrdFHS_To ;
      AV177Ttproducwwds_36_tfprdnum2 = AV92TFPrdNum2 ;
      AV178Ttproducwwds_37_tfprdnum2_sel = AV93TFPrdNum2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV29TFPrdNom, AV30TFPrdNom_Sel, AV26TFPrdNum, AV27TFPrdNum_Sel, AV32TFPrdExiAlm, AV33TFPrdExiAlm_To, AV38TFPrdCanRes, AV39TFPrdCanRes_To, AV137TFPrdDisponible, AV138TFPrdDisponible_To, AV50TFPrdCanPen, AV51TFPrdCanPen_To, AV53TFPrdPreAct, AV54TFPrdPreAct_To, AV59TFValDsc, AV60TFValDsc_Sel, AV62TFPrdRec, AV63TFPrdRec_Sel, AV65TFPrdAox, AV66TFPrdAox_To, AV135TFPrdGots, AV136TFPrdGots_Sel, AV68TFPrdReach, AV69TFPrdReach_Sel, AV124TFPrdOkotex_Sels, AV74TFPrdHm, AV75TFPrdHm_Sel, AV126TFPrdZDHC_Sels, AV128TFPrdList_Sels, AV81TFPrdTHELIST, AV82TFPrdTHELIST_Sel, AV84TFPrdHS, AV85TFPrdHS_Sel, AV87TFPrdFHS, AV88TFPrdFHS_To, AV92TFPrdNum2, AV93TFPrdNum2_Sel, AV179Pgmname, AV12OrderedBy, AV13OrderedDsc, AV141Sirgb, Gx_mode) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV179Pgmname = "TTproducWW" ;
      Gx_err = (short)(0) ;
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupVA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19VA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV22ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV41DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV19ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_38 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_38"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV44GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_prdfhsauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PRDFHSAUXDATE");
            GX_FocusControl = edtavDdo_prdfhsauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV89DDO_PrdFHSAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89DDO_PrdFHSAuxDate", localUtil.format(AV89DDO_PrdFHSAuxDate, "99/99/99"));
         }
         else
         {
            AV89DDO_PrdFHSAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_prdfhsauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89DDO_PrdFHSAuxDate", localUtil.format(AV89DDO_PrdFHSAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_prdfhsauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PRDFHSAUXDATETO");
            GX_FocusControl = edtavDdo_prdfhsauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90DDO_PrdFHSAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90DDO_PrdFHSAuxDateTo", localUtil.format(AV90DDO_PrdFHSAuxDateTo, "99/99/99"));
         }
         else
         {
            AV90DDO_PrdFHSAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_prdfhsauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90DDO_PrdFHSAuxDateTo", localUtil.format(AV90DDO_PrdFHSAuxDateTo, "99/99/99"));
         }
         /* Read subfile selected row values. */
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
      e19VA2 ();
      if (returnInSub) return;
   }

   public void e19VA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV101Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttproducww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV101Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV102EmprNom ;
      GXv_char4[0] = AV103UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV101Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttproducww_impl.this.A396EmprCod = GXv_char2[0] ;
      ttproducww_impl.this.AV102EmprNom = GXv_char3[0] ;
      ttproducww_impl.this.AV103UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXt_int5 = (byte)(AV131CnoEnc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CNOENC", ""), GXv_int6) ;
      ttproducww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV131CnoEnc = GXt_int5 ;
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Cnoenc',23),t(=,10),t('1',3),t(',',7),t('TRUE',40),t(',',7),t('FALSE',41),t(')',4) ]
         Target    : [ t('Cadernoencargos',23),t('Visible',3) ]
         ForType   : 29
         Type      : []
      */
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV141Sirgb)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIPRGB", ""), GXv_int6) ;
      ttproducww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV141Sirgb = DecimalUtil.doubleToDec(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV141Sirgb", GXutil.ltrimstr( AV141Sirgb, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( AV141Sirgb, "9999999.99")));
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento de Productos Quimicos", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV41DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV41DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20VA2( )
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
      if ( GXutil.strcmp(AV21Session.getValue("TTproducWWColumnsSelector"), "") != 0 )
      {
         AV17ColumnsSelectorXML = AV21Session.getValue("TTproducWWColumnsSelector") ;
         AV19ColumnsSelector.fromxml(AV17ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdExiAlm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdCanRes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdDisponi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDisponi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDisponi_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdCanPen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanPen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanPen_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdPreAct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtValDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDsc_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdRec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRec_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdAox_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAox_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAox_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdGots_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdReach_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdReach_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdReach_Visible), 5, 0), !bGXsfl_38_Refreshing);
      cmbPrdOkotex.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdOkotex.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdOkotex.getVisible(), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdHm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHm_Visible), 5, 0), !bGXsfl_38_Refreshing);
      cmbPrdZDHC.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdZDHC.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdZDHC.getVisible(), 5, 0), !bGXsfl_38_Refreshing);
      cmbPrdList.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdList.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdList.getVisible(), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdTHELIST_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdTHELIST_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTHELIST_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdHS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHS_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdFHS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFHS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFHS_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdNum2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum2_Visible), 5, 0), !bGXsfl_38_Refreshing);
      AV43GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridCurrentPage), 10, 0));
      AV44GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridPageCount), 10, 0));
      AV142Ttproducwwds_1_tfprdnom = AV29TFPrdNom ;
      AV143Ttproducwwds_2_tfprdnom_sel = AV30TFPrdNom_Sel ;
      AV144Ttproducwwds_3_tfprdnum = AV26TFPrdNum ;
      AV145Ttproducwwds_4_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV146Ttproducwwds_5_tfprdexialm = AV32TFPrdExiAlm ;
      AV147Ttproducwwds_6_tfprdexialm_to = AV33TFPrdExiAlm_To ;
      AV148Ttproducwwds_7_tfprdcanres = AV38TFPrdCanRes ;
      AV149Ttproducwwds_8_tfprdcanres_to = AV39TFPrdCanRes_To ;
      AV150Ttproducwwds_9_tfprddisponible = AV137TFPrdDisponible ;
      AV151Ttproducwwds_10_tfprddisponible_to = AV138TFPrdDisponible_To ;
      AV152Ttproducwwds_11_tfprdcanpen = AV50TFPrdCanPen ;
      AV153Ttproducwwds_12_tfprdcanpen_to = AV51TFPrdCanPen_To ;
      AV154Ttproducwwds_13_tfprdpreact = AV53TFPrdPreAct ;
      AV155Ttproducwwds_14_tfprdpreact_to = AV54TFPrdPreAct_To ;
      AV156Ttproducwwds_15_tfvaldsc = AV59TFValDsc ;
      AV157Ttproducwwds_16_tfvaldsc_sel = AV60TFValDsc_Sel ;
      AV158Ttproducwwds_17_tfprdrec = AV62TFPrdRec ;
      AV159Ttproducwwds_18_tfprdrec_sel = AV63TFPrdRec_Sel ;
      AV160Ttproducwwds_19_tfprdaox = AV65TFPrdAox ;
      AV161Ttproducwwds_20_tfprdaox_to = AV66TFPrdAox_To ;
      AV162Ttproducwwds_21_tfprdgots = AV135TFPrdGots ;
      AV163Ttproducwwds_22_tfprdgots_sel = AV136TFPrdGots_Sel ;
      AV164Ttproducwwds_23_tfprdreach = AV68TFPrdReach ;
      AV165Ttproducwwds_24_tfprdreach_sel = AV69TFPrdReach_Sel ;
      AV166Ttproducwwds_25_tfprdokotex_sels = AV124TFPrdOkotex_Sels ;
      AV167Ttproducwwds_26_tfprdhm = AV74TFPrdHm ;
      AV168Ttproducwwds_27_tfprdhm_sel = AV75TFPrdHm_Sel ;
      AV169Ttproducwwds_28_tfprdzdhc_sels = AV126TFPrdZDHC_Sels ;
      AV170Ttproducwwds_29_tfprdlist_sels = AV128TFPrdList_Sels ;
      AV171Ttproducwwds_30_tfprdthelist = AV81TFPrdTHELIST ;
      AV172Ttproducwwds_31_tfprdthelist_sel = AV82TFPrdTHELIST_Sel ;
      AV173Ttproducwwds_32_tfprdhs = AV84TFPrdHS ;
      AV174Ttproducwwds_33_tfprdhs_sel = AV85TFPrdHS_Sel ;
      AV175Ttproducwwds_34_tfprdfhs = AV87TFPrdFHS ;
      AV176Ttproducwwds_35_tfprdfhs_to = AV88TFPrdFHS_To ;
      AV177Ttproducwwds_36_tfprdnum2 = AV92TFPrdNum2 ;
      AV178Ttproducwwds_37_tfprdnum2_sel = AV93TFPrdNum2_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12VA2( )
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

   public void e13VA2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14VA2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV29TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNom", AV29TFPrdNom);
            AV30TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrdNom_Sel", AV30TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV26TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNum", AV26TFPrdNum);
            AV27TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiAlm") == 0 )
         {
            AV32TFPrdExiAlm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrdExiAlm", GXutil.ltrimstr( AV32TFPrdExiAlm, 12, 4));
            AV33TFPrdExiAlm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrdExiAlm_To", GXutil.ltrimstr( AV33TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanRes") == 0 )
         {
            AV38TFPrdCanRes = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdCanRes", GXutil.ltrimstr( AV38TFPrdCanRes, 12, 4));
            AV39TFPrdCanRes_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdCanRes_To", GXutil.ltrimstr( AV39TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdDisponible") == 0 )
         {
            AV137TFPrdDisponible = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137TFPrdDisponible", GXutil.ltrimstr( AV137TFPrdDisponible, 12, 4));
            AV138TFPrdDisponible_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138TFPrdDisponible_To", GXutil.ltrimstr( AV138TFPrdDisponible_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanPen") == 0 )
         {
            AV50TFPrdCanPen = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdCanPen", GXutil.ltrimstr( AV50TFPrdCanPen, 12, 4));
            AV51TFPrdCanPen_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdCanPen_To", GXutil.ltrimstr( AV51TFPrdCanPen_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdPreAct") == 0 )
         {
            AV53TFPrdPreAct = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdPreAct", GXutil.ltrimstr( AV53TFPrdPreAct, 14, 5));
            AV54TFPrdPreAct_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdPreAct_To", GXutil.ltrimstr( AV54TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValDsc") == 0 )
         {
            AV59TFValDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFValDsc", AV59TFValDsc);
            AV60TFValDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFValDsc_Sel", AV60TFValDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdRec") == 0 )
         {
            AV62TFPrdRec = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrdRec", AV62TFPrdRec);
            AV63TFPrdRec_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFPrdRec_Sel", AV63TFPrdRec_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdAox") == 0 )
         {
            AV65TFPrdAox = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdAox", GXutil.ltrimstr( AV65TFPrdAox, 6, 2));
            AV66TFPrdAox_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdAox_To", GXutil.ltrimstr( AV66TFPrdAox_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdGots") == 0 )
         {
            AV135TFPrdGots = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV135TFPrdGots", AV135TFPrdGots);
            AV136TFPrdGots_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV136TFPrdGots_Sel", AV136TFPrdGots_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdReach") == 0 )
         {
            AV68TFPrdReach = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdReach", AV68TFPrdReach);
            AV69TFPrdReach_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrdReach_Sel", AV69TFPrdReach_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdOkotex") == 0 )
         {
            AV123TFPrdOkotex_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123TFPrdOkotex_SelsJson", AV123TFPrdOkotex_SelsJson);
            AV124TFPrdOkotex_Sels.fromJSonString(AV123TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdHm") == 0 )
         {
            AV74TFPrdHm = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFPrdHm", AV74TFPrdHm);
            AV75TFPrdHm_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFPrdHm_Sel", AV75TFPrdHm_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdZDHC") == 0 )
         {
            AV125TFPrdZDHC_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125TFPrdZDHC_SelsJson", AV125TFPrdZDHC_SelsJson);
            AV126TFPrdZDHC_Sels.fromJSonString(AV125TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdList") == 0 )
         {
            AV127TFPrdList_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127TFPrdList_SelsJson", AV127TFPrdList_SelsJson);
            AV128TFPrdList_Sels.fromJSonString(AV127TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdTHELIST") == 0 )
         {
            AV81TFPrdTHELIST = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFPrdTHELIST", AV81TFPrdTHELIST);
            AV82TFPrdTHELIST_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFPrdTHELIST_Sel", AV82TFPrdTHELIST_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdHS") == 0 )
         {
            AV84TFPrdHS = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFPrdHS", AV84TFPrdHS);
            AV85TFPrdHS_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFPrdHS_Sel", AV85TFPrdHS_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdFHS") == 0 )
         {
            AV87TFPrdFHS = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFPrdFHS", localUtil.format(AV87TFPrdFHS, "99/99/99"));
            AV88TFPrdFHS_To = localUtil.ctod( Ddo_grid_Filteredtextto_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFPrdFHS_To", localUtil.format(AV88TFPrdFHS_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum2") == 0 )
         {
            AV92TFPrdNum2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFPrdNum2", AV92TFPrdNum2);
            AV93TFPrdNum2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFPrdNum2_Sel", AV93TFPrdNum2_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128TFPrdList_Sels", AV128TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV126TFPrdZDHC_Sels", AV126TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV124TFPrdOkotex_Sels", AV124TFPrdOkotex_Sels);
   }

   private void e21VA2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      if ( cmbavGridactions.getVisible() == ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "PROPRV", "")) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         cmbavGridactions.addItem("4", httpContext.getMessage( "Proveedores", ""), (short)(0));
      }
      cmbavGridactions.addItem("5", httpContext.getMessage( "Cuaderno Encargos", ""), (short)(0));
      edtValDsc_Link = formatLink("app.stocksquimicos.ttipvalview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A856ValCod,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","ValCod","TabCode"})  ;
      AV121PrdRGB = ((A13232PrdRGB==0) ? 65793 : A13232PrdRGB) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121PrdRGB), 10, 0));
      GXv_int10[0] = AV95R ;
      GXv_int11[0] = AV96G ;
      GXv_int12[0] = AV97B ;
      GXv_int13[0] = AV98R2 ;
      GXv_int14[0] = AV99G2 ;
      GXv_int15[0] = AV100B2 ;
      new app.backcolorforecolor(remoteHandle, context).execute( AV121PrdRGB, GXv_int10, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_int15) ;
      ttproducww_impl.this.AV95R = GXv_int10[0] ;
      ttproducww_impl.this.AV96G = GXv_int11[0] ;
      ttproducww_impl.this.AV97B = GXv_int12[0] ;
      ttproducww_impl.this.AV98R2 = GXv_int13[0] ;
      ttproducww_impl.this.AV99G2 = GXv_int14[0] ;
      ttproducww_impl.this.AV100B2 = GXv_int15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95R), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96G), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97B), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98R2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99G2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100B2), 3, 0));
      if ( AV141Sirgb.doubleValue() == 1 )
      {
         edtPrdNom_Backcolor = GXutil.getColor( AV95R, AV96G, AV97B) ;
         edtPrdNom_Forecolor = GXutil.getColor( AV98R2, AV99G2, AV100B2) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(38) ;
      }
      sendrow_382( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_38_Refreshing )
      {
         httpContext.doAjaxLoad(38, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV134GridActions, 4, 0)) );
   }

   public void e15VA2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV17ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV19ColumnsSelector.fromJSonString(AV17ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TTproducWWColumnsSelector", ((GXutil.strcmp("", AV17ColumnsSelectorXML)==0) ? "" : AV19ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11VA2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TTproducWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV179Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TTproducWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV23ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TTproducWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         ttproducww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV179Pgmname+"GridState", AV23ManageFiltersXml) ;
            AV10GridState.fromxml(AV23ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV124TFPrdOkotex_Sels", AV124TFPrdOkotex_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV126TFPrdZDHC_Sels", AV126TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128TFPrdList_Sels", AV128TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
   }

   public void e22VA2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV134GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV134GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV134GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV134GridActions == 4 )
      {
         /* Execute user subroutine: 'DO PROVEEDORES' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV134GridActions == 5 )
      {
         /* Execute user subroutine: 'DO CADERNOENCARGOS' */
         S232 ();
         if (returnInSub) return;
      }
      AV134GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV134GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e16VA2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttproduc", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e17VA2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV15ExcelFilename ;
      GXv_char3[0] = AV16ErrorMessage ;
      new app.ttproducwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      ttproducww_impl.this.AV15ExcelFilename = GXv_char4[0] ;
      ttproducww_impl.this.AV16ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128TFPrdList_Sels", AV128TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV126TFPrdZDHC_Sels", AV126TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV124TFPrdOkotex_Sels", AV124TFPrdOkotex_Sels);
   }

   public void e18VA2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.ttproducwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128TFPrdList_Sels", AV128TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV126TFPrdZDHC_Sels", AV126TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV124TFPrdOkotex_Sels", AV124TFPrdOkotex_Sels);
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
      AV19ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdNom", "", "Producto", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdNum", "", "Producto", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdExiAlm", "", "Exis Alm", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdCanRes", "", "Cant Res", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdDisponible", "", "Disponible", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdCanPen", "", "Cant Pdte", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdPreAct", "", "Precio", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "ValDsc", "", "Validez", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdRec", "", "Rec?", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdAox", "", "AOX (adsorbable organic halogens)", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdGots", "", "Global Organic Textile Standar", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdReach", "", "REACH", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdOkotex", "", "Oeko Tex", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdHm", "", "HM", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdZDHC", "", "ZDHC", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdList", "", "List by Inditex ", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdTHELIST", "", "THELIST", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdHS", "", "Hoja Segur", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdFHS", "", "Fecha Hoja Segur", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdNum2", "", "Producto Aux", false, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXt_char1 = AV18UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTproducWWColumnsSelector", GXv_char4) ;
      ttproducww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV18UserCustomValue)==0) ) )
      {
         AV20ColumnsSelectorAux.fromxml(AV18UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector17[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, GXv_SdtWWPColumnsSelector17) ;
         AV20ColumnsSelectorAux = GXv_SdtWWPColumnsSelector16[0] ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = AV22ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TTproducWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] ;
      AV22ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV29TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNom", AV29TFPrdNom);
      AV30TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrdNom_Sel", AV30TFPrdNom_Sel);
      AV26TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNum", AV26TFPrdNum);
      AV27TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
      AV32TFPrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrdExiAlm", GXutil.ltrimstr( AV32TFPrdExiAlm, 12, 4));
      AV33TFPrdExiAlm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrdExiAlm_To", GXutil.ltrimstr( AV33TFPrdExiAlm_To, 12, 4));
      AV38TFPrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdCanRes", GXutil.ltrimstr( AV38TFPrdCanRes, 12, 4));
      AV39TFPrdCanRes_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdCanRes_To", GXutil.ltrimstr( AV39TFPrdCanRes_To, 12, 4));
      AV137TFPrdDisponible = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137TFPrdDisponible", GXutil.ltrimstr( AV137TFPrdDisponible, 12, 4));
      AV138TFPrdDisponible_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138TFPrdDisponible_To", GXutil.ltrimstr( AV138TFPrdDisponible_To, 12, 4));
      AV50TFPrdCanPen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdCanPen", GXutil.ltrimstr( AV50TFPrdCanPen, 12, 4));
      AV51TFPrdCanPen_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdCanPen_To", GXutil.ltrimstr( AV51TFPrdCanPen_To, 12, 4));
      AV53TFPrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdPreAct", GXutil.ltrimstr( AV53TFPrdPreAct, 14, 5));
      AV54TFPrdPreAct_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdPreAct_To", GXutil.ltrimstr( AV54TFPrdPreAct_To, 14, 5));
      AV59TFValDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFValDsc", AV59TFValDsc);
      AV60TFValDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFValDsc_Sel", AV60TFValDsc_Sel);
      AV62TFPrdRec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrdRec", AV62TFPrdRec);
      AV63TFPrdRec_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFPrdRec_Sel", AV63TFPrdRec_Sel);
      AV65TFPrdAox = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdAox", GXutil.ltrimstr( AV65TFPrdAox, 6, 2));
      AV66TFPrdAox_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdAox_To", GXutil.ltrimstr( AV66TFPrdAox_To, 6, 2));
      AV135TFPrdGots = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV135TFPrdGots", AV135TFPrdGots);
      AV136TFPrdGots_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV136TFPrdGots_Sel", AV136TFPrdGots_Sel);
      AV68TFPrdReach = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdReach", AV68TFPrdReach);
      AV69TFPrdReach_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrdReach_Sel", AV69TFPrdReach_Sel);
      AV124TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV74TFPrdHm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFPrdHm", AV74TFPrdHm);
      AV75TFPrdHm_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFPrdHm_Sel", AV75TFPrdHm_Sel);
      AV126TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV128TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV81TFPrdTHELIST = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFPrdTHELIST", AV81TFPrdTHELIST);
      AV82TFPrdTHELIST_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFPrdTHELIST_Sel", AV82TFPrdTHELIST_Sel);
      AV84TFPrdHS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84TFPrdHS", AV84TFPrdHS);
      AV85TFPrdHS_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFPrdHS_Sel", AV85TFPrdHS_Sel);
      AV87TFPrdFHS = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFPrdFHS", localUtil.format(AV87TFPrdFHS, "99/99/99"));
      AV88TFPrdFHS_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFPrdFHS_To", localUtil.format(AV88TFPrdFHS_To, "99/99/99"));
      AV92TFPrdNum2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFPrdNum2", AV92TFPrdNum2);
      AV93TFPrdNum2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93TFPrdNum2_Sel", AV93TFPrdNum2_Sel);
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
      callWebObject(formatLink("app.ttproducview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","PrdNum","TabCode"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttproduc", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttproduc", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO PROVEEDORES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tnprovprd", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO CADERNOENCARGOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tcdnenc", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue(AV179Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV179Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV21Session.getValue(AV179Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
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
      AV181GXV1 = 1 ;
      while ( AV181GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV181GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV29TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNom", AV29TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV30TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrdNom_Sel", AV30TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV26TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNum", AV26TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV27TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV32TFPrdExiAlm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrdExiAlm", GXutil.ltrimstr( AV32TFPrdExiAlm, 12, 4));
            AV33TFPrdExiAlm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrdExiAlm_To", GXutil.ltrimstr( AV33TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV38TFPrdCanRes = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdCanRes", GXutil.ltrimstr( AV38TFPrdCanRes, 12, 4));
            AV39TFPrdCanRes_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdCanRes_To", GXutil.ltrimstr( AV39TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV137TFPrdDisponible = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137TFPrdDisponible", GXutil.ltrimstr( AV137TFPrdDisponible, 12, 4));
            AV138TFPrdDisponible_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138TFPrdDisponible_To", GXutil.ltrimstr( AV138TFPrdDisponible_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV50TFPrdCanPen = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdCanPen", GXutil.ltrimstr( AV50TFPrdCanPen, 12, 4));
            AV51TFPrdCanPen_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdCanPen_To", GXutil.ltrimstr( AV51TFPrdCanPen_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV53TFPrdPreAct = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdPreAct", GXutil.ltrimstr( AV53TFPrdPreAct, 14, 5));
            AV54TFPrdPreAct_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdPreAct_To", GXutil.ltrimstr( AV54TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV59TFValDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFValDsc", AV59TFValDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV60TFValDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFValDsc_Sel", AV60TFValDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV62TFPrdRec = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrdRec", AV62TFPrdRec);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV63TFPrdRec_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFPrdRec_Sel", AV63TFPrdRec_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV65TFPrdAox = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdAox", GXutil.ltrimstr( AV65TFPrdAox, 6, 2));
            AV66TFPrdAox_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdAox_To", GXutil.ltrimstr( AV66TFPrdAox_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV135TFPrdGots = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV135TFPrdGots", AV135TFPrdGots);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV136TFPrdGots_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV136TFPrdGots_Sel", AV136TFPrdGots_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV68TFPrdReach = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdReach", AV68TFPrdReach);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV69TFPrdReach_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrdReach_Sel", AV69TFPrdReach_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV123TFPrdOkotex_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123TFPrdOkotex_SelsJson", AV123TFPrdOkotex_SelsJson);
            AV124TFPrdOkotex_Sels.fromJSonString(AV123TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV74TFPrdHm = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFPrdHm", AV74TFPrdHm);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV75TFPrdHm_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFPrdHm_Sel", AV75TFPrdHm_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV125TFPrdZDHC_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125TFPrdZDHC_SelsJson", AV125TFPrdZDHC_SelsJson);
            AV126TFPrdZDHC_Sels.fromJSonString(AV125TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV127TFPrdList_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127TFPrdList_SelsJson", AV127TFPrdList_SelsJson);
            AV128TFPrdList_Sels.fromJSonString(AV127TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV81TFPrdTHELIST = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFPrdTHELIST", AV81TFPrdTHELIST);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV82TFPrdTHELIST_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFPrdTHELIST_Sel", AV82TFPrdTHELIST_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV84TFPrdHS = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFPrdHS", AV84TFPrdHS);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV85TFPrdHS_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFPrdHS_Sel", AV85TFPrdHS_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV87TFPrdFHS = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFPrdFHS", localUtil.format(AV87TFPrdFHS, "99/99/99"));
            AV88TFPrdFHS_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFPrdFHS_To", localUtil.format(AV88TFPrdFHS_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2") == 0 )
         {
            AV92TFPrdNum2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFPrdNum2", AV92TFPrdNum2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2_SEL") == 0 )
         {
            AV93TFPrdNum2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFPrdNum2_Sel", AV93TFPrdNum2_Sel);
         }
         AV181GXV1 = (int)(AV181GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFPrdNom_Sel)==0), AV30TFPrdNom_Sel, GXv_char4) ;
      ttproducww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char20 = "" ;
      GXv_char3[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFPrdNum_Sel)==0), AV27TFPrdNum_Sel, GXv_char3) ;
      ttproducww_impl.this.GXt_char20 = GXv_char3[0] ;
      GXt_char21 = "" ;
      GXv_char2[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFValDsc_Sel)==0), AV60TFValDsc_Sel, GXv_char2) ;
      ttproducww_impl.this.GXt_char21 = GXv_char2[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFPrdRec_Sel)==0), AV63TFPrdRec_Sel, GXv_char23) ;
      ttproducww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV136TFPrdGots_Sel)==0), AV136TFPrdGots_Sel, GXv_char25) ;
      ttproducww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFPrdReach_Sel)==0), AV69TFPrdReach_Sel, GXv_char27) ;
      ttproducww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV124TFPrdOkotex_Sels.size()==0), AV123TFPrdOkotex_SelsJson, GXv_char29) ;
      ttproducww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFPrdHm_Sel)==0), AV75TFPrdHm_Sel, GXv_char31) ;
      ttproducww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV126TFPrdZDHC_Sels.size()==0), AV125TFPrdZDHC_SelsJson, GXv_char33) ;
      ttproducww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV128TFPrdList_Sels.size()==0), AV127TFPrdList_SelsJson, GXv_char35) ;
      ttproducww_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFPrdTHELIST_Sel)==0), AV82TFPrdTHELIST_Sel, GXv_char37) ;
      ttproducww_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV85TFPrdHS_Sel)==0), AV85TFPrdHS_Sel, GXv_char39) ;
      ttproducww_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV93TFPrdNum2_Sel)==0), AV93TFPrdNum2_Sel, GXv_char41) ;
      ttproducww_impl.this.GXt_char40 = GXv_char41[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char20+"||||||"+GXt_char21+"|"+GXt_char22+"||"+GXt_char24+"|"+GXt_char26+"|"+GXt_char28+"|"+GXt_char30+"|"+GXt_char32+"|"+GXt_char34+"|"+GXt_char36+"|"+GXt_char38+"||"+GXt_char40 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPrdNom)==0), AV29TFPrdNom, GXv_char41) ;
      ttproducww_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFPrdNum)==0), AV26TFPrdNum, GXv_char39) ;
      ttproducww_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFValDsc)==0), AV59TFValDsc, GXv_char37) ;
      ttproducww_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFPrdRec)==0), AV62TFPrdRec, GXv_char35) ;
      ttproducww_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV135TFPrdGots)==0), AV135TFPrdGots, GXv_char33) ;
      ttproducww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFPrdReach)==0), AV68TFPrdReach, GXv_char31) ;
      ttproducww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFPrdHm)==0), AV74TFPrdHm, GXv_char29) ;
      ttproducww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFPrdTHELIST)==0), AV81TFPrdTHELIST, GXv_char27) ;
      ttproducww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFPrdHS)==0), AV84TFPrdHS, GXv_char25) ;
      ttproducww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV92TFPrdNum2)==0), AV92TFPrdNum2, GXv_char23) ;
      ttproducww_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Filteredtext_set = GXt_char40+"|"+GXt_char38+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFPrdExiAlm)==0) ? "" : GXutil.str( AV32TFPrdExiAlm, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdCanRes)==0) ? "" : GXutil.str( AV38TFPrdCanRes, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV137TFPrdDisponible)==0) ? "" : GXutil.str( AV137TFPrdDisponible, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFPrdCanPen)==0) ? "" : GXutil.str( AV50TFPrdCanPen, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrdPreAct)==0) ? "" : GXutil.str( AV53TFPrdPreAct, 14, 5))+"|"+GXt_char36+"|"+GXt_char34+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFPrdAox)==0) ? "" : GXutil.str( AV65TFPrdAox, 6, 2))+"|"+GXt_char32+"|"+GXt_char30+"||"+GXt_char28+"|||"+GXt_char26+"|"+GXt_char24+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87TFPrdFHS)) ? "" : localUtil.dtoc( AV87TFPrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char22 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFPrdExiAlm_To)==0) ? "" : GXutil.str( AV33TFPrdExiAlm_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdCanRes_To)==0) ? "" : GXutil.str( AV39TFPrdCanRes_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV138TFPrdDisponible_To)==0) ? "" : GXutil.str( AV138TFPrdDisponible_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFPrdCanPen_To)==0) ? "" : GXutil.str( AV51TFPrdCanPen_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPrdPreAct_To)==0) ? "" : GXutil.str( AV54TFPrdPreAct_To, 14, 5))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdAox_To)==0) ? "" : GXutil.str( AV66TFPrdAox_To, 6, 2))+"|||||||||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88TFPrdFHS_To)) ? "" : localUtil.dtoc( AV88TFPrdFHS_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV21Session.getValue(AV179Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDNOM", "", !(GXutil.strcmp("", AV29TFPrdNom)==0), (short)(0), AV29TFPrdNom, "", !(GXutil.strcmp("", AV30TFPrdNom_Sel)==0), AV30TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDNUM", "", !(GXutil.strcmp("", AV26TFPrdNum)==0), (short)(0), AV26TFPrdNum, "", !(GXutil.strcmp("", AV27TFPrdNum_Sel)==0), AV27TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDEXIALM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFPrdExiAlm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFPrdExiAlm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV32TFPrdExiAlm, 12, 4)), GXutil.trim( GXutil.str( AV33TFPrdExiAlm_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDCANRES", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdCanRes)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdCanRes_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFPrdCanRes, 12, 4)), GXutil.trim( GXutil.str( AV39TFPrdCanRes_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDDISPONIBLE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV137TFPrdDisponible)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV138TFPrdDisponible_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV137TFPrdDisponible, 12, 4)), GXutil.trim( GXutil.str( AV138TFPrdDisponible_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDCANPEN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFPrdCanPen)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFPrdCanPen_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFPrdCanPen, 12, 4)), GXutil.trim( GXutil.str( AV51TFPrdCanPen_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDPREACT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrdPreAct)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPrdPreAct_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV53TFPrdPreAct, 14, 5)), GXutil.trim( GXutil.str( AV54TFPrdPreAct_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFVALDSC", "", !(GXutil.strcmp("", AV59TFValDsc)==0), (short)(0), AV59TFValDsc, "", !(GXutil.strcmp("", AV60TFValDsc_Sel)==0), AV60TFValDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDREC", "", !(GXutil.strcmp("", AV62TFPrdRec)==0), (short)(0), AV62TFPrdRec, "", !(GXutil.strcmp("", AV63TFPrdRec_Sel)==0), AV63TFPrdRec_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDAOX", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFPrdAox)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdAox_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV65TFPrdAox, 6, 2)), GXutil.trim( GXutil.str( AV66TFPrdAox_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDGOTS", "", !(GXutil.strcmp("", AV135TFPrdGots)==0), (short)(0), AV135TFPrdGots, "", !(GXutil.strcmp("", AV136TFPrdGots_Sel)==0), AV136TFPrdGots_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDREACH", "", !(GXutil.strcmp("", AV68TFPrdReach)==0), (short)(0), AV68TFPrdReach, "", !(GXutil.strcmp("", AV69TFPrdReach_Sel)==0), AV69TFPrdReach_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDOKOTEX_SEL", "", !(AV124TFPrdOkotex_Sels.size()==0), (short)(0), AV124TFPrdOkotex_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDHM", "", !(GXutil.strcmp("", AV74TFPrdHm)==0), (short)(0), AV74TFPrdHm, "", !(GXutil.strcmp("", AV75TFPrdHm_Sel)==0), AV75TFPrdHm_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDZDHC_SEL", "", !(AV126TFPrdZDHC_Sels.size()==0), (short)(0), AV126TFPrdZDHC_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDLIST_SEL", "", !(AV128TFPrdList_Sels.size()==0), (short)(0), AV128TFPrdList_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDTHELIST", "", !(GXutil.strcmp("", AV81TFPrdTHELIST)==0), (short)(0), AV81TFPrdTHELIST, "", !(GXutil.strcmp("", AV82TFPrdTHELIST_Sel)==0), AV82TFPrdTHELIST_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDHS", "", !(GXutil.strcmp("", AV84TFPrdHS)==0), (short)(0), AV84TFPrdHS, "", !(GXutil.strcmp("", AV85TFPrdHS_Sel)==0), AV85TFPrdHS_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDFHS", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87TFPrdFHS))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88TFPrdFHS_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV87TFPrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV88TFPrdFHS_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      GXv_SdtWWPGridState42[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState42, "TFPRDNUM2", "", !(GXutil.strcmp("", AV92TFPrdNum2)==0), (short)(0), AV92TFPrdNum2, "", !(GXutil.strcmp("", AV93TFPrdNum2_Sel)==0), AV93TFPrdNum2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState42[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV179Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV179Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTproduc" );
      AV21Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_VA2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_VA2e( true) ;
      }
      else
      {
         wb_table1_25_VA2e( false) ;
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
      paVA2( ) ;
      wsVA2( ) ;
      weVA2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211613689", true, true);
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
      httpContext.AddJavascriptSource("ttproducww.js", "?20268211613690", false, true);
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

   public void subsflControlProps_382( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_38_idx );
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_38_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_38_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_38_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_38_idx ;
      edtPrdDisponi_Internalname = "PRDDISPONI_"+sGXsfl_38_idx ;
      edtPrdCanPen_Internalname = "PRDCANPEN_"+sGXsfl_38_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_38_idx ;
      edtValDsc_Internalname = "VALDSC_"+sGXsfl_38_idx ;
      edtPrdRec_Internalname = "PRDREC_"+sGXsfl_38_idx ;
      edtPrdAox_Internalname = "PRDAOX_"+sGXsfl_38_idx ;
      edtPrdGots_Internalname = "PRDGOTS_"+sGXsfl_38_idx ;
      edtPrdReach_Internalname = "PRDREACH_"+sGXsfl_38_idx ;
      cmbPrdOkotex.setInternalname( "PRDOKOTEX_"+sGXsfl_38_idx );
      edtPrdHm_Internalname = "PRDHM_"+sGXsfl_38_idx ;
      cmbPrdZDHC.setInternalname( "PRDZDHC_"+sGXsfl_38_idx );
      cmbPrdList.setInternalname( "PRDLIST_"+sGXsfl_38_idx );
      edtPrdTHELIST_Internalname = "PRDTHELIST_"+sGXsfl_38_idx ;
      edtPrdHS_Internalname = "PRDHS_"+sGXsfl_38_idx ;
      edtPrdFHS_Internalname = "PRDFHS_"+sGXsfl_38_idx ;
      edtPrdNum2_Internalname = "PRDNUM2_"+sGXsfl_38_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_38_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_38_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_38_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_38_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_38_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_38_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_38_idx ;
   }

   public void subsflControlProps_fel_382( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_38_fel_idx );
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_38_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_38_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_38_fel_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_38_fel_idx ;
      edtPrdDisponi_Internalname = "PRDDISPONI_"+sGXsfl_38_fel_idx ;
      edtPrdCanPen_Internalname = "PRDCANPEN_"+sGXsfl_38_fel_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_38_fel_idx ;
      edtValDsc_Internalname = "VALDSC_"+sGXsfl_38_fel_idx ;
      edtPrdRec_Internalname = "PRDREC_"+sGXsfl_38_fel_idx ;
      edtPrdAox_Internalname = "PRDAOX_"+sGXsfl_38_fel_idx ;
      edtPrdGots_Internalname = "PRDGOTS_"+sGXsfl_38_fel_idx ;
      edtPrdReach_Internalname = "PRDREACH_"+sGXsfl_38_fel_idx ;
      cmbPrdOkotex.setInternalname( "PRDOKOTEX_"+sGXsfl_38_fel_idx );
      edtPrdHm_Internalname = "PRDHM_"+sGXsfl_38_fel_idx ;
      cmbPrdZDHC.setInternalname( "PRDZDHC_"+sGXsfl_38_fel_idx );
      cmbPrdList.setInternalname( "PRDLIST_"+sGXsfl_38_fel_idx );
      edtPrdTHELIST_Internalname = "PRDTHELIST_"+sGXsfl_38_fel_idx ;
      edtPrdHS_Internalname = "PRDHS_"+sGXsfl_38_fel_idx ;
      edtPrdFHS_Internalname = "PRDFHS_"+sGXsfl_38_fel_idx ;
      edtPrdNum2_Internalname = "PRDNUM2_"+sGXsfl_38_fel_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_38_fel_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_38_fel_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_38_fel_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_38_fel_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_38_fel_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_38_fel_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_38_fel_idx ;
   }

   public void sendrow_382( )
   {
      subsflControlProps_382( ) ;
      wbVA0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_38_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_38_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_38_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 39,'',false,'"+sGXsfl_38_idx+"',38)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_38_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV134GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV134GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV134GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_38_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,39);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV134GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_38_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtPrdNom_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtPrdNom_Forecolor)+";"+((edtPrdNom_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtPrdNom_Backcolor)+";"),ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdExiAlm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCanRes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdDisponi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdDisponi_Internalname,GXutil.ltrim( localUtil.ntoc( A13831PrdDisponi, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13831PrdDisponi, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdDisponi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdDisponi_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCanPen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanPen_Internalname,GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanPen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCanPen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdPreAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtValDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValDsc_Internalname,GXutil.rtrim( A857ValDsc),"","","'"+""+"'"+",false,"+"'"+""+"'",edtValDsc_Link,"","","",edtValDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtValDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdRec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRec_Internalname,GXutil.rtrim( A727PrdRec),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdRec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdAox_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAox_Internalname,GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9733PrdAox, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdAox_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdAox_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdGots_Internalname,GXutil.rtrim( A11363PrdGots),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdGots_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdGots_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdReach_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdReach_Internalname,GXutil.rtrim( A5887PrdReach),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdReach_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdReach_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdOkotex.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdOkotex.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDOKOTEX_" + sGXsfl_38_idx ;
            cmbPrdOkotex.setName( GXCCtl );
            cmbPrdOkotex.setWebtags( "" );
            cmbPrdOkotex.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbPrdOkotex.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            if ( cmbPrdOkotex.getItemCount() > 0 )
            {
               A5888PrdOkotex = cmbPrdOkotex.getValidValue(A5888PrdOkotex) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrdOkotex,cmbPrdOkotex.getInternalname(),GXutil.rtrim( A5888PrdOkotex),Integer.valueOf(1),cmbPrdOkotex.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrdOkotex.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), !bGXsfl_38_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdHm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHm_Internalname,GXutil.rtrim( A11364PrdHm),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdHm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdHm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdZDHC.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdZDHC.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDZDHC_" + sGXsfl_38_idx ;
            cmbPrdZDHC.setName( GXCCtl );
            cmbPrdZDHC.setWebtags( "" );
            cmbPrdZDHC.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbPrdZDHC.addItem("1", httpContext.getMessage( "Nivel 1", ""), (short)(0));
            cmbPrdZDHC.addItem("2", httpContext.getMessage( "Nivel 2", ""), (short)(0));
            cmbPrdZDHC.addItem("3", httpContext.getMessage( "Nivel 3", ""), (short)(0));
            if ( cmbPrdZDHC.getItemCount() > 0 )
            {
               A13301PrdZDHC = cmbPrdZDHC.getValidValue(A13301PrdZDHC) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrdZDHC,cmbPrdZDHC.getInternalname(),GXutil.rtrim( A13301PrdZDHC),Integer.valueOf(1),cmbPrdZDHC.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrdZDHC.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrdZDHC.setValue( GXutil.rtrim( A13301PrdZDHC) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdZDHC.getInternalname(), "Values", cmbPrdZDHC.ToJavascriptSource(), !bGXsfl_38_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdList.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdList.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDLIST_" + sGXsfl_38_idx ;
            cmbPrdList.setName( GXCCtl );
            cmbPrdList.setWebtags( "" );
            cmbPrdList.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            cmbPrdList.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            if ( cmbPrdList.getItemCount() > 0 )
            {
               A11687PrdList = cmbPrdList.getValidValue(A11687PrdList) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrdList,cmbPrdList.getInternalname(),GXutil.rtrim( A11687PrdList),Integer.valueOf(1),cmbPrdList.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrdList.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), !bGXsfl_38_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdTHELIST_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdTHELIST_Internalname,GXutil.rtrim( A13302PrdTHELIST),GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdTHELIST_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdTHELIST_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdHS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHS_Internalname,GXutil.rtrim( A9741PrdHS),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdHS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdHS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdFHS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFHS_Internalname,localUtil.format(A9742PrdFHS, "99/99/99"),localUtil.format( A9742PrdFHS, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFHS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdFHS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum2_Internalname,GXutil.rtrim( A4693PrdNum2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNum2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'',false,'"+sGXsfl_38_idx+"',38)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV121PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV121PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV121PrdRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrdrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrdrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_38_idx+"',38)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV95R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV95R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV95R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_38_idx+"',38)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV96G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV96G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV96G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_38_idx+"',38)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV97B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV97B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV97B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'',false,'"+sGXsfl_38_idx+"',38)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV98R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV98R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV98R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'',false,'"+sGXsfl_38_idx+"',38)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV99G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV99G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV99G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'',false,'"+sGXsfl_38_idx+"',38)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV100B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV100B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV100B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesVA2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_38_idx = ((subGrid_Islastpage==1)&&(nGXsfl_38_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_38_idx+1) ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
      }
      /* End function sendrow_382 */
   }

   public void startgridcontrol38( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"38\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exis Alm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Res", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdDisponi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disponible", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCanPen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Pdte", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtValDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdRec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rec?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAox_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "AOX (adsorbable organic halogens)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Global Organic Textile Standar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdReach_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "REACH", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrdOkotex.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Oeko Tex", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdHm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HM", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrdZDHC.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ZDHC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrdList.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "List by Inditex ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdTHELIST_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "THELIST", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdHS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hoja Segur", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFHS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hoja Segur", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto Aux", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV134GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13831PrdDisponi, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdDisponi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCanPen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A857ValDsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtValDsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtValDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A727PrdRec));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdRec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdAox_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11363PrdGots));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5887PrdReach));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdReach_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5888PrdOkotex));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrdOkotex.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11364PrdHm));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdHm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13301PrdZDHC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrdZDHC.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11687PrdList));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrdList.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13302PrdTHELIST));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdTHELIST_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9741PrdHS));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdHS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A9742PrdFHS, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdFHS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4693PrdNum2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV121PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV95R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV96G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV97B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV98R2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV99G2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV100B2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtPrdDisponi_Internalname = "PRDDISPONI" ;
      edtPrdCanPen_Internalname = "PRDCANPEN" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtValDsc_Internalname = "VALDSC" ;
      edtPrdRec_Internalname = "PRDREC" ;
      edtPrdAox_Internalname = "PRDAOX" ;
      edtPrdGots_Internalname = "PRDGOTS" ;
      edtPrdReach_Internalname = "PRDREACH" ;
      cmbPrdOkotex.setInternalname( "PRDOKOTEX" );
      edtPrdHm_Internalname = "PRDHM" ;
      cmbPrdZDHC.setInternalname( "PRDZDHC" );
      cmbPrdList.setInternalname( "PRDLIST" );
      edtPrdTHELIST_Internalname = "PRDTHELIST" ;
      edtPrdHS_Internalname = "PRDHS" ;
      edtPrdFHS_Internalname = "PRDFHS" ;
      edtPrdNum2_Internalname = "PRDNUM2" ;
      edtavPrdrgb_Internalname = "vPRDRGB" ;
      edtavR_Internalname = "vR" ;
      edtavG_Internalname = "vG" ;
      edtavB_Internalname = "vB" ;
      edtavR2_Internalname = "vR2" ;
      edtavG2_Internalname = "vG2" ;
      edtavB2_Internalname = "vB2" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_prdfhsauxdate_Internalname = "vDDO_PRDFHSAUXDATE" ;
      edtavDdo_prdfhsauxdateto_Internalname = "vDDO_PRDFHSAUXDATETO" ;
      divDdo_prdfhsauxdates_Internalname = "DDO_PRDFHSAUXDATES" ;
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
      edtavB2_Jsonclick = "" ;
      edtavB2_Visible = 0 ;
      edtavB2_Enabled = 1 ;
      edtavG2_Jsonclick = "" ;
      edtavG2_Visible = 0 ;
      edtavG2_Enabled = 1 ;
      edtavR2_Jsonclick = "" ;
      edtavR2_Visible = 0 ;
      edtavR2_Enabled = 1 ;
      edtavB_Jsonclick = "" ;
      edtavB_Visible = 0 ;
      edtavB_Enabled = 1 ;
      edtavG_Jsonclick = "" ;
      edtavG_Visible = 0 ;
      edtavG_Enabled = 1 ;
      edtavR_Jsonclick = "" ;
      edtavR_Visible = 0 ;
      edtavR_Enabled = 1 ;
      edtavPrdrgb_Jsonclick = "" ;
      edtavPrdrgb_Visible = 0 ;
      edtavPrdrgb_Enabled = 1 ;
      edtPrdNum2_Jsonclick = "" ;
      edtPrdFHS_Jsonclick = "" ;
      edtPrdHS_Jsonclick = "" ;
      edtPrdTHELIST_Jsonclick = "" ;
      cmbPrdList.setJsonclick( "" );
      cmbPrdZDHC.setJsonclick( "" );
      edtPrdHm_Jsonclick = "" ;
      cmbPrdOkotex.setJsonclick( "" );
      edtPrdReach_Jsonclick = "" ;
      edtPrdGots_Jsonclick = "" ;
      edtPrdAox_Jsonclick = "" ;
      edtPrdRec_Jsonclick = "" ;
      edtValDsc_Jsonclick = "" ;
      edtValDsc_Link = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdDisponi_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Forecolor = (int)(0x000000) ;
      edtPrdNom_Backcolor = -1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      cmbavGridactions.setVisible( -1 );
      edtPrdNum2_Visible = -1 ;
      edtPrdFHS_Visible = -1 ;
      edtPrdHS_Visible = -1 ;
      edtPrdTHELIST_Visible = -1 ;
      cmbPrdList.setVisible( -1 );
      cmbPrdZDHC.setVisible( -1 );
      edtPrdHm_Visible = -1 ;
      cmbPrdOkotex.setVisible( -1 );
      edtPrdReach_Visible = -1 ;
      edtPrdGots_Visible = -1 ;
      edtPrdAox_Visible = -1 ;
      edtPrdRec_Visible = -1 ;
      edtValDsc_Visible = -1 ;
      edtPrdPreAct_Visible = -1 ;
      edtPrdCanPen_Visible = -1 ;
      edtPrdDisponi_Visible = -1 ;
      edtPrdCanRes_Visible = -1 ;
      edtPrdExiAlm_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_prdfhsauxdateto_Jsonclick = "" ;
      edtavDdo_prdfhsauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "TTproducWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||N:N,S:S||N:N,1:Nivel 1,2:Nivel 2,3:Nivel 3|S:S,N:N||||" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||T||T|T||||" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||||||Dynamic|Dynamic||Dynamic|Dynamic|FixedValues|Dynamic|FixedValues|FixedValues|Dynamic|Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T||||||T|T||T|T|T|T|T|T|T|T||T" ;
      Ddo_grid_Filterisrange = "||T|T|T|T|T|||T|||||||||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Character|Numeric|Character|Character||Character|||Character|Character|Date|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T||T|||T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|||||||||T|||||||||" ;
      Ddo_grid_Columnssortvalues = "2|1|||||||||3|||||||||" ;
      Ddo_grid_Columnids = "1:PrdNom|2:PrdNum|3:PrdExiAlm|4:PrdCanRes|5:PrdDisponible|6:PrdCanPen|7:PrdPreAct|8:ValDsc|9:PrdRec|10:PrdAox|11:PrdGots|12:PrdReach|13:PrdOkotex|14:PrdHm|15:PrdZDHC|16:PrdList|17:PrdTHELIST|18:PrdHS|19:PrdFHS|20:PrdNum2" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento de Productos Quimicos", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_38_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV134GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV134GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134GridActions), 4, 0));
      }
      GXCCtl = "PRDOKOTEX_" + sGXsfl_38_idx ;
      cmbPrdOkotex.setName( GXCCtl );
      cmbPrdOkotex.setWebtags( "" );
      cmbPrdOkotex.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdOkotex.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
         A5888PrdOkotex = cmbPrdOkotex.getValidValue(A5888PrdOkotex) ;
      }
      GXCCtl = "PRDZDHC_" + sGXsfl_38_idx ;
      cmbPrdZDHC.setName( GXCCtl );
      cmbPrdZDHC.setWebtags( "" );
      cmbPrdZDHC.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdZDHC.addItem("1", httpContext.getMessage( "Nivel 1", ""), (short)(0));
      cmbPrdZDHC.addItem("2", httpContext.getMessage( "Nivel 2", ""), (short)(0));
      cmbPrdZDHC.addItem("3", httpContext.getMessage( "Nivel 3", ""), (short)(0));
      if ( cmbPrdZDHC.getItemCount() > 0 )
      {
         A13301PrdZDHC = cmbPrdZDHC.getValidValue(A13301PrdZDHC) ;
      }
      GXCCtl = "PRDLIST_" + sGXsfl_38_idx ;
      cmbPrdList.setName( GXCCtl );
      cmbPrdList.setWebtags( "" );
      cmbPrdList.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbPrdList.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbPrdList.getItemCount() > 0 )
      {
         A11687PrdList = cmbPrdList.getValidValue(A11687PrdList) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV141Sirgb',fld:'vSIRGB',pic:'9999999.99',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12VA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV141Sirgb',fld:'vSIRGB',pic:'9999999.99',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13VA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV141Sirgb',fld:'vSIRGB',pic:'9999999.99',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14VA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV141Sirgb',fld:'vSIRGB',pic:'9999999.99',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV127TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV125TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV123TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21VA2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV141Sirgb',fld:'vSIRGB',pic:'9999999.99',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV134GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtValDsc_Link',ctrl:'VALDSC',prop:'Link'},{av:'AV121PrdRGB',fld:'vPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV100B2',fld:'vB2',pic:'ZZ9'},{av:'AV99G2',fld:'vG2',pic:'ZZ9'},{av:'AV98R2',fld:'vR2',pic:'ZZ9'},{av:'AV97B',fld:'vB',pic:'ZZ9'},{av:'AV96G',fld:'vG',pic:'ZZ9'},{av:'AV95R',fld:'vR',pic:'ZZ9'},{av:'edtPrdNom_Backcolor',ctrl:'PRDNOM',prop:'Backcolor'},{av:'edtPrdNom_Forecolor',ctrl:'PRDNOM',prop:'Forecolor'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15VA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV141Sirgb',fld:'vSIRGB',pic:'9999999.99',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11VA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV141Sirgb',fld:'vSIRGB',pic:'9999999.99',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV123TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV125TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV127TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV127TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV125TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV123TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e22VA2',iparms:[{av:'cmbavGridactions'},{av:'AV134GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV141Sirgb',fld:'vSIRGB',pic:'9999999.99',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV134GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16VA2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17VA2',iparms:[{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV123TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV125TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV127TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV141Sirgb',fld:'vSIRGB',pic:'9999999.99',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV127TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV125TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV123TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18VA2',iparms:[{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV123TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV125TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV127TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV33TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV137TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV138TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV54TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV59TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV60TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV62TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV63TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV65TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV66TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV135TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV136TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV68TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV69TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV124TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV74TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV75TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV126TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV128TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV81TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV82TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV84TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV85TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV87TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV88TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV92TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV93TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV179Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV141Sirgb',fld:'vSIRGB',pic:'9999999.99',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV127TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV125TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV123TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDCANRES","{handler:'valid_Prdcanres',iparms:[]");
      setEventMetadata("VALID_PRDCANRES",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_B2',iparms:[]");
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
      A396EmprCod = "" ;
      AV19ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV29TFPrdNom = "" ;
      AV30TFPrdNom_Sel = "" ;
      AV26TFPrdNum = "" ;
      AV27TFPrdNum_Sel = "" ;
      AV32TFPrdExiAlm = DecimalUtil.ZERO ;
      AV33TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV38TFPrdCanRes = DecimalUtil.ZERO ;
      AV39TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV137TFPrdDisponible = DecimalUtil.ZERO ;
      AV138TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV50TFPrdCanPen = DecimalUtil.ZERO ;
      AV51TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV53TFPrdPreAct = DecimalUtil.ZERO ;
      AV54TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV59TFValDsc = "" ;
      AV60TFValDsc_Sel = "" ;
      AV62TFPrdRec = "" ;
      AV63TFPrdRec_Sel = "" ;
      AV65TFPrdAox = DecimalUtil.ZERO ;
      AV66TFPrdAox_To = DecimalUtil.ZERO ;
      AV135TFPrdGots = "" ;
      AV136TFPrdGots_Sel = "" ;
      AV68TFPrdReach = "" ;
      AV69TFPrdReach_Sel = "" ;
      AV124TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV74TFPrdHm = "" ;
      AV75TFPrdHm_Sel = "" ;
      AV126TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV128TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV81TFPrdTHELIST = "" ;
      AV82TFPrdTHELIST_Sel = "" ;
      AV84TFPrdHS = "" ;
      AV85TFPrdHS_Sel = "" ;
      AV87TFPrdFHS = GXutil.nullDate() ;
      AV88TFPrdFHS_To = GXutil.nullDate() ;
      AV92TFPrdNum2 = "" ;
      AV93TFPrdNum2_Sel = "" ;
      AV179Pgmname = "" ;
      AV141Sirgb = DecimalUtil.ZERO ;
      Gx_mode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV41DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV123TFPrdOkotex_SelsJson = "" ;
      AV125TFPrdZDHC_SelsJson = "" ;
      AV127TFPrdList_SelsJson = "" ;
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV89DDO_PrdFHSAuxDate = GXutil.nullDate() ;
      AV90DDO_PrdFHSAuxDateTo = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A727PrdRec = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11364PrdHm = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A13302PrdTHELIST = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A4693PrdNum2 = "" ;
      AV166Ttproducwwds_25_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV169Ttproducwwds_28_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV170Ttproducwwds_29_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV142Ttproducwwds_1_tfprdnom = "" ;
      lV144Ttproducwwds_3_tfprdnum = "" ;
      lV156Ttproducwwds_15_tfvaldsc = "" ;
      lV158Ttproducwwds_17_tfprdrec = "" ;
      lV162Ttproducwwds_21_tfprdgots = "" ;
      lV164Ttproducwwds_23_tfprdreach = "" ;
      lV167Ttproducwwds_26_tfprdhm = "" ;
      lV171Ttproducwwds_30_tfprdthelist = "" ;
      lV173Ttproducwwds_32_tfprdhs = "" ;
      lV177Ttproducwwds_36_tfprdnum2 = "" ;
      AV143Ttproducwwds_2_tfprdnom_sel = "" ;
      AV142Ttproducwwds_1_tfprdnom = "" ;
      AV145Ttproducwwds_4_tfprdnum_sel = "" ;
      AV144Ttproducwwds_3_tfprdnum = "" ;
      AV146Ttproducwwds_5_tfprdexialm = DecimalUtil.ZERO ;
      AV147Ttproducwwds_6_tfprdexialm_to = DecimalUtil.ZERO ;
      AV148Ttproducwwds_7_tfprdcanres = DecimalUtil.ZERO ;
      AV149Ttproducwwds_8_tfprdcanres_to = DecimalUtil.ZERO ;
      AV150Ttproducwwds_9_tfprddisponible = DecimalUtil.ZERO ;
      AV151Ttproducwwds_10_tfprddisponible_to = DecimalUtil.ZERO ;
      AV152Ttproducwwds_11_tfprdcanpen = DecimalUtil.ZERO ;
      AV153Ttproducwwds_12_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV154Ttproducwwds_13_tfprdpreact = DecimalUtil.ZERO ;
      AV155Ttproducwwds_14_tfprdpreact_to = DecimalUtil.ZERO ;
      AV157Ttproducwwds_16_tfvaldsc_sel = "" ;
      AV156Ttproducwwds_15_tfvaldsc = "" ;
      AV159Ttproducwwds_18_tfprdrec_sel = "" ;
      AV158Ttproducwwds_17_tfprdrec = "" ;
      AV160Ttproducwwds_19_tfprdaox = DecimalUtil.ZERO ;
      AV161Ttproducwwds_20_tfprdaox_to = DecimalUtil.ZERO ;
      AV163Ttproducwwds_22_tfprdgots_sel = "" ;
      AV162Ttproducwwds_21_tfprdgots = "" ;
      AV165Ttproducwwds_24_tfprdreach_sel = "" ;
      AV164Ttproducwwds_23_tfprdreach = "" ;
      AV168Ttproducwwds_27_tfprdhm_sel = "" ;
      AV167Ttproducwwds_26_tfprdhm = "" ;
      AV172Ttproducwwds_31_tfprdthelist_sel = "" ;
      AV171Ttproducwwds_30_tfprdthelist = "" ;
      AV174Ttproducwwds_33_tfprdhs_sel = "" ;
      AV173Ttproducwwds_32_tfprdhs = "" ;
      AV175Ttproducwwds_34_tfprdfhs = GXutil.nullDate() ;
      AV176Ttproducwwds_35_tfprdfhs_to = GXutil.nullDate() ;
      AV178Ttproducwwds_37_tfprdnum2_sel = "" ;
      AV177Ttproducwwds_36_tfprdnum2 = "" ;
      H00VA2_A396EmprCod = new String[] {""} ;
      H00VA2_A856ValCod = new byte[1] ;
      H00VA2_A13232PrdRGB = new long[1] ;
      H00VA2_A4693PrdNum2 = new String[] {""} ;
      H00VA2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H00VA2_A9741PrdHS = new String[] {""} ;
      H00VA2_A13302PrdTHELIST = new String[] {""} ;
      H00VA2_n13302PrdTHELIST = new boolean[] {false} ;
      H00VA2_A11687PrdList = new String[] {""} ;
      H00VA2_A13301PrdZDHC = new String[] {""} ;
      H00VA2_A11364PrdHm = new String[] {""} ;
      H00VA2_A5888PrdOkotex = new String[] {""} ;
      H00VA2_A5887PrdReach = new String[] {""} ;
      H00VA2_A11363PrdGots = new String[] {""} ;
      H00VA2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VA2_A727PrdRec = new String[] {""} ;
      H00VA2_A857ValDsc = new String[] {""} ;
      H00VA2_n857ValDsc = new boolean[] {false} ;
      H00VA2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VA2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VA2_A719PrdNum = new String[] {""} ;
      H00VA2_A718PrdNom = new String[] {""} ;
      H00VA2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VA2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00VA3_AGRID_nRecordCount = new long[1] ;
      AV101Station = "" ;
      AV102EmprNom = "" ;
      AV103UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV17ColumnsSelectorXML = "" ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV23ManageFiltersXml = "" ;
      AV15ExcelFilename = "" ;
      AV16ErrorMessage = "" ;
      AV18UserCustomValue = "" ;
      AV20ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector17 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char40 = "" ;
      GXv_char41 = new String[1] ;
      GXt_char38 = "" ;
      GXv_char39 = new String[1] ;
      GXt_char36 = "" ;
      GXv_char37 = new String[1] ;
      GXt_char34 = "" ;
      GXv_char35 = new String[1] ;
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
      GXv_SdtWWPGridState42 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttproducww__default(),
         new Object[] {
             new Object[] {
            H00VA2_A396EmprCod, H00VA2_A856ValCod, H00VA2_A13232PrdRGB, H00VA2_A4693PrdNum2, H00VA2_A9742PrdFHS, H00VA2_A9741PrdHS, H00VA2_A13302PrdTHELIST, H00VA2_n13302PrdTHELIST, H00VA2_A11687PrdList, H00VA2_A13301PrdZDHC,
            H00VA2_A11364PrdHm, H00VA2_A5888PrdOkotex, H00VA2_A5887PrdReach, H00VA2_A11363PrdGots, H00VA2_A9733PrdAox, H00VA2_A727PrdRec, H00VA2_A857ValDsc, H00VA2_n857ValDsc, H00VA2_A724PrdPreAct, H00VA2_A684PrdCanPen,
            H00VA2_A719PrdNum, H00VA2_A718PrdNom, H00VA2_A685PrdCanRes, H00VA2_A704PrdExiAlm
            }
            , new Object[] {
            H00VA3_AGRID_nRecordCount
            }
         }
      );
      AV179Pgmname = "TTproducWW" ;
      /* GeneXus formulas. */
      AV179Pgmname = "TTproducWW" ;
      Gx_err = (short)(0) ;
      edtavPrdrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV24ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A856ValCod ;
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
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV134GridActions ;
   private short AV95R ;
   private short AV96G ;
   private short AV97B ;
   private short AV98R2 ;
   private short AV99G2 ;
   private short AV100B2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV131CnoEnc ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short GXv_int13[] ;
   private short GXv_int14[] ;
   private short GXv_int15[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_38 ;
   private int nGXsfl_38_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int subGrid_Islastpage ;
   private int edtavPrdrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavR2_Enabled ;
   private int edtavG2_Enabled ;
   private int edtavB2_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV166Ttproducwwds_25_tfprdokotex_sels_size ;
   private int AV169Ttproducwwds_28_tfprdzdhc_sels_size ;
   private int AV170Ttproducwwds_29_tfprdlist_sels_size ;
   private int edtPrdNom_Visible ;
   private int edtPrdNum_Visible ;
   private int edtPrdExiAlm_Visible ;
   private int edtPrdCanRes_Visible ;
   private int edtPrdDisponi_Visible ;
   private int edtPrdCanPen_Visible ;
   private int edtPrdPreAct_Visible ;
   private int edtValDsc_Visible ;
   private int edtPrdRec_Visible ;
   private int edtPrdAox_Visible ;
   private int edtPrdGots_Visible ;
   private int edtPrdReach_Visible ;
   private int edtPrdHm_Visible ;
   private int edtPrdTHELIST_Visible ;
   private int edtPrdHS_Visible ;
   private int edtPrdFHS_Visible ;
   private int edtPrdNum2_Visible ;
   private int AV42PageToGo ;
   private int edtPrdNom_Backcolor ;
   private int edtPrdNom_Forecolor ;
   private int AV181GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavPrdrgb_Visible ;
   private int edtavR_Visible ;
   private int edtavG_Visible ;
   private int edtavB_Visible ;
   private int edtavR2_Visible ;
   private int edtavG2_Visible ;
   private int edtavB2_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV43GridCurrentPage ;
   private long AV44GridPageCount ;
   private long A13232PrdRGB ;
   private long AV121PrdRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV32TFPrdExiAlm ;
   private java.math.BigDecimal AV33TFPrdExiAlm_To ;
   private java.math.BigDecimal AV38TFPrdCanRes ;
   private java.math.BigDecimal AV39TFPrdCanRes_To ;
   private java.math.BigDecimal AV137TFPrdDisponible ;
   private java.math.BigDecimal AV138TFPrdDisponible_To ;
   private java.math.BigDecimal AV50TFPrdCanPen ;
   private java.math.BigDecimal AV51TFPrdCanPen_To ;
   private java.math.BigDecimal AV53TFPrdPreAct ;
   private java.math.BigDecimal AV54TFPrdPreAct_To ;
   private java.math.BigDecimal AV65TFPrdAox ;
   private java.math.BigDecimal AV66TFPrdAox_To ;
   private java.math.BigDecimal AV141Sirgb ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV146Ttproducwwds_5_tfprdexialm ;
   private java.math.BigDecimal AV147Ttproducwwds_6_tfprdexialm_to ;
   private java.math.BigDecimal AV148Ttproducwwds_7_tfprdcanres ;
   private java.math.BigDecimal AV149Ttproducwwds_8_tfprdcanres_to ;
   private java.math.BigDecimal AV150Ttproducwwds_9_tfprddisponible ;
   private java.math.BigDecimal AV151Ttproducwwds_10_tfprddisponible_to ;
   private java.math.BigDecimal AV152Ttproducwwds_11_tfprdcanpen ;
   private java.math.BigDecimal AV153Ttproducwwds_12_tfprdcanpen_to ;
   private java.math.BigDecimal AV154Ttproducwwds_13_tfprdpreact ;
   private java.math.BigDecimal AV155Ttproducwwds_14_tfprdpreact_to ;
   private java.math.BigDecimal AV160Ttproducwwds_19_tfprdaox ;
   private java.math.BigDecimal AV161Ttproducwwds_20_tfprdaox_to ;
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
   private String sGXsfl_38_idx="0001" ;
   private String A396EmprCod ;
   private String AV29TFPrdNom ;
   private String AV30TFPrdNom_Sel ;
   private String AV26TFPrdNum ;
   private String AV27TFPrdNum_Sel ;
   private String AV59TFValDsc ;
   private String AV60TFValDsc_Sel ;
   private String AV62TFPrdRec ;
   private String AV63TFPrdRec_Sel ;
   private String AV135TFPrdGots ;
   private String AV136TFPrdGots_Sel ;
   private String AV68TFPrdReach ;
   private String AV69TFPrdReach_Sel ;
   private String AV74TFPrdHm ;
   private String AV75TFPrdHm_Sel ;
   private String AV81TFPrdTHELIST ;
   private String AV82TFPrdTHELIST_Sel ;
   private String AV84TFPrdHS ;
   private String AV85TFPrdHS_Sel ;
   private String AV92TFPrdNum2 ;
   private String AV93TFPrdNum2_Sel ;
   private String AV179Pgmname ;
   private String Gx_mode ;
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
   private String divDdo_prdfhsauxdates_Internalname ;
   private String edtavDdo_prdfhsauxdate_Internalname ;
   private String edtavDdo_prdfhsauxdate_Jsonclick ;
   private String edtavDdo_prdfhsauxdateto_Internalname ;
   private String edtavDdo_prdfhsauxdateto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdDisponi_Internalname ;
   private String edtPrdCanPen_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String A857ValDsc ;
   private String edtValDsc_Internalname ;
   private String A727PrdRec ;
   private String edtPrdRec_Internalname ;
   private String edtPrdAox_Internalname ;
   private String A11363PrdGots ;
   private String edtPrdGots_Internalname ;
   private String A5887PrdReach ;
   private String edtPrdReach_Internalname ;
   private String A5888PrdOkotex ;
   private String A11364PrdHm ;
   private String edtPrdHm_Internalname ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A13302PrdTHELIST ;
   private String edtPrdTHELIST_Internalname ;
   private String A9741PrdHS ;
   private String edtPrdHS_Internalname ;
   private String edtPrdFHS_Internalname ;
   private String A4693PrdNum2 ;
   private String edtPrdNum2_Internalname ;
   private String edtavPrdrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavR2_Internalname ;
   private String edtavG2_Internalname ;
   private String edtavB2_Internalname ;
   private String scmdbuf ;
   private String lV142Ttproducwwds_1_tfprdnom ;
   private String lV144Ttproducwwds_3_tfprdnum ;
   private String lV156Ttproducwwds_15_tfvaldsc ;
   private String lV158Ttproducwwds_17_tfprdrec ;
   private String lV162Ttproducwwds_21_tfprdgots ;
   private String lV164Ttproducwwds_23_tfprdreach ;
   private String lV167Ttproducwwds_26_tfprdhm ;
   private String lV171Ttproducwwds_30_tfprdthelist ;
   private String lV173Ttproducwwds_32_tfprdhs ;
   private String lV177Ttproducwwds_36_tfprdnum2 ;
   private String AV143Ttproducwwds_2_tfprdnom_sel ;
   private String AV142Ttproducwwds_1_tfprdnom ;
   private String AV145Ttproducwwds_4_tfprdnum_sel ;
   private String AV144Ttproducwwds_3_tfprdnum ;
   private String AV157Ttproducwwds_16_tfvaldsc_sel ;
   private String AV156Ttproducwwds_15_tfvaldsc ;
   private String AV159Ttproducwwds_18_tfprdrec_sel ;
   private String AV158Ttproducwwds_17_tfprdrec ;
   private String AV163Ttproducwwds_22_tfprdgots_sel ;
   private String AV162Ttproducwwds_21_tfprdgots ;
   private String AV165Ttproducwwds_24_tfprdreach_sel ;
   private String AV164Ttproducwwds_23_tfprdreach ;
   private String AV168Ttproducwwds_27_tfprdhm_sel ;
   private String AV167Ttproducwwds_26_tfprdhm ;
   private String AV172Ttproducwwds_31_tfprdthelist_sel ;
   private String AV171Ttproducwwds_30_tfprdthelist ;
   private String AV174Ttproducwwds_33_tfprdhs_sel ;
   private String AV173Ttproducwwds_32_tfprdhs ;
   private String AV178Ttproducwwds_37_tfprdnum2_sel ;
   private String AV177Ttproducwwds_36_tfprdnum2 ;
   private String AV101Station ;
   private String AV102EmprNom ;
   private String AV103UsurCod ;
   private String edtValDsc_Link ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char20 ;
   private String GXv_char3[] ;
   private String GXt_char21 ;
   private String GXv_char2[] ;
   private String GXt_char40 ;
   private String GXv_char41[] ;
   private String GXt_char38 ;
   private String GXv_char39[] ;
   private String GXt_char36 ;
   private String GXv_char37[] ;
   private String GXt_char34 ;
   private String GXv_char35[] ;
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
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String sGXsfl_38_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdDisponi_Jsonclick ;
   private String edtPrdCanPen_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtValDsc_Jsonclick ;
   private String edtPrdRec_Jsonclick ;
   private String edtPrdAox_Jsonclick ;
   private String edtPrdGots_Jsonclick ;
   private String edtPrdReach_Jsonclick ;
   private String edtPrdHm_Jsonclick ;
   private String edtPrdTHELIST_Jsonclick ;
   private String edtPrdHS_Jsonclick ;
   private String edtPrdFHS_Jsonclick ;
   private String edtPrdNum2_Jsonclick ;
   private String edtavPrdrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavR2_Jsonclick ;
   private String edtavG2_Jsonclick ;
   private String edtavB2_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV87TFPrdFHS ;
   private java.util.Date AV88TFPrdFHS_To ;
   private java.util.Date AV89DDO_PrdFHSAuxDate ;
   private java.util.Date AV90DDO_PrdFHSAuxDateTo ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV175Ttproducwwds_34_tfprdfhs ;
   private java.util.Date AV176Ttproducwwds_35_tfprdfhs_to ;
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
   private boolean n857ValDsc ;
   private boolean n13302PrdTHELIST ;
   private boolean bGXsfl_38_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV123TFPrdOkotex_SelsJson ;
   private String AV125TFPrdZDHC_SelsJson ;
   private String AV127TFPrdList_SelsJson ;
   private String AV17ColumnsSelectorXML ;
   private String AV23ManageFiltersXml ;
   private String AV18UserCustomValue ;
   private String AV15ExcelFilename ;
   private String AV16ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private GXSimpleCollection<String> AV166Ttproducwwds_25_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV169Ttproducwwds_28_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV170Ttproducwwds_29_tfprdlist_sels ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbPrdOkotex ;
   private HTMLChoice cmbPrdZDHC ;
   private HTMLChoice cmbPrdList ;
   private IDataStoreProvider pr_default ;
   private String[] H00VA2_A396EmprCod ;
   private byte[] H00VA2_A856ValCod ;
   private long[] H00VA2_A13232PrdRGB ;
   private String[] H00VA2_A4693PrdNum2 ;
   private java.util.Date[] H00VA2_A9742PrdFHS ;
   private String[] H00VA2_A9741PrdHS ;
   private String[] H00VA2_A13302PrdTHELIST ;
   private boolean[] H00VA2_n13302PrdTHELIST ;
   private String[] H00VA2_A11687PrdList ;
   private String[] H00VA2_A13301PrdZDHC ;
   private String[] H00VA2_A11364PrdHm ;
   private String[] H00VA2_A5888PrdOkotex ;
   private String[] H00VA2_A5887PrdReach ;
   private String[] H00VA2_A11363PrdGots ;
   private java.math.BigDecimal[] H00VA2_A9733PrdAox ;
   private String[] H00VA2_A727PrdRec ;
   private String[] H00VA2_A857ValDsc ;
   private boolean[] H00VA2_n857ValDsc ;
   private java.math.BigDecimal[] H00VA2_A724PrdPreAct ;
   private java.math.BigDecimal[] H00VA2_A684PrdCanPen ;
   private String[] H00VA2_A719PrdNum ;
   private String[] H00VA2_A718PrdNom ;
   private java.math.BigDecimal[] H00VA2_A685PrdCanRes ;
   private java.math.BigDecimal[] H00VA2_A704PrdExiAlm ;
   private long[] H00VA3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV124TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV126TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV128TFPrdList_Sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV22ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState42[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV41DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class ttproducww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00VA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV166Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV169Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV170Ttproducwwds_29_tfprdlist_sels ,
                                          String AV143Ttproducwwds_2_tfprdnom_sel ,
                                          String AV142Ttproducwwds_1_tfprdnom ,
                                          String AV145Ttproducwwds_4_tfprdnum_sel ,
                                          String AV144Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV146Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV147Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV148Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV149Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV150Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV151Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV152Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV153Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV154Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV155Ttproducwwds_14_tfprdpreact_to ,
                                          String AV157Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV156Ttproducwwds_15_tfvaldsc ,
                                          String AV159Ttproducwwds_18_tfprdrec_sel ,
                                          String AV158Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV160Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV161Ttproducwwds_20_tfprdaox_to ,
                                          String AV163Ttproducwwds_22_tfprdgots_sel ,
                                          String AV162Ttproducwwds_21_tfprdgots ,
                                          String AV165Ttproducwwds_24_tfprdreach_sel ,
                                          String AV164Ttproducwwds_23_tfprdreach ,
                                          int AV166Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV168Ttproducwwds_27_tfprdhm_sel ,
                                          String AV167Ttproducwwds_26_tfprdhm ,
                                          int AV169Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV170Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV172Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV171Ttproducwwds_30_tfprdthelist ,
                                          String AV174Ttproducwwds_33_tfprdhs_sel ,
                                          String AV173Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV175Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV176Ttproducwwds_35_tfprdfhs_to ,
                                          String AV178Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV177Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int43 = new byte[40];
      Object[] GXv_Object44 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.ValCod, T1.PrdRGB, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox," ;
      sSelectString += " T1.PrdRec, T2.ValDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdNum, T1.PrdNom, T1.PrdCanRes, T1.PrdExiAlm" ;
      sFromString = " FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV143Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int43[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV144Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int43[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int43[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int43[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int43[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int43[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int43[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int43[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int43[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int43[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV154Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int43[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int43[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV156Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int43[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV158Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int43[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV160Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int43[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV161Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int43[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV162Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int43[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV164Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int43[24] = (byte)(1) ;
      }
      if ( AV166Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV166Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV168Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV167Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int43[26] = (byte)(1) ;
      }
      if ( AV169Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV169Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV170Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV170Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV172Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV171Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int43[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV173Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int43[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV175Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int43[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV176Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int43[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV177Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int43[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int43[34] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object44[0] = scmdbuf ;
      GXv_Object44[1] = GXv_int43 ;
      return GXv_Object44 ;
   }

   protected Object[] conditional_H00VA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV166Ttproducwwds_25_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV169Ttproducwwds_28_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV170Ttproducwwds_29_tfprdlist_sels ,
                                          String AV143Ttproducwwds_2_tfprdnom_sel ,
                                          String AV142Ttproducwwds_1_tfprdnom ,
                                          String AV145Ttproducwwds_4_tfprdnum_sel ,
                                          String AV144Ttproducwwds_3_tfprdnum ,
                                          java.math.BigDecimal AV146Ttproducwwds_5_tfprdexialm ,
                                          java.math.BigDecimal AV147Ttproducwwds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV148Ttproducwwds_7_tfprdcanres ,
                                          java.math.BigDecimal AV149Ttproducwwds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV150Ttproducwwds_9_tfprddisponible ,
                                          java.math.BigDecimal AV151Ttproducwwds_10_tfprddisponible_to ,
                                          java.math.BigDecimal AV152Ttproducwwds_11_tfprdcanpen ,
                                          java.math.BigDecimal AV153Ttproducwwds_12_tfprdcanpen_to ,
                                          java.math.BigDecimal AV154Ttproducwwds_13_tfprdpreact ,
                                          java.math.BigDecimal AV155Ttproducwwds_14_tfprdpreact_to ,
                                          String AV157Ttproducwwds_16_tfvaldsc_sel ,
                                          String AV156Ttproducwwds_15_tfvaldsc ,
                                          String AV159Ttproducwwds_18_tfprdrec_sel ,
                                          String AV158Ttproducwwds_17_tfprdrec ,
                                          java.math.BigDecimal AV160Ttproducwwds_19_tfprdaox ,
                                          java.math.BigDecimal AV161Ttproducwwds_20_tfprdaox_to ,
                                          String AV163Ttproducwwds_22_tfprdgots_sel ,
                                          String AV162Ttproducwwds_21_tfprdgots ,
                                          String AV165Ttproducwwds_24_tfprdreach_sel ,
                                          String AV164Ttproducwwds_23_tfprdreach ,
                                          int AV166Ttproducwwds_25_tfprdokotex_sels_size ,
                                          String AV168Ttproducwwds_27_tfprdhm_sel ,
                                          String AV167Ttproducwwds_26_tfprdhm ,
                                          int AV169Ttproducwwds_28_tfprdzdhc_sels_size ,
                                          int AV170Ttproducwwds_29_tfprdlist_sels_size ,
                                          String AV172Ttproducwwds_31_tfprdthelist_sel ,
                                          String AV171Ttproducwwds_30_tfprdthelist ,
                                          String AV174Ttproducwwds_33_tfprdhs_sel ,
                                          String AV173Ttproducwwds_32_tfprdhs ,
                                          java.util.Date AV175Ttproducwwds_34_tfprdfhs ,
                                          java.util.Date AV176Ttproducwwds_35_tfprdfhs_to ,
                                          String AV178Ttproducwwds_37_tfprdnum2_sel ,
                                          String AV177Ttproducwwds_36_tfprdnum2 ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int46 = new byte[35];
      Object[] GXv_Object47 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV143Ttproducwwds_2_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV142Ttproducwwds_1_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Ttproducwwds_2_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int46[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Ttproducwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV144Ttproducwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Ttproducwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int46[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Ttproducwwds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int46[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Ttproducwwds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int46[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Ttproducwwds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int46[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Ttproducwwds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int46[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Ttproducwwds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int46[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Ttproducwwds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int46[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Ttproducwwds_11_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int46[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Ttproducwwds_12_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int46[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV154Ttproducwwds_13_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int46[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Ttproducwwds_14_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int46[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Ttproducwwds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV156Ttproducwwds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Ttproducwwds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int46[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Ttproducwwds_18_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV158Ttproducwwds_17_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Ttproducwwds_18_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int46[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV160Ttproducwwds_19_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int46[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV161Ttproducwwds_20_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int46[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Ttproducwwds_22_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV162Ttproducwwds_21_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Ttproducwwds_22_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int46[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Ttproducwwds_24_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV164Ttproducwwds_23_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Ttproducwwds_24_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int46[24] = (byte)(1) ;
      }
      if ( AV166Ttproducwwds_25_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV166Ttproducwwds_25_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV168Ttproducwwds_27_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV167Ttproducwwds_26_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Ttproducwwds_27_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int46[26] = (byte)(1) ;
      }
      if ( AV169Ttproducwwds_28_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV169Ttproducwwds_28_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV170Ttproducwwds_29_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV170Ttproducwwds_29_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV172Ttproducwwds_31_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV171Ttproducwwds_30_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Ttproducwwds_31_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int46[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Ttproducwwds_33_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV173Ttproducwwds_32_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Ttproducwwds_33_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int46[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV175Ttproducwwds_34_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int46[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV176Ttproducwwds_35_tfprdfhs_to)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int46[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Ttproducwwds_37_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV177Ttproducwwds_36_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Ttproducwwds_37_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int46[34] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object47[0] = scmdbuf ;
      GXv_Object47[1] = GXv_int46 ;
      return GXv_Object47 ;
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
                  return conditional_H00VA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , ((Boolean) dynConstraints[60]).booleanValue() , (String)dynConstraints[61] );
            case 1 :
                  return conditional_H00VA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , ((Boolean) dynConstraints[60]).booleanValue() , (String)dynConstraints[61] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00VA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00VA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,4);
               ((String[]) buf[20])[0] = rslt.getString(19, 6);
               ((String[]) buf[21])[0] = rslt.getString(20, 26);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,4);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               return;
      }
   }

}

