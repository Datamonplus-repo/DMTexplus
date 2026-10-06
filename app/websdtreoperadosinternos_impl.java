package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class websdtreoperadosinternos_impl extends GXDataArea
{
   public websdtreoperadosinternos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public websdtreoperadosinternos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( websdtreoperadosinternos_impl.class ));
   }

   public websdtreoperadosinternos_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavBarnhdroperator = new HTMLChoice();
      cmbavClinomoperator = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      chkavSdthdrsareoperars__rctinte = UIFactory.getCheckbox(this);
      chkavSdthdrsareoperars__rcacabado = UIFactory.getCheckbox(this);
      chkavSdthdrsareoperars__disdes = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_63 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_63"))) ;
      nGXsfl_63_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_63_idx"))) ;
      sGXsfl_63_idx = httpContext.GetPar( "sGXsfl_63_idx") ;
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
      AV33EmprCod = httpContext.GetPar( "EmprCod") ;
      AV48BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      AV49BarFecGen_To = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_To")) ;
      AV30BarNHdr = httpContext.GetPar( "BarNHdr") ;
      AV32CliNom = httpContext.GetPar( "CliNom") ;
      AV22ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV17ColumnsSelector);
      AV96Pgmname = httpContext.GetPar( "Pgmname") ;
      AV60FilterFullText = httpContext.GetPar( "FilterFullText") ;
      cmbavBarnhdroperator.fromJSonString( httpContext.GetNextPar( ));
      AV29BarNHdrOperator = (short)(GXutil.lval( httpContext.GetPar( "BarNHdrOperator"))) ;
      cmbavClinomoperator.fromJSonString( httpContext.GetNextPar( ));
      AV31CliNomOperator = (short)(GXutil.lval( httpContext.GetPar( "CliNomOperator"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV96Pgmname, AV60FilterFullText, AV29BarNHdrOperator, AV31CliNomOperator) ;
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
      paED2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startED2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.websdtreoperadosinternos", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdthdrsareoperars", AV12SDTHdrsaReoperars);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdthdrsareoperars", AV12SDTHdrsaReoperars);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_63", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_63, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV20ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV20ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV25GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV26GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECGEN", localUtil.dtoc( AV48BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECGEN_TO", localUtil.dtoc( AV49BarFecGen_To, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV17ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV17ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV33EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV22ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV96Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTHDRSAREOPERARS", AV12SDTHdrsaReoperars);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTHDRSAREOPERARS", AV12SDTHdrsaReoperars);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_", GXutil.ltrim( localUtil.ntoc( AV47Err_, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV35UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV46Station));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         weED2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtED2( ) ;
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
      return formatLink("app.websdtreoperadosinternos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebSDTReoperadosInternos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Reoperados Internos (SDT)", "") ;
   }

   public void wbED0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebSDTReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_ED2( true) ;
      }
      else
      {
         wb_table1_19_ED2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_ED2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "HasGridEmpowerer", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol63( ) ;
      }
      if ( wbEnd == 63 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_63 = (int)(nGXsfl_63_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV66GXV1 = nGXsfl_63_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV25GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV26GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucBarfecgen_rangepicker.setProperty("Start Date", AV48BarFecGen);
         ucBarfecgen_rangepicker.setProperty("End Date", AV49BarFecGen_To);
         ucBarfecgen_rangepicker.render(context, "wwp.daterangepicker", Barfecgen_rangepicker_Internalname, "BARFECGEN_RANGEPICKERContainer");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV17ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_103_ED2( true) ;
      }
      else
      {
         wb_table2_103_ED2( false) ;
      }
      return  ;
   }

   public void wb_table2_103_ED2e( boolean wbgen )
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
      if ( wbEnd == 63 )
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
               AV66GXV1 = nGXsfl_63_idx ;
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

   public void startED2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Reoperados Internos (SDT)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupED0( ) ;
   }

   public void wsED2( )
   {
      startED2( ) ;
      evtED2( ) ;
   }

   public void evtED2( )
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
                           e11ED2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12ED2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13ED2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14ED2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VUPDATE.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15ED2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VELIMINAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VELIMINAR.CLICK") == 0 ) )
                        {
                           nGXsfl_63_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_632( ) ;
                           AV66GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV12SDTHdrsaReoperars.size() >= AV66GXV1 ) && ( AV66GXV1 > 0 ) )
                           {
                              AV12SDTHdrsaReoperars.currentItem( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)) );
                              cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                              cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                              AV61GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActions), 4, 0));
                              AV59Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
                              httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Bitmap", ((GXutil.strcmp("", AV59Eliminar)==0) ? AV95Eliminar_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV59Eliminar))), !bGXsfl_63_Refreshing);
                              httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV59Eliminar), true);
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
                                 e16ED2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e17ED2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e18ED2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VELIMINAR.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e19ED2 ();
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

   public void weED2( )
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

   public void paED2( )
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
      subsflControlProps_632( ) ;
      while ( nGXsfl_63_idx <= nRC_GXsfl_63 )
      {
         sendrow_632( ) ;
         nGXsfl_63_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV33EmprCod ,
                                 java.util.Date AV48BarFecGen ,
                                 java.util.Date AV49BarFecGen_To ,
                                 String AV30BarNHdr ,
                                 String AV32CliNom ,
                                 byte AV22ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelector ,
                                 String AV96Pgmname ,
                                 String AV60FilterFullText ,
                                 short AV29BarNHdrOperator ,
                                 short AV31CliNomOperator )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e17ED2 ();
      GRID_nCurrentRecord = 0 ;
      rfED2( ) ;
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
      if ( cmbavBarnhdroperator.getItemCount() > 0 )
      {
         AV29BarNHdrOperator = (short)(GXutil.lval( cmbavBarnhdroperator.getValidValue(GXutil.trim( GXutil.str( AV29BarNHdrOperator, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarNHdrOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarNHdrOperator), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarnhdroperator.setValue( GXutil.trim( GXutil.str( AV29BarNHdrOperator, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarnhdroperator.getInternalname(), "Values", cmbavBarnhdroperator.ToJavascriptSource(), true);
      }
      if ( cmbavClinomoperator.getItemCount() > 0 )
      {
         AV31CliNomOperator = (short)(GXutil.lval( cmbavClinomoperator.getValidValue(GXutil.trim( GXutil.str( AV31CliNomOperator, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31CliNomOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31CliNomOperator), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavClinomoperator.setValue( GXutil.trim( GXutil.str( AV31CliNomOperator, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavClinomoperator.getInternalname(), "Values", cmbavClinomoperator.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfED2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV96Pgmname = "WebSDTReoperadosInternos" ;
      Gx_err = (short)(0) ;
      edtavSdthdrsareoperars__barfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barfecgen_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barnhdr_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__clicod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__clinom_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barser_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barserdsc_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__bartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__bartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__bartipart_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__tipartdsc_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcolnom_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcolnum_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__bartipcol_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barnomcli_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barkgm_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barmtr_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barpie_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barsit_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__baragrest_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barunimed_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__rctinte.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__rctinte.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdthdrsareoperars__rctinte.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__rcacabado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__rcacabado.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdthdrsareoperars__rcacabado.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcodreo_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcodpar_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barconreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barconreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barconreo_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__discod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcospro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcospro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcospro_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcosany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcosany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcosany_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__disdes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__disdes.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdthdrsareoperars__disdes.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
   }

   public void rfED2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(63) ;
      /* Execute user event: Refresh */
      e17ED2 ();
      nGXsfl_63_idx = 1 ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      bGXsfl_63_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_632( ) ;
         e18ED2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_63_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e18ED2 ();
         }
         wbEnd = (short)(63) ;
         wbED0( ) ;
      }
      bGXsfl_63_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesED2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV96Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
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
      return AV12SDTHdrsaReoperars.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV96Pgmname, AV60FilterFullText, AV29BarNHdrOperator, AV31CliNomOperator) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV96Pgmname, AV60FilterFullText, AV29BarNHdrOperator, AV31CliNomOperator) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV96Pgmname, AV60FilterFullText, AV29BarNHdrOperator, AV31CliNomOperator) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV96Pgmname, AV60FilterFullText, AV29BarNHdrOperator, AV31CliNomOperator) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV96Pgmname, AV60FilterFullText, AV29BarNHdrOperator, AV31CliNomOperator) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV96Pgmname = "WebSDTReoperadosInternos" ;
      Gx_err = (short)(0) ;
      edtavSdthdrsareoperars__barfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barfecgen_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barnhdr_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__clicod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__clinom_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barser_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barserdsc_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__bartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__bartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__bartipart_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__tipartdsc_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcolnom_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcolnum_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__bartipcol_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barnomcli_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barkgm_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barmtr_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barpie_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barsit_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__baragrest_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barunimed_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__rctinte.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__rctinte.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdthdrsareoperars__rctinte.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__rcacabado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__rcacabado.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdthdrsareoperars__rcacabado.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcodreo_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcodpar_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barconreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barconreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barconreo_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__discod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcospro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcospro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcospro_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcosany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcosany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcosany_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__disdes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__disdes.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdthdrsareoperars__disdes.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupED0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16ED2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdthdrsareoperars"), AV12SDTHdrsaReoperars);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV20ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV23DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV17ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTHDRSAREOPERARS"), AV12SDTHdrsaReoperars);
         /* Read saved values. */
         nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV26GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV48BarFecGen = localUtil.ctod( httpContext.cgiGet( "vBARFECGEN"), 0) ;
         AV49BarFecGen_To = localUtil.ctod( httpContext.cgiGet( "vBARFECGEN_TO"), 0) ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_63_fel_idx = 0 ;
         while ( nGXsfl_63_fel_idx < nRC_GXsfl_63 )
         {
            nGXsfl_63_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_fel_idx+1) ;
            sGXsfl_63_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_632( ) ;
            AV66GXV1 = (int)(nGXsfl_63_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12SDTHdrsaReoperars.size() >= AV66GXV1 ) && ( AV66GXV1 > 0 ) )
            {
               AV12SDTHdrsaReoperars.currentItem( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)) );
               cmbavGridactions.setName( cmbavGridactions.getInternalname() );
               cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
               AV61GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
               AV59Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
            }
         }
         if ( nGXsfl_63_fel_idx == 0 )
         {
            nGXsfl_63_idx = 1 ;
            sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_632( ) ;
         }
         nGXsfl_63_fel_idx = 1 ;
         /* Read variables values. */
         AV60FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60FilterFullText", AV60FilterFullText);
         cmbavBarnhdroperator.setName( cmbavBarnhdroperator.getInternalname() );
         cmbavBarnhdroperator.setValue( httpContext.cgiGet( cmbavBarnhdroperator.getInternalname()) );
         AV29BarNHdrOperator = (short)(GXutil.lval( httpContext.cgiGet( cmbavBarnhdroperator.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarNHdrOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarNHdrOperator), 4, 0));
         AV30BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30BarNHdr", AV30BarNHdr);
         cmbavClinomoperator.setName( cmbavClinomoperator.getInternalname() );
         cmbavClinomoperator.setValue( httpContext.cgiGet( cmbavClinomoperator.getInternalname()) );
         AV31CliNomOperator = (short)(GXutil.lval( httpContext.cgiGet( cmbavClinomoperator.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31CliNomOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31CliNomOperator), 4, 0));
         AV32CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32CliNom", AV32CliNom);
         AV62BarFecGen_RangeText = httpContext.cgiGet( edtavBarfecgen_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62BarFecGen_RangeText", AV62BarFecGen_RangeText);
         /* Read subfile selected row values. */
         nGXsfl_63_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
         AV66GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_63_idx > 0 )
         {
            AV66GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12SDTHdrsaReoperars.size() >= AV66GXV1 ) && ( AV66GXV1 > 0 ) )
            {
               AV12SDTHdrsaReoperars.currentItem( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)) );
               cmbavGridactions.setName( cmbavGridactions.getInternalname() );
               cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
               AV61GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActions), 4, 0));
               AV59Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
            }
            if ( ( AV66GXV1 > 0 ) && ( AV12SDTHdrsaReoperars.size() >= AV66GXV1 ) )
            {
               AV12SDTHdrsaReoperars.currentItem( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)) );
            }
         }
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
      e16ED2 ();
      if (returnInSub) return;
   }

   public void e16ED2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV46Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      websdtreoperadosinternos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV46Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Station", AV46Station);
      GXv_char2[0] = AV33EmprCod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char4[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char2, GXv_char3, GXv_char4) ;
      websdtreoperadosinternos_impl.this.AV33EmprCod = GXv_char2[0] ;
      websdtreoperadosinternos_impl.this.AV34EmprNom = GXv_char3[0] ;
      websdtreoperadosinternos_impl.this.AV35UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
      AV49BarFecGen_To = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49BarFecGen_To", localUtil.format(AV49BarFecGen_To, "99/99/99"));
      AV48BarFecGen = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarFecGen", localUtil.format(AV48BarFecGen, "99/99/99"));
      AV30BarNHdr = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30BarNHdr", AV30BarNHdr);
      AV32CliNom = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32CliNom", AV32CliNom);
      GXt_objcol_SdtSDTHdrsaReoperar5 = AV12SDTHdrsaReoperars ;
      GXv_objcol_SdtSDTHdrsaReoperar6[0] = GXt_objcol_SdtSDTHdrsaReoperar5 ;
      new app.dphdrsareoperar(remoteHandle, context).execute( AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, GXv_objcol_SdtSDTHdrsaReoperar6) ;
      GXt_objcol_SdtSDTHdrsaReoperar5 = GXv_objcol_SdtSDTHdrsaReoperar6[0] ;
      AV12SDTHdrsaReoperars = GXt_objcol_SdtSDTHdrsaReoperar5 ;
      gx_BV63 = true ;
      GXt_char1 = AV46Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      websdtreoperadosinternos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV46Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Station", AV46Station);
      GXv_char4[0] = AV33EmprCod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char2[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char4, GXv_char3, GXv_char2) ;
      websdtreoperadosinternos_impl.this.AV33EmprCod = GXv_char4[0] ;
      websdtreoperadosinternos_impl.this.AV34EmprNom = GXv_char3[0] ;
      websdtreoperadosinternos_impl.this.AV35UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
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
      this.executeUsercontrolMethod("", false, "BARFECGEN_RANGEPICKERContainer", "Attach", "", new Object[] {edtavBarfecgen_rangetext_Internalname});
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Reoperados Internos (SDT)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV23DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV23DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e17ED2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTHdrsaReoperar5 = AV12SDTHdrsaReoperars ;
      GXv_objcol_SdtSDTHdrsaReoperar6[0] = GXt_objcol_SdtSDTHdrsaReoperar5 ;
      new app.dphdrsareoperar(remoteHandle, context).execute( AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, GXv_objcol_SdtSDTHdrsaReoperar6) ;
      GXt_objcol_SdtSDTHdrsaReoperar5 = GXv_objcol_SdtSDTHdrsaReoperar6[0] ;
      AV12SDTHdrsaReoperars = GXt_objcol_SdtSDTHdrsaReoperar5 ;
      gx_BV63 = true ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV22ManageFiltersExecutionStep == 1 )
      {
         AV22ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV22ManageFiltersExecutionStep == 2 )
      {
         AV22ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV19Session.getValue("WebSDTReoperadosInternosColumnsSelector"), "") != 0 )
      {
         AV15ColumnsSelectorXML = AV19Session.getValue("WebSDTReoperadosInternosColumnsSelector") ;
         AV17ColumnsSelector.fromxml(AV15ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavSdthdrsareoperars__barfecgen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barfecgen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barfecgen_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barnhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barnhdr_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__clicod_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__clinom_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barser_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barserdsc_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__bartipart_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__bartipart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__bartipart_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__tipartdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__tipartdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__tipartdsc_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcolnom_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcolnum_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__bartipcol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__bartipcol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__bartipcol_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barnomcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barnomcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barnomcli_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barkgm_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barmtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barmtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barmtr_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barpie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barpie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barpie_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barsit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barsit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barsit_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__baragrest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__baragrest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__baragrest_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barunimed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barunimed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barunimed_Visible), 5, 0), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__rctinte.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__rctinte.getInternalname(), "Visible", GXutil.ltrimstr( chkavSdthdrsareoperars__rctinte.getVisible(), 5, 0), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__rcacabado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__rcacabado.getInternalname(), "Visible", GXutil.ltrimstr( chkavSdthdrsareoperars__rcacabado.getVisible(), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcod_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcodreo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcodreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcodreo_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSdthdrsareoperars__barcodpar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdthdrsareoperars__barcodpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdthdrsareoperars__barcodpar_Visible), 5, 0), !bGXsfl_63_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV25GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridCurrentPage), 10, 0));
      AV26GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12SDTHdrsaReoperars", AV12SDTHdrsaReoperars);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17ColumnsSelector", AV17ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ManageFiltersData", AV20ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12ED2( )
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
         AV24PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV24PageToGo) ;
      }
   }

   public void e13ED2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e18ED2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV12SDTHdrsaReoperars.size() )
      {
         AV12SDTHdrsaReoperars.currentItem( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)) );
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         edtavEliminar_gximage = "DeleteRow" ;
         AV59Eliminar = context.getHttpContext().getImagePath( "28da6cce-b945-4cc5-8e39-a91759ac9224", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavEliminar_Internalname, AV59Eliminar);
         AV95Eliminar_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "28da6cce-b945-4cc5-8e39-a91759ac9224", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         edtavEliminar_Tooltiptext = "" ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(63) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_632( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_63_Refreshing )
         {
            httpContext.doAjaxLoad(63, GridRow);
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV61GridActions, 4, 0)) );
   }

   public void e14ED2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV15ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV17ColumnsSelector.fromJSonString(AV15ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebSDTReoperadosInternosColumnsSelector", ((GXutil.strcmp("", AV15ColumnsSelectorXML)==0) ? "" : AV17ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17ColumnsSelector", AV17ColumnsSelector);
      if ( gx_BV63 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12SDTHdrsaReoperars", AV12SDTHdrsaReoperars);
         nGXsfl_63_bak_idx = nGXsfl_63_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV96Pgmname, AV60FilterFullText, AV29BarNHdrOperator, AV31CliNomOperator) ;
         nGXsfl_63_idx = nGXsfl_63_bak_idx ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ManageFiltersData", AV20ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11ED2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebSDTReoperadosInternosFilters")),GXutil.URLEncode(GXutil.rtrim(AV96Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV22ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebSDTReoperadosInternosFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV22ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV21ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebSDTReoperadosInternosFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         websdtreoperadosinternos_impl.this.GXt_char1 = GXv_char4[0] ;
         AV21ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV21ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV96Pgmname+"GridState", AV21ManageFiltersXml) ;
            AV10GridState.fromxml(AV21ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavBarnhdroperator.setValue( GXutil.trim( GXutil.str( AV29BarNHdrOperator, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarnhdroperator.getInternalname(), "Values", cmbavBarnhdroperator.ToJavascriptSource(), true);
      cmbavClinomoperator.setValue( GXutil.trim( GXutil.str( AV31CliNomOperator, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavClinomoperator.getInternalname(), "Values", cmbavClinomoperator.ToJavascriptSource(), true);
      if ( gx_BV63 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12SDTHdrsaReoperars", AV12SDTHdrsaReoperars);
         nGXsfl_63_bak_idx = nGXsfl_63_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV96Pgmname, AV60FilterFullText, AV29BarNHdrOperator, AV31CliNomOperator) ;
         nGXsfl_63_idx = nGXsfl_63_bak_idx ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17ColumnsSelector", AV17ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ManageFiltersData", AV20ManageFiltersData);
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV17ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarFecGen", "", "Fecha Hdr", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarNHdr", "", "N Hdr", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__CliCod", "", "Cliente", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__CliNom", "", "Nombre", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarSer", "", "Articulo", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarSerDsc", "", "Descripcion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarTipArt", "", "Tipo Articulo", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__TipArtDsc", "", "Descripción", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__Barcolnom", "", "Color", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarColNum", "", "Numero", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarTipCol", "", "Tc", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarNomCli", "", "Color Cliente", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarKgm", "", "Kilos", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarMtr", "", "Metros", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarPie", "", "Piezas", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarSit", "", "Situacion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarAgrest", "", "Agrupada?", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__BarUnimed", "", "Unidad", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__RcTinte", "", "Rc Tinte?", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__RcAcabado", "", "Rc Acabado?", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__Barcod", "", "Hdr", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__Barcodreo", "", "R", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTHdrsaReoperars__Barcodpar", "", "P", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV16UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebSDTReoperadosInternosColumnsSelector", GXv_char4) ;
      websdtreoperadosinternos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV16UserCustomValue)==0) ) )
      {
         AV18ColumnsSelectorAux.fromxml(AV16UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV18ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV20ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebSDTReoperadosInternosFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV20ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV60FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60FilterFullText", AV60FilterFullText);
      AV29BarNHdrOperator = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarNHdrOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarNHdrOperator), 4, 0));
      AV30BarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30BarNHdr", AV30BarNHdr);
      AV31CliNomOperator = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31CliNomOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31CliNomOperator), 4, 0));
      AV32CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32CliNom", AV32CliNom);
      AV48BarFecGen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarFecGen", localUtil.format(AV48BarFecGen, "99/99/99"));
      AV49BarFecGen_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49BarFecGen_To", localUtil.format(AV49BarFecGen_To, "99/99/99"));
   }

   public void S182( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
   }

   public void S192( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
   }

   public void S202( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue(AV96Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV96Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV19Session.getValue(AV96Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV97GXV30 = 1 ;
      while ( AV97GXV30 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV30));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV60FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60FilterFullText", AV60FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARNHDR") == 0 )
         {
            AV30BarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30BarNHdr", AV30BarNHdr);
            AV29BarNHdrOperator = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29BarNHdrOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarNHdrOperator), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLINOM") == 0 )
         {
            AV32CliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32CliNom", AV32CliNom);
            AV31CliNomOperator = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31CliNomOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31CliNomOperator), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARFECGEN") == 0 )
         {
            AV48BarFecGen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48BarFecGen", localUtil.format(AV48BarFecGen, "99/99/99"));
            AV49BarFecGen_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49BarFecGen_To", localUtil.format(AV49BarFecGen_To, "99/99/99"));
         }
         AV97GXV30 = (int)(AV97GXV30+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV19Session.getValue(AV96Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV60FilterFullText)==0), (short)(0), AV60FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "BARNHDR", "", !(GXutil.strcmp("", AV30BarNHdr)==0), AV29BarNHdrOperator, AV30BarNHdr, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "CLINOM", "", !(GXutil.strcmp("", AV32CliNom)==0), AV31CliNomOperator, AV32CliNom, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "BARFECGEN", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecGen))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49BarFecGen_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV48BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV49BarFecGen_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV96Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e15ED2( )
   {
      /* Update_Click Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      if ( gx_BV63 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12SDTHdrsaReoperars", AV12SDTHdrsaReoperars);
         nGXsfl_63_bak_idx = nGXsfl_63_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV96Pgmname, AV60FilterFullText, AV29BarNHdrOperator, AV31CliNomOperator) ;
         nGXsfl_63_idx = nGXsfl_63_bak_idx ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17ColumnsSelector", AV17ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ManageFiltersData", AV20ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e19ED2( )
   {
      AV66GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV66GXV1 > 0 ) && ( AV12SDTHdrsaReoperars.size() >= AV66GXV1 ) )
      {
         AV12SDTHdrsaReoperars.currentItem( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)) );
      }
      /* Eliminar_Click Routine */
      returnInSub = false ;
      if ( ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcodreo() == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO es una Reoperado Interno", ""));
      }
      else
      {
         if ( ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barconreo() != ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcodreo() )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Hay reoperados posteriores. No es posible recuperar", ""));
         }
         else
         {
            GXv_char4[0] = AV33EmprCod ;
            GXv_int15[0] = ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcod() ;
            GXv_int16[0] = ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcodreo() ;
            GXv_char3[0] = ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcodpar() ;
            GXv_int17[0] = (byte)(AV47Err_) ;
            GXv_char2[0] = AV35UsurCod ;
            GXv_char18[0] = AV46Station ;
            new app.prevreo(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int16, GXv_char3, GXv_int17, GXv_char2, GXv_char18) ;
            websdtreoperadosinternos_impl.this.AV33EmprCod = GXv_char4[0] ;
            ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).setgxTv_SdtSDTHdrsaReoperar_Barcod( GXv_int15[0] );
            ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).setgxTv_SdtSDTHdrsaReoperar_Barcodreo( GXv_int16[0] );
            ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).setgxTv_SdtSDTHdrsaReoperar_Barcodpar( GXv_char3[0] );
            websdtreoperadosinternos_impl.this.AV47Err_ = GXv_int17[0] ;
            websdtreoperadosinternos_impl.this.AV35UsurCod = GXv_char2[0] ;
            websdtreoperadosinternos_impl.this.AV46Station = GXv_char18[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV47Err_", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Err_), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV46Station", AV46Station);
            if ( AV47Err_ == 1 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Se ha detectado que no se puede eliminar", ""));
            }
            else
            {
               GXv_char18[0] = AV33EmprCod ;
               GXv_int15[0] = ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcod() ;
               GXv_int17[0] = ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcodreo() ;
               GXv_char4[0] = ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcodpar() ;
               GXv_int19[0] = ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Discod() ;
               new app.pkilreo(remoteHandle, context).execute( GXv_char18, GXv_int15, GXv_int17, GXv_char4, GXv_int19) ;
               websdtreoperadosinternos_impl.this.AV33EmprCod = GXv_char18[0] ;
               ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).setgxTv_SdtSDTHdrsaReoperar_Barcod( GXv_int15[0] );
               ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).setgxTv_SdtSDTHdrsaReoperar_Barcodreo( GXv_int17[0] );
               ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).setgxTv_SdtSDTHdrsaReoperar_Barcodpar( GXv_char4[0] );
               ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).setgxTv_SdtSDTHdrsaReoperar_Discod( GXv_int19[0] );
               httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
               AV58Inc_obs = httpContext.getMessage( "PkilReo.ELIMINACION DE UNA HDR REOPERADA, Hdr= ", "") + ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barnhdr() + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( AV33EmprCod, GXutil.substring( AV96Pgmname, 1, 10), AV35UsurCod, AV46Station, AV58Inc_obs, ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcod(), ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcodreo(), ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcodpar()) ;
               GXv_char18[0] = AV33EmprCod ;
               GXv_int19[0] = ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcod() ;
               GXv_int17[0] = (byte)(0) ;
               GXv_char4[0] = ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).getgxTv_SdtSDTHdrsaReoperar_Barcodpar() ;
               GXv_char3[0] = AV35UsurCod ;
               GXv_char2[0] = AV46Station ;
               new app.puttn00(remoteHandle, context).execute( GXv_char18, GXv_int19, GXv_int17, GXv_char4, GXv_char3, GXv_char2) ;
               websdtreoperadosinternos_impl.this.AV33EmprCod = GXv_char18[0] ;
               ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).setgxTv_SdtSDTHdrsaReoperar_Barcod( GXv_int19[0] );
               ((app.SdtSDTHdrsaReoperar)(AV12SDTHdrsaReoperars.currentItem())).setgxTv_SdtSDTHdrsaReoperar_Barcodpar( GXv_char4[0] );
               websdtreoperadosinternos_impl.this.AV35UsurCod = GXv_char3[0] ;
               websdtreoperadosinternos_impl.this.AV46Station = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV46Station", AV46Station);
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado ¡¡¡", ""));
               httpContext.doAjaxRefresh();
            }
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12SDTHdrsaReoperars", AV12SDTHdrsaReoperars);
      nGXsfl_63_bak_idx = nGXsfl_63_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV33EmprCod, AV48BarFecGen, AV49BarFecGen_To, AV30BarNHdr, AV32CliNom, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV96Pgmname, AV60FilterFullText, AV29BarNHdrOperator, AV31CliNomOperator) ;
      nGXsfl_63_idx = nGXsfl_63_bak_idx ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17ColumnsSelector", AV17ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ManageFiltersData", AV20ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void wb_table2_103_ED2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_103_ED2e( true) ;
      }
      else
      {
         wb_table2_103_ED2e( false) ;
      }
   }

   public void wb_table1_19_ED2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV20ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_24_ED2( true) ;
      }
      else
      {
         wb_table3_24_ED2( false) ;
      }
      return  ;
   }

   public void wb_table3_24_ED2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_ED2e( true) ;
      }
      else
      {
         wb_table1_19_ED2e( false) ;
      }
   }

   public void wb_table3_24_ED2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV60FilterFullText, GXutil.rtrim( localUtil.format( AV60FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebSDTReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_31_ED2( true) ;
      }
      else
      {
         wb_table4_31_ED2( false) ;
      }
      return  ;
   }

   public void wb_table4_31_ED2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_41_ED2( true) ;
      }
      else
      {
         wb_table5_41_ED2( false) ;
      }
      return  ;
   }

   public void wb_table5_41_ED2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgen_rangetext_Internalname, httpContext.getMessage( "Bar Fec Gen_Range Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgen_rangetext_Internalname, AV62BarFecGen_RangeText, GXutil.rtrim( localUtil.format( AV62BarFecGen_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarfecgen_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarfecgen_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebSDTReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_24_ED2e( true) ;
      }
      else
      {
         wb_table3_24_ED2e( false) ;
      }
   }

   public void wb_table5_41_ED2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavClinomoperator, cmbavClinomoperator.getInternalname(), GXutil.trim( GXutil.str( AV31CliNomOperator, 4, 0)), 1, cmbavClinomoperator.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavClinomoperator.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, (byte)(0), "HLP_WebSDTReoperadosInternos.htm");
         cmbavClinomoperator.setValue( GXutil.trim( GXutil.str( AV31CliNomOperator, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavClinomoperator.getInternalname(), "Values", cmbavClinomoperator.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Cli Nom", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV32CliNom), GXutil.rtrim( localUtil.format( AV32CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavClinom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebSDTReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_41_ED2e( true) ;
      }
      else
      {
         wb_table5_41_ED2e( false) ;
      }
   }

   public void wb_table4_31_ED2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarnhdr_Internalname, tblTablemergedbarnhdr_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarnhdroperator.getInternalname(), httpContext.getMessage( "Bar NHdr Operator", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarnhdroperator, cmbavBarnhdroperator.getInternalname(), GXutil.trim( GXutil.str( AV29BarNHdrOperator, 4, 0)), 1, cmbavBarnhdroperator.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavBarnhdroperator.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "", true, (byte)(0), "HLP_WebSDTReoperadosInternos.htm");
         cmbavBarnhdroperator.setValue( GXutil.trim( GXutil.str( AV29BarNHdrOperator, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarnhdroperator.getInternalname(), "Values", cmbavBarnhdroperator.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "Bar NHdr", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV30BarNHdr), GXutil.rtrim( localUtil.format( AV30BarNHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarnhdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebSDTReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_31_ED2e( true) ;
      }
      else
      {
         wb_table4_31_ED2e( false) ;
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
      paED2( ) ;
      wsED2( ) ;
      weED2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116114818", true, true);
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
      httpContext.AddJavascriptSource("websdtreoperadosinternos.js", "?202682116114819", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_632( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_63_idx );
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barfecgen_Internalname = "SDTHDRSAREOPERARS__BARFECGEN_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barnhdr_Internalname = "SDTHDRSAREOPERARS__BARNHDR_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__clicod_Internalname = "SDTHDRSAREOPERARS__CLICOD_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__clinom_Internalname = "SDTHDRSAREOPERARS__CLINOM_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barser_Internalname = "SDTHDRSAREOPERARS__BARSER_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barserdsc_Internalname = "SDTHDRSAREOPERARS__BARSERDSC_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__bartipart_Internalname = "SDTHDRSAREOPERARS__BARTIPART_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__tipartdsc_Internalname = "SDTHDRSAREOPERARS__TIPARTDSC_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barcolnom_Internalname = "SDTHDRSAREOPERARS__BARCOLNOM_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barcolnum_Internalname = "SDTHDRSAREOPERARS__BARCOLNUM_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__bartipcol_Internalname = "SDTHDRSAREOPERARS__BARTIPCOL_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barnomcli_Internalname = "SDTHDRSAREOPERARS__BARNOMCLI_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barkgm_Internalname = "SDTHDRSAREOPERARS__BARKGM_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barmtr_Internalname = "SDTHDRSAREOPERARS__BARMTR_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barpie_Internalname = "SDTHDRSAREOPERARS__BARPIE_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barsit_Internalname = "SDTHDRSAREOPERARS__BARSIT_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__baragrest_Internalname = "SDTHDRSAREOPERARS__BARAGREST_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barunimed_Internalname = "SDTHDRSAREOPERARS__BARUNIMED_"+sGXsfl_63_idx ;
      chkavSdthdrsareoperars__rctinte.setInternalname( "SDTHDRSAREOPERARS__RCTINTE_"+sGXsfl_63_idx );
      chkavSdthdrsareoperars__rcacabado.setInternalname( "SDTHDRSAREOPERARS__RCACABADO_"+sGXsfl_63_idx );
      edtavSdthdrsareoperars__barcod_Internalname = "SDTHDRSAREOPERARS__BARCOD_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barcodreo_Internalname = "SDTHDRSAREOPERARS__BARCODREO_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barcodpar_Internalname = "SDTHDRSAREOPERARS__BARCODPAR_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barconreo_Internalname = "SDTHDRSAREOPERARS__BARCONREO_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__discod_Internalname = "SDTHDRSAREOPERARS__DISCOD_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barcospro_Internalname = "SDTHDRSAREOPERARS__BARCOSPRO_"+sGXsfl_63_idx ;
      edtavSdthdrsareoperars__barcosany_Internalname = "SDTHDRSAREOPERARS__BARCOSANY_"+sGXsfl_63_idx ;
      chkavSdthdrsareoperars__disdes.setInternalname( "SDTHDRSAREOPERARS__DISDES_"+sGXsfl_63_idx );
   }

   public void subsflControlProps_fel_632( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_63_fel_idx );
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barfecgen_Internalname = "SDTHDRSAREOPERARS__BARFECGEN_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barnhdr_Internalname = "SDTHDRSAREOPERARS__BARNHDR_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__clicod_Internalname = "SDTHDRSAREOPERARS__CLICOD_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__clinom_Internalname = "SDTHDRSAREOPERARS__CLINOM_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barser_Internalname = "SDTHDRSAREOPERARS__BARSER_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barserdsc_Internalname = "SDTHDRSAREOPERARS__BARSERDSC_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__bartipart_Internalname = "SDTHDRSAREOPERARS__BARTIPART_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__tipartdsc_Internalname = "SDTHDRSAREOPERARS__TIPARTDSC_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barcolnom_Internalname = "SDTHDRSAREOPERARS__BARCOLNOM_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barcolnum_Internalname = "SDTHDRSAREOPERARS__BARCOLNUM_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__bartipcol_Internalname = "SDTHDRSAREOPERARS__BARTIPCOL_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barnomcli_Internalname = "SDTHDRSAREOPERARS__BARNOMCLI_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barkgm_Internalname = "SDTHDRSAREOPERARS__BARKGM_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barmtr_Internalname = "SDTHDRSAREOPERARS__BARMTR_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barpie_Internalname = "SDTHDRSAREOPERARS__BARPIE_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barsit_Internalname = "SDTHDRSAREOPERARS__BARSIT_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__baragrest_Internalname = "SDTHDRSAREOPERARS__BARAGREST_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barunimed_Internalname = "SDTHDRSAREOPERARS__BARUNIMED_"+sGXsfl_63_fel_idx ;
      chkavSdthdrsareoperars__rctinte.setInternalname( "SDTHDRSAREOPERARS__RCTINTE_"+sGXsfl_63_fel_idx );
      chkavSdthdrsareoperars__rcacabado.setInternalname( "SDTHDRSAREOPERARS__RCACABADO_"+sGXsfl_63_fel_idx );
      edtavSdthdrsareoperars__barcod_Internalname = "SDTHDRSAREOPERARS__BARCOD_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barcodreo_Internalname = "SDTHDRSAREOPERARS__BARCODREO_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barcodpar_Internalname = "SDTHDRSAREOPERARS__BARCODPAR_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barconreo_Internalname = "SDTHDRSAREOPERARS__BARCONREO_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__discod_Internalname = "SDTHDRSAREOPERARS__DISCOD_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barcospro_Internalname = "SDTHDRSAREOPERARS__BARCOSPRO_"+sGXsfl_63_fel_idx ;
      edtavSdthdrsareoperars__barcosany_Internalname = "SDTHDRSAREOPERARS__BARCOSANY_"+sGXsfl_63_fel_idx ;
      chkavSdthdrsareoperars__disdes.setInternalname( "SDTHDRSAREOPERARS__DISDES_"+sGXsfl_63_fel_idx );
   }

   public void sendrow_632( )
   {
      subsflControlProps_632( ) ;
      wbED0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_63_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_63_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_63_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'',false,'"+sGXsfl_63_idx+"',63)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_63_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               if ( ( AV66GXV1 > 0 ) && ( AV12SDTHdrsaReoperars.size() >= AV66GXV1 ) && (0==AV61GridActions) )
               {
                  AV61GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV61GridActions, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActions), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV61GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e20ed2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,64);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV61GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_63_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'',false,'',63)\"" : " ") ;
         ClassString = "ActionBaseColorAttribute" + " " + ((GXutil.strcmp(edtavEliminar_gximage, "")==0) ? "" : "GX_Image_"+edtavEliminar_gximage+"_Class") ;
         StyleString = "" ;
         AV59Eliminar_IsBlob = (boolean)(((GXutil.strcmp("", AV59Eliminar)==0)&&(GXutil.strcmp("", AV95Eliminar_GXI)==0))||!(GXutil.strcmp("", AV59Eliminar)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV59Eliminar)==0) ? AV95Eliminar_GXI : httpContext.getResourceRelative(AV59Eliminar)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEliminar_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"",edtavEliminar_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavEliminar_Jsonclick,"'"+""+"'"+",false,"+"'"+"EVELIMINAR.CLICK."+sGXsfl_63_idx+"'",StyleString,ClassString,"WWActionColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV59Eliminar_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__barfecgen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barfecgen_Internalname,localUtil.format(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barfecgen(), "99/99/99"),localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barfecgen(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barfecgen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barfecgen_Visible),Integer.valueOf(edtavSdthdrsareoperars__barfecgen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdthdrsareoperars__barnhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barnhdr_Internalname,GXutil.rtrim( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barnhdr()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barnhdr_Visible),Integer.valueOf(edtavSdthdrsareoperars__barnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__clicod_Visible),Integer.valueOf(edtavSdthdrsareoperars__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdthdrsareoperars__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__clinom_Internalname,GXutil.rtrim( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Clinom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__clinom_Visible),Integer.valueOf(edtavSdthdrsareoperars__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdthdrsareoperars__barser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barser_Internalname,GXutil.rtrim( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barser_Visible),Integer.valueOf(edtavSdthdrsareoperars__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdthdrsareoperars__barserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barserdsc_Internalname,GXutil.rtrim( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barserdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barserdsc_Visible),Integer.valueOf(edtavSdthdrsareoperars__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__bartipart_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__bartipart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Bartipart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__bartipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Bartipart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Bartipart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__bartipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__bartipart_Visible),Integer.valueOf(edtavSdthdrsareoperars__bartipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdthdrsareoperars__tipartdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__tipartdsc_Internalname,GXutil.rtrim( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Tipartdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__tipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__tipartdsc_Visible),Integer.valueOf(edtavSdthdrsareoperars__tipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdthdrsareoperars__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barcolnom_Internalname,GXutil.rtrim( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barcolnom_Visible),Integer.valueOf(edtavSdthdrsareoperars__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__barcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barcolnum_Visible),Integer.valueOf(edtavSdthdrsareoperars__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__bartipcol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__bartipcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Bartipcol(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__bartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Bartipcol()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Bartipcol()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__bartipcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__bartipcol_Visible),Integer.valueOf(edtavSdthdrsareoperars__bartipcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdthdrsareoperars__barnomcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barnomcli_Internalname,GXutil.rtrim( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barnomcli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barnomcli_Visible),Integer.valueOf(edtavSdthdrsareoperars__barnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__barkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__barkgm_Enabled!=0) ? localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barkgm(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barkgm(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barkgm_Visible),Integer.valueOf(edtavSdthdrsareoperars__barkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__barmtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barmtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barmtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__barmtr_Enabled!=0) ? localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barmtr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barmtr(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barmtr_Visible),Integer.valueOf(edtavSdthdrsareoperars__barmtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__barpie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barpie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barpie(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__barpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barpie()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barpie()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barpie_Visible),Integer.valueOf(edtavSdthdrsareoperars__barpie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__barsit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barsit_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barsit(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__barsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barsit()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barsit()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barsit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barsit_Visible),Integer.valueOf(edtavSdthdrsareoperars__barsit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdthdrsareoperars__baragrest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__baragrest_Internalname,GXutil.rtrim( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Baragrest()),GXutil.rtrim( localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Baragrest(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__baragrest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__baragrest_Visible),Integer.valueOf(edtavSdthdrsareoperars__baragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdthdrsareoperars__barunimed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barunimed_Internalname,GXutil.rtrim( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barunimed()),GXutil.rtrim( localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barunimed(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barunimed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barunimed_Visible),Integer.valueOf(edtavSdthdrsareoperars__barunimed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSdthdrsareoperars__rctinte.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTHDRSAREOPERARS__RCTINTE_" + sGXsfl_63_idx ;
         chkavSdthdrsareoperars__rctinte.setName( GXCCtl );
         chkavSdthdrsareoperars__rctinte.setWebtags( "" );
         chkavSdthdrsareoperars__rctinte.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__rctinte.getInternalname(), "TitleCaption", chkavSdthdrsareoperars__rctinte.getCaption(), !bGXsfl_63_Refreshing);
         chkavSdthdrsareoperars__rctinte.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdthdrsareoperars__rctinte.getInternalname(),GXutil.booltostr( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Rctinte()),"","",Integer.valueOf(chkavSdthdrsareoperars__rctinte.getVisible()),Integer.valueOf(chkavSdthdrsareoperars__rctinte.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSdthdrsareoperars__rcacabado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTHDRSAREOPERARS__RCACABADO_" + sGXsfl_63_idx ;
         chkavSdthdrsareoperars__rcacabado.setName( GXCCtl );
         chkavSdthdrsareoperars__rcacabado.setWebtags( "" );
         chkavSdthdrsareoperars__rcacabado.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__rcacabado.getInternalname(), "TitleCaption", chkavSdthdrsareoperars__rcacabado.getCaption(), !bGXsfl_63_Refreshing);
         chkavSdthdrsareoperars__rcacabado.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdthdrsareoperars__rcacabado.getInternalname(),GXutil.booltostr( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Rcacabado()),"","",Integer.valueOf(chkavSdthdrsareoperars__rcacabado.getVisible()),Integer.valueOf(chkavSdthdrsareoperars__rcacabado.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__barcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barcod_Visible),Integer.valueOf(edtavSdthdrsareoperars__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdthdrsareoperars__barcodreo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barcodreo_Visible),Integer.valueOf(edtavSdthdrsareoperars__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdthdrsareoperars__barcodpar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barcodpar_Internalname,GXutil.rtrim( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcodpar()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdthdrsareoperars__barcodpar_Visible),Integer.valueOf(edtavSdthdrsareoperars__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barconreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barconreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__barconreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barconreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barconreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barconreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdthdrsareoperars__barconreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__discod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Discod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__discod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Discod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Discod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__discod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdthdrsareoperars__discod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barcospro_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcospro(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__barcospro_Enabled!=0) ? localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcospro(), "ZZZZZZ9.99") : localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcospro(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barcospro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdthdrsareoperars__barcospro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdthdrsareoperars__barcosany_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcosany(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdthdrsareoperars__barcosany_Enabled!=0) ? localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcosany(), "ZZZZZZ9.99") : localUtil.format( ((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Barcosany(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdthdrsareoperars__barcosany_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdthdrsareoperars__barcosany_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTHDRSAREOPERARS__DISDES_" + sGXsfl_63_idx ;
         chkavSdthdrsareoperars__disdes.setName( GXCCtl );
         chkavSdthdrsareoperars__disdes.setWebtags( "" );
         chkavSdthdrsareoperars__disdes.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__disdes.getInternalname(), "TitleCaption", chkavSdthdrsareoperars__disdes.getCaption(), !bGXsfl_63_Refreshing);
         chkavSdthdrsareoperars__disdes.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdthdrsareoperars__disdes.getInternalname(),((app.SdtSDTHdrsaReoperar)AV12SDTHdrsaReoperars.elementAt(-1+AV66GXV1)).getgxTv_SdtSDTHdrsaReoperar_Disdes(),"","",Integer.valueOf(0),Integer.valueOf(chkavSdthdrsareoperars__disdes.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",""});
         send_integrity_lvl_hashesED2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_63_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      /* End function sendrow_632 */
   }

   public void startgridcontrol63( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"63\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ActionBaseColorAttribute"+" "+((GXutil.strcmp(edtavEliminar_gximage, "")==0) ? "" : "GX_Image_"+edtavEliminar_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barfecgen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barnhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__bartipart_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__tipartdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__bartipcol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barnomcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barmtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barpie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barsit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__baragrest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Agrupada?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barunimed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSdthdrsareoperars__rctinte.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rc Tinte?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSdthdrsareoperars__rcacabado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rc Acabado?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barcodreo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdthdrsareoperars__barcodpar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV61GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV59Eliminar));
         GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavEliminar_Tooltiptext));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barfecgen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barfecgen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barnhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__bartipart_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__bartipart_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__tipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__tipartdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__bartipcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__bartipcol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barnomcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barmtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barpie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barpie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barsit_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barsit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__baragrest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__baragrest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barunimed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSdthdrsareoperars__rctinte.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSdthdrsareoperars__rctinte.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSdthdrsareoperars__rcacabado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSdthdrsareoperars__rcacabado.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcodreo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcodpar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barconreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__discod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcospro_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdthdrsareoperars__barcosany_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSdthdrsareoperars__disdes.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      cmbavBarnhdroperator.setInternalname( "vBARNHDROPERATOR" );
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      tblTablemergedbarnhdr_Internalname = "TABLEMERGEDBARNHDR" ;
      cmbavClinomoperator.setInternalname( "vCLINOMOPERATOR" );
      edtavClinom_Internalname = "vCLINOM" ;
      tblTablemergedclinom_Internalname = "TABLEMERGEDCLINOM" ;
      edtavBarfecgen_rangetext_Internalname = "vBARFECGEN_RANGETEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtavEliminar_Internalname = "vELIMINAR" ;
      edtavSdthdrsareoperars__barfecgen_Internalname = "SDTHDRSAREOPERARS__BARFECGEN" ;
      edtavSdthdrsareoperars__barnhdr_Internalname = "SDTHDRSAREOPERARS__BARNHDR" ;
      edtavSdthdrsareoperars__clicod_Internalname = "SDTHDRSAREOPERARS__CLICOD" ;
      edtavSdthdrsareoperars__clinom_Internalname = "SDTHDRSAREOPERARS__CLINOM" ;
      edtavSdthdrsareoperars__barser_Internalname = "SDTHDRSAREOPERARS__BARSER" ;
      edtavSdthdrsareoperars__barserdsc_Internalname = "SDTHDRSAREOPERARS__BARSERDSC" ;
      edtavSdthdrsareoperars__bartipart_Internalname = "SDTHDRSAREOPERARS__BARTIPART" ;
      edtavSdthdrsareoperars__tipartdsc_Internalname = "SDTHDRSAREOPERARS__TIPARTDSC" ;
      edtavSdthdrsareoperars__barcolnom_Internalname = "SDTHDRSAREOPERARS__BARCOLNOM" ;
      edtavSdthdrsareoperars__barcolnum_Internalname = "SDTHDRSAREOPERARS__BARCOLNUM" ;
      edtavSdthdrsareoperars__bartipcol_Internalname = "SDTHDRSAREOPERARS__BARTIPCOL" ;
      edtavSdthdrsareoperars__barnomcli_Internalname = "SDTHDRSAREOPERARS__BARNOMCLI" ;
      edtavSdthdrsareoperars__barkgm_Internalname = "SDTHDRSAREOPERARS__BARKGM" ;
      edtavSdthdrsareoperars__barmtr_Internalname = "SDTHDRSAREOPERARS__BARMTR" ;
      edtavSdthdrsareoperars__barpie_Internalname = "SDTHDRSAREOPERARS__BARPIE" ;
      edtavSdthdrsareoperars__barsit_Internalname = "SDTHDRSAREOPERARS__BARSIT" ;
      edtavSdthdrsareoperars__baragrest_Internalname = "SDTHDRSAREOPERARS__BARAGREST" ;
      edtavSdthdrsareoperars__barunimed_Internalname = "SDTHDRSAREOPERARS__BARUNIMED" ;
      chkavSdthdrsareoperars__rctinte.setInternalname( "SDTHDRSAREOPERARS__RCTINTE" );
      chkavSdthdrsareoperars__rcacabado.setInternalname( "SDTHDRSAREOPERARS__RCACABADO" );
      edtavSdthdrsareoperars__barcod_Internalname = "SDTHDRSAREOPERARS__BARCOD" ;
      edtavSdthdrsareoperars__barcodreo_Internalname = "SDTHDRSAREOPERARS__BARCODREO" ;
      edtavSdthdrsareoperars__barcodpar_Internalname = "SDTHDRSAREOPERARS__BARCODPAR" ;
      edtavSdthdrsareoperars__barconreo_Internalname = "SDTHDRSAREOPERARS__BARCONREO" ;
      edtavSdthdrsareoperars__discod_Internalname = "SDTHDRSAREOPERARS__DISCOD" ;
      edtavSdthdrsareoperars__barcospro_Internalname = "SDTHDRSAREOPERARS__BARCOSPRO" ;
      edtavSdthdrsareoperars__barcosany_Internalname = "SDTHDRSAREOPERARS__BARCOSANY" ;
      chkavSdthdrsareoperars__disdes.setInternalname( "SDTHDRSAREOPERARS__DISDES" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Barfecgen_rangepicker_Internalname = "BARFECGEN_RANGEPICKER" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      chkavSdthdrsareoperars__disdes.setCaption( "" );
      chkavSdthdrsareoperars__disdes.setEnabled( 0 );
      edtavSdthdrsareoperars__barcosany_Jsonclick = "" ;
      edtavSdthdrsareoperars__barcosany_Enabled = 0 ;
      edtavSdthdrsareoperars__barcospro_Jsonclick = "" ;
      edtavSdthdrsareoperars__barcospro_Enabled = 0 ;
      edtavSdthdrsareoperars__discod_Jsonclick = "" ;
      edtavSdthdrsareoperars__discod_Enabled = 0 ;
      edtavSdthdrsareoperars__barconreo_Jsonclick = "" ;
      edtavSdthdrsareoperars__barconreo_Enabled = 0 ;
      edtavSdthdrsareoperars__barcodpar_Jsonclick = "" ;
      edtavSdthdrsareoperars__barcodpar_Enabled = 0 ;
      edtavSdthdrsareoperars__barcodpar_Visible = -1 ;
      edtavSdthdrsareoperars__barcodreo_Jsonclick = "" ;
      edtavSdthdrsareoperars__barcodreo_Enabled = 0 ;
      edtavSdthdrsareoperars__barcodreo_Visible = -1 ;
      edtavSdthdrsareoperars__barcod_Jsonclick = "" ;
      edtavSdthdrsareoperars__barcod_Enabled = 0 ;
      edtavSdthdrsareoperars__barcod_Visible = -1 ;
      chkavSdthdrsareoperars__rcacabado.setCaption( "" );
      chkavSdthdrsareoperars__rcacabado.setEnabled( 0 );
      chkavSdthdrsareoperars__rcacabado.setVisible( -1 );
      chkavSdthdrsareoperars__rctinte.setCaption( "" );
      chkavSdthdrsareoperars__rctinte.setEnabled( 0 );
      chkavSdthdrsareoperars__rctinte.setVisible( -1 );
      edtavSdthdrsareoperars__barunimed_Jsonclick = "" ;
      edtavSdthdrsareoperars__barunimed_Enabled = 0 ;
      edtavSdthdrsareoperars__barunimed_Visible = -1 ;
      edtavSdthdrsareoperars__baragrest_Jsonclick = "" ;
      edtavSdthdrsareoperars__baragrest_Enabled = 0 ;
      edtavSdthdrsareoperars__baragrest_Visible = -1 ;
      edtavSdthdrsareoperars__barsit_Jsonclick = "" ;
      edtavSdthdrsareoperars__barsit_Enabled = 0 ;
      edtavSdthdrsareoperars__barsit_Visible = -1 ;
      edtavSdthdrsareoperars__barpie_Jsonclick = "" ;
      edtavSdthdrsareoperars__barpie_Enabled = 0 ;
      edtavSdthdrsareoperars__barpie_Visible = -1 ;
      edtavSdthdrsareoperars__barmtr_Jsonclick = "" ;
      edtavSdthdrsareoperars__barmtr_Enabled = 0 ;
      edtavSdthdrsareoperars__barmtr_Visible = -1 ;
      edtavSdthdrsareoperars__barkgm_Jsonclick = "" ;
      edtavSdthdrsareoperars__barkgm_Enabled = 0 ;
      edtavSdthdrsareoperars__barkgm_Visible = -1 ;
      edtavSdthdrsareoperars__barnomcli_Jsonclick = "" ;
      edtavSdthdrsareoperars__barnomcli_Enabled = 0 ;
      edtavSdthdrsareoperars__barnomcli_Visible = -1 ;
      edtavSdthdrsareoperars__bartipcol_Jsonclick = "" ;
      edtavSdthdrsareoperars__bartipcol_Enabled = 0 ;
      edtavSdthdrsareoperars__bartipcol_Visible = -1 ;
      edtavSdthdrsareoperars__barcolnum_Jsonclick = "" ;
      edtavSdthdrsareoperars__barcolnum_Enabled = 0 ;
      edtavSdthdrsareoperars__barcolnum_Visible = -1 ;
      edtavSdthdrsareoperars__barcolnom_Jsonclick = "" ;
      edtavSdthdrsareoperars__barcolnom_Enabled = 0 ;
      edtavSdthdrsareoperars__barcolnom_Visible = -1 ;
      edtavSdthdrsareoperars__tipartdsc_Jsonclick = "" ;
      edtavSdthdrsareoperars__tipartdsc_Enabled = 0 ;
      edtavSdthdrsareoperars__tipartdsc_Visible = -1 ;
      edtavSdthdrsareoperars__bartipart_Jsonclick = "" ;
      edtavSdthdrsareoperars__bartipart_Enabled = 0 ;
      edtavSdthdrsareoperars__bartipart_Visible = -1 ;
      edtavSdthdrsareoperars__barserdsc_Jsonclick = "" ;
      edtavSdthdrsareoperars__barserdsc_Enabled = 0 ;
      edtavSdthdrsareoperars__barserdsc_Visible = -1 ;
      edtavSdthdrsareoperars__barser_Jsonclick = "" ;
      edtavSdthdrsareoperars__barser_Enabled = 0 ;
      edtavSdthdrsareoperars__barser_Visible = -1 ;
      edtavSdthdrsareoperars__clinom_Jsonclick = "" ;
      edtavSdthdrsareoperars__clinom_Enabled = 0 ;
      edtavSdthdrsareoperars__clinom_Visible = -1 ;
      edtavSdthdrsareoperars__clicod_Jsonclick = "" ;
      edtavSdthdrsareoperars__clicod_Enabled = 0 ;
      edtavSdthdrsareoperars__clicod_Visible = -1 ;
      edtavSdthdrsareoperars__barnhdr_Jsonclick = "" ;
      edtavSdthdrsareoperars__barnhdr_Enabled = 0 ;
      edtavSdthdrsareoperars__barnhdr_Visible = -1 ;
      edtavSdthdrsareoperars__barfecgen_Jsonclick = "" ;
      edtavSdthdrsareoperars__barfecgen_Enabled = 0 ;
      edtavSdthdrsareoperars__barfecgen_Visible = -1 ;
      edtavEliminar_Jsonclick = "" ;
      edtavEliminar_gximage = "" ;
      edtavEliminar_Visible = -1 ;
      edtavEliminar_Enabled = 1 ;
      edtavEliminar_Tooltiptext = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 1 ;
      cmbavBarnhdroperator.setJsonclick( "" );
      cmbavBarnhdroperator.setEnabled( 1 );
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      cmbavClinomoperator.setJsonclick( "" );
      cmbavClinomoperator.setEnabled( 1 );
      edtavBarfecgen_rangetext_Jsonclick = "" ;
      edtavBarfecgen_rangetext_Enabled = 1 ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavSdthdrsareoperars__barcodpar_Visible = -1 ;
      edtavSdthdrsareoperars__barcodreo_Visible = -1 ;
      edtavSdthdrsareoperars__barcod_Visible = -1 ;
      chkavSdthdrsareoperars__rcacabado.setVisible( -1 );
      chkavSdthdrsareoperars__rctinte.setVisible( -1 );
      edtavSdthdrsareoperars__barunimed_Visible = -1 ;
      edtavSdthdrsareoperars__baragrest_Visible = -1 ;
      edtavSdthdrsareoperars__barsit_Visible = -1 ;
      edtavSdthdrsareoperars__barpie_Visible = -1 ;
      edtavSdthdrsareoperars__barmtr_Visible = -1 ;
      edtavSdthdrsareoperars__barkgm_Visible = -1 ;
      edtavSdthdrsareoperars__barnomcli_Visible = -1 ;
      edtavSdthdrsareoperars__bartipcol_Visible = -1 ;
      edtavSdthdrsareoperars__barcolnum_Visible = -1 ;
      edtavSdthdrsareoperars__barcolnom_Visible = -1 ;
      edtavSdthdrsareoperars__tipartdsc_Visible = -1 ;
      edtavSdthdrsareoperars__bartipart_Visible = -1 ;
      edtavSdthdrsareoperars__barserdsc_Visible = -1 ;
      edtavSdthdrsareoperars__barser_Visible = -1 ;
      edtavSdthdrsareoperars__clinom_Visible = -1 ;
      edtavSdthdrsareoperars__clicod_Visible = -1 ;
      edtavSdthdrsareoperars__barnhdr_Visible = -1 ;
      edtavSdthdrsareoperars__barfecgen_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      chkavSdthdrsareoperars__disdes.setEnabled( -1 );
      edtavSdthdrsareoperars__barcosany_Enabled = -1 ;
      edtavSdthdrsareoperars__barcospro_Enabled = -1 ;
      edtavSdthdrsareoperars__discod_Enabled = -1 ;
      edtavSdthdrsareoperars__barconreo_Enabled = -1 ;
      edtavSdthdrsareoperars__barcodpar_Enabled = -1 ;
      edtavSdthdrsareoperars__barcodreo_Enabled = -1 ;
      edtavSdthdrsareoperars__barcod_Enabled = -1 ;
      chkavSdthdrsareoperars__rcacabado.setEnabled( -1 );
      chkavSdthdrsareoperars__rctinte.setEnabled( -1 );
      edtavSdthdrsareoperars__barunimed_Enabled = -1 ;
      edtavSdthdrsareoperars__baragrest_Enabled = -1 ;
      edtavSdthdrsareoperars__barsit_Enabled = -1 ;
      edtavSdthdrsareoperars__barpie_Enabled = -1 ;
      edtavSdthdrsareoperars__barmtr_Enabled = -1 ;
      edtavSdthdrsareoperars__barkgm_Enabled = -1 ;
      edtavSdthdrsareoperars__barnomcli_Enabled = -1 ;
      edtavSdthdrsareoperars__bartipcol_Enabled = -1 ;
      edtavSdthdrsareoperars__barcolnum_Enabled = -1 ;
      edtavSdthdrsareoperars__barcolnom_Enabled = -1 ;
      edtavSdthdrsareoperars__tipartdsc_Enabled = -1 ;
      edtavSdthdrsareoperars__bartipart_Enabled = -1 ;
      edtavSdthdrsareoperars__barserdsc_Enabled = -1 ;
      edtavSdthdrsareoperars__barser_Enabled = -1 ;
      edtavSdthdrsareoperars__clinom_Enabled = -1 ;
      edtavSdthdrsareoperars__clicod_Enabled = -1 ;
      edtavSdthdrsareoperars__barnhdr_Enabled = -1 ;
      edtavSdthdrsareoperars__barfecgen_Enabled = -1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar el Reoperado?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "2:SDTHdrsaReoperars__BarFecGen|3:SDTHdrsaReoperars__BarNHdr|4:SDTHdrsaReoperars__CliCod|5:SDTHdrsaReoperars__CliNom|6:SDTHdrsaReoperars__BarSer|7:SDTHdrsaReoperars__BarSerDsc|8:SDTHdrsaReoperars__BarTipArt|9:SDTHdrsaReoperars__TipArtDsc|10:SDTHdrsaReoperars__Barcolnom|11:SDTHdrsaReoperars__BarColNum|12:SDTHdrsaReoperars__BarTipCol|13:SDTHdrsaReoperars__BarNomCli|14:SDTHdrsaReoperars__BarKgm|15:SDTHdrsaReoperars__BarMtr|16:SDTHdrsaReoperars__BarPie|17:SDTHdrsaReoperars__BarSit|18:SDTHdrsaReoperars__BarAgrest|19:SDTHdrsaReoperars__BarUnimed|20:SDTHdrsaReoperars__RcTinte|21:SDTHdrsaReoperars__RcAcabado|22:SDTHdrsaReoperars__Barcod|23:SDTHdrsaReoperars__Barcodreo|24:SDTHdrsaReoperars__Barcodpar" ;
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
      Form.setCaption( httpContext.getMessage( "Reoperados Internos (SDT)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavBarnhdroperator.setName( "vBARNHDROPERATOR" );
      cmbavBarnhdroperator.setWebtags( "" );
      cmbavBarnhdroperator.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      cmbavBarnhdroperator.addItem("1", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
      if ( cmbavBarnhdroperator.getItemCount() > 0 )
      {
         AV29BarNHdrOperator = (short)(GXutil.lval( cmbavBarnhdroperator.getValidValue(GXutil.trim( GXutil.str( AV29BarNHdrOperator, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarNHdrOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarNHdrOperator), 4, 0));
      }
      cmbavClinomoperator.setName( "vCLINOMOPERATOR" );
      cmbavClinomoperator.setWebtags( "" );
      cmbavClinomoperator.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      cmbavClinomoperator.addItem("1", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
      if ( cmbavClinomoperator.getItemCount() > 0 )
      {
         AV31CliNomOperator = (short)(GXutil.lval( cmbavClinomoperator.getValidValue(GXutil.trim( GXutil.str( AV31CliNomOperator, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31CliNomOperator", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31CliNomOperator), 4, 0));
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_63_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         if ( ( AV66GXV1 > 0 ) && ( AV12SDTHdrsaReoperars.size() >= AV66GXV1 ) && (0==AV61GridActions) )
         {
            AV61GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV61GridActions, 4, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActions), 4, 0));
         }
      }
      GXCCtl = "SDTHDRSAREOPERARS__RCTINTE_" + sGXsfl_63_idx ;
      chkavSdthdrsareoperars__rctinte.setName( GXCCtl );
      chkavSdthdrsareoperars__rctinte.setWebtags( "" );
      chkavSdthdrsareoperars__rctinte.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__rctinte.getInternalname(), "TitleCaption", chkavSdthdrsareoperars__rctinte.getCaption(), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__rctinte.setCheckedValue( "false" );
      GXCCtl = "SDTHDRSAREOPERARS__RCACABADO_" + sGXsfl_63_idx ;
      chkavSdthdrsareoperars__rcacabado.setName( GXCCtl );
      chkavSdthdrsareoperars__rcacabado.setWebtags( "" );
      chkavSdthdrsareoperars__rcacabado.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__rcacabado.getInternalname(), "TitleCaption", chkavSdthdrsareoperars__rcacabado.getCaption(), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__rcacabado.setCheckedValue( "false" );
      GXCCtl = "SDTHDRSAREOPERARS__DISDES_" + sGXsfl_63_idx ;
      chkavSdthdrsareoperars__disdes.setName( GXCCtl );
      chkavSdthdrsareoperars__disdes.setWebtags( "" );
      chkavSdthdrsareoperars__disdes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdthdrsareoperars__disdes.getInternalname(), "TitleCaption", chkavSdthdrsareoperars__disdes.getCaption(), !bGXsfl_63_Refreshing);
      chkavSdthdrsareoperars__disdes.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV49BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV30BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV60FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavBarnhdroperator'},{av:'AV29BarNHdrOperator',fld:'vBARNHDROPERATOR',pic:'ZZZ9'},{av:'cmbavClinomoperator'},{av:'AV31CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTHDRSAREOPERARS__BARFECGEN',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARNHDR',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__CLICOD',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__CLINOM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSER',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSERDSC',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARTIPART',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__TIPARTDSC',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOLNOM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOLNUM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARTIPCOL',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARNOMCLI',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARKGM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARMTR',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARPIE',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSIT',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARAGREST',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARUNIMED',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__RCTINTE',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__RCACABADO',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOD',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCODREO',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCODPAR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV20ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12ED2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV49BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV30BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV60FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavBarnhdroperator'},{av:'AV29BarNHdrOperator',fld:'vBARNHDROPERATOR',pic:'ZZZ9'},{av:'cmbavClinomoperator'},{av:'AV31CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13ED2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV49BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV30BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV60FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavBarnhdroperator'},{av:'AV29BarNHdrOperator',fld:'vBARNHDROPERATOR',pic:'ZZZ9'},{av:'cmbavClinomoperator'},{av:'AV31CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e18ED2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV61GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV59Eliminar',fld:'vELIMINAR',pic:''},{av:'edtavEliminar_Tooltiptext',ctrl:'vELIMINAR',prop:'Tooltiptext'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e14ED2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV49BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV30BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV60FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavBarnhdroperator'},{av:'AV29BarNHdrOperator',fld:'vBARNHDROPERATOR',pic:'ZZZ9'},{av:'cmbavClinomoperator'},{av:'AV31CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'SDTHDRSAREOPERARS__BARFECGEN',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARNHDR',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__CLICOD',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__CLINOM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSER',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSERDSC',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARTIPART',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__TIPARTDSC',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOLNOM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOLNUM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARTIPCOL',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARNOMCLI',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARKGM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARMTR',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARPIE',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSIT',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARAGREST',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARUNIMED',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__RCTINTE',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__RCACABADO',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOD',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCODREO',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCODPAR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV20ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11ED2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV49BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV30BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV60FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavBarnhdroperator'},{av:'AV29BarNHdrOperator',fld:'vBARNHDROPERATOR',pic:'ZZZ9'},{av:'cmbavClinomoperator'},{av:'AV31CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV60FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavBarnhdroperator'},{av:'AV29BarNHdrOperator',fld:'vBARNHDROPERATOR',pic:'ZZZ9'},{av:'AV30BarNHdr',fld:'vBARNHDR',pic:''},{av:'cmbavClinomoperator'},{av:'AV31CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV48BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV49BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTHDRSAREOPERARS__BARFECGEN',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARNHDR',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__CLICOD',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__CLINOM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSER',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSERDSC',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARTIPART',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__TIPARTDSC',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOLNOM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOLNUM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARTIPCOL',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARNOMCLI',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARKGM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARMTR',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARPIE',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSIT',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARAGREST',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARUNIMED',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__RCTINTE',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__RCACABADO',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOD',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCODREO',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCODPAR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV20ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e20ED2',iparms:[{av:'cmbavGridactions'},{av:'AV61GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV61GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VUPDATE.CLICK","{handler:'e15ED2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV49BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV30BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV60FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavBarnhdroperator'},{av:'AV29BarNHdrOperator',fld:'vBARNHDROPERATOR',pic:'ZZZ9'},{av:'cmbavClinomoperator'},{av:'AV31CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'}]");
      setEventMetadata("VUPDATE.CLICK",",oparms:[{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTHDRSAREOPERARS__BARFECGEN',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARNHDR',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__CLICOD',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__CLINOM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSER',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSERDSC',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARTIPART',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__TIPARTDSC',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOLNOM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOLNUM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARTIPCOL',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARNOMCLI',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARKGM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARMTR',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARPIE',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSIT',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARAGREST',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARUNIMED',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__RCTINTE',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__RCACABADO',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOD',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCODREO',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCODPAR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV20ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VELIMINAR.CLICK","{handler:'e19ED2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV49BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV30BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV60FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavBarnhdroperator'},{av:'AV29BarNHdrOperator',fld:'vBARNHDROPERATOR',pic:'ZZZ9'},{av:'cmbavClinomoperator'},{av:'AV31CliNomOperator',fld:'vCLINOMOPERATOR',pic:'ZZZ9'},{av:'AV47Err_',fld:'vERR_',pic:'ZZZ9'},{av:'AV35UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV46Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("VELIMINAR.CLICK",",oparms:[{av:'AV46Station',fld:'vSTATION',pic:''},{av:'AV35UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV47Err_',fld:'vERR_',pic:'ZZZ9'},{av:'AV12SDTHdrsaReoperars',fld:'vSDTHDRSAREOPERARS',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTHDRSAREOPERARS__BARFECGEN',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARNHDR',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__CLICOD',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__CLINOM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSER',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSERDSC',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARTIPART',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__TIPARTDSC',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOLNOM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOLNUM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARTIPCOL',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARNOMCLI',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARKGM',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARMTR',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARPIE',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARSIT',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARAGREST',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARUNIMED',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__RCTINTE',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__RCACABADO',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCOD',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCODREO',prop:'Visible'},{ctrl:'SDTHDRSAREOPERARS__BARCODPAR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV20ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALIDV_GXV19","{handler:'validv_Gxv19',iparms:[]");
      setEventMetadata("VALIDV_GXV19",",oparms:[]}");
      setEventMetadata("VALIDV_GXV29","{handler:'validv_Gxv29',iparms:[]");
      setEventMetadata("VALIDV_GXV29",",oparms:[]}");
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
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV33EmprCod = "" ;
      AV48BarFecGen = GXutil.nullDate() ;
      AV49BarFecGen_To = GXutil.nullDate() ;
      AV30BarNHdr = "" ;
      AV32CliNom = "" ;
      AV17ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV96Pgmname = "" ;
      AV60FilterFullText = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV12SDTHdrsaReoperars = new GXBaseCollection<app.SdtSDTHdrsaReoperar>(app.SdtSDTHdrsaReoperar.class, "SDTHdrsaReoperar", "TexplusNET", remoteHandle);
      AV20ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV23DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35UsurCod = "" ;
      AV46Station = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucBarfecgen_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV59Eliminar = "" ;
      AV95Eliminar_GXI = "" ;
      AV62BarFecGen_RangeText = "" ;
      AV34EmprNom = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXt_objcol_SdtSDTHdrsaReoperar5 = new GXBaseCollection<app.SdtSDTHdrsaReoperar>(app.SdtSDTHdrsaReoperar.class, "SDTHdrsaReoperar", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTHdrsaReoperar6 = new GXBaseCollection[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Session = httpContext.getWebSession();
      AV15ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV21ManageFiltersXml = "" ;
      AV16UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV18ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int15 = new int[1] ;
      AV58Inc_obs = "" ;
      GXv_char18 = new String[1] ;
      GXv_int19 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV96Pgmname = "WebSDTReoperadosInternos" ;
      /* GeneXus formulas. */
      AV96Pgmname = "WebSDTReoperadosInternos" ;
      Gx_err = (short)(0) ;
      edtavSdthdrsareoperars__barfecgen_Enabled = 0 ;
      edtavSdthdrsareoperars__barnhdr_Enabled = 0 ;
      edtavSdthdrsareoperars__clicod_Enabled = 0 ;
      edtavSdthdrsareoperars__clinom_Enabled = 0 ;
      edtavSdthdrsareoperars__barser_Enabled = 0 ;
      edtavSdthdrsareoperars__barserdsc_Enabled = 0 ;
      edtavSdthdrsareoperars__bartipart_Enabled = 0 ;
      edtavSdthdrsareoperars__tipartdsc_Enabled = 0 ;
      edtavSdthdrsareoperars__barcolnom_Enabled = 0 ;
      edtavSdthdrsareoperars__barcolnum_Enabled = 0 ;
      edtavSdthdrsareoperars__bartipcol_Enabled = 0 ;
      edtavSdthdrsareoperars__barnomcli_Enabled = 0 ;
      edtavSdthdrsareoperars__barkgm_Enabled = 0 ;
      edtavSdthdrsareoperars__barmtr_Enabled = 0 ;
      edtavSdthdrsareoperars__barpie_Enabled = 0 ;
      edtavSdthdrsareoperars__barsit_Enabled = 0 ;
      edtavSdthdrsareoperars__baragrest_Enabled = 0 ;
      edtavSdthdrsareoperars__barunimed_Enabled = 0 ;
      chkavSdthdrsareoperars__rctinte.setEnabled( 0 );
      chkavSdthdrsareoperars__rcacabado.setEnabled( 0 );
      edtavSdthdrsareoperars__barcod_Enabled = 0 ;
      edtavSdthdrsareoperars__barcodreo_Enabled = 0 ;
      edtavSdthdrsareoperars__barcodpar_Enabled = 0 ;
      edtavSdthdrsareoperars__barconreo_Enabled = 0 ;
      edtavSdthdrsareoperars__discod_Enabled = 0 ;
      edtavSdthdrsareoperars__barcospro_Enabled = 0 ;
      edtavSdthdrsareoperars__barcosany_Enabled = 0 ;
      chkavSdthdrsareoperars__disdes.setEnabled( 0 );
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV22ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int16[] ;
   private byte GXv_int17[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV29BarNHdrOperator ;
   private short AV31CliNomOperator ;
   private short AV47Err_ ;
   private short wbEnd ;
   private short wbStart ;
   private short AV61GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_63 ;
   private int nGXsfl_63_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV66GXV1 ;
   private int subGrid_Islastpage ;
   private int edtavSdthdrsareoperars__barfecgen_Enabled ;
   private int edtavSdthdrsareoperars__barnhdr_Enabled ;
   private int edtavSdthdrsareoperars__clicod_Enabled ;
   private int edtavSdthdrsareoperars__clinom_Enabled ;
   private int edtavSdthdrsareoperars__barser_Enabled ;
   private int edtavSdthdrsareoperars__barserdsc_Enabled ;
   private int edtavSdthdrsareoperars__bartipart_Enabled ;
   private int edtavSdthdrsareoperars__tipartdsc_Enabled ;
   private int edtavSdthdrsareoperars__barcolnom_Enabled ;
   private int edtavSdthdrsareoperars__barcolnum_Enabled ;
   private int edtavSdthdrsareoperars__bartipcol_Enabled ;
   private int edtavSdthdrsareoperars__barnomcli_Enabled ;
   private int edtavSdthdrsareoperars__barkgm_Enabled ;
   private int edtavSdthdrsareoperars__barmtr_Enabled ;
   private int edtavSdthdrsareoperars__barpie_Enabled ;
   private int edtavSdthdrsareoperars__barsit_Enabled ;
   private int edtavSdthdrsareoperars__baragrest_Enabled ;
   private int edtavSdthdrsareoperars__barunimed_Enabled ;
   private int edtavSdthdrsareoperars__barcod_Enabled ;
   private int edtavSdthdrsareoperars__barcodreo_Enabled ;
   private int edtavSdthdrsareoperars__barcodpar_Enabled ;
   private int edtavSdthdrsareoperars__barconreo_Enabled ;
   private int edtavSdthdrsareoperars__discod_Enabled ;
   private int edtavSdthdrsareoperars__barcospro_Enabled ;
   private int edtavSdthdrsareoperars__barcosany_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_63_fel_idx=1 ;
   private int edtavSdthdrsareoperars__barfecgen_Visible ;
   private int edtavSdthdrsareoperars__barnhdr_Visible ;
   private int edtavSdthdrsareoperars__clicod_Visible ;
   private int edtavSdthdrsareoperars__clinom_Visible ;
   private int edtavSdthdrsareoperars__barser_Visible ;
   private int edtavSdthdrsareoperars__barserdsc_Visible ;
   private int edtavSdthdrsareoperars__bartipart_Visible ;
   private int edtavSdthdrsareoperars__tipartdsc_Visible ;
   private int edtavSdthdrsareoperars__barcolnom_Visible ;
   private int edtavSdthdrsareoperars__barcolnum_Visible ;
   private int edtavSdthdrsareoperars__bartipcol_Visible ;
   private int edtavSdthdrsareoperars__barnomcli_Visible ;
   private int edtavSdthdrsareoperars__barkgm_Visible ;
   private int edtavSdthdrsareoperars__barmtr_Visible ;
   private int edtavSdthdrsareoperars__barpie_Visible ;
   private int edtavSdthdrsareoperars__barsit_Visible ;
   private int edtavSdthdrsareoperars__baragrest_Visible ;
   private int edtavSdthdrsareoperars__barunimed_Visible ;
   private int edtavSdthdrsareoperars__barcod_Visible ;
   private int edtavSdthdrsareoperars__barcodreo_Visible ;
   private int edtavSdthdrsareoperars__barcodpar_Visible ;
   private int AV24PageToGo ;
   private int nGXsfl_63_bak_idx=1 ;
   private int AV97GXV30 ;
   private int GXv_int15[] ;
   private int GXv_int19[] ;
   private int edtavFilterfulltext_Enabled ;
   private int edtavBarfecgen_rangetext_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarnhdr_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavEliminar_Enabled ;
   private int edtavEliminar_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV25GridCurrentPage ;
   private long AV26GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_63_idx="0001" ;
   private String AV33EmprCod ;
   private String AV30BarNHdr ;
   private String AV32CliNom ;
   private String AV96Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV35UsurCod ;
   private String AV46Station ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Barfecgen_rangepicker_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavEliminar_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavSdthdrsareoperars__barfecgen_Internalname ;
   private String edtavSdthdrsareoperars__barnhdr_Internalname ;
   private String edtavSdthdrsareoperars__clicod_Internalname ;
   private String edtavSdthdrsareoperars__clinom_Internalname ;
   private String edtavSdthdrsareoperars__barser_Internalname ;
   private String edtavSdthdrsareoperars__barserdsc_Internalname ;
   private String edtavSdthdrsareoperars__bartipart_Internalname ;
   private String edtavSdthdrsareoperars__tipartdsc_Internalname ;
   private String edtavSdthdrsareoperars__barcolnom_Internalname ;
   private String edtavSdthdrsareoperars__barcolnum_Internalname ;
   private String edtavSdthdrsareoperars__bartipcol_Internalname ;
   private String edtavSdthdrsareoperars__barnomcli_Internalname ;
   private String edtavSdthdrsareoperars__barkgm_Internalname ;
   private String edtavSdthdrsareoperars__barmtr_Internalname ;
   private String edtavSdthdrsareoperars__barpie_Internalname ;
   private String edtavSdthdrsareoperars__barsit_Internalname ;
   private String edtavSdthdrsareoperars__baragrest_Internalname ;
   private String edtavSdthdrsareoperars__barunimed_Internalname ;
   private String edtavSdthdrsareoperars__barcod_Internalname ;
   private String edtavSdthdrsareoperars__barcodreo_Internalname ;
   private String edtavSdthdrsareoperars__barcodpar_Internalname ;
   private String edtavSdthdrsareoperars__barconreo_Internalname ;
   private String edtavSdthdrsareoperars__discod_Internalname ;
   private String edtavSdthdrsareoperars__barcospro_Internalname ;
   private String edtavSdthdrsareoperars__barcosany_Internalname ;
   private String sGXsfl_63_fel_idx="0001" ;
   private String edtavBarnhdr_Internalname ;
   private String edtavClinom_Internalname ;
   private String edtavBarfecgen_rangetext_Internalname ;
   private String AV34EmprNom ;
   private String edtavEliminar_gximage ;
   private String edtavEliminar_Tooltiptext ;
   private String GXt_char1 ;
   private String GXv_char18[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String edtavBarfecgen_rangetext_Jsonclick ;
   private String tblTablemergedclinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String tblTablemergedbarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String sImgUrl ;
   private String edtavEliminar_Jsonclick ;
   private String ROClassString ;
   private String edtavSdthdrsareoperars__barfecgen_Jsonclick ;
   private String edtavSdthdrsareoperars__barnhdr_Jsonclick ;
   private String edtavSdthdrsareoperars__clicod_Jsonclick ;
   private String edtavSdthdrsareoperars__clinom_Jsonclick ;
   private String edtavSdthdrsareoperars__barser_Jsonclick ;
   private String edtavSdthdrsareoperars__barserdsc_Jsonclick ;
   private String edtavSdthdrsareoperars__bartipart_Jsonclick ;
   private String edtavSdthdrsareoperars__tipartdsc_Jsonclick ;
   private String edtavSdthdrsareoperars__barcolnom_Jsonclick ;
   private String edtavSdthdrsareoperars__barcolnum_Jsonclick ;
   private String edtavSdthdrsareoperars__bartipcol_Jsonclick ;
   private String edtavSdthdrsareoperars__barnomcli_Jsonclick ;
   private String edtavSdthdrsareoperars__barkgm_Jsonclick ;
   private String edtavSdthdrsareoperars__barmtr_Jsonclick ;
   private String edtavSdthdrsareoperars__barpie_Jsonclick ;
   private String edtavSdthdrsareoperars__barsit_Jsonclick ;
   private String edtavSdthdrsareoperars__baragrest_Jsonclick ;
   private String edtavSdthdrsareoperars__barunimed_Jsonclick ;
   private String edtavSdthdrsareoperars__barcod_Jsonclick ;
   private String edtavSdthdrsareoperars__barcodreo_Jsonclick ;
   private String edtavSdthdrsareoperars__barcodpar_Jsonclick ;
   private String edtavSdthdrsareoperars__barconreo_Jsonclick ;
   private String edtavSdthdrsareoperars__discod_Jsonclick ;
   private String edtavSdthdrsareoperars__barcospro_Jsonclick ;
   private String edtavSdthdrsareoperars__barcosany_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV48BarFecGen ;
   private java.util.Date AV49BarFecGen_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean bGXsfl_63_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV63 ;
   private boolean gx_refresh_fired ;
   private boolean AV59Eliminar_IsBlob ;
   private String AV15ColumnsSelectorXML ;
   private String AV21ManageFiltersXml ;
   private String AV16UserCustomValue ;
   private String AV60FilterFullText ;
   private String AV95Eliminar_GXI ;
   private String AV62BarFecGen_RangeText ;
   private String AV58Inc_obs ;
   private String AV59Eliminar ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucBarfecgen_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavBarnhdroperator ;
   private HTMLChoice cmbavClinomoperator ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkavSdthdrsareoperars__rctinte ;
   private ICheckbox chkavSdthdrsareoperars__rcacabado ;
   private ICheckbox chkavSdthdrsareoperars__disdes ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSDTHdrsaReoperar> AV12SDTHdrsaReoperars ;
   private GXBaseCollection<app.SdtSDTHdrsaReoperar> GXt_objcol_SdtSDTHdrsaReoperar5 ;
   private GXBaseCollection<app.SdtSDTHdrsaReoperar> GXv_objcol_SdtSDTHdrsaReoperar6[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV20ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV23DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

