package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpie2ww_impl extends GXDataArea
{
   public tdevpie2ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevpie2ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpie2ww_impl.class ));
   }

   public tdevpie2ww_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
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
      AV47ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV42ColumnsSelector);
      AV99FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV49TFDevGenCod = (int)(GXutil.lval( httpContext.GetPar( "TFDevGenCod"))) ;
      AV50TFDevGenCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFDevGenCod_To"))) ;
      AV52TFDevGenFec = localUtil.parseDateParm( httpContext.GetPar( "TFDevGenFec")) ;
      AV57TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV58TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      AV60TFDevGenDom = (byte)(GXutil.lval( httpContext.GetPar( "TFDevGenDom"))) ;
      AV61TFDevGenDom_To = (byte)(GXutil.lval( httpContext.GetPar( "TFDevGenDom_To"))) ;
      AV63TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV64TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV66TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV67TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV69TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV70TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      AV72TFDevGenTrn = (short)(GXutil.lval( httpContext.GetPar( "TFDevGenTrn"))) ;
      AV73TFDevGenTrn_To = (short)(GXutil.lval( httpContext.GetPar( "TFDevGenTrn_To"))) ;
      AV75TFDevTrnNom = httpContext.GetPar( "TFDevTrnNom") ;
      AV76TFDevTrnNom_Sel = httpContext.GetPar( "TFDevTrnNom_Sel") ;
      AV78TFAlbRUniDis = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniDis"), ".") ;
      AV79TFAlbRUniDis_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniDis_To"), ".") ;
      AV81TFAlbRPieDis = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieDis"))) ;
      AV82TFAlbRPieDis_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieDis_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV101TFAlbRUni_Sels);
      AV87TFDevGenUni = CommonUtil.decimalVal( httpContext.GetPar( "TFDevGenUni"), ".") ;
      AV88TFDevGenUni_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDevGenUni_To"), ".") ;
      AV90TFDevGenPie = (short)(GXutil.lval( httpContext.GetPar( "TFDevGenPie"))) ;
      AV91TFDevGenPie_To = (short)(GXutil.lval( httpContext.GetPar( "TFDevGenPie_To"))) ;
      AV136Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV47ManageFiltersExecutionStep, AV42ColumnsSelector, AV99FilterFullText, AV49TFDevGenCod, AV50TFDevGenCod_To, AV52TFDevGenFec, AV57TFAlbRecCod, AV58TFAlbRecCod_To, AV60TFDevGenDom, AV61TFDevGenDom_To, AV63TFCliCod, AV64TFCliCod_To, AV66TFCliNom, AV67TFCliNom_Sel, AV69TFAlbRef, AV70TFAlbRef_Sel, AV72TFDevGenTrn, AV73TFDevGenTrn_To, AV75TFDevTrnNom, AV76TFDevTrnNom_Sel, AV78TFAlbRUniDis, AV79TFAlbRUniDis_To, AV81TFAlbRPieDis, AV82TFAlbRPieDis_To, AV101TFAlbRUni_Sels, AV87TFDevGenUni, AV88TFDevGenUni_To, AV90TFDevGenPie, AV91TFDevGenPie_To, AV136Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
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
      paCP2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startCP2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdevpie2ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV136Pgmname, ""))));
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV45ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV45ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV95GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV96GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV93DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV93DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV42ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV42ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV47ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENCOD", GXutil.ltrim( localUtil.ntoc( AV49TFDevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENCOD_TO", GXutil.ltrim( localUtil.ntoc( AV50TFDevGenCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENFEC", localUtil.dtoc( AV52TFDevGenFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV57TFAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV58TFAlbRecCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENDOM", GXutil.ltrim( localUtil.ntoc( AV60TFDevGenDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENDOM_TO", GXutil.ltrim( localUtil.ntoc( AV61TFDevGenDom_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV63TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV64TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV66TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV67TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF", GXutil.rtrim( AV69TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF_SEL", GXutil.rtrim( AV70TFAlbRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENTRN", GXutil.ltrim( localUtil.ntoc( AV72TFDevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENTRN_TO", GXutil.ltrim( localUtil.ntoc( AV73TFDevGenTrn_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVTRNNOM", GXutil.rtrim( AV75TFDevTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVTRNNOM_SEL", GXutil.rtrim( AV76TFDevTrnNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV78TFAlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIDIS_TO", GXutil.ltrim( localUtil.ntoc( AV79TFAlbRUniDis_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV81TFAlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEDIS_TO", GXutil.ltrim( localUtil.ntoc( AV82TFAlbRPieDis_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRUNI_SELS", AV101TFAlbRUni_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRUNI_SELS", AV101TFAlbRUni_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENUNI", GXutil.ltrim( localUtil.ntoc( AV87TFDevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENUNI_TO", GXutil.ltrim( localUtil.ntoc( AV88TFDevGenUni_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENPIE", GXutil.ltrim( localUtil.ntoc( AV90TFDevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVGENPIE_TO", GXutil.ltrim( localUtil.ntoc( AV91TFDevGenPie_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV136Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV136Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNI_SELSJSON", AV100TFAlbRUni_SelsJson);
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
         weCP2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtCP2( ) ;
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
      return formatLink("app.tdevpie2ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDevPie2WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Devolucion de Piezas (Detail)", "") ;
   }

   public void wbCP0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_CP2( true) ;
      }
      else
      {
         wb_table1_27_CP2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_CP2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV95GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV96GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV93DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV93DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV42ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_devgenfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_devgenfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_devgenfecauxdate_Internalname, localUtil.format(AV54DDO_DevGenFecAuxDate, "99/99/99"), localUtil.format( AV54DDO_DevGenFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_devgenfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie2WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_devgenfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDevPie2WW.htm");
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

   public void startCP2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Devolucion de Piezas (Detail)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupCP0( ) ;
   }

   public void wsCP2( )
   {
      startCP2( ) ;
      evtCP2( ) ;
   }

   public void evtCP2( )
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
                           e11CP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12CP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13CP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14CP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15CP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16CP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17CP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18CP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19CP2 ();
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
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV102GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A323DevGenCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDevGenCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A325DevGenFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDevGenFec_Internalname), 0)) ;
                           n325DevGenFec = false ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n44AlbRecCod = false ;
                           A6288DevGenDom = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevGenDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n6288DevGenDom = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A327DevGenTrn = (short)(localUtil.ctol( httpContext.cgiGet( edtDevGenTrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n327DevGenTrn = false ;
                           A329DevTrnNom = httpContext.cgiGet( edtDevTrnNom_Internalname) ;
                           n329DevTrnNom = false ;
                           A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
                           A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
                           cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
                           A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
                           A328DevGenUni = localUtil.ctond( httpContext.cgiGet( edtDevGenUni_Internalname)) ;
                           n328DevGenUni = false ;
                           A326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDevGenPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n326DevGenPie = false ;
                           A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
                           A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
                           cmbAlbREst.setName( cmbAlbREst.getInternalname() );
                           cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
                           A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
                           A324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevGenEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n324DevGenEst = false ;
                           A3066AlbDevPUni = localUtil.ctond( httpContext.cgiGet( edtAlbDevPUni_Internalname)) ;
                           A5278AlbDevPPie = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDevPPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1304DevUlin = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20CP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21CP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22CP2 ();
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

   public void weCP2( )
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

   public void paCP2( )
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
                                 byte AV47ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV42ColumnsSelector ,
                                 String AV99FilterFullText ,
                                 int AV49TFDevGenCod ,
                                 int AV50TFDevGenCod_To ,
                                 java.util.Date AV52TFDevGenFec ,
                                 int AV57TFAlbRecCod ,
                                 int AV58TFAlbRecCod_To ,
                                 byte AV60TFDevGenDom ,
                                 byte AV61TFDevGenDom_To ,
                                 int AV63TFCliCod ,
                                 int AV64TFCliCod_To ,
                                 String AV66TFCliNom ,
                                 String AV67TFCliNom_Sel ,
                                 String AV69TFAlbRef ,
                                 String AV70TFAlbRef_Sel ,
                                 short AV72TFDevGenTrn ,
                                 short AV73TFDevGenTrn_To ,
                                 String AV75TFDevTrnNom ,
                                 String AV76TFDevTrnNom_Sel ,
                                 java.math.BigDecimal AV78TFAlbRUniDis ,
                                 java.math.BigDecimal AV79TFAlbRUniDis_To ,
                                 int AV81TFAlbRPieDis ,
                                 int AV82TFAlbRPieDis_To ,
                                 GXSimpleCollection<String> AV101TFAlbRUni_Sels ,
                                 java.math.BigDecimal AV87TFDevGenUni ,
                                 java.math.BigDecimal AV88TFDevGenUni_To ,
                                 short AV90TFDevGenPie ,
                                 short AV91TFDevGenPie_To ,
                                 String AV136Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21CP2 ();
      GRID_nCurrentRecord = 0 ;
      rfCP2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVGENCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVGENCOD", GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), ".", "")));
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
      rfCP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV136Pgmname = "TDevPie2WW" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV109Tdevpie2wwds_1_filterfulltext = AV99FilterFullText ;
      AV110Tdevpie2wwds_2_tfdevgencod = AV49TFDevGenCod ;
      AV111Tdevpie2wwds_3_tfdevgencod_to = AV50TFDevGenCod_To ;
      AV112Tdevpie2wwds_4_tfdevgenfec = AV52TFDevGenFec ;
      AV113Tdevpie2wwds_5_tfalbreccod = AV57TFAlbRecCod ;
      AV114Tdevpie2wwds_6_tfalbreccod_to = AV58TFAlbRecCod_To ;
      AV115Tdevpie2wwds_7_tfdevgendom = AV60TFDevGenDom ;
      AV116Tdevpie2wwds_8_tfdevgendom_to = AV61TFDevGenDom_To ;
      AV117Tdevpie2wwds_9_tfclicod = AV63TFCliCod ;
      AV118Tdevpie2wwds_10_tfclicod_to = AV64TFCliCod_To ;
      AV119Tdevpie2wwds_11_tfclinom = AV66TFCliNom ;
      AV120Tdevpie2wwds_12_tfclinom_sel = AV67TFCliNom_Sel ;
      AV121Tdevpie2wwds_13_tfalbref = AV69TFAlbRef ;
      AV122Tdevpie2wwds_14_tfalbref_sel = AV70TFAlbRef_Sel ;
      AV123Tdevpie2wwds_15_tfdevgentrn = AV72TFDevGenTrn ;
      AV124Tdevpie2wwds_16_tfdevgentrn_to = AV73TFDevGenTrn_To ;
      AV125Tdevpie2wwds_17_tfdevtrnnom = AV75TFDevTrnNom ;
      AV126Tdevpie2wwds_18_tfdevtrnnom_sel = AV76TFDevTrnNom_Sel ;
      AV127Tdevpie2wwds_19_tfalbrunidis = AV78TFAlbRUniDis ;
      AV128Tdevpie2wwds_20_tfalbrunidis_to = AV79TFAlbRUniDis_To ;
      AV129Tdevpie2wwds_21_tfalbrpiedis = AV81TFAlbRPieDis ;
      AV130Tdevpie2wwds_22_tfalbrpiedis_to = AV82TFAlbRPieDis_To ;
      AV131Tdevpie2wwds_23_tfalbruni_sels = AV101TFAlbRUni_Sels ;
      AV132Tdevpie2wwds_24_tfdevgenuni = AV87TFDevGenUni ;
      AV133Tdevpie2wwds_25_tfdevgenuni_to = AV88TFDevGenUni_To ;
      AV134Tdevpie2wwds_26_tfdevgenpie = AV90TFDevGenPie ;
      AV135Tdevpie2wwds_27_tfdevgenpie_to = AV91TFDevGenPie_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV131Tdevpie2wwds_23_tfalbruni_sels ,
                                           Integer.valueOf(AV110Tdevpie2wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV111Tdevpie2wwds_3_tfdevgencod_to) ,
                                           AV112Tdevpie2wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV113Tdevpie2wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV114Tdevpie2wwds_6_tfalbreccod_to) ,
                                           Byte.valueOf(AV115Tdevpie2wwds_7_tfdevgendom) ,
                                           Byte.valueOf(AV116Tdevpie2wwds_8_tfdevgendom_to) ,
                                           Integer.valueOf(AV117Tdevpie2wwds_9_tfclicod) ,
                                           Integer.valueOf(AV118Tdevpie2wwds_10_tfclicod_to) ,
                                           AV120Tdevpie2wwds_12_tfclinom_sel ,
                                           AV119Tdevpie2wwds_11_tfclinom ,
                                           AV122Tdevpie2wwds_14_tfalbref_sel ,
                                           AV121Tdevpie2wwds_13_tfalbref ,
                                           Short.valueOf(AV123Tdevpie2wwds_15_tfdevgentrn) ,
                                           Short.valueOf(AV124Tdevpie2wwds_16_tfdevgentrn_to) ,
                                           AV126Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                           AV125Tdevpie2wwds_17_tfdevtrnnom ,
                                           AV127Tdevpie2wwds_19_tfalbrunidis ,
                                           AV128Tdevpie2wwds_20_tfalbrunidis_to ,
                                           Integer.valueOf(AV129Tdevpie2wwds_21_tfalbrpiedis) ,
                                           Integer.valueOf(AV130Tdevpie2wwds_22_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV131Tdevpie2wwds_23_tfalbruni_sels.size()) ,
                                           AV132Tdevpie2wwds_24_tfdevgenuni ,
                                           AV133Tdevpie2wwds_25_tfdevgenuni_to ,
                                           Short.valueOf(AV134Tdevpie2wwds_26_tfdevgenpie) ,
                                           Short.valueOf(AV135Tdevpie2wwds_27_tfdevgenpie_to) ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Byte.valueOf(A6288DevGenDom) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Short.valueOf(A327DevGenTrn) ,
                                           A329DevTrnNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV109Tdevpie2wwds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV119Tdevpie2wwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV119Tdevpie2wwds_11_tfclinom), 30, "%") ;
      lV121Tdevpie2wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV121Tdevpie2wwds_13_tfalbref), 16, "%") ;
      lV125Tdevpie2wwds_17_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV125Tdevpie2wwds_17_tfdevtrnnom), 30, "%") ;
      /* Using cursor H00CP3 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV110Tdevpie2wwds_2_tfdevgencod), Integer.valueOf(AV111Tdevpie2wwds_3_tfdevgencod_to), AV112Tdevpie2wwds_4_tfdevgenfec, Integer.valueOf(AV113Tdevpie2wwds_5_tfalbreccod), Integer.valueOf(AV114Tdevpie2wwds_6_tfalbreccod_to), Byte.valueOf(AV115Tdevpie2wwds_7_tfdevgendom), Byte.valueOf(AV116Tdevpie2wwds_8_tfdevgendom_to), Integer.valueOf(AV117Tdevpie2wwds_9_tfclicod), Integer.valueOf(AV118Tdevpie2wwds_10_tfclicod_to), lV119Tdevpie2wwds_11_tfclinom, AV120Tdevpie2wwds_12_tfclinom_sel, lV121Tdevpie2wwds_13_tfalbref, AV122Tdevpie2wwds_14_tfalbref_sel, Short.valueOf(AV123Tdevpie2wwds_15_tfdevgentrn), Short.valueOf(AV124Tdevpie2wwds_16_tfdevgentrn_to), lV125Tdevpie2wwds_17_tfdevtrnnom, AV126Tdevpie2wwds_18_tfdevtrnnom_sel, AV127Tdevpie2wwds_19_tfalbrunidis, AV128Tdevpie2wwds_20_tfalbrunidis_to, Integer.valueOf(AV129Tdevpie2wwds_21_tfalbrpiedis), Integer.valueOf(AV130Tdevpie2wwds_22_tfalbrpiedis_to), AV132Tdevpie2wwds_24_tfdevgenuni, AV133Tdevpie2wwds_25_tfdevgenuni_to, Short.valueOf(AV134Tdevpie2wwds_26_tfdevgenpie), Short.valueOf(AV135Tdevpie2wwds_27_tfdevgenpie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1304DevUlin = H00CP3_A1304DevUlin[0] ;
         n1304DevUlin = H00CP3_n1304DevUlin[0] ;
         A324DevGenEst = H00CP3_A324DevGenEst[0] ;
         n324DevGenEst = H00CP3_n324DevGenEst[0] ;
         A47AlbREst = H00CP3_A47AlbREst[0] ;
         A326DevGenPie = H00CP3_A326DevGenPie[0] ;
         n326DevGenPie = H00CP3_n326DevGenPie[0] ;
         A328DevGenUni = H00CP3_A328DevGenUni[0] ;
         n328DevGenUni = H00CP3_n328DevGenUni[0] ;
         A56AlbRUni = H00CP3_A56AlbRUni[0] ;
         A51AlbRPieDis = H00CP3_A51AlbRPieDis[0] ;
         A57AlbRUniDis = H00CP3_A57AlbRUniDis[0] ;
         A329DevTrnNom = H00CP3_A329DevTrnNom[0] ;
         n329DevTrnNom = H00CP3_n329DevTrnNom[0] ;
         A327DevGenTrn = H00CP3_A327DevGenTrn[0] ;
         n327DevGenTrn = H00CP3_n327DevGenTrn[0] ;
         A45AlbRef = H00CP3_A45AlbRef[0] ;
         A279CliNom = H00CP3_A279CliNom[0] ;
         A252CliCod = H00CP3_A252CliCod[0] ;
         n252CliCod = H00CP3_n252CliCod[0] ;
         A6288DevGenDom = H00CP3_A6288DevGenDom[0] ;
         n6288DevGenDom = H00CP3_n6288DevGenDom[0] ;
         A44AlbRecCod = H00CP3_A44AlbRecCod[0] ;
         n44AlbRecCod = H00CP3_n44AlbRecCod[0] ;
         A325DevGenFec = H00CP3_A325DevGenFec[0] ;
         n325DevGenFec = H00CP3_n325DevGenFec[0] ;
         A323DevGenCod = H00CP3_A323DevGenCod[0] ;
         A407EmprNom = H00CP3_A407EmprNom[0] ;
         n407EmprNom = H00CP3_n407EmprNom[0] ;
         A396EmprCod = H00CP3_A396EmprCod[0] ;
         A5278AlbDevPPie = H00CP3_A5278AlbDevPPie[0] ;
         A3066AlbDevPUni = H00CP3_A3066AlbDevPUni[0] ;
         A52AlbRPieEnt = H00CP3_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = H00CP3_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = H00CP3_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = H00CP3_A60AlbRUniUti[0] ;
         A407EmprNom = H00CP3_A407EmprNom[0] ;
         n407EmprNom = H00CP3_n407EmprNom[0] ;
         A47AlbREst = H00CP3_A47AlbREst[0] ;
         A56AlbRUni = H00CP3_A56AlbRUni[0] ;
         A51AlbRPieDis = H00CP3_A51AlbRPieDis[0] ;
         A57AlbRUniDis = H00CP3_A57AlbRUniDis[0] ;
         A45AlbRef = H00CP3_A45AlbRef[0] ;
         A52AlbRPieEnt = H00CP3_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = H00CP3_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = H00CP3_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = H00CP3_A60AlbRUniUti[0] ;
         A279CliNom = H00CP3_A279CliNom[0] ;
         A329DevTrnNom = H00CP3_A329DevTrnNom[0] ;
         n329DevTrnNom = H00CP3_n329DevTrnNom[0] ;
         A5278AlbDevPPie = H00CP3_A5278AlbDevPPie[0] ;
         A3066AlbDevPUni = H00CP3_A3066AlbDevPUni[0] ;
         if ( (GXutil.strcmp("", AV109Tdevpie2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6288DevGenDom, 1, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV109Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV109Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A327DevGenTrn, 4, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV109Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "k", "") , GXutil.padr( "%" + GXutil.lower( AV109Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "m", "") , GXutil.padr( "%" + GXutil.lower( AV109Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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

   public void rfCP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e21CP2 ();
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
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A56AlbRUni ,
                                              AV131Tdevpie2wwds_23_tfalbruni_sels ,
                                              Integer.valueOf(AV110Tdevpie2wwds_2_tfdevgencod) ,
                                              Integer.valueOf(AV111Tdevpie2wwds_3_tfdevgencod_to) ,
                                              AV112Tdevpie2wwds_4_tfdevgenfec ,
                                              Integer.valueOf(AV113Tdevpie2wwds_5_tfalbreccod) ,
                                              Integer.valueOf(AV114Tdevpie2wwds_6_tfalbreccod_to) ,
                                              Byte.valueOf(AV115Tdevpie2wwds_7_tfdevgendom) ,
                                              Byte.valueOf(AV116Tdevpie2wwds_8_tfdevgendom_to) ,
                                              Integer.valueOf(AV117Tdevpie2wwds_9_tfclicod) ,
                                              Integer.valueOf(AV118Tdevpie2wwds_10_tfclicod_to) ,
                                              AV120Tdevpie2wwds_12_tfclinom_sel ,
                                              AV119Tdevpie2wwds_11_tfclinom ,
                                              AV122Tdevpie2wwds_14_tfalbref_sel ,
                                              AV121Tdevpie2wwds_13_tfalbref ,
                                              Short.valueOf(AV123Tdevpie2wwds_15_tfdevgentrn) ,
                                              Short.valueOf(AV124Tdevpie2wwds_16_tfdevgentrn_to) ,
                                              AV126Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                              AV125Tdevpie2wwds_17_tfdevtrnnom ,
                                              AV127Tdevpie2wwds_19_tfalbrunidis ,
                                              AV128Tdevpie2wwds_20_tfalbrunidis_to ,
                                              Integer.valueOf(AV129Tdevpie2wwds_21_tfalbrpiedis) ,
                                              Integer.valueOf(AV130Tdevpie2wwds_22_tfalbrpiedis_to) ,
                                              Integer.valueOf(AV131Tdevpie2wwds_23_tfalbruni_sels.size()) ,
                                              AV132Tdevpie2wwds_24_tfdevgenuni ,
                                              AV133Tdevpie2wwds_25_tfdevgenuni_to ,
                                              Short.valueOf(AV134Tdevpie2wwds_26_tfdevgenpie) ,
                                              Short.valueOf(AV135Tdevpie2wwds_27_tfdevgenpie_to) ,
                                              Integer.valueOf(A323DevGenCod) ,
                                              A325DevGenFec ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              Byte.valueOf(A6288DevGenDom) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A45AlbRef ,
                                              Short.valueOf(A327DevGenTrn) ,
                                              A329DevTrnNom ,
                                              A58AlbRUniEnt ,
                                              A60AlbRUniUti ,
                                              Integer.valueOf(A52AlbRPieEnt) ,
                                              Integer.valueOf(A54AlbRPieUti) ,
                                              A328DevGenUni ,
                                              Short.valueOf(A326DevGenPie) ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV109Tdevpie2wwds_1_filterfulltext ,
                                              A57AlbRUniDis ,
                                              Integer.valueOf(A51AlbRPieDis) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                              }
         });
         lV119Tdevpie2wwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV119Tdevpie2wwds_11_tfclinom), 30, "%") ;
         lV121Tdevpie2wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV121Tdevpie2wwds_13_tfalbref), 16, "%") ;
         lV125Tdevpie2wwds_17_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV125Tdevpie2wwds_17_tfdevtrnnom), 30, "%") ;
         /* Using cursor H00CP5 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV110Tdevpie2wwds_2_tfdevgencod), Integer.valueOf(AV111Tdevpie2wwds_3_tfdevgencod_to), AV112Tdevpie2wwds_4_tfdevgenfec, Integer.valueOf(AV113Tdevpie2wwds_5_tfalbreccod), Integer.valueOf(AV114Tdevpie2wwds_6_tfalbreccod_to), Byte.valueOf(AV115Tdevpie2wwds_7_tfdevgendom), Byte.valueOf(AV116Tdevpie2wwds_8_tfdevgendom_to), Integer.valueOf(AV117Tdevpie2wwds_9_tfclicod), Integer.valueOf(AV118Tdevpie2wwds_10_tfclicod_to), lV119Tdevpie2wwds_11_tfclinom, AV120Tdevpie2wwds_12_tfclinom_sel, lV121Tdevpie2wwds_13_tfalbref, AV122Tdevpie2wwds_14_tfalbref_sel, Short.valueOf(AV123Tdevpie2wwds_15_tfdevgentrn), Short.valueOf(AV124Tdevpie2wwds_16_tfdevgentrn_to), lV125Tdevpie2wwds_17_tfdevtrnnom, AV126Tdevpie2wwds_18_tfdevtrnnom_sel, AV127Tdevpie2wwds_19_tfalbrunidis, AV128Tdevpie2wwds_20_tfalbrunidis_to, Integer.valueOf(AV129Tdevpie2wwds_21_tfalbrpiedis), Integer.valueOf(AV130Tdevpie2wwds_22_tfalbrpiedis_to), AV132Tdevpie2wwds_24_tfdevgenuni, AV133Tdevpie2wwds_25_tfdevgenuni_to, Short.valueOf(AV134Tdevpie2wwds_26_tfdevgenpie), Short.valueOf(AV135Tdevpie2wwds_27_tfdevgenpie_to)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1304DevUlin = H00CP5_A1304DevUlin[0] ;
            n1304DevUlin = H00CP5_n1304DevUlin[0] ;
            A324DevGenEst = H00CP5_A324DevGenEst[0] ;
            n324DevGenEst = H00CP5_n324DevGenEst[0] ;
            A47AlbREst = H00CP5_A47AlbREst[0] ;
            A326DevGenPie = H00CP5_A326DevGenPie[0] ;
            n326DevGenPie = H00CP5_n326DevGenPie[0] ;
            A328DevGenUni = H00CP5_A328DevGenUni[0] ;
            n328DevGenUni = H00CP5_n328DevGenUni[0] ;
            A56AlbRUni = H00CP5_A56AlbRUni[0] ;
            A51AlbRPieDis = H00CP5_A51AlbRPieDis[0] ;
            A57AlbRUniDis = H00CP5_A57AlbRUniDis[0] ;
            A329DevTrnNom = H00CP5_A329DevTrnNom[0] ;
            n329DevTrnNom = H00CP5_n329DevTrnNom[0] ;
            A327DevGenTrn = H00CP5_A327DevGenTrn[0] ;
            n327DevGenTrn = H00CP5_n327DevGenTrn[0] ;
            A45AlbRef = H00CP5_A45AlbRef[0] ;
            A279CliNom = H00CP5_A279CliNom[0] ;
            A252CliCod = H00CP5_A252CliCod[0] ;
            n252CliCod = H00CP5_n252CliCod[0] ;
            A6288DevGenDom = H00CP5_A6288DevGenDom[0] ;
            n6288DevGenDom = H00CP5_n6288DevGenDom[0] ;
            A44AlbRecCod = H00CP5_A44AlbRecCod[0] ;
            n44AlbRecCod = H00CP5_n44AlbRecCod[0] ;
            A325DevGenFec = H00CP5_A325DevGenFec[0] ;
            n325DevGenFec = H00CP5_n325DevGenFec[0] ;
            A323DevGenCod = H00CP5_A323DevGenCod[0] ;
            A407EmprNom = H00CP5_A407EmprNom[0] ;
            n407EmprNom = H00CP5_n407EmprNom[0] ;
            A396EmprCod = H00CP5_A396EmprCod[0] ;
            A5278AlbDevPPie = H00CP5_A5278AlbDevPPie[0] ;
            A3066AlbDevPUni = H00CP5_A3066AlbDevPUni[0] ;
            A52AlbRPieEnt = H00CP5_A52AlbRPieEnt[0] ;
            A54AlbRPieUti = H00CP5_A54AlbRPieUti[0] ;
            A58AlbRUniEnt = H00CP5_A58AlbRUniEnt[0] ;
            A60AlbRUniUti = H00CP5_A60AlbRUniUti[0] ;
            A407EmprNom = H00CP5_A407EmprNom[0] ;
            n407EmprNom = H00CP5_n407EmprNom[0] ;
            A47AlbREst = H00CP5_A47AlbREst[0] ;
            A56AlbRUni = H00CP5_A56AlbRUni[0] ;
            A51AlbRPieDis = H00CP5_A51AlbRPieDis[0] ;
            A57AlbRUniDis = H00CP5_A57AlbRUniDis[0] ;
            A45AlbRef = H00CP5_A45AlbRef[0] ;
            A52AlbRPieEnt = H00CP5_A52AlbRPieEnt[0] ;
            A54AlbRPieUti = H00CP5_A54AlbRPieUti[0] ;
            A58AlbRUniEnt = H00CP5_A58AlbRUniEnt[0] ;
            A60AlbRUniUti = H00CP5_A60AlbRUniUti[0] ;
            A279CliNom = H00CP5_A279CliNom[0] ;
            A329DevTrnNom = H00CP5_A329DevTrnNom[0] ;
            n329DevTrnNom = H00CP5_n329DevTrnNom[0] ;
            A5278AlbDevPPie = H00CP5_A5278AlbDevPPie[0] ;
            A3066AlbDevPUni = H00CP5_A3066AlbDevPUni[0] ;
            if ( (GXutil.strcmp("", AV109Tdevpie2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6288DevGenDom, 1, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV109Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV109Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A327DevGenTrn, 4, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV109Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "k", "") , GXutil.padr( "%" + GXutil.lower( AV109Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "m", "") , GXutil.padr( "%" + GXutil.lower( AV109Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV109Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
            {
               e22CP2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wbCP0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesCP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV136Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV136Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVGENCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9")));
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
      AV109Tdevpie2wwds_1_filterfulltext = AV99FilterFullText ;
      AV110Tdevpie2wwds_2_tfdevgencod = AV49TFDevGenCod ;
      AV111Tdevpie2wwds_3_tfdevgencod_to = AV50TFDevGenCod_To ;
      AV112Tdevpie2wwds_4_tfdevgenfec = AV52TFDevGenFec ;
      AV113Tdevpie2wwds_5_tfalbreccod = AV57TFAlbRecCod ;
      AV114Tdevpie2wwds_6_tfalbreccod_to = AV58TFAlbRecCod_To ;
      AV115Tdevpie2wwds_7_tfdevgendom = AV60TFDevGenDom ;
      AV116Tdevpie2wwds_8_tfdevgendom_to = AV61TFDevGenDom_To ;
      AV117Tdevpie2wwds_9_tfclicod = AV63TFCliCod ;
      AV118Tdevpie2wwds_10_tfclicod_to = AV64TFCliCod_To ;
      AV119Tdevpie2wwds_11_tfclinom = AV66TFCliNom ;
      AV120Tdevpie2wwds_12_tfclinom_sel = AV67TFCliNom_Sel ;
      AV121Tdevpie2wwds_13_tfalbref = AV69TFAlbRef ;
      AV122Tdevpie2wwds_14_tfalbref_sel = AV70TFAlbRef_Sel ;
      AV123Tdevpie2wwds_15_tfdevgentrn = AV72TFDevGenTrn ;
      AV124Tdevpie2wwds_16_tfdevgentrn_to = AV73TFDevGenTrn_To ;
      AV125Tdevpie2wwds_17_tfdevtrnnom = AV75TFDevTrnNom ;
      AV126Tdevpie2wwds_18_tfdevtrnnom_sel = AV76TFDevTrnNom_Sel ;
      AV127Tdevpie2wwds_19_tfalbrunidis = AV78TFAlbRUniDis ;
      AV128Tdevpie2wwds_20_tfalbrunidis_to = AV79TFAlbRUniDis_To ;
      AV129Tdevpie2wwds_21_tfalbrpiedis = AV81TFAlbRPieDis ;
      AV130Tdevpie2wwds_22_tfalbrpiedis_to = AV82TFAlbRPieDis_To ;
      AV131Tdevpie2wwds_23_tfalbruni_sels = AV101TFAlbRUni_Sels ;
      AV132Tdevpie2wwds_24_tfdevgenuni = AV87TFDevGenUni ;
      AV133Tdevpie2wwds_25_tfdevgenuni_to = AV88TFDevGenUni_To ;
      AV134Tdevpie2wwds_26_tfdevgenpie = AV90TFDevGenPie ;
      AV135Tdevpie2wwds_27_tfdevgenpie_to = AV91TFDevGenPie_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV47ManageFiltersExecutionStep, AV42ColumnsSelector, AV99FilterFullText, AV49TFDevGenCod, AV50TFDevGenCod_To, AV52TFDevGenFec, AV57TFAlbRecCod, AV58TFAlbRecCod_To, AV60TFDevGenDom, AV61TFDevGenDom_To, AV63TFCliCod, AV64TFCliCod_To, AV66TFCliNom, AV67TFCliNom_Sel, AV69TFAlbRef, AV70TFAlbRef_Sel, AV72TFDevGenTrn, AV73TFDevGenTrn_To, AV75TFDevTrnNom, AV76TFDevTrnNom_Sel, AV78TFAlbRUniDis, AV79TFAlbRUniDis_To, AV81TFAlbRPieDis, AV82TFAlbRPieDis_To, AV101TFAlbRUni_Sels, AV87TFDevGenUni, AV88TFDevGenUni_To, AV90TFDevGenPie, AV91TFDevGenPie_To, AV136Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV109Tdevpie2wwds_1_filterfulltext = AV99FilterFullText ;
      AV110Tdevpie2wwds_2_tfdevgencod = AV49TFDevGenCod ;
      AV111Tdevpie2wwds_3_tfdevgencod_to = AV50TFDevGenCod_To ;
      AV112Tdevpie2wwds_4_tfdevgenfec = AV52TFDevGenFec ;
      AV113Tdevpie2wwds_5_tfalbreccod = AV57TFAlbRecCod ;
      AV114Tdevpie2wwds_6_tfalbreccod_to = AV58TFAlbRecCod_To ;
      AV115Tdevpie2wwds_7_tfdevgendom = AV60TFDevGenDom ;
      AV116Tdevpie2wwds_8_tfdevgendom_to = AV61TFDevGenDom_To ;
      AV117Tdevpie2wwds_9_tfclicod = AV63TFCliCod ;
      AV118Tdevpie2wwds_10_tfclicod_to = AV64TFCliCod_To ;
      AV119Tdevpie2wwds_11_tfclinom = AV66TFCliNom ;
      AV120Tdevpie2wwds_12_tfclinom_sel = AV67TFCliNom_Sel ;
      AV121Tdevpie2wwds_13_tfalbref = AV69TFAlbRef ;
      AV122Tdevpie2wwds_14_tfalbref_sel = AV70TFAlbRef_Sel ;
      AV123Tdevpie2wwds_15_tfdevgentrn = AV72TFDevGenTrn ;
      AV124Tdevpie2wwds_16_tfdevgentrn_to = AV73TFDevGenTrn_To ;
      AV125Tdevpie2wwds_17_tfdevtrnnom = AV75TFDevTrnNom ;
      AV126Tdevpie2wwds_18_tfdevtrnnom_sel = AV76TFDevTrnNom_Sel ;
      AV127Tdevpie2wwds_19_tfalbrunidis = AV78TFAlbRUniDis ;
      AV128Tdevpie2wwds_20_tfalbrunidis_to = AV79TFAlbRUniDis_To ;
      AV129Tdevpie2wwds_21_tfalbrpiedis = AV81TFAlbRPieDis ;
      AV130Tdevpie2wwds_22_tfalbrpiedis_to = AV82TFAlbRPieDis_To ;
      AV131Tdevpie2wwds_23_tfalbruni_sels = AV101TFAlbRUni_Sels ;
      AV132Tdevpie2wwds_24_tfdevgenuni = AV87TFDevGenUni ;
      AV133Tdevpie2wwds_25_tfdevgenuni_to = AV88TFDevGenUni_To ;
      AV134Tdevpie2wwds_26_tfdevgenpie = AV90TFDevGenPie ;
      AV135Tdevpie2wwds_27_tfdevgenpie_to = AV91TFDevGenPie_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV47ManageFiltersExecutionStep, AV42ColumnsSelector, AV99FilterFullText, AV49TFDevGenCod, AV50TFDevGenCod_To, AV52TFDevGenFec, AV57TFAlbRecCod, AV58TFAlbRecCod_To, AV60TFDevGenDom, AV61TFDevGenDom_To, AV63TFCliCod, AV64TFCliCod_To, AV66TFCliNom, AV67TFCliNom_Sel, AV69TFAlbRef, AV70TFAlbRef_Sel, AV72TFDevGenTrn, AV73TFDevGenTrn_To, AV75TFDevTrnNom, AV76TFDevTrnNom_Sel, AV78TFAlbRUniDis, AV79TFAlbRUniDis_To, AV81TFAlbRPieDis, AV82TFAlbRPieDis_To, AV101TFAlbRUni_Sels, AV87TFDevGenUni, AV88TFDevGenUni_To, AV90TFDevGenPie, AV91TFDevGenPie_To, AV136Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV109Tdevpie2wwds_1_filterfulltext = AV99FilterFullText ;
      AV110Tdevpie2wwds_2_tfdevgencod = AV49TFDevGenCod ;
      AV111Tdevpie2wwds_3_tfdevgencod_to = AV50TFDevGenCod_To ;
      AV112Tdevpie2wwds_4_tfdevgenfec = AV52TFDevGenFec ;
      AV113Tdevpie2wwds_5_tfalbreccod = AV57TFAlbRecCod ;
      AV114Tdevpie2wwds_6_tfalbreccod_to = AV58TFAlbRecCod_To ;
      AV115Tdevpie2wwds_7_tfdevgendom = AV60TFDevGenDom ;
      AV116Tdevpie2wwds_8_tfdevgendom_to = AV61TFDevGenDom_To ;
      AV117Tdevpie2wwds_9_tfclicod = AV63TFCliCod ;
      AV118Tdevpie2wwds_10_tfclicod_to = AV64TFCliCod_To ;
      AV119Tdevpie2wwds_11_tfclinom = AV66TFCliNom ;
      AV120Tdevpie2wwds_12_tfclinom_sel = AV67TFCliNom_Sel ;
      AV121Tdevpie2wwds_13_tfalbref = AV69TFAlbRef ;
      AV122Tdevpie2wwds_14_tfalbref_sel = AV70TFAlbRef_Sel ;
      AV123Tdevpie2wwds_15_tfdevgentrn = AV72TFDevGenTrn ;
      AV124Tdevpie2wwds_16_tfdevgentrn_to = AV73TFDevGenTrn_To ;
      AV125Tdevpie2wwds_17_tfdevtrnnom = AV75TFDevTrnNom ;
      AV126Tdevpie2wwds_18_tfdevtrnnom_sel = AV76TFDevTrnNom_Sel ;
      AV127Tdevpie2wwds_19_tfalbrunidis = AV78TFAlbRUniDis ;
      AV128Tdevpie2wwds_20_tfalbrunidis_to = AV79TFAlbRUniDis_To ;
      AV129Tdevpie2wwds_21_tfalbrpiedis = AV81TFAlbRPieDis ;
      AV130Tdevpie2wwds_22_tfalbrpiedis_to = AV82TFAlbRPieDis_To ;
      AV131Tdevpie2wwds_23_tfalbruni_sels = AV101TFAlbRUni_Sels ;
      AV132Tdevpie2wwds_24_tfdevgenuni = AV87TFDevGenUni ;
      AV133Tdevpie2wwds_25_tfdevgenuni_to = AV88TFDevGenUni_To ;
      AV134Tdevpie2wwds_26_tfdevgenpie = AV90TFDevGenPie ;
      AV135Tdevpie2wwds_27_tfdevgenpie_to = AV91TFDevGenPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47ManageFiltersExecutionStep, AV42ColumnsSelector, AV99FilterFullText, AV49TFDevGenCod, AV50TFDevGenCod_To, AV52TFDevGenFec, AV57TFAlbRecCod, AV58TFAlbRecCod_To, AV60TFDevGenDom, AV61TFDevGenDom_To, AV63TFCliCod, AV64TFCliCod_To, AV66TFCliNom, AV67TFCliNom_Sel, AV69TFAlbRef, AV70TFAlbRef_Sel, AV72TFDevGenTrn, AV73TFDevGenTrn_To, AV75TFDevTrnNom, AV76TFDevTrnNom_Sel, AV78TFAlbRUniDis, AV79TFAlbRUniDis_To, AV81TFAlbRPieDis, AV82TFAlbRPieDis_To, AV101TFAlbRUni_Sels, AV87TFDevGenUni, AV88TFDevGenUni_To, AV90TFDevGenPie, AV91TFDevGenPie_To, AV136Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV109Tdevpie2wwds_1_filterfulltext = AV99FilterFullText ;
      AV110Tdevpie2wwds_2_tfdevgencod = AV49TFDevGenCod ;
      AV111Tdevpie2wwds_3_tfdevgencod_to = AV50TFDevGenCod_To ;
      AV112Tdevpie2wwds_4_tfdevgenfec = AV52TFDevGenFec ;
      AV113Tdevpie2wwds_5_tfalbreccod = AV57TFAlbRecCod ;
      AV114Tdevpie2wwds_6_tfalbreccod_to = AV58TFAlbRecCod_To ;
      AV115Tdevpie2wwds_7_tfdevgendom = AV60TFDevGenDom ;
      AV116Tdevpie2wwds_8_tfdevgendom_to = AV61TFDevGenDom_To ;
      AV117Tdevpie2wwds_9_tfclicod = AV63TFCliCod ;
      AV118Tdevpie2wwds_10_tfclicod_to = AV64TFCliCod_To ;
      AV119Tdevpie2wwds_11_tfclinom = AV66TFCliNom ;
      AV120Tdevpie2wwds_12_tfclinom_sel = AV67TFCliNom_Sel ;
      AV121Tdevpie2wwds_13_tfalbref = AV69TFAlbRef ;
      AV122Tdevpie2wwds_14_tfalbref_sel = AV70TFAlbRef_Sel ;
      AV123Tdevpie2wwds_15_tfdevgentrn = AV72TFDevGenTrn ;
      AV124Tdevpie2wwds_16_tfdevgentrn_to = AV73TFDevGenTrn_To ;
      AV125Tdevpie2wwds_17_tfdevtrnnom = AV75TFDevTrnNom ;
      AV126Tdevpie2wwds_18_tfdevtrnnom_sel = AV76TFDevTrnNom_Sel ;
      AV127Tdevpie2wwds_19_tfalbrunidis = AV78TFAlbRUniDis ;
      AV128Tdevpie2wwds_20_tfalbrunidis_to = AV79TFAlbRUniDis_To ;
      AV129Tdevpie2wwds_21_tfalbrpiedis = AV81TFAlbRPieDis ;
      AV130Tdevpie2wwds_22_tfalbrpiedis_to = AV82TFAlbRPieDis_To ;
      AV131Tdevpie2wwds_23_tfalbruni_sels = AV101TFAlbRUni_Sels ;
      AV132Tdevpie2wwds_24_tfdevgenuni = AV87TFDevGenUni ;
      AV133Tdevpie2wwds_25_tfdevgenuni_to = AV88TFDevGenUni_To ;
      AV134Tdevpie2wwds_26_tfdevgenpie = AV90TFDevGenPie ;
      AV135Tdevpie2wwds_27_tfdevgenpie_to = AV91TFDevGenPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47ManageFiltersExecutionStep, AV42ColumnsSelector, AV99FilterFullText, AV49TFDevGenCod, AV50TFDevGenCod_To, AV52TFDevGenFec, AV57TFAlbRecCod, AV58TFAlbRecCod_To, AV60TFDevGenDom, AV61TFDevGenDom_To, AV63TFCliCod, AV64TFCliCod_To, AV66TFCliNom, AV67TFCliNom_Sel, AV69TFAlbRef, AV70TFAlbRef_Sel, AV72TFDevGenTrn, AV73TFDevGenTrn_To, AV75TFDevTrnNom, AV76TFDevTrnNom_Sel, AV78TFAlbRUniDis, AV79TFAlbRUniDis_To, AV81TFAlbRPieDis, AV82TFAlbRPieDis_To, AV101TFAlbRUni_Sels, AV87TFDevGenUni, AV88TFDevGenUni_To, AV90TFDevGenPie, AV91TFDevGenPie_To, AV136Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV109Tdevpie2wwds_1_filterfulltext = AV99FilterFullText ;
      AV110Tdevpie2wwds_2_tfdevgencod = AV49TFDevGenCod ;
      AV111Tdevpie2wwds_3_tfdevgencod_to = AV50TFDevGenCod_To ;
      AV112Tdevpie2wwds_4_tfdevgenfec = AV52TFDevGenFec ;
      AV113Tdevpie2wwds_5_tfalbreccod = AV57TFAlbRecCod ;
      AV114Tdevpie2wwds_6_tfalbreccod_to = AV58TFAlbRecCod_To ;
      AV115Tdevpie2wwds_7_tfdevgendom = AV60TFDevGenDom ;
      AV116Tdevpie2wwds_8_tfdevgendom_to = AV61TFDevGenDom_To ;
      AV117Tdevpie2wwds_9_tfclicod = AV63TFCliCod ;
      AV118Tdevpie2wwds_10_tfclicod_to = AV64TFCliCod_To ;
      AV119Tdevpie2wwds_11_tfclinom = AV66TFCliNom ;
      AV120Tdevpie2wwds_12_tfclinom_sel = AV67TFCliNom_Sel ;
      AV121Tdevpie2wwds_13_tfalbref = AV69TFAlbRef ;
      AV122Tdevpie2wwds_14_tfalbref_sel = AV70TFAlbRef_Sel ;
      AV123Tdevpie2wwds_15_tfdevgentrn = AV72TFDevGenTrn ;
      AV124Tdevpie2wwds_16_tfdevgentrn_to = AV73TFDevGenTrn_To ;
      AV125Tdevpie2wwds_17_tfdevtrnnom = AV75TFDevTrnNom ;
      AV126Tdevpie2wwds_18_tfdevtrnnom_sel = AV76TFDevTrnNom_Sel ;
      AV127Tdevpie2wwds_19_tfalbrunidis = AV78TFAlbRUniDis ;
      AV128Tdevpie2wwds_20_tfalbrunidis_to = AV79TFAlbRUniDis_To ;
      AV129Tdevpie2wwds_21_tfalbrpiedis = AV81TFAlbRPieDis ;
      AV130Tdevpie2wwds_22_tfalbrpiedis_to = AV82TFAlbRPieDis_To ;
      AV131Tdevpie2wwds_23_tfalbruni_sels = AV101TFAlbRUni_Sels ;
      AV132Tdevpie2wwds_24_tfdevgenuni = AV87TFDevGenUni ;
      AV133Tdevpie2wwds_25_tfdevgenuni_to = AV88TFDevGenUni_To ;
      AV134Tdevpie2wwds_26_tfdevgenpie = AV90TFDevGenPie ;
      AV135Tdevpie2wwds_27_tfdevgenpie_to = AV91TFDevGenPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47ManageFiltersExecutionStep, AV42ColumnsSelector, AV99FilterFullText, AV49TFDevGenCod, AV50TFDevGenCod_To, AV52TFDevGenFec, AV57TFAlbRecCod, AV58TFAlbRecCod_To, AV60TFDevGenDom, AV61TFDevGenDom_To, AV63TFCliCod, AV64TFCliCod_To, AV66TFCliNom, AV67TFCliNom_Sel, AV69TFAlbRef, AV70TFAlbRef_Sel, AV72TFDevGenTrn, AV73TFDevGenTrn_To, AV75TFDevTrnNom, AV76TFDevTrnNom_Sel, AV78TFAlbRUniDis, AV79TFAlbRUniDis_To, AV81TFAlbRPieDis, AV82TFAlbRPieDis_To, AV101TFAlbRUni_Sels, AV87TFDevGenUni, AV88TFDevGenUni_To, AV90TFDevGenPie, AV91TFDevGenPie_To, AV136Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV136Pgmname = "TDevPie2WW" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupCP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20CP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV45ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV93DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV42ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV95GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV96GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV99FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99FilterFullText", AV99FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_devgenfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DEVGENFECAUXDATE");
            GX_FocusControl = edtavDdo_devgenfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54DDO_DevGenFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_DevGenFecAuxDate", localUtil.format(AV54DDO_DevGenFecAuxDate, "99/99/99"));
         }
         else
         {
            AV54DDO_DevGenFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_devgenfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_DevGenFecAuxDate", localUtil.format(AV54DDO_DevGenFecAuxDate, "99/99/99"));
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
      e20CP2 ();
      if (returnInSub) return;
   }

   public void e20CP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV105Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdevpie2ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV105Station = GXt_char1 ;
      GXv_char2[0] = AV106Emprcod ;
      GXv_char3[0] = AV107Emprnom ;
      GXv_char4[0] = AV108Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV105Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevpie2ww_impl.this.AV106Emprcod = GXv_char2[0] ;
      tdevpie2ww_impl.this.AV107Emprnom = GXv_char3[0] ;
      tdevpie2ww_impl.this.AV108Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " Devolucion de Piezas (Detail)", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV93DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV93DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e21CP2( )
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
      if ( AV47ManageFiltersExecutionStep == 1 )
      {
         AV47ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47ManageFiltersExecutionStep", GXutil.str( AV47ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV47ManageFiltersExecutionStep == 2 )
      {
         AV47ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47ManageFiltersExecutionStep", GXutil.str( AV47ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV44Session.getValue("TDevPie2WWColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV44Session.getValue("TDevPie2WWColumnsSelector") ;
         AV42ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtDevGenCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevGenFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenFec_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRecCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevGenDom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenDom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenDom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRef_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevGenTrn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenTrn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenTrn_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevTrnNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevTrnNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRUniDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRPieDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbAlbRUni.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbRUni.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtDevGenUni_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDevGenPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV42ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV95GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95GridCurrentPage), 10, 0));
      AV96GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96GridPageCount), 10, 0));
      AV109Tdevpie2wwds_1_filterfulltext = AV99FilterFullText ;
      AV110Tdevpie2wwds_2_tfdevgencod = AV49TFDevGenCod ;
      AV111Tdevpie2wwds_3_tfdevgencod_to = AV50TFDevGenCod_To ;
      AV112Tdevpie2wwds_4_tfdevgenfec = AV52TFDevGenFec ;
      AV113Tdevpie2wwds_5_tfalbreccod = AV57TFAlbRecCod ;
      AV114Tdevpie2wwds_6_tfalbreccod_to = AV58TFAlbRecCod_To ;
      AV115Tdevpie2wwds_7_tfdevgendom = AV60TFDevGenDom ;
      AV116Tdevpie2wwds_8_tfdevgendom_to = AV61TFDevGenDom_To ;
      AV117Tdevpie2wwds_9_tfclicod = AV63TFCliCod ;
      AV118Tdevpie2wwds_10_tfclicod_to = AV64TFCliCod_To ;
      AV119Tdevpie2wwds_11_tfclinom = AV66TFCliNom ;
      AV120Tdevpie2wwds_12_tfclinom_sel = AV67TFCliNom_Sel ;
      AV121Tdevpie2wwds_13_tfalbref = AV69TFAlbRef ;
      AV122Tdevpie2wwds_14_tfalbref_sel = AV70TFAlbRef_Sel ;
      AV123Tdevpie2wwds_15_tfdevgentrn = AV72TFDevGenTrn ;
      AV124Tdevpie2wwds_16_tfdevgentrn_to = AV73TFDevGenTrn_To ;
      AV125Tdevpie2wwds_17_tfdevtrnnom = AV75TFDevTrnNom ;
      AV126Tdevpie2wwds_18_tfdevtrnnom_sel = AV76TFDevTrnNom_Sel ;
      AV127Tdevpie2wwds_19_tfalbrunidis = AV78TFAlbRUniDis ;
      AV128Tdevpie2wwds_20_tfalbrunidis_to = AV79TFAlbRUniDis_To ;
      AV129Tdevpie2wwds_21_tfalbrpiedis = AV81TFAlbRPieDis ;
      AV130Tdevpie2wwds_22_tfalbrpiedis_to = AV82TFAlbRPieDis_To ;
      AV131Tdevpie2wwds_23_tfalbruni_sels = AV101TFAlbRUni_Sels ;
      AV132Tdevpie2wwds_24_tfdevgenuni = AV87TFDevGenUni ;
      AV133Tdevpie2wwds_25_tfdevgenuni_to = AV88TFDevGenUni_To ;
      AV134Tdevpie2wwds_26_tfdevgenpie = AV90TFDevGenPie ;
      AV135Tdevpie2wwds_27_tfdevgenpie_to = AV91TFDevGenPie_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ColumnsSelector", AV42ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45ManageFiltersData", AV45ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12CP2( )
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
         AV94PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV94PageToGo) ;
      }
   }

   public void e13CP2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14CP2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevGenCod") == 0 )
         {
            AV49TFDevGenCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFDevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFDevGenCod), 8, 0));
            AV50TFDevGenCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFDevGenCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDevGenCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevGenFec") == 0 )
         {
            AV52TFDevGenFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFDevGenFec", localUtil.format(AV52TFDevGenFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV57TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbRecCod), 8, 0));
            AV58TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevGenDom") == 0 )
         {
            AV60TFDevGenDom = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFDevGenDom", GXutil.str( AV60TFDevGenDom, 1, 0));
            AV61TFDevGenDom_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFDevGenDom_To", GXutil.str( AV61TFDevGenDom_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV63TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFCliCod), 6, 0));
            AV64TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV66TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFCliNom", AV66TFCliNom);
            AV67TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliNom_Sel", AV67TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRef") == 0 )
         {
            AV69TFAlbRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbRef", AV69TFAlbRef);
            AV70TFAlbRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFAlbRef_Sel", AV70TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevGenTrn") == 0 )
         {
            AV72TFDevGenTrn = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFDevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFDevGenTrn), 4, 0));
            AV73TFDevGenTrn_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFDevGenTrn_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFDevGenTrn_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevTrnNom") == 0 )
         {
            AV75TFDevTrnNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFDevTrnNom", AV75TFDevTrnNom);
            AV76TFDevTrnNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFDevTrnNom_Sel", AV76TFDevTrnNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniDis") == 0 )
         {
            AV78TFAlbRUniDis = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFAlbRUniDis", GXutil.ltrimstr( AV78TFAlbRUniDis, 9, 2));
            AV79TFAlbRUniDis_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFAlbRUniDis_To", GXutil.ltrimstr( AV79TFAlbRUniDis_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieDis") == 0 )
         {
            AV81TFAlbRPieDis = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFAlbRPieDis), 6, 0));
            AV82TFAlbRPieDis_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFAlbRPieDis_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUni") == 0 )
         {
            AV100TFAlbRUni_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFAlbRUni_SelsJson", AV100TFAlbRUni_SelsJson);
            AV101TFAlbRUni_Sels.fromJSonString(AV100TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevGenUni") == 0 )
         {
            AV87TFDevGenUni = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFDevGenUni", GXutil.ltrimstr( AV87TFDevGenUni, 9, 2));
            AV88TFDevGenUni_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFDevGenUni_To", GXutil.ltrimstr( AV88TFDevGenUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevGenPie") == 0 )
         {
            AV90TFDevGenPie = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFDevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFDevGenPie), 4, 0));
            AV91TFDevGenPie_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFDevGenPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFDevGenPie_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV101TFAlbRUni_Sels", AV101TFAlbRUni_Sels);
   }

   private void e22CP2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV102GridActions, 4, 0)) );
   }

   public void e15CP2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV40ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV42ColumnsSelector.fromJSonString(AV40ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TDevPie2WWColumnsSelector", ((GXutil.strcmp("", AV40ColumnsSelectorXML)==0) ? "" : AV42ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ColumnsSelector", AV42ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45ManageFiltersData", AV45ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11CP2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TDevPie2WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV136Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV47ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47ManageFiltersExecutionStep", GXutil.str( AV47ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TDevPie2WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV47ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47ManageFiltersExecutionStep", GXutil.str( AV47ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV46ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TDevPie2WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tdevpie2ww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV46ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV46ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV136Pgmname+"GridState", AV46ManageFiltersXml) ;
            AV10GridState.fromxml(AV46ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV101TFAlbRUni_Sels", AV101TFAlbRUni_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ColumnsSelector", AV42ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45ManageFiltersData", AV45ManageFiltersData);
   }

   public void e16CP2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tdevpie2", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","DevGenCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e17CP2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV38ExcelFilename ;
      GXv_char3[0] = AV39ErrorMessage ;
      new app.tdevpie2wwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tdevpie2ww_impl.this.AV38ExcelFilename = GXv_char4[0] ;
      tdevpie2ww_impl.this.AV39ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV38ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV38ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV39ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV101TFAlbRUni_Sels", AV101TFAlbRUni_Sels);
   }

   public void e18CP2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tdevpie2wwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV101TFAlbRUni_Sels", AV101TFAlbRUni_Sels);
   }

   public void e19CP2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tdevpie2wwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV101TFAlbRUni_Sels", AV101TFAlbRUni_Sels);
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
      AV42ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevGenCod", "", "N Devolucion ID", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevGenFec", "", "Fecha de Devolucion", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevGenDom", "", "Domicilio Envio", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRef", "", "Cdg.Ref.", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevGenTrn", "", "Transportista", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevTrnNom", "", "Nombre", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUniDis", "", "Und.Disp.", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRPieDis", "", "Piezas Disponibles", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUni", "", "Unidad", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevGenUni", "", "Unidades Dev", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV42ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevGenPie", "", "Piezas Dev", true, "") ;
      AV42ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV41UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TDevPie2WWColumnsSelector", GXv_char4) ;
      tdevpie2ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV41UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV41UserCustomValue)==0) ) )
      {
         AV43ColumnsSelectorAux.fromxml(AV41UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV43ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV42ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV43ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV42ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV45ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TDevPie2WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV45ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV99FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99FilterFullText", AV99FilterFullText);
      AV49TFDevGenCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFDevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFDevGenCod), 8, 0));
      AV50TFDevGenCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFDevGenCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDevGenCod_To), 8, 0));
      AV52TFDevGenFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFDevGenFec", localUtil.format(AV52TFDevGenFec, "99/99/99"));
      AV57TFAlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbRecCod), 8, 0));
      AV58TFAlbRecCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRecCod_To), 8, 0));
      AV60TFDevGenDom = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFDevGenDom", GXutil.str( AV60TFDevGenDom, 1, 0));
      AV61TFDevGenDom_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFDevGenDom_To", GXutil.str( AV61TFDevGenDom_To, 1, 0));
      AV63TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFCliCod), 6, 0));
      AV64TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFCliCod_To), 6, 0));
      AV66TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFCliNom", AV66TFCliNom);
      AV67TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliNom_Sel", AV67TFCliNom_Sel);
      AV69TFAlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbRef", AV69TFAlbRef);
      AV70TFAlbRef_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFAlbRef_Sel", AV70TFAlbRef_Sel);
      AV72TFDevGenTrn = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFDevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFDevGenTrn), 4, 0));
      AV73TFDevGenTrn_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFDevGenTrn_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFDevGenTrn_To), 4, 0));
      AV75TFDevTrnNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFDevTrnNom", AV75TFDevTrnNom);
      AV76TFDevTrnNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFDevTrnNom_Sel", AV76TFDevTrnNom_Sel);
      AV78TFAlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TFAlbRUniDis", GXutil.ltrimstr( AV78TFAlbRUniDis, 9, 2));
      AV79TFAlbRUniDis_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFAlbRUniDis_To", GXutil.ltrimstr( AV79TFAlbRUniDis_To, 9, 2));
      AV81TFAlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFAlbRPieDis), 6, 0));
      AV82TFAlbRPieDis_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFAlbRPieDis_To), 6, 0));
      AV101TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV87TFDevGenUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFDevGenUni", GXutil.ltrimstr( AV87TFDevGenUni, 9, 2));
      AV88TFDevGenUni_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFDevGenUni_To", GXutil.ltrimstr( AV88TFDevGenUni_To, 9, 2));
      AV90TFDevGenPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFDevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFDevGenPie), 4, 0));
      AV91TFDevGenPie_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFDevGenPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFDevGenPie_To), 4, 0));
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
      callWebObject(formatLink("app.tdevpie2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A323DevGenCod,8,0))}, new String[] {"Mode","EmprCod","DevGenCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tdevpie2", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A323DevGenCod,8,0))}, new String[] {"Mode","EmprCod","DevGenCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV44Session.getValue(AV136Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV136Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV44Session.getValue(AV136Pgmname+"GridState"), null, null);
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
      AV137GXV1 = 1 ;
      while ( AV137GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV137GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV99FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99FilterFullText", AV99FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENCOD") == 0 )
         {
            AV49TFDevGenCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFDevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFDevGenCod), 8, 0));
            AV50TFDevGenCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFDevGenCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDevGenCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENFEC") == 0 )
         {
            AV52TFDevGenFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFDevGenFec", localUtil.format(AV52TFDevGenFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV57TFAlbRecCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbRecCod), 8, 0));
            AV58TFAlbRecCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENDOM") == 0 )
         {
            AV60TFDevGenDom = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFDevGenDom", GXutil.str( AV60TFDevGenDom, 1, 0));
            AV61TFDevGenDom_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFDevGenDom_To", GXutil.str( AV61TFDevGenDom_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV63TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFCliCod), 6, 0));
            AV64TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV66TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFCliNom", AV66TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV67TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliNom_Sel", AV67TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV69TFAlbRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbRef", AV69TFAlbRef);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV70TFAlbRef_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFAlbRef_Sel", AV70TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENTRN") == 0 )
         {
            AV72TFDevGenTrn = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFDevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFDevGenTrn), 4, 0));
            AV73TFDevGenTrn_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFDevGenTrn_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFDevGenTrn_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM") == 0 )
         {
            AV75TFDevTrnNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFDevTrnNom", AV75TFDevTrnNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM_SEL") == 0 )
         {
            AV76TFDevTrnNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFDevTrnNom_Sel", AV76TFDevTrnNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV78TFAlbRUniDis = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFAlbRUniDis", GXutil.ltrimstr( AV78TFAlbRUniDis, 9, 2));
            AV79TFAlbRUniDis_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFAlbRUniDis_To", GXutil.ltrimstr( AV79TFAlbRUniDis_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV81TFAlbRPieDis = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFAlbRPieDis), 6, 0));
            AV82TFAlbRPieDis_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFAlbRPieDis_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV100TFAlbRUni_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFAlbRUni_SelsJson", AV100TFAlbRUni_SelsJson);
            AV101TFAlbRUni_Sels.fromJSonString(AV100TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENUNI") == 0 )
         {
            AV87TFDevGenUni = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFDevGenUni", GXutil.ltrimstr( AV87TFDevGenUni, 9, 2));
            AV88TFDevGenUni_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFDevGenUni_To", GXutil.ltrimstr( AV88TFDevGenUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENPIE") == 0 )
         {
            AV90TFDevGenPie = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFDevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFDevGenPie), 4, 0));
            AV91TFDevGenPie_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFDevGenPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFDevGenPie_To), 4, 0));
         }
         AV137GXV1 = (int)(AV137GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFCliNom_Sel)==0), AV67TFCliNom_Sel, GXv_char4) ;
      tdevpie2ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFAlbRef_Sel)==0), AV70TFAlbRef_Sel, GXv_char3) ;
      tdevpie2ww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFDevTrnNom_Sel)==0), AV76TFDevTrnNom_Sel, GXv_char2) ;
      tdevpie2ww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV101TFAlbRUni_Sels.size()==0), AV100TFAlbRUni_SelsJson, GXv_char15) ;
      tdevpie2ww_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|||||"+GXt_char1+"|"+GXt_char12+"||"+GXt_char13+"|||"+GXt_char14+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFCliNom)==0), AV66TFCliNom, GXv_char15) ;
      tdevpie2ww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFAlbRef)==0), AV69TFAlbRef, GXv_char4) ;
      tdevpie2ww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFDevTrnNom)==0), AV75TFDevTrnNom, GXv_char3) ;
      tdevpie2ww_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV49TFDevGenCod) ? "" : GXutil.str( AV49TFDevGenCod, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFDevGenFec)) ? "" : localUtil.dtoc( AV52TFDevGenFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV57TFAlbRecCod) ? "" : GXutil.str( AV57TFAlbRecCod, 8, 0))+"|"+((0==AV60TFDevGenDom) ? "" : GXutil.str( AV60TFDevGenDom, 1, 0))+"|"+((0==AV63TFCliCod) ? "" : GXutil.str( AV63TFCliCod, 6, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+((0==AV72TFDevGenTrn) ? "" : GXutil.str( AV72TFDevGenTrn, 4, 0))+"|"+GXt_char12+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFAlbRUniDis)==0) ? "" : GXutil.str( AV78TFAlbRUniDis, 9, 2))+"|"+((0==AV81TFAlbRPieDis) ? "" : GXutil.str( AV81TFAlbRPieDis, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFDevGenUni)==0) ? "" : GXutil.str( AV87TFDevGenUni, 9, 2))+"|"+((0==AV90TFDevGenPie) ? "" : GXutil.str( AV90TFDevGenPie, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV50TFDevGenCod_To) ? "" : GXutil.str( AV50TFDevGenCod_To, 8, 0))+"||"+((0==AV58TFAlbRecCod_To) ? "" : GXutil.str( AV58TFAlbRecCod_To, 8, 0))+"|"+((0==AV61TFDevGenDom_To) ? "" : GXutil.str( AV61TFDevGenDom_To, 1, 0))+"|"+((0==AV64TFCliCod_To) ? "" : GXutil.str( AV64TFCliCod_To, 6, 0))+"|||"+((0==AV73TFDevGenTrn_To) ? "" : GXutil.str( AV73TFDevGenTrn_To, 4, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFAlbRUniDis_To)==0) ? "" : GXutil.str( AV79TFAlbRUniDis_To, 9, 2))+"|"+((0==AV82TFAlbRPieDis_To) ? "" : GXutil.str( AV82TFAlbRPieDis_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFDevGenUni_To)==0) ? "" : GXutil.str( AV88TFDevGenUni_To, 9, 2))+"|"+((0==AV91TFDevGenPie_To) ? "" : GXutil.str( AV91TFDevGenPie_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV44Session.getValue(AV136Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV99FilterFullText)==0), (short)(0), AV99FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVGENCOD", "", !((0==AV49TFDevGenCod)&&(0==AV50TFDevGenCod_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFDevGenCod, 8, 0)), GXutil.trim( GXutil.str( AV50TFDevGenCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVGENFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFDevGenFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV52TFDevGenFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRECCOD", "", !((0==AV57TFAlbRecCod)&&(0==AV58TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV58TFAlbRecCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVGENDOM", "", !((0==AV60TFDevGenDom)&&(0==AV61TFDevGenDom_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFDevGenDom, 1, 0)), GXutil.trim( GXutil.str( AV61TFDevGenDom_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCLICOD", "", !((0==AV63TFCliCod)&&(0==AV64TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV63TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV64TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCLINOM", "", !(GXutil.strcmp("", AV66TFCliNom)==0), (short)(0), AV66TFCliNom, "", !(GXutil.strcmp("", AV67TFCliNom_Sel)==0), AV67TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBREF", "", !(GXutil.strcmp("", AV69TFAlbRef)==0), (short)(0), AV69TFAlbRef, "", !(GXutil.strcmp("", AV70TFAlbRef_Sel)==0), AV70TFAlbRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVGENTRN", "", !((0==AV72TFDevGenTrn)&&(0==AV73TFDevGenTrn_To)), (short)(0), GXutil.trim( GXutil.str( AV72TFDevGenTrn, 4, 0)), GXutil.trim( GXutil.str( AV73TFDevGenTrn_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVTRNNOM", "", !(GXutil.strcmp("", AV75TFDevTrnNom)==0), (short)(0), AV75TFDevTrnNom, "", !(GXutil.strcmp("", AV76TFDevTrnNom_Sel)==0), AV76TFDevTrnNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRUNIDIS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFAlbRUniDis)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFAlbRUniDis_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV78TFAlbRUniDis, 9, 2)), GXutil.trim( GXutil.str( AV79TFAlbRUniDis_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRPIEDIS", "", !((0==AV81TFAlbRPieDis)&&(0==AV82TFAlbRPieDis_To)), (short)(0), GXutil.trim( GXutil.str( AV81TFAlbRPieDis, 6, 0)), GXutil.trim( GXutil.str( AV82TFAlbRPieDis_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRUNI_SEL", "", !(AV101TFAlbRUni_Sels.size()==0), (short)(0), AV101TFAlbRUni_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVGENUNI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFDevGenUni)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFDevGenUni_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV87TFDevGenUni, 9, 2)), GXutil.trim( GXutil.str( AV88TFDevGenUni_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVGENPIE", "", !((0==AV90TFDevGenPie)&&(0==AV91TFDevGenPie_To)), (short)(0), GXutil.trim( GXutil.str( AV90TFDevGenPie, 4, 0)), GXutil.trim( GXutil.str( AV91TFDevGenPie_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV136Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV136Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TDevPie2" );
      AV44Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_CP2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV45ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_CP2( true) ;
      }
      else
      {
         wb_table2_32_CP2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_CP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_CP2e( true) ;
      }
      else
      {
         wb_table1_27_CP2e( false) ;
      }
   }

   public void wb_table2_32_CP2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV99FilterFullText, GXutil.rtrim( localUtil.format( AV99FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TDevPie2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_CP2e( true) ;
      }
      else
      {
         wb_table2_32_CP2e( false) ;
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
      paCP2( ) ;
      wsCP2( ) ;
      weCP2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415125950", true, true);
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
      httpContext.AddJavascriptSource("tdevpie2ww.js", "?202682415125950", false, true);
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
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_idx ;
      edtDevGenCod_Internalname = "DEVGENCOD_"+sGXsfl_45_idx ;
      edtDevGenFec_Internalname = "DEVGENFEC_"+sGXsfl_45_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_45_idx ;
      edtDevGenDom_Internalname = "DEVGENDOM_"+sGXsfl_45_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_45_idx ;
      edtDevGenTrn_Internalname = "DEVGENTRN_"+sGXsfl_45_idx ;
      edtDevTrnNom_Internalname = "DEVTRNNOM_"+sGXsfl_45_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_45_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_45_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_45_idx );
      edtDevGenUni_Internalname = "DEVGENUNI_"+sGXsfl_45_idx ;
      edtDevGenPie_Internalname = "DEVGENPIE_"+sGXsfl_45_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_45_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_45_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_45_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_45_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_45_idx );
      edtDevGenEst_Internalname = "DEVGENEST_"+sGXsfl_45_idx ;
      edtAlbDevPUni_Internalname = "ALBDEVPUNI_"+sGXsfl_45_idx ;
      edtAlbDevPPie_Internalname = "ALBDEVPPIE_"+sGXsfl_45_idx ;
      edtDevUlin_Internalname = "DEVULIN_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_fel_idx ;
      edtDevGenCod_Internalname = "DEVGENCOD_"+sGXsfl_45_fel_idx ;
      edtDevGenFec_Internalname = "DEVGENFEC_"+sGXsfl_45_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_45_fel_idx ;
      edtDevGenDom_Internalname = "DEVGENDOM_"+sGXsfl_45_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_45_fel_idx ;
      edtDevGenTrn_Internalname = "DEVGENTRN_"+sGXsfl_45_fel_idx ;
      edtDevTrnNom_Internalname = "DEVTRNNOM_"+sGXsfl_45_fel_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_45_fel_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_45_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_45_fel_idx );
      edtDevGenUni_Internalname = "DEVGENUNI_"+sGXsfl_45_fel_idx ;
      edtDevGenPie_Internalname = "DEVGENPIE_"+sGXsfl_45_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_45_fel_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_45_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_45_fel_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_45_fel_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_45_fel_idx );
      edtDevGenEst_Internalname = "DEVGENEST_"+sGXsfl_45_fel_idx ;
      edtAlbDevPUni_Internalname = "ALBDEVPUNI_"+sGXsfl_45_fel_idx ;
      edtAlbDevPPie_Internalname = "ALBDEVPPIE_"+sGXsfl_45_fel_idx ;
      edtDevUlin_Internalname = "DEVULIN_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wbCP0( ) ;
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
               AV102GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV102GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV102GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e23cp2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV102GridActions, 4, 0)) );
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevGenCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevGenCod_Internalname,GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevGenCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevGenCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevGenFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevGenFec_Internalname,localUtil.format(A325DevGenFec, "99/99/99"),localUtil.format( A325DevGenFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevGenFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDevGenFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRecCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevGenDom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevGenDom_Internalname,GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevGenDom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevGenDom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRef_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevGenTrn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevGenTrn_Internalname,GXutil.ltrim( localUtil.ntoc( A327DevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A327DevGenTrn), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Codigo Transportista", ""),"",edtDevGenTrn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevGenTrn_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDevTrnNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevTrnNom_Internalname,GXutil.rtrim( A329DevTrnNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevTrnNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevTrnNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRUniDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRUniDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRPieDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRPieDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         GXCCtl = "ALBRUNI_" + sGXsfl_45_idx ;
         cmbAlbRUni.setName( GXCCtl );
         cmbAlbRUni.setWebtags( "" );
         cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
         cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
         if ( cmbAlbRUni.getItemCount() > 0 )
         {
            A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbRUni.getVisible()),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevGenUni_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevGenUni_Internalname,GXutil.ltrim( localUtil.ntoc( A328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A328DevGenUni, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevGenUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevGenUni_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevGenPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevGenPie_Internalname,GXutil.ltrim( localUtil.ntoc( A326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevGenPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevGenPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         GXCCtl = "ALBREST_" + sGXsfl_45_idx ;
         cmbAlbREst.setName( GXCCtl );
         cmbAlbREst.setWebtags( "" );
         cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
         cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
         if ( cmbAlbREst.getItemCount() > 0 )
         {
            A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbREst,cmbAlbREst.getInternalname(),GXutil.trim( GXutil.str( A47AlbREst, 1, 0)),Integer.valueOf(1),cmbAlbREst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevGenEst_Internalname,GXutil.ltrim( localUtil.ntoc( A324DevGenEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A324DevGenEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevGenEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbDevPUni_Internalname,GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3066AlbDevPUni, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbDevPUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbDevPPie_Internalname,GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5278AlbDevPPie), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbDevPPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevUlin_Internalname,GXutil.ltrim( localUtil.ntoc( A1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1304DevUlin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevUlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesCP2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevGenCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Devolucion ID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevGenFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha de Devolucion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevGenDom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Domicilio Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cdg.Ref.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevGenTrn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevTrnNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniDis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und.Disp.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieDis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Disponibles", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevGenUni_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Dev", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevGenPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Dev", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV102GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevGenCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A325DevGenFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevGenFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevGenDom_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A327DevGenTrn, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevGenTrn_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A329DevTrnNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevTrnNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A328DevGenUni, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevGenUni_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A326DevGenPie, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevGenPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A324DevGenEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1304DevUlin, (byte)(2), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtDevGenCod_Internalname = "DEVGENCOD" ;
      edtDevGenFec_Internalname = "DEVGENFEC" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtDevGenDom_Internalname = "DEVGENDOM" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtDevGenTrn_Internalname = "DEVGENTRN" ;
      edtDevTrnNom_Internalname = "DEVTRNNOM" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtDevGenUni_Internalname = "DEVGENUNI" ;
      edtDevGenPie_Internalname = "DEVGENPIE" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      edtDevGenEst_Internalname = "DEVGENEST" ;
      edtAlbDevPUni_Internalname = "ALBDEVPUNI" ;
      edtAlbDevPPie_Internalname = "ALBDEVPPIE" ;
      edtDevUlin_Internalname = "DEVULIN" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_devgenfecauxdate_Internalname = "vDDO_DEVGENFECAUXDATE" ;
      divDdo_devgenfecauxdates_Internalname = "DDO_DEVGENFECAUXDATES" ;
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
      edtDevUlin_Jsonclick = "" ;
      edtAlbDevPPie_Jsonclick = "" ;
      edtAlbDevPUni_Jsonclick = "" ;
      edtDevGenEst_Jsonclick = "" ;
      cmbAlbREst.setJsonclick( "" );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtDevGenPie_Jsonclick = "" ;
      edtDevGenUni_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtDevTrnNom_Jsonclick = "" ;
      edtDevGenTrn_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtDevGenDom_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtDevGenFec_Jsonclick = "" ;
      edtDevGenCod_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtDevGenPie_Visible = -1 ;
      edtDevGenUni_Visible = -1 ;
      cmbAlbRUni.setVisible( -1 );
      edtAlbRPieDis_Visible = -1 ;
      edtAlbRUniDis_Visible = -1 ;
      edtDevTrnNom_Visible = -1 ;
      edtDevGenTrn_Visible = -1 ;
      edtAlbRef_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtDevGenDom_Visible = -1 ;
      edtAlbRecCod_Visible = -1 ;
      edtDevGenFec_Visible = -1 ;
      edtDevGenCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_devgenfecauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TDevPie2WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||K:K,M:M||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||T||" ;
      Ddo_grid_Datalisttype = "|||||Dynamic|Dynamic||Dynamic|||FixedValues||" ;
      Ddo_grid_Includedatalist = "|||||T|T||T|||T||" ;
      Ddo_grid_Filterisrange = "T||T|T|T|||T||T|T||T|T" ;
      Ddo_grid_Filtertype = "Numeric|Date|Numeric|Numeric|Numeric|Character|Character|Numeric|Character|Numeric|Numeric||Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T||T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|||T|T|T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|||10|11|12" ;
      Ddo_grid_Columnids = "3:DevGenCod|4:DevGenFec|5:AlbRecCod|6:DevGenDom|7:CliCod|8:CliNom|9:AlbRef|10:DevGenTrn|11:DevTrnNom|12:AlbRUniDis|13:AlbRPieDis|14:AlbRUni|15:DevGenUni|16:DevGenPie" ;
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
      Form.setCaption( httpContext.getMessage( " Devolucion de Piezas (Detail)", "") );
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
         AV102GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV102GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102GridActions), 4, 0));
      }
      GXCCtl = "ALBRUNI_" + sGXsfl_45_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      GXCCtl = "ALBREST_" + sGXsfl_45_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV99FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDevGenCod_Visible',ctrl:'DEVGENCOD',prop:'Visible'},{av:'edtDevGenFec_Visible',ctrl:'DEVGENFEC',prop:'Visible'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtDevGenDom_Visible',ctrl:'DEVGENDOM',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtDevGenTrn_Visible',ctrl:'DEVGENTRN',prop:'Visible'},{av:'edtDevTrnNom_Visible',ctrl:'DEVTRNNOM',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtDevGenUni_Visible',ctrl:'DEVGENUNI',prop:'Visible'},{av:'edtDevGenPie_Visible',ctrl:'DEVGENPIE',prop:'Visible'},{av:'AV95GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV96GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV45ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12CP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13CP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14CP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22CP2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV102GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15CP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtDevGenCod_Visible',ctrl:'DEVGENCOD',prop:'Visible'},{av:'edtDevGenFec_Visible',ctrl:'DEVGENFEC',prop:'Visible'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtDevGenDom_Visible',ctrl:'DEVGENDOM',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtDevGenTrn_Visible',ctrl:'DEVGENTRN',prop:'Visible'},{av:'edtDevTrnNom_Visible',ctrl:'DEVTRNNOM',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtDevGenUni_Visible',ctrl:'DEVGENUNI',prop:'Visible'},{av:'edtDevGenPie_Visible',ctrl:'DEVGENPIE',prop:'Visible'},{av:'AV95GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV96GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV45ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11CP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV100TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV99FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV100TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDevGenCod_Visible',ctrl:'DEVGENCOD',prop:'Visible'},{av:'edtDevGenFec_Visible',ctrl:'DEVGENFEC',prop:'Visible'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtDevGenDom_Visible',ctrl:'DEVGENDOM',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtDevGenTrn_Visible',ctrl:'DEVGENTRN',prop:'Visible'},{av:'edtDevTrnNom_Visible',ctrl:'DEVTRNNOM',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtDevGenUni_Visible',ctrl:'DEVGENUNI',prop:'Visible'},{av:'edtDevGenPie_Visible',ctrl:'DEVGENPIE',prop:'Visible'},{av:'AV95GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV96GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV45ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23CP2',iparms:[{av:'cmbavGridactions'},{av:'AV102GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A323DevGenCod',fld:'DEVGENCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV102GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16CP2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A323DevGenCod',fld:'DEVGENCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17CP2',iparms:[{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV100TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV100TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18CP2',iparms:[{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV100TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV100TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19CP2',iparms:[{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV100TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV47ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV42ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV99FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFDevGenCod',fld:'vTFDEVGENCOD',pic:'ZZZZZZZ9'},{av:'AV50TFDevGenCod_To',fld:'vTFDEVGENCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFDevGenFec',fld:'vTFDEVGENFEC',pic:''},{av:'AV57TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV58TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV60TFDevGenDom',fld:'vTFDEVGENDOM',pic:'9'},{av:'AV61TFDevGenDom_To',fld:'vTFDEVGENDOM_TO',pic:'9'},{av:'AV63TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV66TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV69TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV70TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV72TFDevGenTrn',fld:'vTFDEVGENTRN',pic:'ZZZ9'},{av:'AV73TFDevGenTrn_To',fld:'vTFDEVGENTRN_TO',pic:'ZZZ9'},{av:'AV75TFDevTrnNom',fld:'vTFDEVTRNNOM',pic:''},{av:'AV76TFDevTrnNom_Sel',fld:'vTFDEVTRNNOM_SEL',pic:''},{av:'AV78TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV79TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV81TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV82TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV101TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV87TFDevGenUni',fld:'vTFDEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV88TFDevGenUni_To',fld:'vTFDEVGENUNI_TO',pic:'ZZZZZ9.99'},{av:'AV90TFDevGenPie',fld:'vTFDEVGENPIE',pic:'ZZZ9'},{av:'AV91TFDevGenPie_To',fld:'vTFDEVGENPIE_TO',pic:'ZZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV100TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DEVGENCOD","{handler:'valid_Devgencod',iparms:[]");
      setEventMetadata("VALID_DEVGENCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_DEVGENDOM","{handler:'valid_Devgendom',iparms:[]");
      setEventMetadata("VALID_DEVGENDOM",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[]");
      setEventMetadata("VALID_ALBREF",",oparms:[]}");
      setEventMetadata("VALID_DEVGENTRN","{handler:'valid_Devgentrn',iparms:[]");
      setEventMetadata("VALID_DEVGENTRN",",oparms:[]}");
      setEventMetadata("VALID_DEVTRNNOM","{handler:'valid_Devtrnnom',iparms:[]");
      setEventMetadata("VALID_DEVTRNNOM",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEDIS","{handler:'valid_Albrpiedis',iparms:[]");
      setEventMetadata("VALID_ALBRPIEDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_DEVGENUNI","{handler:'valid_Devgenuni',iparms:[]");
      setEventMetadata("VALID_DEVGENUNI",",oparms:[]}");
      setEventMetadata("VALID_DEVGENPIE","{handler:'valid_Devgenpie',iparms:[]");
      setEventMetadata("VALID_DEVGENPIE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Devulin',iparms:[]");
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
      AV42ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV99FilterFullText = "" ;
      AV52TFDevGenFec = GXutil.nullDate() ;
      AV66TFCliNom = "" ;
      AV67TFCliNom_Sel = "" ;
      AV69TFAlbRef = "" ;
      AV70TFAlbRef_Sel = "" ;
      AV75TFDevTrnNom = "" ;
      AV76TFDevTrnNom_Sel = "" ;
      AV78TFAlbRUniDis = DecimalUtil.ZERO ;
      AV79TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV101TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV87TFDevGenUni = DecimalUtil.ZERO ;
      AV88TFDevGenUni_To = DecimalUtil.ZERO ;
      AV136Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV45ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV93DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV100TFAlbRUni_SelsJson = "" ;
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
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV54DDO_DevGenFecAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A329DevTrnNom = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      AV109Tdevpie2wwds_1_filterfulltext = "" ;
      AV112Tdevpie2wwds_4_tfdevgenfec = GXutil.nullDate() ;
      AV119Tdevpie2wwds_11_tfclinom = "" ;
      AV120Tdevpie2wwds_12_tfclinom_sel = "" ;
      AV121Tdevpie2wwds_13_tfalbref = "" ;
      AV122Tdevpie2wwds_14_tfalbref_sel = "" ;
      AV125Tdevpie2wwds_17_tfdevtrnnom = "" ;
      AV126Tdevpie2wwds_18_tfdevtrnnom_sel = "" ;
      AV127Tdevpie2wwds_19_tfalbrunidis = DecimalUtil.ZERO ;
      AV128Tdevpie2wwds_20_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV131Tdevpie2wwds_23_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV132Tdevpie2wwds_24_tfdevgenuni = DecimalUtil.ZERO ;
      AV133Tdevpie2wwds_25_tfdevgenuni_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV109Tdevpie2wwds_1_filterfulltext = "" ;
      lV119Tdevpie2wwds_11_tfclinom = "" ;
      lV121Tdevpie2wwds_13_tfalbref = "" ;
      lV125Tdevpie2wwds_17_tfdevtrnnom = "" ;
      H00CP3_A1304DevUlin = new byte[1] ;
      H00CP3_n1304DevUlin = new boolean[] {false} ;
      H00CP3_A324DevGenEst = new byte[1] ;
      H00CP3_n324DevGenEst = new boolean[] {false} ;
      H00CP3_A47AlbREst = new byte[1] ;
      H00CP3_A326DevGenPie = new short[1] ;
      H00CP3_n326DevGenPie = new boolean[] {false} ;
      H00CP3_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CP3_n328DevGenUni = new boolean[] {false} ;
      H00CP3_A56AlbRUni = new String[] {""} ;
      H00CP3_A51AlbRPieDis = new int[1] ;
      H00CP3_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CP3_A329DevTrnNom = new String[] {""} ;
      H00CP3_n329DevTrnNom = new boolean[] {false} ;
      H00CP3_A327DevGenTrn = new short[1] ;
      H00CP3_n327DevGenTrn = new boolean[] {false} ;
      H00CP3_A45AlbRef = new String[] {""} ;
      H00CP3_A279CliNom = new String[] {""} ;
      H00CP3_A252CliCod = new int[1] ;
      H00CP3_n252CliCod = new boolean[] {false} ;
      H00CP3_A6288DevGenDom = new byte[1] ;
      H00CP3_n6288DevGenDom = new boolean[] {false} ;
      H00CP3_A44AlbRecCod = new int[1] ;
      H00CP3_n44AlbRecCod = new boolean[] {false} ;
      H00CP3_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00CP3_n325DevGenFec = new boolean[] {false} ;
      H00CP3_A323DevGenCod = new int[1] ;
      H00CP3_A407EmprNom = new String[] {""} ;
      H00CP3_n407EmprNom = new boolean[] {false} ;
      H00CP3_A396EmprCod = new String[] {""} ;
      H00CP3_A5278AlbDevPPie = new short[1] ;
      H00CP3_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CP3_A52AlbRPieEnt = new int[1] ;
      H00CP3_A54AlbRPieUti = new int[1] ;
      H00CP3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CP3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CP5_A1304DevUlin = new byte[1] ;
      H00CP5_n1304DevUlin = new boolean[] {false} ;
      H00CP5_A324DevGenEst = new byte[1] ;
      H00CP5_n324DevGenEst = new boolean[] {false} ;
      H00CP5_A47AlbREst = new byte[1] ;
      H00CP5_A326DevGenPie = new short[1] ;
      H00CP5_n326DevGenPie = new boolean[] {false} ;
      H00CP5_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CP5_n328DevGenUni = new boolean[] {false} ;
      H00CP5_A56AlbRUni = new String[] {""} ;
      H00CP5_A51AlbRPieDis = new int[1] ;
      H00CP5_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CP5_A329DevTrnNom = new String[] {""} ;
      H00CP5_n329DevTrnNom = new boolean[] {false} ;
      H00CP5_A327DevGenTrn = new short[1] ;
      H00CP5_n327DevGenTrn = new boolean[] {false} ;
      H00CP5_A45AlbRef = new String[] {""} ;
      H00CP5_A279CliNom = new String[] {""} ;
      H00CP5_A252CliCod = new int[1] ;
      H00CP5_n252CliCod = new boolean[] {false} ;
      H00CP5_A6288DevGenDom = new byte[1] ;
      H00CP5_n6288DevGenDom = new boolean[] {false} ;
      H00CP5_A44AlbRecCod = new int[1] ;
      H00CP5_n44AlbRecCod = new boolean[] {false} ;
      H00CP5_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00CP5_n325DevGenFec = new boolean[] {false} ;
      H00CP5_A323DevGenCod = new int[1] ;
      H00CP5_A407EmprNom = new String[] {""} ;
      H00CP5_n407EmprNom = new boolean[] {false} ;
      H00CP5_A396EmprCod = new String[] {""} ;
      H00CP5_A5278AlbDevPPie = new short[1] ;
      H00CP5_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CP5_A52AlbRPieEnt = new int[1] ;
      H00CP5_A54AlbRPieUti = new int[1] ;
      H00CP5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CP5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV105Station = "" ;
      AV106Emprcod = "" ;
      AV107Emprnom = "" ;
      AV108Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV44Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV46ManageFiltersXml = "" ;
      AV38ExcelFilename = "" ;
      AV39ErrorMessage = "" ;
      AV41UserCustomValue = "" ;
      AV43ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie2ww__default(),
         new Object[] {
             new Object[] {
            H00CP3_A1304DevUlin, H00CP3_n1304DevUlin, H00CP3_A324DevGenEst, H00CP3_n324DevGenEst, H00CP3_A47AlbREst, H00CP3_A326DevGenPie, H00CP3_n326DevGenPie, H00CP3_A328DevGenUni, H00CP3_n328DevGenUni, H00CP3_A56AlbRUni,
            H00CP3_A51AlbRPieDis, H00CP3_A57AlbRUniDis, H00CP3_A329DevTrnNom, H00CP3_n329DevTrnNom, H00CP3_A327DevGenTrn, H00CP3_n327DevGenTrn, H00CP3_A45AlbRef, H00CP3_A279CliNom, H00CP3_A252CliCod, H00CP3_n252CliCod,
            H00CP3_A6288DevGenDom, H00CP3_n6288DevGenDom, H00CP3_A44AlbRecCod, H00CP3_n44AlbRecCod, H00CP3_A325DevGenFec, H00CP3_n325DevGenFec, H00CP3_A323DevGenCod, H00CP3_A407EmprNom, H00CP3_n407EmprNom, H00CP3_A396EmprCod,
            H00CP3_A5278AlbDevPPie, H00CP3_A3066AlbDevPUni, H00CP3_A52AlbRPieEnt, H00CP3_A54AlbRPieUti, H00CP3_A58AlbRUniEnt, H00CP3_A60AlbRUniUti
            }
            , new Object[] {
            H00CP5_A1304DevUlin, H00CP5_n1304DevUlin, H00CP5_A324DevGenEst, H00CP5_n324DevGenEst, H00CP5_A47AlbREst, H00CP5_A326DevGenPie, H00CP5_n326DevGenPie, H00CP5_A328DevGenUni, H00CP5_n328DevGenUni, H00CP5_A56AlbRUni,
            H00CP5_A51AlbRPieDis, H00CP5_A57AlbRUniDis, H00CP5_A329DevTrnNom, H00CP5_n329DevTrnNom, H00CP5_A327DevGenTrn, H00CP5_n327DevGenTrn, H00CP5_A45AlbRef, H00CP5_A279CliNom, H00CP5_A252CliCod, H00CP5_n252CliCod,
            H00CP5_A6288DevGenDom, H00CP5_n6288DevGenDom, H00CP5_A44AlbRecCod, H00CP5_n44AlbRecCod, H00CP5_A325DevGenFec, H00CP5_n325DevGenFec, H00CP5_A323DevGenCod, H00CP5_A407EmprNom, H00CP5_n407EmprNom, H00CP5_A396EmprCod,
            H00CP5_A5278AlbDevPPie, H00CP5_A3066AlbDevPUni, H00CP5_A52AlbRPieEnt, H00CP5_A54AlbRPieUti, H00CP5_A58AlbRUniEnt, H00CP5_A60AlbRUniUti
            }
         }
      );
      AV136Pgmname = "TDevPie2WW" ;
      /* GeneXus formulas. */
      AV136Pgmname = "TDevPie2WW" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV47ManageFiltersExecutionStep ;
   private byte AV60TFDevGenDom ;
   private byte AV61TFDevGenDom_To ;
   private byte gxajaxcallmode ;
   private byte A6288DevGenDom ;
   private byte A47AlbREst ;
   private byte A324DevGenEst ;
   private byte A1304DevUlin ;
   private byte nDonePA ;
   private byte AV115Tdevpie2wwds_7_tfdevgendom ;
   private byte AV116Tdevpie2wwds_8_tfdevgendom_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV72TFDevGenTrn ;
   private short AV73TFDevGenTrn_To ;
   private short AV90TFDevGenPie ;
   private short AV91TFDevGenPie_To ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV102GridActions ;
   private short A327DevGenTrn ;
   private short A326DevGenPie ;
   private short A5278AlbDevPPie ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV123Tdevpie2wwds_15_tfdevgentrn ;
   private short AV124Tdevpie2wwds_16_tfdevgentrn_to ;
   private short AV134Tdevpie2wwds_26_tfdevgenpie ;
   private short AV135Tdevpie2wwds_27_tfdevgenpie_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV49TFDevGenCod ;
   private int AV50TFDevGenCod_To ;
   private int AV57TFAlbRecCod ;
   private int AV58TFAlbRecCod_To ;
   private int AV63TFCliCod ;
   private int AV64TFCliCod_To ;
   private int AV81TFAlbRPieDis ;
   private int AV82TFAlbRPieDis_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A51AlbRPieDis ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int subGrid_Islastpage ;
   private int AV110Tdevpie2wwds_2_tfdevgencod ;
   private int AV111Tdevpie2wwds_3_tfdevgencod_to ;
   private int AV113Tdevpie2wwds_5_tfalbreccod ;
   private int AV114Tdevpie2wwds_6_tfalbreccod_to ;
   private int AV117Tdevpie2wwds_9_tfclicod ;
   private int AV118Tdevpie2wwds_10_tfclicod_to ;
   private int AV129Tdevpie2wwds_21_tfalbrpiedis ;
   private int AV130Tdevpie2wwds_22_tfalbrpiedis_to ;
   private int AV131Tdevpie2wwds_23_tfalbruni_sels_size ;
   private int edtDevGenCod_Visible ;
   private int edtDevGenFec_Visible ;
   private int edtAlbRecCod_Visible ;
   private int edtDevGenDom_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtAlbRef_Visible ;
   private int edtDevGenTrn_Visible ;
   private int edtDevTrnNom_Visible ;
   private int edtAlbRUniDis_Visible ;
   private int edtAlbRPieDis_Visible ;
   private int edtDevGenUni_Visible ;
   private int edtDevGenPie_Visible ;
   private int AV94PageToGo ;
   private int AV137GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV95GridCurrentPage ;
   private long AV96GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV78TFAlbRUniDis ;
   private java.math.BigDecimal AV79TFAlbRUniDis_To ;
   private java.math.BigDecimal AV87TFDevGenUni ;
   private java.math.BigDecimal AV88TFDevGenUni_To ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A3066AlbDevPUni ;
   private java.math.BigDecimal AV127Tdevpie2wwds_19_tfalbrunidis ;
   private java.math.BigDecimal AV128Tdevpie2wwds_20_tfalbrunidis_to ;
   private java.math.BigDecimal AV132Tdevpie2wwds_24_tfdevgenuni ;
   private java.math.BigDecimal AV133Tdevpie2wwds_25_tfdevgenuni_to ;
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
   private String AV66TFCliNom ;
   private String AV67TFCliNom_Sel ;
   private String AV69TFAlbRef ;
   private String AV70TFAlbRef_Sel ;
   private String AV75TFDevTrnNom ;
   private String AV76TFDevTrnNom_Sel ;
   private String AV136Pgmname ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_devgenfecauxdates_Internalname ;
   private String edtavDdo_devgenfecauxdate_Internalname ;
   private String edtavDdo_devgenfecauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtDevGenCod_Internalname ;
   private String edtDevGenFec_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtDevGenDom_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Internalname ;
   private String edtDevGenTrn_Internalname ;
   private String A329DevTrnNom ;
   private String edtDevTrnNom_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String A56AlbRUni ;
   private String edtDevGenUni_Internalname ;
   private String edtDevGenPie_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtDevGenEst_Internalname ;
   private String edtAlbDevPUni_Internalname ;
   private String edtAlbDevPPie_Internalname ;
   private String edtDevUlin_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV119Tdevpie2wwds_11_tfclinom ;
   private String AV120Tdevpie2wwds_12_tfclinom_sel ;
   private String AV121Tdevpie2wwds_13_tfalbref ;
   private String AV122Tdevpie2wwds_14_tfalbref_sel ;
   private String AV125Tdevpie2wwds_17_tfdevtrnnom ;
   private String AV126Tdevpie2wwds_18_tfdevtrnnom_sel ;
   private String scmdbuf ;
   private String lV119Tdevpie2wwds_11_tfclinom ;
   private String lV121Tdevpie2wwds_13_tfalbref ;
   private String lV125Tdevpie2wwds_17_tfdevtrnnom ;
   private String AV105Station ;
   private String AV106Emprcod ;
   private String AV107Emprnom ;
   private String AV108Usurcod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
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
   private String edtEmprNom_Jsonclick ;
   private String edtDevGenCod_Jsonclick ;
   private String edtDevGenFec_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtDevGenDom_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtDevGenTrn_Jsonclick ;
   private String edtDevTrnNom_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtDevGenUni_Jsonclick ;
   private String edtDevGenPie_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtDevGenEst_Jsonclick ;
   private String edtAlbDevPUni_Jsonclick ;
   private String edtAlbDevPPie_Jsonclick ;
   private String edtDevUlin_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV52TFDevGenFec ;
   private java.util.Date AV54DDO_DevGenFecAuxDate ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date AV112Tdevpie2wwds_4_tfdevgenfec ;
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
   private boolean n407EmprNom ;
   private boolean n325DevGenFec ;
   private boolean n44AlbRecCod ;
   private boolean n6288DevGenDom ;
   private boolean n252CliCod ;
   private boolean n327DevGenTrn ;
   private boolean n329DevTrnNom ;
   private boolean n328DevGenUni ;
   private boolean n326DevGenPie ;
   private boolean n324DevGenEst ;
   private boolean n1304DevUlin ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV100TFAlbRUni_SelsJson ;
   private String AV40ColumnsSelectorXML ;
   private String AV46ManageFiltersXml ;
   private String AV41UserCustomValue ;
   private String AV99FilterFullText ;
   private String AV109Tdevpie2wwds_1_filterfulltext ;
   private String lV109Tdevpie2wwds_1_filterfulltext ;
   private String AV38ExcelFilename ;
   private String AV39ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV44Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private byte[] H00CP3_A1304DevUlin ;
   private boolean[] H00CP3_n1304DevUlin ;
   private byte[] H00CP3_A324DevGenEst ;
   private boolean[] H00CP3_n324DevGenEst ;
   private byte[] H00CP3_A47AlbREst ;
   private short[] H00CP3_A326DevGenPie ;
   private boolean[] H00CP3_n326DevGenPie ;
   private java.math.BigDecimal[] H00CP3_A328DevGenUni ;
   private boolean[] H00CP3_n328DevGenUni ;
   private String[] H00CP3_A56AlbRUni ;
   private int[] H00CP3_A51AlbRPieDis ;
   private java.math.BigDecimal[] H00CP3_A57AlbRUniDis ;
   private String[] H00CP3_A329DevTrnNom ;
   private boolean[] H00CP3_n329DevTrnNom ;
   private short[] H00CP3_A327DevGenTrn ;
   private boolean[] H00CP3_n327DevGenTrn ;
   private String[] H00CP3_A45AlbRef ;
   private String[] H00CP3_A279CliNom ;
   private int[] H00CP3_A252CliCod ;
   private boolean[] H00CP3_n252CliCod ;
   private byte[] H00CP3_A6288DevGenDom ;
   private boolean[] H00CP3_n6288DevGenDom ;
   private int[] H00CP3_A44AlbRecCod ;
   private boolean[] H00CP3_n44AlbRecCod ;
   private java.util.Date[] H00CP3_A325DevGenFec ;
   private boolean[] H00CP3_n325DevGenFec ;
   private int[] H00CP3_A323DevGenCod ;
   private String[] H00CP3_A407EmprNom ;
   private boolean[] H00CP3_n407EmprNom ;
   private String[] H00CP3_A396EmprCod ;
   private short[] H00CP3_A5278AlbDevPPie ;
   private java.math.BigDecimal[] H00CP3_A3066AlbDevPUni ;
   private int[] H00CP3_A52AlbRPieEnt ;
   private int[] H00CP3_A54AlbRPieUti ;
   private java.math.BigDecimal[] H00CP3_A58AlbRUniEnt ;
   private java.math.BigDecimal[] H00CP3_A60AlbRUniUti ;
   private byte[] H00CP5_A1304DevUlin ;
   private boolean[] H00CP5_n1304DevUlin ;
   private byte[] H00CP5_A324DevGenEst ;
   private boolean[] H00CP5_n324DevGenEst ;
   private byte[] H00CP5_A47AlbREst ;
   private short[] H00CP5_A326DevGenPie ;
   private boolean[] H00CP5_n326DevGenPie ;
   private java.math.BigDecimal[] H00CP5_A328DevGenUni ;
   private boolean[] H00CP5_n328DevGenUni ;
   private String[] H00CP5_A56AlbRUni ;
   private int[] H00CP5_A51AlbRPieDis ;
   private java.math.BigDecimal[] H00CP5_A57AlbRUniDis ;
   private String[] H00CP5_A329DevTrnNom ;
   private boolean[] H00CP5_n329DevTrnNom ;
   private short[] H00CP5_A327DevGenTrn ;
   private boolean[] H00CP5_n327DevGenTrn ;
   private String[] H00CP5_A45AlbRef ;
   private String[] H00CP5_A279CliNom ;
   private int[] H00CP5_A252CliCod ;
   private boolean[] H00CP5_n252CliCod ;
   private byte[] H00CP5_A6288DevGenDom ;
   private boolean[] H00CP5_n6288DevGenDom ;
   private int[] H00CP5_A44AlbRecCod ;
   private boolean[] H00CP5_n44AlbRecCod ;
   private java.util.Date[] H00CP5_A325DevGenFec ;
   private boolean[] H00CP5_n325DevGenFec ;
   private int[] H00CP5_A323DevGenCod ;
   private String[] H00CP5_A407EmprNom ;
   private boolean[] H00CP5_n407EmprNom ;
   private String[] H00CP5_A396EmprCod ;
   private short[] H00CP5_A5278AlbDevPPie ;
   private java.math.BigDecimal[] H00CP5_A3066AlbDevPUni ;
   private int[] H00CP5_A52AlbRPieEnt ;
   private int[] H00CP5_A54AlbRPieUti ;
   private java.math.BigDecimal[] H00CP5_A58AlbRUniEnt ;
   private java.math.BigDecimal[] H00CP5_A60AlbRUniUti ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV101TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV131Tdevpie2wwds_23_tfalbruni_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV45ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV42ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV43ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV93DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tdevpie2ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00CP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV131Tdevpie2wwds_23_tfalbruni_sels ,
                                          int AV110Tdevpie2wwds_2_tfdevgencod ,
                                          int AV111Tdevpie2wwds_3_tfdevgencod_to ,
                                          java.util.Date AV112Tdevpie2wwds_4_tfdevgenfec ,
                                          int AV113Tdevpie2wwds_5_tfalbreccod ,
                                          int AV114Tdevpie2wwds_6_tfalbreccod_to ,
                                          byte AV115Tdevpie2wwds_7_tfdevgendom ,
                                          byte AV116Tdevpie2wwds_8_tfdevgendom_to ,
                                          int AV117Tdevpie2wwds_9_tfclicod ,
                                          int AV118Tdevpie2wwds_10_tfclicod_to ,
                                          String AV120Tdevpie2wwds_12_tfclinom_sel ,
                                          String AV119Tdevpie2wwds_11_tfclinom ,
                                          String AV122Tdevpie2wwds_14_tfalbref_sel ,
                                          String AV121Tdevpie2wwds_13_tfalbref ,
                                          short AV123Tdevpie2wwds_15_tfdevgentrn ,
                                          short AV124Tdevpie2wwds_16_tfdevgentrn_to ,
                                          String AV126Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                          String AV125Tdevpie2wwds_17_tfdevtrnnom ,
                                          java.math.BigDecimal AV127Tdevpie2wwds_19_tfalbrunidis ,
                                          java.math.BigDecimal AV128Tdevpie2wwds_20_tfalbrunidis_to ,
                                          int AV129Tdevpie2wwds_21_tfalbrpiedis ,
                                          int AV130Tdevpie2wwds_22_tfalbrpiedis_to ,
                                          int AV131Tdevpie2wwds_23_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV132Tdevpie2wwds_24_tfdevgenuni ,
                                          java.math.BigDecimal AV133Tdevpie2wwds_25_tfdevgenuni_to ,
                                          short AV134Tdevpie2wwds_26_tfdevgenpie ,
                                          short AV135Tdevpie2wwds_27_tfdevgenpie_to ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          byte A6288DevGenDom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          short A327DevGenTrn ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV109Tdevpie2wwds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[25];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.DevUlin, T1.DevGenEst, T3.AlbREst, T1.DevGenPie, T1.DevGenUni, T3.AlbRUni, COALESCE( T3.AlbRPieEnt, 0) - COALESCE( T3.AlbRPieUti, 0) AS AlbRPieDis, CASE" ;
      scmdbuf += "  WHEN ( COALESCE( T3.AlbRUniEnt, 0) - COALESCE( T3.AlbRUniUti, 0)) >= 0 THEN COALESCE( T3.AlbRUniEnt, 0) - COALESCE( T3.AlbRUniUti, 0) WHEN ( COALESCE( T3.AlbRUniEnt," ;
      scmdbuf += " 0) - COALESCE( T3.AlbRUniUti, 0)) < 0 THEN 0 END AS AlbRUniDis, T5.TrnNom AS DevTrnNom, T1.DevGenTrn AS DevGenTrn, T3.AlbRef, T4.CliNom, T1.CliCod, T1.DevGenDom," ;
      scmdbuf += " T1.AlbRecCod, T1.DevGenFec, T1.DevGenCod, T2.EmprNom, T1.EmprCod, COALESCE( T6.AlbDevPPie, 0) AS AlbDevPPie, COALESCE( T6.AlbDevPUni, 0) AS AlbDevPUni, T3.AlbRPieEnt," ;
      scmdbuf += " T3.AlbRPieUti, T3.AlbRUniEnt, T3.AlbRUniUti FROM (((((TXPDEVGEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPALBREC T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TrnCod = T1.DevGenTrn) LEFT JOIN (SELECT COUNT(*) AS AlbDevPPie, EmprCod, DevGenCod, SUM(DevPieUni) AS AlbDevPUni FROM TXPDevPie GROUP BY EmprCod, DevGenCod" ;
      scmdbuf += " ) T6 ON T6.EmprCod = T1.EmprCod AND T6.DevGenCod = T1.DevGenCod)" ;
      if ( ! (0==AV110Tdevpie2wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (0==AV111Tdevpie2wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV112Tdevpie2wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (0==AV113Tdevpie2wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV114Tdevpie2wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (0==AV115Tdevpie2wwds_7_tfdevgendom) )
      {
         addWhere(sWhereString, "(T1.DevGenDom >= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Tdevpie2wwds_8_tfdevgendom_to) )
      {
         addWhere(sWhereString, "(T1.DevGenDom <= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Tdevpie2wwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV118Tdevpie2wwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Tdevpie2wwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV119Tdevpie2wwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Tdevpie2wwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tdevpie2wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV121Tdevpie2wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tdevpie2wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T3.AlbRef = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV123Tdevpie2wwds_15_tfdevgentrn) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Tdevpie2wwds_16_tfdevgentrn_to) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn <= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Tdevpie2wwds_18_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Tdevpie2wwds_17_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tdevpie2wwds_18_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TrnNom = ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Tdevpie2wwds_19_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T3.AlbRUniEnt - T3.AlbRUniUti) >= 0 THEN T3.AlbRUniEnt - T3.AlbRUniUti WHEN ( T3.AlbRUniEnt - T3.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Tdevpie2wwds_20_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T3.AlbRUniEnt - T3.AlbRUniUti) >= 0 THEN T3.AlbRUniEnt - T3.AlbRUniUti WHEN ( T3.AlbRUniEnt - T3.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV129Tdevpie2wwds_21_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T3.AlbRPieEnt - T3.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV130Tdevpie2wwds_22_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T3.AlbRPieEnt - T3.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( AV131Tdevpie2wwds_23_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Tdevpie2wwds_23_tfalbruni_sels, "T3.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Tdevpie2wwds_24_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Tdevpie2wwds_25_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV134Tdevpie2wwds_26_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV135Tdevpie2wwds_27_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenFec" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenFec DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenDom" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenDom DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbRef" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbRef DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenTrn" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenTrn DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TrnNom" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TrnNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbRUni" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbRUni DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenUni" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenUni DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenPie" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenPie DESC" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H00CP5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV131Tdevpie2wwds_23_tfalbruni_sels ,
                                          int AV110Tdevpie2wwds_2_tfdevgencod ,
                                          int AV111Tdevpie2wwds_3_tfdevgencod_to ,
                                          java.util.Date AV112Tdevpie2wwds_4_tfdevgenfec ,
                                          int AV113Tdevpie2wwds_5_tfalbreccod ,
                                          int AV114Tdevpie2wwds_6_tfalbreccod_to ,
                                          byte AV115Tdevpie2wwds_7_tfdevgendom ,
                                          byte AV116Tdevpie2wwds_8_tfdevgendom_to ,
                                          int AV117Tdevpie2wwds_9_tfclicod ,
                                          int AV118Tdevpie2wwds_10_tfclicod_to ,
                                          String AV120Tdevpie2wwds_12_tfclinom_sel ,
                                          String AV119Tdevpie2wwds_11_tfclinom ,
                                          String AV122Tdevpie2wwds_14_tfalbref_sel ,
                                          String AV121Tdevpie2wwds_13_tfalbref ,
                                          short AV123Tdevpie2wwds_15_tfdevgentrn ,
                                          short AV124Tdevpie2wwds_16_tfdevgentrn_to ,
                                          String AV126Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                          String AV125Tdevpie2wwds_17_tfdevtrnnom ,
                                          java.math.BigDecimal AV127Tdevpie2wwds_19_tfalbrunidis ,
                                          java.math.BigDecimal AV128Tdevpie2wwds_20_tfalbrunidis_to ,
                                          int AV129Tdevpie2wwds_21_tfalbrpiedis ,
                                          int AV130Tdevpie2wwds_22_tfalbrpiedis_to ,
                                          int AV131Tdevpie2wwds_23_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV132Tdevpie2wwds_24_tfdevgenuni ,
                                          java.math.BigDecimal AV133Tdevpie2wwds_25_tfdevgenuni_to ,
                                          short AV134Tdevpie2wwds_26_tfdevgenpie ,
                                          short AV135Tdevpie2wwds_27_tfdevgenpie_to ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          byte A6288DevGenDom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          short A327DevGenTrn ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV109Tdevpie2wwds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[25];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.DevUlin, T1.DevGenEst, T3.AlbREst, T1.DevGenPie, T1.DevGenUni, T3.AlbRUni, COALESCE( T3.AlbRPieEnt, 0) - COALESCE( T3.AlbRPieUti, 0) AS AlbRPieDis, CASE" ;
      scmdbuf += "  WHEN ( COALESCE( T3.AlbRUniEnt, 0) - COALESCE( T3.AlbRUniUti, 0)) >= 0 THEN COALESCE( T3.AlbRUniEnt, 0) - COALESCE( T3.AlbRUniUti, 0) WHEN ( COALESCE( T3.AlbRUniEnt," ;
      scmdbuf += " 0) - COALESCE( T3.AlbRUniUti, 0)) < 0 THEN 0 END AS AlbRUniDis, T5.TrnNom AS DevTrnNom, T1.DevGenTrn AS DevGenTrn, T3.AlbRef, T4.CliNom, T1.CliCod, T1.DevGenDom," ;
      scmdbuf += " T1.AlbRecCod, T1.DevGenFec, T1.DevGenCod, T2.EmprNom, T1.EmprCod, COALESCE( T6.AlbDevPPie, 0) AS AlbDevPPie, COALESCE( T6.AlbDevPUni, 0) AS AlbDevPUni, T3.AlbRPieEnt," ;
      scmdbuf += " T3.AlbRPieUti, T3.AlbRUniEnt, T3.AlbRUniUti FROM (((((TXPDEVGEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPALBREC T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TrnCod = T1.DevGenTrn) LEFT JOIN (SELECT COUNT(*) AS AlbDevPPie, EmprCod, DevGenCod, SUM(DevPieUni) AS AlbDevPUni FROM TXPDevPie GROUP BY EmprCod, DevGenCod" ;
      scmdbuf += " ) T6 ON T6.EmprCod = T1.EmprCod AND T6.DevGenCod = T1.DevGenCod)" ;
      if ( ! (0==AV110Tdevpie2wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (0==AV111Tdevpie2wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV112Tdevpie2wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (0==AV113Tdevpie2wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (0==AV114Tdevpie2wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (0==AV115Tdevpie2wwds_7_tfdevgendom) )
      {
         addWhere(sWhereString, "(T1.DevGenDom >= ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (0==AV116Tdevpie2wwds_8_tfdevgendom_to) )
      {
         addWhere(sWhereString, "(T1.DevGenDom <= ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (0==AV117Tdevpie2wwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (0==AV118Tdevpie2wwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Tdevpie2wwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV119Tdevpie2wwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Tdevpie2wwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tdevpie2wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV121Tdevpie2wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tdevpie2wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T3.AlbRef = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (0==AV123Tdevpie2wwds_15_tfdevgentrn) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn >= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (0==AV124Tdevpie2wwds_16_tfdevgentrn_to) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn <= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Tdevpie2wwds_18_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Tdevpie2wwds_17_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tdevpie2wwds_18_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TrnNom = ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Tdevpie2wwds_19_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T3.AlbRUniEnt - T3.AlbRUniUti) >= 0 THEN T3.AlbRUniEnt - T3.AlbRUniUti WHEN ( T3.AlbRUniEnt - T3.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Tdevpie2wwds_20_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T3.AlbRUniEnt - T3.AlbRUniUti) >= 0 THEN T3.AlbRUniEnt - T3.AlbRUniUti WHEN ( T3.AlbRUniEnt - T3.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (0==AV129Tdevpie2wwds_21_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T3.AlbRPieEnt - T3.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV130Tdevpie2wwds_22_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T3.AlbRPieEnt - T3.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( AV131Tdevpie2wwds_23_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Tdevpie2wwds_23_tfalbruni_sels, "T3.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Tdevpie2wwds_24_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Tdevpie2wwds_25_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (0==AV134Tdevpie2wwds_26_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (0==AV135Tdevpie2wwds_27_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenFec" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenFec DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenDom" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenDom DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbRef" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbRef DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenTrn" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenTrn DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TrnNom" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TrnNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbRUni" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbRUni DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenUni" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenUni DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenPie" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenPie DESC" ;
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
                  return conditional_H00CP3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() );
            case 1 :
                  return conditional_H00CP5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00CP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00CP5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 16);
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((int[]) buf[18])[0] = rslt.getInt(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(17);
               ((String[]) buf[27])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 3);
               ((short[]) buf[30])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[32])[0] = rslt.getInt(22);
               ((int[]) buf[33])[0] = rslt.getInt(23);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(25,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 16);
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((int[]) buf[18])[0] = rslt.getInt(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(17);
               ((String[]) buf[27])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 3);
               ((short[]) buf[30])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[32])[0] = rslt.getInt(22);
               ((int[]) buf[33])[0] = rslt.getInt(23);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(25,2);
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
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
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
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
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
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               return;
      }
   }

}

