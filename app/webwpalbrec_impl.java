package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwpalbrec_impl extends GXDataArea
{
   public webwpalbrec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwpalbrec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwpalbrec_impl.class ));
   }

   public webwpalbrec_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbrest = new HTMLChoice();
      cmbavClinomoperator = new HTMLChoice();
      cmbavAlbrefoperator = new HTMLChoice();
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
      nRC_GXsfl_69 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_69"))) ;
      nGXsfl_69_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_69_idx"))) ;
      sGXsfl_69_idx = httpContext.GetPar( "sGXsfl_69_idx") ;
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
      cmbavClinomoperator.fromJSonString( httpContext.GetNextPar( ));
      AV71CliNomOperator = (short)(GXutil.lval( httpContext.GetPar( "CliNomOperator"))) ;
      AV72CliNom = httpContext.GetPar( "CliNom") ;
      cmbavAlbrefoperator.fromJSonString( httpContext.GetNextPar( ));
      AV73AlbRefOperator = (short)(GXutil.lval( httpContext.GetPar( "AlbRefOperator"))) ;
      AV74AlbRef = httpContext.GetPar( "AlbRef") ;
      AV15AlbRFen = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen")) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV76FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV66AlbRFen_To = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen_To")) ;
      cmbavAlbrest.fromJSonString( httpContext.GetNextPar( ));
      AV70AlbREst = (byte)(GXutil.lval( httpContext.GetPar( "AlbREst"))) ;
      AV44TFAlbRFen = localUtil.parseDateParm( httpContext.GetPar( "TFAlbRFen")) ;
      AV27TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV28TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      AV30TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV31TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV33TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV34TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV36TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV37TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      AV49TFAlbRefDsc = httpContext.GetPar( "TFAlbRefDsc") ;
      AV50TFAlbRefDsc_Sel = httpContext.GetPar( "TFAlbRefDsc_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV78TFAlbRUni_Sels);
      AV61TFAlbRUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt"), ".") ;
      AV62TFAlbRUniEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt_To"), ".") ;
      AV52TFAlbRUniDis = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniDis"), ".") ;
      AV53TFAlbRUniDis_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniDis_To"), ".") ;
      AV64TFAlbRPieEnt = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt"))) ;
      AV65TFAlbRPieEnt_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt_To"))) ;
      AV58TFAlbRPieDis = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieDis"))) ;
      AV59TFAlbRPieDis_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieDis_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV69TFAlbREst_Sels);
      AV114Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV71CliNomOperator, AV72CliNom, AV73AlbRefOperator, AV74AlbRef, AV15AlbRFen, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV76FilterFullText, AV66AlbRFen_To, AV70AlbREst, AV44TFAlbRFen, AV27TFAlbRecCod, AV28TFAlbRecCod_To, AV30TFCliCod, AV31TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV36TFAlbRef, AV37TFAlbRef_Sel, AV49TFAlbRefDsc, AV50TFAlbRefDsc_Sel, AV78TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV52TFAlbRUniDis, AV53TFAlbRUniDis_To, AV64TFAlbRPieEnt, AV65TFAlbRPieEnt_To, AV58TFAlbRPieDis, AV59TFAlbRPieDis_To, AV69TFAlbREst_Sels, AV114Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      paIK2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startIK2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
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
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwpalbrec", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV114Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLINOMOPERATOR", GXutil.ltrim( localUtil.ntoc( AV71CliNomOperator, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLINOM", GXutil.rtrim( AV72CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBREFOPERATOR", GXutil.ltrim( localUtil.ntoc( AV73AlbRefOperator, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBREF", GXutil.rtrim( AV74AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBRFEN", localUtil.format(AV15AlbRFen, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_69", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_69, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV41GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV42GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFEN", localUtil.dtoc( AV15AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFEN_TO", localUtil.dtoc( AV66AlbRFen_To, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV39DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV39DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRFEN", localUtil.dtoc( AV44TFAlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV27TFAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV28TFAlbRecCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV30TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV31TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV33TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV34TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF", GXutil.rtrim( AV36TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF_SEL", GXutil.rtrim( AV37TFAlbRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC", GXutil.rtrim( AV49TFAlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC_SEL", GXutil.rtrim( AV50TFAlbRefDsc_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRUNI_SELS", AV78TFAlbRUni_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRUNI_SELS", AV78TFAlbRUni_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV61TFAlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT_TO", GXutil.ltrim( localUtil.ntoc( AV62TFAlbRUniEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV52TFAlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIDIS_TO", GXutil.ltrim( localUtil.ntoc( AV53TFAlbRUniDis_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV64TFAlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEENT_TO", GXutil.ltrim( localUtil.ntoc( AV65TFAlbRPieEnt_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV58TFAlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEDIS_TO", GXutil.ltrim( localUtil.ntoc( AV59TFAlbRPieDis_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBREST_SELS", AV69TFAlbREst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBREST_SELS", AV69TFAlbREst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV114Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV114Pgmname, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNI_SELSJSON", AV77TFAlbRUni_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREST_SELSJSON", AV68TFAlbREst_SelsJson);
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      if ( ! ( WebComp_Wcwcdetallepiezas == null ) )
      {
         WebComp_Wcwcdetallepiezas.componentjscripts();
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
         weIK2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtIK2( ) ;
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
      return formatLink("app.webwpalbrec", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWpALBREC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Almacen de Tela (con detalle de rollos)", "") ;
   }

   public void wbIK0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWpALBREC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWpALBREC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWpALBREC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_IK2( true) ;
      }
      else
      {
         wb_table1_23_IK2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_IK2e( boolean wbgen )
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
         startgridcontrol69( ) ;
      }
      if ( wbEnd == 69 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_69 = (int)(nGXsfl_69_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV41GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV42GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0092"+"", GXutil.rtrim( WebComp_Wcwcdetallepiezas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0092"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_69_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwcdetallepiezas_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcdetallepiezas), GXutil.lower( WebComp_Wcwcdetallepiezas_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0092"+"");
                  }
                  WebComp_Wcwcdetallepiezas.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcdetallepiezas), GXutil.lower( WebComp_Wcwcdetallepiezas_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         ucAlbrfen_rangepicker.setProperty("Start Date", AV15AlbRFen);
         ucAlbrfen_rangepicker.setProperty("End Date", AV66AlbRFen_To);
         ucAlbrfen_rangepicker.render(context, "wwp.daterangepicker", Albrfen_rangepicker_Internalname, "ALBRFEN_RANGEPICKERContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albrfenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albrfenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albrfenauxdate_Internalname, localUtil.format(AV46DDO_AlbRFenAuxDate, "99/99/99"), localUtil.format( AV46DDO_AlbRFenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albrfenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWpALBREC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albrfenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWpALBREC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 69 )
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

   public void startIK2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Almacen de Tela (con detalle de rollos)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupIK0( ) ;
   }

   public void wsIK2( )
   {
      startIK2( ) ;
      evtIK2( ) ;
   }

   public void evtIK2( )
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
                           e11IK2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12IK2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13IK2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ALBRFEN_RANGEPICKER.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14IK2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15IK2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16IK2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17IK2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e18IK2 ();
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
                           nGXsfl_69_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_692( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV79GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GridActions), 4, 0));
                           A49AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbRFen_Internalname), 0)) ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
                           cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
                           cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
                           A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
                           A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
                           A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
                           A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbAlbREst.setName( cmbAlbREst.getInternalname() );
                           cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
                           A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19IK2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e20IK2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21IK2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Clinomoperator Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLINOMOPERATOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV71CliNomOperator )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clinom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLINOM"), AV72CliNom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albrefoperator Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBREFOPERATOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV73AlbRefOperator )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albref Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBREF"), AV74AlbRef) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albrfen Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBRFEN"), 0), AV15AlbRFen) ) )
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
                     if ( nCmpId == 92 )
                     {
                        OldWcwcdetallepiezas = httpContext.cgiGet( "W0092") ;
                        if ( ( GXutil.len( OldWcwcdetallepiezas) == 0 ) || ( GXutil.strcmp(OldWcwcdetallepiezas, WebComp_Wcwcdetallepiezas_Component) != 0 ) )
                        {
                           WebComp_Wcwcdetallepiezas = WebUtils.getWebComponent(getClass(), "app." + OldWcwcdetallepiezas + "_impl", remoteHandle, context);
                           WebComp_Wcwcdetallepiezas_Component = OldWcwcdetallepiezas ;
                        }
                        if ( GXutil.len( WebComp_Wcwcdetallepiezas_Component) != 0 )
                        {
                           WebComp_Wcwcdetallepiezas.componentprocess("W0092", "", sEvt);
                        }
                        WebComp_Wcwcdetallepiezas_Component = OldWcwcdetallepiezas ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weIK2( )
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

   public void paIK2( )
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
      subsflControlProps_692( ) ;
      while ( nGXsfl_69_idx <= nRC_GXsfl_69 )
      {
         sendrow_692( ) ;
         nGXsfl_69_idx = ((subGrid_Islastpage==1)&&(nGXsfl_69_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 short AV71CliNomOperator ,
                                 String AV72CliNom ,
                                 short AV73AlbRefOperator ,
                                 String AV74AlbRef ,
                                 java.util.Date AV15AlbRFen ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV76FilterFullText ,
                                 java.util.Date AV66AlbRFen_To ,
                                 byte AV70AlbREst ,
                                 java.util.Date AV44TFAlbRFen ,
                                 int AV27TFAlbRecCod ,
                                 int AV28TFAlbRecCod_To ,
                                 int AV30TFCliCod ,
                                 int AV31TFCliCod_To ,
                                 String AV33TFCliNom ,
                                 String AV34TFCliNom_Sel ,
                                 String AV36TFAlbRef ,
                                 String AV37TFAlbRef_Sel ,
                                 String AV49TFAlbRefDsc ,
                                 String AV50TFAlbRefDsc_Sel ,
                                 GXSimpleCollection<String> AV78TFAlbRUni_Sels ,
                                 java.math.BigDecimal AV61TFAlbRUniEnt ,
                                 java.math.BigDecimal AV62TFAlbRUniEnt_To ,
                                 java.math.BigDecimal AV52TFAlbRUniDis ,
                                 java.math.BigDecimal AV53TFAlbRUniDis_To ,
                                 int AV64TFAlbRPieEnt ,
                                 int AV65TFAlbRPieEnt_To ,
                                 int AV58TFAlbRPieDis ,
                                 int AV59TFAlbRPieDis_To ,
                                 GXSimpleCollection<Byte> AV69TFAlbREst_Sels ,
                                 String AV114Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20IK2 ();
      GRID_nCurrentRecord = 0 ;
      rfIK2( ) ;
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
      if ( cmbavAlbrest.getItemCount() > 0 )
      {
         AV70AlbREst = (byte)(GXutil.lval( cmbavAlbrest.getValidValue(GXutil.trim( GXutil.str( AV70AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70AlbREst", GXutil.str( AV70AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbrest.setValue( GXutil.trim( GXutil.str( AV70AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrest.getInternalname(), "Values", cmbavAlbrest.ToJavascriptSource(), true);
      }
      if ( cmbavClinomoperator.getItemCount() > 0 )
      {
         AV71CliNomOperator = (short)(GXutil.lval( cmbavClinomoperator.getValidValue(GXutil.trim( GXutil.str( AV71CliNomOperator, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71CliNomOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliNomOperator), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavClinomoperator.setValue( GXutil.trim( GXutil.str( AV71CliNomOperator, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavClinomoperator.getInternalname(), "Values", cmbavClinomoperator.ToJavascriptSource(), true);
      }
      if ( cmbavAlbrefoperator.getItemCount() > 0 )
      {
         AV73AlbRefOperator = (short)(GXutil.lval( cmbavAlbrefoperator.getValidValue(GXutil.trim( GXutil.str( AV73AlbRefOperator, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRefOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbRefOperator), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbrefoperator.setValue( GXutil.trim( GXutil.str( AV73AlbRefOperator, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrefoperator.getInternalname(), "Values", cmbavAlbrefoperator.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfIK2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV114Pgmname = "WebWpALBREC" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV87Webwpalbrecds_1_filterfulltext = AV76FilterFullText ;
      AV88Webwpalbrecds_2_albrfen = AV15AlbRFen ;
      AV89Webwpalbrecds_3_albrfen_to = AV66AlbRFen_To ;
      AV90Webwpalbrecds_4_albrest = AV70AlbREst ;
      AV91Webwpalbrecds_5_clinom = AV72CliNom ;
      AV92Webwpalbrecds_6_albref = AV74AlbRef ;
      AV93Webwpalbrecds_7_tfalbrfen = AV44TFAlbRFen ;
      AV94Webwpalbrecds_8_tfalbreccod = AV27TFAlbRecCod ;
      AV95Webwpalbrecds_9_tfalbreccod_to = AV28TFAlbRecCod_To ;
      AV96Webwpalbrecds_10_tfclicod = AV30TFCliCod ;
      AV97Webwpalbrecds_11_tfclicod_to = AV31TFCliCod_To ;
      AV98Webwpalbrecds_12_tfclinom = AV33TFCliNom ;
      AV99Webwpalbrecds_13_tfclinom_sel = AV34TFCliNom_Sel ;
      AV100Webwpalbrecds_14_tfalbref = AV36TFAlbRef ;
      AV101Webwpalbrecds_15_tfalbref_sel = AV37TFAlbRef_Sel ;
      AV102Webwpalbrecds_16_tfalbrefdsc = AV49TFAlbRefDsc ;
      AV103Webwpalbrecds_17_tfalbrefdsc_sel = AV50TFAlbRefDsc_Sel ;
      AV104Webwpalbrecds_18_tfalbruni_sels = AV78TFAlbRUni_Sels ;
      AV105Webwpalbrecds_19_tfalbrunient = AV61TFAlbRUniEnt ;
      AV106Webwpalbrecds_20_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV107Webwpalbrecds_21_tfalbrunidis = AV52TFAlbRUniDis ;
      AV108Webwpalbrecds_22_tfalbrunidis_to = AV53TFAlbRUniDis_To ;
      AV109Webwpalbrecds_23_tfalbrpieent = AV64TFAlbRPieEnt ;
      AV110Webwpalbrecds_24_tfalbrpieent_to = AV65TFAlbRPieEnt_To ;
      AV111Webwpalbrecds_25_tfalbrpiedis = AV58TFAlbRPieDis ;
      AV112Webwpalbrecds_26_tfalbrpiedis_to = AV59TFAlbRPieDis_To ;
      AV113Webwpalbrecds_27_tfalbrest_sels = AV69TFAlbREst_Sels ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV104Webwpalbrecds_18_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV113Webwpalbrecds_27_tfalbrest_sels ,
                                           AV88Webwpalbrecds_2_albrfen ,
                                           AV89Webwpalbrecds_3_albrfen_to ,
                                           Short.valueOf(AV71CliNomOperator) ,
                                           AV91Webwpalbrecds_5_clinom ,
                                           Short.valueOf(AV73AlbRefOperator) ,
                                           AV92Webwpalbrecds_6_albref ,
                                           AV93Webwpalbrecds_7_tfalbrfen ,
                                           Integer.valueOf(AV94Webwpalbrecds_8_tfalbreccod) ,
                                           Integer.valueOf(AV95Webwpalbrecds_9_tfalbreccod_to) ,
                                           Integer.valueOf(AV96Webwpalbrecds_10_tfclicod) ,
                                           Integer.valueOf(AV97Webwpalbrecds_11_tfclicod_to) ,
                                           AV99Webwpalbrecds_13_tfclinom_sel ,
                                           AV98Webwpalbrecds_12_tfclinom ,
                                           AV101Webwpalbrecds_15_tfalbref_sel ,
                                           AV100Webwpalbrecds_14_tfalbref ,
                                           AV103Webwpalbrecds_17_tfalbrefdsc_sel ,
                                           AV102Webwpalbrecds_16_tfalbrefdsc ,
                                           Integer.valueOf(AV104Webwpalbrecds_18_tfalbruni_sels.size()) ,
                                           AV105Webwpalbrecds_19_tfalbrunient ,
                                           AV106Webwpalbrecds_20_tfalbrunient_to ,
                                           AV107Webwpalbrecds_21_tfalbrunidis ,
                                           AV108Webwpalbrecds_22_tfalbrunidis_to ,
                                           Integer.valueOf(AV109Webwpalbrecds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV110Webwpalbrecds_24_tfalbrpieent_to) ,
                                           Integer.valueOf(AV111Webwpalbrecds_25_tfalbrpiedis) ,
                                           Integer.valueOf(AV112Webwpalbrecds_26_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV113Webwpalbrecds_27_tfalbrest_sels.size()) ,
                                           A49AlbRFen ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A3613AlbRefDsc ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV87Webwpalbrecds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           Byte.valueOf(AV90Webwpalbrecds_4_albrest) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      lV91Webwpalbrecds_5_clinom = GXutil.padr( GXutil.rtrim( AV91Webwpalbrecds_5_clinom), 30, "%") ;
      lV92Webwpalbrecds_6_albref = GXutil.padr( GXutil.rtrim( AV92Webwpalbrecds_6_albref), 16, "%") ;
      lV98Webwpalbrecds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV98Webwpalbrecds_12_tfclinom), 30, "%") ;
      lV100Webwpalbrecds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV100Webwpalbrecds_14_tfalbref), 16, "%") ;
      lV102Webwpalbrecds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV102Webwpalbrecds_16_tfalbrefdsc), 26, "%") ;
      /* Using cursor H00IK2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV90Webwpalbrecds_4_albrest), Byte.valueOf(AV90Webwpalbrecds_4_albrest), AV88Webwpalbrecds_2_albrfen, AV89Webwpalbrecds_3_albrfen_to, lV91Webwpalbrecds_5_clinom, lV92Webwpalbrecds_6_albref, AV93Webwpalbrecds_7_tfalbrfen, Integer.valueOf(AV94Webwpalbrecds_8_tfalbreccod), Integer.valueOf(AV95Webwpalbrecds_9_tfalbreccod_to), Integer.valueOf(AV96Webwpalbrecds_10_tfclicod), Integer.valueOf(AV97Webwpalbrecds_11_tfclicod_to), lV98Webwpalbrecds_12_tfclinom, AV99Webwpalbrecds_13_tfclinom_sel, lV100Webwpalbrecds_14_tfalbref, AV101Webwpalbrecds_15_tfalbref_sel, lV102Webwpalbrecds_16_tfalbrefdsc, AV103Webwpalbrecds_17_tfalbrefdsc_sel, AV105Webwpalbrecds_19_tfalbrunient, AV106Webwpalbrecds_20_tfalbrunient_to, AV107Webwpalbrecds_21_tfalbrunidis, AV108Webwpalbrecds_22_tfalbrunidis_to, Integer.valueOf(AV109Webwpalbrecds_23_tfalbrpieent), Integer.valueOf(AV110Webwpalbrecds_24_tfalbrpieent_to), Integer.valueOf(AV111Webwpalbrecds_25_tfalbrpiedis), Integer.valueOf(AV112Webwpalbrecds_26_tfalbrpiedis_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H00IK2_A396EmprCod[0] ;
         A47AlbREst = H00IK2_A47AlbREst[0] ;
         A51AlbRPieDis = H00IK2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = H00IK2_A57AlbRUniDis[0] ;
         A56AlbRUni = H00IK2_A56AlbRUni[0] ;
         A3613AlbRefDsc = H00IK2_A3613AlbRefDsc[0] ;
         A45AlbRef = H00IK2_A45AlbRef[0] ;
         A279CliNom = H00IK2_A279CliNom[0] ;
         A252CliCod = H00IK2_A252CliCod[0] ;
         A44AlbRecCod = H00IK2_A44AlbRecCod[0] ;
         A49AlbRFen = H00IK2_A49AlbRFen[0] ;
         A52AlbRPieEnt = H00IK2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = H00IK2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = H00IK2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = H00IK2_A60AlbRUniUti[0] ;
         A279CliNom = H00IK2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV87Webwpalbrecds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "k", "") , GXutil.padr( "%" + GXutil.lower( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "m", "") , GXutil.padr( "%" + GXutil.lower( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "abierta", "") , GXutil.padr( "%" + GXutil.lower( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( "cerrada", "") , GXutil.padr( "%" + GXutil.lower( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) ) )
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

   public void rfIK2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(69) ;
      /* Execute user event: Refresh */
      e20IK2 ();
      nGXsfl_69_idx = 1 ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_692( ) ;
      bGXsfl_69_Refreshing = true ;
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
            if ( GXutil.len( WebComp_Wcwcdetallepiezas_Component) != 0 )
            {
               WebComp_Wcwcdetallepiezas.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_692( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A56AlbRUni ,
                                              AV104Webwpalbrecds_18_tfalbruni_sels ,
                                              Byte.valueOf(A47AlbREst) ,
                                              AV113Webwpalbrecds_27_tfalbrest_sels ,
                                              AV88Webwpalbrecds_2_albrfen ,
                                              AV89Webwpalbrecds_3_albrfen_to ,
                                              Short.valueOf(AV71CliNomOperator) ,
                                              AV91Webwpalbrecds_5_clinom ,
                                              Short.valueOf(AV73AlbRefOperator) ,
                                              AV92Webwpalbrecds_6_albref ,
                                              AV93Webwpalbrecds_7_tfalbrfen ,
                                              Integer.valueOf(AV94Webwpalbrecds_8_tfalbreccod) ,
                                              Integer.valueOf(AV95Webwpalbrecds_9_tfalbreccod_to) ,
                                              Integer.valueOf(AV96Webwpalbrecds_10_tfclicod) ,
                                              Integer.valueOf(AV97Webwpalbrecds_11_tfclicod_to) ,
                                              AV99Webwpalbrecds_13_tfclinom_sel ,
                                              AV98Webwpalbrecds_12_tfclinom ,
                                              AV101Webwpalbrecds_15_tfalbref_sel ,
                                              AV100Webwpalbrecds_14_tfalbref ,
                                              AV103Webwpalbrecds_17_tfalbrefdsc_sel ,
                                              AV102Webwpalbrecds_16_tfalbrefdsc ,
                                              Integer.valueOf(AV104Webwpalbrecds_18_tfalbruni_sels.size()) ,
                                              AV105Webwpalbrecds_19_tfalbrunient ,
                                              AV106Webwpalbrecds_20_tfalbrunient_to ,
                                              AV107Webwpalbrecds_21_tfalbrunidis ,
                                              AV108Webwpalbrecds_22_tfalbrunidis_to ,
                                              Integer.valueOf(AV109Webwpalbrecds_23_tfalbrpieent) ,
                                              Integer.valueOf(AV110Webwpalbrecds_24_tfalbrpieent_to) ,
                                              Integer.valueOf(AV111Webwpalbrecds_25_tfalbrpiedis) ,
                                              Integer.valueOf(AV112Webwpalbrecds_26_tfalbrpiedis_to) ,
                                              Integer.valueOf(AV113Webwpalbrecds_27_tfalbrest_sels.size()) ,
                                              A49AlbRFen ,
                                              A279CliNom ,
                                              A45AlbRef ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A3613AlbRefDsc ,
                                              A58AlbRUniEnt ,
                                              A60AlbRUniUti ,
                                              Integer.valueOf(A52AlbRPieEnt) ,
                                              Integer.valueOf(A54AlbRPieUti) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV87Webwpalbrecds_1_filterfulltext ,
                                              A57AlbRUniDis ,
                                              Integer.valueOf(A51AlbRPieDis) ,
                                              Byte.valueOf(AV90Webwpalbrecds_4_albrest) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE
                                              }
         });
         lV91Webwpalbrecds_5_clinom = GXutil.padr( GXutil.rtrim( AV91Webwpalbrecds_5_clinom), 30, "%") ;
         lV92Webwpalbrecds_6_albref = GXutil.padr( GXutil.rtrim( AV92Webwpalbrecds_6_albref), 16, "%") ;
         lV98Webwpalbrecds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV98Webwpalbrecds_12_tfclinom), 30, "%") ;
         lV100Webwpalbrecds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV100Webwpalbrecds_14_tfalbref), 16, "%") ;
         lV102Webwpalbrecds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV102Webwpalbrecds_16_tfalbrefdsc), 26, "%") ;
         /* Using cursor H00IK3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(AV90Webwpalbrecds_4_albrest), Byte.valueOf(AV90Webwpalbrecds_4_albrest), AV88Webwpalbrecds_2_albrfen, AV89Webwpalbrecds_3_albrfen_to, lV91Webwpalbrecds_5_clinom, lV92Webwpalbrecds_6_albref, AV93Webwpalbrecds_7_tfalbrfen, Integer.valueOf(AV94Webwpalbrecds_8_tfalbreccod), Integer.valueOf(AV95Webwpalbrecds_9_tfalbreccod_to), Integer.valueOf(AV96Webwpalbrecds_10_tfclicod), Integer.valueOf(AV97Webwpalbrecds_11_tfclicod_to), lV98Webwpalbrecds_12_tfclinom, AV99Webwpalbrecds_13_tfclinom_sel, lV100Webwpalbrecds_14_tfalbref, AV101Webwpalbrecds_15_tfalbref_sel, lV102Webwpalbrecds_16_tfalbrefdsc, AV103Webwpalbrecds_17_tfalbrefdsc_sel, AV105Webwpalbrecds_19_tfalbrunient, AV106Webwpalbrecds_20_tfalbrunient_to, AV107Webwpalbrecds_21_tfalbrunidis, AV108Webwpalbrecds_22_tfalbrunidis_to, Integer.valueOf(AV109Webwpalbrecds_23_tfalbrpieent), Integer.valueOf(AV110Webwpalbrecds_24_tfalbrpieent_to), Integer.valueOf(AV111Webwpalbrecds_25_tfalbrpiedis), Integer.valueOf(AV112Webwpalbrecds_26_tfalbrpiedis_to)});
         nGXsfl_69_idx = 1 ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00IK3_A396EmprCod[0] ;
            A47AlbREst = H00IK3_A47AlbREst[0] ;
            A51AlbRPieDis = H00IK3_A51AlbRPieDis[0] ;
            A57AlbRUniDis = H00IK3_A57AlbRUniDis[0] ;
            A56AlbRUni = H00IK3_A56AlbRUni[0] ;
            A3613AlbRefDsc = H00IK3_A3613AlbRefDsc[0] ;
            A45AlbRef = H00IK3_A45AlbRef[0] ;
            A279CliNom = H00IK3_A279CliNom[0] ;
            A252CliCod = H00IK3_A252CliCod[0] ;
            A44AlbRecCod = H00IK3_A44AlbRecCod[0] ;
            A49AlbRFen = H00IK3_A49AlbRFen[0] ;
            A52AlbRPieEnt = H00IK3_A52AlbRPieEnt[0] ;
            A54AlbRPieUti = H00IK3_A54AlbRPieUti[0] ;
            A58AlbRUniEnt = H00IK3_A58AlbRUniEnt[0] ;
            A60AlbRUniUti = H00IK3_A60AlbRUniUti[0] ;
            A279CliNom = H00IK3_A279CliNom[0] ;
            if ( (GXutil.strcmp("", AV87Webwpalbrecds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "k", "") , GXutil.padr( "%" + GXutil.lower( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "m", "") , GXutil.padr( "%" + GXutil.lower( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV87Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "abierta", "") , GXutil.padr( "%" + GXutil.lower( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( "cerrada", "") , GXutil.padr( "%" + GXutil.lower( AV87Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) ) )
            {
               e21IK2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(69) ;
         wbIK0( ) ;
      }
      bGXsfl_69_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesIK2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV114Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV114Pgmname, ""))));
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
      AV87Webwpalbrecds_1_filterfulltext = AV76FilterFullText ;
      AV88Webwpalbrecds_2_albrfen = AV15AlbRFen ;
      AV89Webwpalbrecds_3_albrfen_to = AV66AlbRFen_To ;
      AV90Webwpalbrecds_4_albrest = AV70AlbREst ;
      AV91Webwpalbrecds_5_clinom = AV72CliNom ;
      AV92Webwpalbrecds_6_albref = AV74AlbRef ;
      AV93Webwpalbrecds_7_tfalbrfen = AV44TFAlbRFen ;
      AV94Webwpalbrecds_8_tfalbreccod = AV27TFAlbRecCod ;
      AV95Webwpalbrecds_9_tfalbreccod_to = AV28TFAlbRecCod_To ;
      AV96Webwpalbrecds_10_tfclicod = AV30TFCliCod ;
      AV97Webwpalbrecds_11_tfclicod_to = AV31TFCliCod_To ;
      AV98Webwpalbrecds_12_tfclinom = AV33TFCliNom ;
      AV99Webwpalbrecds_13_tfclinom_sel = AV34TFCliNom_Sel ;
      AV100Webwpalbrecds_14_tfalbref = AV36TFAlbRef ;
      AV101Webwpalbrecds_15_tfalbref_sel = AV37TFAlbRef_Sel ;
      AV102Webwpalbrecds_16_tfalbrefdsc = AV49TFAlbRefDsc ;
      AV103Webwpalbrecds_17_tfalbrefdsc_sel = AV50TFAlbRefDsc_Sel ;
      AV104Webwpalbrecds_18_tfalbruni_sels = AV78TFAlbRUni_Sels ;
      AV105Webwpalbrecds_19_tfalbrunient = AV61TFAlbRUniEnt ;
      AV106Webwpalbrecds_20_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV107Webwpalbrecds_21_tfalbrunidis = AV52TFAlbRUniDis ;
      AV108Webwpalbrecds_22_tfalbrunidis_to = AV53TFAlbRUniDis_To ;
      AV109Webwpalbrecds_23_tfalbrpieent = AV64TFAlbRPieEnt ;
      AV110Webwpalbrecds_24_tfalbrpieent_to = AV65TFAlbRPieEnt_To ;
      AV111Webwpalbrecds_25_tfalbrpiedis = AV58TFAlbRPieDis ;
      AV112Webwpalbrecds_26_tfalbrpiedis_to = AV59TFAlbRPieDis_To ;
      AV113Webwpalbrecds_27_tfalbrest_sels = AV69TFAlbREst_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV71CliNomOperator, AV72CliNom, AV73AlbRefOperator, AV74AlbRef, AV15AlbRFen, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV76FilterFullText, AV66AlbRFen_To, AV70AlbREst, AV44TFAlbRFen, AV27TFAlbRecCod, AV28TFAlbRecCod_To, AV30TFCliCod, AV31TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV36TFAlbRef, AV37TFAlbRef_Sel, AV49TFAlbRefDsc, AV50TFAlbRefDsc_Sel, AV78TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV52TFAlbRUniDis, AV53TFAlbRUniDis_To, AV64TFAlbRPieEnt, AV65TFAlbRPieEnt_To, AV58TFAlbRPieDis, AV59TFAlbRPieDis_To, AV69TFAlbREst_Sels, AV114Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV87Webwpalbrecds_1_filterfulltext = AV76FilterFullText ;
      AV88Webwpalbrecds_2_albrfen = AV15AlbRFen ;
      AV89Webwpalbrecds_3_albrfen_to = AV66AlbRFen_To ;
      AV90Webwpalbrecds_4_albrest = AV70AlbREst ;
      AV91Webwpalbrecds_5_clinom = AV72CliNom ;
      AV92Webwpalbrecds_6_albref = AV74AlbRef ;
      AV93Webwpalbrecds_7_tfalbrfen = AV44TFAlbRFen ;
      AV94Webwpalbrecds_8_tfalbreccod = AV27TFAlbRecCod ;
      AV95Webwpalbrecds_9_tfalbreccod_to = AV28TFAlbRecCod_To ;
      AV96Webwpalbrecds_10_tfclicod = AV30TFCliCod ;
      AV97Webwpalbrecds_11_tfclicod_to = AV31TFCliCod_To ;
      AV98Webwpalbrecds_12_tfclinom = AV33TFCliNom ;
      AV99Webwpalbrecds_13_tfclinom_sel = AV34TFCliNom_Sel ;
      AV100Webwpalbrecds_14_tfalbref = AV36TFAlbRef ;
      AV101Webwpalbrecds_15_tfalbref_sel = AV37TFAlbRef_Sel ;
      AV102Webwpalbrecds_16_tfalbrefdsc = AV49TFAlbRefDsc ;
      AV103Webwpalbrecds_17_tfalbrefdsc_sel = AV50TFAlbRefDsc_Sel ;
      AV104Webwpalbrecds_18_tfalbruni_sels = AV78TFAlbRUni_Sels ;
      AV105Webwpalbrecds_19_tfalbrunient = AV61TFAlbRUniEnt ;
      AV106Webwpalbrecds_20_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV107Webwpalbrecds_21_tfalbrunidis = AV52TFAlbRUniDis ;
      AV108Webwpalbrecds_22_tfalbrunidis_to = AV53TFAlbRUniDis_To ;
      AV109Webwpalbrecds_23_tfalbrpieent = AV64TFAlbRPieEnt ;
      AV110Webwpalbrecds_24_tfalbrpieent_to = AV65TFAlbRPieEnt_To ;
      AV111Webwpalbrecds_25_tfalbrpiedis = AV58TFAlbRPieDis ;
      AV112Webwpalbrecds_26_tfalbrpiedis_to = AV59TFAlbRPieDis_To ;
      AV113Webwpalbrecds_27_tfalbrest_sels = AV69TFAlbREst_Sels ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV71CliNomOperator, AV72CliNom, AV73AlbRefOperator, AV74AlbRef, AV15AlbRFen, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV76FilterFullText, AV66AlbRFen_To, AV70AlbREst, AV44TFAlbRFen, AV27TFAlbRecCod, AV28TFAlbRecCod_To, AV30TFCliCod, AV31TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV36TFAlbRef, AV37TFAlbRef_Sel, AV49TFAlbRefDsc, AV50TFAlbRefDsc_Sel, AV78TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV52TFAlbRUniDis, AV53TFAlbRUniDis_To, AV64TFAlbRPieEnt, AV65TFAlbRPieEnt_To, AV58TFAlbRPieDis, AV59TFAlbRPieDis_To, AV69TFAlbREst_Sels, AV114Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV87Webwpalbrecds_1_filterfulltext = AV76FilterFullText ;
      AV88Webwpalbrecds_2_albrfen = AV15AlbRFen ;
      AV89Webwpalbrecds_3_albrfen_to = AV66AlbRFen_To ;
      AV90Webwpalbrecds_4_albrest = AV70AlbREst ;
      AV91Webwpalbrecds_5_clinom = AV72CliNom ;
      AV92Webwpalbrecds_6_albref = AV74AlbRef ;
      AV93Webwpalbrecds_7_tfalbrfen = AV44TFAlbRFen ;
      AV94Webwpalbrecds_8_tfalbreccod = AV27TFAlbRecCod ;
      AV95Webwpalbrecds_9_tfalbreccod_to = AV28TFAlbRecCod_To ;
      AV96Webwpalbrecds_10_tfclicod = AV30TFCliCod ;
      AV97Webwpalbrecds_11_tfclicod_to = AV31TFCliCod_To ;
      AV98Webwpalbrecds_12_tfclinom = AV33TFCliNom ;
      AV99Webwpalbrecds_13_tfclinom_sel = AV34TFCliNom_Sel ;
      AV100Webwpalbrecds_14_tfalbref = AV36TFAlbRef ;
      AV101Webwpalbrecds_15_tfalbref_sel = AV37TFAlbRef_Sel ;
      AV102Webwpalbrecds_16_tfalbrefdsc = AV49TFAlbRefDsc ;
      AV103Webwpalbrecds_17_tfalbrefdsc_sel = AV50TFAlbRefDsc_Sel ;
      AV104Webwpalbrecds_18_tfalbruni_sels = AV78TFAlbRUni_Sels ;
      AV105Webwpalbrecds_19_tfalbrunient = AV61TFAlbRUniEnt ;
      AV106Webwpalbrecds_20_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV107Webwpalbrecds_21_tfalbrunidis = AV52TFAlbRUniDis ;
      AV108Webwpalbrecds_22_tfalbrunidis_to = AV53TFAlbRUniDis_To ;
      AV109Webwpalbrecds_23_tfalbrpieent = AV64TFAlbRPieEnt ;
      AV110Webwpalbrecds_24_tfalbrpieent_to = AV65TFAlbRPieEnt_To ;
      AV111Webwpalbrecds_25_tfalbrpiedis = AV58TFAlbRPieDis ;
      AV112Webwpalbrecds_26_tfalbrpiedis_to = AV59TFAlbRPieDis_To ;
      AV113Webwpalbrecds_27_tfalbrest_sels = AV69TFAlbREst_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV71CliNomOperator, AV72CliNom, AV73AlbRefOperator, AV74AlbRef, AV15AlbRFen, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV76FilterFullText, AV66AlbRFen_To, AV70AlbREst, AV44TFAlbRFen, AV27TFAlbRecCod, AV28TFAlbRecCod_To, AV30TFCliCod, AV31TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV36TFAlbRef, AV37TFAlbRef_Sel, AV49TFAlbRefDsc, AV50TFAlbRefDsc_Sel, AV78TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV52TFAlbRUniDis, AV53TFAlbRUniDis_To, AV64TFAlbRPieEnt, AV65TFAlbRPieEnt_To, AV58TFAlbRPieDis, AV59TFAlbRPieDis_To, AV69TFAlbREst_Sels, AV114Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV87Webwpalbrecds_1_filterfulltext = AV76FilterFullText ;
      AV88Webwpalbrecds_2_albrfen = AV15AlbRFen ;
      AV89Webwpalbrecds_3_albrfen_to = AV66AlbRFen_To ;
      AV90Webwpalbrecds_4_albrest = AV70AlbREst ;
      AV91Webwpalbrecds_5_clinom = AV72CliNom ;
      AV92Webwpalbrecds_6_albref = AV74AlbRef ;
      AV93Webwpalbrecds_7_tfalbrfen = AV44TFAlbRFen ;
      AV94Webwpalbrecds_8_tfalbreccod = AV27TFAlbRecCod ;
      AV95Webwpalbrecds_9_tfalbreccod_to = AV28TFAlbRecCod_To ;
      AV96Webwpalbrecds_10_tfclicod = AV30TFCliCod ;
      AV97Webwpalbrecds_11_tfclicod_to = AV31TFCliCod_To ;
      AV98Webwpalbrecds_12_tfclinom = AV33TFCliNom ;
      AV99Webwpalbrecds_13_tfclinom_sel = AV34TFCliNom_Sel ;
      AV100Webwpalbrecds_14_tfalbref = AV36TFAlbRef ;
      AV101Webwpalbrecds_15_tfalbref_sel = AV37TFAlbRef_Sel ;
      AV102Webwpalbrecds_16_tfalbrefdsc = AV49TFAlbRefDsc ;
      AV103Webwpalbrecds_17_tfalbrefdsc_sel = AV50TFAlbRefDsc_Sel ;
      AV104Webwpalbrecds_18_tfalbruni_sels = AV78TFAlbRUni_Sels ;
      AV105Webwpalbrecds_19_tfalbrunient = AV61TFAlbRUniEnt ;
      AV106Webwpalbrecds_20_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV107Webwpalbrecds_21_tfalbrunidis = AV52TFAlbRUniDis ;
      AV108Webwpalbrecds_22_tfalbrunidis_to = AV53TFAlbRUniDis_To ;
      AV109Webwpalbrecds_23_tfalbrpieent = AV64TFAlbRPieEnt ;
      AV110Webwpalbrecds_24_tfalbrpieent_to = AV65TFAlbRPieEnt_To ;
      AV111Webwpalbrecds_25_tfalbrpiedis = AV58TFAlbRPieDis ;
      AV112Webwpalbrecds_26_tfalbrpiedis_to = AV59TFAlbRPieDis_To ;
      AV113Webwpalbrecds_27_tfalbrest_sels = AV69TFAlbREst_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV71CliNomOperator, AV72CliNom, AV73AlbRefOperator, AV74AlbRef, AV15AlbRFen, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV76FilterFullText, AV66AlbRFen_To, AV70AlbREst, AV44TFAlbRFen, AV27TFAlbRecCod, AV28TFAlbRecCod_To, AV30TFCliCod, AV31TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV36TFAlbRef, AV37TFAlbRef_Sel, AV49TFAlbRefDsc, AV50TFAlbRefDsc_Sel, AV78TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV52TFAlbRUniDis, AV53TFAlbRUniDis_To, AV64TFAlbRPieEnt, AV65TFAlbRPieEnt_To, AV58TFAlbRPieDis, AV59TFAlbRPieDis_To, AV69TFAlbREst_Sels, AV114Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV87Webwpalbrecds_1_filterfulltext = AV76FilterFullText ;
      AV88Webwpalbrecds_2_albrfen = AV15AlbRFen ;
      AV89Webwpalbrecds_3_albrfen_to = AV66AlbRFen_To ;
      AV90Webwpalbrecds_4_albrest = AV70AlbREst ;
      AV91Webwpalbrecds_5_clinom = AV72CliNom ;
      AV92Webwpalbrecds_6_albref = AV74AlbRef ;
      AV93Webwpalbrecds_7_tfalbrfen = AV44TFAlbRFen ;
      AV94Webwpalbrecds_8_tfalbreccod = AV27TFAlbRecCod ;
      AV95Webwpalbrecds_9_tfalbreccod_to = AV28TFAlbRecCod_To ;
      AV96Webwpalbrecds_10_tfclicod = AV30TFCliCod ;
      AV97Webwpalbrecds_11_tfclicod_to = AV31TFCliCod_To ;
      AV98Webwpalbrecds_12_tfclinom = AV33TFCliNom ;
      AV99Webwpalbrecds_13_tfclinom_sel = AV34TFCliNom_Sel ;
      AV100Webwpalbrecds_14_tfalbref = AV36TFAlbRef ;
      AV101Webwpalbrecds_15_tfalbref_sel = AV37TFAlbRef_Sel ;
      AV102Webwpalbrecds_16_tfalbrefdsc = AV49TFAlbRefDsc ;
      AV103Webwpalbrecds_17_tfalbrefdsc_sel = AV50TFAlbRefDsc_Sel ;
      AV104Webwpalbrecds_18_tfalbruni_sels = AV78TFAlbRUni_Sels ;
      AV105Webwpalbrecds_19_tfalbrunient = AV61TFAlbRUniEnt ;
      AV106Webwpalbrecds_20_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV107Webwpalbrecds_21_tfalbrunidis = AV52TFAlbRUniDis ;
      AV108Webwpalbrecds_22_tfalbrunidis_to = AV53TFAlbRUniDis_To ;
      AV109Webwpalbrecds_23_tfalbrpieent = AV64TFAlbRPieEnt ;
      AV110Webwpalbrecds_24_tfalbrpieent_to = AV65TFAlbRPieEnt_To ;
      AV111Webwpalbrecds_25_tfalbrpiedis = AV58TFAlbRPieDis ;
      AV112Webwpalbrecds_26_tfalbrpiedis_to = AV59TFAlbRPieDis_To ;
      AV113Webwpalbrecds_27_tfalbrest_sels = AV69TFAlbREst_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV71CliNomOperator, AV72CliNom, AV73AlbRefOperator, AV74AlbRef, AV15AlbRFen, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV76FilterFullText, AV66AlbRFen_To, AV70AlbREst, AV44TFAlbRFen, AV27TFAlbRecCod, AV28TFAlbRecCod_To, AV30TFCliCod, AV31TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV36TFAlbRef, AV37TFAlbRef_Sel, AV49TFAlbRefDsc, AV50TFAlbRefDsc_Sel, AV78TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV52TFAlbRUniDis, AV53TFAlbRUniDis_To, AV64TFAlbRPieEnt, AV65TFAlbRPieEnt_To, AV58TFAlbRPieDis, AV59TFAlbRPieDis_To, AV69TFAlbREst_Sels, AV114Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV114Pgmname = "WebWpALBREC" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupIK0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19IK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV39DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_69 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_69"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV41GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV42GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV15AlbRFen = localUtil.ctod( httpContext.cgiGet( "vALBRFEN"), 0) ;
         AV66AlbRFen_To = localUtil.ctod( httpContext.cgiGet( "vALBRFEN_TO"), 0) ;
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
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         AV76FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76FilterFullText", AV76FilterFullText);
         AV80AlbRFen_RangeText = httpContext.cgiGet( edtavAlbrfen_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80AlbRFen_RangeText", AV80AlbRFen_RangeText);
         cmbavAlbrest.setName( cmbavAlbrest.getInternalname() );
         cmbavAlbrest.setValue( httpContext.cgiGet( cmbavAlbrest.getInternalname()) );
         AV70AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAlbrest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70AlbREst", GXutil.str( AV70AlbREst, 1, 0));
         cmbavClinomoperator.setName( cmbavClinomoperator.getInternalname() );
         cmbavClinomoperator.setValue( httpContext.cgiGet( cmbavClinomoperator.getInternalname()) );
         AV71CliNomOperator = (short)(GXutil.lval( httpContext.cgiGet( cmbavClinomoperator.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71CliNomOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliNomOperator), 4, 0));
         AV72CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72CliNom", AV72CliNom);
         cmbavAlbrefoperator.setName( cmbavAlbrefoperator.getInternalname() );
         cmbavAlbrefoperator.setValue( httpContext.cgiGet( cmbavAlbrefoperator.getInternalname()) );
         AV73AlbRefOperator = (short)(GXutil.lval( httpContext.cgiGet( cmbavAlbrefoperator.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRefOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbRefOperator), 4, 0));
         AV74AlbRef = httpContext.cgiGet( edtavAlbref_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74AlbRef", AV74AlbRef);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albrfenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBRFENAUXDATE");
            GX_FocusControl = edtavDdo_albrfenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46DDO_AlbRFenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46DDO_AlbRFenAuxDate", localUtil.format(AV46DDO_AlbRFenAuxDate, "99/99/99"));
         }
         else
         {
            AV46DDO_AlbRFenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albrfenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46DDO_AlbRFenAuxDate", localUtil.format(AV46DDO_AlbRFenAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_69_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
         if ( nGXsfl_69_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV79GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GridActions), 4, 0));
            A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            cmbAlbREst.setName( cmbAlbREst.getInternalname() );
            cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
            A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLINOMOPERATOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV71CliNomOperator )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLINOM"), AV72CliNom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBREFOPERATOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV73AlbRefOperator )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBREF"), AV74AlbRef) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBRFEN"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV15AlbRFen)) ) )
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
      e19IK2 ();
      if (returnInSub) return;
   }

   public void e19IK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV15AlbRFen = GXutil.resetTime(GXutil.now( )) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRFen", localUtil.format(AV15AlbRFen, "99/99/99"));
      GXt_char1 = AV83Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwpalbrec_impl.this.GXt_char1 = GXv_char2[0] ;
      AV83Station = GXt_char1 ;
      GXv_char2[0] = AV84Emprcod ;
      GXv_char3[0] = AV85Emprnom ;
      GXv_char4[0] = AV86Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV83Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwpalbrec_impl.this.AV84Emprcod = GXv_char2[0] ;
      webwpalbrec_impl.this.AV85Emprnom = GXv_char3[0] ;
      webwpalbrec_impl.this.AV86Usurcod = GXv_char4[0] ;
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
      this.executeUsercontrolMethod("", false, "ALBRFEN_RANGEPICKERContainer", "Attach", "", new Object[] {edtavAlbrfen_rangetext_Internalname});
      AV70AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70AlbREst", GXutil.str( AV70AlbREst, 1, 0));
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Consulta Almacen de Tela (con detalle de rollos)", "") );
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
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcdetallepiezas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcdetallepiezas_Component), GXutil.lower( "WCDetallePiezas")) != 0 )
      {
         WebComp_Wcwcdetallepiezas = WebUtils.getWebComponent(getClass(), "app.wcdetallepiezas_impl", remoteHandle, context);
         WebComp_Wcwcdetallepiezas_Component = "WCDetallePiezas" ;
      }
      if ( GXutil.len( WebComp_Wcwcdetallepiezas_Component) != 0 )
      {
         WebComp_Wcwcdetallepiezas.setjustcreated();
         WebComp_Wcwcdetallepiezas.componentprepare(new Object[] {"W0092","",A396EmprCod,Integer.valueOf(A44AlbRecCod)});
         WebComp_Wcwcdetallepiezas.componentbind(new Object[] {"",""});
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV39DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV39DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20IK2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("WebWpALBRECColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("WebWpALBRECColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtAlbRFen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbRecCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbRef_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbRefDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Visible), 5, 0), !bGXsfl_69_Refreshing);
      cmbAlbRUni.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbRUni.getVisible(), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbRUniEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbRUniDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbRPieEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtAlbRPieDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Visible), 5, 0), !bGXsfl_69_Refreshing);
      cmbAlbREst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbREst.getVisible(), 5, 0), !bGXsfl_69_Refreshing);
      AV41GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridCurrentPage), 10, 0));
      AV42GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridPageCount), 10, 0));
      AV87Webwpalbrecds_1_filterfulltext = AV76FilterFullText ;
      AV88Webwpalbrecds_2_albrfen = AV15AlbRFen ;
      AV89Webwpalbrecds_3_albrfen_to = AV66AlbRFen_To ;
      AV90Webwpalbrecds_4_albrest = AV70AlbREst ;
      AV91Webwpalbrecds_5_clinom = AV72CliNom ;
      AV92Webwpalbrecds_6_albref = AV74AlbRef ;
      AV93Webwpalbrecds_7_tfalbrfen = AV44TFAlbRFen ;
      AV94Webwpalbrecds_8_tfalbreccod = AV27TFAlbRecCod ;
      AV95Webwpalbrecds_9_tfalbreccod_to = AV28TFAlbRecCod_To ;
      AV96Webwpalbrecds_10_tfclicod = AV30TFCliCod ;
      AV97Webwpalbrecds_11_tfclicod_to = AV31TFCliCod_To ;
      AV98Webwpalbrecds_12_tfclinom = AV33TFCliNom ;
      AV99Webwpalbrecds_13_tfclinom_sel = AV34TFCliNom_Sel ;
      AV100Webwpalbrecds_14_tfalbref = AV36TFAlbRef ;
      AV101Webwpalbrecds_15_tfalbref_sel = AV37TFAlbRef_Sel ;
      AV102Webwpalbrecds_16_tfalbrefdsc = AV49TFAlbRefDsc ;
      AV103Webwpalbrecds_17_tfalbrefdsc_sel = AV50TFAlbRefDsc_Sel ;
      AV104Webwpalbrecds_18_tfalbruni_sels = AV78TFAlbRUni_Sels ;
      AV105Webwpalbrecds_19_tfalbrunient = AV61TFAlbRUniEnt ;
      AV106Webwpalbrecds_20_tfalbrunient_to = AV62TFAlbRUniEnt_To ;
      AV107Webwpalbrecds_21_tfalbrunidis = AV52TFAlbRUniDis ;
      AV108Webwpalbrecds_22_tfalbrunidis_to = AV53TFAlbRUniDis_To ;
      AV109Webwpalbrecds_23_tfalbrpieent = AV64TFAlbRPieEnt ;
      AV110Webwpalbrecds_24_tfalbrpieent_to = AV65TFAlbRPieEnt_To ;
      AV111Webwpalbrecds_25_tfalbrpiedis = AV58TFAlbRPieDis ;
      AV112Webwpalbrecds_26_tfalbrpiedis_to = AV59TFAlbRPieDis_To ;
      AV113Webwpalbrecds_27_tfalbrest_sels = AV69TFAlbREst_Sels ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12IK2( )
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
         AV40PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV40PageToGo) ;
      }
   }

   public void e13IK2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15IK2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRFen") == 0 )
         {
            AV44TFAlbRFen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFAlbRFen", localUtil.format(AV44TFAlbRFen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV27TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbRecCod), 8, 0));
            AV28TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV30TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod), 6, 0));
            AV31TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV33TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom", AV33TFCliNom);
            AV34TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom_Sel", AV34TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRef") == 0 )
         {
            AV36TFAlbRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbRef", AV36TFAlbRef);
            AV37TFAlbRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbRef_Sel", AV37TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRefDsc") == 0 )
         {
            AV49TFAlbRefDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbRefDsc", AV49TFAlbRefDsc);
            AV50TFAlbRefDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbRefDsc_Sel", AV50TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUni") == 0 )
         {
            AV77TFAlbRUni_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFAlbRUni_SelsJson", AV77TFAlbRUni_SelsJson);
            AV78TFAlbRUni_Sels.fromJSonString(AV77TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniEnt") == 0 )
         {
            AV61TFAlbRUniEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbRUniEnt", GXutil.ltrimstr( AV61TFAlbRUniEnt, 9, 2));
            AV62TFAlbRUniEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbRUniEnt_To", GXutil.ltrimstr( AV62TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniDis") == 0 )
         {
            AV52TFAlbRUniDis = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbRUniDis", GXutil.ltrimstr( AV52TFAlbRUniDis, 9, 2));
            AV53TFAlbRUniDis_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbRUniDis_To", GXutil.ltrimstr( AV53TFAlbRUniDis_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieEnt") == 0 )
         {
            AV64TFAlbRPieEnt = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFAlbRPieEnt), 6, 0));
            AV65TFAlbRPieEnt_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieDis") == 0 )
         {
            AV58TFAlbRPieDis = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRPieDis), 6, 0));
            AV59TFAlbRPieDis_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbRPieDis_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbREst") == 0 )
         {
            AV68TFAlbREst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFAlbREst_SelsJson", AV68TFAlbREst_SelsJson);
            AV69TFAlbREst_Sels.fromJSonString(GXutil.strReplace( AV68TFAlbREst_SelsJson, "\"", ""), null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV69TFAlbREst_Sels", AV69TFAlbREst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78TFAlbRUni_Sels", AV78TFAlbRUni_Sels);
   }

   private void e21IK2( )
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
            wbStart = (short)(69) ;
         }
         sendrow_692( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_69_Refreshing )
      {
         httpContext.doAjaxLoad(69, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV79GridActions, 4, 0)) );
   }

   public void e16IK2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebWpALBRECColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11IK2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWpALBRECFilters")),GXutil.URLEncode(GXutil.rtrim(AV114Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWpALBRECFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebWpALBRECFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webwpalbrec_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV114Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      cmbavAlbrest.setValue( GXutil.trim( GXutil.str( AV70AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrest.getInternalname(), "Values", cmbavAlbrest.ToJavascriptSource(), true);
      cmbavClinomoperator.setValue( GXutil.trim( GXutil.str( AV71CliNomOperator, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavClinomoperator.getInternalname(), "Values", cmbavClinomoperator.ToJavascriptSource(), true);
      cmbavAlbrefoperator.setValue( GXutil.trim( GXutil.str( AV73AlbRefOperator, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrefoperator.getInternalname(), "Values", cmbavAlbrefoperator.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78TFAlbRUni_Sels", AV78TFAlbRUni_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV69TFAlbREst_Sels", AV69TFAlbREst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e17IK2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.webwpalbrecexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      webwpalbrec_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      webwpalbrec_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV69TFAlbREst_Sels", AV69TFAlbREst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78TFAlbRUni_Sels", AV78TFAlbRUni_Sels);
      cmbavAlbrefoperator.setValue( GXutil.trim( GXutil.str( AV73AlbRefOperator, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrefoperator.getInternalname(), "Values", cmbavAlbrefoperator.ToJavascriptSource(), true);
      cmbavClinomoperator.setValue( GXutil.trim( GXutil.str( AV71CliNomOperator, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavClinomoperator.getInternalname(), "Values", cmbavClinomoperator.ToJavascriptSource(), true);
      cmbavAlbrest.setValue( GXutil.trim( GXutil.str( AV70AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrest.getInternalname(), "Values", cmbavAlbrest.ToJavascriptSource(), true);
   }

   public void e18IK2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webwpalbrecexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV69TFAlbREst_Sels", AV69TFAlbREst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78TFAlbRUni_Sels", AV78TFAlbRUni_Sels);
      cmbavAlbrefoperator.setValue( GXutil.trim( GXutil.str( AV73AlbRefOperator, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrefoperator.getInternalname(), "Values", cmbavAlbrefoperator.ToJavascriptSource(), true);
      cmbavClinomoperator.setValue( GXutil.trim( GXutil.str( AV71CliNomOperator, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavClinomoperator.getInternalname(), "Values", cmbavClinomoperator.ToJavascriptSource(), true);
      cmbavAlbrest.setValue( GXutil.trim( GXutil.str( AV70AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrest.getInternalname(), "Values", cmbavAlbrest.ToJavascriptSource(), true);
   }

   public void e14IK2( )
   {
      /* Albrfen_rangepicker_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRFen", localUtil.format(AV15AlbRFen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV66AlbRFen_To", localUtil.format(AV66AlbRFen_To, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV71CliNomOperator, AV72CliNom, AV73AlbRefOperator, AV74AlbRef, AV15AlbRFen, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV76FilterFullText, AV66AlbRFen_To, AV70AlbREst, AV44TFAlbRFen, AV27TFAlbRecCod, AV28TFAlbRecCod_To, AV30TFCliCod, AV31TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV36TFAlbRef, AV37TFAlbRef_Sel, AV49TFAlbRefDsc, AV50TFAlbRefDsc_Sel, AV78TFAlbRUni_Sels, AV61TFAlbRUniEnt, AV62TFAlbRUniEnt_To, AV52TFAlbRUniDis, AV53TFAlbRUniDis_To, AV64TFAlbRPieEnt, AV65TFAlbRPieEnt_To, AV58TFAlbRPieDis, AV59TFAlbRPieDis_To, AV69TFAlbREst_Sels, AV114Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRFen", "", "Fecha Entrada", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRef", "", "Codigo Referencia", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRefDsc", "", "Descripcion Referencia", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUni", "", "Und", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUniEnt", "", "Unidades Entrada", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUniDis", "", "Unidades Disponibles", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRPieEnt", "", "Piezas Entregadas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRPieDis", "", "Piezas Disponibles", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbREst", "", "Estado", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWpALBRECColumnsSelector", GXv_char4) ;
      webwpalbrec_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebWpALBRECFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV76FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76FilterFullText", AV76FilterFullText);
      AV15AlbRFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRFen", localUtil.format(AV15AlbRFen, "99/99/99"));
      AV66AlbRFen_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66AlbRFen_To", localUtil.format(AV66AlbRFen_To, "99/99/99"));
      AV70AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70AlbREst", GXutil.str( AV70AlbREst, 1, 0));
      AV71CliNomOperator = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71CliNomOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliNomOperator), 4, 0));
      AV72CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72CliNom", AV72CliNom);
      AV73AlbRefOperator = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRefOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbRefOperator), 4, 0));
      AV74AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74AlbRef", AV74AlbRef);
      AV44TFAlbRFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFAlbRFen", localUtil.format(AV44TFAlbRFen, "99/99/99"));
      AV27TFAlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbRecCod), 8, 0));
      AV28TFAlbRecCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbRecCod_To), 8, 0));
      AV30TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod), 6, 0));
      AV31TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod_To), 6, 0));
      AV33TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom", AV33TFCliNom);
      AV34TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom_Sel", AV34TFCliNom_Sel);
      AV36TFAlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbRef", AV36TFAlbRef);
      AV37TFAlbRef_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbRef_Sel", AV37TFAlbRef_Sel);
      AV49TFAlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbRefDsc", AV49TFAlbRefDsc);
      AV50TFAlbRefDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbRefDsc_Sel", AV50TFAlbRefDsc_Sel);
      AV78TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV61TFAlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbRUniEnt", GXutil.ltrimstr( AV61TFAlbRUniEnt, 9, 2));
      AV62TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbRUniEnt_To", GXutil.ltrimstr( AV62TFAlbRUniEnt_To, 9, 2));
      AV52TFAlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbRUniDis", GXutil.ltrimstr( AV52TFAlbRUniDis, 9, 2));
      AV53TFAlbRUniDis_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbRUniDis_To", GXutil.ltrimstr( AV53TFAlbRUniDis_To, 9, 2));
      AV64TFAlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFAlbRPieEnt), 6, 0));
      AV65TFAlbRPieEnt_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFAlbRPieEnt_To), 6, 0));
      AV58TFAlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRPieDis), 6, 0));
      AV59TFAlbRPieDis_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbRPieDis_To), 6, 0));
      AV69TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
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
      callWebObject(formatLink("app.talbrec", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbrec", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV114Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV114Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV114Pgmname+"GridState"), null, null);
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
      AV115GXV1 = 1 ;
      while ( AV115GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV115GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV76FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76FilterFullText", AV76FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBRFEN") == 0 )
         {
            AV15AlbRFen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRFen", localUtil.format(AV15AlbRFen, "99/99/99"));
            AV66AlbRFen_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66AlbRFen_To", localUtil.format(AV66AlbRFen_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBREST") == 0 )
         {
            AV70AlbREst = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70AlbREst", GXutil.str( AV70AlbREst, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLINOM") == 0 )
         {
            AV72CliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72CliNom", AV72CliNom);
            AV71CliNomOperator = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71CliNomOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliNomOperator), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBREF") == 0 )
         {
            AV74AlbRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74AlbRef", AV74AlbRef);
            AV73AlbRefOperator = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRefOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbRefOperator), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV44TFAlbRFen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFAlbRFen", localUtil.format(AV44TFAlbRFen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV27TFAlbRecCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbRecCod), 8, 0));
            AV28TFAlbRecCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV30TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod), 6, 0));
            AV31TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV33TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom", AV33TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV34TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom_Sel", AV34TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV36TFAlbRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbRef", AV36TFAlbRef);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV37TFAlbRef_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbRef_Sel", AV37TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV49TFAlbRefDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbRefDsc", AV49TFAlbRefDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV50TFAlbRefDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbRefDsc_Sel", AV50TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV77TFAlbRUni_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFAlbRUni_SelsJson", AV77TFAlbRUni_SelsJson);
            AV78TFAlbRUni_Sels.fromJSonString(AV77TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV61TFAlbRUniEnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbRUniEnt", GXutil.ltrimstr( AV61TFAlbRUniEnt, 9, 2));
            AV62TFAlbRUniEnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbRUniEnt_To", GXutil.ltrimstr( AV62TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV52TFAlbRUniDis = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbRUniDis", GXutil.ltrimstr( AV52TFAlbRUniDis, 9, 2));
            AV53TFAlbRUniDis_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbRUniDis_To", GXutil.ltrimstr( AV53TFAlbRUniDis_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV64TFAlbRPieEnt = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFAlbRPieEnt), 6, 0));
            AV65TFAlbRPieEnt_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV58TFAlbRPieDis = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRPieDis), 6, 0));
            AV59TFAlbRPieDis_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbRPieDis_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREST_SEL") == 0 )
         {
            AV68TFAlbREst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFAlbREst_SelsJson", AV68TFAlbREst_SelsJson);
            AV69TFAlbREst_Sels.fromJSonString(AV68TFAlbREst_SelsJson, null);
         }
         AV115GXV1 = (int)(AV115GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFCliNom_Sel)==0), AV34TFCliNom_Sel, GXv_char4) ;
      webwpalbrec_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFAlbRef_Sel)==0), AV37TFAlbRef_Sel, GXv_char3) ;
      webwpalbrec_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFAlbRefDsc_Sel)==0), AV50TFAlbRefDsc_Sel, GXv_char2) ;
      webwpalbrec_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV78TFAlbRUni_Sels.size()==0), AV77TFAlbRUni_SelsJson, GXv_char15) ;
      webwpalbrec_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|||||"+((AV69TFAlbREst_Sels.size()==0) ? "" : AV68TFAlbREst_SelsJson) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFCliNom)==0), AV33TFCliNom, GXv_char15) ;
      webwpalbrec_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFAlbRef)==0), AV36TFAlbRef, GXv_char4) ;
      webwpalbrec_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFAlbRefDsc)==0), AV49TFAlbRefDsc, GXv_char3) ;
      webwpalbrec_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44TFAlbRFen)) ? "" : localUtil.dtoc( AV44TFAlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV27TFAlbRecCod) ? "" : GXutil.str( AV27TFAlbRecCod, 8, 0))+"|"+((0==AV30TFCliCod) ? "" : GXutil.str( AV30TFCliCod, 6, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFAlbRUniEnt)==0) ? "" : GXutil.str( AV61TFAlbRUniEnt, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFAlbRUniDis)==0) ? "" : GXutil.str( AV52TFAlbRUniDis, 9, 2))+"|"+((0==AV64TFAlbRPieEnt) ? "" : GXutil.str( AV64TFAlbRPieEnt, 6, 0))+"|"+((0==AV58TFAlbRPieDis) ? "" : GXutil.str( AV58TFAlbRPieDis, 6, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV28TFAlbRecCod_To) ? "" : GXutil.str( AV28TFAlbRecCod_To, 8, 0))+"|"+((0==AV31TFCliCod_To) ? "" : GXutil.str( AV31TFCliCod_To, 6, 0))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFAlbRUniEnt_To)==0) ? "" : GXutil.str( AV62TFAlbRUniEnt_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFAlbRUniDis_To)==0) ? "" : GXutil.str( AV53TFAlbRUniDis_To, 9, 2))+"|"+((0==AV65TFAlbRPieEnt_To) ? "" : GXutil.str( AV65TFAlbRPieEnt_To, 6, 0))+"|"+((0==AV59TFAlbRPieDis_To) ? "" : GXutil.str( AV59TFAlbRPieDis_To, 6, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV114Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV76FilterFullText)==0), (short)(0), AV76FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "ALBRFEN", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15AlbRFen))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66AlbRFen_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV15AlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV66AlbRFen_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "ALBREST", "", !(0==AV70AlbREst), (short)(0), GXutil.trim( GXutil.str( AV70AlbREst, 1, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "CLINOM", "", !(GXutil.strcmp("", AV72CliNom)==0), AV71CliNomOperator, AV72CliNom, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "ALBREF", "", !(GXutil.strcmp("", AV74AlbRef)==0), AV73AlbRefOperator, AV74AlbRef, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRFEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44TFAlbRFen)), (short)(0), GXutil.trim( localUtil.dtoc( AV44TFAlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRECCOD", "", !((0==AV27TFAlbRecCod)&&(0==AV28TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV27TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV28TFAlbRecCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCLICOD", "", !((0==AV30TFCliCod)&&(0==AV31TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV31TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCLINOM", "", !(GXutil.strcmp("", AV33TFCliNom)==0), (short)(0), AV33TFCliNom, "", !(GXutil.strcmp("", AV34TFCliNom_Sel)==0), AV34TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBREF", "", !(GXutil.strcmp("", AV36TFAlbRef)==0), (short)(0), AV36TFAlbRef, "", !(GXutil.strcmp("", AV37TFAlbRef_Sel)==0), AV37TFAlbRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBREFDSC", "", !(GXutil.strcmp("", AV49TFAlbRefDsc)==0), (short)(0), AV49TFAlbRefDsc, "", !(GXutil.strcmp("", AV50TFAlbRefDsc_Sel)==0), AV50TFAlbRefDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRUNI_SEL", "", !(AV78TFAlbRUni_Sels.size()==0), (short)(0), AV78TFAlbRUni_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRUNIENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFAlbRUniEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFAlbRUniEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV61TFAlbRUniEnt, 9, 2)), GXutil.trim( GXutil.str( AV62TFAlbRUniEnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRUNIDIS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFAlbRUniDis)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFAlbRUniDis_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFAlbRUniDis, 9, 2)), GXutil.trim( GXutil.str( AV53TFAlbRUniDis_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRPIEENT", "", !((0==AV64TFAlbRPieEnt)&&(0==AV65TFAlbRPieEnt_To)), (short)(0), GXutil.trim( GXutil.str( AV64TFAlbRPieEnt, 6, 0)), GXutil.trim( GXutil.str( AV65TFAlbRPieEnt_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRPIEDIS", "", !((0==AV58TFAlbRPieDis)&&(0==AV59TFAlbRPieDis_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFAlbRPieDis, 6, 0)), GXutil.trim( GXutil.str( AV59TFAlbRPieDis_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBREST_SEL", "", !(AV69TFAlbREst_Sels.size()==0), (short)(0), AV69TFAlbREst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV114Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV114Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TALBREC" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_IK2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_26_IK2( true) ;
      }
      else
      {
         wb_table2_26_IK2( false) ;
      }
      return  ;
   }

   public void wb_table2_26_IK2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_IK2e( true) ;
      }
      else
      {
         wb_table1_23_IK2e( false) ;
      }
   }

   public void wb_table2_26_IK2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV76FilterFullText, GXutil.rtrim( localUtil.format( AV76FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebWpALBREC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrfen_rangetext_Internalname, httpContext.getMessage( "Alb RFen_Range Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrfen_rangetext_Internalname, AV80AlbRFen_RangeText, GXutil.rtrim( localUtil.format( AV80AlbRFen_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavAlbrfen_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavAlbrfen_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWpALBREC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbrest.getInternalname(), httpContext.getMessage( "Alb REst", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbrest, cmbavAlbrest.getInternalname(), GXutil.trim( GXutil.str( AV70AlbREst, 1, 0)), 1, cmbavAlbrest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavAlbrest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "", true, (byte)(0), "HLP_WebWpALBREC.htm");
         cmbavAlbrest.setValue( GXutil.trim( GXutil.str( AV70AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrest.getInternalname(), "Values", cmbavAlbrest.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_41_IK2( true) ;
      }
      else
      {
         wb_table3_41_IK2( false) ;
      }
      return  ;
   }

   public void wb_table3_41_IK2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_51_IK2( true) ;
      }
      else
      {
         wb_table4_51_IK2( false) ;
      }
      return  ;
   }

   public void wb_table4_51_IK2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_26_IK2e( true) ;
      }
      else
      {
         wb_table2_26_IK2e( false) ;
      }
   }

   public void wb_table4_51_IK2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedalbref_Internalname, tblTablemergedalbref_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbrefoperator.getInternalname(), httpContext.getMessage( "Alb Ref Operator", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbrefoperator, cmbavAlbrefoperator.getInternalname(), GXutil.trim( GXutil.str( AV73AlbRefOperator, 4, 0)), 1, cmbavAlbrefoperator.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavAlbrefoperator.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "", true, (byte)(0), "HLP_WebWpALBREC.htm");
         cmbavAlbrefoperator.setValue( GXutil.trim( GXutil.str( AV73AlbRefOperator, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrefoperator.getInternalname(), "Values", cmbavAlbrefoperator.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbref_Internalname, httpContext.getMessage( "Alb Ref", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbref_Internalname, GXutil.rtrim( AV74AlbRef), GXutil.rtrim( localUtil.format( AV74AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavAlbref_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavAlbref_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWpALBREC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_51_IK2e( true) ;
      }
      else
      {
         wb_table4_51_IK2e( false) ;
      }
   }

   public void wb_table3_41_IK2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedclinom_Internalname, tblTablemergedclinom_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavClinomoperator.getInternalname(), httpContext.getMessage( "Cli Nom Operator", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavClinomoperator, cmbavClinomoperator.getInternalname(), GXutil.trim( GXutil.str( AV71CliNomOperator, 4, 0)), 1, cmbavClinomoperator.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavClinomoperator.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, (byte)(0), "HLP_WebWpALBREC.htm");
         cmbavClinomoperator.setValue( GXutil.trim( GXutil.str( AV71CliNomOperator, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavClinomoperator.getInternalname(), "Values", cmbavClinomoperator.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Cli Nom", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV72CliNom), GXutil.rtrim( localUtil.format( AV72CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavClinom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWpALBREC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_41_IK2e( true) ;
      }
      else
      {
         wb_table3_41_IK2e( false) ;
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
      paIK2( ) ;
      wsIK2( ) ;
      weIK2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Shared/daterangepicker/daterangepicker.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcwcdetallepiezas == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcdetallepiezas_Component) != 0 )
         {
            WebComp_Wcwcdetallepiezas.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016413927", true, true);
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
      httpContext.AddJavascriptSource("webwpalbrec.js", "?202661016413927", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
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

   public void subsflControlProps_692( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_69_idx );
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_69_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_69_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_69_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_69_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_69_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_69_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_69_idx );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_69_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_69_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_69_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_69_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_69_idx );
   }

   public void subsflControlProps_fel_692( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_69_fel_idx );
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_69_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_69_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_69_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_69_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_69_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_69_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_69_fel_idx );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_69_fel_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_69_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_69_fel_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_69_fel_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_69_fel_idx );
   }

   public void sendrow_692( )
   {
      subsflControlProps_692( ) ;
      wbIK0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_69_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_69_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_69_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'',false,'"+sGXsfl_69_idx+"',69)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_69_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV79GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV79GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV79GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e22ik2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV79GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_69_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRFen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRFen_Internalname,localUtil.format(A49AlbRFen, "99/99/99"),localUtil.format( A49AlbRFen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRFen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRFen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRecCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRef_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRefDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRefDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbRUni.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBRUNI_" + sGXsfl_69_idx ;
            cmbAlbRUni.setName( GXCCtl );
            cmbAlbRUni.setWebtags( "" );
            cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
            cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
            if ( cmbAlbRUni.getItemCount() > 0 )
            {
               A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbRUni.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_69_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRUniEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRUniEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRUniDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRUniDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRPieEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRPieEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRPieDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRPieDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbAlbREst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbREst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBREST_" + sGXsfl_69_idx ;
            cmbAlbREst.setName( GXCCtl );
            cmbAlbREst.setWebtags( "" );
            cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
            cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
            if ( cmbAlbREst.getItemCount() > 0 )
            {
               A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbREst,cmbAlbREst.getInternalname(),GXutil.trim( GXutil.str( A47AlbREst, 1, 0)),Integer.valueOf(1),cmbAlbREst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbAlbREst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_69_Refreshing);
         send_integrity_lvl_hashesIK2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_69_idx = ((subGrid_Islastpage==1)&&(nGXsfl_69_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
      /* End function sendrow_692 */
   }

   public void startgridcontrol69( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"69\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRFen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRefDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniDis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Disponibles", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Entregadas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieDis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Disponibles", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbREst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV79GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A49AlbRFen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRFen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      edtavAlbrfen_rangetext_Internalname = "vALBRFEN_RANGETEXT" ;
      cmbavAlbrest.setInternalname( "vALBREST" );
      cmbavClinomoperator.setInternalname( "vCLINOMOPERATOR" );
      edtavClinom_Internalname = "vCLINOM" ;
      tblTablemergedclinom_Internalname = "TABLEMERGEDCLINOM" ;
      cmbavAlbrefoperator.setInternalname( "vALBREFOPERATOR" );
      edtavAlbref_Internalname = "vALBREF" ;
      tblTablemergedalbref_Internalname = "TABLEMERGEDALBREF" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtAlbRFen_Internalname = "ALBRFEN" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Albrfen_rangepicker_Internalname = "ALBRFEN_RANGEPICKER" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albrfenauxdate_Internalname = "vDDO_ALBRFENAUXDATE" ;
      divDdo_albrfenauxdates_Internalname = "DDO_ALBRFENAUXDATES" ;
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
      cmbAlbREst.setJsonclick( "" );
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniEnt_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRFen_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      cmbavClinomoperator.setJsonclick( "" );
      cmbavClinomoperator.setEnabled( 1 );
      edtavAlbref_Jsonclick = "" ;
      edtavAlbref_Enabled = 1 ;
      cmbavAlbrefoperator.setJsonclick( "" );
      cmbavAlbrefoperator.setEnabled( 1 );
      cmbavAlbrest.setJsonclick( "" );
      cmbavAlbrest.setEnabled( 1 );
      edtavAlbrfen_rangetext_Jsonclick = "" ;
      edtavAlbrfen_rangetext_Enabled = 1 ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbAlbREst.setVisible( -1 );
      edtAlbRPieDis_Visible = -1 ;
      edtAlbRPieEnt_Visible = -1 ;
      edtAlbRUniDis_Visible = -1 ;
      edtAlbRUniEnt_Visible = -1 ;
      cmbAlbRUni.setVisible( -1 );
      edtAlbRefDsc_Visible = -1 ;
      edtAlbRef_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtAlbRecCod_Visible = -1 ;
      edtAlbRFen_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albrfenauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WebWpALBRECGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||K:K,M:M|||||0:Abierta,1:Cerrada" ;
      Ddo_grid_Allowmultipleselection = "||||||T|||||T" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|Dynamic|FixedValues|||||FixedValues" ;
      Ddo_grid_Includedatalist = "|||T|T|T|T|||||T" ;
      Ddo_grid_Filterisrange = "|T|T|||||T|T|T|T|" ;
      Ddo_grid_Filtertype = "Date|Numeric|Numeric|Character|Character|Character||Numeric|Numeric|Numeric|Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T||T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T||T||T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8||9||10" ;
      Ddo_grid_Columnids = "1:AlbRFen|2:AlbRecCod|3:CliCod|4:CliNom|5:AlbRef|6:AlbRefDsc|7:AlbRUni|8:AlbRUniEnt|9:AlbRUniDis|10:AlbRPieEnt|11:AlbRPieDis|12:AlbREst" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Detalle de Piezas", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( "Consulta Almacen de Tela (con detalle de rollos)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbrest.setName( "vALBREST" );
      cmbavAlbrest.setWebtags( "" );
      cmbavAlbrest.addItem(GXutil.trim( GXutil.str( 0, 1, 0)), httpContext.getMessage( "WWP_AllInCombo", ""), (short)(0));
      cmbavAlbrest.addItem("9", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavAlbrest.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbavAlbrest.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbavAlbrest.getItemCount() > 0 )
      {
         AV70AlbREst = (byte)(GXutil.lval( cmbavAlbrest.getValidValue(GXutil.trim( GXutil.str( AV70AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70AlbREst", GXutil.str( AV70AlbREst, 1, 0));
      }
      cmbavClinomoperator.setName( "vCLINOMOPERATOR" );
      cmbavClinomoperator.setWebtags( "" );
      cmbavClinomoperator.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      if ( cmbavClinomoperator.getItemCount() > 0 )
      {
         AV71CliNomOperator = (short)(GXutil.lval( cmbavClinomoperator.getValidValue(GXutil.trim( GXutil.str( AV71CliNomOperator, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71CliNomOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliNomOperator), 4, 0));
      }
      cmbavAlbrefoperator.setName( "vALBREFOPERATOR" );
      cmbavAlbrefoperator.setWebtags( "" );
      cmbavAlbrefoperator.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      if ( cmbavAlbrefoperator.getItemCount() > 0 )
      {
         AV73AlbRefOperator = (short)(GXutil.lval( cmbavAlbrefoperator.getValidValue(GXutil.trim( GXutil.str( AV73AlbRefOperator, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRefOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbRefOperator), 4, 0));
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_69_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV79GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV79GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GridActions), 4, 0));
      }
      GXCCtl = "ALBRUNI_" + sGXsfl_69_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      GXCCtl = "ALBREST_" + sGXsfl_69_idx ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavClinomoperator'},{av:'AV71CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV72CliNom',fld:'vCLINOM',pic:''},{av:'cmbavAlbrefoperator'},{av:'AV73AlbRefOperator',fld:'vALBREFOPERATOR',pic:'ZZZ9'},{av:'AV74AlbRef',fld:'vALBREF',pic:''},{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV76FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'cmbavAlbrest'},{av:'AV70AlbREst',fld:'vALBREST',pic:'9'},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbREst'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12IK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavClinomoperator'},{av:'AV71CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV72CliNom',fld:'vCLINOM',pic:''},{av:'cmbavAlbrefoperator'},{av:'AV73AlbRefOperator',fld:'vALBREFOPERATOR',pic:'ZZZ9'},{av:'AV74AlbRef',fld:'vALBREF',pic:''},{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'cmbavAlbrest'},{av:'AV70AlbREst',fld:'vALBREST',pic:'9'},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13IK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavClinomoperator'},{av:'AV71CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV72CliNom',fld:'vCLINOM',pic:''},{av:'cmbavAlbrefoperator'},{av:'AV73AlbRefOperator',fld:'vALBREFOPERATOR',pic:'ZZZ9'},{av:'AV74AlbRef',fld:'vALBREF',pic:''},{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'cmbavAlbrest'},{av:'AV70AlbREst',fld:'vALBREST',pic:'9'},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15IK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavClinomoperator'},{av:'AV71CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV72CliNom',fld:'vCLINOM',pic:''},{av:'cmbavAlbrefoperator'},{av:'AV73AlbRefOperator',fld:'vALBREFOPERATOR',pic:'ZZZ9'},{av:'AV74AlbRef',fld:'vALBREF',pic:''},{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'cmbavAlbrest'},{av:'AV70AlbREst',fld:'vALBREST',pic:'9'},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TFAlbREst_SelsJson',fld:'vTFALBREST_SELSJSON',pic:''},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV77TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21IK2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV79GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16IK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavClinomoperator'},{av:'AV71CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV72CliNom',fld:'vCLINOM',pic:''},{av:'cmbavAlbrefoperator'},{av:'AV73AlbRefOperator',fld:'vALBREFOPERATOR',pic:'ZZZ9'},{av:'AV74AlbRef',fld:'vALBREF',pic:''},{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'cmbavAlbrest'},{av:'AV70AlbREst',fld:'vALBREST',pic:'9'},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbREst'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11IK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavClinomoperator'},{av:'AV71CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV72CliNom',fld:'vCLINOM',pic:''},{av:'cmbavAlbrefoperator'},{av:'AV73AlbRefOperator',fld:'vALBREFOPERATOR',pic:'ZZZ9'},{av:'AV74AlbRef',fld:'vALBREF',pic:''},{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'cmbavAlbrest'},{av:'AV70AlbREst',fld:'vALBREST',pic:'9'},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV77TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV68TFAlbREst_SelsJson',fld:'vTFALBREST_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV76FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'cmbavAlbrest'},{av:'AV70AlbREst',fld:'vALBREST',pic:'9'},{av:'cmbavClinomoperator'},{av:'AV71CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV72CliNom',fld:'vCLINOM',pic:''},{av:'cmbavAlbrefoperator'},{av:'AV73AlbRefOperator',fld:'vALBREFOPERATOR',pic:'ZZZ9'},{av:'AV74AlbRef',fld:'vALBREF',pic:''},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV68TFAlbREst_SelsJson',fld:'vTFALBREST_SELSJSON',pic:''},{av:'AV77TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbREst'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e22IK2',iparms:[{av:'cmbavGridactions'},{av:'AV79GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV79GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17IK2',iparms:[{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV77TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV68TFAlbREst_SelsJson',fld:'vTFALBREST_SELSJSON',pic:''},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'cmbavClinomoperator'},{av:'AV71CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV72CliNom',fld:'vCLINOM',pic:''},{av:'cmbavAlbrefoperator'},{av:'AV73AlbRefOperator',fld:'vALBREFOPERATOR',pic:'ZZZ9'},{av:'AV74AlbRef',fld:'vALBREF',pic:''},{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'cmbavAlbrest'},{av:'AV70AlbREst',fld:'vALBREST',pic:'9'},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV68TFAlbREst_SelsJson',fld:'vTFALBREST_SELSJSON',pic:''},{av:'AV77TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18IK2',iparms:[{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV77TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV68TFAlbREst_SelsJson',fld:'vTFALBREST_SELSJSON',pic:''},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'cmbavClinomoperator'},{av:'AV71CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV72CliNom',fld:'vCLINOM',pic:''},{av:'cmbavAlbrefoperator'},{av:'AV73AlbRefOperator',fld:'vALBREFOPERATOR',pic:'ZZZ9'},{av:'AV74AlbRef',fld:'vALBREF',pic:''},{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'cmbavAlbrest'},{av:'AV70AlbREst',fld:'vALBREST',pic:'9'},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV68TFAlbREst_SelsJson',fld:'vTFALBREST_SELSJSON',pic:''},{av:'AV77TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("ALBRFEN_RANGEPICKER.DATERANGECHANGED","{handler:'e14IK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavClinomoperator'},{av:'AV71CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV72CliNom',fld:'vCLINOM',pic:''},{av:'cmbavAlbrefoperator'},{av:'AV73AlbRefOperator',fld:'vALBREFOPERATOR',pic:'ZZZ9'},{av:'AV74AlbRef',fld:'vALBREF',pic:''},{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'cmbavAlbrest'},{av:'AV70AlbREst',fld:'vALBREST',pic:'9'},{av:'AV44TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV27TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV37TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV49TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV50TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV78TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV61TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV65TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV69TFAlbREst_Sels',fld:'vTFALBREST_SELS',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("ALBRFEN_RANGEPICKER.DATERANGECHANGED",",oparms:[{av:'AV15AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV66AlbRFen_To',fld:'vALBRFEN_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'cmbAlbREst'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALIDV_ALBREST","{handler:'validv_Albrest',iparms:[]");
      setEventMetadata("VALIDV_ALBREST",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[]");
      setEventMetadata("VALID_ALBREF",",oparms:[]}");
      setEventMetadata("VALID_ALBREFDSC","{handler:'valid_Albrefdsc',iparms:[]");
      setEventMetadata("VALID_ALBREFDSC",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEDIS","{handler:'valid_Albrpiedis',iparms:[]");
      setEventMetadata("VALID_ALBRPIEDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[]");
      setEventMetadata("VALID_ALBREST",",oparms:[]}");
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
      AV72CliNom = "" ;
      AV74AlbRef = "" ;
      AV15AlbRFen = GXutil.nullDate() ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV76FilterFullText = "" ;
      AV66AlbRFen_To = GXutil.nullDate() ;
      AV44TFAlbRFen = GXutil.nullDate() ;
      AV33TFCliNom = "" ;
      AV34TFCliNom_Sel = "" ;
      AV36TFAlbRef = "" ;
      AV37TFAlbRef_Sel = "" ;
      AV49TFAlbRefDsc = "" ;
      AV50TFAlbRefDsc_Sel = "" ;
      AV78TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV61TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV62TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV52TFAlbRUniDis = DecimalUtil.ZERO ;
      AV53TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV69TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV114Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV39DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV77TFAlbRUni_SelsJson = "" ;
      AV68TFAlbREst_SelsJson = "" ;
      A396EmprCod = "" ;
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
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcdetallepiezas_Component = "" ;
      OldWcwcdetallepiezas = "" ;
      ucAlbrfen_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV46DDO_AlbRFenAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV87Webwpalbrecds_1_filterfulltext = "" ;
      AV88Webwpalbrecds_2_albrfen = GXutil.nullDate() ;
      AV89Webwpalbrecds_3_albrfen_to = GXutil.nullDate() ;
      AV91Webwpalbrecds_5_clinom = "" ;
      AV92Webwpalbrecds_6_albref = "" ;
      AV93Webwpalbrecds_7_tfalbrfen = GXutil.nullDate() ;
      AV98Webwpalbrecds_12_tfclinom = "" ;
      AV99Webwpalbrecds_13_tfclinom_sel = "" ;
      AV100Webwpalbrecds_14_tfalbref = "" ;
      AV101Webwpalbrecds_15_tfalbref_sel = "" ;
      AV102Webwpalbrecds_16_tfalbrefdsc = "" ;
      AV103Webwpalbrecds_17_tfalbrefdsc_sel = "" ;
      AV104Webwpalbrecds_18_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV105Webwpalbrecds_19_tfalbrunient = DecimalUtil.ZERO ;
      AV106Webwpalbrecds_20_tfalbrunient_to = DecimalUtil.ZERO ;
      AV107Webwpalbrecds_21_tfalbrunidis = DecimalUtil.ZERO ;
      AV108Webwpalbrecds_22_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV113Webwpalbrecds_27_tfalbrest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV91Webwpalbrecds_5_clinom = "" ;
      lV92Webwpalbrecds_6_albref = "" ;
      lV98Webwpalbrecds_12_tfclinom = "" ;
      lV100Webwpalbrecds_14_tfalbref = "" ;
      lV102Webwpalbrecds_16_tfalbrefdsc = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      H00IK2_A396EmprCod = new String[] {""} ;
      H00IK2_A47AlbREst = new byte[1] ;
      H00IK2_A51AlbRPieDis = new int[1] ;
      H00IK2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IK2_A56AlbRUni = new String[] {""} ;
      H00IK2_A3613AlbRefDsc = new String[] {""} ;
      H00IK2_A45AlbRef = new String[] {""} ;
      H00IK2_A279CliNom = new String[] {""} ;
      H00IK2_A252CliCod = new int[1] ;
      H00IK2_A44AlbRecCod = new int[1] ;
      H00IK2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H00IK2_A52AlbRPieEnt = new int[1] ;
      H00IK2_A54AlbRPieUti = new int[1] ;
      H00IK2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IK2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IK3_A396EmprCod = new String[] {""} ;
      H00IK3_A47AlbREst = new byte[1] ;
      H00IK3_A51AlbRPieDis = new int[1] ;
      H00IK3_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IK3_A56AlbRUni = new String[] {""} ;
      H00IK3_A3613AlbRefDsc = new String[] {""} ;
      H00IK3_A45AlbRef = new String[] {""} ;
      H00IK3_A279CliNom = new String[] {""} ;
      H00IK3_A252CliCod = new int[1] ;
      H00IK3_A44AlbRecCod = new int[1] ;
      H00IK3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H00IK3_A52AlbRPieEnt = new int[1] ;
      H00IK3_A54AlbRPieUti = new int[1] ;
      H00IK3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00IK3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV80AlbRFen_RangeText = "" ;
      AV83Station = "" ;
      AV84Emprcod = "" ;
      AV85Emprnom = "" ;
      AV86Usurcod = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwpalbrec__default(),
         new Object[] {
             new Object[] {
            H00IK2_A396EmprCod, H00IK2_A47AlbREst, H00IK2_A51AlbRPieDis, H00IK2_A57AlbRUniDis, H00IK2_A56AlbRUni, H00IK2_A3613AlbRefDsc, H00IK2_A45AlbRef, H00IK2_A279CliNom, H00IK2_A252CliCod, H00IK2_A44AlbRecCod,
            H00IK2_A49AlbRFen, H00IK2_A52AlbRPieEnt, H00IK2_A54AlbRPieUti, H00IK2_A58AlbRUniEnt, H00IK2_A60AlbRUniUti
            }
            , new Object[] {
            H00IK3_A396EmprCod, H00IK3_A47AlbREst, H00IK3_A51AlbRPieDis, H00IK3_A57AlbRUniDis, H00IK3_A56AlbRUni, H00IK3_A3613AlbRefDsc, H00IK3_A45AlbRef, H00IK3_A279CliNom, H00IK3_A252CliCod, H00IK3_A44AlbRecCod,
            H00IK3_A49AlbRFen, H00IK3_A52AlbRPieEnt, H00IK3_A54AlbRPieUti, H00IK3_A58AlbRUniEnt, H00IK3_A60AlbRUniUti
            }
         }
      );
      AV114Pgmname = "WebWpALBREC" ;
      /* GeneXus formulas. */
      AV114Pgmname = "WebWpALBREC" ;
      Gx_err = (short)(0) ;
      WebComp_Wcwcdetallepiezas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV70AlbREst ;
   private byte gxajaxcallmode ;
   private byte A47AlbREst ;
   private byte nDonePA ;
   private byte AV90Webwpalbrecds_4_albrest ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV71CliNomOperator ;
   private short AV73AlbRefOperator ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV79GridActions ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_69 ;
   private int nGXsfl_69_idx=1 ;
   private int AV27TFAlbRecCod ;
   private int AV28TFAlbRecCod_To ;
   private int AV30TFCliCod ;
   private int AV31TFCliCod_To ;
   private int AV64TFAlbRPieEnt ;
   private int AV65TFAlbRPieEnt_To ;
   private int AV58TFAlbRPieDis ;
   private int AV59TFAlbRPieDis_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int subGrid_Islastpage ;
   private int AV94Webwpalbrecds_8_tfalbreccod ;
   private int AV95Webwpalbrecds_9_tfalbreccod_to ;
   private int AV96Webwpalbrecds_10_tfclicod ;
   private int AV97Webwpalbrecds_11_tfclicod_to ;
   private int AV109Webwpalbrecds_23_tfalbrpieent ;
   private int AV110Webwpalbrecds_24_tfalbrpieent_to ;
   private int AV111Webwpalbrecds_25_tfalbrpiedis ;
   private int AV112Webwpalbrecds_26_tfalbrpiedis_to ;
   private int AV104Webwpalbrecds_18_tfalbruni_sels_size ;
   private int AV113Webwpalbrecds_27_tfalbrest_sels_size ;
   private int A54AlbRPieUti ;
   private int edtAlbRFen_Visible ;
   private int edtAlbRecCod_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtAlbRef_Visible ;
   private int edtAlbRefDsc_Visible ;
   private int edtAlbRUniEnt_Visible ;
   private int edtAlbRUniDis_Visible ;
   private int edtAlbRPieEnt_Visible ;
   private int edtAlbRPieDis_Visible ;
   private int AV40PageToGo ;
   private int AV115GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int edtavAlbrfen_rangetext_Enabled ;
   private int edtavAlbref_Enabled ;
   private int edtavClinom_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV41GridCurrentPage ;
   private long AV42GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV61TFAlbRUniEnt ;
   private java.math.BigDecimal AV62TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV52TFAlbRUniDis ;
   private java.math.BigDecimal AV53TFAlbRUniDis_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV105Webwpalbrecds_19_tfalbrunient ;
   private java.math.BigDecimal AV106Webwpalbrecds_20_tfalbrunient_to ;
   private java.math.BigDecimal AV107Webwpalbrecds_21_tfalbrunidis ;
   private java.math.BigDecimal AV108Webwpalbrecds_22_tfalbrunidis_to ;
   private java.math.BigDecimal A60AlbRUniUti ;
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
   private String sGXsfl_69_idx="0001" ;
   private String AV72CliNom ;
   private String AV74AlbRef ;
   private String AV33TFCliNom ;
   private String AV34TFCliNom_Sel ;
   private String AV36TFAlbRef ;
   private String AV37TFAlbRef_Sel ;
   private String AV49TFAlbRefDsc ;
   private String AV50TFAlbRefDsc_Sel ;
   private String AV114Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcwcdetallepiezas_Component ;
   private String OldWcwcdetallepiezas ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Albrfen_rangepicker_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_albrfenauxdates_Internalname ;
   private String edtavDdo_albrfenauxdate_Internalname ;
   private String edtavDdo_albrfenauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Internalname ;
   private String A56AlbRUni ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV91Webwpalbrecds_5_clinom ;
   private String AV92Webwpalbrecds_6_albref ;
   private String AV98Webwpalbrecds_12_tfclinom ;
   private String AV99Webwpalbrecds_13_tfclinom_sel ;
   private String AV100Webwpalbrecds_14_tfalbref ;
   private String AV101Webwpalbrecds_15_tfalbref_sel ;
   private String AV102Webwpalbrecds_16_tfalbrefdsc ;
   private String AV103Webwpalbrecds_17_tfalbrefdsc_sel ;
   private String scmdbuf ;
   private String lV91Webwpalbrecds_5_clinom ;
   private String lV92Webwpalbrecds_6_albref ;
   private String lV98Webwpalbrecds_12_tfclinom ;
   private String lV100Webwpalbrecds_14_tfalbref ;
   private String lV102Webwpalbrecds_16_tfalbrefdsc ;
   private String edtavAlbrfen_rangetext_Internalname ;
   private String edtavClinom_Internalname ;
   private String edtavAlbref_Internalname ;
   private String AV83Station ;
   private String AV84Emprcod ;
   private String AV85Emprnom ;
   private String AV86Usurcod ;
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
   private String edtavAlbrfen_rangetext_Jsonclick ;
   private String tblTablemergedalbref_Internalname ;
   private String edtavAlbref_Jsonclick ;
   private String tblTablemergedclinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String sGXsfl_69_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbRFen_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV15AlbRFen ;
   private java.util.Date AV66AlbRFen_To ;
   private java.util.Date AV44TFAlbRFen ;
   private java.util.Date AV46DDO_AlbRFenAuxDate ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV88Webwpalbrecds_2_albrfen ;
   private java.util.Date AV89Webwpalbrecds_3_albrfen_to ;
   private java.util.Date AV93Webwpalbrecds_7_tfalbrfen ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_69_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcdetallepiezas ;
   private boolean gx_refresh_fired ;
   private String AV77TFAlbRUni_SelsJson ;
   private String AV68TFAlbREst_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV76FilterFullText ;
   private String AV87Webwpalbrecds_1_filterfulltext ;
   private String AV80AlbRFen_RangeText ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private GXSimpleCollection<Byte> AV69TFAlbREst_Sels ;
   private GXSimpleCollection<Byte> AV113Webwpalbrecds_27_tfalbrest_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcdetallepiezas ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucAlbrfen_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavAlbrest ;
   private HTMLChoice cmbavClinomoperator ;
   private HTMLChoice cmbavAlbrefoperator ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private String[] H00IK2_A396EmprCod ;
   private byte[] H00IK2_A47AlbREst ;
   private int[] H00IK2_A51AlbRPieDis ;
   private java.math.BigDecimal[] H00IK2_A57AlbRUniDis ;
   private String[] H00IK2_A56AlbRUni ;
   private String[] H00IK2_A3613AlbRefDsc ;
   private String[] H00IK2_A45AlbRef ;
   private String[] H00IK2_A279CliNom ;
   private int[] H00IK2_A252CliCod ;
   private int[] H00IK2_A44AlbRecCod ;
   private java.util.Date[] H00IK2_A49AlbRFen ;
   private int[] H00IK2_A52AlbRPieEnt ;
   private int[] H00IK2_A54AlbRPieUti ;
   private java.math.BigDecimal[] H00IK2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] H00IK2_A60AlbRUniUti ;
   private String[] H00IK3_A396EmprCod ;
   private byte[] H00IK3_A47AlbREst ;
   private int[] H00IK3_A51AlbRPieDis ;
   private java.math.BigDecimal[] H00IK3_A57AlbRUniDis ;
   private String[] H00IK3_A56AlbRUni ;
   private String[] H00IK3_A3613AlbRefDsc ;
   private String[] H00IK3_A45AlbRef ;
   private String[] H00IK3_A279CliNom ;
   private int[] H00IK3_A252CliCod ;
   private int[] H00IK3_A44AlbRecCod ;
   private java.util.Date[] H00IK3_A49AlbRFen ;
   private int[] H00IK3_A52AlbRPieEnt ;
   private int[] H00IK3_A54AlbRPieUti ;
   private java.math.BigDecimal[] H00IK3_A58AlbRUniEnt ;
   private java.math.BigDecimal[] H00IK3_A60AlbRUniUti ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV78TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV104Webwpalbrecds_18_tfalbruni_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV39DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class webwpalbrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00IK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV104Webwpalbrecds_18_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV113Webwpalbrecds_27_tfalbrest_sels ,
                                          java.util.Date AV88Webwpalbrecds_2_albrfen ,
                                          java.util.Date AV89Webwpalbrecds_3_albrfen_to ,
                                          short AV71CliNomOperator ,
                                          String AV91Webwpalbrecds_5_clinom ,
                                          short AV73AlbRefOperator ,
                                          String AV92Webwpalbrecds_6_albref ,
                                          java.util.Date AV93Webwpalbrecds_7_tfalbrfen ,
                                          int AV94Webwpalbrecds_8_tfalbreccod ,
                                          int AV95Webwpalbrecds_9_tfalbreccod_to ,
                                          int AV96Webwpalbrecds_10_tfclicod ,
                                          int AV97Webwpalbrecds_11_tfclicod_to ,
                                          String AV99Webwpalbrecds_13_tfclinom_sel ,
                                          String AV98Webwpalbrecds_12_tfclinom ,
                                          String AV101Webwpalbrecds_15_tfalbref_sel ,
                                          String AV100Webwpalbrecds_14_tfalbref ,
                                          String AV103Webwpalbrecds_17_tfalbrefdsc_sel ,
                                          String AV102Webwpalbrecds_16_tfalbrefdsc ,
                                          int AV104Webwpalbrecds_18_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV105Webwpalbrecds_19_tfalbrunient ,
                                          java.math.BigDecimal AV106Webwpalbrecds_20_tfalbrunient_to ,
                                          java.math.BigDecimal AV107Webwpalbrecds_21_tfalbrunidis ,
                                          java.math.BigDecimal AV108Webwpalbrecds_22_tfalbrunidis_to ,
                                          int AV109Webwpalbrecds_23_tfalbrpieent ,
                                          int AV110Webwpalbrecds_24_tfalbrpieent_to ,
                                          int AV111Webwpalbrecds_25_tfalbrpiedis ,
                                          int AV112Webwpalbrecds_26_tfalbrpiedis_to ,
                                          int AV113Webwpalbrecds_27_tfalbrest_sels_size ,
                                          java.util.Date A49AlbRFen ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          int A44AlbRecCod ,
                                          int A252CliCod ,
                                          String A3613AlbRefDsc ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV87Webwpalbrecds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis ,
                                          byte AV90Webwpalbrecds_4_albrest )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[25];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbREst, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T2.CliNom, T1.CliCod, T1.AlbRecCod, T1.AlbRFen, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRUniEnt, T1.AlbRUniUti FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Webwpalbrecds_2_albrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Webwpalbrecds_3_albrfen_to)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ( AV71CliNomOperator == 0 ) && ( ! (GXutil.strcmp("", AV91Webwpalbrecds_5_clinom)==0) ) )
      {
         addWhere(sWhereString, "(T2.CliNom like '%' || ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ( AV73AlbRefOperator == 0 ) && ( ! (GXutil.strcmp("", AV92Webwpalbrecds_6_albref)==0) ) )
      {
         addWhere(sWhereString, "(T1.AlbRef like '%' || ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Webwpalbrecds_7_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwpalbrecds_8_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV95Webwpalbrecds_9_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV96Webwpalbrecds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (0==AV97Webwpalbrecds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Webwpalbrecds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Webwpalbrecds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Webwpalbrecds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Webwpalbrecds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV100Webwpalbrecds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Webwpalbrecds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Webwpalbrecds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Webwpalbrecds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webwpalbrecds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( AV104Webwpalbrecds_18_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Webwpalbrecds_18_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Webwpalbrecds_19_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Webwpalbrecds_20_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Webwpalbrecds_21_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Webwpalbrecds_22_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV109Webwpalbrecds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV110Webwpalbrecds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV111Webwpalbrecds_25_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV112Webwpalbrecds_26_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( AV113Webwpalbrecds_27_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Webwpalbrecds_27_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H00IK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV104Webwpalbrecds_18_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV113Webwpalbrecds_27_tfalbrest_sels ,
                                          java.util.Date AV88Webwpalbrecds_2_albrfen ,
                                          java.util.Date AV89Webwpalbrecds_3_albrfen_to ,
                                          short AV71CliNomOperator ,
                                          String AV91Webwpalbrecds_5_clinom ,
                                          short AV73AlbRefOperator ,
                                          String AV92Webwpalbrecds_6_albref ,
                                          java.util.Date AV93Webwpalbrecds_7_tfalbrfen ,
                                          int AV94Webwpalbrecds_8_tfalbreccod ,
                                          int AV95Webwpalbrecds_9_tfalbreccod_to ,
                                          int AV96Webwpalbrecds_10_tfclicod ,
                                          int AV97Webwpalbrecds_11_tfclicod_to ,
                                          String AV99Webwpalbrecds_13_tfclinom_sel ,
                                          String AV98Webwpalbrecds_12_tfclinom ,
                                          String AV101Webwpalbrecds_15_tfalbref_sel ,
                                          String AV100Webwpalbrecds_14_tfalbref ,
                                          String AV103Webwpalbrecds_17_tfalbrefdsc_sel ,
                                          String AV102Webwpalbrecds_16_tfalbrefdsc ,
                                          int AV104Webwpalbrecds_18_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV105Webwpalbrecds_19_tfalbrunient ,
                                          java.math.BigDecimal AV106Webwpalbrecds_20_tfalbrunient_to ,
                                          java.math.BigDecimal AV107Webwpalbrecds_21_tfalbrunidis ,
                                          java.math.BigDecimal AV108Webwpalbrecds_22_tfalbrunidis_to ,
                                          int AV109Webwpalbrecds_23_tfalbrpieent ,
                                          int AV110Webwpalbrecds_24_tfalbrpieent_to ,
                                          int AV111Webwpalbrecds_25_tfalbrpiedis ,
                                          int AV112Webwpalbrecds_26_tfalbrpiedis_to ,
                                          int AV113Webwpalbrecds_27_tfalbrest_sels_size ,
                                          java.util.Date A49AlbRFen ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          int A44AlbRecCod ,
                                          int A252CliCod ,
                                          String A3613AlbRefDsc ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV87Webwpalbrecds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis ,
                                          byte AV90Webwpalbrecds_4_albrest )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[25];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbREst, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T2.CliNom, T1.CliCod, T1.AlbRecCod, T1.AlbRFen, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRUniEnt, T1.AlbRUniUti FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Webwpalbrecds_2_albrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Webwpalbrecds_3_albrfen_to)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ( AV71CliNomOperator == 0 ) && ( ! (GXutil.strcmp("", AV91Webwpalbrecds_5_clinom)==0) ) )
      {
         addWhere(sWhereString, "(T2.CliNom like '%' || ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ( AV73AlbRefOperator == 0 ) && ( ! (GXutil.strcmp("", AV92Webwpalbrecds_6_albref)==0) ) )
      {
         addWhere(sWhereString, "(T1.AlbRef like '%' || ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Webwpalbrecds_7_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwpalbrecds_8_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (0==AV95Webwpalbrecds_9_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (0==AV96Webwpalbrecds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (0==AV97Webwpalbrecds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Webwpalbrecds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Webwpalbrecds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Webwpalbrecds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Webwpalbrecds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV100Webwpalbrecds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Webwpalbrecds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Webwpalbrecds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Webwpalbrecds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Webwpalbrecds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( AV104Webwpalbrecds_18_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Webwpalbrecds_18_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Webwpalbrecds_19_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Webwpalbrecds_20_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Webwpalbrecds_21_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Webwpalbrecds_22_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV109Webwpalbrecds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (0==AV110Webwpalbrecds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (0==AV111Webwpalbrecds_25_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (0==AV112Webwpalbrecds_26_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( AV113Webwpalbrecds_27_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Webwpalbrecds_27_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
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
                  return conditional_H00IK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() );
            case 1 :
                  return conditional_H00IK3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00IK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
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
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               return;
      }
   }

}

