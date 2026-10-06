package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class productoww_impl extends GXDataArea
{
   public productoww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public productoww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productoww_impl.class ));
   }

   public productoww_impl( int remoteHandle ,
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
      cmbPrdGRS = new HTMLChoice();
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV163Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV26TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV27TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV28TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV29TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV106TFPrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm"), ".") ;
      AV107TFPrdExiAlm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm_To"), ".") ;
      AV108TFPrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes"), ".") ;
      AV109TFPrdCanRes_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes_To"), ".") ;
      AV135TFPrdDisponible = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdDisponible"), ".") ;
      AV136TFPrdDisponible_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdDisponible_To"), ".") ;
      AV110TFPrdCanPen = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanPen"), ".") ;
      AV111TFPrdCanPen_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanPen_To"), ".") ;
      AV97TFPrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct"), ".") ;
      AV98TFPrdPreAct_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct_To"), ".") ;
      AV112TFTipPrdDsc = httpContext.GetPar( "TFTipPrdDsc") ;
      AV113TFTipPrdDsc_Sel = httpContext.GetPar( "TFTipPrdDsc_Sel") ;
      AV81TFValDsc = httpContext.GetPar( "TFValDsc") ;
      AV82TFValDsc_Sel = httpContext.GetPar( "TFValDsc_Sel") ;
      AV83TFPrdRec = httpContext.GetPar( "TFPrdRec") ;
      AV84TFPrdRec_Sel = httpContext.GetPar( "TFPrdRec_Sel") ;
      AV39TFPrdAox = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAox"), ".") ;
      AV40TFPrdAox_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAox_To"), ".") ;
      AV41TFPrdGots = httpContext.GetPar( "TFPrdGots") ;
      AV42TFPrdGots_Sel = httpContext.GetPar( "TFPrdGots_Sel") ;
      AV43TFPrdReach = httpContext.GetPar( "TFPrdReach") ;
      AV44TFPrdReach_Sel = httpContext.GetPar( "TFPrdReach_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV46TFPrdOkotex_Sels);
      AV47TFPrdHm = httpContext.GetPar( "TFPrdHm") ;
      AV48TFPrdHm_Sel = httpContext.GetPar( "TFPrdHm_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV50TFPrdZDHC_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV52TFPrdList_Sels);
      AV53TFPrdTHELIST = httpContext.GetPar( "TFPrdTHELIST") ;
      AV54TFPrdTHELIST_Sel = httpContext.GetPar( "TFPrdTHELIST_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV115TFPrdGRS_Sels);
      AV55TFPrdHS = httpContext.GetPar( "TFPrdHS") ;
      AV56TFPrdHS_Sel = httpContext.GetPar( "TFPrdHS_Sel") ;
      AV57TFPrdFHS = localUtil.parseDateParm( httpContext.GetPar( "TFPrdFHS")) ;
      AV58TFPrdFHS_To = localUtil.parseDateParm( httpContext.GetPar( "TFPrdFHS_To")) ;
      AV116TFPrdNum2 = httpContext.GetPar( "TFPrdNum2") ;
      AV117TFPrdNum2_Sel = httpContext.GetPar( "TFPrdNum2_Sel") ;
      AV118TFPrdNom2 = httpContext.GetPar( "TFPrdNom2") ;
      AV119TFPrdNom2_Sel = httpContext.GetPar( "TFPrdNom2_Sel") ;
      AV65TFPrdRefPrv = httpContext.GetPar( "TFPrdRefPrv") ;
      AV66TFPrdRefPrv_Sel = httpContext.GetPar( "TFPrdRefPrv_Sel") ;
      AV120TFPrdFuncion = httpContext.GetPar( "TFPrdFuncion") ;
      AV121TFPrdFuncion_Sel = httpContext.GetPar( "TFPrdFuncion_Sel") ;
      AV122TFPrdEINECS = httpContext.GetPar( "TFPrdEINECS") ;
      AV123TFPrdEINECS_Sel = httpContext.GetPar( "TFPrdEINECS_Sel") ;
      AV124TFPrdNCAS = httpContext.GetPar( "TFPrdNCAS") ;
      AV125TFPrdNCAS_Sel = httpContext.GetPar( "TFPrdNCAS_Sel") ;
      AV30TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV31TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV32TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV33TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV144TFPrdRGB = GXutil.lval( httpContext.GetPar( "TFPrdRGB")) ;
      AV145TFPrdRGB_To = GXutil.lval( httpContext.GetPar( "TFPrdRGB_To")) ;
      AV159TFPrdGruFamDc = httpContext.GetPar( "TFPrdGruFamDc") ;
      AV160TFPrdGruFamDc_Sel = httpContext.GetPar( "TFPrdGruFamDc_Sel") ;
      AV157TFPrdPreAc2 = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAc2"), ".") ;
      AV158TFPrdPreAc2_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAc2_To"), ".") ;
      AV99TFPrdFecPre = localUtil.parseDateParm( httpContext.GetPar( "TFPrdFecPre")) ;
      AV103TFPrdPreAnt = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAnt"), ".") ;
      AV104TFPrdPreAnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAnt_To"), ".") ;
      AV146SiRGB = (short)(GXutil.lval( httpContext.GetPar( "SiRGB"))) ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV163Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV106TFPrdExiAlm, AV107TFPrdExiAlm_To, AV108TFPrdCanRes, AV109TFPrdCanRes_To, AV135TFPrdDisponible, AV136TFPrdDisponible_To, AV110TFPrdCanPen, AV111TFPrdCanPen_To, AV97TFPrdPreAct, AV98TFPrdPreAct_To, AV112TFTipPrdDsc, AV113TFTipPrdDsc_Sel, AV81TFValDsc, AV82TFValDsc_Sel, AV83TFPrdRec, AV84TFPrdRec_Sel, AV39TFPrdAox, AV40TFPrdAox_To, AV41TFPrdGots, AV42TFPrdGots_Sel, AV43TFPrdReach, AV44TFPrdReach_Sel, AV46TFPrdOkotex_Sels, AV47TFPrdHm, AV48TFPrdHm_Sel, AV50TFPrdZDHC_Sels, AV52TFPrdList_Sels, AV53TFPrdTHELIST, AV54TFPrdTHELIST_Sel, AV115TFPrdGRS_Sels, AV55TFPrdHS, AV56TFPrdHS_Sel, AV57TFPrdFHS, AV58TFPrdFHS_To, AV116TFPrdNum2, AV117TFPrdNum2_Sel, AV118TFPrdNom2, AV119TFPrdNom2_Sel, AV65TFPrdRefPrv, AV66TFPrdRefPrv_Sel, AV120TFPrdFuncion, AV121TFPrdFuncion_Sel, AV122TFPrdEINECS, AV123TFPrdEINECS_Sel, AV124TFPrdNCAS, AV125TFPrdNCAS_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV144TFPrdRGB, AV145TFPrdRGB_To, AV159TFPrdGruFamDc, AV160TFPrdGruFamDc_Sel, AV157TFPrdPreAc2, AV158TFPrdPreAc2_To, AV99TFPrdFecPre, AV103TFPrdPreAnt, AV104TFPrdPreAnt_To, AV146SiRGB, Gx_date) ;
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
      pa1QY2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1QY2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.productoww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV146SiRGB), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ProductoWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV163Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\productoww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV36GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV37GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV26TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV27TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV28TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV29TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXIALM", GXutil.ltrim( localUtil.ntoc( AV106TFPrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXIALM_TO", GXutil.ltrim( localUtil.ntoc( AV107TFPrdExiAlm_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANRES", GXutil.ltrim( localUtil.ntoc( AV108TFPrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANRES_TO", GXutil.ltrim( localUtil.ntoc( AV109TFPrdCanRes_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDDISPONIBLE", GXutil.ltrim( localUtil.ntoc( AV135TFPrdDisponible, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDDISPONIBLE_TO", GXutil.ltrim( localUtil.ntoc( AV136TFPrdDisponible_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANPEN", GXutil.ltrim( localUtil.ntoc( AV110TFPrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANPEN_TO", GXutil.ltrim( localUtil.ntoc( AV111TFPrdCanPen_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREACT", GXutil.ltrim( localUtil.ntoc( AV97TFPrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREACT_TO", GXutil.ltrim( localUtil.ntoc( AV98TFPrdPreAct_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPPRDDSC", GXutil.rtrim( AV112TFTipPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPPRDDSC_SEL", GXutil.rtrim( AV113TFTipPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALDSC", GXutil.rtrim( AV81TFValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALDSC_SEL", GXutil.rtrim( AV82TFValDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREC", GXutil.rtrim( AV83TFPrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREC_SEL", GXutil.rtrim( AV84TFPrdRec_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDAOX", GXutil.ltrim( localUtil.ntoc( AV39TFPrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDAOX_TO", GXutil.ltrim( localUtil.ntoc( AV40TFPrdAox_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGOTS", GXutil.rtrim( AV41TFPrdGots));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGOTS_SEL", GXutil.rtrim( AV42TFPrdGots_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREACH", GXutil.rtrim( AV43TFPrdReach));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREACH_SEL", GXutil.rtrim( AV44TFPrdReach_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRDOKOTEX_SELS", AV46TFPrdOkotex_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRDOKOTEX_SELS", AV46TFPrdOkotex_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHM", GXutil.rtrim( AV47TFPrdHm));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHM_SEL", GXutil.rtrim( AV48TFPrdHm_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRDZDHC_SELS", AV50TFPrdZDHC_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRDZDHC_SELS", AV50TFPrdZDHC_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRDLIST_SELS", AV52TFPrdList_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRDLIST_SELS", AV52TFPrdList_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDTHELIST", GXutil.rtrim( AV53TFPrdTHELIST));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDTHELIST_SEL", GXutil.rtrim( AV54TFPrdTHELIST_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPRDGRS_SELS", AV115TFPrdGRS_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPRDGRS_SELS", AV115TFPrdGRS_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHS", GXutil.rtrim( AV55TFPrdHS));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDHS_SEL", GXutil.rtrim( AV56TFPrdHS_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFHS", localUtil.dtoc( AV57TFPrdFHS, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFHS_TO", localUtil.dtoc( AV58TFPrdFHS_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM2", GXutil.rtrim( AV116TFPrdNum2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM2_SEL", GXutil.rtrim( AV117TFPrdNum2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM2", GXutil.rtrim( AV118TFPrdNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM2_SEL", GXutil.rtrim( AV119TFPrdNom2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREFPRV", GXutil.rtrim( AV65TFPrdRefPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDREFPRV_SEL", GXutil.rtrim( AV66TFPrdRefPrv_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFUNCION", GXutil.rtrim( AV120TFPrdFuncion));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFUNCION_SEL", GXutil.rtrim( AV121TFPrdFuncion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEINECS", GXutil.rtrim( AV122TFPrdEINECS));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEINECS_SEL", GXutil.rtrim( AV123TFPrdEINECS_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNCAS", GXutil.rtrim( AV124TFPrdNCAS));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNCAS_SEL", GXutil.rtrim( AV125TFPrdNCAS_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV30TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV31TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNOM", GXutil.rtrim( AV32TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNOM_SEL", GXutil.rtrim( AV33TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDRGB", GXutil.ltrim( localUtil.ntoc( AV144TFPrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDRGB_TO", GXutil.ltrim( localUtil.ntoc( AV145TFPrdRGB_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGRUFAMDC", GXutil.rtrim( AV159TFPrdGruFamDc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGRUFAMDC_SEL", GXutil.rtrim( AV160TFPrdGruFamDc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREAC2", GXutil.ltrim( localUtil.ntoc( AV157TFPrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREAC2_TO", GXutil.ltrim( localUtil.ntoc( AV158TFPrdPreAc2_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFECPRE", localUtil.dtoc( AV99TFPrdFecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREANT", GXutil.ltrim( localUtil.ntoc( AV103TFPrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREANT_TO", GXutil.ltrim( localUtil.ntoc( AV104TFPrdPreAnt_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIRGB", GXutil.ltrim( localUtil.ntoc( AV146SiRGB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV146SiRGB), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDOKOTEX_SELSJSON", AV45TFPrdOkotex_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDZDHC_SELSJSON", AV49TFPrdZDHC_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDLIST_SELSJSON", AV51TFPrdList_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGRS_SELSJSON", AV114TFPrdGRS_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDRGB", GXutil.ltrim( localUtil.ntoc( AV143PrdRgb, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV133EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPRDTHELIST", GXutil.rtrim( AV134OldPrdTHELIST));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV128UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV126Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "vACTIVE_EMPRCOD", GXutil.rtrim( AV138Active_EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vACTIVE_PRDNUM", GXutil.rtrim( AV139Active_PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vACTIVE_PRDNOM", GXutil.rtrim( AV141Active_PrdNom));
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
      app.GxWebStd.gx_hidden_field( httpContext, "MOVIMIENTOSENTRADAS_MODAL_Width", GXutil.rtrim( Movimientosentradas_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "MOVIMIENTOSENTRADAS_MODAL_Title", GXutil.rtrim( Movimientosentradas_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "MOVIMIENTOSENTRADAS_MODAL_Confirmtype", GXutil.rtrim( Movimientosentradas_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "MOVIMIENTOSENTRADAS_MODAL_Bodytype", GXutil.rtrim( Movimientosentradas_modal_Bodytype));
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
         we1QY2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1QY2( ) ;
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
      return formatLink("app.stocksquimicos.productoww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.ProductoWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Producto Quimico", "") ;
   }

   public void wb1QY0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ProductoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ProductoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ProductoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ProductoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1QY2( true) ;
      }
      else
      {
         wb_table1_25_1QY2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1QY2e( boolean wbgen )
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
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV36GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV37GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV163Pgmname), GXutil.rtrim( localUtil.format( AV163Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ProductoWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV34DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV34DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_101_1QY2( true) ;
      }
      else
      {
         wb_table2_101_1QY2( false) ;
      }
      return  ;
   }

   public void wb_table2_101_1QY2e( boolean wbgen )
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0108"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0108"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_43_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0108"+"");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_prdfhsauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_prdfhsauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_prdfhsauxdate_Internalname, localUtil.format(AV59DDO_PrdFHSAuxDate, "99/99/99"), localUtil.format( AV59DDO_PrdFHSAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_prdfhsauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ProductoWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_prdfhsauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\ProductoWW.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_prdfhsauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_prdfhsauxdateto_Internalname, localUtil.format(AV60DDO_PrdFHSAuxDateTo, "99/99/99"), localUtil.format( AV60DDO_PrdFHSAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_prdfhsauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ProductoWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_prdfhsauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\ProductoWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_prdfecpreauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_prdfecpreauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_prdfecpreauxdate_Internalname, localUtil.format(AV101DDO_PrdFecPreAuxDate, "99/99/99"), localUtil.format( AV101DDO_PrdFecPreAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_prdfecpreauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ProductoWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_prdfecpreauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\ProductoWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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

   public void start1QY2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Producto Quimico", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1QY0( ) ;
   }

   public void ws1QY2( )
   {
      start1QY2( ) ;
      evt1QY2( ) ;
   }

   public void evt1QY2( )
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
                           e111QY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121QY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131QY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141QY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151QY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "MOVIMIENTOSENTRADAS_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161QY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e171QY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e181QY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e191QY2 ();
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
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV38GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridActions), 4, 0));
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
                           A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
                           A13831PrdDisponi = localUtil.ctond( httpContext.cgiGet( edtPrdDisponi_Internalname)) ;
                           A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
                           A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
                           A6302TipPrdDsc = httpContext.cgiGet( edtTipPrdDsc_Internalname) ;
                           n6302TipPrdDsc = false ;
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
                           cmbPrdGRS.setName( cmbPrdGRS.getInternalname() );
                           cmbPrdGRS.setValue( httpContext.cgiGet( cmbPrdGRS.getInternalname()) );
                           A13974PrdGRS = httpContext.cgiGet( cmbPrdGRS.getInternalname()) ;
                           n13974PrdGRS = false ;
                           A9741PrdHS = httpContext.cgiGet( edtPrdHS_Internalname) ;
                           A9742PrdFHS = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPrdFHS_Internalname), 0)) ;
                           A4693PrdNum2 = httpContext.cgiGet( edtPrdNum2_Internalname) ;
                           A4692PrdNom2 = httpContext.cgiGet( edtPrdNom2_Internalname) ;
                           A728PrdRefPrv = httpContext.cgiGet( edtPrdRefPrv_Internalname) ;
                           A11615PrdFuncion = httpContext.cgiGet( edtPrdFuncion_Internalname) ;
                           A11614PrdEINECS = httpContext.cgiGet( edtPrdEINECS_Internalname) ;
                           A9734PrdNCAS = httpContext.cgiGet( edtPrdNCAS_Internalname) ;
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
                           A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A14036PrdGruFamD = httpContext.cgiGet( edtPrdGruFamD_Internalname) ;
                           n14036PrdGruFamD = false ;
                           A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( edtPrdPreAc2_Internalname)) ;
                           A709PrdFecPre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPrdFecPre_Internalname), 0)) ;
                           A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( edtPrdPreAnt_Internalname)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVar_forrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVar_forrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVAR_FORRGB");
                              GX_FocusControl = edtavVar_forrgb_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV147Var_ForRGB = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavVar_forrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV147Var_ForRGB), 10, 0));
                           }
                           else
                           {
                              AV147Var_ForRGB = localUtil.ctol( httpContext.cgiGet( edtavVar_forrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavVar_forrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV147Var_ForRGB), 10, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
                              GX_FocusControl = edtavR_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV148R = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148R), 3, 0));
                           }
                           else
                           {
                              AV148R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148R), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
                              GX_FocusControl = edtavG_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV149G = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149G), 3, 0));
                           }
                           else
                           {
                              AV149G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149G), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
                              GX_FocusControl = edtavB_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV150B = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV150B), 3, 0));
                           }
                           else
                           {
                              AV150B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV150B), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
                              GX_FocusControl = edtavR2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV151R2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151R2), 3, 0));
                           }
                           else
                           {
                              AV151R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151R2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
                              GX_FocusControl = edtavG2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV152G2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152G2), 3, 0));
                           }
                           else
                           {
                              AV152G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152G2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
                              GX_FocusControl = edtavB2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV153B2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153B2), 3, 0));
                           }
                           else
                           {
                              AV153B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153B2), 3, 0));
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
                                 e201QY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e211QY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221QY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e231QY2 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 108 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0108") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0108", "", sEvt);
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

   public void we1QY2( )
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

   public void pa1QY2( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String A396EmprCod ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV163Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV26TFPrdNum ,
                                 String AV27TFPrdNum_Sel ,
                                 String AV28TFPrdNom ,
                                 String AV29TFPrdNom_Sel ,
                                 java.math.BigDecimal AV106TFPrdExiAlm ,
                                 java.math.BigDecimal AV107TFPrdExiAlm_To ,
                                 java.math.BigDecimal AV108TFPrdCanRes ,
                                 java.math.BigDecimal AV109TFPrdCanRes_To ,
                                 java.math.BigDecimal AV135TFPrdDisponible ,
                                 java.math.BigDecimal AV136TFPrdDisponible_To ,
                                 java.math.BigDecimal AV110TFPrdCanPen ,
                                 java.math.BigDecimal AV111TFPrdCanPen_To ,
                                 java.math.BigDecimal AV97TFPrdPreAct ,
                                 java.math.BigDecimal AV98TFPrdPreAct_To ,
                                 String AV112TFTipPrdDsc ,
                                 String AV113TFTipPrdDsc_Sel ,
                                 String AV81TFValDsc ,
                                 String AV82TFValDsc_Sel ,
                                 String AV83TFPrdRec ,
                                 String AV84TFPrdRec_Sel ,
                                 java.math.BigDecimal AV39TFPrdAox ,
                                 java.math.BigDecimal AV40TFPrdAox_To ,
                                 String AV41TFPrdGots ,
                                 String AV42TFPrdGots_Sel ,
                                 String AV43TFPrdReach ,
                                 String AV44TFPrdReach_Sel ,
                                 GXSimpleCollection<String> AV46TFPrdOkotex_Sels ,
                                 String AV47TFPrdHm ,
                                 String AV48TFPrdHm_Sel ,
                                 GXSimpleCollection<String> AV50TFPrdZDHC_Sels ,
                                 GXSimpleCollection<String> AV52TFPrdList_Sels ,
                                 String AV53TFPrdTHELIST ,
                                 String AV54TFPrdTHELIST_Sel ,
                                 GXSimpleCollection<String> AV115TFPrdGRS_Sels ,
                                 String AV55TFPrdHS ,
                                 String AV56TFPrdHS_Sel ,
                                 java.util.Date AV57TFPrdFHS ,
                                 java.util.Date AV58TFPrdFHS_To ,
                                 String AV116TFPrdNum2 ,
                                 String AV117TFPrdNum2_Sel ,
                                 String AV118TFPrdNom2 ,
                                 String AV119TFPrdNom2_Sel ,
                                 String AV65TFPrdRefPrv ,
                                 String AV66TFPrdRefPrv_Sel ,
                                 String AV120TFPrdFuncion ,
                                 String AV121TFPrdFuncion_Sel ,
                                 String AV122TFPrdEINECS ,
                                 String AV123TFPrdEINECS_Sel ,
                                 String AV124TFPrdNCAS ,
                                 String AV125TFPrdNCAS_Sel ,
                                 int AV30TFPrvNum ,
                                 int AV31TFPrvNum_To ,
                                 String AV32TFPrvNom ,
                                 String AV33TFPrvNom_Sel ,
                                 long AV144TFPrdRGB ,
                                 long AV145TFPrdRGB_To ,
                                 String AV159TFPrdGruFamDc ,
                                 String AV160TFPrdGruFamDc_Sel ,
                                 java.math.BigDecimal AV157TFPrdPreAc2 ,
                                 java.math.BigDecimal AV158TFPrdPreAc2_To ,
                                 java.util.Date AV99TFPrdFecPre ,
                                 java.math.BigDecimal AV103TFPrdPreAnt ,
                                 java.math.BigDecimal AV104TFPrdPreAnt_To ,
                                 short AV146SiRGB ,
                                 java.util.Date Gx_date )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211QY2 ();
      GRID_nCurrentRecord = 0 ;
      rf1QY2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ProductoWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV163Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\productoww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1QY2( ) ;
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
      AV163Pgmname = "StocksQuimicos.ProductoWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV163Pgmname", AV163Pgmname);
      Gx_err = (short)(0) ;
      edtavVar_forrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_forrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_forrgb_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV46TFPrdOkotex_Sels ,
                                           A13301PrdZDHC ,
                                           AV50TFPrdZDHC_Sels ,
                                           A11687PrdList ,
                                           AV52TFPrdList_Sels ,
                                           A13974PrdGRS ,
                                           AV115TFPrdGRS_Sels ,
                                           AV27TFPrdNum_Sel ,
                                           AV26TFPrdNum ,
                                           AV29TFPrdNom_Sel ,
                                           AV28TFPrdNom ,
                                           AV106TFPrdExiAlm ,
                                           AV107TFPrdExiAlm_To ,
                                           AV108TFPrdCanRes ,
                                           AV109TFPrdCanRes_To ,
                                           AV135TFPrdDisponible ,
                                           AV136TFPrdDisponible_To ,
                                           AV110TFPrdCanPen ,
                                           AV111TFPrdCanPen_To ,
                                           AV97TFPrdPreAct ,
                                           AV98TFPrdPreAct_To ,
                                           AV113TFTipPrdDsc_Sel ,
                                           AV112TFTipPrdDsc ,
                                           AV82TFValDsc_Sel ,
                                           AV81TFValDsc ,
                                           AV84TFPrdRec_Sel ,
                                           AV83TFPrdRec ,
                                           AV39TFPrdAox ,
                                           AV40TFPrdAox_To ,
                                           AV42TFPrdGots_Sel ,
                                           AV41TFPrdGots ,
                                           AV44TFPrdReach_Sel ,
                                           AV43TFPrdReach ,
                                           Integer.valueOf(AV46TFPrdOkotex_Sels.size()) ,
                                           AV48TFPrdHm_Sel ,
                                           AV47TFPrdHm ,
                                           Integer.valueOf(AV50TFPrdZDHC_Sels.size()) ,
                                           Integer.valueOf(AV52TFPrdList_Sels.size()) ,
                                           AV54TFPrdTHELIST_Sel ,
                                           AV53TFPrdTHELIST ,
                                           Integer.valueOf(AV115TFPrdGRS_Sels.size()) ,
                                           AV56TFPrdHS_Sel ,
                                           AV55TFPrdHS ,
                                           AV57TFPrdFHS ,
                                           AV58TFPrdFHS_To ,
                                           AV117TFPrdNum2_Sel ,
                                           AV116TFPrdNum2 ,
                                           AV119TFPrdNom2_Sel ,
                                           AV118TFPrdNom2 ,
                                           AV66TFPrdRefPrv_Sel ,
                                           AV65TFPrdRefPrv ,
                                           AV121TFPrdFuncion_Sel ,
                                           AV120TFPrdFuncion ,
                                           AV123TFPrdEINECS_Sel ,
                                           AV122TFPrdEINECS ,
                                           AV125TFPrdNCAS_Sel ,
                                           AV124TFPrdNCAS ,
                                           Integer.valueOf(AV30TFPrvNum) ,
                                           Integer.valueOf(AV31TFPrvNum_To) ,
                                           AV33TFPrvNom_Sel ,
                                           AV32TFPrvNom ,
                                           Long.valueOf(AV144TFPrdRGB) ,
                                           Long.valueOf(AV145TFPrdRGB_To) ,
                                           AV160TFPrdGruFamDc_Sel ,
                                           AV159TFPrdGruFamDc ,
                                           AV157TFPrdPreAc2 ,
                                           AV158TFPrdPreAc2_To ,
                                           AV99TFPrdFecPre ,
                                           AV103TFPrdPreAnt ,
                                           AV104TFPrdPreAnt_To ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A6302TipPrdDsc ,
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
                                           A4692PrdNom2 ,
                                           A728PrdRefPrv ,
                                           A11615PrdFuncion ,
                                           A11614PrdEINECS ,
                                           A9734PrdNCAS ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Long.valueOf(A13232PrdRGB) ,
                                           A14036PrdGruFamD ,
                                           A5255PrdPreAc2 ,
                                           A709PrdFecPre ,
                                           A725PrdPreAnt ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV15FilterFullText ,
                                           A13831PrdDisponi ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV26TFPrdNum = GXutil.padr( GXutil.rtrim( AV26TFPrdNum), 6, "%") ;
      lV28TFPrdNom = GXutil.padr( GXutil.rtrim( AV28TFPrdNom), 26, "%") ;
      lV112TFTipPrdDsc = GXutil.padr( GXutil.rtrim( AV112TFTipPrdDsc), 40, "%") ;
      lV81TFValDsc = GXutil.padr( GXutil.rtrim( AV81TFValDsc), 16, "%") ;
      lV83TFPrdRec = GXutil.padr( GXutil.rtrim( AV83TFPrdRec), 1, "%") ;
      lV41TFPrdGots = GXutil.padr( GXutil.rtrim( AV41TFPrdGots), 1, "%") ;
      lV43TFPrdReach = GXutil.padr( GXutil.rtrim( AV43TFPrdReach), 1, "%") ;
      lV47TFPrdHm = GXutil.padr( GXutil.rtrim( AV47TFPrdHm), 1, "%") ;
      lV53TFPrdTHELIST = GXutil.padr( GXutil.rtrim( AV53TFPrdTHELIST), 4, "%") ;
      lV55TFPrdHS = GXutil.padr( GXutil.rtrim( AV55TFPrdHS), 1, "%") ;
      lV116TFPrdNum2 = GXutil.padr( GXutil.rtrim( AV116TFPrdNum2), 16, "%") ;
      lV118TFPrdNom2 = GXutil.padr( GXutil.rtrim( AV118TFPrdNom2), 40, "%") ;
      lV65TFPrdRefPrv = GXutil.padr( GXutil.rtrim( AV65TFPrdRefPrv), 30, "%") ;
      lV120TFPrdFuncion = GXutil.padr( GXutil.rtrim( AV120TFPrdFuncion), 50, "%") ;
      lV122TFPrdEINECS = GXutil.padr( GXutil.rtrim( AV122TFPrdEINECS), 40, "%") ;
      lV124TFPrdNCAS = GXutil.padr( GXutil.rtrim( AV124TFPrdNCAS), 30, "%") ;
      lV32TFPrvNom = GXutil.padr( GXutil.rtrim( AV32TFPrvNom), 30, "%") ;
      lV159TFPrdGruFamDc = GXutil.padr( GXutil.rtrim( AV159TFPrdGruFamDc), 30, "%") ;
      /* Using cursor H01QY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, lV26TFPrdNum, AV27TFPrdNum_Sel, lV28TFPrdNom, AV29TFPrdNom_Sel, AV106TFPrdExiAlm, AV107TFPrdExiAlm_To, AV108TFPrdCanRes, AV109TFPrdCanRes_To, AV135TFPrdDisponible, AV136TFPrdDisponible_To, AV110TFPrdCanPen, AV111TFPrdCanPen_To, AV97TFPrdPreAct, AV98TFPrdPreAct_To, lV112TFTipPrdDsc, AV113TFTipPrdDsc_Sel, lV81TFValDsc, AV82TFValDsc_Sel, lV83TFPrdRec, AV84TFPrdRec_Sel, AV39TFPrdAox, AV40TFPrdAox_To, lV41TFPrdGots, AV42TFPrdGots_Sel, lV43TFPrdReach, AV44TFPrdReach_Sel, lV47TFPrdHm, AV48TFPrdHm_Sel, lV53TFPrdTHELIST, AV54TFPrdTHELIST_Sel, lV55TFPrdHS, AV56TFPrdHS_Sel, AV57TFPrdFHS, AV58TFPrdFHS_To, lV116TFPrdNum2, AV117TFPrdNum2_Sel, lV118TFPrdNom2, AV119TFPrdNom2_Sel, lV65TFPrdRefPrv, AV66TFPrdRefPrv_Sel, lV120TFPrdFuncion, AV121TFPrdFuncion_Sel, lV122TFPrdEINECS, AV123TFPrdEINECS_Sel, lV124TFPrdNCAS, AV125TFPrdNCAS_Sel, Integer.valueOf(AV30TFPrvNum), Integer.valueOf(AV31TFPrvNum_To), lV32TFPrvNom, AV33TFPrvNom_Sel, Long.valueOf(AV144TFPrdRGB), Long.valueOf(AV145TFPrdRGB_To), lV159TFPrdGruFamDc, AV160TFPrdGruFamDc_Sel, AV157TFPrdPreAc2, AV158TFPrdPreAc2_To, AV99TFPrdFecPre, AV103TFPrdPreAnt, AV104TFPrdPreAnt_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13969PrdGruFamI = H01QY2_A13969PrdGruFamI[0] ;
         n13969PrdGruFamI = H01QY2_n13969PrdGruFamI[0] ;
         A856ValCod = H01QY2_A856ValCod[0] ;
         A6301TipPrdCod = H01QY2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = H01QY2_n6301TipPrdCod[0] ;
         A725PrdPreAnt = H01QY2_A725PrdPreAnt[0] ;
         A709PrdFecPre = H01QY2_A709PrdFecPre[0] ;
         A5255PrdPreAc2 = H01QY2_A5255PrdPreAc2[0] ;
         A14036PrdGruFamD = H01QY2_A14036PrdGruFamD[0] ;
         n14036PrdGruFamD = H01QY2_n14036PrdGruFamD[0] ;
         A13232PrdRGB = H01QY2_A13232PrdRGB[0] ;
         A794PrvNom = H01QY2_A794PrvNom[0] ;
         n794PrvNom = H01QY2_n794PrvNom[0] ;
         A795PrvNum = H01QY2_A795PrvNum[0] ;
         A9734PrdNCAS = H01QY2_A9734PrdNCAS[0] ;
         A11614PrdEINECS = H01QY2_A11614PrdEINECS[0] ;
         A11615PrdFuncion = H01QY2_A11615PrdFuncion[0] ;
         A728PrdRefPrv = H01QY2_A728PrdRefPrv[0] ;
         A4692PrdNom2 = H01QY2_A4692PrdNom2[0] ;
         A4693PrdNum2 = H01QY2_A4693PrdNum2[0] ;
         A9742PrdFHS = H01QY2_A9742PrdFHS[0] ;
         A9741PrdHS = H01QY2_A9741PrdHS[0] ;
         A13974PrdGRS = H01QY2_A13974PrdGRS[0] ;
         n13974PrdGRS = H01QY2_n13974PrdGRS[0] ;
         A13302PrdTHELIST = H01QY2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = H01QY2_n13302PrdTHELIST[0] ;
         A11687PrdList = H01QY2_A11687PrdList[0] ;
         A13301PrdZDHC = H01QY2_A13301PrdZDHC[0] ;
         A11364PrdHm = H01QY2_A11364PrdHm[0] ;
         A5888PrdOkotex = H01QY2_A5888PrdOkotex[0] ;
         A5887PrdReach = H01QY2_A5887PrdReach[0] ;
         A11363PrdGots = H01QY2_A11363PrdGots[0] ;
         A9733PrdAox = H01QY2_A9733PrdAox[0] ;
         A727PrdRec = H01QY2_A727PrdRec[0] ;
         A857ValDsc = H01QY2_A857ValDsc[0] ;
         n857ValDsc = H01QY2_n857ValDsc[0] ;
         A6302TipPrdDsc = H01QY2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = H01QY2_n6302TipPrdDsc[0] ;
         A724PrdPreAct = H01QY2_A724PrdPreAct[0] ;
         A684PrdCanPen = H01QY2_A684PrdCanPen[0] ;
         A13831PrdDisponi = H01QY2_A13831PrdDisponi[0] ;
         A718PrdNom = H01QY2_A718PrdNom[0] ;
         A719PrdNum = H01QY2_A719PrdNum[0] ;
         A704PrdExiAlm = H01QY2_A704PrdExiAlm[0] ;
         A685PrdCanRes = H01QY2_A685PrdCanRes[0] ;
         A14036PrdGruFamD = H01QY2_A14036PrdGruFamD[0] ;
         n14036PrdGruFamD = H01QY2_n14036PrdGruFamD[0] ;
         A794PrvNom = H01QY2_A794PrvNom[0] ;
         n794PrvNom = H01QY2_n794PrvNom[0] ;
         A857ValDsc = H01QY2_A857ValDsc[0] ;
         n857ValDsc = H01QY2_n857ValDsc[0] ;
         A6302TipPrdDsc = H01QY2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = H01QY2_n6302TipPrdDsc[0] ;
         if ( (GXutil.strcmp("", AV15FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13831PrdDisponi, 12, 4) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A684PrdCanPen, 12, 4) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A727PrdRec) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 1", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 2", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 3", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "N") == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4692PrdNom2) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9734PrdNCAS) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13232PrdRGB, 10, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14036PrdGruFamD) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5255PrdPreAc2, 14, 5) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A725PrdPreAnt, 14, 5) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) ) )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1QY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e211QY2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A5888PrdOkotex ,
                                              AV46TFPrdOkotex_Sels ,
                                              A13301PrdZDHC ,
                                              AV50TFPrdZDHC_Sels ,
                                              A11687PrdList ,
                                              AV52TFPrdList_Sels ,
                                              A13974PrdGRS ,
                                              AV115TFPrdGRS_Sels ,
                                              AV27TFPrdNum_Sel ,
                                              AV26TFPrdNum ,
                                              AV29TFPrdNom_Sel ,
                                              AV28TFPrdNom ,
                                              AV106TFPrdExiAlm ,
                                              AV107TFPrdExiAlm_To ,
                                              AV108TFPrdCanRes ,
                                              AV109TFPrdCanRes_To ,
                                              AV135TFPrdDisponible ,
                                              AV136TFPrdDisponible_To ,
                                              AV110TFPrdCanPen ,
                                              AV111TFPrdCanPen_To ,
                                              AV97TFPrdPreAct ,
                                              AV98TFPrdPreAct_To ,
                                              AV113TFTipPrdDsc_Sel ,
                                              AV112TFTipPrdDsc ,
                                              AV82TFValDsc_Sel ,
                                              AV81TFValDsc ,
                                              AV84TFPrdRec_Sel ,
                                              AV83TFPrdRec ,
                                              AV39TFPrdAox ,
                                              AV40TFPrdAox_To ,
                                              AV42TFPrdGots_Sel ,
                                              AV41TFPrdGots ,
                                              AV44TFPrdReach_Sel ,
                                              AV43TFPrdReach ,
                                              Integer.valueOf(AV46TFPrdOkotex_Sels.size()) ,
                                              AV48TFPrdHm_Sel ,
                                              AV47TFPrdHm ,
                                              Integer.valueOf(AV50TFPrdZDHC_Sels.size()) ,
                                              Integer.valueOf(AV52TFPrdList_Sels.size()) ,
                                              AV54TFPrdTHELIST_Sel ,
                                              AV53TFPrdTHELIST ,
                                              Integer.valueOf(AV115TFPrdGRS_Sels.size()) ,
                                              AV56TFPrdHS_Sel ,
                                              AV55TFPrdHS ,
                                              AV57TFPrdFHS ,
                                              AV58TFPrdFHS_To ,
                                              AV117TFPrdNum2_Sel ,
                                              AV116TFPrdNum2 ,
                                              AV119TFPrdNom2_Sel ,
                                              AV118TFPrdNom2 ,
                                              AV66TFPrdRefPrv_Sel ,
                                              AV65TFPrdRefPrv ,
                                              AV121TFPrdFuncion_Sel ,
                                              AV120TFPrdFuncion ,
                                              AV123TFPrdEINECS_Sel ,
                                              AV122TFPrdEINECS ,
                                              AV125TFPrdNCAS_Sel ,
                                              AV124TFPrdNCAS ,
                                              Integer.valueOf(AV30TFPrvNum) ,
                                              Integer.valueOf(AV31TFPrvNum_To) ,
                                              AV33TFPrvNom_Sel ,
                                              AV32TFPrvNom ,
                                              Long.valueOf(AV144TFPrdRGB) ,
                                              Long.valueOf(AV145TFPrdRGB_To) ,
                                              AV160TFPrdGruFamDc_Sel ,
                                              AV159TFPrdGruFamDc ,
                                              AV157TFPrdPreAc2 ,
                                              AV158TFPrdPreAc2_To ,
                                              AV99TFPrdFecPre ,
                                              AV103TFPrdPreAnt ,
                                              AV104TFPrdPreAnt_To ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A704PrdExiAlm ,
                                              A685PrdCanRes ,
                                              A684PrdCanPen ,
                                              A724PrdPreAct ,
                                              A6302TipPrdDsc ,
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
                                              A4692PrdNom2 ,
                                              A728PrdRefPrv ,
                                              A11615PrdFuncion ,
                                              A11614PrdEINECS ,
                                              A9734PrdNCAS ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              Long.valueOf(A13232PrdRGB) ,
                                              A14036PrdGruFamD ,
                                              A5255PrdPreAc2 ,
                                              A709PrdFecPre ,
                                              A725PrdPreAnt ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV15FilterFullText ,
                                              A13831PrdDisponi ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                              TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                              TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING
                                              }
         });
         lV26TFPrdNum = GXutil.padr( GXutil.rtrim( AV26TFPrdNum), 6, "%") ;
         lV28TFPrdNom = GXutil.padr( GXutil.rtrim( AV28TFPrdNom), 26, "%") ;
         lV112TFTipPrdDsc = GXutil.padr( GXutil.rtrim( AV112TFTipPrdDsc), 40, "%") ;
         lV81TFValDsc = GXutil.padr( GXutil.rtrim( AV81TFValDsc), 16, "%") ;
         lV83TFPrdRec = GXutil.padr( GXutil.rtrim( AV83TFPrdRec), 1, "%") ;
         lV41TFPrdGots = GXutil.padr( GXutil.rtrim( AV41TFPrdGots), 1, "%") ;
         lV43TFPrdReach = GXutil.padr( GXutil.rtrim( AV43TFPrdReach), 1, "%") ;
         lV47TFPrdHm = GXutil.padr( GXutil.rtrim( AV47TFPrdHm), 1, "%") ;
         lV53TFPrdTHELIST = GXutil.padr( GXutil.rtrim( AV53TFPrdTHELIST), 4, "%") ;
         lV55TFPrdHS = GXutil.padr( GXutil.rtrim( AV55TFPrdHS), 1, "%") ;
         lV116TFPrdNum2 = GXutil.padr( GXutil.rtrim( AV116TFPrdNum2), 16, "%") ;
         lV118TFPrdNom2 = GXutil.padr( GXutil.rtrim( AV118TFPrdNom2), 40, "%") ;
         lV65TFPrdRefPrv = GXutil.padr( GXutil.rtrim( AV65TFPrdRefPrv), 30, "%") ;
         lV120TFPrdFuncion = GXutil.padr( GXutil.rtrim( AV120TFPrdFuncion), 50, "%") ;
         lV122TFPrdEINECS = GXutil.padr( GXutil.rtrim( AV122TFPrdEINECS), 40, "%") ;
         lV124TFPrdNCAS = GXutil.padr( GXutil.rtrim( AV124TFPrdNCAS), 30, "%") ;
         lV32TFPrvNom = GXutil.padr( GXutil.rtrim( AV32TFPrvNom), 30, "%") ;
         lV159TFPrdGruFamDc = GXutil.padr( GXutil.rtrim( AV159TFPrdGruFamDc), 30, "%") ;
         /* Using cursor H01QY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, lV26TFPrdNum, AV27TFPrdNum_Sel, lV28TFPrdNom, AV29TFPrdNom_Sel, AV106TFPrdExiAlm, AV107TFPrdExiAlm_To, AV108TFPrdCanRes, AV109TFPrdCanRes_To, AV135TFPrdDisponible, AV136TFPrdDisponible_To, AV110TFPrdCanPen, AV111TFPrdCanPen_To, AV97TFPrdPreAct, AV98TFPrdPreAct_To, lV112TFTipPrdDsc, AV113TFTipPrdDsc_Sel, lV81TFValDsc, AV82TFValDsc_Sel, lV83TFPrdRec, AV84TFPrdRec_Sel, AV39TFPrdAox, AV40TFPrdAox_To, lV41TFPrdGots, AV42TFPrdGots_Sel, lV43TFPrdReach, AV44TFPrdReach_Sel, lV47TFPrdHm, AV48TFPrdHm_Sel, lV53TFPrdTHELIST, AV54TFPrdTHELIST_Sel, lV55TFPrdHS, AV56TFPrdHS_Sel, AV57TFPrdFHS, AV58TFPrdFHS_To, lV116TFPrdNum2, AV117TFPrdNum2_Sel, lV118TFPrdNom2, AV119TFPrdNom2_Sel, lV65TFPrdRefPrv, AV66TFPrdRefPrv_Sel, lV120TFPrdFuncion, AV121TFPrdFuncion_Sel, lV122TFPrdEINECS, AV123TFPrdEINECS_Sel, lV124TFPrdNCAS, AV125TFPrdNCAS_Sel, Integer.valueOf(AV30TFPrvNum), Integer.valueOf(AV31TFPrvNum_To), lV32TFPrvNom, AV33TFPrvNom_Sel, Long.valueOf(AV144TFPrdRGB), Long.valueOf(AV145TFPrdRGB_To), lV159TFPrdGruFamDc, AV160TFPrdGruFamDc_Sel, AV157TFPrdPreAc2, AV158TFPrdPreAc2_To, AV99TFPrdFecPre, AV103TFPrdPreAnt, AV104TFPrdPreAnt_To});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13969PrdGruFamI = H01QY3_A13969PrdGruFamI[0] ;
            n13969PrdGruFamI = H01QY3_n13969PrdGruFamI[0] ;
            A856ValCod = H01QY3_A856ValCod[0] ;
            A6301TipPrdCod = H01QY3_A6301TipPrdCod[0] ;
            n6301TipPrdCod = H01QY3_n6301TipPrdCod[0] ;
            A725PrdPreAnt = H01QY3_A725PrdPreAnt[0] ;
            A709PrdFecPre = H01QY3_A709PrdFecPre[0] ;
            A5255PrdPreAc2 = H01QY3_A5255PrdPreAc2[0] ;
            A14036PrdGruFamD = H01QY3_A14036PrdGruFamD[0] ;
            n14036PrdGruFamD = H01QY3_n14036PrdGruFamD[0] ;
            A13232PrdRGB = H01QY3_A13232PrdRGB[0] ;
            A794PrvNom = H01QY3_A794PrvNom[0] ;
            n794PrvNom = H01QY3_n794PrvNom[0] ;
            A795PrvNum = H01QY3_A795PrvNum[0] ;
            A9734PrdNCAS = H01QY3_A9734PrdNCAS[0] ;
            A11614PrdEINECS = H01QY3_A11614PrdEINECS[0] ;
            A11615PrdFuncion = H01QY3_A11615PrdFuncion[0] ;
            A728PrdRefPrv = H01QY3_A728PrdRefPrv[0] ;
            A4692PrdNom2 = H01QY3_A4692PrdNom2[0] ;
            A4693PrdNum2 = H01QY3_A4693PrdNum2[0] ;
            A9742PrdFHS = H01QY3_A9742PrdFHS[0] ;
            A9741PrdHS = H01QY3_A9741PrdHS[0] ;
            A13974PrdGRS = H01QY3_A13974PrdGRS[0] ;
            n13974PrdGRS = H01QY3_n13974PrdGRS[0] ;
            A13302PrdTHELIST = H01QY3_A13302PrdTHELIST[0] ;
            n13302PrdTHELIST = H01QY3_n13302PrdTHELIST[0] ;
            A11687PrdList = H01QY3_A11687PrdList[0] ;
            A13301PrdZDHC = H01QY3_A13301PrdZDHC[0] ;
            A11364PrdHm = H01QY3_A11364PrdHm[0] ;
            A5888PrdOkotex = H01QY3_A5888PrdOkotex[0] ;
            A5887PrdReach = H01QY3_A5887PrdReach[0] ;
            A11363PrdGots = H01QY3_A11363PrdGots[0] ;
            A9733PrdAox = H01QY3_A9733PrdAox[0] ;
            A727PrdRec = H01QY3_A727PrdRec[0] ;
            A857ValDsc = H01QY3_A857ValDsc[0] ;
            n857ValDsc = H01QY3_n857ValDsc[0] ;
            A6302TipPrdDsc = H01QY3_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = H01QY3_n6302TipPrdDsc[0] ;
            A724PrdPreAct = H01QY3_A724PrdPreAct[0] ;
            A684PrdCanPen = H01QY3_A684PrdCanPen[0] ;
            A13831PrdDisponi = H01QY3_A13831PrdDisponi[0] ;
            A718PrdNom = H01QY3_A718PrdNom[0] ;
            A719PrdNum = H01QY3_A719PrdNum[0] ;
            A704PrdExiAlm = H01QY3_A704PrdExiAlm[0] ;
            A685PrdCanRes = H01QY3_A685PrdCanRes[0] ;
            A14036PrdGruFamD = H01QY3_A14036PrdGruFamD[0] ;
            n14036PrdGruFamD = H01QY3_n14036PrdGruFamD[0] ;
            A794PrvNom = H01QY3_A794PrvNom[0] ;
            n794PrvNom = H01QY3_n794PrvNom[0] ;
            A857ValDsc = H01QY3_A857ValDsc[0] ;
            n857ValDsc = H01QY3_n857ValDsc[0] ;
            A6302TipPrdDsc = H01QY3_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = H01QY3_n6302TipPrdDsc[0] ;
            if ( (GXutil.strcmp("", AV15FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13831PrdDisponi, 12, 4) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A684PrdCanPen, 12, 4) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A727PrdRec) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 1", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 2", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 3", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "N") == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV15FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4692PrdNom2) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9734PrdNCAS) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13232PrdRGB, 10, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14036PrdGruFamD) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5255PrdPreAc2, 14, 5) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A725PrdPreAnt, 14, 5) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) ) )
            {
               e221QY2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(43) ;
         wb1QY0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1QY2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSIRGB", GXutil.ltrim( localUtil.ntoc( AV146SiRGB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV146SiRGB), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV163Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV106TFPrdExiAlm, AV107TFPrdExiAlm_To, AV108TFPrdCanRes, AV109TFPrdCanRes_To, AV135TFPrdDisponible, AV136TFPrdDisponible_To, AV110TFPrdCanPen, AV111TFPrdCanPen_To, AV97TFPrdPreAct, AV98TFPrdPreAct_To, AV112TFTipPrdDsc, AV113TFTipPrdDsc_Sel, AV81TFValDsc, AV82TFValDsc_Sel, AV83TFPrdRec, AV84TFPrdRec_Sel, AV39TFPrdAox, AV40TFPrdAox_To, AV41TFPrdGots, AV42TFPrdGots_Sel, AV43TFPrdReach, AV44TFPrdReach_Sel, AV46TFPrdOkotex_Sels, AV47TFPrdHm, AV48TFPrdHm_Sel, AV50TFPrdZDHC_Sels, AV52TFPrdList_Sels, AV53TFPrdTHELIST, AV54TFPrdTHELIST_Sel, AV115TFPrdGRS_Sels, AV55TFPrdHS, AV56TFPrdHS_Sel, AV57TFPrdFHS, AV58TFPrdFHS_To, AV116TFPrdNum2, AV117TFPrdNum2_Sel, AV118TFPrdNom2, AV119TFPrdNom2_Sel, AV65TFPrdRefPrv, AV66TFPrdRefPrv_Sel, AV120TFPrdFuncion, AV121TFPrdFuncion_Sel, AV122TFPrdEINECS, AV123TFPrdEINECS_Sel, AV124TFPrdNCAS, AV125TFPrdNCAS_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV144TFPrdRGB, AV145TFPrdRGB_To, AV159TFPrdGruFamDc, AV160TFPrdGruFamDc_Sel, AV157TFPrdPreAc2, AV158TFPrdPreAc2_To, AV99TFPrdFecPre, AV103TFPrdPreAnt, AV104TFPrdPreAnt_To, AV146SiRGB, Gx_date) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV163Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV106TFPrdExiAlm, AV107TFPrdExiAlm_To, AV108TFPrdCanRes, AV109TFPrdCanRes_To, AV135TFPrdDisponible, AV136TFPrdDisponible_To, AV110TFPrdCanPen, AV111TFPrdCanPen_To, AV97TFPrdPreAct, AV98TFPrdPreAct_To, AV112TFTipPrdDsc, AV113TFTipPrdDsc_Sel, AV81TFValDsc, AV82TFValDsc_Sel, AV83TFPrdRec, AV84TFPrdRec_Sel, AV39TFPrdAox, AV40TFPrdAox_To, AV41TFPrdGots, AV42TFPrdGots_Sel, AV43TFPrdReach, AV44TFPrdReach_Sel, AV46TFPrdOkotex_Sels, AV47TFPrdHm, AV48TFPrdHm_Sel, AV50TFPrdZDHC_Sels, AV52TFPrdList_Sels, AV53TFPrdTHELIST, AV54TFPrdTHELIST_Sel, AV115TFPrdGRS_Sels, AV55TFPrdHS, AV56TFPrdHS_Sel, AV57TFPrdFHS, AV58TFPrdFHS_To, AV116TFPrdNum2, AV117TFPrdNum2_Sel, AV118TFPrdNom2, AV119TFPrdNom2_Sel, AV65TFPrdRefPrv, AV66TFPrdRefPrv_Sel, AV120TFPrdFuncion, AV121TFPrdFuncion_Sel, AV122TFPrdEINECS, AV123TFPrdEINECS_Sel, AV124TFPrdNCAS, AV125TFPrdNCAS_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV144TFPrdRGB, AV145TFPrdRGB_To, AV159TFPrdGruFamDc, AV160TFPrdGruFamDc_Sel, AV157TFPrdPreAc2, AV158TFPrdPreAc2_To, AV99TFPrdFecPre, AV103TFPrdPreAnt, AV104TFPrdPreAnt_To, AV146SiRGB, Gx_date) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV163Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV106TFPrdExiAlm, AV107TFPrdExiAlm_To, AV108TFPrdCanRes, AV109TFPrdCanRes_To, AV135TFPrdDisponible, AV136TFPrdDisponible_To, AV110TFPrdCanPen, AV111TFPrdCanPen_To, AV97TFPrdPreAct, AV98TFPrdPreAct_To, AV112TFTipPrdDsc, AV113TFTipPrdDsc_Sel, AV81TFValDsc, AV82TFValDsc_Sel, AV83TFPrdRec, AV84TFPrdRec_Sel, AV39TFPrdAox, AV40TFPrdAox_To, AV41TFPrdGots, AV42TFPrdGots_Sel, AV43TFPrdReach, AV44TFPrdReach_Sel, AV46TFPrdOkotex_Sels, AV47TFPrdHm, AV48TFPrdHm_Sel, AV50TFPrdZDHC_Sels, AV52TFPrdList_Sels, AV53TFPrdTHELIST, AV54TFPrdTHELIST_Sel, AV115TFPrdGRS_Sels, AV55TFPrdHS, AV56TFPrdHS_Sel, AV57TFPrdFHS, AV58TFPrdFHS_To, AV116TFPrdNum2, AV117TFPrdNum2_Sel, AV118TFPrdNom2, AV119TFPrdNom2_Sel, AV65TFPrdRefPrv, AV66TFPrdRefPrv_Sel, AV120TFPrdFuncion, AV121TFPrdFuncion_Sel, AV122TFPrdEINECS, AV123TFPrdEINECS_Sel, AV124TFPrdNCAS, AV125TFPrdNCAS_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV144TFPrdRGB, AV145TFPrdRGB_To, AV159TFPrdGruFamDc, AV160TFPrdGruFamDc_Sel, AV157TFPrdPreAc2, AV158TFPrdPreAc2_To, AV99TFPrdFecPre, AV103TFPrdPreAnt, AV104TFPrdPreAnt_To, AV146SiRGB, Gx_date) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV163Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV106TFPrdExiAlm, AV107TFPrdExiAlm_To, AV108TFPrdCanRes, AV109TFPrdCanRes_To, AV135TFPrdDisponible, AV136TFPrdDisponible_To, AV110TFPrdCanPen, AV111TFPrdCanPen_To, AV97TFPrdPreAct, AV98TFPrdPreAct_To, AV112TFTipPrdDsc, AV113TFTipPrdDsc_Sel, AV81TFValDsc, AV82TFValDsc_Sel, AV83TFPrdRec, AV84TFPrdRec_Sel, AV39TFPrdAox, AV40TFPrdAox_To, AV41TFPrdGots, AV42TFPrdGots_Sel, AV43TFPrdReach, AV44TFPrdReach_Sel, AV46TFPrdOkotex_Sels, AV47TFPrdHm, AV48TFPrdHm_Sel, AV50TFPrdZDHC_Sels, AV52TFPrdList_Sels, AV53TFPrdTHELIST, AV54TFPrdTHELIST_Sel, AV115TFPrdGRS_Sels, AV55TFPrdHS, AV56TFPrdHS_Sel, AV57TFPrdFHS, AV58TFPrdFHS_To, AV116TFPrdNum2, AV117TFPrdNum2_Sel, AV118TFPrdNom2, AV119TFPrdNom2_Sel, AV65TFPrdRefPrv, AV66TFPrdRefPrv_Sel, AV120TFPrdFuncion, AV121TFPrdFuncion_Sel, AV122TFPrdEINECS, AV123TFPrdEINECS_Sel, AV124TFPrdNCAS, AV125TFPrdNCAS_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV144TFPrdRGB, AV145TFPrdRGB_To, AV159TFPrdGruFamDc, AV160TFPrdGruFamDc_Sel, AV157TFPrdPreAc2, AV158TFPrdPreAc2_To, AV99TFPrdFecPre, AV103TFPrdPreAnt, AV104TFPrdPreAnt_To, AV146SiRGB, Gx_date) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV163Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV106TFPrdExiAlm, AV107TFPrdExiAlm_To, AV108TFPrdCanRes, AV109TFPrdCanRes_To, AV135TFPrdDisponible, AV136TFPrdDisponible_To, AV110TFPrdCanPen, AV111TFPrdCanPen_To, AV97TFPrdPreAct, AV98TFPrdPreAct_To, AV112TFTipPrdDsc, AV113TFTipPrdDsc_Sel, AV81TFValDsc, AV82TFValDsc_Sel, AV83TFPrdRec, AV84TFPrdRec_Sel, AV39TFPrdAox, AV40TFPrdAox_To, AV41TFPrdGots, AV42TFPrdGots_Sel, AV43TFPrdReach, AV44TFPrdReach_Sel, AV46TFPrdOkotex_Sels, AV47TFPrdHm, AV48TFPrdHm_Sel, AV50TFPrdZDHC_Sels, AV52TFPrdList_Sels, AV53TFPrdTHELIST, AV54TFPrdTHELIST_Sel, AV115TFPrdGRS_Sels, AV55TFPrdHS, AV56TFPrdHS_Sel, AV57TFPrdFHS, AV58TFPrdFHS_To, AV116TFPrdNum2, AV117TFPrdNum2_Sel, AV118TFPrdNom2, AV119TFPrdNom2_Sel, AV65TFPrdRefPrv, AV66TFPrdRefPrv_Sel, AV120TFPrdFuncion, AV121TFPrdFuncion_Sel, AV122TFPrdEINECS, AV123TFPrdEINECS_Sel, AV124TFPrdNCAS, AV125TFPrdNCAS_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV144TFPrdRGB, AV145TFPrdRGB_To, AV159TFPrdGruFamDc, AV160TFPrdGruFamDc_Sel, AV157TFPrdPreAc2, AV158TFPrdPreAc2_To, AV99TFPrdFecPre, AV103TFPrdPreAnt, AV104TFPrdPreAnt_To, AV146SiRGB, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV163Pgmname = "StocksQuimicos.ProductoWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV163Pgmname", AV163Pgmname);
      Gx_err = (short)(0) ;
      edtavVar_forrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_forrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_forrgb_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1QY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201QY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV34DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV36GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV37GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV141Active_PrdNom = httpContext.cgiGet( "vACTIVE_PRDNOM") ;
         AV139Active_PrdNum = httpContext.cgiGet( "vACTIVE_PRDNUM") ;
         AV138Active_EmprCod = httpContext.cgiGet( "vACTIVE_EMPRCOD") ;
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
         Movimientosentradas_modal_Width = httpContext.cgiGet( "MOVIMIENTOSENTRADAS_MODAL_Width") ;
         Movimientosentradas_modal_Title = httpContext.cgiGet( "MOVIMIENTOSENTRADAS_MODAL_Title") ;
         Movimientosentradas_modal_Confirmtype = httpContext.cgiGet( "MOVIMIENTOSENTRADAS_MODAL_Confirmtype") ;
         Movimientosentradas_modal_Bodytype = httpContext.cgiGet( "MOVIMIENTOSENTRADAS_MODAL_Bodytype") ;
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
         AV163Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV163Pgmname", AV163Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_prdfhsauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PRDFHSAUXDATE");
            GX_FocusControl = edtavDdo_prdfhsauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV59DDO_PrdFHSAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59DDO_PrdFHSAuxDate", localUtil.format(AV59DDO_PrdFHSAuxDate, "99/99/99"));
         }
         else
         {
            AV59DDO_PrdFHSAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_prdfhsauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59DDO_PrdFHSAuxDate", localUtil.format(AV59DDO_PrdFHSAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_prdfhsauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PRDFHSAUXDATETO");
            GX_FocusControl = edtavDdo_prdfhsauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60DDO_PrdFHSAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60DDO_PrdFHSAuxDateTo", localUtil.format(AV60DDO_PrdFHSAuxDateTo, "99/99/99"));
         }
         else
         {
            AV60DDO_PrdFHSAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_prdfhsauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60DDO_PrdFHSAuxDateTo", localUtil.format(AV60DDO_PrdFHSAuxDateTo, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_prdfecpreauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PRDFECPREAUXDATE");
            GX_FocusControl = edtavDdo_prdfecpreauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV101DDO_PrdFecPreAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101DDO_PrdFecPreAuxDate", localUtil.format(AV101DDO_PrdFecPreAuxDate, "99/99/99"));
         }
         else
         {
            AV101DDO_PrdFecPreAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_prdfecpreauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101DDO_PrdFecPreAuxDate", localUtil.format(AV101DDO_PrdFecPreAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ProductoWW");
         AV163Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV163Pgmname", AV163Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV163Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\productoww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
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
      e201QY2 ();
      if (returnInSub) return;
   }

   public void e201QY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV126Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      productoww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV126Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126Station", AV126Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV127EmprNom ;
      GXv_char4[0] = AV128UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV126Station, GXv_char2, GXv_char3, GXv_char4) ;
      productoww_impl.this.A396EmprCod = GXv_char2[0] ;
      productoww_impl.this.AV127EmprNom = GXv_char3[0] ;
      productoww_impl.this.AV128UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV128UsurCod", AV128UsurCod);
      GXt_int5 = (byte)(AV129CnoEnc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CNOENC", ""), GXv_int6) ;
      productoww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV129CnoEnc = GXt_int5 ;
      GXt_int5 = (byte)(AV130sustancias) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "THESUS", ""), GXv_int6) ;
      productoww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV130sustancias = GXt_int5 ;
      GXt_int5 = (byte)(AV131ProPrv) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int6) ;
      productoww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV131ProPrv = GXt_int5 ;
      GXt_int5 = (byte)(AV132moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      productoww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV132moda21 = GXt_int5 ;
      GXt_int5 = (byte)(AV146SiRGB) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIPRGB", ""), GXv_int6) ;
      productoww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV146SiRGB = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV146SiRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146SiRGB), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV146SiRGB), "ZZZ9")));
      GXt_char1 = AV126Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      productoww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV126Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126Station", AV126Station);
      GXv_char4[0] = AV133EmprCod ;
      GXv_char3[0] = AV127EmprNom ;
      GXv_char2[0] = AV128UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV126Station, GXv_char4, GXv_char3, GXv_char2) ;
      productoww_impl.this.AV133EmprCod = GXv_char4[0] ;
      productoww_impl.this.AV127EmprNom = GXv_char3[0] ;
      productoww_impl.this.AV128UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV133EmprCod", AV133EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV128UsurCod", AV128UsurCod);
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Producto Quimico", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV34DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV34DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e211QY2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("StocksQuimicos.ProductoWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("StocksQuimicos.ProductoWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdExiAlm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdCanRes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdDisponi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDisponi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDisponi_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdCanPen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanPen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanPen_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdPreAct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtTipPrdDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipPrdDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipPrdDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtValDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdRec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRec_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdAox_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAox_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAox_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdGots_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdReach_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdReach_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdReach_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbPrdOkotex.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdOkotex.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdOkotex.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdHm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbPrdZDHC.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdZDHC.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdZDHC.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      cmbPrdList.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdList.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdList.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdTHELIST_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdTHELIST_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTHELIST_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbPrdGRS.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdGRS.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdGRS.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdHS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHS_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdFHS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFHS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFHS_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNum2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum2_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNom2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom2_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdRefPrv_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRefPrv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRefPrv_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdFuncion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFuncion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFuncion_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdEINECS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdEINECS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdEINECS_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNCAS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNCAS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNCAS_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdRGB_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdGruFamD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGruFamD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGruFamD_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdPreAc2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAc2_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdFecPre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFecPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFecPre_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdPreAnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAnt_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV36GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GridCurrentPage), 10, 0));
      AV37GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121QY2( )
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
         AV35PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV35PageToGo) ;
      }
   }

   public void e131QY2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141QY2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV26TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNum", AV26TFPrdNum);
            AV27TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV28TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNom", AV28TFPrdNom);
            AV29TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNom_Sel", AV29TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiAlm") == 0 )
         {
            AV106TFPrdExiAlm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFPrdExiAlm", GXutil.ltrimstr( AV106TFPrdExiAlm, 12, 4));
            AV107TFPrdExiAlm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFPrdExiAlm_To", GXutil.ltrimstr( AV107TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanRes") == 0 )
         {
            AV108TFPrdCanRes = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFPrdCanRes", GXutil.ltrimstr( AV108TFPrdCanRes, 12, 4));
            AV109TFPrdCanRes_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109TFPrdCanRes_To", GXutil.ltrimstr( AV109TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdDisponible") == 0 )
         {
            AV135TFPrdDisponible = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV135TFPrdDisponible", GXutil.ltrimstr( AV135TFPrdDisponible, 12, 4));
            AV136TFPrdDisponible_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV136TFPrdDisponible_To", GXutil.ltrimstr( AV136TFPrdDisponible_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanPen") == 0 )
         {
            AV110TFPrdCanPen = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFPrdCanPen", GXutil.ltrimstr( AV110TFPrdCanPen, 12, 4));
            AV111TFPrdCanPen_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFPrdCanPen_To", GXutil.ltrimstr( AV111TFPrdCanPen_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdPreAct") == 0 )
         {
            AV97TFPrdPreAct = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFPrdPreAct", GXutil.ltrimstr( AV97TFPrdPreAct, 14, 5));
            AV98TFPrdPreAct_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFPrdPreAct_To", GXutil.ltrimstr( AV98TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipPrdDsc") == 0 )
         {
            AV112TFTipPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TFTipPrdDsc", AV112TFTipPrdDsc);
            AV113TFTipPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TFTipPrdDsc_Sel", AV113TFTipPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValDsc") == 0 )
         {
            AV81TFValDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFValDsc", AV81TFValDsc);
            AV82TFValDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFValDsc_Sel", AV82TFValDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdRec") == 0 )
         {
            AV83TFPrdRec = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFPrdRec", AV83TFPrdRec);
            AV84TFPrdRec_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFPrdRec_Sel", AV84TFPrdRec_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdAox") == 0 )
         {
            AV39TFPrdAox = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdAox", GXutil.ltrimstr( AV39TFPrdAox, 6, 2));
            AV40TFPrdAox_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrdAox_To", GXutil.ltrimstr( AV40TFPrdAox_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdGots") == 0 )
         {
            AV41TFPrdGots = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrdGots", AV41TFPrdGots);
            AV42TFPrdGots_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFPrdGots_Sel", AV42TFPrdGots_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdReach") == 0 )
         {
            AV43TFPrdReach = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrdReach", AV43TFPrdReach);
            AV44TFPrdReach_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPrdReach_Sel", AV44TFPrdReach_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdOkotex") == 0 )
         {
            AV45TFPrdOkotex_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPrdOkotex_SelsJson", AV45TFPrdOkotex_SelsJson);
            AV46TFPrdOkotex_Sels.fromJSonString(AV45TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdHm") == 0 )
         {
            AV47TFPrdHm = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdHm", AV47TFPrdHm);
            AV48TFPrdHm_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFPrdHm_Sel", AV48TFPrdHm_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdZDHC") == 0 )
         {
            AV49TFPrdZDHC_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFPrdZDHC_SelsJson", AV49TFPrdZDHC_SelsJson);
            AV50TFPrdZDHC_Sels.fromJSonString(AV49TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdList") == 0 )
         {
            AV51TFPrdList_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdList_SelsJson", AV51TFPrdList_SelsJson);
            AV52TFPrdList_Sels.fromJSonString(AV51TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdTHELIST") == 0 )
         {
            AV53TFPrdTHELIST = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdTHELIST", AV53TFPrdTHELIST);
            AV54TFPrdTHELIST_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdTHELIST_Sel", AV54TFPrdTHELIST_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdGRS") == 0 )
         {
            AV114TFPrdGRS_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TFPrdGRS_SelsJson", AV114TFPrdGRS_SelsJson);
            AV115TFPrdGRS_Sels.fromJSonString(AV114TFPrdGRS_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdHS") == 0 )
         {
            AV55TFPrdHS = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrdHS", AV55TFPrdHS);
            AV56TFPrdHS_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdHS_Sel", AV56TFPrdHS_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdFHS") == 0 )
         {
            AV57TFPrdFHS = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFPrdFHS", localUtil.format(AV57TFPrdFHS, "99/99/99"));
            AV58TFPrdFHS_To = localUtil.ctod( Ddo_grid_Filteredtextto_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrdFHS_To", localUtil.format(AV58TFPrdFHS_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum2") == 0 )
         {
            AV116TFPrdNum2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116TFPrdNum2", AV116TFPrdNum2);
            AV117TFPrdNum2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFPrdNum2_Sel", AV117TFPrdNum2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom2") == 0 )
         {
            AV118TFPrdNom2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118TFPrdNom2", AV118TFPrdNom2);
            AV119TFPrdNom2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFPrdNom2_Sel", AV119TFPrdNom2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdRefPrv") == 0 )
         {
            AV65TFPrdRefPrv = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdRefPrv", AV65TFPrdRefPrv);
            AV66TFPrdRefPrv_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdRefPrv_Sel", AV66TFPrdRefPrv_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdFuncion") == 0 )
         {
            AV120TFPrdFuncion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120TFPrdFuncion", AV120TFPrdFuncion);
            AV121TFPrdFuncion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV121TFPrdFuncion_Sel", AV121TFPrdFuncion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdEINECS") == 0 )
         {
            AV122TFPrdEINECS = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122TFPrdEINECS", AV122TFPrdEINECS);
            AV123TFPrdEINECS_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123TFPrdEINECS_Sel", AV123TFPrdEINECS_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNCAS") == 0 )
         {
            AV124TFPrdNCAS = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124TFPrdNCAS", AV124TFPrdNCAS);
            AV125TFPrdNCAS_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125TFPrdNCAS_Sel", AV125TFPrdNCAS_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNum") == 0 )
         {
            AV30TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPrvNum), 6, 0));
            AV31TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV32TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrvNom", AV32TFPrvNom);
            AV33TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrvNom_Sel", AV33TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdRGB") == 0 )
         {
            AV144TFPrdRGB = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144TFPrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144TFPrdRGB), 10, 0));
            AV145TFPrdRGB_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145TFPrdRGB_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145TFPrdRGB_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdGruFamDc") == 0 )
         {
            AV159TFPrdGruFamDc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV159TFPrdGruFamDc", AV159TFPrdGruFamDc);
            AV160TFPrdGruFamDc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV160TFPrdGruFamDc_Sel", AV160TFPrdGruFamDc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdPreAc2") == 0 )
         {
            AV157TFPrdPreAc2 = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV157TFPrdPreAc2", GXutil.ltrimstr( AV157TFPrdPreAc2, 14, 5));
            AV158TFPrdPreAc2_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV158TFPrdPreAc2_To", GXutil.ltrimstr( AV158TFPrdPreAc2_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdFecPre") == 0 )
         {
            AV99TFPrdFecPre = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFPrdFecPre", localUtil.format(AV99TFPrdFecPre, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdPreAnt") == 0 )
         {
            AV103TFPrdPreAnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFPrdPreAnt", GXutil.ltrimstr( AV103TFPrdPreAnt, 14, 5));
            AV104TFPrdPreAnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFPrdPreAnt_To", GXutil.ltrimstr( AV104TFPrdPreAnt_To, 14, 5));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV115TFPrdGRS_Sels", AV115TFPrdGRS_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV52TFPrdList_Sels", AV52TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50TFPrdZDHC_Sels", AV50TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46TFPrdOkotex_Sels", AV46TFPrdOkotex_Sels);
   }

   private void e221QY2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int6) ;
         productoww_impl.this.GXt_int5 = GXv_int6[0] ;
         AV154TempBoolean = (boolean)((GXt_int5==1)) ;
         if ( AV154TempBoolean )
         {
            cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Proveedores", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CNOENC", ""), GXv_int6) ;
         productoww_impl.this.GXt_int5 = GXv_int6[0] ;
         AV154TempBoolean = (boolean)((GXt_int5==1)) ;
         if ( AV154TempBoolean )
         {
            cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Cuaderno Encargos", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Frases R", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "THESUS", ""), GXv_int6) ;
         productoww_impl.this.GXt_int5 = GXv_int6[0] ;
         AV154TempBoolean = (boolean)((GXt_int5==1)) ;
         if ( AV154TempBoolean )
         {
            cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Sustancias a controlar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
         productoww_impl.this.GXt_int5 = GXv_int6[0] ;
         AV154TempBoolean = (boolean)((GXt_int5==1)) ;
         if ( AV154TempBoolean )
         {
            cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Lotes", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
         productoww_impl.this.GXt_int5 = GXv_int6[0] ;
         AV154TempBoolean = (boolean)((GXt_int5==1)) ;
         if ( AV154TempBoolean )
         {
            cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Lotes WW", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("10", GXutil.format( "%1;%2", httpContext.getMessage( "Nº CAS n Componentes", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("11", GXutil.format( "%1;%2", httpContext.getMessage( "Duplicar Producto", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("12", GXutil.format( "%1;%2", httpContext.getMessage( "Movimientos Entradas (precios)", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         AV147Var_ForRGB = ((A13232PrdRGB==0) ? 65793 : A13232PrdRGB) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVar_forrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV147Var_ForRGB), 10, 0));
         GXv_int10[0] = AV148R ;
         GXv_int11[0] = AV149G ;
         GXv_int12[0] = AV150B ;
         GXv_int13[0] = AV151R2 ;
         GXv_int14[0] = AV152G2 ;
         GXv_int15[0] = AV153B2 ;
         new app.backcolorforecolor(remoteHandle, context).execute( AV147Var_ForRGB, GXv_int10, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_int15) ;
         productoww_impl.this.AV148R = GXv_int10[0] ;
         productoww_impl.this.AV149G = GXv_int11[0] ;
         productoww_impl.this.AV150B = GXv_int12[0] ;
         productoww_impl.this.AV151R2 = GXv_int13[0] ;
         productoww_impl.this.AV152G2 = GXv_int14[0] ;
         productoww_impl.this.AV153B2 = GXv_int15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148R), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149G), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV150B), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151R2), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152G2), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153B2), 3, 0));
         if ( AV146SiRGB == 1 )
         {
            edtPrdNom_Backcolor = GXutil.getColor( AV148R, AV149G, AV150B) ;
            edtPrdNom_Forecolor = GXutil.getColor( AV151R2, AV152G2, AV153B2) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(43) ;
         }
         sendrow_432( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV38GridActions, 4, 0)) );
   }

   public void e151QY2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ProductoWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111QY2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.ProductoWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV163Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.ProductoWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "StocksQuimicos.ProductoWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         productoww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV163Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46TFPrdOkotex_Sels", AV46TFPrdOkotex_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50TFPrdZDHC_Sels", AV50TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV52TFPrdList_Sels", AV52TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV115TFPrdGRS_Sels", AV115TFPrdGRS_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e231QY2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV38GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 4 )
      {
         /* Execute user subroutine: 'DO PROVEEDORES' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 5 )
      {
         /* Execute user subroutine: 'DO CUADERNOENCARGOS' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 6 )
      {
         /* Execute user subroutine: 'DO FRASESRIESGOS' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 7 )
      {
         /* Execute user subroutine: 'DO SUSTANCIASACONTROLAR' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 8 )
      {
         /* Execute user subroutine: 'DO LOTES' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 9 )
      {
         /* Execute user subroutine: 'DO LOTESWW' */
         S272 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 10 )
      {
         /* Execute user subroutine: 'DO CAS' */
         S282 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 11 )
      {
         /* Execute user subroutine: 'DO DUPLICARPRODUCTO' */
         S292 ();
         if (returnInSub) return;
      }
      else if ( AV38GridActions == 12 )
      {
         /* Execute user subroutine: 'DO MOVIMIENTOSENTRADAS' */
         S302 ();
         if (returnInSub) return;
      }
      AV38GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV38GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e161QY2( )
   {
      /* Movimientosentradas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e171QY2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.producto", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","PrdNum","PrdRGB"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void e181QY2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.stocksquimicos.productowwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      productoww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      productoww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV115TFPrdGRS_Sels", AV115TFPrdGRS_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV52TFPrdList_Sels", AV52TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50TFPrdZDHC_Sels", AV50TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46TFPrdOkotex_Sels", AV46TFPrdOkotex_Sels);
   }

   public void e191QY2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.stocksquimicos.productowwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV115TFPrdGRS_Sels", AV115TFPrdGRS_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV52TFPrdList_Sels", AV52TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50TFPrdZDHC_Sels", AV50TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46TFPrdOkotex_Sels", AV46TFPrdOkotex_Sels);
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdNum", "", "Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdNom", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdExiAlm", "", "Exis. Alm.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdCanRes", "", "Cant. Reser.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdDisponible", "", "Disponible", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdCanPen", "", "Pdte. Recibir", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "TipPrdDsc", "", "Tipo Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "ValDsc", "", "Validez", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdRec", "", "En Rec.?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdAox", "", "AOX", true, "") ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdGRS", "", "GRS", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdHS", "", "Ficha Seg.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdFHS", "", "Fecha Seg.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdNum2", "", "Producto Aux.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdNom2", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdRefPrv", "", "Referencia Proveedor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdFuncion", "", "Funcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdEINECS", "", "N EINECS", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdNCAS", "", "Nº CAS", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrvNum", "", "Proveedor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrvNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdRGB", "", "Rgb(Decimal)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdGruFamDc", "", "Familia", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdPreAc2", "", "Precio(2)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdFecPre", "", " Fecha Ult Precio,", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PrdPreAnt", "", "Precio Anterior", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ProductoWWColumnsSelector", GXv_char4) ;
      productoww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "StocksQuimicos.ProductoWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNum", AV26TFPrdNum);
      AV27TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
      AV28TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNom", AV28TFPrdNom);
      AV29TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNom_Sel", AV29TFPrdNom_Sel);
      AV106TFPrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106TFPrdExiAlm", GXutil.ltrimstr( AV106TFPrdExiAlm, 12, 4));
      AV107TFPrdExiAlm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107TFPrdExiAlm_To", GXutil.ltrimstr( AV107TFPrdExiAlm_To, 12, 4));
      AV108TFPrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108TFPrdCanRes", GXutil.ltrimstr( AV108TFPrdCanRes, 12, 4));
      AV109TFPrdCanRes_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109TFPrdCanRes_To", GXutil.ltrimstr( AV109TFPrdCanRes_To, 12, 4));
      AV135TFPrdDisponible = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV135TFPrdDisponible", GXutil.ltrimstr( AV135TFPrdDisponible, 12, 4));
      AV136TFPrdDisponible_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV136TFPrdDisponible_To", GXutil.ltrimstr( AV136TFPrdDisponible_To, 12, 4));
      AV110TFPrdCanPen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TFPrdCanPen", GXutil.ltrimstr( AV110TFPrdCanPen, 12, 4));
      AV111TFPrdCanPen_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111TFPrdCanPen_To", GXutil.ltrimstr( AV111TFPrdCanPen_To, 12, 4));
      AV97TFPrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97TFPrdPreAct", GXutil.ltrimstr( AV97TFPrdPreAct, 14, 5));
      AV98TFPrdPreAct_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98TFPrdPreAct_To", GXutil.ltrimstr( AV98TFPrdPreAct_To, 14, 5));
      AV112TFTipPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112TFTipPrdDsc", AV112TFTipPrdDsc);
      AV113TFTipPrdDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113TFTipPrdDsc_Sel", AV113TFTipPrdDsc_Sel);
      AV81TFValDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFValDsc", AV81TFValDsc);
      AV82TFValDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFValDsc_Sel", AV82TFValDsc_Sel);
      AV83TFPrdRec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFPrdRec", AV83TFPrdRec);
      AV84TFPrdRec_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84TFPrdRec_Sel", AV84TFPrdRec_Sel);
      AV39TFPrdAox = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdAox", GXutil.ltrimstr( AV39TFPrdAox, 6, 2));
      AV40TFPrdAox_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrdAox_To", GXutil.ltrimstr( AV40TFPrdAox_To, 6, 2));
      AV41TFPrdGots = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrdGots", AV41TFPrdGots);
      AV42TFPrdGots_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFPrdGots_Sel", AV42TFPrdGots_Sel);
      AV43TFPrdReach = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrdReach", AV43TFPrdReach);
      AV44TFPrdReach_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFPrdReach_Sel", AV44TFPrdReach_Sel);
      AV46TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV47TFPrdHm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdHm", AV47TFPrdHm);
      AV48TFPrdHm_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFPrdHm_Sel", AV48TFPrdHm_Sel);
      AV50TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV53TFPrdTHELIST = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdTHELIST", AV53TFPrdTHELIST);
      AV54TFPrdTHELIST_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdTHELIST_Sel", AV54TFPrdTHELIST_Sel);
      AV115TFPrdGRS_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV55TFPrdHS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrdHS", AV55TFPrdHS);
      AV56TFPrdHS_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdHS_Sel", AV56TFPrdHS_Sel);
      AV57TFPrdFHS = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFPrdFHS", localUtil.format(AV57TFPrdFHS, "99/99/99"));
      AV58TFPrdFHS_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrdFHS_To", localUtil.format(AV58TFPrdFHS_To, "99/99/99"));
      AV116TFPrdNum2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116TFPrdNum2", AV116TFPrdNum2);
      AV117TFPrdNum2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117TFPrdNum2_Sel", AV117TFPrdNum2_Sel);
      AV118TFPrdNom2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118TFPrdNom2", AV118TFPrdNom2);
      AV119TFPrdNom2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119TFPrdNom2_Sel", AV119TFPrdNom2_Sel);
      AV65TFPrdRefPrv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdRefPrv", AV65TFPrdRefPrv);
      AV66TFPrdRefPrv_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdRefPrv_Sel", AV66TFPrdRefPrv_Sel);
      AV120TFPrdFuncion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120TFPrdFuncion", AV120TFPrdFuncion);
      AV121TFPrdFuncion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121TFPrdFuncion_Sel", AV121TFPrdFuncion_Sel);
      AV122TFPrdEINECS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122TFPrdEINECS", AV122TFPrdEINECS);
      AV123TFPrdEINECS_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123TFPrdEINECS_Sel", AV123TFPrdEINECS_Sel);
      AV124TFPrdNCAS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124TFPrdNCAS", AV124TFPrdNCAS);
      AV125TFPrdNCAS_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125TFPrdNCAS_Sel", AV125TFPrdNCAS_Sel);
      AV30TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPrvNum), 6, 0));
      AV31TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFPrvNum_To), 6, 0));
      AV32TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrvNom", AV32TFPrvNom);
      AV33TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrvNom_Sel", AV33TFPrvNom_Sel);
      AV144TFPrdRGB = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV144TFPrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144TFPrdRGB), 10, 0));
      AV145TFPrdRGB_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV145TFPrdRGB_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145TFPrdRGB_To), 10, 0));
      AV159TFPrdGruFamDc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV159TFPrdGruFamDc", AV159TFPrdGruFamDc);
      AV160TFPrdGruFamDc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV160TFPrdGruFamDc_Sel", AV160TFPrdGruFamDc_Sel);
      AV157TFPrdPreAc2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV157TFPrdPreAc2", GXutil.ltrimstr( AV157TFPrdPreAc2, 14, 5));
      AV158TFPrdPreAc2_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV158TFPrdPreAc2_To", GXutil.ltrimstr( AV158TFPrdPreAc2_To, 14, 5));
      AV99TFPrdFecPre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99TFPrdFecPre", localUtil.format(AV99TFPrdFecPre, "99/99/99"));
      AV103TFPrdPreAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103TFPrdPreAnt", GXutil.ltrimstr( AV103TFPrdPreAnt, 14, 5));
      AV104TFPrdPreAnt_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104TFPrdPreAnt_To", GXutil.ltrimstr( AV104TFPrdPreAnt_To, 14, 5));
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
      callWebObject(formatLink("app.stocksquimicos.producto", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(A13232PrdRGB,10,0))}, new String[] {"Mode","EmprCod","PrdNum","PrdRGB"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.producto", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(A13232PrdRGB,10,0))}, new String[] {"Mode","EmprCod","PrdNum","PrdRGB"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.producto", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(AV143PrdRgb,10,0))}, new String[] {"Mode","EmprCod","PrdNum","PrdRGB"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO PROVEEDORES' Routine */
      returnInSub = false ;
      AV142Window.setAutoresize( 0 );
      AV142Window.setWidth( 1000 );
      AV142Window.setHeight( 600 );
      /* Window Datatype Object Property */
      AV142Window.setUrl( formatLink("app.tnprovprd", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"})  );
      AV142Window.setReturnParms(new Object[] {});
      httpContext.newWindow(AV142Window);
      httpContext.doAjaxRefresh();
      if ( 1 == 0 )
      {
         httpContext.popup(formatLink("app.tnprovprd", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
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
      if ( GXutil.strcmp(A13302PrdTHELIST, " ") != 0 )
      {
         GXv_char4[0] = AV133EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = A718PrdNom ;
         GXv_char20[0] = A13302PrdTHELIST ;
         GXv_char21[0] = AV134OldPrdTHELIST ;
         GXv_char22[0] = AV128UsurCod ;
         GXv_char23[0] = AV126Station ;
         new app.pdltthelist(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char20, GXv_char21, GXv_char22, GXv_char23) ;
         productoww_impl.this.AV133EmprCod = GXv_char4[0] ;
         productoww_impl.this.A719PrdNum = GXv_char3[0] ;
         productoww_impl.this.A718PrdNom = GXv_char2[0] ;
         productoww_impl.this.A13302PrdTHELIST = GXv_char20[0] ;
         productoww_impl.this.AV134OldPrdTHELIST = GXv_char21[0] ;
         productoww_impl.this.AV128UsurCod = GXv_char22[0] ;
         productoww_impl.this.AV126Station = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV133EmprCod", AV133EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV134OldPrdTHELIST", AV134OldPrdTHELIST);
         httpContext.ajax_rsp_assign_attri("", false, "AV128UsurCod", AV128UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV126Station", AV126Station);
         httpContext.popup(formatLink("app.tcatsus", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV133EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A13302PrdTHELIST))}, new String[] {"Mode","EmprCod","PrdNum","TheList"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      if ( 1 == 0 )
      {
         httpContext.popup(formatLink("app.tcatsus", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A13302PrdTHELIST))}, new String[] {"Mode","EmprCod","PrdNum","TheList"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
   }

   public void S262( )
   {
      /* 'DO LOTES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.stocksquimicos.tlotprd", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.formatDateParm(Gx_date)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","PrdNum","PrdNom","LotePed","LoteFec","LoteNEmb"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S272( )
   {
      /* 'DO LOTESWW' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.stocksquimicos.tlotprdww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom))}, new String[] {"EmprCod","PrdNum","PrdNom"}) , new Object[] {"A396EmprCod","A719PrdNum","A718PrdNom"});
      httpContext.doAjaxRefresh();
   }

   public void S282( )
   {
      /* 'DO CAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.stocksquimicos.tprdncas", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S292( )
   {
      /* 'DO DUPLICARPRODUCTO' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.productoduplicar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom))}, new String[] {"emprcod","Prdnum","Prdnom"}) , new Object[] {"A396EmprCod","A719PrdNum","A718PrdNom"});
      httpContext.doAjaxRefresh();
   }

   public void S302( )
   {
      /* 'DO MOVIMIENTOSENTRADAS' Routine */
      returnInSub = false ;
      AV138Active_EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138Active_EmprCod", AV138Active_EmprCod);
      AV139Active_PrdNum = A719PrdNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV139Active_PrdNum", AV139Active_PrdNum);
      AV141Active_PrdNom = A718PrdNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV141Active_PrdNom", AV141Active_PrdNom);
      this.executeUsercontrolMethod("", false, "MOVIMIENTOSENTRADAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV163Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV163Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV163Pgmname+"GridState"), null, null);
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
      AV165GXV1 = 1 ;
      while ( AV165GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV165GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
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
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV28TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNom", AV28TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV29TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNom_Sel", AV29TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV106TFPrdExiAlm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFPrdExiAlm", GXutil.ltrimstr( AV106TFPrdExiAlm, 12, 4));
            AV107TFPrdExiAlm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFPrdExiAlm_To", GXutil.ltrimstr( AV107TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV108TFPrdCanRes = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFPrdCanRes", GXutil.ltrimstr( AV108TFPrdCanRes, 12, 4));
            AV109TFPrdCanRes_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109TFPrdCanRes_To", GXutil.ltrimstr( AV109TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV135TFPrdDisponible = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV135TFPrdDisponible", GXutil.ltrimstr( AV135TFPrdDisponible, 12, 4));
            AV136TFPrdDisponible_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV136TFPrdDisponible_To", GXutil.ltrimstr( AV136TFPrdDisponible_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV110TFPrdCanPen = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFPrdCanPen", GXutil.ltrimstr( AV110TFPrdCanPen, 12, 4));
            AV111TFPrdCanPen_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFPrdCanPen_To", GXutil.ltrimstr( AV111TFPrdCanPen_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV97TFPrdPreAct = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFPrdPreAct", GXutil.ltrimstr( AV97TFPrdPreAct, 14, 5));
            AV98TFPrdPreAct_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFPrdPreAct_To", GXutil.ltrimstr( AV98TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV112TFTipPrdDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TFTipPrdDsc", AV112TFTipPrdDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV113TFTipPrdDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TFTipPrdDsc_Sel", AV113TFTipPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV81TFValDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFValDsc", AV81TFValDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV82TFValDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFValDsc_Sel", AV82TFValDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV83TFPrdRec = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFPrdRec", AV83TFPrdRec);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV84TFPrdRec_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFPrdRec_Sel", AV84TFPrdRec_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV39TFPrdAox = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdAox", GXutil.ltrimstr( AV39TFPrdAox, 6, 2));
            AV40TFPrdAox_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrdAox_To", GXutil.ltrimstr( AV40TFPrdAox_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV41TFPrdGots = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrdGots", AV41TFPrdGots);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV42TFPrdGots_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFPrdGots_Sel", AV42TFPrdGots_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV43TFPrdReach = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrdReach", AV43TFPrdReach);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV44TFPrdReach_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPrdReach_Sel", AV44TFPrdReach_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV45TFPrdOkotex_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPrdOkotex_SelsJson", AV45TFPrdOkotex_SelsJson);
            AV46TFPrdOkotex_Sels.fromJSonString(AV45TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV47TFPrdHm = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdHm", AV47TFPrdHm);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV48TFPrdHm_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFPrdHm_Sel", AV48TFPrdHm_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV49TFPrdZDHC_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFPrdZDHC_SelsJson", AV49TFPrdZDHC_SelsJson);
            AV50TFPrdZDHC_Sels.fromJSonString(AV49TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV51TFPrdList_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdList_SelsJson", AV51TFPrdList_SelsJson);
            AV52TFPrdList_Sels.fromJSonString(AV51TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV53TFPrdTHELIST = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdTHELIST", AV53TFPrdTHELIST);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV54TFPrdTHELIST_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdTHELIST_Sel", AV54TFPrdTHELIST_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGRS_SEL") == 0 )
         {
            AV114TFPrdGRS_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TFPrdGRS_SelsJson", AV114TFPrdGRS_SelsJson);
            AV115TFPrdGRS_Sels.fromJSonString(AV114TFPrdGRS_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV55TFPrdHS = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrdHS", AV55TFPrdHS);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV56TFPrdHS_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdHS_Sel", AV56TFPrdHS_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV57TFPrdFHS = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFPrdFHS", localUtil.format(AV57TFPrdFHS, "99/99/99"));
            AV58TFPrdFHS_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrdFHS_To", localUtil.format(AV58TFPrdFHS_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2") == 0 )
         {
            AV116TFPrdNum2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116TFPrdNum2", AV116TFPrdNum2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2_SEL") == 0 )
         {
            AV117TFPrdNum2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFPrdNum2_Sel", AV117TFPrdNum2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM2") == 0 )
         {
            AV118TFPrdNom2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118TFPrdNom2", AV118TFPrdNom2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM2_SEL") == 0 )
         {
            AV119TFPrdNom2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFPrdNom2_Sel", AV119TFPrdNom2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV65TFPrdRefPrv = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdRefPrv", AV65TFPrdRefPrv);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV66TFPrdRefPrv_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdRefPrv_Sel", AV66TFPrdRefPrv_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFUNCION") == 0 )
         {
            AV120TFPrdFuncion = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120TFPrdFuncion", AV120TFPrdFuncion);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFUNCION_SEL") == 0 )
         {
            AV121TFPrdFuncion_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV121TFPrdFuncion_Sel", AV121TFPrdFuncion_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEINECS") == 0 )
         {
            AV122TFPrdEINECS = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122TFPrdEINECS", AV122TFPrdEINECS);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEINECS_SEL") == 0 )
         {
            AV123TFPrdEINECS_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123TFPrdEINECS_Sel", AV123TFPrdEINECS_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCAS") == 0 )
         {
            AV124TFPrdNCAS = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124TFPrdNCAS", AV124TFPrdNCAS);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCAS_SEL") == 0 )
         {
            AV125TFPrdNCAS_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125TFPrdNCAS_Sel", AV125TFPrdNCAS_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV30TFPrvNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPrvNum), 6, 0));
            AV31TFPrvNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV32TFPrvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrvNom", AV32TFPrvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV33TFPrvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrvNom_Sel", AV33TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDRGB") == 0 )
         {
            AV144TFPrdRGB = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144TFPrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144TFPrdRGB), 10, 0));
            AV145TFPrdRGB_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145TFPrdRGB_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145TFPrdRGB_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGRUFAMDC") == 0 )
         {
            AV159TFPrdGruFamDc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV159TFPrdGruFamDc", AV159TFPrdGruFamDc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGRUFAMDC_SEL") == 0 )
         {
            AV160TFPrdGruFamDc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV160TFPrdGruFamDc_Sel", AV160TFPrdGruFamDc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREAC2") == 0 )
         {
            AV157TFPrdPreAc2 = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV157TFPrdPreAc2", GXutil.ltrimstr( AV157TFPrdPreAc2, 14, 5));
            AV158TFPrdPreAc2_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV158TFPrdPreAc2_To", GXutil.ltrimstr( AV158TFPrdPreAc2_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFECPRE") == 0 )
         {
            AV99TFPrdFecPre = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFPrdFecPre", localUtil.format(AV99TFPrdFecPre, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREANT") == 0 )
         {
            AV103TFPrdPreAnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFPrdPreAnt", GXutil.ltrimstr( AV103TFPrdPreAnt, 14, 5));
            AV104TFPrdPreAnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFPrdPreAnt_To", GXutil.ltrimstr( AV104TFPrdPreAnt_To, 14, 5));
         }
         AV165GXV1 = (int)(AV165GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char23[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFPrdNum_Sel)==0), AV27TFPrdNum_Sel, GXv_char23) ;
      productoww_impl.this.GXt_char1 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char22[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPrdNom_Sel)==0), AV29TFPrdNom_Sel, GXv_char22) ;
      productoww_impl.this.GXt_char24 = GXv_char22[0] ;
      GXt_char25 = "" ;
      GXv_char21[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV113TFTipPrdDsc_Sel)==0), AV113TFTipPrdDsc_Sel, GXv_char21) ;
      productoww_impl.this.GXt_char25 = GXv_char21[0] ;
      GXt_char26 = "" ;
      GXv_char20[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFValDsc_Sel)==0), AV82TFValDsc_Sel, GXv_char20) ;
      productoww_impl.this.GXt_char26 = GXv_char20[0] ;
      GXt_char27 = "" ;
      GXv_char4[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFPrdRec_Sel)==0), AV84TFPrdRec_Sel, GXv_char4) ;
      productoww_impl.this.GXt_char27 = GXv_char4[0] ;
      GXt_char28 = "" ;
      GXv_char3[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFPrdGots_Sel)==0), AV42TFPrdGots_Sel, GXv_char3) ;
      productoww_impl.this.GXt_char28 = GXv_char3[0] ;
      GXt_char29 = "" ;
      GXv_char2[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFPrdReach_Sel)==0), AV44TFPrdReach_Sel, GXv_char2) ;
      productoww_impl.this.GXt_char29 = GXv_char2[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV46TFPrdOkotex_Sels.size()==0), AV45TFPrdOkotex_SelsJson, GXv_char31) ;
      productoww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFPrdHm_Sel)==0), AV48TFPrdHm_Sel, GXv_char33) ;
      productoww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV50TFPrdZDHC_Sels.size()==0), AV49TFPrdZDHC_SelsJson, GXv_char35) ;
      productoww_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV52TFPrdList_Sels.size()==0), AV51TFPrdList_SelsJson, GXv_char37) ;
      productoww_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFPrdTHELIST_Sel)==0), AV54TFPrdTHELIST_Sel, GXv_char39) ;
      productoww_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV115TFPrdGRS_Sels.size()==0), AV114TFPrdGRS_SelsJson, GXv_char41) ;
      productoww_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char42 = "" ;
      GXv_char43[0] = GXt_char42 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFPrdHS_Sel)==0), AV56TFPrdHS_Sel, GXv_char43) ;
      productoww_impl.this.GXt_char42 = GXv_char43[0] ;
      GXt_char44 = "" ;
      GXv_char45[0] = GXt_char44 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV117TFPrdNum2_Sel)==0), AV117TFPrdNum2_Sel, GXv_char45) ;
      productoww_impl.this.GXt_char44 = GXv_char45[0] ;
      GXt_char46 = "" ;
      GXv_char47[0] = GXt_char46 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV119TFPrdNom2_Sel)==0), AV119TFPrdNom2_Sel, GXv_char47) ;
      productoww_impl.this.GXt_char46 = GXv_char47[0] ;
      GXt_char48 = "" ;
      GXv_char49[0] = GXt_char48 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFPrdRefPrv_Sel)==0), AV66TFPrdRefPrv_Sel, GXv_char49) ;
      productoww_impl.this.GXt_char48 = GXv_char49[0] ;
      GXt_char50 = "" ;
      GXv_char51[0] = GXt_char50 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV121TFPrdFuncion_Sel)==0), AV121TFPrdFuncion_Sel, GXv_char51) ;
      productoww_impl.this.GXt_char50 = GXv_char51[0] ;
      GXt_char52 = "" ;
      GXv_char53[0] = GXt_char52 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV123TFPrdEINECS_Sel)==0), AV123TFPrdEINECS_Sel, GXv_char53) ;
      productoww_impl.this.GXt_char52 = GXv_char53[0] ;
      GXt_char54 = "" ;
      GXv_char55[0] = GXt_char54 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV125TFPrdNCAS_Sel)==0), AV125TFPrdNCAS_Sel, GXv_char55) ;
      productoww_impl.this.GXt_char54 = GXv_char55[0] ;
      GXt_char56 = "" ;
      GXv_char57[0] = GXt_char56 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFPrvNom_Sel)==0), AV33TFPrvNom_Sel, GXv_char57) ;
      productoww_impl.this.GXt_char56 = GXv_char57[0] ;
      GXt_char58 = "" ;
      GXv_char59[0] = GXt_char58 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV160TFPrdGruFamDc_Sel)==0), AV160TFPrdGruFamDc_Sel, GXv_char59) ;
      productoww_impl.this.GXt_char58 = GXv_char59[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char24+"||||||"+GXt_char25+"|"+GXt_char26+"|"+GXt_char27+"||"+GXt_char28+"|"+GXt_char29+"|"+GXt_char30+"|"+GXt_char32+"|"+GXt_char34+"|"+GXt_char36+"|"+GXt_char38+"|"+GXt_char40+"|"+GXt_char42+"||"+GXt_char44+"|"+GXt_char46+"|"+GXt_char48+"|"+GXt_char50+"|"+GXt_char52+"|"+GXt_char54+"||"+GXt_char56+"||"+GXt_char58+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char58 = "" ;
      GXv_char59[0] = GXt_char58 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFPrdNum)==0), AV26TFPrdNum, GXv_char59) ;
      productoww_impl.this.GXt_char58 = GXv_char59[0] ;
      GXt_char56 = "" ;
      GXv_char57[0] = GXt_char56 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPrdNom)==0), AV28TFPrdNom, GXv_char57) ;
      productoww_impl.this.GXt_char56 = GXv_char57[0] ;
      GXt_char54 = "" ;
      GXv_char55[0] = GXt_char54 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV112TFTipPrdDsc)==0), AV112TFTipPrdDsc, GXv_char55) ;
      productoww_impl.this.GXt_char54 = GXv_char55[0] ;
      GXt_char52 = "" ;
      GXv_char53[0] = GXt_char52 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFValDsc)==0), AV81TFValDsc, GXv_char53) ;
      productoww_impl.this.GXt_char52 = GXv_char53[0] ;
      GXt_char50 = "" ;
      GXv_char51[0] = GXt_char50 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFPrdRec)==0), AV83TFPrdRec, GXv_char51) ;
      productoww_impl.this.GXt_char50 = GXv_char51[0] ;
      GXt_char48 = "" ;
      GXv_char49[0] = GXt_char48 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFPrdGots)==0), AV41TFPrdGots, GXv_char49) ;
      productoww_impl.this.GXt_char48 = GXv_char49[0] ;
      GXt_char46 = "" ;
      GXv_char47[0] = GXt_char46 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFPrdReach)==0), AV43TFPrdReach, GXv_char47) ;
      productoww_impl.this.GXt_char46 = GXv_char47[0] ;
      GXt_char44 = "" ;
      GXv_char45[0] = GXt_char44 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFPrdHm)==0), AV47TFPrdHm, GXv_char45) ;
      productoww_impl.this.GXt_char44 = GXv_char45[0] ;
      GXt_char42 = "" ;
      GXv_char43[0] = GXt_char42 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFPrdTHELIST)==0), AV53TFPrdTHELIST, GXv_char43) ;
      productoww_impl.this.GXt_char42 = GXv_char43[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFPrdHS)==0), AV55TFPrdHS, GXv_char41) ;
      productoww_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV116TFPrdNum2)==0), AV116TFPrdNum2, GXv_char39) ;
      productoww_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV118TFPrdNom2)==0), AV118TFPrdNom2, GXv_char37) ;
      productoww_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFPrdRefPrv)==0), AV65TFPrdRefPrv, GXv_char35) ;
      productoww_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV120TFPrdFuncion)==0), AV120TFPrdFuncion, GXv_char33) ;
      productoww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV122TFPrdEINECS)==0), AV122TFPrdEINECS, GXv_char31) ;
      productoww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char29 = "" ;
      GXv_char23[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV124TFPrdNCAS)==0), AV124TFPrdNCAS, GXv_char23) ;
      productoww_impl.this.GXt_char29 = GXv_char23[0] ;
      GXt_char28 = "" ;
      GXv_char22[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPrvNom)==0), AV32TFPrvNom, GXv_char22) ;
      productoww_impl.this.GXt_char28 = GXv_char22[0] ;
      GXt_char27 = "" ;
      GXv_char21[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV159TFPrdGruFamDc)==0), AV159TFPrdGruFamDc, GXv_char21) ;
      productoww_impl.this.GXt_char27 = GXv_char21[0] ;
      Ddo_grid_Filteredtext_set = GXt_char58+"|"+GXt_char56+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFPrdExiAlm)==0) ? "" : GXutil.str( AV106TFPrdExiAlm, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFPrdCanRes)==0) ? "" : GXutil.str( AV108TFPrdCanRes, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV135TFPrdDisponible)==0) ? "" : GXutil.str( AV135TFPrdDisponible, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV110TFPrdCanPen)==0) ? "" : GXutil.str( AV110TFPrdCanPen, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFPrdPreAct)==0) ? "" : GXutil.str( AV97TFPrdPreAct, 14, 5))+"|"+GXt_char54+"|"+GXt_char52+"|"+GXt_char50+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdAox)==0) ? "" : GXutil.str( AV39TFPrdAox, 6, 2))+"|"+GXt_char48+"|"+GXt_char46+"||"+GXt_char44+"|||"+GXt_char42+"||"+GXt_char40+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFPrdFHS)) ? "" : localUtil.dtoc( AV57TFPrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char38+"|"+GXt_char36+"|"+GXt_char34+"|"+GXt_char32+"|"+GXt_char30+"|"+GXt_char29+"|"+((0==AV30TFPrvNum) ? "" : GXutil.str( AV30TFPrvNum, 6, 0))+"|"+GXt_char28+"|"+((0==AV144TFPrdRGB) ? "" : GXutil.str( AV144TFPrdRGB, 10, 0))+"|"+GXt_char27+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV157TFPrdPreAc2)==0) ? "" : GXutil.str( AV157TFPrdPreAc2, 14, 5))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99TFPrdFecPre)) ? "" : localUtil.dtoc( AV99TFPrdFecPre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TFPrdPreAnt)==0) ? "" : GXutil.str( AV103TFPrdPreAnt, 14, 5)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFPrdExiAlm_To)==0) ? "" : GXutil.str( AV107TFPrdExiAlm_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV109TFPrdCanRes_To)==0) ? "" : GXutil.str( AV109TFPrdCanRes_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV136TFPrdDisponible_To)==0) ? "" : GXutil.str( AV136TFPrdDisponible_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV111TFPrdCanPen_To)==0) ? "" : GXutil.str( AV111TFPrdCanPen_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFPrdPreAct_To)==0) ? "" : GXutil.str( AV98TFPrdPreAct_To, 14, 5))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdAox_To)==0) ? "" : GXutil.str( AV40TFPrdAox_To, 6, 2))+"||||||||||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFPrdFHS_To)) ? "" : localUtil.dtoc( AV58TFPrdFHS_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|||||||"+((0==AV31TFPrvNum_To) ? "" : GXutil.str( AV31TFPrvNum_To, 6, 0))+"||"+((0==AV145TFPrdRGB_To) ? "" : GXutil.str( AV145TFPrdRGB_To, 10, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV158TFPrdPreAc2_To)==0) ? "" : GXutil.str( AV158TFPrdPreAc2_To, 14, 5))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV104TFPrdPreAnt_To)==0) ? "" : GXutil.str( AV104TFPrdPreAnt_To, 14, 5)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV163Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDNUM", "", !(GXutil.strcmp("", AV26TFPrdNum)==0), (short)(0), AV26TFPrdNum, "", !(GXutil.strcmp("", AV27TFPrdNum_Sel)==0), AV27TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDNOM", "", !(GXutil.strcmp("", AV28TFPrdNom)==0), (short)(0), AV28TFPrdNom, "", !(GXutil.strcmp("", AV29TFPrdNom_Sel)==0), AV29TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDEXIALM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFPrdExiAlm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFPrdExiAlm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV106TFPrdExiAlm, 12, 4)), GXutil.trim( GXutil.str( AV107TFPrdExiAlm_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDCANRES", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFPrdCanRes)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV109TFPrdCanRes_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV108TFPrdCanRes, 12, 4)), GXutil.trim( GXutil.str( AV109TFPrdCanRes_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDDISPONIBLE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV135TFPrdDisponible)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV136TFPrdDisponible_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV135TFPrdDisponible, 12, 4)), GXutil.trim( GXutil.str( AV136TFPrdDisponible_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDCANPEN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV110TFPrdCanPen)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV111TFPrdCanPen_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV110TFPrdCanPen, 12, 4)), GXutil.trim( GXutil.str( AV111TFPrdCanPen_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDPREACT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFPrdPreAct)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFPrdPreAct_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV97TFPrdPreAct, 14, 5)), GXutil.trim( GXutil.str( AV98TFPrdPreAct_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFTIPPRDDSC", "", !(GXutil.strcmp("", AV112TFTipPrdDsc)==0), (short)(0), AV112TFTipPrdDsc, "", !(GXutil.strcmp("", AV113TFTipPrdDsc_Sel)==0), AV113TFTipPrdDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFVALDSC", "", !(GXutil.strcmp("", AV81TFValDsc)==0), (short)(0), AV81TFValDsc, "", !(GXutil.strcmp("", AV82TFValDsc_Sel)==0), AV82TFValDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDREC", "", !(GXutil.strcmp("", AV83TFPrdRec)==0), (short)(0), AV83TFPrdRec, "", !(GXutil.strcmp("", AV84TFPrdRec_Sel)==0), AV84TFPrdRec_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDAOX", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdAox)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdAox_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV39TFPrdAox, 6, 2)), GXutil.trim( GXutil.str( AV40TFPrdAox_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDGOTS", "", !(GXutil.strcmp("", AV41TFPrdGots)==0), (short)(0), AV41TFPrdGots, "", !(GXutil.strcmp("", AV42TFPrdGots_Sel)==0), AV42TFPrdGots_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDREACH", "", !(GXutil.strcmp("", AV43TFPrdReach)==0), (short)(0), AV43TFPrdReach, "", !(GXutil.strcmp("", AV44TFPrdReach_Sel)==0), AV44TFPrdReach_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDOKOTEX_SEL", "", !(AV46TFPrdOkotex_Sels.size()==0), (short)(0), AV46TFPrdOkotex_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDHM", "", !(GXutil.strcmp("", AV47TFPrdHm)==0), (short)(0), AV47TFPrdHm, "", !(GXutil.strcmp("", AV48TFPrdHm_Sel)==0), AV48TFPrdHm_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDZDHC_SEL", "", !(AV50TFPrdZDHC_Sels.size()==0), (short)(0), AV50TFPrdZDHC_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDLIST_SEL", "", !(AV52TFPrdList_Sels.size()==0), (short)(0), AV52TFPrdList_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDTHELIST", "", !(GXutil.strcmp("", AV53TFPrdTHELIST)==0), (short)(0), AV53TFPrdTHELIST, "", !(GXutil.strcmp("", AV54TFPrdTHELIST_Sel)==0), AV54TFPrdTHELIST_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDGRS_SEL", "", !(AV115TFPrdGRS_Sels.size()==0), (short)(0), AV115TFPrdGRS_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDHS", "", !(GXutil.strcmp("", AV55TFPrdHS)==0), (short)(0), AV55TFPrdHS, "", !(GXutil.strcmp("", AV56TFPrdHS_Sel)==0), AV56TFPrdHS_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDFHS", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFPrdFHS))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFPrdFHS_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV57TFPrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV58TFPrdFHS_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDNUM2", "", !(GXutil.strcmp("", AV116TFPrdNum2)==0), (short)(0), AV116TFPrdNum2, "", !(GXutil.strcmp("", AV117TFPrdNum2_Sel)==0), AV117TFPrdNum2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDNOM2", "", !(GXutil.strcmp("", AV118TFPrdNom2)==0), (short)(0), AV118TFPrdNom2, "", !(GXutil.strcmp("", AV119TFPrdNom2_Sel)==0), AV119TFPrdNom2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDREFPRV", "", !(GXutil.strcmp("", AV65TFPrdRefPrv)==0), (short)(0), AV65TFPrdRefPrv, "", !(GXutil.strcmp("", AV66TFPrdRefPrv_Sel)==0), AV66TFPrdRefPrv_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDFUNCION", "", !(GXutil.strcmp("", AV120TFPrdFuncion)==0), (short)(0), AV120TFPrdFuncion, "", !(GXutil.strcmp("", AV121TFPrdFuncion_Sel)==0), AV121TFPrdFuncion_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDEINECS", "", !(GXutil.strcmp("", AV122TFPrdEINECS)==0), (short)(0), AV122TFPrdEINECS, "", !(GXutil.strcmp("", AV123TFPrdEINECS_Sel)==0), AV123TFPrdEINECS_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDNCAS", "", !(GXutil.strcmp("", AV124TFPrdNCAS)==0), (short)(0), AV124TFPrdNCAS, "", !(GXutil.strcmp("", AV125TFPrdNCAS_Sel)==0), AV125TFPrdNCAS_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRVNUM", "", !((0==AV30TFPrvNum)&&(0==AV31TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV31TFPrvNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRVNOM", "", !(GXutil.strcmp("", AV32TFPrvNom)==0), (short)(0), AV32TFPrvNom, "", !(GXutil.strcmp("", AV33TFPrvNom_Sel)==0), AV33TFPrvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDRGB", "", !((0==AV144TFPrdRGB)&&(0==AV145TFPrdRGB_To)), (short)(0), GXutil.trim( GXutil.str( AV144TFPrdRGB, 10, 0)), GXutil.trim( GXutil.str( AV145TFPrdRGB_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDGRUFAMDC", "", !(GXutil.strcmp("", AV159TFPrdGruFamDc)==0), (short)(0), AV159TFPrdGruFamDc, "", !(GXutil.strcmp("", AV160TFPrdGruFamDc_Sel)==0), AV160TFPrdGruFamDc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDPREAC2", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV157TFPrdPreAc2)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV158TFPrdPreAc2_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV157TFPrdPreAc2, 14, 5)), GXutil.trim( GXutil.str( AV158TFPrdPreAc2_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDFECPRE", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99TFPrdFecPre)), (short)(0), GXutil.trim( localUtil.dtoc( AV99TFPrdFecPre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      GXv_SdtWWPGridState60[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState60, "TFPRDPREANT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TFPrdPreAnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV104TFPrdPreAnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV103TFPrdPreAnt, 14, 5)), GXutil.trim( GXutil.str( AV104TFPrdPreAnt_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState60[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV163Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV163Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.Producto" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_101_1QY2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemovimientosentradas_modal_Internalname, tblTablemovimientosentradas_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucMovimientosentradas_modal.setProperty("Width", Movimientosentradas_modal_Width);
         ucMovimientosentradas_modal.setProperty("Title", Movimientosentradas_modal_Title);
         ucMovimientosentradas_modal.setProperty("ConfirmType", Movimientosentradas_modal_Confirmtype);
         ucMovimientosentradas_modal.setProperty("BodyType", Movimientosentradas_modal_Bodytype);
         ucMovimientosentradas_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Movimientosentradas_modal_Internalname, "MOVIMIENTOSENTRADAS_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"MOVIMIENTOSENTRADAS_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_101_1QY2e( true) ;
      }
      else
      {
         wb_table2_101_1QY2e( false) ;
      }
   }

   public void wb_table1_25_1QY2( boolean wbgen )
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
         wb_table3_30_1QY2( true) ;
      }
      else
      {
         wb_table3_30_1QY2( false) ;
      }
      return  ;
   }

   public void wb_table3_30_1QY2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1QY2e( true) ;
      }
      else
      {
         wb_table1_25_1QY2e( false) ;
      }
   }

   public void wb_table3_30_1QY2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_StocksQuimicos\\ProductoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_30_1QY2e( true) ;
      }
      else
      {
         wb_table3_30_1QY2e( false) ;
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
      pa1QY2( ) ;
      ws1QY2( ) ;
      we1QY2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614485", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/productoww.js", "?20268211614485", false, true);
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

   public void subsflControlProps_432( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_43_idx );
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_43_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_43_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_43_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_43_idx ;
      edtPrdDisponi_Internalname = "PRDDISPONI_"+sGXsfl_43_idx ;
      edtPrdCanPen_Internalname = "PRDCANPEN_"+sGXsfl_43_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_43_idx ;
      edtTipPrdDsc_Internalname = "TIPPRDDSC_"+sGXsfl_43_idx ;
      edtValDsc_Internalname = "VALDSC_"+sGXsfl_43_idx ;
      edtPrdRec_Internalname = "PRDREC_"+sGXsfl_43_idx ;
      edtPrdAox_Internalname = "PRDAOX_"+sGXsfl_43_idx ;
      edtPrdGots_Internalname = "PRDGOTS_"+sGXsfl_43_idx ;
      edtPrdReach_Internalname = "PRDREACH_"+sGXsfl_43_idx ;
      cmbPrdOkotex.setInternalname( "PRDOKOTEX_"+sGXsfl_43_idx );
      edtPrdHm_Internalname = "PRDHM_"+sGXsfl_43_idx ;
      cmbPrdZDHC.setInternalname( "PRDZDHC_"+sGXsfl_43_idx );
      cmbPrdList.setInternalname( "PRDLIST_"+sGXsfl_43_idx );
      edtPrdTHELIST_Internalname = "PRDTHELIST_"+sGXsfl_43_idx ;
      cmbPrdGRS.setInternalname( "PRDGRS_"+sGXsfl_43_idx );
      edtPrdHS_Internalname = "PRDHS_"+sGXsfl_43_idx ;
      edtPrdFHS_Internalname = "PRDFHS_"+sGXsfl_43_idx ;
      edtPrdNum2_Internalname = "PRDNUM2_"+sGXsfl_43_idx ;
      edtPrdNom2_Internalname = "PRDNOM2_"+sGXsfl_43_idx ;
      edtPrdRefPrv_Internalname = "PRDREFPRV_"+sGXsfl_43_idx ;
      edtPrdFuncion_Internalname = "PRDFUNCION_"+sGXsfl_43_idx ;
      edtPrdEINECS_Internalname = "PRDEINECS_"+sGXsfl_43_idx ;
      edtPrdNCAS_Internalname = "PRDNCAS_"+sGXsfl_43_idx ;
      edtPrvNum_Internalname = "PRVNUM_"+sGXsfl_43_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_43_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_43_idx ;
      edtPrdGruFamD_Internalname = "PRDGRUFAMD_"+sGXsfl_43_idx ;
      edtPrdPreAc2_Internalname = "PRDPREAC2_"+sGXsfl_43_idx ;
      edtPrdFecPre_Internalname = "PRDFECPRE_"+sGXsfl_43_idx ;
      edtPrdPreAnt_Internalname = "PRDPREANT_"+sGXsfl_43_idx ;
      edtavVar_forrgb_Internalname = "vVAR_FORRGB_"+sGXsfl_43_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_43_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_43_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_43_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_43_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_43_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_43_fel_idx );
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_43_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_43_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_43_fel_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_43_fel_idx ;
      edtPrdDisponi_Internalname = "PRDDISPONI_"+sGXsfl_43_fel_idx ;
      edtPrdCanPen_Internalname = "PRDCANPEN_"+sGXsfl_43_fel_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_43_fel_idx ;
      edtTipPrdDsc_Internalname = "TIPPRDDSC_"+sGXsfl_43_fel_idx ;
      edtValDsc_Internalname = "VALDSC_"+sGXsfl_43_fel_idx ;
      edtPrdRec_Internalname = "PRDREC_"+sGXsfl_43_fel_idx ;
      edtPrdAox_Internalname = "PRDAOX_"+sGXsfl_43_fel_idx ;
      edtPrdGots_Internalname = "PRDGOTS_"+sGXsfl_43_fel_idx ;
      edtPrdReach_Internalname = "PRDREACH_"+sGXsfl_43_fel_idx ;
      cmbPrdOkotex.setInternalname( "PRDOKOTEX_"+sGXsfl_43_fel_idx );
      edtPrdHm_Internalname = "PRDHM_"+sGXsfl_43_fel_idx ;
      cmbPrdZDHC.setInternalname( "PRDZDHC_"+sGXsfl_43_fel_idx );
      cmbPrdList.setInternalname( "PRDLIST_"+sGXsfl_43_fel_idx );
      edtPrdTHELIST_Internalname = "PRDTHELIST_"+sGXsfl_43_fel_idx ;
      cmbPrdGRS.setInternalname( "PRDGRS_"+sGXsfl_43_fel_idx );
      edtPrdHS_Internalname = "PRDHS_"+sGXsfl_43_fel_idx ;
      edtPrdFHS_Internalname = "PRDFHS_"+sGXsfl_43_fel_idx ;
      edtPrdNum2_Internalname = "PRDNUM2_"+sGXsfl_43_fel_idx ;
      edtPrdNom2_Internalname = "PRDNOM2_"+sGXsfl_43_fel_idx ;
      edtPrdRefPrv_Internalname = "PRDREFPRV_"+sGXsfl_43_fel_idx ;
      edtPrdFuncion_Internalname = "PRDFUNCION_"+sGXsfl_43_fel_idx ;
      edtPrdEINECS_Internalname = "PRDEINECS_"+sGXsfl_43_fel_idx ;
      edtPrdNCAS_Internalname = "PRDNCAS_"+sGXsfl_43_fel_idx ;
      edtPrvNum_Internalname = "PRVNUM_"+sGXsfl_43_fel_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_43_fel_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_43_fel_idx ;
      edtPrdGruFamD_Internalname = "PRDGRUFAMD_"+sGXsfl_43_fel_idx ;
      edtPrdPreAc2_Internalname = "PRDPREAC2_"+sGXsfl_43_fel_idx ;
      edtPrdFecPre_Internalname = "PRDFECPRE_"+sGXsfl_43_fel_idx ;
      edtPrdPreAnt_Internalname = "PRDPREANT_"+sGXsfl_43_fel_idx ;
      edtavVar_forrgb_Internalname = "vVAR_FORRGB_"+sGXsfl_43_fel_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_43_fel_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_43_fel_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_43_fel_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_43_fel_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_43_fel_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb1QY0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_43_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV38GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV38GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV38GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_43_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV38GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtPrdNom_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtPrdNom_Forecolor)+";"+((edtPrdNom_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtPrdNom_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdExiAlm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCanRes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdDisponi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdDisponi_Internalname,GXutil.ltrim( localUtil.ntoc( A13831PrdDisponi, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13831PrdDisponi, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdDisponi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdDisponi_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCanPen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanPen_Internalname,GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanPen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCanPen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdPreAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipPrdDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipPrdDsc_Internalname,GXutil.rtrim( A6302TipPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTipPrdDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtValDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValDsc_Internalname,GXutil.rtrim( A857ValDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtValDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdRec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRec_Internalname,GXutil.rtrim( A727PrdRec),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdRec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdAox_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAox_Internalname,GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9733PrdAox, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdAox_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdAox_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdGots_Internalname,GXutil.rtrim( A11363PrdGots),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdGots_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdGots_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdReach_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdReach_Internalname,GXutil.rtrim( A5887PrdReach),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdReach_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdReach_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdOkotex.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdOkotex.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDOKOTEX_" + sGXsfl_43_idx ;
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
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdHm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHm_Internalname,GXutil.rtrim( A11364PrdHm),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdHm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdHm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdZDHC.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdZDHC.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDZDHC_" + sGXsfl_43_idx ;
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
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdZDHC.getInternalname(), "Values", cmbPrdZDHC.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdList.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdList.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDLIST_" + sGXsfl_43_idx ;
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
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdTHELIST_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdTHELIST_Internalname,GXutil.rtrim( A13302PrdTHELIST),GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdTHELIST_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdTHELIST_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdGRS.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdGRS.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDGRS_" + sGXsfl_43_idx ;
            cmbPrdGRS.setName( GXCCtl );
            cmbPrdGRS.setWebtags( "" );
            cmbPrdGRS.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbPrdGRS.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            if ( cmbPrdGRS.getItemCount() > 0 )
            {
               A13974PrdGRS = cmbPrdGRS.getValidValue(A13974PrdGRS) ;
               n13974PrdGRS = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrdGRS,cmbPrdGRS.getInternalname(),GXutil.rtrim( A13974PrdGRS),Integer.valueOf(1),cmbPrdGRS.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrdGRS.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrdGRS.setValue( GXutil.rtrim( A13974PrdGRS) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdGRS.getInternalname(), "Values", cmbPrdGRS.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdHS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHS_Internalname,GXutil.rtrim( A9741PrdHS),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdHS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdHS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdFHS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFHS_Internalname,localUtil.format(A9742PrdFHS, "99/99/99"),localUtil.format( A9742PrdFHS, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFHS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdFHS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum2_Internalname,GXutil.rtrim( A4693PrdNum2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNum2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom2_Internalname,GXutil.rtrim( A4692PrdNom2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdRefPrv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRefPrv_Internalname,GXutil.rtrim( A728PrdRefPrv),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRefPrv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdRefPrv_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdFuncion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFuncion_Internalname,GXutil.rtrim( A11615PrdFuncion),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFuncion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdFuncion_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdEINECS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdEINECS_Internalname,GXutil.rtrim( A11614PrdEINECS),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdEINECS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdEINECS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNCAS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNCAS_Internalname,GXutil.rtrim( A9734PrdNCAS),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNCAS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNCAS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdRGB_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRGB_Internalname,GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdRGB_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdGruFamD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdGruFamD_Internalname,GXutil.rtrim( A14036PrdGruFamD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdGruFamD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdGruFamD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdPreAc2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAc2_Internalname,GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdPreAc2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdFecPre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFecPre_Internalname,localUtil.format(A709PrdFecPre, "99/99/99"),localUtil.format( A709PrdFecPre, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFecPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdFecPre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdPreAnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAnt_Internalname,GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdPreAnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavVar_forrgb_Enabled!=0)&&(edtavVar_forrgb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 79,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavVar_forrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV147Var_ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavVar_forrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV147Var_ForRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV147Var_ForRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavVar_forrgb_Enabled!=0)&&(edtavVar_forrgb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavVar_forrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavVar_forrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV148R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV148R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV148R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV149G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV149G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV149G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 82,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV150B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV150B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV150B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 83,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV151R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV151R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV151R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 84,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV152G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV152G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV152G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 85,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV153B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV153B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV153B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1QY2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exis. Alm.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant. Reser.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdDisponi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disponible", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCanPen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pdte. Recibir", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipPrdDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtValDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdRec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "En Rec.?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAox_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "AOX", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrdGRS.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "GRS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdHS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ficha Seg.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFHS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Seg.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto Aux.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdRefPrv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFuncion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Funcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdEINECS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N EINECS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNCAS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº CAS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdRGB_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rgb(Decimal)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdGruFamD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Familia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdPreAc2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio(2)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFecPre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( " Fecha Ult Precio,", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdPreAnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Anterior", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV38GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6302TipPrdDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipPrdDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A857ValDsc));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13974PrdGRS));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrdGRS.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4692PrdNom2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A728PrdRefPrv));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdRefPrv_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11615PrdFuncion));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdFuncion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11614PrdEINECS));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdEINECS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9734PrdNCAS));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNCAS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A794PrvNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdRGB_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14036PrdGruFamD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdGruFamD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdPreAc2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A709PrdFecPre, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdFecPre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdPreAnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV147Var_ForRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavVar_forrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV148R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV149G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV150B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV151R2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV152G2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV153B2, (byte)(3), (byte)(0), ".", "")));
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
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtPrdDisponi_Internalname = "PRDDISPONI" ;
      edtPrdCanPen_Internalname = "PRDCANPEN" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtTipPrdDsc_Internalname = "TIPPRDDSC" ;
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
      cmbPrdGRS.setInternalname( "PRDGRS" );
      edtPrdHS_Internalname = "PRDHS" ;
      edtPrdFHS_Internalname = "PRDFHS" ;
      edtPrdNum2_Internalname = "PRDNUM2" ;
      edtPrdNom2_Internalname = "PRDNOM2" ;
      edtPrdRefPrv_Internalname = "PRDREFPRV" ;
      edtPrdFuncion_Internalname = "PRDFUNCION" ;
      edtPrdEINECS_Internalname = "PRDEINECS" ;
      edtPrdNCAS_Internalname = "PRDNCAS" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      edtPrdRGB_Internalname = "PRDRGB" ;
      edtPrdGruFamD_Internalname = "PRDGRUFAMD" ;
      edtPrdPreAc2_Internalname = "PRDPREAC2" ;
      edtPrdFecPre_Internalname = "PRDFECPRE" ;
      edtPrdPreAnt_Internalname = "PRDPREANT" ;
      edtavVar_forrgb_Internalname = "vVAR_FORRGB" ;
      edtavR_Internalname = "vR" ;
      edtavG_Internalname = "vG" ;
      edtavB_Internalname = "vB" ;
      edtavR2_Internalname = "vR2" ;
      edtavG2_Internalname = "vG2" ;
      edtavB2_Internalname = "vB2" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Movimientosentradas_modal_Internalname = "MOVIMIENTOSENTRADAS_MODAL" ;
      tblTablemovimientosentradas_modal_Internalname = "TABLEMOVIMIENTOSENTRADAS_MODAL" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
      edtavDdo_prdfhsauxdate_Internalname = "vDDO_PRDFHSAUXDATE" ;
      edtavDdo_prdfhsauxdateto_Internalname = "vDDO_PRDFHSAUXDATETO" ;
      divDdo_prdfhsauxdates_Internalname = "DDO_PRDFHSAUXDATES" ;
      edtavDdo_prdfecpreauxdate_Internalname = "vDDO_PRDFECPREAUXDATE" ;
      divDdo_prdfecpreauxdates_Internalname = "DDO_PRDFECPREAUXDATES" ;
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
      edtavVar_forrgb_Jsonclick = "" ;
      edtavVar_forrgb_Visible = 0 ;
      edtavVar_forrgb_Enabled = 1 ;
      edtPrdPreAnt_Jsonclick = "" ;
      edtPrdFecPre_Jsonclick = "" ;
      edtPrdPreAc2_Jsonclick = "" ;
      edtPrdGruFamD_Jsonclick = "" ;
      edtPrdRGB_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      edtPrdNCAS_Jsonclick = "" ;
      edtPrdEINECS_Jsonclick = "" ;
      edtPrdFuncion_Jsonclick = "" ;
      edtPrdRefPrv_Jsonclick = "" ;
      edtPrdNom2_Jsonclick = "" ;
      edtPrdNum2_Jsonclick = "" ;
      edtPrdFHS_Jsonclick = "" ;
      edtPrdHS_Jsonclick = "" ;
      cmbPrdGRS.setJsonclick( "" );
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
      edtTipPrdDsc_Jsonclick = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdDisponi_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Forecolor = (int)(0x000000) ;
      edtPrdNom_Backcolor = -1 ;
      edtPrdNum_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtPrdPreAnt_Visible = -1 ;
      edtPrdFecPre_Visible = -1 ;
      edtPrdPreAc2_Visible = -1 ;
      edtPrdGruFamD_Visible = -1 ;
      edtPrdRGB_Visible = -1 ;
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      edtPrdNCAS_Visible = -1 ;
      edtPrdEINECS_Visible = -1 ;
      edtPrdFuncion_Visible = -1 ;
      edtPrdRefPrv_Visible = -1 ;
      edtPrdNom2_Visible = -1 ;
      edtPrdNum2_Visible = -1 ;
      edtPrdFHS_Visible = -1 ;
      edtPrdHS_Visible = -1 ;
      cmbPrdGRS.setVisible( -1 );
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
      edtTipPrdDsc_Visible = -1 ;
      edtPrdPreAct_Visible = -1 ;
      edtPrdCanPen_Visible = -1 ;
      edtPrdDisponi_Visible = -1 ;
      edtPrdCanRes_Visible = -1 ;
      edtPrdExiAlm_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_prdfecpreauxdate_Jsonclick = "" ;
      edtavDdo_prdfhsauxdateto_Jsonclick = "" ;
      edtavDdo_prdfhsauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Movimientosentradas_modal_Bodytype = "WebComponent" ;
      Movimientosentradas_modal_Confirmtype = "" ;
      Movimientosentradas_modal_Title = httpContext.getMessage( "Movimientos Productos (Entradas)", "") ;
      Movimientosentradas_modal_Width = "1000" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "StocksQuimicos.ProductoWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||N:N,S:S||N:N,1:Nivel 1,2:Nivel 2,3:Nivel 3|S:S,N:N||N:N,S:S|||||||||||||||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||||T||T|T||T|||||||||||||||" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||||||Dynamic|Dynamic|Dynamic||Dynamic|Dynamic|FixedValues|Dynamic|FixedValues|FixedValues|Dynamic|FixedValues|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||Dynamic|||" ;
      Ddo_grid_Includedatalist = "T|T||||||T|T|T||T|T|T|T|T|T|T|T|T||T|T|T|T|T|T||T||T|||" ;
      Ddo_grid_Filterisrange = "||T|T|T|T|T||||T||||||||||T|||||||T||T||T||T" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Character|Character|Numeric|Character|Character||Character|||Character||Character|Date|Character|Character|Character|Character|Character|Character|Numeric|Character|Numeric|Character|Numeric|Date|Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T||T|||T||T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T|T|T|T|T||T|||||||T|||T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4||5|6|7|8|9||10|||||||11|||12|13|14|15|16|17|18|19|20|21|22|23|24" ;
      Ddo_grid_Columnids = "1:PrdNum|2:PrdNom|3:PrdExiAlm|4:PrdCanRes|5:PrdDisponible|6:PrdCanPen|7:PrdPreAct|8:TipPrdDsc|9:ValDsc|10:PrdRec|11:PrdAox|12:PrdGots|13:PrdReach|14:PrdOkotex|15:PrdHm|16:PrdZDHC|17:PrdList|18:PrdTHELIST|19:PrdGRS|20:PrdHS|21:PrdFHS|22:PrdNum2|23:PrdNom2|24:PrdRefPrv|25:PrdFuncion|26:PrdEINECS|27:PrdNCAS|28:PrvNum|29:PrvNom|30:PrdRGB|31:PrdGruFamDc|32:PrdPreAc2|33:PrdFecPre|34:PrdPreAnt" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Producto Quimico", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_43_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV38GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV38GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridActions), 4, 0));
      }
      GXCCtl = "PRDOKOTEX_" + sGXsfl_43_idx ;
      cmbPrdOkotex.setName( GXCCtl );
      cmbPrdOkotex.setWebtags( "" );
      cmbPrdOkotex.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdOkotex.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
         A5888PrdOkotex = cmbPrdOkotex.getValidValue(A5888PrdOkotex) ;
      }
      GXCCtl = "PRDZDHC_" + sGXsfl_43_idx ;
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
      GXCCtl = "PRDLIST_" + sGXsfl_43_idx ;
      cmbPrdList.setName( GXCCtl );
      cmbPrdList.setWebtags( "" );
      cmbPrdList.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbPrdList.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbPrdList.getItemCount() > 0 )
      {
         A11687PrdList = cmbPrdList.getValidValue(A11687PrdList) ;
      }
      GXCCtl = "PRDGRS_" + sGXsfl_43_idx ;
      cmbPrdGRS.setName( GXCCtl );
      cmbPrdGRS.setWebtags( "" );
      cmbPrdGRS.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdGRS.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdGRS.getItemCount() > 0 )
      {
         A13974PrdGRS = cmbPrdGRS.getValidValue(A13974PrdGRS) ;
         n13974PrdGRS = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'cmbPrdGRS'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdNom2_Visible',ctrl:'PRDNOM2',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdNCAS_Visible',ctrl:'PRDNCAS',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdRGB_Visible',ctrl:'PRDRGB',prop:'Visible'},{av:'edtPrdGruFamD_Visible',ctrl:'PRDGRUFAMD',prop:'Visible'},{av:'edtPrdPreAc2_Visible',ctrl:'PRDPREAC2',prop:'Visible'},{av:'edtPrdFecPre_Visible',ctrl:'PRDFECPRE',prop:'Visible'},{av:'edtPrdPreAnt_Visible',ctrl:'PRDPREANT',prop:'Visible'},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121QY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131QY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141QY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV114TFPrdGRS_SelsJson',fld:'vTFPRDGRS_SELSJSON',pic:''},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV51TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV49TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV45TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221QY2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV38GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV147Var_ForRGB',fld:'vVAR_FORRGB',pic:'ZZZZZZZZZ9'},{av:'AV153B2',fld:'vB2',pic:'ZZ9'},{av:'AV152G2',fld:'vG2',pic:'ZZ9'},{av:'AV151R2',fld:'vR2',pic:'ZZ9'},{av:'AV150B',fld:'vB',pic:'ZZ9'},{av:'AV149G',fld:'vG',pic:'ZZ9'},{av:'AV148R',fld:'vR',pic:'ZZ9'},{av:'edtPrdNom_Backcolor',ctrl:'PRDNOM',prop:'Backcolor'},{av:'edtPrdNom_Forecolor',ctrl:'PRDNOM',prop:'Forecolor'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151QY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'cmbPrdGRS'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdNom2_Visible',ctrl:'PRDNOM2',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdNCAS_Visible',ctrl:'PRDNCAS',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdRGB_Visible',ctrl:'PRDRGB',prop:'Visible'},{av:'edtPrdGruFamD_Visible',ctrl:'PRDGRUFAMD',prop:'Visible'},{av:'edtPrdPreAc2_Visible',ctrl:'PRDPREAC2',prop:'Visible'},{av:'edtPrdFecPre_Visible',ctrl:'PRDFECPRE',prop:'Visible'},{av:'edtPrdPreAnt_Visible',ctrl:'PRDPREANT',prop:'Visible'},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111QY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV45TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV49TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV51TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV114TFPrdGRS_SelsJson',fld:'vTFPRDGRS_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV114TFPrdGRS_SelsJson',fld:'vTFPRDGRS_SELSJSON',pic:''},{av:'AV51TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV49TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV45TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'cmbPrdGRS'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdNom2_Visible',ctrl:'PRDNOM2',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdNCAS_Visible',ctrl:'PRDNCAS',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdRGB_Visible',ctrl:'PRDRGB',prop:'Visible'},{av:'edtPrdGruFamD_Visible',ctrl:'PRDGRUFAMD',prop:'Visible'},{av:'edtPrdPreAc2_Visible',ctrl:'PRDPREAC2',prop:'Visible'},{av:'edtPrdFecPre_Visible',ctrl:'PRDFECPRE',prop:'Visible'},{av:'edtPrdPreAnt_Visible',ctrl:'PRDPREANT',prop:'Visible'},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e231QY2',iparms:[{av:'cmbavGridactions'},{av:'AV38GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV143PrdRgb',fld:'vPRDRGB',pic:'ZZZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A13302PrdTHELIST',fld:'PRDTHELIST',pic:'@!'},{av:'AV133EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'AV134OldPrdTHELIST',fld:'vOLDPRDTHELIST',pic:'@!'},{av:'AV128UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV126Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV38GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV143PrdRgb',fld:'vPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV126Station',fld:'vSTATION',pic:''},{av:'AV128UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV134OldPrdTHELIST',fld:'vOLDPRDTHELIST',pic:'@!'},{av:'A13302PrdTHELIST',fld:'PRDTHELIST',pic:'@!'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV133EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV138Active_EmprCod',fld:'vACTIVE_EMPRCOD',pic:'@!'},{av:'AV139Active_PrdNum',fld:'vACTIVE_PRDNUM',pic:''},{av:'AV141Active_PrdNom',fld:'vACTIVE_PRDNOM',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'cmbPrdGRS'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdNom2_Visible',ctrl:'PRDNOM2',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdNCAS_Visible',ctrl:'PRDNCAS',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdRGB_Visible',ctrl:'PRDRGB',prop:'Visible'},{av:'edtPrdGruFamD_Visible',ctrl:'PRDGRUFAMD',prop:'Visible'},{av:'edtPrdPreAc2_Visible',ctrl:'PRDPREAC2',prop:'Visible'},{av:'edtPrdFecPre_Visible',ctrl:'PRDFECPRE',prop:'Visible'},{av:'edtPrdPreAnt_Visible',ctrl:'PRDPREANT',prop:'Visible'},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("MOVIMIENTOSENTRADAS_MODAL.CLOSE","{handler:'e161QY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("MOVIMIENTOSENTRADAS_MODAL.CLOSE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'cmbPrdGRS'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdNom2_Visible',ctrl:'PRDNOM2',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdNCAS_Visible',ctrl:'PRDNCAS',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdRGB_Visible',ctrl:'PRDRGB',prop:'Visible'},{av:'edtPrdGruFamD_Visible',ctrl:'PRDGRUFAMD',prop:'Visible'},{av:'edtPrdPreAc2_Visible',ctrl:'PRDPREAC2',prop:'Visible'},{av:'edtPrdFecPre_Visible',ctrl:'PRDFECPRE',prop:'Visible'},{av:'edtPrdPreAnt_Visible',ctrl:'PRDPREANT',prop:'Visible'},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e171QY2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e181QY2',iparms:[{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV45TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV49TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV51TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV114TFPrdGRS_SelsJson',fld:'vTFPRDGRS_SELSJSON',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV114TFPrdGRS_SelsJson',fld:'vTFPRDGRS_SELSJSON',pic:''},{av:'AV51TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV49TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV45TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e191QY2',iparms:[{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV45TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV49TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV51TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV114TFPrdGRS_SelsJson',fld:'vTFPRDGRS_SELSJSON',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV163Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV106TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV107TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV109TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV135TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV136TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV110TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV111TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV97TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV98TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV112TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV113TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV81TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV82TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV84TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV39TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV40TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV41TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV42TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV43TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV44TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV46TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV47TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV48TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV50TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV52TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV53TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV54TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV115TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV55TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV56TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV57TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV58TFPrdFHS_To',fld:'vTFPRDFHS_TO',pic:''},{av:'AV116TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV117TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV118TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV119TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV65TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV66TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV120TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV121TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV122TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV123TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV124TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV125TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV144TFPrdRGB',fld:'vTFPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV145TFPrdRGB_To',fld:'vTFPRDRGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV159TFPrdGruFamDc',fld:'vTFPRDGRUFAMDC',pic:''},{av:'AV160TFPrdGruFamDc_Sel',fld:'vTFPRDGRUFAMDC_SEL',pic:''},{av:'AV157TFPrdPreAc2',fld:'vTFPRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'AV158TFPrdPreAc2_To',fld:'vTFPRDPREAC2_TO',pic:'ZZZZZZZ9.999'},{av:'AV99TFPrdFecPre',fld:'vTFPRDFECPRE',pic:''},{av:'AV103TFPrdPreAnt',fld:'vTFPRDPREANT',pic:'ZZZZZZZ9.999'},{av:'AV104TFPrdPreAnt_To',fld:'vTFPRDPREANT_TO',pic:'ZZZZZZZ9.999'},{av:'AV146SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV114TFPrdGRS_SelsJson',fld:'vTFPRDGRS_SELSJSON',pic:''},{av:'AV51TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV49TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV45TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDCANRES","{handler:'valid_Prdcanres',iparms:[]");
      setEventMetadata("VALID_PRDCANRES",",oparms:[]}");
      setEventMetadata("VALID_PRDDISPONI","{handler:'valid_Prddisponi',iparms:[]");
      setEventMetadata("VALID_PRDDISPONI",",oparms:[]}");
      setEventMetadata("VALID_PRDCANPEN","{handler:'valid_Prdcanpen',iparms:[]");
      setEventMetadata("VALID_PRDCANPEN",",oparms:[]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_TIPPRDDSC","{handler:'valid_Tipprddsc',iparms:[]");
      setEventMetadata("VALID_TIPPRDDSC",",oparms:[]}");
      setEventMetadata("VALID_VALDSC","{handler:'valid_Valdsc',iparms:[]");
      setEventMetadata("VALID_VALDSC",",oparms:[]}");
      setEventMetadata("VALID_PRDREC","{handler:'valid_Prdrec',iparms:[]");
      setEventMetadata("VALID_PRDREC",",oparms:[]}");
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
      setEventMetadata("VALID_PRDGRS","{handler:'valid_Prdgrs',iparms:[]");
      setEventMetadata("VALID_PRDGRS",",oparms:[]}");
      setEventMetadata("VALID_PRDHS","{handler:'valid_Prdhs',iparms:[]");
      setEventMetadata("VALID_PRDHS",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM2","{handler:'valid_Prdnum2',iparms:[]");
      setEventMetadata("VALID_PRDNUM2",",oparms:[]}");
      setEventMetadata("VALID_PRDNOM2","{handler:'valid_Prdnom2',iparms:[]");
      setEventMetadata("VALID_PRDNOM2",",oparms:[]}");
      setEventMetadata("VALID_PRDREFPRV","{handler:'valid_Prdrefprv',iparms:[]");
      setEventMetadata("VALID_PRDREFPRV",",oparms:[]}");
      setEventMetadata("VALID_PRDFUNCION","{handler:'valid_Prdfuncion',iparms:[]");
      setEventMetadata("VALID_PRDFUNCION",",oparms:[]}");
      setEventMetadata("VALID_PRDEINECS","{handler:'valid_Prdeinecs',iparms:[]");
      setEventMetadata("VALID_PRDEINECS",",oparms:[]}");
      setEventMetadata("VALID_PRDNCAS","{handler:'valid_Prdncas',iparms:[]");
      setEventMetadata("VALID_PRDNCAS",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PRVNOM","{handler:'valid_Prvnom',iparms:[]");
      setEventMetadata("VALID_PRVNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDRGB","{handler:'valid_Prdrgb',iparms:[]");
      setEventMetadata("VALID_PRDRGB",",oparms:[]}");
      setEventMetadata("VALID_PRDGRUFAMD","{handler:'valid_Prdgrufamd',iparms:[]");
      setEventMetadata("VALID_PRDGRUFAMD",",oparms:[]}");
      setEventMetadata("VALID_PRDPREAC2","{handler:'valid_Prdpreac2',iparms:[]");
      setEventMetadata("VALID_PRDPREAC2",",oparms:[]}");
      setEventMetadata("VALID_PRDPREANT","{handler:'valid_Prdpreant',iparms:[]");
      setEventMetadata("VALID_PRDPREANT",",oparms:[]}");
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
      AV15FilterFullText = "" ;
      A396EmprCod = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV163Pgmname = "" ;
      AV26TFPrdNum = "" ;
      AV27TFPrdNum_Sel = "" ;
      AV28TFPrdNom = "" ;
      AV29TFPrdNom_Sel = "" ;
      AV106TFPrdExiAlm = DecimalUtil.ZERO ;
      AV107TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV108TFPrdCanRes = DecimalUtil.ZERO ;
      AV109TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV135TFPrdDisponible = DecimalUtil.ZERO ;
      AV136TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV110TFPrdCanPen = DecimalUtil.ZERO ;
      AV111TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV97TFPrdPreAct = DecimalUtil.ZERO ;
      AV98TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV112TFTipPrdDsc = "" ;
      AV113TFTipPrdDsc_Sel = "" ;
      AV81TFValDsc = "" ;
      AV82TFValDsc_Sel = "" ;
      AV83TFPrdRec = "" ;
      AV84TFPrdRec_Sel = "" ;
      AV39TFPrdAox = DecimalUtil.ZERO ;
      AV40TFPrdAox_To = DecimalUtil.ZERO ;
      AV41TFPrdGots = "" ;
      AV42TFPrdGots_Sel = "" ;
      AV43TFPrdReach = "" ;
      AV44TFPrdReach_Sel = "" ;
      AV46TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47TFPrdHm = "" ;
      AV48TFPrdHm_Sel = "" ;
      AV50TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV53TFPrdTHELIST = "" ;
      AV54TFPrdTHELIST_Sel = "" ;
      AV115TFPrdGRS_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV55TFPrdHS = "" ;
      AV56TFPrdHS_Sel = "" ;
      AV57TFPrdFHS = GXutil.nullDate() ;
      AV58TFPrdFHS_To = GXutil.nullDate() ;
      AV116TFPrdNum2 = "" ;
      AV117TFPrdNum2_Sel = "" ;
      AV118TFPrdNom2 = "" ;
      AV119TFPrdNom2_Sel = "" ;
      AV65TFPrdRefPrv = "" ;
      AV66TFPrdRefPrv_Sel = "" ;
      AV120TFPrdFuncion = "" ;
      AV121TFPrdFuncion_Sel = "" ;
      AV122TFPrdEINECS = "" ;
      AV123TFPrdEINECS_Sel = "" ;
      AV124TFPrdNCAS = "" ;
      AV125TFPrdNCAS_Sel = "" ;
      AV32TFPrvNom = "" ;
      AV33TFPrvNom_Sel = "" ;
      AV159TFPrdGruFamDc = "" ;
      AV160TFPrdGruFamDc_Sel = "" ;
      AV157TFPrdPreAc2 = DecimalUtil.ZERO ;
      AV158TFPrdPreAc2_To = DecimalUtil.ZERO ;
      AV99TFPrdFecPre = GXutil.nullDate() ;
      AV103TFPrdPreAnt = DecimalUtil.ZERO ;
      AV104TFPrdPreAnt_To = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV34DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV45TFPrdOkotex_SelsJson = "" ;
      AV49TFPrdZDHC_SelsJson = "" ;
      AV51TFPrdList_SelsJson = "" ;
      AV114TFPrdGRS_SelsJson = "" ;
      AV133EmprCod = "" ;
      AV134OldPrdTHELIST = "" ;
      AV128UsurCod = "" ;
      AV126Station = "" ;
      AV138Active_EmprCod = "" ;
      AV139Active_PrdNum = "" ;
      AV141Active_PrdNom = "" ;
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
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      AV59DDO_PrdFHSAuxDate = GXutil.nullDate() ;
      AV60DDO_PrdFHSAuxDateTo = GXutil.nullDate() ;
      AV101DDO_PrdFecPreAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A6302TipPrdDsc = "" ;
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
      A13974PrdGRS = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A4693PrdNum2 = "" ;
      A4692PrdNom2 = "" ;
      A728PrdRefPrv = "" ;
      A11615PrdFuncion = "" ;
      A11614PrdEINECS = "" ;
      A9734PrdNCAS = "" ;
      A794PrvNom = "" ;
      A14036PrdGruFamD = "" ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV15FilterFullText = "" ;
      lV26TFPrdNum = "" ;
      lV28TFPrdNom = "" ;
      lV112TFTipPrdDsc = "" ;
      lV81TFValDsc = "" ;
      lV83TFPrdRec = "" ;
      lV41TFPrdGots = "" ;
      lV43TFPrdReach = "" ;
      lV47TFPrdHm = "" ;
      lV53TFPrdTHELIST = "" ;
      lV55TFPrdHS = "" ;
      lV116TFPrdNum2 = "" ;
      lV118TFPrdNom2 = "" ;
      lV65TFPrdRefPrv = "" ;
      lV120TFPrdFuncion = "" ;
      lV122TFPrdEINECS = "" ;
      lV124TFPrdNCAS = "" ;
      lV32TFPrvNom = "" ;
      lV159TFPrdGruFamDc = "" ;
      H01QY2_A13969PrdGruFamI = new byte[1] ;
      H01QY2_n13969PrdGruFamI = new boolean[] {false} ;
      H01QY2_A856ValCod = new byte[1] ;
      H01QY2_A6301TipPrdCod = new short[1] ;
      H01QY2_n6301TipPrdCod = new boolean[] {false} ;
      H01QY2_A396EmprCod = new String[] {""} ;
      H01QY2_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY2_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      H01QY2_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY2_A14036PrdGruFamD = new String[] {""} ;
      H01QY2_n14036PrdGruFamD = new boolean[] {false} ;
      H01QY2_A13232PrdRGB = new long[1] ;
      H01QY2_A794PrvNom = new String[] {""} ;
      H01QY2_n794PrvNom = new boolean[] {false} ;
      H01QY2_A795PrvNum = new int[1] ;
      H01QY2_A9734PrdNCAS = new String[] {""} ;
      H01QY2_A11614PrdEINECS = new String[] {""} ;
      H01QY2_A11615PrdFuncion = new String[] {""} ;
      H01QY2_A728PrdRefPrv = new String[] {""} ;
      H01QY2_A4692PrdNom2 = new String[] {""} ;
      H01QY2_A4693PrdNum2 = new String[] {""} ;
      H01QY2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H01QY2_A9741PrdHS = new String[] {""} ;
      H01QY2_A13974PrdGRS = new String[] {""} ;
      H01QY2_n13974PrdGRS = new boolean[] {false} ;
      H01QY2_A13302PrdTHELIST = new String[] {""} ;
      H01QY2_n13302PrdTHELIST = new boolean[] {false} ;
      H01QY2_A11687PrdList = new String[] {""} ;
      H01QY2_A13301PrdZDHC = new String[] {""} ;
      H01QY2_A11364PrdHm = new String[] {""} ;
      H01QY2_A5888PrdOkotex = new String[] {""} ;
      H01QY2_A5887PrdReach = new String[] {""} ;
      H01QY2_A11363PrdGots = new String[] {""} ;
      H01QY2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY2_A727PrdRec = new String[] {""} ;
      H01QY2_A857ValDsc = new String[] {""} ;
      H01QY2_n857ValDsc = new boolean[] {false} ;
      H01QY2_A6302TipPrdDsc = new String[] {""} ;
      H01QY2_n6302TipPrdDsc = new boolean[] {false} ;
      H01QY2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY2_A13831PrdDisponi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY2_A718PrdNom = new String[] {""} ;
      H01QY2_A719PrdNum = new String[] {""} ;
      H01QY2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY3_A13969PrdGruFamI = new byte[1] ;
      H01QY3_n13969PrdGruFamI = new boolean[] {false} ;
      H01QY3_A856ValCod = new byte[1] ;
      H01QY3_A6301TipPrdCod = new short[1] ;
      H01QY3_n6301TipPrdCod = new boolean[] {false} ;
      H01QY3_A396EmprCod = new String[] {""} ;
      H01QY3_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY3_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      H01QY3_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY3_A14036PrdGruFamD = new String[] {""} ;
      H01QY3_n14036PrdGruFamD = new boolean[] {false} ;
      H01QY3_A13232PrdRGB = new long[1] ;
      H01QY3_A794PrvNom = new String[] {""} ;
      H01QY3_n794PrvNom = new boolean[] {false} ;
      H01QY3_A795PrvNum = new int[1] ;
      H01QY3_A9734PrdNCAS = new String[] {""} ;
      H01QY3_A11614PrdEINECS = new String[] {""} ;
      H01QY3_A11615PrdFuncion = new String[] {""} ;
      H01QY3_A728PrdRefPrv = new String[] {""} ;
      H01QY3_A4692PrdNom2 = new String[] {""} ;
      H01QY3_A4693PrdNum2 = new String[] {""} ;
      H01QY3_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H01QY3_A9741PrdHS = new String[] {""} ;
      H01QY3_A13974PrdGRS = new String[] {""} ;
      H01QY3_n13974PrdGRS = new boolean[] {false} ;
      H01QY3_A13302PrdTHELIST = new String[] {""} ;
      H01QY3_n13302PrdTHELIST = new boolean[] {false} ;
      H01QY3_A11687PrdList = new String[] {""} ;
      H01QY3_A13301PrdZDHC = new String[] {""} ;
      H01QY3_A11364PrdHm = new String[] {""} ;
      H01QY3_A5888PrdOkotex = new String[] {""} ;
      H01QY3_A5887PrdReach = new String[] {""} ;
      H01QY3_A11363PrdGots = new String[] {""} ;
      H01QY3_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY3_A727PrdRec = new String[] {""} ;
      H01QY3_A857ValDsc = new String[] {""} ;
      H01QY3_n857ValDsc = new boolean[] {false} ;
      H01QY3_A6302TipPrdDsc = new String[] {""} ;
      H01QY3_n6302TipPrdDsc = new boolean[] {false} ;
      H01QY3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY3_A13831PrdDisponi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY3_A718PrdNom = new String[] {""} ;
      H01QY3_A719PrdNum = new String[] {""} ;
      H01QY3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01QY3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      hsh = "" ;
      AV127EmprNom = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GXv_int6 = new byte[1] ;
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
      AV142Window = new com.genexus.webpanels.GXWindow();
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char24 = "" ;
      GXt_char25 = "" ;
      GXt_char26 = "" ;
      GXv_char20 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char58 = "" ;
      GXv_char59 = new String[1] ;
      GXt_char56 = "" ;
      GXv_char57 = new String[1] ;
      GXt_char54 = "" ;
      GXv_char55 = new String[1] ;
      GXt_char52 = "" ;
      GXv_char53 = new String[1] ;
      GXt_char50 = "" ;
      GXv_char51 = new String[1] ;
      GXt_char48 = "" ;
      GXv_char49 = new String[1] ;
      GXt_char46 = "" ;
      GXv_char47 = new String[1] ;
      GXt_char44 = "" ;
      GXv_char45 = new String[1] ;
      GXt_char42 = "" ;
      GXv_char43 = new String[1] ;
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
      GXt_char29 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char21 = new String[1] ;
      GXv_SdtWWPGridState60 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucMovimientosentradas_modal = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.productoww__default(),
         new Object[] {
             new Object[] {
            H01QY2_A13969PrdGruFamI, H01QY2_n13969PrdGruFamI, H01QY2_A856ValCod, H01QY2_A6301TipPrdCod, H01QY2_n6301TipPrdCod, H01QY2_A396EmprCod, H01QY2_A725PrdPreAnt, H01QY2_A709PrdFecPre, H01QY2_A5255PrdPreAc2, H01QY2_A14036PrdGruFamD,
            H01QY2_n14036PrdGruFamD, H01QY2_A13232PrdRGB, H01QY2_A794PrvNom, H01QY2_n794PrvNom, H01QY2_A795PrvNum, H01QY2_A9734PrdNCAS, H01QY2_A11614PrdEINECS, H01QY2_A11615PrdFuncion, H01QY2_A728PrdRefPrv, H01QY2_A4692PrdNom2,
            H01QY2_A4693PrdNum2, H01QY2_A9742PrdFHS, H01QY2_A9741PrdHS, H01QY2_A13974PrdGRS, H01QY2_n13974PrdGRS, H01QY2_A13302PrdTHELIST, H01QY2_n13302PrdTHELIST, H01QY2_A11687PrdList, H01QY2_A13301PrdZDHC, H01QY2_A11364PrdHm,
            H01QY2_A5888PrdOkotex, H01QY2_A5887PrdReach, H01QY2_A11363PrdGots, H01QY2_A9733PrdAox, H01QY2_A727PrdRec, H01QY2_A857ValDsc, H01QY2_n857ValDsc, H01QY2_A6302TipPrdDsc, H01QY2_n6302TipPrdDsc, H01QY2_A724PrdPreAct,
            H01QY2_A684PrdCanPen, H01QY2_A13831PrdDisponi, H01QY2_A718PrdNom, H01QY2_A719PrdNum, H01QY2_A704PrdExiAlm, H01QY2_A685PrdCanRes
            }
            , new Object[] {
            H01QY3_A13969PrdGruFamI, H01QY3_n13969PrdGruFamI, H01QY3_A856ValCod, H01QY3_A6301TipPrdCod, H01QY3_n6301TipPrdCod, H01QY3_A396EmprCod, H01QY3_A725PrdPreAnt, H01QY3_A709PrdFecPre, H01QY3_A5255PrdPreAc2, H01QY3_A14036PrdGruFamD,
            H01QY3_n14036PrdGruFamD, H01QY3_A13232PrdRGB, H01QY3_A794PrvNom, H01QY3_n794PrvNom, H01QY3_A795PrvNum, H01QY3_A9734PrdNCAS, H01QY3_A11614PrdEINECS, H01QY3_A11615PrdFuncion, H01QY3_A728PrdRefPrv, H01QY3_A4692PrdNom2,
            H01QY3_A4693PrdNum2, H01QY3_A9742PrdFHS, H01QY3_A9741PrdHS, H01QY3_A13974PrdGRS, H01QY3_n13974PrdGRS, H01QY3_A13302PrdTHELIST, H01QY3_n13302PrdTHELIST, H01QY3_A11687PrdList, H01QY3_A13301PrdZDHC, H01QY3_A11364PrdHm,
            H01QY3_A5888PrdOkotex, H01QY3_A5887PrdReach, H01QY3_A11363PrdGots, H01QY3_A9733PrdAox, H01QY3_A727PrdRec, H01QY3_A857ValDsc, H01QY3_n857ValDsc, H01QY3_A6302TipPrdDsc, H01QY3_n6302TipPrdDsc, H01QY3_A724PrdPreAct,
            H01QY3_A684PrdCanPen, H01QY3_A13831PrdDisponi, H01QY3_A718PrdNom, H01QY3_A719PrdNum, H01QY3_A704PrdExiAlm, H01QY3_A685PrdCanRes
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV163Pgmname = "StocksQuimicos.ProductoWW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV163Pgmname = "StocksQuimicos.ProductoWW" ;
      Gx_err = (short)(0) ;
      edtavVar_forrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte A13969PrdGruFamI ;
   private byte A856ValCod ;
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
   private short AV146SiRGB ;
   private short wbEnd ;
   private short wbStart ;
   private short AV38GridActions ;
   private short AV148R ;
   private short AV149G ;
   private short AV150B ;
   private short AV151R2 ;
   private short AV152G2 ;
   private short AV153B2 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A6301TipPrdCod ;
   private short AV129CnoEnc ;
   private short AV130sustancias ;
   private short AV131ProPrv ;
   private short AV132moda21 ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short GXv_int13[] ;
   private short GXv_int14[] ;
   private short GXv_int15[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int AV30TFPrvNum ;
   private int AV31TFPrvNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A795PrvNum ;
   private int subGrid_Islastpage ;
   private int edtavVar_forrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavR2_Enabled ;
   private int edtavG2_Enabled ;
   private int edtavB2_Enabled ;
   private int AV46TFPrdOkotex_Sels_size ;
   private int AV50TFPrdZDHC_Sels_size ;
   private int AV52TFPrdList_Sels_size ;
   private int AV115TFPrdGRS_Sels_size ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtPrdExiAlm_Visible ;
   private int edtPrdCanRes_Visible ;
   private int edtPrdDisponi_Visible ;
   private int edtPrdCanPen_Visible ;
   private int edtPrdPreAct_Visible ;
   private int edtTipPrdDsc_Visible ;
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
   private int edtPrdNom2_Visible ;
   private int edtPrdRefPrv_Visible ;
   private int edtPrdFuncion_Visible ;
   private int edtPrdEINECS_Visible ;
   private int edtPrdNCAS_Visible ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int edtPrdRGB_Visible ;
   private int edtPrdGruFamD_Visible ;
   private int edtPrdPreAc2_Visible ;
   private int edtPrdFecPre_Visible ;
   private int edtPrdPreAnt_Visible ;
   private int AV35PageToGo ;
   private int edtPrdNom_Backcolor ;
   private int edtPrdNom_Forecolor ;
   private int AV165GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavVar_forrgb_Visible ;
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
   private long AV144TFPrdRGB ;
   private long AV145TFPrdRGB_To ;
   private long AV36GridCurrentPage ;
   private long AV37GridPageCount ;
   private long AV143PrdRgb ;
   private long A13232PrdRGB ;
   private long AV147Var_ForRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV106TFPrdExiAlm ;
   private java.math.BigDecimal AV107TFPrdExiAlm_To ;
   private java.math.BigDecimal AV108TFPrdCanRes ;
   private java.math.BigDecimal AV109TFPrdCanRes_To ;
   private java.math.BigDecimal AV135TFPrdDisponible ;
   private java.math.BigDecimal AV136TFPrdDisponible_To ;
   private java.math.BigDecimal AV110TFPrdCanPen ;
   private java.math.BigDecimal AV111TFPrdCanPen_To ;
   private java.math.BigDecimal AV97TFPrdPreAct ;
   private java.math.BigDecimal AV98TFPrdPreAct_To ;
   private java.math.BigDecimal AV39TFPrdAox ;
   private java.math.BigDecimal AV40TFPrdAox_To ;
   private java.math.BigDecimal AV157TFPrdPreAc2 ;
   private java.math.BigDecimal AV158TFPrdPreAc2_To ;
   private java.math.BigDecimal AV103TFPrdPreAnt ;
   private java.math.BigDecimal AV104TFPrdPreAnt_To ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A725PrdPreAnt ;
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
   private String sGXsfl_43_idx="0001" ;
   private String A396EmprCod ;
   private String AV163Pgmname ;
   private String AV26TFPrdNum ;
   private String AV27TFPrdNum_Sel ;
   private String AV28TFPrdNom ;
   private String AV29TFPrdNom_Sel ;
   private String AV112TFTipPrdDsc ;
   private String AV113TFTipPrdDsc_Sel ;
   private String AV81TFValDsc ;
   private String AV82TFValDsc_Sel ;
   private String AV83TFPrdRec ;
   private String AV84TFPrdRec_Sel ;
   private String AV41TFPrdGots ;
   private String AV42TFPrdGots_Sel ;
   private String AV43TFPrdReach ;
   private String AV44TFPrdReach_Sel ;
   private String AV47TFPrdHm ;
   private String AV48TFPrdHm_Sel ;
   private String AV53TFPrdTHELIST ;
   private String AV54TFPrdTHELIST_Sel ;
   private String AV55TFPrdHS ;
   private String AV56TFPrdHS_Sel ;
   private String AV116TFPrdNum2 ;
   private String AV117TFPrdNum2_Sel ;
   private String AV118TFPrdNom2 ;
   private String AV119TFPrdNom2_Sel ;
   private String AV65TFPrdRefPrv ;
   private String AV66TFPrdRefPrv_Sel ;
   private String AV120TFPrdFuncion ;
   private String AV121TFPrdFuncion_Sel ;
   private String AV122TFPrdEINECS ;
   private String AV123TFPrdEINECS_Sel ;
   private String AV124TFPrdNCAS ;
   private String AV125TFPrdNCAS_Sel ;
   private String AV32TFPrvNom ;
   private String AV33TFPrvNom_Sel ;
   private String AV159TFPrdGruFamDc ;
   private String AV160TFPrdGruFamDc_Sel ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV133EmprCod ;
   private String AV134OldPrdTHELIST ;
   private String AV128UsurCod ;
   private String AV126Station ;
   private String AV138Active_EmprCod ;
   private String AV139Active_PrdNum ;
   private String AV141Active_PrdNom ;
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
   private String Movimientosentradas_modal_Width ;
   private String Movimientosentradas_modal_Title ;
   private String Movimientosentradas_modal_Confirmtype ;
   private String Movimientosentradas_modal_Bodytype ;
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
   private String divDdo_prdfhsauxdates_Internalname ;
   private String edtavDdo_prdfhsauxdate_Internalname ;
   private String edtavDdo_prdfhsauxdate_Jsonclick ;
   private String edtavDdo_prdfhsauxdateto_Internalname ;
   private String edtavDdo_prdfhsauxdateto_Jsonclick ;
   private String divDdo_prdfecpreauxdates_Internalname ;
   private String edtavDdo_prdfecpreauxdate_Internalname ;
   private String edtavDdo_prdfecpreauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdDisponi_Internalname ;
   private String edtPrdCanPen_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String A6302TipPrdDsc ;
   private String edtTipPrdDsc_Internalname ;
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
   private String A13974PrdGRS ;
   private String A9741PrdHS ;
   private String edtPrdHS_Internalname ;
   private String edtPrdFHS_Internalname ;
   private String A4693PrdNum2 ;
   private String edtPrdNum2_Internalname ;
   private String A4692PrdNom2 ;
   private String edtPrdNom2_Internalname ;
   private String A728PrdRefPrv ;
   private String edtPrdRefPrv_Internalname ;
   private String A11615PrdFuncion ;
   private String edtPrdFuncion_Internalname ;
   private String A11614PrdEINECS ;
   private String edtPrdEINECS_Internalname ;
   private String A9734PrdNCAS ;
   private String edtPrdNCAS_Internalname ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String edtPrdRGB_Internalname ;
   private String A14036PrdGruFamD ;
   private String edtPrdGruFamD_Internalname ;
   private String edtPrdPreAc2_Internalname ;
   private String edtPrdFecPre_Internalname ;
   private String edtPrdPreAnt_Internalname ;
   private String edtavVar_forrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavR2_Internalname ;
   private String edtavG2_Internalname ;
   private String edtavB2_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV26TFPrdNum ;
   private String lV28TFPrdNom ;
   private String lV112TFTipPrdDsc ;
   private String lV81TFValDsc ;
   private String lV83TFPrdRec ;
   private String lV41TFPrdGots ;
   private String lV43TFPrdReach ;
   private String lV47TFPrdHm ;
   private String lV53TFPrdTHELIST ;
   private String lV55TFPrdHS ;
   private String lV116TFPrdNum2 ;
   private String lV118TFPrdNom2 ;
   private String lV65TFPrdRefPrv ;
   private String lV120TFPrdFuncion ;
   private String lV122TFPrdEINECS ;
   private String lV124TFPrdNCAS ;
   private String lV32TFPrvNom ;
   private String lV159TFPrdGruFamDc ;
   private String hsh ;
   private String AV127EmprNom ;
   private String GXt_char1 ;
   private String GXt_char24 ;
   private String GXt_char25 ;
   private String GXt_char26 ;
   private String GXv_char20[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char58 ;
   private String GXv_char59[] ;
   private String GXt_char56 ;
   private String GXv_char57[] ;
   private String GXt_char54 ;
   private String GXv_char55[] ;
   private String GXt_char52 ;
   private String GXv_char53[] ;
   private String GXt_char50 ;
   private String GXv_char51[] ;
   private String GXt_char48 ;
   private String GXv_char49[] ;
   private String GXt_char46 ;
   private String GXv_char47[] ;
   private String GXt_char44 ;
   private String GXv_char45[] ;
   private String GXt_char42 ;
   private String GXv_char43[] ;
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
   private String GXt_char29 ;
   private String GXv_char23[] ;
   private String GXt_char28 ;
   private String GXv_char22[] ;
   private String GXt_char27 ;
   private String GXv_char21[] ;
   private String tblTablemovimientosentradas_modal_Internalname ;
   private String Movimientosentradas_modal_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdDisponi_Jsonclick ;
   private String edtPrdCanPen_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtTipPrdDsc_Jsonclick ;
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
   private String edtPrdNom2_Jsonclick ;
   private String edtPrdRefPrv_Jsonclick ;
   private String edtPrdFuncion_Jsonclick ;
   private String edtPrdEINECS_Jsonclick ;
   private String edtPrdNCAS_Jsonclick ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrdRGB_Jsonclick ;
   private String edtPrdGruFamD_Jsonclick ;
   private String edtPrdPreAc2_Jsonclick ;
   private String edtPrdFecPre_Jsonclick ;
   private String edtPrdPreAnt_Jsonclick ;
   private String edtavVar_forrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavR2_Jsonclick ;
   private String edtavG2_Jsonclick ;
   private String edtavB2_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV57TFPrdFHS ;
   private java.util.Date AV58TFPrdFHS_To ;
   private java.util.Date AV99TFPrdFecPre ;
   private java.util.Date Gx_date ;
   private java.util.Date AV59DDO_PrdFHSAuxDate ;
   private java.util.Date AV60DDO_PrdFHSAuxDateTo ;
   private java.util.Date AV101DDO_PrdFecPreAuxDate ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date A709PrdFecPre ;
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
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n6302TipPrdDsc ;
   private boolean n857ValDsc ;
   private boolean n13302PrdTHELIST ;
   private boolean n13974PrdGRS ;
   private boolean n794PrvNom ;
   private boolean n14036PrdGruFamD ;
   private boolean n13969PrdGruFamI ;
   private boolean n6301TipPrdCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV154TempBoolean ;
   private String AV45TFPrdOkotex_SelsJson ;
   private String AV49TFPrdZDHC_SelsJson ;
   private String AV51TFPrdList_SelsJson ;
   private String AV114TFPrdGRS_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV15FilterFullText ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWindow AV142Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucMovimientosentradas_modal ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbPrdOkotex ;
   private HTMLChoice cmbPrdZDHC ;
   private HTMLChoice cmbPrdList ;
   private HTMLChoice cmbPrdGRS ;
   private IDataStoreProvider pr_default ;
   private byte[] H01QY2_A13969PrdGruFamI ;
   private boolean[] H01QY2_n13969PrdGruFamI ;
   private byte[] H01QY2_A856ValCod ;
   private short[] H01QY2_A6301TipPrdCod ;
   private boolean[] H01QY2_n6301TipPrdCod ;
   private String[] H01QY2_A396EmprCod ;
   private java.math.BigDecimal[] H01QY2_A725PrdPreAnt ;
   private java.util.Date[] H01QY2_A709PrdFecPre ;
   private java.math.BigDecimal[] H01QY2_A5255PrdPreAc2 ;
   private String[] H01QY2_A14036PrdGruFamD ;
   private boolean[] H01QY2_n14036PrdGruFamD ;
   private long[] H01QY2_A13232PrdRGB ;
   private String[] H01QY2_A794PrvNom ;
   private boolean[] H01QY2_n794PrvNom ;
   private int[] H01QY2_A795PrvNum ;
   private String[] H01QY2_A9734PrdNCAS ;
   private String[] H01QY2_A11614PrdEINECS ;
   private String[] H01QY2_A11615PrdFuncion ;
   private String[] H01QY2_A728PrdRefPrv ;
   private String[] H01QY2_A4692PrdNom2 ;
   private String[] H01QY2_A4693PrdNum2 ;
   private java.util.Date[] H01QY2_A9742PrdFHS ;
   private String[] H01QY2_A9741PrdHS ;
   private String[] H01QY2_A13974PrdGRS ;
   private boolean[] H01QY2_n13974PrdGRS ;
   private String[] H01QY2_A13302PrdTHELIST ;
   private boolean[] H01QY2_n13302PrdTHELIST ;
   private String[] H01QY2_A11687PrdList ;
   private String[] H01QY2_A13301PrdZDHC ;
   private String[] H01QY2_A11364PrdHm ;
   private String[] H01QY2_A5888PrdOkotex ;
   private String[] H01QY2_A5887PrdReach ;
   private String[] H01QY2_A11363PrdGots ;
   private java.math.BigDecimal[] H01QY2_A9733PrdAox ;
   private String[] H01QY2_A727PrdRec ;
   private String[] H01QY2_A857ValDsc ;
   private boolean[] H01QY2_n857ValDsc ;
   private String[] H01QY2_A6302TipPrdDsc ;
   private boolean[] H01QY2_n6302TipPrdDsc ;
   private java.math.BigDecimal[] H01QY2_A724PrdPreAct ;
   private java.math.BigDecimal[] H01QY2_A684PrdCanPen ;
   private java.math.BigDecimal[] H01QY2_A13831PrdDisponi ;
   private String[] H01QY2_A718PrdNom ;
   private String[] H01QY2_A719PrdNum ;
   private java.math.BigDecimal[] H01QY2_A704PrdExiAlm ;
   private java.math.BigDecimal[] H01QY2_A685PrdCanRes ;
   private byte[] H01QY3_A13969PrdGruFamI ;
   private boolean[] H01QY3_n13969PrdGruFamI ;
   private byte[] H01QY3_A856ValCod ;
   private short[] H01QY3_A6301TipPrdCod ;
   private boolean[] H01QY3_n6301TipPrdCod ;
   private String[] H01QY3_A396EmprCod ;
   private java.math.BigDecimal[] H01QY3_A725PrdPreAnt ;
   private java.util.Date[] H01QY3_A709PrdFecPre ;
   private java.math.BigDecimal[] H01QY3_A5255PrdPreAc2 ;
   private String[] H01QY3_A14036PrdGruFamD ;
   private boolean[] H01QY3_n14036PrdGruFamD ;
   private long[] H01QY3_A13232PrdRGB ;
   private String[] H01QY3_A794PrvNom ;
   private boolean[] H01QY3_n794PrvNom ;
   private int[] H01QY3_A795PrvNum ;
   private String[] H01QY3_A9734PrdNCAS ;
   private String[] H01QY3_A11614PrdEINECS ;
   private String[] H01QY3_A11615PrdFuncion ;
   private String[] H01QY3_A728PrdRefPrv ;
   private String[] H01QY3_A4692PrdNom2 ;
   private String[] H01QY3_A4693PrdNum2 ;
   private java.util.Date[] H01QY3_A9742PrdFHS ;
   private String[] H01QY3_A9741PrdHS ;
   private String[] H01QY3_A13974PrdGRS ;
   private boolean[] H01QY3_n13974PrdGRS ;
   private String[] H01QY3_A13302PrdTHELIST ;
   private boolean[] H01QY3_n13302PrdTHELIST ;
   private String[] H01QY3_A11687PrdList ;
   private String[] H01QY3_A13301PrdZDHC ;
   private String[] H01QY3_A11364PrdHm ;
   private String[] H01QY3_A5888PrdOkotex ;
   private String[] H01QY3_A5887PrdReach ;
   private String[] H01QY3_A11363PrdGots ;
   private java.math.BigDecimal[] H01QY3_A9733PrdAox ;
   private String[] H01QY3_A727PrdRec ;
   private String[] H01QY3_A857ValDsc ;
   private boolean[] H01QY3_n857ValDsc ;
   private String[] H01QY3_A6302TipPrdDsc ;
   private boolean[] H01QY3_n6302TipPrdDsc ;
   private java.math.BigDecimal[] H01QY3_A724PrdPreAct ;
   private java.math.BigDecimal[] H01QY3_A684PrdCanPen ;
   private java.math.BigDecimal[] H01QY3_A13831PrdDisponi ;
   private String[] H01QY3_A718PrdNom ;
   private String[] H01QY3_A719PrdNum ;
   private java.math.BigDecimal[] H01QY3_A704PrdExiAlm ;
   private java.math.BigDecimal[] H01QY3_A685PrdCanRes ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV46TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV50TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV52TFPrdList_Sels ;
   private GXSimpleCollection<String> AV115TFPrdGRS_Sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState60[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV34DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class productoww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01QY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV46TFPrdOkotex_Sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV50TFPrdZDHC_Sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV52TFPrdList_Sels ,
                                          String A13974PrdGRS ,
                                          GXSimpleCollection<String> AV115TFPrdGRS_Sels ,
                                          String AV27TFPrdNum_Sel ,
                                          String AV26TFPrdNum ,
                                          String AV29TFPrdNom_Sel ,
                                          String AV28TFPrdNom ,
                                          java.math.BigDecimal AV106TFPrdExiAlm ,
                                          java.math.BigDecimal AV107TFPrdExiAlm_To ,
                                          java.math.BigDecimal AV108TFPrdCanRes ,
                                          java.math.BigDecimal AV109TFPrdCanRes_To ,
                                          java.math.BigDecimal AV135TFPrdDisponible ,
                                          java.math.BigDecimal AV136TFPrdDisponible_To ,
                                          java.math.BigDecimal AV110TFPrdCanPen ,
                                          java.math.BigDecimal AV111TFPrdCanPen_To ,
                                          java.math.BigDecimal AV97TFPrdPreAct ,
                                          java.math.BigDecimal AV98TFPrdPreAct_To ,
                                          String AV113TFTipPrdDsc_Sel ,
                                          String AV112TFTipPrdDsc ,
                                          String AV82TFValDsc_Sel ,
                                          String AV81TFValDsc ,
                                          String AV84TFPrdRec_Sel ,
                                          String AV83TFPrdRec ,
                                          java.math.BigDecimal AV39TFPrdAox ,
                                          java.math.BigDecimal AV40TFPrdAox_To ,
                                          String AV42TFPrdGots_Sel ,
                                          String AV41TFPrdGots ,
                                          String AV44TFPrdReach_Sel ,
                                          String AV43TFPrdReach ,
                                          int AV46TFPrdOkotex_Sels_size ,
                                          String AV48TFPrdHm_Sel ,
                                          String AV47TFPrdHm ,
                                          int AV50TFPrdZDHC_Sels_size ,
                                          int AV52TFPrdList_Sels_size ,
                                          String AV54TFPrdTHELIST_Sel ,
                                          String AV53TFPrdTHELIST ,
                                          int AV115TFPrdGRS_Sels_size ,
                                          String AV56TFPrdHS_Sel ,
                                          String AV55TFPrdHS ,
                                          java.util.Date AV57TFPrdFHS ,
                                          java.util.Date AV58TFPrdFHS_To ,
                                          String AV117TFPrdNum2_Sel ,
                                          String AV116TFPrdNum2 ,
                                          String AV119TFPrdNom2_Sel ,
                                          String AV118TFPrdNom2 ,
                                          String AV66TFPrdRefPrv_Sel ,
                                          String AV65TFPrdRefPrv ,
                                          String AV121TFPrdFuncion_Sel ,
                                          String AV120TFPrdFuncion ,
                                          String AV123TFPrdEINECS_Sel ,
                                          String AV122TFPrdEINECS ,
                                          String AV125TFPrdNCAS_Sel ,
                                          String AV124TFPrdNCAS ,
                                          int AV30TFPrvNum ,
                                          int AV31TFPrvNum_To ,
                                          String AV33TFPrvNom_Sel ,
                                          String AV32TFPrvNom ,
                                          long AV144TFPrdRGB ,
                                          long AV145TFPrdRGB_To ,
                                          String AV160TFPrdGruFamDc_Sel ,
                                          String AV159TFPrdGruFamDc ,
                                          java.math.BigDecimal AV157TFPrdPreAc2 ,
                                          java.math.BigDecimal AV158TFPrdPreAc2_To ,
                                          java.util.Date AV99TFPrdFecPre ,
                                          java.math.BigDecimal AV103TFPrdPreAnt ,
                                          java.math.BigDecimal AV104TFPrdPreAnt_To ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A6302TipPrdDsc ,
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
                                          String A4692PrdNom2 ,
                                          String A728PrdRefPrv ,
                                          String A11615PrdFuncion ,
                                          String A11614PrdEINECS ,
                                          String A9734PrdNCAS ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          long A13232PrdRGB ,
                                          String A14036PrdGruFamD ,
                                          java.math.BigDecimal A5255PrdPreAc2 ,
                                          java.util.Date A709PrdFecPre ,
                                          java.math.BigDecimal A725PrdPreAnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV15FilterFullText ,
                                          java.math.BigDecimal A13831PrdDisponi ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int61 = new byte[60];
      Object[] GXv_Object62 = new Object[2];
      scmdbuf = "SELECT T1.PrdGruFamI AS PrdGruFamI, T1.ValCod, T1.TipPrdCod, T1.EmprCod, T1.PrdPreAnt, T1.PrdFecPre, T1.PrdPreAc2, T2.GrpFamDsc AS PrdGruFamD, T1.PrdRGB, T3.PrvNom," ;
      scmdbuf += " T1.PrvNum, T1.PrdNCAS, T1.PrdEINECS, T1.PrdFuncion, T1.PrdRefPrv, T1.PrdNom2, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdGRS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC," ;
      scmdbuf += " T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox, T1.PrdRec, T4.ValDsc, T5.TipPrdDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdExiAlm - T1.PrdCanRes AS PrdDisponi," ;
      scmdbuf += " T1.PrdNom, T1.PrdNum, T1.PrdExiAlm, T1.PrdCanRes FROM ((((TXPPRODUC T1 LEFT JOIN TXPGRUFAM T2 ON T2.EmprCod = T1.EmprCod AND T2.GrpFamCod = T1.PrdGruFamI) INNER" ;
      scmdbuf += " JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum) INNER JOIN TXPTIPVAL T4 ON T4.EmprCod = T1.EmprCod AND T4.ValCod = T1.ValCod) LEFT JOIN" ;
      scmdbuf += " TXPTIPPRD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipPrdCod = T1.TipPrdCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV27TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int61[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int61[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFPrdExiAlm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int61[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFPrdExiAlm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int61[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFPrdCanRes)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int61[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109TFPrdCanRes_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int61[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135TFPrdDisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int61[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136TFPrdDisponible_To)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int61[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110TFPrdCanPen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int61[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111TFPrdCanPen_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int61[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFPrdPreAct)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int61[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFPrdPreAct_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int61[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113TFTipPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV112TFTipPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113TFTipPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int61[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82TFValDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV81TFValDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82TFValDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ValDsc = ?)");
      }
      else
      {
         GXv_int61[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84TFPrdRec_Sel)==0) && ( ! (GXutil.strcmp("", AV83TFPrdRec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84TFPrdRec_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int61[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdAox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int61[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdAox_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int61[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFPrdGots_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFPrdGots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFPrdGots_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int61[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFPrdReach_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFPrdReach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFPrdReach_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int61[26] = (byte)(1) ;
      }
      if ( AV46TFPrdOkotex_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV46TFPrdOkotex_Sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV48TFPrdHm_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFPrdHm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFPrdHm_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int61[28] = (byte)(1) ;
      }
      if ( AV50TFPrdZDHC_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV50TFPrdZDHC_Sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV52TFPrdList_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV52TFPrdList_Sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV54TFPrdTHELIST_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFPrdTHELIST)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFPrdTHELIST_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int61[30] = (byte)(1) ;
      }
      if ( AV115TFPrdGRS_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115TFPrdGRS_Sels, "T1.PrdGRS IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV56TFPrdHS_Sel)==0) && ( ! (GXutil.strcmp("", AV55TFPrdHS)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56TFPrdHS_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int61[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFPrdFHS)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int61[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFPrdFHS_To)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int61[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117TFPrdNum2_Sel)==0) && ( ! (GXutil.strcmp("", AV116TFPrdNum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117TFPrdNum2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int61[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119TFPrdNom2_Sel)==0) && ( ! (GXutil.strcmp("", AV118TFPrdNom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119TFPrdNom2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom2 = ?)");
      }
      else
      {
         GXv_int61[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFPrdRefPrv_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFPrdRefPrv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFPrdRefPrv_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int61[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121TFPrdFuncion_Sel)==0) && ( ! (GXutil.strcmp("", AV120TFPrdFuncion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdFuncion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121TFPrdFuncion_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdFuncion = ?)");
      }
      else
      {
         GXv_int61[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123TFPrdEINECS_Sel)==0) && ( ! (GXutil.strcmp("", AV122TFPrdEINECS)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdEINECS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123TFPrdEINECS_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdEINECS = ?)");
      }
      else
      {
         GXv_int61[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125TFPrdNCAS_Sel)==0) && ( ! (GXutil.strcmp("", AV124TFPrdNCAS)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNCAS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125TFPrdNCAS_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNCAS = ?)");
      }
      else
      {
         GXv_int61[46] = (byte)(1) ;
      }
      if ( ! (0==AV30TFPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int61[47] = (byte)(1) ;
      }
      if ( ! (0==AV31TFPrvNum_To) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int61[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFPrvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFPrvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFPrvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int61[50] = (byte)(1) ;
      }
      if ( ! (0==AV144TFPrdRGB) )
      {
         addWhere(sWhereString, "(T1.PrdRGB >= ?)");
      }
      else
      {
         GXv_int61[51] = (byte)(1) ;
      }
      if ( ! (0==AV145TFPrdRGB_To) )
      {
         addWhere(sWhereString, "(T1.PrdRGB <= ?)");
      }
      else
      {
         GXv_int61[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160TFPrdGruFamDc_Sel)==0) && ( ! (GXutil.strcmp("", AV159TFPrdGruFamDc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.GrpFamDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int61[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160TFPrdGruFamDc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.GrpFamDsc = ?)");
      }
      else
      {
         GXv_int61[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157TFPrdPreAc2)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAc2 >= ?)");
      }
      else
      {
         GXv_int61[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158TFPrdPreAc2_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAc2 <= ?)");
      }
      else
      {
         GXv_int61[56] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99TFPrdFecPre)) )
      {
         addWhere(sWhereString, "(T1.PrdFecPre >= ?)");
      }
      else
      {
         GXv_int61[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TFPrdPreAnt)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAnt >= ?)");
      }
      else
      {
         GXv_int61[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104TFPrdPreAnt_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAnt <= ?)");
      }
      else
      {
         GXv_int61[59] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ValDsc" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ValDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRec" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRec DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGRS" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGRS DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom2" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRGB" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRGB DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.GrpFamDsc" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.GrpFamDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAc2" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAc2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFecPre" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFecPre DESC" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAnt" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAnt DESC" ;
      }
      GXv_Object62[0] = scmdbuf ;
      GXv_Object62[1] = GXv_int61 ;
      return GXv_Object62 ;
   }

   protected Object[] conditional_H01QY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV46TFPrdOkotex_Sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV50TFPrdZDHC_Sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV52TFPrdList_Sels ,
                                          String A13974PrdGRS ,
                                          GXSimpleCollection<String> AV115TFPrdGRS_Sels ,
                                          String AV27TFPrdNum_Sel ,
                                          String AV26TFPrdNum ,
                                          String AV29TFPrdNom_Sel ,
                                          String AV28TFPrdNom ,
                                          java.math.BigDecimal AV106TFPrdExiAlm ,
                                          java.math.BigDecimal AV107TFPrdExiAlm_To ,
                                          java.math.BigDecimal AV108TFPrdCanRes ,
                                          java.math.BigDecimal AV109TFPrdCanRes_To ,
                                          java.math.BigDecimal AV135TFPrdDisponible ,
                                          java.math.BigDecimal AV136TFPrdDisponible_To ,
                                          java.math.BigDecimal AV110TFPrdCanPen ,
                                          java.math.BigDecimal AV111TFPrdCanPen_To ,
                                          java.math.BigDecimal AV97TFPrdPreAct ,
                                          java.math.BigDecimal AV98TFPrdPreAct_To ,
                                          String AV113TFTipPrdDsc_Sel ,
                                          String AV112TFTipPrdDsc ,
                                          String AV82TFValDsc_Sel ,
                                          String AV81TFValDsc ,
                                          String AV84TFPrdRec_Sel ,
                                          String AV83TFPrdRec ,
                                          java.math.BigDecimal AV39TFPrdAox ,
                                          java.math.BigDecimal AV40TFPrdAox_To ,
                                          String AV42TFPrdGots_Sel ,
                                          String AV41TFPrdGots ,
                                          String AV44TFPrdReach_Sel ,
                                          String AV43TFPrdReach ,
                                          int AV46TFPrdOkotex_Sels_size ,
                                          String AV48TFPrdHm_Sel ,
                                          String AV47TFPrdHm ,
                                          int AV50TFPrdZDHC_Sels_size ,
                                          int AV52TFPrdList_Sels_size ,
                                          String AV54TFPrdTHELIST_Sel ,
                                          String AV53TFPrdTHELIST ,
                                          int AV115TFPrdGRS_Sels_size ,
                                          String AV56TFPrdHS_Sel ,
                                          String AV55TFPrdHS ,
                                          java.util.Date AV57TFPrdFHS ,
                                          java.util.Date AV58TFPrdFHS_To ,
                                          String AV117TFPrdNum2_Sel ,
                                          String AV116TFPrdNum2 ,
                                          String AV119TFPrdNom2_Sel ,
                                          String AV118TFPrdNom2 ,
                                          String AV66TFPrdRefPrv_Sel ,
                                          String AV65TFPrdRefPrv ,
                                          String AV121TFPrdFuncion_Sel ,
                                          String AV120TFPrdFuncion ,
                                          String AV123TFPrdEINECS_Sel ,
                                          String AV122TFPrdEINECS ,
                                          String AV125TFPrdNCAS_Sel ,
                                          String AV124TFPrdNCAS ,
                                          int AV30TFPrvNum ,
                                          int AV31TFPrvNum_To ,
                                          String AV33TFPrvNom_Sel ,
                                          String AV32TFPrvNom ,
                                          long AV144TFPrdRGB ,
                                          long AV145TFPrdRGB_To ,
                                          String AV160TFPrdGruFamDc_Sel ,
                                          String AV159TFPrdGruFamDc ,
                                          java.math.BigDecimal AV157TFPrdPreAc2 ,
                                          java.math.BigDecimal AV158TFPrdPreAc2_To ,
                                          java.util.Date AV99TFPrdFecPre ,
                                          java.math.BigDecimal AV103TFPrdPreAnt ,
                                          java.math.BigDecimal AV104TFPrdPreAnt_To ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A6302TipPrdDsc ,
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
                                          String A4692PrdNom2 ,
                                          String A728PrdRefPrv ,
                                          String A11615PrdFuncion ,
                                          String A11614PrdEINECS ,
                                          String A9734PrdNCAS ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          long A13232PrdRGB ,
                                          String A14036PrdGruFamD ,
                                          java.math.BigDecimal A5255PrdPreAc2 ,
                                          java.util.Date A709PrdFecPre ,
                                          java.math.BigDecimal A725PrdPreAnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV15FilterFullText ,
                                          java.math.BigDecimal A13831PrdDisponi ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int64 = new byte[60];
      Object[] GXv_Object65 = new Object[2];
      scmdbuf = "SELECT T1.PrdGruFamI AS PrdGruFamI, T1.ValCod, T1.TipPrdCod, T1.EmprCod, T1.PrdPreAnt, T1.PrdFecPre, T1.PrdPreAc2, T2.GrpFamDsc AS PrdGruFamD, T1.PrdRGB, T3.PrvNom," ;
      scmdbuf += " T1.PrvNum, T1.PrdNCAS, T1.PrdEINECS, T1.PrdFuncion, T1.PrdRefPrv, T1.PrdNom2, T1.PrdNum2, T1.PrdFHS, T1.PrdHS, T1.PrdGRS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC," ;
      scmdbuf += " T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox, T1.PrdRec, T4.ValDsc, T5.TipPrdDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdExiAlm - T1.PrdCanRes AS PrdDisponi," ;
      scmdbuf += " T1.PrdNom, T1.PrdNum, T1.PrdExiAlm, T1.PrdCanRes FROM ((((TXPPRODUC T1 LEFT JOIN TXPGRUFAM T2 ON T2.EmprCod = T1.EmprCod AND T2.GrpFamCod = T1.PrdGruFamI) INNER" ;
      scmdbuf += " JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum) INNER JOIN TXPTIPVAL T4 ON T4.EmprCod = T1.EmprCod AND T4.ValCod = T1.ValCod) LEFT JOIN" ;
      scmdbuf += " TXPTIPPRD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipPrdCod = T1.TipPrdCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV27TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int64[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int64[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFPrdExiAlm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int64[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFPrdExiAlm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int64[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFPrdCanRes)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int64[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109TFPrdCanRes_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int64[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135TFPrdDisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int64[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136TFPrdDisponible_To)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int64[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110TFPrdCanPen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int64[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111TFPrdCanPen_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int64[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFPrdPreAct)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int64[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFPrdPreAct_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int64[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113TFTipPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV112TFTipPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113TFTipPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int64[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82TFValDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV81TFValDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82TFValDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ValDsc = ?)");
      }
      else
      {
         GXv_int64[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84TFPrdRec_Sel)==0) && ( ! (GXutil.strcmp("", AV83TFPrdRec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84TFPrdRec_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int64[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdAox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int64[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdAox_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int64[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFPrdGots_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFPrdGots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFPrdGots_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int64[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFPrdReach_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFPrdReach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFPrdReach_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int64[26] = (byte)(1) ;
      }
      if ( AV46TFPrdOkotex_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV46TFPrdOkotex_Sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV48TFPrdHm_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFPrdHm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFPrdHm_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int64[28] = (byte)(1) ;
      }
      if ( AV50TFPrdZDHC_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV50TFPrdZDHC_Sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV52TFPrdList_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV52TFPrdList_Sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV54TFPrdTHELIST_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFPrdTHELIST)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFPrdTHELIST_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int64[30] = (byte)(1) ;
      }
      if ( AV115TFPrdGRS_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115TFPrdGRS_Sels, "T1.PrdGRS IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV56TFPrdHS_Sel)==0) && ( ! (GXutil.strcmp("", AV55TFPrdHS)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56TFPrdHS_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int64[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFPrdFHS)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int64[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFPrdFHS_To)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS <= ?)");
      }
      else
      {
         GXv_int64[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117TFPrdNum2_Sel)==0) && ( ! (GXutil.strcmp("", AV116TFPrdNum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117TFPrdNum2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int64[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119TFPrdNom2_Sel)==0) && ( ! (GXutil.strcmp("", AV118TFPrdNom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119TFPrdNom2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom2 = ?)");
      }
      else
      {
         GXv_int64[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFPrdRefPrv_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFPrdRefPrv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFPrdRefPrv_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int64[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121TFPrdFuncion_Sel)==0) && ( ! (GXutil.strcmp("", AV120TFPrdFuncion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdFuncion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121TFPrdFuncion_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdFuncion = ?)");
      }
      else
      {
         GXv_int64[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123TFPrdEINECS_Sel)==0) && ( ! (GXutil.strcmp("", AV122TFPrdEINECS)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdEINECS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123TFPrdEINECS_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdEINECS = ?)");
      }
      else
      {
         GXv_int64[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125TFPrdNCAS_Sel)==0) && ( ! (GXutil.strcmp("", AV124TFPrdNCAS)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNCAS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125TFPrdNCAS_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNCAS = ?)");
      }
      else
      {
         GXv_int64[46] = (byte)(1) ;
      }
      if ( ! (0==AV30TFPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int64[47] = (byte)(1) ;
      }
      if ( ! (0==AV31TFPrvNum_To) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int64[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFPrvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFPrvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFPrvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int64[50] = (byte)(1) ;
      }
      if ( ! (0==AV144TFPrdRGB) )
      {
         addWhere(sWhereString, "(T1.PrdRGB >= ?)");
      }
      else
      {
         GXv_int64[51] = (byte)(1) ;
      }
      if ( ! (0==AV145TFPrdRGB_To) )
      {
         addWhere(sWhereString, "(T1.PrdRGB <= ?)");
      }
      else
      {
         GXv_int64[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160TFPrdGruFamDc_Sel)==0) && ( ! (GXutil.strcmp("", AV159TFPrdGruFamDc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.GrpFamDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int64[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160TFPrdGruFamDc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.GrpFamDsc = ?)");
      }
      else
      {
         GXv_int64[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157TFPrdPreAc2)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAc2 >= ?)");
      }
      else
      {
         GXv_int64[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158TFPrdPreAc2_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAc2 <= ?)");
      }
      else
      {
         GXv_int64[56] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99TFPrdFecPre)) )
      {
         addWhere(sWhereString, "(T1.PrdFecPre >= ?)");
      }
      else
      {
         GXv_int64[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TFPrdPreAnt)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAnt >= ?)");
      }
      else
      {
         GXv_int64[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104TFPrdPreAnt_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAnt <= ?)");
      }
      else
      {
         GXv_int64[59] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ValDsc" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ValDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRec" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRec DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGRS" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGRS DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom2" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRGB" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRGB DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.GrpFamDsc" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.GrpFamDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAc2" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAc2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFecPre" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFecPre DESC" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAnt" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAnt DESC" ;
      }
      GXv_Object65[0] = scmdbuf ;
      GXv_Object65[1] = GXv_int64 ;
      return GXv_Object65 ;
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
                  return conditional_H01QY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).longValue() , ((Number) dynConstraints[63]).longValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (java.math.BigDecimal)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , (String)dynConstraints[85] , (java.util.Date)dynConstraints[86] , (String)dynConstraints[87] , (String)dynConstraints[88] , (String)dynConstraints[89] , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , ((Number) dynConstraints[93]).intValue() , (String)dynConstraints[94] , ((Number) dynConstraints[95]).longValue() , (String)dynConstraints[96] , (java.math.BigDecimal)dynConstraints[97] , (java.util.Date)dynConstraints[98] , (java.math.BigDecimal)dynConstraints[99] , ((Number) dynConstraints[100]).shortValue() , ((Boolean) dynConstraints[101]).booleanValue() , (String)dynConstraints[102] , (java.math.BigDecimal)dynConstraints[103] , (String)dynConstraints[104] );
            case 1 :
                  return conditional_H01QY3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).longValue() , ((Number) dynConstraints[63]).longValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (java.math.BigDecimal)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , (String)dynConstraints[85] , (java.util.Date)dynConstraints[86] , (String)dynConstraints[87] , (String)dynConstraints[88] , (String)dynConstraints[89] , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , ((Number) dynConstraints[93]).intValue() , (String)dynConstraints[94] , ((Number) dynConstraints[95]).longValue() , (String)dynConstraints[96] , (java.math.BigDecimal)dynConstraints[97] , (java.util.Date)dynConstraints[98] , (java.math.BigDecimal)dynConstraints[99] , ((Number) dynConstraints[100]).shortValue() , ((Boolean) dynConstraints[101]).booleanValue() , (String)dynConstraints[102] , (java.math.BigDecimal)dynConstraints[103] , (String)dynConstraints[104] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01QY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01QY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((String[]) buf[16])[0] = rslt.getString(13, 40);
               ((String[]) buf[17])[0] = rslt.getString(14, 50);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((String[]) buf[19])[0] = rslt.getString(16, 40);
               ((String[]) buf[20])[0] = rslt.getString(17, 16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 1);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(21, 4);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((String[]) buf[28])[0] = rslt.getString(23, 1);
               ((String[]) buf[29])[0] = rslt.getString(24, 1);
               ((String[]) buf[30])[0] = rslt.getString(25, 1);
               ((String[]) buf[31])[0] = rslt.getString(26, 1);
               ((String[]) buf[32])[0] = rslt.getString(27, 1);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(28,2);
               ((String[]) buf[34])[0] = rslt.getString(29, 1);
               ((String[]) buf[35])[0] = rslt.getString(30, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(31, 40);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(32,5);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(33,4);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(34,4);
               ((String[]) buf[42])[0] = rslt.getString(35, 26);
               ((String[]) buf[43])[0] = rslt.getString(36, 6);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(37,4);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(38,4);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((String[]) buf[16])[0] = rslt.getString(13, 40);
               ((String[]) buf[17])[0] = rslt.getString(14, 50);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((String[]) buf[19])[0] = rslt.getString(16, 40);
               ((String[]) buf[20])[0] = rslt.getString(17, 16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 1);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(21, 4);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((String[]) buf[28])[0] = rslt.getString(23, 1);
               ((String[]) buf[29])[0] = rslt.getString(24, 1);
               ((String[]) buf[30])[0] = rslt.getString(25, 1);
               ((String[]) buf[31])[0] = rslt.getString(26, 1);
               ((String[]) buf[32])[0] = rslt.getString(27, 1);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(28,2);
               ((String[]) buf[34])[0] = rslt.getString(29, 1);
               ((String[]) buf[35])[0] = rslt.getString(30, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(31, 40);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(32,5);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(33,4);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(34,4);
               ((String[]) buf[42])[0] = rslt.getString(35, 26);
               ((String[]) buf[43])[0] = rslt.getString(36, 6);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(37,4);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(38,4);
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
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 40);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 50);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 50);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 40);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 30);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[111]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[112]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 30);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 30);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[115], 5);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[116], 5);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[117]);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 5);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 5);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 40);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 50);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 50);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 40);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 30);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[111]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[112]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 30);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 30);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[115], 5);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[116], 5);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[117]);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 5);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 5);
               }
               return;
      }
   }

}

