package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn06ww_impl extends GXDataArea
{
   public ttrn06ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn06ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn06ww_impl.class ));
   }

   public ttrn06ww_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbpropri = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbAlbMarca = new HTMLChoice();
      cmbAlbEnvFtp = new HTMLChoice();
      cmbAlbProAT = new HTMLChoice();
      cmbAlbSec = new HTMLChoice();
      cmbAlbProEst = new HTMLChoice();
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
      nRC_GXsfl_57 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_57"))) ;
      nGXsfl_57_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_57_idx"))) ;
      sGXsfl_57_idx = httpContext.GetPar( "sGXsfl_57_idx") ;
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
      AV15AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
      AV26ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV21ColumnsSelector);
      cmbavAlbpropri.fromJSonString( httpContext.GetNextPar( ));
      AV59AlbProPri = httpContext.GetPar( "AlbProPri") ;
      AV16AlbProFch_To = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch_To")) ;
      AV84FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV28TFAlbProCod = GXutil.lval( httpContext.GetPar( "TFAlbProCod")) ;
      AV29TFAlbProCod_To = GXutil.lval( httpContext.GetPar( "TFAlbProCod_To")) ;
      AV61TFAlbProPri = httpContext.GetPar( "TFAlbProPri") ;
      AV62TFAlbProPri_Sel = httpContext.GetPar( "TFAlbProPri_Sel") ;
      AV31TFAlbProfch = localUtil.parseDateParm( httpContext.GetPar( "TFAlbProfch")) ;
      AV36TFGuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "TFGuiRemCli"))) ;
      AV37TFGuiRemCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFGuiRemCli_To"))) ;
      AV39TFGuiRemCln = httpContext.GetPar( "TFGuiRemCln") ;
      AV40TFGuiRemCln_Sel = httpContext.GetPar( "TFGuiRemCln_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV78TFAlbMarca_Sels);
      AV45TFAlbLic = httpContext.GetPar( "TFAlbLic") ;
      AV46TFAlbLic_Sel = httpContext.GetPar( "TFAlbLic_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV58TFAlbProAT_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV69TFAlbProEst_Sels);
      AV71TFAlbFmd = httpContext.GetPar( "TFAlbFmd") ;
      AV72TFAlbFmd_Sel = httpContext.GetPar( "TFAlbFmd_Sel") ;
      AV113Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV66AlbSec = httpContext.GetPar( "AlbSec") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15AlbProFch, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV59AlbProPri, AV16AlbProFch_To, AV84FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV61TFAlbProPri, AV62TFAlbProPri_Sel, AV31TFAlbProfch, AV36TFGuiRemCli, AV37TFGuiRemCli_To, AV39TFGuiRemCln, AV40TFGuiRemCln_Sel, AV78TFAlbMarca_Sels, AV45TFAlbLic, AV46TFAlbLic_Sel, AV58TFAlbProAT_Sels, AV69TFAlbProEst_Sels, AV71TFAlbFmd, AV72TFAlbFmd_Sel, AV113Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66AlbSec) ;
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
      paJJ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startJJ2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttrn06ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV113Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66AlbSec, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROFCH", localUtil.format(AV15AlbProFch, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_57", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_57, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV24ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV24ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV53GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV54GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH", localUtil.dtoc( AV15AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH_TO", localUtil.dtoc( AV16AlbProFch_To, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV51DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV51DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV21ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV21ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV26ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV28TFAlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFAlbProCod_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRI", GXutil.rtrim( AV61TFAlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRI_SEL", GXutil.rtrim( AV62TFAlbProPri_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROFCH", localUtil.dtoc( AV31TFAlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV36TFGuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV37TFGuiRemCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLN", GXutil.rtrim( AV39TFGuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLN_SEL", GXutil.rtrim( AV40TFGuiRemCln_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBMARCA_SELS", AV78TFAlbMarca_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBMARCA_SELS", AV78TFAlbMarca_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBLIC", GXutil.rtrim( AV45TFAlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBLIC_SEL", GXutil.rtrim( AV46TFAlbLic_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROAT_SELS", AV58TFAlbProAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROAT_SELS", AV58TFAlbProAT_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROEST_SELS", AV69TFAlbProEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROEST_SELS", AV69TFAlbProEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBFMD", AV71TFAlbFmd);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBFMD_SEL", AV72TFAlbFmd_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV113Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV113Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBMARCA_SELSJSON", AV77TFAlbMarca_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROAT_SELSJSON", AV57TFAlbProAT_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROEST_SELSJSON", AV68TFAlbProEst_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV66AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66AlbSec, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNANULADA_Title", GXutil.rtrim( Dvelop_confirmpanel_btnanulada_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNANULADA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnanulada_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNANULADA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnanulada_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNANULADA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnanulada_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNANULADA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnanulada_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNANULADA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnanulada_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNANULADA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnanulada_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Title", GXutil.rtrim( Dvelop_confirmpanel_btneliminaralbaran_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btneliminaralbaran_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaralbaran_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaralbaran_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaralbaran_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btneliminaralbaran_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btneliminaralbaran_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNANULADA_Result", GXutil.rtrim( Dvelop_confirmpanel_btnanulada_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminaralbaran_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNANULADA_Result", GXutil.rtrim( Dvelop_confirmpanel_btnanulada_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminaralbaran_Result));
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
      if ( ! ( WebComp_Wcwctablaalbbar == null ) )
      {
         WebComp_Wcwctablaalbbar.componentjscripts();
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
         weJJ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtJJ2( ) ;
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
      return formatLink("app.ttrn06ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrn06WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Guias (Header)", "") ;
   }

   public void wbJJ0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn06WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn06WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn06WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn06WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnanulada_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "Guia Anulada", ""), bttBtnanulada_Jsonclick, 7, httpContext.getMessage( "Guia Anulada", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11jj1_client"+"'", TempTags, "", 2, "HLP_TTrn06WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaralbaran_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Albaran", ""), bttBtneliminaralbaran_Jsonclick, 7, httpContext.getMessage( "Eliminar Albaran", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e12jj1_client"+"'", TempTags, "", 2, "HLP_TTrn06WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_31_JJ2( true) ;
      }
      else
      {
         wb_table1_31_JJ2( false) ;
      }
      return  ;
   }

   public void wb_table1_31_JJ2e( boolean wbgen )
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
         startgridcontrol57( ) ;
      }
      if ( wbEnd == 57 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_57 = (int)(nGXsfl_57_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV53GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV54GridPageCount);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0083"+"", GXutil.rtrim( WebComp_Wcwctablaalbbar_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0083"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_57_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwctablaalbbar_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwctablaalbbar), GXutil.lower( WebComp_Wcwctablaalbbar_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0083"+"");
                  }
                  WebComp_Wcwctablaalbbar.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwctablaalbbar), GXutil.lower( WebComp_Wcwctablaalbbar_Component)) != 0 )
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
         ucAlbprofch_rangepicker.setProperty("Start Date", AV15AlbProFch);
         ucAlbprofch_rangepicker.setProperty("End Date", AV16AlbProFch_To);
         ucAlbprofch_rangepicker.render(context, "wwp.daterangepicker", Albprofch_rangepicker_Internalname, "ALBPROFCH_RANGEPICKERContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV51DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV51DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV21ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_90_JJ2( true) ;
      }
      else
      {
         wb_table2_90_JJ2( false) ;
      }
      return  ;
   }

   public void wb_table2_90_JJ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_95_JJ2( true) ;
      }
      else
      {
         wb_table3_95_JJ2( false) ;
      }
      return  ;
   }

   public void wb_table3_95_JJ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albprofchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_57_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albprofchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albprofchauxdate_Internalname, localUtil.format(AV33DDO_AlbProfchAuxDate, "99/99/99"), localUtil.format( AV33DDO_AlbProfchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albprofchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albprofchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn06WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 57 )
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

   public void startJJ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Guias (Header)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupJJ0( ) ;
   }

   public void wsJJ2( )
   {
      startJJ2( ) ;
      evtJJ2( ) ;
   }

   public void evtJJ2( )
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
                           e13JJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14JJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15JJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ALBPROFCH_RANGEPICKER.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16JJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17JJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18JJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNANULADA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19JJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e20JJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e21JJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e22JJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e23JJ2 ();
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
                           nGXsfl_57_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_572( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV85GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridActions), 4, 0));
                           AV76OS = httpContext.cgiGet( edtavOs_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavOs_Internalname, AV76OS);
                           A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
                           A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
                           A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
                           cmbAlbMarca.setName( cmbAlbMarca.getInternalname() );
                           cmbAlbMarca.setValue( httpContext.cgiGet( cmbAlbMarca.getInternalname()) );
                           A5140AlbMarca = httpContext.cgiGet( cmbAlbMarca.getInternalname()) ;
                           cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
                           cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
                           A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
                           A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
                           cmbAlbProAT.setName( cmbAlbProAT.getInternalname() );
                           cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
                           A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
                           cmbAlbSec.setName( cmbAlbSec.getInternalname() );
                           cmbAlbSec.setValue( httpContext.cgiGet( cmbAlbSec.getInternalname()) );
                           A2242AlbSec = httpContext.cgiGet( cmbAlbSec.getInternalname()) ;
                           cmbAlbProEst.setName( cmbAlbProEst.getInternalname() );
                           cmbAlbProEst.setValue( httpContext.cgiGet( cmbAlbProEst.getInternalname()) );
                           A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
                           A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
                           n10017AlbFmd = false ;
                           A10018ALbFmdc = httpContext.cgiGet( edtALbFmdc_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e24JJ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e25JJ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e26JJ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Albprofch Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPROFCH"), 0), AV15AlbProFch) ) )
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
                     if ( nCmpId == 83 )
                     {
                        OldWcwctablaalbbar = httpContext.cgiGet( "W0083") ;
                        if ( ( GXutil.len( OldWcwctablaalbbar) == 0 ) || ( GXutil.strcmp(OldWcwctablaalbbar, WebComp_Wcwctablaalbbar_Component) != 0 ) )
                        {
                           WebComp_Wcwctablaalbbar = WebUtils.getWebComponent(getClass(), "app." + OldWcwctablaalbbar + "_impl", remoteHandle, context);
                           WebComp_Wcwctablaalbbar_Component = OldWcwctablaalbbar ;
                        }
                        if ( GXutil.len( WebComp_Wcwctablaalbbar_Component) != 0 )
                        {
                           WebComp_Wcwctablaalbbar.componentprocess("W0083", "", sEvt);
                        }
                        WebComp_Wcwctablaalbbar_Component = OldWcwctablaalbbar ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weJJ2( )
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

   public void paJJ2( )
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
            GX_FocusControl = cmbavAlbpropri.getInternalname() ;
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
      subsflControlProps_572( ) ;
      while ( nGXsfl_57_idx <= nRC_GXsfl_57 )
      {
         sendrow_572( ) ;
         nGXsfl_57_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.Date AV15AlbProFch ,
                                 byte AV26ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ,
                                 String AV59AlbProPri ,
                                 java.util.Date AV16AlbProFch_To ,
                                 String AV84FilterFullText ,
                                 long AV28TFAlbProCod ,
                                 long AV29TFAlbProCod_To ,
                                 String AV61TFAlbProPri ,
                                 String AV62TFAlbProPri_Sel ,
                                 java.util.Date AV31TFAlbProfch ,
                                 int AV36TFGuiRemCli ,
                                 int AV37TFGuiRemCli_To ,
                                 String AV39TFGuiRemCln ,
                                 String AV40TFGuiRemCln_Sel ,
                                 GXSimpleCollection<String> AV78TFAlbMarca_Sels ,
                                 String AV45TFAlbLic ,
                                 String AV46TFAlbLic_Sel ,
                                 GXSimpleCollection<String> AV58TFAlbProAT_Sels ,
                                 GXSimpleCollection<Byte> AV69TFAlbProEst_Sels ,
                                 String AV71TFAlbFmd ,
                                 String AV72TFAlbFmd_Sel ,
                                 String AV113Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV66AlbSec )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e25JJ2 ();
      GRID_nCurrentRecord = 0 ;
      rfJJ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A5140AlbMarca, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMARCA", GXutil.rtrim( A5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A39AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRI", GXutil.rtrim( A39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A2242AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSEC", GXutil.rtrim( A2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROEST", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")));
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
      if ( cmbavAlbpropri.getItemCount() > 0 )
      {
         AV59AlbProPri = cmbavAlbpropri.getValidValue(AV59AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59AlbProPri", AV59AlbProPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbpropri.setValue( GXutil.rtrim( AV59AlbProPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfJJ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV113Pgmname = "TTrn06WW" ;
      Gx_err = (short)(0) ;
      edtavOs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOs_Enabled), 5, 0), !bGXsfl_57_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV93Ttrn06wwds_1_albpropri = AV59AlbProPri ;
      AV94Ttrn06wwds_2_albprofch = AV15AlbProFch ;
      AV95Ttrn06wwds_3_albprofch_to = AV16AlbProFch_To ;
      AV96Ttrn06wwds_4_filterfulltext = AV84FilterFullText ;
      AV97Ttrn06wwds_5_tfalbprocod = AV28TFAlbProCod ;
      AV98Ttrn06wwds_6_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV99Ttrn06wwds_7_tfalbpropri = AV61TFAlbProPri ;
      AV100Ttrn06wwds_8_tfalbpropri_sel = AV62TFAlbProPri_Sel ;
      AV101Ttrn06wwds_9_tfalbprofch = AV31TFAlbProfch ;
      AV102Ttrn06wwds_10_tfguiremcli = AV36TFGuiRemCli ;
      AV103Ttrn06wwds_11_tfguiremcli_to = AV37TFGuiRemCli_To ;
      AV104Ttrn06wwds_12_tfguiremcln = AV39TFGuiRemCln ;
      AV105Ttrn06wwds_13_tfguiremcln_sel = AV40TFGuiRemCln_Sel ;
      AV106Ttrn06wwds_14_tfalbmarca_sels = AV78TFAlbMarca_Sels ;
      AV107Ttrn06wwds_15_tfalblic = AV45TFAlbLic ;
      AV108Ttrn06wwds_16_tfalblic_sel = AV46TFAlbLic_Sel ;
      AV109Ttrn06wwds_17_tfalbproat_sels = AV58TFAlbProAT_Sels ;
      AV110Ttrn06wwds_18_tfalbproest_sels = AV69TFAlbProEst_Sels ;
      AV111Ttrn06wwds_19_tfalbfmd = AV71TFAlbFmd ;
      AV112Ttrn06wwds_20_tfalbfmd_sel = AV72TFAlbFmd_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5140AlbMarca ,
                                           AV106Ttrn06wwds_14_tfalbmarca_sels ,
                                           A10765AlbProAT ,
                                           AV109Ttrn06wwds_17_tfalbproat_sels ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV110Ttrn06wwds_18_tfalbproest_sels ,
                                           AV94Ttrn06wwds_2_albprofch ,
                                           AV95Ttrn06wwds_3_albprofch_to ,
                                           Long.valueOf(AV97Ttrn06wwds_5_tfalbprocod) ,
                                           Long.valueOf(AV98Ttrn06wwds_6_tfalbprocod_to) ,
                                           AV100Ttrn06wwds_8_tfalbpropri_sel ,
                                           AV99Ttrn06wwds_7_tfalbpropri ,
                                           AV101Ttrn06wwds_9_tfalbprofch ,
                                           Integer.valueOf(AV102Ttrn06wwds_10_tfguiremcli) ,
                                           Integer.valueOf(AV103Ttrn06wwds_11_tfguiremcli_to) ,
                                           AV105Ttrn06wwds_13_tfguiremcln_sel ,
                                           AV104Ttrn06wwds_12_tfguiremcln ,
                                           Integer.valueOf(AV106Ttrn06wwds_14_tfalbmarca_sels.size()) ,
                                           AV108Ttrn06wwds_16_tfalblic_sel ,
                                           AV107Ttrn06wwds_15_tfalblic ,
                                           Integer.valueOf(AV109Ttrn06wwds_17_tfalbproat_sels.size()) ,
                                           Integer.valueOf(AV110Ttrn06wwds_18_tfalbproest_sels.size()) ,
                                           AV112Ttrn06wwds_20_tfalbfmd_sel ,
                                           AV111Ttrn06wwds_19_tfalbfmd ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A10017AlbFmd ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV96Ttrn06wwds_4_filterfulltext ,
                                           AV93Ttrn06wwds_1_albpropri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Ttrn06wwds_7_tfalbpropri = GXutil.padr( GXutil.rtrim( AV99Ttrn06wwds_7_tfalbpropri), 1, "%") ;
      lV104Ttrn06wwds_12_tfguiremcln = GXutil.padr( GXutil.rtrim( AV104Ttrn06wwds_12_tfguiremcln), 30, "%") ;
      lV107Ttrn06wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV107Ttrn06wwds_15_tfalblic), 20, "%") ;
      lV111Ttrn06wwds_19_tfalbfmd = GXutil.concat( GXutil.rtrim( AV111Ttrn06wwds_19_tfalbfmd), "%", "") ;
      /* Using cursor H00JJ2 */
      pr_default.execute(0, new Object[] {AV93Ttrn06wwds_1_albpropri, AV94Ttrn06wwds_2_albprofch, AV95Ttrn06wwds_3_albprofch_to, Long.valueOf(AV97Ttrn06wwds_5_tfalbprocod), Long.valueOf(AV98Ttrn06wwds_6_tfalbprocod_to), lV99Ttrn06wwds_7_tfalbpropri, AV100Ttrn06wwds_8_tfalbpropri_sel, AV101Ttrn06wwds_9_tfalbprofch, Integer.valueOf(AV102Ttrn06wwds_10_tfguiremcli), Integer.valueOf(AV103Ttrn06wwds_11_tfguiremcli_to), lV104Ttrn06wwds_12_tfguiremcln, AV105Ttrn06wwds_13_tfguiremcln_sel, lV107Ttrn06wwds_15_tfalblic, AV108Ttrn06wwds_16_tfalblic_sel, lV111Ttrn06wwds_19_tfalbfmd, AV112Ttrn06wwds_20_tfalbfmd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1253EmprGuiRem = H00JJ2_A1253EmprGuiRem[0] ;
         A396EmprCod = H00JJ2_A396EmprCod[0] ;
         A10018ALbFmdc = H00JJ2_A10018ALbFmdc[0] ;
         A10017AlbFmd = H00JJ2_A10017AlbFmd[0] ;
         n10017AlbFmd = H00JJ2_n10017AlbFmd[0] ;
         A33AlbProEst = H00JJ2_A33AlbProEst[0] ;
         A2242AlbSec = H00JJ2_A2242AlbSec[0] ;
         A10765AlbProAT = H00JJ2_A10765AlbProAT[0] ;
         A7101AlbLic = H00JJ2_A7101AlbLic[0] ;
         A5805AlbEnvFtp = H00JJ2_A5805AlbEnvFtp[0] ;
         A5140AlbMarca = H00JJ2_A5140AlbMarca[0] ;
         A1244GuiRemCln = H00JJ2_A1244GuiRemCln[0] ;
         A1243GuiRemCli = H00JJ2_A1243GuiRemCli[0] ;
         A34AlbProfch = H00JJ2_A34AlbProfch[0] ;
         A39AlbProPri = H00JJ2_A39AlbProPri[0] ;
         A30AlbProCod = H00JJ2_A30AlbProCod[0] ;
         A1244GuiRemCln = H00JJ2_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV96Ttrn06wwds_4_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV96Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV96Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activo", "") , GXutil.padr( "%" + GXutil.lower( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "anulado", "") , GXutil.padr( "%" + GXutil.lower( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "automatico", "") , GXutil.padr( "%" + GXutil.lower( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "manual", "") , GXutil.padr( "%" + GXutil.lower( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "M") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s/d", "") , GXutil.padr( "%" + GXutil.lower( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "") == 0 ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV96Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10017AlbFmd) , GXutil.padr( "%" + GXutil.upper( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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

   public void rfJJ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(57) ;
      /* Execute user event: Refresh */
      e25JJ2 ();
      nGXsfl_57_idx = 1 ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_572( ) ;
      bGXsfl_57_Refreshing = true ;
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
            if ( GXutil.len( WebComp_Wcwctablaalbbar_Component) != 0 )
            {
               WebComp_Wcwctablaalbbar.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_572( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A5140AlbMarca ,
                                              AV106Ttrn06wwds_14_tfalbmarca_sels ,
                                              A10765AlbProAT ,
                                              AV109Ttrn06wwds_17_tfalbproat_sels ,
                                              Byte.valueOf(A33AlbProEst) ,
                                              AV110Ttrn06wwds_18_tfalbproest_sels ,
                                              AV94Ttrn06wwds_2_albprofch ,
                                              AV95Ttrn06wwds_3_albprofch_to ,
                                              Long.valueOf(AV97Ttrn06wwds_5_tfalbprocod) ,
                                              Long.valueOf(AV98Ttrn06wwds_6_tfalbprocod_to) ,
                                              AV100Ttrn06wwds_8_tfalbpropri_sel ,
                                              AV99Ttrn06wwds_7_tfalbpropri ,
                                              AV101Ttrn06wwds_9_tfalbprofch ,
                                              Integer.valueOf(AV102Ttrn06wwds_10_tfguiremcli) ,
                                              Integer.valueOf(AV103Ttrn06wwds_11_tfguiremcli_to) ,
                                              AV105Ttrn06wwds_13_tfguiremcln_sel ,
                                              AV104Ttrn06wwds_12_tfguiremcln ,
                                              Integer.valueOf(AV106Ttrn06wwds_14_tfalbmarca_sels.size()) ,
                                              AV108Ttrn06wwds_16_tfalblic_sel ,
                                              AV107Ttrn06wwds_15_tfalblic ,
                                              Integer.valueOf(AV109Ttrn06wwds_17_tfalbproat_sels.size()) ,
                                              Integer.valueOf(AV110Ttrn06wwds_18_tfalbproest_sels.size()) ,
                                              AV112Ttrn06wwds_20_tfalbfmd_sel ,
                                              AV111Ttrn06wwds_19_tfalbfmd ,
                                              A34AlbProfch ,
                                              Long.valueOf(A30AlbProCod) ,
                                              A39AlbProPri ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              A1244GuiRemCln ,
                                              A7101AlbLic ,
                                              A10017AlbFmd ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV96Ttrn06wwds_4_filterfulltext ,
                                              AV93Ttrn06wwds_1_albpropri } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV99Ttrn06wwds_7_tfalbpropri = GXutil.padr( GXutil.rtrim( AV99Ttrn06wwds_7_tfalbpropri), 1, "%") ;
         lV104Ttrn06wwds_12_tfguiremcln = GXutil.padr( GXutil.rtrim( AV104Ttrn06wwds_12_tfguiremcln), 30, "%") ;
         lV107Ttrn06wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV107Ttrn06wwds_15_tfalblic), 20, "%") ;
         lV111Ttrn06wwds_19_tfalbfmd = GXutil.concat( GXutil.rtrim( AV111Ttrn06wwds_19_tfalbfmd), "%", "") ;
         /* Using cursor H00JJ3 */
         pr_default.execute(1, new Object[] {AV93Ttrn06wwds_1_albpropri, AV94Ttrn06wwds_2_albprofch, AV95Ttrn06wwds_3_albprofch_to, Long.valueOf(AV97Ttrn06wwds_5_tfalbprocod), Long.valueOf(AV98Ttrn06wwds_6_tfalbprocod_to), lV99Ttrn06wwds_7_tfalbpropri, AV100Ttrn06wwds_8_tfalbpropri_sel, AV101Ttrn06wwds_9_tfalbprofch, Integer.valueOf(AV102Ttrn06wwds_10_tfguiremcli), Integer.valueOf(AV103Ttrn06wwds_11_tfguiremcli_to), lV104Ttrn06wwds_12_tfguiremcln, AV105Ttrn06wwds_13_tfguiremcln_sel, lV107Ttrn06wwds_15_tfalblic, AV108Ttrn06wwds_16_tfalblic_sel, lV111Ttrn06wwds_19_tfalbfmd, AV112Ttrn06wwds_20_tfalbfmd_sel});
         nGXsfl_57_idx = 1 ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1253EmprGuiRem = H00JJ3_A1253EmprGuiRem[0] ;
            A396EmprCod = H00JJ3_A396EmprCod[0] ;
            A10018ALbFmdc = H00JJ3_A10018ALbFmdc[0] ;
            A10017AlbFmd = H00JJ3_A10017AlbFmd[0] ;
            n10017AlbFmd = H00JJ3_n10017AlbFmd[0] ;
            A33AlbProEst = H00JJ3_A33AlbProEst[0] ;
            A2242AlbSec = H00JJ3_A2242AlbSec[0] ;
            A10765AlbProAT = H00JJ3_A10765AlbProAT[0] ;
            A7101AlbLic = H00JJ3_A7101AlbLic[0] ;
            A5805AlbEnvFtp = H00JJ3_A5805AlbEnvFtp[0] ;
            A5140AlbMarca = H00JJ3_A5140AlbMarca[0] ;
            A1244GuiRemCln = H00JJ3_A1244GuiRemCln[0] ;
            A1243GuiRemCli = H00JJ3_A1243GuiRemCli[0] ;
            A34AlbProfch = H00JJ3_A34AlbProfch[0] ;
            A39AlbProPri = H00JJ3_A39AlbProPri[0] ;
            A30AlbProCod = H00JJ3_A30AlbProCod[0] ;
            A1244GuiRemCln = H00JJ3_A1244GuiRemCln[0] ;
            if ( (GXutil.strcmp("", AV96Ttrn06wwds_4_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV96Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV96Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activo", "") , GXutil.padr( "%" + GXutil.lower( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "anulado", "") , GXutil.padr( "%" + GXutil.lower( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "automatico", "") , GXutil.padr( "%" + GXutil.lower( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "manual", "") , GXutil.padr( "%" + GXutil.lower( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "M") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s/d", "") , GXutil.padr( "%" + GXutil.lower( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "") == 0 ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV96Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10017AlbFmd) , GXutil.padr( "%" + GXutil.upper( AV96Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               e26JJ2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(57) ;
         wbJJ0( ) ;
      }
      bGXsfl_57_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesJJ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV113Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV113Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV66AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBMARCA"+"_"+sGXsfl_57_idx, getSecureSignedToken( sGXsfl_57_idx, GXutil.rtrim( localUtil.format( A5140AlbMarca, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROPRI"+"_"+sGXsfl_57_idx, getSecureSignedToken( sGXsfl_57_idx, GXutil.rtrim( localUtil.format( A39AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBSEC"+"_"+sGXsfl_57_idx, getSecureSignedToken( sGXsfl_57_idx, GXutil.rtrim( localUtil.format( A2242AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROEST"+"_"+sGXsfl_57_idx, getSecureSignedToken( sGXsfl_57_idx, localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9")));
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
      AV93Ttrn06wwds_1_albpropri = AV59AlbProPri ;
      AV94Ttrn06wwds_2_albprofch = AV15AlbProFch ;
      AV95Ttrn06wwds_3_albprofch_to = AV16AlbProFch_To ;
      AV96Ttrn06wwds_4_filterfulltext = AV84FilterFullText ;
      AV97Ttrn06wwds_5_tfalbprocod = AV28TFAlbProCod ;
      AV98Ttrn06wwds_6_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV99Ttrn06wwds_7_tfalbpropri = AV61TFAlbProPri ;
      AV100Ttrn06wwds_8_tfalbpropri_sel = AV62TFAlbProPri_Sel ;
      AV101Ttrn06wwds_9_tfalbprofch = AV31TFAlbProfch ;
      AV102Ttrn06wwds_10_tfguiremcli = AV36TFGuiRemCli ;
      AV103Ttrn06wwds_11_tfguiremcli_to = AV37TFGuiRemCli_To ;
      AV104Ttrn06wwds_12_tfguiremcln = AV39TFGuiRemCln ;
      AV105Ttrn06wwds_13_tfguiremcln_sel = AV40TFGuiRemCln_Sel ;
      AV106Ttrn06wwds_14_tfalbmarca_sels = AV78TFAlbMarca_Sels ;
      AV107Ttrn06wwds_15_tfalblic = AV45TFAlbLic ;
      AV108Ttrn06wwds_16_tfalblic_sel = AV46TFAlbLic_Sel ;
      AV109Ttrn06wwds_17_tfalbproat_sels = AV58TFAlbProAT_Sels ;
      AV110Ttrn06wwds_18_tfalbproest_sels = AV69TFAlbProEst_Sels ;
      AV111Ttrn06wwds_19_tfalbfmd = AV71TFAlbFmd ;
      AV112Ttrn06wwds_20_tfalbfmd_sel = AV72TFAlbFmd_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15AlbProFch, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV59AlbProPri, AV16AlbProFch_To, AV84FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV61TFAlbProPri, AV62TFAlbProPri_Sel, AV31TFAlbProfch, AV36TFGuiRemCli, AV37TFGuiRemCli_To, AV39TFGuiRemCln, AV40TFGuiRemCln_Sel, AV78TFAlbMarca_Sels, AV45TFAlbLic, AV46TFAlbLic_Sel, AV58TFAlbProAT_Sels, AV69TFAlbProEst_Sels, AV71TFAlbFmd, AV72TFAlbFmd_Sel, AV113Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66AlbSec) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV93Ttrn06wwds_1_albpropri = AV59AlbProPri ;
      AV94Ttrn06wwds_2_albprofch = AV15AlbProFch ;
      AV95Ttrn06wwds_3_albprofch_to = AV16AlbProFch_To ;
      AV96Ttrn06wwds_4_filterfulltext = AV84FilterFullText ;
      AV97Ttrn06wwds_5_tfalbprocod = AV28TFAlbProCod ;
      AV98Ttrn06wwds_6_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV99Ttrn06wwds_7_tfalbpropri = AV61TFAlbProPri ;
      AV100Ttrn06wwds_8_tfalbpropri_sel = AV62TFAlbProPri_Sel ;
      AV101Ttrn06wwds_9_tfalbprofch = AV31TFAlbProfch ;
      AV102Ttrn06wwds_10_tfguiremcli = AV36TFGuiRemCli ;
      AV103Ttrn06wwds_11_tfguiremcli_to = AV37TFGuiRemCli_To ;
      AV104Ttrn06wwds_12_tfguiremcln = AV39TFGuiRemCln ;
      AV105Ttrn06wwds_13_tfguiremcln_sel = AV40TFGuiRemCln_Sel ;
      AV106Ttrn06wwds_14_tfalbmarca_sels = AV78TFAlbMarca_Sels ;
      AV107Ttrn06wwds_15_tfalblic = AV45TFAlbLic ;
      AV108Ttrn06wwds_16_tfalblic_sel = AV46TFAlbLic_Sel ;
      AV109Ttrn06wwds_17_tfalbproat_sels = AV58TFAlbProAT_Sels ;
      AV110Ttrn06wwds_18_tfalbproest_sels = AV69TFAlbProEst_Sels ;
      AV111Ttrn06wwds_19_tfalbfmd = AV71TFAlbFmd ;
      AV112Ttrn06wwds_20_tfalbfmd_sel = AV72TFAlbFmd_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15AlbProFch, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV59AlbProPri, AV16AlbProFch_To, AV84FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV61TFAlbProPri, AV62TFAlbProPri_Sel, AV31TFAlbProfch, AV36TFGuiRemCli, AV37TFGuiRemCli_To, AV39TFGuiRemCln, AV40TFGuiRemCln_Sel, AV78TFAlbMarca_Sels, AV45TFAlbLic, AV46TFAlbLic_Sel, AV58TFAlbProAT_Sels, AV69TFAlbProEst_Sels, AV71TFAlbFmd, AV72TFAlbFmd_Sel, AV113Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66AlbSec) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV93Ttrn06wwds_1_albpropri = AV59AlbProPri ;
      AV94Ttrn06wwds_2_albprofch = AV15AlbProFch ;
      AV95Ttrn06wwds_3_albprofch_to = AV16AlbProFch_To ;
      AV96Ttrn06wwds_4_filterfulltext = AV84FilterFullText ;
      AV97Ttrn06wwds_5_tfalbprocod = AV28TFAlbProCod ;
      AV98Ttrn06wwds_6_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV99Ttrn06wwds_7_tfalbpropri = AV61TFAlbProPri ;
      AV100Ttrn06wwds_8_tfalbpropri_sel = AV62TFAlbProPri_Sel ;
      AV101Ttrn06wwds_9_tfalbprofch = AV31TFAlbProfch ;
      AV102Ttrn06wwds_10_tfguiremcli = AV36TFGuiRemCli ;
      AV103Ttrn06wwds_11_tfguiremcli_to = AV37TFGuiRemCli_To ;
      AV104Ttrn06wwds_12_tfguiremcln = AV39TFGuiRemCln ;
      AV105Ttrn06wwds_13_tfguiremcln_sel = AV40TFGuiRemCln_Sel ;
      AV106Ttrn06wwds_14_tfalbmarca_sels = AV78TFAlbMarca_Sels ;
      AV107Ttrn06wwds_15_tfalblic = AV45TFAlbLic ;
      AV108Ttrn06wwds_16_tfalblic_sel = AV46TFAlbLic_Sel ;
      AV109Ttrn06wwds_17_tfalbproat_sels = AV58TFAlbProAT_Sels ;
      AV110Ttrn06wwds_18_tfalbproest_sels = AV69TFAlbProEst_Sels ;
      AV111Ttrn06wwds_19_tfalbfmd = AV71TFAlbFmd ;
      AV112Ttrn06wwds_20_tfalbfmd_sel = AV72TFAlbFmd_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15AlbProFch, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV59AlbProPri, AV16AlbProFch_To, AV84FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV61TFAlbProPri, AV62TFAlbProPri_Sel, AV31TFAlbProfch, AV36TFGuiRemCli, AV37TFGuiRemCli_To, AV39TFGuiRemCln, AV40TFGuiRemCln_Sel, AV78TFAlbMarca_Sels, AV45TFAlbLic, AV46TFAlbLic_Sel, AV58TFAlbProAT_Sels, AV69TFAlbProEst_Sels, AV71TFAlbFmd, AV72TFAlbFmd_Sel, AV113Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66AlbSec) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV93Ttrn06wwds_1_albpropri = AV59AlbProPri ;
      AV94Ttrn06wwds_2_albprofch = AV15AlbProFch ;
      AV95Ttrn06wwds_3_albprofch_to = AV16AlbProFch_To ;
      AV96Ttrn06wwds_4_filterfulltext = AV84FilterFullText ;
      AV97Ttrn06wwds_5_tfalbprocod = AV28TFAlbProCod ;
      AV98Ttrn06wwds_6_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV99Ttrn06wwds_7_tfalbpropri = AV61TFAlbProPri ;
      AV100Ttrn06wwds_8_tfalbpropri_sel = AV62TFAlbProPri_Sel ;
      AV101Ttrn06wwds_9_tfalbprofch = AV31TFAlbProfch ;
      AV102Ttrn06wwds_10_tfguiremcli = AV36TFGuiRemCli ;
      AV103Ttrn06wwds_11_tfguiremcli_to = AV37TFGuiRemCli_To ;
      AV104Ttrn06wwds_12_tfguiremcln = AV39TFGuiRemCln ;
      AV105Ttrn06wwds_13_tfguiremcln_sel = AV40TFGuiRemCln_Sel ;
      AV106Ttrn06wwds_14_tfalbmarca_sels = AV78TFAlbMarca_Sels ;
      AV107Ttrn06wwds_15_tfalblic = AV45TFAlbLic ;
      AV108Ttrn06wwds_16_tfalblic_sel = AV46TFAlbLic_Sel ;
      AV109Ttrn06wwds_17_tfalbproat_sels = AV58TFAlbProAT_Sels ;
      AV110Ttrn06wwds_18_tfalbproest_sels = AV69TFAlbProEst_Sels ;
      AV111Ttrn06wwds_19_tfalbfmd = AV71TFAlbFmd ;
      AV112Ttrn06wwds_20_tfalbfmd_sel = AV72TFAlbFmd_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15AlbProFch, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV59AlbProPri, AV16AlbProFch_To, AV84FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV61TFAlbProPri, AV62TFAlbProPri_Sel, AV31TFAlbProfch, AV36TFGuiRemCli, AV37TFGuiRemCli_To, AV39TFGuiRemCln, AV40TFGuiRemCln_Sel, AV78TFAlbMarca_Sels, AV45TFAlbLic, AV46TFAlbLic_Sel, AV58TFAlbProAT_Sels, AV69TFAlbProEst_Sels, AV71TFAlbFmd, AV72TFAlbFmd_Sel, AV113Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66AlbSec) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV93Ttrn06wwds_1_albpropri = AV59AlbProPri ;
      AV94Ttrn06wwds_2_albprofch = AV15AlbProFch ;
      AV95Ttrn06wwds_3_albprofch_to = AV16AlbProFch_To ;
      AV96Ttrn06wwds_4_filterfulltext = AV84FilterFullText ;
      AV97Ttrn06wwds_5_tfalbprocod = AV28TFAlbProCod ;
      AV98Ttrn06wwds_6_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV99Ttrn06wwds_7_tfalbpropri = AV61TFAlbProPri ;
      AV100Ttrn06wwds_8_tfalbpropri_sel = AV62TFAlbProPri_Sel ;
      AV101Ttrn06wwds_9_tfalbprofch = AV31TFAlbProfch ;
      AV102Ttrn06wwds_10_tfguiremcli = AV36TFGuiRemCli ;
      AV103Ttrn06wwds_11_tfguiremcli_to = AV37TFGuiRemCli_To ;
      AV104Ttrn06wwds_12_tfguiremcln = AV39TFGuiRemCln ;
      AV105Ttrn06wwds_13_tfguiremcln_sel = AV40TFGuiRemCln_Sel ;
      AV106Ttrn06wwds_14_tfalbmarca_sels = AV78TFAlbMarca_Sels ;
      AV107Ttrn06wwds_15_tfalblic = AV45TFAlbLic ;
      AV108Ttrn06wwds_16_tfalblic_sel = AV46TFAlbLic_Sel ;
      AV109Ttrn06wwds_17_tfalbproat_sels = AV58TFAlbProAT_Sels ;
      AV110Ttrn06wwds_18_tfalbproest_sels = AV69TFAlbProEst_Sels ;
      AV111Ttrn06wwds_19_tfalbfmd = AV71TFAlbFmd ;
      AV112Ttrn06wwds_20_tfalbfmd_sel = AV72TFAlbFmd_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15AlbProFch, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV59AlbProPri, AV16AlbProFch_To, AV84FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV61TFAlbProPri, AV62TFAlbProPri_Sel, AV31TFAlbProfch, AV36TFGuiRemCli, AV37TFGuiRemCli_To, AV39TFGuiRemCln, AV40TFGuiRemCln_Sel, AV78TFAlbMarca_Sels, AV45TFAlbLic, AV46TFAlbLic_Sel, AV58TFAlbProAT_Sels, AV69TFAlbProEst_Sels, AV71TFAlbFmd, AV72TFAlbFmd_Sel, AV113Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66AlbSec) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV113Pgmname = "TTrn06WW" ;
      Gx_err = (short)(0) ;
      edtavOs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOs_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupJJ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e24JJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV24ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV51DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV21ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_57"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV53GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV54GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV15AlbProFch = localUtil.ctod( httpContext.cgiGet( "vALBPROFCH"), 0) ;
         AV16AlbProFch_To = localUtil.ctod( httpContext.cgiGet( "vALBPROFCH_TO"), 0) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         AV66AlbSec = httpContext.cgiGet( "vALBSEC") ;
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
         Dvelop_confirmpanel_btnanulada_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNANULADA_Title") ;
         Dvelop_confirmpanel_btnanulada_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNANULADA_Confirmationtext") ;
         Dvelop_confirmpanel_btnanulada_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNANULADA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnanulada_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNANULADA_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnanulada_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNANULADA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnanulada_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNANULADA_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnanulada_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNANULADA_Confirmtype") ;
         Dvelop_confirmpanel_btneliminaralbaran_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Title") ;
         Dvelop_confirmpanel_btneliminaralbaran_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Confirmationtext") ;
         Dvelop_confirmpanel_btneliminaralbaran_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btneliminaralbaran_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Nobuttoncaption") ;
         Dvelop_confirmpanel_btneliminaralbaran_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btneliminaralbaran_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Yesbuttonposition") ;
         Dvelop_confirmpanel_btneliminaralbaran_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Confirmtype") ;
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
         Dvelop_confirmpanel_btnanulada_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNANULADA_Result") ;
         Dvelop_confirmpanel_btneliminaralbaran_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN_Result") ;
         /* Read variables values. */
         cmbavAlbpropri.setName( cmbavAlbpropri.getInternalname() );
         cmbavAlbpropri.setValue( httpContext.cgiGet( cmbavAlbpropri.getInternalname()) );
         AV59AlbProPri = httpContext.cgiGet( cmbavAlbpropri.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59AlbProPri", AV59AlbProPri);
         AV86AlbProFch_RangeText = httpContext.cgiGet( edtavAlbprofch_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86AlbProFch_RangeText", AV86AlbProFch_RangeText);
         AV84FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84FilterFullText", AV84FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albprofchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBPROFCHAUXDATE");
            GX_FocusControl = edtavDdo_albprofchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33DDO_AlbProfchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33DDO_AlbProfchAuxDate", localUtil.format(AV33DDO_AlbProfchAuxDate, "99/99/99"));
         }
         else
         {
            AV33DDO_AlbProfchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albprofchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33DDO_AlbProfchAuxDate", localUtil.format(AV33DDO_AlbProfchAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_57_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
         if ( nGXsfl_57_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV85GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridActions), 4, 0));
            AV76OS = httpContext.cgiGet( edtavOs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavOs_Internalname, AV76OS);
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
            A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
            cmbAlbMarca.setName( cmbAlbMarca.getInternalname() );
            cmbAlbMarca.setValue( httpContext.cgiGet( cmbAlbMarca.getInternalname()) );
            A5140AlbMarca = httpContext.cgiGet( cmbAlbMarca.getInternalname()) ;
            cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
            cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            cmbAlbProAT.setName( cmbAlbProAT.getInternalname() );
            cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
            A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
            cmbAlbSec.setName( cmbAlbSec.getInternalname() );
            cmbAlbSec.setValue( httpContext.cgiGet( cmbAlbSec.getInternalname()) );
            A2242AlbSec = httpContext.cgiGet( cmbAlbSec.getInternalname()) ;
            cmbAlbProEst.setName( cmbAlbProEst.getInternalname() );
            cmbAlbProEst.setValue( httpContext.cgiGet( cmbAlbProEst.getInternalname()) );
            A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
            A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
            n10017AlbFmd = false ;
            A10018ALbFmdc = httpContext.cgiGet( edtALbFmdc_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPROFCH"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV15AlbProFch)) ) )
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
      e24JJ2 ();
      if (returnInSub) return;
   }

   public void e24JJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV89Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttrn06ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV89Station = GXt_char1 ;
      GXv_char2[0] = AV90Emprcod ;
      GXv_char3[0] = AV91Emprnom ;
      GXv_char4[0] = AV92Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV89Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn06ww_impl.this.AV90Emprcod = GXv_char2[0] ;
      ttrn06ww_impl.this.AV91Emprnom = GXv_char3[0] ;
      ttrn06ww_impl.this.AV92Usurcod = GXv_char4[0] ;
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
      this.executeUsercontrolMethod("", false, "ALBPROFCH_RANGEPICKERContainer", "Attach", "", new Object[] {edtavAlbprofch_rangetext_Internalname});
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Guias (Header)", "") );
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
         bDynCreated_Wcwctablaalbbar = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwctablaalbbar_Component), GXutil.lower( "WCTablaAlbbar")) != 0 )
      {
         WebComp_Wcwctablaalbbar = WebUtils.getWebComponent(getClass(), "app.wctablaalbbar_impl", remoteHandle, context);
         WebComp_Wcwctablaalbbar_Component = "WCTablaAlbbar" ;
      }
      if ( GXutil.len( WebComp_Wcwctablaalbbar_Component) != 0 )
      {
         WebComp_Wcwctablaalbbar.setjustcreated();
         WebComp_Wcwctablaalbbar.componentprepare(new Object[] {"W0083","",A396EmprCod,Long.valueOf(A30AlbProCod)});
         WebComp_Wcwctablaalbbar.componentbind(new Object[] {"",""});
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV51DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV51DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e25JJ2( )
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
      if ( AV26ManageFiltersExecutionStep == 1 )
      {
         AV26ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV26ManageFiltersExecutionStep == 2 )
      {
         AV26ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV23Session.getValue("TTrn06WWColumnsSelector"), "") != 0 )
      {
         AV19ColumnsSelectorXML = AV23Session.getValue("TTrn06WWColumnsSelector") ;
         AV21ColumnsSelector.fromxml(AV19ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtAlbProCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtAlbProPri_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtAlbProfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtGuiRemCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtGuiRemCln_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Visible), 5, 0), !bGXsfl_57_Refreshing);
      cmbAlbMarca.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbMarca.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbMarca.getVisible(), 5, 0), !bGXsfl_57_Refreshing);
      edtAlbLic_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Visible), 5, 0), !bGXsfl_57_Refreshing);
      cmbAlbProAT.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProAT.getVisible(), 5, 0), !bGXsfl_57_Refreshing);
      cmbAlbProEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProEst.getVisible(), 5, 0), !bGXsfl_57_Refreshing);
      edtAlbFmd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFmd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFmd_Visible), 5, 0), !bGXsfl_57_Refreshing);
      AV53GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridCurrentPage), 10, 0));
      AV54GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridPageCount), 10, 0));
      AV93Ttrn06wwds_1_albpropri = AV59AlbProPri ;
      AV94Ttrn06wwds_2_albprofch = AV15AlbProFch ;
      AV95Ttrn06wwds_3_albprofch_to = AV16AlbProFch_To ;
      AV96Ttrn06wwds_4_filterfulltext = AV84FilterFullText ;
      AV97Ttrn06wwds_5_tfalbprocod = AV28TFAlbProCod ;
      AV98Ttrn06wwds_6_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV99Ttrn06wwds_7_tfalbpropri = AV61TFAlbProPri ;
      AV100Ttrn06wwds_8_tfalbpropri_sel = AV62TFAlbProPri_Sel ;
      AV101Ttrn06wwds_9_tfalbprofch = AV31TFAlbProfch ;
      AV102Ttrn06wwds_10_tfguiremcli = AV36TFGuiRemCli ;
      AV103Ttrn06wwds_11_tfguiremcli_to = AV37TFGuiRemCli_To ;
      AV104Ttrn06wwds_12_tfguiremcln = AV39TFGuiRemCln ;
      AV105Ttrn06wwds_13_tfguiremcln_sel = AV40TFGuiRemCln_Sel ;
      AV106Ttrn06wwds_14_tfalbmarca_sels = AV78TFAlbMarca_Sels ;
      AV107Ttrn06wwds_15_tfalblic = AV45TFAlbLic ;
      AV108Ttrn06wwds_16_tfalblic_sel = AV46TFAlbLic_Sel ;
      AV109Ttrn06wwds_17_tfalbproat_sels = AV58TFAlbProAT_Sels ;
      AV110Ttrn06wwds_18_tfalbproest_sels = AV69TFAlbProEst_Sels ;
      AV111Ttrn06wwds_19_tfalbfmd = AV71TFAlbFmd ;
      AV112Ttrn06wwds_20_tfalbfmd_sel = AV72TFAlbFmd_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ManageFiltersData", AV24ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e14JJ2( )
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
         AV52PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV52PageToGo) ;
      }
   }

   public void e15JJ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e17JJ2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCod") == 0 )
         {
            AV28TFAlbProCod = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbProCod), 10, 0));
            AV29TFAlbProCod_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProPri") == 0 )
         {
            AV61TFAlbProPri = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbProPri", AV61TFAlbProPri);
            AV62TFAlbProPri_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbProPri_Sel", AV62TFAlbProPri_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProfch") == 0 )
         {
            AV31TFAlbProfch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbProfch", localUtil.format(AV31TFAlbProfch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiRemCli") == 0 )
         {
            AV36TFGuiRemCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFGuiRemCli), 6, 0));
            AV37TFGuiRemCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFGuiRemCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiRemCln") == 0 )
         {
            AV39TFGuiRemCln = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFGuiRemCln", AV39TFGuiRemCln);
            AV40TFGuiRemCln_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFGuiRemCln_Sel", AV40TFGuiRemCln_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbMarca") == 0 )
         {
            AV77TFAlbMarca_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFAlbMarca_SelsJson", AV77TFAlbMarca_SelsJson);
            AV78TFAlbMarca_Sels.fromJSonString(AV77TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbLic") == 0 )
         {
            AV45TFAlbLic = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbLic", AV45TFAlbLic);
            AV46TFAlbLic_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbLic_Sel", AV46TFAlbLic_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProAT") == 0 )
         {
            AV57TFAlbProAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbProAT_SelsJson", AV57TFAlbProAT_SelsJson);
            AV58TFAlbProAT_Sels.fromJSonString(AV57TFAlbProAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProEst") == 0 )
         {
            AV68TFAlbProEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFAlbProEst_SelsJson", AV68TFAlbProEst_SelsJson);
            AV69TFAlbProEst_Sels.fromJSonString(GXutil.strReplace( AV68TFAlbProEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbFmd") == 0 )
         {
            AV71TFAlbFmd = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbFmd", AV71TFAlbFmd);
            AV72TFAlbFmd_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFAlbFmd_Sel", AV72TFAlbFmd_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV69TFAlbProEst_Sels", AV69TFAlbProEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV58TFAlbProAT_Sels", AV58TFAlbProAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78TFAlbMarca_Sels", AV78TFAlbMarca_Sels);
   }

   private void e26JJ2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV55Update = "<i class=\"fa fa-pen\"></i>" ;
         AV76OS = httpContext.getMessage( "Oss", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavOs_Internalname, AV76OS);
         if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 )
         {
         }
         else
         {
            if ( ( GXutil.strcmp(A7101AlbLic, "") != 0 ) || ( A5805AlbEnvFtp == 3 ) )
            {
               /* * Property Link not supported in */
               /* * Property Link not supported in */
               /* * Property Link not supported in */
               /* * Property Link not supported in */
               /*
                  Assignment error:
                  ================
                  Expression: [ t('link(',1),t(o(0,'TTrn06'),28),t(',',7),t([ 68,'Display' ],44),t(',',7),t(396,2),t(',',7),t(30,2),t(',',7),t('Albpropri',23),t(',',7),t(2242,2),t(')',4) ]
                  Target    : [ t('Update',23),t('Link',3) ]
                  ForType   : 29
                  Type      : []
               */
               edtavOs_Link = formatLink("app.ttrn07", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"})  ;
            }
            else
            {
               /* * Property Link not supported in */
               /* * Property Link not supported in */
               /* * Property Link not supported in */
               /* * Property Link not supported in */
               /*
                  Assignment error:
                  ================
                  Expression: [ t('link(',1),t(o(0,'TTrn06'),28),t(',',7),t([ 68,'Update' ],44),t(',',7),t(396,2),t(',',7),t(30,2),t(',',7),t('Albpropri',23),t(',',7),t(2242,2),t(')',4) ]
                  Target    : [ t('Update',23),t('Link',3) ]
                  ForType   : 29
                  Type      : []
               */
               edtavOs_Link = formatLink("app.ttrn07", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"})  ;
            }
         }
         if ( 0 > 1 )
         {
            cmbavGridactions.removeAllItems();
            cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
            cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
            cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
            AV76OS = httpContext.getMessage( "OSs", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavOs_Internalname, AV76OS);
            edtAlbProPri_Link = formatLink("app.ttrn06view", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","AlbProCod","TabCode"})  ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(57) ;
         }
         sendrow_572( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_57_Refreshing )
      {
         httpContext.doAjaxLoad(57, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV85GridActions, 4, 0)) );
   }

   public void e18JJ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV19ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV21ColumnsSelector.fromJSonString(AV19ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TTrn06WWColumnsSelector", ((GXutil.strcmp("", AV19ColumnsSelectorXML)==0) ? "" : AV21ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ManageFiltersData", AV24ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e13JJ2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TTrn06WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV113Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV26ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TTrn06WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV26ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV25ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TTrn06WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         ttrn06ww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV25ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV25ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV113Pgmname+"GridState", AV25ManageFiltersXml) ;
            AV10GridState.fromxml(AV25ManageFiltersXml, null, null);
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
      cmbavAlbpropri.setValue( GXutil.rtrim( AV59AlbProPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78TFAlbMarca_Sels", AV78TFAlbMarca_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV58TFAlbProAT_Sels", AV58TFAlbProAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV69TFAlbProEst_Sels", AV69TFAlbProEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ManageFiltersData", AV24ManageFiltersData);
   }

   public void e19JJ2( )
   {
      /* Dvelop_confirmpanel_btnanulada_Close Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Dvelop_confirmpanel_btnanulada_Result, "Yes") == 0 ) && ( GXutil.strcmp(A5140AlbMarca, "A") == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A30AlbProCod ;
         GXv_int9[0] = A1243GuiRemCli ;
         new app.pbajalc(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9) ;
         ttrn06ww_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn06ww_impl.this.A30AlbProCod = GXv_int8[0] ;
         ttrn06ww_impl.this.A1243GuiRemCli = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         callWebObject(formatLink("app.ttrn06", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(A39AlbProPri)),GXutil.URLEncode(GXutil.rtrim(A2242AlbSec))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","AlbSec"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e20JJ2( )
   {
      /* Dvelop_confirmpanel_btneliminaralbaran_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btneliminaralbaran_Result, "Yes") == 0 )
      {
         if ( ! (0==A30AlbProCod) )
         {
            if ( A33AlbProEst == 2 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento Facturado", ""));
            }
            else
            {
               AV83ok = httpContext.getMessage( "S", "") ;
               if ( GXutil.strcmp(AV83ok, httpContext.getMessage( "S", "")) == 0 )
               {
                  GXv_char4[0] = A396EmprCod ;
                  GXv_int8[0] = A30AlbProCod ;
                  GXv_int10[0] = (byte)(1) ;
                  new app.pdelaln(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int10) ;
                  ttrn06ww_impl.this.A396EmprCod = GXv_char4[0] ;
                  ttrn06ww_impl.this.A30AlbProCod = GXv_int8[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                  gxgrgrid_refresh( subGrid_Rows, AV15AlbProFch, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV59AlbProPri, AV16AlbProFch_To, AV84FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV61TFAlbProPri, AV62TFAlbProPri_Sel, AV31TFAlbProfch, AV36TFGuiRemCli, AV37TFGuiRemCli_To, AV39TFGuiRemCln, AV40TFGuiRemCln_Sel, AV78TFAlbMarca_Sels, AV45TFAlbLic, AV46TFAlbLic_Sel, AV58TFAlbProAT_Sels, AV69TFAlbProEst_Sels, AV71TFAlbFmd, AV72TFAlbFmd_Sel, AV113Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66AlbSec) ;
               }
               if ( GXutil.strcmp(AV83ok, httpContext.getMessage( "S", "")) == 0 )
               {
                  httpContext.doAjaxRefresh();
               }
            }
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ManageFiltersData", AV24ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e21JJ2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttrn06", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV59AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV66AlbSec))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","AlbSec"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      callWebObject(formatLink("app.ttrn06", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV59AlbProPri)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "N", "")))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","AlbSec"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e22JJ2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV17ExcelFilename ;
      GXv_char3[0] = AV18ErrorMessage ;
      new app.ttrn06wwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      ttrn06ww_impl.this.AV17ExcelFilename = GXv_char4[0] ;
      ttrn06ww_impl.this.AV18ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV17ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV17ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV18ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV69TFAlbProEst_Sels", AV69TFAlbProEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV58TFAlbProAT_Sels", AV58TFAlbProAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78TFAlbMarca_Sels", AV78TFAlbMarca_Sels);
      cmbavAlbpropri.setValue( GXutil.rtrim( AV59AlbProPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
   }

   public void e23JJ2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.ttrn06wwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV69TFAlbProEst_Sels", AV69TFAlbProEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV58TFAlbProAT_Sels", AV58TFAlbProAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78TFAlbMarca_Sels", AV78TFAlbMarca_Sels);
      cmbavAlbpropri.setValue( GXutil.rtrim( AV59AlbProPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
   }

   public void e16JJ2( )
   {
      /* Albprofch_rangepicker_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15AlbProFch", localUtil.format(AV15AlbProFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV16AlbProFch_To", localUtil.format(AV16AlbProFch_To, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV15AlbProFch, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV59AlbProPri, AV16AlbProFch_To, AV84FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV61TFAlbProPri, AV62TFAlbProPri_Sel, AV31TFAlbProfch, AV36TFGuiRemCli, AV37TFGuiRemCli_To, AV39TFGuiRemCln, AV40TFGuiRemCln_Sel, AV78TFAlbMarca_Sels, AV45TFAlbLic, AV46TFAlbLic_Sel, AV58TFAlbProAT_Sels, AV69TFAlbProEst_Sels, AV71TFAlbFmd, AV72TFAlbFmd_Sel, AV113Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66AlbSec) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ManageFiltersData", AV24ManageFiltersData);
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
      AV21ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "AlbProCod", "", "Nº Guia", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "AlbProPri", "", "P", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "AlbProfch", "", "Data", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "GuiRemCli", "", "Cliente", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "GuiRemCln", "", "Nome", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "AlbMarca", "", "", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "AlbLic", "", "Codigo AT", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "AlbProAT", "", "", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "AlbProEst", "", "E", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "AlbFmd", "", "Hash", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXt_char1 = AV20UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTrn06WWColumnsSelector", GXv_char4) ;
      ttrn06ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV20UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV22ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector12[0] = AV21ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, GXv_SdtWWPColumnsSelector12) ;
         AV22ColumnsSelectorAux = GXv_SdtWWPColumnsSelector11[0] ;
         AV21ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = AV24ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TTrn06WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[0] ;
      AV24ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV59AlbProPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59AlbProPri", AV59AlbProPri);
      AV15AlbProFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15AlbProFch", localUtil.format(AV15AlbProFch, "99/99/99"));
      AV16AlbProFch_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16AlbProFch_To", localUtil.format(AV16AlbProFch_To, "99/99/99"));
      AV84FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84FilterFullText", AV84FilterFullText);
      AV28TFAlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbProCod), 10, 0));
      AV29TFAlbProCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAlbProCod_To), 10, 0));
      AV61TFAlbProPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbProPri", AV61TFAlbProPri);
      AV62TFAlbProPri_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbProPri_Sel", AV62TFAlbProPri_Sel);
      AV31TFAlbProfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbProfch", localUtil.format(AV31TFAlbProfch, "99/99/99"));
      AV36TFGuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFGuiRemCli), 6, 0));
      AV37TFGuiRemCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFGuiRemCli_To), 6, 0));
      AV39TFGuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFGuiRemCln", AV39TFGuiRemCln);
      AV40TFGuiRemCln_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFGuiRemCln_Sel", AV40TFGuiRemCln_Sel);
      AV78TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV45TFAlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbLic", AV45TFAlbLic);
      AV46TFAlbLic_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbLic_Sel", AV46TFAlbLic_Sel);
      AV58TFAlbProAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV69TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV71TFAlbFmd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbFmd", AV71TFAlbFmd);
      AV72TFAlbFmd_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFAlbFmd_Sel", AV72TFAlbFmd_Sel);
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
      callWebObject(formatLink("app.ttrn06", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV59AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV66AlbSec))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","AlbSec"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttrn06", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV59AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV66AlbSec))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","AlbSec"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue(AV113Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV113Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV23Session.getValue(AV113Pgmname+"GridState"), null, null);
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
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROPRI") == 0 )
         {
            AV59AlbProPri = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59AlbProPri", AV59AlbProPri);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROFCH") == 0 )
         {
            AV15AlbProFch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15AlbProFch", localUtil.format(AV15AlbProFch, "99/99/99"));
            AV16AlbProFch_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16AlbProFch_To", localUtil.format(AV16AlbProFch_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV84FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84FilterFullText", AV84FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV28TFAlbProCod = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbProCod), 10, 0));
            AV29TFAlbProCod_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI") == 0 )
         {
            AV61TFAlbProPri = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbProPri", AV61TFAlbProPri);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI_SEL") == 0 )
         {
            AV62TFAlbProPri_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbProPri_Sel", AV62TFAlbProPri_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV31TFAlbProfch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbProfch", localUtil.format(AV31TFAlbProfch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV36TFGuiRemCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFGuiRemCli), 6, 0));
            AV37TFGuiRemCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFGuiRemCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV39TFGuiRemCln = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFGuiRemCln", AV39TFGuiRemCln);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV40TFGuiRemCln_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFGuiRemCln_Sel", AV40TFGuiRemCln_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMARCA_SEL") == 0 )
         {
            AV77TFAlbMarca_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFAlbMarca_SelsJson", AV77TFAlbMarca_SelsJson);
            AV78TFAlbMarca_Sels.fromJSonString(AV77TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV45TFAlbLic = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbLic", AV45TFAlbLic);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV46TFAlbLic_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbLic_Sel", AV46TFAlbLic_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROAT_SEL") == 0 )
         {
            AV57TFAlbProAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbProAT_SelsJson", AV57TFAlbProAT_SelsJson);
            AV58TFAlbProAT_Sels.fromJSonString(AV57TFAlbProAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV68TFAlbProEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFAlbProEst_SelsJson", AV68TFAlbProEst_SelsJson);
            AV69TFAlbProEst_Sels.fromJSonString(AV68TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFMD") == 0 )
         {
            AV71TFAlbFmd = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbFmd", AV71TFAlbFmd);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFMD_SEL") == 0 )
         {
            AV72TFAlbFmd_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFAlbFmd_Sel", AV72TFAlbFmd_Sel);
         }
         AV114GXV1 = (int)(AV114GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFAlbProPri_Sel)==0), AV62TFAlbProPri_Sel, GXv_char4) ;
      ttrn06ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFGuiRemCln_Sel)==0), AV40TFGuiRemCln_Sel, GXv_char3) ;
      ttrn06ww_impl.this.GXt_char15 = GXv_char3[0] ;
      GXt_char16 = "" ;
      GXv_char2[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV78TFAlbMarca_Sels.size()==0), AV77TFAlbMarca_SelsJson, GXv_char2) ;
      ttrn06ww_impl.this.GXt_char16 = GXv_char2[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFAlbLic_Sel)==0), AV46TFAlbLic_Sel, GXv_char18) ;
      ttrn06ww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV58TFAlbProAT_Sels.size()==0), AV57TFAlbProAT_SelsJson, GXv_char20) ;
      ttrn06ww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFAlbFmd_Sel)==0), AV72TFAlbFmd_Sel, GXv_char22) ;
      ttrn06ww_impl.this.GXt_char21 = GXv_char22[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|||"+GXt_char15+"|"+GXt_char16+"|"+GXt_char17+"|"+GXt_char19+"|"+((AV69TFAlbProEst_Sels.size()==0) ? "" : AV68TFAlbProEst_SelsJson)+"|"+GXt_char21 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFAlbProPri)==0), AV61TFAlbProPri, GXv_char22) ;
      ttrn06ww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFGuiRemCln)==0), AV39TFGuiRemCln, GXv_char20) ;
      ttrn06ww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFAlbLic)==0), AV45TFAlbLic, GXv_char18) ;
      ttrn06ww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char16 = "" ;
      GXv_char4[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFAlbFmd)==0), AV71TFAlbFmd, GXv_char4) ;
      ttrn06ww_impl.this.GXt_char16 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV28TFAlbProCod) ? "" : GXutil.str( AV28TFAlbProCod, 10, 0))+"|"+GXt_char21+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31TFAlbProfch)) ? "" : localUtil.dtoc( AV31TFAlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV36TFGuiRemCli) ? "" : GXutil.str( AV36TFGuiRemCli, 6, 0))+"|"+GXt_char19+"||"+GXt_char17+"|||"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV29TFAlbProCod_To) ? "" : GXutil.str( AV29TFAlbProCod_To, 10, 0))+"|||"+((0==AV37TFGuiRemCli_To) ? "" : GXutil.str( AV37TFGuiRemCli_To, 6, 0))+"||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV23Session.getValue(AV113Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "ALBPROPRI", "", !(GXutil.strcmp("", AV59AlbProPri)==0), (short)(0), AV59AlbProPri, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "ALBPROFCH", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15AlbProFch))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16AlbProFch_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV15AlbProFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV16AlbProFch_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV84FilterFullText)==0), (short)(0), AV84FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROCOD", "", !((0==AV28TFAlbProCod)&&(0==AV29TFAlbProCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFAlbProCod, 10, 0)), GXutil.trim( GXutil.str( AV29TFAlbProCod_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROPRI", "", !(GXutil.strcmp("", AV61TFAlbProPri)==0), (short)(0), AV61TFAlbProPri, "", !(GXutil.strcmp("", AV62TFAlbProPri_Sel)==0), AV62TFAlbProPri_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31TFAlbProfch)), (short)(0), GXutil.trim( localUtil.dtoc( AV31TFAlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFGUIREMCLI", "", !((0==AV36TFGuiRemCli)&&(0==AV37TFGuiRemCli_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFGuiRemCli, 6, 0)), GXutil.trim( GXutil.str( AV37TFGuiRemCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFGUIREMCLN", "", !(GXutil.strcmp("", AV39TFGuiRemCln)==0), (short)(0), AV39TFGuiRemCln, "", !(GXutil.strcmp("", AV40TFGuiRemCln_Sel)==0), AV40TFGuiRemCln_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBMARCA_SEL", "", !(AV78TFAlbMarca_Sels.size()==0), (short)(0), AV78TFAlbMarca_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBLIC", "", !(GXutil.strcmp("", AV45TFAlbLic)==0), (short)(0), AV45TFAlbLic, "", !(GXutil.strcmp("", AV46TFAlbLic_Sel)==0), AV46TFAlbLic_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROAT_SEL", "", !(AV58TFAlbProAT_Sels.size()==0), (short)(0), AV58TFAlbProAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROEST_SEL", "", !(AV69TFAlbProEst_Sels.size()==0), (short)(0), AV69TFAlbProEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBFMD", "", !(GXutil.strcmp("", AV71TFAlbFmd)==0), (short)(0), AV71TFAlbFmd, "", !(GXutil.strcmp("", AV72TFAlbFmd_Sel)==0), AV72TFAlbFmd_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState23[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV113Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV113Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn06" );
      AV23Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table3_95_JJ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btneliminaralbaran_Internalname, tblTabledvelop_confirmpanel_btneliminaralbaran_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btneliminaralbaran.setProperty("Title", Dvelop_confirmpanel_btneliminaralbaran_Title);
         ucDvelop_confirmpanel_btneliminaralbaran.setProperty("ConfirmationText", Dvelop_confirmpanel_btneliminaralbaran_Confirmationtext);
         ucDvelop_confirmpanel_btneliminaralbaran.setProperty("YesButtonCaption", Dvelop_confirmpanel_btneliminaralbaran_Yesbuttoncaption);
         ucDvelop_confirmpanel_btneliminaralbaran.setProperty("NoButtonCaption", Dvelop_confirmpanel_btneliminaralbaran_Nobuttoncaption);
         ucDvelop_confirmpanel_btneliminaralbaran.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btneliminaralbaran_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btneliminaralbaran.setProperty("YesButtonPosition", Dvelop_confirmpanel_btneliminaralbaran_Yesbuttonposition);
         ucDvelop_confirmpanel_btneliminaralbaran.setProperty("ConfirmType", Dvelop_confirmpanel_btneliminaralbaran_Confirmtype);
         ucDvelop_confirmpanel_btneliminaralbaran.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btneliminaralbaran_Internalname, "DVELOP_CONFIRMPANEL_BTNELIMINARALBARANContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNELIMINARALBARANContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_95_JJ2e( true) ;
      }
      else
      {
         wb_table3_95_JJ2e( false) ;
      }
   }

   public void wb_table2_90_JJ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnanulada_Internalname, tblTabledvelop_confirmpanel_btnanulada_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnanulada.setProperty("Title", Dvelop_confirmpanel_btnanulada_Title);
         ucDvelop_confirmpanel_btnanulada.setProperty("ConfirmationText", Dvelop_confirmpanel_btnanulada_Confirmationtext);
         ucDvelop_confirmpanel_btnanulada.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnanulada_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnanulada.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnanulada_Nobuttoncaption);
         ucDvelop_confirmpanel_btnanulada.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnanulada_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnanulada.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnanulada_Yesbuttonposition);
         ucDvelop_confirmpanel_btnanulada.setProperty("ConfirmType", Dvelop_confirmpanel_btnanulada_Confirmtype);
         ucDvelop_confirmpanel_btnanulada.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnanulada_Internalname, "DVELOP_CONFIRMPANEL_BTNANULADAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNANULADAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_90_JJ2e( true) ;
      }
      else
      {
         wb_table2_90_JJ2e( false) ;
      }
   }

   public void wb_table1_31_JJ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_34_JJ2( true) ;
      }
      else
      {
         wb_table4_34_JJ2( false) ;
      }
      return  ;
   }

   public void wb_table4_34_JJ2e( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV24ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_31_JJ2e( true) ;
      }
      else
      {
         wb_table1_31_JJ2e( false) ;
      }
   }

   public void wb_table4_34_JJ2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbpropri.getInternalname(), httpContext.getMessage( "Alb Pro Pri", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_57_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbpropri, cmbavAlbpropri.getInternalname(), GXutil.rtrim( AV59AlbProPri), 1, cmbavAlbpropri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbpropri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "", true, (byte)(0), "HLP_TTrn06WW.htm");
         cmbavAlbpropri.setValue( GXutil.rtrim( AV59AlbProPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofch_rangetext_Internalname, httpContext.getMessage( "Alb Pro Fch_Range Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_57_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofch_rangetext_Internalname, AV86AlbProFch_RangeText, GXutil.rtrim( localUtil.format( AV86AlbProFch_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavAlbprofch_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavAlbprofch_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_57_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV84FilterFullText, GXutil.rtrim( localUtil.format( AV84FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TTrn06WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_JJ2e( true) ;
      }
      else
      {
         wb_table4_34_JJ2e( false) ;
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
      paJJ2( ) ;
      wsJJ2( ) ;
      weJJ2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcwctablaalbbar == null ) )
      {
         if ( GXutil.len( WebComp_Wcwctablaalbbar_Component) != 0 )
         {
            WebComp_Wcwctablaalbbar.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116121844", true, true);
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
      httpContext.AddJavascriptSource("ttrn06ww.js", "?202682116121844", false, true);
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

   public void subsflControlProps_572( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_57_idx );
      edtavOs_Internalname = "vOS_"+sGXsfl_57_idx ;
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_57_idx ;
      edtAlbProPri_Internalname = "ALBPROPRI_"+sGXsfl_57_idx ;
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_57_idx ;
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_57_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_57_idx ;
      cmbAlbMarca.setInternalname( "ALBMARCA_"+sGXsfl_57_idx );
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP_"+sGXsfl_57_idx );
      edtAlbLic_Internalname = "ALBLIC_"+sGXsfl_57_idx ;
      cmbAlbProAT.setInternalname( "ALBPROAT_"+sGXsfl_57_idx );
      cmbAlbSec.setInternalname( "ALBSEC_"+sGXsfl_57_idx );
      cmbAlbProEst.setInternalname( "ALBPROEST_"+sGXsfl_57_idx );
      edtAlbFmd_Internalname = "ALBFMD_"+sGXsfl_57_idx ;
      edtALbFmdc_Internalname = "ALBFMDC_"+sGXsfl_57_idx ;
   }

   public void subsflControlProps_fel_572( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_57_fel_idx );
      edtavOs_Internalname = "vOS_"+sGXsfl_57_fel_idx ;
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_57_fel_idx ;
      edtAlbProPri_Internalname = "ALBPROPRI_"+sGXsfl_57_fel_idx ;
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_57_fel_idx ;
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_57_fel_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_57_fel_idx ;
      cmbAlbMarca.setInternalname( "ALBMARCA_"+sGXsfl_57_fel_idx );
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP_"+sGXsfl_57_fel_idx );
      edtAlbLic_Internalname = "ALBLIC_"+sGXsfl_57_fel_idx ;
      cmbAlbProAT.setInternalname( "ALBPROAT_"+sGXsfl_57_fel_idx );
      cmbAlbSec.setInternalname( "ALBSEC_"+sGXsfl_57_fel_idx );
      cmbAlbProEst.setInternalname( "ALBPROEST_"+sGXsfl_57_fel_idx );
      edtAlbFmd_Internalname = "ALBFMD_"+sGXsfl_57_fel_idx ;
      edtALbFmdc_Internalname = "ALBFMDC_"+sGXsfl_57_fel_idx ;
   }

   public void sendrow_572( )
   {
      subsflControlProps_572( ) ;
      wbJJ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_57_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_57_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_57_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_57_idx+"',57)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_57_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV85GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV85GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV85GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e27jj2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV85GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_57_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOs_Enabled!=0)&&(edtavOs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_57_idx+"',57)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOs_Internalname,GXutil.rtrim( AV76OS),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavOs_Enabled!=0)&&(edtavOs_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'",edtavOs_Link,"","","",edtavOs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCod_Internalname,GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbProPri_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProPri_Internalname,GXutil.rtrim( A39AlbProPri),GXutil.rtrim( localUtil.format( A39AlbProPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'",edtAlbProPri_Link,"","","",edtAlbProPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbProPri_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProfch_Internalname,localUtil.format(A34AlbProfch, "99/99/99"),localUtil.format( A34AlbProfch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProfch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGuiRemCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGuiRemCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtGuiRemCln_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCln_Internalname,GXutil.rtrim( A1244GuiRemCln),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGuiRemCln_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbMarca.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbMarca.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBMARCA_" + sGXsfl_57_idx ;
            cmbAlbMarca.setName( GXCCtl );
            cmbAlbMarca.setWebtags( "" );
            cmbAlbMarca.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
            cmbAlbMarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
            if ( cmbAlbMarca.getItemCount() > 0 )
            {
               A5140AlbMarca = cmbAlbMarca.getValidValue(A5140AlbMarca) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbMarca,cmbAlbMarca.getInternalname(),GXutil.rtrim( A5140AlbMarca),Integer.valueOf(1),cmbAlbMarca.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbMarca.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbMarca.setValue( GXutil.rtrim( A5140AlbMarca) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbMarca.getInternalname(), "Values", cmbAlbMarca.ToJavascriptSource(), !bGXsfl_57_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbEnvFtp.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBENVFTP_" + sGXsfl_57_idx ;
            cmbAlbEnvFtp.setName( GXCCtl );
            cmbAlbEnvFtp.setWebtags( "" );
            cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
            cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
            if ( cmbAlbEnvFtp.getItemCount() > 0 )
            {
               A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbEnvFtp,cmbAlbEnvFtp.getInternalname(),GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)),Integer.valueOf(1),cmbAlbEnvFtp.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), !bGXsfl_57_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbLic_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbLic_Internalname,GXutil.rtrim( A7101AlbLic),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbLic_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbLic_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbProAT.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbProAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROAT_" + sGXsfl_57_idx ;
            cmbAlbProAT.setName( GXCCtl );
            cmbAlbProAT.setWebtags( "" );
            cmbAlbProAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
            cmbAlbProAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
            if ( cmbAlbProAT.getItemCount() > 0 )
            {
               A10765AlbProAT = cmbAlbProAT.getValidValue(A10765AlbProAT) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProAT,cmbAlbProAT.getInternalname(),GXutil.rtrim( A10765AlbProAT),Integer.valueOf(1),cmbAlbProAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbProAT.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), !bGXsfl_57_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbSec.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBSEC_" + sGXsfl_57_idx ;
            cmbAlbSec.setName( GXCCtl );
            cmbAlbSec.setWebtags( "" );
            cmbAlbSec.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            cmbAlbSec.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            if ( cmbAlbSec.getItemCount() > 0 )
            {
               A2242AlbSec = cmbAlbSec.getValidValue(A2242AlbSec) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbSec,cmbAlbSec.getInternalname(),GXutil.rtrim( A2242AlbSec),Integer.valueOf(1),cmbAlbSec.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbSec.setValue( GXutil.rtrim( A2242AlbSec) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Values", cmbAlbSec.ToJavascriptSource(), !bGXsfl_57_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbAlbProEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbProEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROEST_" + sGXsfl_57_idx ;
            cmbAlbProEst.setName( GXCCtl );
            cmbAlbProEst.setWebtags( "" );
            cmbAlbProEst.addItem("0", httpContext.getMessage( "Generado", ""), (short)(0));
            cmbAlbProEst.addItem("1", httpContext.getMessage( "Editado", ""), (short)(0));
            cmbAlbProEst.addItem("2", httpContext.getMessage( "Facturado", ""), (short)(0));
            if ( cmbAlbProEst.getItemCount() > 0 )
            {
               A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProEst,cmbAlbProEst.getInternalname(),GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)),Integer.valueOf(1),cmbAlbProEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbAlbProEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProEst.setValue( GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Values", cmbAlbProEst.ToJavascriptSource(), !bGXsfl_57_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbFmd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbFmd_Internalname,A10017AlbFmd,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbFmd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbFmd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALbFmdc_Internalname,GXutil.rtrim( A10018ALbFmdc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALbFmdc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesJJ2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_57_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      /* End function sendrow_572 */
   }

   public void startgridcontrol57( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"57\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProPri_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiRemCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiRemCln_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nome", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbMarca.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbLic_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo AT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbProAT.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbProEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbFmd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV85GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV76OS));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavOs_Link));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A39AlbProPri));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtAlbProPri_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProPri_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A34AlbProfch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiRemCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1244GuiRemCln));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiRemCln_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5140AlbMarca));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbMarca.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7101AlbLic));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbLic_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10765AlbProAT));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbProAT.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2242AlbSec));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbProEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10017AlbFmd);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbFmd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10018ALbFmdc));
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
      bttBtnanulada_Internalname = "BTNANULADA" ;
      bttBtneliminaralbaran_Internalname = "BTNELIMINARALBARAN" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      cmbavAlbpropri.setInternalname( "vALBPROPRI" );
      edtavAlbprofch_rangetext_Internalname = "vALBPROFCH_RANGETEXT" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtavOs_Internalname = "vOS" ;
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtAlbProPri_Internalname = "ALBPROPRI" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      cmbAlbMarca.setInternalname( "ALBMARCA" );
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      edtAlbLic_Internalname = "ALBLIC" ;
      cmbAlbProAT.setInternalname( "ALBPROAT" );
      cmbAlbSec.setInternalname( "ALBSEC" );
      cmbAlbProEst.setInternalname( "ALBPROEST" );
      edtAlbFmd_Internalname = "ALBFMD" ;
      edtALbFmdc_Internalname = "ALBFMDC" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Albprofch_rangepicker_Internalname = "ALBPROFCH_RANGEPICKER" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_btnanulada_Internalname = "DVELOP_CONFIRMPANEL_BTNANULADA" ;
      tblTabledvelop_confirmpanel_btnanulada_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNANULADA" ;
      Dvelop_confirmpanel_btneliminaralbaran_Internalname = "DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN" ;
      tblTabledvelop_confirmpanel_btneliminaralbaran_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNELIMINARALBARAN" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albprofchauxdate_Internalname = "vDDO_ALBPROFCHAUXDATE" ;
      divDdo_albprofchauxdates_Internalname = "DDO_ALBPROFCHAUXDATES" ;
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
      edtALbFmdc_Jsonclick = "" ;
      edtAlbFmd_Jsonclick = "" ;
      cmbAlbProEst.setJsonclick( "" );
      cmbAlbSec.setJsonclick( "" );
      cmbAlbProAT.setJsonclick( "" );
      edtAlbLic_Jsonclick = "" ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbMarca.setJsonclick( "" );
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCli_Jsonclick = "" ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProPri_Jsonclick = "" ;
      edtAlbProPri_Link = "" ;
      edtAlbProCod_Jsonclick = "" ;
      edtavOs_Jsonclick = "" ;
      edtavOs_Visible = -1 ;
      edtavOs_Link = "" ;
      edtavOs_Enabled = 1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavAlbprofch_rangetext_Jsonclick = "" ;
      edtavAlbprofch_rangetext_Enabled = 1 ;
      cmbavAlbpropri.setJsonclick( "" );
      cmbavAlbpropri.setEnabled( 1 );
      edtAlbFmd_Visible = -1 ;
      cmbAlbProEst.setVisible( -1 );
      cmbAlbProAT.setVisible( -1 );
      edtAlbLic_Visible = -1 ;
      cmbAlbMarca.setVisible( -1 );
      edtGuiRemCln_Visible = -1 ;
      edtGuiRemCli_Visible = -1 ;
      edtAlbProfch_Visible = -1 ;
      edtAlbProPri_Visible = -1 ;
      edtAlbProCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albprofchauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_btneliminaralbaran_Confirmtype = "1" ;
      Dvelop_confirmpanel_btneliminaralbaran_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btneliminaralbaran_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btneliminaralbaran_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btneliminaralbaran_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btneliminaralbaran_Confirmationtext = "¿Desea eliminar el Documento?" ;
      Dvelop_confirmpanel_btneliminaralbaran_Title = "" ;
      Dvelop_confirmpanel_btnanulada_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnanulada_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnanulada_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnanulada_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnanulada_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnanulada_Confirmationtext = "¿Você selecionou o n º GR, se confirmar esta GR , poderá voltar a inserir OS?" ;
      Dvelop_confirmpanel_btnanulada_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "TTrn06WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||:Activo,A:Anulado||A:Automatico,M:Manual|0:Generado,1:Editado,2:Facturado|" ;
      Ddo_grid_Allowmultipleselection = "|||||T||T|T|" ;
      Ddo_grid_Datalisttype = "|Dynamic|||Dynamic|FixedValues|Dynamic|FixedValues|FixedValues|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|||T|T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "T|||T||||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Date|Numeric|Character||Character|||Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T||T|||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "2:AlbProCod|3:AlbProPri|4:AlbProfch|5:GuiRemCli|6:GuiRemCln|7:AlbMarca|9:AlbLic|10:AlbProAT|12:AlbProEst|13:AlbFmd" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Detalhe de OSs", "") ;
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
      Form.setCaption( httpContext.getMessage( " Guias (Header)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbpropri.setName( "vALBPROPRI" );
      cmbavAlbpropri.setWebtags( "" );
      cmbavAlbpropri.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavAlbpropri.addItem("0", httpContext.getMessage( "Guia Transporte Sem Encargos", ""), (short)(0));
      if ( cmbavAlbpropri.getItemCount() > 0 )
      {
         AV59AlbProPri = cmbavAlbpropri.getValidValue(AV59AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59AlbProPri", AV59AlbProPri);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_57_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV85GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV85GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridActions), 4, 0));
      }
      GXCCtl = "ALBMARCA_" + sGXsfl_57_idx ;
      cmbAlbMarca.setName( GXCCtl );
      cmbAlbMarca.setWebtags( "" );
      cmbAlbMarca.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbAlbMarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbAlbMarca.getItemCount() > 0 )
      {
         A5140AlbMarca = cmbAlbMarca.getValidValue(A5140AlbMarca) ;
      }
      GXCCtl = "ALBENVFTP_" + sGXsfl_57_idx ;
      cmbAlbEnvFtp.setName( GXCCtl );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
      }
      GXCCtl = "ALBPROAT_" + sGXsfl_57_idx ;
      cmbAlbProAT.setName( GXCCtl );
      cmbAlbProAT.setWebtags( "" );
      cmbAlbProAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
      cmbAlbProAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      if ( cmbAlbProAT.getItemCount() > 0 )
      {
         A10765AlbProAT = cmbAlbProAT.getValidValue(A10765AlbProAT) ;
      }
      GXCCtl = "ALBSEC_" + sGXsfl_57_idx ;
      cmbAlbSec.setName( GXCCtl );
      cmbAlbSec.setWebtags( "" );
      cmbAlbSec.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbAlbSec.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbAlbSec.getItemCount() > 0 )
      {
         A2242AlbSec = cmbAlbSec.getValidValue(A2242AlbSec) ;
      }
      GXCCtl = "ALBPROEST_" + sGXsfl_57_idx ;
      cmbAlbProEst.setName( GXCCtl );
      cmbAlbProEst.setWebtags( "" );
      cmbAlbProEst.addItem("0", httpContext.getMessage( "Generado", ""), (short)(0));
      cmbAlbProEst.addItem("1", httpContext.getMessage( "Editado", ""), (short)(0));
      cmbAlbProEst.addItem("2", httpContext.getMessage( "Facturado", ""), (short)(0));
      if ( cmbAlbProEst.getItemCount() > 0 )
      {
         A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'cmbAlbProAT'},{av:'cmbAlbProEst'},{av:'edtAlbFmd_Visible',ctrl:'ALBFMD',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e14JJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e15JJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e17JJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV68TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV57TFAlbProAT_SelsJson',fld:'vTFALBPROAT_SELSJSON',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV77TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      setEventMetadata("GRID.LOAD","{handler:'e26JJ2',iparms:[{av:'cmbAlbMarca'},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:'',hsh:true},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'cmbAlbSec'},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV76OS',fld:'vOS',pic:''},{ctrl:'vUPDATE',prop:'Link'},{av:'edtavOs_Link',ctrl:'vOS',prop:'Link'},{av:'cmbavGridactions'},{av:'AV85GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtAlbProPri_Link',ctrl:'ALBPROPRI',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e18JJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'cmbAlbProAT'},{av:'cmbAlbProEst'},{av:'edtAlbFmd_Visible',ctrl:'ALBFMD',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e13JJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV77TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV57TFAlbProAT_SelsJson',fld:'vTFALBPROAT_SELSJSON',pic:''},{av:'AV68TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV68TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV57TFAlbProAT_SelsJson',fld:'vTFALBPROAT_SELSJSON',pic:''},{av:'AV77TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'cmbAlbProAT'},{av:'cmbAlbProEst'},{av:'edtAlbFmd_Visible',ctrl:'ALBFMD',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e27JJ2',iparms:[{av:'cmbavGridactions'},{av:'AV85GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV85GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOANULADA'","{handler:'e11JJ1',iparms:[]");
      setEventMetadata("'DOANULADA'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNANULADA.CLOSE","{handler:'e19JJ2',iparms:[{av:'Dvelop_confirmpanel_btnanulada_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNANULADA',prop:'Result'},{av:'cmbAlbMarca'},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9',hsh:true},{av:'cmbAlbSec'},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNANULADA.CLOSE",",oparms:[{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOELIMINARALBARAN'","{handler:'e12JJ1',iparms:[]");
      setEventMetadata("'DOELIMINARALBARAN'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN.CLOSE","{handler:'e20JJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'Dvelop_confirmpanel_btneliminaralbaran_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN',prop:'Result'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbAlbProEst'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARALBARAN.CLOSE",",oparms:[{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'cmbAlbProAT'},{av:'cmbAlbProEst'},{av:'edtAlbFmd_Visible',ctrl:'ALBFMD',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e21JJ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e22JJ2',iparms:[{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV77TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV57TFAlbProAT_SelsJson',fld:'vTFALBPROAT_SELSJSON',pic:''},{av:'AV68TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV68TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV57TFAlbProAT_SelsJson',fld:'vTFALBPROAT_SELSJSON',pic:''},{av:'AV77TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e23JJ2',iparms:[{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV77TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV57TFAlbProAT_SelsJson',fld:'vTFALBPROAT_SELSJSON',pic:''},{av:'AV68TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV68TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV57TFAlbProAT_SelsJson',fld:'vTFALBPROAT_SELSJSON',pic:''},{av:'AV77TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("ALBPROFCH_RANGEPICKER.DATERANGECHANGED","{handler:'e16JJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbpropri'},{av:'AV59AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV84FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV61TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV62TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV31TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV36TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV37TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV39TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV40TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV78TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV45TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV46TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV58TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV69TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV71TFAlbFmd',fld:'vTFALBFMD',pic:''},{av:'AV72TFAlbFmd_Sel',fld:'vTFALBFMD_SEL',pic:''},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("ALBPROFCH_RANGEPICKER.DATERANGECHANGED",",oparms:[{av:'AV15AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV16AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'cmbAlbProAT'},{av:'cmbAlbProEst'},{av:'edtAlbFmd_Visible',ctrl:'ALBFMD',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALIDV_ALBPROPRI","{handler:'validv_Albpropri',iparms:[]");
      setEventMetadata("VALIDV_ALBPROPRI",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROPRI","{handler:'valid_Albpropri',iparms:[]");
      setEventMetadata("VALID_ALBPROPRI",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLN","{handler:'valid_Guiremcln',iparms:[]");
      setEventMetadata("VALID_GUIREMCLN",",oparms:[]}");
      setEventMetadata("VALID_ALBMARCA","{handler:'valid_Albmarca',iparms:[]");
      setEventMetadata("VALID_ALBMARCA",",oparms:[]}");
      setEventMetadata("VALID_ALBLIC","{handler:'valid_Alblic',iparms:[]");
      setEventMetadata("VALID_ALBLIC",",oparms:[]}");
      setEventMetadata("VALID_ALBPROAT","{handler:'valid_Albproat',iparms:[]");
      setEventMetadata("VALID_ALBPROAT",",oparms:[]}");
      setEventMetadata("VALID_ALBPROEST","{handler:'valid_Albproest',iparms:[]");
      setEventMetadata("VALID_ALBPROEST",",oparms:[]}");
      setEventMetadata("VALID_ALBFMD","{handler:'valid_Albfmd',iparms:[]");
      setEventMetadata("VALID_ALBFMD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albfmdc',iparms:[]");
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
      Dvelop_confirmpanel_btnanulada_Result = "" ;
      Dvelop_confirmpanel_btneliminaralbaran_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15AlbProFch = GXutil.nullDate() ;
      AV21ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV59AlbProPri = "" ;
      AV16AlbProFch_To = GXutil.nullDate() ;
      AV84FilterFullText = "" ;
      AV61TFAlbProPri = "" ;
      AV62TFAlbProPri_Sel = "" ;
      AV31TFAlbProfch = GXutil.nullDate() ;
      AV39TFGuiRemCln = "" ;
      AV40TFGuiRemCln_Sel = "" ;
      AV78TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV45TFAlbLic = "" ;
      AV46TFAlbLic_Sel = "" ;
      AV58TFAlbProAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV69TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV71TFAlbFmd = "" ;
      AV72TFAlbFmd_Sel = "" ;
      AV113Pgmname = "" ;
      AV66AlbSec = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV24ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV51DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV77TFAlbMarca_SelsJson = "" ;
      AV57TFAlbProAT_SelsJson = "" ;
      AV68TFAlbProEst_SelsJson = "" ;
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
      bttBtnanulada_Jsonclick = "" ;
      bttBtneliminaralbaran_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwctablaalbbar_Component = "" ;
      OldWcwctablaalbbar = "" ;
      ucAlbprofch_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV33DDO_AlbProfchAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV76OS = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      A5140AlbMarca = "" ;
      A7101AlbLic = "" ;
      A10765AlbProAT = "" ;
      A2242AlbSec = "" ;
      A10017AlbFmd = "" ;
      A10018ALbFmdc = "" ;
      AV93Ttrn06wwds_1_albpropri = "" ;
      AV94Ttrn06wwds_2_albprofch = GXutil.nullDate() ;
      AV95Ttrn06wwds_3_albprofch_to = GXutil.nullDate() ;
      AV96Ttrn06wwds_4_filterfulltext = "" ;
      AV99Ttrn06wwds_7_tfalbpropri = "" ;
      AV100Ttrn06wwds_8_tfalbpropri_sel = "" ;
      AV101Ttrn06wwds_9_tfalbprofch = GXutil.nullDate() ;
      AV104Ttrn06wwds_12_tfguiremcln = "" ;
      AV105Ttrn06wwds_13_tfguiremcln_sel = "" ;
      AV106Ttrn06wwds_14_tfalbmarca_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV107Ttrn06wwds_15_tfalblic = "" ;
      AV108Ttrn06wwds_16_tfalblic_sel = "" ;
      AV109Ttrn06wwds_17_tfalbproat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV110Ttrn06wwds_18_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV111Ttrn06wwds_19_tfalbfmd = "" ;
      AV112Ttrn06wwds_20_tfalbfmd_sel = "" ;
      scmdbuf = "" ;
      lV96Ttrn06wwds_4_filterfulltext = "" ;
      lV99Ttrn06wwds_7_tfalbpropri = "" ;
      lV104Ttrn06wwds_12_tfguiremcln = "" ;
      lV107Ttrn06wwds_15_tfalblic = "" ;
      lV111Ttrn06wwds_19_tfalbfmd = "" ;
      H00JJ2_A1253EmprGuiRem = new String[] {""} ;
      H00JJ2_A396EmprCod = new String[] {""} ;
      H00JJ2_A10018ALbFmdc = new String[] {""} ;
      H00JJ2_A10017AlbFmd = new String[] {""} ;
      H00JJ2_n10017AlbFmd = new boolean[] {false} ;
      H00JJ2_A33AlbProEst = new byte[1] ;
      H00JJ2_A2242AlbSec = new String[] {""} ;
      H00JJ2_A10765AlbProAT = new String[] {""} ;
      H00JJ2_A7101AlbLic = new String[] {""} ;
      H00JJ2_A5805AlbEnvFtp = new byte[1] ;
      H00JJ2_A5140AlbMarca = new String[] {""} ;
      H00JJ2_A1244GuiRemCln = new String[] {""} ;
      H00JJ2_A1243GuiRemCli = new int[1] ;
      H00JJ2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H00JJ2_A39AlbProPri = new String[] {""} ;
      H00JJ2_A30AlbProCod = new long[1] ;
      A1253EmprGuiRem = "" ;
      H00JJ3_A1253EmprGuiRem = new String[] {""} ;
      H00JJ3_A396EmprCod = new String[] {""} ;
      H00JJ3_A10018ALbFmdc = new String[] {""} ;
      H00JJ3_A10017AlbFmd = new String[] {""} ;
      H00JJ3_n10017AlbFmd = new boolean[] {false} ;
      H00JJ3_A33AlbProEst = new byte[1] ;
      H00JJ3_A2242AlbSec = new String[] {""} ;
      H00JJ3_A10765AlbProAT = new String[] {""} ;
      H00JJ3_A7101AlbLic = new String[] {""} ;
      H00JJ3_A5805AlbEnvFtp = new byte[1] ;
      H00JJ3_A5140AlbMarca = new String[] {""} ;
      H00JJ3_A1244GuiRemCln = new String[] {""} ;
      H00JJ3_A1243GuiRemCli = new int[1] ;
      H00JJ3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H00JJ3_A39AlbProPri = new String[] {""} ;
      H00JJ3_A30AlbProCod = new long[1] ;
      AV86AlbProFch_RangeText = "" ;
      AV89Station = "" ;
      AV90Emprcod = "" ;
      AV91Emprnom = "" ;
      AV92Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV19ColumnsSelectorXML = "" ;
      AV55Update = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV25ManageFiltersXml = "" ;
      GXv_int9 = new int[1] ;
      AV83ok = "" ;
      GXv_int8 = new long[1] ;
      GXv_int10 = new byte[1] ;
      AV17ExcelFilename = "" ;
      AV18ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      AV22ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char15 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState23 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDvelop_confirmpanel_btneliminaralbaran = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btnanulada = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn06ww__default(),
         new Object[] {
             new Object[] {
            H00JJ2_A1253EmprGuiRem, H00JJ2_A396EmprCod, H00JJ2_A10018ALbFmdc, H00JJ2_A10017AlbFmd, H00JJ2_n10017AlbFmd, H00JJ2_A33AlbProEst, H00JJ2_A2242AlbSec, H00JJ2_A10765AlbProAT, H00JJ2_A7101AlbLic, H00JJ2_A5805AlbEnvFtp,
            H00JJ2_A5140AlbMarca, H00JJ2_A1244GuiRemCln, H00JJ2_A1243GuiRemCli, H00JJ2_A34AlbProfch, H00JJ2_A39AlbProPri, H00JJ2_A30AlbProCod
            }
            , new Object[] {
            H00JJ3_A1253EmprGuiRem, H00JJ3_A396EmprCod, H00JJ3_A10018ALbFmdc, H00JJ3_A10017AlbFmd, H00JJ3_n10017AlbFmd, H00JJ3_A33AlbProEst, H00JJ3_A2242AlbSec, H00JJ3_A10765AlbProAT, H00JJ3_A7101AlbLic, H00JJ3_A5805AlbEnvFtp,
            H00JJ3_A5140AlbMarca, H00JJ3_A1244GuiRemCln, H00JJ3_A1243GuiRemCli, H00JJ3_A34AlbProfch, H00JJ3_A39AlbProPri, H00JJ3_A30AlbProCod
            }
         }
      );
      AV113Pgmname = "TTrn06WW" ;
      /* GeneXus formulas. */
      AV113Pgmname = "TTrn06WW" ;
      Gx_err = (short)(0) ;
      edtavOs_Enabled = 0 ;
      WebComp_Wcwctablaalbbar = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV26ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A5805AlbEnvFtp ;
   private byte A33AlbProEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int10[] ;
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
   private short AV85GridActions ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_57 ;
   private int nGXsfl_57_idx=1 ;
   private int AV36TFGuiRemCli ;
   private int AV37TFGuiRemCli_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A1243GuiRemCli ;
   private int subGrid_Islastpage ;
   private int edtavOs_Enabled ;
   private int AV102Ttrn06wwds_10_tfguiremcli ;
   private int AV103Ttrn06wwds_11_tfguiremcli_to ;
   private int AV106Ttrn06wwds_14_tfalbmarca_sels_size ;
   private int AV109Ttrn06wwds_17_tfalbproat_sels_size ;
   private int AV110Ttrn06wwds_18_tfalbproest_sels_size ;
   private int edtAlbProCod_Visible ;
   private int edtAlbProPri_Visible ;
   private int edtAlbProfch_Visible ;
   private int edtGuiRemCli_Visible ;
   private int edtGuiRemCln_Visible ;
   private int edtAlbLic_Visible ;
   private int edtAlbFmd_Visible ;
   private int AV52PageToGo ;
   private int GXv_int9[] ;
   private int AV114GXV1 ;
   private int edtavAlbprofch_rangetext_Enabled ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavOs_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV28TFAlbProCod ;
   private long AV29TFAlbProCod_To ;
   private long AV53GridCurrentPage ;
   private long AV54GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long AV97Ttrn06wwds_5_tfalbprocod ;
   private long AV98Ttrn06wwds_6_tfalbprocod_to ;
   private long GRID_nRecordCount ;
   private long GXv_int8[] ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_btnanulada_Result ;
   private String Dvelop_confirmpanel_btneliminaralbaran_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_57_idx="0001" ;
   private String AV59AlbProPri ;
   private String AV61TFAlbProPri ;
   private String AV62TFAlbProPri_Sel ;
   private String AV39TFGuiRemCln ;
   private String AV40TFGuiRemCln_Sel ;
   private String AV45TFAlbLic ;
   private String AV46TFAlbLic_Sel ;
   private String AV113Pgmname ;
   private String AV66AlbSec ;
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
   private String Dvelop_confirmpanel_btnanulada_Title ;
   private String Dvelop_confirmpanel_btnanulada_Confirmationtext ;
   private String Dvelop_confirmpanel_btnanulada_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnanulada_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnanulada_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnanulada_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnanulada_Confirmtype ;
   private String Dvelop_confirmpanel_btneliminaralbaran_Title ;
   private String Dvelop_confirmpanel_btneliminaralbaran_Confirmationtext ;
   private String Dvelop_confirmpanel_btneliminaralbaran_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaralbaran_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaralbaran_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaralbaran_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btneliminaralbaran_Confirmtype ;
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
   private String divUnnamedtable2_Internalname ;
   private String bttBtnanulada_Internalname ;
   private String bttBtnanulada_Jsonclick ;
   private String bttBtneliminaralbaran_Internalname ;
   private String bttBtneliminaralbaran_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcwctablaalbbar_Component ;
   private String OldWcwctablaalbbar ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Albprofch_rangepicker_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_albprofchauxdates_Internalname ;
   private String edtavDdo_albprofchauxdate_Internalname ;
   private String edtavDdo_albprofchauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV76OS ;
   private String edtavOs_Internalname ;
   private String edtAlbProCod_Internalname ;
   private String A39AlbProPri ;
   private String edtAlbProPri_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Internalname ;
   private String A5140AlbMarca ;
   private String A7101AlbLic ;
   private String edtAlbLic_Internalname ;
   private String A10765AlbProAT ;
   private String A2242AlbSec ;
   private String edtAlbFmd_Internalname ;
   private String A10018ALbFmdc ;
   private String edtALbFmdc_Internalname ;
   private String AV93Ttrn06wwds_1_albpropri ;
   private String AV99Ttrn06wwds_7_tfalbpropri ;
   private String AV100Ttrn06wwds_8_tfalbpropri_sel ;
   private String AV104Ttrn06wwds_12_tfguiremcln ;
   private String AV105Ttrn06wwds_13_tfguiremcln_sel ;
   private String AV107Ttrn06wwds_15_tfalblic ;
   private String AV108Ttrn06wwds_16_tfalblic_sel ;
   private String scmdbuf ;
   private String lV99Ttrn06wwds_7_tfalbpropri ;
   private String lV104Ttrn06wwds_12_tfguiremcln ;
   private String lV107Ttrn06wwds_15_tfalblic ;
   private String A1253EmprGuiRem ;
   private String edtavAlbprofch_rangetext_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV89Station ;
   private String AV90Emprcod ;
   private String AV91Emprnom ;
   private String AV92Usurcod ;
   private String AV55Update ;
   private String edtavOs_Link ;
   private String edtAlbProPri_Link ;
   private String AV83ok ;
   private String GXt_char1 ;
   private String GXt_char15 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char16 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_btneliminaralbaran_Internalname ;
   private String Dvelop_confirmpanel_btneliminaralbaran_Internalname ;
   private String tblTabledvelop_confirmpanel_btnanulada_Internalname ;
   private String Dvelop_confirmpanel_btnanulada_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavAlbprofch_rangetext_Jsonclick ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_57_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavOs_Jsonclick ;
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProPri_Jsonclick ;
   private String edtAlbProfch_Jsonclick ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbLic_Jsonclick ;
   private String edtAlbFmd_Jsonclick ;
   private String edtALbFmdc_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV15AlbProFch ;
   private java.util.Date AV16AlbProFch_To ;
   private java.util.Date AV31TFAlbProfch ;
   private java.util.Date AV33DDO_AlbProfchAuxDate ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV94Ttrn06wwds_2_albprofch ;
   private java.util.Date AV95Ttrn06wwds_3_albprofch_to ;
   private java.util.Date AV101Ttrn06wwds_9_tfalbprofch ;
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
   private boolean bGXsfl_57_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n10017AlbFmd ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwctablaalbbar ;
   private boolean gx_refresh_fired ;
   private String AV77TFAlbMarca_SelsJson ;
   private String AV57TFAlbProAT_SelsJson ;
   private String AV68TFAlbProEst_SelsJson ;
   private String AV19ColumnsSelectorXML ;
   private String AV25ManageFiltersXml ;
   private String AV20UserCustomValue ;
   private String AV84FilterFullText ;
   private String AV71TFAlbFmd ;
   private String AV72TFAlbFmd_Sel ;
   private String A10017AlbFmd ;
   private String AV96Ttrn06wwds_4_filterfulltext ;
   private String AV111Ttrn06wwds_19_tfalbfmd ;
   private String AV112Ttrn06wwds_20_tfalbfmd_sel ;
   private String lV96Ttrn06wwds_4_filterfulltext ;
   private String lV111Ttrn06wwds_19_tfalbfmd ;
   private String AV86AlbProFch_RangeText ;
   private String AV17ExcelFilename ;
   private String AV18ErrorMessage ;
   private GXSimpleCollection<Byte> AV69TFAlbProEst_Sels ;
   private GXSimpleCollection<Byte> AV110Ttrn06wwds_18_tfalbproest_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwctablaalbbar ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucAlbprofch_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btneliminaralbaran ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnanulada ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavAlbpropri ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbMarca ;
   private HTMLChoice cmbAlbEnvFtp ;
   private HTMLChoice cmbAlbProAT ;
   private HTMLChoice cmbAlbSec ;
   private HTMLChoice cmbAlbProEst ;
   private IDataStoreProvider pr_default ;
   private String[] H00JJ2_A1253EmprGuiRem ;
   private String[] H00JJ2_A396EmprCod ;
   private String[] H00JJ2_A10018ALbFmdc ;
   private String[] H00JJ2_A10017AlbFmd ;
   private boolean[] H00JJ2_n10017AlbFmd ;
   private byte[] H00JJ2_A33AlbProEst ;
   private String[] H00JJ2_A2242AlbSec ;
   private String[] H00JJ2_A10765AlbProAT ;
   private String[] H00JJ2_A7101AlbLic ;
   private byte[] H00JJ2_A5805AlbEnvFtp ;
   private String[] H00JJ2_A5140AlbMarca ;
   private String[] H00JJ2_A1244GuiRemCln ;
   private int[] H00JJ2_A1243GuiRemCli ;
   private java.util.Date[] H00JJ2_A34AlbProfch ;
   private String[] H00JJ2_A39AlbProPri ;
   private long[] H00JJ2_A30AlbProCod ;
   private String[] H00JJ3_A1253EmprGuiRem ;
   private String[] H00JJ3_A396EmprCod ;
   private String[] H00JJ3_A10018ALbFmdc ;
   private String[] H00JJ3_A10017AlbFmd ;
   private boolean[] H00JJ3_n10017AlbFmd ;
   private byte[] H00JJ3_A33AlbProEst ;
   private String[] H00JJ3_A2242AlbSec ;
   private String[] H00JJ3_A10765AlbProAT ;
   private String[] H00JJ3_A7101AlbLic ;
   private byte[] H00JJ3_A5805AlbEnvFtp ;
   private String[] H00JJ3_A5140AlbMarca ;
   private String[] H00JJ3_A1244GuiRemCln ;
   private int[] H00JJ3_A1243GuiRemCli ;
   private java.util.Date[] H00JJ3_A34AlbProfch ;
   private String[] H00JJ3_A39AlbProPri ;
   private long[] H00JJ3_A30AlbProCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV78TFAlbMarca_Sels ;
   private GXSimpleCollection<String> AV58TFAlbProAT_Sels ;
   private GXSimpleCollection<String> AV106Ttrn06wwds_14_tfalbmarca_sels ;
   private GXSimpleCollection<String> AV109Ttrn06wwds_17_tfalbproat_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV24ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState23[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV51DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class ttrn06ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00JJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV106Ttrn06wwds_14_tfalbmarca_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV109Ttrn06wwds_17_tfalbproat_sels ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV110Ttrn06wwds_18_tfalbproest_sels ,
                                          java.util.Date AV94Ttrn06wwds_2_albprofch ,
                                          java.util.Date AV95Ttrn06wwds_3_albprofch_to ,
                                          long AV97Ttrn06wwds_5_tfalbprocod ,
                                          long AV98Ttrn06wwds_6_tfalbprocod_to ,
                                          String AV100Ttrn06wwds_8_tfalbpropri_sel ,
                                          String AV99Ttrn06wwds_7_tfalbpropri ,
                                          java.util.Date AV101Ttrn06wwds_9_tfalbprofch ,
                                          int AV102Ttrn06wwds_10_tfguiremcli ,
                                          int AV103Ttrn06wwds_11_tfguiremcli_to ,
                                          String AV105Ttrn06wwds_13_tfguiremcln_sel ,
                                          String AV104Ttrn06wwds_12_tfguiremcln ,
                                          int AV106Ttrn06wwds_14_tfalbmarca_sels_size ,
                                          String AV108Ttrn06wwds_16_tfalblic_sel ,
                                          String AV107Ttrn06wwds_15_tfalblic ,
                                          int AV109Ttrn06wwds_17_tfalbproat_sels_size ,
                                          int AV110Ttrn06wwds_18_tfalbproest_sels_size ,
                                          String AV112Ttrn06wwds_20_tfalbfmd_sel ,
                                          String AV111Ttrn06wwds_19_tfalbfmd ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A10017AlbFmd ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV96Ttrn06wwds_4_filterfulltext ,
                                          String AV93Ttrn06wwds_1_albpropri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[16];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.ALbFmdc, T1.AlbFmd, T1.AlbProEst, T1.AlbSec, T1.AlbProAT, T1.AlbLic, T1.AlbEnvFtp, T1.AlbMarca, T2.CliNom AS GuiRemCln," ;
      scmdbuf += " T1.GuiRemCli AS GuiRemCli, T1.AlbProfch, T1.AlbProPri, T1.AlbProCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Ttrn06wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int24[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Ttrn06wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int24[2] = (byte)(1) ;
      }
      if ( ! (0==AV97Ttrn06wwds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int24[3] = (byte)(1) ;
      }
      if ( ! (0==AV98Ttrn06wwds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int24[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Ttrn06wwds_8_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV99Ttrn06wwds_7_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Ttrn06wwds_8_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int24[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Ttrn06wwds_9_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int24[7] = (byte)(1) ;
      }
      if ( ! (0==AV102Ttrn06wwds_10_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int24[8] = (byte)(1) ;
      }
      if ( ! (0==AV103Ttrn06wwds_11_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int24[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Ttrn06wwds_13_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV104Ttrn06wwds_12_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Ttrn06wwds_13_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int24[11] = (byte)(1) ;
      }
      if ( AV106Ttrn06wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Ttrn06wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV108Ttrn06wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttrn06wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttrn06wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( AV109Ttrn06wwds_17_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Ttrn06wwds_17_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( AV110Ttrn06wwds_18_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Ttrn06wwds_18_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV112Ttrn06wwds_20_tfalbfmd_sel)==0) && ( ! (GXutil.strcmp("", AV111Ttrn06wwds_19_tfalbfmd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbFmd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ttrn06wwds_20_tfalbfmd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbFmd = ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPri" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPri DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProfch" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProfch DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbMarca" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbMarca DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbLic" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbLic DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProAT" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProEst" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbFmd" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbFmd DESC" ;
      }
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_H00JJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV106Ttrn06wwds_14_tfalbmarca_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV109Ttrn06wwds_17_tfalbproat_sels ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV110Ttrn06wwds_18_tfalbproest_sels ,
                                          java.util.Date AV94Ttrn06wwds_2_albprofch ,
                                          java.util.Date AV95Ttrn06wwds_3_albprofch_to ,
                                          long AV97Ttrn06wwds_5_tfalbprocod ,
                                          long AV98Ttrn06wwds_6_tfalbprocod_to ,
                                          String AV100Ttrn06wwds_8_tfalbpropri_sel ,
                                          String AV99Ttrn06wwds_7_tfalbpropri ,
                                          java.util.Date AV101Ttrn06wwds_9_tfalbprofch ,
                                          int AV102Ttrn06wwds_10_tfguiremcli ,
                                          int AV103Ttrn06wwds_11_tfguiremcli_to ,
                                          String AV105Ttrn06wwds_13_tfguiremcln_sel ,
                                          String AV104Ttrn06wwds_12_tfguiremcln ,
                                          int AV106Ttrn06wwds_14_tfalbmarca_sels_size ,
                                          String AV108Ttrn06wwds_16_tfalblic_sel ,
                                          String AV107Ttrn06wwds_15_tfalblic ,
                                          int AV109Ttrn06wwds_17_tfalbproat_sels_size ,
                                          int AV110Ttrn06wwds_18_tfalbproest_sels_size ,
                                          String AV112Ttrn06wwds_20_tfalbfmd_sel ,
                                          String AV111Ttrn06wwds_19_tfalbfmd ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A10017AlbFmd ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV96Ttrn06wwds_4_filterfulltext ,
                                          String AV93Ttrn06wwds_1_albpropri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[16];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.ALbFmdc, T1.AlbFmd, T1.AlbProEst, T1.AlbSec, T1.AlbProAT, T1.AlbLic, T1.AlbEnvFtp, T1.AlbMarca, T2.CliNom AS GuiRemCln," ;
      scmdbuf += " T1.GuiRemCli AS GuiRemCli, T1.AlbProfch, T1.AlbProPri, T1.AlbProCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Ttrn06wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int27[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Ttrn06wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int27[2] = (byte)(1) ;
      }
      if ( ! (0==AV97Ttrn06wwds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int27[3] = (byte)(1) ;
      }
      if ( ! (0==AV98Ttrn06wwds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Ttrn06wwds_8_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV99Ttrn06wwds_7_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Ttrn06wwds_8_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Ttrn06wwds_9_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( ! (0==AV102Ttrn06wwds_10_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (0==AV103Ttrn06wwds_11_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Ttrn06wwds_13_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV104Ttrn06wwds_12_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Ttrn06wwds_13_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( AV106Ttrn06wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Ttrn06wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV108Ttrn06wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV107Ttrn06wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Ttrn06wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( AV109Ttrn06wwds_17_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Ttrn06wwds_17_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( AV110Ttrn06wwds_18_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Ttrn06wwds_18_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV112Ttrn06wwds_20_tfalbfmd_sel)==0) && ( ! (GXutil.strcmp("", AV111Ttrn06wwds_19_tfalbfmd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbFmd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ttrn06wwds_20_tfalbfmd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbFmd = ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPri" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPri DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProfch" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProfch DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbMarca" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbMarca DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbLic" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbLic DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProAT" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProEst" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbFmd" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbFmd DESC" ;
      }
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
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
                  return conditional_H00JJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_H00JJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00JJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00JJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 255);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((long[]) buf[15])[0] = rslt.getLong(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 255);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((long[]) buf[15])[0] = rslt.getLong(15);
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
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 255);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 255);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 255);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 255);
               }
               return;
      }
   }

}

