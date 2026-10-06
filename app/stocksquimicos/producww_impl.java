package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class producww_impl extends GXDataArea
{
   public producww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public producww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( producww_impl.class ));
   }

   public producww_impl( int remoteHandle ,
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
      chkPrdEsCompu = UIFactory.getCheckbox(this);
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV27TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV28TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV29TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV46TFPrdAox = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAox"), ".") ;
      AV47TFPrdAox_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAox_To"), ".") ;
      AV48TFPrdGots = httpContext.GetPar( "TFPrdGots") ;
      AV49TFPrdGots_Sel = httpContext.GetPar( "TFPrdGots_Sel") ;
      AV50TFPrdReach = httpContext.GetPar( "TFPrdReach") ;
      AV51TFPrdReach_Sel = httpContext.GetPar( "TFPrdReach_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV53TFPrdOkotex_Sels);
      AV54TFPrdHm = httpContext.GetPar( "TFPrdHm") ;
      AV55TFPrdHm_Sel = httpContext.GetPar( "TFPrdHm_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV57TFPrdZDHC_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV59TFPrdList_Sels);
      AV60TFPrdTHELIST = httpContext.GetPar( "TFPrdTHELIST") ;
      AV61TFPrdTHELIST_Sel = httpContext.GetPar( "TFPrdTHELIST_Sel") ;
      AV62TFPrdHS = httpContext.GetPar( "TFPrdHS") ;
      AV63TFPrdHS_Sel = httpContext.GetPar( "TFPrdHS_Sel") ;
      AV64TFPrdFHS = localUtil.parseDateParm( httpContext.GetPar( "TFPrdFHS")) ;
      AV71TFPrdEsCompuesto_Sel = (byte)(GXutil.lval( httpContext.GetPar( "TFPrdEsCompuesto_Sel"))) ;
      AV97Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV68ProPrv = (short)(GXutil.lval( httpContext.GetPar( "ProPrv"))) ;
      AV69CnoEnc = (short)(GXutil.lval( httpContext.GetPar( "CnoEnc"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNom, AV27TFPrdNom_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV46TFPrdAox, AV47TFPrdAox_To, AV48TFPrdGots, AV49TFPrdGots_Sel, AV50TFPrdReach, AV51TFPrdReach_Sel, AV53TFPrdOkotex_Sels, AV54TFPrdHm, AV55TFPrdHm_Sel, AV57TFPrdZDHC_Sels, AV59TFPrdList_Sels, AV60TFPrdTHELIST, AV61TFPrdTHELIST_Sel, AV62TFPrdHS, AV63TFPrdHS_Sel, AV64TFPrdFHS, AV71TFPrdEsCompuesto_Sel, AV97Pgmname, AV12OrderedBy, AV13OrderedDsc, AV68ProPrv, AV69CnoEnc) ;
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
      pa13I2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start13I2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.producww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROPRV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68ProPrv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNOENC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69CnoEnc), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV32GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV33GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV30DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV30DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV26TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV27TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV28TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV29TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDAOX", GXutil.ltrim( localUtil.ntoc( AV46TFPrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDAOX_TO", GXutil.ltrim( localUtil.ntoc( AV47TFPrdAox_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGOTS", GXutil.rtrim( AV48TFPrdGots));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGOTS_SEL", GXutil.rtrim( AV49TFPrdGots_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREACH", GXutil.rtrim( AV50TFPrdReach));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREACH_SEL", GXutil.rtrim( AV51TFPrdReach_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRDOKOTEX_SELS", AV53TFPrdOkotex_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRDOKOTEX_SELS", AV53TFPrdOkotex_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHM", GXutil.rtrim( AV54TFPrdHm));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHM_SEL", GXutil.rtrim( AV55TFPrdHm_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRDZDHC_SELS", AV57TFPrdZDHC_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRDZDHC_SELS", AV57TFPrdZDHC_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRDLIST_SELS", AV59TFPrdList_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRDLIST_SELS", AV59TFPrdList_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDTHELIST", GXutil.rtrim( AV60TFPrdTHELIST));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDTHELIST_SEL", GXutil.rtrim( AV61TFPrdTHELIST_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHS", GXutil.rtrim( AV62TFPrdHS));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHS_SEL", GXutil.rtrim( AV63TFPrdHS_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFHS", localUtil.dtoc( AV64TFPrdFHS, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDESCOMPUESTO_SEL", GXutil.ltrim( localUtil.ntoc( AV71TFPrdEsCompuesto_Sel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV97Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "PRDRGB", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROPRV", GXutil.ltrim( localUtil.ntoc( AV68ProPrv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROPRV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68ProPrv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCNOENC", GXutil.ltrim( localUtil.ntoc( AV69CnoEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNOENC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69CnoEnc), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDOKOTEX_SELSJSON", AV52TFPrdOkotex_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDZDHC_SELSJSON", AV56TFPrdZDHC_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDLIST_SELSJSON", AV58TFPrdList_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
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
         we13I2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt13I2( ) ;
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
      return formatLink("app.stocksquimicos.producww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.PRODUCWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Productos Quimicos", "") ;
   }

   public void wb13I0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_13I2( true) ;
      }
      else
      {
         wb_table1_27_13I2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_13I2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV32GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV33GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0073"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0073"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_45_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0073"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV30DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV30DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_prdfhsauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_prdfhsauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_prdfhsauxdate_Internalname, localUtil.format(AV66DDO_PrdFHSAuxDate, "99/99/99"), localUtil.format( AV66DDO_PrdFHSAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_prdfhsauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PRODUCWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_prdfhsauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PRODUCWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start13I2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Productos Quimicos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup13I0( ) ;
   }

   public void ws13I2( )
   {
      start13I2( ) ;
      evt13I2( ) ;
   }

   public void evt13I2( )
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
                           e1113I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1213I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1313I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1413I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1513I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1613I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1713I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e1813I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e1913I2 ();
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
                           AV70DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV70DetailWebComponent);
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV34GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridActions), 4, 0));
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
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
                           A13881PrdEsCompu = GXutil.strtobool( httpContext.cgiGet( chkPrdEsCompu.getInternalname())) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDRGB");
                              GX_FocusControl = edtavPrdrgb_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV39PrdRGB = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39PrdRGB), 10, 0));
                           }
                           else
                           {
                              AV39PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39PrdRGB), 10, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
                              GX_FocusControl = edtavR_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV40R = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40R), 3, 0));
                           }
                           else
                           {
                              AV40R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40R), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
                              GX_FocusControl = edtavG_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV41G = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41G), 3, 0));
                           }
                           else
                           {
                              AV41G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41G), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
                              GX_FocusControl = edtavB_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV42B = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42B), 3, 0));
                           }
                           else
                           {
                              AV42B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42B), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
                              GX_FocusControl = edtavR2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV43R2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43R2), 3, 0));
                           }
                           else
                           {
                              AV43R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43R2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
                              GX_FocusControl = edtavG2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV44G2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44G2), 3, 0));
                           }
                           else
                           {
                              AV44G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44G2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
                              GX_FocusControl = edtavB2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV45B2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45B2), 3, 0));
                           }
                           else
                           {
                              AV45B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45B2), 3, 0));
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
                                 e2013I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2113I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2213I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2313I2 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 73 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0073") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0073", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we13I2( )
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

   public void pa13I2( )
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
                                 String A396EmprCod ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 String AV26TFPrdNom ,
                                 String AV27TFPrdNom_Sel ,
                                 String AV28TFPrdNum ,
                                 String AV29TFPrdNum_Sel ,
                                 java.math.BigDecimal AV46TFPrdAox ,
                                 java.math.BigDecimal AV47TFPrdAox_To ,
                                 String AV48TFPrdGots ,
                                 String AV49TFPrdGots_Sel ,
                                 String AV50TFPrdReach ,
                                 String AV51TFPrdReach_Sel ,
                                 GXSimpleCollection<String> AV53TFPrdOkotex_Sels ,
                                 String AV54TFPrdHm ,
                                 String AV55TFPrdHm_Sel ,
                                 GXSimpleCollection<String> AV57TFPrdZDHC_Sels ,
                                 GXSimpleCollection<String> AV59TFPrdList_Sels ,
                                 String AV60TFPrdTHELIST ,
                                 String AV61TFPrdTHELIST_Sel ,
                                 String AV62TFPrdHS ,
                                 String AV63TFPrdHS_Sel ,
                                 java.util.Date AV64TFPrdFHS ,
                                 byte AV71TFPrdEsCompuesto_Sel ,
                                 String AV97Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 short AV68ProPrv ,
                                 short AV69CnoEnc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2113I2 ();
      GRID_nCurrentRecord = 0 ;
      rf13I2( ) ;
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
      rf13I2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV97Pgmname = "StocksQuimicos.PRODUCWW" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV75Stocksquimicos_producwwds_1_filterfulltext = AV15FilterFullText ;
      AV76Stocksquimicos_producwwds_2_tfprdnom = AV26TFPrdNom ;
      AV77Stocksquimicos_producwwds_3_tfprdnom_sel = AV27TFPrdNom_Sel ;
      AV78Stocksquimicos_producwwds_4_tfprdnum = AV28TFPrdNum ;
      AV79Stocksquimicos_producwwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV80Stocksquimicos_producwwds_6_tfprdaox = AV46TFPrdAox ;
      AV81Stocksquimicos_producwwds_7_tfprdaox_to = AV47TFPrdAox_To ;
      AV82Stocksquimicos_producwwds_8_tfprdgots = AV48TFPrdGots ;
      AV83Stocksquimicos_producwwds_9_tfprdgots_sel = AV49TFPrdGots_Sel ;
      AV84Stocksquimicos_producwwds_10_tfprdreach = AV50TFPrdReach ;
      AV85Stocksquimicos_producwwds_11_tfprdreach_sel = AV51TFPrdReach_Sel ;
      AV86Stocksquimicos_producwwds_12_tfprdokotex_sels = AV53TFPrdOkotex_Sels ;
      AV87Stocksquimicos_producwwds_13_tfprdhm = AV54TFPrdHm ;
      AV88Stocksquimicos_producwwds_14_tfprdhm_sel = AV55TFPrdHm_Sel ;
      AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV57TFPrdZDHC_Sels ;
      AV90Stocksquimicos_producwwds_16_tfprdlist_sels = AV59TFPrdList_Sels ;
      AV91Stocksquimicos_producwwds_17_tfprdthelist = AV60TFPrdTHELIST ;
      AV92Stocksquimicos_producwwds_18_tfprdthelist_sel = AV61TFPrdTHELIST_Sel ;
      AV93Stocksquimicos_producwwds_19_tfprdhs = AV62TFPrdHS ;
      AV94Stocksquimicos_producwwds_20_tfprdhs_sel = AV63TFPrdHS_Sel ;
      AV95Stocksquimicos_producwwds_21_tfprdfhs = AV64TFPrdFHS ;
      AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV71TFPrdEsCompuesto_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV86Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV90Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV77Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV76Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV79Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV78Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV80Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV81Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV83Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV82Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV85Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV84Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV86Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV88Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV87Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV90Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV92Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV91Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV94Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV93Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV95Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV75Stocksquimicos_producwwds_1_filterfulltext ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV76Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV78Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV78Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV82Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV82Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV84Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV84Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV87Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV91Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV93Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor H013I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, lV76Stocksquimicos_producwwds_2_tfprdnom, AV77Stocksquimicos_producwwds_3_tfprdnom_sel, lV78Stocksquimicos_producwwds_4_tfprdnum, AV79Stocksquimicos_producwwds_5_tfprdnum_sel, AV80Stocksquimicos_producwwds_6_tfprdaox, AV81Stocksquimicos_producwwds_7_tfprdaox_to, lV82Stocksquimicos_producwwds_8_tfprdgots, AV83Stocksquimicos_producwwds_9_tfprdgots_sel, lV84Stocksquimicos_producwwds_10_tfprdreach, AV85Stocksquimicos_producwwds_11_tfprdreach_sel, lV87Stocksquimicos_producwwds_13_tfprdhm, AV88Stocksquimicos_producwwds_14_tfprdhm_sel, lV91Stocksquimicos_producwwds_17_tfprdthelist, AV92Stocksquimicos_producwwds_18_tfprdthelist_sel, lV93Stocksquimicos_producwwds_19_tfprdhs, AV94Stocksquimicos_producwwds_20_tfprdhs_sel, AV95Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13232PrdRGB = H013I2_A13232PrdRGB[0] ;
         A9742PrdFHS = H013I2_A9742PrdFHS[0] ;
         A9741PrdHS = H013I2_A9741PrdHS[0] ;
         A13302PrdTHELIST = H013I2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = H013I2_n13302PrdTHELIST[0] ;
         A11687PrdList = H013I2_A11687PrdList[0] ;
         A13301PrdZDHC = H013I2_A13301PrdZDHC[0] ;
         A11364PrdHm = H013I2_A11364PrdHm[0] ;
         A5888PrdOkotex = H013I2_A5888PrdOkotex[0] ;
         A5887PrdReach = H013I2_A5887PrdReach[0] ;
         A11363PrdGots = H013I2_A11363PrdGots[0] ;
         A9733PrdAox = H013I2_A9733PrdAox[0] ;
         A718PrdNom = H013I2_A718PrdNom[0] ;
         A719PrdNum = H013I2_A719PrdNum[0] ;
         if ( (GXutil.strcmp("", AV75Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV75Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 1", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 2", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 3", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "N") == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf13I2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e2113I2 ();
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
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_452( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A5888PrdOkotex ,
                                              AV86Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                              A13301PrdZDHC ,
                                              AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                              A11687PrdList ,
                                              AV90Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                              AV77Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                              AV76Stocksquimicos_producwwds_2_tfprdnom ,
                                              AV79Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                              AV78Stocksquimicos_producwwds_4_tfprdnum ,
                                              AV80Stocksquimicos_producwwds_6_tfprdaox ,
                                              AV81Stocksquimicos_producwwds_7_tfprdaox_to ,
                                              AV83Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                              AV82Stocksquimicos_producwwds_8_tfprdgots ,
                                              AV85Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                              AV84Stocksquimicos_producwwds_10_tfprdreach ,
                                              Integer.valueOf(AV86Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                              AV88Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                              AV87Stocksquimicos_producwwds_13_tfprdhm ,
                                              Integer.valueOf(AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                              Integer.valueOf(AV90Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                              AV92Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                              AV91Stocksquimicos_producwwds_17_tfprdthelist ,
                                              AV94Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                              AV93Stocksquimicos_producwwds_19_tfprdhs ,
                                              AV95Stocksquimicos_producwwds_21_tfprdfhs ,
                                              Byte.valueOf(AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                              A718PrdNom ,
                                              A719PrdNum ,
                                              A9733PrdAox ,
                                              A11363PrdGots ,
                                              A5887PrdReach ,
                                              A11364PrdHm ,
                                              A13302PrdTHELIST ,
                                              A9741PrdHS ,
                                              A9742PrdFHS ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV75Stocksquimicos_producwwds_1_filterfulltext ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV76Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV76Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
         lV78Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV78Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
         lV82Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV82Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
         lV84Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV84Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
         lV87Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
         lV91Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
         lV93Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
         /* Using cursor H013I3 */
         pr_default.execute(1, new Object[] {A396EmprCod, lV76Stocksquimicos_producwwds_2_tfprdnom, AV77Stocksquimicos_producwwds_3_tfprdnom_sel, lV78Stocksquimicos_producwwds_4_tfprdnum, AV79Stocksquimicos_producwwds_5_tfprdnum_sel, AV80Stocksquimicos_producwwds_6_tfprdaox, AV81Stocksquimicos_producwwds_7_tfprdaox_to, lV82Stocksquimicos_producwwds_8_tfprdgots, AV83Stocksquimicos_producwwds_9_tfprdgots_sel, lV84Stocksquimicos_producwwds_10_tfprdreach, AV85Stocksquimicos_producwwds_11_tfprdreach_sel, lV87Stocksquimicos_producwwds_13_tfprdhm, AV88Stocksquimicos_producwwds_14_tfprdhm_sel, lV91Stocksquimicos_producwwds_17_tfprdthelist, AV92Stocksquimicos_producwwds_18_tfprdthelist_sel, lV93Stocksquimicos_producwwds_19_tfprdhs, AV94Stocksquimicos_producwwds_20_tfprdhs_sel, AV95Stocksquimicos_producwwds_21_tfprdfhs});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13232PrdRGB = H013I3_A13232PrdRGB[0] ;
            A9742PrdFHS = H013I3_A9742PrdFHS[0] ;
            A9741PrdHS = H013I3_A9741PrdHS[0] ;
            A13302PrdTHELIST = H013I3_A13302PrdTHELIST[0] ;
            n13302PrdTHELIST = H013I3_n13302PrdTHELIST[0] ;
            A11687PrdList = H013I3_A11687PrdList[0] ;
            A13301PrdZDHC = H013I3_A13301PrdZDHC[0] ;
            A11364PrdHm = H013I3_A11364PrdHm[0] ;
            A5888PrdOkotex = H013I3_A5888PrdOkotex[0] ;
            A5887PrdReach = H013I3_A5887PrdReach[0] ;
            A11363PrdGots = H013I3_A11363PrdGots[0] ;
            A9733PrdAox = H013I3_A9733PrdAox[0] ;
            A718PrdNom = H013I3_A718PrdNom[0] ;
            A719PrdNum = H013I3_A719PrdNum[0] ;
            if ( (GXutil.strcmp("", AV75Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV75Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 1", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 2", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 3", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "N") == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV75Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
               {
                  A13881PrdEsCompu = true ;
               }
               else
               {
                  A13881PrdEsCompu = false ;
               }
               e2213I2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wb13I0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes13I2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV97Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROPRV", GXutil.ltrim( localUtil.ntoc( AV68ProPrv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROPRV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68ProPrv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCNOENC", GXutil.ltrim( localUtil.ntoc( AV69CnoEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNOENC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69CnoEnc), "ZZZ9")));
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
      AV75Stocksquimicos_producwwds_1_filterfulltext = AV15FilterFullText ;
      AV76Stocksquimicos_producwwds_2_tfprdnom = AV26TFPrdNom ;
      AV77Stocksquimicos_producwwds_3_tfprdnom_sel = AV27TFPrdNom_Sel ;
      AV78Stocksquimicos_producwwds_4_tfprdnum = AV28TFPrdNum ;
      AV79Stocksquimicos_producwwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV80Stocksquimicos_producwwds_6_tfprdaox = AV46TFPrdAox ;
      AV81Stocksquimicos_producwwds_7_tfprdaox_to = AV47TFPrdAox_To ;
      AV82Stocksquimicos_producwwds_8_tfprdgots = AV48TFPrdGots ;
      AV83Stocksquimicos_producwwds_9_tfprdgots_sel = AV49TFPrdGots_Sel ;
      AV84Stocksquimicos_producwwds_10_tfprdreach = AV50TFPrdReach ;
      AV85Stocksquimicos_producwwds_11_tfprdreach_sel = AV51TFPrdReach_Sel ;
      AV86Stocksquimicos_producwwds_12_tfprdokotex_sels = AV53TFPrdOkotex_Sels ;
      AV87Stocksquimicos_producwwds_13_tfprdhm = AV54TFPrdHm ;
      AV88Stocksquimicos_producwwds_14_tfprdhm_sel = AV55TFPrdHm_Sel ;
      AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV57TFPrdZDHC_Sels ;
      AV90Stocksquimicos_producwwds_16_tfprdlist_sels = AV59TFPrdList_Sels ;
      AV91Stocksquimicos_producwwds_17_tfprdthelist = AV60TFPrdTHELIST ;
      AV92Stocksquimicos_producwwds_18_tfprdthelist_sel = AV61TFPrdTHELIST_Sel ;
      AV93Stocksquimicos_producwwds_19_tfprdhs = AV62TFPrdHS ;
      AV94Stocksquimicos_producwwds_20_tfprdhs_sel = AV63TFPrdHS_Sel ;
      AV95Stocksquimicos_producwwds_21_tfprdfhs = AV64TFPrdFHS ;
      AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV71TFPrdEsCompuesto_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNom, AV27TFPrdNom_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV46TFPrdAox, AV47TFPrdAox_To, AV48TFPrdGots, AV49TFPrdGots_Sel, AV50TFPrdReach, AV51TFPrdReach_Sel, AV53TFPrdOkotex_Sels, AV54TFPrdHm, AV55TFPrdHm_Sel, AV57TFPrdZDHC_Sels, AV59TFPrdList_Sels, AV60TFPrdTHELIST, AV61TFPrdTHELIST_Sel, AV62TFPrdHS, AV63TFPrdHS_Sel, AV64TFPrdFHS, AV71TFPrdEsCompuesto_Sel, AV97Pgmname, AV12OrderedBy, AV13OrderedDsc, AV68ProPrv, AV69CnoEnc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV75Stocksquimicos_producwwds_1_filterfulltext = AV15FilterFullText ;
      AV76Stocksquimicos_producwwds_2_tfprdnom = AV26TFPrdNom ;
      AV77Stocksquimicos_producwwds_3_tfprdnom_sel = AV27TFPrdNom_Sel ;
      AV78Stocksquimicos_producwwds_4_tfprdnum = AV28TFPrdNum ;
      AV79Stocksquimicos_producwwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV80Stocksquimicos_producwwds_6_tfprdaox = AV46TFPrdAox ;
      AV81Stocksquimicos_producwwds_7_tfprdaox_to = AV47TFPrdAox_To ;
      AV82Stocksquimicos_producwwds_8_tfprdgots = AV48TFPrdGots ;
      AV83Stocksquimicos_producwwds_9_tfprdgots_sel = AV49TFPrdGots_Sel ;
      AV84Stocksquimicos_producwwds_10_tfprdreach = AV50TFPrdReach ;
      AV85Stocksquimicos_producwwds_11_tfprdreach_sel = AV51TFPrdReach_Sel ;
      AV86Stocksquimicos_producwwds_12_tfprdokotex_sels = AV53TFPrdOkotex_Sels ;
      AV87Stocksquimicos_producwwds_13_tfprdhm = AV54TFPrdHm ;
      AV88Stocksquimicos_producwwds_14_tfprdhm_sel = AV55TFPrdHm_Sel ;
      AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV57TFPrdZDHC_Sels ;
      AV90Stocksquimicos_producwwds_16_tfprdlist_sels = AV59TFPrdList_Sels ;
      AV91Stocksquimicos_producwwds_17_tfprdthelist = AV60TFPrdTHELIST ;
      AV92Stocksquimicos_producwwds_18_tfprdthelist_sel = AV61TFPrdTHELIST_Sel ;
      AV93Stocksquimicos_producwwds_19_tfprdhs = AV62TFPrdHS ;
      AV94Stocksquimicos_producwwds_20_tfprdhs_sel = AV63TFPrdHS_Sel ;
      AV95Stocksquimicos_producwwds_21_tfprdfhs = AV64TFPrdFHS ;
      AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV71TFPrdEsCompuesto_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNom, AV27TFPrdNom_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV46TFPrdAox, AV47TFPrdAox_To, AV48TFPrdGots, AV49TFPrdGots_Sel, AV50TFPrdReach, AV51TFPrdReach_Sel, AV53TFPrdOkotex_Sels, AV54TFPrdHm, AV55TFPrdHm_Sel, AV57TFPrdZDHC_Sels, AV59TFPrdList_Sels, AV60TFPrdTHELIST, AV61TFPrdTHELIST_Sel, AV62TFPrdHS, AV63TFPrdHS_Sel, AV64TFPrdFHS, AV71TFPrdEsCompuesto_Sel, AV97Pgmname, AV12OrderedBy, AV13OrderedDsc, AV68ProPrv, AV69CnoEnc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV75Stocksquimicos_producwwds_1_filterfulltext = AV15FilterFullText ;
      AV76Stocksquimicos_producwwds_2_tfprdnom = AV26TFPrdNom ;
      AV77Stocksquimicos_producwwds_3_tfprdnom_sel = AV27TFPrdNom_Sel ;
      AV78Stocksquimicos_producwwds_4_tfprdnum = AV28TFPrdNum ;
      AV79Stocksquimicos_producwwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV80Stocksquimicos_producwwds_6_tfprdaox = AV46TFPrdAox ;
      AV81Stocksquimicos_producwwds_7_tfprdaox_to = AV47TFPrdAox_To ;
      AV82Stocksquimicos_producwwds_8_tfprdgots = AV48TFPrdGots ;
      AV83Stocksquimicos_producwwds_9_tfprdgots_sel = AV49TFPrdGots_Sel ;
      AV84Stocksquimicos_producwwds_10_tfprdreach = AV50TFPrdReach ;
      AV85Stocksquimicos_producwwds_11_tfprdreach_sel = AV51TFPrdReach_Sel ;
      AV86Stocksquimicos_producwwds_12_tfprdokotex_sels = AV53TFPrdOkotex_Sels ;
      AV87Stocksquimicos_producwwds_13_tfprdhm = AV54TFPrdHm ;
      AV88Stocksquimicos_producwwds_14_tfprdhm_sel = AV55TFPrdHm_Sel ;
      AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV57TFPrdZDHC_Sels ;
      AV90Stocksquimicos_producwwds_16_tfprdlist_sels = AV59TFPrdList_Sels ;
      AV91Stocksquimicos_producwwds_17_tfprdthelist = AV60TFPrdTHELIST ;
      AV92Stocksquimicos_producwwds_18_tfprdthelist_sel = AV61TFPrdTHELIST_Sel ;
      AV93Stocksquimicos_producwwds_19_tfprdhs = AV62TFPrdHS ;
      AV94Stocksquimicos_producwwds_20_tfprdhs_sel = AV63TFPrdHS_Sel ;
      AV95Stocksquimicos_producwwds_21_tfprdfhs = AV64TFPrdFHS ;
      AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV71TFPrdEsCompuesto_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNom, AV27TFPrdNom_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV46TFPrdAox, AV47TFPrdAox_To, AV48TFPrdGots, AV49TFPrdGots_Sel, AV50TFPrdReach, AV51TFPrdReach_Sel, AV53TFPrdOkotex_Sels, AV54TFPrdHm, AV55TFPrdHm_Sel, AV57TFPrdZDHC_Sels, AV59TFPrdList_Sels, AV60TFPrdTHELIST, AV61TFPrdTHELIST_Sel, AV62TFPrdHS, AV63TFPrdHS_Sel, AV64TFPrdFHS, AV71TFPrdEsCompuesto_Sel, AV97Pgmname, AV12OrderedBy, AV13OrderedDsc, AV68ProPrv, AV69CnoEnc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV75Stocksquimicos_producwwds_1_filterfulltext = AV15FilterFullText ;
      AV76Stocksquimicos_producwwds_2_tfprdnom = AV26TFPrdNom ;
      AV77Stocksquimicos_producwwds_3_tfprdnom_sel = AV27TFPrdNom_Sel ;
      AV78Stocksquimicos_producwwds_4_tfprdnum = AV28TFPrdNum ;
      AV79Stocksquimicos_producwwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV80Stocksquimicos_producwwds_6_tfprdaox = AV46TFPrdAox ;
      AV81Stocksquimicos_producwwds_7_tfprdaox_to = AV47TFPrdAox_To ;
      AV82Stocksquimicos_producwwds_8_tfprdgots = AV48TFPrdGots ;
      AV83Stocksquimicos_producwwds_9_tfprdgots_sel = AV49TFPrdGots_Sel ;
      AV84Stocksquimicos_producwwds_10_tfprdreach = AV50TFPrdReach ;
      AV85Stocksquimicos_producwwds_11_tfprdreach_sel = AV51TFPrdReach_Sel ;
      AV86Stocksquimicos_producwwds_12_tfprdokotex_sels = AV53TFPrdOkotex_Sels ;
      AV87Stocksquimicos_producwwds_13_tfprdhm = AV54TFPrdHm ;
      AV88Stocksquimicos_producwwds_14_tfprdhm_sel = AV55TFPrdHm_Sel ;
      AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV57TFPrdZDHC_Sels ;
      AV90Stocksquimicos_producwwds_16_tfprdlist_sels = AV59TFPrdList_Sels ;
      AV91Stocksquimicos_producwwds_17_tfprdthelist = AV60TFPrdTHELIST ;
      AV92Stocksquimicos_producwwds_18_tfprdthelist_sel = AV61TFPrdTHELIST_Sel ;
      AV93Stocksquimicos_producwwds_19_tfprdhs = AV62TFPrdHS ;
      AV94Stocksquimicos_producwwds_20_tfprdhs_sel = AV63TFPrdHS_Sel ;
      AV95Stocksquimicos_producwwds_21_tfprdfhs = AV64TFPrdFHS ;
      AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV71TFPrdEsCompuesto_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNom, AV27TFPrdNom_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV46TFPrdAox, AV47TFPrdAox_To, AV48TFPrdGots, AV49TFPrdGots_Sel, AV50TFPrdReach, AV51TFPrdReach_Sel, AV53TFPrdOkotex_Sels, AV54TFPrdHm, AV55TFPrdHm_Sel, AV57TFPrdZDHC_Sels, AV59TFPrdList_Sels, AV60TFPrdTHELIST, AV61TFPrdTHELIST_Sel, AV62TFPrdHS, AV63TFPrdHS_Sel, AV64TFPrdFHS, AV71TFPrdEsCompuesto_Sel, AV97Pgmname, AV12OrderedBy, AV13OrderedDsc, AV68ProPrv, AV69CnoEnc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV75Stocksquimicos_producwwds_1_filterfulltext = AV15FilterFullText ;
      AV76Stocksquimicos_producwwds_2_tfprdnom = AV26TFPrdNom ;
      AV77Stocksquimicos_producwwds_3_tfprdnom_sel = AV27TFPrdNom_Sel ;
      AV78Stocksquimicos_producwwds_4_tfprdnum = AV28TFPrdNum ;
      AV79Stocksquimicos_producwwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV80Stocksquimicos_producwwds_6_tfprdaox = AV46TFPrdAox ;
      AV81Stocksquimicos_producwwds_7_tfprdaox_to = AV47TFPrdAox_To ;
      AV82Stocksquimicos_producwwds_8_tfprdgots = AV48TFPrdGots ;
      AV83Stocksquimicos_producwwds_9_tfprdgots_sel = AV49TFPrdGots_Sel ;
      AV84Stocksquimicos_producwwds_10_tfprdreach = AV50TFPrdReach ;
      AV85Stocksquimicos_producwwds_11_tfprdreach_sel = AV51TFPrdReach_Sel ;
      AV86Stocksquimicos_producwwds_12_tfprdokotex_sels = AV53TFPrdOkotex_Sels ;
      AV87Stocksquimicos_producwwds_13_tfprdhm = AV54TFPrdHm ;
      AV88Stocksquimicos_producwwds_14_tfprdhm_sel = AV55TFPrdHm_Sel ;
      AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV57TFPrdZDHC_Sels ;
      AV90Stocksquimicos_producwwds_16_tfprdlist_sels = AV59TFPrdList_Sels ;
      AV91Stocksquimicos_producwwds_17_tfprdthelist = AV60TFPrdTHELIST ;
      AV92Stocksquimicos_producwwds_18_tfprdthelist_sel = AV61TFPrdTHELIST_Sel ;
      AV93Stocksquimicos_producwwds_19_tfprdhs = AV62TFPrdHS ;
      AV94Stocksquimicos_producwwds_20_tfprdhs_sel = AV63TFPrdHS_Sel ;
      AV95Stocksquimicos_producwwds_21_tfprdfhs = AV64TFPrdFHS ;
      AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV71TFPrdEsCompuesto_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNom, AV27TFPrdNom_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV46TFPrdAox, AV47TFPrdAox_To, AV48TFPrdGots, AV49TFPrdGots_Sel, AV50TFPrdReach, AV51TFPrdReach_Sel, AV53TFPrdOkotex_Sels, AV54TFPrdHm, AV55TFPrdHm_Sel, AV57TFPrdZDHC_Sels, AV59TFPrdList_Sels, AV60TFPrdTHELIST, AV61TFPrdTHELIST_Sel, AV62TFPrdHS, AV63TFPrdHS_Sel, AV64TFPrdFHS, AV71TFPrdEsCompuesto_Sel, AV97Pgmname, AV12OrderedBy, AV13OrderedDsc, AV68ProPrv, AV69CnoEnc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV97Pgmname = "StocksQuimicos.PRODUCWW" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup13I0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2013I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV30DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV32GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV33GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_prdfhsauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PRDFHSAUXDATE");
            GX_FocusControl = edtavDdo_prdfhsauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV66DDO_PrdFHSAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66DDO_PrdFHSAuxDate", localUtil.format(AV66DDO_PrdFHSAuxDate, "99/99/99"));
         }
         else
         {
            AV66DDO_PrdFHSAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_prdfhsauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66DDO_PrdFHSAuxDate", localUtil.format(AV66DDO_PrdFHSAuxDate, "99/99/99"));
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
      e2013I2 ();
      if (returnInSub) return;
   }

   public void e2013I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV35Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      producww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV36EmprNom ;
      GXv_char4[0] = AV37UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV35Station, GXv_char2, GXv_char3, GXv_char4) ;
      producww_impl.this.A396EmprCod = GXv_char2[0] ;
      producww_impl.this.AV36EmprNom = GXv_char3[0] ;
      producww_impl.this.AV37UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXt_int5 = (byte)(AV68ProPrv) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int6) ;
      producww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV68ProPrv = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68ProPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ProPrv), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROPRV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68ProPrv), "ZZZ9")));
      GXt_int5 = (byte)(AV38SiRGB) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIPRGB", ""), GXv_int6) ;
      producww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV38SiRGB = GXt_int5 ;
      GXt_int5 = (byte)(AV69CnoEnc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CNOENC", ""), GXv_int6) ;
      producww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV69CnoEnc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69CnoEnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69CnoEnc), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNOENC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69CnoEnc), "ZZZ9")));
      GXt_char1 = AV35Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      producww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35Station = GXt_char1 ;
      GXv_char4[0] = AV74Emprcod ;
      GXv_char3[0] = AV36EmprNom ;
      GXv_char2[0] = AV37UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV35Station, GXv_char4, GXv_char3, GXv_char2) ;
      producww_impl.this.AV74Emprcod = GXv_char4[0] ;
      producww_impl.this.AV36EmprNom = GXv_char3[0] ;
      producww_impl.this.AV37UsurCod = GXv_char2[0] ;
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Productos Quimicos", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV30DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV30DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2113I2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("StocksQuimicos.PRODUCWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("StocksQuimicos.PRODUCWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdAox_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAox_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAox_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdGots_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdReach_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdReach_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdReach_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbPrdOkotex.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdOkotex.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdOkotex.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdHm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHm_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbPrdZDHC.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdZDHC.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdZDHC.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      cmbPrdList.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdList.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdList.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdTHELIST_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdTHELIST_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTHELIST_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdHS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHS_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFHS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFHS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFHS_Visible), 5, 0), !bGXsfl_45_Refreshing);
      chkPrdEsCompu.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdEsCompu.getInternalname(), "Visible", GXutil.ltrimstr( chkPrdEsCompu.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      AV32GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridCurrentPage), 10, 0));
      AV33GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridPageCount), 10, 0));
      AV75Stocksquimicos_producwwds_1_filterfulltext = AV15FilterFullText ;
      AV76Stocksquimicos_producwwds_2_tfprdnom = AV26TFPrdNom ;
      AV77Stocksquimicos_producwwds_3_tfprdnom_sel = AV27TFPrdNom_Sel ;
      AV78Stocksquimicos_producwwds_4_tfprdnum = AV28TFPrdNum ;
      AV79Stocksquimicos_producwwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV80Stocksquimicos_producwwds_6_tfprdaox = AV46TFPrdAox ;
      AV81Stocksquimicos_producwwds_7_tfprdaox_to = AV47TFPrdAox_To ;
      AV82Stocksquimicos_producwwds_8_tfprdgots = AV48TFPrdGots ;
      AV83Stocksquimicos_producwwds_9_tfprdgots_sel = AV49TFPrdGots_Sel ;
      AV84Stocksquimicos_producwwds_10_tfprdreach = AV50TFPrdReach ;
      AV85Stocksquimicos_producwwds_11_tfprdreach_sel = AV51TFPrdReach_Sel ;
      AV86Stocksquimicos_producwwds_12_tfprdokotex_sels = AV53TFPrdOkotex_Sels ;
      AV87Stocksquimicos_producwwds_13_tfprdhm = AV54TFPrdHm ;
      AV88Stocksquimicos_producwwds_14_tfprdhm_sel = AV55TFPrdHm_Sel ;
      AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV57TFPrdZDHC_Sels ;
      AV90Stocksquimicos_producwwds_16_tfprdlist_sels = AV59TFPrdList_Sels ;
      AV91Stocksquimicos_producwwds_17_tfprdthelist = AV60TFPrdTHELIST ;
      AV92Stocksquimicos_producwwds_18_tfprdthelist_sel = AV61TFPrdTHELIST_Sel ;
      AV93Stocksquimicos_producwwds_19_tfprdhs = AV62TFPrdHS ;
      AV94Stocksquimicos_producwwds_20_tfprdhs_sel = AV63TFPrdHS_Sel ;
      AV95Stocksquimicos_producwwds_21_tfprdfhs = AV64TFPrdFHS ;
      AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV71TFPrdEsCompuesto_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1213I2( )
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
         AV31PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV31PageToGo) ;
      }
   }

   public void e1313I2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1413I2( )
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
            AV26TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNom", AV26TFPrdNom);
            AV27TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNom_Sel", AV27TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV28TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNum", AV28TFPrdNum);
            AV29TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNum_Sel", AV29TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdAox") == 0 )
         {
            AV46TFPrdAox = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdAox", GXutil.ltrimstr( AV46TFPrdAox, 6, 2));
            AV47TFPrdAox_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdAox_To", GXutil.ltrimstr( AV47TFPrdAox_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdGots") == 0 )
         {
            AV48TFPrdGots = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFPrdGots", AV48TFPrdGots);
            AV49TFPrdGots_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFPrdGots_Sel", AV49TFPrdGots_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdReach") == 0 )
         {
            AV50TFPrdReach = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdReach", AV50TFPrdReach);
            AV51TFPrdReach_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdReach_Sel", AV51TFPrdReach_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdOkotex") == 0 )
         {
            AV52TFPrdOkotex_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFPrdOkotex_SelsJson", AV52TFPrdOkotex_SelsJson);
            AV53TFPrdOkotex_Sels.fromJSonString(AV52TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdHm") == 0 )
         {
            AV54TFPrdHm = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdHm", AV54TFPrdHm);
            AV55TFPrdHm_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrdHm_Sel", AV55TFPrdHm_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdZDHC") == 0 )
         {
            AV56TFPrdZDHC_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdZDHC_SelsJson", AV56TFPrdZDHC_SelsJson);
            AV57TFPrdZDHC_Sels.fromJSonString(AV56TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdList") == 0 )
         {
            AV58TFPrdList_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrdList_SelsJson", AV58TFPrdList_SelsJson);
            AV59TFPrdList_Sels.fromJSonString(AV58TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdTHELIST") == 0 )
         {
            AV60TFPrdTHELIST = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFPrdTHELIST", AV60TFPrdTHELIST);
            AV61TFPrdTHELIST_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrdTHELIST_Sel", AV61TFPrdTHELIST_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdHS") == 0 )
         {
            AV62TFPrdHS = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrdHS", AV62TFPrdHS);
            AV63TFPrdHS_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFPrdHS_Sel", AV63TFPrdHS_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdFHS") == 0 )
         {
            AV64TFPrdFHS = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrdFHS", localUtil.format(AV64TFPrdFHS, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdEsCompuesto") == 0 )
         {
            AV71TFPrdEsCompuesto_Sel = (byte)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFPrdEsCompuesto_Sel", GXutil.str( AV71TFPrdEsCompuesto_Sel, 1, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFPrdList_Sels", AV59TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFPrdZDHC_Sels", AV57TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53TFPrdOkotex_Sels", AV53TFPrdOkotex_Sels);
   }

   private void e2213I2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         if ( A13881PrdEsCompu )
         {
            edtavDetailwebcomponent_Visible = 1 ;
         }
         else
         {
            edtavDetailwebcomponent_Visible = 0 ;
         }
         AV70DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV70DetailWebComponent);
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("4", httpContext.getMessage( "Proveedores", ""), (short)(0));
         cmbavGridactions.addItem("5", httpContext.getMessage( "Cuaderno Encargos", ""), (short)(0));
         cmbavGridactions.addItem("6", httpContext.getMessage( "Frases R", ""), (short)(0));
         cmbavGridactions.addItem("7", httpContext.getMessage( "Sustancias a controlar", ""), (short)(0));
         AV39PrdRGB = ((A13232PrdRGB==0) ? 65793 : A13232PrdRGB) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39PrdRGB), 10, 0));
         GXv_int10[0] = AV40R ;
         GXv_int11[0] = AV41G ;
         GXv_int12[0] = AV42B ;
         GXv_int13[0] = AV43R2 ;
         GXv_int14[0] = AV44G2 ;
         GXv_int15[0] = AV45B2 ;
         new app.backcolorforecolor(remoteHandle, context).execute( AV39PrdRGB, GXv_int10, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_int15) ;
         producww_impl.this.AV40R = GXv_int10[0] ;
         producww_impl.this.AV41G = GXv_int11[0] ;
         producww_impl.this.AV42B = GXv_int12[0] ;
         producww_impl.this.AV43R2 = GXv_int13[0] ;
         producww_impl.this.AV44G2 = GXv_int14[0] ;
         producww_impl.this.AV45B2 = GXv_int15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40R), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41G), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42B), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43R2), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44G2), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45B2), 3, 0));
         edtPrdNom_Backcolor = GXutil.getColor( AV40R, AV41G, AV42B) ;
         edtPrdNom_Forecolor = GXutil.getColor( AV43R2, AV44G2, AV45B2) ;
         if ( ( AV68ProPrv == 0 ) && ( AV69CnoEnc == 0 ) )
         {
            cmbavGridactions.removeAllItems();
            cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
            cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
            cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
            cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( ( AV68ProPrv == 0 ) && ( AV69CnoEnc == 1 ) )
         {
            cmbavGridactions.removeAllItems();
            cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
            cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
            cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
            cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
            cmbavGridactions.addItem("4", httpContext.getMessage( "Cuaderno Encargos", ""), (short)(0));
         }
         if ( ( AV68ProPrv == 1 ) && ( AV69CnoEnc == 0 ) )
         {
            cmbavGridactions.removeAllItems();
            cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
            cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
            cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
            cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
            cmbavGridactions.addItem("4", httpContext.getMessage( "Proveedores", ""), (short)(0));
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(45) ;
         }
         sendrow_452( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
      {
         httpContext.doAjaxLoad(45, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV34GridActions, 4, 0)) );
   }

   public void e1513I2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.PRODUCWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1113I2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.PRODUCWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV97Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.PRODUCWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "StocksQuimicos.PRODUCWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         producww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53TFPrdOkotex_Sels", AV53TFPrdOkotex_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFPrdZDHC_Sels", AV57TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFPrdList_Sels", AV59TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e2313I2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV34GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV34GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV34GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV34GridActions == 4 )
      {
         /* Execute user subroutine: 'DO PROVEEDORES' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV34GridActions == 5 )
      {
         /* Execute user subroutine: 'DO CUADERNOENCARGOS' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV34GridActions == 6 )
      {
         /* Execute user subroutine: 'DO FRASESRIESGOS' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV34GridActions == 7 )
      {
         /* Execute user subroutine: 'DO SUSTANCIASACONTROLAR' */
         S252 ();
         if (returnInSub) return;
      }
      AV34GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV34GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1613I2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.produc", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e1713I2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.stocksquimicos.producwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      producww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      producww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFPrdList_Sels", AV59TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFPrdZDHC_Sels", AV57TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53TFPrdOkotex_Sels", AV53TFPrdOkotex_Sels);
   }

   public void e1813I2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.stocksquimicos.producwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFPrdList_Sels", AV59TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFPrdZDHC_Sels", AV57TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53TFPrdOkotex_Sels", AV53TFPrdOkotex_Sels);
   }

   public void e1913I2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.stocksquimicos.producwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFPrdList_Sels", AV59TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFPrdZDHC_Sels", AV57TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53TFPrdOkotex_Sels", AV53TFPrdOkotex_Sels);
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
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdNom", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdNum", "", "Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdAox", "", "AOX (adsorbable organic halogens)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdGots", "", "GOTS", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdReach", "", "REACH", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdOkotex", "", "Oeko Tex", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdHm", "", "HM", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdZDHC", "", "ZDHC", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdList", "", "List by Inditex ", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdTHELIST", "", "THELIST", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdHS", "", "Hoja Seguridad?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdFHS", "", "Fecha Hoja Seguridad", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdEsCompuesto", "", "Es Compuesto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.PRODUCWWColumnsSelector", GXv_char4) ;
      producww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector16[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, GXv_SdtWWPColumnsSelector17) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector16[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "StocksQuimicos.PRODUCWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNom", AV26TFPrdNom);
      AV27TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNom_Sel", AV27TFPrdNom_Sel);
      AV28TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNum", AV28TFPrdNum);
      AV29TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNum_Sel", AV29TFPrdNum_Sel);
      AV46TFPrdAox = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdAox", GXutil.ltrimstr( AV46TFPrdAox, 6, 2));
      AV47TFPrdAox_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdAox_To", GXutil.ltrimstr( AV47TFPrdAox_To, 6, 2));
      AV48TFPrdGots = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFPrdGots", AV48TFPrdGots);
      AV49TFPrdGots_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFPrdGots_Sel", AV49TFPrdGots_Sel);
      AV50TFPrdReach = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdReach", AV50TFPrdReach);
      AV51TFPrdReach_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdReach_Sel", AV51TFPrdReach_Sel);
      AV53TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV54TFPrdHm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdHm", AV54TFPrdHm);
      AV55TFPrdHm_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrdHm_Sel", AV55TFPrdHm_Sel);
      AV57TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV59TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV60TFPrdTHELIST = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFPrdTHELIST", AV60TFPrdTHELIST);
      AV61TFPrdTHELIST_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrdTHELIST_Sel", AV61TFPrdTHELIST_Sel);
      AV62TFPrdHS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrdHS", AV62TFPrdHS);
      AV63TFPrdHS_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFPrdHS_Sel", AV63TFPrdHS_Sel);
      AV64TFPrdFHS = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrdFHS", localUtil.format(AV64TFPrdFHS, "99/99/99"));
      AV71TFPrdEsCompuesto_Sel = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFPrdEsCompuesto_Sel", GXutil.str( AV71TFPrdEsCompuesto_Sel, 1, 0));
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
         callWebObject(formatLink("app.stocksquimicos.produc", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      callWebObject(formatLink("app.stocksquimicos.produc", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.produc", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.produc", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO PROVEEDORES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tnprovprd", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO CUADERNOENCARGOS' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tcdnenc", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S242( )
   {
      /* 'DO FRASESRIESGOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.stocksquimicos.tprdfrr", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S252( )
   {
      /* 'DO SUSTANCIASACONTROLAR' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", A13302PrdTHELIST)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = A13302PrdTHELIST ;
         new app.core.inscatsus(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         producww_impl.this.A396EmprCod = GXv_char4[0] ;
         producww_impl.this.A719PrdNum = GXv_char3[0] ;
         producww_impl.this.A13302PrdTHELIST = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.popup(formatLink("app.tcatsus", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A13302PrdTHELIST))}, new String[] {"Mode","EmprCod","PrdNum","TheList"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV97Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV97Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV97Pgmname+"GridState"), null, null);
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
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV26TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNom", AV26TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV27TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNom_Sel", AV27TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV28TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNum", AV28TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV29TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNum_Sel", AV29TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV46TFPrdAox = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdAox", GXutil.ltrimstr( AV46TFPrdAox, 6, 2));
            AV47TFPrdAox_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdAox_To", GXutil.ltrimstr( AV47TFPrdAox_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV48TFPrdGots = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFPrdGots", AV48TFPrdGots);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV49TFPrdGots_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFPrdGots_Sel", AV49TFPrdGots_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV50TFPrdReach = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdReach", AV50TFPrdReach);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV51TFPrdReach_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdReach_Sel", AV51TFPrdReach_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV52TFPrdOkotex_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFPrdOkotex_SelsJson", AV52TFPrdOkotex_SelsJson);
            AV53TFPrdOkotex_Sels.fromJSonString(AV52TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV54TFPrdHm = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdHm", AV54TFPrdHm);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV55TFPrdHm_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrdHm_Sel", AV55TFPrdHm_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV56TFPrdZDHC_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdZDHC_SelsJson", AV56TFPrdZDHC_SelsJson);
            AV57TFPrdZDHC_Sels.fromJSonString(AV56TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV58TFPrdList_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrdList_SelsJson", AV58TFPrdList_SelsJson);
            AV59TFPrdList_Sels.fromJSonString(AV58TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV60TFPrdTHELIST = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFPrdTHELIST", AV60TFPrdTHELIST);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV61TFPrdTHELIST_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrdTHELIST_Sel", AV61TFPrdTHELIST_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV62TFPrdHS = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrdHS", AV62TFPrdHS);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV63TFPrdHS_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFPrdHS_Sel", AV63TFPrdHS_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV64TFPrdFHS = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrdFHS", localUtil.format(AV64TFPrdFHS, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDESCOMPUESTO_SEL") == 0 )
         {
            AV71TFPrdEsCompuesto_Sel = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFPrdEsCompuesto_Sel", GXutil.str( AV71TFPrdEsCompuesto_Sel, 1, 0));
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFPrdNom_Sel)==0), AV27TFPrdNom_Sel, GXv_char4) ;
      producww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char20 = "" ;
      GXv_char3[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPrdNum_Sel)==0), AV29TFPrdNum_Sel, GXv_char3) ;
      producww_impl.this.GXt_char20 = GXv_char3[0] ;
      GXt_char21 = "" ;
      GXv_char2[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFPrdGots_Sel)==0), AV49TFPrdGots_Sel, GXv_char2) ;
      producww_impl.this.GXt_char21 = GXv_char2[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFPrdReach_Sel)==0), AV51TFPrdReach_Sel, GXv_char23) ;
      producww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV53TFPrdOkotex_Sels.size()==0), AV52TFPrdOkotex_SelsJson, GXv_char25) ;
      producww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFPrdHm_Sel)==0), AV55TFPrdHm_Sel, GXv_char27) ;
      producww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV57TFPrdZDHC_Sels.size()==0), AV56TFPrdZDHC_SelsJson, GXv_char29) ;
      producww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV59TFPrdList_Sels.size()==0), AV58TFPrdList_SelsJson, GXv_char31) ;
      producww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFPrdTHELIST_Sel)==0), AV61TFPrdTHELIST_Sel, GXv_char33) ;
      producww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFPrdHS_Sel)==0), AV63TFPrdHS_Sel, GXv_char35) ;
      producww_impl.this.GXt_char34 = GXv_char35[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char20+"||"+GXt_char21+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|"+GXt_char28+"|"+GXt_char30+"|"+GXt_char32+"|"+GXt_char34+"||"+((0==AV71TFPrdEsCompuesto_Sel) ? "" : GXutil.str( AV71TFPrdEsCompuesto_Sel, 1, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFPrdNom)==0), AV26TFPrdNom, GXv_char35) ;
      producww_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPrdNum)==0), AV28TFPrdNum, GXv_char33) ;
      producww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFPrdGots)==0), AV48TFPrdGots, GXv_char31) ;
      producww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFPrdReach)==0), AV50TFPrdReach, GXv_char29) ;
      producww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFPrdHm)==0), AV54TFPrdHm, GXv_char27) ;
      producww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFPrdTHELIST)==0), AV60TFPrdTHELIST, GXv_char25) ;
      producww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFPrdHS)==0), AV62TFPrdHS, GXv_char23) ;
      producww_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Filteredtext_set = GXt_char34+"|"+GXt_char32+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdAox)==0) ? "" : GXutil.str( AV46TFPrdAox, 6, 2))+"|"+GXt_char30+"|"+GXt_char28+"||"+GXt_char26+"|||"+GXt_char24+"|"+GXt_char22+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFPrdFHS)) ? "" : localUtil.dtoc( AV64TFPrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdAox_To)==0) ? "" : GXutil.str( AV47TFPrdAox_To, 6, 2))+"||||||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV97Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDNOM", "", !(GXutil.strcmp("", AV26TFPrdNom)==0), (short)(0), AV26TFPrdNom, "", !(GXutil.strcmp("", AV27TFPrdNom_Sel)==0), AV27TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDNUM", "", !(GXutil.strcmp("", AV28TFPrdNum)==0), (short)(0), AV28TFPrdNum, "", !(GXutil.strcmp("", AV29TFPrdNum_Sel)==0), AV29TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDAOX", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdAox)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdAox_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV46TFPrdAox, 6, 2)), GXutil.trim( GXutil.str( AV47TFPrdAox_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDGOTS", "", !(GXutil.strcmp("", AV48TFPrdGots)==0), (short)(0), AV48TFPrdGots, "", !(GXutil.strcmp("", AV49TFPrdGots_Sel)==0), AV49TFPrdGots_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDREACH", "", !(GXutil.strcmp("", AV50TFPrdReach)==0), (short)(0), AV50TFPrdReach, "", !(GXutil.strcmp("", AV51TFPrdReach_Sel)==0), AV51TFPrdReach_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDOKOTEX_SEL", "", !(AV53TFPrdOkotex_Sels.size()==0), (short)(0), AV53TFPrdOkotex_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDHM", "", !(GXutil.strcmp("", AV54TFPrdHm)==0), (short)(0), AV54TFPrdHm, "", !(GXutil.strcmp("", AV55TFPrdHm_Sel)==0), AV55TFPrdHm_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDZDHC_SEL", "", !(AV57TFPrdZDHC_Sels.size()==0), (short)(0), AV57TFPrdZDHC_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDLIST_SEL", "", !(AV59TFPrdList_Sels.size()==0), (short)(0), AV59TFPrdList_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDTHELIST", "", !(GXutil.strcmp("", AV60TFPrdTHELIST)==0), (short)(0), AV60TFPrdTHELIST, "", !(GXutil.strcmp("", AV61TFPrdTHELIST_Sel)==0), AV61TFPrdTHELIST_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDHS", "", !(GXutil.strcmp("", AV62TFPrdHS)==0), (short)(0), AV62TFPrdHS, "", !(GXutil.strcmp("", AV63TFPrdHS_Sel)==0), AV63TFPrdHS_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDFHS", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFPrdFHS)), (short)(0), GXutil.trim( localUtil.dtoc( AV64TFPrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      GXv_SdtWWPGridState36[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState36, "TFPRDESCOMPUESTO_SEL", "", !(0==AV71TFPrdEsCompuesto_Sel), (short)(0), GXutil.trim( GXutil.str( AV71TFPrdEsCompuesto_Sel, 1, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState36[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV97Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.PRODUC" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_13I2( boolean wbgen )
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
         wb_table2_32_13I2( true) ;
      }
      else
      {
         wb_table2_32_13I2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_13I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_13I2e( true) ;
      }
      else
      {
         wb_table1_27_13I2e( false) ;
      }
   }

   public void wb_table2_32_13I2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_StocksQuimicos\\PRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_13I2e( true) ;
      }
      else
      {
         wb_table2_32_13I2e( false) ;
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
      pa13I2( ) ;
      ws13I2( ) ;
      we13I2( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116131887", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/producww.js", "?202682116131887", false, true);
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
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_45_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_45_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_idx ;
      edtPrdAox_Internalname = "PRDAOX_"+sGXsfl_45_idx ;
      edtPrdGots_Internalname = "PRDGOTS_"+sGXsfl_45_idx ;
      edtPrdReach_Internalname = "PRDREACH_"+sGXsfl_45_idx ;
      cmbPrdOkotex.setInternalname( "PRDOKOTEX_"+sGXsfl_45_idx );
      edtPrdHm_Internalname = "PRDHM_"+sGXsfl_45_idx ;
      cmbPrdZDHC.setInternalname( "PRDZDHC_"+sGXsfl_45_idx );
      cmbPrdList.setInternalname( "PRDLIST_"+sGXsfl_45_idx );
      edtPrdTHELIST_Internalname = "PRDTHELIST_"+sGXsfl_45_idx ;
      edtPrdHS_Internalname = "PRDHS_"+sGXsfl_45_idx ;
      edtPrdFHS_Internalname = "PRDFHS_"+sGXsfl_45_idx ;
      chkPrdEsCompu.setInternalname( "PRDESCOMPU_"+sGXsfl_45_idx );
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_45_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_45_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_45_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_45_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_45_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_45_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_45_fel_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_45_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_fel_idx ;
      edtPrdAox_Internalname = "PRDAOX_"+sGXsfl_45_fel_idx ;
      edtPrdGots_Internalname = "PRDGOTS_"+sGXsfl_45_fel_idx ;
      edtPrdReach_Internalname = "PRDREACH_"+sGXsfl_45_fel_idx ;
      cmbPrdOkotex.setInternalname( "PRDOKOTEX_"+sGXsfl_45_fel_idx );
      edtPrdHm_Internalname = "PRDHM_"+sGXsfl_45_fel_idx ;
      cmbPrdZDHC.setInternalname( "PRDZDHC_"+sGXsfl_45_fel_idx );
      cmbPrdList.setInternalname( "PRDLIST_"+sGXsfl_45_fel_idx );
      edtPrdTHELIST_Internalname = "PRDTHELIST_"+sGXsfl_45_fel_idx ;
      edtPrdHS_Internalname = "PRDHS_"+sGXsfl_45_fel_idx ;
      edtPrdFHS_Internalname = "PRDFHS_"+sGXsfl_45_fel_idx ;
      chkPrdEsCompu.setInternalname( "PRDESCOMPU_"+sGXsfl_45_fel_idx );
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_45_fel_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_45_fel_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_45_fel_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_45_fel_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_45_fel_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_45_fel_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb13I0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavDetailwebcomponent_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV70DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"'"+""+"'"+",false,"+"'"+"e2413i2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(edtavDetailwebcomponent_Visible),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_45_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV34GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV34GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV34GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_45_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV34GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtPrdNom_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtPrdNom_Forecolor)+";"+((edtPrdNom_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtPrdNom_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdAox_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAox_Internalname,GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9733PrdAox, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdAox_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdAox_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdGots_Internalname,GXutil.rtrim( A11363PrdGots),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdGots_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdGots_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdReach_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdReach_Internalname,GXutil.rtrim( A5887PrdReach),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdReach_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdReach_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdOkotex.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdOkotex.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDOKOTEX_" + sGXsfl_45_idx ;
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
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdHm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHm_Internalname,GXutil.rtrim( A11364PrdHm),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdHm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdHm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdZDHC.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdZDHC.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDZDHC_" + sGXsfl_45_idx ;
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
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdZDHC.getInternalname(), "Values", cmbPrdZDHC.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdList.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdList.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDLIST_" + sGXsfl_45_idx ;
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
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdTHELIST_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdTHELIST_Internalname,GXutil.rtrim( A13302PrdTHELIST),GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdTHELIST_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdTHELIST_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdHS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHS_Internalname,GXutil.rtrim( A9741PrdHS),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdHS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdHS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdFHS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFHS_Internalname,localUtil.format(A9742PrdFHS, "99/99/99"),localUtil.format( A9742PrdFHS, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFHS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdFHS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkPrdEsCompu.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PRDESCOMPU_" + sGXsfl_45_idx ;
         chkPrdEsCompu.setName( GXCCtl );
         chkPrdEsCompu.setWebtags( "" );
         chkPrdEsCompu.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkPrdEsCompu.getInternalname(), "TitleCaption", chkPrdEsCompu.getCaption(), !bGXsfl_45_Refreshing);
         chkPrdEsCompu.setCheckedValue( "false" );
         A13881PrdEsCompu = GXutil.strtobool( GXutil.booltostr( A13881PrdEsCompu)) ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPrdEsCompu.getInternalname(),GXutil.booltostr( A13881PrdEsCompu),"","",Integer.valueOf(chkPrdEsCompu.getVisible()),Integer.valueOf(0),"true","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV39PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39PrdRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrdrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrdrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV40R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV40R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV40R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV41G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV42B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV43R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV43R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV43R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV44G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV44G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV44G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV45B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV45B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV45B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes13I2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDetailwebcomponent_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAox_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "AOX (adsorbable organic halogens)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "GOTS", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "Hoja Seguridad?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFHS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hoja Seguridad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkPrdEsCompu.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Es Compuesto", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV70DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34GridActions, (byte)(4), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( A13881PrdEsCompu));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkPrdEsCompu.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV43R2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44G2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45B2, (byte)(3), (byte)(0), ".", "")));
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
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
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
      chkPrdEsCompu.setInternalname( "PRDESCOMPU" );
      edtavPrdrgb_Internalname = "vPRDRGB" ;
      edtavR_Internalname = "vR" ;
      edtavG_Internalname = "vG" ;
      edtavB_Internalname = "vB" ;
      edtavR2_Internalname = "vR2" ;
      edtavG2_Internalname = "vG2" ;
      edtavB2_Internalname = "vB2" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_prdfhsauxdate_Internalname = "vDDO_PRDFHSAUXDATE" ;
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
      chkPrdEsCompu.setCaption( "" );
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
      edtPrdNum_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Forecolor = (int)(0x000000) ;
      edtPrdNom_Backcolor = -1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Enabled = 1 ;
      edtavDetailwebcomponent_Visible = -1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkPrdEsCompu.setVisible( -1 );
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
      edtPrdNum_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_prdfhsauxdate_Jsonclick = "" ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Fixedcolumns = ";L;;;;;;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "StocksQuimicos.PRODUCWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||N:N,S:S||N:N,1:Nivel 1,2:Nivel 2,3:Nivel 3|S:S,N:N||||1:WWP_TSChecked,2:WWP_TSUnChecked" ;
      Ddo_grid_Allowmultipleselection = "|||||T||T|T||||" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||Dynamic|Dynamic|FixedValues|Dynamic|FixedValues|FixedValues|Dynamic|Dynamic||FixedValues" ;
      Ddo_grid_Includedatalist = "T|T||T|T|T|T|T|T|T|T||T" ;
      Ddo_grid_Filterisrange = "||T||||||||||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Character|Character||Character|||Character|Character|Date|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T||T|||T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|||||||||" ;
      Ddo_grid_Columnssortvalues = "1|2||3|||||||||" ;
      Ddo_grid_Columnids = "2:PrdNom|3:PrdNum|4:PrdAox|5:PrdGots|6:PrdReach|7:PrdOkotex|8:PrdHm|9:PrdZDHC|10:PrdList|11:PrdTHELIST|12:PrdHS|13:PrdFHS|14:PrdEsCompuesto" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Productos Quimicos", "") );
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
         AV34GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV34GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridActions), 4, 0));
      }
      GXCCtl = "PRDOKOTEX_" + sGXsfl_45_idx ;
      cmbPrdOkotex.setName( GXCCtl );
      cmbPrdOkotex.setWebtags( "" );
      cmbPrdOkotex.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdOkotex.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
         A5888PrdOkotex = cmbPrdOkotex.getValidValue(A5888PrdOkotex) ;
      }
      GXCCtl = "PRDZDHC_" + sGXsfl_45_idx ;
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
      GXCCtl = "PRDLIST_" + sGXsfl_45_idx ;
      cmbPrdList.setName( GXCCtl );
      cmbPrdList.setWebtags( "" );
      cmbPrdList.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbPrdList.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbPrdList.getItemCount() > 0 )
      {
         A11687PrdList = cmbPrdList.getValidValue(A11687PrdList) ;
      }
      GXCCtl = "PRDESCOMPU_" + sGXsfl_45_idx ;
      chkPrdEsCompu.setName( GXCCtl );
      chkPrdEsCompu.setWebtags( "" );
      chkPrdEsCompu.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdEsCompu.getInternalname(), "TitleCaption", chkPrdEsCompu.getCaption(), !bGXsfl_45_Refreshing);
      chkPrdEsCompu.setCheckedValue( "false" );
      A13881PrdEsCompu = GXutil.strtobool( GXutil.booltostr( A13881PrdEsCompu)) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'chkPrdEsCompu.getVisible()',ctrl:'PRDESCOMPU',prop:'Visible'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1213I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1313I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1413I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV58TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV56TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV52TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2213I2',iparms:[{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'edtavDetailwebcomponent_Visible',ctrl:'vDETAILWEBCOMPONENT',prop:'Visible'},{av:'AV70DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'cmbavGridactions'},{av:'AV34GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV39PrdRGB',fld:'vPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV45B2',fld:'vB2',pic:'ZZ9'},{av:'AV44G2',fld:'vG2',pic:'ZZ9'},{av:'AV43R2',fld:'vR2',pic:'ZZ9'},{av:'AV42B',fld:'vB',pic:'ZZ9'},{av:'AV41G',fld:'vG',pic:'ZZ9'},{av:'AV40R',fld:'vR',pic:'ZZ9'},{av:'edtPrdNom_Backcolor',ctrl:'PRDNOM',prop:'Backcolor'},{av:'edtPrdNom_Forecolor',ctrl:'PRDNOM',prop:'Forecolor'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1513I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'chkPrdEsCompu.getVisible()',ctrl:'PRDESCOMPU',prop:'Visible'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1113I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV52TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV56TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV58TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV58TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV56TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV52TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'chkPrdEsCompu.getVisible()',ctrl:'PRDESCOMPU',prop:'Visible'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2313I2',iparms:[{av:'cmbavGridactions'},{av:'AV34GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true},{av:'A13302PrdTHELIST',fld:'PRDTHELIST',pic:'@!'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV34GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A13302PrdTHELIST',fld:'PRDTHELIST',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'chkPrdEsCompu.getVisible()',ctrl:'PRDESCOMPU',prop:'Visible'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1613I2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1713I2',iparms:[{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV52TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV56TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV58TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV58TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV56TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV52TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1813I2',iparms:[{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV52TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV56TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV58TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV58TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV56TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV52TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1913I2',iparms:[{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV52TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV56TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV58TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV27TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV47TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV48TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV49TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV50TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV51TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV54TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV55TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV60TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV61TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV62TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV63TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV64TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV71TFPrdEsCompuesto_Sel',fld:'vTFPRDESCOMPUESTO_SEL',pic:'9'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV68ProPrv',fld:'vPROPRV',pic:'ZZZ9',hsh:true},{av:'AV69CnoEnc',fld:'vCNOENC',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV58TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV56TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV52TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e2413I2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDAOX","{handler:'valid_Prdaox',iparms:[]");
      setEventMetadata("VALID_PRDAOX",",oparms:[]}");
      setEventMetadata("VALID_PRDGOTS","{handler:'valid_Prdgots',iparms:[]");
      setEventMetadata("VALID_PRDGOTS",",oparms:[]}");
      setEventMetadata("VALID_PRDREACH","{handler:'valid_Prdreach',iparms:[]");
      setEventMetadata("VALID_PRDREACH",",oparms:[]}");
      setEventMetadata("VALID_PRDOKOTEX","{handler:'valid_Prdokotex',iparms:[]");
      setEventMetadata("VALID_PRDOKOTEX",",oparms:[]}");
      setEventMetadata("VALID_PRDHM","{handler:'valid_Prdhm',iparms:[]");
      setEventMetadata("VALID_PRDHM",",oparms:[]}");
      setEventMetadata("VALID_PRDZDHC","{handler:'valid_Prdzdhc',iparms:[]");
      setEventMetadata("VALID_PRDZDHC",",oparms:[]}");
      setEventMetadata("VALID_PRDLIST","{handler:'valid_Prdlist',iparms:[]");
      setEventMetadata("VALID_PRDLIST",",oparms:[]}");
      setEventMetadata("VALID_PRDTHELIST","{handler:'valid_Prdthelist',iparms:[]");
      setEventMetadata("VALID_PRDTHELIST",",oparms:[]}");
      setEventMetadata("VALID_PRDHS","{handler:'valid_Prdhs',iparms:[]");
      setEventMetadata("VALID_PRDHS",",oparms:[]}");
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
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV26TFPrdNom = "" ;
      AV27TFPrdNom_Sel = "" ;
      AV28TFPrdNum = "" ;
      AV29TFPrdNum_Sel = "" ;
      AV46TFPrdAox = DecimalUtil.ZERO ;
      AV47TFPrdAox_To = DecimalUtil.ZERO ;
      AV48TFPrdGots = "" ;
      AV49TFPrdGots_Sel = "" ;
      AV50TFPrdReach = "" ;
      AV51TFPrdReach_Sel = "" ;
      AV53TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54TFPrdHm = "" ;
      AV55TFPrdHm_Sel = "" ;
      AV57TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV59TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60TFPrdTHELIST = "" ;
      AV61TFPrdTHELIST_Sel = "" ;
      AV62TFPrdHS = "" ;
      AV63TFPrdHS_Sel = "" ;
      AV64TFPrdFHS = GXutil.nullDate() ;
      AV97Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV30DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52TFPrdOkotex_SelsJson = "" ;
      AV56TFPrdZDHC_SelsJson = "" ;
      AV58TFPrdList_SelsJson = "" ;
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
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV66DDO_PrdFHSAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV70DetailWebComponent = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
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
      AV75Stocksquimicos_producwwds_1_filterfulltext = "" ;
      AV76Stocksquimicos_producwwds_2_tfprdnom = "" ;
      AV77Stocksquimicos_producwwds_3_tfprdnom_sel = "" ;
      AV78Stocksquimicos_producwwds_4_tfprdnum = "" ;
      AV79Stocksquimicos_producwwds_5_tfprdnum_sel = "" ;
      AV80Stocksquimicos_producwwds_6_tfprdaox = DecimalUtil.ZERO ;
      AV81Stocksquimicos_producwwds_7_tfprdaox_to = DecimalUtil.ZERO ;
      AV82Stocksquimicos_producwwds_8_tfprdgots = "" ;
      AV83Stocksquimicos_producwwds_9_tfprdgots_sel = "" ;
      AV84Stocksquimicos_producwwds_10_tfprdreach = "" ;
      AV85Stocksquimicos_producwwds_11_tfprdreach_sel = "" ;
      AV86Stocksquimicos_producwwds_12_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV87Stocksquimicos_producwwds_13_tfprdhm = "" ;
      AV88Stocksquimicos_producwwds_14_tfprdhm_sel = "" ;
      AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV90Stocksquimicos_producwwds_16_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV91Stocksquimicos_producwwds_17_tfprdthelist = "" ;
      AV92Stocksquimicos_producwwds_18_tfprdthelist_sel = "" ;
      AV93Stocksquimicos_producwwds_19_tfprdhs = "" ;
      AV94Stocksquimicos_producwwds_20_tfprdhs_sel = "" ;
      AV95Stocksquimicos_producwwds_21_tfprdfhs = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV75Stocksquimicos_producwwds_1_filterfulltext = "" ;
      lV76Stocksquimicos_producwwds_2_tfprdnom = "" ;
      lV78Stocksquimicos_producwwds_4_tfprdnum = "" ;
      lV82Stocksquimicos_producwwds_8_tfprdgots = "" ;
      lV84Stocksquimicos_producwwds_10_tfprdreach = "" ;
      lV87Stocksquimicos_producwwds_13_tfprdhm = "" ;
      lV91Stocksquimicos_producwwds_17_tfprdthelist = "" ;
      lV93Stocksquimicos_producwwds_19_tfprdhs = "" ;
      H013I2_A396EmprCod = new String[] {""} ;
      H013I2_A13232PrdRGB = new long[1] ;
      H013I2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H013I2_A9741PrdHS = new String[] {""} ;
      H013I2_A13302PrdTHELIST = new String[] {""} ;
      H013I2_n13302PrdTHELIST = new boolean[] {false} ;
      H013I2_A11687PrdList = new String[] {""} ;
      H013I2_A13301PrdZDHC = new String[] {""} ;
      H013I2_A11364PrdHm = new String[] {""} ;
      H013I2_A5888PrdOkotex = new String[] {""} ;
      H013I2_A5887PrdReach = new String[] {""} ;
      H013I2_A11363PrdGots = new String[] {""} ;
      H013I2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013I2_A718PrdNom = new String[] {""} ;
      H013I2_A719PrdNum = new String[] {""} ;
      H013I3_A396EmprCod = new String[] {""} ;
      H013I3_A13232PrdRGB = new long[1] ;
      H013I3_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H013I3_A9741PrdHS = new String[] {""} ;
      H013I3_A13302PrdTHELIST = new String[] {""} ;
      H013I3_n13302PrdTHELIST = new boolean[] {false} ;
      H013I3_A11687PrdList = new String[] {""} ;
      H013I3_A13301PrdZDHC = new String[] {""} ;
      H013I3_A11364PrdHm = new String[] {""} ;
      H013I3_A5888PrdOkotex = new String[] {""} ;
      H013I3_A5887PrdReach = new String[] {""} ;
      H013I3_A11363PrdGots = new String[] {""} ;
      H013I3_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013I3_A718PrdNom = new String[] {""} ;
      H013I3_A719PrdNum = new String[] {""} ;
      AV35Station = "" ;
      AV36EmprNom = "" ;
      AV37UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV74Emprcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
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
      GXv_SdtWWPGridState36 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.producww__default(),
         new Object[] {
             new Object[] {
            H013I2_A396EmprCod, H013I2_A13232PrdRGB, H013I2_A9742PrdFHS, H013I2_A9741PrdHS, H013I2_A13302PrdTHELIST, H013I2_n13302PrdTHELIST, H013I2_A11687PrdList, H013I2_A13301PrdZDHC, H013I2_A11364PrdHm, H013I2_A5888PrdOkotex,
            H013I2_A5887PrdReach, H013I2_A11363PrdGots, H013I2_A9733PrdAox, H013I2_A718PrdNom, H013I2_A719PrdNum
            }
            , new Object[] {
            H013I3_A396EmprCod, H013I3_A13232PrdRGB, H013I3_A9742PrdFHS, H013I3_A9741PrdHS, H013I3_A13302PrdTHELIST, H013I3_n13302PrdTHELIST, H013I3_A11687PrdList, H013I3_A13301PrdZDHC, H013I3_A11364PrdHm, H013I3_A5888PrdOkotex,
            H013I3_A5887PrdReach, H013I3_A11363PrdGots, H013I3_A9733PrdAox, H013I3_A718PrdNom, H013I3_A719PrdNum
            }
         }
      );
      AV97Pgmname = "StocksQuimicos.PRODUCWW" ;
      /* GeneXus formulas. */
      AV97Pgmname = "StocksQuimicos.PRODUCWW" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavPrdrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV71TFPrdEsCompuesto_Sel ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel ;
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
   private short AV68ProPrv ;
   private short AV69CnoEnc ;
   private short wbEnd ;
   private short wbStart ;
   private short AV34GridActions ;
   private short AV40R ;
   private short AV41G ;
   private short AV42B ;
   private short AV43R2 ;
   private short AV44G2 ;
   private short AV45B2 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV38SiRGB ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short GXv_int13[] ;
   private short GXv_int14[] ;
   private short GXv_int15[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavPrdrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavR2_Enabled ;
   private int edtavG2_Enabled ;
   private int edtavB2_Enabled ;
   private int AV86Stocksquimicos_producwwds_12_tfprdokotex_sels_size ;
   private int AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ;
   private int AV90Stocksquimicos_producwwds_16_tfprdlist_sels_size ;
   private int edtPrdNom_Visible ;
   private int edtPrdNum_Visible ;
   private int edtPrdAox_Visible ;
   private int edtPrdGots_Visible ;
   private int edtPrdReach_Visible ;
   private int edtPrdHm_Visible ;
   private int edtPrdTHELIST_Visible ;
   private int edtPrdHS_Visible ;
   private int edtPrdFHS_Visible ;
   private int AV31PageToGo ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtPrdNom_Backcolor ;
   private int edtPrdNom_Forecolor ;
   private int AV98GXV1 ;
   private int edtavFilterfulltext_Enabled ;
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
   private long AV32GridCurrentPage ;
   private long AV33GridPageCount ;
   private long A13232PrdRGB ;
   private long AV39PrdRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV46TFPrdAox ;
   private java.math.BigDecimal AV47TFPrdAox_To ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV80Stocksquimicos_producwwds_6_tfprdaox ;
   private java.math.BigDecimal AV81Stocksquimicos_producwwds_7_tfprdaox_to ;
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
   private String A396EmprCod ;
   private String AV26TFPrdNom ;
   private String AV27TFPrdNom_Sel ;
   private String AV28TFPrdNum ;
   private String AV29TFPrdNum_Sel ;
   private String AV48TFPrdGots ;
   private String AV49TFPrdGots_Sel ;
   private String AV50TFPrdReach ;
   private String AV51TFPrdReach_Sel ;
   private String AV54TFPrdHm ;
   private String AV55TFPrdHm_Sel ;
   private String AV60TFPrdTHELIST ;
   private String AV61TFPrdTHELIST_Sel ;
   private String AV62TFPrdHS ;
   private String AV63TFPrdHS_Sel ;
   private String AV97Pgmname ;
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
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_prdfhsauxdates_Internalname ;
   private String edtavDdo_prdfhsauxdate_Internalname ;
   private String edtavDdo_prdfhsauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV70DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
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
   private String edtavPrdrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavR2_Internalname ;
   private String edtavG2_Internalname ;
   private String edtavB2_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV76Stocksquimicos_producwwds_2_tfprdnom ;
   private String AV77Stocksquimicos_producwwds_3_tfprdnom_sel ;
   private String AV78Stocksquimicos_producwwds_4_tfprdnum ;
   private String AV79Stocksquimicos_producwwds_5_tfprdnum_sel ;
   private String AV82Stocksquimicos_producwwds_8_tfprdgots ;
   private String AV83Stocksquimicos_producwwds_9_tfprdgots_sel ;
   private String AV84Stocksquimicos_producwwds_10_tfprdreach ;
   private String AV85Stocksquimicos_producwwds_11_tfprdreach_sel ;
   private String AV87Stocksquimicos_producwwds_13_tfprdhm ;
   private String AV88Stocksquimicos_producwwds_14_tfprdhm_sel ;
   private String AV91Stocksquimicos_producwwds_17_tfprdthelist ;
   private String AV92Stocksquimicos_producwwds_18_tfprdthelist_sel ;
   private String AV93Stocksquimicos_producwwds_19_tfprdhs ;
   private String AV94Stocksquimicos_producwwds_20_tfprdhs_sel ;
   private String scmdbuf ;
   private String lV76Stocksquimicos_producwwds_2_tfprdnom ;
   private String lV78Stocksquimicos_producwwds_4_tfprdnum ;
   private String lV82Stocksquimicos_producwwds_8_tfprdgots ;
   private String lV84Stocksquimicos_producwwds_10_tfprdreach ;
   private String lV87Stocksquimicos_producwwds_13_tfprdhm ;
   private String lV91Stocksquimicos_producwwds_17_tfprdthelist ;
   private String lV93Stocksquimicos_producwwds_19_tfprdhs ;
   private String AV35Station ;
   private String AV36EmprNom ;
   private String AV37UsurCod ;
   private String AV74Emprcod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char20 ;
   private String GXv_char3[] ;
   private String GXt_char21 ;
   private String GXv_char2[] ;
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
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String GXCCtl ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdAox_Jsonclick ;
   private String edtPrdGots_Jsonclick ;
   private String edtPrdReach_Jsonclick ;
   private String edtPrdHm_Jsonclick ;
   private String edtPrdTHELIST_Jsonclick ;
   private String edtPrdHS_Jsonclick ;
   private String edtPrdFHS_Jsonclick ;
   private String edtavPrdrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavR2_Jsonclick ;
   private String edtavG2_Jsonclick ;
   private String edtavB2_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV64TFPrdFHS ;
   private java.util.Date AV66DDO_PrdFHSAuxDate ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV95Stocksquimicos_producwwds_21_tfprdfhs ;
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
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n13302PrdTHELIST ;
   private boolean A13881PrdEsCompu ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV52TFPrdOkotex_SelsJson ;
   private String AV56TFPrdZDHC_SelsJson ;
   private String AV58TFPrdList_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV75Stocksquimicos_producwwds_1_filterfulltext ;
   private String lV75Stocksquimicos_producwwds_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbPrdOkotex ;
   private HTMLChoice cmbPrdZDHC ;
   private HTMLChoice cmbPrdList ;
   private ICheckbox chkPrdEsCompu ;
   private IDataStoreProvider pr_default ;
   private String[] H013I2_A396EmprCod ;
   private long[] H013I2_A13232PrdRGB ;
   private java.util.Date[] H013I2_A9742PrdFHS ;
   private String[] H013I2_A9741PrdHS ;
   private String[] H013I2_A13302PrdTHELIST ;
   private boolean[] H013I2_n13302PrdTHELIST ;
   private String[] H013I2_A11687PrdList ;
   private String[] H013I2_A13301PrdZDHC ;
   private String[] H013I2_A11364PrdHm ;
   private String[] H013I2_A5888PrdOkotex ;
   private String[] H013I2_A5887PrdReach ;
   private String[] H013I2_A11363PrdGots ;
   private java.math.BigDecimal[] H013I2_A9733PrdAox ;
   private String[] H013I2_A718PrdNom ;
   private String[] H013I2_A719PrdNum ;
   private String[] H013I3_A396EmprCod ;
   private long[] H013I3_A13232PrdRGB ;
   private java.util.Date[] H013I3_A9742PrdFHS ;
   private String[] H013I3_A9741PrdHS ;
   private String[] H013I3_A13302PrdTHELIST ;
   private boolean[] H013I3_n13302PrdTHELIST ;
   private String[] H013I3_A11687PrdList ;
   private String[] H013I3_A13301PrdZDHC ;
   private String[] H013I3_A11364PrdHm ;
   private String[] H013I3_A5888PrdOkotex ;
   private String[] H013I3_A5887PrdReach ;
   private String[] H013I3_A11363PrdGots ;
   private java.math.BigDecimal[] H013I3_A9733PrdAox ;
   private String[] H013I3_A718PrdNom ;
   private String[] H013I3_A719PrdNum ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV53TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV57TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV59TFPrdList_Sels ;
   private GXSimpleCollection<String> AV86Stocksquimicos_producwwds_12_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV90Stocksquimicos_producwwds_16_tfprdlist_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState36[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV30DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class producww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H013I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV86Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV90Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV77Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV76Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV79Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV78Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV80Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV81Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV83Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV82Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV85Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV84Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV86Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV88Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV87Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV90Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV92Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV91Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV94Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV93Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV95Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV75Stocksquimicos_producwwds_1_filterfulltext ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int37 = new byte[18];
      Object[] GXv_Object38 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdRGB, PrdFHS, PrdHS, PrdTHELIST, PrdList, PrdZDHC, PrdHm, PrdOkotex, PrdReach, PrdGots, PrdAox, PrdNom, PrdNum FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( (GXutil.strcmp("", AV77Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int37[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV78Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int37[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int37[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int37[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV82Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int37[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV84Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int37[10] = (byte)(1) ;
      }
      if ( AV86Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int37[12] = (byte)(1) ;
      }
      if ( AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV90Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV90Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int37[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int37[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int37[17] = (byte)(1) ;
      }
      if ( AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdGots DESC" ;
      }
      GXv_Object38[0] = scmdbuf ;
      GXv_Object38[1] = GXv_int37 ;
      return GXv_Object38 ;
   }

   protected Object[] conditional_H013I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV86Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV90Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV77Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV76Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV79Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV78Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV80Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV81Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV83Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV82Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV85Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV84Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV86Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV88Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV87Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV90Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV92Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV91Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV94Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV93Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV95Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV75Stocksquimicos_producwwds_1_filterfulltext ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int40 = new byte[18];
      Object[] GXv_Object41 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdRGB, PrdFHS, PrdHS, PrdTHELIST, PrdList, PrdZDHC, PrdHm, PrdOkotex, PrdReach, PrdGots, PrdAox, PrdNom, PrdNum FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( (GXutil.strcmp("", AV77Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int40[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV78Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int40[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int40[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int40[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV82Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int40[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV84Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int40[10] = (byte)(1) ;
      }
      if ( AV86Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int40[12] = (byte)(1) ;
      }
      if ( AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV89Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV90Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV90Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int40[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int40[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int40[17] = (byte)(1) ;
      }
      if ( AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV96Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdGots DESC" ;
      }
      GXv_Object41[0] = scmdbuf ;
      GXv_Object41[1] = GXv_int40 ;
      return GXv_Object41 ;
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
                  return conditional_H013I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 1 :
                  return conditional_H013I3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H013I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H013I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((String[]) buf[14])[0] = rslt.getString(14, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((String[]) buf[14])[0] = rslt.getString(14, 6);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               return;
      }
   }

}

