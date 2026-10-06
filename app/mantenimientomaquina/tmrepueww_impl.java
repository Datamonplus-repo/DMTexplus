package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmrepueww_impl extends GXDataArea
{
   public tmrepueww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmrepueww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmrepueww_impl.class ));
   }

   public tmrepueww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkMRActivo = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_49 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_49"))) ;
      nGXsfl_49_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_49_idx"))) ;
      sGXsfl_49_idx = httpContext.GetPar( "sGXsfl_49_idx") ;
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
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV28TFMRNom = httpContext.GetPar( "TFMRNom") ;
      AV29TFMRNom_Sel = httpContext.GetPar( "TFMRNom_Sel") ;
      AV26TFMRCod = (int)(GXutil.lval( httpContext.GetPar( "TFMRCod"))) ;
      AV27TFMRCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFMRCod_To"))) ;
      AV30TFMRCodExt = httpContext.GetPar( "TFMRCodExt") ;
      AV31TFMRCodExt_Sel = httpContext.GetPar( "TFMRCodExt_Sel") ;
      AV42TFMRStkPre = CommonUtil.decimalVal( httpContext.GetPar( "TFMRStkPre"), ".") ;
      AV43TFMRStkPre_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMRStkPre_To"), ".") ;
      AV34TFMRStkAct = CommonUtil.decimalVal( httpContext.GetPar( "TFMRStkAct"), ".") ;
      AV35TFMRStkAct_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMRStkAct_To"), ".") ;
      AV36TFMRStkRes = CommonUtil.decimalVal( httpContext.GetPar( "TFMRStkRes"), ".") ;
      AV37TFMRStkRes_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMRStkRes_To"), ".") ;
      AV38TFMRStkMin = CommonUtil.decimalVal( httpContext.GetPar( "TFMRStkMin"), ".") ;
      AV39TFMRStkMin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMRStkMin_To"), ".") ;
      AV40TFMRStkCri = CommonUtil.decimalVal( httpContext.GetPar( "TFMRStkCri"), ".") ;
      AV41TFMRStkCri_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMRStkCri_To"), ".") ;
      AV32TFMRCodPrv = httpContext.GetPar( "TFMRCodPrv") ;
      AV33TFMRCodPrv_Sel = httpContext.GetPar( "TFMRCodPrv_Sel") ;
      AV49TFMRActivo_Sel = httpContext.GetPar( "TFMRActivo_Sel") ;
      AV115Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV110Mrcod3 = (int)(GXutil.lval( httpContext.GetPar( "Mrcod3"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMRNom, AV29TFMRNom_Sel, AV26TFMRCod, AV27TFMRCod_To, AV30TFMRCodExt, AV31TFMRCodExt_Sel, AV42TFMRStkPre, AV43TFMRStkPre_To, AV34TFMRStkAct, AV35TFMRStkAct_To, AV36TFMRStkRes, AV37TFMRStkRes_To, AV38TFMRStkMin, AV39TFMRStkMin_To, AV40TFMRStkCri, AV41TFMRStkCri_To, AV32TFMRCodPrv, AV33TFMRCodPrv_Sel, AV49TFMRActivo_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV110Mrcod3) ;
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
      paI22( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startI22( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmrepueww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMRCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110Mrcod3), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMRepueWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV115Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmrepueww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_49", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_49, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV52GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV53GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRNOM", GXutil.rtrim( AV28TFMRNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRNOM_SEL", GXutil.rtrim( AV29TFMRNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRCOD", GXutil.ltrim( localUtil.ntoc( AV26TFMRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRCOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFMRCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRCODEXT", GXutil.rtrim( AV30TFMRCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRCODEXT_SEL", GXutil.rtrim( AV31TFMRCodExt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRSTKPRE", GXutil.ltrim( localUtil.ntoc( AV42TFMRStkPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRSTKPRE_TO", GXutil.ltrim( localUtil.ntoc( AV43TFMRStkPre_To, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRSTKACT", GXutil.ltrim( localUtil.ntoc( AV34TFMRStkAct, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRSTKACT_TO", GXutil.ltrim( localUtil.ntoc( AV35TFMRStkAct_To, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRSTKRES", GXutil.ltrim( localUtil.ntoc( AV36TFMRStkRes, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRSTKRES_TO", GXutil.ltrim( localUtil.ntoc( AV37TFMRStkRes_To, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRSTKMIN", GXutil.ltrim( localUtil.ntoc( AV38TFMRStkMin, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRSTKMIN_TO", GXutil.ltrim( localUtil.ntoc( AV39TFMRStkMin_To, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRSTKCRI", GXutil.ltrim( localUtil.ntoc( AV40TFMRStkCri, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRSTKCRI_TO", GXutil.ltrim( localUtil.ntoc( AV41TFMRStkCri_To, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRCODPRV", GXutil.rtrim( AV32TFMRCodPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRCODPRV_SEL", GXutil.rtrim( AV33TFMRCodPrv_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMRACTIVO_SEL", GXutil.rtrim( AV49TFMRActivo_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV57EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMRCOD3", GXutil.ltrim( localUtil.ntoc( AV110Mrcod3, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMRCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110Mrcod3), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMRCOD2", GXutil.ltrim( localUtil.ntoc( AV111MRCod2, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMRCOD", GXutil.ltrim( localUtil.ntoc( AV107MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMRNOM", GXutil.rtrim( AV112MRNom));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECALCULAR_Title", GXutil.rtrim( Dvelop_confirmpanel_recalcular_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECALCULAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_recalcular_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECALCULAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recalcular_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECALCULAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recalcular_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECALCULAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recalcular_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECALCULAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_recalcular_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECALCULAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_recalcular_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECALCULAR_Result", GXutil.rtrim( Dvelop_confirmpanel_recalcular_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECALCULAR_Result", GXutil.rtrim( Dvelop_confirmpanel_recalcular_Result));
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
         weI22( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtI22( ) ;
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
      return formatLink("app.mantenimientomaquina.tmrepueww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMRepueWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Respuestos", "") ;
   }

   public void wbI20( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMRepueWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnstockminimobajos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "Stocks Mínimos Bajos", ""), bttBtnstockminimobajos_Jsonclick, 5, httpContext.getMessage( "Stocks Mínimos Bajos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSTOCKMINIMOBAJOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMRepueWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "Imprimir", ""), bttBtnimprimir_Jsonclick, 7, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11i21_client"+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\TMRepueWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimirdetallado_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "Imp Detallado", ""), bttBtnimprimirdetallado_Jsonclick, 7, httpContext.getMessage( "Imp Detallado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e12i21_client"+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\TMRepueWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMRepueWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMRepueWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMRepueWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_31_I22( true) ;
      }
      else
      {
         wb_table1_31_I22( false) ;
      }
      return  ;
   }

   public void wb_table1_31_I22e( boolean wbgen )
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
         startgridcontrol49( ) ;
      }
      if ( wbEnd == 49 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_49 = (int)(nGXsfl_49_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV52GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV53GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0072"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0072"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_49_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0072"+"");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV115Pgmname), GXutil.rtrim( localUtil.format( AV115Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMRepueWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_85_I22( true) ;
      }
      else
      {
         wb_table2_85_I22( false) ;
      }
      return  ;
   }

   public void wb_table2_85_I22e( boolean wbgen )
   {
      if ( wbgen )
      {
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
      if ( wbEnd == 49 )
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

   public void startI22( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Respuestos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupI20( ) ;
   }

   public void wsI22( )
   {
      startI22( ) ;
      evtI22( ) ;
   }

   public void evtI22( )
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
                           e13I22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14I22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15I22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16I22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17I22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_RECALCULAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18I22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e19I22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSTOCKMINIMOBAJOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoStockMinimoBajos' */
                           e20I22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e21I22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e22I22 ();
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
                           nGXsfl_49_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_492( ) ;
                           AV105DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV105DetailWebComponent);
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV103GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103GridActions), 4, 0));
                           A9493MRNom = httpContext.cgiGet( edtMRNom_Internalname) ;
                           n9493MRNom = false ;
                           A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9494MRCodExt = httpContext.cgiGet( edtMRCodExt_Internalname) ;
                           n9494MRCodExt = false ;
                           A9499MRStkPre = localUtil.ctond( httpContext.cgiGet( edtMRStkPre_Internalname)) ;
                           n9499MRStkPre = false ;
                           A9495MRStkAct = localUtil.ctond( httpContext.cgiGet( edtMRStkAct_Internalname)) ;
                           n9495MRStkAct = false ;
                           A9496MRStkRes = localUtil.ctond( httpContext.cgiGet( edtMRStkRes_Internalname)) ;
                           n9496MRStkRes = false ;
                           A9497MRStkMin = localUtil.ctond( httpContext.cgiGet( edtMRStkMin_Internalname)) ;
                           n9497MRStkMin = false ;
                           A9498MRStkCri = localUtil.ctond( httpContext.cgiGet( edtMRStkCri_Internalname)) ;
                           n9498MRStkCri = false ;
                           A11458MRCodPrv = httpContext.cgiGet( edtMRCodPrv_Internalname) ;
                           n11458MRCodPrv = false ;
                           A12850MRActivo = ((GXutil.strcmp(httpContext.cgiGet( chkMRActivo.getInternalname()), "S")==0) ? "S" : "N") ;
                           n12850MRActivo = false ;
                           A9500MRUltMov = (int)(localUtil.ctol( httpContext.cgiGet( edtMRUltMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9500MRUltMov = false ;
                           A9501MRUltRes = localUtil.ctol( httpContext.cgiGet( edtMRUltRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n9501MRUltRes = false ;
                           A13718MRCNom = httpContext.cgiGet( edtMRCNom_Internalname) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e23I22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e24I22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e25I22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e26I22 ();
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
                     if ( nCmpId == 72 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0072") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0072", "", sEvt);
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

   public void weI22( )
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

   public void paI22( )
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
      subsflControlProps_492( ) ;
      while ( nGXsfl_49_idx <= nRC_GXsfl_49 )
      {
         sendrow_492( ) ;
         nGXsfl_49_idx = ((subGrid_Islastpage==1)&&(nGXsfl_49_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_49_idx+1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV28TFMRNom ,
                                 String AV29TFMRNom_Sel ,
                                 int AV26TFMRCod ,
                                 int AV27TFMRCod_To ,
                                 String AV30TFMRCodExt ,
                                 String AV31TFMRCodExt_Sel ,
                                 java.math.BigDecimal AV42TFMRStkPre ,
                                 java.math.BigDecimal AV43TFMRStkPre_To ,
                                 java.math.BigDecimal AV34TFMRStkAct ,
                                 java.math.BigDecimal AV35TFMRStkAct_To ,
                                 java.math.BigDecimal AV36TFMRStkRes ,
                                 java.math.BigDecimal AV37TFMRStkRes_To ,
                                 java.math.BigDecimal AV38TFMRStkMin ,
                                 java.math.BigDecimal AV39TFMRStkMin_To ,
                                 java.math.BigDecimal AV40TFMRStkCri ,
                                 java.math.BigDecimal AV41TFMRStkCri_To ,
                                 String AV32TFMRCodPrv ,
                                 String AV33TFMRCodPrv_Sel ,
                                 String AV49TFMRActivo_Sel ,
                                 String AV115Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int AV110Mrcod3 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e24I22 ();
      GRID_nCurrentRecord = 0 ;
      rfI22( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMRepueWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV115Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmrepueww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rfI22( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV115Pgmname = "MantenimientoMaquina.TMRepueWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Pgmname", AV115Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rfI22( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(49) ;
      /* Execute user event: Refresh */
      e24I22 ();
      nGXsfl_49_idx = 1 ;
      sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_492( ) ;
      bGXsfl_49_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_492( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext ,
                                              AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel ,
                                              AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom ,
                                              Integer.valueOf(AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod) ,
                                              Integer.valueOf(AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to) ,
                                              AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel ,
                                              AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext ,
                                              AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre ,
                                              AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to ,
                                              AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact ,
                                              AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to ,
                                              AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres ,
                                              AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to ,
                                              AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin ,
                                              AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to ,
                                              AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri ,
                                              AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to ,
                                              AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel ,
                                              AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv ,
                                              AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel ,
                                              A9493MRNom ,
                                              Integer.valueOf(A9492MRCod) ,
                                              A9494MRCodExt ,
                                              A9499MRStkPre ,
                                              A9495MRStkAct ,
                                              A9496MRStkRes ,
                                              A9497MRStkMin ,
                                              A9498MRStkCri ,
                                              A11458MRCodPrv ,
                                              A12850MRActivo ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                              TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN
                                              }
         });
         lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
         lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
         lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
         lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
         lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
         lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
         lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
         lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
         lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
         lV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = GXutil.padr( GXutil.rtrim( AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom), 100, "%") ;
         lV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = GXutil.padr( GXutil.rtrim( AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext), 20, "%") ;
         lV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = GXutil.padr( GXutil.rtrim( AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv), 20, "%") ;
         /* Using cursor H00I22 */
         pr_default.execute(0, new Object[] {lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom, AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel, Integer.valueOf(AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod), Integer.valueOf(AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to), lV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext, AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel, AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre, AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to, AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact, AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to, AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres, AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to, AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin, AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to, AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri, AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to, lV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv, AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel, AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_49_idx = 1 ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A407EmprNom = H00I22_A407EmprNom[0] ;
            n407EmprNom = H00I22_n407EmprNom[0] ;
            A396EmprCod = H00I22_A396EmprCod[0] ;
            A9501MRUltRes = H00I22_A9501MRUltRes[0] ;
            n9501MRUltRes = H00I22_n9501MRUltRes[0] ;
            A9500MRUltMov = H00I22_A9500MRUltMov[0] ;
            n9500MRUltMov = H00I22_n9500MRUltMov[0] ;
            A12850MRActivo = H00I22_A12850MRActivo[0] ;
            n12850MRActivo = H00I22_n12850MRActivo[0] ;
            A11458MRCodPrv = H00I22_A11458MRCodPrv[0] ;
            n11458MRCodPrv = H00I22_n11458MRCodPrv[0] ;
            A9498MRStkCri = H00I22_A9498MRStkCri[0] ;
            n9498MRStkCri = H00I22_n9498MRStkCri[0] ;
            A9497MRStkMin = H00I22_A9497MRStkMin[0] ;
            n9497MRStkMin = H00I22_n9497MRStkMin[0] ;
            A9496MRStkRes = H00I22_A9496MRStkRes[0] ;
            n9496MRStkRes = H00I22_n9496MRStkRes[0] ;
            A9495MRStkAct = H00I22_A9495MRStkAct[0] ;
            n9495MRStkAct = H00I22_n9495MRStkAct[0] ;
            A9499MRStkPre = H00I22_A9499MRStkPre[0] ;
            n9499MRStkPre = H00I22_n9499MRStkPre[0] ;
            A9494MRCodExt = H00I22_A9494MRCodExt[0] ;
            n9494MRCodExt = H00I22_n9494MRCodExt[0] ;
            A9493MRNom = H00I22_A9493MRNom[0] ;
            n9493MRNom = H00I22_n9493MRNom[0] ;
            A9492MRCod = H00I22_A9492MRCod[0] ;
            A407EmprNom = H00I22_A407EmprNom[0] ;
            n407EmprNom = H00I22_n407EmprNom[0] ;
            A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
            e25I22 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(49) ;
         wbI20( ) ;
      }
      bGXsfl_49_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesI22( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMRCOD3", GXutil.ltrim( localUtil.ntoc( AV110Mrcod3, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMRCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110Mrcod3), "ZZZZZZZ9")));
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
      AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = AV15FilterFullText ;
      AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = AV28TFMRNom ;
      AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel = AV29TFMRNom_Sel ;
      AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod = AV26TFMRCod ;
      AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to = AV27TFMRCod_To ;
      AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = AV30TFMRCodExt ;
      AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel = AV31TFMRCodExt_Sel ;
      AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre = AV42TFMRStkPre ;
      AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to = AV43TFMRStkPre_To ;
      AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact = AV34TFMRStkAct ;
      AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to = AV35TFMRStkAct_To ;
      AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres = AV36TFMRStkRes ;
      AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to = AV37TFMRStkRes_To ;
      AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin = AV38TFMRStkMin ;
      AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to = AV39TFMRStkMin_To ;
      AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri = AV40TFMRStkCri ;
      AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to = AV41TFMRStkCri_To ;
      AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = AV32TFMRCodPrv ;
      AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel = AV33TFMRCodPrv_Sel ;
      AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel = AV49TFMRActivo_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext ,
                                           AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel ,
                                           AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom ,
                                           Integer.valueOf(AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod) ,
                                           Integer.valueOf(AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to) ,
                                           AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel ,
                                           AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext ,
                                           AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre ,
                                           AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to ,
                                           AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact ,
                                           AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to ,
                                           AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres ,
                                           AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to ,
                                           AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin ,
                                           AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to ,
                                           AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri ,
                                           AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to ,
                                           AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel ,
                                           AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv ,
                                           AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A9494MRCodExt ,
                                           A9499MRStkPre ,
                                           A9495MRStkAct ,
                                           A9496MRStkRes ,
                                           A9497MRStkMin ,
                                           A9498MRStkCri ,
                                           A11458MRCodPrv ,
                                           A12850MRActivo ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext), "%", "") ;
      lV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = GXutil.padr( GXutil.rtrim( AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom), 100, "%") ;
      lV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = GXutil.padr( GXutil.rtrim( AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext), 20, "%") ;
      lV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = GXutil.padr( GXutil.rtrim( AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv), 20, "%") ;
      /* Using cursor H00I23 */
      pr_default.execute(1, new Object[] {lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext, lV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom, AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel, Integer.valueOf(AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod), Integer.valueOf(AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to), lV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext, AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel, AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre, AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to, AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact, AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to, AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres, AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to, AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin, AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to, AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri, AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to, lV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv, AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel, AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel});
      GRID_nRecordCount = H00I23_AGRID_nRecordCount[0] ;
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
      AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = AV15FilterFullText ;
      AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = AV28TFMRNom ;
      AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel = AV29TFMRNom_Sel ;
      AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod = AV26TFMRCod ;
      AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to = AV27TFMRCod_To ;
      AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = AV30TFMRCodExt ;
      AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel = AV31TFMRCodExt_Sel ;
      AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre = AV42TFMRStkPre ;
      AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to = AV43TFMRStkPre_To ;
      AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact = AV34TFMRStkAct ;
      AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to = AV35TFMRStkAct_To ;
      AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres = AV36TFMRStkRes ;
      AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to = AV37TFMRStkRes_To ;
      AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin = AV38TFMRStkMin ;
      AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to = AV39TFMRStkMin_To ;
      AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri = AV40TFMRStkCri ;
      AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to = AV41TFMRStkCri_To ;
      AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = AV32TFMRCodPrv ;
      AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel = AV33TFMRCodPrv_Sel ;
      AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel = AV49TFMRActivo_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMRNom, AV29TFMRNom_Sel, AV26TFMRCod, AV27TFMRCod_To, AV30TFMRCodExt, AV31TFMRCodExt_Sel, AV42TFMRStkPre, AV43TFMRStkPre_To, AV34TFMRStkAct, AV35TFMRStkAct_To, AV36TFMRStkRes, AV37TFMRStkRes_To, AV38TFMRStkMin, AV39TFMRStkMin_To, AV40TFMRStkCri, AV41TFMRStkCri_To, AV32TFMRCodPrv, AV33TFMRCodPrv_Sel, AV49TFMRActivo_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV110Mrcod3) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = AV15FilterFullText ;
      AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = AV28TFMRNom ;
      AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel = AV29TFMRNom_Sel ;
      AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod = AV26TFMRCod ;
      AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to = AV27TFMRCod_To ;
      AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = AV30TFMRCodExt ;
      AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel = AV31TFMRCodExt_Sel ;
      AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre = AV42TFMRStkPre ;
      AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to = AV43TFMRStkPre_To ;
      AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact = AV34TFMRStkAct ;
      AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to = AV35TFMRStkAct_To ;
      AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres = AV36TFMRStkRes ;
      AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to = AV37TFMRStkRes_To ;
      AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin = AV38TFMRStkMin ;
      AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to = AV39TFMRStkMin_To ;
      AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri = AV40TFMRStkCri ;
      AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to = AV41TFMRStkCri_To ;
      AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = AV32TFMRCodPrv ;
      AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel = AV33TFMRCodPrv_Sel ;
      AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel = AV49TFMRActivo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMRNom, AV29TFMRNom_Sel, AV26TFMRCod, AV27TFMRCod_To, AV30TFMRCodExt, AV31TFMRCodExt_Sel, AV42TFMRStkPre, AV43TFMRStkPre_To, AV34TFMRStkAct, AV35TFMRStkAct_To, AV36TFMRStkRes, AV37TFMRStkRes_To, AV38TFMRStkMin, AV39TFMRStkMin_To, AV40TFMRStkCri, AV41TFMRStkCri_To, AV32TFMRCodPrv, AV33TFMRCodPrv_Sel, AV49TFMRActivo_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV110Mrcod3) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = AV15FilterFullText ;
      AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = AV28TFMRNom ;
      AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel = AV29TFMRNom_Sel ;
      AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod = AV26TFMRCod ;
      AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to = AV27TFMRCod_To ;
      AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = AV30TFMRCodExt ;
      AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel = AV31TFMRCodExt_Sel ;
      AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre = AV42TFMRStkPre ;
      AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to = AV43TFMRStkPre_To ;
      AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact = AV34TFMRStkAct ;
      AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to = AV35TFMRStkAct_To ;
      AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres = AV36TFMRStkRes ;
      AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to = AV37TFMRStkRes_To ;
      AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin = AV38TFMRStkMin ;
      AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to = AV39TFMRStkMin_To ;
      AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri = AV40TFMRStkCri ;
      AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to = AV41TFMRStkCri_To ;
      AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = AV32TFMRCodPrv ;
      AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel = AV33TFMRCodPrv_Sel ;
      AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel = AV49TFMRActivo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMRNom, AV29TFMRNom_Sel, AV26TFMRCod, AV27TFMRCod_To, AV30TFMRCodExt, AV31TFMRCodExt_Sel, AV42TFMRStkPre, AV43TFMRStkPre_To, AV34TFMRStkAct, AV35TFMRStkAct_To, AV36TFMRStkRes, AV37TFMRStkRes_To, AV38TFMRStkMin, AV39TFMRStkMin_To, AV40TFMRStkCri, AV41TFMRStkCri_To, AV32TFMRCodPrv, AV33TFMRCodPrv_Sel, AV49TFMRActivo_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV110Mrcod3) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = AV15FilterFullText ;
      AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = AV28TFMRNom ;
      AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel = AV29TFMRNom_Sel ;
      AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod = AV26TFMRCod ;
      AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to = AV27TFMRCod_To ;
      AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = AV30TFMRCodExt ;
      AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel = AV31TFMRCodExt_Sel ;
      AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre = AV42TFMRStkPre ;
      AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to = AV43TFMRStkPre_To ;
      AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact = AV34TFMRStkAct ;
      AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to = AV35TFMRStkAct_To ;
      AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres = AV36TFMRStkRes ;
      AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to = AV37TFMRStkRes_To ;
      AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin = AV38TFMRStkMin ;
      AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to = AV39TFMRStkMin_To ;
      AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri = AV40TFMRStkCri ;
      AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to = AV41TFMRStkCri_To ;
      AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = AV32TFMRCodPrv ;
      AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel = AV33TFMRCodPrv_Sel ;
      AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel = AV49TFMRActivo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMRNom, AV29TFMRNom_Sel, AV26TFMRCod, AV27TFMRCod_To, AV30TFMRCodExt, AV31TFMRCodExt_Sel, AV42TFMRStkPre, AV43TFMRStkPre_To, AV34TFMRStkAct, AV35TFMRStkAct_To, AV36TFMRStkRes, AV37TFMRStkRes_To, AV38TFMRStkMin, AV39TFMRStkMin_To, AV40TFMRStkCri, AV41TFMRStkCri_To, AV32TFMRCodPrv, AV33TFMRCodPrv_Sel, AV49TFMRActivo_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV110Mrcod3) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = AV15FilterFullText ;
      AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = AV28TFMRNom ;
      AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel = AV29TFMRNom_Sel ;
      AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod = AV26TFMRCod ;
      AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to = AV27TFMRCod_To ;
      AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = AV30TFMRCodExt ;
      AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel = AV31TFMRCodExt_Sel ;
      AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre = AV42TFMRStkPre ;
      AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to = AV43TFMRStkPre_To ;
      AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact = AV34TFMRStkAct ;
      AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to = AV35TFMRStkAct_To ;
      AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres = AV36TFMRStkRes ;
      AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to = AV37TFMRStkRes_To ;
      AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin = AV38TFMRStkMin ;
      AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to = AV39TFMRStkMin_To ;
      AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri = AV40TFMRStkCri ;
      AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to = AV41TFMRStkCri_To ;
      AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = AV32TFMRCodPrv ;
      AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel = AV33TFMRCodPrv_Sel ;
      AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel = AV49TFMRActivo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMRNom, AV29TFMRNom_Sel, AV26TFMRCod, AV27TFMRCod_To, AV30TFMRCodExt, AV31TFMRCodExt_Sel, AV42TFMRStkPre, AV43TFMRStkPre_To, AV34TFMRStkAct, AV35TFMRStkAct_To, AV36TFMRStkRes, AV37TFMRStkRes_To, AV38TFMRStkMin, AV39TFMRStkMin_To, AV40TFMRStkCri, AV41TFMRStkCri_To, AV32TFMRCodPrv, AV33TFMRCodPrv_Sel, AV49TFMRActivo_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc, AV110Mrcod3) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV115Pgmname = "MantenimientoMaquina.TMRepueWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Pgmname", AV115Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupI20( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e23I22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_49 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_49"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV112MRNom = httpContext.cgiGet( "vMRNOM") ;
         AV107MRCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMRCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_recalcular_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECALCULAR_Title") ;
         Dvelop_confirmpanel_recalcular_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECALCULAR_Confirmationtext") ;
         Dvelop_confirmpanel_recalcular_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECALCULAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_recalcular_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECALCULAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_recalcular_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECALCULAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_recalcular_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECALCULAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_recalcular_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECALCULAR_Confirmtype") ;
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
         Dvelop_confirmpanel_recalcular_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECALCULAR_Result") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV115Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV115Pgmname", AV115Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_49_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
         if ( nGXsfl_49_idx > 0 )
         {
            AV105DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV105DetailWebComponent);
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV103GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103GridActions), 4, 0));
            A9493MRNom = httpContext.cgiGet( edtMRNom_Internalname) ;
            n9493MRNom = false ;
            A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9494MRCodExt = httpContext.cgiGet( edtMRCodExt_Internalname) ;
            n9494MRCodExt = false ;
            A9499MRStkPre = localUtil.ctond( httpContext.cgiGet( edtMRStkPre_Internalname)) ;
            n9499MRStkPre = false ;
            A9495MRStkAct = localUtil.ctond( httpContext.cgiGet( edtMRStkAct_Internalname)) ;
            n9495MRStkAct = false ;
            A9496MRStkRes = localUtil.ctond( httpContext.cgiGet( edtMRStkRes_Internalname)) ;
            n9496MRStkRes = false ;
            A9497MRStkMin = localUtil.ctond( httpContext.cgiGet( edtMRStkMin_Internalname)) ;
            n9497MRStkMin = false ;
            A9498MRStkCri = localUtil.ctond( httpContext.cgiGet( edtMRStkCri_Internalname)) ;
            n9498MRStkCri = false ;
            A11458MRCodPrv = httpContext.cgiGet( edtMRCodPrv_Internalname) ;
            n11458MRCodPrv = false ;
            A12850MRActivo = ((GXutil.strcmp(httpContext.cgiGet( chkMRActivo.getInternalname()), "S")==0) ? "S" : "N") ;
            n12850MRActivo = false ;
            A9500MRUltMov = (int)(localUtil.ctol( httpContext.cgiGet( edtMRUltMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9500MRUltMov = false ;
            A9501MRUltRes = localUtil.ctol( httpContext.cgiGet( edtMRUltRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n9501MRUltRes = false ;
            A13718MRCNom = httpContext.cgiGet( edtMRCNom_Internalname) ;
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TMRepueWW");
         AV115Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV115Pgmname", AV115Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV115Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("mantenimientomaquina\\tmrepueww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e23I22 ();
      if (returnInSub) return;
   }

   public void e23I22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV56Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmrepueww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV56Station = GXt_char1 ;
      GXv_char2[0] = AV106ObtenerEmprCod ;
      GXv_char3[0] = AV58EmprNom ;
      GXv_char4[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV56Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmrepueww_impl.this.AV106ObtenerEmprCod = GXv_char2[0] ;
      tmrepueww_impl.this.AV58EmprNom = GXv_char3[0] ;
      tmrepueww_impl.this.AV59UsurCod = GXv_char4[0] ;
      AV57EmprCod = AV106ObtenerEmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57EmprCod", AV57EmprCod);
      GXt_char1 = AV60Carpeta ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV57EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char4) ;
      tmrepueww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV60Carpeta = GXt_char1 ;
      AV84FechaFin = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(1)) ;
      AV83FechaInicio = GXutil.addmth( AV84FechaFin, (short)(-1)) ;
      GXt_char1 = AV56Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmrepueww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV56Station = GXt_char1 ;
      GXv_char4[0] = AV57EmprCod ;
      GXv_char3[0] = AV58EmprNom ;
      GXv_char2[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV56Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmrepueww_impl.this.AV57EmprCod = GXv_char4[0] ;
      tmrepueww_impl.this.AV58EmprNom = GXv_char3[0] ;
      tmrepueww_impl.this.AV59UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57EmprCod", AV57EmprCod);
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
      Form.setCaption( httpContext.getMessage( " Respuestos", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e24I22( )
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
      if ( GXutil.strcmp(AV22Session.getValue("MantenimientoMaquina.TMRepueWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("MantenimientoMaquina.TMRepueWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMRNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRNom_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtMRCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtMRCodExt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCodExt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCodExt_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtMRStkPre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkPre_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtMRStkAct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkAct_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtMRStkRes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkRes_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtMRStkMin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkMin_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtMRStkCri_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkCri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkCri_Visible), 5, 0), !bGXsfl_49_Refreshing);
      edtMRCodPrv_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCodPrv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCodPrv_Visible), 5, 0), !bGXsfl_49_Refreshing);
      chkMRActivo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkMRActivo.getInternalname(), "Visible", GXutil.ltrimstr( chkMRActivo.getVisible(), 5, 0), !bGXsfl_49_Refreshing);
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = AV15FilterFullText ;
      AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = AV28TFMRNom ;
      AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel = AV29TFMRNom_Sel ;
      AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod = AV26TFMRCod ;
      AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to = AV27TFMRCod_To ;
      AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = AV30TFMRCodExt ;
      AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel = AV31TFMRCodExt_Sel ;
      AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre = AV42TFMRStkPre ;
      AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to = AV43TFMRStkPre_To ;
      AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact = AV34TFMRStkAct ;
      AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to = AV35TFMRStkAct_To ;
      AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres = AV36TFMRStkRes ;
      AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to = AV37TFMRStkRes_To ;
      AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin = AV38TFMRStkMin ;
      AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to = AV39TFMRStkMin_To ;
      AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri = AV40TFMRStkCri ;
      AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to = AV41TFMRStkCri_To ;
      AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = AV32TFMRCodPrv ;
      AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel = AV33TFMRCodPrv_Sel ;
      AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel = AV49TFMRActivo_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e14I22( )
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
         AV51PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV51PageToGo) ;
      }
   }

   public void e15I22( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e16I22( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRNom") == 0 )
         {
            AV28TFMRNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFMRNom", AV28TFMRNom);
            AV29TFMRNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFMRNom_Sel", AV29TFMRNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRCod") == 0 )
         {
            AV26TFMRCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFMRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFMRCod), 8, 0));
            AV27TFMRCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFMRCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFMRCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRCodExt") == 0 )
         {
            AV30TFMRCodExt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFMRCodExt", AV30TFMRCodExt);
            AV31TFMRCodExt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFMRCodExt_Sel", AV31TFMRCodExt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRStkPre") == 0 )
         {
            AV42TFMRStkPre = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMRStkPre", GXutil.ltrimstr( AV42TFMRStkPre, 12, 3));
            AV43TFMRStkPre_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMRStkPre_To", GXutil.ltrimstr( AV43TFMRStkPre_To, 12, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRStkAct") == 0 )
         {
            AV34TFMRStkAct = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFMRStkAct", GXutil.ltrimstr( AV34TFMRStkAct, 10, 3));
            AV35TFMRStkAct_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFMRStkAct_To", GXutil.ltrimstr( AV35TFMRStkAct_To, 10, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRStkRes") == 0 )
         {
            AV36TFMRStkRes = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFMRStkRes", GXutil.ltrimstr( AV36TFMRStkRes, 10, 3));
            AV37TFMRStkRes_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFMRStkRes_To", GXutil.ltrimstr( AV37TFMRStkRes_To, 10, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRStkMin") == 0 )
         {
            AV38TFMRStkMin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFMRStkMin", GXutil.ltrimstr( AV38TFMRStkMin, 12, 3));
            AV39TFMRStkMin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFMRStkMin_To", GXutil.ltrimstr( AV39TFMRStkMin_To, 12, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRStkCri") == 0 )
         {
            AV40TFMRStkCri = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFMRStkCri", GXutil.ltrimstr( AV40TFMRStkCri, 12, 3));
            AV41TFMRStkCri_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFMRStkCri_To", GXutil.ltrimstr( AV41TFMRStkCri_To, 12, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRCodPrv") == 0 )
         {
            AV32TFMRCodPrv = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFMRCodPrv", AV32TFMRCodPrv);
            AV33TFMRCodPrv_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFMRCodPrv_Sel", AV33TFMRCodPrv_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MRActivo") == 0 )
         {
            AV49TFMRActivo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMRActivo_Sel", AV49TFMRActivo_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e25I22( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV105DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV105DetailWebComponent);
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      if ( 0 > 1 )
      {
         cmbavGridactions.addItem("4", httpContext.getMessage( "Recalcular", ""), (short)(0));
      }
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Compatibles", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(49) ;
      }
      sendrow_492( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_49_Refreshing )
      {
         httpContext.doAjaxLoad(49, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV103GridActions, 4, 0)) );
   }

   public void e17I22( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMRepueWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e13I22( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientoMaquina.TMRepueWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV115Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientoMaquina.TMRepueWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "MantenimientoMaquina.TMRepueWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tmrepueww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV115Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e26I22( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV103GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV103GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV103GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV103GridActions == 4 )
      {
         /* Execute user subroutine: 'DO RECALCULAR' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV103GridActions == 5 )
      {
         /* Execute user subroutine: 'DO USERACTION1' */
         S232 ();
         if (returnInSub) return;
      }
      AV103GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV103GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e18I22( )
   {
      /* Dvelop_confirmpanel_recalcular_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_recalcular_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RECALCULAR' */
         S242 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e19I22( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmrepue", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV57EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","MRCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 0 > 1 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmrepue", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","MRCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e20I22( )
   {
      /* 'DoStockMinimoBajos' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         httpContext.popup(formatLink("app.mantenimientomaquina.web_consultarepuestostockminimo", new String[] {}, new String[] {}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      AV109Mrcod4 = ((AV110Mrcod3==0) ? 99999999 : AV110Mrcod3) ;
      httpContext.popup(formatLink("app.mantenimientomaquina.prpstkmin", new String[] {GXutil.URLEncode(GXutil.rtrim(AV57EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV111MRCod2,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV109Mrcod4,8,0))}, new String[] {"EmprCod","Mrcod1","Mrcod2"}) , new Object[] {"AV57EmprCod","AV111MRCod2","AV109Mrcod4"});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e21I22( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.mantenimientomaquina.tmrepuewwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmrepueww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      tmrepueww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e22I22( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.mantenimientomaquina.tmrepuewwexportcsv", new String[] {}, new String[] {}) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRNom", "", "Nombre Repuesto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRCod", "", "Cód", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRCodExt", "", "Externo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRStkPre", "", "Precio", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRStkAct", "", "Stock Actual", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRStkRes", "", "Stock Reservado", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRStkMin", "", "Stock Mínimo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRStkCri", "", "Stock Crítico", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRCodPrv", "", "Código Proveedor", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MRActivo", "", "Activo S/N", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMRepueWWColumnsSelector", GXv_char4) ;
      tmrepueww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "MantenimientoMaquina.TMRepueWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV28TFMRNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFMRNom", AV28TFMRNom);
      AV29TFMRNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFMRNom_Sel", AV29TFMRNom_Sel);
      AV26TFMRCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFMRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFMRCod), 8, 0));
      AV27TFMRCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFMRCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFMRCod_To), 8, 0));
      AV30TFMRCodExt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFMRCodExt", AV30TFMRCodExt);
      AV31TFMRCodExt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFMRCodExt_Sel", AV31TFMRCodExt_Sel);
      AV42TFMRStkPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFMRStkPre", GXutil.ltrimstr( AV42TFMRStkPre, 12, 3));
      AV43TFMRStkPre_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFMRStkPre_To", GXutil.ltrimstr( AV43TFMRStkPre_To, 12, 3));
      AV34TFMRStkAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFMRStkAct", GXutil.ltrimstr( AV34TFMRStkAct, 10, 3));
      AV35TFMRStkAct_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFMRStkAct_To", GXutil.ltrimstr( AV35TFMRStkAct_To, 10, 3));
      AV36TFMRStkRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFMRStkRes", GXutil.ltrimstr( AV36TFMRStkRes, 10, 3));
      AV37TFMRStkRes_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFMRStkRes_To", GXutil.ltrimstr( AV37TFMRStkRes_To, 10, 3));
      AV38TFMRStkMin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFMRStkMin", GXutil.ltrimstr( AV38TFMRStkMin, 12, 3));
      AV39TFMRStkMin_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFMRStkMin_To", GXutil.ltrimstr( AV39TFMRStkMin_To, 12, 3));
      AV40TFMRStkCri = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFMRStkCri", GXutil.ltrimstr( AV40TFMRStkCri, 12, 3));
      AV41TFMRStkCri_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFMRStkCri_To", GXutil.ltrimstr( AV41TFMRStkCri_To, 12, 3));
      AV32TFMRCodPrv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFMRCodPrv", AV32TFMRCodPrv);
      AV33TFMRCodPrv_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFMRCodPrv_Sel", AV33TFMRCodPrv_Sel);
      AV49TFMRActivo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFMRActivo_Sel", AV49TFMRActivo_Sel);
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
         callWebObject(formatLink("app.mantenimientomaquina.tmrepueview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9492MRCod,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","MRCod","TabCode"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      callWebObject(formatLink("app.mantenimientomaquina.tmrepue", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9492MRCod,8,0))}, new String[] {"Mode","EmprCod","MRCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmrepue", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9492MRCod,8,0))}, new String[] {"Mode","EmprCod","MRCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmrepue", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9492MRCod,8,0))}, new String[] {"Mode","EmprCod","MRCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO RECALCULAR' Routine */
      returnInSub = false ;
      AV78EmprCod_Selected = A396EmprCod ;
      AV79MRCod_Selected = A9492MRCod ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_RECALCULARContainer", "Confirm", "", new Object[] {});
   }

   public void S242( )
   {
      /* 'DO ACTION RECALCULAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A9492MRCod ;
      GXv_char3[0] = A9493MRNom ;
      new app.mantenimientomaquina.pfrmame(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3) ;
      tmrepueww_impl.this.A396EmprCod = GXv_char4[0] ;
      tmrepueww_impl.this.A9492MRCod = GXv_int12[0] ;
      tmrepueww_impl.this.A9493MRNom = GXv_char3[0] ;
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO USERACTION1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.mantenimientomaquina.tmrcom", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9492MRCod,8,0))}, new String[] {"Mode","EmprCod","MRPriCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV115Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV115Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV115Pgmname+"GridState"), null, null);
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
      AV136GXV1 = 1 ;
      while ( AV136GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV136GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM") == 0 )
         {
            AV28TFMRNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFMRNom", AV28TFMRNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM_SEL") == 0 )
         {
            AV29TFMRNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFMRNom_Sel", AV29TFMRNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOD") == 0 )
         {
            AV26TFMRCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFMRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFMRCod), 8, 0));
            AV27TFMRCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFMRCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFMRCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODEXT") == 0 )
         {
            AV30TFMRCodExt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFMRCodExt", AV30TFMRCodExt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODEXT_SEL") == 0 )
         {
            AV31TFMRCodExt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFMRCodExt_Sel", AV31TFMRCodExt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKPRE") == 0 )
         {
            AV42TFMRStkPre = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMRStkPre", GXutil.ltrimstr( AV42TFMRStkPre, 12, 3));
            AV43TFMRStkPre_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMRStkPre_To", GXutil.ltrimstr( AV43TFMRStkPre_To, 12, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKACT") == 0 )
         {
            AV34TFMRStkAct = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFMRStkAct", GXutil.ltrimstr( AV34TFMRStkAct, 10, 3));
            AV35TFMRStkAct_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFMRStkAct_To", GXutil.ltrimstr( AV35TFMRStkAct_To, 10, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKRES") == 0 )
         {
            AV36TFMRStkRes = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFMRStkRes", GXutil.ltrimstr( AV36TFMRStkRes, 10, 3));
            AV37TFMRStkRes_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFMRStkRes_To", GXutil.ltrimstr( AV37TFMRStkRes_To, 10, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKMIN") == 0 )
         {
            AV38TFMRStkMin = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFMRStkMin", GXutil.ltrimstr( AV38TFMRStkMin, 12, 3));
            AV39TFMRStkMin_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFMRStkMin_To", GXutil.ltrimstr( AV39TFMRStkMin_To, 12, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKCRI") == 0 )
         {
            AV40TFMRStkCri = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFMRStkCri", GXutil.ltrimstr( AV40TFMRStkCri, 12, 3));
            AV41TFMRStkCri_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFMRStkCri_To", GXutil.ltrimstr( AV41TFMRStkCri_To, 12, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODPRV") == 0 )
         {
            AV32TFMRCodPrv = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFMRCodPrv", AV32TFMRCodPrv);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODPRV_SEL") == 0 )
         {
            AV33TFMRCodPrv_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFMRCodPrv_Sel", AV33TFMRCodPrv_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRACTIVO_SEL") == 0 )
         {
            AV49TFMRActivo_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMRActivo_Sel", AV49TFMRActivo_Sel);
         }
         AV136GXV1 = (int)(AV136GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFMRNom_Sel)==0), AV29TFMRNom_Sel, GXv_char4) ;
      tmrepueww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFMRCodExt_Sel)==0), AV31TFMRCodExt_Sel, GXv_char3) ;
      tmrepueww_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFMRCodPrv_Sel)==0), AV33TFMRCodPrv_Sel, GXv_char2) ;
      tmrepueww_impl.this.GXt_char14 = GXv_char2[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFMRActivo_Sel)==0), AV49TFMRActivo_Sel, GXv_char16) ;
      tmrepueww_impl.this.GXt_char15 = GXv_char16[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char13+"||||||"+GXt_char14+"|"+GXt_char15 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFMRNom)==0), AV28TFMRNom, GXv_char16) ;
      tmrepueww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFMRCodExt)==0), AV30TFMRCodExt, GXv_char4) ;
      tmrepueww_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFMRCodPrv)==0), AV32TFMRCodPrv, GXv_char3) ;
      tmrepueww_impl.this.GXt_char13 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char15+"|"+((0==AV26TFMRCod) ? "" : GXutil.str( AV26TFMRCod, 8, 0))+"|"+GXt_char14+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMRStkPre)==0) ? "" : GXutil.str( AV42TFMRStkPre, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFMRStkAct)==0) ? "" : GXutil.str( AV34TFMRStkAct, 10, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFMRStkRes)==0) ? "" : GXutil.str( AV36TFMRStkRes, 10, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFMRStkMin)==0) ? "" : GXutil.str( AV38TFMRStkMin, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFMRStkCri)==0) ? "" : GXutil.str( AV40TFMRStkCri, 12, 3))+"|"+GXt_char13+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV27TFMRCod_To) ? "" : GXutil.str( AV27TFMRCod_To, 8, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMRStkPre_To)==0) ? "" : GXutil.str( AV43TFMRStkPre_To, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFMRStkAct_To)==0) ? "" : GXutil.str( AV35TFMRStkAct_To, 10, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFMRStkRes_To)==0) ? "" : GXutil.str( AV37TFMRStkRes_To, 10, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFMRStkMin_To)==0) ? "" : GXutil.str( AV39TFMRStkMin_To, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFMRStkCri_To)==0) ? "" : GXutil.str( AV41TFMRStkCri_To, 12, 3))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV115Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFMRNOM", "", !(GXutil.strcmp("", AV28TFMRNom)==0), (short)(0), AV28TFMRNom, "", !(GXutil.strcmp("", AV29TFMRNom_Sel)==0), AV29TFMRNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFMRCOD", "", !((0==AV26TFMRCod)&&(0==AV27TFMRCod_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFMRCod, 8, 0)), GXutil.trim( GXutil.str( AV27TFMRCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFMRCODEXT", "", !(GXutil.strcmp("", AV30TFMRCodExt)==0), (short)(0), AV30TFMRCodExt, "", !(GXutil.strcmp("", AV31TFMRCodExt_Sel)==0), AV31TFMRCodExt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFMRSTKPRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMRStkPre)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMRStkPre_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFMRStkPre, 12, 3)), GXutil.trim( GXutil.str( AV43TFMRStkPre_To, 12, 3))) ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFMRSTKACT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFMRStkAct)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFMRStkAct_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV34TFMRStkAct, 10, 3)), GXutil.trim( GXutil.str( AV35TFMRStkAct_To, 10, 3))) ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFMRSTKRES", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFMRStkRes)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFMRStkRes_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV36TFMRStkRes, 10, 3)), GXutil.trim( GXutil.str( AV37TFMRStkRes_To, 10, 3))) ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFMRSTKMIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFMRStkMin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFMRStkMin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFMRStkMin, 12, 3)), GXutil.trim( GXutil.str( AV39TFMRStkMin_To, 12, 3))) ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFMRSTKCRI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFMRStkCri)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFMRStkCri_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFMRStkCri, 12, 3)), GXutil.trim( GXutil.str( AV41TFMRStkCri_To, 12, 3))) ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFMRCODPRV", "", !(GXutil.strcmp("", AV32TFMRCodPrv)==0), (short)(0), AV32TFMRCodPrv, "", !(GXutil.strcmp("", AV33TFMRCodPrv_Sel)==0), AV33TFMRCodPrv_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFMRACTIVO_SEL", "", !(GXutil.strcmp("", AV49TFMRActivo_Sel)==0), (short)(0), AV49TFMRActivo_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV115Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV115Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MantenimientoMaquina.TMRepue" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_85_I22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_recalcular_Internalname, tblTabledvelop_confirmpanel_recalcular_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_recalcular.setProperty("Title", Dvelop_confirmpanel_recalcular_Title);
         ucDvelop_confirmpanel_recalcular.setProperty("ConfirmationText", Dvelop_confirmpanel_recalcular_Confirmationtext);
         ucDvelop_confirmpanel_recalcular.setProperty("YesButtonCaption", Dvelop_confirmpanel_recalcular_Yesbuttoncaption);
         ucDvelop_confirmpanel_recalcular.setProperty("NoButtonCaption", Dvelop_confirmpanel_recalcular_Nobuttoncaption);
         ucDvelop_confirmpanel_recalcular.setProperty("CancelButtonCaption", Dvelop_confirmpanel_recalcular_Cancelbuttoncaption);
         ucDvelop_confirmpanel_recalcular.setProperty("YesButtonPosition", Dvelop_confirmpanel_recalcular_Yesbuttonposition);
         ucDvelop_confirmpanel_recalcular.setProperty("ConfirmType", Dvelop_confirmpanel_recalcular_Confirmtype);
         ucDvelop_confirmpanel_recalcular.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_recalcular_Internalname, "DVELOP_CONFIRMPANEL_RECALCULARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_RECALCULARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_85_I22e( true) ;
      }
      else
      {
         wb_table2_85_I22e( false) ;
      }
   }

   public void wb_table1_31_I22( boolean wbgen )
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
         wb_table3_36_I22( true) ;
      }
      else
      {
         wb_table3_36_I22( false) ;
      }
      return  ;
   }

   public void wb_table3_36_I22e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_31_I22e( true) ;
      }
      else
      {
         wb_table1_31_I22e( false) ;
      }
   }

   public void wb_table3_36_I22( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_MantenimientoMaquina\\TMRepueWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_36_I22e( true) ;
      }
      else
      {
         wb_table3_36_I22e( false) ;
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
      paI22( ) ;
      wsI22( ) ;
      weI22( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116121070", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmrepueww.js", "?202682116121071", false, true);
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

   public void subsflControlProps_492( )
   {
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_49_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_49_idx );
      edtMRNom_Internalname = "MRNOM_"+sGXsfl_49_idx ;
      edtMRCod_Internalname = "MRCOD_"+sGXsfl_49_idx ;
      edtMRCodExt_Internalname = "MRCODEXT_"+sGXsfl_49_idx ;
      edtMRStkPre_Internalname = "MRSTKPRE_"+sGXsfl_49_idx ;
      edtMRStkAct_Internalname = "MRSTKACT_"+sGXsfl_49_idx ;
      edtMRStkRes_Internalname = "MRSTKRES_"+sGXsfl_49_idx ;
      edtMRStkMin_Internalname = "MRSTKMIN_"+sGXsfl_49_idx ;
      edtMRStkCri_Internalname = "MRSTKCRI_"+sGXsfl_49_idx ;
      edtMRCodPrv_Internalname = "MRCODPRV_"+sGXsfl_49_idx ;
      chkMRActivo.setInternalname( "MRACTIVO_"+sGXsfl_49_idx );
      edtMRUltMov_Internalname = "MRULTMOV_"+sGXsfl_49_idx ;
      edtMRUltRes_Internalname = "MRULTRES_"+sGXsfl_49_idx ;
      edtMRCNom_Internalname = "MRCNOM_"+sGXsfl_49_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_49_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_49_idx ;
   }

   public void subsflControlProps_fel_492( )
   {
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_49_fel_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_49_fel_idx );
      edtMRNom_Internalname = "MRNOM_"+sGXsfl_49_fel_idx ;
      edtMRCod_Internalname = "MRCOD_"+sGXsfl_49_fel_idx ;
      edtMRCodExt_Internalname = "MRCODEXT_"+sGXsfl_49_fel_idx ;
      edtMRStkPre_Internalname = "MRSTKPRE_"+sGXsfl_49_fel_idx ;
      edtMRStkAct_Internalname = "MRSTKACT_"+sGXsfl_49_fel_idx ;
      edtMRStkRes_Internalname = "MRSTKRES_"+sGXsfl_49_fel_idx ;
      edtMRStkMin_Internalname = "MRSTKMIN_"+sGXsfl_49_fel_idx ;
      edtMRStkCri_Internalname = "MRSTKCRI_"+sGXsfl_49_fel_idx ;
      edtMRCodPrv_Internalname = "MRCODPRV_"+sGXsfl_49_fel_idx ;
      chkMRActivo.setInternalname( "MRACTIVO_"+sGXsfl_49_fel_idx );
      edtMRUltMov_Internalname = "MRULTMOV_"+sGXsfl_49_fel_idx ;
      edtMRUltRes_Internalname = "MRULTRES_"+sGXsfl_49_fel_idx ;
      edtMRCNom_Internalname = "MRCNOM_"+sGXsfl_49_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_49_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_49_fel_idx ;
   }

   public void sendrow_492( )
   {
      subsflControlProps_492( ) ;
      wbI20( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_49_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_49_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_49_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV105DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,50);\"" : " "),"'"+""+"'"+",false,"+"'"+"e27i22_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_49_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV103GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV103GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV103GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_49_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,51);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV103GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_49_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRNom_Internalname,GXutil.rtrim( A9493MRNom),"","","'"+""+"'"+",false,"+"'"+"e28i22_client"+"'","","","","",edtMRNom_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMRNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMRCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRCodExt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRCodExt_Internalname,GXutil.rtrim( A9494MRCodExt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRCodExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMRCodExt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRStkPre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRStkPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9499MRStkPre, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRStkPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMRStkPre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRStkAct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRStkAct_Internalname,GXutil.ltrim( localUtil.ntoc( A9495MRStkAct, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9495MRStkAct, "Z,ZZZ,ZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRStkAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMRStkAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRStkRes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRStkRes_Internalname,GXutil.ltrim( localUtil.ntoc( A9496MRStkRes, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9496MRStkRes, "Z,ZZZ,ZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRStkRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMRStkRes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRStkMin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRStkMin_Internalname,GXutil.ltrim( localUtil.ntoc( A9497MRStkMin, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9497MRStkMin, "Z,ZZZ,ZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRStkMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMRStkMin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMRStkCri_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRStkCri_Internalname,GXutil.ltrim( localUtil.ntoc( A9498MRStkCri, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9498MRStkCri, "Z,ZZZ,ZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRStkCri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMRStkCri_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMRCodPrv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRCodPrv_Internalname,GXutil.rtrim( A11458MRCodPrv),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRCodPrv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMRCodPrv_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkMRActivo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "MRACTIVO_" + sGXsfl_49_idx ;
         chkMRActivo.setName( GXCCtl );
         chkMRActivo.setWebtags( "" );
         chkMRActivo.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkMRActivo.getInternalname(), "TitleCaption", chkMRActivo.getCaption(), !bGXsfl_49_Refreshing);
         chkMRActivo.setCheckedValue( "N" );
         A12850MRActivo = ((GXutil.strcmp(GXutil.rtrim( A12850MRActivo), "S")==0) ? "S" : "N") ;
         n12850MRActivo = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkMRActivo.getInternalname(),A12850MRActivo,"","",Integer.valueOf(chkMRActivo.getVisible()),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRUltMov_Internalname,GXutil.ltrim( localUtil.ntoc( A9500MRUltMov, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9500MRUltMov), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRUltMov_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRUltRes_Internalname,GXutil.ltrim( localUtil.ntoc( A9501MRUltRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9501MRUltRes), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRUltRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRCNom_Internalname,A13718MRCNom,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRCNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesI22( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_49_idx = ((subGrid_Islastpage==1)&&(nGXsfl_49_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_49_idx+1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
      }
      /* End function sendrow_492 */
   }

   public void startgridcontrol49( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"49\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Repuesto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRCodExt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Externo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRStkPre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRStkAct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRStkRes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Reservado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRStkMin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Mínimo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRStkCri_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Crítico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMRCodPrv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkMRActivo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Activo S/N", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV105DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV103GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9493MRNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9494MRCodExt));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRCodExt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRStkPre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9495MRStkAct, (byte)(14), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRStkAct_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9496MRStkRes, (byte)(14), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRStkRes_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9497MRStkMin, (byte)(14), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRStkMin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9498MRStkCri, (byte)(14), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRStkCri_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11458MRCodPrv));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMRCodPrv_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12850MRActivo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkMRActivo.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9500MRUltMov, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9501MRUltRes, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13718MRCNom);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
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
      bttBtnstockminimobajos_Internalname = "BTNSTOCKMINIMOBAJOS" ;
      bttBtnimprimir_Internalname = "BTNIMPRIMIR" ;
      bttBtnimprimirdetallado_Internalname = "BTNIMPRIMIRDETALLADO" ;
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
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtMRNom_Internalname = "MRNOM" ;
      edtMRCod_Internalname = "MRCOD" ;
      edtMRCodExt_Internalname = "MRCODEXT" ;
      edtMRStkPre_Internalname = "MRSTKPRE" ;
      edtMRStkAct_Internalname = "MRSTKACT" ;
      edtMRStkRes_Internalname = "MRSTKRES" ;
      edtMRStkMin_Internalname = "MRSTKMIN" ;
      edtMRStkCri_Internalname = "MRSTKCRI" ;
      edtMRCodPrv_Internalname = "MRCODPRV" ;
      chkMRActivo.setInternalname( "MRACTIVO" );
      edtMRUltMov_Internalname = "MRULTMOV" ;
      edtMRUltRes_Internalname = "MRULTRES" ;
      edtMRCNom_Internalname = "MRCNOM" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_recalcular_Internalname = "DVELOP_CONFIRMPANEL_RECALCULAR" ;
      tblTabledvelop_confirmpanel_recalcular_Internalname = "TABLEDVELOP_CONFIRMPANEL_RECALCULAR" ;
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
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtMRCNom_Jsonclick = "" ;
      edtMRUltRes_Jsonclick = "" ;
      edtMRUltMov_Jsonclick = "" ;
      chkMRActivo.setCaption( "" );
      edtMRCodPrv_Jsonclick = "" ;
      edtMRStkCri_Jsonclick = "" ;
      edtMRStkMin_Jsonclick = "" ;
      edtMRStkRes_Jsonclick = "" ;
      edtMRStkAct_Jsonclick = "" ;
      edtMRStkPre_Jsonclick = "" ;
      edtMRCodExt_Jsonclick = "" ;
      edtMRCod_Jsonclick = "" ;
      edtMRNom_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkMRActivo.setVisible( -1 );
      edtMRCodPrv_Visible = -1 ;
      edtMRStkCri_Visible = -1 ;
      edtMRStkMin_Visible = -1 ;
      edtMRStkRes_Visible = -1 ;
      edtMRStkAct_Visible = -1 ;
      edtMRStkPre_Visible = -1 ;
      edtMRCodExt_Visible = -1 ;
      edtMRCod_Visible = -1 ;
      edtMRNom_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Fixedcolumns = ";L;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_recalcular_Confirmtype = "1" ;
      Dvelop_confirmpanel_recalcular_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_recalcular_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_recalcular_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_recalcular_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_recalcular_Confirmationtext = "Podría perderse algún dato, confirma recalculo?" ;
      Dvelop_confirmpanel_recalcular_Title = httpContext.getMessage( "Recalcular", "") ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "MantenimientoMaquina.TMRepueWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||S:WWP_TSChecked,N:WWP_TSUnChecked" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic||||||Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "T||T||||||T|T" ;
      Ddo_grid_Filterisrange = "|T||T|T|T|T|T||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "2:MRNom|3:MRCod|4:MRCodExt|5:MRStkPre|6:MRStkAct|7:MRStkRes|8:MRStkMin|9:MRStkCri|10:MRCodPrv|11:MRActivo" ;
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
      Form.setCaption( httpContext.getMessage( " Respuestos", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_49_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV103GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV103GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103GridActions), 4, 0));
      }
      GXCCtl = "MRACTIVO_" + sGXsfl_49_idx ;
      chkMRActivo.setName( GXCCtl );
      chkMRActivo.setWebtags( "" );
      chkMRActivo.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMRActivo.getInternalname(), "TitleCaption", chkMRActivo.getCaption(), !bGXsfl_49_Refreshing);
      chkMRActivo.setCheckedValue( "N" );
      A12850MRActivo = ((GXutil.strcmp(GXutil.rtrim( A12850MRActivo), "S")==0) ? "S" : "N") ;
      n12850MRActivo = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMRNom_Visible',ctrl:'MRNOM',prop:'Visible'},{av:'edtMRCod_Visible',ctrl:'MRCOD',prop:'Visible'},{av:'edtMRCodExt_Visible',ctrl:'MRCODEXT',prop:'Visible'},{av:'edtMRStkPre_Visible',ctrl:'MRSTKPRE',prop:'Visible'},{av:'edtMRStkAct_Visible',ctrl:'MRSTKACT',prop:'Visible'},{av:'edtMRStkRes_Visible',ctrl:'MRSTKRES',prop:'Visible'},{av:'edtMRStkMin_Visible',ctrl:'MRSTKMIN',prop:'Visible'},{av:'edtMRStkCri_Visible',ctrl:'MRSTKCRI',prop:'Visible'},{av:'edtMRCodPrv_Visible',ctrl:'MRCODPRV',prop:'Visible'},{av:'chkMRActivo.getVisible()',ctrl:'MRACTIVO',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e14I22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e15I22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e16I22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e25I22',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV105DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'cmbavGridactions'},{av:'AV103GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e17I22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMRNom_Visible',ctrl:'MRNOM',prop:'Visible'},{av:'edtMRCod_Visible',ctrl:'MRCOD',prop:'Visible'},{av:'edtMRCodExt_Visible',ctrl:'MRCODEXT',prop:'Visible'},{av:'edtMRStkPre_Visible',ctrl:'MRSTKPRE',prop:'Visible'},{av:'edtMRStkAct_Visible',ctrl:'MRSTKACT',prop:'Visible'},{av:'edtMRStkRes_Visible',ctrl:'MRSTKRES',prop:'Visible'},{av:'edtMRStkMin_Visible',ctrl:'MRSTKMIN',prop:'Visible'},{av:'edtMRStkCri_Visible',ctrl:'MRSTKCRI',prop:'Visible'},{av:'edtMRCodPrv_Visible',ctrl:'MRCODPRV',prop:'Visible'},{av:'chkMRActivo.getVisible()',ctrl:'MRACTIVO',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e13I22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMRNom_Visible',ctrl:'MRNOM',prop:'Visible'},{av:'edtMRCod_Visible',ctrl:'MRCOD',prop:'Visible'},{av:'edtMRCodExt_Visible',ctrl:'MRCODEXT',prop:'Visible'},{av:'edtMRStkPre_Visible',ctrl:'MRSTKPRE',prop:'Visible'},{av:'edtMRStkAct_Visible',ctrl:'MRSTKACT',prop:'Visible'},{av:'edtMRStkRes_Visible',ctrl:'MRSTKRES',prop:'Visible'},{av:'edtMRStkMin_Visible',ctrl:'MRSTKMIN',prop:'Visible'},{av:'edtMRStkCri_Visible',ctrl:'MRSTKCRI',prop:'Visible'},{av:'edtMRCodPrv_Visible',ctrl:'MRCODPRV',prop:'Visible'},{av:'chkMRActivo.getVisible()',ctrl:'MRACTIVO',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e26I22',iparms:[{av:'cmbavGridactions'},{av:'AV103GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV103GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMRNom_Visible',ctrl:'MRNOM',prop:'Visible'},{av:'edtMRCod_Visible',ctrl:'MRCOD',prop:'Visible'},{av:'edtMRCodExt_Visible',ctrl:'MRCODEXT',prop:'Visible'},{av:'edtMRStkPre_Visible',ctrl:'MRSTKPRE',prop:'Visible'},{av:'edtMRStkAct_Visible',ctrl:'MRSTKACT',prop:'Visible'},{av:'edtMRStkRes_Visible',ctrl:'MRSTKRES',prop:'Visible'},{av:'edtMRStkMin_Visible',ctrl:'MRSTKMIN',prop:'Visible'},{av:'edtMRStkCri_Visible',ctrl:'MRSTKCRI',prop:'Visible'},{av:'edtMRCodPrv_Visible',ctrl:'MRCODPRV',prop:'Visible'},{av:'chkMRActivo.getVisible()',ctrl:'MRACTIVO',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_RECALCULAR.CLOSE","{handler:'e18I22',iparms:[{av:'Dvelop_confirmpanel_recalcular_Result',ctrl:'DVELOP_CONFIRMPANEL_RECALCULAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A9493MRNom',fld:'MRNOM',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_RECALCULAR.CLOSE",",oparms:[{av:'A9493MRNom',fld:'MRNOM',pic:''},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMRNom_Visible',ctrl:'MRNOM',prop:'Visible'},{av:'edtMRCod_Visible',ctrl:'MRCOD',prop:'Visible'},{av:'edtMRCodExt_Visible',ctrl:'MRCODEXT',prop:'Visible'},{av:'edtMRStkPre_Visible',ctrl:'MRSTKPRE',prop:'Visible'},{av:'edtMRStkAct_Visible',ctrl:'MRSTKACT',prop:'Visible'},{av:'edtMRStkRes_Visible',ctrl:'MRSTKRES',prop:'Visible'},{av:'edtMRStkMin_Visible',ctrl:'MRSTKMIN',prop:'Visible'},{av:'edtMRStkCri_Visible',ctrl:'MRSTKCRI',prop:'Visible'},{av:'edtMRCodPrv_Visible',ctrl:'MRCODPRV',prop:'Visible'},{av:'chkMRActivo.getVisible()',ctrl:'MRACTIVO',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e19I22',iparms:[{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOSTOCKMINIMOBAJOS'","{handler:'e20I22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV111MRCod2',fld:'vMRCOD2',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOSTOCKMINIMOBAJOS'",",oparms:[{av:'AV111MRCod2',fld:'vMRCOD2',pic:'ZZZZZZZ9'},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMRNom_Visible',ctrl:'MRNOM',prop:'Visible'},{av:'edtMRCod_Visible',ctrl:'MRCOD',prop:'Visible'},{av:'edtMRCodExt_Visible',ctrl:'MRCODEXT',prop:'Visible'},{av:'edtMRStkPre_Visible',ctrl:'MRSTKPRE',prop:'Visible'},{av:'edtMRStkAct_Visible',ctrl:'MRSTKACT',prop:'Visible'},{av:'edtMRStkRes_Visible',ctrl:'MRSTKRES',prop:'Visible'},{av:'edtMRStkMin_Visible',ctrl:'MRSTKMIN',prop:'Visible'},{av:'edtMRStkCri_Visible',ctrl:'MRSTKCRI',prop:'Visible'},{av:'edtMRCodPrv_Visible',ctrl:'MRCODPRV',prop:'Visible'},{av:'chkMRActivo.getVisible()',ctrl:'MRACTIVO',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOIMPRIMIR'","{handler:'e11I21',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV107MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'AV112MRNom',fld:'vMRNOM',pic:''}]");
      setEventMetadata("'DOIMPRIMIR'",",oparms:[{av:'AV112MRNom',fld:'vMRNOM',pic:''},{av:'AV107MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOIMPRIMIRDETALLADO'","{handler:'e12I21',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV107MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'AV112MRNom',fld:'vMRNOM',pic:''}]");
      setEventMetadata("'DOIMPRIMIRDETALLADO'",",oparms:[{av:'AV112MRNom',fld:'vMRNOM',pic:''},{av:'AV107MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e21I22',iparms:[{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e22I22',iparms:[{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMRNom',fld:'vTFMRNOM',pic:''},{av:'AV29TFMRNom_Sel',fld:'vTFMRNOM_SEL',pic:''},{av:'AV26TFMRCod',fld:'vTFMRCOD',pic:'ZZZZZZZ9'},{av:'AV27TFMRCod_To',fld:'vTFMRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFMRCodExt',fld:'vTFMRCODEXT',pic:''},{av:'AV31TFMRCodExt_Sel',fld:'vTFMRCODEXT_SEL',pic:''},{av:'AV42TFMRStkPre',fld:'vTFMRSTKPRE',pic:'ZZZZZZ9.999'},{av:'AV43TFMRStkPre_To',fld:'vTFMRSTKPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFMRStkAct',fld:'vTFMRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV35TFMRStkAct_To',fld:'vTFMRSTKACT_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV36TFMRStkRes',fld:'vTFMRSTKRES',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV37TFMRStkRes_To',fld:'vTFMRSTKRES_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV38TFMRStkMin',fld:'vTFMRSTKMIN',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV39TFMRStkMin_To',fld:'vTFMRSTKMIN_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV40TFMRStkCri',fld:'vTFMRSTKCRI',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV41TFMRStkCri_To',fld:'vTFMRSTKCRI_TO',pic:'Z,ZZZ,ZZZ9.999'},{av:'AV32TFMRCodPrv',fld:'vTFMRCODPRV',pic:''},{av:'AV33TFMRCodPrv_Sel',fld:'vTFMRCODPRV_SEL',pic:''},{av:'AV49TFMRActivo_Sel',fld:'vTFMRACTIVO_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV110Mrcod3',fld:'vMRCOD3',pic:'ZZZZZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e27I22',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A9493MRNom',fld:'MRNOM',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("MRNOM.CLICK","{handler:'e28I22',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("MRNOM.CLICK",",oparms:[]}");
      setEventMetadata("VALID_MRNOM","{handler:'valid_Mrnom',iparms:[]");
      setEventMetadata("VALID_MRNOM",",oparms:[]}");
      setEventMetadata("VALID_MRCOD","{handler:'valid_Mrcod',iparms:[]");
      setEventMetadata("VALID_MRCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Emprnom',iparms:[]");
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
      Dvelop_confirmpanel_recalcular_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFMRNom = "" ;
      AV29TFMRNom_Sel = "" ;
      AV30TFMRCodExt = "" ;
      AV31TFMRCodExt_Sel = "" ;
      AV42TFMRStkPre = DecimalUtil.ZERO ;
      AV43TFMRStkPre_To = DecimalUtil.ZERO ;
      AV34TFMRStkAct = DecimalUtil.ZERO ;
      AV35TFMRStkAct_To = DecimalUtil.ZERO ;
      AV36TFMRStkRes = DecimalUtil.ZERO ;
      AV37TFMRStkRes_To = DecimalUtil.ZERO ;
      AV38TFMRStkMin = DecimalUtil.ZERO ;
      AV39TFMRStkMin_To = DecimalUtil.ZERO ;
      AV40TFMRStkCri = DecimalUtil.ZERO ;
      AV41TFMRStkCri_To = DecimalUtil.ZERO ;
      AV32TFMRCodPrv = "" ;
      AV33TFMRCodPrv_Sel = "" ;
      AV49TFMRActivo_Sel = "" ;
      AV115Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV57EmprCod = "" ;
      AV112MRNom = "" ;
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
      bttBtnstockminimobajos_Jsonclick = "" ;
      bttBtnimprimir_Jsonclick = "" ;
      bttBtnimprimirdetallado_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV105DetailWebComponent = "" ;
      A9493MRNom = "" ;
      A9494MRCodExt = "" ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      A9496MRStkRes = DecimalUtil.ZERO ;
      A9497MRStkMin = DecimalUtil.ZERO ;
      A9498MRStkCri = DecimalUtil.ZERO ;
      A11458MRCodPrv = "" ;
      A12850MRActivo = "" ;
      A13718MRCNom = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      scmdbuf = "" ;
      lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = "" ;
      lV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = "" ;
      lV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = "" ;
      lV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = "" ;
      AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext = "" ;
      AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel = "" ;
      AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom = "" ;
      AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel = "" ;
      AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext = "" ;
      AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre = DecimalUtil.ZERO ;
      AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to = DecimalUtil.ZERO ;
      AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact = DecimalUtil.ZERO ;
      AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to = DecimalUtil.ZERO ;
      AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres = DecimalUtil.ZERO ;
      AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to = DecimalUtil.ZERO ;
      AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin = DecimalUtil.ZERO ;
      AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to = DecimalUtil.ZERO ;
      AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri = DecimalUtil.ZERO ;
      AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to = DecimalUtil.ZERO ;
      AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel = "" ;
      AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv = "" ;
      AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel = "" ;
      H00I22_A407EmprNom = new String[] {""} ;
      H00I22_n407EmprNom = new boolean[] {false} ;
      H00I22_A396EmprCod = new String[] {""} ;
      H00I22_A9501MRUltRes = new long[1] ;
      H00I22_n9501MRUltRes = new boolean[] {false} ;
      H00I22_A9500MRUltMov = new int[1] ;
      H00I22_n9500MRUltMov = new boolean[] {false} ;
      H00I22_A12850MRActivo = new String[] {""} ;
      H00I22_n12850MRActivo = new boolean[] {false} ;
      H00I22_A11458MRCodPrv = new String[] {""} ;
      H00I22_n11458MRCodPrv = new boolean[] {false} ;
      H00I22_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00I22_n9498MRStkCri = new boolean[] {false} ;
      H00I22_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00I22_n9497MRStkMin = new boolean[] {false} ;
      H00I22_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00I22_n9496MRStkRes = new boolean[] {false} ;
      H00I22_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00I22_n9495MRStkAct = new boolean[] {false} ;
      H00I22_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00I22_n9499MRStkPre = new boolean[] {false} ;
      H00I22_A9494MRCodExt = new String[] {""} ;
      H00I22_n9494MRCodExt = new boolean[] {false} ;
      H00I22_A9493MRNom = new String[] {""} ;
      H00I22_n9493MRNom = new boolean[] {false} ;
      H00I22_A9492MRCod = new int[1] ;
      H00I23_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV56Station = "" ;
      AV106ObtenerEmprCod = "" ;
      AV58EmprNom = "" ;
      AV59UsurCod = "" ;
      AV60Carpeta = "" ;
      AV84FechaFin = GXutil.nullDate() ;
      AV83FechaInicio = GXutil.nullDate() ;
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
      AV78EmprCod_Selected = "" ;
      GXv_int12 = new int[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState17 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDvelop_confirmpanel_recalcular = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmrepueww__default(),
         new Object[] {
             new Object[] {
            H00I22_A407EmprNom, H00I22_n407EmprNom, H00I22_A396EmprCod, H00I22_A9501MRUltRes, H00I22_n9501MRUltRes, H00I22_A9500MRUltMov, H00I22_n9500MRUltMov, H00I22_A12850MRActivo, H00I22_n12850MRActivo, H00I22_A11458MRCodPrv,
            H00I22_n11458MRCodPrv, H00I22_A9498MRStkCri, H00I22_n9498MRStkCri, H00I22_A9497MRStkMin, H00I22_n9497MRStkMin, H00I22_A9496MRStkRes, H00I22_n9496MRStkRes, H00I22_A9495MRStkAct, H00I22_n9495MRStkAct, H00I22_A9499MRStkPre,
            H00I22_n9499MRStkPre, H00I22_A9494MRCodExt, H00I22_n9494MRCodExt, H00I22_A9493MRNom, H00I22_n9493MRNom, H00I22_A9492MRCod
            }
            , new Object[] {
            H00I23_AGRID_nRecordCount
            }
         }
      );
      AV115Pgmname = "MantenimientoMaquina.TMRepueWW" ;
      /* GeneXus formulas. */
      AV115Pgmname = "MantenimientoMaquina.TMRepueWW" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
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
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV103GridActions ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_49 ;
   private int nGXsfl_49_idx=1 ;
   private int AV26TFMRCod ;
   private int AV27TFMRCod_To ;
   private int AV110Mrcod3 ;
   private int AV111MRCod2 ;
   private int AV107MRCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A9492MRCod ;
   private int A9500MRUltMov ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod ;
   private int AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to ;
   private int edtMRNom_Visible ;
   private int edtMRCod_Visible ;
   private int edtMRCodExt_Visible ;
   private int edtMRStkPre_Visible ;
   private int edtMRStkAct_Visible ;
   private int edtMRStkRes_Visible ;
   private int edtMRStkMin_Visible ;
   private int edtMRStkCri_Visible ;
   private int edtMRCodPrv_Visible ;
   private int AV51PageToGo ;
   private int AV109Mrcod4 ;
   private int AV79MRCod_Selected ;
   private int GXv_int12[] ;
   private int AV136GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
   private long A9501MRUltRes ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV42TFMRStkPre ;
   private java.math.BigDecimal AV43TFMRStkPre_To ;
   private java.math.BigDecimal AV34TFMRStkAct ;
   private java.math.BigDecimal AV35TFMRStkAct_To ;
   private java.math.BigDecimal AV36TFMRStkRes ;
   private java.math.BigDecimal AV37TFMRStkRes_To ;
   private java.math.BigDecimal AV38TFMRStkMin ;
   private java.math.BigDecimal AV39TFMRStkMin_To ;
   private java.math.BigDecimal AV40TFMRStkCri ;
   private java.math.BigDecimal AV41TFMRStkCri_To ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal A9496MRStkRes ;
   private java.math.BigDecimal A9497MRStkMin ;
   private java.math.BigDecimal A9498MRStkCri ;
   private java.math.BigDecimal AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre ;
   private java.math.BigDecimal AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to ;
   private java.math.BigDecimal AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact ;
   private java.math.BigDecimal AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to ;
   private java.math.BigDecimal AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres ;
   private java.math.BigDecimal AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to ;
   private java.math.BigDecimal AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin ;
   private java.math.BigDecimal AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to ;
   private java.math.BigDecimal AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri ;
   private java.math.BigDecimal AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_recalcular_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_49_idx="0001" ;
   private String AV28TFMRNom ;
   private String AV29TFMRNom_Sel ;
   private String AV30TFMRCodExt ;
   private String AV31TFMRCodExt_Sel ;
   private String AV32TFMRCodPrv ;
   private String AV33TFMRCodPrv_Sel ;
   private String AV49TFMRActivo_Sel ;
   private String AV115Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV57EmprCod ;
   private String AV112MRNom ;
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
   private String Dvelop_confirmpanel_recalcular_Title ;
   private String Dvelop_confirmpanel_recalcular_Confirmationtext ;
   private String Dvelop_confirmpanel_recalcular_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_recalcular_Nobuttoncaption ;
   private String Dvelop_confirmpanel_recalcular_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_recalcular_Yesbuttonposition ;
   private String Dvelop_confirmpanel_recalcular_Confirmtype ;
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
   private String bttBtnstockminimobajos_Internalname ;
   private String bttBtnstockminimobajos_Jsonclick ;
   private String bttBtnimprimir_Internalname ;
   private String bttBtnimprimir_Jsonclick ;
   private String bttBtnimprimirdetallado_Internalname ;
   private String bttBtnimprimirdetallado_Jsonclick ;
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
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
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
   private String AV105DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A9493MRNom ;
   private String edtMRNom_Internalname ;
   private String edtMRCod_Internalname ;
   private String A9494MRCodExt ;
   private String edtMRCodExt_Internalname ;
   private String edtMRStkPre_Internalname ;
   private String edtMRStkAct_Internalname ;
   private String edtMRStkRes_Internalname ;
   private String edtMRStkMin_Internalname ;
   private String edtMRStkCri_Internalname ;
   private String A11458MRCodPrv ;
   private String edtMRCodPrv_Internalname ;
   private String A12850MRActivo ;
   private String edtMRUltMov_Internalname ;
   private String edtMRUltRes_Internalname ;
   private String edtMRCNom_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom ;
   private String lV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext ;
   private String lV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv ;
   private String AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel ;
   private String AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom ;
   private String AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel ;
   private String AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext ;
   private String AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel ;
   private String AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv ;
   private String AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel ;
   private String hsh ;
   private String AV56Station ;
   private String AV106ObtenerEmprCod ;
   private String AV58EmprNom ;
   private String AV59UsurCod ;
   private String AV60Carpeta ;
   private String AV78EmprCod_Selected ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char14 ;
   private String GXv_char4[] ;
   private String GXt_char13 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_recalcular_Internalname ;
   private String Dvelop_confirmpanel_recalcular_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_49_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String GXCCtl ;
   private String edtMRNom_Jsonclick ;
   private String edtMRCod_Jsonclick ;
   private String edtMRCodExt_Jsonclick ;
   private String edtMRStkPre_Jsonclick ;
   private String edtMRStkAct_Jsonclick ;
   private String edtMRStkRes_Jsonclick ;
   private String edtMRStkMin_Jsonclick ;
   private String edtMRStkCri_Jsonclick ;
   private String edtMRCodPrv_Jsonclick ;
   private String edtMRUltMov_Jsonclick ;
   private String edtMRUltRes_Jsonclick ;
   private String edtMRCNom_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV84FechaFin ;
   private java.util.Date AV83FechaInicio ;
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
   private boolean bGXsfl_49_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n9493MRNom ;
   private boolean n9494MRCodExt ;
   private boolean n9499MRStkPre ;
   private boolean n9495MRStkAct ;
   private boolean n9496MRStkRes ;
   private boolean n9497MRStkMin ;
   private boolean n9498MRStkCri ;
   private boolean n11458MRCodPrv ;
   private boolean n12850MRActivo ;
   private boolean n9500MRUltMov ;
   private boolean n9501MRUltRes ;
   private boolean n407EmprNom ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String A13718MRCNom ;
   private String lV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext ;
   private String AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_recalcular ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkMRActivo ;
   private IDataStoreProvider pr_default ;
   private String[] H00I22_A407EmprNom ;
   private boolean[] H00I22_n407EmprNom ;
   private String[] H00I22_A396EmprCod ;
   private long[] H00I22_A9501MRUltRes ;
   private boolean[] H00I22_n9501MRUltRes ;
   private int[] H00I22_A9500MRUltMov ;
   private boolean[] H00I22_n9500MRUltMov ;
   private String[] H00I22_A12850MRActivo ;
   private boolean[] H00I22_n12850MRActivo ;
   private String[] H00I22_A11458MRCodPrv ;
   private boolean[] H00I22_n11458MRCodPrv ;
   private java.math.BigDecimal[] H00I22_A9498MRStkCri ;
   private boolean[] H00I22_n9498MRStkCri ;
   private java.math.BigDecimal[] H00I22_A9497MRStkMin ;
   private boolean[] H00I22_n9497MRStkMin ;
   private java.math.BigDecimal[] H00I22_A9496MRStkRes ;
   private boolean[] H00I22_n9496MRStkRes ;
   private java.math.BigDecimal[] H00I22_A9495MRStkAct ;
   private boolean[] H00I22_n9495MRStkAct ;
   private java.math.BigDecimal[] H00I22_A9499MRStkPre ;
   private boolean[] H00I22_n9499MRStkPre ;
   private String[] H00I22_A9494MRCodExt ;
   private boolean[] H00I22_n9494MRCodExt ;
   private String[] H00I22_A9493MRNom ;
   private boolean[] H00I22_n9493MRNom ;
   private int[] H00I22_A9492MRCod ;
   private long[] H00I23_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState17[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tmrepueww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00I22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext ,
                                          String AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel ,
                                          String AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom ,
                                          int AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod ,
                                          int AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to ,
                                          String AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel ,
                                          String AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext ,
                                          java.math.BigDecimal AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre ,
                                          java.math.BigDecimal AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to ,
                                          java.math.BigDecimal AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact ,
                                          java.math.BigDecimal AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to ,
                                          java.math.BigDecimal AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres ,
                                          java.math.BigDecimal AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to ,
                                          java.math.BigDecimal AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin ,
                                          java.math.BigDecimal AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to ,
                                          java.math.BigDecimal AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri ,
                                          java.math.BigDecimal AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to ,
                                          String AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel ,
                                          String AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv ,
                                          String AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          String A9494MRCodExt ,
                                          java.math.BigDecimal A9499MRStkPre ,
                                          java.math.BigDecimal A9495MRStkAct ,
                                          java.math.BigDecimal A9496MRStkRes ,
                                          java.math.BigDecimal A9497MRStkMin ,
                                          java.math.BigDecimal A9498MRStkCri ,
                                          String A11458MRCodPrv ,
                                          String A12850MRActivo ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[33];
      Object[] GXv_Object19 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.EmprNom, T1.EmprCod, T1.MRUltRes, T1.MRUltMov, T1.MRActivo, T1.MRCodPrv, T1.MRStkCri, T1.MRStkMin, T1.MRStkRes, T1.MRStkAct, T1.MRStkPre, T1.MRCodExt, T1.MRNom," ;
      sSelectString += " T1.MRCod" ;
      sFromString = " FROM (TXPMREPUE T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.MRCodExt) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRStkPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRStkRes,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRStkMin,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRStkCri,'99999990.999'), 2) like '%' || ?) or ( UPPER(T1.MRCodPrv) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int18[0] = (byte)(1) ;
         GXv_int18[1] = (byte)(1) ;
         GXv_int18[2] = (byte)(1) ;
         GXv_int18[3] = (byte)(1) ;
         GXv_int18[4] = (byte)(1) ;
         GXv_int18[5] = (byte)(1) ;
         GXv_int18[6] = (byte)(1) ;
         GXv_int18[7] = (byte)(1) ;
         GXv_int18[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRNom = ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (0==AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod) )
      {
         addWhere(sWhereString, "(T1.MRCod >= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to) )
      {
         addWhere(sWhereString, "(T1.MRCod <= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel)==0) && ( ! (GXutil.strcmp("", AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRCodExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRCodExt = ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkPre >= ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkPre <= ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkAct >= ?)");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkAct <= ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkRes >= ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkRes <= ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkMin >= ?)");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkMin <= ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkCri >= ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkCri <= ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel)==0) && ( ! (GXutil.strcmp("", AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRCodPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRCodPrv = ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRActivo = ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MRCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MRCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MRNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MRNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MRCodExt" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MRCodExt DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MRStkPre" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MRStkPre DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MRStkAct" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MRStkAct DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MRStkRes" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MRStkRes DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MRStkMin" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MRStkMin DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MRStkCri" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MRStkCri DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MRCodPrv" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MRCodPrv DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MRActivo" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MRActivo DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MRCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H00I23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext ,
                                          String AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel ,
                                          String AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom ,
                                          int AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod ,
                                          int AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to ,
                                          String AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel ,
                                          String AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext ,
                                          java.math.BigDecimal AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre ,
                                          java.math.BigDecimal AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to ,
                                          java.math.BigDecimal AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact ,
                                          java.math.BigDecimal AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to ,
                                          java.math.BigDecimal AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres ,
                                          java.math.BigDecimal AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to ,
                                          java.math.BigDecimal AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin ,
                                          java.math.BigDecimal AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to ,
                                          java.math.BigDecimal AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri ,
                                          java.math.BigDecimal AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to ,
                                          String AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel ,
                                          String AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv ,
                                          String AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          String A9494MRCodExt ,
                                          java.math.BigDecimal A9499MRStkPre ,
                                          java.math.BigDecimal A9495MRStkAct ,
                                          java.math.BigDecimal A9496MRStkRes ,
                                          java.math.BigDecimal A9497MRStkMin ,
                                          java.math.BigDecimal A9498MRStkCri ,
                                          String A11458MRCodPrv ,
                                          String A12850MRActivo ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[28];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPMREPUE T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV116Mantenimientomaquina_tmrepuewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.MRCodExt) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRStkPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRStkRes,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRStkMin,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRStkCri,'99999990.999'), 2) like '%' || ?) or ( UPPER(T1.MRCodPrv) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
         GXv_int20[1] = (byte)(1) ;
         GXv_int20[2] = (byte)(1) ;
         GXv_int20[3] = (byte)(1) ;
         GXv_int20[4] = (byte)(1) ;
         GXv_int20[5] = (byte)(1) ;
         GXv_int20[6] = (byte)(1) ;
         GXv_int20[7] = (byte)(1) ;
         GXv_int20[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV117Mantenimientomaquina_tmrepuewwds_2_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Mantenimientomaquina_tmrepuewwds_3_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRNom = ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (0==AV119Mantenimientomaquina_tmrepuewwds_4_tfmrcod) )
      {
         addWhere(sWhereString, "(T1.MRCod >= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Mantenimientomaquina_tmrepuewwds_5_tfmrcod_to) )
      {
         addWhere(sWhereString, "(T1.MRCod <= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel)==0) && ( ! (GXutil.strcmp("", AV121Mantenimientomaquina_tmrepuewwds_6_tfmrcodext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRCodExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Mantenimientomaquina_tmrepuewwds_7_tfmrcodext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRCodExt = ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Mantenimientomaquina_tmrepuewwds_8_tfmrstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkPre >= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Mantenimientomaquina_tmrepuewwds_9_tfmrstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkPre <= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Mantenimientomaquina_tmrepuewwds_10_tfmrstkact)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkAct >= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Mantenimientomaquina_tmrepuewwds_11_tfmrstkact_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkAct <= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Mantenimientomaquina_tmrepuewwds_12_tfmrstkres)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkRes >= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Mantenimientomaquina_tmrepuewwds_13_tfmrstkres_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkRes <= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Mantenimientomaquina_tmrepuewwds_14_tfmrstkmin)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkMin >= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Mantenimientomaquina_tmrepuewwds_15_tfmrstkmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkMin <= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Mantenimientomaquina_tmrepuewwds_16_tfmrstkcri)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkCri >= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Mantenimientomaquina_tmrepuewwds_17_tfmrstkcri_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRStkCri <= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel)==0) && ( ! (GXutil.strcmp("", AV133Mantenimientomaquina_tmrepuewwds_18_tfmrcodprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRCodPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Mantenimientomaquina_tmrepuewwds_19_tfmrcodprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRCodPrv = ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Mantenimientomaquina_tmrepuewwds_20_tfmractivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRActivo = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
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
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_H00I22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() );
            case 1 :
                  return conditional_H00I23(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00I22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00I23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 100);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               return;
      }
   }

}

