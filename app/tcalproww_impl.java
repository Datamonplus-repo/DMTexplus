package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcalproww_impl extends GXDataArea
{
   public tcalproww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcalproww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcalproww_impl.class ));
   }

   public tcalproww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbAlbProInEx = new HTMLChoice();
      cmbAlbProTipo = new HTMLChoice();
      cmbAlbProStAT = new HTMLChoice();
      cmbAlbProAnul = new HTMLChoice();
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
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFAlbProID = (int)(GXutil.lval( httpContext.GetPar( "TFAlbProID"))) ;
      AV27TFAlbProID_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbProID_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV29TFAlbProInEx_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV31TFAlbProTipo_Sels);
      AV32TFAlbProDate = localUtil.parseDateParm( httpContext.GetPar( "TFAlbProDate")) ;
      AV36TFAlbProSal = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbProSal")) ;
      AV40TFCatDocID = (short)(GXutil.lval( httpContext.GetPar( "TFCatDocID"))) ;
      AV41TFCatDocID_To = (short)(GXutil.lval( httpContext.GetPar( "TFCatDocID_To"))) ;
      AV42TFCatDocNom = httpContext.GetPar( "TFCatDocNom") ;
      AV43TFCatDocNom_Sel = httpContext.GetPar( "TFCatDocNom_Sel") ;
      AV44TFAlbProPrvID = (int)(GXutil.lval( httpContext.GetPar( "TFAlbProPrvID"))) ;
      AV45TFAlbProPrvID_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbProPrvID_To"))) ;
      AV46TFAlbProPrvNom = httpContext.GetPar( "TFAlbProPrvNom") ;
      AV47TFAlbProPrvNom_Sel = httpContext.GetPar( "TFAlbProPrvNom_Sel") ;
      AV48TFAlbProCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbProCliCod"))) ;
      AV49TFAlbProCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbProCliCod_To"))) ;
      AV50TFAlbProCliNom = httpContext.GetPar( "TFAlbProCliNom") ;
      AV51TFAlbProCliNom_Sel = httpContext.GetPar( "TFAlbProCliNom_Sel") ;
      AV52TFAlbProDomEnv = (byte)(GXutil.lval( httpContext.GetPar( "TFAlbProDomEnv"))) ;
      AV53TFAlbProDomEnv_To = (byte)(GXutil.lval( httpContext.GetPar( "TFAlbProDomEnv_To"))) ;
      AV54TFTrnCod = (short)(GXutil.lval( httpContext.GetPar( "TFTrnCod"))) ;
      AV55TFTrnCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTrnCod_To"))) ;
      AV56TFTrnNom = httpContext.GetPar( "TFTrnNom") ;
      AV57TFTrnNom_Sel = httpContext.GetPar( "TFTrnNom_Sel") ;
      AV58TFAlbProMatricula = httpContext.GetPar( "TFAlbProMatricula") ;
      AV59TFAlbProMatricula_Sel = httpContext.GetPar( "TFAlbProMatricula_Sel") ;
      AV60TFAlbProObs = httpContext.GetPar( "TFAlbProObs") ;
      AV61TFAlbProObs_Sel = httpContext.GetPar( "TFAlbProObs_Sel") ;
      AV78TFAlbProIDAT = httpContext.GetPar( "TFAlbProIDAT") ;
      AV79TFAlbProIDAT_Sel = httpContext.GetPar( "TFAlbProIDAT_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV83TFAlbProStAT_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV75TFAlbProAnulado_Sels);
      AV122Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFAlbProID, AV27TFAlbProID_To, AV29TFAlbProInEx_Sels, AV31TFAlbProTipo_Sels, AV32TFAlbProDate, AV36TFAlbProSal, AV40TFCatDocID, AV41TFCatDocID_To, AV42TFCatDocNom, AV43TFCatDocNom_Sel, AV44TFAlbProPrvID, AV45TFAlbProPrvID_To, AV46TFAlbProPrvNom, AV47TFAlbProPrvNom_Sel, AV48TFAlbProCliCod, AV49TFAlbProCliCod_To, AV50TFAlbProCliNom, AV51TFAlbProCliNom_Sel, AV52TFAlbProDomEnv, AV53TFAlbProDomEnv_To, AV54TFTrnCod, AV55TFTrnCod_To, AV56TFTrnNom, AV57TFTrnNom_Sel, AV58TFAlbProMatricula, AV59TFAlbProMatricula_Sel, AV60TFAlbProObs, AV61TFAlbProObs_Sel, AV78TFAlbProIDAT, AV79TFAlbProIDAT_Sel, AV83TFAlbProStAT_Sels, AV75TFAlbProAnulado_Sels, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa18J2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start18J2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tcalproww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV122Pgmname, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV64GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV65GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV62DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV62DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROID", GXutil.ltrim( localUtil.ntoc( AV26TFAlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROID_TO", GXutil.ltrim( localUtil.ntoc( AV27TFAlbProID_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROINEX_SELS", AV29TFAlbProInEx_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROINEX_SELS", AV29TFAlbProInEx_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROTIPO_SELS", AV31TFAlbProTipo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROTIPO_SELS", AV31TFAlbProTipo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPRODATE", localUtil.dtoc( AV32TFAlbProDate, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROSAL", localUtil.ttoc( AV36TFAlbProSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCATDOCID", GXutil.ltrim( localUtil.ntoc( AV40TFCatDocID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCATDOCID_TO", GXutil.ltrim( localUtil.ntoc( AV41TFCatDocID_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCATDOCNOM", GXutil.rtrim( AV42TFCatDocNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCATDOCNOM_SEL", GXutil.rtrim( AV43TFCatDocNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRVID", GXutil.ltrim( localUtil.ntoc( AV44TFAlbProPrvID, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRVID_TO", GXutil.ltrim( localUtil.ntoc( AV45TFAlbProPrvID_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRVNOM", GXutil.rtrim( AV46TFAlbProPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRVNOM_SEL", GXutil.rtrim( AV47TFAlbProPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCLICOD", GXutil.ltrim( localUtil.ntoc( AV48TFAlbProCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV49TFAlbProCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCLINOM", GXutil.rtrim( AV50TFAlbProCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCLINOM_SEL", GXutil.rtrim( AV51TFAlbProCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPRODOMENV", GXutil.ltrim( localUtil.ntoc( AV52TFAlbProDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPRODOMENV_TO", GXutil.ltrim( localUtil.ntoc( AV53TFAlbProDomEnv_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNCOD", GXutil.ltrim( localUtil.ntoc( AV54TFTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNCOD_TO", GXutil.ltrim( localUtil.ntoc( AV55TFTrnCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNNOM", GXutil.rtrim( AV56TFTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNNOM_SEL", GXutil.rtrim( AV57TFTrnNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROMATRICULA", GXutil.rtrim( AV58TFAlbProMatricula));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROMATRICULA_SEL", GXutil.rtrim( AV59TFAlbProMatricula_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROOBS", AV60TFAlbProObs);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROOBS_SEL", AV61TFAlbProObs_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROIDAT", GXutil.rtrim( AV78TFAlbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROIDAT_SEL", GXutil.rtrim( AV79TFAlbProIDAT_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROSTAT_SELS", AV83TFAlbProStAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROSTAT_SELS", AV83TFAlbProStAT_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROANULADO_SELS", AV75TFAlbProAnulado_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROANULADO_SELS", AV75TFAlbProAnulado_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV122Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV122Pgmname, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROINEX_SELSJSON", AV28TFAlbProInEx_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROTIPO_SELSJSON", AV30TFAlbProTipo_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROSTAT_SELSJSON", AV82TFAlbProStAT_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROANULADO_SELSJSON", AV74TFAlbProAnulado_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV70UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV71Station));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Title", GXutil.rtrim( Dvelop_confirmpanel_documentoanulado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_documentoanulado_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_documentoanulado_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_documentoanulado_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_documentoanulado_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_documentoanulado_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_documentoanulado_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Result", GXutil.rtrim( Dvelop_confirmpanel_documentoanulado_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Result", GXutil.rtrim( Dvelop_confirmpanel_documentoanulado_Result));
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
         we18J2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt18J2( ) ;
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
      return formatLink("app.tcalproww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCALPROWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Documento Transporte Proveedor", "") ;
   }

   public void wb18J0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_18J2( true) ;
      }
      else
      {
         wb_table1_27_18J2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_18J2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV64GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV65GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV62DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV62DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_80_18J2( true) ;
      }
      else
      {
         wb_table2_80_18J2( false) ;
      }
      return  ;
   }

   public void wb_table2_80_18J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_85_18J2( true) ;
      }
      else
      {
         wb_table3_85_18J2( false) ;
      }
      return  ;
   }

   public void wb_table3_85_18J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albprodateauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albprodateauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albprodateauxdate_Internalname, localUtil.format(AV34DDO_AlbProDateAuxDate, "99/99/99"), localUtil.format( AV34DDO_AlbProDateAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albprodateauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPROWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albprodateauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCALPROWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albprosalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albprosalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albprosalauxdate_Internalname, localUtil.format(AV38DDO_AlbProSalAuxDate, "99/99/99"), localUtil.format( AV38DDO_AlbProSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albprosalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPROWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albprosalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCALPROWW.htm");
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

   public void start18J2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Documento Transporte Proveedor", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup18J0( ) ;
   }

   public void ws18J2( )
   {
      start18J2( ) ;
      evt18J2( ) ;
   }

   public void evt18J2( )
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
                           e1118J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1218J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1318J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1418J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1518J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1618J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1718J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1818J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1918J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e2018J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e2118J2 ();
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
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV66GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridActions), 4, 0));
                           A13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbAlbProInEx.setName( cmbAlbProInEx.getInternalname() );
                           cmbAlbProInEx.setValue( httpContext.cgiGet( cmbAlbProInEx.getInternalname()) );
                           A13452AlbProInEx = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProInEx.getInternalname()))) ;
                           cmbAlbProTipo.setName( cmbAlbProTipo.getInternalname() );
                           cmbAlbProTipo.setValue( httpContext.cgiGet( cmbAlbProTipo.getInternalname()) );
                           A13417AlbProTipo = httpContext.cgiGet( cmbAlbProTipo.getInternalname()) ;
                           A13430AlbProDate = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProDate_Internalname), 0)) ;
                           A13429AlbProSal = localUtil.ctot( httpContext.cgiGet( edtAlbProSal_Internalname), 0) ;
                           A13453CatDocID = (short)(localUtil.ctol( httpContext.cgiGet( edtCatDocID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13453CatDocID = false ;
                           A13454CatDocNom = httpContext.cgiGet( edtCatDocNom_Internalname) ;
                           n13454CatDocNom = false ;
                           A13419AlbProPrvI = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProPrvI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13420AlbProPrvN = httpContext.cgiGet( edtAlbProPrvN_Internalname) ;
                           n13420AlbProPrvN = false ;
                           A13425AlbProCliC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13426AlbProCliN = httpContext.cgiGet( edtAlbProCliN_Internalname) ;
                           A13427AlbProDomE = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProDomE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n840TrnCod = false ;
                           A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
                           n841TrnNom = false ;
                           A13424AlbProMatr = httpContext.cgiGet( edtAlbProMatr_Internalname) ;
                           A13439AlbProObs = httpContext.cgiGet( edtAlbProObs_Internalname) ;
                           A13436AlbProIDAT = httpContext.cgiGet( edtAlbProIDAT_Internalname) ;
                           cmbAlbProStAT.setName( cmbAlbProStAT.getInternalname() );
                           cmbAlbProStAT.setValue( httpContext.cgiGet( cmbAlbProStAT.getInternalname()) );
                           A13438AlbProStAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProStAT.getInternalname()))) ;
                           A13437AlbProSta = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProSta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13431AlbProSys = localUtil.ctot( httpContext.cgiGet( edtAlbProSys_Internalname), 0) ;
                           A13433AlbProHh = httpContext.cgiGet( edtAlbProHh_Internalname) ;
                           A13434AlbProHhCt = httpContext.cgiGet( edtAlbProHhCt_Internalname) ;
                           A13435AlbProEnvA = httpContext.cgiGet( edtAlbProEnvA_Internalname) ;
                           cmbAlbProAnul.setName( cmbAlbProAnul.getInternalname() );
                           cmbAlbProAnul.setValue( httpContext.cgiGet( cmbAlbProAnul.getInternalname()) );
                           A13440AlbProAnul = httpContext.cgiGet( cmbAlbProAnul.getInternalname()) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2218J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2318J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2418J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2518J2 ();
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

   public void we18J2( )
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

   public void pa18J2( )
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
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 int AV26TFAlbProID ,
                                 int AV27TFAlbProID_To ,
                                 GXSimpleCollection<Byte> AV29TFAlbProInEx_Sels ,
                                 GXSimpleCollection<String> AV31TFAlbProTipo_Sels ,
                                 java.util.Date AV32TFAlbProDate ,
                                 java.util.Date AV36TFAlbProSal ,
                                 short AV40TFCatDocID ,
                                 short AV41TFCatDocID_To ,
                                 String AV42TFCatDocNom ,
                                 String AV43TFCatDocNom_Sel ,
                                 int AV44TFAlbProPrvID ,
                                 int AV45TFAlbProPrvID_To ,
                                 String AV46TFAlbProPrvNom ,
                                 String AV47TFAlbProPrvNom_Sel ,
                                 int AV48TFAlbProCliCod ,
                                 int AV49TFAlbProCliCod_To ,
                                 String AV50TFAlbProCliNom ,
                                 String AV51TFAlbProCliNom_Sel ,
                                 byte AV52TFAlbProDomEnv ,
                                 byte AV53TFAlbProDomEnv_To ,
                                 short AV54TFTrnCod ,
                                 short AV55TFTrnCod_To ,
                                 String AV56TFTrnNom ,
                                 String AV57TFTrnNom_Sel ,
                                 String AV58TFAlbProMatricula ,
                                 String AV59TFAlbProMatricula_Sel ,
                                 String AV60TFAlbProObs ,
                                 String AV61TFAlbProObs_Sel ,
                                 String AV78TFAlbProIDAT ,
                                 String AV79TFAlbProIDAT_Sel ,
                                 GXSimpleCollection<Byte> AV83TFAlbProStAT_Sels ,
                                 GXSimpleCollection<String> AV75TFAlbProAnulado_Sels ,
                                 String AV122Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2318J2 ();
      GRID_nCurrentRecord = 0 ;
      rf18J2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROSTAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13438AlbProStAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROSTAT", GXutil.ltrim( localUtil.ntoc( A13438AlbProStAT, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROINEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13452AlbProInEx), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROINEX", GXutil.ltrim( localUtil.ntoc( A13452AlbProInEx, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13436AlbProIDAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROIDAT", GXutil.rtrim( A13436AlbProIDAT));
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
      rf18J2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV122Pgmname = "TCALPROWW" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV89Tcalprowwds_1_filterfulltext = AV15FilterFullText ;
      AV90Tcalprowwds_2_tfalbproid = AV26TFAlbProID ;
      AV91Tcalprowwds_3_tfalbproid_to = AV27TFAlbProID_To ;
      AV92Tcalprowwds_4_tfalbproinex_sels = AV29TFAlbProInEx_Sels ;
      AV93Tcalprowwds_5_tfalbprotipo_sels = AV31TFAlbProTipo_Sels ;
      AV94Tcalprowwds_6_tfalbprodate = AV32TFAlbProDate ;
      AV95Tcalprowwds_7_tfalbprosal = AV36TFAlbProSal ;
      AV96Tcalprowwds_8_tfcatdocid = AV40TFCatDocID ;
      AV97Tcalprowwds_9_tfcatdocid_to = AV41TFCatDocID_To ;
      AV98Tcalprowwds_10_tfcatdocnom = AV42TFCatDocNom ;
      AV99Tcalprowwds_11_tfcatdocnom_sel = AV43TFCatDocNom_Sel ;
      AV100Tcalprowwds_12_tfalbproprvid = AV44TFAlbProPrvID ;
      AV101Tcalprowwds_13_tfalbproprvid_to = AV45TFAlbProPrvID_To ;
      AV102Tcalprowwds_14_tfalbproprvnom = AV46TFAlbProPrvNom ;
      AV103Tcalprowwds_15_tfalbproprvnom_sel = AV47TFAlbProPrvNom_Sel ;
      AV104Tcalprowwds_16_tfalbproclicod = AV48TFAlbProCliCod ;
      AV105Tcalprowwds_17_tfalbproclicod_to = AV49TFAlbProCliCod_To ;
      AV106Tcalprowwds_18_tfalbproclinom = AV50TFAlbProCliNom ;
      AV107Tcalprowwds_19_tfalbproclinom_sel = AV51TFAlbProCliNom_Sel ;
      AV108Tcalprowwds_20_tfalbprodomenv = AV52TFAlbProDomEnv ;
      AV109Tcalprowwds_21_tfalbprodomenv_to = AV53TFAlbProDomEnv_To ;
      AV110Tcalprowwds_22_tftrncod = AV54TFTrnCod ;
      AV111Tcalprowwds_23_tftrncod_to = AV55TFTrnCod_To ;
      AV112Tcalprowwds_24_tftrnnom = AV56TFTrnNom ;
      AV113Tcalprowwds_25_tftrnnom_sel = AV57TFTrnNom_Sel ;
      AV114Tcalprowwds_26_tfalbpromatricula = AV58TFAlbProMatricula ;
      AV115Tcalprowwds_27_tfalbpromatricula_sel = AV59TFAlbProMatricula_Sel ;
      AV116Tcalprowwds_28_tfalbproobs = AV60TFAlbProObs ;
      AV117Tcalprowwds_29_tfalbproobs_sel = AV61TFAlbProObs_Sel ;
      AV118Tcalprowwds_30_tfalbproidat = AV78TFAlbProIDAT ;
      AV119Tcalprowwds_31_tfalbproidat_sel = AV79TFAlbProIDAT_Sel ;
      AV120Tcalprowwds_32_tfalbprostat_sels = AV83TFAlbProStAT_Sels ;
      AV121Tcalprowwds_33_tfalbproanulado_sels = AV75TFAlbProAnulado_Sels ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV92Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV93Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV120Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV121Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV90Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV91Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV92Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV93Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV94Tcalprowwds_6_tfalbprodate ,
                                           AV95Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV96Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV97Tcalprowwds_9_tfcatdocid_to) ,
                                           AV99Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV98Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV100Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV101Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV103Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV102Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV104Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV105Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV107Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV106Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV108Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV109Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV110Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV111Tcalprowwds_23_tftrncod_to) ,
                                           AV113Tcalprowwds_25_tftrnnom_sel ,
                                           AV112Tcalprowwds_24_tftrnnom ,
                                           AV115Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV114Tcalprowwds_26_tfalbpromatricula ,
                                           AV117Tcalprowwds_29_tfalbproobs_sel ,
                                           AV116Tcalprowwds_28_tfalbproobs ,
                                           AV119Tcalprowwds_31_tfalbproidat_sel ,
                                           AV118Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV120Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV121Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV89Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV98Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV98Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV102Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV102Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV106Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV106Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV112Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV112Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV114Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV114Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV116Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV116Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV118Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV118Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor H018J2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV90Tcalprowwds_2_tfalbproid), Integer.valueOf(AV91Tcalprowwds_3_tfalbproid_to), AV94Tcalprowwds_6_tfalbprodate, AV95Tcalprowwds_7_tfalbprosal, Short.valueOf(AV96Tcalprowwds_8_tfcatdocid), Short.valueOf(AV97Tcalprowwds_9_tfcatdocid_to), lV98Tcalprowwds_10_tfcatdocnom, AV99Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV100Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV101Tcalprowwds_13_tfalbproprvid_to), lV102Tcalprowwds_14_tfalbproprvnom, AV103Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV104Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV105Tcalprowwds_17_tfalbproclicod_to), lV106Tcalprowwds_18_tfalbproclinom, AV107Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV108Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV109Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV110Tcalprowwds_22_tftrncod), Short.valueOf(AV111Tcalprowwds_23_tftrncod_to), lV112Tcalprowwds_24_tftrnnom, AV113Tcalprowwds_25_tftrnnom_sel, lV114Tcalprowwds_26_tfalbpromatricula, AV115Tcalprowwds_27_tfalbpromatricula_sel, lV116Tcalprowwds_28_tfalbproobs, AV117Tcalprowwds_29_tfalbproobs_sel, lV118Tcalprowwds_30_tfalbproidat, AV119Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H018J2_A396EmprCod[0] ;
         A13440AlbProAnul = H018J2_A13440AlbProAnul[0] ;
         A13435AlbProEnvA = H018J2_A13435AlbProEnvA[0] ;
         A13434AlbProHhCt = H018J2_A13434AlbProHhCt[0] ;
         A13433AlbProHh = H018J2_A13433AlbProHh[0] ;
         A13431AlbProSys = H018J2_A13431AlbProSys[0] ;
         A13437AlbProSta = H018J2_A13437AlbProSta[0] ;
         A13438AlbProStAT = H018J2_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = H018J2_A13436AlbProIDAT[0] ;
         A13439AlbProObs = H018J2_A13439AlbProObs[0] ;
         A13424AlbProMatr = H018J2_A13424AlbProMatr[0] ;
         A841TrnNom = H018J2_A841TrnNom[0] ;
         n841TrnNom = H018J2_n841TrnNom[0] ;
         A840TrnCod = H018J2_A840TrnCod[0] ;
         n840TrnCod = H018J2_n840TrnCod[0] ;
         A13427AlbProDomE = H018J2_A13427AlbProDomE[0] ;
         A13426AlbProCliN = H018J2_A13426AlbProCliN[0] ;
         A13425AlbProCliC = H018J2_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = H018J2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = H018J2_n13420AlbProPrvN[0] ;
         A13419AlbProPrvI = H018J2_A13419AlbProPrvI[0] ;
         A13454CatDocNom = H018J2_A13454CatDocNom[0] ;
         n13454CatDocNom = H018J2_n13454CatDocNom[0] ;
         A13453CatDocID = H018J2_A13453CatDocID[0] ;
         n13453CatDocID = H018J2_n13453CatDocID[0] ;
         A13429AlbProSal = H018J2_A13429AlbProSal[0] ;
         A13430AlbProDate = H018J2_A13430AlbProDate[0] ;
         A13417AlbProTipo = H018J2_A13417AlbProTipo[0] ;
         A13452AlbProInEx = H018J2_A13452AlbProInEx[0] ;
         A13418AlbProID = H018J2_A13418AlbProID[0] ;
         A841TrnNom = H018J2_A841TrnNom[0] ;
         n841TrnNom = H018J2_n841TrnNom[0] ;
         A13426AlbProCliN = H018J2_A13426AlbProCliN[0] ;
         A13420AlbProPrvN = H018J2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = H018J2_n13420AlbProPrvN[0] ;
         A13454CatDocNom = H018J2_A13454CatDocNom[0] ;
         n13454CatDocNom = H018J2_n13454CatDocNom[0] ;
         if ( (GXutil.strcmp("", AV89Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "mercado interno", "") , GXutil.padr( "%" + GXutil.lower( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( "mercado externo", "") , GXutil.padr( "%" + GXutil.lower( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( "proveedor", "") , GXutil.padr( "%" + GXutil.lower( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "cliente", "") , GXutil.padr( "%" + GXutil.lower( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, "C") == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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

   public void rf18J2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e2318J2 ();
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
                                              Byte.valueOf(A13452AlbProInEx) ,
                                              AV92Tcalprowwds_4_tfalbproinex_sels ,
                                              A13417AlbProTipo ,
                                              AV93Tcalprowwds_5_tfalbprotipo_sels ,
                                              Byte.valueOf(A13438AlbProStAT) ,
                                              AV120Tcalprowwds_32_tfalbprostat_sels ,
                                              A13440AlbProAnul ,
                                              AV121Tcalprowwds_33_tfalbproanulado_sels ,
                                              Integer.valueOf(AV90Tcalprowwds_2_tfalbproid) ,
                                              Integer.valueOf(AV91Tcalprowwds_3_tfalbproid_to) ,
                                              Integer.valueOf(AV92Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                              Integer.valueOf(AV93Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                              AV94Tcalprowwds_6_tfalbprodate ,
                                              AV95Tcalprowwds_7_tfalbprosal ,
                                              Short.valueOf(AV96Tcalprowwds_8_tfcatdocid) ,
                                              Short.valueOf(AV97Tcalprowwds_9_tfcatdocid_to) ,
                                              AV99Tcalprowwds_11_tfcatdocnom_sel ,
                                              AV98Tcalprowwds_10_tfcatdocnom ,
                                              Integer.valueOf(AV100Tcalprowwds_12_tfalbproprvid) ,
                                              Integer.valueOf(AV101Tcalprowwds_13_tfalbproprvid_to) ,
                                              AV103Tcalprowwds_15_tfalbproprvnom_sel ,
                                              AV102Tcalprowwds_14_tfalbproprvnom ,
                                              Integer.valueOf(AV104Tcalprowwds_16_tfalbproclicod) ,
                                              Integer.valueOf(AV105Tcalprowwds_17_tfalbproclicod_to) ,
                                              AV107Tcalprowwds_19_tfalbproclinom_sel ,
                                              AV106Tcalprowwds_18_tfalbproclinom ,
                                              Byte.valueOf(AV108Tcalprowwds_20_tfalbprodomenv) ,
                                              Byte.valueOf(AV109Tcalprowwds_21_tfalbprodomenv_to) ,
                                              Short.valueOf(AV110Tcalprowwds_22_tftrncod) ,
                                              Short.valueOf(AV111Tcalprowwds_23_tftrncod_to) ,
                                              AV113Tcalprowwds_25_tftrnnom_sel ,
                                              AV112Tcalprowwds_24_tftrnnom ,
                                              AV115Tcalprowwds_27_tfalbpromatricula_sel ,
                                              AV114Tcalprowwds_26_tfalbpromatricula ,
                                              AV117Tcalprowwds_29_tfalbproobs_sel ,
                                              AV116Tcalprowwds_28_tfalbproobs ,
                                              AV119Tcalprowwds_31_tfalbproidat_sel ,
                                              AV118Tcalprowwds_30_tfalbproidat ,
                                              Integer.valueOf(AV120Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                              Integer.valueOf(AV121Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                              Integer.valueOf(A13418AlbProID) ,
                                              A13430AlbProDate ,
                                              A13429AlbProSal ,
                                              Short.valueOf(A13453CatDocID) ,
                                              A13454CatDocNom ,
                                              Integer.valueOf(A13419AlbProPrvI) ,
                                              A13420AlbProPrvN ,
                                              Integer.valueOf(A13425AlbProCliC) ,
                                              A13426AlbProCliN ,
                                              Byte.valueOf(A13427AlbProDomE) ,
                                              Short.valueOf(A840TrnCod) ,
                                              A841TrnNom ,
                                              A13424AlbProMatr ,
                                              A13439AlbProObs ,
                                              A13436AlbProIDAT ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV89Tcalprowwds_1_filterfulltext } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV98Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV98Tcalprowwds_10_tfcatdocnom), 30, "%") ;
         lV102Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV102Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
         lV106Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV106Tcalprowwds_18_tfalbproclinom), 30, "%") ;
         lV112Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV112Tcalprowwds_24_tftrnnom), 30, "%") ;
         lV114Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV114Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
         lV116Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV116Tcalprowwds_28_tfalbproobs), "%", "") ;
         lV118Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV118Tcalprowwds_30_tfalbproidat), 20, "%") ;
         /* Using cursor H018J3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV90Tcalprowwds_2_tfalbproid), Integer.valueOf(AV91Tcalprowwds_3_tfalbproid_to), AV94Tcalprowwds_6_tfalbprodate, AV95Tcalprowwds_7_tfalbprosal, Short.valueOf(AV96Tcalprowwds_8_tfcatdocid), Short.valueOf(AV97Tcalprowwds_9_tfcatdocid_to), lV98Tcalprowwds_10_tfcatdocnom, AV99Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV100Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV101Tcalprowwds_13_tfalbproprvid_to), lV102Tcalprowwds_14_tfalbproprvnom, AV103Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV104Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV105Tcalprowwds_17_tfalbproclicod_to), lV106Tcalprowwds_18_tfalbproclinom, AV107Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV108Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV109Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV110Tcalprowwds_22_tftrncod), Short.valueOf(AV111Tcalprowwds_23_tftrncod_to), lV112Tcalprowwds_24_tftrnnom, AV113Tcalprowwds_25_tftrnnom_sel, lV114Tcalprowwds_26_tfalbpromatricula, AV115Tcalprowwds_27_tfalbpromatricula_sel, lV116Tcalprowwds_28_tfalbproobs, AV117Tcalprowwds_29_tfalbproobs_sel, lV118Tcalprowwds_30_tfalbproidat, AV119Tcalprowwds_31_tfalbproidat_sel});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H018J3_A396EmprCod[0] ;
            A13440AlbProAnul = H018J3_A13440AlbProAnul[0] ;
            A13435AlbProEnvA = H018J3_A13435AlbProEnvA[0] ;
            A13434AlbProHhCt = H018J3_A13434AlbProHhCt[0] ;
            A13433AlbProHh = H018J3_A13433AlbProHh[0] ;
            A13431AlbProSys = H018J3_A13431AlbProSys[0] ;
            A13437AlbProSta = H018J3_A13437AlbProSta[0] ;
            A13438AlbProStAT = H018J3_A13438AlbProStAT[0] ;
            A13436AlbProIDAT = H018J3_A13436AlbProIDAT[0] ;
            A13439AlbProObs = H018J3_A13439AlbProObs[0] ;
            A13424AlbProMatr = H018J3_A13424AlbProMatr[0] ;
            A841TrnNom = H018J3_A841TrnNom[0] ;
            n841TrnNom = H018J3_n841TrnNom[0] ;
            A840TrnCod = H018J3_A840TrnCod[0] ;
            n840TrnCod = H018J3_n840TrnCod[0] ;
            A13427AlbProDomE = H018J3_A13427AlbProDomE[0] ;
            A13426AlbProCliN = H018J3_A13426AlbProCliN[0] ;
            A13425AlbProCliC = H018J3_A13425AlbProCliC[0] ;
            A13420AlbProPrvN = H018J3_A13420AlbProPrvN[0] ;
            n13420AlbProPrvN = H018J3_n13420AlbProPrvN[0] ;
            A13419AlbProPrvI = H018J3_A13419AlbProPrvI[0] ;
            A13454CatDocNom = H018J3_A13454CatDocNom[0] ;
            n13454CatDocNom = H018J3_n13454CatDocNom[0] ;
            A13453CatDocID = H018J3_A13453CatDocID[0] ;
            n13453CatDocID = H018J3_n13453CatDocID[0] ;
            A13429AlbProSal = H018J3_A13429AlbProSal[0] ;
            A13430AlbProDate = H018J3_A13430AlbProDate[0] ;
            A13417AlbProTipo = H018J3_A13417AlbProTipo[0] ;
            A13452AlbProInEx = H018J3_A13452AlbProInEx[0] ;
            A13418AlbProID = H018J3_A13418AlbProID[0] ;
            A841TrnNom = H018J3_A841TrnNom[0] ;
            n841TrnNom = H018J3_n841TrnNom[0] ;
            A13426AlbProCliN = H018J3_A13426AlbProCliN[0] ;
            A13420AlbProPrvN = H018J3_A13420AlbProPrvN[0] ;
            n13420AlbProPrvN = H018J3_n13420AlbProPrvN[0] ;
            A13454CatDocNom = H018J3_A13454CatDocNom[0] ;
            n13454CatDocNom = H018J3_n13454CatDocNom[0] ;
            if ( (GXutil.strcmp("", AV89Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "mercado interno", "") , GXutil.padr( "%" + GXutil.lower( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( "mercado externo", "") , GXutil.padr( "%" + GXutil.lower( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( "proveedor", "") , GXutil.padr( "%" + GXutil.lower( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "cliente", "") , GXutil.padr( "%" + GXutil.lower( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, "C") == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV89Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV89Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               e2418J2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wb18J0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes18J2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV122Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV122Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROSTAT"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A13438AlbProStAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROINEX"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A13452AlbProInEx), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROIDAT"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A13436AlbProIDAT, ""))));
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
      AV89Tcalprowwds_1_filterfulltext = AV15FilterFullText ;
      AV90Tcalprowwds_2_tfalbproid = AV26TFAlbProID ;
      AV91Tcalprowwds_3_tfalbproid_to = AV27TFAlbProID_To ;
      AV92Tcalprowwds_4_tfalbproinex_sels = AV29TFAlbProInEx_Sels ;
      AV93Tcalprowwds_5_tfalbprotipo_sels = AV31TFAlbProTipo_Sels ;
      AV94Tcalprowwds_6_tfalbprodate = AV32TFAlbProDate ;
      AV95Tcalprowwds_7_tfalbprosal = AV36TFAlbProSal ;
      AV96Tcalprowwds_8_tfcatdocid = AV40TFCatDocID ;
      AV97Tcalprowwds_9_tfcatdocid_to = AV41TFCatDocID_To ;
      AV98Tcalprowwds_10_tfcatdocnom = AV42TFCatDocNom ;
      AV99Tcalprowwds_11_tfcatdocnom_sel = AV43TFCatDocNom_Sel ;
      AV100Tcalprowwds_12_tfalbproprvid = AV44TFAlbProPrvID ;
      AV101Tcalprowwds_13_tfalbproprvid_to = AV45TFAlbProPrvID_To ;
      AV102Tcalprowwds_14_tfalbproprvnom = AV46TFAlbProPrvNom ;
      AV103Tcalprowwds_15_tfalbproprvnom_sel = AV47TFAlbProPrvNom_Sel ;
      AV104Tcalprowwds_16_tfalbproclicod = AV48TFAlbProCliCod ;
      AV105Tcalprowwds_17_tfalbproclicod_to = AV49TFAlbProCliCod_To ;
      AV106Tcalprowwds_18_tfalbproclinom = AV50TFAlbProCliNom ;
      AV107Tcalprowwds_19_tfalbproclinom_sel = AV51TFAlbProCliNom_Sel ;
      AV108Tcalprowwds_20_tfalbprodomenv = AV52TFAlbProDomEnv ;
      AV109Tcalprowwds_21_tfalbprodomenv_to = AV53TFAlbProDomEnv_To ;
      AV110Tcalprowwds_22_tftrncod = AV54TFTrnCod ;
      AV111Tcalprowwds_23_tftrncod_to = AV55TFTrnCod_To ;
      AV112Tcalprowwds_24_tftrnnom = AV56TFTrnNom ;
      AV113Tcalprowwds_25_tftrnnom_sel = AV57TFTrnNom_Sel ;
      AV114Tcalprowwds_26_tfalbpromatricula = AV58TFAlbProMatricula ;
      AV115Tcalprowwds_27_tfalbpromatricula_sel = AV59TFAlbProMatricula_Sel ;
      AV116Tcalprowwds_28_tfalbproobs = AV60TFAlbProObs ;
      AV117Tcalprowwds_29_tfalbproobs_sel = AV61TFAlbProObs_Sel ;
      AV118Tcalprowwds_30_tfalbproidat = AV78TFAlbProIDAT ;
      AV119Tcalprowwds_31_tfalbproidat_sel = AV79TFAlbProIDAT_Sel ;
      AV120Tcalprowwds_32_tfalbprostat_sels = AV83TFAlbProStAT_Sels ;
      AV121Tcalprowwds_33_tfalbproanulado_sels = AV75TFAlbProAnulado_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFAlbProID, AV27TFAlbProID_To, AV29TFAlbProInEx_Sels, AV31TFAlbProTipo_Sels, AV32TFAlbProDate, AV36TFAlbProSal, AV40TFCatDocID, AV41TFCatDocID_To, AV42TFCatDocNom, AV43TFCatDocNom_Sel, AV44TFAlbProPrvID, AV45TFAlbProPrvID_To, AV46TFAlbProPrvNom, AV47TFAlbProPrvNom_Sel, AV48TFAlbProCliCod, AV49TFAlbProCliCod_To, AV50TFAlbProCliNom, AV51TFAlbProCliNom_Sel, AV52TFAlbProDomEnv, AV53TFAlbProDomEnv_To, AV54TFTrnCod, AV55TFTrnCod_To, AV56TFTrnNom, AV57TFTrnNom_Sel, AV58TFAlbProMatricula, AV59TFAlbProMatricula_Sel, AV60TFAlbProObs, AV61TFAlbProObs_Sel, AV78TFAlbProIDAT, AV79TFAlbProIDAT_Sel, AV83TFAlbProStAT_Sels, AV75TFAlbProAnulado_Sels, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV89Tcalprowwds_1_filterfulltext = AV15FilterFullText ;
      AV90Tcalprowwds_2_tfalbproid = AV26TFAlbProID ;
      AV91Tcalprowwds_3_tfalbproid_to = AV27TFAlbProID_To ;
      AV92Tcalprowwds_4_tfalbproinex_sels = AV29TFAlbProInEx_Sels ;
      AV93Tcalprowwds_5_tfalbprotipo_sels = AV31TFAlbProTipo_Sels ;
      AV94Tcalprowwds_6_tfalbprodate = AV32TFAlbProDate ;
      AV95Tcalprowwds_7_tfalbprosal = AV36TFAlbProSal ;
      AV96Tcalprowwds_8_tfcatdocid = AV40TFCatDocID ;
      AV97Tcalprowwds_9_tfcatdocid_to = AV41TFCatDocID_To ;
      AV98Tcalprowwds_10_tfcatdocnom = AV42TFCatDocNom ;
      AV99Tcalprowwds_11_tfcatdocnom_sel = AV43TFCatDocNom_Sel ;
      AV100Tcalprowwds_12_tfalbproprvid = AV44TFAlbProPrvID ;
      AV101Tcalprowwds_13_tfalbproprvid_to = AV45TFAlbProPrvID_To ;
      AV102Tcalprowwds_14_tfalbproprvnom = AV46TFAlbProPrvNom ;
      AV103Tcalprowwds_15_tfalbproprvnom_sel = AV47TFAlbProPrvNom_Sel ;
      AV104Tcalprowwds_16_tfalbproclicod = AV48TFAlbProCliCod ;
      AV105Tcalprowwds_17_tfalbproclicod_to = AV49TFAlbProCliCod_To ;
      AV106Tcalprowwds_18_tfalbproclinom = AV50TFAlbProCliNom ;
      AV107Tcalprowwds_19_tfalbproclinom_sel = AV51TFAlbProCliNom_Sel ;
      AV108Tcalprowwds_20_tfalbprodomenv = AV52TFAlbProDomEnv ;
      AV109Tcalprowwds_21_tfalbprodomenv_to = AV53TFAlbProDomEnv_To ;
      AV110Tcalprowwds_22_tftrncod = AV54TFTrnCod ;
      AV111Tcalprowwds_23_tftrncod_to = AV55TFTrnCod_To ;
      AV112Tcalprowwds_24_tftrnnom = AV56TFTrnNom ;
      AV113Tcalprowwds_25_tftrnnom_sel = AV57TFTrnNom_Sel ;
      AV114Tcalprowwds_26_tfalbpromatricula = AV58TFAlbProMatricula ;
      AV115Tcalprowwds_27_tfalbpromatricula_sel = AV59TFAlbProMatricula_Sel ;
      AV116Tcalprowwds_28_tfalbproobs = AV60TFAlbProObs ;
      AV117Tcalprowwds_29_tfalbproobs_sel = AV61TFAlbProObs_Sel ;
      AV118Tcalprowwds_30_tfalbproidat = AV78TFAlbProIDAT ;
      AV119Tcalprowwds_31_tfalbproidat_sel = AV79TFAlbProIDAT_Sel ;
      AV120Tcalprowwds_32_tfalbprostat_sels = AV83TFAlbProStAT_Sels ;
      AV121Tcalprowwds_33_tfalbproanulado_sels = AV75TFAlbProAnulado_Sels ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFAlbProID, AV27TFAlbProID_To, AV29TFAlbProInEx_Sels, AV31TFAlbProTipo_Sels, AV32TFAlbProDate, AV36TFAlbProSal, AV40TFCatDocID, AV41TFCatDocID_To, AV42TFCatDocNom, AV43TFCatDocNom_Sel, AV44TFAlbProPrvID, AV45TFAlbProPrvID_To, AV46TFAlbProPrvNom, AV47TFAlbProPrvNom_Sel, AV48TFAlbProCliCod, AV49TFAlbProCliCod_To, AV50TFAlbProCliNom, AV51TFAlbProCliNom_Sel, AV52TFAlbProDomEnv, AV53TFAlbProDomEnv_To, AV54TFTrnCod, AV55TFTrnCod_To, AV56TFTrnNom, AV57TFTrnNom_Sel, AV58TFAlbProMatricula, AV59TFAlbProMatricula_Sel, AV60TFAlbProObs, AV61TFAlbProObs_Sel, AV78TFAlbProIDAT, AV79TFAlbProIDAT_Sel, AV83TFAlbProStAT_Sels, AV75TFAlbProAnulado_Sels, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV89Tcalprowwds_1_filterfulltext = AV15FilterFullText ;
      AV90Tcalprowwds_2_tfalbproid = AV26TFAlbProID ;
      AV91Tcalprowwds_3_tfalbproid_to = AV27TFAlbProID_To ;
      AV92Tcalprowwds_4_tfalbproinex_sels = AV29TFAlbProInEx_Sels ;
      AV93Tcalprowwds_5_tfalbprotipo_sels = AV31TFAlbProTipo_Sels ;
      AV94Tcalprowwds_6_tfalbprodate = AV32TFAlbProDate ;
      AV95Tcalprowwds_7_tfalbprosal = AV36TFAlbProSal ;
      AV96Tcalprowwds_8_tfcatdocid = AV40TFCatDocID ;
      AV97Tcalprowwds_9_tfcatdocid_to = AV41TFCatDocID_To ;
      AV98Tcalprowwds_10_tfcatdocnom = AV42TFCatDocNom ;
      AV99Tcalprowwds_11_tfcatdocnom_sel = AV43TFCatDocNom_Sel ;
      AV100Tcalprowwds_12_tfalbproprvid = AV44TFAlbProPrvID ;
      AV101Tcalprowwds_13_tfalbproprvid_to = AV45TFAlbProPrvID_To ;
      AV102Tcalprowwds_14_tfalbproprvnom = AV46TFAlbProPrvNom ;
      AV103Tcalprowwds_15_tfalbproprvnom_sel = AV47TFAlbProPrvNom_Sel ;
      AV104Tcalprowwds_16_tfalbproclicod = AV48TFAlbProCliCod ;
      AV105Tcalprowwds_17_tfalbproclicod_to = AV49TFAlbProCliCod_To ;
      AV106Tcalprowwds_18_tfalbproclinom = AV50TFAlbProCliNom ;
      AV107Tcalprowwds_19_tfalbproclinom_sel = AV51TFAlbProCliNom_Sel ;
      AV108Tcalprowwds_20_tfalbprodomenv = AV52TFAlbProDomEnv ;
      AV109Tcalprowwds_21_tfalbprodomenv_to = AV53TFAlbProDomEnv_To ;
      AV110Tcalprowwds_22_tftrncod = AV54TFTrnCod ;
      AV111Tcalprowwds_23_tftrncod_to = AV55TFTrnCod_To ;
      AV112Tcalprowwds_24_tftrnnom = AV56TFTrnNom ;
      AV113Tcalprowwds_25_tftrnnom_sel = AV57TFTrnNom_Sel ;
      AV114Tcalprowwds_26_tfalbpromatricula = AV58TFAlbProMatricula ;
      AV115Tcalprowwds_27_tfalbpromatricula_sel = AV59TFAlbProMatricula_Sel ;
      AV116Tcalprowwds_28_tfalbproobs = AV60TFAlbProObs ;
      AV117Tcalprowwds_29_tfalbproobs_sel = AV61TFAlbProObs_Sel ;
      AV118Tcalprowwds_30_tfalbproidat = AV78TFAlbProIDAT ;
      AV119Tcalprowwds_31_tfalbproidat_sel = AV79TFAlbProIDAT_Sel ;
      AV120Tcalprowwds_32_tfalbprostat_sels = AV83TFAlbProStAT_Sels ;
      AV121Tcalprowwds_33_tfalbproanulado_sels = AV75TFAlbProAnulado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFAlbProID, AV27TFAlbProID_To, AV29TFAlbProInEx_Sels, AV31TFAlbProTipo_Sels, AV32TFAlbProDate, AV36TFAlbProSal, AV40TFCatDocID, AV41TFCatDocID_To, AV42TFCatDocNom, AV43TFCatDocNom_Sel, AV44TFAlbProPrvID, AV45TFAlbProPrvID_To, AV46TFAlbProPrvNom, AV47TFAlbProPrvNom_Sel, AV48TFAlbProCliCod, AV49TFAlbProCliCod_To, AV50TFAlbProCliNom, AV51TFAlbProCliNom_Sel, AV52TFAlbProDomEnv, AV53TFAlbProDomEnv_To, AV54TFTrnCod, AV55TFTrnCod_To, AV56TFTrnNom, AV57TFTrnNom_Sel, AV58TFAlbProMatricula, AV59TFAlbProMatricula_Sel, AV60TFAlbProObs, AV61TFAlbProObs_Sel, AV78TFAlbProIDAT, AV79TFAlbProIDAT_Sel, AV83TFAlbProStAT_Sels, AV75TFAlbProAnulado_Sels, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV89Tcalprowwds_1_filterfulltext = AV15FilterFullText ;
      AV90Tcalprowwds_2_tfalbproid = AV26TFAlbProID ;
      AV91Tcalprowwds_3_tfalbproid_to = AV27TFAlbProID_To ;
      AV92Tcalprowwds_4_tfalbproinex_sels = AV29TFAlbProInEx_Sels ;
      AV93Tcalprowwds_5_tfalbprotipo_sels = AV31TFAlbProTipo_Sels ;
      AV94Tcalprowwds_6_tfalbprodate = AV32TFAlbProDate ;
      AV95Tcalprowwds_7_tfalbprosal = AV36TFAlbProSal ;
      AV96Tcalprowwds_8_tfcatdocid = AV40TFCatDocID ;
      AV97Tcalprowwds_9_tfcatdocid_to = AV41TFCatDocID_To ;
      AV98Tcalprowwds_10_tfcatdocnom = AV42TFCatDocNom ;
      AV99Tcalprowwds_11_tfcatdocnom_sel = AV43TFCatDocNom_Sel ;
      AV100Tcalprowwds_12_tfalbproprvid = AV44TFAlbProPrvID ;
      AV101Tcalprowwds_13_tfalbproprvid_to = AV45TFAlbProPrvID_To ;
      AV102Tcalprowwds_14_tfalbproprvnom = AV46TFAlbProPrvNom ;
      AV103Tcalprowwds_15_tfalbproprvnom_sel = AV47TFAlbProPrvNom_Sel ;
      AV104Tcalprowwds_16_tfalbproclicod = AV48TFAlbProCliCod ;
      AV105Tcalprowwds_17_tfalbproclicod_to = AV49TFAlbProCliCod_To ;
      AV106Tcalprowwds_18_tfalbproclinom = AV50TFAlbProCliNom ;
      AV107Tcalprowwds_19_tfalbproclinom_sel = AV51TFAlbProCliNom_Sel ;
      AV108Tcalprowwds_20_tfalbprodomenv = AV52TFAlbProDomEnv ;
      AV109Tcalprowwds_21_tfalbprodomenv_to = AV53TFAlbProDomEnv_To ;
      AV110Tcalprowwds_22_tftrncod = AV54TFTrnCod ;
      AV111Tcalprowwds_23_tftrncod_to = AV55TFTrnCod_To ;
      AV112Tcalprowwds_24_tftrnnom = AV56TFTrnNom ;
      AV113Tcalprowwds_25_tftrnnom_sel = AV57TFTrnNom_Sel ;
      AV114Tcalprowwds_26_tfalbpromatricula = AV58TFAlbProMatricula ;
      AV115Tcalprowwds_27_tfalbpromatricula_sel = AV59TFAlbProMatricula_Sel ;
      AV116Tcalprowwds_28_tfalbproobs = AV60TFAlbProObs ;
      AV117Tcalprowwds_29_tfalbproobs_sel = AV61TFAlbProObs_Sel ;
      AV118Tcalprowwds_30_tfalbproidat = AV78TFAlbProIDAT ;
      AV119Tcalprowwds_31_tfalbproidat_sel = AV79TFAlbProIDAT_Sel ;
      AV120Tcalprowwds_32_tfalbprostat_sels = AV83TFAlbProStAT_Sels ;
      AV121Tcalprowwds_33_tfalbproanulado_sels = AV75TFAlbProAnulado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFAlbProID, AV27TFAlbProID_To, AV29TFAlbProInEx_Sels, AV31TFAlbProTipo_Sels, AV32TFAlbProDate, AV36TFAlbProSal, AV40TFCatDocID, AV41TFCatDocID_To, AV42TFCatDocNom, AV43TFCatDocNom_Sel, AV44TFAlbProPrvID, AV45TFAlbProPrvID_To, AV46TFAlbProPrvNom, AV47TFAlbProPrvNom_Sel, AV48TFAlbProCliCod, AV49TFAlbProCliCod_To, AV50TFAlbProCliNom, AV51TFAlbProCliNom_Sel, AV52TFAlbProDomEnv, AV53TFAlbProDomEnv_To, AV54TFTrnCod, AV55TFTrnCod_To, AV56TFTrnNom, AV57TFTrnNom_Sel, AV58TFAlbProMatricula, AV59TFAlbProMatricula_Sel, AV60TFAlbProObs, AV61TFAlbProObs_Sel, AV78TFAlbProIDAT, AV79TFAlbProIDAT_Sel, AV83TFAlbProStAT_Sels, AV75TFAlbProAnulado_Sels, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV89Tcalprowwds_1_filterfulltext = AV15FilterFullText ;
      AV90Tcalprowwds_2_tfalbproid = AV26TFAlbProID ;
      AV91Tcalprowwds_3_tfalbproid_to = AV27TFAlbProID_To ;
      AV92Tcalprowwds_4_tfalbproinex_sels = AV29TFAlbProInEx_Sels ;
      AV93Tcalprowwds_5_tfalbprotipo_sels = AV31TFAlbProTipo_Sels ;
      AV94Tcalprowwds_6_tfalbprodate = AV32TFAlbProDate ;
      AV95Tcalprowwds_7_tfalbprosal = AV36TFAlbProSal ;
      AV96Tcalprowwds_8_tfcatdocid = AV40TFCatDocID ;
      AV97Tcalprowwds_9_tfcatdocid_to = AV41TFCatDocID_To ;
      AV98Tcalprowwds_10_tfcatdocnom = AV42TFCatDocNom ;
      AV99Tcalprowwds_11_tfcatdocnom_sel = AV43TFCatDocNom_Sel ;
      AV100Tcalprowwds_12_tfalbproprvid = AV44TFAlbProPrvID ;
      AV101Tcalprowwds_13_tfalbproprvid_to = AV45TFAlbProPrvID_To ;
      AV102Tcalprowwds_14_tfalbproprvnom = AV46TFAlbProPrvNom ;
      AV103Tcalprowwds_15_tfalbproprvnom_sel = AV47TFAlbProPrvNom_Sel ;
      AV104Tcalprowwds_16_tfalbproclicod = AV48TFAlbProCliCod ;
      AV105Tcalprowwds_17_tfalbproclicod_to = AV49TFAlbProCliCod_To ;
      AV106Tcalprowwds_18_tfalbproclinom = AV50TFAlbProCliNom ;
      AV107Tcalprowwds_19_tfalbproclinom_sel = AV51TFAlbProCliNom_Sel ;
      AV108Tcalprowwds_20_tfalbprodomenv = AV52TFAlbProDomEnv ;
      AV109Tcalprowwds_21_tfalbprodomenv_to = AV53TFAlbProDomEnv_To ;
      AV110Tcalprowwds_22_tftrncod = AV54TFTrnCod ;
      AV111Tcalprowwds_23_tftrncod_to = AV55TFTrnCod_To ;
      AV112Tcalprowwds_24_tftrnnom = AV56TFTrnNom ;
      AV113Tcalprowwds_25_tftrnnom_sel = AV57TFTrnNom_Sel ;
      AV114Tcalprowwds_26_tfalbpromatricula = AV58TFAlbProMatricula ;
      AV115Tcalprowwds_27_tfalbpromatricula_sel = AV59TFAlbProMatricula_Sel ;
      AV116Tcalprowwds_28_tfalbproobs = AV60TFAlbProObs ;
      AV117Tcalprowwds_29_tfalbproobs_sel = AV61TFAlbProObs_Sel ;
      AV118Tcalprowwds_30_tfalbproidat = AV78TFAlbProIDAT ;
      AV119Tcalprowwds_31_tfalbproidat_sel = AV79TFAlbProIDAT_Sel ;
      AV120Tcalprowwds_32_tfalbprostat_sels = AV83TFAlbProStAT_Sels ;
      AV121Tcalprowwds_33_tfalbproanulado_sels = AV75TFAlbProAnulado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFAlbProID, AV27TFAlbProID_To, AV29TFAlbProInEx_Sels, AV31TFAlbProTipo_Sels, AV32TFAlbProDate, AV36TFAlbProSal, AV40TFCatDocID, AV41TFCatDocID_To, AV42TFCatDocNom, AV43TFCatDocNom_Sel, AV44TFAlbProPrvID, AV45TFAlbProPrvID_To, AV46TFAlbProPrvNom, AV47TFAlbProPrvNom_Sel, AV48TFAlbProCliCod, AV49TFAlbProCliCod_To, AV50TFAlbProCliNom, AV51TFAlbProCliNom_Sel, AV52TFAlbProDomEnv, AV53TFAlbProDomEnv_To, AV54TFTrnCod, AV55TFTrnCod_To, AV56TFTrnNom, AV57TFTrnNom_Sel, AV58TFAlbProMatricula, AV59TFAlbProMatricula_Sel, AV60TFAlbProObs, AV61TFAlbProObs_Sel, AV78TFAlbProIDAT, AV79TFAlbProIDAT_Sel, AV83TFAlbProStAT_Sels, AV75TFAlbProAnulado_Sels, AV122Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV122Pgmname = "TCALPROWW" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup18J0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2218J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV62DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV64GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV65GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvelop_confirmpanel_eliminardocumento_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Title") ;
         Dvelop_confirmpanel_eliminardocumento_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmationtext") ;
         Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminardocumento_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmtype") ;
         Dvelop_confirmpanel_documentoanulado_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Title") ;
         Dvelop_confirmpanel_documentoanulado_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Confirmationtext") ;
         Dvelop_confirmpanel_documentoanulado_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_documentoanulado_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Nobuttoncaption") ;
         Dvelop_confirmpanel_documentoanulado_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_documentoanulado_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Yesbuttonposition") ;
         Dvelop_confirmpanel_documentoanulado_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Confirmtype") ;
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
         Dvelop_confirmpanel_eliminardocumento_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Result") ;
         Dvelop_confirmpanel_documentoanulado_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO_Result") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albprodateauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBPRODATEAUXDATE");
            GX_FocusControl = edtavDdo_albprodateauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_AlbProDateAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_AlbProDateAuxDate", localUtil.format(AV34DDO_AlbProDateAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_AlbProDateAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albprodateauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_AlbProDateAuxDate", localUtil.format(AV34DDO_AlbProDateAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albprosalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBPROSALAUXDATE");
            GX_FocusControl = edtavDdo_albprosalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38DDO_AlbProSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_AlbProSalAuxDate", localUtil.format(AV38DDO_AlbProSalAuxDate, "99/99/99"));
         }
         else
         {
            AV38DDO_AlbProSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albprosalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_AlbProSalAuxDate", localUtil.format(AV38DDO_AlbProSalAuxDate, "99/99/99"));
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
      e2218J2 ();
      if (returnInSub) return;
   }

   public void e2218J2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV71Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tcalproww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV71Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Station", AV71Station);
      GXv_char2[0] = AV84EmprCod ;
      GXv_char3[0] = AV88Emprnom ;
      GXv_char4[0] = AV70UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcalproww_impl.this.AV84EmprCod = GXv_char2[0] ;
      tcalproww_impl.this.AV88Emprnom = GXv_char3[0] ;
      tcalproww_impl.this.AV70UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70UsurCod", AV70UsurCod);
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
      Form.setCaption( httpContext.getMessage( " Documento Transporte Proveedor", "") );
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
         AV13OrderedDsc = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV62DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV62DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2318J2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("TCALPROWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("TCALPROWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtAlbProID_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbAlbProInEx.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProInEx.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      cmbAlbProTipo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProTipo.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProTipo.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbProDate_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDate_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDate_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbProSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSal_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCatDocID_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCatDocID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDocID_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCatDocNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCatDocNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDocNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbProPrvI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbProPrvN_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvN_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvN_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbProCliC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbProCliN_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliN_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliN_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbProDomE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDomE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDomE_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTrnCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTrnNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbProMatr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProMatr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProMatr_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbProObs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProObs_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbProIDAT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProIDAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProIDAT_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbAlbProStAT.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProStAT.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProStAT.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      cmbAlbProAnul.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAnul.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProAnul.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      AV64GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridCurrentPage), 10, 0));
      AV65GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65GridPageCount), 10, 0));
      AV89Tcalprowwds_1_filterfulltext = AV15FilterFullText ;
      AV90Tcalprowwds_2_tfalbproid = AV26TFAlbProID ;
      AV91Tcalprowwds_3_tfalbproid_to = AV27TFAlbProID_To ;
      AV92Tcalprowwds_4_tfalbproinex_sels = AV29TFAlbProInEx_Sels ;
      AV93Tcalprowwds_5_tfalbprotipo_sels = AV31TFAlbProTipo_Sels ;
      AV94Tcalprowwds_6_tfalbprodate = AV32TFAlbProDate ;
      AV95Tcalprowwds_7_tfalbprosal = AV36TFAlbProSal ;
      AV96Tcalprowwds_8_tfcatdocid = AV40TFCatDocID ;
      AV97Tcalprowwds_9_tfcatdocid_to = AV41TFCatDocID_To ;
      AV98Tcalprowwds_10_tfcatdocnom = AV42TFCatDocNom ;
      AV99Tcalprowwds_11_tfcatdocnom_sel = AV43TFCatDocNom_Sel ;
      AV100Tcalprowwds_12_tfalbproprvid = AV44TFAlbProPrvID ;
      AV101Tcalprowwds_13_tfalbproprvid_to = AV45TFAlbProPrvID_To ;
      AV102Tcalprowwds_14_tfalbproprvnom = AV46TFAlbProPrvNom ;
      AV103Tcalprowwds_15_tfalbproprvnom_sel = AV47TFAlbProPrvNom_Sel ;
      AV104Tcalprowwds_16_tfalbproclicod = AV48TFAlbProCliCod ;
      AV105Tcalprowwds_17_tfalbproclicod_to = AV49TFAlbProCliCod_To ;
      AV106Tcalprowwds_18_tfalbproclinom = AV50TFAlbProCliNom ;
      AV107Tcalprowwds_19_tfalbproclinom_sel = AV51TFAlbProCliNom_Sel ;
      AV108Tcalprowwds_20_tfalbprodomenv = AV52TFAlbProDomEnv ;
      AV109Tcalprowwds_21_tfalbprodomenv_to = AV53TFAlbProDomEnv_To ;
      AV110Tcalprowwds_22_tftrncod = AV54TFTrnCod ;
      AV111Tcalprowwds_23_tftrncod_to = AV55TFTrnCod_To ;
      AV112Tcalprowwds_24_tftrnnom = AV56TFTrnNom ;
      AV113Tcalprowwds_25_tftrnnom_sel = AV57TFTrnNom_Sel ;
      AV114Tcalprowwds_26_tfalbpromatricula = AV58TFAlbProMatricula ;
      AV115Tcalprowwds_27_tfalbpromatricula_sel = AV59TFAlbProMatricula_Sel ;
      AV116Tcalprowwds_28_tfalbproobs = AV60TFAlbProObs ;
      AV117Tcalprowwds_29_tfalbproobs_sel = AV61TFAlbProObs_Sel ;
      AV118Tcalprowwds_30_tfalbproidat = AV78TFAlbProIDAT ;
      AV119Tcalprowwds_31_tfalbproidat_sel = AV79TFAlbProIDAT_Sel ;
      AV120Tcalprowwds_32_tfalbprostat_sels = AV83TFAlbProStAT_Sels ;
      AV121Tcalprowwds_33_tfalbproanulado_sels = AV75TFAlbProAnulado_Sels ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1218J2( )
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
         AV63PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV63PageToGo) ;
      }
   }

   public void e1318J2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1418J2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProID") == 0 )
         {
            AV26TFAlbProID = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFAlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFAlbProID), 8, 0));
            AV27TFAlbProID_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbProID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbProID_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProInEx") == 0 )
         {
            AV28TFAlbProInEx_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProInEx_SelsJson", AV28TFAlbProInEx_SelsJson);
            AV29TFAlbProInEx_Sels.fromJSonString(GXutil.strReplace( AV28TFAlbProInEx_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProTipo") == 0 )
         {
            AV30TFAlbProTipo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbProTipo_SelsJson", AV30TFAlbProTipo_SelsJson);
            AV31TFAlbProTipo_Sels.fromJSonString(AV30TFAlbProTipo_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProDate") == 0 )
         {
            AV32TFAlbProDate = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbProDate", localUtil.format(AV32TFAlbProDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProSal") == 0 )
         {
            AV36TFAlbProSal = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbProSal", localUtil.ttoc( AV36TFAlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CatDocID") == 0 )
         {
            AV40TFCatDocID = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFCatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFCatDocID), 4, 0));
            AV41TFCatDocID_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFCatDocID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCatDocID_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CatDocNom") == 0 )
         {
            AV42TFCatDocNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCatDocNom", AV42TFCatDocNom);
            AV43TFCatDocNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFCatDocNom_Sel", AV43TFCatDocNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProPrvID") == 0 )
         {
            AV44TFAlbProPrvID = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFAlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFAlbProPrvID), 6, 0));
            AV45TFAlbProPrvID_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbProPrvID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFAlbProPrvID_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProPrvNom") == 0 )
         {
            AV46TFAlbProPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbProPrvNom", AV46TFAlbProPrvNom);
            AV47TFAlbProPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbProPrvNom_Sel", AV47TFAlbProPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCliCod") == 0 )
         {
            AV48TFAlbProCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbProCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFAlbProCliCod), 6, 0));
            AV49TFAlbProCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbProCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFAlbProCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCliNom") == 0 )
         {
            AV50TFAlbProCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbProCliNom", AV50TFAlbProCliNom);
            AV51TFAlbProCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbProCliNom_Sel", AV51TFAlbProCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProDomEnv") == 0 )
         {
            AV52TFAlbProDomEnv = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbProDomEnv", GXutil.str( AV52TFAlbProDomEnv, 1, 0));
            AV53TFAlbProDomEnv_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbProDomEnv_To", GXutil.str( AV53TFAlbProDomEnv_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TrnCod") == 0 )
         {
            AV54TFTrnCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFTrnCod), 4, 0));
            AV55TFTrnCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFTrnCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TrnNom") == 0 )
         {
            AV56TFTrnNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFTrnNom", AV56TFTrnNom);
            AV57TFTrnNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFTrnNom_Sel", AV57TFTrnNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProMatricula") == 0 )
         {
            AV58TFAlbProMatricula = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbProMatricula", AV58TFAlbProMatricula);
            AV59TFAlbProMatricula_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbProMatricula_Sel", AV59TFAlbProMatricula_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProObs") == 0 )
         {
            AV60TFAlbProObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbProObs", AV60TFAlbProObs);
            AV61TFAlbProObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbProObs_Sel", AV61TFAlbProObs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProIDAT") == 0 )
         {
            AV78TFAlbProIDAT = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFAlbProIDAT", AV78TFAlbProIDAT);
            AV79TFAlbProIDAT_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFAlbProIDAT_Sel", AV79TFAlbProIDAT_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProStAT") == 0 )
         {
            AV82TFAlbProStAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFAlbProStAT_SelsJson", AV82TFAlbProStAT_SelsJson);
            AV83TFAlbProStAT_Sels.fromJSonString(GXutil.strReplace( AV82TFAlbProStAT_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProAnulado") == 0 )
         {
            AV74TFAlbProAnulado_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFAlbProAnulado_SelsJson", AV74TFAlbProAnulado_SelsJson);
            AV75TFAlbProAnulado_Sels.fromJSonString(AV74TFAlbProAnulado_SelsJson, null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75TFAlbProAnulado_Sels", AV75TFAlbProAnulado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFAlbProStAT_Sels", AV83TFAlbProStAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31TFAlbProTipo_Sels", AV31TFAlbProTipo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29TFAlbProInEx_Sels", AV29TFAlbProInEx_Sels);
   }

   private void e2418J2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Visualizar", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Documento Anulado", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Envio WEBSERVICE", ""), "fa fa-share", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Entrada Manual codigo AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV66GridActions, 4, 0)) );
   }

   public void e1518J2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TCALPROWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1118J2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TCALPROWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV122Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TCALPROWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TCALPROWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tcalproww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV122Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29TFAlbProInEx_Sels", AV29TFAlbProInEx_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31TFAlbProTipo_Sels", AV31TFAlbProTipo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFAlbProStAT_Sels", AV83TFAlbProStAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75TFAlbProAnulado_Sels", AV75TFAlbProAnulado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e2518J2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV66GridActions == 1 )
      {
         /* Execute user subroutine: 'DO VISUALIZAR' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV66GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV66GridActions == 3 )
      {
         /* Execute user subroutine: 'DO ELIMINARDOCUMENTO' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV66GridActions == 4 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV66GridActions == 5 )
      {
         /* Execute user subroutine: 'DO DOCUMENTOANULADO' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV66GridActions == 6 )
      {
         /* Execute user subroutine: 'DO ENVIOEWBSERVICE' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV66GridActions == 7 )
      {
         /* Execute user subroutine: 'DO ENTRADAMANUALCODIGOAT' */
         S252 ();
         if (returnInSub) return;
      }
      AV66GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV66GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1618J2( )
   {
      /* Dvelop_confirmpanel_eliminardocumento_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminardocumento_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARDOCUMENTO' */
         S262 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1718J2( )
   {
      /* Dvelop_confirmpanel_documentoanulado_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_documentoanulado_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DOCUMENTOANULADO' */
         S272 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1818J2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tcalpro", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","AlbProID"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e1918J2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.tcalprowwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tcalproww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      tcalproww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75TFAlbProAnulado_Sels", AV75TFAlbProAnulado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFAlbProStAT_Sels", AV83TFAlbProStAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31TFAlbProTipo_Sels", AV31TFAlbProTipo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29TFAlbProInEx_Sels", AV29TFAlbProInEx_Sels);
   }

   public void e2018J2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tcalprowwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75TFAlbProAnulado_Sels", AV75TFAlbProAnulado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFAlbProStAT_Sels", AV83TFAlbProStAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31TFAlbProTipo_Sels", AV31TFAlbProTipo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29TFAlbProInEx_Sels", AV29TFAlbProInEx_Sels);
   }

   public void e2118J2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tcalprowwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75TFAlbProAnulado_Sels", AV75TFAlbProAnulado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFAlbProStAT_Sels", AV83TFAlbProStAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31TFAlbProTipo_Sels", AV31TFAlbProTipo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29TFAlbProInEx_Sels", AV29TFAlbProInEx_Sels);
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProID", "", "Nº Documento", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProInEx", "", "Mercado Interno / Externo", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProTipo", "", "Proveedor o Cliente", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProDate", "", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProSal", "", "Fecha-Hora Salida", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CatDocID", "", "Codigo Categoria", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CatDocNom", "", "Categoria", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProPrvID", "", "Codigo Proveedor", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProPrvNom", "", "Nombre Proveedor", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProCliCod", "", "Codigo Cliente", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProCliNom", "", "Nombre Cliente", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProDomEnv", "", "Domicilio Envio", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TrnCod", "", "Cod Transp", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TrnNom", "", "Transportista", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProMatricula", "", "Matricula", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProObs", "", "Observaciones", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProIDAT", "", "AT ID", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProStAT", "", "Estado AT ", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProAnulado", "", "Estado", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TCALPROWWColumnsSelector", GXv_char4) ;
      tcalproww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TCALPROWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFAlbProID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFAlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFAlbProID), 8, 0));
      AV27TFAlbProID_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbProID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbProID_To), 8, 0));
      AV29TFAlbProInEx_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV31TFAlbProTipo_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32TFAlbProDate = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbProDate", localUtil.format(AV32TFAlbProDate, "99/99/99"));
      AV36TFAlbProSal = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbProSal", localUtil.ttoc( AV36TFAlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV40TFCatDocID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFCatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFCatDocID), 4, 0));
      AV41TFCatDocID_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFCatDocID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCatDocID_To), 4, 0));
      AV42TFCatDocNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFCatDocNom", AV42TFCatDocNom);
      AV43TFCatDocNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFCatDocNom_Sel", AV43TFCatDocNom_Sel);
      AV44TFAlbProPrvID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFAlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFAlbProPrvID), 6, 0));
      AV45TFAlbProPrvID_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbProPrvID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFAlbProPrvID_To), 6, 0));
      AV46TFAlbProPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbProPrvNom", AV46TFAlbProPrvNom);
      AV47TFAlbProPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbProPrvNom_Sel", AV47TFAlbProPrvNom_Sel);
      AV48TFAlbProCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbProCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFAlbProCliCod), 6, 0));
      AV49TFAlbProCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbProCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFAlbProCliCod_To), 6, 0));
      AV50TFAlbProCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbProCliNom", AV50TFAlbProCliNom);
      AV51TFAlbProCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbProCliNom_Sel", AV51TFAlbProCliNom_Sel);
      AV52TFAlbProDomEnv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbProDomEnv", GXutil.str( AV52TFAlbProDomEnv, 1, 0));
      AV53TFAlbProDomEnv_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbProDomEnv_To", GXutil.str( AV53TFAlbProDomEnv_To, 1, 0));
      AV54TFTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFTrnCod), 4, 0));
      AV55TFTrnCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFTrnCod_To), 4, 0));
      AV56TFTrnNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFTrnNom", AV56TFTrnNom);
      AV57TFTrnNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFTrnNom_Sel", AV57TFTrnNom_Sel);
      AV58TFAlbProMatricula = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbProMatricula", AV58TFAlbProMatricula);
      AV59TFAlbProMatricula_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbProMatricula_Sel", AV59TFAlbProMatricula_Sel);
      AV60TFAlbProObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbProObs", AV60TFAlbProObs);
      AV61TFAlbProObs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbProObs_Sel", AV61TFAlbProObs_Sel);
      AV78TFAlbProIDAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TFAlbProIDAT", AV78TFAlbProIDAT);
      AV79TFAlbProIDAT_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFAlbProIDAT_Sel", AV79TFAlbProIDAT_Sel);
      AV83TFAlbProStAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV75TFAlbProAnulado_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO VISUALIZAR' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tcalpro", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0))}, new String[] {"Mode","EmprCod","AlbProID"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tcalpro", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0))}, new String[] {"Mode","EmprCod","AlbProID"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO ELIMINARDOCUMENTO' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_eliminardocumento_Confirmationtext = httpContext.getMessage( "Deseas eliminar el documento ", "")+GXutil.trim( GXutil.str( A13418AlbProID, 8, 0)) ;
      ucDvelop_confirmpanel_eliminardocumento.sendProperty(context, "", false, Dvelop_confirmpanel_eliminardocumento_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminardocumento_Confirmationtext);
      if ( A13438AlbProStAT == 3 )
      {
         Dvelop_confirmpanel_eliminardocumento_Confirmationtext = Dvelop_confirmpanel_eliminardocumento_Confirmationtext+httpContext.getMessage( "Atenção.Este guia foi enviado para AT, confirma a sua Elimacion?", "") ;
         ucDvelop_confirmpanel_eliminardocumento.sendProperty(context, "", false, Dvelop_confirmpanel_eliminardocumento_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminardocumento_Confirmationtext);
      }
      AV123Emprcod_selected = A396EmprCod ;
      AV124Albproid_selected = A13418AlbProID ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTOContainer", "Confirm", "", new Object[] {});
   }

   public void S262( )
   {
      /* 'DO ACTION ELIMINARDOCUMENTO' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A13418AlbProID ;
      GXv_char3[0] = AV70UsurCod ;
      GXv_char2[0] = AV71Station ;
      GXv_char13[0] = Gx_msg ;
      new app.pdltcalpro(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_char13) ;
      tcalproww_impl.this.A396EmprCod = GXv_char4[0] ;
      tcalproww_impl.this.A13418AlbProID = GXv_int12[0] ;
      tcalproww_impl.this.AV70UsurCod = GXv_char3[0] ;
      tcalproww_impl.this.AV71Station = GXv_char2[0] ;
      tcalproww_impl.this.Gx_msg = GXv_char13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV70UsurCod", AV70UsurCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV71Station", AV71Station);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      httpContext.GX_msglist.addItem(Gx_msg);
      httpContext.doAjaxRefresh();
   }

   public void S222( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.stocksquimicos.imprimirdocumentosproveedor", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0))}, new String[] {"Emprcod","AlbProID"}) , new Object[] {"A396EmprCod","A13418AlbProID"});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO DOCUMENTOANULADO' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_documentoanulado_Confirmationtext = httpContext.getMessage( "¿Você selecionou o n º Documento ", "")+GXutil.trim( GXutil.str( A13418AlbProID, 8, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_documentoanulado.sendProperty(context, "", false, Dvelop_confirmpanel_documentoanulado_Internalname, "ConfirmationText", Dvelop_confirmpanel_documentoanulado_Confirmationtext);
      Dvelop_confirmpanel_documentoanulado_Confirmationtext = Dvelop_confirmpanel_documentoanulado_Confirmationtext+httpContext.getMessage( "Se confirmar este Documento", "")+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_documentoanulado.sendProperty(context, "", false, Dvelop_confirmpanel_documentoanulado_Internalname, "ConfirmationText", Dvelop_confirmpanel_documentoanulado_Confirmationtext);
      Dvelop_confirmpanel_documentoanulado_Confirmationtext = Dvelop_confirmpanel_documentoanulado_Confirmationtext+httpContext.getMessage( "poderá voltar a inserir linhas ", "")+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_documentoanulado.sendProperty(context, "", false, Dvelop_confirmpanel_documentoanulado_Internalname, "ConfirmationText", Dvelop_confirmpanel_documentoanulado_Confirmationtext);
      Dvelop_confirmpanel_documentoanulado_Confirmationtext = Dvelop_confirmpanel_documentoanulado_Confirmationtext+httpContext.getMessage( "Confirma o Documento?", "")+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_documentoanulado.sendProperty(context, "", false, Dvelop_confirmpanel_documentoanulado_Internalname, "ConfirmationText", Dvelop_confirmpanel_documentoanulado_Confirmationtext);
      AV123Emprcod_selected = A396EmprCod ;
      AV124Albproid_selected = A13418AlbProID ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADOContainer", "Confirm", "", new Object[] {});
   }

   public void S272( )
   {
      /* 'DO ACTION DOCUMENTOANULADO' Routine */
      returnInSub = false ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int12[0] = A13418AlbProID ;
      new app.pactcalpro(remoteHandle, context).execute( GXv_char13, GXv_int12) ;
      tcalproww_impl.this.A396EmprCod = GXv_char13[0] ;
      tcalproww_impl.this.A13418AlbProID = GXv_int12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      callWebObject(formatLink("app.tcalpro", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0))}, new String[] {"Mode","EmprCod","AlbProID"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO ENVIOEWBSERVICE' Routine */
      returnInSub = false ;
      if ( A13452AlbProInEx == 1 )
      {
         if ( A13438AlbProStAT != 3 )
         {
            httpContext.popup(formatLink("app.stocksquimicos.horasalidadocumentoenvioatdocumentoproveedor", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A13431AlbProSys))}, new String[] {"Emprcod","AlbProID","AlbProSys","cadena","hash"}) , new Object[] {"A396EmprCod","A13418AlbProID","A13431AlbProSys"});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S252( )
   {
      /* 'DO ENTRADAMANUALCODIGOAT' Routine */
      returnInSub = false ;
      if ( A13452AlbProInEx == 1 )
      {
         if ( ( GXutil.strcmp(A13436AlbProIDAT, " ") != 0 ) || ( A13438AlbProStAT == 3 ) )
         {
            if ( GXutil.strcmp(A13436AlbProIDAT, " ") != 0 )
            {
               Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A13436AlbProIDAT ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            }
            if ( ( A13438AlbProStAT == 3 ) && ( GXutil.strcmp(A13436AlbProIDAT, " ") == 0 ) )
            {
               Gx_msg = httpContext.getMessage( "Código -100 de AT,Guia marcada como comunicada AT", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            }
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.entradamanualcodigoat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(6,9,0)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0))}, new String[] {"Emprcod","TipoDocumento","Documento"}) , new Object[] {"A396EmprCod","","A13418AlbProID"});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV122Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV122Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV122Pgmname+"GridState"), null, null);
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
      AV126GXV1 = 1 ;
      while ( AV126GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV126GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROID") == 0 )
         {
            AV26TFAlbProID = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFAlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFAlbProID), 8, 0));
            AV27TFAlbProID_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbProID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbProID_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROINEX_SEL") == 0 )
         {
            AV28TFAlbProInEx_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProInEx_SelsJson", AV28TFAlbProInEx_SelsJson);
            AV29TFAlbProInEx_Sels.fromJSonString(AV28TFAlbProInEx_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROTIPO_SEL") == 0 )
         {
            AV30TFAlbProTipo_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbProTipo_SelsJson", AV30TFAlbProTipo_SelsJson);
            AV31TFAlbProTipo_Sels.fromJSonString(AV30TFAlbProTipo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODATE") == 0 )
         {
            AV32TFAlbProDate = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbProDate", localUtil.format(AV32TFAlbProDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSAL") == 0 )
         {
            AV36TFAlbProSal = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbProSal", localUtil.ttoc( AV36TFAlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV38DDO_AlbProSalAuxDate = GXutil.resetTime(AV36TFAlbProSal) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_AlbProSalAuxDate", localUtil.format(AV38DDO_AlbProSalAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCID") == 0 )
         {
            AV40TFCatDocID = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFCatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFCatDocID), 4, 0));
            AV41TFCatDocID_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFCatDocID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCatDocID_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM") == 0 )
         {
            AV42TFCatDocNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCatDocNom", AV42TFCatDocNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM_SEL") == 0 )
         {
            AV43TFCatDocNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFCatDocNom_Sel", AV43TFCatDocNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVID") == 0 )
         {
            AV44TFAlbProPrvID = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFAlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFAlbProPrvID), 6, 0));
            AV45TFAlbProPrvID_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbProPrvID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFAlbProPrvID_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM") == 0 )
         {
            AV46TFAlbProPrvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbProPrvNom", AV46TFAlbProPrvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM_SEL") == 0 )
         {
            AV47TFAlbProPrvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbProPrvNom_Sel", AV47TFAlbProPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLICOD") == 0 )
         {
            AV48TFAlbProCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbProCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFAlbProCliCod), 6, 0));
            AV49TFAlbProCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbProCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFAlbProCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLINOM") == 0 )
         {
            AV50TFAlbProCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbProCliNom", AV50TFAlbProCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLINOM_SEL") == 0 )
         {
            AV51TFAlbProCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbProCliNom_Sel", AV51TFAlbProCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODOMENV") == 0 )
         {
            AV52TFAlbProDomEnv = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbProDomEnv", GXutil.str( AV52TFAlbProDomEnv, 1, 0));
            AV53TFAlbProDomEnv_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbProDomEnv_To", GXutil.str( AV53TFAlbProDomEnv_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV54TFTrnCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFTrnCod), 4, 0));
            AV55TFTrnCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFTrnCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV56TFTrnNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFTrnNom", AV56TFTrnNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV57TFTrnNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFTrnNom_Sel", AV57TFTrnNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROMATRICULA") == 0 )
         {
            AV58TFAlbProMatricula = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbProMatricula", AV58TFAlbProMatricula);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROMATRICULA_SEL") == 0 )
         {
            AV59TFAlbProMatricula_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbProMatricula_Sel", AV59TFAlbProMatricula_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROOBS") == 0 )
         {
            AV60TFAlbProObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbProObs", AV60TFAlbProObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROOBS_SEL") == 0 )
         {
            AV61TFAlbProObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbProObs_Sel", AV61TFAlbProObs_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT") == 0 )
         {
            AV78TFAlbProIDAT = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFAlbProIDAT", AV78TFAlbProIDAT);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT_SEL") == 0 )
         {
            AV79TFAlbProIDAT_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFAlbProIDAT_Sel", AV79TFAlbProIDAT_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSTAT_SEL") == 0 )
         {
            AV82TFAlbProStAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFAlbProStAT_SelsJson", AV82TFAlbProStAT_SelsJson);
            AV83TFAlbProStAT_Sels.fromJSonString(AV82TFAlbProStAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROANULADO_SEL") == 0 )
         {
            AV74TFAlbProAnulado_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFAlbProAnulado_SelsJson", AV74TFAlbProAnulado_SelsJson);
            AV75TFAlbProAnulado_Sels.fromJSonString(AV74TFAlbProAnulado_SelsJson, null);
         }
         AV126GXV1 = (int)(AV126GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char13[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV31TFAlbProTipo_Sels.size()==0), AV30TFAlbProTipo_SelsJson, GXv_char13) ;
      tcalproww_impl.this.GXt_char1 = GXv_char13[0] ;
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFCatDocNom_Sel)==0), AV43TFCatDocNom_Sel, GXv_char4) ;
      tcalproww_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFAlbProPrvNom_Sel)==0), AV47TFAlbProPrvNom_Sel, GXv_char3) ;
      tcalproww_impl.this.GXt_char15 = GXv_char3[0] ;
      GXt_char16 = "" ;
      GXv_char2[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFAlbProCliNom_Sel)==0), AV51TFAlbProCliNom_Sel, GXv_char2) ;
      tcalproww_impl.this.GXt_char16 = GXv_char2[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFTrnNom_Sel)==0), AV57TFTrnNom_Sel, GXv_char18) ;
      tcalproww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFAlbProMatricula_Sel)==0), AV59TFAlbProMatricula_Sel, GXv_char20) ;
      tcalproww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFAlbProObs_Sel)==0), AV61TFAlbProObs_Sel, GXv_char22) ;
      tcalproww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFAlbProIDAT_Sel)==0), AV79TFAlbProIDAT_Sel, GXv_char24) ;
      tcalproww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV75TFAlbProAnulado_Sels.size()==0), AV74TFAlbProAnulado_SelsJson, GXv_char26) ;
      tcalproww_impl.this.GXt_char25 = GXv_char26[0] ;
      Ddo_grid_Selectedvalue_set = "|"+((AV29TFAlbProInEx_Sels.size()==0) ? "" : AV28TFAlbProInEx_SelsJson)+"|"+GXt_char1+"||||"+GXt_char14+"||"+GXt_char15+"||"+GXt_char16+"|||"+GXt_char17+"|"+GXt_char19+"|"+GXt_char21+"|"+GXt_char23+"|"+((AV83TFAlbProStAT_Sels.size()==0) ? "" : AV82TFAlbProStAT_SelsJson)+"|"+GXt_char25 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFCatDocNom)==0), AV42TFCatDocNom, GXv_char26) ;
      tcalproww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFAlbProPrvNom)==0), AV46TFAlbProPrvNom, GXv_char24) ;
      tcalproww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFAlbProCliNom)==0), AV50TFAlbProCliNom, GXv_char22) ;
      tcalproww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFTrnNom)==0), AV56TFTrnNom, GXv_char20) ;
      tcalproww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFAlbProMatricula)==0), AV58TFAlbProMatricula, GXv_char18) ;
      tcalproww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char16 = "" ;
      GXv_char13[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFAlbProObs)==0), AV60TFAlbProObs, GXv_char13) ;
      tcalproww_impl.this.GXt_char16 = GXv_char13[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFAlbProIDAT)==0), AV78TFAlbProIDAT, GXv_char4) ;
      tcalproww_impl.this.GXt_char15 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFAlbProID) ? "" : GXutil.str( AV26TFAlbProID, 8, 0))+"|||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFAlbProDate)) ? "" : localUtil.dtoc( AV32TFAlbProDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV36TFAlbProSal) ? "" : localUtil.dtoc( AV38DDO_AlbProSalAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV40TFCatDocID) ? "" : GXutil.str( AV40TFCatDocID, 4, 0))+"|"+GXt_char25+"|"+((0==AV44TFAlbProPrvID) ? "" : GXutil.str( AV44TFAlbProPrvID, 6, 0))+"|"+GXt_char23+"|"+((0==AV48TFAlbProCliCod) ? "" : GXutil.str( AV48TFAlbProCliCod, 6, 0))+"|"+GXt_char21+"|"+((0==AV52TFAlbProDomEnv) ? "" : GXutil.str( AV52TFAlbProDomEnv, 1, 0))+"|"+((0==AV54TFTrnCod) ? "" : GXutil.str( AV54TFTrnCod, 4, 0))+"|"+GXt_char19+"|"+GXt_char17+"|"+GXt_char16+"|"+GXt_char15+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFAlbProID_To) ? "" : GXutil.str( AV27TFAlbProID_To, 8, 0))+"|||||"+((0==AV41TFCatDocID_To) ? "" : GXutil.str( AV41TFCatDocID_To, 4, 0))+"||"+((0==AV45TFAlbProPrvID_To) ? "" : GXutil.str( AV45TFAlbProPrvID_To, 6, 0))+"||"+((0==AV49TFAlbProCliCod_To) ? "" : GXutil.str( AV49TFAlbProCliCod_To, 6, 0))+"||"+((0==AV53TFAlbProDomEnv_To) ? "" : GXutil.str( AV53TFAlbProDomEnv_To, 1, 0))+"|"+((0==AV55TFTrnCod_To) ? "" : GXutil.str( AV55TFTrnCod_To, 4, 0))+"||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV122Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROID", "", !((0==AV26TFAlbProID)&&(0==AV27TFAlbProID_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFAlbProID, 8, 0)), GXutil.trim( GXutil.str( AV27TFAlbProID_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROINEX_SEL", "", !(AV29TFAlbProInEx_Sels.size()==0), (short)(0), AV29TFAlbProInEx_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROTIPO_SEL", "", !(AV31TFAlbProTipo_Sels.size()==0), (short)(0), AV31TFAlbProTipo_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPRODATE", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFAlbProDate)), (short)(0), GXutil.trim( localUtil.dtoc( AV32TFAlbProDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROSAL", "", !GXutil.dateCompare(GXutil.nullDate(), AV36TFAlbProSal), (short)(0), GXutil.trim( localUtil.ttoc( AV36TFAlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFCATDOCID", "", !((0==AV40TFCatDocID)&&(0==AV41TFCatDocID_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFCatDocID, 4, 0)), GXutil.trim( GXutil.str( AV41TFCatDocID_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFCATDOCNOM", "", !(GXutil.strcmp("", AV42TFCatDocNom)==0), (short)(0), AV42TFCatDocNom, "", !(GXutil.strcmp("", AV43TFCatDocNom_Sel)==0), AV43TFCatDocNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROPRVID", "", !((0==AV44TFAlbProPrvID)&&(0==AV45TFAlbProPrvID_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFAlbProPrvID, 6, 0)), GXutil.trim( GXutil.str( AV45TFAlbProPrvID_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROPRVNOM", "", !(GXutil.strcmp("", AV46TFAlbProPrvNom)==0), (short)(0), AV46TFAlbProPrvNom, "", !(GXutil.strcmp("", AV47TFAlbProPrvNom_Sel)==0), AV47TFAlbProPrvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROCLICOD", "", !((0==AV48TFAlbProCliCod)&&(0==AV49TFAlbProCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFAlbProCliCod, 6, 0)), GXutil.trim( GXutil.str( AV49TFAlbProCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROCLINOM", "", !(GXutil.strcmp("", AV50TFAlbProCliNom)==0), (short)(0), AV50TFAlbProCliNom, "", !(GXutil.strcmp("", AV51TFAlbProCliNom_Sel)==0), AV51TFAlbProCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPRODOMENV", "", !((0==AV52TFAlbProDomEnv)&&(0==AV53TFAlbProDomEnv_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFAlbProDomEnv, 1, 0)), GXutil.trim( GXutil.str( AV53TFAlbProDomEnv_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFTRNCOD", "", !((0==AV54TFTrnCod)&&(0==AV55TFTrnCod_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFTrnCod, 4, 0)), GXutil.trim( GXutil.str( AV55TFTrnCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFTRNNOM", "", !(GXutil.strcmp("", AV56TFTrnNom)==0), (short)(0), AV56TFTrnNom, "", !(GXutil.strcmp("", AV57TFTrnNom_Sel)==0), AV57TFTrnNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROMATRICULA", "", !(GXutil.strcmp("", AV58TFAlbProMatricula)==0), (short)(0), AV58TFAlbProMatricula, "", !(GXutil.strcmp("", AV59TFAlbProMatricula_Sel)==0), AV59TFAlbProMatricula_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROOBS", "", !(GXutil.strcmp("", AV60TFAlbProObs)==0), (short)(0), AV60TFAlbProObs, "", !(GXutil.strcmp("", AV61TFAlbProObs_Sel)==0), AV61TFAlbProObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROIDAT", "", !(GXutil.strcmp("", AV78TFAlbProIDAT)==0), (short)(0), AV78TFAlbProIDAT, "", !(GXutil.strcmp("", AV79TFAlbProIDAT_Sel)==0), AV79TFAlbProIDAT_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROSTAT_SEL", "", !(AV83TFAlbProStAT_Sels.size()==0), (short)(0), AV83TFAlbProStAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFALBPROANULADO_SEL", "", !(AV75TFAlbProAnulado_Sels.size()==0), (short)(0), AV75TFAlbProAnulado_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV122Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV122Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TCALPRO" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table3_85_18J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_documentoanulado_Internalname, tblTabledvelop_confirmpanel_documentoanulado_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_documentoanulado.setProperty("Title", Dvelop_confirmpanel_documentoanulado_Title);
         ucDvelop_confirmpanel_documentoanulado.setProperty("ConfirmationText", Dvelop_confirmpanel_documentoanulado_Confirmationtext);
         ucDvelop_confirmpanel_documentoanulado.setProperty("YesButtonCaption", Dvelop_confirmpanel_documentoanulado_Yesbuttoncaption);
         ucDvelop_confirmpanel_documentoanulado.setProperty("NoButtonCaption", Dvelop_confirmpanel_documentoanulado_Nobuttoncaption);
         ucDvelop_confirmpanel_documentoanulado.setProperty("CancelButtonCaption", Dvelop_confirmpanel_documentoanulado_Cancelbuttoncaption);
         ucDvelop_confirmpanel_documentoanulado.setProperty("YesButtonPosition", Dvelop_confirmpanel_documentoanulado_Yesbuttonposition);
         ucDvelop_confirmpanel_documentoanulado.setProperty("ConfirmType", Dvelop_confirmpanel_documentoanulado_Confirmtype);
         ucDvelop_confirmpanel_documentoanulado.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_documentoanulado_Internalname, "DVELOP_CONFIRMPANEL_DOCUMENTOANULADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_DOCUMENTOANULADOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_85_18J2e( true) ;
      }
      else
      {
         wb_table3_85_18J2e( false) ;
      }
   }

   public void wb_table2_80_18J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminardocumento_Internalname, tblTabledvelop_confirmpanel_eliminardocumento_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminardocumento.setProperty("Title", Dvelop_confirmpanel_eliminardocumento_Title);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminardocumento_Confirmationtext);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("ConfirmType", Dvelop_confirmpanel_eliminardocumento_Confirmtype);
         ucDvelop_confirmpanel_eliminardocumento.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminardocumento_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_80_18J2e( true) ;
      }
      else
      {
         wb_table2_80_18J2e( false) ;
      }
   }

   public void wb_table1_27_18J2( boolean wbgen )
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
         wb_table4_32_18J2( true) ;
      }
      else
      {
         wb_table4_32_18J2( false) ;
      }
      return  ;
   }

   public void wb_table4_32_18J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_18J2e( true) ;
      }
      else
      {
         wb_table1_27_18J2e( false) ;
      }
   }

   public void wb_table4_32_18J2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TCALPROWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_32_18J2e( true) ;
      }
      else
      {
         wb_table4_32_18J2e( false) ;
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
      pa18J2( ) ;
      ws18J2( ) ;
      we18J2( ) ;
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
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116132734", true, true);
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
      httpContext.AddJavascriptSource("tcalproww.js", "?202682116132735", false, true);
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

   public void subsflControlProps_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtAlbProID_Internalname = "ALBPROID_"+sGXsfl_45_idx ;
      cmbAlbProInEx.setInternalname( "ALBPROINEX_"+sGXsfl_45_idx );
      cmbAlbProTipo.setInternalname( "ALBPROTIPO_"+sGXsfl_45_idx );
      edtAlbProDate_Internalname = "ALBPRODATE_"+sGXsfl_45_idx ;
      edtAlbProSal_Internalname = "ALBPROSAL_"+sGXsfl_45_idx ;
      edtCatDocID_Internalname = "CATDOCID_"+sGXsfl_45_idx ;
      edtCatDocNom_Internalname = "CATDOCNOM_"+sGXsfl_45_idx ;
      edtAlbProPrvI_Internalname = "ALBPROPRVI_"+sGXsfl_45_idx ;
      edtAlbProPrvN_Internalname = "ALBPROPRVN_"+sGXsfl_45_idx ;
      edtAlbProCliC_Internalname = "ALBPROCLIC_"+sGXsfl_45_idx ;
      edtAlbProCliN_Internalname = "ALBPROCLIN_"+sGXsfl_45_idx ;
      edtAlbProDomE_Internalname = "ALBPRODOME_"+sGXsfl_45_idx ;
      edtTrnCod_Internalname = "TRNCOD_"+sGXsfl_45_idx ;
      edtTrnNom_Internalname = "TRNNOM_"+sGXsfl_45_idx ;
      edtAlbProMatr_Internalname = "ALBPROMATR_"+sGXsfl_45_idx ;
      edtAlbProObs_Internalname = "ALBPROOBS_"+sGXsfl_45_idx ;
      edtAlbProIDAT_Internalname = "ALBPROIDAT_"+sGXsfl_45_idx ;
      cmbAlbProStAT.setInternalname( "ALBPROSTAT_"+sGXsfl_45_idx );
      edtAlbProSta_Internalname = "ALBPROSTA_"+sGXsfl_45_idx ;
      edtAlbProSys_Internalname = "ALBPROSYS_"+sGXsfl_45_idx ;
      edtAlbProHh_Internalname = "ALBPROHH_"+sGXsfl_45_idx ;
      edtAlbProHhCt_Internalname = "ALBPROHHCT_"+sGXsfl_45_idx ;
      edtAlbProEnvA_Internalname = "ALBPROENVA_"+sGXsfl_45_idx ;
      cmbAlbProAnul.setInternalname( "ALBPROANUL_"+sGXsfl_45_idx );
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtAlbProID_Internalname = "ALBPROID_"+sGXsfl_45_fel_idx ;
      cmbAlbProInEx.setInternalname( "ALBPROINEX_"+sGXsfl_45_fel_idx );
      cmbAlbProTipo.setInternalname( "ALBPROTIPO_"+sGXsfl_45_fel_idx );
      edtAlbProDate_Internalname = "ALBPRODATE_"+sGXsfl_45_fel_idx ;
      edtAlbProSal_Internalname = "ALBPROSAL_"+sGXsfl_45_fel_idx ;
      edtCatDocID_Internalname = "CATDOCID_"+sGXsfl_45_fel_idx ;
      edtCatDocNom_Internalname = "CATDOCNOM_"+sGXsfl_45_fel_idx ;
      edtAlbProPrvI_Internalname = "ALBPROPRVI_"+sGXsfl_45_fel_idx ;
      edtAlbProPrvN_Internalname = "ALBPROPRVN_"+sGXsfl_45_fel_idx ;
      edtAlbProCliC_Internalname = "ALBPROCLIC_"+sGXsfl_45_fel_idx ;
      edtAlbProCliN_Internalname = "ALBPROCLIN_"+sGXsfl_45_fel_idx ;
      edtAlbProDomE_Internalname = "ALBPRODOME_"+sGXsfl_45_fel_idx ;
      edtTrnCod_Internalname = "TRNCOD_"+sGXsfl_45_fel_idx ;
      edtTrnNom_Internalname = "TRNNOM_"+sGXsfl_45_fel_idx ;
      edtAlbProMatr_Internalname = "ALBPROMATR_"+sGXsfl_45_fel_idx ;
      edtAlbProObs_Internalname = "ALBPROOBS_"+sGXsfl_45_fel_idx ;
      edtAlbProIDAT_Internalname = "ALBPROIDAT_"+sGXsfl_45_fel_idx ;
      cmbAlbProStAT.setInternalname( "ALBPROSTAT_"+sGXsfl_45_fel_idx );
      edtAlbProSta_Internalname = "ALBPROSTA_"+sGXsfl_45_fel_idx ;
      edtAlbProSys_Internalname = "ALBPROSYS_"+sGXsfl_45_fel_idx ;
      edtAlbProHh_Internalname = "ALBPROHH_"+sGXsfl_45_fel_idx ;
      edtAlbProHhCt_Internalname = "ALBPROHHCT_"+sGXsfl_45_fel_idx ;
      edtAlbProEnvA_Internalname = "ALBPROENVA_"+sGXsfl_45_fel_idx ;
      cmbAlbProAnul.setInternalname( "ALBPROANUL_"+sGXsfl_45_fel_idx );
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb18J0( ) ;
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
               AV66GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV66GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV66GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_45_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV66GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProID_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProID_Internalname,GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn ColumnAlignLeft hidden-xs","",Integer.valueOf(edtAlbProID_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbAlbProInEx.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbProInEx.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROINEX_" + sGXsfl_45_idx ;
            cmbAlbProInEx.setName( GXCCtl );
            cmbAlbProInEx.setWebtags( "" );
            cmbAlbProInEx.addItem("1", httpContext.getMessage( "Mercado Interno", ""), (short)(0));
            cmbAlbProInEx.addItem("2", httpContext.getMessage( "Mercado Externo", ""), (short)(0));
            if ( cmbAlbProInEx.getItemCount() > 0 )
            {
               A13452AlbProInEx = (byte)(GXutil.lval( cmbAlbProInEx.getValidValue(GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProInEx,cmbAlbProInEx.getInternalname(),GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0)),Integer.valueOf(1),cmbAlbProInEx.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbAlbProInEx.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProInEx.setValue( GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Values", cmbAlbProInEx.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbProTipo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbProTipo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROTIPO_" + sGXsfl_45_idx ;
            cmbAlbProTipo.setName( GXCCtl );
            cmbAlbProTipo.setWebtags( "" );
            cmbAlbProTipo.addItem("P", httpContext.getMessage( "Proveedor", ""), (short)(0));
            cmbAlbProTipo.addItem("C", httpContext.getMessage( "Cliente", ""), (short)(0));
            if ( cmbAlbProTipo.getItemCount() > 0 )
            {
               A13417AlbProTipo = cmbAlbProTipo.getValidValue(A13417AlbProTipo) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProTipo,cmbAlbProTipo.getInternalname(),GXutil.rtrim( A13417AlbProTipo),Integer.valueOf(1),cmbAlbProTipo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbProTipo.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProTipo.setValue( GXutil.rtrim( A13417AlbProTipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProTipo.getInternalname(), "Values", cmbAlbProTipo.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProDate_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProDate_Internalname,localUtil.format(A13430AlbProDate, "99/99/99"),localUtil.format( A13430AlbProDate, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProDate_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProDate_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProSal_Internalname,localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13429AlbProSal, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCatDocID_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCatDocID_Internalname,GXutil.ltrim( localUtil.ntoc( A13453CatDocID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13453CatDocID), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCatDocID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCatDocID_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCatDocNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCatDocNom_Internalname,GXutil.rtrim( A13454CatDocNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCatDocNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCatDocNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProPrvI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProPrvI_Internalname,GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13419AlbProPrvI), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProPrvI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProPrvI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbProPrvN_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProPrvN_Internalname,GXutil.rtrim( A13420AlbProPrvN),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProPrvN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProPrvN_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProCliC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCliC_Internalname,GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13425AlbProCliC), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCliC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProCliC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbProCliN_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCliN_Internalname,GXutil.rtrim( A13426AlbProCliN),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCliN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProCliN_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProDomE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProDomE_Internalname,GXutil.ltrim( localUtil.ntoc( A13427AlbProDomE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13427AlbProDomE), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProDomE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProDomE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTrnCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnCod_Internalname,GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Codigo Transportista", ""),"",edtTrnCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTrnCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTrnNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnNom_Internalname,GXutil.rtrim( A841TrnNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrnNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTrnNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbProMatr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProMatr_Internalname,GXutil.rtrim( A13424AlbProMatr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProMatr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProMatr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbProObs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProObs_Internalname,A13439AlbProObs,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProObs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbProIDAT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProIDAT_Internalname,GXutil.rtrim( A13436AlbProIDAT),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProIDAT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProIDAT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbAlbProStAT.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbProStAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROSTAT_" + sGXsfl_45_idx ;
            cmbAlbProStAT.setName( GXCCtl );
            cmbAlbProStAT.setWebtags( "" );
            cmbAlbProStAT.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
            cmbAlbProStAT.addItem("3", httpContext.getMessage( "Enviada", ""), (short)(0));
            if ( cmbAlbProStAT.getItemCount() > 0 )
            {
               A13438AlbProStAT = (byte)(GXutil.lval( cmbAlbProStAT.getValidValue(GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProStAT,cmbAlbProStAT.getInternalname(),GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0)),Integer.valueOf(1),cmbAlbProStAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbAlbProStAT.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProStAT.setValue( GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProStAT.getInternalname(), "Values", cmbAlbProStAT.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProSta_Internalname,GXutil.ltrim( localUtil.ntoc( A13437AlbProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13437AlbProSta), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProSta_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProSys_Internalname,localUtil.ttoc( A13431AlbProSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13431AlbProSys, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProSys_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProHh_Internalname,A13433AlbProHh,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProHh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProHhCt_Internalname,A13434AlbProHhCt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProHhCt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProEnvA_Internalname,GXutil.rtrim( A13435AlbProEnvA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProEnvA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbProAnul.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbProAnul.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROANUL_" + sGXsfl_45_idx ;
            cmbAlbProAnul.setName( GXCCtl );
            cmbAlbProAnul.setWebtags( "" );
            cmbAlbProAnul.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
            cmbAlbProAnul.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
            if ( cmbAlbProAnul.getItemCount() > 0 )
            {
               A13440AlbProAnul = cmbAlbProAnul.getValidValue(A13440AlbProAnul) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProAnul,cmbAlbProAnul.getInternalname(),GXutil.rtrim( A13440AlbProAnul),Integer.valueOf(1),cmbAlbProAnul.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbProAnul.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProAnul.setValue( GXutil.rtrim( A13440AlbProAnul) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAnul.getInternalname(), "Values", cmbAlbProAnul.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         send_integrity_lvl_hashes18J2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProID_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbProInEx.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mercado Interno / Externo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbProTipo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor o Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProDate_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProSal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha-Hora Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCatDocID_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Categoria", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCatDocNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Categoria", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProPrvI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProPrvN_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProCliC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProCliN_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProDomE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Domicilio Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTrnCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod Transp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTrnNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProMatr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Matricula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProObs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProIDAT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "AT ID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbProStAT.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado AT ", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbProAnul.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV66GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProID_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13452AlbProInEx, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbProInEx.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13417AlbProTipo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbProTipo.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A13430AlbProDate, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProDate_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProSal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13453CatDocID, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCatDocID_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13454CatDocNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCatDocNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProPrvI_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13420AlbProPrvN));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProPrvN_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProCliC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13426AlbProCliN));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProCliN_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13427AlbProDomE, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProDomE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTrnCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A841TrnNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTrnNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13424AlbProMatr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProMatr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13439AlbProObs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProObs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13436AlbProIDAT));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProIDAT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13438AlbProStAT, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbProStAT.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13437AlbProSta, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A13431AlbProSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13433AlbProHh);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13434AlbProHhCt);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13435AlbProEnvA));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13440AlbProAnul));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbProAnul.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      edtAlbProID_Internalname = "ALBPROID" ;
      cmbAlbProInEx.setInternalname( "ALBPROINEX" );
      cmbAlbProTipo.setInternalname( "ALBPROTIPO" );
      edtAlbProDate_Internalname = "ALBPRODATE" ;
      edtAlbProSal_Internalname = "ALBPROSAL" ;
      edtCatDocID_Internalname = "CATDOCID" ;
      edtCatDocNom_Internalname = "CATDOCNOM" ;
      edtAlbProPrvI_Internalname = "ALBPROPRVI" ;
      edtAlbProPrvN_Internalname = "ALBPROPRVN" ;
      edtAlbProCliC_Internalname = "ALBPROCLIC" ;
      edtAlbProCliN_Internalname = "ALBPROCLIN" ;
      edtAlbProDomE_Internalname = "ALBPRODOME" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      edtAlbProMatr_Internalname = "ALBPROMATR" ;
      edtAlbProObs_Internalname = "ALBPROOBS" ;
      edtAlbProIDAT_Internalname = "ALBPROIDAT" ;
      cmbAlbProStAT.setInternalname( "ALBPROSTAT" );
      edtAlbProSta_Internalname = "ALBPROSTA" ;
      edtAlbProSys_Internalname = "ALBPROSYS" ;
      edtAlbProHh_Internalname = "ALBPROHH" ;
      edtAlbProHhCt_Internalname = "ALBPROHHCT" ;
      edtAlbProEnvA_Internalname = "ALBPROENVA" ;
      cmbAlbProAnul.setInternalname( "ALBPROANUL" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminardocumento_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO" ;
      tblTabledvelop_confirmpanel_eliminardocumento_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO" ;
      Dvelop_confirmpanel_documentoanulado_Internalname = "DVELOP_CONFIRMPANEL_DOCUMENTOANULADO" ;
      tblTabledvelop_confirmpanel_documentoanulado_Internalname = "TABLEDVELOP_CONFIRMPANEL_DOCUMENTOANULADO" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albprodateauxdate_Internalname = "vDDO_ALBPRODATEAUXDATE" ;
      divDdo_albprodateauxdates_Internalname = "DDO_ALBPRODATEAUXDATES" ;
      edtavDdo_albprosalauxdate_Internalname = "vDDO_ALBPROSALAUXDATE" ;
      divDdo_albprosalauxdates_Internalname = "DDO_ALBPROSALAUXDATES" ;
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
      cmbAlbProAnul.setJsonclick( "" );
      edtAlbProEnvA_Jsonclick = "" ;
      edtAlbProHhCt_Jsonclick = "" ;
      edtAlbProHh_Jsonclick = "" ;
      edtAlbProSys_Jsonclick = "" ;
      edtAlbProSta_Jsonclick = "" ;
      cmbAlbProStAT.setJsonclick( "" );
      edtAlbProIDAT_Jsonclick = "" ;
      edtAlbProObs_Jsonclick = "" ;
      edtAlbProMatr_Jsonclick = "" ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnCod_Jsonclick = "" ;
      edtAlbProDomE_Jsonclick = "" ;
      edtAlbProCliN_Jsonclick = "" ;
      edtAlbProCliC_Jsonclick = "" ;
      edtAlbProPrvN_Jsonclick = "" ;
      edtAlbProPrvI_Jsonclick = "" ;
      edtCatDocNom_Jsonclick = "" ;
      edtCatDocID_Jsonclick = "" ;
      edtAlbProSal_Jsonclick = "" ;
      edtAlbProDate_Jsonclick = "" ;
      cmbAlbProTipo.setJsonclick( "" );
      cmbAlbProInEx.setJsonclick( "" );
      edtAlbProID_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbAlbProAnul.setVisible( -1 );
      cmbAlbProStAT.setVisible( -1 );
      edtAlbProIDAT_Visible = -1 ;
      edtAlbProObs_Visible = -1 ;
      edtAlbProMatr_Visible = -1 ;
      edtTrnNom_Visible = -1 ;
      edtTrnCod_Visible = -1 ;
      edtAlbProDomE_Visible = -1 ;
      edtAlbProCliN_Visible = -1 ;
      edtAlbProCliC_Visible = -1 ;
      edtAlbProPrvN_Visible = -1 ;
      edtAlbProPrvI_Visible = -1 ;
      edtCatDocNom_Visible = -1 ;
      edtCatDocID_Visible = -1 ;
      edtAlbProSal_Visible = -1 ;
      edtAlbProDate_Visible = -1 ;
      cmbAlbProTipo.setVisible( -1 );
      cmbAlbProInEx.setVisible( -1 );
      edtAlbProID_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albprosalauxdate_Jsonclick = "" ;
      edtavDdo_albprodateauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_documentoanulado_Confirmtype = "1" ;
      Dvelop_confirmpanel_documentoanulado_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_documentoanulado_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_documentoanulado_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_documentoanulado_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_documentoanulado_Confirmationtext = "¿Desea activar el documento anulado?" ;
      Dvelop_confirmpanel_documentoanulado_Title = "" ;
      Dvelop_confirmpanel_eliminardocumento_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminardocumento_Confirmationtext = "¿Desea eliminar el documento?" ;
      Dvelop_confirmpanel_eliminardocumento_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "TCALPROWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|1:Mercado Interno,2:Mercado Externo|P:Proveedor,C:Cliente|||||||||||||||0:Pendiente,3:Enviada|:Activo,A:Anulado" ;
      Ddo_grid_Allowmultipleselection = "|T|T|||||||||||||||T|T" ;
      Ddo_grid_Datalisttype = "|FixedValues|FixedValues||||Dynamic||Dynamic||Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic|FixedValues|FixedValues" ;
      Ddo_grid_Includedatalist = "|T|T||||T||T||T|||T|T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "T|||||T||T||T||T|T||||||" ;
      Ddo_grid_Filtertype = "Numeric|||Date|Date|Numeric|Character|Numeric|Character|Numeric|Character|Numeric|Numeric|Character|Character|Character|Character||" ;
      Ddo_grid_Includefilter = "T|||T|T|T|T|T|T|T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19" ;
      Ddo_grid_Columnids = "1:AlbProID|2:AlbProInEx|3:AlbProTipo|4:AlbProDate|5:AlbProSal|6:CatDocID|7:CatDocNom|8:AlbProPrvID|9:AlbProPrvNom|10:AlbProCliCod|11:AlbProCliNom|12:AlbProDomEnv|13:TrnCod|14:TrnNom|15:AlbProMatricula|16:AlbProObs|17:AlbProIDAT|18:AlbProStAT|24:AlbProAnulado" ;
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
      Form.setCaption( httpContext.getMessage( " Documento Transporte Proveedor", "") );
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
         AV66GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV66GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridActions), 4, 0));
      }
      GXCCtl = "ALBPROINEX_" + sGXsfl_45_idx ;
      cmbAlbProInEx.setName( GXCCtl );
      cmbAlbProInEx.setWebtags( "" );
      cmbAlbProInEx.addItem("1", httpContext.getMessage( "Mercado Interno", ""), (short)(0));
      cmbAlbProInEx.addItem("2", httpContext.getMessage( "Mercado Externo", ""), (short)(0));
      if ( cmbAlbProInEx.getItemCount() > 0 )
      {
         A13452AlbProInEx = (byte)(GXutil.lval( cmbAlbProInEx.getValidValue(GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0))))) ;
      }
      GXCCtl = "ALBPROTIPO_" + sGXsfl_45_idx ;
      cmbAlbProTipo.setName( GXCCtl );
      cmbAlbProTipo.setWebtags( "" );
      cmbAlbProTipo.addItem("P", httpContext.getMessage( "Proveedor", ""), (short)(0));
      cmbAlbProTipo.addItem("C", httpContext.getMessage( "Cliente", ""), (short)(0));
      if ( cmbAlbProTipo.getItemCount() > 0 )
      {
         A13417AlbProTipo = cmbAlbProTipo.getValidValue(A13417AlbProTipo) ;
      }
      GXCCtl = "ALBPROSTAT_" + sGXsfl_45_idx ;
      cmbAlbProStAT.setName( GXCCtl );
      cmbAlbProStAT.setWebtags( "" );
      cmbAlbProStAT.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbAlbProStAT.addItem("3", httpContext.getMessage( "Enviada", ""), (short)(0));
      if ( cmbAlbProStAT.getItemCount() > 0 )
      {
         A13438AlbProStAT = (byte)(GXutil.lval( cmbAlbProStAT.getValidValue(GXutil.trim( GXutil.str( A13438AlbProStAT, 1, 0))))) ;
      }
      GXCCtl = "ALBPROANUL_" + sGXsfl_45_idx ;
      cmbAlbProAnul.setName( GXCCtl );
      cmbAlbProAnul.setWebtags( "" );
      cmbAlbProAnul.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbAlbProAnul.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbAlbProAnul.getItemCount() > 0 )
      {
         A13440AlbProAnul = cmbAlbProAnul.getValidValue(A13440AlbProAnul) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProID_Visible',ctrl:'ALBPROID',prop:'Visible'},{av:'cmbAlbProInEx'},{av:'cmbAlbProTipo'},{av:'edtAlbProDate_Visible',ctrl:'ALBPRODATE',prop:'Visible'},{av:'edtAlbProSal_Visible',ctrl:'ALBPROSAL',prop:'Visible'},{av:'edtCatDocID_Visible',ctrl:'CATDOCID',prop:'Visible'},{av:'edtCatDocNom_Visible',ctrl:'CATDOCNOM',prop:'Visible'},{av:'edtAlbProPrvI_Visible',ctrl:'ALBPROPRVI',prop:'Visible'},{av:'edtAlbProPrvN_Visible',ctrl:'ALBPROPRVN',prop:'Visible'},{av:'edtAlbProCliC_Visible',ctrl:'ALBPROCLIC',prop:'Visible'},{av:'edtAlbProCliN_Visible',ctrl:'ALBPROCLIN',prop:'Visible'},{av:'edtAlbProDomE_Visible',ctrl:'ALBPRODOME',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtAlbProMatr_Visible',ctrl:'ALBPROMATR',prop:'Visible'},{av:'edtAlbProObs_Visible',ctrl:'ALBPROOBS',prop:'Visible'},{av:'edtAlbProIDAT_Visible',ctrl:'ALBPROIDAT',prop:'Visible'},{av:'cmbAlbProStAT'},{av:'cmbAlbProAnul'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1218J2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1318J2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1418J2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74TFAlbProAnulado_SelsJson',fld:'vTFALBPROANULADO_SELSJSON',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV82TFAlbProStAT_SelsJson',fld:'vTFALBPROSTAT_SELSJSON',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV30TFAlbProTipo_SelsJson',fld:'vTFALBPROTIPO_SELSJSON',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV28TFAlbProInEx_SelsJson',fld:'vTFALBPROINEX_SELSJSON',pic:''},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2418J2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV66GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1518J2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbProID_Visible',ctrl:'ALBPROID',prop:'Visible'},{av:'cmbAlbProInEx'},{av:'cmbAlbProTipo'},{av:'edtAlbProDate_Visible',ctrl:'ALBPRODATE',prop:'Visible'},{av:'edtAlbProSal_Visible',ctrl:'ALBPROSAL',prop:'Visible'},{av:'edtCatDocID_Visible',ctrl:'CATDOCID',prop:'Visible'},{av:'edtCatDocNom_Visible',ctrl:'CATDOCNOM',prop:'Visible'},{av:'edtAlbProPrvI_Visible',ctrl:'ALBPROPRVI',prop:'Visible'},{av:'edtAlbProPrvN_Visible',ctrl:'ALBPROPRVN',prop:'Visible'},{av:'edtAlbProCliC_Visible',ctrl:'ALBPROCLIC',prop:'Visible'},{av:'edtAlbProCliN_Visible',ctrl:'ALBPROCLIN',prop:'Visible'},{av:'edtAlbProDomE_Visible',ctrl:'ALBPRODOME',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtAlbProMatr_Visible',ctrl:'ALBPROMATR',prop:'Visible'},{av:'edtAlbProObs_Visible',ctrl:'ALBPROOBS',prop:'Visible'},{av:'edtAlbProIDAT_Visible',ctrl:'ALBPROIDAT',prop:'Visible'},{av:'cmbAlbProStAT'},{av:'cmbAlbProAnul'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1118J2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV28TFAlbProInEx_SelsJson',fld:'vTFALBPROINEX_SELSJSON',pic:''},{av:'AV30TFAlbProTipo_SelsJson',fld:'vTFALBPROTIPO_SELSJSON',pic:''},{av:'AV82TFAlbProStAT_SelsJson',fld:'vTFALBPROSTAT_SELSJSON',pic:''},{av:'AV74TFAlbProAnulado_SelsJson',fld:'vTFALBPROANULADO_SELSJSON',pic:''},{av:'AV38DDO_AlbProSalAuxDate',fld:'vDDO_ALBPROSALAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV74TFAlbProAnulado_SelsJson',fld:'vTFALBPROANULADO_SELSJSON',pic:''},{av:'AV82TFAlbProStAT_SelsJson',fld:'vTFALBPROSTAT_SELSJSON',pic:''},{av:'AV38DDO_AlbProSalAuxDate',fld:'vDDO_ALBPROSALAUXDATE',pic:''},{av:'AV30TFAlbProTipo_SelsJson',fld:'vTFALBPROTIPO_SELSJSON',pic:''},{av:'AV28TFAlbProInEx_SelsJson',fld:'vTFALBPROINEX_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProID_Visible',ctrl:'ALBPROID',prop:'Visible'},{av:'cmbAlbProInEx'},{av:'cmbAlbProTipo'},{av:'edtAlbProDate_Visible',ctrl:'ALBPRODATE',prop:'Visible'},{av:'edtAlbProSal_Visible',ctrl:'ALBPROSAL',prop:'Visible'},{av:'edtCatDocID_Visible',ctrl:'CATDOCID',prop:'Visible'},{av:'edtCatDocNom_Visible',ctrl:'CATDOCNOM',prop:'Visible'},{av:'edtAlbProPrvI_Visible',ctrl:'ALBPROPRVI',prop:'Visible'},{av:'edtAlbProPrvN_Visible',ctrl:'ALBPROPRVN',prop:'Visible'},{av:'edtAlbProCliC_Visible',ctrl:'ALBPROCLIC',prop:'Visible'},{av:'edtAlbProCliN_Visible',ctrl:'ALBPROCLIN',prop:'Visible'},{av:'edtAlbProDomE_Visible',ctrl:'ALBPRODOME',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtAlbProMatr_Visible',ctrl:'ALBPROMATR',prop:'Visible'},{av:'edtAlbProObs_Visible',ctrl:'ALBPROOBS',prop:'Visible'},{av:'edtAlbProIDAT_Visible',ctrl:'ALBPROIDAT',prop:'Visible'},{av:'cmbAlbProStAT'},{av:'cmbAlbProAnul'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2518J2',iparms:[{av:'cmbavGridactions'},{av:'AV66GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'cmbAlbProStAT'},{av:'A13438AlbProStAT',fld:'ALBPROSTAT',pic:'9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'cmbAlbProInEx'},{av:'A13452AlbProInEx',fld:'ALBPROINEX',pic:'9',hsh:true},{av:'A13431AlbProSys',fld:'ALBPROSYS',pic:'99/99/99 99:99'},{av:'A13436AlbProIDAT',fld:'ALBPROIDAT',pic:'',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV66GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminardocumento_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO',prop:'ConfirmationText'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_documentoanulado_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_DOCUMENTOANULADO',prop:'ConfirmationText'},{av:'A13431AlbProSys',fld:'ALBPROSYS',pic:'99/99/99 99:99'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProID_Visible',ctrl:'ALBPROID',prop:'Visible'},{av:'cmbAlbProInEx'},{av:'cmbAlbProTipo'},{av:'edtAlbProDate_Visible',ctrl:'ALBPRODATE',prop:'Visible'},{av:'edtAlbProSal_Visible',ctrl:'ALBPROSAL',prop:'Visible'},{av:'edtCatDocID_Visible',ctrl:'CATDOCID',prop:'Visible'},{av:'edtCatDocNom_Visible',ctrl:'CATDOCNOM',prop:'Visible'},{av:'edtAlbProPrvI_Visible',ctrl:'ALBPROPRVI',prop:'Visible'},{av:'edtAlbProPrvN_Visible',ctrl:'ALBPROPRVN',prop:'Visible'},{av:'edtAlbProCliC_Visible',ctrl:'ALBPROCLIC',prop:'Visible'},{av:'edtAlbProCliN_Visible',ctrl:'ALBPROCLIN',prop:'Visible'},{av:'edtAlbProDomE_Visible',ctrl:'ALBPRODOME',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtAlbProMatr_Visible',ctrl:'ALBPROMATR',prop:'Visible'},{av:'edtAlbProObs_Visible',ctrl:'ALBPROOBS',prop:'Visible'},{av:'edtAlbProIDAT_Visible',ctrl:'ALBPROIDAT',prop:'Visible'},{av:'cmbAlbProStAT'},{av:'cmbAlbProAnul'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE","{handler:'e1618J2',iparms:[{av:'Dvelop_confirmpanel_eliminardocumento_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV71Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV71Station',fld:'vSTATION',pic:''},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProID_Visible',ctrl:'ALBPROID',prop:'Visible'},{av:'cmbAlbProInEx'},{av:'cmbAlbProTipo'},{av:'edtAlbProDate_Visible',ctrl:'ALBPRODATE',prop:'Visible'},{av:'edtAlbProSal_Visible',ctrl:'ALBPROSAL',prop:'Visible'},{av:'edtCatDocID_Visible',ctrl:'CATDOCID',prop:'Visible'},{av:'edtCatDocNom_Visible',ctrl:'CATDOCNOM',prop:'Visible'},{av:'edtAlbProPrvI_Visible',ctrl:'ALBPROPRVI',prop:'Visible'},{av:'edtAlbProPrvN_Visible',ctrl:'ALBPROPRVN',prop:'Visible'},{av:'edtAlbProCliC_Visible',ctrl:'ALBPROCLIC',prop:'Visible'},{av:'edtAlbProCliN_Visible',ctrl:'ALBPROCLIN',prop:'Visible'},{av:'edtAlbProDomE_Visible',ctrl:'ALBPRODOME',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtAlbProMatr_Visible',ctrl:'ALBPROMATR',prop:'Visible'},{av:'edtAlbProObs_Visible',ctrl:'ALBPROOBS',prop:'Visible'},{av:'edtAlbProIDAT_Visible',ctrl:'ALBPROIDAT',prop:'Visible'},{av:'cmbAlbProStAT'},{av:'cmbAlbProAnul'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DOCUMENTOANULADO.CLOSE","{handler:'e1718J2',iparms:[{av:'Dvelop_confirmpanel_documentoanulado_Result',ctrl:'DVELOP_CONFIRMPANEL_DOCUMENTOANULADO',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DOCUMENTOANULADO.CLOSE",",oparms:[{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProID_Visible',ctrl:'ALBPROID',prop:'Visible'},{av:'cmbAlbProInEx'},{av:'cmbAlbProTipo'},{av:'edtAlbProDate_Visible',ctrl:'ALBPRODATE',prop:'Visible'},{av:'edtAlbProSal_Visible',ctrl:'ALBPROSAL',prop:'Visible'},{av:'edtCatDocID_Visible',ctrl:'CATDOCID',prop:'Visible'},{av:'edtCatDocNom_Visible',ctrl:'CATDOCNOM',prop:'Visible'},{av:'edtAlbProPrvI_Visible',ctrl:'ALBPROPRVI',prop:'Visible'},{av:'edtAlbProPrvN_Visible',ctrl:'ALBPROPRVN',prop:'Visible'},{av:'edtAlbProCliC_Visible',ctrl:'ALBPROCLIC',prop:'Visible'},{av:'edtAlbProCliN_Visible',ctrl:'ALBPROCLIN',prop:'Visible'},{av:'edtAlbProDomE_Visible',ctrl:'ALBPRODOME',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtAlbProMatr_Visible',ctrl:'ALBPROMATR',prop:'Visible'},{av:'edtAlbProObs_Visible',ctrl:'ALBPROOBS',prop:'Visible'},{av:'edtAlbProIDAT_Visible',ctrl:'ALBPROIDAT',prop:'Visible'},{av:'cmbAlbProStAT'},{av:'cmbAlbProAnul'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1818J2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1918J2',iparms:[{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV28TFAlbProInEx_SelsJson',fld:'vTFALBPROINEX_SELSJSON',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV30TFAlbProTipo_SelsJson',fld:'vTFALBPROTIPO_SELSJSON',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV82TFAlbProStAT_SelsJson',fld:'vTFALBPROSTAT_SELSJSON',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV74TFAlbProAnulado_SelsJson',fld:'vTFALBPROANULADO_SELSJSON',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV38DDO_AlbProSalAuxDate',fld:'vDDO_ALBPROSALAUXDATE',pic:''},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV74TFAlbProAnulado_SelsJson',fld:'vTFALBPROANULADO_SELSJSON',pic:''},{av:'AV82TFAlbProStAT_SelsJson',fld:'vTFALBPROSTAT_SELSJSON',pic:''},{av:'AV38DDO_AlbProSalAuxDate',fld:'vDDO_ALBPROSALAUXDATE',pic:''},{av:'AV30TFAlbProTipo_SelsJson',fld:'vTFALBPROTIPO_SELSJSON',pic:''},{av:'AV28TFAlbProInEx_SelsJson',fld:'vTFALBPROINEX_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e2018J2',iparms:[{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV28TFAlbProInEx_SelsJson',fld:'vTFALBPROINEX_SELSJSON',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV30TFAlbProTipo_SelsJson',fld:'vTFALBPROTIPO_SELSJSON',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV82TFAlbProStAT_SelsJson',fld:'vTFALBPROSTAT_SELSJSON',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV74TFAlbProAnulado_SelsJson',fld:'vTFALBPROANULADO_SELSJSON',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV38DDO_AlbProSalAuxDate',fld:'vDDO_ALBPROSALAUXDATE',pic:''},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV74TFAlbProAnulado_SelsJson',fld:'vTFALBPROANULADO_SELSJSON',pic:''},{av:'AV82TFAlbProStAT_SelsJson',fld:'vTFALBPROSTAT_SELSJSON',pic:''},{av:'AV38DDO_AlbProSalAuxDate',fld:'vDDO_ALBPROSALAUXDATE',pic:''},{av:'AV30TFAlbProTipo_SelsJson',fld:'vTFALBPROTIPO_SELSJSON',pic:''},{av:'AV28TFAlbProInEx_SelsJson',fld:'vTFALBPROINEX_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2118J2',iparms:[{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV28TFAlbProInEx_SelsJson',fld:'vTFALBPROINEX_SELSJSON',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV30TFAlbProTipo_SelsJson',fld:'vTFALBPROTIPO_SELSJSON',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV82TFAlbProStAT_SelsJson',fld:'vTFALBPROSTAT_SELSJSON',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV74TFAlbProAnulado_SelsJson',fld:'vTFALBPROANULADO_SELSJSON',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV38DDO_AlbProSalAuxDate',fld:'vDDO_ALBPROSALAUXDATE',pic:''},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFAlbProID',fld:'vTFALBPROID',pic:'ZZZZZZZ9'},{av:'AV27TFAlbProID_To',fld:'vTFALBPROID_TO',pic:'ZZZZZZZ9'},{av:'AV29TFAlbProInEx_Sels',fld:'vTFALBPROINEX_SELS',pic:''},{av:'AV31TFAlbProTipo_Sels',fld:'vTFALBPROTIPO_SELS',pic:''},{av:'AV32TFAlbProDate',fld:'vTFALBPRODATE',pic:''},{av:'AV36TFAlbProSal',fld:'vTFALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40TFCatDocID',fld:'vTFCATDOCID',pic:'ZZZ9'},{av:'AV41TFCatDocID_To',fld:'vTFCATDOCID_TO',pic:'ZZZ9'},{av:'AV42TFCatDocNom',fld:'vTFCATDOCNOM',pic:''},{av:'AV43TFCatDocNom_Sel',fld:'vTFCATDOCNOM_SEL',pic:''},{av:'AV44TFAlbProPrvID',fld:'vTFALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45TFAlbProPrvID_To',fld:'vTFALBPROPRVID_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbProPrvNom',fld:'vTFALBPROPRVNOM',pic:''},{av:'AV47TFAlbProPrvNom_Sel',fld:'vTFALBPROPRVNOM_SEL',pic:''},{av:'AV48TFAlbProCliCod',fld:'vTFALBPROCLICOD',pic:'ZZZZZ9'},{av:'AV49TFAlbProCliCod_To',fld:'vTFALBPROCLICOD_TO',pic:'ZZZZZ9'},{av:'AV50TFAlbProCliNom',fld:'vTFALBPROCLINOM',pic:''},{av:'AV51TFAlbProCliNom_Sel',fld:'vTFALBPROCLINOM_SEL',pic:''},{av:'AV52TFAlbProDomEnv',fld:'vTFALBPRODOMENV',pic:'9'},{av:'AV53TFAlbProDomEnv_To',fld:'vTFALBPRODOMENV_TO',pic:'9'},{av:'AV54TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV55TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV56TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV57TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV58TFAlbProMatricula',fld:'vTFALBPROMATRICULA',pic:''},{av:'AV59TFAlbProMatricula_Sel',fld:'vTFALBPROMATRICULA_SEL',pic:''},{av:'AV60TFAlbProObs',fld:'vTFALBPROOBS',pic:''},{av:'AV61TFAlbProObs_Sel',fld:'vTFALBPROOBS_SEL',pic:''},{av:'AV78TFAlbProIDAT',fld:'vTFALBPROIDAT',pic:''},{av:'AV79TFAlbProIDAT_Sel',fld:'vTFALBPROIDAT_SEL',pic:''},{av:'AV83TFAlbProStAT_Sels',fld:'vTFALBPROSTAT_SELS',pic:''},{av:'AV75TFAlbProAnulado_Sels',fld:'vTFALBPROANULADO_SELS',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV74TFAlbProAnulado_SelsJson',fld:'vTFALBPROANULADO_SELSJSON',pic:''},{av:'AV82TFAlbProStAT_SelsJson',fld:'vTFALBPROSTAT_SELSJSON',pic:''},{av:'AV38DDO_AlbProSalAuxDate',fld:'vDDO_ALBPROSALAUXDATE',pic:''},{av:'AV30TFAlbProTipo_SelsJson',fld:'vTFALBPROTIPO_SELSJSON',pic:''},{av:'AV28TFAlbProInEx_SelsJson',fld:'vTFALBPROINEX_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_ALBPROID","{handler:'valid_Albproid',iparms:[]");
      setEventMetadata("VALID_ALBPROID",",oparms:[]}");
      setEventMetadata("VALID_ALBPROINEX","{handler:'valid_Albproinex',iparms:[]");
      setEventMetadata("VALID_ALBPROINEX",",oparms:[]}");
      setEventMetadata("VALID_ALBPROTIPO","{handler:'valid_Albprotipo',iparms:[]");
      setEventMetadata("VALID_ALBPROTIPO",",oparms:[]}");
      setEventMetadata("VALID_CATDOCID","{handler:'valid_Catdocid',iparms:[]");
      setEventMetadata("VALID_CATDOCID",",oparms:[]}");
      setEventMetadata("VALID_CATDOCNOM","{handler:'valid_Catdocnom',iparms:[]");
      setEventMetadata("VALID_CATDOCNOM",",oparms:[]}");
      setEventMetadata("VALID_ALBPROPRVI","{handler:'valid_Albproprvi',iparms:[]");
      setEventMetadata("VALID_ALBPROPRVI",",oparms:[]}");
      setEventMetadata("VALID_ALBPROPRVN","{handler:'valid_Albproprvn',iparms:[]");
      setEventMetadata("VALID_ALBPROPRVN",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCLIC","{handler:'valid_Albproclic',iparms:[]");
      setEventMetadata("VALID_ALBPROCLIC",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCLIN","{handler:'valid_Albproclin',iparms:[]");
      setEventMetadata("VALID_ALBPROCLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBPRODOME","{handler:'valid_Albprodome',iparms:[]");
      setEventMetadata("VALID_ALBPRODOME",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("VALID_TRNNOM","{handler:'valid_Trnnom',iparms:[]");
      setEventMetadata("VALID_TRNNOM",",oparms:[]}");
      setEventMetadata("VALID_ALBPROMATR","{handler:'valid_Albpromatr',iparms:[]");
      setEventMetadata("VALID_ALBPROMATR",",oparms:[]}");
      setEventMetadata("VALID_ALBPROOBS","{handler:'valid_Albproobs',iparms:[]");
      setEventMetadata("VALID_ALBPROOBS",",oparms:[]}");
      setEventMetadata("VALID_ALBPROIDAT","{handler:'valid_Albproidat',iparms:[]");
      setEventMetadata("VALID_ALBPROIDAT",",oparms:[]}");
      setEventMetadata("VALID_ALBPROSTAT","{handler:'valid_Albprostat',iparms:[]");
      setEventMetadata("VALID_ALBPROSTAT",",oparms:[]}");
      setEventMetadata("VALID_ALBPROANUL","{handler:'valid_Albproanul',iparms:[]");
      setEventMetadata("VALID_ALBPROANUL",",oparms:[]}");
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
      Dvelop_confirmpanel_eliminardocumento_Result = "" ;
      Dvelop_confirmpanel_documentoanulado_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV29TFAlbProInEx_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV31TFAlbProTipo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32TFAlbProDate = GXutil.nullDate() ;
      AV36TFAlbProSal = GXutil.resetTime( GXutil.nullDate() );
      AV42TFCatDocNom = "" ;
      AV43TFCatDocNom_Sel = "" ;
      AV46TFAlbProPrvNom = "" ;
      AV47TFAlbProPrvNom_Sel = "" ;
      AV50TFAlbProCliNom = "" ;
      AV51TFAlbProCliNom_Sel = "" ;
      AV56TFTrnNom = "" ;
      AV57TFTrnNom_Sel = "" ;
      AV58TFAlbProMatricula = "" ;
      AV59TFAlbProMatricula_Sel = "" ;
      AV60TFAlbProObs = "" ;
      AV61TFAlbProObs_Sel = "" ;
      AV78TFAlbProIDAT = "" ;
      AV79TFAlbProIDAT_Sel = "" ;
      AV83TFAlbProStAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV75TFAlbProAnulado_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV122Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV62DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28TFAlbProInEx_SelsJson = "" ;
      AV30TFAlbProTipo_SelsJson = "" ;
      AV82TFAlbProStAT_SelsJson = "" ;
      AV74TFAlbProAnulado_SelsJson = "" ;
      A396EmprCod = "" ;
      Gx_msg = "" ;
      AV70UsurCod = "" ;
      AV71Station = "" ;
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
      AV34DDO_AlbProDateAuxDate = GXutil.nullDate() ;
      AV38DDO_AlbProSalAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13417AlbProTipo = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13454CatDocNom = "" ;
      A13420AlbProPrvN = "" ;
      A13426AlbProCliN = "" ;
      A841TrnNom = "" ;
      A13424AlbProMatr = "" ;
      A13439AlbProObs = "" ;
      A13436AlbProIDAT = "" ;
      A13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      A13433AlbProHh = "" ;
      A13434AlbProHhCt = "" ;
      A13435AlbProEnvA = "" ;
      A13440AlbProAnul = "" ;
      AV89Tcalprowwds_1_filterfulltext = "" ;
      AV92Tcalprowwds_4_tfalbproinex_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV93Tcalprowwds_5_tfalbprotipo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV94Tcalprowwds_6_tfalbprodate = GXutil.nullDate() ;
      AV95Tcalprowwds_7_tfalbprosal = GXutil.resetTime( GXutil.nullDate() );
      AV98Tcalprowwds_10_tfcatdocnom = "" ;
      AV99Tcalprowwds_11_tfcatdocnom_sel = "" ;
      AV102Tcalprowwds_14_tfalbproprvnom = "" ;
      AV103Tcalprowwds_15_tfalbproprvnom_sel = "" ;
      AV106Tcalprowwds_18_tfalbproclinom = "" ;
      AV107Tcalprowwds_19_tfalbproclinom_sel = "" ;
      AV112Tcalprowwds_24_tftrnnom = "" ;
      AV113Tcalprowwds_25_tftrnnom_sel = "" ;
      AV114Tcalprowwds_26_tfalbpromatricula = "" ;
      AV115Tcalprowwds_27_tfalbpromatricula_sel = "" ;
      AV116Tcalprowwds_28_tfalbproobs = "" ;
      AV117Tcalprowwds_29_tfalbproobs_sel = "" ;
      AV118Tcalprowwds_30_tfalbproidat = "" ;
      AV119Tcalprowwds_31_tfalbproidat_sel = "" ;
      AV120Tcalprowwds_32_tfalbprostat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV121Tcalprowwds_33_tfalbproanulado_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV89Tcalprowwds_1_filterfulltext = "" ;
      lV98Tcalprowwds_10_tfcatdocnom = "" ;
      lV102Tcalprowwds_14_tfalbproprvnom = "" ;
      lV106Tcalprowwds_18_tfalbproclinom = "" ;
      lV112Tcalprowwds_24_tftrnnom = "" ;
      lV114Tcalprowwds_26_tfalbpromatricula = "" ;
      lV116Tcalprowwds_28_tfalbproobs = "" ;
      lV118Tcalprowwds_30_tfalbproidat = "" ;
      H018J2_A396EmprCod = new String[] {""} ;
      H018J2_A13440AlbProAnul = new String[] {""} ;
      H018J2_A13435AlbProEnvA = new String[] {""} ;
      H018J2_A13434AlbProHhCt = new String[] {""} ;
      H018J2_A13433AlbProHh = new String[] {""} ;
      H018J2_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      H018J2_A13437AlbProSta = new byte[1] ;
      H018J2_A13438AlbProStAT = new byte[1] ;
      H018J2_A13436AlbProIDAT = new String[] {""} ;
      H018J2_A13439AlbProObs = new String[] {""} ;
      H018J2_A13424AlbProMatr = new String[] {""} ;
      H018J2_A841TrnNom = new String[] {""} ;
      H018J2_n841TrnNom = new boolean[] {false} ;
      H018J2_A840TrnCod = new short[1] ;
      H018J2_n840TrnCod = new boolean[] {false} ;
      H018J2_A13427AlbProDomE = new byte[1] ;
      H018J2_A13426AlbProCliN = new String[] {""} ;
      H018J2_A13425AlbProCliC = new int[1] ;
      H018J2_A13420AlbProPrvN = new String[] {""} ;
      H018J2_n13420AlbProPrvN = new boolean[] {false} ;
      H018J2_A13419AlbProPrvI = new int[1] ;
      H018J2_A13454CatDocNom = new String[] {""} ;
      H018J2_n13454CatDocNom = new boolean[] {false} ;
      H018J2_A13453CatDocID = new short[1] ;
      H018J2_n13453CatDocID = new boolean[] {false} ;
      H018J2_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      H018J2_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      H018J2_A13417AlbProTipo = new String[] {""} ;
      H018J2_A13452AlbProInEx = new byte[1] ;
      H018J2_A13418AlbProID = new int[1] ;
      H018J3_A396EmprCod = new String[] {""} ;
      H018J3_A13440AlbProAnul = new String[] {""} ;
      H018J3_A13435AlbProEnvA = new String[] {""} ;
      H018J3_A13434AlbProHhCt = new String[] {""} ;
      H018J3_A13433AlbProHh = new String[] {""} ;
      H018J3_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      H018J3_A13437AlbProSta = new byte[1] ;
      H018J3_A13438AlbProStAT = new byte[1] ;
      H018J3_A13436AlbProIDAT = new String[] {""} ;
      H018J3_A13439AlbProObs = new String[] {""} ;
      H018J3_A13424AlbProMatr = new String[] {""} ;
      H018J3_A841TrnNom = new String[] {""} ;
      H018J3_n841TrnNom = new boolean[] {false} ;
      H018J3_A840TrnCod = new short[1] ;
      H018J3_n840TrnCod = new boolean[] {false} ;
      H018J3_A13427AlbProDomE = new byte[1] ;
      H018J3_A13426AlbProCliN = new String[] {""} ;
      H018J3_A13425AlbProCliC = new int[1] ;
      H018J3_A13420AlbProPrvN = new String[] {""} ;
      H018J3_n13420AlbProPrvN = new boolean[] {false} ;
      H018J3_A13419AlbProPrvI = new int[1] ;
      H018J3_A13454CatDocNom = new String[] {""} ;
      H018J3_n13454CatDocNom = new boolean[] {false} ;
      H018J3_A13453CatDocID = new short[1] ;
      H018J3_n13453CatDocID = new boolean[] {false} ;
      H018J3_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      H018J3_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      H018J3_A13417AlbProTipo = new String[] {""} ;
      H018J3_A13452AlbProInEx = new byte[1] ;
      H018J3_A13418AlbProID = new int[1] ;
      AV84EmprCod = "" ;
      AV88Emprnom = "" ;
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
      ucDvelop_confirmpanel_eliminardocumento = new com.genexus.webpanels.GXUserControl();
      AV123Emprcod_selected = "" ;
      ucDvelop_confirmpanel_documentoanulado = new com.genexus.webpanels.GXUserControl();
      GXv_int12 = new int[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState27 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcalproww__default(),
         new Object[] {
             new Object[] {
            H018J2_A396EmprCod, H018J2_A13440AlbProAnul, H018J2_A13435AlbProEnvA, H018J2_A13434AlbProHhCt, H018J2_A13433AlbProHh, H018J2_A13431AlbProSys, H018J2_A13437AlbProSta, H018J2_A13438AlbProStAT, H018J2_A13436AlbProIDAT, H018J2_A13439AlbProObs,
            H018J2_A13424AlbProMatr, H018J2_A841TrnNom, H018J2_n841TrnNom, H018J2_A840TrnCod, H018J2_n840TrnCod, H018J2_A13427AlbProDomE, H018J2_A13426AlbProCliN, H018J2_A13425AlbProCliC, H018J2_A13420AlbProPrvN, H018J2_n13420AlbProPrvN,
            H018J2_A13419AlbProPrvI, H018J2_A13454CatDocNom, H018J2_n13454CatDocNom, H018J2_A13453CatDocID, H018J2_n13453CatDocID, H018J2_A13429AlbProSal, H018J2_A13430AlbProDate, H018J2_A13417AlbProTipo, H018J2_A13452AlbProInEx, H018J2_A13418AlbProID
            }
            , new Object[] {
            H018J3_A396EmprCod, H018J3_A13440AlbProAnul, H018J3_A13435AlbProEnvA, H018J3_A13434AlbProHhCt, H018J3_A13433AlbProHh, H018J3_A13431AlbProSys, H018J3_A13437AlbProSta, H018J3_A13438AlbProStAT, H018J3_A13436AlbProIDAT, H018J3_A13439AlbProObs,
            H018J3_A13424AlbProMatr, H018J3_A841TrnNom, H018J3_n841TrnNom, H018J3_A840TrnCod, H018J3_n840TrnCod, H018J3_A13427AlbProDomE, H018J3_A13426AlbProCliN, H018J3_A13425AlbProCliC, H018J3_A13420AlbProPrvN, H018J3_n13420AlbProPrvN,
            H018J3_A13419AlbProPrvI, H018J3_A13454CatDocNom, H018J3_n13454CatDocNom, H018J3_A13453CatDocID, H018J3_n13453CatDocID, H018J3_A13429AlbProSal, H018J3_A13430AlbProDate, H018J3_A13417AlbProTipo, H018J3_A13452AlbProInEx, H018J3_A13418AlbProID
            }
         }
      );
      AV122Pgmname = "TCALPROWW" ;
      /* GeneXus formulas. */
      AV122Pgmname = "TCALPROWW" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV52TFAlbProDomEnv ;
   private byte AV53TFAlbProDomEnv_To ;
   private byte gxajaxcallmode ;
   private byte A13452AlbProInEx ;
   private byte A13427AlbProDomE ;
   private byte A13438AlbProStAT ;
   private byte A13437AlbProSta ;
   private byte nDonePA ;
   private byte AV108Tcalprowwds_20_tfalbprodomenv ;
   private byte AV109Tcalprowwds_21_tfalbprodomenv_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV40TFCatDocID ;
   private short AV41TFCatDocID_To ;
   private short AV54TFTrnCod ;
   private short AV55TFTrnCod_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV66GridActions ;
   private short A13453CatDocID ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV96Tcalprowwds_8_tfcatdocid ;
   private short AV97Tcalprowwds_9_tfcatdocid_to ;
   private short AV110Tcalprowwds_22_tftrncod ;
   private short AV111Tcalprowwds_23_tftrncod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV26TFAlbProID ;
   private int AV27TFAlbProID_To ;
   private int AV44TFAlbProPrvID ;
   private int AV45TFAlbProPrvID_To ;
   private int AV48TFAlbProCliCod ;
   private int AV49TFAlbProCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A13418AlbProID ;
   private int A13419AlbProPrvI ;
   private int A13425AlbProCliC ;
   private int subGrid_Islastpage ;
   private int AV90Tcalprowwds_2_tfalbproid ;
   private int AV91Tcalprowwds_3_tfalbproid_to ;
   private int AV100Tcalprowwds_12_tfalbproprvid ;
   private int AV101Tcalprowwds_13_tfalbproprvid_to ;
   private int AV104Tcalprowwds_16_tfalbproclicod ;
   private int AV105Tcalprowwds_17_tfalbproclicod_to ;
   private int AV92Tcalprowwds_4_tfalbproinex_sels_size ;
   private int AV93Tcalprowwds_5_tfalbprotipo_sels_size ;
   private int AV120Tcalprowwds_32_tfalbprostat_sels_size ;
   private int AV121Tcalprowwds_33_tfalbproanulado_sels_size ;
   private int edtAlbProID_Visible ;
   private int edtAlbProDate_Visible ;
   private int edtAlbProSal_Visible ;
   private int edtCatDocID_Visible ;
   private int edtCatDocNom_Visible ;
   private int edtAlbProPrvI_Visible ;
   private int edtAlbProPrvN_Visible ;
   private int edtAlbProCliC_Visible ;
   private int edtAlbProCliN_Visible ;
   private int edtAlbProDomE_Visible ;
   private int edtTrnCod_Visible ;
   private int edtTrnNom_Visible ;
   private int edtAlbProMatr_Visible ;
   private int edtAlbProObs_Visible ;
   private int edtAlbProIDAT_Visible ;
   private int AV63PageToGo ;
   private int AV124Albproid_selected ;
   private int GXv_int12[] ;
   private int AV126GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV64GridCurrentPage ;
   private long AV65GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminardocumento_Result ;
   private String Dvelop_confirmpanel_documentoanulado_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_45_idx="0001" ;
   private String AV42TFCatDocNom ;
   private String AV43TFCatDocNom_Sel ;
   private String AV46TFAlbProPrvNom ;
   private String AV47TFAlbProPrvNom_Sel ;
   private String AV50TFAlbProCliNom ;
   private String AV51TFAlbProCliNom_Sel ;
   private String AV56TFTrnNom ;
   private String AV57TFTrnNom_Sel ;
   private String AV58TFAlbProMatricula ;
   private String AV59TFAlbProMatricula_Sel ;
   private String AV78TFAlbProIDAT ;
   private String AV79TFAlbProIDAT_Sel ;
   private String AV122Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String AV70UsurCod ;
   private String AV71Station ;
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
   private String Dvelop_confirmpanel_eliminardocumento_Title ;
   private String Dvelop_confirmpanel_eliminardocumento_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminardocumento_Confirmtype ;
   private String Dvelop_confirmpanel_documentoanulado_Title ;
   private String Dvelop_confirmpanel_documentoanulado_Confirmationtext ;
   private String Dvelop_confirmpanel_documentoanulado_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_documentoanulado_Nobuttoncaption ;
   private String Dvelop_confirmpanel_documentoanulado_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_documentoanulado_Yesbuttonposition ;
   private String Dvelop_confirmpanel_documentoanulado_Confirmtype ;
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
   private String divDdo_albprodateauxdates_Internalname ;
   private String edtavDdo_albprodateauxdate_Internalname ;
   private String edtavDdo_albprodateauxdate_Jsonclick ;
   private String divDdo_albprosalauxdates_Internalname ;
   private String edtavDdo_albprosalauxdate_Internalname ;
   private String edtavDdo_albprosalauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbProID_Internalname ;
   private String A13417AlbProTipo ;
   private String edtAlbProDate_Internalname ;
   private String edtAlbProSal_Internalname ;
   private String edtCatDocID_Internalname ;
   private String A13454CatDocNom ;
   private String edtCatDocNom_Internalname ;
   private String edtAlbProPrvI_Internalname ;
   private String A13420AlbProPrvN ;
   private String edtAlbProPrvN_Internalname ;
   private String edtAlbProCliC_Internalname ;
   private String A13426AlbProCliN ;
   private String edtAlbProCliN_Internalname ;
   private String edtAlbProDomE_Internalname ;
   private String edtTrnCod_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Internalname ;
   private String A13424AlbProMatr ;
   private String edtAlbProMatr_Internalname ;
   private String edtAlbProObs_Internalname ;
   private String A13436AlbProIDAT ;
   private String edtAlbProIDAT_Internalname ;
   private String edtAlbProSta_Internalname ;
   private String edtAlbProSys_Internalname ;
   private String edtAlbProHh_Internalname ;
   private String edtAlbProHhCt_Internalname ;
   private String A13435AlbProEnvA ;
   private String edtAlbProEnvA_Internalname ;
   private String A13440AlbProAnul ;
   private String edtavFilterfulltext_Internalname ;
   private String AV98Tcalprowwds_10_tfcatdocnom ;
   private String AV99Tcalprowwds_11_tfcatdocnom_sel ;
   private String AV102Tcalprowwds_14_tfalbproprvnom ;
   private String AV103Tcalprowwds_15_tfalbproprvnom_sel ;
   private String AV106Tcalprowwds_18_tfalbproclinom ;
   private String AV107Tcalprowwds_19_tfalbproclinom_sel ;
   private String AV112Tcalprowwds_24_tftrnnom ;
   private String AV113Tcalprowwds_25_tftrnnom_sel ;
   private String AV114Tcalprowwds_26_tfalbpromatricula ;
   private String AV115Tcalprowwds_27_tfalbpromatricula_sel ;
   private String AV118Tcalprowwds_30_tfalbproidat ;
   private String AV119Tcalprowwds_31_tfalbproidat_sel ;
   private String scmdbuf ;
   private String lV98Tcalprowwds_10_tfcatdocnom ;
   private String lV102Tcalprowwds_14_tfalbproprvnom ;
   private String lV106Tcalprowwds_18_tfalbproclinom ;
   private String lV112Tcalprowwds_24_tftrnnom ;
   private String lV114Tcalprowwds_26_tfalbpromatricula ;
   private String lV118Tcalprowwds_30_tfalbproidat ;
   private String AV84EmprCod ;
   private String AV88Emprnom ;
   private String Dvelop_confirmpanel_eliminardocumento_Internalname ;
   private String AV123Emprcod_selected ;
   private String Dvelop_confirmpanel_documentoanulado_Internalname ;
   private String GXt_char1 ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char16 ;
   private String GXv_char13[] ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_documentoanulado_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminardocumento_Internalname ;
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
   private String edtAlbProID_Jsonclick ;
   private String edtAlbProDate_Jsonclick ;
   private String edtAlbProSal_Jsonclick ;
   private String edtCatDocID_Jsonclick ;
   private String edtCatDocNom_Jsonclick ;
   private String edtAlbProPrvI_Jsonclick ;
   private String edtAlbProPrvN_Jsonclick ;
   private String edtAlbProCliC_Jsonclick ;
   private String edtAlbProCliN_Jsonclick ;
   private String edtAlbProDomE_Jsonclick ;
   private String edtTrnCod_Jsonclick ;
   private String edtTrnNom_Jsonclick ;
   private String edtAlbProMatr_Jsonclick ;
   private String edtAlbProObs_Jsonclick ;
   private String edtAlbProIDAT_Jsonclick ;
   private String edtAlbProSta_Jsonclick ;
   private String edtAlbProSys_Jsonclick ;
   private String edtAlbProHh_Jsonclick ;
   private String edtAlbProHhCt_Jsonclick ;
   private String edtAlbProEnvA_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV36TFAlbProSal ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date A13431AlbProSys ;
   private java.util.Date AV95Tcalprowwds_7_tfalbprosal ;
   private java.util.Date AV32TFAlbProDate ;
   private java.util.Date AV34DDO_AlbProDateAuxDate ;
   private java.util.Date AV38DDO_AlbProSalAuxDate ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date AV94Tcalprowwds_6_tfalbprodate ;
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
   private boolean n13453CatDocID ;
   private boolean n13454CatDocNom ;
   private boolean n13420AlbProPrvN ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV28TFAlbProInEx_SelsJson ;
   private String AV30TFAlbProTipo_SelsJson ;
   private String AV82TFAlbProStAT_SelsJson ;
   private String AV74TFAlbProAnulado_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV60TFAlbProObs ;
   private String AV61TFAlbProObs_Sel ;
   private String A13439AlbProObs ;
   private String A13433AlbProHh ;
   private String A13434AlbProHhCt ;
   private String AV89Tcalprowwds_1_filterfulltext ;
   private String AV116Tcalprowwds_28_tfalbproobs ;
   private String AV117Tcalprowwds_29_tfalbproobs_sel ;
   private String lV89Tcalprowwds_1_filterfulltext ;
   private String lV116Tcalprowwds_28_tfalbproobs ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private GXSimpleCollection<Byte> AV29TFAlbProInEx_Sels ;
   private GXSimpleCollection<Byte> AV83TFAlbProStAT_Sels ;
   private GXSimpleCollection<Byte> AV92Tcalprowwds_4_tfalbproinex_sels ;
   private GXSimpleCollection<Byte> AV120Tcalprowwds_32_tfalbprostat_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminardocumento ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_documentoanulado ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbProInEx ;
   private HTMLChoice cmbAlbProTipo ;
   private HTMLChoice cmbAlbProStAT ;
   private HTMLChoice cmbAlbProAnul ;
   private IDataStoreProvider pr_default ;
   private String[] H018J2_A396EmprCod ;
   private String[] H018J2_A13440AlbProAnul ;
   private String[] H018J2_A13435AlbProEnvA ;
   private String[] H018J2_A13434AlbProHhCt ;
   private String[] H018J2_A13433AlbProHh ;
   private java.util.Date[] H018J2_A13431AlbProSys ;
   private byte[] H018J2_A13437AlbProSta ;
   private byte[] H018J2_A13438AlbProStAT ;
   private String[] H018J2_A13436AlbProIDAT ;
   private String[] H018J2_A13439AlbProObs ;
   private String[] H018J2_A13424AlbProMatr ;
   private String[] H018J2_A841TrnNom ;
   private boolean[] H018J2_n841TrnNom ;
   private short[] H018J2_A840TrnCod ;
   private boolean[] H018J2_n840TrnCod ;
   private byte[] H018J2_A13427AlbProDomE ;
   private String[] H018J2_A13426AlbProCliN ;
   private int[] H018J2_A13425AlbProCliC ;
   private String[] H018J2_A13420AlbProPrvN ;
   private boolean[] H018J2_n13420AlbProPrvN ;
   private int[] H018J2_A13419AlbProPrvI ;
   private String[] H018J2_A13454CatDocNom ;
   private boolean[] H018J2_n13454CatDocNom ;
   private short[] H018J2_A13453CatDocID ;
   private boolean[] H018J2_n13453CatDocID ;
   private java.util.Date[] H018J2_A13429AlbProSal ;
   private java.util.Date[] H018J2_A13430AlbProDate ;
   private String[] H018J2_A13417AlbProTipo ;
   private byte[] H018J2_A13452AlbProInEx ;
   private int[] H018J2_A13418AlbProID ;
   private String[] H018J3_A396EmprCod ;
   private String[] H018J3_A13440AlbProAnul ;
   private String[] H018J3_A13435AlbProEnvA ;
   private String[] H018J3_A13434AlbProHhCt ;
   private String[] H018J3_A13433AlbProHh ;
   private java.util.Date[] H018J3_A13431AlbProSys ;
   private byte[] H018J3_A13437AlbProSta ;
   private byte[] H018J3_A13438AlbProStAT ;
   private String[] H018J3_A13436AlbProIDAT ;
   private String[] H018J3_A13439AlbProObs ;
   private String[] H018J3_A13424AlbProMatr ;
   private String[] H018J3_A841TrnNom ;
   private boolean[] H018J3_n841TrnNom ;
   private short[] H018J3_A840TrnCod ;
   private boolean[] H018J3_n840TrnCod ;
   private byte[] H018J3_A13427AlbProDomE ;
   private String[] H018J3_A13426AlbProCliN ;
   private int[] H018J3_A13425AlbProCliC ;
   private String[] H018J3_A13420AlbProPrvN ;
   private boolean[] H018J3_n13420AlbProPrvN ;
   private int[] H018J3_A13419AlbProPrvI ;
   private String[] H018J3_A13454CatDocNom ;
   private boolean[] H018J3_n13454CatDocNom ;
   private short[] H018J3_A13453CatDocID ;
   private boolean[] H018J3_n13453CatDocID ;
   private java.util.Date[] H018J3_A13429AlbProSal ;
   private java.util.Date[] H018J3_A13430AlbProDate ;
   private String[] H018J3_A13417AlbProTipo ;
   private byte[] H018J3_A13452AlbProInEx ;
   private int[] H018J3_A13418AlbProID ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV31TFAlbProTipo_Sels ;
   private GXSimpleCollection<String> AV75TFAlbProAnulado_Sels ;
   private GXSimpleCollection<String> AV93Tcalprowwds_5_tfalbprotipo_sels ;
   private GXSimpleCollection<String> AV121Tcalprowwds_33_tfalbproanulado_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState27[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV62DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tcalproww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H018J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV92Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV93Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV120Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV121Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV90Tcalprowwds_2_tfalbproid ,
                                          int AV91Tcalprowwds_3_tfalbproid_to ,
                                          int AV92Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV93Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV94Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV95Tcalprowwds_7_tfalbprosal ,
                                          short AV96Tcalprowwds_8_tfcatdocid ,
                                          short AV97Tcalprowwds_9_tfcatdocid_to ,
                                          String AV99Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV98Tcalprowwds_10_tfcatdocnom ,
                                          int AV100Tcalprowwds_12_tfalbproprvid ,
                                          int AV101Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV103Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV102Tcalprowwds_14_tfalbproprvnom ,
                                          int AV104Tcalprowwds_16_tfalbproclicod ,
                                          int AV105Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV107Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV106Tcalprowwds_18_tfalbproclinom ,
                                          byte AV108Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV109Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV110Tcalprowwds_22_tftrncod ,
                                          short AV111Tcalprowwds_23_tftrncod_to ,
                                          String AV113Tcalprowwds_25_tftrnnom_sel ,
                                          String AV112Tcalprowwds_24_tftrnnom ,
                                          String AV115Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV114Tcalprowwds_26_tfalbpromatricula ,
                                          String AV117Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV116Tcalprowwds_28_tfalbproobs ,
                                          String AV119Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV118Tcalprowwds_30_tfalbproidat ,
                                          int AV120Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV121Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV89Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[28];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProAnul, T1.AlbProEnvA, T1.AlbProHhCt, T1.AlbProHh, T1.AlbProSys, T1.AlbProSta, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProObs, T1.AlbProMatr," ;
      scmdbuf += " T2.TrnNom, T1.TrnCod, T1.AlbProDomE, T3.CliNom AS AlbProCliN, T1.AlbProCliC AS AlbProCliC, T4.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T5.CatDocNom, T1.CatDocID," ;
      scmdbuf += " T1.AlbProSal, T1.AlbProDate, T1.AlbProTipo, T1.AlbProInEx, T1.AlbProID FROM ((((TXPCALPRO T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.AlbProCliC) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.AlbProPrvI)" ;
      scmdbuf += " LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID = T1.CatDocID)" ;
      if ( ! (0==AV90Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int28[0] = (byte)(1) ;
      }
      if ( ! (0==AV91Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int28[1] = (byte)(1) ;
      }
      if ( AV92Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV93Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int28[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int28[4] = (byte)(1) ;
      }
      if ( ! (0==AV97Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int28[7] = (byte)(1) ;
      }
      if ( ! (0==AV100Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int28[8] = (byte)(1) ;
      }
      if ( ! (0==AV101Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int28[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      if ( ! (0==AV104Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int28[12] = (byte)(1) ;
      }
      if ( ! (0==AV105Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( ! (0==AV108Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( ! (0==AV109Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( ! (0==AV110Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( ! (0==AV111Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV112Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV114Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV116Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV118Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( AV120Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV120Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV121Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProID" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProID DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProInEx" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProInEx DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProTipo" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProTipo DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProDate" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProDate DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProSal" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CatDocID" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CatDocID DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CatDocNom" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CatDocNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPrvI" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPrvI DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCliC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCliC DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProDomE" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProDomE DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProMatr" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProMatr DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProObs" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProObs DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProIDAT" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProIDAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProStAT" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProStAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProAnul" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProAnul DESC" ;
      }
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_H018J3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV92Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV93Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV120Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV121Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV90Tcalprowwds_2_tfalbproid ,
                                          int AV91Tcalprowwds_3_tfalbproid_to ,
                                          int AV92Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV93Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV94Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV95Tcalprowwds_7_tfalbprosal ,
                                          short AV96Tcalprowwds_8_tfcatdocid ,
                                          short AV97Tcalprowwds_9_tfcatdocid_to ,
                                          String AV99Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV98Tcalprowwds_10_tfcatdocnom ,
                                          int AV100Tcalprowwds_12_tfalbproprvid ,
                                          int AV101Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV103Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV102Tcalprowwds_14_tfalbproprvnom ,
                                          int AV104Tcalprowwds_16_tfalbproclicod ,
                                          int AV105Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV107Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV106Tcalprowwds_18_tfalbproclinom ,
                                          byte AV108Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV109Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV110Tcalprowwds_22_tftrncod ,
                                          short AV111Tcalprowwds_23_tftrncod_to ,
                                          String AV113Tcalprowwds_25_tftrnnom_sel ,
                                          String AV112Tcalprowwds_24_tftrnnom ,
                                          String AV115Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV114Tcalprowwds_26_tfalbpromatricula ,
                                          String AV117Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV116Tcalprowwds_28_tfalbproobs ,
                                          String AV119Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV118Tcalprowwds_30_tfalbproidat ,
                                          int AV120Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV121Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV89Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[28];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProAnul, T1.AlbProEnvA, T1.AlbProHhCt, T1.AlbProHh, T1.AlbProSys, T1.AlbProSta, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProObs, T1.AlbProMatr," ;
      scmdbuf += " T2.TrnNom, T1.TrnCod, T1.AlbProDomE, T3.CliNom AS AlbProCliN, T1.AlbProCliC AS AlbProCliC, T4.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T5.CatDocNom, T1.CatDocID," ;
      scmdbuf += " T1.AlbProSal, T1.AlbProDate, T1.AlbProTipo, T1.AlbProInEx, T1.AlbProID FROM ((((TXPCALPRO T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.AlbProCliC) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.AlbProPrvI)" ;
      scmdbuf += " LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID = T1.CatDocID)" ;
      if ( ! (0==AV90Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int31[0] = (byte)(1) ;
      }
      if ( ! (0==AV91Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int31[1] = (byte)(1) ;
      }
      if ( AV92Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV93Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int31[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int31[3] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int31[4] = (byte)(1) ;
      }
      if ( ! (0==AV97Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int31[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int31[7] = (byte)(1) ;
      }
      if ( ! (0==AV100Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int31[8] = (byte)(1) ;
      }
      if ( ! (0==AV101Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int31[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int31[11] = (byte)(1) ;
      }
      if ( ! (0==AV104Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int31[12] = (byte)(1) ;
      }
      if ( ! (0==AV105Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int31[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( ! (0==AV108Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! (0==AV109Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (0==AV110Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( ! (0==AV111Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV112Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV114Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV116Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV118Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( AV120Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV120Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV121Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProID" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProID DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProInEx" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProInEx DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProTipo" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProTipo DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProDate" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProDate DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProSal" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CatDocID" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CatDocID DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CatDocNom" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CatDocNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPrvI" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPrvI DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCliC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCliC DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProDomE" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProDomE DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProMatr" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProMatr DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProObs" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProObs DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProIDAT" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProIDAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProStAT" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProStAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProAnul" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProAnul DESC" ;
      }
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
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
                  return conditional_H018J2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Boolean) dynConstraints[56]).booleanValue() , (String)dynConstraints[57] );
            case 1 :
                  return conditional_H018J3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Boolean) dynConstraints[56]).booleanValue() , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H018J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018J3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(21);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(22);
               ((String[]) buf[27])[0] = rslt.getString(23, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(24);
               ((int[]) buf[29])[0] = rslt.getInt(25);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(21);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(22);
               ((String[]) buf[27])[0] = rslt.getString(23, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(24);
               ((int[]) buf[29])[0] = rslt.getInt(25);
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
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
      }
   }

}

