package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantww_impl extends GXDataArea
{
   public mantww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantww_impl.class ));
   }

   public mantww_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
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
      nRC_GXsfl_39 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_39"))) ;
      nGXsfl_39_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_39_idx"))) ;
      sGXsfl_39_idx = httpContext.GetPar( "sGXsfl_39_idx") ;
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
      AV26TFMAntId = GXutil.lval( httpContext.GetPar( "TFMAntId")) ;
      AV27TFMAntId_To = GXutil.lval( httpContext.GetPar( "TFMAntId_To")) ;
      AV28TFMAntEmprCod = httpContext.GetPar( "TFMAntEmprCod") ;
      AV29TFMAntEmprCod_Sel = httpContext.GetPar( "TFMAntEmprCod_Sel") ;
      AV30TFMAntCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFMAntCliCod"))) ;
      AV31TFMAntCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFMAntCliCod_To"))) ;
      AV32TFMAntCliNom = httpContext.GetPar( "TFMAntCliNom") ;
      AV33TFMAntCliNom_Sel = httpContext.GetPar( "TFMAntCliNom_Sel") ;
      AV34TFMAntArtCod = httpContext.GetPar( "TFMAntArtCod") ;
      AV35TFMAntArtCod_Sel = httpContext.GetPar( "TFMAntArtCod_Sel") ;
      AV36TFMAntArtDsc = httpContext.GetPar( "TFMAntArtDsc") ;
      AV37TFMAntArtDsc_Sel = httpContext.GetPar( "TFMAntArtDsc_Sel") ;
      AV38TFMAntColNom = httpContext.GetPar( "TFMAntColNom") ;
      AV39TFMAntColNom_Sel = httpContext.GetPar( "TFMAntColNom_Sel") ;
      AV40TFMAntColNum = (int)(GXutil.lval( httpContext.GetPar( "TFMAntColNum"))) ;
      AV41TFMAntColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFMAntColNum_To"))) ;
      AV42TFMAntColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFMAntColCod"))) ;
      AV43TFMAntColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFMAntColCod_To"))) ;
      AV44TFMAntMaqCod = httpContext.GetPar( "TFMAntMaqCod") ;
      AV45TFMAntMaqCod_Sel = httpContext.GetPar( "TFMAntMaqCod_Sel") ;
      AV46TFMAntMaqDsc = httpContext.GetPar( "TFMAntMaqDsc") ;
      AV47TFMAntMaqDsc_Sel = httpContext.GetPar( "TFMAntMaqDsc_Sel") ;
      AV48TFMAntTipMCod = httpContext.GetPar( "TFMAntTipMCod") ;
      AV49TFMAntTipMCod_Sel = httpContext.GetPar( "TFMAntTipMCod_Sel") ;
      AV50TFMAntTipMDsc = httpContext.GetPar( "TFMAntTipMDsc") ;
      AV51TFMAntTipMDsc_Sel = httpContext.GetPar( "TFMAntTipMDsc_Sel") ;
      AV52TFMAntKilProd = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntKilProd"), ".") ;
      AV53TFMAntKilProd_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntKilProd_To"), ".") ;
      AV54TFMAntKilReo = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntKilReo"), ".") ;
      AV55TFMAntKilReo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntKilReo_To"), ".") ;
      AV56TFMAntPorc = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntPorc"), ".") ;
      AV57TFMAntPorc_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntPorc_To"), ".") ;
      AV65Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMAntId, AV27TFMAntId_To, AV28TFMAntEmprCod, AV29TFMAntEmprCod_Sel, AV30TFMAntCliCod, AV31TFMAntCliCod_To, AV32TFMAntCliNom, AV33TFMAntCliNom_Sel, AV34TFMAntArtCod, AV35TFMAntArtCod_Sel, AV36TFMAntArtDsc, AV37TFMAntArtDsc_Sel, AV38TFMAntColNom, AV39TFMAntColNom_Sel, AV40TFMAntColNum, AV41TFMAntColNum_To, AV42TFMAntColCod, AV43TFMAntColCod_To, AV44TFMAntMaqCod, AV45TFMAntMaqCod_Sel, AV46TFMAntMaqDsc, AV47TFMAntMaqDsc_Sel, AV48TFMAntTipMCod, AV49TFMAntTipMCod_Sel, AV50TFMAntTipMDsc, AV51TFMAntTipMDsc_Sel, AV52TFMAntKilProd, AV53TFMAntKilProd_To, AV54TFMAntKilReo, AV55TFMAntKilReo_To, AV56TFMAntPorc, AV57TFMAntPorc_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa2DO2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2DO2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.mantww", new String[] {}, new String[] {}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MAntWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV65Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anticipacionerrores\\mantww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV60GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV61GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTID", GXutil.ltrim( localUtil.ntoc( AV26TFMAntId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTID_TO", GXutil.ltrim( localUtil.ntoc( AV27TFMAntId_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTEMPRCOD", GXutil.rtrim( AV28TFMAntEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTEMPRCOD_SEL", GXutil.rtrim( AV29TFMAntEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTCLICOD", GXutil.ltrim( localUtil.ntoc( AV30TFMAntCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV31TFMAntCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTCLINOM", AV32TFMAntCliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTCLINOM_SEL", AV33TFMAntCliNom_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTARTCOD", GXutil.rtrim( AV34TFMAntArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTARTCOD_SEL", GXutil.rtrim( AV35TFMAntArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTARTDSC", AV36TFMAntArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTARTDSC_SEL", AV37TFMAntArtDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTCOLNOM", GXutil.rtrim( AV38TFMAntColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTCOLNOM_SEL", GXutil.rtrim( AV39TFMAntColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTCOLNUM", GXutil.ltrim( localUtil.ntoc( AV40TFMAntColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV41TFMAntColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTCOLCOD", GXutil.ltrim( localUtil.ntoc( AV42TFMAntColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV43TFMAntColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTMAQCOD", GXutil.rtrim( AV44TFMAntMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTMAQCOD_SEL", GXutil.rtrim( AV45TFMAntMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTMAQDSC", AV46TFMAntMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTMAQDSC_SEL", AV47TFMAntMaqDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTTIPMCOD", GXutil.rtrim( AV48TFMAntTipMCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTTIPMCOD_SEL", GXutil.rtrim( AV49TFMAntTipMCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTTIPMDSC", AV50TFMAntTipMDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTTIPMDSC_SEL", AV51TFMAntTipMDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTKILPROD", GXutil.ltrim( localUtil.ntoc( AV52TFMAntKilProd, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTKILPROD_TO", GXutil.ltrim( localUtil.ntoc( AV53TFMAntKilProd_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTKILREO", GXutil.ltrim( localUtil.ntoc( AV54TFMAntKilReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTKILREO_TO", GXutil.ltrim( localUtil.ntoc( AV55TFMAntKilReo_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTPORC", GXutil.ltrim( localUtil.ntoc( AV56TFMAntPorc, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMANTPORC_TO", GXutil.ltrim( localUtil.ntoc( AV57TFMAntPorc_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MANTKILTOT", GXutil.ltrim( localUtil.ntoc( A14646MAntKilTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we2DO2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2DO2( ) ;
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
      return formatLink("app.anticipacionerrores.mantww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AnticipacionErrores.MAntWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " MAnt", "") ;
   }

   public void wb2DO0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MAntWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MAntWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_2DO2( true) ;
      }
      else
      {
         wb_table1_21_2DO2( false) ;
      }
      return  ;
   }

   public void wb_table1_21_2DO2e( boolean wbgen )
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
         startgridcontrol39( ) ;
      }
      if ( wbEnd == 39 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_39 = (int)(nGXsfl_39_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV60GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV61GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV65Pgmname), GXutil.rtrim( localUtil.format( AV65Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAntWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
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
      if ( wbEnd == 39 )
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

   public void start2DO2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " MAnt", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2DO0( ) ;
   }

   public void ws2DO2( )
   {
      start2DO2( ) ;
      evt2DO2( ) ;
   }

   public void evt2DO2( )
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
                           e112DO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122DO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132DO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142DO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152DO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e162DO2 ();
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
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV62GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridActions), 4, 0));
                           A14562MAntId = localUtil.ctol( httpContext.cgiGet( edtMAntId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A14566MAntEmprCo = httpContext.cgiGet( edtMAntEmprCo_Internalname) ;
                           A14565MAntCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMAntCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14611MAntCliNom = httpContext.cgiGet( edtMAntCliNom_Internalname) ;
                           A14567MAntArtCod = httpContext.cgiGet( edtMAntArtCod_Internalname) ;
                           A14613MAntArtDsc = httpContext.cgiGet( edtMAntArtDsc_Internalname) ;
                           A14623MAntColNom = httpContext.cgiGet( edtMAntColNom_Internalname) ;
                           A14568MAntColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMAntColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14642MAntColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMAntColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14570MAntMaqCod = httpContext.cgiGet( edtMAntMaqCod_Internalname) ;
                           A14610MAntMaqDsc = httpContext.cgiGet( edtMAntMaqDsc_Internalname) ;
                           A14569MAntTipMCo = httpContext.cgiGet( edtMAntTipMCo_Internalname) ;
                           A14612MAntTipMDs = httpContext.cgiGet( edtMAntTipMDs_Internalname) ;
                           A14643MAntKilPro = localUtil.ctond( httpContext.cgiGet( edtMAntKilPro_Internalname)) ;
                           A14644MAntKilReo = localUtil.ctond( httpContext.cgiGet( edtMAntKilReo_Internalname)) ;
                           A14645MAntPorc = localUtil.ctond( httpContext.cgiGet( edtMAntPorc_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e172DO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e182DO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e192DO2 ();
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2DO2( )
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

   public void pa2DO2( )
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
      subsflControlProps_392( ) ;
      while ( nGXsfl_39_idx <= nRC_GXsfl_39 )
      {
         sendrow_392( ) ;
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 long AV26TFMAntId ,
                                 long AV27TFMAntId_To ,
                                 String AV28TFMAntEmprCod ,
                                 String AV29TFMAntEmprCod_Sel ,
                                 int AV30TFMAntCliCod ,
                                 int AV31TFMAntCliCod_To ,
                                 String AV32TFMAntCliNom ,
                                 String AV33TFMAntCliNom_Sel ,
                                 String AV34TFMAntArtCod ,
                                 String AV35TFMAntArtCod_Sel ,
                                 String AV36TFMAntArtDsc ,
                                 String AV37TFMAntArtDsc_Sel ,
                                 String AV38TFMAntColNom ,
                                 String AV39TFMAntColNom_Sel ,
                                 int AV40TFMAntColNum ,
                                 int AV41TFMAntColNum_To ,
                                 byte AV42TFMAntColCod ,
                                 byte AV43TFMAntColCod_To ,
                                 String AV44TFMAntMaqCod ,
                                 String AV45TFMAntMaqCod_Sel ,
                                 String AV46TFMAntMaqDsc ,
                                 String AV47TFMAntMaqDsc_Sel ,
                                 String AV48TFMAntTipMCod ,
                                 String AV49TFMAntTipMCod_Sel ,
                                 String AV50TFMAntTipMDsc ,
                                 String AV51TFMAntTipMDsc_Sel ,
                                 java.math.BigDecimal AV52TFMAntKilProd ,
                                 java.math.BigDecimal AV53TFMAntKilProd_To ,
                                 java.math.BigDecimal AV54TFMAntKilReo ,
                                 java.math.BigDecimal AV55TFMAntKilReo_To ,
                                 java.math.BigDecimal AV56TFMAntPorc ,
                                 java.math.BigDecimal AV57TFMAntPorc_To ,
                                 String AV65Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e182DO2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DO2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MAntWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV65Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anticipacionerrores\\mantww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MANTID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14562MAntId), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "MANTID", GXutil.ltrim( localUtil.ntoc( A14562MAntId, (byte)(10), (byte)(0), ".", "")));
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
      rf2DO2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV65Pgmname = "AnticipacionErrores.MAntWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Pgmname", AV65Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e182DO2 ();
      nGXsfl_39_idx = 1 ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
      bGXsfl_39_Refreshing = true ;
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
         subsflControlProps_392( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV70Anticipacionerrores_mantwwds_1_filterfulltext ,
                                              Long.valueOf(AV71Anticipacionerrores_mantwwds_2_tfmantid) ,
                                              Long.valueOf(AV72Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                              AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                              AV73Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                              Integer.valueOf(AV75Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                              Integer.valueOf(AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                              AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                              AV77Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                              AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                              AV79Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                              AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                              AV81Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                              AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                              AV83Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                              Integer.valueOf(AV85Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                              Integer.valueOf(AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                              Byte.valueOf(AV87Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                              Byte.valueOf(AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                              AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                              AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                              AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                              AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                              AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                              AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                              AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                              AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                              AV97Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                              AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                              AV99Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                              AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                              AV101Anticipacionerrores_mantwwds_32_tfmantporc ,
                                              AV102Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                              Long.valueOf(A14562MAntId) ,
                                              A14566MAntEmprCo ,
                                              Integer.valueOf(A14565MAntCliCod) ,
                                              A14611MAntCliNom ,
                                              A14567MAntArtCod ,
                                              A14613MAntArtDsc ,
                                              A14623MAntColNom ,
                                              Integer.valueOf(A14568MAntColNum) ,
                                              Byte.valueOf(A14642MAntColCod) ,
                                              A14570MAntMaqCod ,
                                              A14610MAntMaqDsc ,
                                              A14569MAntTipMCo ,
                                              A14612MAntTipMDs ,
                                              A14643MAntKilPro ,
                                              A14644MAntKilReo ,
                                              A14646MAntKilTot ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN
                                              }
         });
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
         lV73Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV73Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
         lV77Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV77Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
         lV79Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV79Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
         lV81Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV81Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
         lV83Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV83Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
         lV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
         lV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
         lV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
         lV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
         /* Using cursor H02DO2 */
         pr_default.execute(0, new Object[] {lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV71Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV72Anticipacionerrores_mantwwds_3_tfmantid_to), lV73Anticipacionerrores_mantwwds_4_tfmantemprcod, AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV75Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV77Anticipacionerrores_mantwwds_8_tfmantclinom, AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV79Anticipacionerrores_mantwwds_10_tfmantartcod, AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV81Anticipacionerrores_mantwwds_12_tfmantartdsc, AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV83Anticipacionerrores_mantwwds_14_tfmantcolnom, AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV85Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV87Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV89Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV93Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV97Anticipacionerrores_mantwwds_28_tfmantkilprod, AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV99Anticipacionerrores_mantwwds_30_tfmantkilreo, AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV101Anticipacionerrores_mantwwds_32_tfmantporc, AV102Anticipacionerrores_mantwwds_33_tfmantporc_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_39_idx = 1 ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14643MAntKilPro = H02DO2_A14643MAntKilPro[0] ;
            A14612MAntTipMDs = H02DO2_A14612MAntTipMDs[0] ;
            A14569MAntTipMCo = H02DO2_A14569MAntTipMCo[0] ;
            A14610MAntMaqDsc = H02DO2_A14610MAntMaqDsc[0] ;
            A14570MAntMaqCod = H02DO2_A14570MAntMaqCod[0] ;
            A14642MAntColCod = H02DO2_A14642MAntColCod[0] ;
            A14568MAntColNum = H02DO2_A14568MAntColNum[0] ;
            A14623MAntColNom = H02DO2_A14623MAntColNom[0] ;
            A14613MAntArtDsc = H02DO2_A14613MAntArtDsc[0] ;
            A14567MAntArtCod = H02DO2_A14567MAntArtCod[0] ;
            A14611MAntCliNom = H02DO2_A14611MAntCliNom[0] ;
            A14565MAntCliCod = H02DO2_A14565MAntCliCod[0] ;
            A14566MAntEmprCo = H02DO2_A14566MAntEmprCo[0] ;
            A14562MAntId = H02DO2_A14562MAntId[0] ;
            A14644MAntKilReo = H02DO2_A14644MAntKilReo[0] ;
            A14646MAntKilTot = H02DO2_A14646MAntKilTot[0] ;
            A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
            e192DO2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(39) ;
         wb2DO0( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DO2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MANTID"+"_"+sGXsfl_39_idx, getSecureSignedToken( sGXsfl_39_idx, localUtil.format( DecimalUtil.doubleToDec(A14562MAntId), "ZZZZZZZZZ9")));
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
      AV70Anticipacionerrores_mantwwds_1_filterfulltext = AV15FilterFullText ;
      AV71Anticipacionerrores_mantwwds_2_tfmantid = AV26TFMAntId ;
      AV72Anticipacionerrores_mantwwds_3_tfmantid_to = AV27TFMAntId_To ;
      AV73Anticipacionerrores_mantwwds_4_tfmantemprcod = AV28TFMAntEmprCod ;
      AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV29TFMAntEmprCod_Sel ;
      AV75Anticipacionerrores_mantwwds_6_tfmantclicod = AV30TFMAntCliCod ;
      AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV31TFMAntCliCod_To ;
      AV77Anticipacionerrores_mantwwds_8_tfmantclinom = AV32TFMAntCliNom ;
      AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV33TFMAntCliNom_Sel ;
      AV79Anticipacionerrores_mantwwds_10_tfmantartcod = AV34TFMAntArtCod ;
      AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV35TFMAntArtCod_Sel ;
      AV81Anticipacionerrores_mantwwds_12_tfmantartdsc = AV36TFMAntArtDsc ;
      AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV37TFMAntArtDsc_Sel ;
      AV83Anticipacionerrores_mantwwds_14_tfmantcolnom = AV38TFMAntColNom ;
      AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV39TFMAntColNom_Sel ;
      AV85Anticipacionerrores_mantwwds_16_tfmantcolnum = AV40TFMAntColNum ;
      AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV41TFMAntColNum_To ;
      AV87Anticipacionerrores_mantwwds_18_tfmantcolcod = AV42TFMAntColCod ;
      AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV43TFMAntColCod_To ;
      AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV44TFMAntMaqCod ;
      AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV45TFMAntMaqCod_Sel ;
      AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV46TFMAntMaqDsc ;
      AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV47TFMAntMaqDsc_Sel ;
      AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV48TFMAntTipMCod ;
      AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV49TFMAntTipMCod_Sel ;
      AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV50TFMAntTipMDsc ;
      AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV51TFMAntTipMDsc_Sel ;
      AV97Anticipacionerrores_mantwwds_28_tfmantkilprod = AV52TFMAntKilProd ;
      AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV53TFMAntKilProd_To ;
      AV99Anticipacionerrores_mantwwds_30_tfmantkilreo = AV54TFMAntKilReo ;
      AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV55TFMAntKilReo_To ;
      AV101Anticipacionerrores_mantwwds_32_tfmantporc = AV56TFMAntPorc ;
      AV102Anticipacionerrores_mantwwds_33_tfmantporc_to = AV57TFMAntPorc_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV70Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV71Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV72Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV73Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV75Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV77Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV79Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV81Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV83Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV85Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV87Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV97Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV99Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV101Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV102Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV73Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV73Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV77Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV77Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV79Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV79Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV81Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV81Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV83Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV83Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor H02DO3 */
      pr_default.execute(1, new Object[] {lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, lV70Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV71Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV72Anticipacionerrores_mantwwds_3_tfmantid_to), lV73Anticipacionerrores_mantwwds_4_tfmantemprcod, AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV75Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV77Anticipacionerrores_mantwwds_8_tfmantclinom, AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV79Anticipacionerrores_mantwwds_10_tfmantartcod, AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV81Anticipacionerrores_mantwwds_12_tfmantartdsc, AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV83Anticipacionerrores_mantwwds_14_tfmantcolnom, AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV85Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV87Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV89Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV93Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV97Anticipacionerrores_mantwwds_28_tfmantkilprod, AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV99Anticipacionerrores_mantwwds_30_tfmantkilreo, AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV101Anticipacionerrores_mantwwds_32_tfmantporc, AV102Anticipacionerrores_mantwwds_33_tfmantporc_to});
      GRID_nRecordCount = H02DO3_AGRID_nRecordCount[0] ;
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
      AV70Anticipacionerrores_mantwwds_1_filterfulltext = AV15FilterFullText ;
      AV71Anticipacionerrores_mantwwds_2_tfmantid = AV26TFMAntId ;
      AV72Anticipacionerrores_mantwwds_3_tfmantid_to = AV27TFMAntId_To ;
      AV73Anticipacionerrores_mantwwds_4_tfmantemprcod = AV28TFMAntEmprCod ;
      AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV29TFMAntEmprCod_Sel ;
      AV75Anticipacionerrores_mantwwds_6_tfmantclicod = AV30TFMAntCliCod ;
      AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV31TFMAntCliCod_To ;
      AV77Anticipacionerrores_mantwwds_8_tfmantclinom = AV32TFMAntCliNom ;
      AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV33TFMAntCliNom_Sel ;
      AV79Anticipacionerrores_mantwwds_10_tfmantartcod = AV34TFMAntArtCod ;
      AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV35TFMAntArtCod_Sel ;
      AV81Anticipacionerrores_mantwwds_12_tfmantartdsc = AV36TFMAntArtDsc ;
      AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV37TFMAntArtDsc_Sel ;
      AV83Anticipacionerrores_mantwwds_14_tfmantcolnom = AV38TFMAntColNom ;
      AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV39TFMAntColNom_Sel ;
      AV85Anticipacionerrores_mantwwds_16_tfmantcolnum = AV40TFMAntColNum ;
      AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV41TFMAntColNum_To ;
      AV87Anticipacionerrores_mantwwds_18_tfmantcolcod = AV42TFMAntColCod ;
      AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV43TFMAntColCod_To ;
      AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV44TFMAntMaqCod ;
      AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV45TFMAntMaqCod_Sel ;
      AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV46TFMAntMaqDsc ;
      AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV47TFMAntMaqDsc_Sel ;
      AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV48TFMAntTipMCod ;
      AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV49TFMAntTipMCod_Sel ;
      AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV50TFMAntTipMDsc ;
      AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV51TFMAntTipMDsc_Sel ;
      AV97Anticipacionerrores_mantwwds_28_tfmantkilprod = AV52TFMAntKilProd ;
      AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV53TFMAntKilProd_To ;
      AV99Anticipacionerrores_mantwwds_30_tfmantkilreo = AV54TFMAntKilReo ;
      AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV55TFMAntKilReo_To ;
      AV101Anticipacionerrores_mantwwds_32_tfmantporc = AV56TFMAntPorc ;
      AV102Anticipacionerrores_mantwwds_33_tfmantporc_to = AV57TFMAntPorc_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMAntId, AV27TFMAntId_To, AV28TFMAntEmprCod, AV29TFMAntEmprCod_Sel, AV30TFMAntCliCod, AV31TFMAntCliCod_To, AV32TFMAntCliNom, AV33TFMAntCliNom_Sel, AV34TFMAntArtCod, AV35TFMAntArtCod_Sel, AV36TFMAntArtDsc, AV37TFMAntArtDsc_Sel, AV38TFMAntColNom, AV39TFMAntColNom_Sel, AV40TFMAntColNum, AV41TFMAntColNum_To, AV42TFMAntColCod, AV43TFMAntColCod_To, AV44TFMAntMaqCod, AV45TFMAntMaqCod_Sel, AV46TFMAntMaqDsc, AV47TFMAntMaqDsc_Sel, AV48TFMAntTipMCod, AV49TFMAntTipMCod_Sel, AV50TFMAntTipMDsc, AV51TFMAntTipMDsc_Sel, AV52TFMAntKilProd, AV53TFMAntKilProd_To, AV54TFMAntKilReo, AV55TFMAntKilReo_To, AV56TFMAntPorc, AV57TFMAntPorc_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV70Anticipacionerrores_mantwwds_1_filterfulltext = AV15FilterFullText ;
      AV71Anticipacionerrores_mantwwds_2_tfmantid = AV26TFMAntId ;
      AV72Anticipacionerrores_mantwwds_3_tfmantid_to = AV27TFMAntId_To ;
      AV73Anticipacionerrores_mantwwds_4_tfmantemprcod = AV28TFMAntEmprCod ;
      AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV29TFMAntEmprCod_Sel ;
      AV75Anticipacionerrores_mantwwds_6_tfmantclicod = AV30TFMAntCliCod ;
      AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV31TFMAntCliCod_To ;
      AV77Anticipacionerrores_mantwwds_8_tfmantclinom = AV32TFMAntCliNom ;
      AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV33TFMAntCliNom_Sel ;
      AV79Anticipacionerrores_mantwwds_10_tfmantartcod = AV34TFMAntArtCod ;
      AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV35TFMAntArtCod_Sel ;
      AV81Anticipacionerrores_mantwwds_12_tfmantartdsc = AV36TFMAntArtDsc ;
      AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV37TFMAntArtDsc_Sel ;
      AV83Anticipacionerrores_mantwwds_14_tfmantcolnom = AV38TFMAntColNom ;
      AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV39TFMAntColNom_Sel ;
      AV85Anticipacionerrores_mantwwds_16_tfmantcolnum = AV40TFMAntColNum ;
      AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV41TFMAntColNum_To ;
      AV87Anticipacionerrores_mantwwds_18_tfmantcolcod = AV42TFMAntColCod ;
      AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV43TFMAntColCod_To ;
      AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV44TFMAntMaqCod ;
      AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV45TFMAntMaqCod_Sel ;
      AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV46TFMAntMaqDsc ;
      AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV47TFMAntMaqDsc_Sel ;
      AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV48TFMAntTipMCod ;
      AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV49TFMAntTipMCod_Sel ;
      AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV50TFMAntTipMDsc ;
      AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV51TFMAntTipMDsc_Sel ;
      AV97Anticipacionerrores_mantwwds_28_tfmantkilprod = AV52TFMAntKilProd ;
      AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV53TFMAntKilProd_To ;
      AV99Anticipacionerrores_mantwwds_30_tfmantkilreo = AV54TFMAntKilReo ;
      AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV55TFMAntKilReo_To ;
      AV101Anticipacionerrores_mantwwds_32_tfmantporc = AV56TFMAntPorc ;
      AV102Anticipacionerrores_mantwwds_33_tfmantporc_to = AV57TFMAntPorc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMAntId, AV27TFMAntId_To, AV28TFMAntEmprCod, AV29TFMAntEmprCod_Sel, AV30TFMAntCliCod, AV31TFMAntCliCod_To, AV32TFMAntCliNom, AV33TFMAntCliNom_Sel, AV34TFMAntArtCod, AV35TFMAntArtCod_Sel, AV36TFMAntArtDsc, AV37TFMAntArtDsc_Sel, AV38TFMAntColNom, AV39TFMAntColNom_Sel, AV40TFMAntColNum, AV41TFMAntColNum_To, AV42TFMAntColCod, AV43TFMAntColCod_To, AV44TFMAntMaqCod, AV45TFMAntMaqCod_Sel, AV46TFMAntMaqDsc, AV47TFMAntMaqDsc_Sel, AV48TFMAntTipMCod, AV49TFMAntTipMCod_Sel, AV50TFMAntTipMDsc, AV51TFMAntTipMDsc_Sel, AV52TFMAntKilProd, AV53TFMAntKilProd_To, AV54TFMAntKilReo, AV55TFMAntKilReo_To, AV56TFMAntPorc, AV57TFMAntPorc_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV70Anticipacionerrores_mantwwds_1_filterfulltext = AV15FilterFullText ;
      AV71Anticipacionerrores_mantwwds_2_tfmantid = AV26TFMAntId ;
      AV72Anticipacionerrores_mantwwds_3_tfmantid_to = AV27TFMAntId_To ;
      AV73Anticipacionerrores_mantwwds_4_tfmantemprcod = AV28TFMAntEmprCod ;
      AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV29TFMAntEmprCod_Sel ;
      AV75Anticipacionerrores_mantwwds_6_tfmantclicod = AV30TFMAntCliCod ;
      AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV31TFMAntCliCod_To ;
      AV77Anticipacionerrores_mantwwds_8_tfmantclinom = AV32TFMAntCliNom ;
      AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV33TFMAntCliNom_Sel ;
      AV79Anticipacionerrores_mantwwds_10_tfmantartcod = AV34TFMAntArtCod ;
      AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV35TFMAntArtCod_Sel ;
      AV81Anticipacionerrores_mantwwds_12_tfmantartdsc = AV36TFMAntArtDsc ;
      AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV37TFMAntArtDsc_Sel ;
      AV83Anticipacionerrores_mantwwds_14_tfmantcolnom = AV38TFMAntColNom ;
      AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV39TFMAntColNom_Sel ;
      AV85Anticipacionerrores_mantwwds_16_tfmantcolnum = AV40TFMAntColNum ;
      AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV41TFMAntColNum_To ;
      AV87Anticipacionerrores_mantwwds_18_tfmantcolcod = AV42TFMAntColCod ;
      AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV43TFMAntColCod_To ;
      AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV44TFMAntMaqCod ;
      AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV45TFMAntMaqCod_Sel ;
      AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV46TFMAntMaqDsc ;
      AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV47TFMAntMaqDsc_Sel ;
      AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV48TFMAntTipMCod ;
      AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV49TFMAntTipMCod_Sel ;
      AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV50TFMAntTipMDsc ;
      AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV51TFMAntTipMDsc_Sel ;
      AV97Anticipacionerrores_mantwwds_28_tfmantkilprod = AV52TFMAntKilProd ;
      AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV53TFMAntKilProd_To ;
      AV99Anticipacionerrores_mantwwds_30_tfmantkilreo = AV54TFMAntKilReo ;
      AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV55TFMAntKilReo_To ;
      AV101Anticipacionerrores_mantwwds_32_tfmantporc = AV56TFMAntPorc ;
      AV102Anticipacionerrores_mantwwds_33_tfmantporc_to = AV57TFMAntPorc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMAntId, AV27TFMAntId_To, AV28TFMAntEmprCod, AV29TFMAntEmprCod_Sel, AV30TFMAntCliCod, AV31TFMAntCliCod_To, AV32TFMAntCliNom, AV33TFMAntCliNom_Sel, AV34TFMAntArtCod, AV35TFMAntArtCod_Sel, AV36TFMAntArtDsc, AV37TFMAntArtDsc_Sel, AV38TFMAntColNom, AV39TFMAntColNom_Sel, AV40TFMAntColNum, AV41TFMAntColNum_To, AV42TFMAntColCod, AV43TFMAntColCod_To, AV44TFMAntMaqCod, AV45TFMAntMaqCod_Sel, AV46TFMAntMaqDsc, AV47TFMAntMaqDsc_Sel, AV48TFMAntTipMCod, AV49TFMAntTipMCod_Sel, AV50TFMAntTipMDsc, AV51TFMAntTipMDsc_Sel, AV52TFMAntKilProd, AV53TFMAntKilProd_To, AV54TFMAntKilReo, AV55TFMAntKilReo_To, AV56TFMAntPorc, AV57TFMAntPorc_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV70Anticipacionerrores_mantwwds_1_filterfulltext = AV15FilterFullText ;
      AV71Anticipacionerrores_mantwwds_2_tfmantid = AV26TFMAntId ;
      AV72Anticipacionerrores_mantwwds_3_tfmantid_to = AV27TFMAntId_To ;
      AV73Anticipacionerrores_mantwwds_4_tfmantemprcod = AV28TFMAntEmprCod ;
      AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV29TFMAntEmprCod_Sel ;
      AV75Anticipacionerrores_mantwwds_6_tfmantclicod = AV30TFMAntCliCod ;
      AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV31TFMAntCliCod_To ;
      AV77Anticipacionerrores_mantwwds_8_tfmantclinom = AV32TFMAntCliNom ;
      AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV33TFMAntCliNom_Sel ;
      AV79Anticipacionerrores_mantwwds_10_tfmantartcod = AV34TFMAntArtCod ;
      AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV35TFMAntArtCod_Sel ;
      AV81Anticipacionerrores_mantwwds_12_tfmantartdsc = AV36TFMAntArtDsc ;
      AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV37TFMAntArtDsc_Sel ;
      AV83Anticipacionerrores_mantwwds_14_tfmantcolnom = AV38TFMAntColNom ;
      AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV39TFMAntColNom_Sel ;
      AV85Anticipacionerrores_mantwwds_16_tfmantcolnum = AV40TFMAntColNum ;
      AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV41TFMAntColNum_To ;
      AV87Anticipacionerrores_mantwwds_18_tfmantcolcod = AV42TFMAntColCod ;
      AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV43TFMAntColCod_To ;
      AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV44TFMAntMaqCod ;
      AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV45TFMAntMaqCod_Sel ;
      AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV46TFMAntMaqDsc ;
      AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV47TFMAntMaqDsc_Sel ;
      AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV48TFMAntTipMCod ;
      AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV49TFMAntTipMCod_Sel ;
      AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV50TFMAntTipMDsc ;
      AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV51TFMAntTipMDsc_Sel ;
      AV97Anticipacionerrores_mantwwds_28_tfmantkilprod = AV52TFMAntKilProd ;
      AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV53TFMAntKilProd_To ;
      AV99Anticipacionerrores_mantwwds_30_tfmantkilreo = AV54TFMAntKilReo ;
      AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV55TFMAntKilReo_To ;
      AV101Anticipacionerrores_mantwwds_32_tfmantporc = AV56TFMAntPorc ;
      AV102Anticipacionerrores_mantwwds_33_tfmantporc_to = AV57TFMAntPorc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMAntId, AV27TFMAntId_To, AV28TFMAntEmprCod, AV29TFMAntEmprCod_Sel, AV30TFMAntCliCod, AV31TFMAntCliCod_To, AV32TFMAntCliNom, AV33TFMAntCliNom_Sel, AV34TFMAntArtCod, AV35TFMAntArtCod_Sel, AV36TFMAntArtDsc, AV37TFMAntArtDsc_Sel, AV38TFMAntColNom, AV39TFMAntColNom_Sel, AV40TFMAntColNum, AV41TFMAntColNum_To, AV42TFMAntColCod, AV43TFMAntColCod_To, AV44TFMAntMaqCod, AV45TFMAntMaqCod_Sel, AV46TFMAntMaqDsc, AV47TFMAntMaqDsc_Sel, AV48TFMAntTipMCod, AV49TFMAntTipMCod_Sel, AV50TFMAntTipMDsc, AV51TFMAntTipMDsc_Sel, AV52TFMAntKilProd, AV53TFMAntKilProd_To, AV54TFMAntKilReo, AV55TFMAntKilReo_To, AV56TFMAntPorc, AV57TFMAntPorc_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV70Anticipacionerrores_mantwwds_1_filterfulltext = AV15FilterFullText ;
      AV71Anticipacionerrores_mantwwds_2_tfmantid = AV26TFMAntId ;
      AV72Anticipacionerrores_mantwwds_3_tfmantid_to = AV27TFMAntId_To ;
      AV73Anticipacionerrores_mantwwds_4_tfmantemprcod = AV28TFMAntEmprCod ;
      AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV29TFMAntEmprCod_Sel ;
      AV75Anticipacionerrores_mantwwds_6_tfmantclicod = AV30TFMAntCliCod ;
      AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV31TFMAntCliCod_To ;
      AV77Anticipacionerrores_mantwwds_8_tfmantclinom = AV32TFMAntCliNom ;
      AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV33TFMAntCliNom_Sel ;
      AV79Anticipacionerrores_mantwwds_10_tfmantartcod = AV34TFMAntArtCod ;
      AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV35TFMAntArtCod_Sel ;
      AV81Anticipacionerrores_mantwwds_12_tfmantartdsc = AV36TFMAntArtDsc ;
      AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV37TFMAntArtDsc_Sel ;
      AV83Anticipacionerrores_mantwwds_14_tfmantcolnom = AV38TFMAntColNom ;
      AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV39TFMAntColNom_Sel ;
      AV85Anticipacionerrores_mantwwds_16_tfmantcolnum = AV40TFMAntColNum ;
      AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV41TFMAntColNum_To ;
      AV87Anticipacionerrores_mantwwds_18_tfmantcolcod = AV42TFMAntColCod ;
      AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV43TFMAntColCod_To ;
      AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV44TFMAntMaqCod ;
      AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV45TFMAntMaqCod_Sel ;
      AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV46TFMAntMaqDsc ;
      AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV47TFMAntMaqDsc_Sel ;
      AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV48TFMAntTipMCod ;
      AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV49TFMAntTipMCod_Sel ;
      AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV50TFMAntTipMDsc ;
      AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV51TFMAntTipMDsc_Sel ;
      AV97Anticipacionerrores_mantwwds_28_tfmantkilprod = AV52TFMAntKilProd ;
      AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV53TFMAntKilProd_To ;
      AV99Anticipacionerrores_mantwwds_30_tfmantkilreo = AV54TFMAntKilReo ;
      AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV55TFMAntKilReo_To ;
      AV101Anticipacionerrores_mantwwds_32_tfmantporc = AV56TFMAntPorc ;
      AV102Anticipacionerrores_mantwwds_33_tfmantporc_to = AV57TFMAntPorc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMAntId, AV27TFMAntId_To, AV28TFMAntEmprCod, AV29TFMAntEmprCod_Sel, AV30TFMAntCliCod, AV31TFMAntCliCod_To, AV32TFMAntCliNom, AV33TFMAntCliNom_Sel, AV34TFMAntArtCod, AV35TFMAntArtCod_Sel, AV36TFMAntArtDsc, AV37TFMAntArtDsc_Sel, AV38TFMAntColNom, AV39TFMAntColNom_Sel, AV40TFMAntColNum, AV41TFMAntColNum_To, AV42TFMAntColCod, AV43TFMAntColCod_To, AV44TFMAntMaqCod, AV45TFMAntMaqCod_Sel, AV46TFMAntMaqDsc, AV47TFMAntMaqDsc_Sel, AV48TFMAntTipMCod, AV49TFMAntTipMCod_Sel, AV50TFMAntTipMDsc, AV51TFMAntTipMDsc_Sel, AV52TFMAntKilProd, AV53TFMAntKilProd_To, AV54TFMAntKilReo, AV55TFMAntKilReo_To, AV56TFMAntPorc, AV57TFMAntPorc_To, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV65Pgmname = "AnticipacionErrores.MAntWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Pgmname", AV65Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e172DO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV58DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV60GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV61GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV65Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65Pgmname", AV65Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MAntWW");
         AV65Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65Pgmname", AV65Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV65Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("anticipacionerrores\\mantww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e172DO2 ();
      if (returnInSub) return;
   }

   public void e172DO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV66Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mantww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV66Station = GXt_char1 ;
      GXv_char2[0] = AV67Emprcod ;
      GXv_char3[0] = AV68Emprnom ;
      GXv_char4[0] = AV69Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV66Station, GXv_char2, GXv_char3, GXv_char4) ;
      mantww_impl.this.AV67Emprcod = GXv_char2[0] ;
      mantww_impl.this.AV68Emprnom = GXv_char3[0] ;
      mantww_impl.this.AV69Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " MAnt", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV58DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV58DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e182DO2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("AnticipacionErrores.MAntWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("AnticipacionErrores.MAntWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMAntId_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntId_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntEmprCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntEmprCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntEmprCo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntCliCod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntCliNom_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntArtCod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntArtDsc_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntColNom_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntColNum_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntColCod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntMaqCod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntMaqDsc_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntTipMCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntTipMCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntTipMCo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntTipMDs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntTipMDs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntTipMDs_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntKilPro_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntKilPro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntKilPro_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntKilReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntKilReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntKilReo_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtMAntPorc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntPorc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntPorc_Visible), 5, 0), !bGXsfl_39_Refreshing);
      AV60GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridCurrentPage), 10, 0));
      AV61GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridPageCount), 10, 0));
      AV70Anticipacionerrores_mantwwds_1_filterfulltext = AV15FilterFullText ;
      AV71Anticipacionerrores_mantwwds_2_tfmantid = AV26TFMAntId ;
      AV72Anticipacionerrores_mantwwds_3_tfmantid_to = AV27TFMAntId_To ;
      AV73Anticipacionerrores_mantwwds_4_tfmantemprcod = AV28TFMAntEmprCod ;
      AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV29TFMAntEmprCod_Sel ;
      AV75Anticipacionerrores_mantwwds_6_tfmantclicod = AV30TFMAntCliCod ;
      AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV31TFMAntCliCod_To ;
      AV77Anticipacionerrores_mantwwds_8_tfmantclinom = AV32TFMAntCliNom ;
      AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV33TFMAntCliNom_Sel ;
      AV79Anticipacionerrores_mantwwds_10_tfmantartcod = AV34TFMAntArtCod ;
      AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV35TFMAntArtCod_Sel ;
      AV81Anticipacionerrores_mantwwds_12_tfmantartdsc = AV36TFMAntArtDsc ;
      AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV37TFMAntArtDsc_Sel ;
      AV83Anticipacionerrores_mantwwds_14_tfmantcolnom = AV38TFMAntColNom ;
      AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV39TFMAntColNom_Sel ;
      AV85Anticipacionerrores_mantwwds_16_tfmantcolnum = AV40TFMAntColNum ;
      AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV41TFMAntColNum_To ;
      AV87Anticipacionerrores_mantwwds_18_tfmantcolcod = AV42TFMAntColCod ;
      AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV43TFMAntColCod_To ;
      AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV44TFMAntMaqCod ;
      AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV45TFMAntMaqCod_Sel ;
      AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV46TFMAntMaqDsc ;
      AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV47TFMAntMaqDsc_Sel ;
      AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV48TFMAntTipMCod ;
      AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV49TFMAntTipMCod_Sel ;
      AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV50TFMAntTipMDsc ;
      AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV51TFMAntTipMDsc_Sel ;
      AV97Anticipacionerrores_mantwwds_28_tfmantkilprod = AV52TFMAntKilProd ;
      AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV53TFMAntKilProd_To ;
      AV99Anticipacionerrores_mantwwds_30_tfmantkilreo = AV54TFMAntKilReo ;
      AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV55TFMAntKilReo_To ;
      AV101Anticipacionerrores_mantwwds_32_tfmantporc = AV56TFMAntPorc ;
      AV102Anticipacionerrores_mantwwds_33_tfmantporc_to = AV57TFMAntPorc_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e122DO2( )
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
         AV59PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV59PageToGo) ;
      }
   }

   public void e132DO2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142DO2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntId") == 0 )
         {
            AV26TFMAntId = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFMAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFMAntId), 10, 0));
            AV27TFMAntId_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFMAntId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFMAntId_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntEmprCod") == 0 )
         {
            AV28TFMAntEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFMAntEmprCod", AV28TFMAntEmprCod);
            AV29TFMAntEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFMAntEmprCod_Sel", AV29TFMAntEmprCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntCliCod") == 0 )
         {
            AV30TFMAntCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFMAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFMAntCliCod), 6, 0));
            AV31TFMAntCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFMAntCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFMAntCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntCliNom") == 0 )
         {
            AV32TFMAntCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFMAntCliNom", AV32TFMAntCliNom);
            AV33TFMAntCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFMAntCliNom_Sel", AV33TFMAntCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntArtCod") == 0 )
         {
            AV34TFMAntArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFMAntArtCod", AV34TFMAntArtCod);
            AV35TFMAntArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFMAntArtCod_Sel", AV35TFMAntArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntArtDsc") == 0 )
         {
            AV36TFMAntArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFMAntArtDsc", AV36TFMAntArtDsc);
            AV37TFMAntArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFMAntArtDsc_Sel", AV37TFMAntArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntColNom") == 0 )
         {
            AV38TFMAntColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFMAntColNom", AV38TFMAntColNom);
            AV39TFMAntColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFMAntColNom_Sel", AV39TFMAntColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntColNum") == 0 )
         {
            AV40TFMAntColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFMAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFMAntColNum), 6, 0));
            AV41TFMAntColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFMAntColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMAntColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntColCod") == 0 )
         {
            AV42TFMAntColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMAntColCod), 2, 0));
            AV43TFMAntColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMAntColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMAntColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntMaqCod") == 0 )
         {
            AV44TFMAntMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFMAntMaqCod", AV44TFMAntMaqCod);
            AV45TFMAntMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFMAntMaqCod_Sel", AV45TFMAntMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntMaqDsc") == 0 )
         {
            AV46TFMAntMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFMAntMaqDsc", AV46TFMAntMaqDsc);
            AV47TFMAntMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFMAntMaqDsc_Sel", AV47TFMAntMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntTipMCod") == 0 )
         {
            AV48TFMAntTipMCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFMAntTipMCod", AV48TFMAntTipMCod);
            AV49TFMAntTipMCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMAntTipMCod_Sel", AV49TFMAntTipMCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntTipMDsc") == 0 )
         {
            AV50TFMAntTipMDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFMAntTipMDsc", AV50TFMAntTipMDsc);
            AV51TFMAntTipMDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFMAntTipMDsc_Sel", AV51TFMAntTipMDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntKilProd") == 0 )
         {
            AV52TFMAntKilProd = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFMAntKilProd", GXutil.ltrimstr( AV52TFMAntKilProd, 12, 2));
            AV53TFMAntKilProd_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFMAntKilProd_To", GXutil.ltrimstr( AV53TFMAntKilProd_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntKilReo") == 0 )
         {
            AV54TFMAntKilReo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFMAntKilReo", GXutil.ltrimstr( AV54TFMAntKilReo, 12, 2));
            AV55TFMAntKilReo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFMAntKilReo_To", GXutil.ltrimstr( AV55TFMAntKilReo_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntPorc") == 0 )
         {
            AV56TFMAntPorc = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFMAntPorc", GXutil.ltrimstr( AV56TFMAntPorc, 7, 2));
            AV57TFMAntPorc_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFMAntPorc_To", GXutil.ltrimstr( AV57TFMAntPorc_To, 7, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e192DO2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      edtMAntEmprCo_Link = formatLink("app.anticipacionerrores.mantview", new String[] {GXutil.URLEncode(GXutil.ltrimstr(A14562MAntId,10,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"MAntId","TabCode"})  ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(39) ;
      }
      sendrow_392( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_39_Refreshing )
      {
         httpContext.doAjaxLoad(39, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV62GridActions, 4, 0)) );
   }

   public void e152DO2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "AnticipacionErrores.MAntWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e112DO2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("AnticipacionErrores.MAntWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV65Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AnticipacionErrores.MAntWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "AnticipacionErrores.MAntWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         mantww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV65Pgmname+"GridState", AV24ManageFiltersXml) ;
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

   public void e162DO2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.anticipacionerrores.mantwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      mantww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      mantww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntId", "", "Id", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntEmprCod", "", "Empresa", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntCliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntCliNom", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntArtCod", "", "Cód Artículo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntArtDsc", "", "Artículo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntColNum", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntColCod", "", "Tipo Colorante", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntMaqCod", "", "máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntMaqDsc", "", "Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntTipMCod", "", "Cód.  Tipo Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntTipMDsc", "", "Tipo Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntKilProd", "", "Kilos Produccion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntKilReo", "", "Kilos Reoperados", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntPorc", "", "Porc", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnticipacionErrores.MAntWWColumnsSelector", GXv_char4) ;
      mantww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "AnticipacionErrores.MAntWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFMAntId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFMAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFMAntId), 10, 0));
      AV27TFMAntId_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFMAntId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFMAntId_To), 10, 0));
      AV28TFMAntEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFMAntEmprCod", AV28TFMAntEmprCod);
      AV29TFMAntEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFMAntEmprCod_Sel", AV29TFMAntEmprCod_Sel);
      AV30TFMAntCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFMAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFMAntCliCod), 6, 0));
      AV31TFMAntCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFMAntCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFMAntCliCod_To), 6, 0));
      AV32TFMAntCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFMAntCliNom", AV32TFMAntCliNom);
      AV33TFMAntCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFMAntCliNom_Sel", AV33TFMAntCliNom_Sel);
      AV34TFMAntArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFMAntArtCod", AV34TFMAntArtCod);
      AV35TFMAntArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFMAntArtCod_Sel", AV35TFMAntArtCod_Sel);
      AV36TFMAntArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFMAntArtDsc", AV36TFMAntArtDsc);
      AV37TFMAntArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFMAntArtDsc_Sel", AV37TFMAntArtDsc_Sel);
      AV38TFMAntColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFMAntColNom", AV38TFMAntColNom);
      AV39TFMAntColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFMAntColNom_Sel", AV39TFMAntColNom_Sel);
      AV40TFMAntColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFMAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFMAntColNum), 6, 0));
      AV41TFMAntColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFMAntColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMAntColNum_To), 6, 0));
      AV42TFMAntColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFMAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMAntColCod), 2, 0));
      AV43TFMAntColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFMAntColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMAntColCod_To), 2, 0));
      AV44TFMAntMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFMAntMaqCod", AV44TFMAntMaqCod);
      AV45TFMAntMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFMAntMaqCod_Sel", AV45TFMAntMaqCod_Sel);
      AV46TFMAntMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFMAntMaqDsc", AV46TFMAntMaqDsc);
      AV47TFMAntMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFMAntMaqDsc_Sel", AV47TFMAntMaqDsc_Sel);
      AV48TFMAntTipMCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFMAntTipMCod", AV48TFMAntTipMCod);
      AV49TFMAntTipMCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFMAntTipMCod_Sel", AV49TFMAntTipMCod_Sel);
      AV50TFMAntTipMDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFMAntTipMDsc", AV50TFMAntTipMDsc);
      AV51TFMAntTipMDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFMAntTipMDsc_Sel", AV51TFMAntTipMDsc_Sel);
      AV52TFMAntKilProd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFMAntKilProd", GXutil.ltrimstr( AV52TFMAntKilProd, 12, 2));
      AV53TFMAntKilProd_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFMAntKilProd_To", GXutil.ltrimstr( AV53TFMAntKilProd_To, 12, 2));
      AV54TFMAntKilReo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFMAntKilReo", GXutil.ltrimstr( AV54TFMAntKilReo, 12, 2));
      AV55TFMAntKilReo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFMAntKilReo_To", GXutil.ltrimstr( AV55TFMAntKilReo_To, 12, 2));
      AV56TFMAntPorc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFMAntPorc", GXutil.ltrimstr( AV56TFMAntPorc, 7, 2));
      AV57TFMAntPorc_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFMAntPorc_To", GXutil.ltrimstr( AV57TFMAntPorc_To, 7, 2));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.anticipacionerrores.mant", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.ltrimstr(A14562MAntId,10,0))}, new String[] {"Mode","MAntId"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.anticipacionerrores.mant", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.ltrimstr(A14562MAntId,10,0))}, new String[] {"Mode","MAntId"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV65Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV65Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV65Pgmname+"GridState"), null, null);
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
      AV103GXV1 = 1 ;
      while ( AV103GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTID") == 0 )
         {
            AV26TFMAntId = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFMAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFMAntId), 10, 0));
            AV27TFMAntId_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFMAntId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFMAntId_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEMPRCOD") == 0 )
         {
            AV28TFMAntEmprCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFMAntEmprCod", AV28TFMAntEmprCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEMPRCOD_SEL") == 0 )
         {
            AV29TFMAntEmprCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFMAntEmprCod_Sel", AV29TFMAntEmprCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLICOD") == 0 )
         {
            AV30TFMAntCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFMAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFMAntCliCod), 6, 0));
            AV31TFMAntCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFMAntCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFMAntCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLINOM") == 0 )
         {
            AV32TFMAntCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFMAntCliNom", AV32TFMAntCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLINOM_SEL") == 0 )
         {
            AV33TFMAntCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFMAntCliNom_Sel", AV33TFMAntCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTCOD") == 0 )
         {
            AV34TFMAntArtCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFMAntArtCod", AV34TFMAntArtCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTCOD_SEL") == 0 )
         {
            AV35TFMAntArtCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFMAntArtCod_Sel", AV35TFMAntArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTDSC") == 0 )
         {
            AV36TFMAntArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFMAntArtDsc", AV36TFMAntArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTDSC_SEL") == 0 )
         {
            AV37TFMAntArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFMAntArtDsc_Sel", AV37TFMAntArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM") == 0 )
         {
            AV38TFMAntColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFMAntColNom", AV38TFMAntColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM_SEL") == 0 )
         {
            AV39TFMAntColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFMAntColNom_Sel", AV39TFMAntColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNUM") == 0 )
         {
            AV40TFMAntColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFMAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFMAntColNum), 6, 0));
            AV41TFMAntColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFMAntColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMAntColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLCOD") == 0 )
         {
            AV42TFMAntColCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMAntColCod), 2, 0));
            AV43TFMAntColCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMAntColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMAntColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQCOD") == 0 )
         {
            AV44TFMAntMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFMAntMaqCod", AV44TFMAntMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQCOD_SEL") == 0 )
         {
            AV45TFMAntMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFMAntMaqCod_Sel", AV45TFMAntMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQDSC") == 0 )
         {
            AV46TFMAntMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFMAntMaqDsc", AV46TFMAntMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQDSC_SEL") == 0 )
         {
            AV47TFMAntMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFMAntMaqDsc_Sel", AV47TFMAntMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMCOD") == 0 )
         {
            AV48TFMAntTipMCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFMAntTipMCod", AV48TFMAntTipMCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMCOD_SEL") == 0 )
         {
            AV49TFMAntTipMCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMAntTipMCod_Sel", AV49TFMAntTipMCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMDSC") == 0 )
         {
            AV50TFMAntTipMDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFMAntTipMDsc", AV50TFMAntTipMDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMDSC_SEL") == 0 )
         {
            AV51TFMAntTipMDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFMAntTipMDsc_Sel", AV51TFMAntTipMDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILPROD") == 0 )
         {
            AV52TFMAntKilProd = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFMAntKilProd", GXutil.ltrimstr( AV52TFMAntKilProd, 12, 2));
            AV53TFMAntKilProd_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFMAntKilProd_To", GXutil.ltrimstr( AV53TFMAntKilProd_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILREO") == 0 )
         {
            AV54TFMAntKilReo = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFMAntKilReo", GXutil.ltrimstr( AV54TFMAntKilReo, 12, 2));
            AV55TFMAntKilReo_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFMAntKilReo_To", GXutil.ltrimstr( AV55TFMAntKilReo_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTPORC") == 0 )
         {
            AV56TFMAntPorc = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFMAntPorc", GXutil.ltrimstr( AV56TFMAntPorc, 7, 2));
            AV57TFMAntPorc_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFMAntPorc_To", GXutil.ltrimstr( AV57TFMAntPorc_To, 7, 2));
         }
         AV103GXV1 = (int)(AV103GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFMAntEmprCod_Sel)==0), AV29TFMAntEmprCod_Sel, GXv_char4) ;
      mantww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFMAntCliNom_Sel)==0), AV33TFMAntCliNom_Sel, GXv_char3) ;
      mantww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFMAntArtCod_Sel)==0), AV35TFMAntArtCod_Sel, GXv_char2) ;
      mantww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFMAntArtDsc_Sel)==0), AV37TFMAntArtDsc_Sel, GXv_char15) ;
      mantww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFMAntColNom_Sel)==0), AV39TFMAntColNom_Sel, GXv_char17) ;
      mantww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFMAntMaqCod_Sel)==0), AV45TFMAntMaqCod_Sel, GXv_char19) ;
      mantww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFMAntMaqDsc_Sel)==0), AV47TFMAntMaqDsc_Sel, GXv_char21) ;
      mantww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFMAntTipMCod_Sel)==0), AV49TFMAntTipMCod_Sel, GXv_char23) ;
      mantww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFMAntTipMDsc_Sel)==0), AV51TFMAntTipMDsc_Sel, GXv_char25) ;
      mantww_impl.this.GXt_char24 = GXv_char25[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|||"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFMAntEmprCod)==0), AV28TFMAntEmprCod, GXv_char25) ;
      mantww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFMAntCliNom)==0), AV32TFMAntCliNom, GXv_char23) ;
      mantww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFMAntArtCod)==0), AV34TFMAntArtCod, GXv_char21) ;
      mantww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFMAntArtDsc)==0), AV36TFMAntArtDsc, GXv_char19) ;
      mantww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFMAntColNom)==0), AV38TFMAntColNom, GXv_char17) ;
      mantww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFMAntMaqCod)==0), AV44TFMAntMaqCod, GXv_char15) ;
      mantww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFMAntMaqDsc)==0), AV46TFMAntMaqDsc, GXv_char4) ;
      mantww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFMAntTipMCod)==0), AV48TFMAntTipMCod, GXv_char3) ;
      mantww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFMAntTipMDsc)==0), AV50TFMAntTipMDsc, GXv_char2) ;
      mantww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFMAntId) ? "" : GXutil.str( AV26TFMAntId, 10, 0))+"|"+GXt_char24+"|"+((0==AV30TFMAntCliCod) ? "" : GXutil.str( AV30TFMAntCliCod, 6, 0))+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+((0==AV40TFMAntColNum) ? "" : GXutil.str( AV40TFMAntColNum, 6, 0))+"|"+((0==AV42TFMAntColCod) ? "" : GXutil.str( AV42TFMAntColCod, 2, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMAntKilProd)==0) ? "" : GXutil.str( AV52TFMAntKilProd, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFMAntKilReo)==0) ? "" : GXutil.str( AV54TFMAntKilReo, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFMAntPorc)==0) ? "" : GXutil.str( AV56TFMAntPorc, 7, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFMAntId_To) ? "" : GXutil.str( AV27TFMAntId_To, 10, 0))+"||"+((0==AV31TFMAntCliCod_To) ? "" : GXutil.str( AV31TFMAntCliCod_To, 6, 0))+"|||||"+((0==AV41TFMAntColNum_To) ? "" : GXutil.str( AV41TFMAntColNum_To, 6, 0))+"|"+((0==AV43TFMAntColCod_To) ? "" : GXutil.str( AV43TFMAntColCod_To, 2, 0))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFMAntKilProd_To)==0) ? "" : GXutil.str( AV53TFMAntKilProd_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFMAntKilReo_To)==0) ? "" : GXutil.str( AV55TFMAntKilReo_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFMAntPorc_To)==0) ? "" : GXutil.str( AV57TFMAntPorc_To, 7, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV65Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTID", "", !((0==AV26TFMAntId)&&(0==AV27TFMAntId_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFMAntId, 10, 0)), GXutil.trim( GXutil.str( AV27TFMAntId_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTEMPRCOD", "", !(GXutil.strcmp("", AV28TFMAntEmprCod)==0), (short)(0), AV28TFMAntEmprCod, "", !(GXutil.strcmp("", AV29TFMAntEmprCod_Sel)==0), AV29TFMAntEmprCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTCLICOD", "", !((0==AV30TFMAntCliCod)&&(0==AV31TFMAntCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFMAntCliCod, 6, 0)), GXutil.trim( GXutil.str( AV31TFMAntCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTCLINOM", "", !(GXutil.strcmp("", AV32TFMAntCliNom)==0), (short)(0), AV32TFMAntCliNom, "", !(GXutil.strcmp("", AV33TFMAntCliNom_Sel)==0), AV33TFMAntCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTARTCOD", "", !(GXutil.strcmp("", AV34TFMAntArtCod)==0), (short)(0), AV34TFMAntArtCod, "", !(GXutil.strcmp("", AV35TFMAntArtCod_Sel)==0), AV35TFMAntArtCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTARTDSC", "", !(GXutil.strcmp("", AV36TFMAntArtDsc)==0), (short)(0), AV36TFMAntArtDsc, "", !(GXutil.strcmp("", AV37TFMAntArtDsc_Sel)==0), AV37TFMAntArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTCOLNOM", "", !(GXutil.strcmp("", AV38TFMAntColNom)==0), (short)(0), AV38TFMAntColNom, "", !(GXutil.strcmp("", AV39TFMAntColNom_Sel)==0), AV39TFMAntColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTCOLNUM", "", !((0==AV40TFMAntColNum)&&(0==AV41TFMAntColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFMAntColNum, 6, 0)), GXutil.trim( GXutil.str( AV41TFMAntColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTCOLCOD", "", !((0==AV42TFMAntColCod)&&(0==AV43TFMAntColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFMAntColCod, 2, 0)), GXutil.trim( GXutil.str( AV43TFMAntColCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTMAQCOD", "", !(GXutil.strcmp("", AV44TFMAntMaqCod)==0), (short)(0), AV44TFMAntMaqCod, "", !(GXutil.strcmp("", AV45TFMAntMaqCod_Sel)==0), AV45TFMAntMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTMAQDSC", "", !(GXutil.strcmp("", AV46TFMAntMaqDsc)==0), (short)(0), AV46TFMAntMaqDsc, "", !(GXutil.strcmp("", AV47TFMAntMaqDsc_Sel)==0), AV47TFMAntMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTTIPMCOD", "", !(GXutil.strcmp("", AV48TFMAntTipMCod)==0), (short)(0), AV48TFMAntTipMCod, "", !(GXutil.strcmp("", AV49TFMAntTipMCod_Sel)==0), AV49TFMAntTipMCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTTIPMDSC", "", !(GXutil.strcmp("", AV50TFMAntTipMDsc)==0), (short)(0), AV50TFMAntTipMDsc, "", !(GXutil.strcmp("", AV51TFMAntTipMDsc_Sel)==0), AV51TFMAntTipMDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTKILPROD", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMAntKilProd)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFMAntKilProd_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFMAntKilProd, 12, 2)), GXutil.trim( GXutil.str( AV53TFMAntKilProd_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTKILREO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFMAntKilReo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFMAntKilReo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV54TFMAntKilReo, 12, 2)), GXutil.trim( GXutil.str( AV55TFMAntKilReo_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTPORC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFMAntPorc)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFMAntPorc_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV56TFMAntPorc, 7, 2)), GXutil.trim( GXutil.str( AV57TFMAntPorc_To, 7, 2))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV65Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV65Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "AnticipacionErrores.MAnt" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_21_2DO2( boolean wbgen )
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
         wb_table2_26_2DO2( true) ;
      }
      else
      {
         wb_table2_26_2DO2( false) ;
      }
      return  ;
   }

   public void wb_table2_26_2DO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_2DO2e( true) ;
      }
      else
      {
         wb_table1_21_2DO2e( false) ;
      }
   }

   public void wb_table2_26_2DO2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_AnticipacionErrores\\MAntWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_26_2DO2e( true) ;
      }
      else
      {
         wb_table2_26_2DO2e( false) ;
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
      pa2DO2( ) ;
      ws2DO2( ) ;
      we2DO2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116154229", true, true);
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
      httpContext.AddJavascriptSource("anticipacionerrores/mantww.js", "?202682116154229", false, true);
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

   public void subsflControlProps_392( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_39_idx );
      edtMAntId_Internalname = "MANTID_"+sGXsfl_39_idx ;
      edtMAntEmprCo_Internalname = "MANTEMPRCO_"+sGXsfl_39_idx ;
      edtMAntCliCod_Internalname = "MANTCLICOD_"+sGXsfl_39_idx ;
      edtMAntCliNom_Internalname = "MANTCLINOM_"+sGXsfl_39_idx ;
      edtMAntArtCod_Internalname = "MANTARTCOD_"+sGXsfl_39_idx ;
      edtMAntArtDsc_Internalname = "MANTARTDSC_"+sGXsfl_39_idx ;
      edtMAntColNom_Internalname = "MANTCOLNOM_"+sGXsfl_39_idx ;
      edtMAntColNum_Internalname = "MANTCOLNUM_"+sGXsfl_39_idx ;
      edtMAntColCod_Internalname = "MANTCOLCOD_"+sGXsfl_39_idx ;
      edtMAntMaqCod_Internalname = "MANTMAQCOD_"+sGXsfl_39_idx ;
      edtMAntMaqDsc_Internalname = "MANTMAQDSC_"+sGXsfl_39_idx ;
      edtMAntTipMCo_Internalname = "MANTTIPMCO_"+sGXsfl_39_idx ;
      edtMAntTipMDs_Internalname = "MANTTIPMDS_"+sGXsfl_39_idx ;
      edtMAntKilPro_Internalname = "MANTKILPRO_"+sGXsfl_39_idx ;
      edtMAntKilReo_Internalname = "MANTKILREO_"+sGXsfl_39_idx ;
      edtMAntPorc_Internalname = "MANTPORC_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_39_fel_idx );
      edtMAntId_Internalname = "MANTID_"+sGXsfl_39_fel_idx ;
      edtMAntEmprCo_Internalname = "MANTEMPRCO_"+sGXsfl_39_fel_idx ;
      edtMAntCliCod_Internalname = "MANTCLICOD_"+sGXsfl_39_fel_idx ;
      edtMAntCliNom_Internalname = "MANTCLINOM_"+sGXsfl_39_fel_idx ;
      edtMAntArtCod_Internalname = "MANTARTCOD_"+sGXsfl_39_fel_idx ;
      edtMAntArtDsc_Internalname = "MANTARTDSC_"+sGXsfl_39_fel_idx ;
      edtMAntColNom_Internalname = "MANTCOLNOM_"+sGXsfl_39_fel_idx ;
      edtMAntColNum_Internalname = "MANTCOLNUM_"+sGXsfl_39_fel_idx ;
      edtMAntColCod_Internalname = "MANTCOLCOD_"+sGXsfl_39_fel_idx ;
      edtMAntMaqCod_Internalname = "MANTMAQCOD_"+sGXsfl_39_fel_idx ;
      edtMAntMaqDsc_Internalname = "MANTMAQDSC_"+sGXsfl_39_fel_idx ;
      edtMAntTipMCo_Internalname = "MANTTIPMCO_"+sGXsfl_39_fel_idx ;
      edtMAntTipMDs_Internalname = "MANTTIPMDS_"+sGXsfl_39_fel_idx ;
      edtMAntKilPro_Internalname = "MANTKILPRO_"+sGXsfl_39_fel_idx ;
      edtMAntKilReo_Internalname = "MANTKILREO_"+sGXsfl_39_fel_idx ;
      edtMAntPorc_Internalname = "MANTPORC_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wb2DO0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_39_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_39_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_39_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'',false,'"+sGXsfl_39_idx+"',39)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_39_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV62GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV62GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV62GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e202do2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,40);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV62GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_39_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntId_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntId_Internalname,GXutil.ltrim( localUtil.ntoc( A14562MAntId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14562MAntId), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntId_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"AnticipacionErrores\\Id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntEmprCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntEmprCo_Internalname,GXutil.rtrim( A14566MAntEmprCo),"","","'"+""+"'"+",false,"+"'"+""+"'",edtMAntEmprCo_Link,"","","",edtMAntEmprCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntEmprCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A14565MAntCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14565MAntCliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntCliNom_Internalname,A14611MAntCliNom,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntArtCod_Internalname,GXutil.rtrim( A14567MAntArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntArtDsc_Internalname,A14613MAntArtDsc,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntColNom_Internalname,GXutil.rtrim( A14623MAntColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A14568MAntColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14568MAntColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A14642MAntColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14642MAntColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntMaqCod_Internalname,GXutil.rtrim( A14570MAntMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntMaqDsc_Internalname,A14610MAntMaqDsc,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntTipMCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntTipMCo_Internalname,GXutil.rtrim( A14569MAntTipMCo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntTipMCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntTipMCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntTipMDs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntTipMDs_Internalname,A14612MAntTipMDs,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntTipMDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntTipMDs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntKilPro_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntKilPro_Internalname,GXutil.ltrim( localUtil.ntoc( A14643MAntKilPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14643MAntKilPro, "ZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntKilPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntKilPro_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntKilReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntKilReo_Internalname,GXutil.ltrim( localUtil.ntoc( A14644MAntKilReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14644MAntKilReo, "ZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntKilReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntKilReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntPorc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntPorc_Internalname,GXutil.ltrim( localUtil.ntoc( A14645MAntPorc, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14645MAntPorc, "ZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMAntPorc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntPorc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2DO2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      /* End function sendrow_392 */
   }

   public void startgridcontrol39( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"39\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntId_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Id", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntEmprCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntColCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Colorante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntTipMCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód.  Tipo Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntTipMDs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntKilPro_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Produccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntKilReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Reoperados", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntPorc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Porc", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV62GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14562MAntId, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntId_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14566MAntEmprCo));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtMAntEmprCo_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntEmprCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14565MAntCliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14611MAntCliNom);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14567MAntArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14613MAntArtDsc);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntArtDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14623MAntColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14568MAntColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14642MAntColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntColCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14570MAntMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14610MAntMaqDsc);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14569MAntTipMCo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntTipMCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14612MAntTipMDs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntTipMDs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14643MAntKilPro, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntKilPro_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14644MAntKilReo, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntKilReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14645MAntPorc, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntPorc_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtMAntId_Internalname = "MANTID" ;
      edtMAntEmprCo_Internalname = "MANTEMPRCO" ;
      edtMAntCliCod_Internalname = "MANTCLICOD" ;
      edtMAntCliNom_Internalname = "MANTCLINOM" ;
      edtMAntArtCod_Internalname = "MANTARTCOD" ;
      edtMAntArtDsc_Internalname = "MANTARTDSC" ;
      edtMAntColNom_Internalname = "MANTCOLNOM" ;
      edtMAntColNum_Internalname = "MANTCOLNUM" ;
      edtMAntColCod_Internalname = "MANTCOLCOD" ;
      edtMAntMaqCod_Internalname = "MANTMAQCOD" ;
      edtMAntMaqDsc_Internalname = "MANTMAQDSC" ;
      edtMAntTipMCo_Internalname = "MANTTIPMCO" ;
      edtMAntTipMDs_Internalname = "MANTTIPMDS" ;
      edtMAntKilPro_Internalname = "MANTKILPRO" ;
      edtMAntKilReo_Internalname = "MANTKILREO" ;
      edtMAntPorc_Internalname = "MANTPORC" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
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
      edtMAntPorc_Jsonclick = "" ;
      edtMAntKilReo_Jsonclick = "" ;
      edtMAntKilPro_Jsonclick = "" ;
      edtMAntTipMDs_Jsonclick = "" ;
      edtMAntTipMCo_Jsonclick = "" ;
      edtMAntMaqDsc_Jsonclick = "" ;
      edtMAntMaqCod_Jsonclick = "" ;
      edtMAntColCod_Jsonclick = "" ;
      edtMAntColNum_Jsonclick = "" ;
      edtMAntColNom_Jsonclick = "" ;
      edtMAntArtDsc_Jsonclick = "" ;
      edtMAntArtCod_Jsonclick = "" ;
      edtMAntCliNom_Jsonclick = "" ;
      edtMAntCliCod_Jsonclick = "" ;
      edtMAntEmprCo_Jsonclick = "" ;
      edtMAntEmprCo_Link = "" ;
      edtMAntId_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtMAntPorc_Visible = -1 ;
      edtMAntKilReo_Visible = -1 ;
      edtMAntKilPro_Visible = -1 ;
      edtMAntTipMDs_Visible = -1 ;
      edtMAntTipMCo_Visible = -1 ;
      edtMAntMaqDsc_Visible = -1 ;
      edtMAntMaqCod_Visible = -1 ;
      edtMAntColCod_Visible = -1 ;
      edtMAntColNum_Visible = -1 ;
      edtMAntColNom_Visible = -1 ;
      edtMAntArtDsc_Visible = -1 ;
      edtMAntArtCod_Visible = -1 ;
      edtMAntCliNom_Visible = -1 ;
      edtMAntCliCod_Visible = -1 ;
      edtMAntEmprCo_Visible = -1 ;
      edtMAntId_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "AnticipacionErrores.MAntWWGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic|||" ;
      Ddo_grid_Includedatalist = "|T||T|T|T|T|||T|T|T|T|||" ;
      Ddo_grid_Filterisrange = "T||T|||||T|T|||||T|T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Numeric|Character|Character|Character|Character|Numeric|Numeric|Character|Character|Character|Character|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11|12|13|14|15|" ;
      Ddo_grid_Columnids = "1:MAntId|2:MAntEmprCod|3:MAntCliCod|4:MAntCliNom|5:MAntArtCod|6:MAntArtDsc|7:MAntColNom|8:MAntColNum|9:MAntColCod|10:MAntMaqCod|11:MAntMaqDsc|12:MAntTipMCod|13:MAntTipMDsc|14:MAntKilProd|15:MAntKilReo|16:MAntPorc" ;
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
      Form.setCaption( httpContext.getMessage( " MAnt", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_39_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV62GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV62GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV27TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV28TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV29TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV30TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV31TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV33TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV34TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV35TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV36TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV37TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV38TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV39TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV40TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV43TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV44TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV45TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV46TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV47TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV48TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV49TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV50TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV51TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV52TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV53TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV54TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV56TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV57TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMAntId_Visible',ctrl:'MANTID',prop:'Visible'},{av:'edtMAntEmprCo_Visible',ctrl:'MANTEMPRCO',prop:'Visible'},{av:'edtMAntCliCod_Visible',ctrl:'MANTCLICOD',prop:'Visible'},{av:'edtMAntCliNom_Visible',ctrl:'MANTCLINOM',prop:'Visible'},{av:'edtMAntArtCod_Visible',ctrl:'MANTARTCOD',prop:'Visible'},{av:'edtMAntArtDsc_Visible',ctrl:'MANTARTDSC',prop:'Visible'},{av:'edtMAntColNom_Visible',ctrl:'MANTCOLNOM',prop:'Visible'},{av:'edtMAntColNum_Visible',ctrl:'MANTCOLNUM',prop:'Visible'},{av:'edtMAntColCod_Visible',ctrl:'MANTCOLCOD',prop:'Visible'},{av:'edtMAntMaqCod_Visible',ctrl:'MANTMAQCOD',prop:'Visible'},{av:'edtMAntMaqDsc_Visible',ctrl:'MANTMAQDSC',prop:'Visible'},{av:'edtMAntTipMCo_Visible',ctrl:'MANTTIPMCO',prop:'Visible'},{av:'edtMAntTipMDs_Visible',ctrl:'MANTTIPMDS',prop:'Visible'},{av:'edtMAntKilPro_Visible',ctrl:'MANTKILPRO',prop:'Visible'},{av:'edtMAntKilReo_Visible',ctrl:'MANTKILREO',prop:'Visible'},{av:'edtMAntPorc_Visible',ctrl:'MANTPORC',prop:'Visible'},{av:'AV60GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV61GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122DO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV27TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV28TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV29TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV30TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV31TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV33TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV34TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV35TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV36TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV37TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV38TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV39TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV40TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV43TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV44TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV45TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV46TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV47TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV48TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV49TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV50TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV51TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV52TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV53TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV54TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV56TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV57TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132DO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV27TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV28TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV29TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV30TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV31TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV33TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV34TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV35TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV36TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV37TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV38TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV39TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV40TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV43TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV44TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV45TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV46TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV47TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV48TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV49TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV50TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV51TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV52TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV53TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV54TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV56TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV57TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142DO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV27TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV28TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV29TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV30TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV31TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV33TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV34TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV35TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV36TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV37TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV38TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV39TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV40TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV43TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV44TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV45TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV46TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV47TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV48TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV49TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV50TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV51TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV52TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV53TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV54TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV56TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV57TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV57TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV54TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV52TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV53TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV51TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV48TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV49TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV46TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV47TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV44TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV45TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV42TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV43TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV40TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV39TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV36TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV37TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV34TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV35TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV32TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV33TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV30TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV31TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV28TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV29TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV26TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV27TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e192DO2',iparms:[{av:'A14562MAntId',fld:'MANTID',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV62GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtMAntEmprCo_Link',ctrl:'MANTEMPRCO',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152DO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV27TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV28TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV29TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV30TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV31TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV33TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV34TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV35TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV36TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV37TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV38TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV39TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV40TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV43TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV44TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV45TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV46TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV47TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV48TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV49TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV50TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV51TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV52TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV53TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV54TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV56TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV57TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMAntId_Visible',ctrl:'MANTID',prop:'Visible'},{av:'edtMAntEmprCo_Visible',ctrl:'MANTEMPRCO',prop:'Visible'},{av:'edtMAntCliCod_Visible',ctrl:'MANTCLICOD',prop:'Visible'},{av:'edtMAntCliNom_Visible',ctrl:'MANTCLINOM',prop:'Visible'},{av:'edtMAntArtCod_Visible',ctrl:'MANTARTCOD',prop:'Visible'},{av:'edtMAntArtDsc_Visible',ctrl:'MANTARTDSC',prop:'Visible'},{av:'edtMAntColNom_Visible',ctrl:'MANTCOLNOM',prop:'Visible'},{av:'edtMAntColNum_Visible',ctrl:'MANTCOLNUM',prop:'Visible'},{av:'edtMAntColCod_Visible',ctrl:'MANTCOLCOD',prop:'Visible'},{av:'edtMAntMaqCod_Visible',ctrl:'MANTMAQCOD',prop:'Visible'},{av:'edtMAntMaqDsc_Visible',ctrl:'MANTMAQDSC',prop:'Visible'},{av:'edtMAntTipMCo_Visible',ctrl:'MANTTIPMCO',prop:'Visible'},{av:'edtMAntTipMDs_Visible',ctrl:'MANTTIPMDS',prop:'Visible'},{av:'edtMAntKilPro_Visible',ctrl:'MANTKILPRO',prop:'Visible'},{av:'edtMAntKilReo_Visible',ctrl:'MANTKILREO',prop:'Visible'},{av:'edtMAntPorc_Visible',ctrl:'MANTPORC',prop:'Visible'},{av:'AV60GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV61GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112DO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV27TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV28TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV29TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV30TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV31TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV33TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV34TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV35TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV36TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV37TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV38TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV39TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV40TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV43TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV44TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV45TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV46TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV47TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV48TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV49TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV50TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV51TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV52TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV53TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV54TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV56TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV57TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV27TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV28TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV29TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV30TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV31TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV33TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV34TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV35TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV36TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV37TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV38TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV39TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV40TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV43TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV44TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV45TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV46TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV47TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV48TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV49TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV50TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV51TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV52TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV53TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV54TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV56TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV57TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMAntId_Visible',ctrl:'MANTID',prop:'Visible'},{av:'edtMAntEmprCo_Visible',ctrl:'MANTEMPRCO',prop:'Visible'},{av:'edtMAntCliCod_Visible',ctrl:'MANTCLICOD',prop:'Visible'},{av:'edtMAntCliNom_Visible',ctrl:'MANTCLINOM',prop:'Visible'},{av:'edtMAntArtCod_Visible',ctrl:'MANTARTCOD',prop:'Visible'},{av:'edtMAntArtDsc_Visible',ctrl:'MANTARTDSC',prop:'Visible'},{av:'edtMAntColNom_Visible',ctrl:'MANTCOLNOM',prop:'Visible'},{av:'edtMAntColNum_Visible',ctrl:'MANTCOLNUM',prop:'Visible'},{av:'edtMAntColCod_Visible',ctrl:'MANTCOLCOD',prop:'Visible'},{av:'edtMAntMaqCod_Visible',ctrl:'MANTMAQCOD',prop:'Visible'},{av:'edtMAntMaqDsc_Visible',ctrl:'MANTMAQDSC',prop:'Visible'},{av:'edtMAntTipMCo_Visible',ctrl:'MANTTIPMCO',prop:'Visible'},{av:'edtMAntTipMDs_Visible',ctrl:'MANTTIPMDS',prop:'Visible'},{av:'edtMAntKilPro_Visible',ctrl:'MANTKILPRO',prop:'Visible'},{av:'edtMAntKilReo_Visible',ctrl:'MANTKILREO',prop:'Visible'},{av:'edtMAntPorc_Visible',ctrl:'MANTPORC',prop:'Visible'},{av:'AV60GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV61GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e202DO2',iparms:[{av:'cmbavGridactions'},{av:'AV62GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A14562MAntId',fld:'MANTID',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV62GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e162DO2',iparms:[{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV33TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV35TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV37TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV39TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV45TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV47TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV49TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV51TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV26TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV28TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV30TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV32TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV34TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV36TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV38TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV40TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV42TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV44TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV46TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV48TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV50TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV52TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV54TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV56TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV27TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV31TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV43TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV53TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV57TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV27TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV28TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV29TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV30TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV31TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV33TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV34TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV35TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV36TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV37TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV38TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV39TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV40TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV41TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV43TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV44TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV45TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV46TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV47TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV48TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV49TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV50TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV51TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV52TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV53TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV54TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV56TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV57TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_MANTKILREO","{handler:'valid_Mantkilreo',iparms:[]");
      setEventMetadata("VALID_MANTKILREO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mantporc',iparms:[]");
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
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFMAntEmprCod = "" ;
      AV29TFMAntEmprCod_Sel = "" ;
      AV32TFMAntCliNom = "" ;
      AV33TFMAntCliNom_Sel = "" ;
      AV34TFMAntArtCod = "" ;
      AV35TFMAntArtCod_Sel = "" ;
      AV36TFMAntArtDsc = "" ;
      AV37TFMAntArtDsc_Sel = "" ;
      AV38TFMAntColNom = "" ;
      AV39TFMAntColNom_Sel = "" ;
      AV44TFMAntMaqCod = "" ;
      AV45TFMAntMaqCod_Sel = "" ;
      AV46TFMAntMaqDsc = "" ;
      AV47TFMAntMaqDsc_Sel = "" ;
      AV48TFMAntTipMCod = "" ;
      AV49TFMAntTipMCod_Sel = "" ;
      AV50TFMAntTipMDsc = "" ;
      AV51TFMAntTipMDsc_Sel = "" ;
      AV52TFMAntKilProd = DecimalUtil.ZERO ;
      AV53TFMAntKilProd_To = DecimalUtil.ZERO ;
      AV54TFMAntKilReo = DecimalUtil.ZERO ;
      AV55TFMAntKilReo_To = DecimalUtil.ZERO ;
      AV56TFMAntPorc = DecimalUtil.ZERO ;
      AV57TFMAntPorc_To = DecimalUtil.ZERO ;
      AV65Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV58DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A14646MAntKilTot = DecimalUtil.ZERO ;
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
      bttBtneditcolumns_Jsonclick = "" ;
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
      A14566MAntEmprCo = "" ;
      A14611MAntCliNom = "" ;
      A14567MAntArtCod = "" ;
      A14613MAntArtDsc = "" ;
      A14623MAntColNom = "" ;
      A14570MAntMaqCod = "" ;
      A14610MAntMaqDsc = "" ;
      A14569MAntTipMCo = "" ;
      A14612MAntTipMDs = "" ;
      A14643MAntKilPro = DecimalUtil.ZERO ;
      A14644MAntKilReo = DecimalUtil.ZERO ;
      A14645MAntPorc = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV70Anticipacionerrores_mantwwds_1_filterfulltext = "" ;
      lV73Anticipacionerrores_mantwwds_4_tfmantemprcod = "" ;
      lV77Anticipacionerrores_mantwwds_8_tfmantclinom = "" ;
      lV79Anticipacionerrores_mantwwds_10_tfmantartcod = "" ;
      lV81Anticipacionerrores_mantwwds_12_tfmantartdsc = "" ;
      lV83Anticipacionerrores_mantwwds_14_tfmantcolnom = "" ;
      lV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = "" ;
      lV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = "" ;
      lV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = "" ;
      lV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = "" ;
      AV70Anticipacionerrores_mantwwds_1_filterfulltext = "" ;
      AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = "" ;
      AV73Anticipacionerrores_mantwwds_4_tfmantemprcod = "" ;
      AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel = "" ;
      AV77Anticipacionerrores_mantwwds_8_tfmantclinom = "" ;
      AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel = "" ;
      AV79Anticipacionerrores_mantwwds_10_tfmantartcod = "" ;
      AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = "" ;
      AV81Anticipacionerrores_mantwwds_12_tfmantartdsc = "" ;
      AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = "" ;
      AV83Anticipacionerrores_mantwwds_14_tfmantcolnom = "" ;
      AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = "" ;
      AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod = "" ;
      AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = "" ;
      AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc = "" ;
      AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = "" ;
      AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod = "" ;
      AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = "" ;
      AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc = "" ;
      AV97Anticipacionerrores_mantwwds_28_tfmantkilprod = DecimalUtil.ZERO ;
      AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to = DecimalUtil.ZERO ;
      AV99Anticipacionerrores_mantwwds_30_tfmantkilreo = DecimalUtil.ZERO ;
      AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to = DecimalUtil.ZERO ;
      AV101Anticipacionerrores_mantwwds_32_tfmantporc = DecimalUtil.ZERO ;
      AV102Anticipacionerrores_mantwwds_33_tfmantporc_to = DecimalUtil.ZERO ;
      H02DO2_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DO2_A14612MAntTipMDs = new String[] {""} ;
      H02DO2_A14569MAntTipMCo = new String[] {""} ;
      H02DO2_A14610MAntMaqDsc = new String[] {""} ;
      H02DO2_A14570MAntMaqCod = new String[] {""} ;
      H02DO2_A14642MAntColCod = new byte[1] ;
      H02DO2_A14568MAntColNum = new int[1] ;
      H02DO2_A14623MAntColNom = new String[] {""} ;
      H02DO2_A14613MAntArtDsc = new String[] {""} ;
      H02DO2_A14567MAntArtCod = new String[] {""} ;
      H02DO2_A14611MAntCliNom = new String[] {""} ;
      H02DO2_A14565MAntCliCod = new int[1] ;
      H02DO2_A14566MAntEmprCo = new String[] {""} ;
      H02DO2_A14562MAntId = new long[1] ;
      H02DO2_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DO2_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DO3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV66Station = "" ;
      AV67Emprcod = "" ;
      AV68Emprnom = "" ;
      AV69Usurcod = "" ;
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
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState26 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mantww__default(),
         new Object[] {
             new Object[] {
            H02DO2_A14643MAntKilPro, H02DO2_A14612MAntTipMDs, H02DO2_A14569MAntTipMCo, H02DO2_A14610MAntMaqDsc, H02DO2_A14570MAntMaqCod, H02DO2_A14642MAntColCod, H02DO2_A14568MAntColNum, H02DO2_A14623MAntColNom, H02DO2_A14613MAntArtDsc, H02DO2_A14567MAntArtCod,
            H02DO2_A14611MAntCliNom, H02DO2_A14565MAntCliCod, H02DO2_A14566MAntEmprCo, H02DO2_A14562MAntId, H02DO2_A14644MAntKilReo, H02DO2_A14646MAntKilTot
            }
            , new Object[] {
            H02DO3_AGRID_nRecordCount
            }
         }
      );
      AV65Pgmname = "AnticipacionErrores.MAntWW" ;
      /* GeneXus formulas. */
      AV65Pgmname = "AnticipacionErrores.MAntWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV42TFMAntColCod ;
   private byte AV43TFMAntColCod_To ;
   private byte gxajaxcallmode ;
   private byte A14642MAntColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV87Anticipacionerrores_mantwwds_18_tfmantcolcod ;
   private byte AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to ;
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
   private short AV62GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_39 ;
   private int nGXsfl_39_idx=1 ;
   private int AV30TFMAntCliCod ;
   private int AV31TFMAntCliCod_To ;
   private int AV40TFMAntColNum ;
   private int AV41TFMAntColNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A14565MAntCliCod ;
   private int A14568MAntColNum ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV75Anticipacionerrores_mantwwds_6_tfmantclicod ;
   private int AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to ;
   private int AV85Anticipacionerrores_mantwwds_16_tfmantcolnum ;
   private int AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to ;
   private int edtMAntId_Visible ;
   private int edtMAntEmprCo_Visible ;
   private int edtMAntCliCod_Visible ;
   private int edtMAntCliNom_Visible ;
   private int edtMAntArtCod_Visible ;
   private int edtMAntArtDsc_Visible ;
   private int edtMAntColNom_Visible ;
   private int edtMAntColNum_Visible ;
   private int edtMAntColCod_Visible ;
   private int edtMAntMaqCod_Visible ;
   private int edtMAntMaqDsc_Visible ;
   private int edtMAntTipMCo_Visible ;
   private int edtMAntTipMDs_Visible ;
   private int edtMAntKilPro_Visible ;
   private int edtMAntKilReo_Visible ;
   private int edtMAntPorc_Visible ;
   private int AV59PageToGo ;
   private int AV103GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26TFMAntId ;
   private long AV27TFMAntId_To ;
   private long AV60GridCurrentPage ;
   private long AV61GridPageCount ;
   private long A14562MAntId ;
   private long GRID_nCurrentRecord ;
   private long AV71Anticipacionerrores_mantwwds_2_tfmantid ;
   private long AV72Anticipacionerrores_mantwwds_3_tfmantid_to ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV52TFMAntKilProd ;
   private java.math.BigDecimal AV53TFMAntKilProd_To ;
   private java.math.BigDecimal AV54TFMAntKilReo ;
   private java.math.BigDecimal AV55TFMAntKilReo_To ;
   private java.math.BigDecimal AV56TFMAntPorc ;
   private java.math.BigDecimal AV57TFMAntPorc_To ;
   private java.math.BigDecimal A14646MAntKilTot ;
   private java.math.BigDecimal A14643MAntKilPro ;
   private java.math.BigDecimal A14644MAntKilReo ;
   private java.math.BigDecimal A14645MAntPorc ;
   private java.math.BigDecimal AV97Anticipacionerrores_mantwwds_28_tfmantkilprod ;
   private java.math.BigDecimal AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to ;
   private java.math.BigDecimal AV99Anticipacionerrores_mantwwds_30_tfmantkilreo ;
   private java.math.BigDecimal AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to ;
   private java.math.BigDecimal AV101Anticipacionerrores_mantwwds_32_tfmantporc ;
   private java.math.BigDecimal AV102Anticipacionerrores_mantwwds_33_tfmantporc_to ;
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
   private String sGXsfl_39_idx="0001" ;
   private String AV28TFMAntEmprCod ;
   private String AV29TFMAntEmprCod_Sel ;
   private String AV34TFMAntArtCod ;
   private String AV35TFMAntArtCod_Sel ;
   private String AV38TFMAntColNom ;
   private String AV39TFMAntColNom_Sel ;
   private String AV44TFMAntMaqCod ;
   private String AV45TFMAntMaqCod_Sel ;
   private String AV48TFMAntTipMCod ;
   private String AV49TFMAntTipMCod_Sel ;
   private String AV65Pgmname ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtMAntId_Internalname ;
   private String A14566MAntEmprCo ;
   private String edtMAntEmprCo_Internalname ;
   private String edtMAntCliCod_Internalname ;
   private String edtMAntCliNom_Internalname ;
   private String A14567MAntArtCod ;
   private String edtMAntArtCod_Internalname ;
   private String edtMAntArtDsc_Internalname ;
   private String A14623MAntColNom ;
   private String edtMAntColNom_Internalname ;
   private String edtMAntColNum_Internalname ;
   private String edtMAntColCod_Internalname ;
   private String A14570MAntMaqCod ;
   private String edtMAntMaqCod_Internalname ;
   private String edtMAntMaqDsc_Internalname ;
   private String A14569MAntTipMCo ;
   private String edtMAntTipMCo_Internalname ;
   private String edtMAntTipMDs_Internalname ;
   private String edtMAntKilPro_Internalname ;
   private String edtMAntKilReo_Internalname ;
   private String edtMAntPorc_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV73Anticipacionerrores_mantwwds_4_tfmantemprcod ;
   private String lV79Anticipacionerrores_mantwwds_10_tfmantartcod ;
   private String lV83Anticipacionerrores_mantwwds_14_tfmantcolnom ;
   private String lV89Anticipacionerrores_mantwwds_20_tfmantmaqcod ;
   private String lV93Anticipacionerrores_mantwwds_24_tfmanttipmcod ;
   private String AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ;
   private String AV73Anticipacionerrores_mantwwds_4_tfmantemprcod ;
   private String AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel ;
   private String AV79Anticipacionerrores_mantwwds_10_tfmantartcod ;
   private String AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ;
   private String AV83Anticipacionerrores_mantwwds_14_tfmantcolnom ;
   private String AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ;
   private String AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod ;
   private String AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ;
   private String AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod ;
   private String hsh ;
   private String AV66Station ;
   private String AV67Emprcod ;
   private String AV68Emprnom ;
   private String AV69Usurcod ;
   private String edtMAntEmprCo_Link ;
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
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtMAntId_Jsonclick ;
   private String edtMAntEmprCo_Jsonclick ;
   private String edtMAntCliCod_Jsonclick ;
   private String edtMAntCliNom_Jsonclick ;
   private String edtMAntArtCod_Jsonclick ;
   private String edtMAntArtDsc_Jsonclick ;
   private String edtMAntColNom_Jsonclick ;
   private String edtMAntColNum_Jsonclick ;
   private String edtMAntColCod_Jsonclick ;
   private String edtMAntMaqCod_Jsonclick ;
   private String edtMAntMaqDsc_Jsonclick ;
   private String edtMAntTipMCo_Jsonclick ;
   private String edtMAntTipMDs_Jsonclick ;
   private String edtMAntKilPro_Jsonclick ;
   private String edtMAntKilReo_Jsonclick ;
   private String edtMAntPorc_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV32TFMAntCliNom ;
   private String AV33TFMAntCliNom_Sel ;
   private String AV36TFMAntArtDsc ;
   private String AV37TFMAntArtDsc_Sel ;
   private String AV46TFMAntMaqDsc ;
   private String AV47TFMAntMaqDsc_Sel ;
   private String AV50TFMAntTipMDsc ;
   private String AV51TFMAntTipMDsc_Sel ;
   private String A14611MAntCliNom ;
   private String A14613MAntArtDsc ;
   private String A14610MAntMaqDsc ;
   private String A14612MAntTipMDs ;
   private String lV70Anticipacionerrores_mantwwds_1_filterfulltext ;
   private String lV77Anticipacionerrores_mantwwds_8_tfmantclinom ;
   private String lV81Anticipacionerrores_mantwwds_12_tfmantartdsc ;
   private String lV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc ;
   private String lV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc ;
   private String AV70Anticipacionerrores_mantwwds_1_filterfulltext ;
   private String AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel ;
   private String AV77Anticipacionerrores_mantwwds_8_tfmantclinom ;
   private String AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ;
   private String AV81Anticipacionerrores_mantwwds_12_tfmantartdsc ;
   private String AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ;
   private String AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc ;
   private String AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ;
   private String AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H02DO2_A14643MAntKilPro ;
   private String[] H02DO2_A14612MAntTipMDs ;
   private String[] H02DO2_A14569MAntTipMCo ;
   private String[] H02DO2_A14610MAntMaqDsc ;
   private String[] H02DO2_A14570MAntMaqCod ;
   private byte[] H02DO2_A14642MAntColCod ;
   private int[] H02DO2_A14568MAntColNum ;
   private String[] H02DO2_A14623MAntColNom ;
   private String[] H02DO2_A14613MAntArtDsc ;
   private String[] H02DO2_A14567MAntArtCod ;
   private String[] H02DO2_A14611MAntCliNom ;
   private int[] H02DO2_A14565MAntCliCod ;
   private String[] H02DO2_A14566MAntEmprCo ;
   private long[] H02DO2_A14562MAntId ;
   private java.math.BigDecimal[] H02DO2_A14644MAntKilReo ;
   private java.math.BigDecimal[] H02DO2_A14646MAntKilTot ;
   private long[] H02DO3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState26[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV58DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class mantww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02DO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV71Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV72Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV73Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV75Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV77Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV79Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV81Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV83Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV85Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV87Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV97Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV99Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV101Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV102Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[53];
      Object[] GXv_Object28 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNum, MAntColNom, MAntArtDsc, MAntArtCod, MAntCliNom, MAntCliCod, MAntEmprCo, MAntId," ;
      sSelectString += " MAntKilReo, MAntKilTot" ;
      sFromString = " FROM MAnt" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV70Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int27[0] = (byte)(1) ;
         GXv_int27[1] = (byte)(1) ;
         GXv_int27[2] = (byte)(1) ;
         GXv_int27[3] = (byte)(1) ;
         GXv_int27[4] = (byte)(1) ;
         GXv_int27[5] = (byte)(1) ;
         GXv_int27[6] = (byte)(1) ;
         GXv_int27[7] = (byte)(1) ;
         GXv_int27[8] = (byte)(1) ;
         GXv_int27[9] = (byte)(1) ;
         GXv_int27[10] = (byte)(1) ;
         GXv_int27[11] = (byte)(1) ;
         GXv_int27[12] = (byte)(1) ;
         GXv_int27[13] = (byte)(1) ;
         GXv_int27[14] = (byte)(1) ;
         GXv_int27[15] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (0==AV72Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (0==AV75Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (0==AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( ! (0==AV85Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (0==AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( ! (0==AV87Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( ! (0==AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int27[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int27[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int27[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int27[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int27[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int27[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int27[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int27[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int27[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int27[47] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntEmprCo" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntEmprCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntId" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntId DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntCliCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntCliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntCliNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntCliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntArtCod" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntArtCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntColNom" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntColNum" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntColCod" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntColCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntMaqCod" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntMaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntMaqDsc" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntMaqDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntTipMCo" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntTipMCo DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntTipMDs" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntTipMDs DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntKilPro" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntKilPro DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MAntKilReo" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntKilReo DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY MAntId" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_H02DO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV71Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV72Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV73Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV75Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV77Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV79Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV81Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV83Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV85Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV87Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV97Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV99Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV101Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV102Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[48];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV70Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
         GXv_int29[1] = (byte)(1) ;
         GXv_int29[2] = (byte)(1) ;
         GXv_int29[3] = (byte)(1) ;
         GXv_int29[4] = (byte)(1) ;
         GXv_int29[5] = (byte)(1) ;
         GXv_int29[6] = (byte)(1) ;
         GXv_int29[7] = (byte)(1) ;
         GXv_int29[8] = (byte)(1) ;
         GXv_int29[9] = (byte)(1) ;
         GXv_int29[10] = (byte)(1) ;
         GXv_int29[11] = (byte)(1) ;
         GXv_int29[12] = (byte)(1) ;
         GXv_int29[13] = (byte)(1) ;
         GXv_int29[14] = (byte)(1) ;
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (0==AV72Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (0==AV75Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV76Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (0==AV85Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV86Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (0==AV87Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (0==AV88Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
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
                  return conditional_H02DO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).shortValue() , ((Boolean) dynConstraints[50]).booleanValue() );
            case 1 :
                  return conditional_H02DO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).shortValue() , ((Boolean) dynConstraints[50]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02DO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
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
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[69]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[70]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[105]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
      }
   }

}

